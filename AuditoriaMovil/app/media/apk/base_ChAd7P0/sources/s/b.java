package S;

import java.util.Iterator;
import java.util.NoSuchElementException;
import x6.InterfaceC2020a;
/* loaded from: classes.dex */
public final class b implements Iterator, InterfaceC2020a {

    /* renamed from: a  reason: collision with root package name */
    public int f4810a;

    /* renamed from: b  reason: collision with root package name */
    public int f4811b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4812c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4813d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f4814e;

    public b(int i7) {
        this.f4810a = i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4811b < this.f4810a) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object e7;
        if (hasNext()) {
            int i7 = this.f4811b;
            switch (this.f4813d) {
                case 0:
                    e7 = ((f) this.f4814e).e(i7);
                    break;
                case 1:
                    e7 = ((f) this.f4814e).h(i7);
                    break;
                default:
                    e7 = ((g) this.f4814e).f4824b[i7];
                    break;
            }
            this.f4811b++;
            this.f4812c = true;
            return e7;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f4812c) {
            int i7 = this.f4811b - 1;
            this.f4811b = i7;
            switch (this.f4813d) {
                case 0:
                    ((f) this.f4814e).f(i7);
                    break;
                case 1:
                    ((f) this.f4814e).f(i7);
                    break;
                default:
                    ((g) this.f4814e).e(i7);
                    break;
            }
            this.f4810a--;
            this.f4812c = false;
            return;
        }
        throw new IllegalStateException("Call next() before removing an element.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(g gVar) {
        this(gVar.f4825c);
        this.f4813d = 2;
        this.f4814e = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(f fVar, int i7) {
        this(fVar.f4834c);
        this.f4813d = i7;
        switch (i7) {
            case 1:
                this.f4814e = fVar;
                this(fVar.f4834c);
                return;
            default:
                this.f4814e = fVar;
                return;
        }
    }
}
