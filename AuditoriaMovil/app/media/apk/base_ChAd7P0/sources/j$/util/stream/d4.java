package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;
/* loaded from: classes2.dex */
final class d4 extends AbstractC1245e {

    /* renamed from: h  reason: collision with root package name */
    private final AbstractC1230b f13240h;

    /* renamed from: i  reason: collision with root package name */
    private final IntFunction f13241i;
    private final boolean j;

    /* renamed from: k  reason: collision with root package name */
    private long f13242k;

    /* renamed from: l  reason: collision with root package name */
    private long f13243l;

    @Override // j$.util.stream.AbstractC1245e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        J0 I7;
        AbstractC1245e abstractC1245e = this.f13248d;
        if (abstractC1245e != null) {
            if (this.j) {
                d4 d4Var = (d4) abstractC1245e;
                long j = d4Var.f13243l;
                this.f13243l = j;
                if (j == d4Var.f13242k) {
                    this.f13243l = j + ((d4) this.f13249e).f13243l;
                }
            }
            d4 d4Var2 = (d4) abstractC1245e;
            long j8 = d4Var2.f13242k;
            d4 d4Var3 = (d4) this.f13249e;
            this.f13242k = j8 + d4Var3.f13242k;
            if (d4Var2.f13242k == 0) {
                I7 = (J0) d4Var3.c();
            } else if (d4Var3.f13242k == 0) {
                I7 = (J0) d4Var2.c();
            } else {
                I7 = AbstractC1340x0.I(this.f13240h.I(), (J0) ((d4) this.f13248d).c(), (J0) ((d4) this.f13249e).c());
            }
            J0 j02 = I7;
            if (d() && this.j) {
                j02 = j02.h(this.f13243l, j02.count(), this.f13241i);
            }
            f(j02);
        }
        super.onCompletion(countedCompleter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d4(AbstractC1230b abstractC1230b, AbstractC1230b abstractC1230b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC1230b2, spliterator);
        this.f13240h = abstractC1230b;
        this.f13241i = intFunction;
        this.j = EnumC1239c3.ORDERED.t(abstractC1230b2.K());
    }

    d4(d4 d4Var, Spliterator spliterator) {
        super(d4Var, spliterator);
        this.f13240h = d4Var.f13240h;
        this.f13241i = d4Var.f13241i;
        this.j = d4Var.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC1245e
    public final AbstractC1245e e(Spliterator spliterator) {
        return new d4(this, spliterator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC1245e
    public final Object a() {
        boolean d7 = d();
        B0 N7 = this.f13245a.N((!d7 && this.j && EnumC1239c3.SIZED.w(this.f13240h.f13197c)) ? this.f13240h.G(this.f13246b) : -1L, this.f13241i);
        c4 k2 = ((b4) this.f13240h).k(N7, this.j && !d7);
        this.f13245a.V(this.f13246b, k2);
        J0 a7 = N7.a();
        this.f13242k = a7.count();
        this.f13243l = k2.f();
        return a7;
    }
}
