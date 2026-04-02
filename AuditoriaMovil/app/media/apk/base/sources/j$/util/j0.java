package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j0 implements Q, LongConsumer, A {

    /* renamed from: a  reason: collision with root package name */
    boolean f12984a = false;

    /* renamed from: b  reason: collision with root package name */
    long f12985b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c0 f12986c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.S
    public final void forEachRemaining(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        while (hasNext()) {
            longConsumer.accept(nextLong());
        }
    }

    @Override // java.util.Iterator
    public final Long next() {
        if (v0.f13415a) {
            v0.a(j0.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(nextLong());
    }

    @Override // j$.util.Q, java.util.Iterator, j$.util.A
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (v0.f13415a) {
            v0.a(j0.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((LongConsumer) new N(consumer));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(c0 c0Var) {
        this.f12986c = c0Var;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f12984a = true;
        this.f12985b = j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f12984a) {
            this.f12986c.tryAdvance((LongConsumer) this);
        }
        return this.f12984a;
    }

    @Override // j$.util.Q
    public final long nextLong() {
        if (!this.f12984a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12984a = false;
        return this.f12985b;
    }
}
