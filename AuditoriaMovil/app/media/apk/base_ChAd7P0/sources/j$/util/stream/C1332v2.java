package j$.util.stream;
/* renamed from: j$.util.stream.v2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1332v2 extends AbstractC1263h2 {

    /* renamed from: b  reason: collision with root package name */
    long f13372b;

    /* renamed from: c  reason: collision with root package name */
    long f13373c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C1337w2 f13374d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1332v2(C1337w2 c1337w2, InterfaceC1298o2 interfaceC1298o2) {
        super(interfaceC1298o2);
        this.f13374d = c1337w2;
        this.f13372b = c1337w2.f13376m;
        long j = c1337w2.f13377n;
        this.f13373c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.AbstractC1263h2, j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        this.f13277a.l(AbstractC1340x0.A(j, this.f13374d.f13376m, this.f13373c));
    }

    @Override // j$.util.stream.InterfaceC1283l2, j$.util.stream.InterfaceC1298o2
    public final void accept(double d7) {
        long j = this.f13372b;
        if (j == 0) {
            long j8 = this.f13373c;
            if (j8 > 0) {
                this.f13373c = j8 - 1;
                this.f13277a.accept(d7);
                return;
            }
            return;
        }
        this.f13372b = j - 1;
    }

    @Override // j$.util.stream.AbstractC1263h2, j$.util.stream.InterfaceC1298o2
    public final boolean n() {
        return this.f13373c == 0 || this.f13277a.n();
    }
}
