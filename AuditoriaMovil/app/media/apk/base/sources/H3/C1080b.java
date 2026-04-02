package h3;

import android.content.Context;
import e0.C0927b;
/* renamed from: h3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1080b {

    /* renamed from: b  reason: collision with root package name */
    public static final C1080b f11335b;

    /* renamed from: a  reason: collision with root package name */
    public C0927b f11336a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, h3.b] */
    static {
        ?? obj = new Object();
        obj.f11336a = null;
        f11335b = obj;
    }

    public static C0927b a(Context context) {
        C0927b c0927b;
        C1080b c1080b = f11335b;
        synchronized (c1080b) {
            try {
                if (c1080b.f11336a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    c1080b.f11336a = new C0927b(context);
                }
                c0927b = c1080b.f11336a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0927b;
    }
}
