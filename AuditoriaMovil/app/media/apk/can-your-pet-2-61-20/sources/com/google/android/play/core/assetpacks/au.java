package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
final class au extends al {
    private final co c;
    private final ea d;
    private final be e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public au(aw awVar, TaskCompletionSource taskCompletionSource, co coVar, ea eaVar, be beVar) {
        super(awVar, taskCompletionSource);
        this.c = coVar;
        this.d = eaVar;
        this.e = beVar;
    }

    @Override // com.google.android.play.core.assetpacks.al, com.google.android.play.core.assetpacks.internal.h
    public final void m(Bundle bundle, Bundle bundle2) {
        super.m(bundle, bundle2);
        this.a.trySetResult(AssetPackStates.a(bundle, this.c, this.d, this.e));
    }
}
