package org.apache.tika.io;

import S6.c;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class BoundedInputStream extends InputStream {
    private static final int EOF = -1;
    private final InputStream in;
    private final long max;
    private long pos;

    public BoundedInputStream(long j, InputStream inputStream) {
        this.max = j;
        this.in = inputStream;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.in.available();
    }

    public long getPos() {
        return this.pos;
    }

    public boolean hasHitBound() {
        if (this.pos >= this.max) {
            return true;
        }
        return false;
    }

    @Override // java.io.InputStream
    public void mark(int i7) {
        this.in.mark(i7);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.in.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        long j = this.max;
        if (j < 0 || this.pos < j) {
            int read = this.in.read();
            this.pos++;
            return read;
        }
        return -1;
    }

    public byte[] readNBytes(int i7) {
        byte[] readNBytes;
        readNBytes = this.in.readNBytes(i7);
        return readNBytes;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.in.reset();
        this.pos = 0L;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        long j8 = this.max;
        if (j8 >= 0) {
            j = Math.min(j, j8 - this.pos);
        }
        long skip = this.in.skip(j);
        this.pos += skip;
        return skip;
    }

    public long transferTo(OutputStream outputStream) {
        return c.b(this, outputStream);
    }

    public int readNBytes(byte[] bArr, int i7, int i8) {
        int readNBytes;
        readNBytes = this.in.readNBytes(bArr, i7, i8);
        return readNBytes;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) {
        long j = this.max;
        if (j < 0 || this.pos < j) {
            int read = this.in.read(bArr, i7, (int) (j >= 0 ? Math.min(i8, j - this.pos) : i8));
            if (read == -1) {
                return -1;
            }
            this.pos += read;
            return read;
        }
        return -1;
    }
}
