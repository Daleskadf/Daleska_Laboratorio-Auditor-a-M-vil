package com.google.protobuf;
/* loaded from: classes.dex */
public abstract class G implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public final J f10005a;

    /* renamed from: b  reason: collision with root package name */
    public J f10006b;

    public G(J j) {
        this.f10005a = j;
        if (!j.n()) {
            this.f10006b = j.q();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public static void e(Object obj, Object obj2) {
        C0878z0 c0878z0 = C0878z0.f10148c;
        c0878z0.getClass();
        c0878z0.a(obj.getClass()).a(obj, obj2);
    }

    public final J b() {
        J c8 = c();
        c8.getClass();
        if (J.m(c8, true)) {
            return c8;
        }
        throw new O0();
    }

    public final J c() {
        if (!this.f10006b.n()) {
            return this.f10006b;
        }
        J j = this.f10006b;
        j.getClass();
        C0878z0 c0878z0 = C0878z0.f10148c;
        c0878z0.getClass();
        c0878z0.a(j.getClass()).b(j);
        j.o();
        return this.f10006b;
    }

    public final Object clone() {
        G g3 = (G) this.f10005a.j(I.NEW_BUILDER);
        g3.f10006b = c();
        return g3;
    }

    public final void d() {
        if (!this.f10006b.n()) {
            J q2 = this.f10005a.q();
            e(q2, this.f10006b);
            this.f10006b = q2;
        }
    }
}
