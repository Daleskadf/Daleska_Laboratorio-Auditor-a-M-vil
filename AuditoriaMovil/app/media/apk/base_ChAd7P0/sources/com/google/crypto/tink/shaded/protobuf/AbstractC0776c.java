package com.google.crypto.tink.shaded.protobuf;
/* renamed from: com.google.crypto.tink.shaded.protobuf.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0776c {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f9633a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f9634b;

    static {
        Class<?> cls;
        boolean z7;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f9633a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        f9634b = z7;
    }

    public static boolean a() {
        if (f9633a != null && !f9634b) {
            return true;
        }
        return false;
    }
}
