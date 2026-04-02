package x0;

import android.media.MediaDataSource;
import java.io.IOException;
/* renamed from: x0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1975a extends MediaDataSource {

    /* renamed from: a  reason: collision with root package name */
    public long f16415a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1981g f16416b;

    public C1975a(C1981g c1981g) {
        this.f16416b = c1981g;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j8 = this.f16415a;
            int i9 = (j8 > j ? 1 : (j8 == j ? 0 : -1));
            C1981g c1981g = this.f16416b;
            if (i9 != 0) {
                if (j8 >= 0 && j >= j8 + c1981g.f16417a.available()) {
                    return -1;
                }
                c1981g.b(j);
                this.f16415a = j;
            }
            if (i8 > c1981g.f16417a.available()) {
                i8 = c1981g.f16417a.available();
            }
            int read = c1981g.read(bArr, i7, i8);
            if (read >= 0) {
                this.f16415a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f16415a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
