package org.apache.tika.io;

import java.io.FilterInputStream;
import java.io.InputStream;
/* loaded from: classes.dex */
public class TailStream extends FilterInputStream {
    private static final int SKIP_SIZE = 4096;
    private long bytesRead;
    private int currentIndex;
    private byte[] markBuffer;
    private long markBytesRead;
    private int markIndex;
    private final byte[] tailBuffer;
    private final int tailSize;

    public TailStream(InputStream inputStream, int i7) {
        super(inputStream);
        this.tailSize = i7;
        this.tailBuffer = new byte[i7];
    }

    private void appendBuf(byte[] bArr, int i7, int i8) {
        if (i8 >= this.tailSize) {
            replaceTailBuffer(bArr, i7, i8);
        } else {
            copyToTailBuffer(bArr, i7, i8);
        }
        this.bytesRead += i8;
    }

    private void appendByte(byte b5) {
        byte[] bArr = this.tailBuffer;
        int i7 = this.currentIndex;
        int i8 = i7 + 1;
        this.currentIndex = i8;
        bArr[i7] = b5;
        if (i8 >= this.tailSize) {
            this.currentIndex = 0;
        }
        this.bytesRead++;
    }

    private void copyToTailBuffer(byte[] bArr, int i7, int i8) {
        int min = Math.min(this.tailSize - this.currentIndex, i8);
        System.arraycopy(bArr, i7, this.tailBuffer, this.currentIndex, min);
        System.arraycopy(bArr, i7 + min, this.tailBuffer, 0, i8 - min);
        this.currentIndex = (this.currentIndex + i8) % this.tailSize;
    }

    private void replaceTailBuffer(byte[] bArr, int i7, int i8) {
        int i9 = i7 + i8;
        int i10 = this.tailSize;
        System.arraycopy(bArr, i9 - i10, this.tailBuffer, 0, i10);
        this.currentIndex = 0;
    }

    public byte[] getTail() {
        int min = (int) Math.min(this.tailSize, this.bytesRead);
        byte[] bArr = new byte[min];
        byte[] bArr2 = this.tailBuffer;
        int i7 = this.currentIndex;
        System.arraycopy(bArr2, i7, bArr, 0, min - i7);
        byte[] bArr3 = this.tailBuffer;
        int i8 = this.currentIndex;
        System.arraycopy(bArr3, 0, bArr, min - i8, i8);
        return bArr;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i7) {
        int i8 = this.tailSize;
        byte[] bArr = new byte[i8];
        this.markBuffer = bArr;
        System.arraycopy(this.tailBuffer, 0, bArr, 0, i8);
        this.markIndex = this.currentIndex;
        this.markBytesRead = this.bytesRead;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = super.read();
        if (read != -1) {
            appendByte((byte) read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        byte[] bArr = this.markBuffer;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.tailBuffer, 0, this.tailSize);
            this.currentIndex = this.markIndex;
            this.bytesRead = this.markBytesRead;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        int min = (int) Math.min(j, 4096L);
        byte[] bArr = new byte[min];
        long j8 = 0;
        int i7 = 0;
        while (j8 < j && i7 != -1) {
            i7 = read(bArr, 0, (int) Math.min(min, j - j8));
            if (i7 != -1) {
                j8 += i7;
            }
        }
        if (i7 < 0 && j8 == 0) {
            return -1L;
        }
        return j8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        int read = super.read(bArr);
        if (read > 0) {
            appendBuf(bArr, 0, read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) {
        int read = super.read(bArr, i7, i8);
        if (read > 0) {
            appendBuf(bArr, i7, read);
        }
        return read;
    }
}
