package H2;

import M0.x;
import Q6.AbstractC0281b;
import Q6.s;
import a6.AbstractC0478g;
import a6.B;
import a6.C0472a;
import a6.C0473b;
import a6.C0483l;
import a6.l0;
import a6.o0;
import a6.p0;
import c6.AbstractC0671h0;
import c6.k2;
import d6.C0906c;
import d6.o;
import d6.p;
import d6.w;
import e6.C0972g;
import e6.EnumC0966a;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.concurrent.CountDownLatch;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1966a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1967b;

    /* renamed from: c  reason: collision with root package name */
    public Object f1968c;

    /* renamed from: d  reason: collision with root package name */
    public Object f1969d;

    public /* synthetic */ a() {
        this.f1966a = 9;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Q6.y, java.lang.Object] */
    private final void a() {
        Socket socket;
        SSLSession sSLSession;
        SSLSocket sSLSocket;
        l0 l0Var;
        try {
            ((CountDownLatch) this.f1967b).await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        s b5 = AbstractC0281b.b(new Object());
        try {
            try {
                p pVar = (p) this.f1969d;
                B b7 = pVar.f10452N;
                if (b7 == null) {
                    socket = pVar.f10439A.createSocket(pVar.f10454a.getAddress(), ((p) this.f1969d).f10454a.getPort());
                } else {
                    InetSocketAddress inetSocketAddress = b7.f7065a;
                    if (inetSocketAddress instanceof InetSocketAddress) {
                        socket = p.h(pVar, b7.f7066b, inetSocketAddress, b7.f7067c, b7.f7068d);
                    } else {
                        o0 o0Var = o0.f7179m;
                        throw new p0(o0Var.g("Unsupported SocketAddress implementation " + ((p) this.f1969d).f10452N.f7065a.getClass()));
                    }
                }
                p pVar2 = (p) this.f1969d;
                SSLSocketFactory sSLSocketFactory = pVar2.f10440B;
                if (sSLSocketFactory != null) {
                    String str = pVar2.f10455b;
                    URI a7 = AbstractC0671h0.a(str);
                    if (a7.getHost() != null) {
                        str = a7.getHost();
                    }
                    SSLSocket a8 = w.a(sSLSocketFactory, socket, str, ((p) this.f1969d).l(), ((p) this.f1969d).f10443E);
                    sSLSession = a8.getSession();
                    sSLSocket = a8;
                } else {
                    sSLSession = null;
                    sSLSocket = socket;
                }
                sSLSocket.setTcpNoDelay(true);
                s b8 = AbstractC0281b.b(AbstractC0281b.f(sSLSocket));
                ((C0906c) this.f1968c).a(AbstractC0281b.e(sSLSocket), sSLSocket);
                p pVar3 = (p) this.f1969d;
                C0473b c0473b = pVar3.f10472u;
                c0473b.getClass();
                x xVar = new x(c0473b, 28);
                xVar.L(AbstractC0478g.f7144a, sSLSocket.getRemoteSocketAddress());
                xVar.L(AbstractC0478g.f7145b, sSLSocket.getLocalSocketAddress());
                xVar.L(AbstractC0478g.f7146c, sSLSession);
                C0472a c0472a = k2.f8879a;
                if (sSLSession == null) {
                    l0Var = l0.NONE;
                } else {
                    l0Var = l0.PRIVACY_AND_INTEGRITY;
                }
                xVar.L(c0472a, l0Var);
                pVar3.f10472u = xVar.r();
                p pVar4 = (p) this.f1969d;
                pVar4.f10459g.getClass();
                pVar4.f10471t = new o(pVar4, new C0972g(b8));
                synchronized (((p) this.f1969d).f10462k) {
                    try {
                        ((p) this.f1969d).getClass();
                        if (sSLSession != null) {
                            new C0483l(sSLSession);
                            ((p) this.f1969d).getClass();
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                p pVar5 = (p) this.f1969d;
                pVar5.f10459g.getClass();
                pVar5.f10471t = new o(pVar5, new C0972g(b5));
                throw th;
            }
        } catch (p0 e7) {
            ((p) this.f1969d).u(0, EnumC0966a.INTERNAL_ERROR, e7.f7188a);
            p pVar6 = (p) this.f1969d;
            pVar6.f10459g.getClass();
            pVar6.f10471t = new o(pVar6, new C0972g(b5));
        } catch (Exception e8) {
            ((p) this.f1969d).q(e8);
            p pVar7 = (p) this.f1969d;
            pVar7.f10459g.getClass();
            pVar7.f10471t = new o(pVar7, new C0972g(b5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b A[Catch: Exception -> 0x0085, FileNotFoundException -> 0x0089, TryCatch #4 {FileNotFoundException -> 0x0089, blocks: (B:14:0x003b, B:16:0x005e, B:20:0x0071, B:21:0x0077, B:52:0x00ca, B:53:0x00cf, B:55:0x00e5, B:56:0x00fb, B:57:0x0103, B:58:0x011f, B:59:0x0139, B:60:0x0144, B:62:0x0157, B:66:0x016f, B:65:0x016b, B:67:0x0174, B:68:0x0179, B:70:0x018b, B:71:0x0195, B:23:0x007b, B:30:0x008c, B:33:0x0096, B:36:0x009f, B:39:0x00a9, B:42:0x00b3), top: B:247:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c A[Catch: Exception -> 0x0085, FileNotFoundException -> 0x0089, TryCatch #4 {FileNotFoundException -> 0x0089, blocks: (B:14:0x003b, B:16:0x005e, B:20:0x0071, B:21:0x0077, B:52:0x00ca, B:53:0x00cf, B:55:0x00e5, B:56:0x00fb, B:57:0x0103, B:58:0x011f, B:59:0x0139, B:60:0x0144, B:62:0x0157, B:66:0x016f, B:65:0x016b, B:67:0x0174, B:68:0x0179, B:70:0x018b, B:71:0x0195, B:23:0x007b, B:30:0x008c, B:33:0x0096, B:36:0x009f, B:39:0x00a9, B:42:0x00b3), top: B:247:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096 A[Catch: Exception -> 0x0085, FileNotFoundException -> 0x0089, TryCatch #4 {FileNotFoundException -> 0x0089, blocks: (B:14:0x003b, B:16:0x005e, B:20:0x0071, B:21:0x0077, B:52:0x00ca, B:53:0x00cf, B:55:0x00e5, B:56:0x00fb, B:57:0x0103, B:58:0x011f, B:59:0x0139, B:60:0x0144, B:62:0x0157, B:66:0x016f, B:65:0x016b, B:67:0x0174, B:68:0x0179, B:70:0x018b, B:71:0x0195, B:23:0x007b, B:30:0x008c, B:33:0x0096, B:36:0x009f, B:39:0x00a9, B:42:0x00b3), top: B:247:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f A[Catch: Exception -> 0x0085, FileNotFoundException -> 0x0089, TryCatch #4 {FileNotFoundException -> 0x0089, blocks: (B:14:0x003b, B:16:0x005e, B:20:0x0071, B:21:0x0077, B:52:0x00ca, B:53:0x00cf, B:55:0x00e5, B:56:0x00fb, B:57:0x0103, B:58:0x011f, B:59:0x0139, B:60:0x0144, B:62:0x0157, B:66:0x016f, B:65:0x016b, B:67:0x0174, B:68:0x0179, B:70:0x018b, B:71:0x0195, B:23:0x007b, B:30:0x008c, B:33:0x0096, B:36:0x009f, B:39:0x00a9, B:42:0x00b3), top: B:247:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9 A[Catch: Exception -> 0x0085, FileNotFoundException -> 0x0089, TryCatch #4 {FileNotFoundException -> 0x0089, blocks: (B:14:0x003b, B:16:0x005e, B:20:0x0071, B:21:0x0077, B:52:0x00ca, B:53:0x00cf, B:55:0x00e5, B:56:0x00fb, B:57:0x0103, B:58:0x011f, B:59:0x0139, B:60:0x0144, B:62:0x0157, B:66:0x016f, B:65:0x016b, B:67:0x0174, B:68:0x0179, B:70:0x018b, B:71:0x0195, B:23:0x007b, B:30:0x008c, B:33:0x0096, B:36:0x009f, B:39:0x00a9, B:42:0x00b3), top: B:247:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3 A[Catch: Exception -> 0x0085, FileNotFoundException -> 0x0089, TryCatch #4 {FileNotFoundException -> 0x0089, blocks: (B:14:0x003b, B:16:0x005e, B:20:0x0071, B:21:0x0077, B:52:0x00ca, B:53:0x00cf, B:55:0x00e5, B:56:0x00fb, B:57:0x0103, B:58:0x011f, B:59:0x0139, B:60:0x0144, B:62:0x0157, B:66:0x016f, B:65:0x016b, B:67:0x0174, B:68:0x0179, B:70:0x018b, B:71:0x0195, B:23:0x007b, B:30:0x008c, B:33:0x0096, B:36:0x009f, B:39:0x00a9, B:42:0x00b3), top: B:247:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0179 A[Catch: Exception -> 0x0085, FileNotFoundException -> 0x0089, TryCatch #4 {FileNotFoundException -> 0x0089, blocks: (B:14:0x003b, B:16:0x005e, B:20:0x0071, B:21:0x0077, B:52:0x00ca, B:53:0x00cf, B:55:0x00e5, B:56:0x00fb, B:57:0x0103, B:58:0x011f, B:59:0x0139, B:60:0x0144, B:62:0x0157, B:66:0x016f, B:65:0x016b, B:67:0x0174, B:68:0x0179, B:70:0x018b, B:71:0x0195, B:23:0x007b, B:30:0x008c, B:33:0x0096, B:36:0x009f, B:39:0x00a9, B:42:0x00b3), top: B:247:0x003b }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.a.run():void");
    }

    public String toString() {
        switch (this.f1966a) {
            case 1:
                return ((Runnable) this.f1968c).toString() + "(scheduled in SynchronizationContext)";
            default:
                return super.toString();
        }
    }

    public a(b bVar, D2.b bVar2, D2.a aVar) {
        this.f1966a = 0;
        this.f1967b = bVar;
        this.f1968c = bVar2;
        this.f1969d = aVar;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i7) {
        this.f1966a = i7;
        this.f1969d = obj;
        this.f1967b = obj2;
        this.f1968c = obj3;
    }
}
