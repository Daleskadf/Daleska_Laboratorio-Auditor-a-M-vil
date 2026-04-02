package B6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import x6.InterfaceC2020a;
/* loaded from: classes.dex */
public final class e implements Iterator, InterfaceC2020a {

    /* renamed from: a  reason: collision with root package name */
    public final int f404a;

    /* renamed from: b  reason: collision with root package name */
    public final int f405b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f406c;

    /* renamed from: d  reason: collision with root package name */
    public int f407d;

    public e(int i7, int i8, int i9) {
        this.f404a = i9;
        this.f405b = i8;
        boolean z7 = false;
        if (i9 <= 0 ? i7 >= i8 : i7 <= i8) {
            z7 = true;
        }
        this.f406c = z7;
        this.f407d = z7 ? i7 : i8;
    }

    public final int a() {
        int i7 = this.f407d;
        if (i7 == this.f405b) {
            if (this.f406c) {
                this.f406c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f407d = this.f404a + i7;
        }
        return i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f406c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
