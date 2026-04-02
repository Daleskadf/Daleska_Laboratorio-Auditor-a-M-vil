package io.reactivex.internal.util;

import fb.c;
import fb.d;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes3.dex */
public final class QueueDrainHelper {
    static final long COMPLETED_MASK = Long.MIN_VALUE;
    static final long REQUESTED_MASK = Long.MAX_VALUE;

    private QueueDrainHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> boolean checkTerminated(boolean z10, boolean z11, c cVar, boolean z12, SimpleQueue<?> simpleQueue, QueueDrain<T, U> queueDrain) {
        if (queueDrain.cancelled()) {
            simpleQueue.clear();
            return true;
        } else if (z10) {
            if (z12) {
                if (z11) {
                    Throwable error = queueDrain.error();
                    if (error != null) {
                        cVar.onError(error);
                    } else {
                        cVar.onComplete();
                    }
                    return true;
                }
                return false;
            }
            Throwable error2 = queueDrain.error();
            if (error2 != null) {
                simpleQueue.clear();
                cVar.onError(error2);
                return true;
            } else if (z11) {
                cVar.onComplete();
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static <T> SimpleQueue<T> createQueue(int i10) {
        if (i10 < 0) {
            return new SpscLinkedArrayQueue(-i10);
        }
        return new SpscArrayQueue(i10);
    }

    public static <T, U> void drainLoop(SimplePlainQueue<T> simplePlainQueue, Observer<? super U> observer, boolean z10, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        boolean z11;
        int i10 = 1;
        while (!checkTerminated(observableQueueDrain.done(), simplePlainQueue.isEmpty(), observer, z10, simplePlainQueue, disposable, observableQueueDrain)) {
            while (true) {
                boolean done = observableQueueDrain.done();
                T poll = simplePlainQueue.poll();
                if (poll == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (checkTerminated(done, z11, observer, z10, simplePlainQueue, disposable, observableQueueDrain)) {
                    return;
                }
                if (z11) {
                    i10 = observableQueueDrain.leave(-i10);
                    if (i10 == 0) {
                        return;
                    }
                } else {
                    observableQueueDrain.accept(observer, poll);
                }
            }
        }
    }

    public static <T, U> void drainMaxLoop(SimplePlainQueue<T> simplePlainQueue, c cVar, boolean z10, Disposable disposable, QueueDrain<T, U> queueDrain) {
        boolean z11;
        int i10 = 1;
        while (true) {
            boolean done = queueDrain.done();
            T poll = simplePlainQueue.poll();
            if (poll == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (checkTerminated(done, z11, cVar, z10, simplePlainQueue, queueDrain)) {
                if (disposable != null) {
                    disposable.dispose();
                    return;
                }
                return;
            } else if (z11) {
                i10 = queueDrain.leave(-i10);
                if (i10 == 0) {
                    return;
                }
            } else {
                long requested = queueDrain.requested();
                if (requested != 0) {
                    if (queueDrain.accept(cVar, poll) && requested != REQUESTED_MASK) {
                        queueDrain.produced(1L);
                    }
                } else {
                    simplePlainQueue.clear();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    cVar.onError(new MissingBackpressureException("Could not emit value due to lack of requests."));
                    return;
                }
            }
        }
    }

    public static boolean isCancelled(BooleanSupplier booleanSupplier) {
        try {
            return booleanSupplier.getAsBoolean();
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            return true;
        }
    }

    public static <T> void postComplete(c cVar, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j10;
        long j11;
        if (queue.isEmpty()) {
            cVar.onComplete();
        } else if (postCompleteDrain(atomicLong.get(), cVar, queue, atomicLong, booleanSupplier)) {
        } else {
            do {
                j10 = atomicLong.get();
                if ((j10 & COMPLETED_MASK) != 0) {
                    return;
                }
                j11 = j10 | COMPLETED_MASK;
            } while (!atomicLong.compareAndSet(j10, j11));
            if (j10 != 0) {
                postCompleteDrain(j11, cVar, queue, atomicLong, booleanSupplier);
            }
        }
    }

    public static <T> boolean postCompleteDrain(long j10, c cVar, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j11 = j10 & COMPLETED_MASK;
        while (true) {
            if (j11 != j10) {
                if (isCancelled(booleanSupplier)) {
                    return true;
                }
                T poll = queue.poll();
                if (poll == null) {
                    cVar.onComplete();
                    return true;
                }
                cVar.onNext(poll);
                j11++;
            } else if (isCancelled(booleanSupplier)) {
                return true;
            } else {
                if (queue.isEmpty()) {
                    cVar.onComplete();
                    return true;
                }
                j10 = atomicLong.get();
                if (j10 == j11) {
                    long addAndGet = atomicLong.addAndGet(-(j11 & REQUESTED_MASK));
                    if ((REQUESTED_MASK & addAndGet) == 0) {
                        return false;
                    }
                    j10 = addAndGet;
                    j11 = addAndGet & COMPLETED_MASK;
                } else {
                    continue;
                }
            }
        }
    }

    public static <T> boolean postCompleteRequest(long j10, c cVar, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j11;
        long j12;
        do {
            j11 = atomicLong.get();
            j12 = REQUESTED_MASK & j11;
        } while (!atomicLong.compareAndSet(j11, BackpressureHelper.addCap(j12, j10) | (j11 & COMPLETED_MASK)));
        if (j11 == COMPLETED_MASK) {
            postCompleteDrain(j10 | COMPLETED_MASK, cVar, queue, atomicLong, booleanSupplier);
            return true;
        }
        return false;
    }

    public static void request(d dVar, int i10) {
        long j10;
        if (i10 < 0) {
            j10 = REQUESTED_MASK;
        } else {
            j10 = i10;
        }
        dVar.request(j10);
    }

    public static <T, U> boolean checkTerminated(boolean z10, boolean z11, Observer<?> observer, boolean z12, SimpleQueue<?> simpleQueue, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        if (observableQueueDrain.cancelled()) {
            simpleQueue.clear();
            disposable.dispose();
            return true;
        } else if (z10) {
            if (z12) {
                if (z11) {
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    Throwable error = observableQueueDrain.error();
                    if (error != null) {
                        observer.onError(error);
                    } else {
                        observer.onComplete();
                    }
                    return true;
                }
                return false;
            }
            Throwable error2 = observableQueueDrain.error();
            if (error2 != null) {
                simpleQueue.clear();
                if (disposable != null) {
                    disposable.dispose();
                }
                observer.onError(error2);
                return true;
            } else if (z11) {
                if (disposable != null) {
                    disposable.dispose();
                }
                observer.onComplete();
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
