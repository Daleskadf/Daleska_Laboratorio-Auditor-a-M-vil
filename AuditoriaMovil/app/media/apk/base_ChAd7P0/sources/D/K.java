package D;

import android.util.Size;
import androidx.camera.core.impl.C0501c;
/* loaded from: classes.dex */
public final class K {

    /* renamed from: a  reason: collision with root package name */
    public static final androidx.camera.core.impl.M f621a;

    static {
        Object size = new Size(640, 480);
        D d7 = D.f607d;
        Object bVar = new P.b(P.a.f3887a, new P.c(L.a.f2816b), null);
        J j = new J(0);
        C0501c c0501c = androidx.camera.core.impl.Q.f7580D;
        androidx.camera.core.impl.W w2 = j.f620b;
        w2.j(c0501c, size);
        w2.j(androidx.camera.core.impl.y0.f7687M, 1);
        w2.j(androidx.camera.core.impl.Q.f7585y, 0);
        w2.j(androidx.camera.core.impl.Q.f7583G, bVar);
        if (d7.equals(d7)) {
            w2.j(androidx.camera.core.impl.O.f7575x, d7);
            f621a = new androidx.camera.core.impl.M(androidx.camera.core.impl.Z.a(w2));
            return;
        }
        throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
    }
}
