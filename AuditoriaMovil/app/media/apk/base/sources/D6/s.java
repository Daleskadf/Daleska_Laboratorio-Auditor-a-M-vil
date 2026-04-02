package d6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public final class s extends t {

    /* renamed from: d  reason: collision with root package name */
    public static final R1.j f10478d;

    /* renamed from: e  reason: collision with root package name */
    public static final R1.j f10479e;
    public static final R1.j f;

    /* renamed from: g  reason: collision with root package name */
    public static final R1.j f10480g;

    /* renamed from: h  reason: collision with root package name */
    public static final R1.j f10481h;

    /* renamed from: i  reason: collision with root package name */
    public static final R1.j f10482i;
    public static final Method j;

    /* renamed from: k  reason: collision with root package name */
    public static final Method f10483k;

    /* renamed from: l  reason: collision with root package name */
    public static final Method f10484l;

    /* renamed from: m  reason: collision with root package name */
    public static final Method f10485m;

    /* renamed from: n  reason: collision with root package name */
    public static final Method f10486n;

    /* renamed from: o  reason: collision with root package name */
    public static final Method f10487o;

    /* renamed from: p  reason: collision with root package name */
    public static final Constructor f10488p;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Constructor<?> constructor;
        Logger logger = t.f10489b;
        Class<?> cls = Boolean.TYPE;
        f10478d = new R1.j(null, "setUseSessionTickets", new Class[]{cls}, 22);
        f10479e = new R1.j(null, "setHostname", new Class[]{String.class}, 22);
        f = new R1.j(byte[].class, "getAlpnSelectedProtocol", new Class[0], 22);
        f10480g = new R1.j(null, "setAlpnProtocols", new Class[]{byte[].class}, 22);
        f10481h = new R1.j(byte[].class, "getNpnSelectedProtocol", new Class[0], 22);
        f10482i = new R1.j(null, "setNpnProtocols", new Class[]{byte[].class}, 22);
        try {
            method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            try {
                method3 = SSLParameters.class.getMethod("getApplicationProtocols", null);
            } catch (ClassNotFoundException e7) {
                e = e7;
                method2 = null;
                method3 = null;
                method4 = null;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f10484l = method;
                f10485m = method3;
                f10486n = method4;
                j = method2;
                f10483k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                try {
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                } catch (ClassNotFoundException e8) {
                    e = e8;
                    logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                    constructor = null;
                    f10487o = method6;
                    f10488p = constructor;
                } catch (NoSuchMethodException e9) {
                    e = e9;
                    logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                    constructor = null;
                    f10487o = method6;
                    f10488p = constructor;
                }
                f10487o = method6;
                f10488p = constructor;
            } catch (NoSuchMethodException e10) {
                e = e10;
                method2 = null;
                method3 = null;
                method4 = null;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f10484l = method;
                f10485m = method3;
                f10486n = method4;
                j = method2;
                f10483k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f10487o = method6;
                f10488p = constructor;
            }
            try {
                method4 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                try {
                    Class<?> cls2 = Class.forName("android.net.ssl.SSLSockets");
                    method2 = cls2.getMethod("isSupportedSocket", SSLSocket.class);
                    try {
                        method5 = cls2.getMethod("setUseSessionTickets", SSLSocket.class, cls);
                    } catch (ClassNotFoundException e11) {
                        e = e11;
                        logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        f10484l = method;
                        f10485m = method3;
                        f10486n = method4;
                        j = method2;
                        f10483k = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f10487o = method6;
                        f10488p = constructor;
                    } catch (NoSuchMethodException e12) {
                        e = e12;
                        logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        f10484l = method;
                        f10485m = method3;
                        f10486n = method4;
                        j = method2;
                        f10483k = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f10487o = method6;
                        f10488p = constructor;
                    }
                } catch (ClassNotFoundException e13) {
                    e = e13;
                    method2 = null;
                } catch (NoSuchMethodException e14) {
                    e = e14;
                    method2 = null;
                }
            } catch (ClassNotFoundException e15) {
                e = e15;
                method2 = null;
                method4 = null;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f10484l = method;
                f10485m = method3;
                f10486n = method4;
                j = method2;
                f10483k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f10487o = method6;
                f10488p = constructor;
            } catch (NoSuchMethodException e16) {
                e = e16;
                method2 = null;
                method4 = null;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f10484l = method;
                f10485m = method3;
                f10486n = method4;
                j = method2;
                f10483k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f10487o = method6;
                f10488p = constructor;
            }
        } catch (ClassNotFoundException e17) {
            e = e17;
            method = null;
        } catch (NoSuchMethodException e18) {
            e = e18;
            method = null;
        }
        f10484l = method;
        f10485m = method3;
        f10486n = method4;
        j = method2;
        f10483k = method5;
        try {
            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
        } catch (ClassNotFoundException e19) {
            e = e19;
            method6 = null;
        } catch (NoSuchMethodException e20) {
            e = e20;
            method6 = null;
        }
        f10487o = method6;
        f10488p = constructor;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6  */
    @Override // d6.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(javax.net.ssl.SSLSocket r9, java.lang.String r10, java.util.List r11) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.s.a(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
    }

    @Override // d6.t
    public final String b(SSLSocket sSLSocket) {
        Logger logger = t.f10489b;
        Method method = f10486n;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e7) {
                throw new RuntimeException(e7);
            } catch (InvocationTargetException e8) {
                if (e8.getTargetException() instanceof UnsupportedOperationException) {
                    logger.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                } else {
                    throw new RuntimeException(e8);
                }
            }
        }
        io.grpc.okhttp.internal.l lVar = this.f10491a;
        if (lVar.e() == io.grpc.okhttp.internal.k.ALPN_AND_NPN) {
            try {
                byte[] bArr = (byte[]) f.G0(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, io.grpc.okhttp.internal.o.f12567b);
                }
            } catch (Exception e9) {
                logger.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e9);
            }
        }
        if (lVar.e() != io.grpc.okhttp.internal.k.NONE) {
            try {
                byte[] bArr2 = (byte[]) f10481h.G0(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, io.grpc.okhttp.internal.o.f12567b);
                }
            } catch (Exception e10) {
                logger.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e10);
            }
        }
        return null;
    }

    @Override // d6.t
    public final String d(SSLSocket sSLSocket, String str, List list) {
        String b5 = b(sSLSocket);
        if (b5 == null) {
            return super.d(sSLSocket, str, list);
        }
        return b5;
    }
}
