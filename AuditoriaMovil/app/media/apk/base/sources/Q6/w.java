package Q6;

import java.io.Closeable;
import java.io.Flushable;
/* loaded from: classes.dex */
public interface w extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    void l(e eVar, long j);
}
