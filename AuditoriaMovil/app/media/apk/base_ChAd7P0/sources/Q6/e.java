package Q6;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import m6.AbstractC1446g;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class e implements y, ReadableByteChannel, f, Cloneable, ByteChannel {

    /* renamed from: a  reason: collision with root package name */
    public t f4461a;

    /* renamed from: b  reason: collision with root package name */
    public long f4462b;

    public final long a() {
        long j = this.f4462b;
        if (j == 0) {
            return 0L;
        }
        t tVar = this.f4461a;
        kotlin.jvm.internal.j.b(tVar);
        t tVar2 = tVar.f4496g;
        kotlin.jvm.internal.j.b(tVar2);
        int i7 = tVar2.f4493c;
        if (i7 < 8192 && tVar2.f4495e) {
            j -= i7 - tVar2.f4492b;
        }
        return j;
    }

    public final boolean b() {
        if (this.f4462b == 0) {
            return true;
        }
        return false;
    }

    public final byte c(long j) {
        AbstractC0281b.c(this.f4462b, j, 1L);
        t tVar = this.f4461a;
        if (tVar != null) {
            long j8 = this.f4462b;
            if (j8 - j < j) {
                while (j8 > j) {
                    tVar = tVar.f4496g;
                    kotlin.jvm.internal.j.b(tVar);
                    j8 -= tVar.f4493c - tVar.f4492b;
                }
                return tVar.f4491a[(int) ((tVar.f4492b + j) - j8)];
            }
            long j9 = 0;
            while (true) {
                int i7 = tVar.f4493c;
                int i8 = tVar.f4492b;
                long j10 = (i7 - i8) + j9;
                if (j10 <= j) {
                    tVar = tVar.f;
                    kotlin.jvm.internal.j.b(tVar);
                    j9 = j10;
                } else {
                    return tVar.f4491a[(int) ((i8 + j) - j9)];
                }
            }
        } else {
            kotlin.jvm.internal.j.b(null);
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Q6.e, java.lang.Object] */
    public final Object clone() {
        ?? obj = new Object();
        if (this.f4462b != 0) {
            t tVar = this.f4461a;
            kotlin.jvm.internal.j.b(tVar);
            t c8 = tVar.c();
            obj.f4461a = c8;
            c8.f4496g = c8;
            c8.f = c8;
            for (t tVar2 = tVar.f; tVar2 != tVar; tVar2 = tVar2.f) {
                t tVar3 = c8.f4496g;
                kotlin.jvm.internal.j.b(tVar3);
                kotlin.jvm.internal.j.b(tVar2);
                tVar3.b(tVar2.c());
            }
            obj.f4462b = this.f4462b;
        }
        return obj;
    }

    public final long d(g targetBytes) {
        int i7;
        int i8;
        kotlin.jvm.internal.j.e(targetBytes, "targetBytes");
        t tVar = this.f4461a;
        if (tVar == null) {
            return -1L;
        }
        long j = this.f4462b;
        long j8 = 0;
        int i9 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        byte[] bArr = targetBytes.f4464a;
        if (i9 < 0) {
            while (j > 0) {
                tVar = tVar.f4496g;
                kotlin.jvm.internal.j.b(tVar);
                j -= tVar.f4493c - tVar.f4492b;
            }
            if (bArr.length == 2) {
                byte b5 = bArr[0];
                byte b7 = bArr[1];
                while (j < this.f4462b) {
                    i7 = (int) ((tVar.f4492b + j8) - j);
                    int i10 = tVar.f4493c;
                    while (i7 < i10) {
                        byte b8 = tVar.f4491a[i7];
                        if (b8 != b5 && b8 != b7) {
                            i7++;
                        }
                        i8 = tVar.f4492b;
                    }
                    j8 = (tVar.f4493c - tVar.f4492b) + j;
                    tVar = tVar.f;
                    kotlin.jvm.internal.j.b(tVar);
                    j = j8;
                }
                return -1L;
            }
            while (j < this.f4462b) {
                i7 = (int) ((tVar.f4492b + j8) - j);
                int i11 = tVar.f4493c;
                while (i7 < i11) {
                    byte b9 = tVar.f4491a[i7];
                    for (byte b10 : bArr) {
                        if (b9 == b10) {
                            i8 = tVar.f4492b;
                        }
                    }
                    i7++;
                }
                j8 = (tVar.f4493c - tVar.f4492b) + j;
                tVar = tVar.f;
                kotlin.jvm.internal.j.b(tVar);
                j = j8;
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j9 = (tVar.f4493c - tVar.f4492b) + j;
            if (j9 > 0) {
                break;
            }
            tVar = tVar.f;
            kotlin.jvm.internal.j.b(tVar);
            j = j9;
        }
        if (bArr.length == 2) {
            byte b11 = bArr[0];
            byte b12 = bArr[1];
            while (j < this.f4462b) {
                i7 = (int) ((tVar.f4492b + j8) - j);
                int i12 = tVar.f4493c;
                while (i7 < i12) {
                    byte b13 = tVar.f4491a[i7];
                    if (b13 != b11 && b13 != b12) {
                        i7++;
                    }
                    i8 = tVar.f4492b;
                }
                j8 = (tVar.f4493c - tVar.f4492b) + j;
                tVar = tVar.f;
                kotlin.jvm.internal.j.b(tVar);
                j = j8;
            }
            return -1L;
        }
        while (j < this.f4462b) {
            i7 = (int) ((tVar.f4492b + j8) - j);
            int i13 = tVar.f4493c;
            while (i7 < i13) {
                byte b14 = tVar.f4491a[i7];
                for (byte b15 : bArr) {
                    if (b14 == b15) {
                        i8 = tVar.f4492b;
                    }
                }
                i7++;
            }
            j8 = (tVar.f4493c - tVar.f4492b) + j;
            tVar = tVar.f;
            kotlin.jvm.internal.j.b(tVar);
            j = j8;
        }
        return -1L;
        return (i7 - i8) + j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                long j = this.f4462b;
                e eVar = (e) obj;
                if (j == eVar.f4462b) {
                    if (j != 0) {
                        t tVar = this.f4461a;
                        kotlin.jvm.internal.j.b(tVar);
                        t tVar2 = eVar.f4461a;
                        kotlin.jvm.internal.j.b(tVar2);
                        int i7 = tVar.f4492b;
                        int i8 = tVar2.f4492b;
                        long j8 = 0;
                        while (j8 < this.f4462b) {
                            long min = Math.min(tVar.f4493c - i7, tVar2.f4493c - i8);
                            long j9 = 0;
                            while (j9 < min) {
                                int i9 = i7 + 1;
                                byte b5 = tVar.f4491a[i7];
                                int i10 = i8 + 1;
                                if (b5 == tVar2.f4491a[i8]) {
                                    j9++;
                                    i8 = i10;
                                    i7 = i9;
                                }
                            }
                            if (i7 == tVar.f4493c) {
                                t tVar3 = tVar.f;
                                kotlin.jvm.internal.j.b(tVar3);
                                i7 = tVar3.f4492b;
                                tVar = tVar3;
                            }
                            if (i8 == tVar2.f4493c) {
                                tVar2 = tVar2.f;
                                kotlin.jvm.internal.j.b(tVar2);
                                i8 = tVar2.f4492b;
                            }
                            j8 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean g(g bytes) {
        kotlin.jvm.internal.j.e(bytes, "bytes");
        byte[] bArr = bytes.f4464a;
        int length = bArr.length;
        if (length < 0 || this.f4462b < length || bArr.length < length) {
            return false;
        }
        for (int i7 = 0; i7 < length; i7++) {
            if (c(i7) != bArr[i7]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        t tVar = this.f4461a;
        if (tVar == null) {
            return 0;
        }
        int i7 = 1;
        do {
            int i8 = tVar.f4493c;
            for (int i9 = tVar.f4492b; i9 < i8; i9++) {
                i7 = (i7 * 31) + tVar.f4491a[i9];
            }
            tVar = tVar.f;
            kotlin.jvm.internal.j.b(tVar);
        } while (tVar != this.f4461a);
        return i7;
    }

    @Override // Q6.y
    public final long i(e sink, long j) {
        kotlin.jvm.internal.j.e(sink, "sink");
        if (j >= 0) {
            long j8 = this.f4462b;
            if (j8 == 0) {
                return -1L;
            }
            if (j > j8) {
                j = j8;
            }
            sink.l(this, j);
            return j;
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.g("byteCount < 0: ", j).toString());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final byte j() {
        if (this.f4462b != 0) {
            t tVar = this.f4461a;
            kotlin.jvm.internal.j.b(tVar);
            int i7 = tVar.f4492b;
            int i8 = tVar.f4493c;
            int i9 = i7 + 1;
            byte b5 = tVar.f4491a[i7];
            this.f4462b--;
            if (i9 == i8) {
                this.f4461a = tVar.a();
                u.a(tVar);
            } else {
                tVar.f4492b = i9;
            }
            return b5;
        }
        throw new EOFException();
    }

    @Override // Q6.w
    public final void l(e source, long j) {
        t tVar;
        t tVar2;
        t b5;
        int i7;
        kotlin.jvm.internal.j.e(source, "source");
        if (source != this) {
            AbstractC0281b.c(source.f4462b, 0L, j);
            while (j > 0) {
                t tVar3 = source.f4461a;
                kotlin.jvm.internal.j.b(tVar3);
                int i8 = tVar3.f4493c;
                kotlin.jvm.internal.j.b(source.f4461a);
                int i9 = (j > (i8 - tVar.f4492b) ? 1 : (j == (i8 - tVar.f4492b) ? 0 : -1));
                int i10 = 0;
                if (i9 < 0) {
                    t tVar4 = this.f4461a;
                    if (tVar4 != null) {
                        tVar2 = tVar4.f4496g;
                    } else {
                        tVar2 = null;
                    }
                    if (tVar2 != null && tVar2.f4495e) {
                        long j8 = tVar2.f4493c + j;
                        if (tVar2.f4494d) {
                            i7 = 0;
                        } else {
                            i7 = tVar2.f4492b;
                        }
                        if (j8 - i7 <= 8192) {
                            t tVar5 = source.f4461a;
                            kotlin.jvm.internal.j.b(tVar5);
                            tVar5.d(tVar2, (int) j);
                            source.f4462b -= j;
                            this.f4462b += j;
                            return;
                        }
                    }
                    t tVar6 = source.f4461a;
                    kotlin.jvm.internal.j.b(tVar6);
                    int i11 = (int) j;
                    if (i11 > 0 && i11 <= tVar6.f4493c - tVar6.f4492b) {
                        if (i11 >= 1024) {
                            b5 = tVar6.c();
                        } else {
                            b5 = u.b();
                            int i12 = tVar6.f4492b;
                            AbstractC1446g.K(tVar6.f4491a, 0, b5.f4491a, i12, i12 + i11);
                        }
                        b5.f4493c = b5.f4492b + i11;
                        tVar6.f4492b += i11;
                        t tVar7 = tVar6.f4496g;
                        kotlin.jvm.internal.j.b(tVar7);
                        tVar7.b(b5);
                        source.f4461a = b5;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range");
                    }
                }
                t tVar8 = source.f4461a;
                kotlin.jvm.internal.j.b(tVar8);
                long j9 = tVar8.f4493c - tVar8.f4492b;
                source.f4461a = tVar8.a();
                t tVar9 = this.f4461a;
                if (tVar9 == null) {
                    this.f4461a = tVar8;
                    tVar8.f4496g = tVar8;
                    tVar8.f = tVar8;
                } else {
                    t tVar10 = tVar9.f4496g;
                    kotlin.jvm.internal.j.b(tVar10);
                    tVar10.b(tVar8);
                    t tVar11 = tVar8.f4496g;
                    if (tVar11 != tVar8) {
                        kotlin.jvm.internal.j.b(tVar11);
                        if (tVar11.f4495e) {
                            int i13 = tVar8.f4493c - tVar8.f4492b;
                            t tVar12 = tVar8.f4496g;
                            kotlin.jvm.internal.j.b(tVar12);
                            int i14 = 8192 - tVar12.f4493c;
                            t tVar13 = tVar8.f4496g;
                            kotlin.jvm.internal.j.b(tVar13);
                            if (!tVar13.f4494d) {
                                t tVar14 = tVar8.f4496g;
                                kotlin.jvm.internal.j.b(tVar14);
                                i10 = tVar14.f4492b;
                            }
                            if (i13 <= i14 + i10) {
                                t tVar15 = tVar8.f4496g;
                                kotlin.jvm.internal.j.b(tVar15);
                                tVar8.d(tVar15, i13);
                                tVar8.a();
                                u.a(tVar8);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact");
                    }
                }
                source.f4462b -= j9;
                this.f4462b += j9;
                j -= j9;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public final byte[] m(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.f4462b >= j) {
                int i7 = (int) j;
                byte[] bArr = new byte[i7];
                int i8 = 0;
                while (i8 < i7) {
                    int read = read(bArr, i8, i7 - i8);
                    if (read != -1) {
                        i8 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.g("byteCount: ", j).toString());
    }

    public final g n(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.f4462b >= j) {
                if (j >= 4096) {
                    g t7 = t((int) j);
                    r(j);
                    return t7;
                }
                return new g(m(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.g("byteCount: ", j).toString());
    }

    public final int o() {
        if (this.f4462b >= 4) {
            t tVar = this.f4461a;
            kotlin.jvm.internal.j.b(tVar);
            int i7 = tVar.f4492b;
            int i8 = tVar.f4493c;
            if (i8 - i7 < 4) {
                return ((j() & ForkServer.ERROR) << 24) | ((j() & ForkServer.ERROR) << 16) | ((j() & ForkServer.ERROR) << 8) | (j() & ForkServer.ERROR);
            }
            byte[] bArr = tVar.f4491a;
            int i9 = ((bArr[i7 + 1] & ForkServer.ERROR) << 16) | ((bArr[i7] & ForkServer.ERROR) << 24);
            int i10 = i7 + 3;
            int i11 = i7 + 4;
            int i12 = i9 | ((bArr[i7 + 2] & ForkServer.ERROR) << 8) | (bArr[i10] & ForkServer.ERROR);
            this.f4462b -= 4;
            if (i11 == i8) {
                this.f4461a = tVar.a();
                u.a(tVar);
            } else {
                tVar.f4492b = i11;
            }
            return i12;
        }
        throw new EOFException();
    }

    public final short p() {
        if (this.f4462b >= 2) {
            t tVar = this.f4461a;
            kotlin.jvm.internal.j.b(tVar);
            int i7 = tVar.f4492b;
            int i8 = tVar.f4493c;
            if (i8 - i7 < 2) {
                return (short) (((j() & ForkServer.ERROR) << 8) | (j() & ForkServer.ERROR));
            }
            int i9 = i7 + 1;
            byte[] bArr = tVar.f4491a;
            int i10 = i7 + 2;
            int i11 = (bArr[i9] & ForkServer.ERROR) | ((bArr[i7] & ForkServer.ERROR) << 8);
            this.f4462b -= 2;
            if (i10 == i8) {
                this.f4461a = tVar.a();
                u.a(tVar);
            } else {
                tVar.f4492b = i10;
            }
            return (short) i11;
        }
        throw new EOFException();
    }

    public final String q(long j, Charset charset) {
        kotlin.jvm.internal.j.e(charset, "charset");
        int i7 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i7 >= 0 && j <= 2147483647L) {
            if (this.f4462b >= j) {
                if (i7 == 0) {
                    return StringUtils.EMPTY;
                }
                t tVar = this.f4461a;
                kotlin.jvm.internal.j.b(tVar);
                int i8 = tVar.f4492b;
                if (i8 + j > tVar.f4493c) {
                    return new String(m(j), charset);
                }
                int i9 = (int) j;
                String str = new String(tVar.f4491a, i8, i9, charset);
                int i10 = tVar.f4492b + i9;
                tVar.f4492b = i10;
                this.f4462b -= j;
                if (i10 == tVar.f4493c) {
                    this.f4461a = tVar.a();
                    u.a(tVar);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.g("byteCount: ", j).toString());
    }

    public final void r(long j) {
        while (j > 0) {
            t tVar = this.f4461a;
            if (tVar != null) {
                int min = (int) Math.min(j, tVar.f4493c - tVar.f4492b);
                long j8 = min;
                this.f4462b -= j8;
                j -= j8;
                int i7 = tVar.f4492b + min;
                tVar.f4492b = i7;
                if (i7 == tVar.f4493c) {
                    this.f4461a = tVar.a();
                    u.a(tVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.j.e(sink, "sink");
        t tVar = this.f4461a;
        if (tVar == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), tVar.f4493c - tVar.f4492b);
        sink.put(tVar.f4491a, tVar.f4492b, min);
        int i7 = tVar.f4492b + min;
        tVar.f4492b = i7;
        this.f4462b -= min;
        if (i7 == tVar.f4493c) {
            this.f4461a = tVar.a();
            u.a(tVar);
        }
        return min;
    }

    public final g s() {
        long j = this.f4462b;
        if (j <= 2147483647L) {
            return t((int) j);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f4462b).toString());
    }

    public final g t(int i7) {
        if (i7 == 0) {
            return g.f4463d;
        }
        AbstractC0281b.c(this.f4462b, 0L, i7);
        t tVar = this.f4461a;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            kotlin.jvm.internal.j.b(tVar);
            int i11 = tVar.f4493c;
            int i12 = tVar.f4492b;
            if (i11 != i12) {
                i9 += i11 - i12;
                i10++;
                tVar = tVar.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i10];
        int[] iArr = new int[i10 * 2];
        t tVar2 = this.f4461a;
        int i13 = 0;
        while (i8 < i7) {
            kotlin.jvm.internal.j.b(tVar2);
            bArr[i13] = tVar2.f4491a;
            i8 += tVar2.f4493c - tVar2.f4492b;
            iArr[i13] = Math.min(i8, i7);
            iArr[i13 + i10] = tVar2.f4492b;
            tVar2.f4494d = true;
            i13++;
            tVar2 = tVar2.f;
        }
        return new v(bArr, iArr);
    }

    public final String toString() {
        return s().toString();
    }

    public final t u(int i7) {
        if (i7 >= 1 && i7 <= 8192) {
            t tVar = this.f4461a;
            if (tVar == null) {
                t b5 = u.b();
                this.f4461a = b5;
                b5.f4496g = b5;
                b5.f = b5;
                return b5;
            }
            t tVar2 = tVar.f4496g;
            kotlin.jvm.internal.j.b(tVar2);
            if (tVar2.f4493c + i7 <= 8192 && tVar2.f4495e) {
                return tVar2;
            }
            t b7 = u.b();
            tVar2.b(b7);
            return b7;
        }
        throw new IllegalArgumentException("unexpected capacity");
    }

    public final void v(g byteString) {
        kotlin.jvm.internal.j.e(byteString, "byteString");
        byteString.s(this, byteString.c());
    }

    public final void w(byte[] source, int i7, int i8) {
        kotlin.jvm.internal.j.e(source, "source");
        long j = i8;
        AbstractC0281b.c(source.length, i7, j);
        int i9 = i8 + i7;
        while (i7 < i9) {
            t u7 = u(1);
            int min = Math.min(i9 - i7, 8192 - u7.f4493c);
            int i10 = i7 + min;
            AbstractC1446g.K(source, u7.f4493c, u7.f4491a, i7, i10);
            u7.f4493c += min;
            i7 = i10;
        }
        this.f4462b += j;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.j.e(source, "source");
        int remaining = source.remaining();
        int i7 = remaining;
        while (i7 > 0) {
            t u7 = u(1);
            int min = Math.min(i7, 8192 - u7.f4493c);
            source.get(u7.f4491a, u7.f4493c, min);
            i7 -= min;
            u7.f4493c += min;
        }
        this.f4462b += remaining;
        return remaining;
    }

    public final void x(int i7) {
        t u7 = u(1);
        int i8 = u7.f4493c;
        u7.f4493c = i8 + 1;
        u7.f4491a[i8] = (byte) i7;
        this.f4462b++;
    }

    public final void y(int i7, String string) {
        char charAt;
        char c8;
        kotlin.jvm.internal.j.e(string, "string");
        if (i7 >= 0) {
            if (i7 <= string.length()) {
                int i8 = 0;
                while (i8 < i7) {
                    char charAt2 = string.charAt(i8);
                    if (charAt2 < 128) {
                        t u7 = u(1);
                        int i9 = u7.f4493c - i8;
                        int min = Math.min(i7, 8192 - i9);
                        int i10 = i8 + 1;
                        byte[] bArr = u7.f4491a;
                        bArr[i8 + i9] = (byte) charAt2;
                        while (true) {
                            i8 = i10;
                            if (i8 >= min || (charAt = string.charAt(i8)) >= 128) {
                                break;
                            }
                            i10 = i8 + 1;
                            bArr[i8 + i9] = (byte) charAt;
                        }
                        int i11 = u7.f4493c;
                        int i12 = (i9 + i8) - i11;
                        u7.f4493c = i11 + i12;
                        this.f4462b += i12;
                    } else {
                        if (charAt2 < 2048) {
                            t u8 = u(2);
                            int i13 = u8.f4493c;
                            byte[] bArr2 = u8.f4491a;
                            bArr2[i13] = (byte) ((charAt2 >> 6) | 192);
                            bArr2[i13 + 1] = (byte) ((charAt2 & '?') | RecognitionOptions.ITF);
                            u8.f4493c = i13 + 2;
                            this.f4462b += 2;
                        } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                            int i14 = i8 + 1;
                            if (i14 < i7) {
                                c8 = string.charAt(i14);
                            } else {
                                c8 = 0;
                            }
                            if (charAt2 <= 56319 && 56320 <= c8 && c8 < 57344) {
                                int i15 = (((charAt2 & 1023) << 10) | (c8 & 1023)) + 65536;
                                t u9 = u(4);
                                int i16 = u9.f4493c;
                                byte[] bArr3 = u9.f4491a;
                                bArr3[i16] = (byte) ((i15 >> 18) | 240);
                                bArr3[i16 + 1] = (byte) (((i15 >> 12) & 63) | RecognitionOptions.ITF);
                                bArr3[i16 + 2] = (byte) (((i15 >> 6) & 63) | RecognitionOptions.ITF);
                                bArr3[i16 + 3] = (byte) ((i15 & 63) | RecognitionOptions.ITF);
                                u9.f4493c = i16 + 4;
                                this.f4462b += 4;
                                i8 += 2;
                            } else {
                                x(63);
                                i8 = i14;
                            }
                        } else {
                            t u10 = u(3);
                            int i17 = u10.f4493c;
                            byte[] bArr4 = u10.f4491a;
                            bArr4[i17] = (byte) ((charAt2 >> '\f') | 224);
                            bArr4[i17 + 1] = (byte) ((63 & (charAt2 >> 6)) | RecognitionOptions.ITF);
                            bArr4[i17 + 2] = (byte) ((charAt2 & '?') | RecognitionOptions.ITF);
                            u10.f4493c = i17 + 3;
                            this.f4462b += 3;
                        }
                        i8++;
                    }
                }
                return;
            }
            StringBuilder k2 = io.flutter.plugins.pathprovider.b.k("endIndex > string.length: ", i7, " > ");
            k2.append(string.length());
            throw new IllegalArgumentException(k2.toString().toString());
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.f("endIndex < beginIndex: ", i7, " < 0").toString());
    }

    public final void z(String string) {
        kotlin.jvm.internal.j.e(string, "string");
        y(string.length(), string);
    }

    public final int read(byte[] sink, int i7, int i8) {
        kotlin.jvm.internal.j.e(sink, "sink");
        AbstractC0281b.c(sink.length, i7, i8);
        t tVar = this.f4461a;
        if (tVar == null) {
            return -1;
        }
        int min = Math.min(i8, tVar.f4493c - tVar.f4492b);
        int i9 = tVar.f4492b;
        AbstractC1446g.K(tVar.f4491a, i7, sink, i9, i9 + min);
        int i10 = tVar.f4492b + min;
        tVar.f4492b = i10;
        this.f4462b -= min;
        if (i10 == tVar.f4493c) {
            this.f4461a = tVar.a();
            u.a(tVar);
        }
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, Q6.w
    public final void close() {
    }

    @Override // Q6.w, java.io.Flushable
    public final void flush() {
    }
}
