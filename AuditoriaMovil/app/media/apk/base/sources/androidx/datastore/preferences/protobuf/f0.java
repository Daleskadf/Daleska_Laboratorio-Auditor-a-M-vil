package androidx.datastore.preferences.protobuf;

import com.google.protobuf.G0;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class f0 implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7813a;

    /* renamed from: b  reason: collision with root package name */
    public int f7814b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7815c;

    /* renamed from: d  reason: collision with root package name */
    public Iterator f7816d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AbstractMap f7817e;

    public /* synthetic */ f0(AbstractMap abstractMap, int i7) {
        this.f7813a = i7;
        this.f7817e = abstractMap;
    }

    public final Iterator a() {
        switch (this.f7813a) {
            case 0:
                if (this.f7816d == null) {
                    this.f7816d = ((d0) this.f7817e).f7804b.entrySet().iterator();
                }
                return this.f7816d;
            default:
                if (this.f7816d == null) {
                    this.f7816d = ((G0) this.f7817e).f10010c.entrySet().iterator();
                }
                return this.f7816d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7813a) {
            case 0:
                int i7 = this.f7814b + 1;
                d0 d0Var = (d0) this.f7817e;
                if (i7 < d0Var.f7803a.size()) {
                    return true;
                }
                if (!d0Var.f7804b.isEmpty() && a().hasNext()) {
                    return true;
                }
                return false;
            default:
                int i8 = this.f7814b + 1;
                G0 g02 = (G0) this.f7817e;
                if (i8 < g02.f10009b.size()) {
                    return true;
                }
                if (!g02.f10010c.isEmpty() && a().hasNext()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7813a) {
            case 0:
                this.f7815c = true;
                int i7 = this.f7814b + 1;
                this.f7814b = i7;
                d0 d0Var = (d0) this.f7817e;
                if (i7 < d0Var.f7803a.size()) {
                    return (Map.Entry) d0Var.f7803a.get(this.f7814b);
                }
                return (Map.Entry) a().next();
            default:
                this.f7815c = true;
                int i8 = this.f7814b + 1;
                this.f7814b = i8;
                G0 g02 = (G0) this.f7817e;
                if (i8 < g02.f10009b.size()) {
                    return (Map.Entry) g02.f10009b.get(this.f7814b);
                }
                return (Map.Entry) a().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractMap abstractMap = this.f7817e;
        switch (this.f7813a) {
            case 0:
                if (this.f7815c) {
                    this.f7815c = false;
                    int i7 = d0.f;
                    d0 d0Var = (d0) abstractMap;
                    d0Var.b();
                    if (this.f7814b < d0Var.f7803a.size()) {
                        int i8 = this.f7814b;
                        this.f7814b = i8 - 1;
                        d0Var.h(i8);
                        return;
                    }
                    a().remove();
                    return;
                }
                throw new IllegalStateException("remove() was called before next()");
            default:
                if (this.f7815c) {
                    this.f7815c = false;
                    int i9 = G0.f10007X;
                    G0 g02 = (G0) abstractMap;
                    g02.b();
                    if (this.f7814b < g02.f10009b.size()) {
                        int i10 = this.f7814b;
                        this.f7814b = i10 - 1;
                        g02.g(i10);
                        return;
                    }
                    a().remove();
                    return;
                }
                throw new IllegalStateException("remove() was called before next()");
        }
    }
}
