package androidx.datastore.preferences.protobuf;

import D.AbstractC0059i;
/* loaded from: classes.dex */
public final class S implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0547y f7778a;

    /* renamed from: b  reason: collision with root package name */
    public final i0 f7779b;

    /* renamed from: c  reason: collision with root package name */
    public final C0537n f7780c;

    public S(i0 i0Var, C0537n c0537n, AbstractC0547y abstractC0547y) {
        this.f7779b = i0Var;
        c0537n.getClass();
        this.f7780c = c0537n;
        this.f7778a = abstractC0547y;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public final void a(Object obj, Object obj2) {
        c0.A(this.f7779b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public final void b(Object obj) {
        this.f7779b.getClass();
        i0.b(obj);
        this.f7780c.getClass();
        AbstractC0059i.I(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public final boolean c(Object obj) {
        this.f7780c.getClass();
        AbstractC0059i.I(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public final void d(Object obj, I i7) {
        this.f7780c.getClass();
        AbstractC0059i.I(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public final int e(AbstractC0547y abstractC0547y) {
        this.f7779b.getClass();
        return abstractC0547y.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public final void f(Object obj, K0.l lVar, C0536m c0536m) {
        this.f7779b.getClass();
        i0.a(obj);
        this.f7780c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public final boolean g(AbstractC0547y abstractC0547y, Object obj) {
        this.f7779b.getClass();
        if (!abstractC0547y.unknownFields.equals(((AbstractC0547y) obj).unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public final int h(AbstractC0547y abstractC0547y) {
        this.f7779b.getClass();
        h0 h0Var = abstractC0547y.unknownFields;
        int i7 = h0Var.f7831d;
        if (i7 == -1) {
            int i8 = 0;
            for (int i9 = 0; i9 < h0Var.f7828a; i9++) {
                i8 += C0534k.R(3, (C0530g) h0Var.f7830c[i9]) + C0534k.h0(2, h0Var.f7829b[i9] >>> 3) + (C0534k.g0(1) * 2);
            }
            h0Var.f7831d = i8;
            return i8;
        }
        return i7;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public final AbstractC0547y newInstance() {
        AbstractC0547y abstractC0547y = this.f7778a;
        if (abstractC0547y instanceof AbstractC0547y) {
            return abstractC0547y.k();
        }
        return ((AbstractC0544v) abstractC0547y.e(EnumC0546x.NEW_BUILDER)).b();
    }
}
