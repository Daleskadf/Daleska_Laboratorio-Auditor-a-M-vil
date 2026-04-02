package c6;

import a6.AbstractC0471A;
import a6.C0489s;
import j6.AbstractC1371b;
import j6.C1372c;
import java.util.ArrayList;
import java.util.List;
/* renamed from: c6.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0702s extends AbstractRunnableC0645F {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f8973c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f8974d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0702s(U0 u02, C0489s c0489s) {
        super(c0489s, 0);
        this.f8974d = u02;
    }

    @Override // c6.AbstractRunnableC0645F
    public final void b() {
        List<Runnable> list;
        switch (this.f8973c) {
            case 0:
                R1.j jVar = (R1.j) this.f8974d;
                AbstractC1371b.c();
                try {
                    C1372c c1372c = ((C0708u) jVar.f4684d).f8996b;
                    AbstractC1371b.a();
                    AbstractC1371b.f13458a.getClass();
                    if (((a6.o0) jVar.f4683c) == null) {
                        ((AbstractC0471A) jVar.f4682b).j();
                    }
                    AbstractC1371b.f13458a.getClass();
                    return;
                } catch (Throwable th) {
                    try {
                        AbstractC1371b.f13458a.getClass();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 1:
                ((U0) this.f8974d).h();
                return;
            default:
                K k2 = (K) this.f8974d;
                k2.getClass();
                List arrayList = new ArrayList();
                while (true) {
                    synchronized (k2) {
                        try {
                            if (k2.f8486c.isEmpty()) {
                                k2.f8486c = null;
                                k2.f8485b = true;
                                return;
                            }
                            list = k2.f8486c;
                            k2.f8486c = arrayList;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    for (Runnable runnable : list) {
                        runnable.run();
                    }
                    list.clear();
                    arrayList = list;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0702s(U0 u02, K k2) {
        super(u02.f8594c, 0);
        this.f8974d = k2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0702s(R1.j jVar) {
        super(((C0708u) jVar.f4684d).f, 0);
        this.f8974d = jVar;
    }
}
