package A3;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: A3.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0022u implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public int f192a;

    /* renamed from: b  reason: collision with root package name */
    public int f193b;

    /* renamed from: c  reason: collision with root package name */
    public int f194c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C0025x f195d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f196e;
    public final /* synthetic */ C0025x f;

    public C0022u(C0025x c0025x, int i7) {
        int i8;
        this.f196e = i7;
        this.f = c0025x;
        this.f195d = c0025x;
        this.f192a = c0025x.f210e;
        if (c0025x.isEmpty()) {
            i8 = -1;
        } else {
            i8 = 0;
        }
        this.f193b = i8;
        this.f194c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f193b >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0024w c0024w;
        C0025x c0025x = this.f195d;
        if (c0025x.f210e == this.f192a) {
            if (hasNext()) {
                int i7 = this.f193b;
                this.f194c = i7;
                switch (this.f196e) {
                    case 0:
                        c0024w = this.f.j()[i7];
                        break;
                    case 1:
                        c0024w = new C0024w(this.f, i7);
                        break;
                    default:
                        c0024w = this.f.k()[i7];
                        break;
                }
                int i8 = this.f193b + 1;
                if (i8 >= c0025x.f) {
                    i8 = -1;
                }
                this.f193b = i8;
                return c0024w;
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z7;
        C0025x c0025x = this.f195d;
        if (c0025x.f210e == this.f192a) {
            if (this.f194c >= 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            G.i.o("no calls to next() since the last call to remove()", z7);
            this.f192a += 32;
            c0025x.remove(c0025x.j()[this.f194c]);
            this.f193b--;
            this.f194c = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
