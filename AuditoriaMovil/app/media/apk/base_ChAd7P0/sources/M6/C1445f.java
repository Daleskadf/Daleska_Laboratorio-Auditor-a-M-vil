package m6;

import D.AbstractC0059i;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import x6.InterfaceC2020a;
/* renamed from: m6.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1445f extends AbstractList implements List, InterfaceC2020a {

    /* renamed from: d  reason: collision with root package name */
    public static final Object[] f14069d = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    public int f14070a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f14071b = f14069d;

    /* renamed from: c  reason: collision with root package name */
    public int f14072c;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        int i9 = this.f14072c;
        if (i7 < 0 || i7 > i9) {
            throw new IndexOutOfBoundsException(AbstractC0059i.x("index: ", i7, i9, ", size: "));
        }
        if (i7 == i9) {
            addLast(obj);
        } else if (i7 == 0) {
            addFirst(obj);
        } else {
            f(i9 + 1);
            int i10 = i(this.f14070a + i7);
            int i11 = this.f14072c;
            if (i7 < ((i11 + 1) >> 1)) {
                if (i10 == 0) {
                    Object[] objArr = this.f14071b;
                    kotlin.jvm.internal.j.e(objArr, "<this>");
                    i10 = objArr.length;
                }
                int i12 = i10 - 1;
                int i13 = this.f14070a;
                if (i13 == 0) {
                    Object[] objArr2 = this.f14071b;
                    kotlin.jvm.internal.j.e(objArr2, "<this>");
                    i8 = objArr2.length - 1;
                } else {
                    i8 = i13 - 1;
                }
                int i14 = this.f14070a;
                if (i12 >= i14) {
                    Object[] objArr3 = this.f14071b;
                    objArr3[i8] = objArr3[i14];
                    AbstractC1446g.L(objArr3, i14, objArr3, i14 + 1, i12 + 1);
                } else {
                    Object[] objArr4 = this.f14071b;
                    AbstractC1446g.L(objArr4, i14 - 1, objArr4, i14, objArr4.length);
                    Object[] objArr5 = this.f14071b;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    AbstractC1446g.L(objArr5, 0, objArr5, 1, i12 + 1);
                }
                this.f14071b[i12] = obj;
                this.f14070a = i8;
            } else {
                int i15 = i(this.f14070a + i11);
                if (i10 < i15) {
                    Object[] objArr6 = this.f14071b;
                    AbstractC1446g.L(objArr6, i10 + 1, objArr6, i10, i15);
                } else {
                    Object[] objArr7 = this.f14071b;
                    AbstractC1446g.L(objArr7, 1, objArr7, 0, i15);
                    Object[] objArr8 = this.f14071b;
                    objArr8[0] = objArr8[objArr8.length - 1];
                    AbstractC1446g.L(objArr8, i10 + 1, objArr8, i10, objArr8.length - 1);
                }
                this.f14071b[i10] = obj;
            }
            this.f14072c++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        int i8 = this.f14072c;
        if (i7 >= 0 && i7 <= i8) {
            if (elements.isEmpty()) {
                return false;
            }
            int i9 = this.f14072c;
            if (i7 == i9) {
                return addAll(elements);
            }
            f(elements.size() + i9);
            int i10 = i(this.f14070a + this.f14072c);
            int i11 = i(this.f14070a + i7);
            int size = elements.size();
            if (i7 < ((this.f14072c + 1) >> 1)) {
                int i12 = this.f14070a;
                int i13 = i12 - size;
                if (i11 < i12) {
                    Object[] objArr = this.f14071b;
                    AbstractC1446g.L(objArr, i13, objArr, i12, objArr.length);
                    if (size >= i11) {
                        Object[] objArr2 = this.f14071b;
                        AbstractC1446g.L(objArr2, objArr2.length - size, objArr2, 0, i11);
                    } else {
                        Object[] objArr3 = this.f14071b;
                        AbstractC1446g.L(objArr3, objArr3.length - size, objArr3, 0, size);
                        Object[] objArr4 = this.f14071b;
                        AbstractC1446g.L(objArr4, 0, objArr4, size, i11);
                    }
                } else if (i13 >= 0) {
                    Object[] objArr5 = this.f14071b;
                    AbstractC1446g.L(objArr5, i13, objArr5, i12, i11);
                } else {
                    Object[] objArr6 = this.f14071b;
                    i13 += objArr6.length;
                    int i14 = i11 - i12;
                    int length = objArr6.length - i13;
                    if (length >= i14) {
                        AbstractC1446g.L(objArr6, i13, objArr6, i12, i11);
                    } else {
                        AbstractC1446g.L(objArr6, i13, objArr6, i12, i12 + length);
                        Object[] objArr7 = this.f14071b;
                        AbstractC1446g.L(objArr7, 0, objArr7, this.f14070a + length, i11);
                    }
                }
                this.f14070a = i13;
                int i15 = i11 - size;
                if (i15 < 0) {
                    i15 += this.f14071b.length;
                }
                e(i15, elements);
            } else {
                int i16 = i11 + size;
                if (i11 < i10) {
                    int i17 = size + i10;
                    Object[] objArr8 = this.f14071b;
                    if (i17 <= objArr8.length) {
                        AbstractC1446g.L(objArr8, i16, objArr8, i11, i10);
                    } else if (i16 >= objArr8.length) {
                        AbstractC1446g.L(objArr8, i16 - objArr8.length, objArr8, i11, i10);
                    } else {
                        int length2 = i10 - (i17 - objArr8.length);
                        AbstractC1446g.L(objArr8, 0, objArr8, length2, i10);
                        Object[] objArr9 = this.f14071b;
                        AbstractC1446g.L(objArr9, i16, objArr9, i11, length2);
                    }
                } else {
                    Object[] objArr10 = this.f14071b;
                    AbstractC1446g.L(objArr10, size, objArr10, 0, i10);
                    Object[] objArr11 = this.f14071b;
                    if (i16 >= objArr11.length) {
                        AbstractC1446g.L(objArr11, i16 - objArr11.length, objArr11, i11, objArr11.length);
                    } else {
                        AbstractC1446g.L(objArr11, 0, objArr11, objArr11.length - size, objArr11.length);
                        Object[] objArr12 = this.f14071b;
                        AbstractC1446g.L(objArr12, i16, objArr12, i11, objArr12.length - size);
                    }
                }
                e(i11, elements);
            }
            return true;
        }
        throw new IndexOutOfBoundsException(AbstractC0059i.x("index: ", i7, i8, ", size: "));
    }

    public final void addFirst(Object obj) {
        f(this.f14072c + 1);
        int i7 = this.f14070a;
        if (i7 == 0) {
            Object[] objArr = this.f14071b;
            kotlin.jvm.internal.j.e(objArr, "<this>");
            i7 = objArr.length;
        }
        int i8 = i7 - 1;
        this.f14070a = i8;
        this.f14071b[i8] = obj;
        this.f14072c++;
    }

    public final void addLast(Object obj) {
        f(this.f14072c + 1);
        this.f14071b[i(this.f14070a + this.f14072c)] = obj;
        this.f14072c++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int i7 = i(this.f14070a + this.f14072c);
        int i8 = this.f14070a;
        if (i8 < i7) {
            AbstractC1446g.N(this.f14071b, i8, i7);
        } else if (!isEmpty()) {
            Object[] objArr = this.f14071b;
            AbstractC1446g.N(objArr, this.f14070a, objArr.length);
            AbstractC1446g.N(this.f14071b, 0, i7);
        }
        this.f14070a = 0;
        this.f14072c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void e(int i7, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f14071b.length;
        while (i7 < length && it.hasNext()) {
            this.f14071b[i7] = it.next();
            i7++;
        }
        int i8 = this.f14070a;
        for (int i9 = 0; i9 < i8 && it.hasNext(); i9++) {
            this.f14071b[i9] = it.next();
        }
        this.f14072c = collection.size() + this.f14072c;
    }

    public final void f(int i7) {
        if (i7 >= 0) {
            Object[] objArr = this.f14071b;
            if (i7 <= objArr.length) {
                return;
            }
            if (objArr == f14069d) {
                if (i7 < 10) {
                    i7 = 10;
                }
                this.f14071b = new Object[i7];
                return;
            }
            int length = objArr.length;
            int i8 = length + (length >> 1);
            if (i8 - i7 < 0) {
                i8 = i7;
            }
            if (i8 - 2147483639 > 0) {
                if (i7 > 2147483639) {
                    i8 = Integer.MAX_VALUE;
                } else {
                    i8 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i8];
            AbstractC1446g.L(objArr, 0, objArr2, this.f14070a, objArr.length);
            Object[] objArr3 = this.f14071b;
            int length2 = objArr3.length;
            int i9 = this.f14070a;
            AbstractC1446g.L(objArr3, length2 - i9, objArr2, 0, i9);
            this.f14070a = 0;
            this.f14071b = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        int i8 = this.f14072c;
        if (i7 >= 0 && i7 < i8) {
            return this.f14071b[i(this.f14070a + i7)];
        }
        throw new IndexOutOfBoundsException(AbstractC0059i.x("index: ", i7, i8, ", size: "));
    }

    public final int h(int i7) {
        Object[] objArr = this.f14071b;
        kotlin.jvm.internal.j.e(objArr, "<this>");
        if (i7 == objArr.length - 1) {
            return 0;
        }
        return i7 + 1;
    }

    public final int i(int i7) {
        Object[] objArr = this.f14071b;
        if (i7 >= objArr.length) {
            return i7 - objArr.length;
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i7;
        int i8 = i(this.f14070a + this.f14072c);
        int i9 = this.f14070a;
        if (i9 < i8) {
            while (i9 < i8) {
                if (kotlin.jvm.internal.j.a(obj, this.f14071b[i9])) {
                    i7 = this.f14070a;
                } else {
                    i9++;
                }
            }
            return -1;
        } else if (i9 >= i8) {
            int length = this.f14071b.length;
            while (true) {
                if (i9 < length) {
                    if (kotlin.jvm.internal.j.a(obj, this.f14071b[i9])) {
                        i7 = this.f14070a;
                        break;
                    }
                    i9++;
                } else {
                    for (int i10 = 0; i10 < i8; i10++) {
                        if (kotlin.jvm.internal.j.a(obj, this.f14071b[i10])) {
                            i9 = i10 + this.f14071b.length;
                            i7 = this.f14070a;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i9 - i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.f14072c == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i7;
        int i8 = i(this.f14070a + this.f14072c);
        int i9 = this.f14070a;
        if (i9 < i8) {
            length = i8 - 1;
            if (i9 <= length) {
                while (!kotlin.jvm.internal.j.a(obj, this.f14071b[length])) {
                    if (length != i9) {
                        length--;
                    }
                }
                i7 = this.f14070a;
                return length - i7;
            }
            return -1;
        }
        if (i9 > i8) {
            int i10 = i8 - 1;
            while (true) {
                if (-1 < i10) {
                    if (kotlin.jvm.internal.j.a(obj, this.f14071b[i10])) {
                        length = i10 + this.f14071b.length;
                        i7 = this.f14070a;
                        break;
                    }
                    i10--;
                } else {
                    Object[] objArr = this.f14071b;
                    kotlin.jvm.internal.j.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i11 = this.f14070a;
                    if (i11 <= length) {
                        while (!kotlin.jvm.internal.j.a(obj, this.f14071b[length])) {
                            if (length != i11) {
                                length--;
                            }
                        }
                        i7 = this.f14070a;
                    }
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        int i8 = this.f14072c;
        if (i7 >= 0 && i7 < i8) {
            if (i7 == size() - 1) {
                return removeLast();
            }
            if (i7 == 0) {
                return removeFirst();
            }
            int i9 = i(this.f14070a + i7);
            Object[] objArr = this.f14071b;
            Object obj = objArr[i9];
            if (i7 < (this.f14072c >> 1)) {
                int i10 = this.f14070a;
                if (i9 >= i10) {
                    AbstractC1446g.L(objArr, i10 + 1, objArr, i10, i9);
                } else {
                    AbstractC1446g.L(objArr, 1, objArr, 0, i9);
                    Object[] objArr2 = this.f14071b;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i11 = this.f14070a;
                    AbstractC1446g.L(objArr2, i11 + 1, objArr2, i11, objArr2.length - 1);
                }
                Object[] objArr3 = this.f14071b;
                int i12 = this.f14070a;
                objArr3[i12] = null;
                this.f14070a = h(i12);
            } else {
                int i13 = i((size() - 1) + this.f14070a);
                if (i9 <= i13) {
                    Object[] objArr4 = this.f14071b;
                    AbstractC1446g.L(objArr4, i9, objArr4, i9 + 1, i13 + 1);
                } else {
                    Object[] objArr5 = this.f14071b;
                    AbstractC1446g.L(objArr5, i9, objArr5, i9 + 1, objArr5.length);
                    Object[] objArr6 = this.f14071b;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    AbstractC1446g.L(objArr6, 0, objArr6, 1, i13 + 1);
                }
                this.f14071b[i13] = null;
            }
            this.f14072c--;
            return obj;
        }
        throw new IndexOutOfBoundsException(AbstractC0059i.x("index: ", i7, i8, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int i7;
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty() && this.f14071b.length != 0) {
            int i8 = i(this.f14070a + this.f14072c);
            int i9 = this.f14070a;
            if (i9 < i8) {
                i7 = i9;
                while (i9 < i8) {
                    Object obj = this.f14071b[i9];
                    if (!elements.contains(obj)) {
                        this.f14071b[i7] = obj;
                        i7++;
                    } else {
                        z7 = true;
                    }
                    i9++;
                }
                AbstractC1446g.N(this.f14071b, i7, i8);
            } else {
                int length = this.f14071b.length;
                boolean z8 = false;
                int i10 = i9;
                while (i9 < length) {
                    Object[] objArr = this.f14071b;
                    Object obj2 = objArr[i9];
                    objArr[i9] = null;
                    if (!elements.contains(obj2)) {
                        this.f14071b[i10] = obj2;
                        i10++;
                    } else {
                        z8 = true;
                    }
                    i9++;
                }
                i7 = i(i10);
                for (int i11 = 0; i11 < i8; i11++) {
                    Object[] objArr2 = this.f14071b;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (!elements.contains(obj3)) {
                        this.f14071b[i7] = obj3;
                        i7 = h(i7);
                    } else {
                        z8 = true;
                    }
                }
                z7 = z8;
            }
            if (z7) {
                int i12 = i7 - this.f14070a;
                if (i12 < 0) {
                    i12 += this.f14071b.length;
                }
                this.f14072c = i12;
            }
        }
        return z7;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            Object[] objArr = this.f14071b;
            int i7 = this.f14070a;
            Object obj = objArr[i7];
            objArr[i7] = null;
            this.f14070a = h(i7);
            this.f14072c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            int i7 = i((size() - 1) + this.f14070a);
            Object[] objArr = this.f14071b;
            Object obj = objArr[i7];
            objArr[i7] = null;
            this.f14072c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int i7;
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty() && this.f14071b.length != 0) {
            int i8 = i(this.f14070a + this.f14072c);
            int i9 = this.f14070a;
            if (i9 < i8) {
                i7 = i9;
                while (i9 < i8) {
                    Object obj = this.f14071b[i9];
                    if (elements.contains(obj)) {
                        this.f14071b[i7] = obj;
                        i7++;
                    } else {
                        z7 = true;
                    }
                    i9++;
                }
                AbstractC1446g.N(this.f14071b, i7, i8);
            } else {
                int length = this.f14071b.length;
                boolean z8 = false;
                int i10 = i9;
                while (i9 < length) {
                    Object[] objArr = this.f14071b;
                    Object obj2 = objArr[i9];
                    objArr[i9] = null;
                    if (elements.contains(obj2)) {
                        this.f14071b[i10] = obj2;
                        i10++;
                    } else {
                        z8 = true;
                    }
                    i9++;
                }
                i7 = i(i10);
                for (int i11 = 0; i11 < i8; i11++) {
                    Object[] objArr2 = this.f14071b;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (elements.contains(obj3)) {
                        this.f14071b[i7] = obj3;
                        i7 = h(i7);
                    } else {
                        z8 = true;
                    }
                }
                z7 = z8;
            }
            if (z7) {
                int i12 = i7 - this.f14070a;
                if (i12 < 0) {
                    i12 += this.f14071b.length;
                }
                this.f14072c = i12;
            }
        }
        return z7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        int i8 = this.f14072c;
        if (i7 >= 0 && i7 < i8) {
            int i9 = i(this.f14070a + i7);
            Object[] objArr = this.f14071b;
            Object obj2 = objArr[i9];
            objArr[i9] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(AbstractC0059i.x("index: ", i7, i8, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14072c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f14072c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.j.e(array, "array");
        int length = array.length;
        int i7 = this.f14072c;
        if (length < i7) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i7);
            kotlin.jvm.internal.j.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int i8 = i(this.f14070a + this.f14072c);
        int i9 = this.f14070a;
        if (i9 < i8) {
            AbstractC1446g.M(this.f14071b, i9, array, i8, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f14071b;
            AbstractC1446g.L(objArr, 0, array, this.f14070a, objArr.length);
            Object[] objArr2 = this.f14071b;
            AbstractC1446g.L(objArr2, objArr2.length - this.f14070a, array, 0, i8);
        }
        int i10 = this.f14072c;
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        f(elements.size() + this.f14072c);
        e(i(this.f14070a + this.f14072c), elements);
        return true;
    }
}
