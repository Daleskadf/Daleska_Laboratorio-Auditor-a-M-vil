package m6;

import D.AbstractC0059i;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class u extends AbstractC1443d implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f14082a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14083b;

    /* renamed from: c  reason: collision with root package name */
    public int f14084c;

    /* renamed from: d  reason: collision with root package name */
    public int f14085d;

    public u(Object[] objArr, int i7) {
        this.f14082a = objArr;
        if (i7 >= 0) {
            if (i7 <= objArr.length) {
                this.f14083b = objArr.length;
                this.f14085d = i7;
                return;
            }
            StringBuilder k2 = io.flutter.plugins.pathprovider.b.k("ring buffer filled size: ", i7, " cannot be larger than the buffer size: ");
            k2.append(objArr.length);
            throw new IllegalArgumentException(k2.toString().toString());
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i7, "ring buffer filled size should not be negative but it is ").toString());
    }

    @Override // m6.AbstractC1443d
    public final int e() {
        return this.f14085d;
    }

    public final void f() {
        if (20 <= this.f14085d) {
            int i7 = this.f14084c;
            int i8 = this.f14083b;
            int i9 = (i7 + 20) % i8;
            Object[] objArr = this.f14082a;
            if (i7 > i9) {
                AbstractC1446g.N(objArr, i7, i8);
                AbstractC1446g.N(objArr, 0, i9);
            } else {
                AbstractC1446g.N(objArr, i7, i9);
            }
            this.f14084c = i9;
            this.f14085d -= 20;
            return;
        }
        throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.f14085d).toString());
    }

    @Override // java.util.List
    public final Object get(int i7) {
        int e7 = e();
        if (i7 >= 0 && i7 < e7) {
            return this.f14082a[(this.f14084c + i7) % this.f14083b];
        }
        throw new IndexOutOfBoundsException(AbstractC0059i.x("index: ", i7, e7, ", size: "));
    }

    @Override // m6.AbstractC1443d, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new t(this);
    }

    @Override // m6.AbstractC1443d, java.util.List, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[e()]);
    }

    @Override // m6.AbstractC1443d, java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        kotlin.jvm.internal.j.e(array, "array");
        int length = array.length;
        int i7 = this.f14085d;
        if (length < i7) {
            array = Arrays.copyOf(array, i7);
            kotlin.jvm.internal.j.d(array, "copyOf(...)");
        }
        int i8 = this.f14085d;
        int i9 = this.f14084c;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            objArr = this.f14082a;
            if (i11 >= i8 || i9 >= this.f14083b) {
                break;
            }
            array[i11] = objArr[i9];
            i11++;
            i9++;
        }
        while (i11 < i8) {
            array[i11] = objArr[i10];
            i11++;
            i10++;
        }
        if (i8 < array.length) {
            array[i8] = null;
        }
        return array;
    }
}
