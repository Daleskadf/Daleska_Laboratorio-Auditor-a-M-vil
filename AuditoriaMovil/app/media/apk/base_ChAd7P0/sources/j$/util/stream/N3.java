package j$.util.stream;
/* loaded from: classes2.dex */
final class N3 extends AbstractC1278k2 implements c4 {

    /* renamed from: b  reason: collision with root package name */
    long f13113b;

    /* renamed from: c  reason: collision with root package name */
    boolean f13114c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f13115d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ O3 f13116e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N3(O3 o32, InterfaceC1298o2 interfaceC1298o2, boolean z7) {
        super(interfaceC1298o2);
        this.f13116e = o32;
        this.f13115d = z7;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z7;
        boolean z8;
        if (!this.f13114c) {
            boolean test = this.f13116e.f13123m.test(obj);
            this.f13114c = !test;
            if (test) {
                z7 = false;
                z8 = this.f13115d;
                if (z8 && !z7) {
                    this.f13113b++;
                }
                if (!z8 || z7) {
                    this.f13295a.accept((InterfaceC1298o2) obj);
                }
                return;
            }
        }
        z7 = true;
        z8 = this.f13115d;
        if (z8) {
            this.f13113b++;
        }
        if (z8) {
        }
        this.f13295a.accept((InterfaceC1298o2) obj);
    }

    @Override // j$.util.stream.c4
    public final long f() {
        return this.f13113b;
    }
}
