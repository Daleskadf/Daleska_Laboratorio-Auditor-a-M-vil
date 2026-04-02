package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public final class L implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final int f9319a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC0757f f9320b;

    public L(AbstractC0757f abstractC0757f, int i7) {
        this.f9320b = abstractC0757f;
        this.f9319a = i7;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        r h8;
        AbstractC0757f abstractC0757f = this.f9320b;
        if (iBinder == null) {
            AbstractC0757f.zzk(abstractC0757f, 16);
            return;
        }
        obj = abstractC0757f.zzq;
        synchronized (obj) {
            try {
                AbstractC0757f abstractC0757f2 = this.f9320b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof r)) {
                    h8 = (r) queryLocalInterface;
                } else {
                    h8 = new H(iBinder);
                }
                abstractC0757f2.zzr = h8;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f9320b.zzl(0, null, this.f9319a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f9320b.zzq;
        synchronized (obj) {
            this.f9320b.zzr = null;
        }
        AbstractC0757f abstractC0757f = this.f9320b;
        int i7 = this.f9319a;
        Handler handler = abstractC0757f.zzb;
        handler.sendMessage(handler.obtainMessage(6, i7, 1));
    }
}
