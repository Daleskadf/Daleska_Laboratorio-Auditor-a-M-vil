package b4;

import z0.AbstractActivityC2064y;
/* loaded from: classes.dex */
public final class H {

    /* renamed from: c  reason: collision with root package name */
    public static final H f8195c = new H();

    /* renamed from: a  reason: collision with root package name */
    public final C0587A f8196a;

    /* renamed from: b  reason: collision with root package name */
    public final A.l f8197b;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, A.l] */
    public H() {
        C0587A c0587a = C0587A.f8176d;
        if (A.l.f23c == null) {
            ?? obj = new Object();
            obj.f25a = false;
            A.l.f23c = obj;
        }
        A.l lVar = A.l.f23c;
        this.f8196a = c0587a;
        this.f8197b = lVar;
    }

    public final void a(AbstractActivityC2064y abstractActivityC2064y) {
        C0587A c0587a = this.f8196a;
        c0587a.getClass();
        C0587A.d(abstractActivityC2064y.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        c0587a.f8178b = 0L;
    }
}
