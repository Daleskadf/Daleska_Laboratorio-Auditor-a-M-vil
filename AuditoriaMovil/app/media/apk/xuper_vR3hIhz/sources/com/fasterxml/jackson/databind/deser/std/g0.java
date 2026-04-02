package com.fasterxml.jackson.databind.deser.std;

import b3.k;
import java.util.Objects;
/* loaded from: classes.dex */
public final class g0 extends b0 implements n3.i {

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f6531e = new String[0];

    /* renamed from: f  reason: collision with root package name */
    public static final g0 f6532f = new g0();

    /* renamed from: a  reason: collision with root package name */
    public k3.k f6533a;

    /* renamed from: b  reason: collision with root package name */
    public final n3.q f6534b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f6535c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f6536d;

    public g0() {
        this(null, null, null);
    }

    public final String[] a(c3.k kVar, k3.g gVar, String[] strArr) {
        int length;
        Object[] j10;
        String str;
        int i10;
        d4.s q02 = gVar.q0();
        if (strArr == null) {
            j10 = q02.i();
            length = 0;
        } else {
            length = strArr.length;
            j10 = q02.j(strArr, length);
        }
        k3.k kVar2 = this.f6533a;
        while (true) {
            try {
            } catch (Exception e10) {
                e = e10;
            }
            try {
                if (kVar.r0() == null) {
                    c3.n n10 = kVar.n();
                    if (n10 == c3.n.END_ARRAY) {
                        String[] strArr2 = (String[]) q02.g(j10, length, String.class);
                        gVar.H0(q02);
                        return strArr2;
                    } else if (n10 == c3.n.VALUE_NULL) {
                        if (!this.f6536d) {
                            str = (String) this.f6534b.getNullValue(gVar);
                        }
                    } else {
                        str = (String) kVar2.deserialize(kVar, gVar);
                    }
                } else {
                    str = (String) kVar2.deserialize(kVar, gVar);
                }
                j10[length] = str;
                length = i10;
            } catch (Exception e11) {
                e = e11;
                length = i10;
                throw k3.l.p(e, String.class, length);
            }
            if (length >= j10.length) {
                j10 = q02.c(j10);
                length = 0;
            }
            i10 = length + 1;
        }
    }

    @Override // k3.k
    /* renamed from: b */
    public String[] deserialize(c3.k kVar, k3.g gVar) {
        String r02;
        int i10;
        if (!kVar.n0()) {
            return d(kVar, gVar);
        }
        if (this.f6533a != null) {
            return a(kVar, gVar, null);
        }
        d4.s q02 = gVar.q0();
        Object[] i11 = q02.i();
        int i12 = 0;
        while (true) {
            try {
                r02 = kVar.r0();
            } catch (Exception e10) {
                e = e10;
            }
            try {
                if (r02 == null) {
                    c3.n n10 = kVar.n();
                    if (n10 == c3.n.END_ARRAY) {
                        String[] strArr = (String[]) q02.g(i11, i12, String.class);
                        gVar.H0(q02);
                        return strArr;
                    } else if (n10 == c3.n.VALUE_NULL) {
                        if (!this.f6536d) {
                            r02 = (String) this.f6534b.getNullValue(gVar);
                        }
                    } else {
                        r02 = _parseString(kVar, gVar);
                    }
                }
                i11[i12] = r02;
                i12 = i10;
            } catch (Exception e11) {
                e = e11;
                i12 = i10;
                throw k3.l.p(e, i11, q02.d() + i12);
            }
            if (i12 >= i11.length) {
                i11 = q02.c(i11);
                i12 = 0;
            }
            i10 = i12 + 1;
        }
    }

    @Override // k3.k
    /* renamed from: c */
    public String[] deserialize(c3.k kVar, k3.g gVar, String[] strArr) {
        String r02;
        int i10;
        if (!kVar.n0()) {
            String[] d10 = d(kVar, gVar);
            if (d10 == null) {
                return strArr;
            }
            int length = strArr.length;
            String[] strArr2 = new String[d10.length + length];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            System.arraycopy(d10, 0, strArr2, length, d10.length);
            return strArr2;
        } else if (this.f6533a != null) {
            return a(kVar, gVar, strArr);
        } else {
            d4.s q02 = gVar.q0();
            int length2 = strArr.length;
            Object[] j10 = q02.j(strArr, length2);
            while (true) {
                try {
                    r02 = kVar.r0();
                    if (r02 == null) {
                        c3.n n10 = kVar.n();
                        if (n10 == c3.n.END_ARRAY) {
                            String[] strArr3 = (String[]) q02.g(j10, length2, String.class);
                            gVar.H0(q02);
                            return strArr3;
                        } else if (n10 == c3.n.VALUE_NULL) {
                            if (this.f6536d) {
                                return f6531e;
                            }
                            r02 = (String) this.f6534b.getNullValue(gVar);
                        } else {
                            r02 = _parseString(kVar, gVar);
                        }
                    }
                    if (length2 >= j10.length) {
                        j10 = q02.c(j10);
                        length2 = 0;
                    }
                    i10 = length2 + 1;
                } catch (Exception e10) {
                    e = e10;
                }
                try {
                    j10[length2] = r02;
                    length2 = i10;
                } catch (Exception e11) {
                    e = e11;
                    length2 = i10;
                    throw k3.l.p(e, j10, q02.d() + length2);
                }
            }
        }
    }

    @Override // n3.i
    public k3.k createContextual(k3.g gVar, k3.d dVar) {
        k3.k Z;
        k3.k findConvertingContentDeserializer = findConvertingContentDeserializer(gVar, dVar, this.f6533a);
        k3.j x10 = gVar.x(String.class);
        if (findConvertingContentDeserializer == null) {
            Z = gVar.D(x10, dVar);
        } else {
            Z = gVar.Z(findConvertingContentDeserializer, dVar, x10);
        }
        Boolean findFormatFeature = findFormatFeature(gVar, dVar, String[].class, k.a.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        n3.q findContentNullProvider = findContentNullProvider(gVar, dVar, Z);
        if (Z != null && isDefaultDeserializer(Z)) {
            Z = null;
        }
        if (this.f6533a == Z && Objects.equals(this.f6535c, findFormatFeature) && this.f6534b == findContentNullProvider) {
            return this;
        }
        return new g0(Z, findContentNullProvider, findFormatFeature);
    }

    public final String[] d(c3.k kVar, k3.g gVar) {
        boolean z10;
        String _parseString;
        Boolean bool = this.f6535c;
        if (bool != Boolean.TRUE && (bool != null || !gVar.n0(k3.h.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (kVar.j0(c3.n.VALUE_NULL)) {
                _parseString = (String) this.f6534b.getNullValue(gVar);
            } else {
                _parseString = _parseString(kVar, gVar);
            }
            return new String[]{_parseString};
        } else if (kVar.j0(c3.n.VALUE_STRING)) {
            return (String[]) _deserializeFromString(kVar, gVar);
        } else {
            return (String[]) gVar.a0(this._valueClass, kVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.b0, k3.k
    public Object deserializeWithType(c3.k kVar, k3.g gVar, w3.e eVar) {
        return eVar.d(kVar, gVar);
    }

    @Override // k3.k
    public d4.a getEmptyAccessPattern() {
        return d4.a.CONSTANT;
    }

    @Override // k3.k
    public Object getEmptyValue(k3.g gVar) {
        return f6531e;
    }

    @Override // k3.k
    public c4.f logicalType() {
        return c4.f.Array;
    }

    @Override // k3.k
    public Boolean supportsUpdate(k3.f fVar) {
        return Boolean.TRUE;
    }

    public g0(k3.k kVar, n3.q qVar, Boolean bool) {
        super(String[].class);
        this.f6533a = kVar;
        this.f6534b = qVar;
        this.f6535c = bool;
        this.f6536d = o3.q.b(qVar);
    }
}
