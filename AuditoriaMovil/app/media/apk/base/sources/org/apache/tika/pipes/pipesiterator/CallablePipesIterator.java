package org.apache.tika.pipes.pipesiterator;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.tika.pipes.FetchEmitTuple;
/* loaded from: classes.dex */
public class CallablePipesIterator implements Callable<Long> {
    private final int numConsumers;
    private final PipesIterator pipesIterator;
    private final ArrayBlockingQueue<FetchEmitTuple> queue;
    private final long timeoutMillis;

    public CallablePipesIterator(PipesIterator pipesIterator, ArrayBlockingQueue<FetchEmitTuple> arrayBlockingQueue) {
        this(pipesIterator, arrayBlockingQueue, -1L);
    }

    public CallablePipesIterator(PipesIterator pipesIterator, ArrayBlockingQueue<FetchEmitTuple> arrayBlockingQueue, long j) {
        this(pipesIterator, arrayBlockingQueue, j, 1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public Long call() {
        long j = 0;
        int i7 = 0;
        if (this.timeoutMillis > 0) {
            Iterator<FetchEmitTuple> it = this.pipesIterator.iterator();
            while (it.hasNext()) {
                if (!this.queue.offer(it.next(), this.timeoutMillis, TimeUnit.MILLISECONDS)) {
                    throw new TimeoutException("timed out trying to offer tuple");
                }
                j++;
            }
            while (i7 < this.numConsumers) {
                if (!this.queue.offer(PipesIterator.COMPLETED_SEMAPHORE, this.timeoutMillis, TimeUnit.MILLISECONDS)) {
                    throw new TimeoutException("timed out trying to offer the completed semaphore");
                }
                i7++;
            }
        } else {
            Iterator<FetchEmitTuple> it2 = this.pipesIterator.iterator();
            while (it2.hasNext()) {
                this.queue.put(it2.next());
                j++;
            }
            while (i7 < this.numConsumers) {
                this.queue.put(PipesIterator.COMPLETED_SEMAPHORE);
                i7++;
            }
        }
        return Long.valueOf(j);
    }

    public CallablePipesIterator(PipesIterator pipesIterator, ArrayBlockingQueue<FetchEmitTuple> arrayBlockingQueue, long j, int i7) {
        this.pipesIterator = pipesIterator;
        this.queue = arrayBlockingQueue;
        this.timeoutMillis = j;
        this.numConsumers = i7;
    }
}
