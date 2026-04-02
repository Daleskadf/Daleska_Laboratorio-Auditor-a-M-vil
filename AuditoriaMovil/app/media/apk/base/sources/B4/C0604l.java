package b4;

import com.google.android.gms.internal.p002firebaseauthapi.zze;
/* renamed from: b4.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0604l {
    public static final Z2.a f = new Z2.a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a  reason: collision with root package name */
    public volatile long f8275a;

    /* renamed from: b  reason: collision with root package name */
    public volatile long f8276b;

    /* renamed from: c  reason: collision with root package name */
    public long f8277c;

    /* renamed from: d  reason: collision with root package name */
    public zze f8278d;

    /* renamed from: e  reason: collision with root package name */
    public H.h f8279e;

    public final void a() {
        f.e(io.flutter.plugins.pathprovider.b.g("Scheduling refresh for ", this.f8275a - this.f8277c), new Object[0]);
        this.f8278d.removeCallbacks(this.f8279e);
        this.f8276b = Math.max((this.f8275a - System.currentTimeMillis()) - this.f8277c, 0L) / 1000;
        this.f8278d.postDelayed(this.f8279e, this.f8276b * 1000);
    }
}
