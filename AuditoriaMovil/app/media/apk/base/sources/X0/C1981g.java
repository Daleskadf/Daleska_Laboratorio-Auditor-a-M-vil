package x0;

import java.io.InputStream;
/* renamed from: x0.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1981g extends C1976b {
    public C1981g(byte[] bArr) {
        super(bArr);
        this.f16417a.mark(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public final void b(long j) {
        int i7 = this.f16418b;
        if (i7 > j) {
            this.f16418b = 0;
            this.f16417a.reset();
        } else {
            j -= i7;
        }
        a((int) j);
    }

    public C1981g(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f16417a.mark(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
