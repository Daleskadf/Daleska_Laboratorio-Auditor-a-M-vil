package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
final class ab extends com.google.android.play.core.assetpacks.internal.p {
    final /* synthetic */ String a;
    final /* synthetic */ TaskCompletionSource b;
    final /* synthetic */ aw c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(aw awVar, TaskCompletionSource taskCompletionSource, String str, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.a = str;
        this.b = taskCompletionSource2;
        this.c = awVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.play.core.assetpacks.internal.f, android.os.IInterface] */
    @Override // com.google.android.play.core.assetpacks.internal.p
    protected final void a() {
        com.google.android.play.core.assetpacks.internal.o oVar;
        com.google.android.play.core.assetpacks.internal.z zVar;
        String str;
        Bundle z;
        Bundle A;
        try {
            zVar = this.c.f;
            ?? e = zVar.e();
            str = this.c.c;
            z = aw.z(0, this.a);
            A = aw.A();
            e.j(str, z, A, new at(this.c, this.b));
        } catch (RemoteException e2) {
            String str2 = this.a;
            oVar = aw.a;
            oVar.c(e2, "removePack(%s)", str2);
        }
    }
}
