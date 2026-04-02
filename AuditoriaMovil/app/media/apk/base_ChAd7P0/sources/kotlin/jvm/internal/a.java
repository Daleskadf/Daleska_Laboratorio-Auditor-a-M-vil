package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import m6.AbstractC1443d;
import x6.InterfaceC2020a;
/* loaded from: classes.dex */
public class a implements Iterator, InterfaceC2020a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13782a = 1;

    /* renamed from: b  reason: collision with root package name */
    public int f13783b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f13784c;

    public a(Object[] array) {
        j.e(array, "array");
        this.f13784c = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f13782a) {
            case 0:
                if (this.f13783b < ((Object[]) this.f13784c).length) {
                    return true;
                }
                return false;
            default:
                if (this.f13783b < ((AbstractC1443d) this.f13784c).e()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f13782a) {
            case 0:
                try {
                    int i7 = this.f13783b;
                    this.f13783b = i7 + 1;
                    return ((Object[]) this.f13784c)[i7];
                } catch (ArrayIndexOutOfBoundsException e7) {
                    this.f13783b--;
                    throw new NoSuchElementException(e7.getMessage());
                }
            default:
                if (hasNext()) {
                    int i8 = this.f13783b;
                    this.f13783b = i8 + 1;
                    return ((AbstractC1443d) this.f13784c).get(i8);
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f13782a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(AbstractC1443d abstractC1443d) {
        this.f13784c = abstractC1443d;
    }
}
