package com.google.android.play.core.assetpacks.internal;

import android.os.IBinder;
import java.util.List;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
final class v extends p {
    final /* synthetic */ IBinder a;
    final /* synthetic */ y b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(y yVar, IBinder iBinder) {
        this.a = iBinder;
        this.b = yVar;
    }

    @Override // com.google.android.play.core.assetpacks.internal.p
    public final void a() {
        List<Runnable> list;
        List list2;
        this.b.a.n = e.b(this.a);
        z.q(this.b.a);
        this.b.a.h = false;
        list = this.b.a.e;
        for (Runnable runnable : list) {
            runnable.run();
        }
        list2 = this.b.a.e;
        list2.clear();
    }
}
