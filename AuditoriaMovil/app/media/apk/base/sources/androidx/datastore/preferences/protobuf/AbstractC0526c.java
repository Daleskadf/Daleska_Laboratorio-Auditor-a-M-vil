package androidx.datastore.preferences.protobuf;
/* renamed from: androidx.datastore.preferences.protobuf.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0526c {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f7794a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f7795b;

    static {
        Class<?> cls;
        boolean z7;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f7794a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        f7795b = z7;
    }

    public static boolean a() {
        if (f7794a != null && !f7795b) {
            return true;
        }
        return false;
    }
}
