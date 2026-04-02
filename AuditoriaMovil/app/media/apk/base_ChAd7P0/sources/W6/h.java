package W6;

import j$.util.Objects;
import java.io.InputStream;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
/* loaded from: classes.dex */
public final class h extends InputStream {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f6230e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f6231a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6232b;

    /* renamed from: c  reason: collision with root package name */
    public int f6233c;

    /* renamed from: d  reason: collision with root package name */
    public int f6234d;

    public h(byte[] bArr) {
        int length = bArr.length;
        this.f6231a = bArr;
        this.f6232b = length;
        this.f6233c = 0;
        this.f6234d = 0;
    }

    public static void a(int i7, String str) {
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str.concat(" cannot be negative"));
    }

    @Override // java.io.InputStream
    public final int available() {
        int i7 = this.f6233c;
        int i8 = this.f6232b;
        if (i7 < i8) {
            return i8 - i7;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final void mark(int i7) {
        this.f6234d = this.f6233c;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i7 = this.f6233c;
        if (i7 < this.f6232b) {
            this.f6233c = i7 + 1;
            return this.f6231a[i7] & ForkServer.ERROR;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f6233c = this.f6234d;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j >= 0) {
            int i7 = this.f6233c;
            long j8 = this.f6232b - i7;
            if (j < j8) {
                j8 = j;
            }
            long j9 = (int) j;
            if (j == j9) {
                long j10 = i7 + j9;
                int i8 = (int) j10;
                if (j10 == i8) {
                    this.f6233c = i8;
                    return j8;
                }
                throw new ArithmeticException();
            }
            throw new ArithmeticException();
        }
        throw new IllegalArgumentException("Skipping backward is not supported");
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        Objects.requireNonNull(bArr, "dest");
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        Objects.requireNonNull(bArr, "dest");
        if (i7 >= 0 && i8 >= 0 && i7 + i8 <= bArr.length) {
            int i9 = this.f6233c;
            int i10 = this.f6232b;
            if (i9 >= i10) {
                return -1;
            }
            int i11 = i10 - i9;
            if (i8 >= i11) {
                i8 = i11;
            }
            if (i8 <= 0) {
                return 0;
            }
            System.arraycopy(this.f6231a, i9, bArr, i7, i8);
            this.f6233c += i8;
            return i8;
        }
        throw new IndexOutOfBoundsException();
    }

    public h(byte[] bArr, int i7) {
        a(0, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        a(i7, "length");
        Objects.requireNonNull(bArr, "data");
        this.f6231a = bArr;
        a(0, "defaultValue");
        this.f6232b = Math.min(Math.min(0, bArr.length > 0 ? bArr.length : 0) + i7, bArr.length);
        a(0, "defaultValue");
        this.f6233c = Math.min(0, bArr.length > 0 ? bArr.length : 0);
        a(0, "defaultValue");
        this.f6234d = Math.min(0, bArr.length > 0 ? bArr.length : 0);
    }
}
