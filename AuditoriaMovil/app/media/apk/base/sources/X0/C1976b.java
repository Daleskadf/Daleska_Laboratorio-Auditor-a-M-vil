package x0;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
/* renamed from: x0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1976b extends InputStream implements DataInput {

    /* renamed from: a  reason: collision with root package name */
    public final DataInputStream f16417a;

    /* renamed from: b  reason: collision with root package name */
    public int f16418b;

    /* renamed from: c  reason: collision with root package name */
    public ByteOrder f16419c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f16420d;

    /* renamed from: e  reason: collision with root package name */
    public final int f16421e;

    public C1976b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        this.f16421e = bArr.length;
    }

    public final void a(int i7) {
        int i8 = 0;
        while (i8 < i7) {
            DataInputStream dataInputStream = this.f16417a;
            int i9 = i7 - i8;
            int skip = (int) dataInputStream.skip(i9);
            if (skip <= 0) {
                if (this.f16420d == null) {
                    this.f16420d = new byte[8192];
                }
                skip = dataInputStream.read(this.f16420d, 0, Math.min(8192, i9));
                if (skip == -1) {
                    throw new EOFException(io.flutter.plugins.pathprovider.b.f("Reached EOF while skipping ", i7, " bytes."));
                }
            }
            i8 += skip;
        }
        this.f16418b += i8;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f16417a.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i7) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f16418b++;
        return this.f16417a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f16418b++;
        return this.f16417a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f16418b++;
        int read = this.f16417a.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f16418b += 2;
        return this.f16417a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i7, int i8) {
        this.f16418b += i8;
        this.f16417a.readFully(bArr, i7, i8);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f16418b += 4;
        DataInputStream dataInputStream = this.f16417a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.f16419c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f16419c);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.f16418b += 8;
        DataInputStream dataInputStream = this.f16417a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.f16419c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f16419c);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f16418b += 2;
        DataInputStream dataInputStream = this.f16417a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f16419c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f16419c);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f16418b += 2;
        return this.f16417a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f16418b++;
        return this.f16417a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f16418b += 2;
        DataInputStream dataInputStream = this.f16417a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f16419c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f16419c);
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i7) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public C1976b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        int read = this.f16417a.read(bArr, i7, i8);
        this.f16418b += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f16418b += bArr.length;
        this.f16417a.readFully(bArr);
    }

    public C1976b(InputStream inputStream, ByteOrder byteOrder) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f16417a = dataInputStream;
        dataInputStream.mark(0);
        this.f16418b = 0;
        this.f16419c = byteOrder;
        this.f16421e = inputStream instanceof C1976b ? ((C1976b) inputStream).f16421e : -1;
    }
}
