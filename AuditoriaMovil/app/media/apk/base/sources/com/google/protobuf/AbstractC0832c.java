package com.google.protobuf;
/* renamed from: com.google.protobuf.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0832c {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f10058a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f10059b;

    static {
        Class<?> cls;
        boolean z7;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f10058a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        f10059b = z7;
    }

    public static boolean a() {
        if (f10058a != null && !f10059b) {
            return true;
        }
        return false;
    }
}
