package d6;

import Q6.AbstractC0281b;
import c6.AbstractC0658d;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public final class u extends AbstractC0658d {

    /* renamed from: a  reason: collision with root package name */
    public final Q6.e f10492a;

    public u(Q6.e eVar) {
        this.f10492a = eVar;
    }

    @Override // c6.AbstractC0658d, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Q6.e eVar = this.f10492a;
        eVar.r(eVar.f4462b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Q6.e, java.lang.Object] */
    @Override // c6.AbstractC0658d
    public final AbstractC0658d d(int i7) {
        ?? obj = new Object();
        obj.l(this.f10492a, i7);
        return new u(obj);
    }

    @Override // c6.AbstractC0658d
    public final void g(OutputStream out, int i7) {
        long j = i7;
        Q6.e eVar = this.f10492a;
        eVar.getClass();
        kotlin.jvm.internal.j.e(out, "out");
        AbstractC0281b.c(eVar.f4462b, 0L, j);
        Q6.t tVar = eVar.f4461a;
        while (j > 0) {
            kotlin.jvm.internal.j.b(tVar);
            int min = (int) Math.min(j, tVar.f4493c - tVar.f4492b);
            out.write(tVar.f4491a, tVar.f4492b, min);
            int i8 = tVar.f4492b + min;
            tVar.f4492b = i8;
            long j8 = min;
            eVar.f4462b -= j8;
            j -= j8;
            if (i8 == tVar.f4493c) {
                Q6.t a7 = tVar.a();
                eVar.f4461a = a7;
                Q6.u.a(tVar);
                tVar = a7;
            }
        }
    }

    @Override // c6.AbstractC0658d
    public final void j(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // c6.AbstractC0658d
    public final void m(byte[] bArr, int i7, int i8) {
        while (i8 > 0) {
            int read = this.f10492a.read(bArr, i7, i8);
            if (read != -1) {
                i8 -= read;
                i7 += read;
            } else {
                throw new IndexOutOfBoundsException(io.flutter.plugins.pathprovider.b.f("EOF trying to read ", i8, " bytes"));
            }
        }
    }

    @Override // c6.AbstractC0658d
    public final int n() {
        try {
            return this.f10492a.j() & ForkServer.ERROR;
        } catch (EOFException e7) {
            throw new IndexOutOfBoundsException(e7.getMessage());
        }
    }

    @Override // c6.AbstractC0658d
    public final int o() {
        return (int) this.f10492a.f4462b;
    }

    @Override // c6.AbstractC0658d
    public final void q(int i7) {
        try {
            this.f10492a.r(i7);
        } catch (EOFException e7) {
            throw new IndexOutOfBoundsException(e7.getMessage());
        }
    }
}
