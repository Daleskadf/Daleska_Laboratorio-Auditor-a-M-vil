package b4;

import android.app.Application;
import android.content.Context;
import android.os.HandlerThread;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C0730d;
import com.google.android.gms.internal.p002firebaseauthapi.zze;
/* renamed from: b4.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0591E {

    /* renamed from: a  reason: collision with root package name */
    public volatile int f8186a;

    /* renamed from: b  reason: collision with root package name */
    public final C0604l f8187b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f8188c;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, b4.l] */
    public C0591E(U3.h hVar) {
        hVar.a();
        Context context = hVar.f5749a;
        ?? obj = new Object();
        C0604l.f.e("Initializing TokenRefresher", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        obj.f8278d = new zze(handlerThread.getLooper());
        hVar.a();
        obj.f8279e = new H.h(obj, hVar.f5750b);
        obj.f8277c = 300000L;
        this.f8188c = false;
        this.f8186a = 0;
        this.f8187b = obj;
        ComponentCallbacks2C0730d.b((Application) context.getApplicationContext());
        ComponentCallbacks2C0730d.f9232e.a(new C0590D(this));
    }

    public final void a(int i7) {
        if (i7 > 0 && this.f8186a == 0) {
            this.f8186a = i7;
            if (this.f8186a > 0 && !this.f8188c) {
                this.f8187b.a();
            }
        } else if (i7 == 0 && this.f8186a != 0) {
            C0604l c0604l = this.f8187b;
            c0604l.f8278d.removeCallbacks(c0604l.f8279e);
        }
        this.f8186a = i7;
    }
}
