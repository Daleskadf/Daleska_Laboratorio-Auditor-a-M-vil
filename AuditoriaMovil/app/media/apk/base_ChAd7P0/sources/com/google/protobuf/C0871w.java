package com.google.protobuf;

import java.util.Collections;
/* renamed from: com.google.protobuf.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0871w {

    /* renamed from: a  reason: collision with root package name */
    public static volatile C0871w f10142a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0871w f10143b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.protobuf.w] */
    static {
        ?? obj = new Object();
        Collections.emptyMap();
        f10143b = obj;
    }

    public static C0871w a() {
        C0871w c0871w = f10142a;
        if (c0871w == null) {
            synchronized (C0871w.class) {
                try {
                    c0871w = f10142a;
                    if (c0871w == null) {
                        Class cls = AbstractC0869v.f10141a;
                        C0871w c0871w2 = null;
                        if (cls != null) {
                            try {
                                c0871w2 = (C0871w) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0871w2 == null) {
                            c0871w2 = f10143b;
                        }
                        f10142a = c0871w2;
                        c0871w = c0871w2;
                    }
                } finally {
                }
            }
        }
        return c0871w;
    }
}
