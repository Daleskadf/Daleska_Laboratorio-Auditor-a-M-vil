package com.fasterxml.jackson.databind.ser.std;

import b3.k;
import c3.k;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class l extends h0 implements a4.i {

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f6694a;

    /* renamed from: b  reason: collision with root package name */
    public final DateFormat f6695b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicReference f6696c;

    public l(Class cls, Boolean bool, DateFormat dateFormat) {
        super(cls);
        AtomicReference atomicReference;
        this.f6694a = bool;
        this.f6695b = dateFormat;
        if (dateFormat == null) {
            atomicReference = null;
        } else {
            atomicReference = new AtomicReference();
        }
        this.f6696c = atomicReference;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.h0, com.fasterxml.jackson.databind.ser.std.i0, k3.o
    public void acceptJsonFormatVisitor(u3.f fVar, k3.j jVar) {
        c(fVar, jVar, d(fVar.getProvider()));
    }

    @Override // a4.i
    public k3.o b(k3.c0 c0Var, k3.d dVar) {
        boolean z10;
        DateFormat dateFormat;
        Locale e02;
        TimeZone f02;
        k.d findFormatOverrides = findFormatOverrides(c0Var, dVar, handledType());
        if (findFormatOverrides == null) {
            return this;
        }
        k.c i10 = findFormatOverrides.i();
        if (i10.a()) {
            return f(Boolean.TRUE, null);
        }
        if (findFormatOverrides.m()) {
            if (findFormatOverrides.l()) {
                e02 = findFormatOverrides.g();
            } else {
                e02 = c0Var.e0();
            }
            DateFormat simpleDateFormat = new SimpleDateFormat(findFormatOverrides.h(), e02);
            if (findFormatOverrides.o()) {
                f02 = findFormatOverrides.j();
            } else {
                f02 = c0Var.f0();
            }
            simpleDateFormat.setTimeZone(f02);
            return f(Boolean.FALSE, simpleDateFormat);
        }
        boolean l10 = findFormatOverrides.l();
        boolean o10 = findFormatOverrides.o();
        boolean z11 = true;
        if (i10 == k.c.STRING) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!l10 && !o10 && !z10) {
            return this;
        }
        DateFormat k10 = c0Var.k().k();
        if (k10 instanceof d4.x) {
            d4.x xVar = (d4.x) k10;
            if (findFormatOverrides.l()) {
                xVar = xVar.u(findFormatOverrides.g());
            }
            if (findFormatOverrides.o()) {
                xVar = xVar.v(findFormatOverrides.j());
            }
            return f(Boolean.FALSE, xVar);
        }
        if (!(k10 instanceof SimpleDateFormat)) {
            c0Var.p(handledType(), String.format("Configured `DateFormat` (%s) not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`", k10.getClass().getName()));
        }
        SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) k10;
        if (l10) {
            dateFormat = new SimpleDateFormat(simpleDateFormat2.toPattern(), findFormatOverrides.g());
        } else {
            dateFormat = (SimpleDateFormat) simpleDateFormat2.clone();
        }
        TimeZone j10 = findFormatOverrides.j();
        if ((j10 == null || j10.equals(dateFormat.getTimeZone())) ? false : false) {
            dateFormat.setTimeZone(j10);
        }
        return f(Boolean.FALSE, dateFormat);
    }

    public void c(u3.f fVar, k3.j jVar, boolean z10) {
        if (z10) {
            visitIntFormat(fVar, jVar, k.b.LONG, u3.m.UTC_MILLISEC);
        } else {
            visitStringFormat(fVar, jVar, u3.m.DATE_TIME);
        }
    }

    public boolean d(k3.c0 c0Var) {
        Boolean bool = this.f6694a;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.f6695b == null) {
            if (c0Var != null) {
                return c0Var.m0(k3.b0.WRITE_DATES_AS_TIMESTAMPS);
            }
            throw new IllegalArgumentException("Null SerializerProvider passed for " + handledType().getName());
        }
        return false;
    }

    public void e(Date date, c3.h hVar, k3.c0 c0Var) {
        if (this.f6695b == null) {
            c0Var.D(date, hVar);
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f6696c.getAndSet(null);
        if (dateFormat == null) {
            dateFormat = (DateFormat) this.f6695b.clone();
        }
        hVar.z0(dateFormat.format(date));
        h3.b.a(this.f6696c, null, dateFormat);
    }

    public abstract l f(Boolean bool, DateFormat dateFormat);

    @Override // com.fasterxml.jackson.databind.ser.std.h0, com.fasterxml.jackson.databind.ser.std.i0, v3.c
    public k3.m getSchema(k3.c0 c0Var, Type type) {
        String str;
        if (d(c0Var)) {
            str = "number";
        } else {
            str = "string";
        }
        return createSchemaNode(str, true);
    }

    @Override // k3.o
    public boolean isEmpty(k3.c0 c0Var, Object obj) {
        return false;
    }
}
