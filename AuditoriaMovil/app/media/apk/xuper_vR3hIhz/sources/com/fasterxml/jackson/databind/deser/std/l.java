package com.fasterxml.jackson.databind.deser.std;

import java.io.IOException;
import java.util.EnumMap;
/* loaded from: classes.dex */
public class l extends i implements n3.i, n3.r {

    /* renamed from: e  reason: collision with root package name */
    public final Class f6566e;

    /* renamed from: f  reason: collision with root package name */
    public k3.p f6567f;

    /* renamed from: g  reason: collision with root package name */
    public k3.k f6568g;

    /* renamed from: h  reason: collision with root package name */
    public final w3.e f6569h;

    /* renamed from: i  reason: collision with root package name */
    public final n3.w f6570i;

    /* renamed from: j  reason: collision with root package name */
    public k3.k f6571j;

    /* renamed from: k  reason: collision with root package name */
    public o3.v f6572k;

    public l(k3.j jVar, n3.w wVar, k3.p pVar, k3.k kVar, w3.e eVar, n3.q qVar) {
        super(jVar, qVar, (Boolean) null);
        this.f6566e = jVar.p().q();
        this.f6567f = pVar;
        this.f6568g = kVar;
        this.f6569h = eVar;
        this.f6570i = wVar;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.i
    public k3.k a() {
        return this.f6568g;
    }

    public EnumMap c(c3.k kVar, k3.g gVar) {
        String str;
        Object deserializeWithType;
        o3.v vVar = this.f6572k;
        o3.y e10 = vVar.e(kVar, gVar, null);
        if (kVar.o0()) {
            str = kVar.q0();
        } else if (kVar.j0(c3.n.FIELD_NAME)) {
            str = kVar.m();
        } else {
            str = null;
        }
        while (str != null) {
            c3.n s02 = kVar.s0();
            n3.t d10 = vVar.d(str);
            if (d10 != null) {
                if (e10.b(d10, d10.k(kVar, gVar))) {
                    kVar.s0();
                    try {
                        return deserialize(kVar, gVar, (EnumMap) vVar.a(gVar, e10));
                    } catch (Exception e11) {
                        return (EnumMap) b(gVar, e11, this.f6549a.q(), str);
                    }
                }
            } else {
                Enum r52 = (Enum) this.f6567f.a(str, gVar);
                if (r52 == null) {
                    if (!gVar.n0(k3.h.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                        return (EnumMap) gVar.j0(this.f6566e, str, "value not one of declared Enum instance names for %s", this.f6549a.p());
                    }
                    kVar.s0();
                    kVar.D0();
                } else {
                    try {
                        if (s02 == c3.n.VALUE_NULL) {
                            if (!this.f6551c) {
                                deserializeWithType = this.f6550b.getNullValue(gVar);
                            }
                        } else {
                            w3.e eVar = this.f6569h;
                            if (eVar == null) {
                                deserializeWithType = this.f6568g.deserialize(kVar, gVar);
                            } else {
                                deserializeWithType = this.f6568g.deserializeWithType(kVar, gVar, eVar);
                            }
                        }
                        e10.d(r52, deserializeWithType);
                    } catch (Exception e12) {
                        b(gVar, e12, this.f6549a.q(), str);
                        return null;
                    }
                }
            }
            str = kVar.q0();
        }
        try {
            return (EnumMap) vVar.a(gVar, e10);
        } catch (Exception e13) {
            b(gVar, e13, this.f6549a.q(), str);
            return null;
        }
    }

    @Override // n3.i
    public k3.k createContextual(k3.g gVar, k3.d dVar) {
        k3.k Z;
        k3.p pVar = this.f6567f;
        if (pVar == null) {
            pVar = gVar.F(this.f6549a.p(), dVar);
        }
        k3.k kVar = this.f6568g;
        k3.j k10 = this.f6549a.k();
        if (kVar == null) {
            Z = gVar.D(k10, dVar);
        } else {
            Z = gVar.Z(kVar, dVar, k10);
        }
        w3.e eVar = this.f6569h;
        if (eVar != null) {
            eVar = eVar.g(dVar);
        }
        return g(pVar, Z, eVar, findContentNullProvider(gVar, dVar, Z));
    }

    public EnumMap d(k3.g gVar) {
        n3.w wVar = this.f6570i;
        if (wVar == null) {
            return new EnumMap(this.f6566e);
        }
        try {
            if (!wVar.j()) {
                return (EnumMap) gVar.W(handledType(), getValueInstantiator(), null, "no default constructor found", new Object[0]);
            }
            return (EnumMap) this.f6570i.x(gVar);
        } catch (IOException e10) {
            return (EnumMap) d4.h.g0(gVar, e10);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.b0, k3.k
    public Object deserializeWithType(c3.k kVar, k3.g gVar, w3.e eVar) {
        return eVar.e(kVar, gVar);
    }

    @Override // k3.k
    /* renamed from: e */
    public EnumMap deserialize(c3.k kVar, k3.g gVar) {
        if (this.f6572k != null) {
            return c(kVar, gVar);
        }
        k3.k kVar2 = this.f6571j;
        if (kVar2 != null) {
            return (EnumMap) this.f6570i.y(gVar, kVar2.deserialize(kVar, gVar));
        }
        int q10 = kVar.q();
        if (q10 != 1 && q10 != 2) {
            if (q10 != 3) {
                if (q10 != 5) {
                    if (q10 != 6) {
                        return (EnumMap) gVar.c0(getValueType(gVar), kVar);
                    }
                    return (EnumMap) _deserializeFromString(kVar, gVar);
                }
            } else {
                return (EnumMap) _deserializeFromArray(kVar, gVar);
            }
        }
        return deserialize(kVar, gVar, d(gVar));
    }

    @Override // k3.k
    /* renamed from: f */
    public EnumMap deserialize(c3.k kVar, k3.g gVar, EnumMap enumMap) {
        String m10;
        Object deserializeWithType;
        kVar.A0(enumMap);
        k3.k kVar2 = this.f6568g;
        w3.e eVar = this.f6569h;
        if (kVar.o0()) {
            m10 = kVar.q0();
        } else {
            c3.n n10 = kVar.n();
            c3.n nVar = c3.n.FIELD_NAME;
            if (n10 != nVar) {
                if (n10 == c3.n.END_OBJECT) {
                    return enumMap;
                }
                gVar.G0(this, nVar, null, new Object[0]);
            }
            m10 = kVar.m();
        }
        while (m10 != null) {
            Enum r42 = (Enum) this.f6567f.a(m10, gVar);
            c3.n s02 = kVar.s0();
            if (r42 == null) {
                if (!gVar.n0(k3.h.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    return (EnumMap) gVar.j0(this.f6566e, m10, "value not one of declared Enum instance names for %s", this.f6549a.p());
                }
                kVar.D0();
            } else {
                try {
                    if (s02 == c3.n.VALUE_NULL) {
                        if (!this.f6551c) {
                            deserializeWithType = this.f6550b.getNullValue(gVar);
                        }
                    } else if (eVar == null) {
                        deserializeWithType = kVar2.deserialize(kVar, gVar);
                    } else {
                        deserializeWithType = kVar2.deserializeWithType(kVar, gVar, eVar);
                    }
                    enumMap.put((EnumMap) r42, (Enum) deserializeWithType);
                } catch (Exception e10) {
                    return (EnumMap) b(gVar, e10, enumMap, m10);
                }
            }
            m10 = kVar.q0();
        }
        return enumMap;
    }

    public l g(k3.p pVar, k3.k kVar, w3.e eVar, n3.q qVar) {
        if (pVar == this.f6567f && qVar == this.f6550b && kVar == this.f6568g && eVar == this.f6569h) {
            return this;
        }
        return new l(this, pVar, kVar, eVar, qVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.i, k3.k
    public Object getEmptyValue(k3.g gVar) {
        return d(gVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.b0
    public n3.w getValueInstantiator() {
        return this.f6570i;
    }

    @Override // k3.k
    public boolean isCachable() {
        if (this.f6568g == null && this.f6567f == null && this.f6569h == null) {
            return true;
        }
        return false;
    }

    @Override // k3.k
    public c4.f logicalType() {
        return c4.f.Map;
    }

    @Override // n3.r
    public void resolve(k3.g gVar) {
        n3.w wVar = this.f6570i;
        if (wVar != null) {
            if (wVar.k()) {
                k3.j D = this.f6570i.D(gVar.k());
                if (D == null) {
                    k3.j jVar = this.f6549a;
                    gVar.q(jVar, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", jVar, this.f6570i.getClass().getName()));
                }
                this.f6571j = findDeserializer(gVar, D, null);
            } else if (this.f6570i.i()) {
                k3.j A = this.f6570i.A(gVar.k());
                if (A == null) {
                    k3.j jVar2 = this.f6549a;
                    gVar.q(jVar2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", jVar2, this.f6570i.getClass().getName()));
                }
                this.f6571j = findDeserializer(gVar, A, null);
            } else if (this.f6570i.g()) {
                this.f6572k = o3.v.c(gVar, this.f6570i, this.f6570i.E(gVar.k()), gVar.o0(k3.q.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
            }
        }
    }

    public l(l lVar, k3.p pVar, k3.k kVar, w3.e eVar, n3.q qVar) {
        super(lVar, qVar, lVar.f6552d);
        this.f6566e = lVar.f6566e;
        this.f6567f = pVar;
        this.f6568g = kVar;
        this.f6569h = eVar;
        this.f6570i = lVar.f6570i;
        this.f6571j = lVar.f6571j;
        this.f6572k = lVar.f6572k;
    }
}
