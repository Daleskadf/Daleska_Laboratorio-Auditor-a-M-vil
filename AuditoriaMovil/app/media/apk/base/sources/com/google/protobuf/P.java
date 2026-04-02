package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class P extends AbstractC0830b implements T, RandomAccess, InterfaceC0874x0 {

    /* renamed from: d  reason: collision with root package name */
    public static final P f10022d = new P(new int[0], 0, false);

    /* renamed from: b  reason: collision with root package name */
    public int[] f10023b;

    /* renamed from: c  reason: collision with root package name */
    public int f10024c;

    public P(int[] iArr, int i7, boolean z7) {
        super(z7);
        this.f10023b = iArr;
        this.f10024c = i7;
    }

    @Override // com.google.protobuf.U
    public final U a(int i7) {
        if (i7 >= this.f10024c) {
            return new P(Arrays.copyOf(this.f10023b, i7), this.f10024c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        int intValue = ((Integer) obj).intValue();
        e();
        if (i7 >= 0 && i7 <= (i8 = this.f10024c)) {
            int[] iArr = this.f10023b;
            if (i8 < iArr.length) {
                System.arraycopy(iArr, i7, iArr, i7 + 1, i8 - i7);
            } else {
                int[] iArr2 = new int[androidx.datastore.preferences.protobuf.Y.d(i8, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i7);
                System.arraycopy(this.f10023b, i7, iArr2, i7 + 1, this.f10024c - i7);
                this.f10023b = iArr2;
            }
            this.f10023b[i7] = intValue;
            this.f10024c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder k2 = io.flutter.plugins.pathprovider.b.k("Index:", i7, ", Size:");
        k2.append(this.f10024c);
        throw new IndexOutOfBoundsException(k2.toString());
    }

    @Override // com.google.protobuf.AbstractC0830b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        Charset charset = V.f10033a;
        collection.getClass();
        if (!(collection instanceof P)) {
            return super.addAll(collection);
        }
        P p7 = (P) collection;
        int i7 = p7.f10024c;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f10024c;
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i8 >= i7) {
            int i9 = i8 + i7;
            int[] iArr = this.f10023b;
            if (i9 > iArr.length) {
                this.f10023b = Arrays.copyOf(iArr, i9);
            }
            System.arraycopy(p7.f10023b, 0, this.f10023b, this.f10024c, p7.f10024c);
            this.f10024c = i9;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC0830b, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return super.equals(obj);
        }
        P p7 = (P) obj;
        if (this.f10024c != p7.f10024c) {
            return false;
        }
        int[] iArr = p7.f10023b;
        for (int i7 = 0; i7 < this.f10024c; i7++) {
            if (this.f10023b[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        i(i7);
        return Integer.valueOf(this.f10023b[i7]);
    }

    public final void h(int i7) {
        e();
        int i8 = this.f10024c;
        int[] iArr = this.f10023b;
        if (i8 == iArr.length) {
            int[] iArr2 = new int[androidx.datastore.preferences.protobuf.Y.d(i8, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            this.f10023b = iArr2;
        }
        int[] iArr3 = this.f10023b;
        int i9 = this.f10024c;
        this.f10024c = i9 + 1;
        iArr3[i9] = i7;
    }

    @Override // com.google.protobuf.AbstractC0830b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f10024c; i8++) {
            i7 = (i7 * 31) + this.f10023b[i8];
        }
        return i7;
    }

    public final void i(int i7) {
        if (i7 >= 0 && i7 < this.f10024c) {
            return;
        }
        StringBuilder k2 = io.flutter.plugins.pathprovider.b.k("Index:", i7, ", Size:");
        k2.append(this.f10024c);
        throw new IndexOutOfBoundsException(k2.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i7 = this.f10024c;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f10023b[i8] == intValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC0830b, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        int i8;
        e();
        i(i7);
        int[] iArr = this.f10023b;
        int i9 = iArr[i7];
        if (i7 < this.f10024c - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (i8 - i7) - 1);
        }
        this.f10024c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        e();
        if (i8 >= i7) {
            int[] iArr = this.f10023b;
            System.arraycopy(iArr, i8, iArr, i7, this.f10024c - i8);
            this.f10024c -= i8 - i7;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        int intValue = ((Integer) obj).intValue();
        e();
        i(i7);
        int[] iArr = this.f10023b;
        int i8 = iArr[i7];
        iArr[i7] = intValue;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10024c;
    }

    @Override // com.google.protobuf.AbstractC0830b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h(((Integer) obj).intValue());
        return true;
    }
}
