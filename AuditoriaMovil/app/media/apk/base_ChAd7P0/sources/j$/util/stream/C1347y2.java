package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
/* renamed from: j$.util.stream.y2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1347y2 extends AbstractC1235c {
    private final AbstractC1230b j;

    /* renamed from: k  reason: collision with root package name */
    private final IntFunction f13399k;

    /* renamed from: l  reason: collision with root package name */
    private final long f13400l;

    /* renamed from: m  reason: collision with root package name */
    private final long f13401m;

    /* renamed from: n  reason: collision with root package name */
    private long f13402n;

    /* renamed from: o  reason: collision with root package name */
    private volatile boolean f13403o;

    @Override // j$.util.stream.AbstractC1235c
    protected final void h() {
        this.f13207i = true;
        if (this.f13403o) {
            f(AbstractC1340x0.L(this.j.I()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
        if (r2 >= r0) goto L51;
     */
    @Override // j$.util.stream.AbstractC1245e, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r14) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.C1347y2.onCompletion(java.util.concurrent.CountedCompleter):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1347y2(AbstractC1230b abstractC1230b, AbstractC1230b abstractC1230b2, Spliterator spliterator, IntFunction intFunction, long j, long j8) {
        super(abstractC1230b2, spliterator);
        this.j = abstractC1230b;
        this.f13399k = intFunction;
        this.f13400l = j;
        this.f13401m = j8;
    }

    C1347y2(C1347y2 c1347y2, Spliterator spliterator) {
        super(c1347y2, spliterator);
        this.j = c1347y2.j;
        this.f13399k = c1347y2.f13399k;
        this.f13400l = c1347y2.f13400l;
        this.f13401m = c1347y2.f13401m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC1245e
    public final AbstractC1245e e(Spliterator spliterator) {
        return new C1347y2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC1235c
    protected final Object j() {
        return AbstractC1340x0.L(this.j.I());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC1245e
    public final Object a() {
        if (d()) {
            B0 N7 = this.j.N(EnumC1239c3.SIZED.w(this.j.f13197c) ? this.j.G(this.f13246b) : -1L, this.f13399k);
            InterfaceC1298o2 R7 = this.j.R(this.f13245a.K(), N7);
            AbstractC1230b abstractC1230b = this.f13245a;
            abstractC1230b.B(this.f13246b, abstractC1230b.W(R7));
            return N7.a();
        }
        B0 N8 = this.j.N(-1L, this.f13399k);
        if (this.f13400l == 0) {
            InterfaceC1298o2 R8 = this.j.R(this.f13245a.K(), N8);
            AbstractC1230b abstractC1230b2 = this.f13245a;
            abstractC1230b2.B(this.f13246b, abstractC1230b2.W(R8));
        } else {
            this.f13245a.V(this.f13246b, N8);
        }
        J0 a7 = N8.a();
        this.f13402n = a7.count();
        this.f13403o = true;
        this.f13246b = null;
        return a7;
    }

    private long k(long j) {
        if (this.f13403o) {
            return this.f13402n;
        }
        C1347y2 c1347y2 = (C1347y2) this.f13248d;
        C1347y2 c1347y22 = (C1347y2) this.f13249e;
        if (c1347y2 == null || c1347y22 == null) {
            return this.f13402n;
        }
        long k2 = c1347y2.k(j);
        return k2 >= j ? k2 : k2 + c1347y22.k(j);
    }
}
