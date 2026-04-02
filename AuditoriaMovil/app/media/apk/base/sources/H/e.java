package H;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final /* synthetic */ class e implements U.j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ E3.b f1617a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ G.e f1618b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f1619c;

    public /* synthetic */ e(E3.b bVar, G.e eVar, long j) {
        this.f1617a = bVar;
        this.f1618b = eVar;
        this.f1619c = j;
    }

    @Override // U.j
    public final Object i(final U.i iVar) {
        G.a r7 = j3.f.r();
        final E3.b bVar = this.f1617a;
        i.e(true, bVar, iVar, r7);
        if (!bVar.isDone()) {
            final long j = this.f1619c;
            bVar.a(new C.b(this.f1618b.schedule(new Callable() { // from class: H.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(U.i.this.b(new TimeoutException("Future[" + bVar + "] is not done within " + j + " ms.")));
                }
            }, j, TimeUnit.MILLISECONDS), 6), j3.f.r());
        }
        return "TimeoutFuture[" + bVar + "]";
    }
}
