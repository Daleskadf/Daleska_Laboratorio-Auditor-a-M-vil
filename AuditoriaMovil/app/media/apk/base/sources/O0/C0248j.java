package O0;

import java.util.HashMap;
/* renamed from: O0.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0248j {

    /* renamed from: a  reason: collision with root package name */
    public final i1.e f3770a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3771b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3772c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3773d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3774e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final long f3775g;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f3776h;

    /* renamed from: i  reason: collision with root package name */
    public long f3777i;

    public C0248j() {
        i1.e eVar = new i1.e();
        a("bufferForPlaybackMs", 2500, 0, "0");
        a("bufferForPlaybackAfterRebufferMs", 5000, 0, "0");
        a("minBufferMs", 50000, 2500, "bufferForPlaybackMs");
        a("minBufferMs", 50000, 5000, "bufferForPlaybackAfterRebufferMs");
        a("maxBufferMs", 50000, 50000, "minBufferMs");
        a("backBufferDurationMs", 0, 0, "0");
        this.f3770a = eVar;
        long j = 50000;
        this.f3771b = K0.x.M(j);
        this.f3772c = K0.x.M(j);
        this.f3773d = K0.x.M(2500);
        this.f3774e = K0.x.M(5000);
        this.f = -1;
        this.f3775g = K0.x.M(0);
        this.f3776h = new HashMap();
        this.f3777i = -1L;
    }

    public static void a(String str, int i7, int i8, String str2) {
        boolean z7;
        if (i7 >= i8) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.d(str + " cannot be less than " + str2, z7);
    }

    public final int b() {
        int i7 = 0;
        for (C0247i c0247i : this.f3776h.values()) {
            i7 += c0247i.f3767b;
        }
        return i7;
    }

    public final boolean c(O o7) {
        int i7;
        boolean z7;
        C0247i c0247i = (C0247i) this.f3776h.get(o7.f3604a);
        c0247i.getClass();
        i1.e eVar = this.f3770a;
        synchronized (eVar) {
            i7 = eVar.f11393d * eVar.f11391b;
        }
        if (i7 >= b()) {
            z7 = true;
        } else {
            z7 = false;
        }
        float f = o7.f3606c;
        int i8 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        long j = this.f3772c;
        long j8 = this.f3771b;
        if (i8 > 0) {
            j8 = Math.min(K0.x.y(j8, f), j);
        }
        long max = Math.max(j8, 500000L);
        long j9 = o7.f3605b;
        if (j9 < max) {
            c0247i.f3766a = !z7;
            if (z7 && j9 < 500000) {
                K0.a.A("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j9 >= j || z7) {
            c0247i.f3766a = false;
        }
        return c0247i.f3766a;
    }

    public final void d() {
        if (this.f3776h.isEmpty()) {
            i1.e eVar = this.f3770a;
            synchronized (eVar) {
                if (eVar.f11390a) {
                    eVar.a(0);
                }
            }
            return;
        }
        this.f3770a.a(b());
    }
}
