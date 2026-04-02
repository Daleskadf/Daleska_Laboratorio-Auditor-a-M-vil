package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;
/* renamed from: j$.util.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1219m implements Iterator, A {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12994a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final Iterator f12995b;

    public C1219m(C1220n c1220n) {
        this.f12995b = c1220n.f13000a.iterator();
    }

    @Override // java.util.Iterator, j$.util.A
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f12994a) {
            case 0:
                AbstractC1210d.q(this.f12995b, consumer);
                return;
            default:
                AbstractC1210d.q(this.f12995b, new C1223q(consumer));
                return;
        }
    }

    public C1219m(C1354t c1354t) {
        this.f12995b = c1354t.f13000a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f12994a) {
            case 0:
                return this.f12995b.hasNext();
            default:
                return this.f12995b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f12994a) {
            case 0:
                return this.f12995b.next();
            default:
                return new r((Map.Entry) this.f12995b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f12994a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
