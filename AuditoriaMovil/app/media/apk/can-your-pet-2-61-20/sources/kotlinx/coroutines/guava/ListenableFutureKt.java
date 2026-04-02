package kotlinx.coroutines.guava;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.Uninterruptibles;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.common.util.concurrent.internal.InternalFutures;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.ChildJob;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectClause1;
/* compiled from: ListenableFuture.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a!\u0010\u0005\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a[\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e¢\u0006\u0002\b\u0011ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\f\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"asDeferred", "Lkotlinx/coroutines/Deferred;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/google/common/util/concurrent/ListenableFuture;", "asListenableFuture", "await", "(Lcom/google/common/util/concurrent/ListenableFuture;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "future", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "start", "Lkotlinx/coroutines/CoroutineStart;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lcom/google/common/util/concurrent/ListenableFuture;", "nonNullCause", "", "Ljava/util/concurrent/ExecutionException;", "kotlinx-coroutines-guava"}, k = 2, mv = {1, 6, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class ListenableFutureKt {
    public static /* synthetic */ ListenableFuture future$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return future(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final <T> ListenableFuture<T> future(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        if (!(!coroutineStart.isLazy())) {
            throw new IllegalArgumentException((coroutineStart + " start is not supported").toString());
        }
        ListenableFutureCoroutine listenableFutureCoroutine = new ListenableFutureCoroutine(CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext));
        listenableFutureCoroutine.start(coroutineStart, listenableFutureCoroutine, function2);
        return listenableFutureCoroutine.future;
    }

    public static final <T> Deferred<T> asDeferred(final ListenableFuture<T> listenableFuture) {
        Throwable tryInternalFastPathGetFailure;
        if ((listenableFuture instanceof InternalFutureFailureAccess) && (tryInternalFastPathGetFailure = InternalFutures.tryInternalFastPathGetFailure((InternalFutureFailureAccess) listenableFuture)) != null) {
            CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            CompletableDeferred$default.completeExceptionally(tryInternalFastPathGetFailure);
            return CompletableDeferred$default;
        } else if (listenableFuture.isDone()) {
            try {
                return CompletableDeferredKt.CompletableDeferred(Uninterruptibles.getUninterruptibly(listenableFuture));
            } catch (CancellationException e) {
                CompletableDeferred CompletableDeferred$default2 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                CompletableDeferred$default2.cancel(e);
                return CompletableDeferred$default2;
            } catch (ExecutionException e2) {
                CompletableDeferred CompletableDeferred$default3 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                CompletableDeferred$default3.completeExceptionally(nonNullCause(e2));
                return CompletableDeferred$default3;
            }
        } else {
            final CompletableDeferred CompletableDeferred$default4 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            Futures.addCallback(listenableFuture, new FutureCallback<T>() { // from class: kotlinx.coroutines.guava.ListenableFutureKt$asDeferred$4
                @Override // com.google.common.util.concurrent.FutureCallback
                public void onSuccess(T t) {
                    Object m413constructorimpl;
                    CompletableDeferred<T> completableDeferred = CompletableDeferred$default4;
                    try {
                        Result.Companion companion = Result.Companion;
                        ListenableFutureKt$asDeferred$4<T> listenableFutureKt$asDeferred$4 = this;
                        m413constructorimpl = Result.m413constructorimpl(Boolean.valueOf(completableDeferred.complete(t)));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        m413constructorimpl = Result.m413constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable m416exceptionOrNullimpl = Result.m416exceptionOrNullimpl(m413constructorimpl);
                    if (m416exceptionOrNullimpl != null) {
                        CoroutineExceptionHandlerKt.handleCoroutineException(EmptyCoroutineContext.INSTANCE, m416exceptionOrNullimpl);
                    }
                }

                @Override // com.google.common.util.concurrent.FutureCallback
                public void onFailure(Throwable th) {
                    Object m413constructorimpl;
                    CompletableDeferred<T> completableDeferred = CompletableDeferred$default4;
                    try {
                        Result.Companion companion = Result.Companion;
                        ListenableFutureKt$asDeferred$4<T> listenableFutureKt$asDeferred$4 = this;
                        m413constructorimpl = Result.m413constructorimpl(Boolean.valueOf(completableDeferred.completeExceptionally(th)));
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.Companion;
                        m413constructorimpl = Result.m413constructorimpl(ResultKt.createFailure(th2));
                    }
                    Throwable m416exceptionOrNullimpl = Result.m416exceptionOrNullimpl(m413constructorimpl);
                    if (m416exceptionOrNullimpl != null) {
                        CoroutineExceptionHandlerKt.handleCoroutineException(EmptyCoroutineContext.INSTANCE, m416exceptionOrNullimpl);
                    }
                }
            }, MoreExecutors.directExecutor());
            CompletableDeferred$default4.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.guava.ListenableFutureKt$asDeferred$5
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    listenableFuture.cancel(false);
                }
            });
            return new Deferred<T>() { // from class: kotlinx.coroutines.guava.ListenableFutureKt$asDeferred$6
                @Override // kotlinx.coroutines.Job
                public ChildHandle attachChild(ChildJob childJob) {
                    return CompletableDeferred$default4.attachChild(childJob);
                }

                @Override // kotlinx.coroutines.Deferred
                public Object await(Continuation<? super T> continuation) {
                    return CompletableDeferred$default4.await(continuation);
                }

                @Override // kotlinx.coroutines.Job
                @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
                public /* synthetic */ void cancel() {
                    CompletableDeferred$default4.cancel();
                }

                @Override // kotlinx.coroutines.Job
                public void cancel(CancellationException cancellationException) {
                    CompletableDeferred$default4.cancel(cancellationException);
                }

                @Override // kotlinx.coroutines.Job
                @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
                public /* synthetic */ boolean cancel(Throwable th) {
                    return CompletableDeferred$default4.cancel(th);
                }

                @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
                public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
                    return (R) CompletableDeferred$default4.fold(r, function2);
                }

                @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
                public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
                    return (E) CompletableDeferred$default4.get(key);
                }

                @Override // kotlinx.coroutines.Job
                public CancellationException getCancellationException() {
                    return CompletableDeferred$default4.getCancellationException();
                }

                @Override // kotlinx.coroutines.Job
                public Sequence<Job> getChildren() {
                    return CompletableDeferred$default4.getChildren();
                }

                @Override // kotlinx.coroutines.Deferred
                public T getCompleted() {
                    return CompletableDeferred$default4.getCompleted();
                }

                @Override // kotlinx.coroutines.Deferred
                public Throwable getCompletionExceptionOrNull() {
                    return CompletableDeferred$default4.getCompletionExceptionOrNull();
                }

                @Override // kotlin.coroutines.CoroutineContext.Element
                public CoroutineContext.Key<?> getKey() {
                    return CompletableDeferred$default4.getKey();
                }

                @Override // kotlinx.coroutines.Deferred
                public SelectClause1<T> getOnAwait() {
                    return CompletableDeferred$default4.getOnAwait();
                }

                @Override // kotlinx.coroutines.Job
                public SelectClause0 getOnJoin() {
                    return CompletableDeferred$default4.getOnJoin();
                }

                @Override // kotlinx.coroutines.Job
                public DisposableHandle invokeOnCompletion(Function1<? super Throwable, Unit> function1) {
                    return CompletableDeferred$default4.invokeOnCompletion(function1);
                }

                @Override // kotlinx.coroutines.Job
                public DisposableHandle invokeOnCompletion(boolean z, boolean z2, Function1<? super Throwable, Unit> function1) {
                    return CompletableDeferred$default4.invokeOnCompletion(z, z2, function1);
                }

                @Override // kotlinx.coroutines.Job
                public boolean isActive() {
                    return CompletableDeferred$default4.isActive();
                }

                @Override // kotlinx.coroutines.Job
                public boolean isCancelled() {
                    return CompletableDeferred$default4.isCancelled();
                }

                @Override // kotlinx.coroutines.Job
                public boolean isCompleted() {
                    return CompletableDeferred$default4.isCompleted();
                }

                @Override // kotlinx.coroutines.Job
                public Object join(Continuation<? super Unit> continuation) {
                    return CompletableDeferred$default4.join(continuation);
                }

                @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
                public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
                    return CompletableDeferred$default4.minusKey(key);
                }

                @Override // kotlin.coroutines.CoroutineContext
                public CoroutineContext plus(CoroutineContext coroutineContext) {
                    return CompletableDeferred$default4.plus(coroutineContext);
                }

                @Override // kotlinx.coroutines.Job
                @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
                public Job plus(Job job) {
                    return CompletableDeferred$default4.plus(job);
                }

                @Override // kotlinx.coroutines.Job
                public boolean start() {
                    return CompletableDeferred$default4.start();
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable nonNullCause(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        Intrinsics.checkNotNull(cause);
        return cause;
    }

    public static final <T> ListenableFuture<T> asListenableFuture(final Deferred<? extends T> deferred) {
        final JobListenableFuture jobListenableFuture = new JobListenableFuture(deferred);
        deferred.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.guava.ListenableFutureKt$asListenableFuture$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (th == null) {
                    jobListenableFuture.complete(deferred.getCompleted());
                } else {
                    jobListenableFuture.completeExceptionallyOrCancel(th);
                }
            }
        });
        return jobListenableFuture;
    }

    public static final <T> Object await(final ListenableFuture<T> listenableFuture, Continuation<? super T> continuation) {
        try {
            if (listenableFuture.isDone()) {
                return Uninterruptibles.getUninterruptibly(listenableFuture);
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            listenableFuture.addListener(new ToContinuation(listenableFuture, cancellableContinuationImpl2), MoreExecutors.directExecutor());
            cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.guava.ListenableFutureKt$await$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    listenableFuture.cancel(false);
                }
            });
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        } catch (ExecutionException e) {
            throw nonNullCause(e);
        }
    }
}
