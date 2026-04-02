package w3;

import r2.ServiceConnectionC1733b;
/* renamed from: w3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1954c extends z {

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ int f16342X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Object f16343Y;

    public /* synthetic */ C1954c(Object obj, int i7) {
        this.f16342X = i7;
        this.f16343Y = obj;
    }

    @Override // w3.z
    public final void b() {
        switch (this.f16342X) {
            case 0:
                ServiceConnectionC1733b serviceConnectionC1733b = (ServiceConnectionC1733b) this.f16343Y;
                d dVar = (d) serviceConnectionC1733b.f15461b;
                dVar.f16346b.b("unlinkToDeath", new Object[0]);
                dVar.f16356n.asBinder().unlinkToDeath(dVar.f16353k, 0);
                d dVar2 = (d) serviceConnectionC1733b.f15461b;
                dVar2.f16356n = null;
                dVar2.f16350g = false;
                return;
            default:
                synchronized (((d) this.f16343Y).f) {
                    try {
                        if (((d) this.f16343Y).f16354l.get() > 0 && ((d) this.f16343Y).f16354l.decrementAndGet() > 0) {
                            ((d) this.f16343Y).f16346b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        d dVar3 = (d) this.f16343Y;
                        if (dVar3.f16356n != null) {
                            dVar3.f16346b.b("Unbind from service.", new Object[0]);
                            d dVar4 = (d) this.f16343Y;
                            dVar4.f16345a.unbindService(dVar4.f16355m);
                            d dVar5 = (d) this.f16343Y;
                            dVar5.f16350g = false;
                            dVar5.f16356n = null;
                            dVar5.f16355m = null;
                        }
                        ((d) this.f16343Y).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}
