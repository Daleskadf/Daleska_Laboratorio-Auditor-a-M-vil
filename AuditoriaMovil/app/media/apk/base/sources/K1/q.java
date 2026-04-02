package k1;

import K0.x;
import X5.C0389o;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final C1390g f13665a;

    /* renamed from: b  reason: collision with root package name */
    public final C0389o f13666b;

    /* renamed from: c  reason: collision with root package name */
    public final p f13667c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13668d;

    /* renamed from: e  reason: collision with root package name */
    public Surface f13669e;
    public float f;

    /* renamed from: g  reason: collision with root package name */
    public float f13670g;

    /* renamed from: h  reason: collision with root package name */
    public float f13671h;

    /* renamed from: i  reason: collision with root package name */
    public float f13672i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public long f13673k;

    /* renamed from: l  reason: collision with root package name */
    public long f13674l;

    /* renamed from: m  reason: collision with root package name */
    public long f13675m;

    /* renamed from: n  reason: collision with root package name */
    public long f13676n;

    /* renamed from: o  reason: collision with root package name */
    public long f13677o;

    /* renamed from: p  reason: collision with root package name */
    public long f13678p;

    /* renamed from: q  reason: collision with root package name */
    public long f13679q;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k1.g] */
    public q(Context context) {
        DisplayManager displayManager;
        C0389o c0389o;
        ?? obj = new Object();
        obj.f13599a = new C1389f();
        obj.f13600b = new C1389f();
        obj.f13602d = -9223372036854775807L;
        this.f13665a = obj;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            c0389o = null;
        } else {
            c0389o = new C0389o(2, this, displayManager);
        }
        this.f13666b = c0389o;
        this.f13667c = c0389o != null ? p.f13660e : null;
        this.f13673k = -9223372036854775807L;
        this.f13674l = -9223372036854775807L;
        this.f = -1.0f;
        this.f13672i = 1.0f;
        this.j = 0;
    }

    public static void a(q qVar, Display display) {
        qVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            qVar.f13673k = refreshRate;
            qVar.f13674l = (refreshRate * 80) / 100;
            return;
        }
        K0.a.A("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        qVar.f13673k = -9223372036854775807L;
        qVar.f13674l = -9223372036854775807L;
    }

    public final void b() {
        Surface surface;
        if (x.f2529a >= 30 && (surface = this.f13669e) != null && this.j != Integer.MIN_VALUE && this.f13671h != 0.0f) {
            this.f13671h = 0.0f;
            o.a(surface, 0.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r9 = this;
            int r0 = K0.x.f2529a
            r1 = 30
            if (r0 < r1) goto L8d
            android.view.Surface r0 = r9.f13669e
            if (r0 != 0) goto Lc
            goto L8d
        Lc:
            k1.g r0 = r9.f13665a
            k1.f r2 = r0.f13599a
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L39
            k1.f r2 = r0.f13599a
            boolean r2 = r2.a()
            if (r2 == 0) goto L37
            k1.f r2 = r0.f13599a
            long r4 = r2.f13596e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2b
            goto L2e
        L2b:
            long r6 = r2.f
            long r6 = r6 / r4
        L2e:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L3b
        L37:
            r2 = r3
            goto L3b
        L39:
            float r2 = r9.f
        L3b:
            float r4 = r9.f13670g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L42
            return
        L42:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L80
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L80
            k1.f r1 = r0.f13599a
            boolean r1 = r1.a()
            if (r1 == 0) goto L71
            k1.f r1 = r0.f13599a
            boolean r1 = r1.a()
            if (r1 == 0) goto L5f
            k1.f r0 = r0.f13599a
            long r0 = r0.f
            goto L64
        L5f:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L64:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L71
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L73
        L71:
            r0 = 1065353216(0x3f800000, float:1.0)
        L73:
            float r1 = r9.f13670g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L8d
            goto L87
        L80:
            if (r5 == 0) goto L83
            goto L87
        L83:
            int r0 = r0.f13603e
            if (r0 < r1) goto L8d
        L87:
            r9.f13670g = r2
            r0 = 0
            r9.d(r0)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.q.c():void");
    }

    public final void d(boolean z7) {
        Surface surface;
        float f;
        if (x.f2529a >= 30 && (surface = this.f13669e) != null && this.j != Integer.MIN_VALUE) {
            if (this.f13668d) {
                float f4 = this.f13670g;
                if (f4 != -1.0f) {
                    f = f4 * this.f13672i;
                    if (z7 && this.f13671h == f) {
                        return;
                    }
                    this.f13671h = f;
                    o.a(surface, f);
                }
            }
            f = 0.0f;
            if (z7) {
            }
            this.f13671h = f;
            o.a(surface, f);
        }
    }
}
