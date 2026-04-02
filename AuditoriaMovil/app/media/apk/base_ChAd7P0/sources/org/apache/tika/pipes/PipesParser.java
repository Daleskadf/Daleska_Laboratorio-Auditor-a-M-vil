package org.apache.tika.pipes;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class PipesParser implements Closeable {
    private final ArrayBlockingQueue<PipesClient> clientQueue;
    private final List<PipesClient> clients = new ArrayList();
    private final PipesConfig pipesConfig;

    public PipesParser(PipesConfig pipesConfig) {
        this.pipesConfig = pipesConfig;
        this.clientQueue = new ArrayBlockingQueue<>(pipesConfig.getNumClients());
        for (int i7 = 0; i7 < pipesConfig.getNumClients(); i7++) {
            PipesClient pipesClient = new PipesClient(pipesConfig);
            this.clientQueue.offer(pipesClient);
            this.clients.add(pipesClient);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ArrayList arrayList = new ArrayList();
        for (PipesClient pipesClient : this.clients) {
            try {
                pipesClient.close();
            } catch (IOException e7) {
                arrayList.add(e7);
            }
        }
        if (arrayList.size() <= 0) {
            return;
        }
        throw ((IOException) arrayList.get(0));
    }

    public PipesResult parse(FetchEmitTuple fetchEmitTuple) {
        PipesClient poll;
        PipesClient pipesClient = null;
        try {
            poll = this.clientQueue.poll(this.pipesConfig.getMaxWaitForClientMillis(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (poll == null) {
                PipesResult pipesResult = PipesResult.CLIENT_UNAVAILABLE_WITHIN_MS;
                if (poll != null) {
                    this.clientQueue.offer(poll);
                }
                return pipesResult;
            }
            PipesResult process = poll.process(fetchEmitTuple);
            this.clientQueue.offer(poll);
            return process;
        } catch (Throwable th2) {
            th = th2;
            pipesClient = poll;
            if (pipesClient != null) {
                this.clientQueue.offer(pipesClient);
            }
            throw th;
        }
    }
}
