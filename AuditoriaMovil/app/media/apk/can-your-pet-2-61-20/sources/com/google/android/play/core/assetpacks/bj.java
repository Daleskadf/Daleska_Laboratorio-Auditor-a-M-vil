package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
final class bj extends InputStream {
    private final InputStream a;
    private long b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bj(InputStream inputStream, long j) {
        this.a = inputStream;
        this.b = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.a.close();
        this.b = 0L;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        long j = this.b;
        if (j <= 0) {
            return -1;
        }
        this.b = j - 1;
        return this.a.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.b;
        if (j <= 0) {
            return -1;
        }
        int read = this.a.read(bArr, i, (int) Math.min(i2, j));
        if (read != -1) {
            this.b -= read;
        }
        return read;
    }
}
