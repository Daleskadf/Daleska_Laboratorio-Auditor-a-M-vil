package i3;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzb;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class b extends zzb implements InterfaceC1109a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f11473a;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f11473a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.common.zza, i3.a] */
    public static InterfaceC1109a b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof InterfaceC1109a) {
            return (InterfaceC1109a) queryLocalInterface;
        }
        return new zza(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static Object c(InterfaceC1109a interfaceC1109a) {
        if (interfaceC1109a instanceof b) {
            return ((b) interfaceC1109a).f11473a;
        }
        IBinder asBinder = interfaceC1109a.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i7 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i7++;
                field = field2;
            }
        }
        if (i7 == 1) {
            I.i(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e7) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e7);
                } catch (NullPointerException e8) {
                    throw new IllegalArgumentException("Binder object is null.", e8);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
    }
}
