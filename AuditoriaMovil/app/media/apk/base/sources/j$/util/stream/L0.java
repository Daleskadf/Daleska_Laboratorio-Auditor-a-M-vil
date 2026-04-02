package j$.util.stream;
/* loaded from: classes2.dex */
abstract class L0 implements J0 {

    /* renamed from: a  reason: collision with root package name */
    protected final J0 f13088a;

    /* renamed from: b  reason: collision with root package name */
    protected final J0 f13089b;

    /* renamed from: c  reason: collision with root package name */
    private final long f13090c;

    @Override // j$.util.stream.J0
    public final int q() {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public L0(J0 j02, J0 j03) {
        this.f13088a = j02;
        this.f13089b = j03;
        this.f13090c = j02.count() + j03.count();
    }

    @Override // j$.util.stream.J0
    public final J0 b(int i7) {
        if (i7 == 0) {
            return this.f13088a;
        }
        if (i7 == 1) {
            return this.f13089b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.J0
    public final long count() {
        return this.f13090c;
    }

    @Override // j$.util.stream.J0
    public /* bridge */ /* synthetic */ I0 b(int i7) {
        return (I0) b(i7);
    }
}
