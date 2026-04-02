package K6;
/* loaded from: classes.dex */
public final class g extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final transient n6.i f2776a;

    public g(n6.i iVar) {
        this.f2776a = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f2776a.toString();
    }
}
