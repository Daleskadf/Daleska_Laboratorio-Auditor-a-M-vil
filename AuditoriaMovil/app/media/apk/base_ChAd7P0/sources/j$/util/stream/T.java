package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
/* loaded from: classes2.dex */
final class T extends CountedCompleter {

    /* renamed from: a  reason: collision with root package name */
    private Spliterator f13158a;

    /* renamed from: b  reason: collision with root package name */
    private final InterfaceC1298o2 f13159b;

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC1230b f13160c;

    /* renamed from: d  reason: collision with root package name */
    private long f13161d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public T(AbstractC1230b abstractC1230b, Spliterator spliterator, InterfaceC1298o2 interfaceC1298o2) {
        super(null);
        this.f13159b = interfaceC1298o2;
        this.f13160c = abstractC1230b;
        this.f13158a = spliterator;
        this.f13161d = 0L;
    }

    T(T t7, Spliterator spliterator) {
        super(t7);
        this.f13158a = spliterator;
        this.f13159b = t7.f13159b;
        this.f13161d = t7.f13161d;
        this.f13160c = t7.f13160c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f13158a;
        long estimateSize = spliterator.estimateSize();
        long j = this.f13161d;
        if (j == 0) {
            j = AbstractC1245e.g(estimateSize);
            this.f13161d = j;
        }
        boolean t7 = EnumC1239c3.SHORT_CIRCUIT.t(this.f13160c.K());
        InterfaceC1298o2 interfaceC1298o2 = this.f13159b;
        boolean z7 = false;
        T t8 = this;
        while (true) {
            if (t7 && interfaceC1298o2.n()) {
                break;
            } else if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            } else {
                T t9 = new T(t8, trySplit);
                t8.addToPendingCount(1);
                if (z7) {
                    spliterator = trySplit;
                } else {
                    T t10 = t8;
                    t8 = t9;
                    t9 = t10;
                }
                z7 = !z7;
                t8.fork();
                t8 = t9;
                estimateSize = spliterator.estimateSize();
            }
        }
        t8.f13160c.A(spliterator, interfaceC1298o2);
        t8.f13158a = null;
        t8.propagateCompletion();
    }
}
