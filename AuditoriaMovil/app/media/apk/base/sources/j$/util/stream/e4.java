package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;
/* loaded from: classes2.dex */
final class e4 extends AbstractC1235c {
    private final AbstractC1230b j;

    /* renamed from: k  reason: collision with root package name */
    private final IntFunction f13258k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f13259l;

    /* renamed from: m  reason: collision with root package name */
    private long f13260m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f13261n;

    /* renamed from: o  reason: collision with root package name */
    private volatile boolean f13262o;

    @Override // j$.util.stream.AbstractC1235c
    protected final void h() {
        this.f13207i = true;
        if (this.f13259l && this.f13262o) {
            f(AbstractC1340x0.L(this.j.I()));
        }
    }

    @Override // j$.util.stream.AbstractC1245e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        Object I7;
        AbstractC1245e abstractC1245e = this.f13248d;
        if (abstractC1245e != null) {
            this.f13261n = ((e4) abstractC1245e).f13261n | ((e4) this.f13249e).f13261n;
            if (this.f13259l && this.f13207i) {
                this.f13260m = 0L;
                I7 = AbstractC1340x0.L(this.j.I());
            } else {
                if (this.f13259l) {
                    e4 e4Var = (e4) this.f13248d;
                    if (e4Var.f13261n) {
                        this.f13260m = e4Var.f13260m;
                        I7 = (J0) e4Var.c();
                    }
                }
                e4 e4Var2 = (e4) this.f13248d;
                long j = e4Var2.f13260m;
                e4 e4Var3 = (e4) this.f13249e;
                this.f13260m = j + e4Var3.f13260m;
                if (e4Var2.f13260m == 0) {
                    I7 = (J0) e4Var3.c();
                } else if (e4Var3.f13260m == 0) {
                    I7 = (J0) e4Var2.c();
                } else {
                    I7 = AbstractC1340x0.I(this.j.I(), (J0) ((e4) this.f13248d).c(), (J0) ((e4) this.f13249e).c());
                }
            }
            f(I7);
        }
        this.f13262o = true;
        super.onCompletion(countedCompleter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e4(AbstractC1230b abstractC1230b, AbstractC1230b abstractC1230b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC1230b2, spliterator);
        this.j = abstractC1230b;
        this.f13258k = intFunction;
        this.f13259l = EnumC1239c3.ORDERED.t(abstractC1230b2.K());
    }

    e4(e4 e4Var, Spliterator spliterator) {
        super(e4Var, spliterator);
        this.j = e4Var.j;
        this.f13258k = e4Var.f13258k;
        this.f13259l = e4Var.f13259l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC1245e
    public final AbstractC1245e e(Spliterator spliterator) {
        return new e4(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC1235c
    protected final Object j() {
        return AbstractC1340x0.L(this.j.I());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC1245e
    public final Object a() {
        B0 N7 = this.f13245a.N(-1L, this.f13258k);
        InterfaceC1298o2 R7 = this.j.R(this.f13245a.K(), N7);
        AbstractC1230b abstractC1230b = this.f13245a;
        boolean B7 = abstractC1230b.B(this.f13246b, abstractC1230b.W(R7));
        this.f13261n = B7;
        if (B7) {
            i();
        }
        J0 a7 = N7.a();
        this.f13260m = a7.count();
        return a7;
    }
}
