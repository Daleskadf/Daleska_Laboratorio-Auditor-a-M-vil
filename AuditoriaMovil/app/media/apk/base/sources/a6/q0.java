package a6;
/* loaded from: classes.dex */
public final class q0 extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final o0 f7191a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f7192b;

    public q0(o0 o0Var) {
        super(o0.b(o0Var), o0Var.f7185c);
        this.f7191a = o0Var;
        this.f7192b = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        Throwable th;
        if (this.f7192b) {
            th = super.fillInStackTrace();
        } else {
            th = this;
        }
        return th;
    }
}
