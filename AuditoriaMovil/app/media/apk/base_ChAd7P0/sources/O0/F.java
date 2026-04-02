package O0;
/* loaded from: classes.dex */
public final class F implements g0 {

    /* renamed from: a  reason: collision with root package name */
    public F f3483a;

    /* renamed from: b  reason: collision with root package name */
    public F f3484b;

    public final void a(long j, float[] fArr) {
        F f = this.f3484b;
        if (f != null) {
            f.a(j, fArr);
        }
    }

    @Override // O0.g0
    public final void b(int i7, Object obj) {
        if (i7 != 7) {
            if (i7 != 8) {
                if (i7 == 10000 && obj != null) {
                    throw new ClassCastException();
                }
                return;
            }
            this.f3484b = (F) obj;
            return;
        }
        this.f3483a = (F) obj;
    }

    public final void c() {
        F f = this.f3484b;
        if (f != null) {
            f.c();
        }
    }

    public final void d(long j, long j8) {
        F f = this.f3483a;
        if (f != null) {
            f.d(j, j8);
        }
    }
}
