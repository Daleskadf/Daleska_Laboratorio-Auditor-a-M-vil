package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class O implements Q, A {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfLong f12851a;

    private /* synthetic */ O(PrimitiveIterator.OfLong ofLong) {
        this.f12851a = ofLong;
    }

    public static /* synthetic */ Q a(PrimitiveIterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof P ? ((P) ofLong).f12854a : new O(ofLong);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfLong ofLong = this.f12851a;
        if (obj instanceof O) {
            obj = ((O) obj).f12851a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.S
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f12851a.forEachRemaining((PrimitiveIterator.OfLong) obj);
    }

    @Override // j$.util.Q, java.util.Iterator, j$.util.A
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f12851a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.Q
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f12851a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f12851a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f12851a.hashCode();
    }

    @Override // j$.util.Q, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f12851a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f12851a.next();
    }

    @Override // j$.util.Q
    public final /* synthetic */ long nextLong() {
        return this.f12851a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f12851a.remove();
    }
}
