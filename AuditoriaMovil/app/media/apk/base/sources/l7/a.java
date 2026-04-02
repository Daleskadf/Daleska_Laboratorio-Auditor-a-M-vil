package l7;

import android.media.MediaDataSource;
import kotlin.jvm.internal.j;
/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f13877a;

    public a(byte[] bArr) {
        this.f13877a = bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
    }

    @Override // android.media.MediaDataSource
    public final synchronized long getSize() {
        return this.f13877a.length;
    }

    @Override // android.media.MediaDataSource
    public final synchronized int readAt(long j, byte[] buffer, int i7, int i8) {
        j.e(buffer, "buffer");
        byte[] bArr = this.f13877a;
        if (j >= bArr.length) {
            return -1;
        }
        long j8 = i8;
        long j9 = j + j8;
        if (j9 > bArr.length) {
            j8 -= j9 - bArr.length;
        }
        int i9 = (int) j8;
        System.arraycopy(bArr, (int) j, buffer, i7, i9);
        return i9;
    }
}
