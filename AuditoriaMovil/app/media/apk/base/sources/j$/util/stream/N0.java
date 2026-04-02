package j$.util.stream;

import j$.util.Collection;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class N0 implements J0 {

    /* renamed from: a  reason: collision with root package name */
    private final Collection f13107a;

    @Override // j$.util.stream.J0
    public final /* synthetic */ J0 h(long j, long j8, IntFunction intFunction) {
        return AbstractC1340x0.w(this, j, j8, intFunction);
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.J0
    public final J0 b(int i7) {
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public N0(Collection collection) {
        this.f13107a = collection;
    }

    @Override // j$.util.stream.J0
    public final Spliterator spliterator() {
        return Collection.EL.stream(this.f13107a).spliterator();
    }

    @Override // j$.util.stream.J0
    public final void i(Object[] objArr, int i7) {
        for (Object obj : this.f13107a) {
            objArr[i7] = obj;
            i7++;
        }
    }

    @Override // j$.util.stream.J0
    public final Object[] o(IntFunction intFunction) {
        java.util.Collection collection = this.f13107a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.J0
    public final long count() {
        return this.f13107a.size();
    }

    @Override // j$.util.stream.J0
    public final void forEach(Consumer consumer) {
        Collection.EL.a(this.f13107a, consumer);
    }

    public final String toString() {
        java.util.Collection collection = this.f13107a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }
}
