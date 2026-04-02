package S;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import m6.AbstractC1446g;
import x6.InterfaceC2020a;
/* loaded from: classes.dex */
public final class g implements Collection, Set, InterfaceC2020a {

    /* renamed from: a  reason: collision with root package name */
    public int[] f4823a = T.a.f5282a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f4824b = T.a.f5283b;

    /* renamed from: c  reason: collision with root package name */
    public int f4825c;

    public g(int i7) {
        if (i7 > 0) {
            i.a(this, i7);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i7;
        int b5;
        int i8 = this.f4825c;
        if (obj == null) {
            b5 = i.b(this, null, 0);
            i7 = 0;
        } else {
            int hashCode = obj.hashCode();
            i7 = hashCode;
            b5 = i.b(this, obj, hashCode);
        }
        if (b5 >= 0) {
            return false;
        }
        int i9 = ~b5;
        int[] iArr = this.f4823a;
        if (i8 >= iArr.length) {
            int i10 = 8;
            if (i8 >= 8) {
                i10 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i10 = 4;
            }
            Object[] objArr = this.f4824b;
            i.a(this, i10);
            if (i8 == this.f4825c) {
                int[] iArr2 = this.f4823a;
                if (iArr2.length != 0) {
                    AbstractC1446g.J(0, 0, iArr.length, iArr, iArr2);
                    AbstractC1446g.M(objArr, 0, this.f4824b, objArr.length, 6);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i9 < i8) {
            int[] iArr3 = this.f4823a;
            int i11 = i9 + 1;
            AbstractC1446g.J(i11, i9, i8, iArr3, iArr3);
            Object[] objArr2 = this.f4824b;
            AbstractC1446g.L(objArr2, i11, objArr2, i9, i8);
        }
        int i12 = this.f4825c;
        if (i8 == i12) {
            int[] iArr4 = this.f4823a;
            if (i9 < iArr4.length) {
                iArr4[i9] = i7;
                this.f4824b[i9] = obj;
                this.f4825c = i12 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        int size = elements.size() + this.f4825c;
        int i7 = this.f4825c;
        int[] iArr = this.f4823a;
        boolean z7 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f4824b;
            i.a(this, size);
            int i8 = this.f4825c;
            if (i8 > 0) {
                AbstractC1446g.J(0, 0, i8, iArr, this.f4823a);
                AbstractC1446g.M(objArr, 0, this.f4824b, this.f4825c, 6);
            }
        }
        if (this.f4825c == i7) {
            for (Object obj : elements) {
                z7 |= add(obj);
            }
            return z7;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f4825c != 0) {
            this.f4823a = T.a.f5282a;
            this.f4824b = T.a.f5283b;
            this.f4825c = 0;
        }
        if (this.f4825c == 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int b5;
        if (obj == null) {
            b5 = i.b(this, null, 0);
        } else {
            b5 = i.b(this, obj, obj.hashCode());
        }
        if (b5 < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        for (Object obj : elements) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public final Object e(int i7) {
        int i8 = this.f4825c;
        Object[] objArr = this.f4824b;
        Object obj = objArr[i7];
        if (i8 <= 1) {
            clear();
        } else {
            int i9 = i8 - 1;
            int[] iArr = this.f4823a;
            int i10 = 8;
            if (iArr.length > 8 && i8 < iArr.length / 3) {
                if (i8 > 8) {
                    i10 = i8 + (i8 >> 1);
                }
                i.a(this, i10);
                if (i7 > 0) {
                    AbstractC1446g.J(0, 0, i7, iArr, this.f4823a);
                    AbstractC1446g.M(objArr, 0, this.f4824b, i7, 6);
                }
                if (i7 < i9) {
                    int i11 = i7 + 1;
                    AbstractC1446g.J(i7, i11, i8, iArr, this.f4823a);
                    AbstractC1446g.L(objArr, i7, this.f4824b, i11, i8);
                }
            } else {
                if (i7 < i9) {
                    int i12 = i7 + 1;
                    AbstractC1446g.J(i7, i12, i8, iArr, iArr);
                    Object[] objArr2 = this.f4824b;
                    AbstractC1446g.L(objArr2, i7, objArr2, i12, i8);
                }
                this.f4824b[i9] = null;
            }
            if (i8 == this.f4825c) {
                this.f4825c = i9;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.f4825c == ((Set) obj).size()) {
            try {
                int i7 = this.f4825c;
                for (int i8 = 0; i8 < i7; i8++) {
                    if (((Set) obj).contains(this.f4824b[i8])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f4823a;
        int i7 = this.f4825c;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += iArr[i9];
        }
        return i8;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.f4825c <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b5;
        if (obj == null) {
            b5 = i.b(this, null, 0);
        } else {
            b5 = i.b(this, obj, obj.hashCode());
        }
        if (b5 < 0) {
            return false;
        }
        e(b5);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z7 = false;
        for (Object obj : elements) {
            z7 |= remove(obj);
        }
        return z7;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z7 = false;
        for (int i7 = this.f4825c - 1; -1 < i7; i7--) {
            if (!elements.contains(this.f4824b[i7])) {
                e(i7);
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f4825c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.f4824b;
        int i7 = this.f4825c;
        kotlin.jvm.internal.j.e(objArr, "<this>");
        F.f.h(i7, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i7);
        kotlin.jvm.internal.j.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4825c * 14);
        sb.append('{');
        int i7 = this.f4825c;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object obj = this.f4824b[i8];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.j.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.j.e(array, "array");
        int i7 = this.f4825c;
        if (array.length < i7) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i7);
        } else if (array.length > i7) {
            array[i7] = null;
        }
        AbstractC1446g.L(this.f4824b, 0, array, 0, this.f4825c);
        return array;
    }
}
