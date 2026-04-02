package com.google.protobuf;

import java.util.Map;
/* renamed from: com.google.protobuf.m0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0853m0 {
    public static C0847j0 a(Object obj) {
        return ((C0849k0) obj).f10080a;
    }

    public static C0851l0 b(Object obj) {
        return (C0851l0) obj;
    }

    public static int c(int i7, Object obj, Object obj2) {
        C0851l0 c0851l0 = (C0851l0) obj;
        C0849k0 c0849k0 = (C0849k0) obj2;
        int i8 = 0;
        if (!c0851l0.isEmpty()) {
            for (Map.Entry entry : c0851l0.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                c0849k0.getClass();
                int p02 = AbstractC0865t.p0(i7);
                int a7 = C0849k0.a(c0849k0.f10080a, key, value);
                i8 += AbstractC0865t.r0(a7) + a7 + p02;
            }
        }
        return i8;
    }

    public static boolean d(Object obj) {
        return !((C0851l0) obj).f10084a;
    }

    public static C0851l0 e(Object obj, Object obj2) {
        C0851l0 c0851l0 = (C0851l0) obj;
        C0851l0 c0851l02 = (C0851l0) obj2;
        if (!c0851l02.isEmpty()) {
            if (!c0851l0.f10084a) {
                c0851l0 = c0851l0.c();
            }
            c0851l0.b();
            if (!c0851l02.isEmpty()) {
                c0851l0.putAll(c0851l02);
            }
        }
        return c0851l0;
    }

    public static C0851l0 f() {
        return C0851l0.f10083b.c();
    }

    public static void g(Object obj) {
        ((C0851l0) obj).f10084a = false;
    }
}
