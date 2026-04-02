package c6;

import a6.C0490t;
import a6.C0492v;
import a6.InterfaceC0484m;
/* loaded from: classes.dex */
public final class M1 implements R1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8502a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f8503b;

    public /* synthetic */ M1(Object obj, int i7) {
        this.f8502a = i7;
        this.f8503b = obj;
    }

    @Override // c6.R1
    public final void a(Y1 y12) {
        switch (this.f8502a) {
            case 0:
                y12.f8657a.a((InterfaceC0484m) this.f8503b);
                return;
            case 1:
                y12.f8657a.h((C0490t) this.f8503b);
                return;
            default:
                y12.f8657a.j((C0492v) this.f8503b);
                return;
        }
    }
}
