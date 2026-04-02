package io.reactivex.internal.operators.flowable;

import fb.c;
import fb.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes3.dex */
public final class FlowableTake<T> extends AbstractFlowableWithUpstream<T, T> {
    final long limit;

    /* loaded from: classes3.dex */
    public static final class TakeSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -5636543848937116287L;
        boolean done;
        final c downstream;
        final long limit;
        long remaining;
        d upstream;

        public TakeSubscriber(c cVar, long j10) {
            this.downstream = cVar;
            this.limit = j10;
            this.remaining = j10;
        }

        @Override // fb.d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, fb.c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, fb.c
        public void onError(Throwable th) {
            if (!this.done) {
                this.done = true;
                this.upstream.cancel();
                this.downstream.onError(th);
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, fb.c
        public void onNext(T t10) {
            boolean z10;
            if (!this.done) {
                long j10 = this.remaining;
                long j11 = j10 - 1;
                this.remaining = j11;
                if (j10 > 0) {
                    if (j11 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.downstream.onNext(t10);
                    if (z10) {
                        this.upstream.cancel();
                        onComplete();
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, fb.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (this.limit == 0) {
                    dVar.cancel();
                    this.done = true;
                    EmptySubscription.complete(this.downstream);
                    return;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // fb.d
        public void request(long j10) {
            if (!SubscriptionHelper.validate(j10)) {
                return;
            }
            if (!get() && compareAndSet(false, true) && j10 >= this.limit) {
                this.upstream.request(Long.MAX_VALUE);
            } else {
                this.upstream.request(j10);
            }
        }
    }

    public FlowableTake(Flowable<T> flowable, long j10) {
        super(flowable);
        this.limit = j10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new TakeSubscriber(cVar, this.limit));
    }
}
