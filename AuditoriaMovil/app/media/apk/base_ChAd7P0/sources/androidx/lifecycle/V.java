package androidx.lifecycle;

import android.app.Application;
import f5.C0993a;
import j6.C1372c;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
/* loaded from: classes.dex */
public final class V extends C1372c {

    /* renamed from: d  reason: collision with root package name */
    public static V f7924d;

    /* renamed from: e  reason: collision with root package name */
    public static final C0993a f7925e = new C0993a(15);

    /* renamed from: c  reason: collision with root package name */
    public final Application f7926c;

    public V(Application application) {
        super(15);
        this.f7926c = application;
    }

    public final U b(Class cls, Application application) {
        if (AbstractC0549a.class.isAssignableFrom(cls)) {
            try {
                U u7 = (U) cls.getConstructor(Application.class).newInstance(application);
                kotlin.jvm.internal.j.d(u7, "{\n                try {\n…          }\n            }");
                return u7;
            } catch (IllegalAccessException e7) {
                throw new RuntimeException("Cannot create an instance of " + cls, e7);
            } catch (InstantiationException e8) {
                throw new RuntimeException("Cannot create an instance of " + cls, e8);
            } catch (NoSuchMethodException e9) {
                throw new RuntimeException("Cannot create an instance of " + cls, e9);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            }
        }
        return super.c(cls);
    }

    @Override // j6.C1372c, androidx.lifecycle.W
    public final U c(Class cls) {
        Application application = this.f7926c;
        if (application != null) {
            return b(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // j6.C1372c, androidx.lifecycle.W
    public final U n(Class cls, B0.c cVar) {
        if (this.f7926c != null) {
            return c(cls);
        }
        Application application = (Application) ((LinkedHashMap) cVar.f229a).get(f7925e);
        if (application != null) {
            return b(cls, application);
        }
        if (!AbstractC0549a.class.isAssignableFrom(cls)) {
            return super.c(cls);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }
}
