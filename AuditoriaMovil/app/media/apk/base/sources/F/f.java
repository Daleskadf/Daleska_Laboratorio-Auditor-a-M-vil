package F;

import D.AbstractC0059i;
import L5.o;
import S.k;
import Y1.y;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.Trace;
import android.text.SpannableStringBuilder;
import android.util.Log;
import androidx.camera.core.impl.c0;
import c2.AbstractC0628a;
import c4.C0632a;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.maps.zzi;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugins.firebase.firestore.r;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.j;
import m6.AbstractC1448i;
import org.apache.tika.utils.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.helpers.i;
import s.InterfaceC1749a;
import s3.C1774b;
import u5.InterfaceC1875c;
import w3.l;
/* loaded from: classes.dex */
public abstract class f implements InterfaceC1749a, InterfaceC1875c {

    /* renamed from: X  reason: collision with root package name */
    public static Method f1097X;

    /* renamed from: Y  reason: collision with root package name */
    public static zzi f1098Y;

    /* renamed from: b  reason: collision with root package name */
    public static volatile Handler f1099b;

    /* renamed from: c  reason: collision with root package name */
    public static long f1100c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f1101d;

    /* renamed from: e  reason: collision with root package name */
    public static Method f1102e;
    public static Method f;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1103a = 16;

    public static final String A(String str) {
        j.e(str, "<this>");
        Pattern compile = Pattern.compile("(.)(\\p{Upper})");
        j.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("$1_$2");
        j.d(replaceAll, "replaceAll(...)");
        Pattern compile2 = Pattern.compile("(.) (.)");
        j.d(compile2, "compile(...)");
        String replaceAll2 = compile2.matcher(replaceAll).replaceAll("$1_$2");
        j.d(replaceAll2, "replaceAll(...)");
        String upperCase = replaceAll2.toUpperCase(Locale.ROOT);
        j.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    public static ArrayList B(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            Object obj = jSONArray.get(i7);
            if (obj instanceof JSONArray) {
                obj = B((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = C((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [S.k, S.f] */
    public static S.f C(JSONObject jSONObject) {
        ?? kVar = new k(0);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = B((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = C((JSONObject) obj);
            } else if (obj.equals(JSONObject.NULL)) {
                obj = null;
            }
            kVar.put(next, obj);
        }
        return kVar;
    }

    public static String D(String str) {
        if (str.length() <= 127) {
            return str;
        }
        return str.substring(0, 127);
    }

    public static ArrayList E(Exception exc) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(exc.toString());
        arrayList.add(exc.getClass().getSimpleName());
        arrayList.add("Cause: " + exc.getCause() + ", Stacktrace: " + Log.getStackTraceString(exc));
        return arrayList;
    }

    public static ArrayList F(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof r) {
            r rVar = (r) th;
            arrayList.add(rVar.f11947a);
            arrayList.add(rVar.getMessage());
            arrayList.add(rVar.f11948b);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }

    public static ArrayList G(DisplayManager displayManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new ArrayList();
        }
        try {
            Field declaredField = DisplayManager.class.getDeclaredField("mGlobal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(displayManager);
            Field declaredField2 = obj.getClass().getDeclaredField("mDisplayListeners");
            declaredField2.setAccessible(true);
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) declaredField2.get(obj)).iterator();
            Field field = null;
            while (it.hasNext()) {
                Object next = it.next();
                if (field == null) {
                    field = next.getClass().getField("mListener");
                    field.setAccessible(true);
                }
                arrayList.add((DisplayManager.DisplayListener) field.get(next));
            }
            return arrayList;
        } catch (IllegalAccessException e7) {
            e = e7;
            Log.w("DisplayListenerProxy", "Could not extract WebView's display listeners. " + e);
            return new ArrayList();
        } catch (NoSuchFieldException e8) {
            e = e8;
            Log.w("DisplayListenerProxy", "Could not extract WebView's display listeners. " + e);
            return new ArrayList();
        }
    }

    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", lVar.f16362a);
            bundle.putLong("event_timestamp", lVar.f16363b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static final j7.a b(o oVar) {
        Boolean bool = (Boolean) oVar.a("isSpeakerphoneOn");
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = (Boolean) oVar.a("stayAwake");
            if (bool2 != null) {
                boolean booleanValue2 = bool2.booleanValue();
                Integer num = (Integer) oVar.a("contentType");
                if (num != null) {
                    int intValue = num.intValue();
                    Integer num2 = (Integer) oVar.a("usageType");
                    if (num2 != null) {
                        int intValue2 = num2.intValue();
                        Integer num3 = (Integer) oVar.a("audioFocus");
                        if (num3 != null) {
                            int intValue3 = num3.intValue();
                            Integer num4 = (Integer) oVar.a("audioMode");
                            if (num4 != null) {
                                return new j7.a(booleanValue, booleanValue2, intValue, intValue2, intValue3, num4.intValue());
                            }
                            throw new IllegalStateException("audioMode is required");
                        }
                        throw new IllegalStateException("audioFocus is required");
                    }
                    throw new IllegalStateException("usageType is required");
                }
                throw new IllegalStateException("contentType is required");
            }
            throw new IllegalStateException("stayAwake is required");
        }
        throw new IllegalStateException("isSpeakerphoneOn is required");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(java.util.List r6, p0.C1643k r7, p6.AbstractC1700c r8) {
        /*
            boolean r0 = r8 instanceof p0.C1637e
            if (r0 == 0) goto L13
            r0 = r8
            p0.e r0 = (p0.C1637e) r0
            int r1 = r0.f15005d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15005d = r1
            goto L18
        L13:
            p0.e r0 = new p0.e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15004c
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.f15005d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.util.Iterator r6 = r0.f15003b
            java.io.Serializable r7 = r0.f15002a
            kotlin.jvm.internal.r r7 = (kotlin.jvm.internal.r) r7
            org.slf4j.helpers.i.M(r8)     // Catch: java.lang.Throwable -> L30
            goto L65
        L30:
            r8 = move-exception
            goto L7e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.f15002a
            java.util.List r6 = (java.util.List) r6
            org.slf4j.helpers.i.M(r8)
            goto L5c
        L42:
            org.slf4j.helpers.i.M(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            p0.g r2 = new p0.g
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.f15002a = r8
            r0.f15005d = r4
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L5b
            goto L93
        L5b:
            r6 = r8
        L5c:
            kotlin.jvm.internal.r r7 = new kotlin.jvm.internal.r
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L65:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()
            w6.l r8 = (w6.l) r8
            r0.f15002a = r7     // Catch: java.lang.Throwable -> L30
            r0.f15003b = r6     // Catch: java.lang.Throwable -> L30
            r0.f15005d = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto L65
            goto L93
        L7e:
            java.lang.Object r2 = r7.f13796a
            if (r2 != 0) goto L85
            r7.f13796a = r8
            goto L65
        L85:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            j3.f.a(r2, r8)
            goto L65
        L8b:
            java.lang.Object r6 = r7.f13796a
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L94
            l6.j r1 = l6.j.f13876a
        L93:
            return r1
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: F.f.c(java.util.List, p0.k, p6.c):java.lang.Object");
    }

    public static final List d(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String th2 = th.toString();
        Throwable cause = th.getCause();
        String stackTraceString = Log.getStackTraceString(th);
        return AbstractC1448i.L(simpleName, th2, "Cause: " + cause + ", Stacktrace: " + stackTraceString);
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, Object obj, int i7, int i8) {
        Object[] spans;
        for (Object obj2 : spannableStringBuilder.getSpans(i7, i8, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i7 && spannableStringBuilder.getSpanEnd(obj2) == i8 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i7, i8, 33);
    }

    public static c0 g(Context context, Bundle bundle) {
        boolean z7 = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] x7 = x(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] x8 = x(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        i.l("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        i.l("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z7);
        i.l("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(x7));
        i.l("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(x8));
        return new c0(z7, new HashSet(y(x7)), new HashSet(y(x8)));
    }

    public static final void h(int i7, int i8) {
        if (i7 <= i8) {
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0059i.y("toIndex (", i7, ") is greater than size (", i8, ")."));
    }

    public static C0632a i(String str, String str2) {
        A4.a aVar = new A4.a(str, str2);
        y b5 = C0632a.b(A4.a.class);
        b5.f6697b = 1;
        b5.f = new P0.c(aVar);
        return b5.d();
    }

    public static Handler k(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return X.c.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e7) {
            e = e7;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e8) {
            e = e8;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e9) {
            e = e9;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static C1774b m(String str) {
        I.j(str, "assetName must not be null");
        try {
            zzi zziVar = f1098Y;
            I.j(zziVar, "IBitmapDescriptorFactory is not initialized");
            return new C1774b(zziVar.zzf(str));
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static C1774b n(Bitmap bitmap) {
        I.j(bitmap, "image must not be null");
        try {
            zzi zziVar = f1098Y;
            I.j(zziVar, "IBitmapDescriptorFactory is not initialized");
            return new C1774b(zziVar.zzg(bitmap));
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static C0632a o(String str, P0.b bVar) {
        y b5 = C0632a.b(A4.a.class);
        b5.f6697b = 1;
        b5.c(c4.j.b(Context.class));
        b5.f = new A4.d(0, str, bVar);
        return b5.d();
    }

    public static Handler q() {
        if (f1099b != null) {
            return f1099b;
        }
        synchronized (f.class) {
            try {
                if (f1099b == null) {
                    f1099b = k(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f1099b;
    }

    public static void u(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean w() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0628a.c();
        }
        try {
            if (f1101d == null) {
                f1100c = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1101d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1101d.invoke(null, Long.valueOf(f1100c))).booleanValue();
        } catch (Exception e7) {
            u("isTagEnabled", e7);
            return false;
        }
    }

    public static String[] x(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i7 = bundle.getInt(str, -1);
        if (i7 == -1) {
            i.O("QuirkSettingsLoader", "Resource ID not found for key: ".concat(str));
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i7);
        } catch (Resources.NotFoundException e7) {
            i.P("QuirkSettingsLoader", "Quirk class names resource not found: " + i7, e7);
            return new String[0];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashSet y(java.lang.String[] r8) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r8.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L4a
            r3 = r8[r2]
            java.lang.String r4 = "QuirkSettingsLoader"
            java.lang.Class r5 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.Class<androidx.camera.core.impl.b0> r6 = androidx.camera.core.impl.InterfaceC0500b0.class
            boolean r6 = r6.isAssignableFrom(r5)     // Catch: java.lang.ClassNotFoundException -> L2f
            if (r6 == 0) goto L1a
            goto L42
        L1a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L2f
            r5.<init>()     // Catch: java.lang.ClassNotFoundException -> L2f
            r5.append(r3)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.String r6 = " does not implement the Quirk interface."
            r5.append(r6)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.ClassNotFoundException -> L2f
            org.slf4j.helpers.i.O(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L2f
            goto L41
        L2f:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Class not found: "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            org.slf4j.helpers.i.P(r4, r3, r5)
        L41:
            r5 = 0
        L42:
            if (r5 == 0) goto L47
            r0.add(r5)
        L47:
            int r2 = r2 + 1
            goto L7
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F.f.y(java.lang.String[]):java.util.HashSet");
    }

    public static void z(int i7, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0628a.d(i7, D(str));
            return;
        }
        String D4 = D(str);
        try {
            if (f1097X == null) {
                f1097X = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f1097X.invoke(null, Long.valueOf(f1100c), D4, Integer.valueOf(i7));
        } catch (Exception e7) {
            u("traceCounter", e7);
        }
    }

    @Override // u5.InterfaceC1875c
    public void f(Serializable serializable) {
        t().f(serializable);
    }

    @Override // u5.InterfaceC1875c
    public void j(String str, HashMap hashMap) {
        t().j(str, hashMap);
    }

    public abstract Object p(String str);

    public abstract String r();

    public boolean s() {
        return Boolean.TRUE.equals(p("noResult"));
    }

    public abstract InterfaceC1875c t();

    public String toString() {
        switch (this.f1103a) {
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                return r() + StringUtils.SPACE + ((String) p("sql")) + StringUtils.SPACE + ((List) p("arguments"));
            default:
                return super.toString();
        }
    }

    public abstract boolean v();
}
