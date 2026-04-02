package d6;

import a1.C0415A;
import a6.AbstractC0494x;
import a6.V;
import a6.w0;
import b3.C0585f;
import c6.AbstractC0671h0;
import c6.C0651a1;
import c6.G0;
import c6.q2;
import c6.s2;
import com.google.firebase.firestore.Z;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;
/* renamed from: d6.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0913j extends AbstractC0494x {

    /* renamed from: m  reason: collision with root package name */
    public static final io.grpc.okhttp.internal.c f10395m;

    /* renamed from: n  reason: collision with root package name */
    public static final long f10396n;

    /* renamed from: o  reason: collision with root package name */
    public static final A.m f10397o;

    /* renamed from: a  reason: collision with root package name */
    public final C0651a1 f10398a;

    /* renamed from: e  reason: collision with root package name */
    public SSLSocketFactory f10402e;

    /* renamed from: b  reason: collision with root package name */
    public final q2 f10399b = s2.f8982d;

    /* renamed from: c  reason: collision with root package name */
    public final A.m f10400c = f10397o;

    /* renamed from: d  reason: collision with root package name */
    public final A.m f10401d = new A.m(AbstractC0671h0.f8843q, 27);
    public final io.grpc.okhttp.internal.c f = f10395m;

    /* renamed from: g  reason: collision with root package name */
    public EnumC0911h f10403g = EnumC0911h.TLS;

    /* renamed from: h  reason: collision with root package name */
    public long f10404h = Long.MAX_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public final long f10405i = AbstractC0671h0.f8838l;
    public final int j = 65535;

    /* renamed from: k  reason: collision with root package name */
    public final int f10406k = 4194304;

    /* renamed from: l  reason: collision with root package name */
    public final int f10407l = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    static {
        Logger.getLogger(C0913j.class.getName());
        io.grpc.okhttp.internal.b bVar = new io.grpc.okhttp.internal.b(io.grpc.okhttp.internal.c.f12538e);
        bVar.a(io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        bVar.b(io.grpc.okhttp.internal.n.TLS_1_2);
        if (bVar.f12534a) {
            bVar.f12537d = true;
            f10395m = new io.grpc.okhttp.internal.c(bVar);
            f10396n = TimeUnit.DAYS.toNanos(1000L);
            f10397o = new A.m(new Z(17), 27);
            EnumSet.of(w0.MTLS, w0.CUSTOM_MANAGERS);
            return;
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public C0913j(String str) {
        this.f10398a = new C0651a1(str, new C0585f(this, 4), new C0415A(this));
    }

    @Override // a6.V
    public final void b(TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(30L);
        this.f10404h = nanos;
        long max = Math.max(nanos, G0.f8455k);
        this.f10404h = max;
        if (max >= f10396n) {
            this.f10404h = Long.MAX_VALUE;
        }
    }

    @Override // a6.V
    public final void c() {
        this.f10403g = EnumC0911h.PLAINTEXT;
    }

    @Override // a6.AbstractC0494x
    public final V d() {
        return this.f10398a;
    }
}
