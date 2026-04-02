package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class Q implements I3, J3 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f13136a;

    public /* synthetic */ void accept(double d7) {
        AbstractC1340x0.a();
        throw null;
    }

    public /* synthetic */ void accept(int i7) {
        AbstractC1340x0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC1340x0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void l(long j) {
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ boolean n() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Q(boolean z7) {
        this.f13136a = z7;
    }

    @Override // j$.util.stream.I3
    public final int d() {
        if (this.f13136a) {
            return 0;
        }
        return EnumC1239c3.f13223r;
    }

    public final void e(AbstractC1230b abstractC1230b, Spliterator spliterator) {
        if (this.f13136a) {
            new S(abstractC1230b, spliterator, this).invoke();
        } else {
            new T(abstractC1230b, spliterator, abstractC1230b.W(this)).invoke();
        }
    }
}
