package d2;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: p  reason: collision with root package name */
    public static final Matrix f10264p = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    public final Path f10265a;

    /* renamed from: b  reason: collision with root package name */
    public final Path f10266b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f10267c;

    /* renamed from: d  reason: collision with root package name */
    public Paint f10268d;

    /* renamed from: e  reason: collision with root package name */
    public Paint f10269e;
    public PathMeasure f;

    /* renamed from: g  reason: collision with root package name */
    public final k f10270g;

    /* renamed from: h  reason: collision with root package name */
    public float f10271h;

    /* renamed from: i  reason: collision with root package name */
    public float f10272i;
    public float j;

    /* renamed from: k  reason: collision with root package name */
    public float f10273k;

    /* renamed from: l  reason: collision with root package name */
    public int f10274l;

    /* renamed from: m  reason: collision with root package name */
    public String f10275m;

    /* renamed from: n  reason: collision with root package name */
    public Boolean f10276n;

    /* renamed from: o  reason: collision with root package name */
    public final S.f f10277o;

    /* JADX WARN: Type inference failed for: r0v4, types: [S.k, S.f] */
    public n() {
        this.f10267c = new Matrix();
        this.f10271h = 0.0f;
        this.f10272i = 0.0f;
        this.j = 0.0f;
        this.f10273k = 0.0f;
        this.f10274l = 255;
        this.f10275m = null;
        this.f10276n = null;
        this.f10277o = new S.k(0);
        this.f10270g = new k();
        this.f10265a = new Path();
        this.f10266b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e6, code lost:
        if (r0.j != 1.0f) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(d2.k r19, android.graphics.Matrix r20, android.graphics.Canvas r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.n.a(d2.k, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f10274l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i7) {
        this.f10274l = i7;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [S.k, S.f] */
    public n(n nVar) {
        this.f10267c = new Matrix();
        this.f10271h = 0.0f;
        this.f10272i = 0.0f;
        this.j = 0.0f;
        this.f10273k = 0.0f;
        this.f10274l = 255;
        this.f10275m = null;
        this.f10276n = null;
        ?? kVar = new S.k(0);
        this.f10277o = kVar;
        this.f10270g = new k(nVar.f10270g, kVar);
        this.f10265a = new Path(nVar.f10265a);
        this.f10266b = new Path(nVar.f10266b);
        this.f10271h = nVar.f10271h;
        this.f10272i = nVar.f10272i;
        this.j = nVar.j;
        this.f10273k = nVar.f10273k;
        this.f10274l = nVar.f10274l;
        this.f10275m = nVar.f10275m;
        String str = nVar.f10275m;
        if (str != null) {
            kVar.put(str, this);
        }
        this.f10276n = nVar.f10276n;
    }
}
