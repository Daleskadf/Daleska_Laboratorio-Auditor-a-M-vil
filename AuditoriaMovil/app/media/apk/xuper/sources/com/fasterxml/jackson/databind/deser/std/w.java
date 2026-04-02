package com.fasterxml.jackson.databind.deser.std;

import b3.k;
import java.lang.reflect.Array;
import java.util.Objects;
/* loaded from: classes.dex */
public class w extends i implements n3.i {

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6639e;

    /* renamed from: f  reason: collision with root package name */
    public final Class f6640f;

    /* renamed from: g  reason: collision with root package name */
    public k3.k f6641g;

    /* renamed from: h  reason: collision with root package name */
    public final w3.e f6642h;

    /* renamed from: i  reason: collision with root package name */
    public final Object[] f6643i;

    public w(k3.j jVar, k3.k kVar, w3.e eVar) {
        super(jVar, (n3.q) null, (Boolean) null);
        c4.a aVar = (c4.a) jVar;
        Class q10 = aVar.k().q();
        this.f6640f = q10;
        this.f6639e = q10 == Object.class;
        this.f6641g = kVar;
        this.f6642h = eVar;
        this.f6643i = aVar.d0();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.i
    public k3.k a() {
        return this.f6641g;
    }

    @Override // k3.k
    /* renamed from: c */
    public Object[] deserialize(c3.k kVar, k3.g gVar) {
        Object[] g10;
        Object deserializeWithType;
        int i10;
        if (!kVar.n0()) {
            return g(kVar, gVar);
        }
        d4.s q02 = gVar.q0();
        Object[] i11 = q02.i();
        w3.e eVar = this.f6642h;
        int i12 = 0;
        while (true) {
            try {
                c3.n s02 = kVar.s0();
                if (s02 == c3.n.END_ARRAY) {
                    break;
                }
                try {
                    if (s02 == c3.n.VALUE_NULL) {
                        if (!this.f6551c) {
                            deserializeWithType = this.f6550b.getNullValue(gVar);
                        }
                    } else if (eVar == null) {
                        deserializeWithType = this.f6641g.deserialize(kVar, gVar);
                    } else {
                        deserializeWithType = this.f6641g.deserializeWithType(kVar, gVar, eVar);
                    }
                    i11[i12] = deserializeWithType;
                    i12 = i10;
                } catch (Exception e10) {
                    e = e10;
                    i12 = i10;
                    throw k3.l.p(e, i11, q02.d() + i12);
                }
                if (i12 >= i11.length) {
                    i11 = q02.c(i11);
                    i12 = 0;
                }
                i10 = i12 + 1;
            } catch (Exception e11) {
                e = e11;
            }
        }
        if (this.f6639e) {
            g10 = q02.f(i11, i12);
        } else {
            g10 = q02.g(i11, i12, this.f6640f);
        }
        gVar.H0(q02);
        return g10;
    }

    @Override // n3.i
    public k3.k createContextual(k3.g gVar, k3.d dVar) {
        k3.k Z;
        k3.k kVar = this.f6641g;
        Boolean findFormatFeature = findFormatFeature(gVar, dVar, this.f6549a.q(), k.a.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        k3.k findConvertingContentDeserializer = findConvertingContentDeserializer(gVar, dVar, kVar);
        k3.j k10 = this.f6549a.k();
        if (findConvertingContentDeserializer == null) {
            Z = gVar.D(k10, dVar);
        } else {
            Z = gVar.Z(findConvertingContentDeserializer, dVar, k10);
        }
        w3.e eVar = this.f6642h;
        if (eVar != null) {
            eVar = eVar.g(dVar);
        }
        return h(eVar, Z, findContentNullProvider(gVar, dVar, Z), findFormatFeature);
    }

    @Override // k3.k
    /* renamed from: d */
    public Object[] deserialize(c3.k kVar, k3.g gVar, Object[] objArr) {
        Object[] g10;
        Object deserializeWithType;
        int i10;
        if (!kVar.n0()) {
            Object[] g11 = g(kVar, gVar);
            if (g11 == null) {
                return objArr;
            }
            int length = objArr.length;
            Object[] objArr2 = new Object[g11.length + length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            System.arraycopy(g11, 0, objArr2, length, g11.length);
            return objArr2;
        }
        d4.s q02 = gVar.q0();
        int length2 = objArr.length;
        Object[] j10 = q02.j(objArr, length2);
        w3.e eVar = this.f6642h;
        while (true) {
            try {
                c3.n s02 = kVar.s0();
                if (s02 == c3.n.END_ARRAY) {
                    break;
                }
                try {
                    if (s02 == c3.n.VALUE_NULL) {
                        if (!this.f6551c) {
                            deserializeWithType = this.f6550b.getNullValue(gVar);
                        }
                    } else if (eVar == null) {
                        deserializeWithType = this.f6641g.deserialize(kVar, gVar);
                    } else {
                        deserializeWithType = this.f6641g.deserializeWithType(kVar, gVar, eVar);
                    }
                    j10[length2] = deserializeWithType;
                    length2 = i10;
                } catch (Exception e10) {
                    e = e10;
                    length2 = i10;
                    throw k3.l.p(e, j10, q02.d() + length2);
                }
                if (length2 >= j10.length) {
                    j10 = q02.c(j10);
                    length2 = 0;
                }
                i10 = length2 + 1;
            } catch (Exception e11) {
                e = e11;
            }
        }
        if (this.f6639e) {
            g10 = q02.f(j10, length2);
        } else {
            g10 = q02.g(j10, length2, this.f6640f);
        }
        gVar.H0(q02);
        return g10;
    }

    public Byte[] e(c3.k kVar, k3.g gVar) {
        byte[] v10 = kVar.v(gVar.M());
        Byte[] bArr = new Byte[v10.length];
        int length = v10.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = Byte.valueOf(v10[i10]);
        }
        return bArr;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.b0, k3.k
    /* renamed from: f */
    public Object[] deserializeWithType(c3.k kVar, k3.g gVar, w3.e eVar) {
        return (Object[]) eVar.d(kVar, gVar);
    }

    public Object[] g(c3.k kVar, k3.g gVar) {
        boolean z10;
        Object deserializeWithType;
        Object[] objArr;
        Boolean bool = this.f6552d;
        if (bool != Boolean.TRUE && (bool != null || !gVar.n0(k3.h.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            if (kVar.j0(c3.n.VALUE_STRING)) {
                if (this.f6640f == Byte.class) {
                    return e(kVar, gVar);
                }
                return (Object[]) _deserializeFromString(kVar, gVar);
            }
            return (Object[]) gVar.c0(this.f6549a, kVar);
        }
        if (kVar.j0(c3.n.VALUE_NULL)) {
            if (this.f6551c) {
                return this.f6643i;
            }
            deserializeWithType = this.f6550b.getNullValue(gVar);
        } else {
            w3.e eVar = this.f6642h;
            if (eVar == null) {
                deserializeWithType = this.f6641g.deserialize(kVar, gVar);
            } else {
                deserializeWithType = this.f6641g.deserializeWithType(kVar, gVar, eVar);
            }
        }
        if (this.f6639e) {
            objArr = new Object[1];
        } else {
            objArr = (Object[]) Array.newInstance(this.f6640f, 1);
        }
        objArr[0] = deserializeWithType;
        return objArr;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.i, k3.k
    public d4.a getEmptyAccessPattern() {
        return d4.a.CONSTANT;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.i, k3.k
    public Object getEmptyValue(k3.g gVar) {
        return this.f6643i;
    }

    public w h(w3.e eVar, k3.k kVar, n3.q qVar, Boolean bool) {
        if (Objects.equals(bool, this.f6552d) && qVar == this.f6550b && kVar == this.f6641g && eVar == this.f6642h) {
            return this;
        }
        return new w(this, kVar, eVar, qVar, bool);
    }

    @Override // k3.k
    public boolean isCachable() {
        if (this.f6641g == null && this.f6642h == null) {
            return true;
        }
        return false;
    }

    @Override // k3.k
    public c4.f logicalType() {
        return c4.f.Array;
    }

    public w(w wVar, k3.k kVar, w3.e eVar, n3.q qVar, Boolean bool) {
        super(wVar, qVar, bool);
        this.f6640f = wVar.f6640f;
        this.f6639e = wVar.f6639e;
        this.f6643i = wVar.f6643i;
        this.f6641g = kVar;
        this.f6642h = eVar;
    }
}
