package M0;

import java.io.InputStream;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public final class j extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final h f3160a;

    /* renamed from: b  reason: collision with root package name */
    public final l f3161b;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3163d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3164e = false;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f3162c = new byte[1];

    public j(h hVar, l lVar) {
        this.f3160a = hVar;
        this.f3161b = lVar;
    }

    public final void a() {
        if (!this.f3163d) {
            this.f3160a.e(this.f3161b);
            this.f3163d = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f3164e) {
            this.f3160a.close();
            this.f3164e = true;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f3162c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & ForkServer.ERROR;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        K0.a.j(!this.f3164e);
        a();
        int read = this.f3160a.read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
