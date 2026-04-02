package d4;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10335a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f10336b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Runnable f10337c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f10338d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f10339e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ d(f fVar, Runnable runnable, long j, long j8, TimeUnit timeUnit, int i7) {
        this.f10335a = i7;
        this.f10336b = fVar;
        this.f10337c = runnable;
        this.f10338d = j;
        this.f10339e = j8;
        this.f = timeUnit;
    }

    @Override // d4.g
    public final ScheduledFuture a(A.c cVar) {
        switch (this.f10335a) {
            case 0:
                f fVar = this.f10336b;
                fVar.getClass();
                return fVar.f10345b.scheduleAtFixedRate(new e(fVar, this.f10337c, cVar, 0), this.f10338d, this.f10339e, this.f);
            default:
                f fVar2 = this.f10336b;
                fVar2.getClass();
                return fVar2.f10345b.scheduleWithFixedDelay(new e(fVar2, this.f10337c, cVar, 2), this.f10338d, this.f10339e, this.f);
        }
    }
}
