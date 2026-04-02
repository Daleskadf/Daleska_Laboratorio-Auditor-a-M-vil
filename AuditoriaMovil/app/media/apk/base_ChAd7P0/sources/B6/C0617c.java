package b6;

import H.h;
import Q0.A;
import a6.AbstractC0479h;
import a6.C0476e;
import a6.EnumC0486o;
import a6.U;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import t4.q;
/* renamed from: b6.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0617c extends U {

    /* renamed from: d  reason: collision with root package name */
    public final U f8313d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f8314e;
    public final ConnectivityManager f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f8315g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public Runnable f8316h;

    public C0617c(U u7, Context context) {
        this.f8313d = u7;
        this.f8314e = context;
        if (context != null) {
            this.f = (ConnectivityManager) context.getSystemService("connectivity");
            try {
                y();
                return;
            } catch (SecurityException e7) {
                Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e7);
                return;
            }
        }
        this.f = null;
    }

    @Override // a6.AbstractC0478g
    public final AbstractC0479h n(A a7, C0476e c0476e) {
        return this.f8313d.n(a7, c0476e);
    }

    @Override // a6.U
    public final boolean s(long j, TimeUnit timeUnit) {
        return this.f8313d.s(j, timeUnit);
    }

    @Override // a6.U
    public final void t() {
        this.f8313d.t();
    }

    @Override // a6.U
    public final EnumC0486o u() {
        return this.f8313d.u();
    }

    @Override // a6.U
    public final void v(EnumC0486o enumC0486o, q qVar) {
        this.f8313d.v(enumC0486o, qVar);
    }

    @Override // a6.U
    public final U w() {
        synchronized (this.f8315g) {
            try {
                Runnable runnable = this.f8316h;
                if (runnable != null) {
                    runnable.run();
                    this.f8316h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f8313d.w();
    }

    @Override // a6.U
    public final U x() {
        synchronized (this.f8315g) {
            try {
                Runnable runnable = this.f8316h;
                if (runnable != null) {
                    runnable.run();
                    this.f8316h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f8313d.x();
    }

    public final void y() {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT >= 24 && (connectivityManager = this.f) != null) {
            C0615a c0615a = new C0615a(this, 0);
            connectivityManager.registerDefaultNetworkCallback(c0615a);
            this.f8316h = new h(this, c0615a, 11, false);
            return;
        }
        C0616b c0616b = new C0616b(this, 0);
        this.f8314e.registerReceiver(c0616b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f8316h = new h(this, c0616b, 12, false);
    }
}
