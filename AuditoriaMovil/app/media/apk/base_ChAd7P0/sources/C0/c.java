package c0;

import D.AbstractC0055e;
import P0.h;
import android.location.LocationRequest;
import android.os.Build;
import androidx.datastore.preferences.protobuf.Y;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f8323a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8324b;

    /* renamed from: c  reason: collision with root package name */
    public final long f8325c;

    /* renamed from: d  reason: collision with root package name */
    public final float f8326d;

    public c(long j, int i7, long j8, float f) {
        this.f8324b = j;
        this.f8323a = i7;
        this.f8325c = j8;
        this.f8326d = f;
    }

    public final LocationRequest a(String str) {
        long j = this.f8324b;
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0622a.c(this);
        }
        Object obj = null;
        try {
            if (AbstractC0055e.f691a == null) {
                AbstractC0055e.f691a = Class.forName("android.location.LocationRequest");
            }
            if (AbstractC0055e.f692b == null) {
                Method declaredMethod = AbstractC0055e.f691a.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                AbstractC0055e.f692b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object invoke = AbstractC0055e.f692b.invoke(null, str, Long.valueOf(j), Float.valueOf(this.f8326d), Boolean.FALSE);
            if (invoke != null) {
                if (AbstractC0055e.f693c == null) {
                    Method declaredMethod2 = AbstractC0055e.f691a.getDeclaredMethod("setQuality", Integer.TYPE);
                    AbstractC0055e.f693c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                AbstractC0055e.f693c.invoke(invoke, Integer.valueOf(this.f8323a));
                if (AbstractC0055e.f694d == null) {
                    Method declaredMethod3 = AbstractC0055e.f691a.getDeclaredMethod("setFastestInterval", Long.TYPE);
                    AbstractC0055e.f694d = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                Method method = AbstractC0055e.f694d;
                long j8 = this.f8325c;
                if (j8 != -1) {
                    j = j8;
                }
                method.invoke(invoke, Long.valueOf(j));
                obj = invoke;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return h.e(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f8323a == cVar.f8323a && this.f8324b == cVar.f8324b && this.f8325c == cVar.f8325c && Float.compare(cVar.f8326d, this.f8326d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f8324b;
        long j8 = this.f8325c;
        return (((this.f8323a * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        StringBuilder l8 = Y.l("Request[");
        long j = this.f8324b;
        if (j != Long.MAX_VALUE) {
            l8.append("@");
            g0.c.h(j, l8);
            int i7 = this.f8323a;
            if (i7 != 100) {
                if (i7 != 102) {
                    if (i7 == 104) {
                        l8.append(" LOW_POWER");
                    }
                } else {
                    l8.append(" BALANCED");
                }
            } else {
                l8.append(" HIGH_ACCURACY");
            }
        } else {
            l8.append("PASSIVE");
        }
        long j8 = this.f8325c;
        if (j8 != -1 && j8 < j) {
            l8.append(", minUpdateInterval=");
            g0.c.h(j8, l8);
        }
        float f = this.f8326d;
        if (f > 0.0d) {
            l8.append(", minUpdateDistance=");
            l8.append(f);
        }
        if (0 > j) {
            l8.append(", maxUpdateDelay=");
            g0.c.h(0L, l8);
        }
        l8.append(']');
        return l8.toString();
    }
}
