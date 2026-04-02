package e4;
/* loaded from: classes.dex */
public final class j extends k {
    @Override // e4.i
    public final boolean c() {
        return true;
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
        return new k(obj, obj2, iVar, iVar2);
    }

    @Override // e4.k
    public final h m() {
        return h.RED;
    }

    @Override // e4.i
    public final int size() {
        return this.f10882d.size() + this.f10881c.size() + 1;
    }
}
