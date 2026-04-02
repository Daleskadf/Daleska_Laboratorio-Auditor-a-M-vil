package com.fasterxml.jackson.databind.deser.std;

import b3.k;
import java.util.EnumSet;
import java.util.Objects;
/* loaded from: classes.dex */
public class m extends b0 implements n3.i {

    /* renamed from: a  reason: collision with root package name */
    public final k3.j f6574a;

    /* renamed from: b  reason: collision with root package name */
    public k3.k f6575b;

    /* renamed from: c  reason: collision with root package name */
    public final n3.q f6576c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f6577d;

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f6578e;

    public m(k3.j jVar, k3.k kVar) {
        super(EnumSet.class);
        this.f6574a = jVar;
        if (jVar.F()) {
            this.f6575b = kVar;
            this.f6578e = null;
            this.f6576c = null;
            this.f6577d = false;
            return;
        }
        throw new IllegalArgumentException("Type " + jVar + " not Java Enum type");
    }

    public final EnumSet a(c3.k kVar, k3.g gVar, EnumSet enumSet) {
        Enum r02;
        while (true) {
            try {
                c3.n s02 = kVar.s0();
                if (s02 != c3.n.END_ARRAY) {
                    if (s02 == c3.n.VALUE_NULL) {
                        if (!this.f6577d) {
                            r02 = (Enum) this.f6576c.getNullValue(gVar);
                        }
                    } else {
                        r02 = (Enum) this.f6575b.deserialize(kVar, gVar);
                    }
                    if (r02 != null) {
                        enumSet.add(r02);
                    }
                } else {
                    return enumSet;
                }
            } catch (Exception e10) {
                throw k3.l.p(e10, enumSet, enumSet.size());
            }
        }
    }

    public final EnumSet b() {
        return EnumSet.noneOf(this.f6574a.q());
    }

    @Override // k3.k
    /* renamed from: c */
    public EnumSet deserialize(c3.k kVar, k3.g gVar) {
        EnumSet b10 = b();
        if (!kVar.n0()) {
            return e(kVar, gVar, b10);
        }
        return a(kVar, gVar, b10);
    }

    @Override // n3.i
    public k3.k createContextual(k3.g gVar, k3.d dVar) {
        k3.k Z;
        Boolean findFormatFeature = findFormatFeature(gVar, dVar, EnumSet.class, k.a.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        k3.k kVar = this.f6575b;
        if (kVar == null) {
            Z = gVar.D(this.f6574a, dVar);
        } else {
            Z = gVar.Z(kVar, dVar, this.f6574a);
        }
        return f(Z, findContentNullProvider(gVar, dVar, Z), findFormatFeature);
    }

    @Override // k3.k
    /* renamed from: d */
    public EnumSet deserialize(c3.k kVar, k3.g gVar, EnumSet enumSet) {
        if (!kVar.n0()) {
            return e(kVar, gVar, enumSet);
        }
        return a(kVar, gVar, enumSet);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.b0, k3.k
    public Object deserializeWithType(c3.k kVar, k3.g gVar, w3.e eVar) {
        return eVar.d(kVar, gVar);
    }

    public EnumSet e(c3.k kVar, k3.g gVar, EnumSet enumSet) {
        boolean z10;
        Boolean bool = this.f6578e;
        if (bool != Boolean.TRUE && (bool != null || !gVar.n0(k3.h.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return (EnumSet) gVar.a0(EnumSet.class, kVar);
        }
        if (kVar.j0(c3.n.VALUE_NULL)) {
            return (EnumSet) gVar.c0(this.f6574a, kVar);
        }
        try {
            Enum r32 = (Enum) this.f6575b.deserialize(kVar, gVar);
            if (r32 != null) {
                enumSet.add(r32);
            }
            return enumSet;
        } catch (Exception e10) {
            throw k3.l.p(e10, enumSet, enumSet.size());
        }
    }

    public m f(k3.k kVar, n3.q qVar, Boolean bool) {
        if (Objects.equals(this.f6578e, bool) && this.f6575b == kVar && this.f6576c == kVar) {
            return this;
        }
        return new m(this, kVar, qVar, bool);
    }

    @Override // k3.k
    public d4.a getEmptyAccessPattern() {
        return d4.a.DYNAMIC;
    }

    @Override // k3.k
    public Object getEmptyValue(k3.g gVar) {
        return b();
    }

    @Override // k3.k
    public boolean isCachable() {
        if (this.f6574a.u() != null) {
            return false;
        }
        return true;
    }

    @Override // k3.k
    public c4.f logicalType() {
        return c4.f.Collection;
    }

    @Override // k3.k
    public Boolean supportsUpdate(k3.f fVar) {
        return Boolean.TRUE;
    }

    public m(m mVar, k3.k kVar, n3.q qVar, Boolean bool) {
        super(mVar);
        this.f6574a = mVar.f6574a;
        this.f6575b = kVar;
        this.f6576c = qVar;
        this.f6577d = o3.q.b(qVar);
        this.f6578e = bool;
    }
}
