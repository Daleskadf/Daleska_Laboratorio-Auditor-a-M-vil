package B6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import x6.InterfaceC2020a;
/* loaded from: classes.dex */
public final class b implements Iterator, InterfaceC2020a {

    /* renamed from: a  reason: collision with root package name */
    public final int f397a;

    /* renamed from: b  reason: collision with root package name */
    public final int f398b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f399c;

    /* renamed from: d  reason: collision with root package name */
    public int f400d;

    public b(char c8, char c9, int i7) {
        this.f397a = i7;
        this.f398b = c9;
        boolean z7 = false;
        if (i7 <= 0 ? c8 >= c9 : c8 < c9 || c8 == c9) {
            z7 = true;
        }
        this.f399c = z7;
        this.f400d = z7 ? c8 : c9;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f399c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f400d;
        if (i7 == this.f398b) {
            if (this.f399c) {
                this.f399c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f400d = this.f397a + i7;
        }
        return Character.valueOf((char) i7);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
