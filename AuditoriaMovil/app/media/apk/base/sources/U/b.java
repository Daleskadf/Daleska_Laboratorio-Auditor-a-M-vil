package U;
/* loaded from: classes.dex */
public final class b extends Throwable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5510a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i7) {
        super(str);
        this.f5510a = i7;
    }

    private final synchronized Throwable a() {
        return this;
    }

    private final synchronized Throwable b() {
        return this;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f5510a) {
            case 0:
                a();
                return this;
            default:
                b();
                return this;
        }
    }
}
