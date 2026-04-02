package F6;
/* renamed from: F6.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0082d extends AbstractC0096k {

    /* renamed from: a  reason: collision with root package name */
    public final C0080c[] f1260a;

    public C0082d(C0080c[] c0080cArr) {
        this.f1260a = c0080cArr;
    }

    @Override // F6.AbstractC0096k
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (C0080c c0080c : this.f1260a) {
            S s7 = c0080c.f;
            if (s7 != null) {
                s7.a();
            } else {
                kotlin.jvm.internal.j.g("handle");
                throw null;
            }
        }
    }

    @Override // w6.l
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        b();
        return l6.j.f13876a;
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f1260a + ']';
    }
}
