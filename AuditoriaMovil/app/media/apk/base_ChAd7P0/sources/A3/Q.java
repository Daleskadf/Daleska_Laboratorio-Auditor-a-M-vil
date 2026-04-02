package A3;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class Q extends t0 {

    /* renamed from: a  reason: collision with root package name */
    public EnumC0004b f109a;

    /* renamed from: b  reason: collision with root package name */
    public Object f110b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f111c;

    /* renamed from: d  reason: collision with root package name */
    public final Iterator f112d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f113e;

    public Q() {
        this.f109a = EnumC0004b.NOT_READY;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z7;
        Object next;
        EnumC0004b enumC0004b = this.f109a;
        EnumC0004b enumC0004b2 = EnumC0004b.FAILED;
        if (enumC0004b != enumC0004b2) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.p(z7);
        int i7 = AbstractC0003a.f123a[this.f109a.ordinal()];
        if (i7 == 1) {
            return false;
        }
        if (i7 == 2) {
            return true;
        }
        this.f109a = enumC0004b2;
        switch (this.f111c) {
            case 0:
                do {
                    Iterator it = this.f112d;
                    if (it.hasNext()) {
                        next = it.next();
                    } else {
                        this.f109a = EnumC0004b.DONE;
                        next = null;
                        break;
                    }
                } while (!((z3.k) this.f113e).apply(next));
                break;
            default:
                do {
                    Iterator it2 = this.f112d;
                    if (it2.hasNext()) {
                        next = it2.next();
                    } else {
                        this.f109a = EnumC0004b.DONE;
                        next = null;
                        break;
                    }
                } while (!((n0) this.f113e).f180b.contains(next));
                break;
        }
        this.f110b = next;
        if (this.f109a == EnumC0004b.DONE) {
            return false;
        }
        this.f109a = EnumC0004b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f109a = EnumC0004b.NOT_READY;
            Object obj = this.f110b;
            this.f110b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Q(Iterator it, z3.k kVar) {
        this();
        this.f111c = 0;
        this.f112d = it;
        this.f113e = kVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Q(n0 n0Var) {
        this();
        this.f111c = 1;
        this.f113e = n0Var;
        this.f112d = n0Var.f179a.iterator();
    }
}
