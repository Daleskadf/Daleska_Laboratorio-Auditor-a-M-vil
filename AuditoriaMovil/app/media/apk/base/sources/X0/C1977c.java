package x0;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
/* renamed from: x0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1977c extends FilterOutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final OutputStream f16422a;

    /* renamed from: b  reason: collision with root package name */
    public ByteOrder f16423b;

    public C1977c(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f16422a = outputStream;
        this.f16423b = byteOrder;
    }

    public final void a(int i7) {
        this.f16422a.write(i7);
    }

    public final void b(int i7) {
        ByteOrder byteOrder = this.f16423b;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f16422a;
        if (byteOrder == byteOrder2) {
            outputStream.write(i7 & 255);
            outputStream.write((i7 >>> 8) & 255);
            outputStream.write((i7 >>> 16) & 255);
            outputStream.write((i7 >>> 24) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((i7 >>> 24) & 255);
            outputStream.write((i7 >>> 16) & 255);
            outputStream.write((i7 >>> 8) & 255);
            outputStream.write(i7 & 255);
        }
    }

    public final void c(short s7) {
        ByteOrder byteOrder = this.f16423b;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f16422a;
        if (byteOrder == byteOrder2) {
            outputStream.write(s7 & 255);
            outputStream.write((s7 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((s7 >>> 8) & 255);
            outputStream.write(s7 & 255);
        }
    }

    public final void d(long j) {
        if (j <= 4294967295L) {
            b((int) j);
            return;
        }
        throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
    }

    public final void g(int i7) {
        if (i7 <= 65535) {
            c((short) i7);
            return;
        }
        throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f16422a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i8) {
        this.f16422a.write(bArr, i7, i8);
    }
}
