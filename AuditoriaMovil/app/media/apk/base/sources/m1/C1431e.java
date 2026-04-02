package m1;
/* renamed from: m1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1431e implements InterfaceC1426A {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC1433g f13943a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13944b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13945c;

    /* renamed from: d  reason: collision with root package name */
    public final long f13946d;

    /* renamed from: e  reason: collision with root package name */
    public final long f13947e;
    public final long f;

    public C1431e(InterfaceC1433g interfaceC1433g, long j, long j8, long j9, long j10, long j11) {
        this.f13943a = interfaceC1433g;
        this.f13944b = j;
        this.f13945c = j8;
        this.f13946d = j9;
        this.f13947e = j10;
        this.f = j11;
    }

    @Override // m1.InterfaceC1426A
    public final boolean h() {
        return true;
    }

    @Override // m1.InterfaceC1426A
    public final z j(long j) {
        B b5 = new B(j, C1432f.a(this.f13943a.a(j), 0L, this.f13945c, this.f13946d, this.f13947e, this.f));
        return new z(b5, b5);
    }

    @Override // m1.InterfaceC1426A
    public final long l() {
        return this.f13944b;
    }
}
