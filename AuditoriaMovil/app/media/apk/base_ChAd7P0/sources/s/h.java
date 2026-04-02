package S;

import java.util.Arrays;
import m6.AbstractC1446g;
/* loaded from: classes.dex */
public final class h implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ boolean f4826a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ long[] f4827b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object[] f4828c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ int f4829d;

    public h() {
        int i7;
        int i8 = 4;
        while (true) {
            i7 = 80;
            if (i8 >= 32) {
                break;
            }
            int i9 = (1 << i8) - 12;
            if (80 <= i9) {
                i7 = i9;
                break;
            }
            i8++;
        }
        int i10 = i7 / 8;
        this.f4827b = new long[i10];
        this.f4828c = new Object[i10];
    }

    public final void a(long j, Long l8) {
        int i7 = this.f4829d;
        if (i7 != 0 && j <= this.f4827b[i7 - 1]) {
            e(l8, j);
            return;
        }
        if (this.f4826a) {
            long[] jArr = this.f4827b;
            if (i7 >= jArr.length) {
                Object[] objArr = this.f4828c;
                int i8 = 0;
                for (int i9 = 0; i9 < i7; i9++) {
                    Object obj = objArr[i9];
                    if (obj != i.f4830a) {
                        if (i9 != i8) {
                            jArr[i8] = jArr[i9];
                            objArr[i8] = obj;
                            objArr[i9] = null;
                        }
                        i8++;
                    }
                }
                this.f4826a = false;
                this.f4829d = i8;
            }
        }
        int i10 = this.f4829d;
        if (i10 >= this.f4827b.length) {
            int i11 = (i10 + 1) * 8;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 8;
            long[] copyOf = Arrays.copyOf(this.f4827b, i14);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.f4827b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4828c, i14);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.f4828c = copyOf2;
        }
        this.f4827b[i10] = j;
        this.f4828c[i10] = l8;
        this.f4829d = i10 + 1;
    }

    /* renamed from: b */
    public final h clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.j.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        h hVar = (h) clone;
        hVar.f4827b = (long[]) this.f4827b.clone();
        hVar.f4828c = (Object[]) this.f4828c.clone();
        return hVar;
    }

    public final Object c(long j) {
        Object obj;
        int b5 = T.a.b(this.f4827b, this.f4829d, j);
        if (b5 < 0 || (obj = this.f4828c[b5]) == i.f4830a) {
            return null;
        }
        return obj;
    }

    public final Object d(long j) {
        Object obj;
        int b5 = T.a.b(this.f4827b, this.f4829d, j);
        if (b5 < 0 || (obj = this.f4828c[b5]) == i.f4830a) {
            return -1L;
        }
        return obj;
    }

    public final void e(Object obj, long j) {
        int b5 = T.a.b(this.f4827b, this.f4829d, j);
        if (b5 >= 0) {
            this.f4828c[b5] = obj;
            return;
        }
        int i7 = ~b5;
        int i8 = this.f4829d;
        Object obj2 = i.f4830a;
        if (i7 < i8) {
            Object[] objArr = this.f4828c;
            if (objArr[i7] == obj2) {
                this.f4827b[i7] = j;
                objArr[i7] = obj;
                return;
            }
        }
        if (this.f4826a) {
            long[] jArr = this.f4827b;
            if (i8 >= jArr.length) {
                Object[] objArr2 = this.f4828c;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    Object obj3 = objArr2[i10];
                    if (obj3 != obj2) {
                        if (i10 != i9) {
                            jArr[i9] = jArr[i10];
                            objArr2[i9] = obj3;
                            objArr2[i10] = null;
                        }
                        i9++;
                    }
                }
                this.f4826a = false;
                this.f4829d = i9;
                i7 = ~T.a.b(this.f4827b, i9, j);
            }
        }
        int i11 = this.f4829d;
        if (i11 >= this.f4827b.length) {
            int i12 = (i11 + 1) * 8;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 8;
            long[] copyOf = Arrays.copyOf(this.f4827b, i15);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.f4827b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4828c, i15);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.f4828c = copyOf2;
        }
        int i16 = this.f4829d - i7;
        if (i16 != 0) {
            long[] jArr2 = this.f4827b;
            int i17 = i7 + 1;
            kotlin.jvm.internal.j.e(jArr2, "<this>");
            System.arraycopy(jArr2, i7, jArr2, i17, i16);
            Object[] objArr3 = this.f4828c;
            AbstractC1446g.L(objArr3, i17, objArr3, i7, this.f4829d);
        }
        this.f4827b[i7] = j;
        this.f4828c[i7] = obj;
        this.f4829d++;
    }

    public final String toString() {
        int i7;
        int i8;
        if (this.f4826a) {
            int i9 = this.f4829d;
            long[] jArr = this.f4827b;
            Object[] objArr = this.f4828c;
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                Object obj = objArr[i11];
                if (obj != i.f4830a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f4826a = false;
            this.f4829d = i10;
        }
        if (this.f4829d <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4829d * 28);
        sb.append('{');
        int i12 = this.f4829d;
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 > 0) {
                sb.append(", ");
            }
            if (i13 >= 0 && i13 < (i7 = this.f4829d)) {
                if (this.f4826a) {
                    long[] jArr2 = this.f4827b;
                    Object[] objArr2 = this.f4828c;
                    int i14 = 0;
                    for (int i15 = 0; i15 < i7; i15++) {
                        Object obj2 = objArr2[i15];
                        if (obj2 != i.f4830a) {
                            if (i15 != i14) {
                                jArr2[i14] = jArr2[i15];
                                objArr2[i14] = obj2;
                                objArr2[i15] = null;
                            }
                            i14++;
                        }
                    }
                    this.f4826a = false;
                    this.f4829d = i14;
                }
                sb.append(this.f4827b[i13]);
                sb.append('=');
                if (i13 >= 0 && i13 < (i8 = this.f4829d)) {
                    if (this.f4826a) {
                        long[] jArr3 = this.f4827b;
                        Object[] objArr3 = this.f4828c;
                        int i16 = 0;
                        for (int i17 = 0; i17 < i8; i17++) {
                            Object obj3 = objArr3[i17];
                            if (obj3 != i.f4830a) {
                                if (i17 != i16) {
                                    jArr3[i16] = jArr3[i17];
                                    objArr3[i16] = obj3;
                                    objArr3[i17] = null;
                                }
                                i16++;
                            }
                        }
                        this.f4826a = false;
                        this.f4829d = i16;
                    }
                    Object obj4 = this.f4828c[i13];
                    if (obj4 != sb) {
                        sb.append(obj4);
                    } else {
                        sb.append("(this Map)");
                    }
                } else {
                    throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i13, "Expected index to be within 0..size()-1, but was ").toString());
                }
            } else {
                throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i13, "Expected index to be within 0..size()-1, but was ").toString());
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.j.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
