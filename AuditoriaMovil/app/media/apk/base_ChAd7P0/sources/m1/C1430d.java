package m1;

import H0.J;
import java.util.ArrayList;
/* renamed from: m1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1430d {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f13933a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13934b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13935c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13936d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13937e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13938g;

    /* renamed from: h  reason: collision with root package name */
    public final int f13939h;

    /* renamed from: i  reason: collision with root package name */
    public final int f13940i;
    public final int j;

    /* renamed from: k  reason: collision with root package name */
    public final float f13941k;

    /* renamed from: l  reason: collision with root package name */
    public final String f13942l;

    public C1430d(ArrayList arrayList, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, float f, String str) {
        this.f13933a = arrayList;
        this.f13934b = i7;
        this.f13935c = i8;
        this.f13936d = i9;
        this.f13937e = i10;
        this.f = i11;
        this.f13938g = i12;
        this.f13939h = i13;
        this.f13940i = i14;
        this.j = i15;
        this.f13941k = f;
        this.f13942l = str;
    }

    public static C1430d a(K0.q qVar) {
        byte[] bArr;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f;
        String str;
        int i14;
        try {
            qVar.H(4);
            int u7 = (qVar.u() & 3) + 1;
            if (u7 != 3) {
                ArrayList arrayList = new ArrayList();
                int u8 = qVar.u() & 31;
                int i15 = 0;
                while (true) {
                    bArr = K0.a.f2463a;
                    if (i15 >= u8) {
                        break;
                    }
                    int A7 = qVar.A();
                    int i16 = qVar.f2514b;
                    qVar.H(A7);
                    byte[] bArr2 = qVar.f2513a;
                    byte[] bArr3 = new byte[A7 + 4];
                    System.arraycopy(bArr, 0, bArr3, 0, 4);
                    System.arraycopy(bArr2, i16, bArr3, 4, A7);
                    arrayList.add(bArr3);
                    i15++;
                }
                int u9 = qVar.u();
                for (int i17 = 0; i17 < u9; i17++) {
                    int A8 = qVar.A();
                    int i18 = qVar.f2514b;
                    qVar.H(A8);
                    byte[] bArr4 = qVar.f2513a;
                    byte[] bArr5 = new byte[A8 + 4];
                    System.arraycopy(bArr, 0, bArr5, 0, 4);
                    System.arraycopy(bArr4, i18, bArr5, 4, A8);
                    arrayList.add(bArr5);
                }
                if (u8 > 0) {
                    L0.f d7 = L0.g.d((byte[]) arrayList.get(0), u7, ((byte[]) arrayList.get(0)).length);
                    int i19 = d7.f2848e;
                    int i20 = d7.f;
                    int i21 = d7.f2857p;
                    int i22 = d7.f2858q;
                    int i23 = d7.f2859r;
                    int i24 = d7.f2860s;
                    float f4 = d7.f2849g;
                    str = K0.a.b(d7.f2844a, d7.f2845b, d7.f2846c);
                    i12 = i22;
                    i13 = i23;
                    i14 = i24;
                    f = f4;
                    i8 = i20;
                    i9 = d7.f2850h + 8;
                    i10 = d7.f2851i + 8;
                    i11 = i21;
                    i7 = i19;
                } else {
                    i7 = -1;
                    i8 = -1;
                    i9 = -1;
                    i10 = -1;
                    i11 = -1;
                    i12 = -1;
                    i13 = -1;
                    f = 1.0f;
                    str = null;
                    i14 = 16;
                }
                return new C1430d(arrayList, u7, i7, i8, i9, i10, i11, i12, i13, i14, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw J.a(e7, "Error parsing AVC config");
        }
    }
}
