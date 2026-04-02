package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class A0 extends AbstractC0830b implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    public static final A0 f9984d = new A0(new Object[0], 0, false);

    /* renamed from: b  reason: collision with root package name */
    public Object[] f9985b;

    /* renamed from: c  reason: collision with root package name */
    public int f9986c;

    public A0(Object[] objArr, int i7, boolean z7) {
        super(z7);
        this.f9985b = objArr;
        this.f9986c = i7;
    }

    @Override // com.google.protobuf.U
    public final U a(int i7) {
        if (i7 >= this.f9986c) {
            return new A0(Arrays.copyOf(this.f9985b, i7), this.f9986c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC0830b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e();
        int i7 = this.f9986c;
        Object[] objArr = this.f9985b;
        if (i7 == objArr.length) {
            this.f9985b = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f9985b;
        int i8 = this.f9986c;
        this.f9986c = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        h(i7);
        return this.f9985b[i7];
    }

    public final void h(int i7) {
        if (i7 >= 0 && i7 < this.f9986c) {
            return;
        }
        StringBuilder k2 = io.flutter.plugins.pathprovider.b.k("Index:", i7, ", Size:");
        k2.append(this.f9986c);
        throw new IndexOutOfBoundsException(k2.toString());
    }

    @Override // com.google.protobuf.AbstractC0830b, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        int i8;
        e();
        h(i7);
        Object[] objArr = this.f9985b;
        Object obj = objArr[i7];
        if (i7 < this.f9986c - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (i8 - i7) - 1);
        }
        this.f9986c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        e();
        h(i7);
        Object[] objArr = this.f9985b;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9986c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        e();
        if (i7 >= 0 && i7 <= (i8 = this.f9986c)) {
            Object[] objArr = this.f9985b;
            if (i8 < objArr.length) {
                System.arraycopy(objArr, i7, objArr, i7 + 1, i8 - i7);
            } else {
                Object[] objArr2 = new Object[androidx.datastore.preferences.protobuf.Y.d(i8, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i7);
                System.arraycopy(this.f9985b, i7, objArr2, i7 + 1, this.f9986c - i7);
                this.f9985b = objArr2;
            }
            this.f9985b[i7] = obj;
            this.f9986c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder k2 = io.flutter.plugins.pathprovider.b.k("Index:", i7, ", Size:");
        k2.append(this.f9986c);
        throw new IndexOutOfBoundsException(k2.toString());
    }
}
