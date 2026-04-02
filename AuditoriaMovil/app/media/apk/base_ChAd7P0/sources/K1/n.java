package k1;

import K0.x;
import X5.C0389o;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.SystemClock;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final k f13651a;

    /* renamed from: b  reason: collision with root package name */
    public final q f13652b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13653c;
    public long f;

    /* renamed from: i  reason: collision with root package name */
    public boolean f13658i;

    /* renamed from: d  reason: collision with root package name */
    public int f13654d = 0;

    /* renamed from: e  reason: collision with root package name */
    public long f13655e = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    public long f13656g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    public long f13657h = -9223372036854775807L;
    public float j = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    public K0.s f13659k = K0.s.f2519a;

    public n(Context context, k kVar) {
        this.f13651a = kVar;
        this.f13652b = new q(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
        if (r10 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010a, code lost:
        if (r13 > org.apache.tika.pipes.PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0115, code lost:
        if (r25 >= r29) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r23, long r25, long r27, long r29, boolean r31, B5.Q r32) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.n.a(long, long, long, long, boolean, B5.Q):int");
    }

    public final void b(boolean z7) {
        this.f13658i = z7;
        this.f13659k.getClass();
        this.f13657h = SystemClock.elapsedRealtime() + 5000;
    }

    public final void c(int i7) {
        this.f13654d = Math.min(this.f13654d, i7);
    }

    public final void d() {
        this.f13653c = true;
        this.f13659k.getClass();
        this.f = x.M(SystemClock.elapsedRealtime());
        q qVar = this.f13652b;
        qVar.f13668d = true;
        qVar.f13675m = 0L;
        qVar.f13678p = -1L;
        qVar.f13676n = -1L;
        C0389o c0389o = qVar.f13666b;
        if (c0389o != null) {
            p pVar = qVar.f13667c;
            pVar.getClass();
            pVar.f13662b.sendEmptyMessage(2);
            Handler n7 = x.n(null);
            DisplayManager displayManager = (DisplayManager) c0389o.f6521b;
            displayManager.registerDisplayListener(c0389o, n7);
            q.a((q) c0389o.f6522c, displayManager.getDisplay(0));
        }
        qVar.d(false);
    }

    public final void e() {
        this.f13653c = false;
        this.f13657h = -9223372036854775807L;
        q qVar = this.f13652b;
        qVar.f13668d = false;
        C0389o c0389o = qVar.f13666b;
        if (c0389o != null) {
            ((DisplayManager) c0389o.f6521b).unregisterDisplayListener(c0389o);
            p pVar = qVar.f13667c;
            pVar.getClass();
            pVar.f13662b.sendEmptyMessage(3);
        }
        qVar.b();
    }

    public final void f(float f) {
        q qVar = this.f13652b;
        qVar.f = f;
        C1390g c1390g = qVar.f13665a;
        c1390g.f13599a.c();
        c1390g.f13600b.c();
        c1390g.f13601c = false;
        c1390g.f13602d = -9223372036854775807L;
        c1390g.f13603e = 0;
        qVar.c();
    }
}
