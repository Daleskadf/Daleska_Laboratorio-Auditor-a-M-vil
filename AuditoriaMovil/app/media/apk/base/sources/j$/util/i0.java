package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class i0 implements M, IntConsumer, A {

    /* renamed from: a  reason: collision with root package name */
    boolean f12976a = false;

    /* renamed from: b  reason: collision with root package name */
    int f12977b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Z f12978c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.S
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        while (hasNext()) {
            intConsumer.accept(nextInt());
        }
    }

    @Override // java.util.Iterator
    public final Integer next() {
        if (v0.f13415a) {
            v0.a(i0.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        return Integer.valueOf(nextInt());
    }

    @Override // j$.util.M, java.util.Iterator, j$.util.A
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (v0.f13415a) {
            v0.a(i0.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((IntConsumer) new J(consumer));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(Z z7) {
        this.f12978c = z7;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i7) {
        this.f12976a = true;
        this.f12977b = i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f12976a) {
            this.f12978c.tryAdvance((IntConsumer) this);
        }
        return this.f12976a;
    }

    @Override // j$.util.M
    public final int nextInt() {
        if (!this.f12976a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12976a = false;
        return this.f12977b;
    }
}
