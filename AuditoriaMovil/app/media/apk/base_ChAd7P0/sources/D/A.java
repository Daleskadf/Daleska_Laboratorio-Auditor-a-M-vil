package D;

import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.C0501c;
import java.util.UUID;
/* loaded from: classes.dex */
public final class A implements androidx.camera.core.impl.x0 {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.camera.core.impl.W f595a;

    public A(androidx.camera.core.impl.W w2, int i7) {
        Object obj;
        Object obj2;
        switch (i7) {
            case 1:
                this.f595a = w2;
                Object obj3 = null;
                try {
                    obj = w2.G(I.l.j);
                } catch (IllegalArgumentException unused) {
                    obj = null;
                }
                Class cls = (Class) obj;
                if (cls != null && !cls.equals(X.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                this.f595a.j(androidx.camera.core.impl.y0.f7691Q, A0.IMAGE_CAPTURE);
                C0501c c0501c = I.l.j;
                androidx.camera.core.impl.W w7 = this.f595a;
                w7.j(c0501c, X.class);
                try {
                    obj3 = w7.G(I.l.f2121i);
                } catch (IllegalArgumentException unused2) {
                }
                if (obj3 == null) {
                    this.f595a.j(I.l.f2121i, X.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            default:
                this.f595a = w2;
                Object obj4 = null;
                try {
                    obj2 = w2.G(I.l.j);
                } catch (IllegalArgumentException unused3) {
                    obj2 = null;
                }
                Class cls2 = (Class) obj2;
                if (cls2 != null && !cls2.equals(C0075z.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
                }
                C0501c c0501c2 = I.l.j;
                androidx.camera.core.impl.W w8 = this.f595a;
                w8.j(c0501c2, C0075z.class);
                try {
                    obj4 = w8.G(I.l.f2121i);
                } catch (IllegalArgumentException unused4) {
                }
                if (obj4 == null) {
                    w8.j(I.l.f2121i, C0075z.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }

    @Override // D.E
    public androidx.camera.core.impl.V M() {
        return this.f595a;
    }

    @Override // androidx.camera.core.impl.x0
    public androidx.camera.core.impl.y0 a0() {
        return new androidx.camera.core.impl.N(androidx.camera.core.impl.Z.a(this.f595a));
    }

    public A() {
        this(androidx.camera.core.impl.W.b(), 1);
    }
}
