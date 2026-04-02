package p;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import g1.C1006c;
import java.lang.reflect.Method;
import o.MenuC1545i;
/* renamed from: p.m0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1596m0 extends AbstractC1584g0 implements InterfaceC1586h0 {

    /* renamed from: v0  reason: collision with root package name */
    public static final Method f14850v0;

    /* renamed from: u0  reason: collision with root package name */
    public C1006c f14851u0;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f14850v0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p.InterfaceC1586h0
    public final void a(MenuC1545i menuC1545i, o.j jVar) {
        C1006c c1006c = this.f14851u0;
        if (c1006c != null) {
            c1006c.a(menuC1545i, jVar);
        }
    }

    @Override // p.InterfaceC1586h0
    public final void h(MenuC1545i menuC1545i, o.j jVar) {
        C1006c c1006c = this.f14851u0;
        if (c1006c != null) {
            c1006c.h(menuC1545i, jVar);
        }
    }
}
