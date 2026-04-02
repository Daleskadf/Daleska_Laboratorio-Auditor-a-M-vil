package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import e3.C0964a;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class Q implements ServiceConnection {

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ T f9333X;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f9334a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f9335b = 2;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9336c;

    /* renamed from: d  reason: collision with root package name */
    public IBinder f9337d;

    /* renamed from: e  reason: collision with root package name */
    public final P f9338e;
    public ComponentName f;

    public Q(T t7, P p7) {
        this.f9333X = t7;
        this.f9338e = p7;
    }

    public final void a(String str, Executor executor) {
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f9335b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            T t7 = this.f9333X;
            C0964a c0964a = t7.f9342g;
            Context context = t7.f9341e;
            boolean b5 = c0964a.b(context, str, this.f9338e.a(context), this, executor);
            this.f9336c = b5;
            if (b5) {
                this.f9333X.f.sendMessageDelayed(this.f9333X.f.obtainMessage(1, this.f9338e), this.f9333X.f9344i);
            } else {
                this.f9335b = 2;
                try {
                    T t8 = this.f9333X;
                    t8.f9342g.a(t8.f9341e, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f9333X.f9340d) {
            try {
                this.f9333X.f.removeMessages(1, this.f9338e);
                this.f9337d = iBinder;
                this.f = componentName;
                for (ServiceConnection serviceConnection : this.f9334a.values()) {
                    serviceConnection.onServiceConnected(componentName, iBinder);
                }
                this.f9335b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f9333X.f9340d) {
            try {
                this.f9333X.f.removeMessages(1, this.f9338e);
                this.f9337d = null;
                this.f = componentName;
                for (ServiceConnection serviceConnection : this.f9334a.values()) {
                    serviceConnection.onServiceDisconnected(componentName);
                }
                this.f9335b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
