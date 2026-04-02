package d4;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public class d implements Iterator, Iterable {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f12526a;

    /* renamed from: b  reason: collision with root package name */
    public int f12527b = 0;

    public d(Object[] objArr) {
        this.f12526a = objArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f12527b < this.f12526a.length) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f12527b;
        Object[] objArr = this.f12526a;
        if (i10 < objArr.length) {
            this.f12527b = i10 + 1;
            return objArr[i10];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
