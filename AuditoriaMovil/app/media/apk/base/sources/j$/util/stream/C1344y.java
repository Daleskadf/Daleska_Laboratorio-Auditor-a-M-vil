package j$.util.stream;

import java.util.function.DoubleConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1344y extends A {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f13393m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ Object f13394n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1344y(AbstractC1230b abstractC1230b, int i7, Object obj, int i8) {
        super(abstractC1230b, i7, 1);
        this.f13393m = i8;
        this.f13394n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1344y(B b5, DoubleConsumer doubleConsumer) {
        super(b5, 0, 1);
        this.f13393m = 1;
        this.f13394n = doubleConsumer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1230b
    public final InterfaceC1298o2 R(int i7, InterfaceC1298o2 interfaceC1298o2) {
        switch (this.f13393m) {
            case 0:
                return new C1339x(this, interfaceC1298o2);
            case 1:
                return new C1314s(this, interfaceC1298o2, 5);
            case 2:
                return new C1285m(this, interfaceC1298o2, 6);
            default:
                return new C1238c2(this, interfaceC1298o2);
        }
    }
}
