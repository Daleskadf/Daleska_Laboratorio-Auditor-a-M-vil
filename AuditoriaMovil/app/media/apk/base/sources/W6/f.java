package W6;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public final class f extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public volatile ByteArrayInputStream f6224a;

    /* renamed from: b  reason: collision with root package name */
    public volatile byte[] f6225b;

    /* renamed from: c  reason: collision with root package name */
    public int f6226c;

    /* renamed from: d  reason: collision with root package name */
    public int f6227d;

    /* renamed from: e  reason: collision with root package name */
    public int f6228e;
    public int f;

    public final int a(ByteArrayInputStream byteArrayInputStream, byte[] bArr) {
        int i7 = this.f6228e;
        if (i7 != -1) {
            int i8 = this.f - i7;
            int i9 = this.f6227d;
            if (i8 < i9) {
                if (i7 == 0 && i9 > bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i9) {
                        i9 = length;
                    }
                    byte[] bArr2 = new byte[i9];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f6225b = bArr2;
                    bArr = bArr2;
                } else if (i7 > 0) {
                    System.arraycopy(bArr, i7, bArr, 0, bArr.length - i7);
                }
                int i10 = this.f - this.f6228e;
                this.f = i10;
                this.f6228e = 0;
                this.f6226c = 0;
                int read = byteArrayInputStream.read(bArr, i10, bArr.length - i10);
                int i11 = this.f;
                if (read > 0) {
                    i11 += read;
                }
                this.f6226c = i11;
                return read;
            }
        }
        int read2 = byteArrayInputStream.read(bArr);
        if (read2 > 0) {
            this.f6228e = -1;
            this.f = 0;
            this.f6226c = read2;
        }
        return read2;
    }

    @Override // java.io.InputStream
    public final int available() {
        ByteArrayInputStream byteArrayInputStream = this.f6224a;
        if (this.f6225b != null && byteArrayInputStream != null) {
            return byteArrayInputStream.available() + (this.f6226c - this.f);
        }
        throw new IOException("Stream is closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6225b = null;
        ByteArrayInputStream byteArrayInputStream = this.f6224a;
        this.f6224a = null;
        if (byteArrayInputStream != null) {
            byteArrayInputStream.close();
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i7) {
        this.f6227d = i7;
        this.f6228e = this.f;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final void reset() {
        if (this.f6225b != null) {
            int i7 = this.f6228e;
            if (-1 != i7) {
                this.f = i7;
                return;
            }
            throw new IOException("Mark has been invalidated");
        }
        throw new IOException("Stream is closed");
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int i7;
        byte[] bArr = this.f6225b;
        ByteArrayInputStream byteArrayInputStream = this.f6224a;
        if (bArr != null) {
            if (j < 1) {
                return 0L;
            }
            if (byteArrayInputStream != null) {
                int i8 = this.f6226c;
                int i9 = this.f;
                int i10 = i8 - i9;
                long j8 = i10;
                if (j8 >= j) {
                    this.f = i9 + ((int) j);
                    return j;
                }
                this.f = i8;
                if (this.f6228e != -1 && j <= this.f6227d) {
                    if (a(byteArrayInputStream, bArr) == -1) {
                        return j8;
                    }
                    int i11 = this.f6226c;
                    int i12 = this.f;
                    if (i11 - i12 >= j - j8) {
                        this.f = (((int) j) - i10) + i12;
                        return j;
                    }
                    this.f = i11;
                    return i7 + i10;
                }
                return byteArrayInputStream.skip(j - j8) + j8;
            }
            throw new IOException("Stream is closed");
        }
        throw new IOException("Stream is closed");
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f6225b;
        ByteArrayInputStream byteArrayInputStream = this.f6224a;
        if (bArr != null && byteArrayInputStream != null) {
            if (this.f < this.f6226c || a(byteArrayInputStream, bArr) != -1) {
                if (bArr != this.f6225b && (bArr = this.f6225b) == null) {
                    throw new IOException("Stream is closed");
                }
                int i7 = this.f6226c;
                int i8 = this.f;
                if (i7 - i8 > 0) {
                    this.f = i8 + 1;
                    return bArr[i8] & ForkServer.ERROR;
                }
                return -1;
            }
            return -1;
        }
        throw new IOException("Stream is closed");
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        byte[] bArr2 = this.f6225b;
        if (bArr2 != null) {
            if (i7 > bArr.length - i8 || i7 < 0 || i8 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (i8 == 0) {
                return 0;
            }
            ByteArrayInputStream byteArrayInputStream = this.f6224a;
            if (byteArrayInputStream != null) {
                int i11 = this.f;
                int i12 = this.f6226c;
                if (i11 < i12) {
                    int i13 = i12 - i11;
                    if (i13 >= i8) {
                        i13 = i8;
                    }
                    System.arraycopy(bArr2, i11, bArr, i7, i13);
                    this.f += i13;
                    if (i13 == i8 || byteArrayInputStream.available() == 0) {
                        return i13;
                    }
                    i7 += i13;
                    i9 = i8 - i13;
                } else {
                    i9 = i8;
                }
                while (true) {
                    if (this.f6228e == -1 && i9 >= bArr2.length) {
                        i10 = byteArrayInputStream.read(bArr, i7, i9);
                        if (i10 == -1) {
                            if (i9 == i8) {
                                return -1;
                            }
                            return i8 - i9;
                        }
                    } else if (a(byteArrayInputStream, bArr2) == -1) {
                        if (i9 == i8) {
                            return -1;
                        }
                        return i8 - i9;
                    } else if (bArr2 != this.f6225b && (bArr2 = this.f6225b) == null) {
                        throw new IOException("Stream is closed");
                    } else {
                        int i14 = this.f6226c;
                        int i15 = this.f;
                        i10 = i14 - i15;
                        if (i10 >= i9) {
                            i10 = i9;
                        }
                        System.arraycopy(bArr2, i15, bArr, i7, i10);
                        this.f += i10;
                    }
                    i9 -= i10;
                    if (i9 == 0) {
                        return i8;
                    }
                    if (byteArrayInputStream.available() == 0) {
                        return i8 - i9;
                    }
                    i7 += i10;
                }
            } else {
                throw new IOException("Stream is closed");
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }
}
