package com.google.crypto.tink.shaded.protobuf;
/* renamed from: com.google.crypto.tink.shaded.protobuf.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0794v implements U, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0797y f9698a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractC0797y f9699b;

    public AbstractC0794v(AbstractC0797y abstractC0797y) {
        this.f9698a = abstractC0797y;
        if (!abstractC0797y.p()) {
            this.f9699b = abstractC0797y.s();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public static void f(Object obj, Object obj2) {
        d0 d0Var = d0.f9635c;
        d0Var.getClass();
        d0Var.a(obj.getClass()).a(obj, obj2);
    }

    public final AbstractC0797y b() {
        AbstractC0797y c8 = c();
        c8.getClass();
        if (AbstractC0797y.o(c8, true)) {
            return c8;
        }
        throw new i0();
    }

    public final AbstractC0797y c() {
        if (!this.f9699b.p()) {
            return this.f9699b;
        }
        AbstractC0797y abstractC0797y = this.f9699b;
        abstractC0797y.getClass();
        d0 d0Var = d0.f9635c;
        d0Var.getClass();
        d0Var.a(abstractC0797y.getClass()).b(abstractC0797y);
        abstractC0797y.q();
        return this.f9699b;
    }

    public final AbstractC0794v d() {
        AbstractC0794v d7 = this.f9698a.d();
        d7.f9699b = c();
        return d7;
    }

    public final void e() {
        if (!this.f9699b.p()) {
            AbstractC0797y s7 = this.f9698a.s();
            f(s7, this.f9699b);
            this.f9699b = s7;
        }
    }
}
