package com.fasterxml.jackson.databind.deser.std;

import b3.k;
import java.util.Objects;
/* loaded from: classes.dex */
public class k extends e0 implements n3.i {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f6560a;

    /* renamed from: b  reason: collision with root package name */
    public final Enum f6561b;

    /* renamed from: c  reason: collision with root package name */
    public final d4.i f6562c;

    /* renamed from: d  reason: collision with root package name */
    public d4.i f6563d;

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f6564e;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6565a;

        static {
            int[] iArr = new int[m3.b.values().length];
            f6565a = iArr;
            try {
                iArr[m3.b.AsNull.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6565a[m3.b.AsEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6565a[m3.b.TryConvert.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public k(d4.k kVar, Boolean bool) {
        super(kVar.n());
        this.f6562c = kVar.i();
        this.f6560a = kVar.p();
        this.f6561b = kVar.m();
        this.f6564e = bool;
    }

    public static k3.k g(k3.f fVar, Class cls, r3.j jVar, n3.w wVar, n3.t[] tVarArr) {
        if (fVar.b()) {
            d4.h.g(jVar.m(), fVar.D(k3.q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new n(cls, jVar, jVar.w(0), wVar, tVarArr);
    }

    public static k3.k h(k3.f fVar, Class cls, r3.j jVar) {
        if (fVar.b()) {
            d4.h.g(jVar.m(), fVar.D(k3.q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new n(cls, jVar);
    }

    public final Object a(c3.k kVar, k3.g gVar, d4.i iVar, String str) {
        char charAt;
        m3.b _checkCoercionFail;
        String trim = str.trim();
        if (trim.isEmpty()) {
            if (this.f6561b != null && gVar.n0(k3.h.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return this.f6561b;
            }
            if (gVar.n0(k3.h.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            if (str.isEmpty()) {
                _checkCoercionFail = _checkCoercionFail(gVar, _findCoercionFromEmptyString(gVar), handledType(), str, "empty String (\"\")");
            } else {
                _checkCoercionFail = _checkCoercionFail(gVar, _findCoercionFromBlankString(gVar), handledType(), str, "blank String (all whitespace)");
            }
            int i10 = a.f6565a[_checkCoercionFail.ordinal()];
            if (i10 != 2 && i10 != 3) {
                return null;
            }
            return getEmptyValue(gVar);
        }
        if (Boolean.TRUE.equals(this.f6564e)) {
            Object d10 = iVar.d(trim);
            if (d10 != null) {
                return d10;
            }
        } else if (!gVar.n0(k3.h.FAIL_ON_NUMBERS_FOR_ENUMS) && (charAt = trim.charAt(0)) >= '0' && charAt <= '9') {
            try {
                int parseInt = Integer.parseInt(trim);
                if (!gVar.o0(k3.q.ALLOW_COERCION_OF_SCALARS)) {
                    return gVar.j0(c(), trim, "value looks like quoted Enum index, but `MapperFeature.ALLOW_COERCION_OF_SCALARS` prevents use", new Object[0]);
                }
                if (parseInt >= 0) {
                    Object[] objArr = this.f6560a;
                    if (parseInt < objArr.length) {
                        return objArr[parseInt];
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (this.f6561b != null && gVar.n0(k3.h.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
            return this.f6561b;
        }
        if (gVar.n0(k3.h.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
            return null;
        }
        return gVar.j0(c(), trim, "not one of the values accepted for Enum class: %s", iVar.f());
    }

    public Object b(c3.k kVar, k3.g gVar) {
        if (kVar.j0(c3.n.START_ARRAY)) {
            return _deserializeFromArray(kVar, gVar);
        }
        return gVar.a0(c(), kVar);
    }

    public Class c() {
        return handledType();
    }

    @Override // n3.i
    public k3.k createContextual(k3.g gVar, k3.d dVar) {
        Boolean findFormatFeature = findFormatFeature(gVar, dVar, handledType(), k.a.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        if (findFormatFeature == null) {
            findFormatFeature = this.f6564e;
        }
        return i(findFormatFeature);
    }

    public Object d(c3.k kVar, k3.g gVar, int i10) {
        m3.b B = gVar.B(logicalType(), handledType(), m3.e.Integer);
        if (B == m3.b.Fail) {
            if (gVar.n0(k3.h.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                return gVar.i0(c(), Integer.valueOf(i10), "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow", new Object[0]);
            }
            Class<?> handledType = handledType();
            Integer valueOf = Integer.valueOf(i10);
            _checkCoercionFail(gVar, B, handledType, valueOf, "Integer value (" + i10 + ")");
        }
        int i11 = a.f6565a[B.ordinal()];
        if (i11 == 1) {
            return null;
        }
        if (i11 != 2) {
            if (i10 >= 0) {
                Object[] objArr = this.f6560a;
                if (i10 < objArr.length) {
                    return objArr[i10];
                }
            }
            if (this.f6561b != null && gVar.n0(k3.h.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return this.f6561b;
            }
            if (gVar.n0(k3.h.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            return gVar.i0(c(), Integer.valueOf(i10), "index value outside legal index range [0..%s]", Integer.valueOf(this.f6560a.length - 1));
        }
        return getEmptyValue(gVar);
    }

    @Override // k3.k
    public Object deserialize(c3.k kVar, k3.g gVar) {
        if (kVar.j0(c3.n.VALUE_STRING)) {
            return e(kVar, gVar, kVar.Y());
        }
        if (kVar.j0(c3.n.VALUE_NUMBER_INT)) {
            return d(kVar, gVar, kVar.P());
        }
        if (kVar.o0()) {
            return e(kVar, gVar, gVar.z(kVar, this, this._valueClass));
        }
        return b(kVar, gVar);
    }

    public Object e(c3.k kVar, k3.g gVar, String str) {
        d4.i iVar;
        Object c10;
        if (gVar.n0(k3.h.READ_ENUMS_USING_TO_STRING)) {
            iVar = f(gVar);
        } else {
            iVar = this.f6562c;
        }
        Object c11 = iVar.c(str);
        if (c11 == null) {
            String trim = str.trim();
            if (trim != str && (c10 = iVar.c(trim)) != null) {
                return c10;
            }
            return a(kVar, gVar, iVar, trim);
        }
        return c11;
    }

    public d4.i f(k3.g gVar) {
        d4.i iVar = this.f6563d;
        if (iVar == null) {
            synchronized (this) {
                iVar = d4.k.k(gVar.k(), c()).i();
            }
            this.f6563d = iVar;
        }
        return iVar;
    }

    @Override // k3.k
    public Object getEmptyValue(k3.g gVar) {
        return this.f6561b;
    }

    public k i(Boolean bool) {
        if (Objects.equals(this.f6564e, bool)) {
            return this;
        }
        return new k(this, bool);
    }

    @Override // k3.k
    public boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.e0, k3.k
    public c4.f logicalType() {
        return c4.f.Enum;
    }

    public k(k kVar, Boolean bool) {
        super(kVar);
        this.f6562c = kVar.f6562c;
        this.f6560a = kVar.f6560a;
        this.f6561b = kVar.f6561b;
        this.f6564e = bool;
    }
}
