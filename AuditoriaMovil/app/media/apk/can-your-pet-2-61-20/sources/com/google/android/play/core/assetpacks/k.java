package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
public final class k extends ResultReceiver {
    final /* synthetic */ TaskCompletionSource a;
    final /* synthetic */ l b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.a = taskCompletionSource;
        this.b = lVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        bx bxVar;
        if (i == 1) {
            this.a.trySetResult(-1);
            bxVar = this.b.g;
            bxVar.b(null);
        } else if (i == 2) {
            this.a.trySetResult(0);
        } else {
            this.a.trySetException(new AssetPackException(-100));
        }
    }
}
