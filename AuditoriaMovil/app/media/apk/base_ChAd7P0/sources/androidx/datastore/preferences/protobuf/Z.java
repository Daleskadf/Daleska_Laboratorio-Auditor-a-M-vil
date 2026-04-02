package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class Z extends AbstractC0525b implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    public static final Z f7786d = new Z(new Object[0], 0, false);

    /* renamed from: b  reason: collision with root package name */
    public Object[] f7787b;

    /* renamed from: c  reason: collision with root package name */
    public int f7788c;

    public Z(Object[] objArr, int i7, boolean z7) {
        this.f7793a = z7;
        this.f7787b = objArr;
        this.f7788c = i7;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e();
        int i7 = this.f7788c;
        Object[] objArr = this.f7787b;
        if (i7 == objArr.length) {
            this.f7787b = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f7787b;
        int i8 = this.f7788c;
        this.f7788c = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void f(int i7) {
        if (i7 >= 0 && i7 < this.f7788c) {
            return;
        }
        StringBuilder k2 = io.flutter.plugins.pathprovider.b.k("Index:", i7, ", Size:");
        k2.append(this.f7788c);
        throw new IndexOutOfBoundsException(k2.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        f(i7);
        return this.f7787b[i7];
    }

    public final Z h(int i7) {
        if (i7 >= this.f7788c) {
            return new Z(Arrays.copyOf(this.f7787b, i7), this.f7788c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0525b, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        int i8;
        e();
        f(i7);
        Object[] objArr = this.f7787b;
        Object obj = objArr[i7];
        if (i7 < this.f7788c - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (i8 - i7) - 1);
        }
        this.f7788c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        e();
        f(i7);
        Object[] objArr = this.f7787b;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7788c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        e();
        if (i7 >= 0 && i7 <= (i8 = this.f7788c)) {
            Object[] objArr = this.f7787b;
            if (i8 < objArr.length) {
                System.arraycopy(objArr, i7, objArr, i7 + 1, i8 - i7);
            } else {
                Object[] objArr2 = new Object[Y.d(i8, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i7);
                System.arraycopy(this.f7787b, i7, objArr2, i7 + 1, this.f7788c - i7);
                this.f7787b = objArr2;
            }
            this.f7787b[i7] = obj;
            this.f7788c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder k2 = io.flutter.plugins.pathprovider.b.k("Index:", i7, ", Size:");
        k2.append(this.f7788c);
        throw new IndexOutOfBoundsException(k2.toString());
    }
}
