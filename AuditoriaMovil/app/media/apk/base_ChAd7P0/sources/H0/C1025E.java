package h0;

import B5.AbstractC0038k;
import android.view.WindowInsets;
/* renamed from: h0.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1025E extends AbstractC1028H {

    /* renamed from: a  reason: collision with root package name */
    public final WindowInsets.Builder f11158a;

    public C1025E() {
        this.f11158a = AbstractC0038k.h();
    }

    @Override // h0.AbstractC1028H
    public C1036P b() {
        WindowInsets build;
        a();
        build = this.f11158a.build();
        C1036P c8 = C1036P.c(null, build);
        c8.f11172a.k(null);
        return c8;
    }

    @Override // h0.AbstractC1028H
    public void c(Z.c cVar) {
        this.f11158a.setStableInsets(cVar.b());
    }

    @Override // h0.AbstractC1028H
    public void d(Z.c cVar) {
        this.f11158a.setSystemWindowInsets(cVar.b());
    }

    public C1025E(C1036P c1036p) {
        super(c1036p);
        WindowInsets.Builder h8;
        WindowInsets b5 = c1036p.b();
        if (b5 != null) {
            h8 = AbstractC1024D.e(b5);
        } else {
            h8 = AbstractC0038k.h();
        }
        this.f11158a = h8;
    }
}
