package com.google.android.play.core.ktx;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.annotation.NoNullnessRewrite;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetLocation;
import com.google.android.play.core.assetpacks.AssetPackLocation;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ContextKt;
/* compiled from: com.google.android.play:asset-delivery-ktx@@2.2.1 */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010+\u001a\u0002H,\"\u0004\b\u0000\u0010,2\f\u0010-\u001a\b\u0012\u0004\u0012\u0002H,0.2\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020100H\u0080@¢\u0006\u0002\u00102\u001a\u001a\u00103\u001a\u00020\u000b*\u0002042\u0006\u00105\u001a\u000206H\u0086@¢\u0006\u0002\u00107\u001a \u00108\u001a\u00020\u0017*\u0002042\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00010:H\u0086@¢\u0006\u0002\u0010;\u001a \u0010<\u001a\u00020\u0017*\u0002042\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00010:H\u0086@¢\u0006\u0002\u0010;\u001a\u001e\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00070>*\u0002042\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00010:\u001a\u001a\u0010?\u001a\u000201*\u0002042\u0006\u0010@\u001a\u00020\u0001H\u0086@¢\u0006\u0002\u0010A\u001a%\u0010B\u001a\u00020C\"\u0004\b\u0000\u0010D*\b\u0012\u0004\u0012\u0002HD0E2\u0006\u0010F\u001a\u0002HDH\u0000¢\u0006\u0002\u0010G\"\u0018\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0005\u001a\u00020\u0006*\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0016\u0010\n\u001a\u00020\u000b*\u00020\u00078Ç\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0016\u0010\u000e\u001a\u00020\u0001*\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0016\u0010\u0011\u001a\u00020\u0006*\u00020\u00128Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0016*\u00020\u00178Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0016\u0010\u001a\u001a\u00020\u000b*\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0016\u0010\u001d\u001a\u00020\u0001*\u00020\u00128Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0004\"\u0016\u0010 \u001a\u00020\u0006*\u00020\u00128Æ\u0002¢\u0006\u0006\u001a\u0004\b!\u0010\u0014\"\u0016\u0010\"\u001a\u00020\u000b*\u00020\u00078Ç\u0002¢\u0006\u0006\u001a\u0004\b#\u0010\r\"\u0016\u0010$\u001a\u00020\u0006*\u00020\u00178Æ\u0002¢\u0006\u0006\u001a\u0004\b%\u0010&\"\u0016\u0010'\u001a\u00020\u0006*\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b(\u0010\t\"\u0016\u0010)\u001a\u00020\u000b*\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b*\u0010\r¨\u0006H"}, d2 = {"assetsPath", "", "Lcom/google/android/play/core/assetpacks/AssetPackLocation;", "getAssetsPath", "(Lcom/google/android/play/core/assetpacks/AssetPackLocation;)Ljava/lang/String;", "bytesDownloaded", "", "Lcom/google/android/play/core/assetpacks/AssetPackState;", "getBytesDownloaded", "(Lcom/google/android/play/core/assetpacks/AssetPackState;)J", "errorCode", "", "getErrorCode", "(Lcom/google/android/play/core/assetpacks/AssetPackState;)I", AppMeasurementSdk.ConditionalUserProperty.NAME, "getName", "(Lcom/google/android/play/core/assetpacks/AssetPackState;)Ljava/lang/String;", TypedValues.CycleType.S_WAVE_OFFSET, "Lcom/google/android/play/core/assetpacks/AssetLocation;", "getOffset", "(Lcom/google/android/play/core/assetpacks/AssetLocation;)J", "packStates", "", "Lcom/google/android/play/core/assetpacks/AssetPackStates;", "getPackStates", "(Lcom/google/android/play/core/assetpacks/AssetPackStates;)Ljava/util/Map;", "packStorageMethod", "getPackStorageMethod", "(Lcom/google/android/play/core/assetpacks/AssetPackLocation;)I", "path", "getPath", "(Lcom/google/android/play/core/assetpacks/AssetLocation;)Ljava/lang/String;", "size", "getSize", NotificationCompat.CATEGORY_STATUS, "getStatus", "totalBytes", "getTotalBytes", "(Lcom/google/android/play/core/assetpacks/AssetPackStates;)J", "totalBytesToDownload", "getTotalBytesToDownload", "transferProgressPercentage", "getTransferProgressPercentage", "runTask", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "task", "Lcom/google/android/gms/tasks/Task;", "onCanceled", "Lkotlin/Function0;", "", "(Lcom/google/android/gms/tasks/Task;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestCellularDataConfirmation", "Lcom/google/android/play/core/assetpacks/AssetPackManager;", "activity", "Landroid/app/Activity;", "(Lcom/google/android/play/core/assetpacks/AssetPackManager;Landroid/app/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestFetch", "packs", "", "(Lcom/google/android/play/core/assetpacks/AssetPackManager;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestPackStates", "requestProgressFlow", "Lkotlinx/coroutines/flow/Flow;", "requestRemovePack", "packName", "(Lcom/google/android/play/core/assetpacks/AssetPackManager;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryOffer", "", "E", "Lkotlinx/coroutines/channels/SendChannel;", "element", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)Z", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_asset_delivery_ktx"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class AssetPackManagerKtxKt {
    public static final int getErrorCode(AssetPackState assetPackState) {
        Intrinsics.checkNotNullParameter(assetPackState, "<this>");
        return assetPackState.errorCode();
    }

    public static final int getPackStorageMethod(AssetPackLocation assetPackLocation) {
        Intrinsics.checkNotNullParameter(assetPackLocation, "<this>");
        return assetPackLocation.packStorageMethod();
    }

    public static final int getStatus(AssetPackState assetPackState) {
        Intrinsics.checkNotNullParameter(assetPackState, "<this>");
        return assetPackState.status();
    }

    public static final int getTransferProgressPercentage(AssetPackState assetPackState) {
        Intrinsics.checkNotNullParameter(assetPackState, "<this>");
        return assetPackState.transferProgressPercentage();
    }

    public static final long getBytesDownloaded(AssetPackState assetPackState) {
        Intrinsics.checkNotNullParameter(assetPackState, "<this>");
        return assetPackState.bytesDownloaded();
    }

    public static final long getOffset(AssetLocation assetLocation) {
        Intrinsics.checkNotNullParameter(assetLocation, "<this>");
        return assetLocation.offset();
    }

    public static final long getSize(AssetLocation assetLocation) {
        Intrinsics.checkNotNullParameter(assetLocation, "<this>");
        return assetLocation.size();
    }

    public static final long getTotalBytes(AssetPackStates assetPackStates) {
        Intrinsics.checkNotNullParameter(assetPackStates, "<this>");
        return assetPackStates.totalBytes();
    }

    public static final long getTotalBytesToDownload(AssetPackState assetPackState) {
        Intrinsics.checkNotNullParameter(assetPackState, "<this>");
        return assetPackState.totalBytesToDownload();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object requestCellularDataConfirmation(com.google.android.play.core.assetpacks.AssetPackManager r4, android.app.Activity r5, kotlin.coroutines.Continuation<? super java.lang.Integer> r6) {
        /*
            boolean r0 = r6 instanceof com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestCellularDataConfirmation$1
            if (r0 == 0) goto L14
            r0 = r6
            com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestCellularDataConfirmation$1 r0 = (com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestCellularDataConfirmation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestCellularDataConfirmation$1 r0 = new com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestCellularDataConfirmation$1
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L49
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.ResultKt.throwOnFailure(r6)
            com.google.android.gms.tasks.Task r4 = r4.showCellularDataConfirmation(r5)
            java.lang.String r5 = "showCellularDataConfirmation(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r0.label = r3
            r5 = 0
            r6 = 2
            java.lang.Object r6 = runTask$default(r4, r5, r0, r6, r5)
            if (r6 != r1) goto L49
            return r1
        L49:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.ktx.AssetPackManagerKtxKt.requestCellularDataConfirmation(com.google.android.play.core.assetpacks.AssetPackManager, android.app.Activity, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object requestFetch(com.google.android.play.core.assetpacks.AssetPackManager r4, java.util.List<java.lang.String> r5, kotlin.coroutines.Continuation<? super com.google.android.play.core.assetpacks.AssetPackStates> r6) {
        /*
            boolean r0 = r6 instanceof com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestFetch$1
            if (r0 == 0) goto L14
            r0 = r6
            com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestFetch$1 r0 = (com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestFetch$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestFetch$1 r0 = new com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestFetch$1
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L49
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.ResultKt.throwOnFailure(r6)
            com.google.android.gms.tasks.Task r4 = r4.fetch(r5)
            java.lang.String r5 = "fetch(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r0.label = r3
            r5 = 0
            r6 = 2
            java.lang.Object r6 = runTask$default(r4, r5, r0, r6, r5)
            if (r6 != r1) goto L49
            return r1
        L49:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.ktx.AssetPackManagerKtxKt.requestFetch(com.google.android.play.core.assetpacks.AssetPackManager, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object requestPackStates(com.google.android.play.core.assetpacks.AssetPackManager r4, java.util.List<java.lang.String> r5, kotlin.coroutines.Continuation<? super com.google.android.play.core.assetpacks.AssetPackStates> r6) {
        /*
            boolean r0 = r6 instanceof com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestPackStates$1
            if (r0 == 0) goto L14
            r0 = r6
            com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestPackStates$1 r0 = (com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestPackStates$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestPackStates$1 r0 = new com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestPackStates$1
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L47
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.ResultKt.throwOnFailure(r6)
            com.google.android.gms.tasks.Task r4 = r4.getPackStates(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r0.label = r3
            r5 = 0
            r6 = 2
            java.lang.Object r6 = runTask$default(r4, r5, r0, r6, r5)
            if (r6 != r1) goto L47
            return r1
        L47:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.ktx.AssetPackManagerKtxKt.requestPackStates(com.google.android.play.core.assetpacks.AssetPackManager, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object requestRemovePack(AssetPackManager assetPackManager, String str, Continuation<? super Unit> continuation) {
        Task<Void> removePack = assetPackManager.removePack(str);
        Intrinsics.checkNotNullExpressionValue(removePack, "removePack(...)");
        Object runTask$default = runTask$default(removePack, null, continuation, 2, null);
        return runTask$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? runTask$default : Unit.INSTANCE;
    }

    public static final <T> Object runTask(Task<T> task, final Function0<Unit> function0, Continuation<? super T> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.google.android.play.core.ktx.AssetPackManagerKtxKt$runTask$3$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                function0.invoke();
            }
        });
        if (task.isComplete()) {
            if (task.isSuccessful()) {
                cancellableContinuationImpl2.resumeWith(Result.m413constructorimpl(task.getResult()));
            } else {
                Exception exception = task.getException();
                Intrinsics.checkNotNull(exception);
                cancellableContinuationImpl2.resumeWith(Result.m413constructorimpl(ResultKt.createFailure(exception)));
            }
        } else {
            final Function1<T, Unit> function1 = new Function1<T, Unit>() { // from class: com.google.android.play.core.ktx.AssetPackManagerKtxKt$runTask$3$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke2((AssetPackManagerKtxKt$runTask$3$2<T>) obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(T t) {
                    cancellableContinuationImpl2.resumeWith(Result.m413constructorimpl(t));
                }
            };
            task.addOnSuccessListener(new OnSuccessListener(function1) { // from class: com.google.android.play.core.ktx.AssetPackManagerKtxKt$sam$com_google_android_gms_tasks_OnSuccessListener$0
                private final /* synthetic */ Function1 function;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    Intrinsics.checkNotNullParameter(function1, "function");
                    this.function = function1;
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final /* synthetic */ void onSuccess(@NoNullnessRewrite(reason = "Can be null for Task<Void> but this is uncommon.") Object obj) {
                    this.function.invoke(obj);
                }
            });
            task.addOnFailureListener(new OnFailureListener() { // from class: com.google.android.play.core.ktx.AssetPackManagerKtxKt$runTask$3$3
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exception2) {
                    Intrinsics.checkNotNullParameter(exception2, "exception");
                    cancellableContinuationImpl2.resumeWith(Result.m413constructorimpl(ResultKt.createFailure(exception2)));
                }
            });
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static /* synthetic */ Object runTask$default(Task task, Function0 function0, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: com.google.android.play.core.ktx.AssetPackManagerKtxKt$runTask$2
                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        return runTask(task, function0, continuation);
    }

    public static final String getAssetsPath(AssetPackLocation assetPackLocation) {
        Intrinsics.checkNotNullParameter(assetPackLocation, "<this>");
        return assetPackLocation.assetsPath();
    }

    public static final String getName(AssetPackState assetPackState) {
        Intrinsics.checkNotNullParameter(assetPackState, "<this>");
        String name = assetPackState.name();
        Intrinsics.checkNotNullExpressionValue(name, "name(...)");
        return name;
    }

    public static final String getPath(AssetLocation assetLocation) {
        Intrinsics.checkNotNullParameter(assetLocation, "<this>");
        String path = assetLocation.path();
        Intrinsics.checkNotNullExpressionValue(path, "path(...)");
        return path;
    }

    public static final String getPath(AssetPackLocation assetPackLocation) {
        Intrinsics.checkNotNullParameter(assetPackLocation, "<this>");
        return assetPackLocation.path();
    }

    public static final Map<String, AssetPackState> getPackStates(AssetPackStates assetPackStates) {
        Intrinsics.checkNotNullParameter(assetPackStates, "<this>");
        Map<String, AssetPackState> packStates = assetPackStates.packStates();
        Intrinsics.checkNotNullExpressionValue(packStates, "packStates(...)");
        return packStates;
    }

    public static final Flow<AssetPackState> requestProgressFlow(AssetPackManager assetPackManager, List<String> packs) {
        Flow<AssetPackState> buffer$default;
        Intrinsics.checkNotNullParameter(assetPackManager, "<this>");
        Intrinsics.checkNotNullParameter(packs, "packs");
        buffer$default = FlowKt__ContextKt.buffer$default(FlowKt.callbackFlow(new AssetPackManagerKtxKt$requestProgressFlow$1(assetPackManager, packs, null)), Integer.MAX_VALUE, null, 2, null);
        return buffer$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> boolean tryOffer(SendChannel<? super E> sendChannel, E e) {
        Intrinsics.checkNotNullParameter(sendChannel, "<this>");
        return ChannelResult.m2015isSuccessimpl(sendChannel.mo1995trySendJP2dKIU(e));
    }
}
