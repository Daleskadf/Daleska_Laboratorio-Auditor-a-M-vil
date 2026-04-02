package h0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* renamed from: h0.I  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1029I extends C1035O {

    /* renamed from: g  reason: collision with root package name */
    public static boolean f11159g = false;

    /* renamed from: h  reason: collision with root package name */
    public static Method f11160h;

    /* renamed from: i  reason: collision with root package name */
    public static Class f11161i;
    public static Field j;

    /* renamed from: k  reason: collision with root package name */
    public static Field f11162k;

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets f11163c;

    /* renamed from: d  reason: collision with root package name */
    public Z.c f11164d;

    /* renamed from: e  reason: collision with root package name */
    public Z.c f11165e;
    public int f;

    public AbstractC1029I(C1036P c1036p, WindowInsets windowInsets) {
        super(c1036p);
        this.f11164d = null;
        this.f11163c = windowInsets;
    }

    private Z.c o(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f11159g) {
                p();
            }
            Method method = f11160h;
            if (method != null && f11161i != null && j != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) j.get(f11162k.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return Z.c.a(rect.left, rect.top, rect.right, rect.bottom);
                } catch (ReflectiveOperationException e7) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    private static void p() {
        try {
            f11160h = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f11161i = cls;
            j = cls.getDeclaredField("mVisibleInsets");
            f11162k = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            j.setAccessible(true);
            f11162k.setAccessible(true);
        } catch (ReflectiveOperationException e7) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
        }
        f11159g = true;
    }

    public static boolean r(int i7, int i8) {
        if ((i7 & 6) == (i8 & 6)) {
            return true;
        }
        return false;
    }

    @Override // h0.C1035O
    public void d(View view) {
        Z.c o7 = o(view);
        if (o7 == null) {
            o7 = Z.c.f6708e;
        }
        q(o7);
    }

    @Override // h0.C1035O
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        AbstractC1029I abstractC1029I = (AbstractC1029I) obj;
        if (!Objects.equals(this.f11165e, abstractC1029I.f11165e) || !r(this.f, abstractC1029I.f)) {
            return false;
        }
        return true;
    }

    @Override // h0.C1035O
    public final Z.c g() {
        if (this.f11164d == null) {
            WindowInsets windowInsets = this.f11163c;
            this.f11164d = Z.c.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f11164d;
    }

    @Override // h0.C1035O
    public C1036P h(int i7, int i8, int i9, int i10) {
        AbstractC1028H c1023c;
        C1036P c8 = C1036P.c(null, this.f11163c);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            c1023c = new C1027G(c8);
        } else if (i11 >= 30) {
            c1023c = new C1026F(c8);
        } else if (i11 >= 29) {
            c1023c = new C1025E(c8);
        } else {
            c1023c = new C1023C(c8);
        }
        c1023c.d(C1036P.a(g(), i7, i8, i9, i10));
        c1023c.c(C1036P.a(f(), i7, i8, i9, i10));
        return c1023c.b();
    }

    @Override // h0.C1035O
    public boolean j() {
        return this.f11163c.isRound();
    }

    @Override // h0.C1035O
    public void n(int i7) {
        this.f = i7;
    }

    public void q(Z.c cVar) {
        this.f11165e = cVar;
    }

    @Override // h0.C1035O
    public void k(Z.c[] cVarArr) {
    }

    @Override // h0.C1035O
    public void l(C1036P c1036p) {
    }
}
