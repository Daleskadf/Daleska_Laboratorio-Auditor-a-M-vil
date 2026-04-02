package Y;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: k  reason: collision with root package name */
    public static final k f6576k;

    /* renamed from: a  reason: collision with root package name */
    public final float f6577a;

    /* renamed from: b  reason: collision with root package name */
    public final float f6578b;

    /* renamed from: c  reason: collision with root package name */
    public final float f6579c;

    /* renamed from: d  reason: collision with root package name */
    public final float f6580d;

    /* renamed from: e  reason: collision with root package name */
    public final float f6581e;
    public final float f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f6582g;

    /* renamed from: h  reason: collision with root package name */
    public final float f6583h;

    /* renamed from: i  reason: collision with root package name */
    public final float f6584i;
    public final float j;

    static {
        float f;
        float[] fArr = b.f6554c;
        float l8 = (float) ((b.l() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f6552a;
        float f4 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f8 = fArr[1];
        float f9 = (fArr3[1] * f8) + (fArr3[0] * f4);
        float f10 = fArr[2];
        float f11 = (fArr3[2] * f10) + f9;
        float[] fArr4 = fArr2[1];
        float f12 = (fArr4[2] * f10) + (fArr4[1] * f8) + (fArr4[0] * f4);
        float[] fArr5 = fArr2[2];
        float f13 = (f10 * fArr5[2]) + (f8 * fArr5[1]) + (f4 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f = 0.69f;
        } else {
            f = 0.655f;
        }
        float f14 = f;
        float exp = (1.0f - (((float) Math.exp(((-l8) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d7 = exp;
        if (d7 > 1.0d) {
            exp = 1.0f;
        } else if (d7 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f11) * exp) + 1.0f) - exp, (((100.0f / f12) * exp) + 1.0f) - exp, (((100.0f / f13) * exp) + 1.0f) - exp};
        float f15 = 1.0f / ((5.0f * l8) + 1.0f);
        float f16 = f15 * f15 * f15 * f15;
        float f17 = 1.0f - f16;
        float cbrt = (0.1f * f17 * f17 * ((float) Math.cbrt(l8 * 5.0d))) + (f16 * l8);
        float l9 = b.l() / fArr[1];
        double d8 = l9;
        float sqrt = ((float) Math.sqrt(d8)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d8, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f11) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f12) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f13) / 100.0d, 0.42d)};
        float f18 = fArr7[0];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr7[1];
        float f21 = (f20 * 400.0f) / (f20 + 27.13f);
        float f22 = fArr7[2];
        float[] fArr8 = {f19, f21, (400.0f * f22) / (f22 + 27.13f)};
        f6576k = new k(l9, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, f14, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public k(float f, float f4, float f8, float f9, float f10, float f11, float[] fArr, float f12, float f13, float f14) {
        this.f = f;
        this.f6577a = f4;
        this.f6578b = f8;
        this.f6579c = f9;
        this.f6580d = f10;
        this.f6581e = f11;
        this.f6582g = fArr;
        this.f6583h = f12;
        this.f6584i = f13;
        this.j = f14;
    }
}
