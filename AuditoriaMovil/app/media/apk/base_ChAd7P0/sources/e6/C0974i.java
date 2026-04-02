package e6;

import Q6.AbstractC0281b;
import Q6.s;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;
import org.apache.tika.fork.ForkServer;
/* renamed from: e6.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0974i {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f10954a = Logger.getLogger(AbstractC0971f.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final Q6.g f10955b;

    static {
        Q6.g gVar = Q6.g.f4463d;
        f10955b = AbstractC0281b.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static int a(s sVar) {
        return (sVar.a() & ForkServer.ERROR) | ((sVar.a() & ForkServer.ERROR) << 16) | ((sVar.a() & ForkServer.ERROR) << 8);
    }

    public static int b(int i7, byte b5, short s7) {
        if ((b5 & 8) != 0) {
            i7--;
        }
        if (s7 <= i7) {
            return (short) (i7 - s7);
        }
        c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s7), Integer.valueOf(i7));
        throw null;
    }

    public static void c(String str, Object... objArr) {
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
