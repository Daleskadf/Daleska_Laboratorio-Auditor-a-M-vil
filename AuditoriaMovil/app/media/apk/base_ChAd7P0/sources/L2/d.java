package l2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.s;
import w6.InterfaceC1959a;
/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.k implements InterfaceC1959a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13824a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f13825b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i7) {
        super(0);
        this.f13824a = i7;
        this.f13825b = eVar;
    }

    @Override // w6.InterfaceC1959a
    public final Object invoke() {
        Class<?> cls = null;
        e eVar = this.f13825b;
        boolean z7 = false;
        switch (this.f13824a) {
            case 0:
                Class<?> loadClass = eVar.f13826a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                kotlin.jvm.internal.j.d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                Method getBoundsMethod = loadClass.getMethod("getBounds", null);
                Method getTypeMethod = loadClass.getMethod("getType", null);
                Method getStateMethod = loadClass.getMethod("getState", null);
                kotlin.jvm.internal.j.d(getBoundsMethod, "getBoundsMethod");
                if (getBoundsMethod.getReturnType().equals(f7.a.R(s.a(Rect.class))) && Modifier.isPublic(getBoundsMethod.getModifiers())) {
                    kotlin.jvm.internal.j.d(getTypeMethod, "getTypeMethod");
                    Class cls2 = Integer.TYPE;
                    if (getTypeMethod.getReturnType().equals(f7.a.R(s.a(cls2))) && Modifier.isPublic(getTypeMethod.getModifiers())) {
                        kotlin.jvm.internal.j.d(getStateMethod, "getStateMethod");
                        if (getStateMethod.getReturnType().equals(f7.a.R(s.a(cls2))) && Modifier.isPublic(getStateMethod.getModifiers())) {
                            z7 = true;
                        }
                    }
                }
                return Boolean.valueOf(z7);
            case 1:
                try {
                    cls = eVar.f13827b.b();
                } catch (ClassNotFoundException unused) {
                }
                if (cls == null) {
                    return Boolean.FALSE;
                }
                Class<?> loadClass2 = eVar.f13826a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                kotlin.jvm.internal.j.d(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method addListenerMethod = loadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, cls);
                Method removeListenerMethod = loadClass2.getMethod("removeWindowLayoutInfoListener", cls);
                kotlin.jvm.internal.j.d(addListenerMethod, "addListenerMethod");
                if (Modifier.isPublic(addListenerMethod.getModifiers())) {
                    kotlin.jvm.internal.j.d(removeListenerMethod, "removeListenerMethod");
                    if (Modifier.isPublic(removeListenerMethod.getModifiers())) {
                        z7 = true;
                    }
                }
                return Boolean.valueOf(z7);
            case 2:
                Class<?> loadClass3 = eVar.f13826a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                kotlin.jvm.internal.j.d(loadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method addListenerMethod2 = loadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method removeListenerMethod2 = loadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                kotlin.jvm.internal.j.d(addListenerMethod2, "addListenerMethod");
                if (Modifier.isPublic(addListenerMethod2.getModifiers())) {
                    kotlin.jvm.internal.j.d(removeListenerMethod2, "removeListenerMethod");
                    if (Modifier.isPublic(removeListenerMethod2.getModifiers())) {
                        z7 = true;
                    }
                }
                return Boolean.valueOf(z7);
            default:
                Class<?> loadClass4 = eVar.f13828c.f11331a.loadClass("androidx.window.extensions.WindowExtensions");
                kotlin.jvm.internal.j.d(loadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Method getWindowLayoutComponentMethod = loadClass4.getMethod("getWindowLayoutComponent", null);
                Class<?> loadClass5 = eVar.f13826a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                kotlin.jvm.internal.j.d(loadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                kotlin.jvm.internal.j.d(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
                if (Modifier.isPublic(getWindowLayoutComponentMethod.getModifiers()) && getWindowLayoutComponentMethod.getReturnType().equals(loadClass5)) {
                    z7 = true;
                }
                return Boolean.valueOf(z7);
        }
    }
}
