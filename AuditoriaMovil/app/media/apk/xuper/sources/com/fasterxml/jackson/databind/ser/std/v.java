package com.fasterxml.jackson.databind.ser.std;

import b3.k;
import c3.h;
import c3.k;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
/* loaded from: classes.dex */
public class v extends h0 implements a4.i {

    /* renamed from: b  reason: collision with root package name */
    public static final v f6731b = new v(Number.class);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6732a;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6733a;

        static {
            int[] iArr = new int[k.c.values().length];
            f6733a = iArr;
            try {
                iArr[k.c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends m0 {

        /* renamed from: a  reason: collision with root package name */
        public static final b f6734a = new b();

        public b() {
            super(BigDecimal.class);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.m0
        public String c(Object obj) {
            throw new IllegalStateException();
        }

        public boolean d(c3.h hVar, BigDecimal bigDecimal) {
            int scale = bigDecimal.scale();
            if (scale >= -9999 && scale <= 9999) {
                return true;
            }
            return false;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.m0, k3.o
        public boolean isEmpty(k3.c0 c0Var, Object obj) {
            return false;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.m0, com.fasterxml.jackson.databind.ser.std.i0, k3.o
        public void serialize(Object obj, c3.h hVar, k3.c0 c0Var) {
            String obj2;
            if (hVar.v(h.b.WRITE_BIGDECIMAL_AS_PLAIN)) {
                BigDecimal bigDecimal = (BigDecimal) obj;
                if (!d(hVar, bigDecimal)) {
                    c0Var.r0(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(bigDecimal.scale()), 9999, 9999), new Object[0]);
                }
                obj2 = bigDecimal.toPlainString();
            } else {
                obj2 = obj.toString();
            }
            hVar.z0(obj2);
        }
    }

    public v(Class cls) {
        super(cls, false);
        this.f6732a = cls == BigInteger.class;
    }

    public static k3.o c() {
        return b.f6734a;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.h0, com.fasterxml.jackson.databind.ser.std.i0, k3.o
    public void acceptJsonFormatVisitor(u3.f fVar, k3.j jVar) {
        if (this.f6732a) {
            visitIntFormat(fVar, jVar, k.b.BIG_INTEGER);
        } else if (handledType() == BigDecimal.class) {
            visitFloatFormat(fVar, jVar, k.b.BIG_DECIMAL);
        } else {
            fVar.h(jVar);
        }
    }

    @Override // a4.i
    public k3.o b(k3.c0 c0Var, k3.d dVar) {
        k.d findFormatOverrides = findFormatOverrides(c0Var, dVar, handledType());
        if (findFormatOverrides != null && a.f6733a[findFormatOverrides.i().ordinal()] == 1) {
            if (handledType() == BigDecimal.class) {
                return c();
            }
            return l0.f6697a;
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.i0, k3.o
    /* renamed from: d */
    public void serialize(Number number, c3.h hVar, k3.c0 c0Var) {
        if (number instanceof BigDecimal) {
            hVar.g0((BigDecimal) number);
        } else if (number instanceof BigInteger) {
            hVar.h0((BigInteger) number);
        } else if (number instanceof Long) {
            hVar.e0(number.longValue());
        } else if (number instanceof Double) {
            hVar.b0(number.doubleValue());
        } else if (number instanceof Float) {
            hVar.c0(number.floatValue());
        } else if (!(number instanceof Integer) && !(number instanceof Byte) && !(number instanceof Short)) {
            hVar.f0(number.toString());
        } else {
            hVar.d0(number.intValue());
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.h0, com.fasterxml.jackson.databind.ser.std.i0, v3.c
    public k3.m getSchema(k3.c0 c0Var, Type type) {
        String str;
        if (this.f6732a) {
            str = "integer";
        } else {
            str = "number";
        }
        return createSchemaNode(str, true);
    }
}
