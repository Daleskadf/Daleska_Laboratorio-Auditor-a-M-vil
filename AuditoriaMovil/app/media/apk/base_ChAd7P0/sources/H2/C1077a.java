package h2;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import w6.InterfaceC1959a;
/* renamed from: h2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1077a extends k implements InterfaceC1959a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11329a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1078b f11330b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1077a(C1078b c1078b, int i7) {
        super(0);
        this.f11329a = i7;
        this.f11330b = c1078b;
    }

    @Override // w6.InterfaceC1959a
    public final Object invoke() {
        boolean z7;
        switch (this.f11329a) {
            case 0:
                Class<?> loadClass = this.f11330b.f11331a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                j.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                return loadClass;
            default:
                C1078b c1078b = this.f11330b;
                Class<?> loadClass2 = c1078b.f11331a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                j.d(loadClass2, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method getWindowExtensionsMethod = loadClass2.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass3 = c1078b.f11331a.loadClass("androidx.window.extensions.WindowExtensions");
                j.d(loadClass3, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                j.d(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                if (getWindowExtensionsMethod.getReturnType().equals(loadClass3) && Modifier.isPublic(getWindowExtensionsMethod.getModifiers())) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                return Boolean.valueOf(z7);
        }
    }
}
