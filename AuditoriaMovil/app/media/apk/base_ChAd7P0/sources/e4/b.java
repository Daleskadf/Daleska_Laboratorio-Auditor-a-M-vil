package e4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import q4.n;
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f10871a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f10872b;

    /* renamed from: c  reason: collision with root package name */
    public final Comparator f10873c;

    public b() {
        K1.d dVar = q4.h.f15355b;
        this.f10871a = new Object[0];
        this.f10872b = new Object[0];
        this.f10873c = dVar;
    }

    @Override // e4.c
    public final boolean e(Object obj) {
        if (p(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // e4.c
    public final Object f(q4.h hVar) {
        int p7 = p(hVar);
        if (p7 != -1) {
            return this.f10872b[p7];
        }
        return null;
    }

    @Override // e4.c
    public final Comparator h() {
        return this.f10873c;
    }

    @Override // e4.c
    public final Object i() {
        Object[] objArr = this.f10871a;
        if (objArr.length > 0) {
            return objArr[objArr.length - 1];
        }
        return null;
    }

    @Override // e4.c
    public final boolean isEmpty() {
        if (this.f10871a.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a(this, 0);
    }

    @Override // e4.c
    public final Object k() {
        Object[] objArr = this.f10871a;
        if (objArr.length > 0) {
            return objArr[0];
        }
        return null;
    }

    @Override // e4.c
    public final int l(n nVar) {
        return p(nVar);
    }

    @Override // e4.c
    public final c m(Object obj, Object obj2) {
        int length;
        int length2;
        int p7 = p(obj);
        Comparator comparator = this.f10873c;
        Object[] objArr = this.f10872b;
        Object[] objArr2 = this.f10871a;
        if (p7 != -1) {
            if (objArr2[p7] == obj && objArr[p7] == obj2) {
                return this;
            }
            int length3 = objArr2.length;
            Object[] objArr3 = new Object[length3];
            System.arraycopy(objArr2, 0, objArr3, 0, length3);
            objArr3[p7] = obj;
            int length4 = objArr.length;
            Object[] objArr4 = new Object[length4];
            System.arraycopy(objArr, 0, objArr4, 0, length4);
            objArr4[p7] = obj2;
            return new b(comparator, objArr3, objArr4);
        } else if (objArr2.length > 25) {
            HashMap hashMap = new HashMap(objArr2.length + 1);
            for (int i7 = 0; i7 < objArr2.length; i7++) {
                hashMap.put(objArr2[i7], objArr[i7]);
            }
            hashMap.put(obj, obj2);
            return E.e.v(new ArrayList(hashMap.keySet()), hashMap, comparator);
        } else {
            int i8 = 0;
            while (i8 < objArr2.length && comparator.compare(objArr2[i8], obj) < 0) {
                i8++;
            }
            Object[] objArr5 = new Object[objArr2.length + 1];
            System.arraycopy(objArr2, 0, objArr5, 0, i8);
            objArr5[i8] = obj;
            int i9 = i8 + 1;
            System.arraycopy(objArr2, i8, objArr5, i9, (length - i8) - 1);
            Object[] objArr6 = new Object[objArr.length + 1];
            System.arraycopy(objArr, 0, objArr6, 0, i8);
            objArr6[i8] = obj2;
            System.arraycopy(objArr, i8, objArr6, i9, (length2 - i8) - 1);
            return new b(comparator, objArr5, objArr6);
        }
    }

    @Override // e4.c
    public final Iterator n(Object obj) {
        int i7 = 0;
        while (true) {
            Object[] objArr = this.f10871a;
            if (i7 >= objArr.length || this.f10873c.compare(objArr[i7], obj) >= 0) {
                break;
            }
            i7++;
        }
        return new a(this, i7);
    }

    @Override // e4.c
    public final c o(Object obj) {
        int p7 = p(obj);
        if (p7 == -1) {
            return this;
        }
        Object[] objArr = this.f10871a;
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, p7);
        int i7 = p7 + 1;
        System.arraycopy(objArr, i7, objArr2, p7, length - p7);
        Object[] objArr3 = this.f10872b;
        int length2 = objArr3.length - 1;
        Object[] objArr4 = new Object[length2];
        System.arraycopy(objArr3, 0, objArr4, 0, p7);
        System.arraycopy(objArr3, i7, objArr4, p7, length2 - p7);
        return new b(this.f10873c, objArr2, objArr4);
    }

    public final int p(Object obj) {
        int i7 = 0;
        for (Object obj2 : this.f10871a) {
            if (this.f10873c.compare(obj, obj2) == 0) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    @Override // e4.c
    public final int size() {
        return this.f10871a.length;
    }

    public b(Comparator comparator, Object[] objArr, Object[] objArr2) {
        this.f10871a = objArr;
        this.f10872b = objArr2;
        this.f10873c = comparator;
    }
}
