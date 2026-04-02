package k0;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import p.V;
/* renamed from: k0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnTouchListenerC1378e implements View.OnTouchListener {

    /* renamed from: m0  reason: collision with root package name */
    public static final int f13547m0 = ViewConfiguration.getTapTimeout();

    /* renamed from: X  reason: collision with root package name */
    public final int f13548X;

    /* renamed from: Y  reason: collision with root package name */
    public final int f13549Y;

    /* renamed from: Z  reason: collision with root package name */
    public final float[] f13550Z;

    /* renamed from: a  reason: collision with root package name */
    public final C1374a f13551a;

    /* renamed from: b  reason: collision with root package name */
    public final AccelerateInterpolator f13552b;

    /* renamed from: c  reason: collision with root package name */
    public final ListView f13553c;

    /* renamed from: d  reason: collision with root package name */
    public RunnableC1375b f13554d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f13555e;

    /* renamed from: e0  reason: collision with root package name */
    public final float[] f13556e0;
    public final float[] f;

    /* renamed from: f0  reason: collision with root package name */
    public final float[] f13557f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f13558g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f13559h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f13560i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f13561j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f13562k0;

    /* renamed from: l0  reason: collision with root package name */
    public final V f13563l0;

    /* JADX WARN: Type inference failed for: r1v0, types: [k0.a, java.lang.Object] */
    public View$OnTouchListenerC1378e(V v6) {
        ?? obj = new Object();
        obj.f13541e = Long.MIN_VALUE;
        obj.f13542g = -1L;
        obj.f = 0L;
        this.f13551a = obj;
        this.f13552b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f13555e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f13550Z = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f13556e0 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f13557f0 = fArr5;
        this.f13553c = v6;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f4 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f4;
        fArr5[1] = f4;
        float f8 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f8;
        fArr4[1] = f8;
        this.f13548X = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f13549Y = f13547m0;
        obj.f13537a = 500;
        obj.f13538b = 500;
        this.f13563l0 = v6;
    }

    public static float b(float f, float f4, float f8) {
        if (f > f8) {
            return f8;
        }
        if (f < f4) {
            return f4;
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f13555e
            r0 = r0[r4]
            float[] r1 = r3.f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f13552b
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f13550Z
            r0 = r0[r4]
            float[] r1 = r3.f13556e0
            r1 = r1[r4]
            float[] r2 = r3.f13557f0
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.View$OnTouchListenerC1378e.a(int, float, float, float):float");
    }

    public final float c(float f, float f4) {
        if (f4 == 0.0f) {
            return 0.0f;
        }
        int i7 = this.f13548X;
        if (i7 != 0 && i7 != 1) {
            if (i7 == 2 && f < 0.0f) {
                return f / (-f4);
            }
        } else if (f < f4) {
            if (f >= 0.0f) {
                return 1.0f - (f / f4);
            }
            if (this.f13561j0 && i7 == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i7 = 0;
        if (this.f13559h0) {
            this.f13561j0 = false;
            return;
        }
        C1374a c1374a = this.f13551a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i8 = (int) (currentAnimationTimeMillis - c1374a.f13541e);
        int i9 = c1374a.f13538b;
        if (i8 > i9) {
            i7 = i9;
        } else if (i8 >= 0) {
            i7 = i8;
        }
        c1374a.f13544i = i7;
        c1374a.f13543h = c1374a.a(currentAnimationTimeMillis);
        c1374a.f13542g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        V v6;
        int count;
        C1374a c1374a = this.f13551a;
        float f = c1374a.f13540d;
        int abs = (int) (f / Math.abs(f));
        Math.abs(c1374a.f13539c);
        if (abs == 0 || (count = (v6 = this.f13563l0).getCount()) == 0) {
            return false;
        }
        int childCount = v6.getChildCount();
        int firstVisiblePosition = v6.getFirstVisiblePosition();
        int i7 = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i7 >= count && v6.getChildAt(childCount - 1).getBottom() <= v6.getHeight()) {
                return false;
            }
        } else if (abs >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && v6.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f13562k0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7b
        L16:
            r7.d()
            goto L7b
        L1a:
            r7.f13560i0 = r2
            r7.f13558g0 = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.f13553c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            k0.a r9 = r7.f13551a
            r9.f13539c = r0
            r9.f13540d = r8
            boolean r8 = r7.f13561j0
            if (r8 != 0) goto L7b
            boolean r8 = r7.e()
            if (r8 == 0) goto L7b
            k0.b r8 = r7.f13554d
            if (r8 != 0) goto L5f
            k0.b r8 = new k0.b
            r8.<init>(r7, r1)
            r7.f13554d = r8
        L5f:
            r7.f13561j0 = r2
            r7.f13559h0 = r2
            boolean r8 = r7.f13558g0
            if (r8 != 0) goto L74
            int r8 = r7.f13549Y
            if (r8 <= 0) goto L74
            k0.b r9 = r7.f13554d
            long r5 = (long) r8
            java.lang.reflect.Field r8 = h0.AbstractC1066z.f11214a
            r4.postOnAnimationDelayed(r9, r5)
            goto L79
        L74:
            k0.b r8 = r7.f13554d
            r8.run()
        L79:
            r7.f13558g0 = r2
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.View$OnTouchListenerC1378e.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
