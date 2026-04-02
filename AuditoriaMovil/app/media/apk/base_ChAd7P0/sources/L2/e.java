package l2;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import h2.C1077a;
import h2.C1078b;
import i2.AbstractC1106f;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final ClassLoader f13826a;

    /* renamed from: b  reason: collision with root package name */
    public final C1078b f13827b;

    /* renamed from: c  reason: collision with root package name */
    public final C1078b f13828c;

    public e(ClassLoader classLoader, C1078b c1078b) {
        this.f13826a = classLoader;
        this.f13827b = c1078b;
        this.f13828c = new C1078b(classLoader);
    }

    public final WindowLayoutComponent a() {
        C1078b c1078b = this.f13828c;
        c1078b.getClass();
        boolean z7 = false;
        try {
            new C1077a(c1078b, 0).invoke();
            if (android.support.v4.media.session.a.F("WindowExtensionsProvider#getWindowExtensions is not valid", new C1077a(c1078b, 1)) && android.support.v4.media.session.a.F("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 3)) && android.support.v4.media.session.a.F("FoldingFeature class is not valid", new d(this, 0))) {
                int a7 = AbstractC1106f.a();
                if (a7 == 1) {
                    z7 = b();
                } else if (2 <= a7 && a7 <= Integer.MAX_VALUE && b()) {
                    if (android.support.v4.media.session.a.F("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new d(this, 2))) {
                        z7 = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z7) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return android.support.v4.media.session.a.F("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d(this, 1));
    }
}
