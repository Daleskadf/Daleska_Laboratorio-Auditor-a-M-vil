package j$.util.stream;
/* renamed from: j$.util.stream.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1334w extends AbstractC1266i0 {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f13375m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1334w(AbstractC1230b abstractC1230b, int i7, int i8) {
        super(abstractC1230b, i7, 1);
        this.f13375m = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1230b
    public final InterfaceC1298o2 R(int i7, InterfaceC1298o2 interfaceC1298o2) {
        switch (this.f13375m) {
            case 0:
                return new C1314s(this, interfaceC1298o2, 3);
            case 1:
                return new X(0, interfaceC1298o2);
            case 2:
                return new V(this, interfaceC1298o2, 3);
            case 3:
                return new C1241d0(this, interfaceC1298o2, 1);
            case 4:
                return interfaceC1298o2;
            default:
                return new C1241d0(this, interfaceC1298o2, 4);
        }
    }
}
