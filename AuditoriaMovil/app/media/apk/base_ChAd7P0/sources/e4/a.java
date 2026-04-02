package e4;

import java.util.AbstractMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class a implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10868a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f10869b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Iterable f10870c;

    public a(b bVar, int i7) {
        this.f10870c = bVar;
        this.f10869b = i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f10868a) {
            case 0:
                if (this.f10869b < ((b) this.f10870c).f10871a.length) {
                    return true;
                }
                return false;
            default:
                if (this.f10869b >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10868a) {
            case 0:
                b bVar = (b) this.f10870c;
                Object[] objArr = bVar.f10871a;
                int i7 = this.f10869b;
                Object obj = objArr[i7];
                Object obj2 = bVar.f10872b[i7];
                this.f10869b = i7 + 1;
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            default:
                long j = ((l) this.f10870c).f10883a;
                int i8 = this.f10869b;
                Object obj3 = new Object();
                Math.pow(2.0d, i8);
                this.f10869b--;
                return obj3;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f10868a) {
            case 0:
                throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
            default:
                return;
        }
    }

    public a(l lVar) {
        this.f10870c = lVar;
        this.f10869b = lVar.f10884b - 1;
    }

    private final void a() {
    }
}
