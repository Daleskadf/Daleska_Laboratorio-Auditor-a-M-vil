package io.grpc.okhttp.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public class l {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f12562b = Logger.getLogger(l.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f12563c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* renamed from: d  reason: collision with root package name */
    public static final l f12564d;

    /* renamed from: a  reason: collision with root package name */
    public final Provider f12565a;

    static {
        Logger logger;
        Provider provider;
        l lVar;
        k kVar;
        String[] strArr;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i7 = 0;
        loop0: while (true) {
            logger = f12562b;
            if (i7 < length) {
                Provider provider2 = providers[i7];
                for (String str : f12563c) {
                    if (str.equals(provider2.getClass().getName())) {
                        logger.log(Level.FINE, "Found registered provider {0}", str);
                        provider = provider2;
                        break loop0;
                    }
                }
                i7++;
            } else {
                logger.log(Level.WARNING, "Unable to find Conscrypt");
                provider = null;
                break;
            }
        }
        if (provider != null) {
            R1.j jVar = new R1.j(null, "setUseSessionTickets", new Class[]{Boolean.TYPE}, 22);
            R1.j jVar2 = new R1.j(null, "setHostname", new Class[]{String.class}, 22);
            R1.j jVar3 = new R1.j(byte[].class, "getAlpnSelectedProtocol", new Class[0], 22);
            R1.j jVar4 = new R1.j(null, "setAlpnProtocols", new Class[]{byte[].class}, 22);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (!provider.getName().equals("GmsCore_OpenSSL") && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    l.class.getClassLoader().loadClass("android.net.Network");
                    kVar = k.ALPN_AND_NPN;
                } catch (ClassNotFoundException e7) {
                    logger.log(Level.FINE, "Can't find class", (Throwable) e7);
                    try {
                        l.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        kVar = k.NPN;
                    } catch (ClassNotFoundException e8) {
                        logger.log(Level.FINE, "Can't find class", (Throwable) e8);
                        kVar = k.NONE;
                    }
                }
            } else {
                kVar = k.ALPN_AND_NPN;
            }
            lVar = new h(jVar, jVar2, jVar3, jVar4, provider, kVar);
        } else {
            try {
                Provider provider3 = SSLContext.getDefault().getProvider();
                try {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS", provider3);
                        sSLContext.init(null, null, null);
                        ((Method) AccessController.doPrivileged(new g(0))).invoke(sSLContext.createSSLEngine(), null);
                        lVar = new i(provider3, (Method) AccessController.doPrivileged(new g(1)), (Method) AccessController.doPrivileged(new g(2)));
                    } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused2) {
                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        lVar = new h(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider3);
                    }
                } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                    lVar = new l(provider3);
                }
            } catch (NoSuchAlgorithmException e9) {
                throw new RuntimeException(e9);
            }
        }
        f12564d = lVar;
    }

    public l(Provider provider) {
        this.f12565a = provider;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Q6.e, java.lang.Object] */
    public static byte[] b(List list) {
        ?? obj = new Object();
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            m mVar = (m) list.get(i7);
            if (mVar != m.HTTP_1_0) {
                obj.x(mVar.toString().length());
                obj.z(mVar.toString());
            }
        }
        return obj.m(obj.f4462b);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
    }

    public String d(SSLSocket sSLSocket) {
        return null;
    }

    public k e() {
        return k.NONE;
    }
}
