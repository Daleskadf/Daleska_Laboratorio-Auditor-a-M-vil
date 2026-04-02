package i2;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;
import kotlin.jvm.internal.s;
/* renamed from: i2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1106f {

    /* renamed from: a  reason: collision with root package name */
    public static final String f11459a = s.a(AbstractC1106f.class).c();

    public static int a() {
        String str = f11459a;
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (AbstractC1103c.a() != k.LOG) {
                return 0;
            }
            Log.d(str, "Embedding extension version not found");
            return 0;
        } catch (UnsupportedOperationException unused2) {
            if (AbstractC1103c.a() != k.LOG) {
                return 0;
            }
            Log.d(str, "Stub Extension");
            return 0;
        }
    }
}
