package h0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
/* renamed from: h0.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1023C extends AbstractC1028H {

    /* renamed from: c  reason: collision with root package name */
    public static Field f11153c = null;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f11154d = false;

    /* renamed from: e  reason: collision with root package name */
    public static Constructor f11155e = null;
    public static boolean f = false;

    /* renamed from: a  reason: collision with root package name */
    public WindowInsets f11156a;

    /* renamed from: b  reason: collision with root package name */
    public Z.c f11157b;

    public C1023C() {
        this.f11156a = e();
    }

    private static WindowInsets e() {
        if (!f11154d) {
            try {
                f11153c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
            }
            f11154d = true;
        }
        Field field = f11153c;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e8) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e8);
            }
        }
        if (!f) {
            try {
                f11155e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e9);
            }
            f = true;
        }
        Constructor constructor = f11155e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e10);
            }
        }
        return null;
    }

    @Override // h0.AbstractC1028H
    public C1036P b() {
        a();
        C1036P c8 = C1036P.c(null, this.f11156a);
        C1035O c1035o = c8.f11172a;
        c1035o.k(null);
        c1035o.m(this.f11157b);
        return c8;
    }

    @Override // h0.AbstractC1028H
    public void c(Z.c cVar) {
        this.f11157b = cVar;
    }

    @Override // h0.AbstractC1028H
    public void d(Z.c cVar) {
        WindowInsets windowInsets = this.f11156a;
        if (windowInsets != null) {
            this.f11156a = windowInsets.replaceSystemWindowInsets(cVar.f6709a, cVar.f6710b, cVar.f6711c, cVar.f6712d);
        }
    }

    public C1023C(C1036P c1036p) {
        super(c1036p);
        this.f11156a = c1036p.b();
    }
}
