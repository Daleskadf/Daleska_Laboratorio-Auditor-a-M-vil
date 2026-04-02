package h1;

import D.AbstractC0059i;
import H0.W;
/* renamed from: h1.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1073g extends n implements Comparable {

    /* renamed from: e  reason: collision with root package name */
    public final int f11260e;
    public final int f;

    public C1073g(int i7, W w2, int i8, C1076j c1076j, int i9) {
        super(i7, w2, i8);
        this.f11260e = AbstractC0059i.v(i9, c1076j.f11278w) ? 1 : 0;
        this.f = this.f11294d.b();
    }

    @Override // h1.n
    public final int a() {
        return this.f11260e;
    }

    @Override // h1.n
    public final /* bridge */ /* synthetic */ boolean b(n nVar) {
        C1073g c1073g = (C1073g) nVar;
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f, ((C1073g) obj).f);
    }
}
