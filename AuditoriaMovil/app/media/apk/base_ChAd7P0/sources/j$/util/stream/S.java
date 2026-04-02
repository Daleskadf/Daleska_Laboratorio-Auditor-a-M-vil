package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;
/* loaded from: classes2.dex */
final class S extends CountedCompleter {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1230b f13147a;

    /* renamed from: b  reason: collision with root package name */
    private Spliterator f13148b;

    /* renamed from: c  reason: collision with root package name */
    private final long f13149c;

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentHashMap f13150d;

    /* renamed from: e  reason: collision with root package name */
    private final Q f13151e;
    private final S f;

    /* renamed from: g  reason: collision with root package name */
    private J0 f13152g;

    /* JADX INFO: Access modifiers changed from: protected */
    public S(AbstractC1230b abstractC1230b, Spliterator spliterator, Q q2) {
        super(null);
        this.f13147a = abstractC1230b;
        this.f13148b = spliterator;
        this.f13149c = AbstractC1245e.g(spliterator.estimateSize());
        this.f13150d = new ConcurrentHashMap(Math.max(16, AbstractC1245e.b() << 1));
        this.f13151e = q2;
        this.f = null;
    }

    S(S s7, Spliterator spliterator, S s8) {
        super(s7);
        this.f13147a = s7.f13147a;
        this.f13148b = spliterator;
        this.f13149c = s7.f13149c;
        this.f13150d = s7.f13150d;
        this.f13151e = s7.f13151e;
        this.f = s8;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f13148b;
        long j = this.f13149c;
        boolean z7 = false;
        S s7 = this;
        while (spliterator.estimateSize() > j && (trySplit = spliterator.trySplit()) != null) {
            S s8 = new S(s7, trySplit, s7.f);
            S s9 = new S(s7, spliterator, s8);
            s7.addToPendingCount(1);
            s9.addToPendingCount(1);
            s7.f13150d.put(s8, s9);
            if (s7.f != null) {
                s8.addToPendingCount(1);
                if (s7.f13150d.replace(s7.f, s7, s8)) {
                    s7.addToPendingCount(-1);
                } else {
                    s8.addToPendingCount(-1);
                }
            }
            if (z7) {
                spliterator = trySplit;
                s7 = s8;
                s8 = s9;
            } else {
                s7 = s9;
            }
            z7 = !z7;
            s8.fork();
        }
        if (s7.getPendingCount() > 0) {
            r rVar = new r(5);
            AbstractC1230b abstractC1230b = s7.f13147a;
            B0 N7 = abstractC1230b.N(abstractC1230b.G(spliterator), rVar);
            s7.f13147a.V(spliterator, N7);
            s7.f13152g = N7.a();
            s7.f13148b = null;
        }
        s7.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        J0 j02 = this.f13152g;
        if (j02 != null) {
            j02.forEach(this.f13151e);
            this.f13152g = null;
        } else {
            Spliterator spliterator = this.f13148b;
            if (spliterator != null) {
                this.f13147a.V(spliterator, this.f13151e);
                this.f13148b = null;
            }
        }
        S s7 = (S) this.f13150d.remove(this);
        if (s7 != null) {
            s7.tryComplete();
        }
    }
}
