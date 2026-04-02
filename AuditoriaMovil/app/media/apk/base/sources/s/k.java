package S;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import m6.AbstractC1446g;
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public int[] f4832a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f4833b;

    /* renamed from: c  reason: collision with root package name */
    public int f4834c;

    public k(int i7) {
        int[] iArr;
        Object[] objArr;
        if (i7 == 0) {
            iArr = T.a.f5282a;
        } else {
            iArr = new int[i7];
        }
        this.f4832a = iArr;
        if (i7 == 0) {
            objArr = T.a.f5283b;
        } else {
            objArr = new Object[i7 << 1];
        }
        this.f4833b = objArr;
    }

    public final int a(Object obj) {
        int i7 = this.f4834c * 2;
        Object[] objArr = this.f4833b;
        if (obj == null) {
            for (int i8 = 1; i8 < i7; i8 += 2) {
                if (objArr[i8] == null) {
                    return i8 >> 1;
                }
            }
            return -1;
        }
        for (int i9 = 1; i9 < i7; i9 += 2) {
            if (obj.equals(objArr[i9])) {
                return i9 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i7, Object obj) {
        int i8 = this.f4834c;
        if (i8 == 0) {
            return -1;
        }
        int a7 = T.a.a(i8, i7, this.f4832a);
        if (a7 < 0) {
            return a7;
        }
        if (kotlin.jvm.internal.j.a(obj, this.f4833b[a7 << 1])) {
            return a7;
        }
        int i9 = a7 + 1;
        while (i9 < i8 && this.f4832a[i9] == i7) {
            if (kotlin.jvm.internal.j.a(obj, this.f4833b[i9 << 1])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = a7 - 1; i10 >= 0 && this.f4832a[i10] == i7; i10--) {
            if (kotlin.jvm.internal.j.a(obj, this.f4833b[i10 << 1])) {
                return i10;
            }
        }
        return ~i9;
    }

    public final int c(Object obj) {
        if (obj == null) {
            return d();
        }
        return b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.f4834c > 0) {
            this.f4832a = T.a.f5282a;
            this.f4833b = T.a.f5283b;
            this.f4834c = 0;
        }
        if (this.f4834c <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(Object obj) {
        if (c(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d() {
        int i7 = this.f4834c;
        if (i7 == 0) {
            return -1;
        }
        int a7 = T.a.a(i7, 0, this.f4832a);
        if (a7 < 0) {
            return a7;
        }
        if (this.f4833b[a7 << 1] == null) {
            return a7;
        }
        int i8 = a7 + 1;
        while (i8 < i7 && this.f4832a[i8] == 0) {
            if (this.f4833b[i8 << 1] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = a7 - 1; i9 >= 0 && this.f4832a[i9] == 0; i9--) {
            if (this.f4833b[i9 << 1] == null) {
                return i9;
            }
        }
        return ~i8;
    }

    public final Object e(int i7) {
        if (i7 >= 0 && i7 < this.f4834c) {
            return this.f4833b[i7 << 1];
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i7, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof k) {
                int i7 = this.f4834c;
                if (i7 != ((k) obj).f4834c) {
                    return false;
                }
                k kVar = (k) obj;
                for (int i8 = 0; i8 < i7; i8++) {
                    Object e7 = e(i8);
                    Object h8 = h(i8);
                    Object obj2 = kVar.get(e7);
                    if (h8 == null) {
                        if (obj2 != null || !kVar.containsKey(e7)) {
                            return false;
                        }
                    } else if (!h8.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.f4834c != ((Map) obj).size()) {
                return false;
            } else {
                int i9 = this.f4834c;
                for (int i10 = 0; i10 < i9; i10++) {
                    Object e8 = e(i10);
                    Object h9 = h(i10);
                    Object obj3 = ((Map) obj).get(e8);
                    if (h9 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(e8)) {
                            return false;
                        }
                    } else if (!h9.equals(obj3)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i7) {
        int i8;
        if (i7 >= 0 && i7 < (i8 = this.f4834c)) {
            Object[] objArr = this.f4833b;
            int i9 = i7 << 1;
            Object obj = objArr[i9 + 1];
            if (i8 <= 1) {
                clear();
            } else {
                int i10 = i8 - 1;
                int[] iArr = this.f4832a;
                int i11 = 8;
                if (iArr.length > 8 && i8 < iArr.length / 3) {
                    if (i8 > 8) {
                        i11 = i8 + (i8 >> 1);
                    }
                    int[] copyOf = Arrays.copyOf(iArr, i11);
                    kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
                    this.f4832a = copyOf;
                    Object[] copyOf2 = Arrays.copyOf(this.f4833b, i11 << 1);
                    kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
                    this.f4833b = copyOf2;
                    if (i8 == this.f4834c) {
                        if (i7 > 0) {
                            AbstractC1446g.J(0, 0, i7, iArr, this.f4832a);
                            AbstractC1446g.L(objArr, 0, this.f4833b, 0, i9);
                        }
                        if (i7 < i10) {
                            int i12 = i7 + 1;
                            AbstractC1446g.J(i7, i12, i8, iArr, this.f4832a);
                            AbstractC1446g.L(objArr, i9, this.f4833b, i12 << 1, i8 << 1);
                        }
                    } else {
                        throw new ConcurrentModificationException();
                    }
                } else {
                    if (i7 < i10) {
                        int i13 = i7 + 1;
                        AbstractC1446g.J(i7, i13, i8, iArr, iArr);
                        Object[] objArr2 = this.f4833b;
                        AbstractC1446g.L(objArr2, i9, objArr2, i13 << 1, i8 << 1);
                    }
                    Object[] objArr3 = this.f4833b;
                    int i14 = i10 << 1;
                    objArr3[i14] = null;
                    objArr3[i14 + 1] = null;
                }
                if (i8 == this.f4834c) {
                    this.f4834c = i10;
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            return obj;
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i7, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final Object g(int i7, Object obj) {
        if (i7 >= 0 && i7 < this.f4834c) {
            int i8 = (i7 << 1) + 1;
            Object[] objArr = this.f4833b;
            Object obj2 = objArr[i8];
            objArr[i8] = obj;
            return obj2;
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i7, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public Object get(Object obj) {
        int c8 = c(obj);
        if (c8 >= 0) {
            return this.f4833b[(c8 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int c8 = c(obj);
        if (c8 >= 0) {
            return this.f4833b[(c8 << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int i7) {
        if (i7 >= 0 && i7 < this.f4834c) {
            return this.f4833b[(i7 << 1) + 1];
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i7, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final int hashCode() {
        int i7;
        int[] iArr = this.f4832a;
        Object[] objArr = this.f4833b;
        int i8 = this.f4834c;
        int i9 = 1;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            Object obj = objArr[i9];
            int i12 = iArr[i10];
            if (obj != null) {
                i7 = obj.hashCode();
            } else {
                i7 = 0;
            }
            i11 += i7 ^ i12;
            i10++;
            i9 += 2;
        }
        return i11;
    }

    public final boolean isEmpty() {
        if (this.f4834c <= 0) {
            return true;
        }
        return false;
    }

    public final Object put(Object obj, Object obj2) {
        int i7;
        int d7;
        int i8 = this.f4834c;
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        if (obj != null) {
            d7 = b(i7, obj);
        } else {
            d7 = d();
        }
        if (d7 >= 0) {
            int i9 = (d7 << 1) + 1;
            Object[] objArr = this.f4833b;
            Object obj3 = objArr[i9];
            objArr[i9] = obj2;
            return obj3;
        }
        int i10 = ~d7;
        int[] iArr = this.f4832a;
        if (i8 >= iArr.length) {
            int i11 = 8;
            if (i8 >= 8) {
                i11 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i11 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i11);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.f4832a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4833b, i11 << 1);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.f4833b = copyOf2;
            if (i8 != this.f4834c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i10 < i8) {
            int[] iArr2 = this.f4832a;
            int i12 = i10 + 1;
            AbstractC1446g.J(i12, i10, i8, iArr2, iArr2);
            Object[] objArr2 = this.f4833b;
            AbstractC1446g.L(objArr2, i12 << 1, objArr2, i10 << 1, this.f4834c << 1);
        }
        int i13 = this.f4834c;
        if (i8 == i13) {
            int[] iArr3 = this.f4832a;
            if (i10 < iArr3.length) {
                iArr3[i10] = i7;
                Object[] objArr3 = this.f4833b;
                int i14 = i10 << 1;
                objArr3[i14] = obj;
                objArr3[i14 + 1] = obj2;
                this.f4834c = i13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public Object remove(Object obj) {
        int c8 = c(obj);
        if (c8 >= 0) {
            return f(c8);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int c8 = c(obj);
        if (c8 >= 0) {
            return g(c8, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f4834c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4834c * 28);
        sb.append('{');
        int i7 = this.f4834c;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object e7 = e(i8);
            if (e7 != sb) {
                sb.append(e7);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object h8 = h(i8);
            if (h8 != sb) {
                sb.append(h8);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.j.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int c8 = c(obj);
        if (c8 < 0 || !kotlin.jvm.internal.j.a(obj2, h(c8))) {
            return false;
        }
        f(c8);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int c8 = c(obj);
        if (c8 < 0 || !kotlin.jvm.internal.j.a(obj2, h(c8))) {
            return false;
        }
        g(c8, obj3);
        return true;
    }
}
