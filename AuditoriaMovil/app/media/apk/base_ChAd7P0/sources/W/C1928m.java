package w;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import t4.RunnableC1822b;
import x.C1967a;
/* renamed from: w.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1928m implements U.j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16243a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1936u f16244b;

    public /* synthetic */ C1928m(C1936u c1936u, int i7) {
        this.f16243a = i7;
        this.f16244b = c1936u;
    }

    @Override // U.j
    public Object i(U.i iVar) {
        switch (this.f16243a) {
            case 0:
                C1936u c1936u = this.f16244b;
                c1936u.getClass();
                try {
                    ArrayList arrayList = new ArrayList(c1936u.f16273a.B().b().f7653c);
                    arrayList.add((C1896F) c1936u.f16292t0.f3253b);
                    arrayList.add(new C1930o(c1936u, iVar));
                    x.p pVar = c1936u.f16274b;
                    pVar.f16413a.l0(c1936u.f16278e0.f16303a, c1936u.f16275c, j3.f.g(arrayList));
                    return "configAndCloseTask";
                } catch (SecurityException | C1967a e7) {
                    c1936u.t("Unable to open camera for configAndClose: " + e7.getMessage(), e7);
                    iVar.b(e7);
                    return "configAndCloseTask";
                }
            default:
                C1936u c1936u2 = this.f16244b;
                c1936u2.getClass();
                try {
                    c1936u2.f16275c.execute(new RunnableC1822b(15, c1936u2, iVar));
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    iVar.b(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
        }
    }
}
