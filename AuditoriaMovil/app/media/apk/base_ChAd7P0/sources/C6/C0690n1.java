package c6;

import D.AbstractC0059i;
import a6.AbstractC0482k;
import a6.C0483l;
import a6.InterfaceC0484m;
import com.google.protobuf.AbstractC0828a;
import com.google.protobuf.AbstractC0865t;
import com.google.protobuf.C0863s;
import com.google.protobuf.C0871w;
import g6.AbstractC1014c;
import g6.C1012a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.logging.Logger;
/* renamed from: c6.n1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0690n1 implements InterfaceC0659d0 {

    /* renamed from: X  reason: collision with root package name */
    public final e5.b f8920X;

    /* renamed from: Y  reason: collision with root package name */
    public final o2 f8921Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f8922Z;

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0655c f8923a;

    /* renamed from: c  reason: collision with root package name */
    public d6.x f8925c;

    /* renamed from: e0  reason: collision with root package name */
    public int f8928e0;

    /* renamed from: g0  reason: collision with root package name */
    public long f8930g0;

    /* renamed from: b  reason: collision with root package name */
    public int f8924b = -1;

    /* renamed from: d  reason: collision with root package name */
    public InterfaceC0484m f8926d = C0483l.f7167b;

    /* renamed from: e  reason: collision with root package name */
    public final Q6.p f8927e = new Q6.p(this, 1);
    public final ByteBuffer f = ByteBuffer.allocate(5);

    /* renamed from: f0  reason: collision with root package name */
    public int f8929f0 = -1;

    public C0690n1(AbstractC0655c abstractC0655c, e5.b bVar, o2 o2Var) {
        this.f8923a = abstractC0655c;
        this.f8920X = bVar;
        this.f8921Y = o2Var;
    }

    public static int i(C1012a c1012a, OutputStream outputStream) {
        AbstractC0828a abstractC0828a = c1012a.f11132a;
        if (abstractC0828a != null) {
            int c8 = ((com.google.protobuf.J) abstractC0828a).c(null);
            AbstractC0828a abstractC0828a2 = c1012a.f11132a;
            abstractC0828a2.getClass();
            int c9 = ((com.google.protobuf.J) abstractC0828a2).c(null);
            Logger logger = AbstractC0865t.f10136d;
            if (c9 > 4096) {
                c9 = 4096;
            }
            C0863s c0863s = new C0863s(outputStream, c9);
            abstractC0828a2.e(c0863s);
            if (c0863s.f10131h > 0) {
                c0863s.U0();
            }
            c1012a.f11132a = null;
            return c8;
        }
        ByteArrayInputStream byteArrayInputStream = c1012a.f11134c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        C0871w c0871w = AbstractC1014c.f11139a;
        G.i.j(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = byteArrayInputStream.read(bArr);
            if (read == -1) {
                int i7 = (int) j;
                c1012a.f11134c = null;
                return i7;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    @Override // c6.InterfaceC0659d0
    public final InterfaceC0659d0 a(InterfaceC0484m interfaceC0484m) {
        this.f8926d = interfaceC0484m;
        return this;
    }

    @Override // c6.InterfaceC0659d0
    public final boolean b() {
        return this.f8922Z;
    }

    @Override // c6.InterfaceC0659d0
    public final void c(int i7) {
        boolean z7;
        if (this.f8924b == -1) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("max size already set", z7);
        this.f8924b = i7;
    }

    @Override // c6.InterfaceC0659d0
    public final void close() {
        if (!this.f8922Z) {
            this.f8922Z = true;
            d6.x xVar = this.f8925c;
            if (xVar != null && xVar.f10496c == 0) {
                this.f8925c = null;
            }
            e(true, true);
        }
    }

    @Override // c6.InterfaceC0659d0
    public final void d(C1012a c1012a) {
        int j;
        if (!this.f8922Z) {
            boolean z7 = true;
            this.f8928e0++;
            int i7 = this.f8929f0 + 1;
            this.f8929f0 = i7;
            this.f8930g0 = 0L;
            o2 o2Var = this.f8921Y;
            for (AbstractC0482k abstractC0482k : o2Var.f8947a) {
                abstractC0482k.i(i7);
            }
            if (this.f8926d == C0483l.f7167b) {
                z7 = false;
            }
            try {
                int available = c1012a.available();
                if (available != 0 && z7) {
                    j = g(c1012a);
                } else {
                    j = j(c1012a, available);
                }
                if (available != -1 && j != available) {
                    throw new a6.q0(a6.o0.f7179m.g(AbstractC0059i.x("Message length inaccurate ", j, available, " != ")));
                }
                long j8 = j;
                AbstractC0482k[] abstractC0482kArr = o2Var.f8947a;
                for (AbstractC0482k abstractC0482k2 : abstractC0482kArr) {
                    abstractC0482k2.k(j8);
                }
                long j9 = this.f8930g0;
                for (AbstractC0482k abstractC0482k3 : abstractC0482kArr) {
                    abstractC0482k3.l(j9);
                }
                int i8 = this.f8929f0;
                long j10 = this.f8930g0;
                for (AbstractC0482k abstractC0482k4 : o2Var.f8947a) {
                    abstractC0482k4.j(i8, j10, j8);
                }
                return;
            } catch (a6.q0 e7) {
                throw e7;
            } catch (IOException e8) {
                throw new a6.q0(a6.o0.f7179m.g("Failed to frame message").f(e8));
            } catch (RuntimeException e9) {
                throw new a6.q0(a6.o0.f7179m.g("Failed to frame message").f(e9));
            }
        }
        throw new IllegalStateException("Framer already closed");
    }

    public final void e(boolean z7, boolean z8) {
        d6.x xVar = this.f8925c;
        this.f8925c = null;
        this.f8923a.v(xVar, z7, z8, this.f8928e0);
        this.f8928e0 = 0;
    }

    public final void f(C0687m1 c0687m1, boolean z7) {
        ArrayList arrayList = c0687m1.f8911a;
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((d6.x) it.next()).f10496c;
        }
        int i8 = this.f8924b;
        if (i8 >= 0 && i7 > i8) {
            a6.o0 o0Var = a6.o0.f7177k;
            Locale locale = Locale.US;
            throw new a6.q0(o0Var.g("message too large " + i7 + " > " + i8));
        }
        ByteBuffer byteBuffer = this.f;
        byteBuffer.clear();
        byteBuffer.put(z7 ? (byte) 1 : (byte) 0).putInt(i7);
        this.f8920X.getClass();
        d6.x l8 = e5.b.l(5);
        l8.a(byteBuffer.array(), 0, byteBuffer.position());
        if (i7 == 0) {
            this.f8925c = l8;
            return;
        }
        AbstractC0655c abstractC0655c = this.f8923a;
        abstractC0655c.v(l8, false, false, this.f8928e0 - 1);
        this.f8928e0 = 1;
        for (int i9 = 0; i9 < arrayList.size() - 1; i9++) {
            abstractC0655c.v((d6.x) arrayList.get(i9), false, false, 0);
        }
        this.f8925c = (d6.x) arrayList.get(arrayList.size() - 1);
        this.f8930g0 = i7;
    }

    @Override // c6.InterfaceC0659d0
    public final void flush() {
        d6.x xVar = this.f8925c;
        if (xVar != null && xVar.f10496c > 0) {
            e(false, true);
        }
    }

    public final int g(C1012a c1012a) {
        C0687m1 c0687m1 = new C0687m1(this);
        OutputStream c8 = this.f8926d.c(c0687m1);
        try {
            int i7 = i(c1012a, c8);
            c8.close();
            int i8 = this.f8924b;
            if (i8 >= 0 && i7 > i8) {
                a6.o0 o0Var = a6.o0.f7177k;
                Locale locale = Locale.US;
                throw new a6.q0(o0Var.g("message too large " + i7 + " > " + i8));
            }
            f(c0687m1, true);
            return i7;
        } catch (Throwable th) {
            c8.close();
            throw th;
        }
    }

    public final void h(byte[] bArr, int i7, int i8) {
        while (i8 > 0) {
            d6.x xVar = this.f8925c;
            if (xVar != null && xVar.f10495b == 0) {
                e(false, false);
            }
            if (this.f8925c == null) {
                this.f8920X.getClass();
                this.f8925c = e5.b.l(i8);
            }
            int min = Math.min(i8, this.f8925c.f10495b);
            this.f8925c.a(bArr, i7, min);
            i7 += min;
            i8 -= min;
        }
    }

    public final int j(C1012a c1012a, int i7) {
        if (i7 != -1) {
            this.f8930g0 = i7;
            int i8 = this.f8924b;
            if (i8 >= 0 && i7 > i8) {
                a6.o0 o0Var = a6.o0.f7177k;
                Locale locale = Locale.US;
                throw new a6.q0(o0Var.g("message too large " + i7 + " > " + i8));
            }
            ByteBuffer byteBuffer = this.f;
            byteBuffer.clear();
            byteBuffer.put((byte) 0).putInt(i7);
            if (this.f8925c == null) {
                int position = byteBuffer.position() + i7;
                this.f8920X.getClass();
                this.f8925c = e5.b.l(position);
            }
            h(byteBuffer.array(), 0, byteBuffer.position());
            return i(c1012a, this.f8927e);
        }
        C0687m1 c0687m1 = new C0687m1(this);
        int i9 = i(c1012a, c0687m1);
        f(c0687m1, false);
        return i9;
    }
}
