package c6;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Iterator;
/* renamed from: c6.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0641B extends AbstractC0658d {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque f8425a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayDeque f8426b;

    /* renamed from: c  reason: collision with root package name */
    public int f8427c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8428d;

    /* renamed from: e  reason: collision with root package name */
    public static final q2 f8424e = new q2(2);
    public static final q2 f = new q2(3);

    /* renamed from: X  reason: collision with root package name */
    public static final q2 f8421X = new q2(4);

    /* renamed from: Y  reason: collision with root package name */
    public static final q2 f8422Y = new q2(5);

    /* renamed from: Z  reason: collision with root package name */
    public static final q2 f8423Z = new q2(6);

    public C0641B() {
        new ArrayDeque(2);
        this.f8425a = new ArrayDeque();
    }

    @Override // c6.AbstractC0658d
    public final void b() {
        ArrayDeque arrayDeque = this.f8426b;
        ArrayDeque arrayDeque2 = this.f8425a;
        if (arrayDeque == null) {
            this.f8426b = new ArrayDeque(Math.min(arrayDeque2.size(), 16));
        }
        while (!this.f8426b.isEmpty()) {
            ((AbstractC0658d) this.f8426b.remove()).close();
        }
        this.f8428d = true;
        AbstractC0658d abstractC0658d = (AbstractC0658d) arrayDeque2.peek();
        if (abstractC0658d != null) {
            abstractC0658d.b();
        }
    }

    @Override // c6.AbstractC0658d
    public final boolean c() {
        Iterator it = this.f8425a.iterator();
        while (it.hasNext()) {
            if (!((AbstractC0658d) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    @Override // c6.AbstractC0658d, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            ArrayDeque arrayDeque = this.f8425a;
            if (arrayDeque.isEmpty()) {
                break;
            }
            ((AbstractC0658d) arrayDeque.remove()).close();
        }
        if (this.f8426b != null) {
            while (!this.f8426b.isEmpty()) {
                ((AbstractC0658d) this.f8426b.remove()).close();
            }
        }
    }

    @Override // c6.AbstractC0658d
    public final AbstractC0658d d(int i7) {
        AbstractC0658d abstractC0658d;
        int i8;
        AbstractC0658d abstractC0658d2;
        if (i7 <= 0) {
            return H1.f8472a;
        }
        a(i7);
        this.f8427c -= i7;
        C0641B c0641b = null;
        C0641B c0641b2 = null;
        while (true) {
            ArrayDeque arrayDeque = this.f8425a;
            AbstractC0658d abstractC0658d3 = (AbstractC0658d) arrayDeque.peek();
            int o7 = abstractC0658d3.o();
            if (o7 > i7) {
                abstractC0658d2 = abstractC0658d3.d(i7);
                i8 = 0;
            } else {
                if (this.f8428d) {
                    abstractC0658d = abstractC0658d3.d(o7);
                    s();
                } else {
                    abstractC0658d = (AbstractC0658d) arrayDeque.poll();
                }
                AbstractC0658d abstractC0658d4 = abstractC0658d;
                i8 = i7 - o7;
                abstractC0658d2 = abstractC0658d4;
            }
            if (c0641b == null) {
                c0641b = abstractC0658d2;
            } else {
                if (c0641b2 == null) {
                    int i9 = 2;
                    if (i8 != 0) {
                        i9 = Math.min(arrayDeque.size() + 2, 16);
                    }
                    c0641b2 = new C0641B(i9);
                    c0641b2.r(c0641b);
                    c0641b = c0641b2;
                }
                c0641b2.r(abstractC0658d2);
            }
            if (i8 <= 0) {
                return c0641b;
            }
            i7 = i8;
        }
    }

    @Override // c6.AbstractC0658d
    public final void g(OutputStream outputStream, int i7) {
        t(f8423Z, i7, outputStream, 0);
    }

    @Override // c6.AbstractC0658d
    public final void j(ByteBuffer byteBuffer) {
        u(f8422Y, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // c6.AbstractC0658d
    public final void m(byte[] bArr, int i7, int i8) {
        u(f8421X, i8, bArr, i7);
    }

    @Override // c6.AbstractC0658d
    public final int n() {
        return u(f8424e, 1, null, 0);
    }

    @Override // c6.AbstractC0658d
    public final int o() {
        return this.f8427c;
    }

    @Override // c6.AbstractC0658d
    public final void p() {
        if (this.f8428d) {
            ArrayDeque arrayDeque = this.f8425a;
            AbstractC0658d abstractC0658d = (AbstractC0658d) arrayDeque.peek();
            if (abstractC0658d != null) {
                int o7 = abstractC0658d.o();
                abstractC0658d.p();
                this.f8427c = (abstractC0658d.o() - o7) + this.f8427c;
            }
            while (true) {
                AbstractC0658d abstractC0658d2 = (AbstractC0658d) this.f8426b.pollLast();
                if (abstractC0658d2 != null) {
                    abstractC0658d2.p();
                    arrayDeque.addFirst(abstractC0658d2);
                    this.f8427c = abstractC0658d2.o() + this.f8427c;
                } else {
                    return;
                }
            }
        } else {
            throw new InvalidMarkException();
        }
    }

    @Override // c6.AbstractC0658d
    public final void q(int i7) {
        u(f, i7, null, 0);
    }

    public final void r(AbstractC0658d abstractC0658d) {
        boolean z7;
        boolean z8 = this.f8428d;
        ArrayDeque arrayDeque = this.f8425a;
        if (z8 && arrayDeque.isEmpty()) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!(abstractC0658d instanceof C0641B)) {
            arrayDeque.add(abstractC0658d);
            this.f8427c = abstractC0658d.o() + this.f8427c;
        } else {
            C0641B c0641b = (C0641B) abstractC0658d;
            while (!c0641b.f8425a.isEmpty()) {
                arrayDeque.add((AbstractC0658d) c0641b.f8425a.remove());
            }
            this.f8427c += c0641b.f8427c;
            c0641b.f8427c = 0;
            c0641b.close();
        }
        if (z7) {
            ((AbstractC0658d) arrayDeque.peek()).b();
        }
    }

    public final void s() {
        boolean z7 = this.f8428d;
        ArrayDeque arrayDeque = this.f8425a;
        if (z7) {
            this.f8426b.add((AbstractC0658d) arrayDeque.remove());
            AbstractC0658d abstractC0658d = (AbstractC0658d) arrayDeque.peek();
            if (abstractC0658d != null) {
                abstractC0658d.b();
                return;
            }
            return;
        }
        ((AbstractC0658d) arrayDeque.remove()).close();
    }

    public final int t(InterfaceC0640A interfaceC0640A, int i7, Object obj, int i8) {
        a(i7);
        ArrayDeque arrayDeque = this.f8425a;
        if (!arrayDeque.isEmpty() && ((AbstractC0658d) arrayDeque.peek()).o() == 0) {
            s();
        }
        while (i7 > 0 && !arrayDeque.isEmpty()) {
            AbstractC0658d abstractC0658d = (AbstractC0658d) arrayDeque.peek();
            int min = Math.min(i7, abstractC0658d.o());
            i8 = interfaceC0640A.b(abstractC0658d, min, obj, i8);
            i7 -= min;
            this.f8427c -= min;
            if (((AbstractC0658d) arrayDeque.peek()).o() == 0) {
                s();
            }
        }
        if (i7 <= 0) {
            return i8;
        }
        throw new AssertionError("Failed executing read operation");
    }

    public final int u(q2 q2Var, int i7, Object obj, int i8) {
        try {
            return t(q2Var, i7, obj, i8);
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    public C0641B(int i7) {
        new ArrayDeque(2);
        this.f8425a = new ArrayDeque(i7);
    }
}
