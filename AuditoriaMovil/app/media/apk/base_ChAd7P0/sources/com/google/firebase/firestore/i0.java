package com.google.firebase.firestore;

import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.C0850l;
import com.google.protobuf.D0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class i0 implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9811a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9812b;

    /* renamed from: c  reason: collision with root package name */
    public Iterable f9813c;

    public i0(j0 j0Var, e4.d dVar) {
        this.f9813c = j0Var;
        this.f9812b = dVar;
    }

    public C0850l a() {
        C0850l c0850l;
        C0850l c0850l2 = (C0850l) this.f9813c;
        if (c0850l2 != null) {
            do {
                ArrayDeque arrayDeque = (ArrayDeque) this.f9812b;
                if (arrayDeque != null && !arrayDeque.isEmpty()) {
                    AbstractC0852m abstractC0852m = ((D0) arrayDeque.pop()).f;
                    while (abstractC0852m instanceof D0) {
                        D0 d02 = (D0) abstractC0852m;
                        arrayDeque.push(d02);
                        abstractC0852m = d02.f9999e;
                    }
                    c0850l = (C0850l) abstractC0852m;
                } else {
                    c0850l = null;
                    break;
                }
            } while (c0850l.isEmpty());
            this.f9813c = c0850l;
            return c0850l2;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9811a) {
            case 0:
                return ((Iterator) ((e4.d) this.f9812b).f10875b).hasNext();
            default:
                if (((C0850l) this.f9813c) != null) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9811a) {
            case 0:
                q4.n nVar = (q4.n) ((e4.d) this.f9812b).next();
                j0 j0Var = (j0) this.f9813c;
                n4.T t7 = j0Var.f9816b;
                return new r(j0Var.f9817c, nVar.f15362a, nVar, t7.f14325e, t7.f.f10876a.e(nVar.f15362a));
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9811a) {
            case 0:
                throw new UnsupportedOperationException("QuerySnapshot does not support remove().");
            default:
                throw new UnsupportedOperationException();
        }
    }

    public i0(AbstractC0852m abstractC0852m) {
        if (abstractC0852m instanceof D0) {
            D0 d02 = (D0) abstractC0852m;
            ArrayDeque arrayDeque = new ArrayDeque(d02.f9997Y);
            this.f9812b = arrayDeque;
            arrayDeque.push(d02);
            AbstractC0852m abstractC0852m2 = d02.f9999e;
            while (abstractC0852m2 instanceof D0) {
                D0 d03 = (D0) abstractC0852m2;
                ((ArrayDeque) this.f9812b).push(d03);
                abstractC0852m2 = d03.f9999e;
            }
            this.f9813c = (C0850l) abstractC0852m2;
            return;
        }
        this.f9812b = null;
        this.f9813c = (C0850l) abstractC0852m;
    }
}
