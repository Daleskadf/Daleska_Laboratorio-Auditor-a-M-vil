package c4;

import D.AbstractC0059i;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import w4.InterfaceC1956b;
/* renamed from: c4.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0634c implements InterfaceC1956b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8381a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f8382b;

    public /* synthetic */ C0634c(Object obj, int i7) {
        this.f8381a = i7;
        this.f8382b = obj;
    }

    @Override // w4.InterfaceC1956b
    public final Object get() {
        switch (this.f8381a) {
            case 0:
                String str = (String) this.f8382b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new RuntimeException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e7) {
                    throw new RuntimeException(AbstractC0059i.M("Could not instantiate ", str, "."), e7);
                } catch (InstantiationException e8) {
                    throw new RuntimeException(AbstractC0059i.M("Could not instantiate ", str, "."), e8);
                } catch (NoSuchMethodException e9) {
                    throw new RuntimeException(io.flutter.plugins.pathprovider.b.h("Could not instantiate ", str), e9);
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException(io.flutter.plugins.pathprovider.b.h("Could not instantiate ", str), e10);
                }
            default:
                return (ComponentRegistrar) this.f8382b;
        }
    }
}
