package e4;
/* loaded from: classes.dex */
public final class f extends k {

    /* renamed from: e  reason: collision with root package name */
    public int f10877e;

    public f(Object obj, Object obj2, i iVar, i iVar2) {
        super(obj, obj2, iVar, iVar2);
        this.f10877e = -1;
    }

    @Override // e4.i
    public final boolean c() {
        return false;
    }

    @Override // e4.k
    public final k k(Object obj, Object obj2, i iVar, i iVar2) {
        if (obj == null) {
            obj = this.f10879a;
        }
        if (obj2 == null) {
            obj2 = this.f10880b;
        }
        if (iVar == null) {
            iVar = this.f10881c;
        }
        if (iVar2 == null) {
            iVar2 = this.f10882d;
        }
        return new f(obj, obj2, iVar, iVar2);
    }

    @Override // e4.k
    public final h m() {
        return h.BLACK;
    }

    @Override // e4.k
    public final void q(k kVar) {
        if (this.f10877e == -1) {
            this.f10881c = kVar;
            return;
        }
        throw new IllegalStateException("Can't set left after using size");
    }

    @Override // e4.i
    public final int size() {
        if (this.f10877e == -1) {
            this.f10877e = this.f10882d.size() + this.f10881c.size() + 1;
        }
        return this.f10877e;
    }
}
