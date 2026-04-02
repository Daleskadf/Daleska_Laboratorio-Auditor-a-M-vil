package d2;

import A3.N;
import android.graphics.Paint;
/* loaded from: classes.dex */
public final class j extends m {

    /* renamed from: d  reason: collision with root package name */
    public N f10243d;

    /* renamed from: e  reason: collision with root package name */
    public float f10244e;
    public N f;

    /* renamed from: g  reason: collision with root package name */
    public float f10245g;

    /* renamed from: h  reason: collision with root package name */
    public float f10246h;

    /* renamed from: i  reason: collision with root package name */
    public float f10247i;
    public float j;

    /* renamed from: k  reason: collision with root package name */
    public float f10248k;

    /* renamed from: l  reason: collision with root package name */
    public Paint.Cap f10249l;

    /* renamed from: m  reason: collision with root package name */
    public Paint.Join f10250m;

    /* renamed from: n  reason: collision with root package name */
    public float f10251n;

    @Override // d2.l
    public final boolean a() {
        if (!this.f.i() && !this.f10243d.i()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    @Override // d2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            A3.N r0 = r6.f
            boolean r1 = r0.i()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f106d
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f104b
            if (r1 == r4) goto L1e
            r0.f104b = r1
            r0 = r3
            goto L1f
        L1e:
            r0 = r2
        L1f:
            A3.N r1 = r6.f10243d
            boolean r4 = r1.i()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f106d
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f104b
            if (r7 == r4) goto L3a
            r1.f104b = r7
            r2 = r3
        L3a:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.j.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f10246h;
    }

    public int getFillColor() {
        return this.f.f104b;
    }

    public float getStrokeAlpha() {
        return this.f10245g;
    }

    public int getStrokeColor() {
        return this.f10243d.f104b;
    }

    public float getStrokeWidth() {
        return this.f10244e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.f10248k;
    }

    public float getTrimPathStart() {
        return this.f10247i;
    }

    public void setFillAlpha(float f) {
        this.f10246h = f;
    }

    public void setFillColor(int i7) {
        this.f.f104b = i7;
    }

    public void setStrokeAlpha(float f) {
        this.f10245g = f;
    }

    public void setStrokeColor(int i7) {
        this.f10243d.f104b = i7;
    }

    public void setStrokeWidth(float f) {
        this.f10244e = f;
    }

    public void setTrimPathEnd(float f) {
        this.j = f;
    }

    public void setTrimPathOffset(float f) {
        this.f10248k = f;
    }

    public void setTrimPathStart(float f) {
        this.f10247i = f;
    }
}
