package y;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import w.C1894D;
/* loaded from: classes.dex */
public final class r implements t {

    /* renamed from: a  reason: collision with root package name */
    public final SessionConfiguration f16595a;

    /* renamed from: b  reason: collision with root package name */
    public final List f16596b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [y.q] */
    /* JADX WARN: Type inference failed for: r1v4, types: [y.q] */
    /* JADX WARN: Type inference failed for: r1v5, types: [y.q] */
    /* JADX WARN: Type inference failed for: r1v7, types: [y.q] */
    public r(ArrayList arrayList, G.k kVar, C1894D c1894d) {
        C2030j c2030j;
        SessionConfiguration sessionConfiguration = new SessionConfiguration(0, u.a(arrayList), kVar, c1894d);
        this.f16595a = sessionConfiguration;
        List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
        for (OutputConfiguration outputConfiguration : outputConfigurations) {
            C2028h c2028h = null;
            if (outputConfiguration != null) {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 33) {
                    c2030j = new q(outputConfiguration);
                } else if (i7 >= 28) {
                    c2030j = new q(new m(outputConfiguration));
                } else if (i7 >= 26) {
                    c2030j = new q(new C2031k(outputConfiguration));
                } else if (i7 >= 24) {
                    c2030j = new q(new C2029i(outputConfiguration));
                } else {
                    c2030j = null;
                }
                if (c2030j != null) {
                    c2028h = new C2028h(c2030j);
                }
            }
            arrayList2.add(c2028h);
        }
        this.f16596b = DesugarCollections.unmodifiableList(arrayList2);
    }

    @Override // y.t
    public final Object a() {
        return this.f16595a;
    }

    @Override // y.t
    public final int b() {
        return this.f16595a.getSessionType();
    }

    @Override // y.t
    public final CameraCaptureSession.StateCallback c() {
        return this.f16595a.getStateCallback();
    }

    @Override // y.t
    public final List d() {
        return this.f16596b;
    }

    @Override // y.t
    public final void e(C2027g c2027g) {
        this.f16595a.setInputConfiguration(c2027g.f16577a.f16576a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        return Objects.equals(this.f16595a, ((r) obj).f16595a);
    }

    @Override // y.t
    public final C2027g f() {
        return C2027g.a(this.f16595a.getInputConfiguration());
    }

    @Override // y.t
    public final Executor g() {
        return this.f16595a.getExecutor();
    }

    @Override // y.t
    public final void h(CaptureRequest captureRequest) {
        this.f16595a.setSessionParameters(captureRequest);
    }

    public final int hashCode() {
        return this.f16595a.hashCode();
    }
}
