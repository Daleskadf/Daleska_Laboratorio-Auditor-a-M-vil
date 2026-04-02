package com.google.protobuf;

import D.AbstractC0059i;
/* renamed from: com.google.protobuf.s0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0864s0 implements E0 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0828a f10133a;

    /* renamed from: b  reason: collision with root package name */
    public final Q0 f10134b;

    /* renamed from: c  reason: collision with root package name */
    public final C0873x f10135c;

    public C0864s0(Q0 q0, C0873x c0873x, AbstractC0828a abstractC0828a) {
        this.f10134b = q0;
        c0873x.getClass();
        this.f10135c = c0873x;
        this.f10133a = abstractC0828a;
    }

    @Override // com.google.protobuf.E0
    public final void a(Object obj, Object obj2) {
        F0.A(this.f10134b, obj, obj2);
    }

    @Override // com.google.protobuf.E0
    public final void b(Object obj) {
        this.f10134b.getClass();
        Q0.b(obj);
        this.f10135c.getClass();
        AbstractC0059i.I(obj);
        throw null;
    }

    @Override // com.google.protobuf.E0
    public final boolean c(Object obj) {
        this.f10135c.getClass();
        AbstractC0059i.I(obj);
        throw null;
    }

    @Override // com.google.protobuf.E0
    public final int d(J j) {
        this.f10134b.getClass();
        P0 p02 = j.unknownFields;
        int i7 = p02.f10028d;
        if (i7 == -1) {
            int i8 = 0;
            for (int i9 = 0; i9 < p02.f10025a; i9++) {
                i8 += AbstractC0865t.Y(3, (AbstractC0852m) p02.f10027c[i9]) + AbstractC0865t.q0(2, p02.f10026b[i9] >>> 3) + (AbstractC0865t.p0(1) * 2);
            }
            p02.f10028d = i8;
            return i8;
        }
        return i7;
    }

    @Override // com.google.protobuf.E0
    public final void e(Object obj, C0845i0 c0845i0) {
        this.f10135c.getClass();
        AbstractC0059i.I(obj);
        throw null;
    }

    @Override // com.google.protobuf.E0
    public final void f(Object obj, K0.l lVar, C0871w c0871w) {
        this.f10134b.getClass();
        Q0.a(obj);
        this.f10135c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.protobuf.E0
    public final boolean g(J j, Object obj) {
        this.f10134b.getClass();
        if (!j.unknownFields.equals(((J) obj).unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.E0
    public final void h(Object obj, byte[] bArr, int i7, int i8, C0838f c0838f) {
        J j = (J) obj;
        if (j.unknownFields == P0.f) {
            j.unknownFields = P0.c();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.protobuf.E0
    public final int i(J j) {
        this.f10134b.getClass();
        return j.unknownFields.hashCode();
    }

    @Override // com.google.protobuf.E0
    public final J newInstance() {
        AbstractC0828a abstractC0828a = this.f10133a;
        if (abstractC0828a instanceof J) {
            return ((J) abstractC0828a).q();
        }
        return ((G) ((J) abstractC0828a).j(I.NEW_BUILDER)).c();
    }
}
