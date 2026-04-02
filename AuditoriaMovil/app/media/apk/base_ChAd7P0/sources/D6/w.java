package d6;

import j$.util.DesugarCollections;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public static final List f10493a = DesugarCollections.unmodifiableList(Arrays.asList(io.grpc.okhttp.internal.m.HTTP_2));

    public static SSLSocket a(SSLSocketFactory sSLSocketFactory, Socket socket, String str, int i7, io.grpc.okhttp.internal.c cVar) {
        String[] strArr;
        String str2;
        G.i.j(sSLSocketFactory, "sslSocketFactory");
        G.i.j(socket, "socket");
        G.i.j(cVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i7, true);
        List list = null;
        String[] strArr2 = cVar.f12540b;
        if (strArr2 != null) {
            strArr = (String[]) io.grpc.okhttp.internal.o.a(strArr2, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = null;
        }
        String[] strArr3 = (String[]) io.grpc.okhttp.internal.o.a(cVar.f12541c, sSLSocket.getEnabledProtocols());
        io.grpc.okhttp.internal.b bVar = new io.grpc.okhttp.internal.b(cVar);
        if (bVar.f12534a) {
            if (strArr == null) {
                bVar.f12535b = null;
            } else {
                bVar.f12535b = (String[]) strArr.clone();
            }
            if (bVar.f12534a) {
                if (strArr3 == null) {
                    bVar.f12536c = null;
                } else {
                    bVar.f12536c = (String[]) strArr3.clone();
                }
                io.grpc.okhttp.internal.c cVar2 = new io.grpc.okhttp.internal.c(bVar);
                sSLSocket.setEnabledProtocols(cVar2.f12541c);
                String[] strArr4 = cVar2.f12540b;
                if (strArr4 != null) {
                    sSLSocket.setEnabledCipherSuites(strArr4);
                }
                t tVar = t.f10490c;
                boolean z7 = cVar.f12542d;
                List list2 = f10493a;
                if (z7) {
                    list = list2;
                }
                String d7 = tVar.d(sSLSocket, str, list);
                G.i.n(d7, "Only " + list2 + " are supported, but negotiated protocol is %s", list2.contains(io.grpc.okhttp.internal.m.a(d7)));
                io.grpc.okhttp.internal.f fVar = io.grpc.okhttp.internal.f.f12551a;
                if (str.startsWith("[") && str.endsWith("]")) {
                    str2 = str.substring(1, str.length() - 1);
                } else {
                    str2 = str;
                }
                if (fVar.verify(str2, sSLSocket.getSession())) {
                    return sSLSocket;
                }
                throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(str));
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }
}
