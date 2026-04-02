package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
final class av extends al {
    private final co c;
    private final ea d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public av(aw awVar, TaskCompletionSource taskCompletionSource, co coVar, ea eaVar) {
        super(awVar, taskCompletionSource);
        this.c = coVar;
        this.d = eaVar;
    }

    @Override // com.google.android.play.core.assetpacks.al, com.google.android.play.core.assetpacks.internal.h
    public final void n(int i, Bundle bundle) {
        super.n(i, bundle);
        this.a.trySetResult(AssetPackStates.a(bundle, this.c, this.d, bf.a));
    }
}
