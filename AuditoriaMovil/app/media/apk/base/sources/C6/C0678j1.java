package c6;

import a6.AbstractC0482k;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: c6.j1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0678j1 extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public final int f8867a;

    /* renamed from: b  reason: collision with root package name */
    public final o2 f8868b;

    /* renamed from: c  reason: collision with root package name */
    public long f8869c;

    /* renamed from: d  reason: collision with root package name */
    public long f8870d;

    /* renamed from: e  reason: collision with root package name */
    public long f8871e;

    public C0678j1(InputStream inputStream, int i7, o2 o2Var) {
        super(inputStream);
        this.f8871e = -1L;
        this.f8867a = i7;
        this.f8868b = o2Var;
    }

    public final void a() {
        long j = this.f8870d;
        long j8 = this.f8869c;
        if (j > j8) {
            long j9 = j - j8;
            for (AbstractC0482k abstractC0482k : this.f8868b.f8947a) {
                abstractC0482k.f(j9);
            }
            this.f8869c = this.f8870d;
        }
    }

    public final void b() {
        long j = this.f8870d;
        int i7 = this.f8867a;
        if (j <= i7) {
            return;
        }
        a6.o0 o0Var = a6.o0.f7177k;
        throw new a6.q0(o0Var.g("Decompressed gRPC message exceeds maximum size " + i7));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i7) {
        ((FilterInputStream) this).in.mark(i7);
        this.f8871e = this.f8870d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f8870d++;
        }
        b();
        a();
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.f8871e != -1) {
                ((FilterInputStream) this).in.reset();
                this.f8870d = this.f8871e;
            } else {
                throw new IOException("Mark not set");
            }
        } else {
            throw new IOException("Mark not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(j);
        this.f8870d += skip;
        b();
        a();
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        int read = ((FilterInputStream) this).in.read(bArr, i7, i8);
        if (read != -1) {
            this.f8870d += read;
        }
        b();
        a();
        return read;
    }
}
