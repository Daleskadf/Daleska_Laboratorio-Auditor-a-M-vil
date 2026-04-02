package w;

import D.z0;
/* loaded from: classes.dex */
public final class h0 implements z0 {

    /* renamed from: a  reason: collision with root package name */
    public float f16208a;

    /* renamed from: b  reason: collision with root package name */
    public final float f16209b;

    /* renamed from: c  reason: collision with root package name */
    public final float f16210c;

    /* renamed from: d  reason: collision with root package name */
    public float f16211d;

    public h0(float f, float f4) {
        this.f16209b = f;
        this.f16210c = f4;
    }

    @Override // D.z0
    public final float a() {
        return this.f16209b;
    }

    @Override // D.z0
    public final float b() {
        return this.f16208a;
    }

    @Override // D.z0
    public final float c() {
        return this.f16211d;
    }

    @Override // D.z0
    public final float d() {
        return this.f16210c;
    }

    public final void e(float f) {
        if (f <= 1.0f && f >= 0.0f) {
            this.f16211d = f;
            int i7 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            float f4 = this.f16209b;
            if (i7 != 0) {
                int i8 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                float f8 = this.f16210c;
                if (i8 == 0) {
                    f4 = f8;
                } else {
                    double d7 = 1.0f / f8;
                    double d8 = 1.0d / ((((1.0f / f4) - d7) * f) + d7);
                    double d9 = f8;
                    double d10 = f4;
                    if (d8 < d9) {
                        d8 = d9;
                    } else if (d8 > d10) {
                        d8 = d10;
                    }
                    f4 = (float) d8;
                }
            }
            this.f16208a = f4;
            return;
        }
        throw new IllegalArgumentException("Requested linearZoom " + f + " is not within valid range [0..1]");
    }

    public final void f(float f) {
        float f4 = this.f16209b;
        int i7 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        float f8 = this.f16210c;
        if (i7 <= 0 && f >= f8) {
            this.f16208a = f;
            float f9 = 0.0f;
            if (f4 != f8) {
                if (f == f4) {
                    f9 = 1.0f;
                } else if (f != f8) {
                    float f10 = 1.0f / f8;
                    f9 = ((1.0f / f) - f10) / ((1.0f / f4) - f10);
                }
            }
            this.f16211d = f9;
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + f8 + " , " + f4 + "]");
    }
}
