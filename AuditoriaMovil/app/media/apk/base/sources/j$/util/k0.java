package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class k0 implements I, DoubleConsumer, A {

    /* renamed from: a  reason: collision with root package name */
    boolean f12987a = false;

    /* renamed from: b  reason: collision with root package name */
    double f12988b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ W f12989c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.S
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (v0.f13415a) {
            v0.a(k0.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // j$.util.I, java.util.Iterator, j$.util.A
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (v0.f13415a) {
            v0.a(k0.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((DoubleConsumer) new F(consumer));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(W w2) {
        this.f12989c = w2;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d7) {
        this.f12987a = true;
        this.f12988b = d7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f12987a) {
            this.f12989c.tryAdvance((DoubleConsumer) this);
        }
        return this.f12987a;
    }

    @Override // j$.util.I
    public final double nextDouble() {
        if (!this.f12987a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12987a = false;
        return this.f12988b;
    }
}
