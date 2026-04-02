package j$.util.stream;
/* renamed from: j$.util.stream.t2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1322t2 extends AbstractC1273j2 {

    /* renamed from: b  reason: collision with root package name */
    long f13353b;

    /* renamed from: c  reason: collision with root package name */
    long f13354c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C1327u2 f13355d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1322t2(C1327u2 c1327u2, InterfaceC1298o2 interfaceC1298o2) {
        super(interfaceC1298o2);
        this.f13355d = c1327u2;
        this.f13353b = c1327u2.f13361m;
        long j = c1327u2.f13362n;
        this.f13354c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.AbstractC1273j2, j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        this.f13287a.l(AbstractC1340x0.A(j, this.f13355d.f13361m, this.f13354c));
    }

    @Override // j$.util.stream.InterfaceC1293n2, java.util.function.LongConsumer
    public final void accept(long j) {
        long j8 = this.f13353b;
        if (j8 == 0) {
            long j9 = this.f13354c;
            if (j9 > 0) {
                this.f13354c = j9 - 1;
                this.f13287a.accept(j);
                return;
            }
            return;
        }
        this.f13353b = j8 - 1;
    }

    @Override // j$.util.stream.AbstractC1273j2, j$.util.stream.InterfaceC1298o2
    public final boolean n() {
        return this.f13354c == 0 || this.f13287a.n();
    }
}
