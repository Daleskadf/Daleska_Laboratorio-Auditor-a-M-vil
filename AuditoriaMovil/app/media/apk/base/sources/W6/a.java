package W6;

import java.io.FilterInputStream;
/* loaded from: classes.dex */
public final class a extends c {
    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((FilterInputStream) this).in = b.f6223a;
    }
}
