package e;

import m6.C1445f;
/* renamed from: e.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0916B implements InterfaceC0922c {

    /* renamed from: a  reason: collision with root package name */
    public final z0.D f10508a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0918D f10509b;

    public C0916B(C0918D c0918d, z0.D onBackPressedCallback) {
        kotlin.jvm.internal.j.e(onBackPressedCallback, "onBackPressedCallback");
        this.f10509b = c0918d;
        this.f10508a = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [w6.a, kotlin.jvm.internal.i] */
    @Override // e.InterfaceC0922c
    public final void cancel() {
        C0918D c0918d = this.f10509b;
        C1445f c1445f = c0918d.f10512b;
        z0.D d7 = this.f10508a;
        c1445f.remove(d7);
        if (kotlin.jvm.internal.j.a(c0918d.f10513c, d7)) {
            d7.a();
            c0918d.f10513c = null;
        }
        d7.f16631b.remove(this);
        ?? r02 = d7.f16632c;
        if (r02 != 0) {
            r02.invoke();
        }
        d7.f16632c = null;
    }
}
