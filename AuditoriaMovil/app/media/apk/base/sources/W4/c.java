package W4;

import A3.N;
import S.h;
import android.graphics.Bitmap;
import android.graphics.Color;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import s3.InterfaceC1768C;
import s3.z;
/* loaded from: classes.dex */
public final class c implements InterfaceC1768C {

    /* renamed from: f0  reason: collision with root package name */
    public static final N f6209f0 = new N(new int[]{Color.rgb(102, 225, 0), Color.rgb(255, 0, 0)}, new float[]{0.2f, 1.0f}, (int) PipesIterator.DEFAULT_QUEUE_SIZE);

    /* renamed from: X  reason: collision with root package name */
    public double[] f6210X;

    /* renamed from: Y  reason: collision with root package name */
    public double f6211Y;

    /* renamed from: Z  reason: collision with root package name */
    public double[] f6212Z;

    /* renamed from: a  reason: collision with root package name */
    public Y4.b f6213a;

    /* renamed from: b  reason: collision with root package name */
    public List f6214b;

    /* renamed from: c  reason: collision with root package name */
    public V4.a f6215c;

    /* renamed from: d  reason: collision with root package name */
    public int f6216d;

    /* renamed from: e  reason: collision with root package name */
    public N f6217e;

    /* renamed from: e0  reason: collision with root package name */
    public double f6218e0;
    public int[] f;

    public static double[] a(int i7, double d7) {
        double[] dArr = new double[(i7 * 2) + 1];
        for (int i8 = -i7; i8 <= i7; i8++) {
            dArr[i8 + i7] = Math.exp(((-i8) * i8) / ((2.0d * d7) * d7));
        }
        return dArr;
    }

    public final double[] b(int i7) {
        int i8;
        c cVar = this;
        int i9 = 22;
        double[] dArr = new double[22];
        double d7 = 0.0d;
        if (cVar.f6218e0 != 0.0d) {
            for (int i10 = 0; i10 < 22; i10++) {
                dArr[i10] = cVar.f6218e0;
            }
            return dArr;
        }
        int i11 = 5;
        while (true) {
            if (i11 >= 11) {
                break;
            }
            List<d> list = cVar.f6214b;
            V4.a aVar = cVar.f6215c;
            int pow = (int) (Math.pow(2.0d, i11 - 3) * 1280.0d);
            double d8 = aVar.f5969a;
            double d9 = aVar.f5971c - d8;
            double d10 = aVar.f5972d;
            double[] dArr2 = dArr;
            double d11 = aVar.f5970b;
            double d12 = d10 - d11;
            if (d9 <= d12) {
                d9 = d12;
            }
            double d13 = ((int) ((pow / (i7 * 2)) + 0.5d)) / d9;
            h hVar = new h();
            double d14 = d7;
            for (d dVar : list) {
                X4.a aVar2 = dVar.f6219a;
                double d15 = d8;
                int i12 = (int) ((aVar2.f6399b - d11) * d13);
                long j = (int) ((aVar2.f6398a - d8) * d13);
                h hVar2 = (h) hVar.c(j);
                if (hVar2 == null) {
                    hVar2 = new h();
                    hVar.e(hVar2, j);
                }
                long j8 = i12;
                Double d16 = (Double) hVar2.c(j8);
                if (d16 == null) {
                    d16 = Double.valueOf(0.0d);
                }
                double d17 = d11;
                double doubleValue = d16.doubleValue() + dVar.f6220b;
                hVar2.e(Double.valueOf(doubleValue), j8);
                if (doubleValue > d14) {
                    d14 = doubleValue;
                }
                d7 = 0.0d;
                d8 = d15;
                d11 = d17;
            }
            double d18 = d7;
            dArr2[i11] = d14;
            if (i11 == 5) {
                for (int i13 = 0; i13 < i11; i13++) {
                    dArr2[i13] = dArr2[i11];
                }
            }
            i11++;
            cVar = this;
            dArr = dArr2;
            d7 = d18;
            i9 = 22;
        }
        double[] dArr3 = dArr;
        int i14 = i9;
        for (i8 = 11; i8 < i14; i8++) {
            dArr3[i8] = dArr3[10];
        }
        return dArr3;
    }

    public final void c(N n7) {
        this.f6217e = n7;
        double d7 = this.f6211Y;
        n7.getClass();
        HashMap hashMap = new HashMap();
        float[] fArr = (float[]) n7.f106d;
        int i7 = (fArr[0] > 0.0f ? 1 : (fArr[0] == 0.0f ? 0 : -1));
        int[] iArr = (int[]) n7.f105c;
        int i8 = n7.f104b;
        if (i7 != 0) {
            hashMap.put(0, new a(i8 * fArr[0], Color.argb(0, Color.red(iArr[0]), Color.green(iArr[0]), Color.blue(iArr[0])), iArr[0]));
        }
        for (int i9 = 1; i9 < iArr.length; i9++) {
            float f = i8;
            int i10 = i9 - 1;
            hashMap.put(Integer.valueOf((int) (fArr[i10] * f)), new a(f * (fArr[i9] - fArr[i10]), iArr[i10], iArr[i9]));
        }
        if (fArr[fArr.length - 1] != 1.0f) {
            int length = fArr.length - 1;
            float f4 = i8;
            Integer valueOf = Integer.valueOf((int) (fArr[length] * f4));
            int i11 = iArr[length];
            hashMap.put(valueOf, new a((1.0f - fArr[length]) * f4, i11, i11));
        }
        int[] iArr2 = new int[i8];
        a aVar = (a) hashMap.get(0);
        int i12 = 0;
        for (int i13 = 0; i13 < i8; i13++) {
            if (hashMap.containsKey(Integer.valueOf(i13))) {
                aVar = (a) hashMap.get(Integer.valueOf(i13));
                i12 = i13;
            }
            float f8 = (i13 - i12) / aVar.f6203c;
            int i14 = aVar.f6202b;
            int alpha = Color.alpha(i14);
            int i15 = aVar.f6201a;
            int alpha2 = (int) (((alpha - Color.alpha(i15)) * f8) + Color.alpha(i15));
            float[] fArr2 = new float[3];
            Color.RGBToHSV(Color.red(i15), Color.green(i15), Color.blue(i15), fArr2);
            float[] fArr3 = new float[3];
            Color.RGBToHSV(Color.red(i14), Color.green(i14), Color.blue(i14), fArr3);
            float f9 = fArr2[0];
            float f10 = fArr3[0];
            if (f9 - f10 > 180.0f) {
                fArr3[0] = f10 + 360.0f;
            } else if (f10 - f9 > 180.0f) {
                fArr2[0] = f9 + 360.0f;
            }
            float[] fArr4 = new float[3];
            for (int i16 = 0; i16 < 3; i16++) {
                float f11 = fArr3[i16];
                float f12 = fArr2[i16];
                fArr4[i16] = ((f11 - f12) * f8) + f12;
            }
            iArr2[i13] = Color.HSVToColor(alpha2, fArr4);
        }
        if (d7 != 1.0d) {
            for (int i17 = 0; i17 < i8; i17++) {
                int i18 = iArr2[i17];
                iArr2[i17] = Color.argb((int) (Color.alpha(i18) * d7), Color.red(i18), Color.green(i18), Color.blue(i18));
            }
        }
        this.f = iArr2;
    }

    public final void d(List list) {
        this.f6214b = list;
        if (!list.isEmpty()) {
            Iterator it = this.f6214b.iterator();
            X4.a aVar = ((d) it.next()).f6219a;
            double d7 = aVar.f6398a;
            double d8 = d7;
            double d9 = aVar.f6399b;
            double d10 = d9;
            while (it.hasNext()) {
                X4.a aVar2 = ((d) it.next()).f6219a;
                double d11 = aVar2.f6398a;
                if (d11 < d7) {
                    d7 = d11;
                }
                if (d11 > d8) {
                    d8 = d11;
                }
                double d12 = aVar2.f6399b;
                if (d12 < d9) {
                    d9 = d12;
                }
                if (d12 > d10) {
                    d10 = d12;
                }
            }
            V4.a aVar3 = new V4.a(d7, d8, d9, d10);
            this.f6215c = aVar3;
            this.f6213a = new Y4.b(aVar3, 0);
            for (d dVar : this.f6214b) {
                Y4.b bVar = this.f6213a;
                bVar.getClass();
                X4.a b5 = dVar.b();
                if (bVar.f6703a.a(b5.f6398a, b5.f6399b)) {
                    bVar.a(b5.f6398a, b5.f6399b, dVar);
                }
            }
            this.f6212Z = b(this.f6216d);
            return;
        }
        throw new IllegalArgumentException("No input points.");
    }

    @Override // s3.InterfaceC1768C
    public final z z(int i7, int i8, int i9) {
        int i10;
        double d7;
        boolean z7;
        int i11;
        int i12;
        double pow = 1.0d / Math.pow(2.0d, i9);
        double d8 = (this.f6216d * pow) / 512.0d;
        int i13 = 2;
        double d9 = ((d8 * 2.0d) + pow) / ((i10 * 2) + RecognitionOptions.UPC_A);
        double d10 = (i7 * pow) - d8;
        double d11 = ((i7 + 1) * pow) + d8;
        double d12 = (i8 * pow) - d8;
        double d13 = ((i8 + 1) * pow) + d8;
        ArrayList arrayList = new ArrayList();
        if (d10 < 0.0d) {
            V4.a aVar = new V4.a(d10 + 1.0d, 1.0d, d12, d13);
            Y4.b bVar = this.f6213a;
            bVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            bVar.c(aVar, arrayList2);
            d7 = -1.0d;
            arrayList = arrayList2;
        } else if (d11 > 1.0d) {
            V4.a aVar2 = new V4.a(0.0d, d11 - 1.0d, d12, d13);
            Y4.b bVar2 = this.f6213a;
            bVar2.getClass();
            ArrayList arrayList3 = new ArrayList();
            bVar2.c(aVar2, arrayList3);
            arrayList = arrayList3;
            d7 = 1.0d;
        } else {
            d7 = 0.0d;
        }
        V4.a aVar3 = new V4.a(d10, d11, d12, d13);
        V4.a aVar4 = this.f6215c;
        ArrayList<d> arrayList4 = arrayList;
        double d14 = aVar4.f5971c + d8;
        double d15 = aVar4.f5970b - d8;
        double d16 = aVar4.f5972d + d8;
        int i14 = 0;
        if (aVar4.f5969a - d8 < d11 && d10 < d14 && d15 < d13 && d12 < d16) {
            z7 = true;
        } else {
            z7 = false;
        }
        z zVar = InterfaceC1768C.f15581d0;
        if (!z7) {
            return zVar;
        }
        Y4.b bVar3 = this.f6213a;
        bVar3.getClass();
        ArrayList arrayList5 = new ArrayList();
        bVar3.c(aVar3, arrayList5);
        if (arrayList5.isEmpty()) {
            return zVar;
        }
        int i15 = (this.f6216d * 2) + RecognitionOptions.UPC_A;
        double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, i15, i15);
        Iterator it = arrayList5.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            X4.a aVar5 = dVar.f6219a;
            int i16 = (int) ((aVar5.f6399b - d12) / d9);
            double[] dArr2 = dArr[(int) ((aVar5.f6398a - d10) / d9)];
            dArr2[i16] = dArr2[i16] + dVar.f6220b;
        }
        for (d dVar2 : arrayList4) {
            X4.a aVar6 = dVar2.f6219a;
            int i17 = (int) ((aVar6.f6399b - d12) / d9);
            double[] dArr3 = dArr[(int) (((aVar6.f6398a + d7) - d10) / d9)];
            dArr3[i17] = dArr3[i17] + dVar2.f6220b;
        }
        double[] dArr4 = this.f6210X;
        int floor = (int) Math.floor(dArr4.length / 2.0d);
        int length = dArr.length;
        int i18 = length - (floor * 2);
        int i19 = floor + i18;
        int i20 = i19 - 1;
        double[][] dArr5 = (double[][]) Array.newInstance(Double.TYPE, length, length);
        int i21 = 0;
        while (i21 < length) {
            for (int i22 = i14; i22 < length; i22++) {
                double d17 = dArr[i21][i22];
                if (d17 != 0.0d) {
                    int i23 = i21 + floor;
                    if (i20 < i23) {
                        i23 = i20;
                    }
                    int i24 = i23 + 1;
                    int i25 = i21 - floor;
                    if (floor > i25) {
                        i12 = floor;
                    } else {
                        i12 = i25;
                    }
                    for (int i26 = i12; i26 < i24; i26++) {
                        double[] dArr6 = dArr5[i26];
                        dArr6[i22] = (dArr4[i26 - i25] * d17) + dArr6[i22];
                    }
                }
            }
            i21++;
            i14 = 0;
            i13 = 2;
        }
        int[] iArr = new int[i13];
        iArr[1] = i18;
        iArr[0] = i18;
        double[][] dArr7 = (double[][]) Array.newInstance(Double.TYPE, iArr);
        for (int i27 = floor; i27 < i19; i27++) {
            for (int i28 = 0; i28 < length; i28++) {
                double d18 = dArr5[i27][i28];
                if (d18 != 0.0d) {
                    int i29 = i28 + floor;
                    if (i20 < i29) {
                        i29 = i20;
                    }
                    int i30 = i29 + 1;
                    int i31 = i28 - floor;
                    if (floor > i31) {
                        i11 = floor;
                    } else {
                        i11 = i31;
                    }
                    while (i11 < i30) {
                        double[] dArr8 = dArr7[i27 - floor];
                        int i32 = i11 - floor;
                        dArr8[i32] = (dArr4[i11 - i31] * d18) + dArr8[i32];
                        i11++;
                    }
                }
            }
        }
        int[] iArr2 = this.f;
        double d19 = this.f6212Z[i9];
        int i33 = iArr2[iArr2.length - 1];
        double length2 = (iArr2.length - 1) / d19;
        int length3 = dArr7.length;
        int[] iArr3 = new int[length3 * length3];
        for (int i34 = 0; i34 < length3; i34++) {
            for (int i35 = 0; i35 < length3; i35++) {
                double d20 = dArr7[i35][i34];
                int i36 = (i34 * length3) + i35;
                int i37 = (int) (d20 * length2);
                if (d20 != 0.0d) {
                    if (i37 < iArr2.length) {
                        iArr3[i36] = iArr2[i37];
                    } else {
                        iArr3[i36] = i33;
                    }
                } else {
                    iArr3[i36] = 0;
                }
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(length3, length3, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr3, 0, length3, 0, 0, length3, length3);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return new z(byteArrayOutputStream.toByteArray(), RecognitionOptions.UPC_A, RecognitionOptions.UPC_A);
    }
}
