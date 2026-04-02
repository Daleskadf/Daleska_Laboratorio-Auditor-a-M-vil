package D;

import android.os.Handler;
import androidx.camera.core.impl.C0501c;
import java.util.Set;
import java.util.concurrent.Executor;
import u.C1842a;
import u.C1843b;
import u.C1844c;
/* loaded from: classes.dex */
public final class C implements I.l {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.camera.core.impl.Z f605a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0501c f599b = new C0501c("camerax.core.appConfig.cameraFactoryProvider", C1842a.class, null);

    /* renamed from: c  reason: collision with root package name */
    public static final C0501c f600c = new C0501c("camerax.core.appConfig.deviceSurfaceManagerProvider", C1843b.class, null);

    /* renamed from: d  reason: collision with root package name */
    public static final C0501c f601d = new C0501c("camerax.core.appConfig.useCaseConfigFactoryProvider", C1844c.class, null);

    /* renamed from: e  reason: collision with root package name */
    public static final C0501c f602e = new C0501c("camerax.core.appConfig.cameraExecutor", Executor.class, null);
    public static final C0501c f = new C0501c("camerax.core.appConfig.schedulerHandler", Handler.class, null);

    /* renamed from: X  reason: collision with root package name */
    public static final C0501c f596X = new C0501c("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);

    /* renamed from: Y  reason: collision with root package name */
    public static final C0501c f597Y = new C0501c("camerax.core.appConfig.availableCamerasLimiter", C0070u.class, null);

    /* renamed from: Z  reason: collision with root package name */
    public static final C0501c f598Z = new C0501c("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);

    /* renamed from: e0  reason: collision with root package name */
    public static final C0501c f603e0 = new C0501c("camerax.core.appConfig.cameraProviderInitRetryPolicy", m0.class, null);

    /* renamed from: f0  reason: collision with root package name */
    public static final C0501c f604f0 = new C0501c("camerax.core.appConfig.quirksSettings", androidx.camera.core.impl.c0.class, null);

    public C(androidx.camera.core.impl.Z z7) {
        this.f605a = z7;
    }

    @Override // androidx.camera.core.impl.G
    public final /* synthetic */ Object G(C0501c c0501c) {
        return AbstractC0059i.p(this, c0501c);
    }

    @Override // androidx.camera.core.impl.G
    public final /* synthetic */ Set H() {
        return AbstractC0059i.n(this);
    }

    @Override // androidx.camera.core.impl.G
    public final /* synthetic */ Set U(C0501c c0501c) {
        return AbstractC0059i.g(this, c0501c);
    }

    @Override // I.l
    public final /* synthetic */ String X(String str) {
        throw null;
    }

    public final C0070u a() {
        Object obj;
        try {
            obj = this.f605a.G(f597Y);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (C0070u) obj;
    }

    public final C1842a b() {
        Object obj;
        try {
            obj = this.f605a.G(f599b);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (C1842a) obj;
    }

    public final long c() {
        C0501c c0501c = f598Z;
        long j = -1L;
        androidx.camera.core.impl.Z z7 = this.f605a;
        z7.getClass();
        try {
            j = z7.G(c0501c);
        } catch (IllegalArgumentException unused) {
        }
        return ((Long) j).longValue();
    }

    @Override // androidx.camera.core.impl.G
    public final /* synthetic */ androidx.camera.core.impl.F e0(C0501c c0501c) {
        return AbstractC0059i.e(this, c0501c);
    }

    @Override // androidx.camera.core.impl.G
    public final /* synthetic */ Object f0(C0501c c0501c, Object obj) {
        return AbstractC0059i.q(this, c0501c, obj);
    }

    @Override // androidx.camera.core.impl.G
    public final /* synthetic */ boolean h(C0501c c0501c) {
        return AbstractC0059i.a(this, c0501c);
    }

    public final C1843b i() {
        Object obj;
        try {
            obj = this.f605a.G(f600c);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (C1843b) obj;
    }

    public final C1844c j() {
        Object obj;
        try {
            obj = this.f605a.G(f601d);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (C1844c) obj;
    }

    @Override // androidx.camera.core.impl.G
    public final /* synthetic */ void m(A4.d dVar) {
        AbstractC0059i.b(this, dVar);
    }

    @Override // androidx.camera.core.impl.G
    public final /* synthetic */ Object n(C0501c c0501c, androidx.camera.core.impl.F f4) {
        return AbstractC0059i.r(this, c0501c, f4);
    }

    @Override // I.l
    public final /* synthetic */ String o() {
        throw null;
    }

    @Override // androidx.camera.core.impl.f0
    public final androidx.camera.core.impl.G u() {
        return this.f605a;
    }
}
