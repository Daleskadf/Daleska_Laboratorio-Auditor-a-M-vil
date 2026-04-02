package f3;

import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
/* renamed from: f3.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0992e {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f11060a;

    /* renamed from: b  reason: collision with root package name */
    public static final Method f11061b;

    /* renamed from: c  reason: collision with root package name */
    public static final Method f11062c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f11063d;

    static {
        Method method;
        Method method2;
        Method method3;
        boolean z7;
        Process.myUid();
        Method method4 = null;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f11060a = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f11061b = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f11062c = method3;
        try {
            WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception unused5) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            try {
                WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e7) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e7);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e8) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e8);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                method4 = WorkSource.class.getMethod("isEmpty", null);
                method4.setAccessible(true);
            } catch (Exception unused6) {
            }
        }
        f11063d = method4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.os.WorkSource r4) {
        /*
            java.lang.String r0 = "WorkSourceUtil"
            r1 = 0
            java.lang.reflect.Method r2 = f3.AbstractC0992e.f11063d
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r2.invoke(r4, r1)     // Catch: java.lang.Exception -> L15
            com.google.android.gms.common.internal.I.i(r2)     // Catch: java.lang.Exception -> L15
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L15
            boolean r4 = r2.booleanValue()     // Catch: java.lang.Exception -> L15
            return r4
        L15:
            r2 = move-exception
            java.lang.String r3 = "Unable to check WorkSource emptiness"
            android.util.Log.e(r0, r3, r2)
        L1b:
            r2 = 0
            java.lang.reflect.Method r3 = f3.AbstractC0992e.f11062c
            if (r3 == 0) goto L34
            java.lang.Object r4 = r3.invoke(r4, r1)     // Catch: java.lang.Exception -> L2e
            com.google.android.gms.common.internal.I.i(r4)     // Catch: java.lang.Exception -> L2e
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Exception -> L2e
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> L2e
            goto L35
        L2e:
            r4 = move-exception
            java.lang.String r1 = "Unable to assign blame through WorkSource"
            android.util.Log.wtf(r0, r1, r4)
        L34:
            r4 = r2
        L35:
            if (r4 != 0) goto L39
            r4 = 1
            return r4
        L39:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.AbstractC0992e.a(android.os.WorkSource):boolean");
    }
}
