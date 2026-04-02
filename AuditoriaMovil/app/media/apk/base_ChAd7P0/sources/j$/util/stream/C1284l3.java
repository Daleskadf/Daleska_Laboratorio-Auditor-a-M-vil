package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;
/* renamed from: j$.util.stream.l3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1284l3 implements Spliterator, Consumer {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f13303d = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Spliterator f13304a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap f13305b;

    /* renamed from: c  reason: collision with root package name */
    private Object f13306c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC1210d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return AbstractC1210d.e(this, i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1284l3(Spliterator spliterator) {
        this(spliterator, new ConcurrentHashMap());
    }

    private C1284l3(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f13304a = spliterator;
        this.f13305b = concurrentHashMap;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f13306c = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Consumer consumer, Object obj) {
        if (this.f13305b.putIfAbsent(obj != null ? obj : f13303d, Boolean.TRUE) == null) {
            consumer.accept(obj);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        while (this.f13304a.tryAdvance(this)) {
            Object obj = this.f13306c;
            if (obj == null) {
                obj = f13303d;
            }
            if (this.f13305b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.f13306c);
                this.f13306c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.f13304a.forEachRemaining(new C1296o0(1, this, consumer));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator trySplit = this.f13304a.trySplit();
        if (trySplit != null) {
            return new C1284l3(trySplit, this.f13305b);
        }
        return null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f13304a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return (this.f13304a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f13304a.getComparator();
    }
}
