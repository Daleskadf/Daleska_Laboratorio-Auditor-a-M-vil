package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
/* renamed from: com.google.crypto.tink.shaded.protobuf.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0787n {

    /* renamed from: a  reason: collision with root package name */
    public static volatile C0787n f9680a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0787n f9681b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.n, java.lang.Object] */
    static {
        ?? obj = new Object();
        Collections.emptyMap();
        f9681b = obj;
    }

    public static C0787n a() {
        C0787n c0787n = f9680a;
        if (c0787n == null) {
            synchronized (C0787n.class) {
                try {
                    c0787n = f9680a;
                    if (c0787n == null) {
                        Class cls = AbstractC0786m.f9678a;
                        C0787n c0787n2 = null;
                        if (cls != null) {
                            try {
                                c0787n2 = (C0787n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0787n2 == null) {
                            c0787n2 = f9681b;
                        }
                        f9680a = c0787n2;
                        c0787n = c0787n2;
                    }
                } finally {
                }
            }
        }
        return c0787n;
    }
}
