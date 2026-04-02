package Q6;

import c6.C0690n1;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public final class p extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4482a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4483b;

    public /* synthetic */ p(Object obj, int i7) {
        this.f4482a = i7;
        this.f4483b = obj;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.f4482a) {
            case 0:
                ((q) this.f4483b).close();
                return;
            default:
                super.close();
                return;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        switch (this.f4482a) {
            case 0:
                q qVar = (q) this.f4483b;
                if (!qVar.f4486c) {
                    qVar.flush();
                    return;
                }
                return;
            default:
                super.flush();
                return;
        }
    }

    public String toString() {
        switch (this.f4482a) {
            case 0:
                return ((q) this.f4483b) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i7, int i8) {
        switch (this.f4482a) {
            case 0:
                kotlin.jvm.internal.j.e(data, "data");
                q qVar = (q) this.f4483b;
                if (!qVar.f4486c) {
                    qVar.f4485b.w(data, i7, i8);
                    qVar.a();
                    return;
                }
                throw new IOException("closed");
            default:
                ((C0690n1) this.f4483b).h(data, i7, i8);
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i7) {
        switch (this.f4482a) {
            case 0:
                q qVar = (q) this.f4483b;
                if (!qVar.f4486c) {
                    qVar.f4485b.x((byte) i7);
                    qVar.a();
                    return;
                }
                throw new IOException("closed");
            default:
                write(new byte[]{(byte) i7}, 0, 1);
                return;
        }
    }
}
