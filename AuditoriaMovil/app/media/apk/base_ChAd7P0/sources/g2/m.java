package g2;

import H4.W;
import e0.C0927b;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final n f11127a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [g2.n] */
    /* JADX WARN: Type inference failed for: r1v4 */
    static {
        C0927b c0927b;
        try {
            c0927b = new C0927b((WebViewProviderFactoryBoundaryInterface) f7.a.a(WebViewProviderFactoryBoundaryInterface.class, W.j()));
        } catch (ClassNotFoundException unused) {
            c0927b = new Object();
        } catch (IllegalAccessException e7) {
            e = e7;
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e8) {
            e = e8;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e9) {
            e = e9;
            throw new RuntimeException(e);
        }
        f11127a = c0927b;
    }
}
