package io.grpc.okhttp.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: e  reason: collision with root package name */
    public final Method f12558e;
    public final Method f;

    public i(Provider provider, Method method, Method method2) {
        super(provider);
        this.f12558e = method;
        this.f = method2;
    }

    @Override // io.grpc.okhttp.internal.l
    public final void c(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (mVar != m.HTTP_1_0) {
                arrayList.add(mVar.toString());
            }
        }
        try {
            this.f12558e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // io.grpc.okhttp.internal.l
    public final String d(SSLSocket sSLSocket) {
        try {
            return (String) this.f.invoke(sSLSocket, null);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // io.grpc.okhttp.internal.l
    public final k e() {
        return k.ALPN_AND_NPN;
    }
}
