package M;

import D.C0061k;
import android.view.Surface;
import androidx.camera.core.impl.I;
/* loaded from: classes.dex */
public final /* synthetic */ class k implements H.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f3094a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f3095b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3096c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C0061k f3097d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0061k f3098e;

    public /* synthetic */ k(m mVar, l lVar, int i7, C0061k c0061k, C0061k c0061k2) {
        this.f3094a = mVar;
        this.f3095b = lVar;
        this.f3096c = i7;
        this.f3097d = c0061k;
        this.f3098e = c0061k2;
    }

    @Override // H.a, J2.g
    public final E3.b apply(Object obj) {
        boolean z7;
        l lVar = this.f3095b;
        Surface surface = (Surface) obj;
        m mVar = this.f3094a;
        mVar.getClass();
        surface.getClass();
        try {
            lVar.d();
            n nVar = new n(surface, this.f3096c, mVar.f3108g.f7621a, this.f3097d, this.f3098e);
            nVar.f3124e0.f5535b.a(new i(lVar, 1), j3.f.r());
            if (lVar.f3102r == null) {
                z7 = true;
            } else {
                z7 = false;
            }
            g0.c.g("Consumer can only be linked once.", z7);
            lVar.f3102r = nVar;
            return H.i.c(nVar);
        } catch (I e7) {
            return new H.k(e7, 1);
        }
    }
}
