package androidx.datastore.preferences.protobuf;

import java.util.Collections;
/* renamed from: androidx.datastore.preferences.protobuf.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0536m {

    /* renamed from: a  reason: collision with root package name */
    public static volatile C0536m f7848a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0536m f7849b;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.m, java.lang.Object] */
    static {
        ?? obj = new Object();
        Collections.emptyMap();
        f7849b = obj;
    }

    public static C0536m a() {
        X x7 = X.f7783c;
        C0536m c0536m = f7848a;
        if (c0536m == null) {
            synchronized (C0536m.class) {
                try {
                    c0536m = f7848a;
                    if (c0536m == null) {
                        Class cls = AbstractC0535l.f7847a;
                        C0536m c0536m2 = null;
                        if (cls != null) {
                            try {
                                c0536m2 = (C0536m) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0536m2 == null) {
                            c0536m2 = f7849b;
                        }
                        f7848a = c0536m2;
                        c0536m = c0536m2;
                    }
                } finally {
                }
            }
        }
        return c0536m;
    }
}
