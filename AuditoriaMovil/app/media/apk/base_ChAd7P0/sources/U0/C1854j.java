package u0;

import java.util.concurrent.ThreadPoolExecutor;
/* renamed from: u0.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1854j extends f7.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f7.a f15929d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f15930e;

    public C1854j(f7.a aVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f15929d = aVar;
        this.f15930e = threadPoolExecutor;
    }

    @Override // f7.a
    public final void f0(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f15930e;
        try {
            this.f15929d.f0(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // f7.a
    public final void g0(E.e eVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f15930e;
        try {
            this.f15929d.g0(eVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
