package j$.util.stream;

import java.util.Comparator;
/* loaded from: classes2.dex */
abstract class C2 extends AbstractC1278k2 {

    /* renamed from: b  reason: collision with root package name */
    protected final Comparator f13028b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f13029c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2(InterfaceC1298o2 interfaceC1298o2, Comparator comparator) {
        super(interfaceC1298o2);
        this.f13028b = comparator;
    }

    @Override // j$.util.stream.AbstractC1278k2, j$.util.stream.InterfaceC1298o2
    public final boolean n() {
        this.f13029c = true;
        return false;
    }
}
