package com.fasterxml.jackson.databind.ser.std;

import b3.k;
import c3.k;
import java.lang.reflect.Type;
/* loaded from: classes.dex */
public final class e extends h0 implements a4.i {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6685a;

    /* loaded from: classes.dex */
    public static final class a extends h0 implements a4.i {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f6686a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(boolean r3) {
            /*
                r2 = this;
                if (r3 == 0) goto L5
                java.lang.Class r0 = java.lang.Boolean.TYPE
                goto L7
            L5:
                java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            L7:
                r1 = 0
                r2.<init>(r0, r1)
                r2.f6686a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.e.a.<init>(boolean):void");
        }

        @Override // com.fasterxml.jackson.databind.ser.std.h0, com.fasterxml.jackson.databind.ser.std.i0, k3.o
        public void acceptJsonFormatVisitor(u3.f fVar, k3.j jVar) {
            visitIntFormat(fVar, jVar, k.b.INT);
        }

        @Override // a4.i
        public k3.o b(k3.c0 c0Var, k3.d dVar) {
            k.d findFormatOverrides = findFormatOverrides(c0Var, dVar, Boolean.class);
            if (findFormatOverrides != null && !findFormatOverrides.i().a()) {
                return new e(this.f6686a);
            }
            return this;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.i0, k3.o
        public void serialize(Object obj, c3.h hVar, k3.c0 c0Var) {
            hVar.d0(!Boolean.FALSE.equals(obj));
        }

        @Override // com.fasterxml.jackson.databind.ser.std.h0, k3.o
        public final void serializeWithType(Object obj, c3.h hVar, k3.c0 c0Var, w3.h hVar2) {
            hVar.U(Boolean.TRUE.equals(obj));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L5
            java.lang.Class r0 = java.lang.Boolean.TYPE
            goto L7
        L5:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
        L7:
            r1 = 0
            r2.<init>(r0, r1)
            r2.f6685a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.e.<init>(boolean):void");
    }

    @Override // com.fasterxml.jackson.databind.ser.std.h0, com.fasterxml.jackson.databind.ser.std.i0, k3.o
    public void acceptJsonFormatVisitor(u3.f fVar, k3.j jVar) {
        fVar.d(jVar);
    }

    @Override // a4.i
    public k3.o b(k3.c0 c0Var, k3.d dVar) {
        k.d findFormatOverrides = findFormatOverrides(c0Var, dVar, Boolean.class);
        if (findFormatOverrides != null && findFormatOverrides.i().a()) {
            return new a(this.f6685a);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.h0, com.fasterxml.jackson.databind.ser.std.i0, v3.c
    public k3.m getSchema(k3.c0 c0Var, Type type) {
        return createSchemaNode("boolean", !this.f6685a);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.i0, k3.o
    public void serialize(Object obj, c3.h hVar, k3.c0 c0Var) {
        hVar.U(Boolean.TRUE.equals(obj));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.h0, k3.o
    public final void serializeWithType(Object obj, c3.h hVar, k3.c0 c0Var, w3.h hVar2) {
        hVar.U(Boolean.TRUE.equals(obj));
    }
}
