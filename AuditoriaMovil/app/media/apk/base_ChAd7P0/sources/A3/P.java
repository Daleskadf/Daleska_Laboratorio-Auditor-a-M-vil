package A3;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
/* loaded from: classes.dex */
public abstract class P extends F implements Set {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f107c = 0;

    /* renamed from: b  reason: collision with root package name */
    public transient K f108b;

    public static int n(int i7) {
        int max = Math.max(i7, 2);
        boolean z7 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z7 = false;
        }
        G.i.f("collection too large", z7);
        return 1073741824;
    }

    public static P o(int i7, Object... objArr) {
        if (i7 != 0) {
            if (i7 != 1) {
                int n7 = n(i7);
                Object[] objArr2 = new Object[n7];
                int i8 = n7 - 1;
                int i9 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < i7; i11++) {
                    Object obj = objArr[i11];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int s7 = AbstractC0021t.s(hashCode);
                        while (true) {
                            int i12 = s7 & i8;
                            Object obj2 = objArr2[i12];
                            if (obj2 == null) {
                                objArr[i10] = obj;
                                objArr2[i12] = obj;
                                i9 += hashCode;
                                i10++;
                                break;
                            } else if (obj2.equals(obj)) {
                                break;
                            } else {
                                s7++;
                            }
                        }
                    } else {
                        throw new NullPointerException(io.flutter.plugins.pathprovider.b.e(i11, "at index "));
                    }
                }
                Arrays.fill(objArr, i10, i7, (Object) null);
                if (i10 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new r0(obj3);
                } else if (n(i10) < n7 / 2) {
                    return o(i10, objArr);
                } else {
                    int length = objArr.length;
                    if (i10 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i10);
                    }
                    return new k0(objArr, i9, objArr2, i8, i10);
                }
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new r0(obj4);
        }
        return k0.f165e0;
    }

    public static P p(Collection collection) {
        if ((collection instanceof P) && !(collection instanceof SortedSet)) {
            P p7 = (P) collection;
            if (!p7.l()) {
                return p7;
            }
        }
        Object[] array = collection.toArray();
        return o(array.length, array);
    }

    @Override // A3.F
    public K e() {
        K k2 = this.f108b;
        if (k2 == null) {
            K q2 = q();
            this.f108b = q2;
            return q2;
        }
        return k2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof P) && (this instanceof k0)) {
            P p7 = (P) obj;
            p7.getClass();
            if ((p7 instanceof k0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return AbstractC0021t.i(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC0021t.m(this);
    }

    public K q() {
        Object[] array = toArray(F.f89a);
        I i7 = K.f98b;
        return K.n(array.length, array);
    }
}
