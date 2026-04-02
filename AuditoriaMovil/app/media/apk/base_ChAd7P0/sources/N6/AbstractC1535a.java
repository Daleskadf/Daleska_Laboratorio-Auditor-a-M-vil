package n6;

import h3.AbstractC1079a;
import w6.p;
/* renamed from: n6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1535a implements g {

    /* renamed from: a  reason: collision with root package name */
    public final h f14387a;

    public AbstractC1535a(h hVar) {
        this.f14387a = hVar;
    }

    @Override // n6.i
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // n6.i
    public g get(h hVar) {
        return AbstractC1079a.j(this, hVar);
    }

    @Override // n6.g
    public final h getKey() {
        return this.f14387a;
    }

    @Override // n6.i
    public i minusKey(h hVar) {
        return AbstractC1079a.p(this, hVar);
    }

    @Override // n6.i
    public final i plus(i iVar) {
        return AbstractC1079a.q(this, iVar);
    }
}
