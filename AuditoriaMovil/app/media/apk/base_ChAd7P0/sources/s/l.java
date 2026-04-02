package S;

import java.util.Arrays;
import m6.AbstractC1446g;
/* loaded from: classes.dex */
public final class l implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ int[] f4835a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object[] f4836b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ int f4837c;

    public l() {
        int i7;
        int i8 = 4;
        while (true) {
            i7 = 40;
            if (i8 >= 32) {
                break;
            }
            int i9 = (1 << i8) - 12;
            if (40 <= i9) {
                i7 = i9;
                break;
            }
            i8++;
        }
        int i10 = i7 / 4;
        this.f4835a = new int[i10];
        this.f4836b = new Object[i10];
    }

    public final void a(int i7, Object obj) {
        int i8 = this.f4837c;
        if (i8 != 0 && i7 <= this.f4835a[i8 - 1]) {
            d(i7, obj);
            return;
        }
        if (i8 >= this.f4835a.length) {
            int i9 = (i8 + 1) * 4;
            int i10 = 4;
            while (true) {
                if (i10 >= 32) {
                    break;
                }
                int i11 = (1 << i10) - 12;
                if (i9 <= i11) {
                    i9 = i11;
                    break;
                }
                i10++;
            }
            int i12 = i9 / 4;
            int[] copyOf = Arrays.copyOf(this.f4835a, i12);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.f4835a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4836b, i12);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.f4836b = copyOf2;
        }
        this.f4835a[i8] = i7;
        this.f4836b[i8] = obj;
        this.f4837c = i8 + 1;
    }

    /* renamed from: b */
    public final l clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.j.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        l lVar = (l) clone;
        lVar.f4835a = (int[]) this.f4835a.clone();
        lVar.f4836b = (Object[]) this.f4836b.clone();
        return lVar;
    }

    public final Object c(int i7) {
        Object obj;
        int a7 = T.a.a(this.f4837c, i7, this.f4835a);
        if (a7 < 0 || (obj = this.f4836b[a7]) == i.f4831b) {
            return null;
        }
        return obj;
    }

    public final void d(int i7, Object obj) {
        int a7 = T.a.a(this.f4837c, i7, this.f4835a);
        if (a7 >= 0) {
            this.f4836b[a7] = obj;
            return;
        }
        int i8 = ~a7;
        int i9 = this.f4837c;
        if (i8 < i9) {
            Object[] objArr = this.f4836b;
            if (objArr[i8] == i.f4831b) {
                this.f4835a[i8] = i7;
                objArr[i8] = obj;
                return;
            }
        }
        if (i9 >= this.f4835a.length) {
            int i10 = (i9 + 1) * 4;
            int i11 = 4;
            while (true) {
                if (i11 >= 32) {
                    break;
                }
                int i12 = (1 << i11) - 12;
                if (i10 <= i12) {
                    i10 = i12;
                    break;
                }
                i11++;
            }
            int i13 = i10 / 4;
            int[] copyOf = Arrays.copyOf(this.f4835a, i13);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.f4835a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4836b, i13);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.f4836b = copyOf2;
        }
        int i14 = this.f4837c;
        if (i14 - i8 != 0) {
            int[] iArr = this.f4835a;
            int i15 = i8 + 1;
            AbstractC1446g.J(i15, i8, i14, iArr, iArr);
            Object[] objArr2 = this.f4836b;
            AbstractC1446g.L(objArr2, i15, objArr2, i8, this.f4837c);
        }
        this.f4835a[i8] = i7;
        this.f4836b[i8] = obj;
        this.f4837c++;
    }

    public final String toString() {
        int i7 = this.f4837c;
        if (i7 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i7 * 28);
        sb.append('{');
        int i8 = this.f4837c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            sb.append(this.f4835a[i9]);
            sb.append('=');
            Object obj = this.f4836b[i9];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.j.d(sb2, "buffer.toString()");
        return sb2;
    }
}
