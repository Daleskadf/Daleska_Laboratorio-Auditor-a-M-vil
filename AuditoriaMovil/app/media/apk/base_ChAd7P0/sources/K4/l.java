package K4;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class l implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public n f2665a;

    /* renamed from: b  reason: collision with root package name */
    public n f2666b = null;

    /* renamed from: c  reason: collision with root package name */
    public int f2667c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ o f2668d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f2669e;

    public l(o oVar, int i7) {
        this.f2669e = i7;
        this.f2668d = oVar;
        this.f2665a = oVar.f.f2678d;
        this.f2667c = oVar.f2687e;
    }

    public final Object a() {
        return b();
    }

    public final n b() {
        n nVar = this.f2665a;
        o oVar = this.f2668d;
        if (nVar != oVar.f) {
            if (oVar.f2687e == this.f2667c) {
                this.f2665a = nVar.f2678d;
                this.f2666b = nVar;
                return nVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2665a != this.f2668d.f) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f2669e) {
            case 1:
                return b().f;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        n nVar = this.f2666b;
        if (nVar != null) {
            o oVar = this.f2668d;
            oVar.c(nVar, true);
            this.f2666b = null;
            this.f2667c = oVar.f2687e;
            return;
        }
        throw new IllegalStateException();
    }
}
