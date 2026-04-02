package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
final class af extends com.google.android.play.core.assetpacks.internal.p {
    final /* synthetic */ List a;
    final /* synthetic */ Map b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ be d;
    final /* synthetic */ aw e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(aw awVar, TaskCompletionSource taskCompletionSource, List list, Map map, TaskCompletionSource taskCompletionSource2, be beVar) {
        super(taskCompletionSource);
        this.a = list;
        this.b = map;
        this.c = taskCompletionSource2;
        this.d = beVar;
        this.e = awVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.play.core.assetpacks.internal.f, android.os.IInterface] */
    @Override // com.google.android.play.core.assetpacks.internal.p
    protected final void a() {
        com.google.android.play.core.assetpacks.internal.o oVar;
        com.google.android.play.core.assetpacks.internal.z zVar;
        String str;
        co coVar;
        ea eaVar;
        ArrayList v = aw.v(this.a);
        try {
            zVar = this.e.f;
            ?? e = zVar.e();
            str = this.e.c;
            Bundle n = aw.n(this.b);
            aw awVar = this.e;
            TaskCompletionSource taskCompletionSource = this.c;
            coVar = awVar.d;
            eaVar = awVar.e;
            e.k(str, v, n, new au(awVar, taskCompletionSource, coVar, eaVar, this.d));
        } catch (RemoteException e2) {
            List list = this.a;
            oVar = aw.a;
            oVar.c(e2, "getPackStates(%s)", list);
            this.c.trySetException(new RuntimeException(e2));
        }
    }
}
