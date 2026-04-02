package com.google.firebase.storage;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class x extends InputStream {

    /* renamed from: X  reason: collision with root package name */
    public boolean f9964X;

    /* renamed from: a  reason: collision with root package name */
    public z f9965a;

    /* renamed from: b  reason: collision with root package name */
    public InputStream f9966b;

    /* renamed from: c  reason: collision with root package name */
    public E0.b f9967c;

    /* renamed from: d  reason: collision with root package name */
    public IOException f9968d;

    /* renamed from: e  reason: collision with root package name */
    public long f9969e;
    public long f;

    public final void a() {
        z zVar = this.f9965a;
        if (zVar != null && zVar.f9959h == 32) {
            throw new IOException("The operation was canceled.");
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        while (b()) {
            try {
                return this.f9966b.available();
            } catch (IOException e7) {
                this.f9968d = e7;
            }
        }
        throw this.f9968d;
    }

    public final boolean b() {
        a();
        if (this.f9968d != null) {
            try {
                InputStream inputStream = this.f9966b;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException unused) {
            }
            this.f9966b = null;
            if (this.f == this.f9969e) {
                Log.i("StreamDownloadTask", "Encountered exception during stream operation. Aborting.", this.f9968d);
                return false;
            }
            Log.i("StreamDownloadTask", "Encountered exception during stream operation. Retrying at " + this.f9969e, this.f9968d);
            this.f = this.f9969e;
            this.f9968d = null;
        }
        if (!this.f9964X) {
            if (this.f9966b == null) {
                try {
                    this.f9966b = (InputStream) this.f9967c.call();
                    return true;
                } catch (Exception e7) {
                    if (e7 instanceof IOException) {
                        throw ((IOException) e7);
                    }
                    throw new IOException("Unable to open stream", e7);
                }
            }
            return true;
        }
        throw new IOException("Can't perform operation on closed stream");
    }

    public final void c(long j) {
        z zVar = this.f9965a;
        if (zVar != null) {
            long j8 = zVar.f9975q + j;
            zVar.f9975q = j8;
            if (zVar.f9976r + 262144 <= j8) {
                if (zVar.f9959h == 4) {
                    zVar.o(4, false);
                } else {
                    zVar.f9976r = zVar.f9975q;
                }
            }
        }
        this.f9969e += j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C4.a aVar;
        InputStream inputStream = this.f9966b;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f9964X = true;
        z zVar = this.f9965a;
        if (zVar != null && (aVar = zVar.f9978t) != null) {
            aVar.o();
            zVar.f9978t = null;
        }
        a();
    }

    @Override // java.io.InputStream
    public final void mark(int i7) {
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final int read() {
        while (b()) {
            try {
                int read = this.f9966b.read();
                if (read != -1) {
                    c(1L);
                }
                return read;
            } catch (IOException e7) {
                this.f9968d = e7;
            }
        }
        throw this.f9968d;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        long j8 = 0;
        while (b()) {
            while (j > 262144) {
                try {
                    long skip = this.f9966b.skip(262144L);
                    if (skip < 0) {
                        if (j8 == 0) {
                            return -1L;
                        }
                        return j8;
                    }
                    j8 += skip;
                    j -= skip;
                    c(skip);
                    a();
                } catch (IOException e7) {
                    this.f9968d = e7;
                }
            }
            if (j > 0) {
                long skip2 = this.f9966b.skip(j);
                if (skip2 < 0) {
                    if (j8 == 0) {
                        return -1L;
                    }
                    return j8;
                }
                j8 += skip2;
                j -= skip2;
                c(skip2);
            }
            if (j == 0) {
                return j8;
            }
        }
        throw this.f9968d;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        int i9 = 0;
        while (b()) {
            while (i8 > 262144) {
                try {
                    int read = this.f9966b.read(bArr, i7, 262144);
                    if (read == -1) {
                        if (i9 == 0) {
                            return -1;
                        }
                        return i9;
                    }
                    i9 += read;
                    i7 += read;
                    i8 -= read;
                    c(read);
                    a();
                } catch (IOException e7) {
                    this.f9968d = e7;
                }
            }
            if (i8 > 0) {
                int read2 = this.f9966b.read(bArr, i7, i8);
                if (read2 == -1) {
                    if (i9 == 0) {
                        return -1;
                    }
                    return i9;
                }
                i7 += read2;
                i9 += read2;
                i8 -= read2;
                c(read2);
            }
            if (i8 == 0) {
                return i9;
            }
        }
        throw this.f9968d;
    }
}
