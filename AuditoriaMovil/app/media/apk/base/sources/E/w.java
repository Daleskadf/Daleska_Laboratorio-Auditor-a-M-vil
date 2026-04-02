package e;

import w6.InterfaceC1959a;
/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.k implements InterfaceC1959a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10579a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0918D f10580b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(C0918D c0918d, int i7) {
        super(0);
        this.f10579a = i7;
        this.f10580b = c0918d;
    }

    @Override // w6.InterfaceC1959a
    public final Object invoke() {
        switch (this.f10579a) {
            case 0:
                this.f10580b.b();
                return l6.j.f13876a;
            case 1:
                this.f10580b.a();
                return l6.j.f13876a;
            default:
                this.f10580b.b();
                return l6.j.f13876a;
        }
    }
}
