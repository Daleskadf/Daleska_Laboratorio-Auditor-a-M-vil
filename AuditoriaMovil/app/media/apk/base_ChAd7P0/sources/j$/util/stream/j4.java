package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class j4 implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    final Spliterator f13289a;

    /* renamed from: b  reason: collision with root package name */
    final AtomicBoolean f13290b;

    /* renamed from: c  reason: collision with root package name */
    boolean f13291c;

    /* renamed from: d  reason: collision with root package name */
    int f13292d;

    abstract Spliterator c(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return AbstractC1210d.e(this, i7);
    }

    @Override // j$.util.Spliterator
    public void forEachRemaining(Consumer consumer) {
        do {
        } while (tryAdvance(consumer));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j4(Spliterator spliterator) {
        this.f13291c = true;
        this.f13289a = spliterator;
        this.f13290b = new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j4(Spliterator spliterator, j4 j4Var) {
        this.f13291c = true;
        this.f13289a = spliterator;
        j4Var.getClass();
        this.f13290b = j4Var.f13290b;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f13289a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f13289a.characteristics() & (-16449);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f13289a.getComparator();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        Spliterator trySplit = this.f13289a.trySplit();
        if (trySplit != null) {
            return c(trySplit);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return (this.f13292d == 0 && this.f13290b.get()) ? false : true;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.Z trySplit() {
        return (j$.util.Z) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c0 trySplit() {
        return (j$.util.c0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.W trySplit() {
        return (j$.util.W) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.f0 trySplit() {
        return (j$.util.f0) trySplit();
    }
}
