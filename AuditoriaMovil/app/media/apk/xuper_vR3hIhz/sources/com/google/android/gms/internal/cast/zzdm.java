package com.google.android.gms.internal.cast;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzdm {
    @CheckForNull
    private static final Object zza;
    @CheckForNull
    private static final Method zzb;
    @CheckForNull
    private static final Method zzc;

    static {
        Method zzc2;
        Object zzb2 = zzb();
        zza = zzb2;
        Method method = null;
        if (zzb2 == null) {
            zzc2 = null;
        } else {
            zzc2 = zzc("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        zzb = zzc2;
        if (zzb2 != null) {
            method = zzd(zzb2);
        }
        zzc = method;
    }

    public static void zza(Throwable th) {
        if (!(th instanceof RuntimeException)) {
            return;
        }
        throw ((RuntimeException) th);
    }

    @CheckForNull
    private static Object zzb() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    @CheckForNull
    private static Method zzc(String str, Class<?>... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    @CheckForNull
    private static Method zzd(Object obj) {
        try {
            Method zzc2 = zzc("getStackTraceDepth", Throwable.class);
            if (zzc2 == null) {
                return null;
            }
            zzc2.invoke(obj, new Throwable());
            return zzc2;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }
}
