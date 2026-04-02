package a6;
/* loaded from: classes.dex */
public final class p0 extends Exception {

    /* renamed from: a  reason: collision with root package name */
    public final o0 f7188a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f7189b;

    public p0(o0 o0Var) {
        super(o0.b(o0Var), o0Var.f7185c);
        this.f7188a = o0Var;
        this.f7189b = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        Throwable th;
        if (this.f7189b) {
            th = super.fillInStackTrace();
        } else {
            th = this;
        }
        return th;
    }
}
