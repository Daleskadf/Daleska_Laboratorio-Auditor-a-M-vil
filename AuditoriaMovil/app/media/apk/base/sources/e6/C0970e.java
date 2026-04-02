package e6;

import Q6.s;
import Q6.y;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.fork.ForkServer;
/* renamed from: e6.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0970e implements y {

    /* renamed from: a  reason: collision with root package name */
    public final s f10938a;

    /* renamed from: b  reason: collision with root package name */
    public int f10939b;

    /* renamed from: c  reason: collision with root package name */
    public byte f10940c;

    /* renamed from: d  reason: collision with root package name */
    public int f10941d;

    /* renamed from: e  reason: collision with root package name */
    public int f10942e;
    public short f;

    public C0970e(s sVar) {
        this.f10938a = sVar;
    }

    @Override // Q6.y
    public final long i(Q6.e eVar, long j) {
        int i7;
        int c8;
        do {
            int i8 = this.f10942e;
            s sVar = this.f10938a;
            if (i8 == 0) {
                sVar.o(this.f);
                this.f = (short) 0;
                if ((this.f10940c & 4) != 0) {
                    return -1L;
                }
                i7 = this.f10941d;
                int a7 = C0974i.a(sVar);
                this.f10942e = a7;
                this.f10939b = a7;
                byte a8 = (byte) (sVar.a() & ForkServer.ERROR);
                this.f10940c = (byte) (sVar.a() & ForkServer.ERROR);
                Logger logger = C0974i.f10954a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC0971f.a(true, this.f10941d, this.f10939b, a8, this.f10940c));
                }
                c8 = sVar.c() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                this.f10941d = c8;
                if (a8 != 9) {
                    C0974i.c("%s != TYPE_CONTINUATION", Byte.valueOf(a8));
                    throw null;
                }
            } else {
                long i9 = sVar.i(eVar, Math.min(j, i8));
                if (i9 == -1) {
                    return -1L;
                }
                this.f10942e -= (int) i9;
                return i9;
            }
        } while (c8 == i7);
        C0974i.c("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
