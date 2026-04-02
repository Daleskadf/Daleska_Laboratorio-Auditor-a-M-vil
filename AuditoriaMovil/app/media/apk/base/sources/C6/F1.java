package c6;

import java.io.InputStream;
/* loaded from: classes.dex */
public final class F1 extends InputStream implements a6.K {

    /* renamed from: a  reason: collision with root package name */
    public AbstractC0658d f8451a;

    @Override // java.io.InputStream
    public final int available() {
        return this.f8451a.o();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8451a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i7) {
        this.f8451a.b();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f8451a.c();
    }

    @Override // java.io.InputStream
    public final int read() {
        AbstractC0658d abstractC0658d = this.f8451a;
        if (abstractC0658d.o() == 0) {
            return -1;
        }
        return abstractC0658d.n();
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f8451a.p();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        AbstractC0658d abstractC0658d = this.f8451a;
        int min = (int) Math.min(abstractC0658d.o(), j);
        abstractC0658d.q(min);
        return min;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        AbstractC0658d abstractC0658d = this.f8451a;
        if (abstractC0658d.o() == 0) {
            return -1;
        }
        int min = Math.min(abstractC0658d.o(), i8);
        abstractC0658d.m(bArr, i7, min);
        return min;
    }
}
