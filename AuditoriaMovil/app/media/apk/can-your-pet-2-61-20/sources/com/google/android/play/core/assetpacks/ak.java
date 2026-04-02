package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
public final class ak extends com.google.android.play.core.assetpacks.internal.p {
    final /* synthetic */ TaskCompletionSource a;
    final /* synthetic */ aw b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(aw awVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.a = taskCompletionSource2;
        this.b = awVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.play.core.assetpacks.internal.f, android.os.IInterface] */
    @Override // com.google.android.play.core.assetpacks.internal.p
    protected final void a() {
        com.google.android.play.core.assetpacks.internal.o oVar;
        com.google.android.play.core.assetpacks.internal.z zVar;
        String str;
        Bundle A;
        try {
            zVar = this.b.g;
            ?? e = zVar.e();
            str = this.b.c;
            A = aw.A();
            e.f(str, A, new ap(this.b, this.a));
        } catch (RemoteException e2) {
            oVar = aw.a;
            oVar.c(e2, "keepAlive", new Object[0]);
        }
    }
}
