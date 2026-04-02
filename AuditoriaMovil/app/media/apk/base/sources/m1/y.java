package m1;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public int f14013a;

    /* renamed from: b  reason: collision with root package name */
    public int f14014b;

    /* renamed from: c  reason: collision with root package name */
    public int f14015c;

    /* renamed from: d  reason: collision with root package name */
    public int f14016d;

    /* renamed from: e  reason: collision with root package name */
    public int f14017e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public Serializable f14018g;

    public boolean a(int i7) {
        boolean z7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        if ((i7 & (-2097152)) == -2097152) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7 || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0 || (i10 = (i7 >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i7 >>> 10) & 3) == 3) {
            return false;
        }
        this.f14013a = i8;
        this.f14018g = AbstractC1428b.f13921s[3 - i9];
        int i14 = AbstractC1428b.f13922t[i11];
        this.f14015c = i14;
        int i15 = 2;
        if (i8 == 2) {
            this.f14015c = i14 / 2;
        } else if (i8 == 0) {
            this.f14015c = i14 / 4;
        }
        int i16 = (i7 >>> 9) & 1;
        int i17 = 1152;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    i17 = 384;
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } else if (i8 != 3) {
            i17 = 576;
        }
        this.f = i17;
        if (i9 == 3) {
            if (i8 == 3) {
                i13 = AbstractC1428b.f13923u[i10 - 1];
            } else {
                i13 = AbstractC1428b.f13924v[i10 - 1];
            }
            this.f14017e = i13;
            this.f14014b = (((i13 * 12) / this.f14015c) + i16) * 4;
        } else {
            int i18 = 144;
            if (i8 == 3) {
                if (i9 == 2) {
                    i12 = AbstractC1428b.f13925w[i10 - 1];
                } else {
                    i12 = AbstractC1428b.f13926x[i10 - 1];
                }
                this.f14017e = i12;
                this.f14014b = ((i12 * 144) / this.f14015c) + i16;
            } else {
                int i19 = AbstractC1428b.f13927y[i10 - 1];
                this.f14017e = i19;
                if (i9 == 1) {
                    i18 = 72;
                }
                this.f14014b = ((i18 * i19) / this.f14015c) + i16;
            }
        }
        if (((i7 >> 6) & 3) == 3) {
            i15 = 1;
        }
        this.f14016d = i15;
        return true;
    }
}
