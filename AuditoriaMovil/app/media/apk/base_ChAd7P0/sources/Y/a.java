package Y;

import android.graphics.Color;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f6547a;

    /* renamed from: b  reason: collision with root package name */
    public final float f6548b;

    /* renamed from: c  reason: collision with root package name */
    public final float f6549c;

    /* renamed from: d  reason: collision with root package name */
    public final float f6550d;

    /* renamed from: e  reason: collision with root package name */
    public final float f6551e;
    public final float f;

    public a(float f, float f4, float f8, float f9, float f10, float f11) {
        this.f6547a = f;
        this.f6548b = f4;
        this.f6549c = f8;
        this.f6550d = f9;
        this.f6551e = f10;
        this.f = f11;
    }

    public static a a(int i7) {
        float f;
        float pow;
        k kVar = k.f6576k;
        float g3 = b.g(Color.red(i7));
        float g4 = b.g(Color.green(i7));
        float g8 = b.g(Color.blue(i7));
        float[][] fArr = b.f6555d;
        float[] fArr2 = fArr[0];
        float f4 = (fArr2[2] * g8) + (fArr2[1] * g4) + (fArr2[0] * g3);
        float[] fArr3 = fArr[1];
        float f8 = (fArr3[2] * g8) + (fArr3[1] * g4) + (fArr3[0] * g3);
        float[] fArr4 = fArr[2];
        float f9 = (g8 * fArr4[2]) + (g4 * fArr4[1]) + (g3 * fArr4[0]);
        float[][] fArr5 = b.f6552a;
        float[] fArr6 = fArr5[0];
        float f10 = (fArr6[2] * f9) + (fArr6[1] * f8) + (fArr6[0] * f4);
        float[] fArr7 = fArr5[1];
        float f11 = fArr7[1] * f8;
        float f12 = fArr7[2] * f9;
        float[] fArr8 = fArr5[2];
        float f13 = f4 * fArr8[0];
        float f14 = f9 * fArr8[2];
        float[] fArr9 = kVar.f6582g;
        float f15 = fArr9[0] * f10;
        float f16 = fArr9[1] * (f12 + f11 + (fArr7[0] * f4));
        float f17 = fArr9[2] * (f14 + (f8 * fArr8[1]) + f13);
        float abs = Math.abs(f15);
        float f18 = kVar.f6583h;
        float pow2 = (float) Math.pow((abs * f18) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f16) * f18) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((Math.abs(f17) * f18) / 100.0d, 0.42d);
        float signum = ((Math.signum(f15) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f16) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f17) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d7 = signum3;
        float f19 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d7)) / 11.0f;
        float f20 = ((float) ((signum + signum2) - (d7 * 2.0d))) / 9.0f;
        float f21 = signum2 * 20.0f;
        float f22 = ((21.0f * signum3) + ((signum * 20.0f) + f21)) / 20.0f;
        float f23 = (((signum * 40.0f) + f21) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f20, f19)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f24 = atan2;
        float f25 = (3.1415927f * f24) / 180.0f;
        float f26 = f23 * kVar.f6578b;
        float f27 = kVar.f6577a;
        float f28 = kVar.f6580d;
        float pow5 = ((float) Math.pow(f26 / f27, kVar.j * f28)) * 100.0f;
        Math.sqrt(pow5 / 100.0f);
        float f29 = f27 + 4.0f;
        if (f24 < 20.14d) {
            f = 360.0f + f24;
        } else {
            f = f24;
        }
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, kVar.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * kVar.f6581e) * kVar.f6579c) * ((float) Math.sqrt((f20 * f20) + (f19 * f19)))) / (f22 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        Math.sqrt((pow * f28) / f29);
        float f30 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((kVar.f6584i * pow6 * 0.0228f) + 1.0f)) * 43.85965f;
        double d8 = f25;
        return new a(f24, pow6, pow5, f30, log * ((float) Math.cos(d8)), log * ((float) Math.sin(d8)));
    }

    public static a b(float f, float f4, float f8) {
        k kVar;
        double d7;
        float f9 = k.f6576k.f6580d;
        Math.sqrt(f / 100.0d);
        Math.sqrt(((f4 / ((float) Math.sqrt(d7))) * kVar.f6580d) / (kVar.f6577a + 4.0f));
        float f10 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((kVar.f6584i * f4 * 0.0228d) + 1.0d)) * 43.85965f;
        double d8 = (3.1415927f * f8) / 180.0f;
        return new a(f8, f4, f, f10, log * ((float) Math.cos(d8)), log * ((float) Math.sin(d8)));
    }

    public final int c(k kVar) {
        float f;
        float[] fArr;
        float f4 = this.f6548b;
        int i7 = (f4 > 0.0d ? 1 : (f4 == 0.0d ? 0 : -1));
        float f8 = this.f6549c;
        if (i7 != 0) {
            double d7 = f8;
            if (d7 != 0.0d) {
                f = f4 / ((float) Math.sqrt(d7 / 100.0d));
                float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, kVar.f), 0.73d), 1.1111111111111112d);
                double d8 = (this.f6547a * 3.1415927f) / 180.0f;
                float pow2 = kVar.f6577a * ((float) Math.pow(f8 / 100.0d, (1.0d / kVar.f6580d) / kVar.j));
                float cos = ((float) (Math.cos(2.0d + d8) + 3.8d)) * 0.25f * 3846.1538f * kVar.f6581e * kVar.f6579c;
                float f9 = pow2 / kVar.f6578b;
                float sin = (float) Math.sin(d8);
                float cos2 = (float) Math.cos(d8);
                float f10 = (((0.305f + f9) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (cos * 23.0f)));
                float f11 = cos2 * f10;
                float f12 = f10 * sin;
                float f13 = f9 * 460.0f;
                float f14 = ((288.0f * f12) + ((451.0f * f11) + f13)) / 1403.0f;
                float f15 = ((f13 - (891.0f * f11)) - (261.0f * f12)) / 1403.0f;
                float f16 = ((f13 - (f11 * 220.0f)) - (f12 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (Math.abs(f14) * 27.13d) / (400.0d - Math.abs(f14)));
                float signum = Math.signum(f14);
                float f17 = 100.0f / kVar.f6583h;
                float pow3 = signum * f17 * ((float) Math.pow(max, 2.380952380952381d));
                float signum2 = Math.signum(f15) * f17 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f15) * 27.13d) / (400.0d - Math.abs(f15))), 2.380952380952381d));
                float[] fArr2 = kVar.f6582g;
                float f18 = pow3 / fArr2[0];
                float f19 = signum2 / fArr2[1];
                float signum3 = ((Math.signum(f16) * f17) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f16) * 27.13d) / (400.0d - Math.abs(f16))), 2.380952380952381d))) / fArr2[2];
                float[][] fArr3 = b.f6553b;
                float[] fArr4 = fArr3[0];
                float f20 = (fArr4[2] * signum3) + (fArr4[1] * f19) + (fArr4[0] * f18);
                float[] fArr5 = fArr3[1];
                float f21 = fArr5[1] * f19;
                float f22 = fArr5[2] * signum3;
                float f23 = f18 * fArr3[2][0];
                return Z.a.a(f20, f22 + f21 + (fArr5[0] * f18), (signum3 * fArr[2]) + (f19 * fArr[1]) + f23);
            }
        }
        f = 0.0f;
        float pow4 = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, kVar.f), 0.73d), 1.1111111111111112d);
        double d82 = (this.f6547a * 3.1415927f) / 180.0f;
        float pow22 = kVar.f6577a * ((float) Math.pow(f8 / 100.0d, (1.0d / kVar.f6580d) / kVar.j));
        float cos3 = ((float) (Math.cos(2.0d + d82) + 3.8d)) * 0.25f * 3846.1538f * kVar.f6581e * kVar.f6579c;
        float f92 = pow22 / kVar.f6578b;
        float sin2 = (float) Math.sin(d82);
        float cos22 = (float) Math.cos(d82);
        float f102 = (((0.305f + f92) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (cos3 * 23.0f)));
        float f112 = cos22 * f102;
        float f122 = f102 * sin2;
        float f132 = f92 * 460.0f;
        float f142 = ((288.0f * f122) + ((451.0f * f112) + f132)) / 1403.0f;
        float f152 = ((f132 - (891.0f * f112)) - (261.0f * f122)) / 1403.0f;
        float f162 = ((f132 - (f112 * 220.0f)) - (f122 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (Math.abs(f142) * 27.13d) / (400.0d - Math.abs(f142)));
        float signum4 = Math.signum(f142);
        float f172 = 100.0f / kVar.f6583h;
        float pow32 = signum4 * f172 * ((float) Math.pow(max2, 2.380952380952381d));
        float signum22 = Math.signum(f152) * f172 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f152) * 27.13d) / (400.0d - Math.abs(f152))), 2.380952380952381d));
        float[] fArr22 = kVar.f6582g;
        float f182 = pow32 / fArr22[0];
        float f192 = signum22 / fArr22[1];
        float signum32 = ((Math.signum(f162) * f172) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f162) * 27.13d) / (400.0d - Math.abs(f162))), 2.380952380952381d))) / fArr22[2];
        float[][] fArr32 = b.f6553b;
        float[] fArr42 = fArr32[0];
        float f202 = (fArr42[2] * signum32) + (fArr42[1] * f192) + (fArr42[0] * f182);
        float[] fArr52 = fArr32[1];
        float f212 = fArr52[1] * f192;
        float f222 = fArr52[2] * signum32;
        float f232 = f182 * fArr32[2][0];
        return Z.a.a(f202, f222 + f212 + (fArr52[0] * f182), (signum32 * fArr[2]) + (f192 * fArr[1]) + f232);
    }
}
