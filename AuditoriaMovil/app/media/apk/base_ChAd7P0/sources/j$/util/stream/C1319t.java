package j$.util.stream;

import java.util.function.Consumer;
/* renamed from: j$.util.stream.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1319t extends AbstractC1253f2 {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f13348m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ Object f13349n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1319t(AbstractC1230b abstractC1230b, int i7, Object obj, int i8) {
        super(abstractC1230b, i7, 1);
        this.f13348m = i8;
        this.f13349n = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1230b
    public final InterfaceC1298o2 R(int i7, InterfaceC1298o2 interfaceC1298o2) {
        switch (this.f13348m) {
            case 0:
                return new C1314s(this, interfaceC1298o2, 0);
            case 1:
                return new V(this, interfaceC1298o2, 0);
            case 2:
                return new C1241d0(this, interfaceC1298o2, 0);
            case 3:
                return new C1285m(this, interfaceC1298o2, 1);
            case 4:
                return new C1285m(this, interfaceC1298o2, 2);
            case 5:
                return new C1285m(this, interfaceC1298o2, 3);
            default:
                return new C1280l(this, interfaceC1298o2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1319t(AbstractC1258g2 abstractC1258g2, Consumer consumer) {
        super(abstractC1258g2, 0, 1);
        this.f13348m = 3;
        this.f13349n = consumer;
    }
}
