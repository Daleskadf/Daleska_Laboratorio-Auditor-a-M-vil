package org.apache.tika.pipes.async;

import g7.d;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.util.Map;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.apache.tika.pipes.emitter.EmitData;
import org.apache.tika.pipes.emitter.Emitter;
import org.apache.tika.pipes.emitter.EmitterManager;
import org.apache.tika.pipes.emitter.TikaEmitterException;
import org.apache.tika.utils.ExceptionUtils;
/* loaded from: classes.dex */
public class AsyncEmitter implements Callable<Integer> {
    static final int EMITTER_FUTURE_CODE = 2;
    static final EmitData EMIT_DATA_STOP_SEMAPHORE = new EmitData(null, null, null);
    private static final g7.b LOG = d.b(AsyncEmitter.class);
    private final AsyncConfig asyncConfig;
    private final ArrayBlockingQueue<EmitData> emitDataQueue;
    private final EmitterManager emitterManager;
    Instant lastEmitted = Instant.now();

    /* loaded from: classes.dex */
    public class EmitDataCache {
        private final long maxBytes;
        long estimatedSize = 0;
        int size = 0;
        Map<String, List<EmitData>> map = new HashMap();

        public EmitDataCache(long j) {
            this.maxBytes = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void emitAll() {
            AsyncEmitter.LOG.v("about to emit {} files, {} estimated bytes", Integer.valueOf(this.size), Long.valueOf(this.estimatedSize));
            int i7 = 0;
            for (Map.Entry<String, List<EmitData>> entry : this.map.entrySet()) {
                tryToEmit(AsyncEmitter.this.emitterManager.getEmitter(entry.getKey()), entry.getValue());
                i7 += entry.getValue().size();
            }
            AsyncEmitter.LOG.q(Integer.valueOf(i7), "emitted: {} files");
            this.estimatedSize = 0L;
            this.size = 0;
            this.map.clear();
            AsyncEmitter.this.lastEmitted = Instant.now();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ List lambda$add$0(String str) {
            return new ArrayList();
        }

        private void tryToEmit(Emitter emitter, List<EmitData> list) {
            try {
                emitter.emit(list);
            } catch (IOException | TikaEmitterException e7) {
                AsyncEmitter.LOG.p(emitter.getClass(), ExceptionUtils.getStackTrace(e7), "emitter class ({}): {}");
            }
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.function.Function] */
        public void add(EmitData emitData) {
            this.size++;
            long estimatedSizeBytes = emitData.getEstimatedSizeBytes();
            if (this.estimatedSize + estimatedSizeBytes > this.maxBytes) {
                AsyncEmitter.LOG.v("estimated size ({}) > maxBytes({}), going to emitAll", Long.valueOf(this.estimatedSize + estimatedSizeBytes), Long.valueOf(this.maxBytes));
                emitAll();
            }
            updateEstimatedSize(estimatedSizeBytes);
            ((List) Map.EL.computeIfAbsent(this.map, emitData.getEmitKey().getEmitterName(), new Object())).add(emitData);
        }

        public void updateEstimatedSize(long j) {
            this.estimatedSize += j;
        }
    }

    public AsyncEmitter(AsyncConfig asyncConfig, ArrayBlockingQueue<EmitData> arrayBlockingQueue, EmitterManager emitterManager) {
        this.asyncConfig = asyncConfig;
        this.emitDataQueue = arrayBlockingQueue;
        this.emitterManager = emitterManager;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public Integer call() {
        EmitDataCache emitDataCache = new EmitDataCache(this.asyncConfig.getEmitMaxEstimatedBytes());
        while (true) {
            EmitData poll = this.emitDataQueue.poll(500L, TimeUnit.MILLISECONDS);
            if (poll == EMIT_DATA_STOP_SEMAPHORE) {
                emitDataCache.emitAll();
                return 2;
            }
            if (poll != null) {
                emitDataCache.add(poll);
            } else {
                LOG.m("Nothing on the async queue");
            }
            g7.b bVar = LOG;
            bVar.v("cache size: ({}) bytes and extract count: {}", Long.valueOf(emitDataCache.estimatedSize), Integer.valueOf(emitDataCache.size));
            long between = ChronoUnit.MILLIS.between(this.lastEmitted, Instant.now());
            if (between > this.asyncConfig.getEmitWithinMillis()) {
                bVar.v("{} elapsed > {}, going to emitAll", Long.valueOf(between), Long.valueOf(this.asyncConfig.getEmitWithinMillis()));
                emitDataCache.emitAll();
            }
        }
    }
}
