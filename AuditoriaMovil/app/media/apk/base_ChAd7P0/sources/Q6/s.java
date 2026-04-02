package Q6;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
/* loaded from: classes.dex */
public final class s implements y, ReadableByteChannel {

    /* renamed from: a  reason: collision with root package name */
    public final y f4488a;

    /* renamed from: b  reason: collision with root package name */
    public final e f4489b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4490c;

    /* JADX WARN: Type inference failed for: r2v1, types: [Q6.e, java.lang.Object] */
    public s(y source) {
        kotlin.jvm.internal.j.e(source, "source");
        this.f4488a = source;
        this.f4489b = new Object();
    }

    public final byte a() {
        n(1L);
        return this.f4489b.j();
    }

    public final g b(long j) {
        n(j);
        return this.f4489b.n(j);
    }

    public final int c() {
        n(4L);
        return this.f4489b.o();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.f4490c) {
            this.f4490c = true;
            this.f4488a.close();
            e eVar = this.f4489b;
            eVar.r(eVar.f4462b);
        }
    }

    public final int d() {
        n(4L);
        int o7 = this.f4489b.o();
        return ((o7 & 255) << 24) | (((-16777216) & o7) >>> 24) | ((16711680 & o7) >>> 8) | ((65280 & o7) << 8);
    }

    public final long g() {
        long j;
        n(8L);
        e eVar = this.f4489b;
        if (eVar.f4462b >= 8) {
            t tVar = eVar.f4461a;
            kotlin.jvm.internal.j.b(tVar);
            int i7 = tVar.f4492b;
            int i8 = tVar.f4493c;
            if (i8 - i7 < 8) {
                j = ((eVar.o() & 4294967295L) << 32) | (4294967295L & eVar.o());
            } else {
                byte[] bArr = tVar.f4491a;
                long j8 = ((bArr[i7] & 255) << 56) | ((bArr[i7 + 1] & 255) << 48) | ((bArr[i7 + 2] & 255) << 40);
                int i9 = i7 + 7;
                int i10 = i7 + 8;
                long j9 = j8 | ((bArr[i7 + 3] & 255) << 32) | ((bArr[i7 + 4] & 255) << 24) | ((bArr[i7 + 5] & 255) << 16) | ((bArr[i7 + 6] & 255) << 8) | (bArr[i9] & 255);
                eVar.f4462b -= 8;
                if (i10 == i8) {
                    eVar.f4461a = tVar.a();
                    u.a(tVar);
                } else {
                    tVar.f4492b = i10;
                }
                j = j9;
            }
            return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
        }
        throw new EOFException();
    }

    @Override // Q6.y
    public final long i(e sink, long j) {
        kotlin.jvm.internal.j.e(sink, "sink");
        if (j >= 0) {
            if (!this.f4490c) {
                e eVar = this.f4489b;
                if (eVar.f4462b == 0 && this.f4488a.i(eVar, 8192L) == -1) {
                    return -1L;
                }
                return eVar.i(sink, Math.min(j, eVar.f4462b));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.g("byteCount < 0: ", j).toString());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f4490c;
    }

    public final short j() {
        n(2L);
        short p7 = this.f4489b.p();
        return (short) (((p7 & 255) << 8) | ((65280 & p7) >>> 8));
    }

    public final String m(long j) {
        n(j);
        e eVar = this.f4489b;
        eVar.getClass();
        return eVar.q(j, E6.a.f1074a);
    }

    public final void n(long j) {
        e eVar;
        if (j >= 0) {
            if (!this.f4490c) {
                do {
                    eVar = this.f4489b;
                    if (eVar.f4462b >= j) {
                        return;
                    }
                } while (this.f4488a.i(eVar, 8192L) != -1);
                throw new EOFException();
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.g("byteCount < 0: ", j).toString());
    }

    public final void o(long j) {
        if (!this.f4490c) {
            while (j > 0) {
                e eVar = this.f4489b;
                if (eVar.f4462b == 0 && this.f4488a.i(eVar, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, eVar.f4462b);
                eVar.r(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.j.e(sink, "sink");
        e eVar = this.f4489b;
        if (eVar.f4462b == 0 && this.f4488a.i(eVar, 8192L) == -1) {
            return -1;
        }
        return eVar.read(sink);
    }

    public final String toString() {
        return "buffer(" + this.f4488a + ')';
    }
}
