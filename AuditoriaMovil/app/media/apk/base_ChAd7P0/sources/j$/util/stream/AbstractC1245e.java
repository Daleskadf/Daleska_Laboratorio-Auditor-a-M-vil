package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;
/* renamed from: j$.util.stream.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC1245e extends CountedCompleter {

    /* renamed from: g  reason: collision with root package name */
    private static final int f13244g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* renamed from: a  reason: collision with root package name */
    protected final AbstractC1230b f13245a;

    /* renamed from: b  reason: collision with root package name */
    protected Spliterator f13246b;

    /* renamed from: c  reason: collision with root package name */
    protected long f13247c;

    /* renamed from: d  reason: collision with root package name */
    protected AbstractC1245e f13248d;

    /* renamed from: e  reason: collision with root package name */
    protected AbstractC1245e f13249e;
    private Object f;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object a();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract AbstractC1245e e(Spliterator spliterator);

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1245e(AbstractC1230b abstractC1230b, Spliterator spliterator) {
        super(null);
        this.f13245a = abstractC1230b;
        this.f13246b = spliterator;
        this.f13247c = 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1245e(AbstractC1245e abstractC1245e, Spliterator spliterator) {
        super(abstractC1245e);
        this.f13246b = spliterator;
        this.f13245a = abstractC1245e.f13245a;
        this.f13247c = abstractC1245e.f13247c;
    }

    public static int b() {
        return f13244g;
    }

    public static long g(long j) {
        long j8 = j / f13244g;
        if (j8 > 0) {
            return j8;
        }
        return 1L;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object c() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(Object obj) {
        this.f = obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean d() {
        return ((AbstractC1245e) getCompleter()) == null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f13246b;
        long estimateSize = spliterator.estimateSize();
        long j = this.f13247c;
        if (j == 0) {
            j = g(estimateSize);
            this.f13247c = j;
        }
        boolean z7 = false;
        AbstractC1245e abstractC1245e = this;
        while (estimateSize > j && (trySplit = spliterator.trySplit()) != null) {
            AbstractC1245e e7 = abstractC1245e.e(trySplit);
            abstractC1245e.f13248d = e7;
            AbstractC1245e e8 = abstractC1245e.e(spliterator);
            abstractC1245e.f13249e = e8;
            abstractC1245e.setPendingCount(1);
            if (z7) {
                spliterator = trySplit;
                abstractC1245e = e7;
                e7 = e8;
            } else {
                abstractC1245e = e8;
            }
            z7 = !z7;
            e7.fork();
            estimateSize = spliterator.estimateSize();
        }
        abstractC1245e.f(abstractC1245e.a());
        abstractC1245e.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f13246b = null;
        this.f13249e = null;
        this.f13248d = null;
    }
}
