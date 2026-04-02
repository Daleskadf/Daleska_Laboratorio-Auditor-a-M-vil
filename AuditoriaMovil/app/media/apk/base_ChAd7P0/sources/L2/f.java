package l2;

import androidx.window.extensions.layout.WindowLayoutComponent;
import h2.C1078b;
import i2.AbstractC1106f;
import n2.C1464c;
import n2.C1465d;
import w6.InterfaceC1959a;
/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.k implements InterfaceC1959a {

    /* renamed from: a  reason: collision with root package name */
    public static final f f13829a = new kotlin.jvm.internal.k(0);

    @Override // w6.InterfaceC1959a
    public final Object invoke() {
        e eVar;
        WindowLayoutComponent a7;
        Object obj;
        try {
            ClassLoader loader = h.class.getClassLoader();
            if (loader != null) {
                eVar = new e(loader, new C1078b(loader));
            } else {
                eVar = null;
            }
            if (eVar == null || (a7 = eVar.a()) == null) {
                return null;
            }
            kotlin.jvm.internal.j.d(loader, "loader");
            C1078b c1078b = new C1078b(loader);
            int a8 = AbstractC1106f.a();
            if (a8 >= 2) {
                obj = new C1465d(a7);
            } else if (a8 == 1) {
                obj = new C1464c(a7, c1078b);
            } else {
                obj = new Object();
            }
            return obj;
        } catch (Throwable unused) {
            g gVar = g.f13830a;
            return null;
        }
    }
}
