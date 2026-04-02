package j$.util.stream;
/* renamed from: j$.util.stream.r2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1312r2 extends AbstractC1268i2 {

    /* renamed from: b  reason: collision with root package name */
    long f13340b;

    /* renamed from: c  reason: collision with root package name */
    long f13341c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C1317s2 f13342d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1312r2(C1317s2 c1317s2, InterfaceC1298o2 interfaceC1298o2) {
        super(interfaceC1298o2);
        this.f13342d = c1317s2;
        this.f13340b = c1317s2.f13346m;
        long j = c1317s2.f13347n;
        this.f13341c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.AbstractC1268i2, j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        this.f13282a.l(AbstractC1340x0.A(j, this.f13342d.f13346m, this.f13341c));
    }

    @Override // j$.util.stream.InterfaceC1288m2, j$.util.stream.InterfaceC1298o2
    public final void accept(int i7) {
        long j = this.f13340b;
        if (j == 0) {
            long j8 = this.f13341c;
            if (j8 > 0) {
                this.f13341c = j8 - 1;
                this.f13282a.accept(i7);
                return;
            }
            return;
        }
        this.f13340b = j - 1;
    }

    @Override // j$.util.stream.AbstractC1268i2, j$.util.stream.InterfaceC1298o2
    public final boolean n() {
        return this.f13341c == 0 || this.f13282a.n();
    }
}
