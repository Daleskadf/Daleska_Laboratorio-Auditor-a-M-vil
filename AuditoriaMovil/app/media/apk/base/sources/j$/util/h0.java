package j$.util;

import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
/* loaded from: classes2.dex */
final class h0 implements Iterator, Consumer {

    /* renamed from: a  reason: collision with root package name */
    boolean f12972a = false;

    /* renamed from: b  reason: collision with root package name */
    Object f12973b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Spliterator f12974c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(Spliterator spliterator) {
        this.f12974c = spliterator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f12972a = true;
        this.f12973b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f12972a) {
            this.f12974c.tryAdvance(this);
        }
        return this.f12972a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f12972a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12972a = false;
        return this.f12973b;
    }
}
