package j$.util.stream;

import java.util.function.LongConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.g0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1256g0 extends AbstractC1266i0 {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f13273m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ Object f13274n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1256g0(AbstractC1230b abstractC1230b, int i7, Object obj, int i8) {
        super(abstractC1230b, i7, 1);
        this.f13273m = i8;
        this.f13274n = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1230b
    public final InterfaceC1298o2 R(int i7, InterfaceC1298o2 interfaceC1298o2) {
        switch (this.f13273m) {
            case 0:
                return new C1251f0(this, interfaceC1298o2);
            case 1:
                return new C1241d0(this, interfaceC1298o2, 5);
            case 2:
                return new C1238c2(this, interfaceC1298o2);
            default:
                return new C1285m(this, interfaceC1298o2, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1256g0(AbstractC1271j0 abstractC1271j0, LongConsumer longConsumer) {
        super(abstractC1271j0, 0, 1);
        this.f13273m = 1;
        this.f13274n = longConsumer;
    }
}
