package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class Q0 extends AbstractC1245e {

    /* renamed from: h  reason: collision with root package name */
    protected final AbstractC1230b f13137h;

    /* renamed from: i  reason: collision with root package name */
    protected final LongFunction f13138i;
    protected final BinaryOperator j;

    @Override // j$.util.stream.AbstractC1245e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC1245e abstractC1245e = this.f13248d;
        if (abstractC1245e != null) {
            f((J0) this.j.apply((J0) ((Q0) abstractC1245e).c(), (J0) ((Q0) this.f13249e).c()));
        }
        super.onCompletion(countedCompleter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q0(AbstractC1230b abstractC1230b, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC1230b, spliterator);
        this.f13137h = abstractC1230b;
        this.f13138i = longFunction;
        this.j = binaryOperator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q0(Q0 q0, Spliterator spliterator) {
        super(q0, spliterator);
        this.f13137h = q0.f13137h;
        this.f13138i = q0.f13138i;
        this.j = q0.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC1245e
    public AbstractC1245e e(Spliterator spliterator) {
        return new Q0(this, spliterator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC1245e
    /* renamed from: h */
    public final J0 a() {
        B0 b0 = (B0) this.f13138i.apply(this.f13137h.G(this.f13246b));
        this.f13137h.V(this.f13246b, b0);
        return b0.a();
    }
}
