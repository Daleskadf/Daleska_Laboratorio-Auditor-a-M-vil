package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1230b implements InterfaceC1260h {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1230b f13195a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC1230b f13196b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f13197c;

    /* renamed from: d  reason: collision with root package name */
    private AbstractC1230b f13198d;

    /* renamed from: e  reason: collision with root package name */
    private int f13199e;
    private int f;

    /* renamed from: g  reason: collision with root package name */
    private Spliterator f13200g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f13201h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f13202i;
    private Runnable j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f13203k;

    abstract J0 F(AbstractC1230b abstractC1230b, Spliterator spliterator, boolean z7, IntFunction intFunction);

    abstract boolean H(Spliterator spliterator, InterfaceC1298o2 interfaceC1298o2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract EnumC1244d3 I();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B0 N(long j, IntFunction intFunction);

    abstract boolean Q();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract InterfaceC1298o2 R(int i7, InterfaceC1298o2 interfaceC1298o2);

    abstract Spliterator U(AbstractC1230b abstractC1230b, Supplier supplier, boolean z7);

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1230b(Spliterator spliterator, int i7, boolean z7) {
        this.f13196b = null;
        this.f13200g = spliterator;
        this.f13195a = this;
        int i8 = EnumC1239c3.f13213g & i7;
        this.f13197c = i8;
        this.f = (~(i8 << 1)) & EnumC1239c3.f13217l;
        this.f13199e = 0;
        this.f13203k = z7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1230b(AbstractC1230b abstractC1230b, int i7) {
        if (abstractC1230b.f13201h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC1230b.f13201h = true;
        abstractC1230b.f13198d = this;
        this.f13196b = abstractC1230b;
        this.f13197c = EnumC1239c3.f13214h & i7;
        this.f = EnumC1239c3.o(i7, abstractC1230b.f);
        AbstractC1230b abstractC1230b2 = abstractC1230b.f13195a;
        this.f13195a = abstractC1230b2;
        if (Q()) {
            abstractC1230b2.f13202i = true;
        }
        this.f13199e = abstractC1230b.f13199e + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object D(I3 i32) {
        if (this.f13201h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f13201h = true;
        if (this.f13195a.f13203k) {
            return i32.c(this, S(i32.d()));
        }
        return i32.b(this, S(i32.d()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final J0 E(IntFunction intFunction) {
        AbstractC1230b abstractC1230b;
        if (this.f13201h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f13201h = true;
        if (this.f13195a.f13203k && (abstractC1230b = this.f13196b) != null && Q()) {
            this.f13199e = 0;
            return O(abstractC1230b, abstractC1230b.S(0), intFunction);
        }
        return C(S(0), true, intFunction);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Spliterator T() {
        AbstractC1230b abstractC1230b = this.f13195a;
        if (this != abstractC1230b) {
            throw new IllegalStateException();
        }
        if (this.f13201h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f13201h = true;
        Spliterator spliterator = abstractC1230b.f13200g;
        if (spliterator != null) {
            abstractC1230b.f13200g = null;
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final InterfaceC1260h sequential() {
        this.f13195a.f13203k = false;
        return this;
    }

    @Override // j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final InterfaceC1260h parallel() {
        this.f13195a.f13203k = true;
        return this;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f13201h = true;
        this.f13200g = null;
        AbstractC1230b abstractC1230b = this.f13195a;
        Runnable runnable = abstractC1230b.j;
        if (runnable != null) {
            abstractC1230b.j = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.InterfaceC1260h
    public final InterfaceC1260h onClose(Runnable runnable) {
        if (this.f13201h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        AbstractC1230b abstractC1230b = this.f13195a;
        Runnable runnable2 = abstractC1230b.j;
        if (runnable2 != null) {
            runnable = new H3(runnable2, runnable);
        }
        abstractC1230b.j = runnable;
        return this;
    }

    @Override // j$.util.stream.InterfaceC1260h
    public Spliterator spliterator() {
        if (this.f13201h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f13201h = true;
        AbstractC1230b abstractC1230b = this.f13195a;
        if (this == abstractC1230b) {
            Spliterator spliterator = abstractC1230b.f13200g;
            if (spliterator != null) {
                abstractC1230b.f13200g = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return U(this, new C1225a(0, this), abstractC1230b.f13203k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Spliterator M() {
        return S(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final J0 C(Spliterator spliterator, boolean z7, IntFunction intFunction) {
        if (this.f13195a.f13203k) {
            return F(this, spliterator, z7, intFunction);
        }
        B0 N7 = N(G(spliterator), intFunction);
        V(spliterator, N7);
        return N7.a();
    }

    @Override // j$.util.stream.InterfaceC1260h
    public final boolean isParallel() {
        return this.f13195a.f13203k;
    }

    private Spliterator S(int i7) {
        int i8;
        int i9;
        AbstractC1230b abstractC1230b = this.f13195a;
        Spliterator spliterator = abstractC1230b.f13200g;
        if (spliterator != null) {
            abstractC1230b.f13200g = null;
            if (abstractC1230b.f13203k && abstractC1230b.f13202i) {
                AbstractC1230b abstractC1230b2 = abstractC1230b.f13198d;
                int i10 = 1;
                while (abstractC1230b != this) {
                    int i11 = abstractC1230b2.f13197c;
                    if (abstractC1230b2.Q()) {
                        if (EnumC1239c3.SHORT_CIRCUIT.t(i11)) {
                            i11 &= ~EnumC1239c3.f13226u;
                        }
                        spliterator = abstractC1230b2.P(abstractC1230b, spliterator);
                        if (spliterator.hasCharacteristics(64)) {
                            i8 = (~EnumC1239c3.f13225t) & i11;
                            i9 = EnumC1239c3.f13224s;
                        } else {
                            i8 = (~EnumC1239c3.f13224s) & i11;
                            i9 = EnumC1239c3.f13225t;
                        }
                        i11 = i8 | i9;
                        i10 = 0;
                    }
                    abstractC1230b2.f13199e = i10;
                    abstractC1230b2.f = EnumC1239c3.o(i11, abstractC1230b.f);
                    i10++;
                    AbstractC1230b abstractC1230b3 = abstractC1230b2;
                    abstractC1230b2 = abstractC1230b2.f13198d;
                    abstractC1230b = abstractC1230b3;
                }
            }
            if (i7 != 0) {
                this.f = EnumC1239c3.o(i7, this.f);
            }
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final EnumC1244d3 J() {
        AbstractC1230b abstractC1230b = this;
        while (abstractC1230b.f13199e > 0) {
            abstractC1230b = abstractC1230b.f13196b;
        }
        return abstractC1230b.I();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long G(Spliterator spliterator) {
        if (EnumC1239c3.SIZED.t(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final InterfaceC1298o2 V(Spliterator spliterator, InterfaceC1298o2 interfaceC1298o2) {
        A(spliterator, W((InterfaceC1298o2) Objects.requireNonNull(interfaceC1298o2)));
        return interfaceC1298o2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(Spliterator spliterator, InterfaceC1298o2 interfaceC1298o2) {
        Objects.requireNonNull(interfaceC1298o2);
        if (!EnumC1239c3.SHORT_CIRCUIT.t(this.f)) {
            interfaceC1298o2.l(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(interfaceC1298o2);
            interfaceC1298o2.k();
            return;
        }
        B(spliterator, interfaceC1298o2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean B(Spliterator spliterator, InterfaceC1298o2 interfaceC1298o2) {
        AbstractC1230b abstractC1230b = this;
        while (abstractC1230b.f13199e > 0) {
            abstractC1230b = abstractC1230b.f13196b;
        }
        interfaceC1298o2.l(spliterator.getExactSizeIfKnown());
        boolean H7 = abstractC1230b.H(spliterator, interfaceC1298o2);
        interfaceC1298o2.k();
        return H7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int K() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean L() {
        return EnumC1239c3.ORDERED.t(this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final InterfaceC1298o2 W(InterfaceC1298o2 interfaceC1298o2) {
        Objects.requireNonNull(interfaceC1298o2);
        AbstractC1230b abstractC1230b = this;
        while (abstractC1230b.f13199e > 0) {
            AbstractC1230b abstractC1230b2 = abstractC1230b.f13196b;
            interfaceC1298o2 = abstractC1230b.R(abstractC1230b2.f, interfaceC1298o2);
            abstractC1230b = abstractC1230b2;
        }
        return interfaceC1298o2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Spliterator X(Spliterator spliterator) {
        return this.f13199e == 0 ? spliterator : U(this, new C1225a(6, spliterator), this.f13195a.f13203k);
    }

    J0 O(AbstractC1230b abstractC1230b, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    Spliterator P(AbstractC1230b abstractC1230b, Spliterator spliterator) {
        return O(abstractC1230b, spliterator, new C1300p(15)).spliterator();
    }
}
