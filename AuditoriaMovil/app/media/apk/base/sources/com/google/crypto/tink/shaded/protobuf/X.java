package com.google.crypto.tink.shaded.protobuf;

import D.AbstractC0059i;
/* loaded from: classes.dex */
public final class X implements g0 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0774a f9627a;

    /* renamed from: b  reason: collision with root package name */
    public final k0 f9628b;

    /* renamed from: c  reason: collision with root package name */
    public final C0788o f9629c;

    public X(k0 k0Var, C0788o c0788o, AbstractC0774a abstractC0774a) {
        this.f9628b = k0Var;
        c0788o.getClass();
        this.f9629c = c0788o;
        this.f9627a = abstractC0774a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public final void a(Object obj, Object obj2) {
        h0.B(this.f9628b, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public final void b(Object obj) {
        this.f9628b.getClass();
        k0.b(obj);
        this.f9629c.getClass();
        AbstractC0059i.I(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public final boolean c(Object obj) {
        this.f9629c.getClass();
        AbstractC0059i.I(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public final int d(AbstractC0797y abstractC0797y) {
        this.f9628b.getClass();
        j0 j0Var = abstractC0797y.unknownFields;
        int i7 = j0Var.f9670d;
        if (i7 == -1) {
            int i8 = 0;
            for (int i9 = 0; i9 < j0Var.f9667a; i9++) {
                i8 += C0784k.B(3, (AbstractC0781h) j0Var.f9669c[i9]) + C0784k.T(2, j0Var.f9668b[i9] >>> 3) + (C0784k.S(1) * 2);
            }
            j0Var.f9670d = i8;
            return i8;
        }
        return i7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public final void e(Object obj, K0.l lVar, C0787n c0787n) {
        this.f9628b.getClass();
        k0.a(obj);
        this.f9629c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public final void f(Object obj, byte[] bArr, int i7, int i8, B2.c cVar) {
        AbstractC0797y abstractC0797y = (AbstractC0797y) obj;
        if (abstractC0797y.unknownFields == j0.f) {
            abstractC0797y.unknownFields = j0.c();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public final boolean g(AbstractC0797y abstractC0797y, Object obj) {
        this.f9628b.getClass();
        if (!abstractC0797y.unknownFields.equals(((AbstractC0797y) obj).unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public final void h(Object obj, O o7) {
        this.f9629c.getClass();
        AbstractC0059i.I(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public final int i(AbstractC0797y abstractC0797y) {
        this.f9628b.getClass();
        return abstractC0797y.unknownFields.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public final Object newInstance() {
        AbstractC0774a abstractC0774a = this.f9627a;
        if (abstractC0774a instanceof AbstractC0797y) {
            return ((AbstractC0797y) abstractC0774a).s();
        }
        return abstractC0774a.d().c();
    }
}
