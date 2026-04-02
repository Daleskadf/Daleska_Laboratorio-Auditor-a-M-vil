package z4;

import F6.C0081c0;
import M3.q;
import V3.b;
import V3.c;
import V3.d;
import c4.InterfaceC0635d;
import c4.r;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
/* renamed from: z4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2072a implements InterfaceC0635d {

    /* renamed from: b  reason: collision with root package name */
    public static final C2072a f16898b = new C2072a(0);

    /* renamed from: c  reason: collision with root package name */
    public static final C2072a f16899c = new C2072a(1);

    /* renamed from: d  reason: collision with root package name */
    public static final C2072a f16900d = new C2072a(2);

    /* renamed from: e  reason: collision with root package name */
    public static final C2072a f16901e = new C2072a(3);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16902a;

    public /* synthetic */ C2072a(int i7) {
        this.f16902a = i7;
    }

    @Override // c4.InterfaceC0635d
    public final Object d(q qVar) {
        switch (this.f16902a) {
            case 0:
                Object b5 = qVar.b(new r(V3.a.class, Executor.class));
                j.d(b5, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0081c0((Executor) b5);
            case 1:
                Object b7 = qVar.b(new r(c.class, Executor.class));
                j.d(b7, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0081c0((Executor) b7);
            case 2:
                Object b8 = qVar.b(new r(b.class, Executor.class));
                j.d(b8, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0081c0((Executor) b8);
            default:
                Object b9 = qVar.b(new r(d.class, Executor.class));
                j.d(b9, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0081c0((Executor) b9);
        }
    }
}
