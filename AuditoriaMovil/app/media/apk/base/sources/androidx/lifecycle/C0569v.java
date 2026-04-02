package androidx.lifecycle;
/* renamed from: androidx.lifecycle.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0569v {

    /* renamed from: a  reason: collision with root package name */
    public EnumC0563o f7942a;

    /* renamed from: b  reason: collision with root package name */
    public InterfaceC0566s f7943b;

    public final void a(InterfaceC0568u interfaceC0568u, EnumC0562n enumC0562n) {
        EnumC0563o a7 = enumC0562n.a();
        EnumC0563o state1 = this.f7942a;
        kotlin.jvm.internal.j.e(state1, "state1");
        if (a7 != null && a7.compareTo(state1) < 0) {
            state1 = a7;
        }
        this.f7942a = state1;
        this.f7943b.j(interfaceC0568u, enumC0562n);
        this.f7942a = a7;
    }
}
