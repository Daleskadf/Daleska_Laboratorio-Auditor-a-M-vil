package D;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.C0498a0;
import androidx.camera.core.impl.C0501c;
import java.util.UUID;
import v.C1878a;
/* loaded from: classes.dex */
public final class J implements androidx.camera.core.impl.x0, E {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f619a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.camera.core.impl.W f620b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public J(int i7) {
        this(androidx.camera.core.impl.W.b(), 0);
        this.f619a = i7;
        switch (i7) {
            case 1:
                this(androidx.camera.core.impl.W.b(), 1);
                return;
            case 2:
                this.f620b = androidx.camera.core.impl.W.b();
                return;
            default:
                return;
        }
    }

    @Override // D.E
    public final androidx.camera.core.impl.V M() {
        switch (this.f619a) {
            case 0:
                return this.f620b;
            case 1:
                return this.f620b;
            default:
                throw null;
        }
    }

    public void a(CaptureRequest.Key key, Object obj, androidx.camera.core.impl.F f) {
        this.f620b.i(C1878a.o0(key), f, obj);
    }

    @Override // androidx.camera.core.impl.x0
    public androidx.camera.core.impl.y0 a0() {
        switch (this.f619a) {
            case 0:
                return new androidx.camera.core.impl.M(androidx.camera.core.impl.Z.a(this.f620b));
            default:
                return new C0498a0(androidx.camera.core.impl.Z.a(this.f620b));
        }
    }

    public J(androidx.camera.core.impl.W w2, int i7) {
        Object obj;
        Object obj2;
        this.f619a = i7;
        switch (i7) {
            case 1:
                this.f620b = w2;
                Object obj3 = null;
                try {
                    obj = w2.G(I.l.j);
                } catch (IllegalArgumentException unused) {
                    obj = null;
                }
                Class cls = (Class) obj;
                if (cls != null && !cls.equals(j0.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                this.f620b.j(androidx.camera.core.impl.y0.f7691Q, A0.PREVIEW);
                C0501c c0501c = I.l.j;
                androidx.camera.core.impl.W w7 = this.f620b;
                w7.j(c0501c, j0.class);
                try {
                    obj3 = w7.G(I.l.f2121i);
                } catch (IllegalArgumentException unused2) {
                }
                if (obj3 == null) {
                    this.f620b.j(I.l.f2121i, j0.class.getCanonicalName() + "-" + UUID.randomUUID());
                }
                int i8 = -1;
                try {
                    i8 = w2.G(androidx.camera.core.impl.Q.f7578B);
                } catch (IllegalArgumentException unused3) {
                }
                if (((Integer) i8).intValue() == -1) {
                    w2.j(androidx.camera.core.impl.Q.f7578B, 2);
                    return;
                }
                return;
            default:
                this.f620b = w2;
                Object obj4 = null;
                try {
                    obj2 = w2.G(I.l.j);
                } catch (IllegalArgumentException unused4) {
                    obj2 = null;
                }
                Class cls2 = (Class) obj2;
                if (cls2 != null && !cls2.equals(M.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
                }
                this.f620b.j(androidx.camera.core.impl.y0.f7691Q, A0.IMAGE_ANALYSIS);
                C0501c c0501c2 = I.l.j;
                androidx.camera.core.impl.W w8 = this.f620b;
                w8.j(c0501c2, M.class);
                try {
                    obj4 = w8.G(I.l.f2121i);
                } catch (IllegalArgumentException unused5) {
                }
                if (obj4 == null) {
                    w8.j(I.l.f2121i, M.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }
}
