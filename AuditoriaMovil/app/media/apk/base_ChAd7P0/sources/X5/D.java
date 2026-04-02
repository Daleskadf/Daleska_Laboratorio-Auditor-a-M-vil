package X5;

import D.AbstractC0055e;
/* loaded from: classes.dex */
public final class D extends kotlin.jvm.internal.k implements w6.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6406a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ A.f f6407b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(A.f fVar, int i7) {
        super(1);
        this.f6406a = i7;
        this.f6407b = fVar;
    }

    @Override // w6.l
    public final Object invoke(Object obj) {
        switch (this.f6406a) {
            case 0:
                Object obj2 = ((l6.f) obj).f13868a;
                Throwable a7 = l6.f.a(obj2);
                A.f fVar = this.f6407b;
                if (a7 != null) {
                    fVar.h(AbstractC0055e.E(a7));
                } else {
                    if (obj2 instanceof l6.e) {
                        obj2 = null;
                    }
                    fVar.h(G.i.A((Boolean) obj2));
                }
                return l6.j.f13876a;
            default:
                Object obj3 = ((l6.f) obj).f13868a;
                Throwable a8 = l6.f.a(obj3);
                A.f fVar2 = this.f6407b;
                if (a8 != null) {
                    fVar2.h(AbstractC0055e.E(a8));
                } else {
                    if (obj3 instanceof l6.e) {
                        obj3 = null;
                    }
                    fVar2.h(G.i.A((String) obj3));
                }
                return l6.j.f13876a;
        }
    }
}
