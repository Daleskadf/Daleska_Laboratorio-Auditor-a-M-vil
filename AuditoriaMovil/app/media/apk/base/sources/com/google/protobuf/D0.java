package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class D0 extends AbstractC0852m {

    /* renamed from: Z  reason: collision with root package name */
    public static final int[] f9995Z = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, com.google.android.gms.common.api.f.API_PRIORITY_OTHER};

    /* renamed from: X  reason: collision with root package name */
    public final int f9996X;

    /* renamed from: Y  reason: collision with root package name */
    public final int f9997Y;

    /* renamed from: d  reason: collision with root package name */
    public final int f9998d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC0852m f9999e;
    public final AbstractC0852m f;

    public D0(AbstractC0852m abstractC0852m, AbstractC0852m abstractC0852m2) {
        this.f9999e = abstractC0852m;
        this.f = abstractC0852m2;
        int size = abstractC0852m.size();
        this.f9996X = size;
        this.f9998d = abstractC0852m2.size() + size;
        this.f9997Y = Math.max(abstractC0852m.n(), abstractC0852m2.n()) + 1;
    }

    public static int y(int i7) {
        if (i7 >= 47) {
            return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        return f9995Z[i7];
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final ByteBuffer e() {
        return ByteBuffer.wrap(v()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final boolean equals(Object obj) {
        boolean y2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0852m)) {
            return false;
        }
        AbstractC0852m abstractC0852m = (AbstractC0852m) obj;
        int size = abstractC0852m.size();
        int i7 = this.f9998d;
        if (i7 != size) {
            return false;
        }
        if (i7 == 0) {
            return true;
        }
        int i8 = this.f10087a;
        int i9 = abstractC0852m.f10087a;
        if (i8 != 0 && i9 != 0 && i8 != i9) {
            return false;
        }
        com.google.firebase.firestore.i0 i0Var = new com.google.firebase.firestore.i0(this);
        C0850l a7 = i0Var.a();
        com.google.firebase.firestore.i0 i0Var2 = new com.google.firebase.firestore.i0(abstractC0852m);
        C0850l a8 = i0Var2.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size2 = a7.size() - i10;
            int size3 = a8.size() - i11;
            int min = Math.min(size2, size3);
            if (i10 == 0) {
                y2 = a7.y(a8, i11, min);
            } else {
                y2 = a8.y(a7, i10, min);
            }
            if (!y2) {
                return false;
            }
            i12 += min;
            if (i12 >= i7) {
                if (i12 == i7) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size2) {
                a7 = i0Var.a();
                i10 = 0;
            } else {
                i10 += min;
            }
            if (min == size3) {
                a8 = i0Var2.a();
                i11 = 0;
            } else {
                i11 += min;
            }
        }
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final byte h(int i7) {
        AbstractC0852m.i(i7, this.f9998d);
        return o(i7);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0(this);
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final void m(int i7, byte[] bArr, int i8, int i9) {
        int i10 = i7 + i9;
        AbstractC0852m abstractC0852m = this.f9999e;
        int i11 = this.f9996X;
        if (i10 <= i11) {
            abstractC0852m.m(i7, bArr, i8, i9);
            return;
        }
        AbstractC0852m abstractC0852m2 = this.f;
        if (i7 >= i11) {
            abstractC0852m2.m(i7 - i11, bArr, i8, i9);
            return;
        }
        int i12 = i11 - i7;
        abstractC0852m.m(i7, bArr, i8, i12);
        abstractC0852m2.m(0, bArr, i8 + i12, i9 - i12);
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final int n() {
        return this.f9997Y;
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final byte o(int i7) {
        int i8 = this.f9996X;
        if (i7 < i8) {
            return this.f9999e.o(i7);
        }
        return this.f.o(i7 - i8);
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final boolean p() {
        if (this.f9998d >= y(this.f9997Y)) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final boolean q() {
        int t7 = this.f9999e.t(0, 0, this.f9996X);
        AbstractC0852m abstractC0852m = this.f;
        if (abstractC0852m.t(t7, 0, abstractC0852m.size()) != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.protobuf.Y, java.io.InputStream] */
    @Override // com.google.protobuf.AbstractC0852m
    public final J6.b r() {
        boolean z7;
        C0850l c0850l;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.f9997Y);
        arrayDeque.push(this);
        AbstractC0852m abstractC0852m = this.f9999e;
        while (abstractC0852m instanceof D0) {
            D0 d02 = (D0) abstractC0852m;
            arrayDeque.push(d02);
            abstractC0852m = d02.f9999e;
        }
        C0850l c0850l2 = (C0850l) abstractC0852m;
        while (true) {
            if (c0850l2 != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                if (c0850l2 != null) {
                    while (true) {
                        if (arrayDeque.isEmpty()) {
                            c0850l = null;
                            break;
                        }
                        AbstractC0852m abstractC0852m2 = ((D0) arrayDeque.pop()).f;
                        while (abstractC0852m2 instanceof D0) {
                            D0 d03 = (D0) abstractC0852m2;
                            arrayDeque.push(d03);
                            abstractC0852m2 = d03.f9999e;
                        }
                        c0850l = (C0850l) abstractC0852m2;
                        if (!c0850l.isEmpty()) {
                            break;
                        }
                    }
                    arrayList.add(c0850l2.e());
                    c0850l2 = c0850l;
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                Iterator it = arrayList.iterator();
                boolean z8 = false;
                int i7 = 0;
                while (it.hasNext()) {
                    ByteBuffer byteBuffer = (ByteBuffer) it.next();
                    i7 += byteBuffer.remaining();
                    if (byteBuffer.hasArray()) {
                        z8 |= true;
                    } else if (byteBuffer.isDirect()) {
                        z8 |= true;
                    } else {
                        z8 |= true;
                    }
                }
                if (z8) {
                    return new C0856o(i7, arrayList);
                }
                ?? inputStream = new InputStream();
                inputStream.f10042a = arrayList.iterator();
                inputStream.f10044c = 0;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ByteBuffer byteBuffer2 = (ByteBuffer) it2.next();
                    inputStream.f10044c++;
                }
                inputStream.f10045d = -1;
                if (!inputStream.a()) {
                    inputStream.f10043b = V.f10035c;
                    inputStream.f10045d = 0;
                    inputStream.f10046e = 0;
                    inputStream.f10041Z = 0L;
                }
                return new C0858p(inputStream);
            }
        }
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final int s(int i7, int i8, int i9) {
        int i10 = i8 + i9;
        AbstractC0852m abstractC0852m = this.f9999e;
        int i11 = this.f9996X;
        if (i10 <= i11) {
            return abstractC0852m.s(i7, i8, i9);
        }
        AbstractC0852m abstractC0852m2 = this.f;
        if (i8 >= i11) {
            return abstractC0852m2.s(i7, i8 - i11, i9);
        }
        int i12 = i11 - i8;
        return abstractC0852m2.s(abstractC0852m.s(i7, i8, i12), 0, i9 - i12);
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final int size() {
        return this.f9998d;
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final int t(int i7, int i8, int i9) {
        int i10 = i8 + i9;
        AbstractC0852m abstractC0852m = this.f9999e;
        int i11 = this.f9996X;
        if (i10 <= i11) {
            return abstractC0852m.t(i7, i8, i9);
        }
        AbstractC0852m abstractC0852m2 = this.f;
        if (i8 >= i11) {
            return abstractC0852m2.t(i7, i8 - i11, i9);
        }
        int i12 = i11 - i8;
        return abstractC0852m2.t(abstractC0852m.t(i7, i8, i12), 0, i9 - i12);
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final AbstractC0852m u(int i7, int i8) {
        int i9 = this.f9998d;
        int k2 = AbstractC0852m.k(i7, i8, i9);
        if (k2 == 0) {
            return AbstractC0852m.f10085b;
        }
        if (k2 == i9) {
            return this;
        }
        AbstractC0852m abstractC0852m = this.f9999e;
        int i10 = this.f9996X;
        if (i8 <= i10) {
            return abstractC0852m.u(i7, i8);
        }
        AbstractC0852m abstractC0852m2 = this.f;
        if (i7 >= i10) {
            return abstractC0852m2.u(i7 - i10, i8 - i10);
        }
        return new D0(abstractC0852m.u(i7, abstractC0852m.size()), abstractC0852m2.u(0, i8 - i10));
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final String w(Charset charset) {
        return new String(v(), charset);
    }

    @Override // com.google.protobuf.AbstractC0852m
    public final void x(AbstractC0865t abstractC0865t) {
        this.f9999e.x(abstractC0865t);
        this.f.x(abstractC0865t);
    }
}
