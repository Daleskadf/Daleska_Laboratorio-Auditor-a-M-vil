package com.google.android.play.core.ktx;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:asset-delivery-ktx@@2.2.1 */
@Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.google.android.play.core.ktx.AssetPackManagerKtxKt", f = "AssetPackManagerKtx.kt", i = {}, l = {33}, m = "requestFetch", n = {}, s = {})
/* loaded from: classes3.dex */
public final class AssetPackManagerKtxKt$requestFetch$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AssetPackManagerKtxKt$requestFetch$1(Continuation<? super AssetPackManagerKtxKt$requestFetch$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AssetPackManagerKtxKt.requestFetch(null, null, this);
    }
}
