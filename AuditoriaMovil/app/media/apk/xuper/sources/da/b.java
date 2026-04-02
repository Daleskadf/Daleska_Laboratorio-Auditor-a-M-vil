package da;

import android.os.Build;
import ca.z;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import k9.f;
/* loaded from: classes3.dex */
public final class b extends k9.a implements z {
    private volatile Object _preHandler;

    public b() {
        super(z.U);
        this._preHandler = this;
    }

    public final Method L() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z10 = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z10 = true;
                }
            }
            if (z10) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // ca.z
    public void y(f fVar, Throwable th) {
        boolean z10;
        Object obj;
        int i10 = Build.VERSION.SDK_INT;
        if (26 <= i10 && i10 < 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Method L = L();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if (L != null) {
                obj = L.invoke(null, new Object[0]);
            } else {
                obj = null;
            }
            if (obj instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
