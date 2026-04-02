package Q6;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class q implements f {

    /* renamed from: a  reason: collision with root package name */
    public final w f4484a;

    /* renamed from: b  reason: collision with root package name */
    public final e f4485b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public boolean f4486c;

    /* JADX WARN: Type inference failed for: r1v1, types: [Q6.e, java.lang.Object] */
    public q(w wVar) {
        this.f4484a = wVar;
    }

    public final void a() {
        if (!this.f4486c) {
            e eVar = this.f4485b;
            long a7 = eVar.a();
            if (a7 > 0) {
                this.f4484a.l(eVar, a7);
                return;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final f b(byte[] source) {
        kotlin.jvm.internal.j.e(source, "source");
        if (!this.f4486c) {
            this.f4485b.w(source, 0, source.length);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final f c(int i7) {
        if (!this.f4486c) {
            this.f4485b.x(i7);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // Q6.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        w wVar = this.f4484a;
        if (!this.f4486c) {
            try {
                e eVar = this.f4485b;
                long j = eVar.f4462b;
                if (j > 0) {
                    wVar.l(eVar, j);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                wVar.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f4486c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final f d(int i7) {
        if (!this.f4486c) {
            e eVar = this.f4485b;
            t u7 = eVar.u(4);
            int i8 = u7.f4493c;
            byte[] bArr = u7.f4491a;
            bArr[i8] = (byte) ((i7 >>> 24) & 255);
            bArr[i8 + 1] = (byte) ((i7 >>> 16) & 255);
            bArr[i8 + 2] = (byte) ((i7 >>> 8) & 255);
            bArr[i8 + 3] = (byte) (i7 & 255);
            u7.f4493c = i8 + 4;
            eVar.f4462b += 4;
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // Q6.w, java.io.Flushable
    public final void flush() {
        if (!this.f4486c) {
            e eVar = this.f4485b;
            long j = eVar.f4462b;
            int i7 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            w wVar = this.f4484a;
            if (i7 > 0) {
                wVar.l(eVar, j);
            }
            wVar.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final f g(String string) {
        kotlin.jvm.internal.j.e(string, "string");
        if (!this.f4486c) {
            this.f4485b.z(string);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f4486c;
    }

    @Override // Q6.w
    public final void l(e source, long j) {
        kotlin.jvm.internal.j.e(source, "source");
        if (!this.f4486c) {
            this.f4485b.l(source, j);
            a();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final String toString() {
        return "buffer(" + this.f4484a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.j.e(source, "source");
        if (!this.f4486c) {
            int write = this.f4485b.write(source);
            a();
            return write;
        }
        throw new IllegalStateException("closed");
    }
}
