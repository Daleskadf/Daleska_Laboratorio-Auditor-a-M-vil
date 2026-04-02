package y8;
/* loaded from: classes3.dex */
public class l1 extends Exception {

    /* renamed from: a  reason: collision with root package name */
    public final k1 f19936a;

    /* renamed from: b  reason: collision with root package name */
    public final v0 f19937b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f19938c;

    public l1(k1 k1Var) {
        this(k1Var, null);
    }

    public final k1 a() {
        return this.f19936a;
    }

    public final v0 b() {
        return this.f19937b;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        Throwable th;
        if (this.f19938c) {
            th = super.fillInStackTrace();
        } else {
            th = this;
        }
        return th;
    }

    public l1(k1 k1Var, v0 v0Var) {
        this(k1Var, v0Var, true);
    }

    public l1(k1 k1Var, v0 v0Var, boolean z10) {
        super(k1.h(k1Var), k1Var.m());
        this.f19936a = k1Var;
        this.f19937b = v0Var;
        this.f19938c = z10;
        fillInStackTrace();
    }
}
