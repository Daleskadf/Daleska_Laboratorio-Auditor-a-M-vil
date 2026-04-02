package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import e3.C0964a;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class T extends AbstractC0764m {

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f9340d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final Context f9341e;
    public volatile zzi f;

    /* renamed from: g  reason: collision with root package name */
    public final C0964a f9342g;

    /* renamed from: h  reason: collision with root package name */
    public final long f9343h;

    /* renamed from: i  reason: collision with root package name */
    public final long f9344i;

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, e3.a] */
    public T(Context context, Looper looper) {
        S s7 = new S(this);
        this.f9341e = context.getApplicationContext();
        this.f = new zzi(looper, s7);
        if (C0964a.f10867b == null) {
            synchronized (C0964a.f10866a) {
                try {
                    if (C0964a.f10867b == null) {
                        ?? obj = new Object();
                        new ConcurrentHashMap();
                        C0964a.f10867b = obj;
                    }
                } finally {
                }
            }
        }
        C0964a c0964a = C0964a.f10867b;
        I.i(c0964a);
        this.f9342g = c0964a;
        this.f9343h = 5000L;
        this.f9344i = 300000L;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0764m
    public final void c(P p7, ServiceConnection serviceConnection) {
        I.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f9340d) {
            try {
                Q q2 = (Q) this.f9340d.get(p7);
                if (q2 != null) {
                    if (q2.f9334a.containsKey(serviceConnection)) {
                        q2.f9334a.remove(serviceConnection);
                        if (q2.f9334a.isEmpty()) {
                            this.f.sendMessageDelayed(this.f.obtainMessage(0, p7), this.f9343h);
                        }
                    } else {
                        String p8 = p7.toString();
                        throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + p8);
                    }
                } else {
                    String p9 = p7.toString();
                    throw new IllegalStateException("Nonexistent connection status for service config: " + p9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0764m
    public final boolean d(P p7, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean z7;
        synchronized (this.f9340d) {
            try {
                Q q2 = (Q) this.f9340d.get(p7);
                if (executor == null) {
                    executor = null;
                }
                if (q2 == null) {
                    q2 = new Q(this, p7);
                    q2.f9334a.put(serviceConnection, serviceConnection);
                    q2.a(str, executor);
                    this.f9340d.put(p7, q2);
                } else {
                    this.f.removeMessages(0, p7);
                    if (!q2.f9334a.containsKey(serviceConnection)) {
                        q2.f9334a.put(serviceConnection, serviceConnection);
                        int i7 = q2.f9335b;
                        if (i7 != 1) {
                            if (i7 == 2) {
                                q2.a(str, executor);
                            }
                        } else {
                            serviceConnection.onServiceConnected(q2.f, q2.f9337d);
                        }
                    } else {
                        String p8 = p7.toString();
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + p8);
                    }
                }
                z7 = q2.f9336c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }
}
