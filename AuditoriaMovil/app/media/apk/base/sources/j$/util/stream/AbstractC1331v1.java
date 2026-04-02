package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;
/* renamed from: j$.util.stream.v1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC1331v1 extends CountedCompleter implements InterfaceC1298o2 {

    /* renamed from: a  reason: collision with root package name */
    protected final Spliterator f13366a;

    /* renamed from: b  reason: collision with root package name */
    protected final AbstractC1230b f13367b;

    /* renamed from: c  reason: collision with root package name */
    protected final long f13368c;

    /* renamed from: d  reason: collision with root package name */
    protected long f13369d;

    /* renamed from: e  reason: collision with root package name */
    protected long f13370e;
    protected int f;

    /* renamed from: g  reason: collision with root package name */
    protected int f13371g;

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

    abstract AbstractC1331v1 b(Spliterator spliterator, long j, long j8);

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ boolean n() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1331v1(Spliterator spliterator, AbstractC1230b abstractC1230b, int i7) {
        this.f13366a = spliterator;
        this.f13367b = abstractC1230b;
        this.f13368c = AbstractC1245e.g(spliterator.estimateSize());
        this.f13369d = 0L;
        this.f13370e = i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1331v1(AbstractC1331v1 abstractC1331v1, Spliterator spliterator, long j, long j8, int i7) {
        super(abstractC1331v1);
        this.f13366a = spliterator;
        this.f13367b = abstractC1331v1.f13367b;
        this.f13368c = abstractC1331v1.f13368c;
        this.f13369d = j;
        this.f13370e = j8;
        if (j < 0 || j8 < 0 || (j + j8) - 1 >= i7) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j8), Integer.valueOf(i7)));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f13366a;
        AbstractC1331v1 abstractC1331v1 = this;
        while (spliterator.estimateSize() > abstractC1331v1.f13368c && (trySplit = spliterator.trySplit()) != null) {
            abstractC1331v1.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            abstractC1331v1.b(trySplit, abstractC1331v1.f13369d, estimateSize).fork();
            abstractC1331v1 = abstractC1331v1.b(spliterator, abstractC1331v1.f13369d + estimateSize, abstractC1331v1.f13370e - estimateSize);
        }
        abstractC1331v1.f13367b.V(spliterator, abstractC1331v1);
        abstractC1331v1.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        long j8 = this.f13370e;
        if (j > j8) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i7 = (int) this.f13369d;
        this.f = i7;
        this.f13371g = i7 + ((int) j8);
    }
}
