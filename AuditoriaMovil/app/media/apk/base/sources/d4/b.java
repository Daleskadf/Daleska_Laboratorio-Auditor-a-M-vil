package d4;

import com.google.firebase.firestore.H;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final /* synthetic */ class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10327a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f10328b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f10329c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f10330d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f10331e;

    public /* synthetic */ b(f fVar, Object obj, long j, TimeUnit timeUnit, int i7) {
        this.f10327a = i7;
        this.f10328b = fVar;
        this.f10331e = obj;
        this.f10329c = j;
        this.f10330d = timeUnit;
    }

    @Override // d4.g
    public final ScheduledFuture a(A.c cVar) {
        switch (this.f10327a) {
            case 0:
                f fVar = this.f10328b;
                fVar.getClass();
                return fVar.f10345b.schedule(new e(fVar, (Runnable) this.f10331e, cVar, 1), this.f10329c, this.f10330d);
            default:
                f fVar2 = this.f10328b;
                fVar2.getClass();
                return fVar2.f10345b.schedule(new H(fVar2, (Callable) this.f10331e, cVar, 1), this.f10329c, this.f10330d);
        }
    }
}
