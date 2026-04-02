package androidx.datastore.preferences.protobuf;
/* renamed from: androidx.datastore.preferences.protobuf.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0544v implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0547y f7870a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractC0547y f7871b;

    public AbstractC0544v(AbstractC0547y abstractC0547y) {
        this.f7870a = abstractC0547y;
        if (!abstractC0547y.i()) {
            this.f7871b = abstractC0547y.k();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public final AbstractC0547y a() {
        AbstractC0547y b5 = b();
        b5.getClass();
        if (AbstractC0547y.h(b5, true)) {
            return b5;
        }
        throw new g0();
    }

    public final AbstractC0547y b() {
        if (!this.f7871b.i()) {
            return this.f7871b;
        }
        AbstractC0547y abstractC0547y = this.f7871b;
        abstractC0547y.getClass();
        X x7 = X.f7783c;
        x7.getClass();
        x7.a(abstractC0547y.getClass()).b(abstractC0547y);
        abstractC0547y.j();
        return this.f7871b;
    }

    public final void c() {
        if (!this.f7871b.i()) {
            AbstractC0547y k2 = this.f7870a.k();
            AbstractC0547y abstractC0547y = this.f7871b;
            X x7 = X.f7783c;
            x7.getClass();
            x7.a(k2.getClass()).a(k2, abstractC0547y);
            this.f7871b = k2;
        }
    }

    public final Object clone() {
        AbstractC0544v abstractC0544v = (AbstractC0544v) this.f7870a.e(EnumC0546x.NEW_BUILDER);
        abstractC0544v.f7871b = b();
        return abstractC0544v;
    }
}
