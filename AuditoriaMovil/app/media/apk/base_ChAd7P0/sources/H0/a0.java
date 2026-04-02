package H0;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f1780a;

    /* renamed from: b  reason: collision with root package name */
    public final W f1781b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1782c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f1783d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean[] f1784e;

    static {
        K0.x.H(0);
        K0.x.H(1);
        K0.x.H(3);
        K0.x.H(4);
    }

    public a0(W w2, boolean z7, int[] iArr, boolean[] zArr) {
        boolean z8;
        int i7 = w2.f1739a;
        this.f1780a = i7;
        boolean z9 = false;
        if (i7 == iArr.length && i7 == zArr.length) {
            z8 = true;
        } else {
            z8 = false;
        }
        K0.a.e(z8);
        this.f1781b = w2;
        if (z7 && i7 > 1) {
            z9 = true;
        }
        this.f1782c = z9;
        this.f1783d = (int[]) iArr.clone();
        this.f1784e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f1782c == a0Var.f1782c && this.f1781b.equals(a0Var.f1781b) && Arrays.equals(this.f1783d, a0Var.f1783d) && Arrays.equals(this.f1784e, a0Var.f1784e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f1783d);
        return Arrays.hashCode(this.f1784e) + ((hashCode + (((this.f1781b.hashCode() * 31) + (this.f1782c ? 1 : 0)) * 31)) * 31);
    }
}
