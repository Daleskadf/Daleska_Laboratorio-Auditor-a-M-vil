package com.fasterxml.jackson.databind.deser.std;
/* loaded from: classes.dex */
public abstract class y extends b0 implements n3.i {

    /* renamed from: a  reason: collision with root package name */
    public final k3.j f6649a;

    /* renamed from: b  reason: collision with root package name */
    public final n3.w f6650b;

    /* renamed from: c  reason: collision with root package name */
    public final w3.e f6651c;

    /* renamed from: d  reason: collision with root package name */
    public final k3.k f6652d;

    public y(k3.j jVar, n3.w wVar, w3.e eVar, k3.k kVar) {
        super(jVar);
        this.f6650b = wVar;
        this.f6649a = jVar;
        this.f6652d = kVar;
        this.f6651c = eVar;
    }

    public abstract Object a(Object obj);

    public abstract Object b(Object obj);

    public abstract Object c(Object obj, Object obj2);

    @Override // n3.i
    public k3.k createContextual(k3.g gVar, k3.d dVar) {
        k3.k Z;
        k3.k kVar = this.f6652d;
        if (kVar == null) {
            Z = gVar.D(this.f6649a.a(), dVar);
        } else {
            Z = gVar.Z(kVar, dVar, this.f6649a.a());
        }
        w3.e eVar = this.f6651c;
        if (eVar != null) {
            eVar = eVar.g(dVar);
        }
        if (Z == this.f6652d && eVar == this.f6651c) {
            return this;
        }
        return d(eVar, Z);
    }

    public abstract y d(w3.e eVar, k3.k kVar);

    @Override // k3.k
    public Object deserialize(c3.k kVar, k3.g gVar) {
        Object deserializeWithType;
        n3.w wVar = this.f6650b;
        if (wVar != null) {
            return deserialize(kVar, gVar, wVar.x(gVar));
        }
        w3.e eVar = this.f6651c;
        if (eVar == null) {
            deserializeWithType = this.f6652d.deserialize(kVar, gVar);
        } else {
            deserializeWithType = this.f6652d.deserializeWithType(kVar, gVar, eVar);
        }
        return b(deserializeWithType);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.b0, k3.k
    public Object deserializeWithType(c3.k kVar, k3.g gVar, w3.e eVar) {
        if (kVar.j0(c3.n.VALUE_NULL)) {
            return getNullValue(gVar);
        }
        w3.e eVar2 = this.f6651c;
        if (eVar2 == null) {
            return deserialize(kVar, gVar);
        }
        return b(eVar2.c(kVar, gVar));
    }

    @Override // k3.k
    public d4.a getEmptyAccessPattern() {
        return d4.a.DYNAMIC;
    }

    @Override // k3.k
    public d4.a getNullAccessPattern() {
        return d4.a.DYNAMIC;
    }

    @Override // k3.k, n3.q
    public abstract Object getNullValue(k3.g gVar);

    @Override // com.fasterxml.jackson.databind.deser.std.b0
    public n3.w getValueInstantiator() {
        return this.f6650b;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.b0
    public k3.j getValueType() {
        return this.f6649a;
    }

    @Override // k3.k
    public c4.f logicalType() {
        k3.k kVar = this.f6652d;
        if (kVar != null) {
            return kVar.logicalType();
        }
        return super.logicalType();
    }

    @Override // k3.k
    public Object deserialize(c3.k kVar, k3.g gVar, Object obj) {
        Object deserializeWithType;
        Object deserializeWithType2;
        if (!this.f6652d.supportsUpdate(gVar.k()).equals(Boolean.FALSE) && this.f6651c == null) {
            Object a10 = a(obj);
            if (a10 == null) {
                w3.e eVar = this.f6651c;
                if (eVar == null) {
                    deserializeWithType2 = this.f6652d.deserialize(kVar, gVar);
                } else {
                    deserializeWithType2 = this.f6652d.deserializeWithType(kVar, gVar, eVar);
                }
                return b(deserializeWithType2);
            }
            deserializeWithType = this.f6652d.deserialize(kVar, gVar, a10);
        } else {
            w3.e eVar2 = this.f6651c;
            if (eVar2 == null) {
                deserializeWithType = this.f6652d.deserialize(kVar, gVar);
            } else {
                deserializeWithType = this.f6652d.deserializeWithType(kVar, gVar, eVar2);
            }
        }
        return c(obj, deserializeWithType);
    }
}
