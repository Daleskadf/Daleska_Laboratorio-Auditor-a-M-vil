package io.grpc.okhttp.internal;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public final class h extends l {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f12554e = 0;
    public final Object f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f12555g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f12556h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f12557i;
    public final Serializable j;

    public h(R1.j jVar, R1.j jVar2, R1.j jVar3, R1.j jVar4, Provider provider, k kVar) {
        super(provider);
        this.f = jVar;
        this.f12555g = jVar2;
        this.f12556h = jVar3;
        this.f12557i = jVar4;
        this.j = kVar;
    }

    @Override // io.grpc.okhttp.internal.l
    public void a(SSLSocket sSLSocket) {
        switch (this.f12554e) {
            case 1:
                try {
                    ((Method) this.f12556h).invoke(null, sSLSocket);
                    return;
                } catch (IllegalAccessException unused) {
                    throw new AssertionError();
                } catch (InvocationTargetException e7) {
                    l.f12562b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e7);
                    return;
                }
            default:
                return;
        }
    }

    @Override // io.grpc.okhttp.internal.l
    public final void c(SSLSocket sSLSocket, String str, List list) {
        Object obj = this.f;
        Object obj2 = this.f12557i;
        switch (this.f12554e) {
            case 0:
                if (str != null) {
                    ((R1.j) obj).F0(sSLSocket, Boolean.TRUE);
                    ((R1.j) this.f12555g).F0(sSLSocket, str);
                }
                R1.j jVar = (R1.j) obj2;
                if (jVar.x0(sSLSocket.getClass()) != null) {
                    jVar.G0(sSLSocket, l.b(list));
                    return;
                }
                return;
            default:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    m mVar = (m) list.get(i7);
                    if (mVar != m.HTTP_1_0) {
                        arrayList.add(mVar.toString());
                    }
                }
                try {
                    ((Method) obj).invoke(null, sSLSocket, Proxy.newProxyInstance(l.class.getClassLoader(), new Class[]{(Class) obj2, (Class) this.j}, new j(arrayList)));
                    return;
                } catch (IllegalAccessException e7) {
                    throw new AssertionError(e7);
                } catch (InvocationTargetException e8) {
                    throw new AssertionError(e8);
                }
        }
    }

    @Override // io.grpc.okhttp.internal.l
    public final String d(SSLSocket sSLSocket) {
        byte[] bArr;
        boolean z7 = true;
        switch (this.f12554e) {
            case 0:
                R1.j jVar = (R1.j) this.f12556h;
                if (jVar.x0(sSLSocket.getClass()) == null) {
                    z7 = false;
                }
                if (!z7 || (bArr = (byte[]) jVar.G0(sSLSocket, new Object[0])) == null) {
                    return null;
                }
                return new String(bArr, o.f12567b);
            default:
                try {
                    j jVar2 = (j) Proxy.getInvocationHandler(((Method) this.f12555g).invoke(null, sSLSocket));
                    boolean z8 = jVar2.f12560b;
                    if (!z8 && jVar2.f12561c == null) {
                        l.f12562b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                        return null;
                    } else if (z8) {
                        return null;
                    } else {
                        return jVar2.f12561c;
                    }
                } catch (IllegalAccessException unused) {
                    throw new AssertionError();
                } catch (InvocationTargetException unused2) {
                    throw new AssertionError();
                }
        }
    }

    @Override // io.grpc.okhttp.internal.l
    public final k e() {
        switch (this.f12554e) {
            case 0:
                return (k) this.j;
            default:
                return k.ALPN_AND_NPN;
        }
    }

    public h(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.f = method;
        this.f12555g = method2;
        this.f12556h = method3;
        this.f12557i = cls;
        this.j = cls2;
    }
}
