package e4;

import java.util.Comparator;
/* loaded from: classes.dex */
public abstract class k implements i {

    /* renamed from: a  reason: collision with root package name */
    public final Object f10879a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f10880b;

    /* renamed from: c  reason: collision with root package name */
    public i f10881c;

    /* renamed from: d  reason: collision with root package name */
    public final i f10882d;

    public k(Object obj, Object obj2, i iVar, i iVar2) {
        this.f10879a = obj;
        this.f10880b = obj2;
        g gVar = g.f10878a;
        this.f10881c = iVar == null ? gVar : iVar;
        this.f10882d = iVar2 == null ? gVar : iVar2;
    }

    @Override // e4.i
    public final i a() {
        return this.f10881c;
    }

    @Override // e4.i
    public final i b(Object obj, Object obj2, Comparator comparator) {
        k k2;
        int compare = comparator.compare(obj, this.f10879a);
        if (compare < 0) {
            k2 = k(null, null, this.f10881c.b(obj, obj2, comparator), null);
        } else if (compare == 0) {
            k2 = k(obj, obj2, null, null);
        } else {
            k2 = k(null, null, null, this.f10882d.b(obj, obj2, comparator));
        }
        return k2.l();
    }

    @Override // e4.i
    public final i d() {
        return this.f10882d;
    }

    @Override // e4.i
    public final i e(Object obj, Comparator comparator) {
        k kVar;
        k k2;
        k kVar2;
        if (comparator.compare(obj, this.f10879a) < 0) {
            if (!this.f10881c.isEmpty() && !this.f10881c.c() && !((k) this.f10881c).f10881c.c()) {
                kVar2 = n();
            } else {
                kVar2 = this;
            }
            k2 = kVar2.k(null, null, kVar2.f10881c.e(obj, comparator), null);
        } else {
            if (this.f10881c.c()) {
                kVar = p();
            } else {
                kVar = this;
            }
            i iVar = kVar.f10882d;
            if (!iVar.isEmpty() && !iVar.c() && !((k) iVar).f10881c.c()) {
                kVar = kVar.i();
                if (kVar.f10881c.a().c()) {
                    kVar = kVar.p().i();
                }
            }
            if (comparator.compare(obj, kVar.f10879a) == 0) {
                i iVar2 = kVar.f10882d;
                if (iVar2.isEmpty()) {
                    return g.f10878a;
                }
                i f = iVar2.f();
                kVar = kVar.k(f.getKey(), f.getValue(), null, ((k) iVar2).o());
            }
            k2 = kVar.k(null, null, null, kVar.f10882d.e(obj, comparator));
        }
        return k2.l();
    }

    @Override // e4.i
    public final i f() {
        if (this.f10881c.isEmpty()) {
            return this;
        }
        return this.f10881c.f();
    }

    @Override // e4.i
    public final Object getKey() {
        return this.f10879a;
    }

    @Override // e4.i
    public final Object getValue() {
        return this.f10880b;
    }

    @Override // e4.i
    public final i h() {
        i iVar = this.f10882d;
        if (iVar.isEmpty()) {
            return this;
        }
        return iVar.h();
    }

    public final k i() {
        h hVar;
        h hVar2;
        h hVar3;
        i iVar = this.f10881c;
        if (iVar.c()) {
            hVar = h.BLACK;
        } else {
            hVar = h.RED;
        }
        i g3 = iVar.g(hVar, null, null);
        i iVar2 = this.f10882d;
        if (iVar2.c()) {
            hVar2 = h.BLACK;
        } else {
            hVar2 = h.RED;
        }
        i g4 = iVar2.g(hVar2, null, null);
        if (c()) {
            hVar3 = h.BLACK;
        } else {
            hVar3 = h.RED;
        }
        return g(hVar3, g3, g4);
    }

    @Override // e4.i
    public final boolean isEmpty() {
        return false;
    }

    @Override // e4.i
    /* renamed from: j */
    public final k g(h hVar, i iVar, i iVar2) {
        if (iVar == null) {
            iVar = this.f10881c;
        }
        if (iVar2 == null) {
            iVar2 = this.f10882d;
        }
        h hVar2 = h.RED;
        Object obj = this.f10879a;
        Object obj2 = this.f10880b;
        if (hVar == hVar2) {
            return new k(obj, obj2, iVar, iVar2);
        }
        return new f(obj, obj2, iVar, iVar2);
    }

    public abstract k k(Object obj, Object obj2, i iVar, i iVar2);

    public final k l() {
        k kVar;
        i iVar = this.f10882d;
        if (iVar.c() && !this.f10881c.c()) {
            kVar = (k) iVar.g(m(), g(h.RED, null, ((k) iVar).f10881c), null);
        } else {
            kVar = this;
        }
        if (kVar.f10881c.c() && ((k) kVar.f10881c).f10881c.c()) {
            kVar = kVar.p();
        }
        if (kVar.f10881c.c() && kVar.f10882d.c()) {
            return kVar.i();
        }
        return kVar;
    }

    public abstract h m();

    public final k n() {
        k i7 = i();
        i iVar = i7.f10882d;
        if (iVar.a().c()) {
            k k2 = i7.k(null, null, null, ((k) iVar).p());
            h hVar = h.RED;
            i iVar2 = k2.f10882d;
            return ((k) iVar2.g(k2.m(), k2.g(hVar, null, ((k) iVar2).f10881c), null)).i();
        }
        return i7;
    }

    public final i o() {
        k kVar;
        if (this.f10881c.isEmpty()) {
            return g.f10878a;
        }
        if (!this.f10881c.c() && !this.f10881c.a().c()) {
            kVar = n();
        } else {
            kVar = this;
        }
        return kVar.k(null, null, ((k) kVar.f10881c).o(), null).l();
    }

    public final k p() {
        return (k) this.f10881c.g(m(), null, g(h.RED, ((k) this.f10881c).f10882d, null));
    }

    public void q(k kVar) {
        this.f10881c = kVar;
    }
}
