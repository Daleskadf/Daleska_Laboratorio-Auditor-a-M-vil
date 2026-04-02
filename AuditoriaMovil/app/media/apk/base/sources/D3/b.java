package D3;

import G.i;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class b extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f860a;

    /* renamed from: b  reason: collision with root package name */
    public final int f861b;

    /* renamed from: c  reason: collision with root package name */
    public final int f862c;

    public b(int i7, int i8, int[] iArr) {
        this.f860a = iArr;
        this.f861b = i7;
        this.f862c = i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            if (AbstractC1740d.p(((Integer) obj).intValue(), this.f861b, this.f862c, this.f860a) != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int size = size();
            if (bVar.size() != size) {
                return false;
            }
            for (int i7 = 0; i7 < size; i7++) {
                if (this.f860a[this.f861b + i7] != bVar.f860a[bVar.f861b + i7]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        i.i(i7, size());
        return Integer.valueOf(this.f860a[this.f861b + i7]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = this.f861b; i8 < this.f862c; i8++) {
            i7 = (i7 * 31) + this.f860a[i8];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int[] iArr = this.f860a;
            int i7 = this.f861b;
            int p7 = AbstractC1740d.p(intValue, i7, this.f862c, iArr);
            if (p7 >= 0) {
                return p7 - i7;
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i7;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i8 = this.f862c;
            while (true) {
                i8--;
                i7 = this.f861b;
                if (i8 >= i7) {
                    if (this.f860a[i8] == intValue) {
                        break;
                    }
                } else {
                    i8 = -1;
                    break;
                }
            }
            if (i8 >= 0) {
                return i8 - i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        Integer num = (Integer) obj;
        i.i(i7, size());
        int i8 = this.f861b + i7;
        int[] iArr = this.f860a;
        int i9 = iArr[i8];
        num.getClass();
        iArr[i8] = num.intValue();
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f862c - this.f861b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i8) {
        i.l(i7, i8, size());
        if (i7 == i8) {
            return Collections.emptyList();
        }
        int i9 = this.f861b;
        return new b(i7 + i9, i9 + i8, this.f860a);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f860a;
        int i7 = this.f861b;
        sb.append(iArr[i7]);
        while (true) {
            i7++;
            if (i7 < this.f862c) {
                sb.append(", ");
                sb.append(iArr[i7]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
