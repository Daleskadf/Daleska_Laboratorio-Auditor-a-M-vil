package androidx.lifecycle;
/* loaded from: classes.dex */
public final class z extends A implements InterfaceC0566s {

    /* renamed from: e  reason: collision with root package name */
    public final InterfaceC0568u f7954e;
    public final /* synthetic */ C f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C c8, InterfaceC0568u interfaceC0568u, D d7) {
        super(c8, d7);
        this.f = c8;
        this.f7954e = interfaceC0568u;
    }

    @Override // androidx.lifecycle.A
    public final void b() {
        this.f7954e.h().b(this);
    }

    @Override // androidx.lifecycle.A
    public final boolean c(InterfaceC0568u interfaceC0568u) {
        if (this.f7954e == interfaceC0568u) {
            return true;
        }
        return false;
    }

    @Override // androidx.lifecycle.A
    public final boolean d() {
        return this.f7954e.h().f7946c.a(EnumC0563o.STARTED);
    }

    @Override // androidx.lifecycle.InterfaceC0566s
    public final void j(InterfaceC0568u interfaceC0568u, EnumC0562n enumC0562n) {
        InterfaceC0568u interfaceC0568u2 = this.f7954e;
        EnumC0563o enumC0563o = interfaceC0568u2.h().f7946c;
        if (enumC0563o == EnumC0563o.DESTROYED) {
            this.f.j(this.f7872a);
            return;
        }
        EnumC0563o enumC0563o2 = null;
        while (enumC0563o2 != enumC0563o) {
            a(d());
            enumC0563o2 = enumC0563o;
            enumC0563o = interfaceC0568u2.h().f7946c;
        }
    }
}
