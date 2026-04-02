package m6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import x6.InterfaceC2020a;
/* loaded from: classes.dex */
public final class t implements Iterator, InterfaceC2020a {

    /* renamed from: a  reason: collision with root package name */
    public w f14077a = w.NotReady;

    /* renamed from: b  reason: collision with root package name */
    public Object f14078b;

    /* renamed from: c  reason: collision with root package name */
    public int f14079c;

    /* renamed from: d  reason: collision with root package name */
    public int f14080d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ u f14081e;

    public t(u uVar) {
        this.f14081e = uVar;
        this.f14079c = uVar.e();
        this.f14080d = uVar.f14084c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        w wVar = this.f14077a;
        w wVar2 = w.Failed;
        if (wVar != wVar2) {
            int i7 = AbstractC1440a.f14062a[wVar.ordinal()];
            if (i7 == 1) {
                return false;
            }
            if (i7 != 2) {
                this.f14077a = wVar2;
                int i8 = this.f14079c;
                if (i8 == 0) {
                    this.f14077a = w.Done;
                } else {
                    u uVar = this.f14081e;
                    Object[] objArr = uVar.f14082a;
                    int i9 = this.f14080d;
                    this.f14078b = objArr[i9];
                    this.f14077a = w.Ready;
                    this.f14080d = (i9 + 1) % uVar.f14083b;
                    this.f14079c = i8 - 1;
                }
                if (this.f14077a != w.Ready) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f14077a = w.NotReady;
            return this.f14078b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
