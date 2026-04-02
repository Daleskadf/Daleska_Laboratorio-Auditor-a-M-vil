package W6;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public abstract class c extends FilterInputStream {
    private final V6.c afterRead;
    private boolean closed;
    private final V6.a exceptionHandler;

    public c(InputStream inputStream) {
        super(inputStream);
        this.exceptionHandler = new P0.b(28);
        this.afterRead = V6.c.f5981o;
    }

    public void afterRead(int i7) {
        this.afterRead.getClass();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        if (((FilterInputStream) this).in != null && !isClosed()) {
            try {
                return ((FilterInputStream) this).in.available();
            } catch (IOException e7) {
                handleIOException(e7);
                return 0;
            }
        }
        return 0;
    }

    public void checkOpen() {
        if (!isClosed()) {
            return;
        }
        throw new IOException("Closed");
    }

    public void handleIOException(IOException iOException) {
        this.exceptionHandler.accept(iOException);
    }

    public boolean isClosed() {
        return this.closed;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i7) {
        if (((FilterInputStream) this).in != null) {
            ((FilterInputStream) this).in.mark(i7);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        if (((FilterInputStream) this).in != null && ((FilterInputStream) this).in.markSupported()) {
            return true;
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i7 = 1;
        try {
            beforeRead(1);
            int read = ((FilterInputStream) this).in.read();
            if (read == -1) {
                i7 = -1;
            }
            afterRead(i7);
            return read;
        } catch (IOException e7) {
            handleIOException(e7);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        try {
            ((FilterInputStream) this).in.reset();
        } catch (IOException e7) {
            handleIOException(e7);
        }
    }

    public c setReference(InputStream inputStream) {
        ((FilterInputStream) this).in = inputStream;
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        try {
            return ((FilterInputStream) this).in.skip(j);
        } catch (IOException e7) {
            handleIOException(e7);
            return 0L;
        }
    }

    public InputStream unwrap() {
        return ((FilterInputStream) this).in;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        try {
            byte[] bArr2 = S6.c.f5279a;
            beforeRead(bArr == null ? 0 : bArr.length);
            int read = ((FilterInputStream) this).in.read(bArr);
            afterRead(read);
            return read;
        } catch (IOException e7) {
            handleIOException(e7);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) {
        try {
            beforeRead(i8);
            int read = ((FilterInputStream) this).in.read(bArr, i7, i8);
            afterRead(read);
            return read;
        } catch (IOException e7) {
            handleIOException(e7);
            return -1;
        }
    }

    public void beforeRead(int i7) {
    }
}
