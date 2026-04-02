package c6;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;
/* renamed from: c6.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0658d implements Closeable {
    public final void a(int i7) {
        if (o() >= i7) {
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public boolean c() {
        return this instanceof G1;
    }

    public abstract AbstractC0658d d(int i7);

    public abstract void g(OutputStream outputStream, int i7);

    public abstract void j(ByteBuffer byteBuffer);

    public abstract void m(byte[] bArr, int i7, int i8);

    public abstract int n();

    public abstract int o();

    public void p() {
        throw new UnsupportedOperationException();
    }

    public abstract void q(int i7);

    public void b() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
