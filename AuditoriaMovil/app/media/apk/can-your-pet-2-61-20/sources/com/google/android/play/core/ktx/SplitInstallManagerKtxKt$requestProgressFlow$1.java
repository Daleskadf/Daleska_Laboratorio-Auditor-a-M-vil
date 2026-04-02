package com.google.android.play.core.ktx;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
/* compiled from: com.google.android.play:feature-delivery-ktx@@2.1.0 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.google.android.play.core.ktx.SplitInstallManagerKtxKt$requestProgressFlow$1", f = "SplitInstallManagerKtx.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SplitInstallManagerKtxKt$requestProgressFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super SplitInstallSessionState>, Continuation<? super Unit>, Object> {
    final /* synthetic */ SplitInstallManager $this_requestProgressFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitInstallManagerKtxKt$requestProgressFlow$1(SplitInstallManager splitInstallManager, Continuation<? super SplitInstallManagerKtxKt$requestProgressFlow$1> continuation) {
        super(2, continuation);
        this.$this_requestProgressFlow = splitInstallManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SplitInstallManagerKtxKt$requestProgressFlow$1 splitInstallManagerKtxKt$requestProgressFlow$1 = new SplitInstallManagerKtxKt$requestProgressFlow$1(this.$this_requestProgressFlow, continuation);
        splitInstallManagerKtxKt$requestProgressFlow$1.L$0 = obj;
        return splitInstallManagerKtxKt$requestProgressFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super SplitInstallSessionState> producerScope, Continuation<? super Unit> continuation) {
        return ((SplitInstallManagerKtxKt$requestProgressFlow$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            final SplitInstallStateUpdatedListener splitInstallStateUpdatedListener = new SplitInstallStateUpdatedListener() { // from class: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$requestProgressFlow$1$globalSessionListener$1
                @Override // com.google.android.play.core.listener.StateUpdatedListener
                public final void onStateUpdate(SplitInstallSessionState state) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    linkedHashSet.add(Integer.valueOf(state.sessionId()));
                    SplitInstallManagerKtxKt.tryOffer(producerScope, state);
                }
            };
            this.$this_requestProgressFlow.registerListener(splitInstallStateUpdatedListener);
            this.$this_requestProgressFlow.getSessionStates().addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$requestProgressFlow$1.1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(List<? extends SplitInstallSessionState> sessionList) {
                    Intrinsics.checkNotNullParameter(sessionList, "sessionList");
                    Set<Integer> set = linkedHashSet;
                    ArrayList<SplitInstallSessionState> arrayList = new ArrayList();
                    for (Object obj2 : sessionList) {
                        if (!set.contains(Integer.valueOf(((SplitInstallSessionState) obj2).sessionId()))) {
                            arrayList.add(obj2);
                        }
                    }
                    ProducerScope<SplitInstallSessionState> producerScope2 = producerScope;
                    for (SplitInstallSessionState splitInstallSessionState : arrayList) {
                        SplitInstallManagerKtxKt.tryOffer(producerScope2, splitInstallSessionState);
                    }
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$requestProgressFlow$1.2
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exception) {
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    producerScope.close(exception);
                }
            });
            final SplitInstallManager splitInstallManager = this.$this_requestProgressFlow;
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, new Function0<Unit>() { // from class: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$requestProgressFlow$1.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    SplitInstallManager.this.unregisterListener(splitInstallStateUpdatedListener);
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
