package U3;

import F6.C0081c0;
import M3.q;
import c4.InterfaceC0635d;
import c4.r;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class b implements InterfaceC0635d {

    /* renamed from: b  reason: collision with root package name */
    public static final b f5735b = new b(1);

    /* renamed from: c  reason: collision with root package name */
    public static final b f5736c = new b(2);

    /* renamed from: d  reason: collision with root package name */
    public static final b f5737d = new b(3);

    /* renamed from: e  reason: collision with root package name */
    public static final b f5738e = new b(4);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5739a;

    public /* synthetic */ b(int i7) {
        this.f5739a = i7;
    }

    public static final void a(int i7, long j) {
        if (i7 >= 0 && i7 < 1000000000) {
            if (-62135596800L <= j && j < 253402300800L) {
                return;
            }
            throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.g("Timestamp seconds out of range: ", j).toString());
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i7, "Timestamp nanoseconds out of range: ").toString());
    }

    @Override // c4.InterfaceC0635d
    public Object d(q qVar) {
        switch (this.f5739a) {
            case 1:
                Object b5 = qVar.b(new r(V3.a.class, Executor.class));
                kotlin.jvm.internal.j.d(b5, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0081c0((Executor) b5);
            case 2:
                Object b7 = qVar.b(new r(V3.c.class, Executor.class));
                kotlin.jvm.internal.j.d(b7, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0081c0((Executor) b7);
            case 3:
                Object b8 = qVar.b(new r(V3.b.class, Executor.class));
                kotlin.jvm.internal.j.d(b8, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0081c0((Executor) b8);
            default:
                Object b9 = qVar.b(new r(V3.d.class, Executor.class));
                kotlin.jvm.internal.j.d(b9, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0081c0((Executor) b9);
        }
    }
}
