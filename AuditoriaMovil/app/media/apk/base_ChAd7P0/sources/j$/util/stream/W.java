package j$.util.stream;

import java.util.function.IntConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class W extends AbstractC1226a0 {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f13170m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ Object f13171n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(AbstractC1230b abstractC1230b, int i7, Object obj, int i8) {
        super(abstractC1230b, i7, 1);
        this.f13170m = i8;
        this.f13171n = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1230b
    public final InterfaceC1298o2 R(int i7, InterfaceC1298o2 interfaceC1298o2) {
        switch (this.f13170m) {
            case 0:
                return new V(this, interfaceC1298o2, 1);
            case 1:
                return new V(this, interfaceC1298o2, 2);
            case 2:
                return new Y(this, interfaceC1298o2);
            case 3:
                return new C1285m(this, interfaceC1298o2, 4);
            default:
                return new C1238c2(this, interfaceC1298o2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(AbstractC1231b0 abstractC1231b0, IntConsumer intConsumer) {
        super(abstractC1231b0, 0, 1);
        this.f13170m = 0;
        this.f13171n = intConsumer;
    }
}
