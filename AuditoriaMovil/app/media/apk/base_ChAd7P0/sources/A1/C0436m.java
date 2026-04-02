package a1;

import A3.AbstractC0021t;
import A3.N;
import A3.j0;
import android.net.Uri;
import android.util.SparseArray;
import java.io.Closeable;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Locale;
import javax.net.SocketFactory;
import org.apache.tika.utils.StringUtils;
/* renamed from: a1.m */
/* loaded from: classes.dex */
public final class C0436m implements Closeable {

    /* renamed from: Y */
    public Uri f6850Y;

    /* renamed from: a */
    public final C5.i f6852a;

    /* renamed from: b */
    public final C5.i f6853b;

    /* renamed from: c */
    public final String f6854c;

    /* renamed from: d */
    public final SocketFactory f6855d;

    /* renamed from: e0 */
    public S0.t f6857e0;

    /* renamed from: f0 */
    public String f6858f0;

    /* renamed from: h0 */
    public RunnableC0435l f6860h0;

    /* renamed from: i0 */
    public K0.o f6861i0;

    /* renamed from: k0 */
    public boolean f6863k0;

    /* renamed from: l0 */
    public boolean f6864l0;

    /* renamed from: m0 */
    public boolean f6865m0;

    /* renamed from: e */
    public final ArrayDeque f6856e = new ArrayDeque();
    public final SparseArray f = new SparseArray();

    /* renamed from: X */
    public final N f6849X = new N(this);

    /* renamed from: Z */
    public y f6851Z = new y(new M0.x(this));

    /* renamed from: g0 */
    public long f6859g0 = 60000;

    /* renamed from: n0 */
    public long f6866n0 = -9223372036854775807L;

    /* renamed from: j0 */
    public int f6862j0 = -1;

    public C0436m(C5.i iVar, C5.i iVar2, String str, Uri uri, SocketFactory socketFactory) {
        this.f6852a = iVar;
        this.f6853b = iVar2;
        this.f6854c = str;
        this.f6855d = socketFactory;
        this.f6850Y = z.f(uri);
        this.f6857e0 = z.d(uri);
    }

    public static /* synthetic */ N a(C0436m c0436m) {
        return c0436m.f6849X;
    }

    public static /* synthetic */ Uri b(C0436m c0436m) {
        return c0436m.f6850Y;
    }

    public static void c(C0436m c0436m, R0.a aVar) {
        c0436m.getClass();
        if (c0436m.f6863k0) {
            c0436m.f6853b.q0(aVar);
            return;
        }
        String message = aVar.getMessage();
        if (message == null) {
            message = StringUtils.EMPTY;
        }
        c0436m.f6852a.s0(message, aVar);
    }

    public static /* synthetic */ SparseArray d(C0436m c0436m) {
        return c0436m.f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RunnableC0435l runnableC0435l = this.f6860h0;
        if (runnableC0435l != null) {
            runnableC0435l.close();
            this.f6860h0 = null;
            Uri uri = this.f6850Y;
            String str = this.f6858f0;
            str.getClass();
            N n7 = this.f6849X;
            C0436m c0436m = (C0436m) n7.f106d;
            int i7 = c0436m.f6862j0;
            if (i7 != -1 && i7 != 0) {
                c0436m.f6862j0 = 0;
                n7.r(n7.h(12, str, j0.f157X, uri));
            }
        }
        this.f6851Z.close();
    }

    public final void g() {
        long j;
        p pVar = (p) this.f6856e.pollFirst();
        if (pVar == null) {
            r rVar = (r) this.f6853b.f593b;
            long j8 = rVar.f6891i0;
            if (j8 != -9223372036854775807L) {
                j = K0.x.Z(j8);
            } else {
                long j9 = rVar.f6892j0;
                if (j9 != -9223372036854775807L) {
                    j = K0.x.Z(j9);
                } else {
                    j = 0;
                }
            }
            rVar.f6885d.n(j);
            return;
        }
        Uri a7 = pVar.a();
        K0.a.k(pVar.f6872c);
        String str = pVar.f6872c;
        String str2 = this.f6858f0;
        N n7 = this.f6849X;
        ((C0436m) n7.f106d).f6862j0 = 0;
        AbstractC0021t.d("Transport", str);
        n7.r(n7.h(10, str2, j0.b(1, new Object[]{"Transport", str}, null), a7));
    }

    public final Socket j(Uri uri) {
        boolean z7;
        int i7;
        if (uri.getHost() != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        if (uri.getPort() > 0) {
            i7 = uri.getPort();
        } else {
            i7 = 554;
        }
        String host = uri.getHost();
        host.getClass();
        return this.f6855d.createSocket(host, i7);
    }

    public final void m(long j) {
        boolean z7;
        if (this.f6862j0 == 2 && !this.f6865m0) {
            Uri uri = this.f6850Y;
            String str = this.f6858f0;
            str.getClass();
            N n7 = this.f6849X;
            C0436m c0436m = (C0436m) n7.f106d;
            if (c0436m.f6862j0 == 2) {
                z7 = true;
            } else {
                z7 = false;
            }
            K0.a.j(z7);
            n7.r(n7.h(5, str, j0.f157X, uri));
            c0436m.f6865m0 = true;
        }
        this.f6866n0 = j;
    }

    public final void n(long j) {
        boolean z7;
        Uri uri = this.f6850Y;
        String str = this.f6858f0;
        str.getClass();
        N n7 = this.f6849X;
        int i7 = ((C0436m) n7.f106d).f6862j0;
        if (i7 != 1 && i7 != 2) {
            z7 = false;
        } else {
            z7 = true;
        }
        K0.a.j(z7);
        C0417C c0417c = C0417C.f6749c;
        Object[] objArr = {Double.valueOf(j / 1000.0d)};
        int i8 = K0.x.f2529a;
        n7.r(n7.h(6, str, j0.b(1, new Object[]{"Range", String.format(Locale.US, "npt=%.3f-", objArr)}, null), uri));
    }
}
