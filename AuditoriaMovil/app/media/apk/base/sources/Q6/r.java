package Q6;

import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public final class r extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f4487a;

    public r(s sVar) {
        this.f4487a = sVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        s sVar = this.f4487a;
        if (!sVar.f4490c) {
            return (int) Math.min(sVar.f4489b.f4462b, (long) com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        }
        throw new IOException("closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4487a.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        s sVar = this.f4487a;
        if (!sVar.f4490c) {
            e eVar = sVar.f4489b;
            if (eVar.f4462b == 0 && sVar.f4488a.i(eVar, 8192L) == -1) {
                return -1;
            }
            return eVar.j() & ForkServer.ERROR;
        }
        throw new IOException("closed");
    }

    public final String toString() {
        return this.f4487a + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] data, int i7, int i8) {
        kotlin.jvm.internal.j.e(data, "data");
        s sVar = this.f4487a;
        if (!sVar.f4490c) {
            AbstractC0281b.c(data.length, i7, i8);
            e eVar = sVar.f4489b;
            if (eVar.f4462b == 0 && sVar.f4488a.i(eVar, 8192L) == -1) {
                return -1;
            }
            return eVar.read(data, i7, i8);
        }
        throw new IOException("closed");
    }
}
