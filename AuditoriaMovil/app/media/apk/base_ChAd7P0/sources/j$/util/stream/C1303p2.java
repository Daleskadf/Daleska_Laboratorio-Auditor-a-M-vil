package j$.util.stream;
/* renamed from: j$.util.stream.p2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1303p2 extends AbstractC1278k2 {

    /* renamed from: b  reason: collision with root package name */
    long f13329b;

    /* renamed from: c  reason: collision with root package name */
    long f13330c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C1308q2 f13331d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303p2(C1308q2 c1308q2, InterfaceC1298o2 interfaceC1298o2) {
        super(interfaceC1298o2);
        this.f13331d = c1308q2;
        this.f13329b = c1308q2.f13334m;
        long j = c1308q2.f13335n;
        this.f13330c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.AbstractC1278k2, j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        this.f13295a.l(AbstractC1340x0.A(j, this.f13331d.f13334m, this.f13330c));
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        long j = this.f13329b;
        if (j == 0) {
            long j8 = this.f13330c;
            if (j8 > 0) {
                this.f13330c = j8 - 1;
                this.f13295a.accept((InterfaceC1298o2) obj);
                return;
            }
            return;
        }
        this.f13329b = j - 1;
    }

    @Override // j$.util.stream.AbstractC1278k2, j$.util.stream.InterfaceC1298o2
    public final boolean n() {
        return this.f13330c == 0 || this.f13295a.n();
    }
}
