package j$.util.stream;
/* renamed from: j$.util.stream.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1324u extends A {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f13356m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1324u(AbstractC1230b abstractC1230b, int i7, int i8) {
        super(abstractC1230b, i7, 1);
        this.f13356m = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1230b
    public final InterfaceC1298o2 R(int i7, InterfaceC1298o2 interfaceC1298o2) {
        switch (this.f13356m) {
            case 0:
                return new C1314s(this, interfaceC1298o2, 1);
            case 1:
                return interfaceC1298o2;
            case 2:
                return new C1314s(this, interfaceC1298o2, 4);
            case 3:
                return new X(1, interfaceC1298o2);
            case 4:
                return new V(this, interfaceC1298o2, 4);
            case 5:
                return new AbstractC1273j2(interfaceC1298o2);
            default:
                return new C1241d0(this, interfaceC1298o2, 3);
        }
    }
}
