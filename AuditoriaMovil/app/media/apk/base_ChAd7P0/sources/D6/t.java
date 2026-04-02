package d6;

import c6.AbstractC0671h0;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public class t {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f10489b = Logger.getLogger(t.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final t f10490c;

    /* renamed from: a  reason: collision with root package name */
    public final io.grpc.okhttp.internal.l f10491a;

    static {
        t tVar;
        io.grpc.okhttp.internal.l lVar = io.grpc.okhttp.internal.l.f12564d;
        ClassLoader classLoader = t.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e7) {
            Level level = Level.FINE;
            Logger logger = f10489b;
            logger.log(level, "Unable to find Conscrypt. Skipping", (Throwable) e7);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e8) {
                logger.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e8);
                tVar = new t(lVar);
            }
        }
        tVar = new t(lVar);
        f10490c = tVar;
    }

    public t(io.grpc.okhttp.internal.l lVar) {
        G.i.j(lVar, "platform");
        this.f10491a = lVar;
    }

    public static boolean c(String str) {
        boolean z7;
        if (str.contains("_")) {
            return false;
        }
        try {
            if (AbstractC0671h0.a(str).getAuthority().indexOf(64) == -1) {
                z7 = true;
            } else {
                z7 = false;
            }
            G.i.e(str, "Userinfo must not be present on authority: '%s'", z7);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void a(SSLSocket sSLSocket, String str, List list) {
        this.f10491a.c(sSLSocket, str, list);
    }

    public String b(SSLSocket sSLSocket) {
        return this.f10491a.d(sSLSocket);
    }

    public String d(SSLSocket sSLSocket, String str, List list) {
        io.grpc.okhttp.internal.l lVar = this.f10491a;
        if (list != null) {
            a(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String b5 = b(sSLSocket);
            if (b5 != null) {
                return b5;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            lVar.a(sSLSocket);
        }
    }
}
