package com.google.android.play.core.assetpacks.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
public final class y implements ServiceConnection {
    final /* synthetic */ z a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ y(z zVar, x xVar) {
        this.a = zVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        z.f(this.a).d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.a.c().post(new v(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        z.f(this.a).d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.a.c().post(new w(this));
    }
}
