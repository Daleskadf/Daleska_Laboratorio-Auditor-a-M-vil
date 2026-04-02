package com.google.android.play.core.ktx;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
/* compiled from: com.google.android.play:asset-delivery-ktx@@2.2.1 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/google/android/play/core/assetpacks/AssetPackState;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestProgressFlow$1", f = "AssetPackManagerKtx.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class AssetPackManagerKtxKt$requestProgressFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super AssetPackState>, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $packs;
    final /* synthetic */ AssetPackManager $this_requestProgressFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetPackManagerKtxKt$requestProgressFlow$1(AssetPackManager assetPackManager, List<String> list, Continuation<? super AssetPackManagerKtxKt$requestProgressFlow$1> continuation) {
        super(2, continuation);
        this.$this_requestProgressFlow = assetPackManager;
        this.$packs = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetPackManagerKtxKt$requestProgressFlow$1 assetPackManagerKtxKt$requestProgressFlow$1 = new AssetPackManagerKtxKt$requestProgressFlow$1(this.$this_requestProgressFlow, this.$packs, continuation);
        assetPackManagerKtxKt$requestProgressFlow$1.L$0 = obj;
        return assetPackManagerKtxKt$requestProgressFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super AssetPackState> producerScope, Continuation<? super Unit> continuation) {
        return ((AssetPackManagerKtxKt$requestProgressFlow$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            final AssetPackStateUpdateListener assetPackStateUpdateListener = new AssetPackStateUpdateListener() { // from class: com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestProgressFlow$1$$ExternalSyntheticLambda0
                @Override // com.google.android.play.core.listener.StateUpdatedListener
                public final void onStateUpdate(AssetPackState assetPackState) {
                    AssetPackManagerKtxKt$requestProgressFlow$1.invokeSuspend$lambda$0(linkedHashSet, producerScope, assetPackState);
                }
            };
            this.$this_requestProgressFlow.registerListener(assetPackStateUpdateListener);
            Task<AssetPackStates> packStates = this.$this_requestProgressFlow.getPackStates(this.$packs);
            final List<String> list = this.$packs;
            final Function1<AssetPackStates, Unit> function1 = new Function1<AssetPackStates, Unit>() { // from class: com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestProgressFlow$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(AssetPackStates assetPackStates) {
                    invoke2(assetPackStates);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(AssetPackStates states) {
                    Intrinsics.checkNotNullParameter(states, "states");
                    Set<String> set = linkedHashSet;
                    ArrayList<String> arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!set.contains((String) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    ProducerScope<AssetPackState> producerScope2 = producerScope;
                    for (String str : arrayList) {
                        Map<String, AssetPackState> packStates2 = states.packStates();
                        Intrinsics.checkNotNullExpressionValue(packStates2, "packStates(...)");
                        AssetPackState assetPackState = packStates2.get(str);
                        Intrinsics.checkNotNull(assetPackState);
                        AssetPackManagerKtxKt.tryOffer(producerScope2, assetPackState);
                    }
                }
            };
            packStates.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestProgressFlow$1$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj2) {
                    Function1.this.invoke(obj2);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestProgressFlow$1$$ExternalSyntheticLambda2
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    AssetPackManagerKtxKt$requestProgressFlow$1.invokeSuspend$lambda$2(ProducerScope.this, exc);
                }
            });
            final AssetPackManager assetPackManager = this.$this_requestProgressFlow;
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, new Function0<Unit>() { // from class: com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestProgressFlow$1.3
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
                    AssetPackManager.this.unregisterListener(assetPackStateUpdateListener);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(Set set, ProducerScope producerScope, AssetPackState assetPackState) {
        String name = assetPackState.name();
        Intrinsics.checkNotNullExpressionValue(name, "name(...)");
        set.add(name);
        AssetPackManagerKtxKt.tryOffer(producerScope, assetPackState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(ProducerScope producerScope, Exception exc) {
        producerScope.close(exc);
    }
}
