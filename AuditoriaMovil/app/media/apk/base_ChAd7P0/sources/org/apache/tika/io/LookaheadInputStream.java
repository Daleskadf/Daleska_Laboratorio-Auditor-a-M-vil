package org.apache.tika.io;

import java.io.InputStream;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public class LookaheadInputStream extends InputStream {
    private final byte[] buffer;
    private InputStream stream;
    private int buffered = 0;
    private int position = 0;
    private int mark = 0;

    public LookaheadInputStream(InputStream inputStream, int i7) {
        this.stream = inputStream;
        this.buffer = new byte[i7];
        if (inputStream != null) {
            inputStream.mark(i7);
        }
    }

    private void fill() {
        InputStream inputStream;
        if (available() == 0) {
            int i7 = this.buffered;
            byte[] bArr = this.buffer;
            if (i7 < bArr.length && (inputStream = this.stream) != null) {
                int read = inputStream.read(bArr, i7, bArr.length - i7);
                if (read != -1) {
                    this.buffered += read;
                } else {
                    close();
                }
            }
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return this.buffered - this.position;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = this.stream;
        if (inputStream != null) {
            inputStream.reset();
            this.stream = null;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i7) {
        this.mark = this.position;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        fill();
        int i7 = this.buffered;
        int i8 = this.position;
        if (i7 > i8) {
            byte[] bArr = this.buffer;
            this.position = i8 + 1;
            return bArr[i8] & ForkServer.ERROR;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.position = this.mark;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        fill();
        long min = Math.min(j, available());
        this.position = (int) (this.position + min);
        return min;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) {
        fill();
        int i9 = this.buffered;
        int i10 = this.position;
        if (i9 > i10) {
            int min = Math.min(i8, i9 - i10);
            System.arraycopy(this.buffer, this.position, bArr, i7, min);
            this.position += min;
            return min;
        }
        return -1;
    }
}
