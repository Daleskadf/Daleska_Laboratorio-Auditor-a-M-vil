package android.support.v4.media.session;

import B5.AbstractActivityC0032e;
import B6.d;
import B6.f;
import D.AbstractC0055e;
import D.AbstractC0059i;
import F.e;
import F3.o;
import F6.AbstractC0076a;
import H4.e1;
import K5.h;
import K6.AbstractC0208a;
import W.AbstractC0359b;
import X5.C0383i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import android.webkit.HttpAuthHandler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h.C1016b;
import h.C1017c;
import h.C1018d;
import h.InterfaceC1019e;
import io.flutter.plugins.googlemaps.C1190x;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l6.j;
import org.apache.tika.utils.StringUtils;
import org.slf4j.helpers.i;
import r3.AbstractC1740d;
import w6.InterfaceC1959a;
import w6.p;
import z5.AbstractC2073a;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static Constructor f7263a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f7264b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f7265c;

    public a() {
        new ConcurrentHashMap();
    }

    public static void A(p pVar, AbstractC0076a abstractC0076a, AbstractC0076a abstractC0076a2) {
        try {
            AbstractC0208a.h(AbstractC1740d.q(AbstractC1740d.k(abstractC0076a, abstractC0076a2, pVar)), j.f13876a, null);
        } catch (Throwable th) {
            abstractC0076a2.resumeWith(i.j(th));
            throw th;
        }
    }

    public static Integer B(HashSet hashSet) {
        if (hashSet.contains(4)) {
            return 4;
        }
        if (hashSet.contains(2)) {
            return 2;
        }
        if (hashSet.contains(0)) {
            return 0;
        }
        if (hashSet.contains(3)) {
            return 3;
        }
        return 1;
    }

    public static int C(AbstractActivityC0032e abstractActivityC0032e, String str, int i7) {
        if (i7 == -1) {
            return j(abstractActivityC0032e, str);
        }
        return 1;
    }

    public static boolean D(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.k()) {
            return taskCompletionSource.trySetResult(obj);
        }
        return taskCompletionSource.trySetException(I.n(status));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [B6.f, B6.d] */
    public static f E(int i7, int i8) {
        if (i8 <= Integer.MIN_VALUE) {
            f fVar = f.f408d;
            return f.f408d;
        }
        return new d(i7, i8 - 1, 1);
    }

    public static final boolean F(String str, InterfaceC1959a interfaceC1959a) {
        try {
            boolean booleanValue = ((Boolean) interfaceC1959a.invoke()).booleanValue();
            if (!booleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = StringUtils.EMPTY;
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = StringUtils.EMPTY;
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static ArrayList G(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof U5.b) {
            U5.b bVar = (U5.b) th;
            arrayList.add(bVar.f5776a);
            arrayList.add(bVar.getMessage());
            arrayList.add(null);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }

    public static ArrayList H(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof C1190x) {
            C1190x c1190x = (C1190x) th;
            arrayList.add(c1190x.f12301a);
            arrayList.add(c1190x.getMessage());
            arrayList.add(c1190x.f12302b);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }

    public static int I(int i7) {
        switch (i7) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
            default:
                return 0;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                return 17;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static u0.C1858n a(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Le
            u0.b r0 = new u0.b
            r1 = 22
            r0.<init>(r1)
            goto L15
        Le:
            e5.b r0 = new e5.b
            r1 = 22
            r0.<init>(r1)
        L15:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            g0.c.f(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L2e
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L2e
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L2e
            goto L4b
        L4a:
            r4 = r5
        L4b:
            if (r4 != 0) goto L4f
        L4d:
            r1 = r5
            goto L7e
        L4f:
            java.lang.String r2 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            android.content.pm.Signature[] r0 = r0.s(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
        L5d:
            if (r3 >= r6) goto L6b
            r7 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            r1.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            int r3 = r3 + 1
            goto L5d
        L6b:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            e0.e r1 = new e0.e     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            goto L7e
        L77:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L4d
        L7e:
            if (r1 != 0) goto L81
            goto L8b
        L81:
            u0.n r5 = new u0.n
            u0.m r0 = new u0.m
            r0.<init>(r8, r1)
            r5.<init>(r0)
        L8b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.a.a(android.content.Context):u0.n");
    }

    public static C1190x b(String str) {
        return new C1190x(StringUtils.EMPTY, "channel-error", AbstractC0059i.M("Unable to establish connection on channel: ", str, "."));
    }

    public static String i(Context context, String str) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31 && s(context, null, str)) {
            return str;
        }
        if (i7 < 29) {
            if (s(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
                return "android.permission.ACCESS_FINE_LOCATION";
            }
            if (!s(context, null, "android.permission.ACCESS_COARSE_LOCATION")) {
                return null;
            }
            return "android.permission.ACCESS_COARSE_LOCATION";
        } else if (!s(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
            return null;
        } else {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
    }

    public static int j(AbstractActivityC0032e abstractActivityC0032e, String str) {
        if (abstractActivityC0032e == null) {
            return 0;
        }
        boolean z7 = abstractActivityC0032e.getSharedPreferences(str, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
        boolean b5 = AbstractC0359b.b(abstractActivityC0032e, str);
        if (z7) {
            if (!b5) {
                b5 = true;
            } else {
                b5 = false;
            }
        }
        if (!z7 && b5) {
            abstractActivityC0032e.getSharedPreferences(str, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
        }
        if (!z7 || !b5) {
            return 0;
        }
        return 4;
    }

    public static int m(double d7, double d8) {
        if (d7 < d8) {
            return -1;
        }
        int i7 = (d7 > d8 ? 1 : (d7 == d8 ? 0 : -1));
        if (i7 > 0) {
            return 1;
        }
        if (i7 == 0) {
            return 0;
        }
        if (!Double.isNaN(d8)) {
            return -1;
        }
        if (!Double.isNaN(d7)) {
            return 1;
        }
        return 0;
    }

    public static Context n(Context context) {
        int f;
        Context applicationContext = context.getApplicationContext();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34 && (f = e.f(context)) != e.f(applicationContext)) {
            applicationContext = e.a(applicationContext, f);
        }
        if (i7 >= 30) {
            String d7 = F.d.d(context);
            if (!Objects.equals(d7, F.d.d(applicationContext))) {
                return F.d.a(applicationContext, d7);
            }
            return applicationContext;
        }
        return applicationContext;
    }

    public static ResolveInfo o(Activity context) {
        kotlin.jvm.internal.j.e(context, "context");
        return context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0140, code lost:
        if (r7 != false) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList p(android.content.Context r6, int r7) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.a.p(android.content.Context, int):java.util.ArrayList");
    }

    public static ResolveInfo q(Activity context) {
        kotlin.jvm.internal.j.e(context, "context");
        return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
    }

    public static String r(InterfaceC1019e input) {
        kotlin.jvm.internal.j.e(input, "input");
        if (input instanceof C1017c) {
            return "image/*";
        }
        if (input instanceof C1018d) {
            return "video/*";
        }
        if (input instanceof C1016b) {
            return null;
        }
        throw new RuntimeException();
    }

    public static boolean s(Context context, ArrayList arrayList, String str) {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        if (arrayList != null) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(str)) {
                        return true;
                    }
                }
            } catch (Exception e7) {
                Log.d("permissions_handler", "Unable to check manifest for permission: ", e7);
            }
        }
        if (context == null) {
            Log.d("permissions_handler", "Unable to detect current Activity or App Context.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            String packageName = context.getPackageName();
            of = PackageManager.PackageInfoFlags.of(4096L);
            packageInfo = packageManager.getPackageInfo(packageName, of);
        } else {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), RecognitionOptions.AZTEC);
        }
        if (packageInfo == null) {
            Log.d("permissions_handler", "Unable to get Package info, will not be able to determine permissions to request.");
            return false;
        }
        Iterator it2 = new ArrayList(Arrays.asList(packageInfo.requestedPermissions)).iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void t() {
        if (f7263a == null || f7264b == null || f7265c == null) {
            Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
            f7263a = cls.getConstructor(null);
            f7264b = cls.getMethod("setRotationDegrees", Float.TYPE);
            f7265c = cls.getMethod("build", null);
        }
    }

    public static int u(K0.p pVar, int i7, int i8, int i9) {
        boolean z7;
        if (Math.max(Math.max(i7, i8), i9) <= 31) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        int i10 = (1 << i7) - 1;
        int i11 = (1 << i8) - 1;
        f7.a.c(f7.a.c(i10, i11), 1 << i9);
        if (pVar.b() < i7) {
            return -1;
        }
        int i12 = pVar.i(i7);
        if (i12 == i10) {
            if (pVar.b() < i8) {
                return -1;
            }
            int i13 = pVar.i(i8);
            int i14 = i12 + i13;
            if (i13 == i11) {
                if (pVar.b() < i9) {
                    return -1;
                }
                return i14 + pVar.i(i9);
            }
            return i14;
        }
        return i12;
    }

    public static final String v(h hVar) {
        kotlin.jvm.internal.j.e(hVar, "<this>");
        int i7 = AbstractC2073a.f16903a[hVar.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        return "LANDSCAPE_RIGHT";
                    }
                    throw new RuntimeException();
                }
                return "LANDSCAPE_LEFT";
            }
            return "PORTRAIT_DOWN";
        }
        return "PORTRAIT_UP";
    }

    public static void w(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.k()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(I.n(status));
        }
    }

    public static void x(L5.f binaryMessenger, final C0383i c0383i) {
        Object obj;
        o oVar;
        kotlin.jvm.internal.j.e(binaryMessenger, "binaryMessenger");
        if (c0383i != null && (oVar = c0383i.f6499a) != null) {
            obj = oVar.j();
        } else {
            obj = new Object();
        }
        E.e eVar = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.useHttpAuthUsernamePassword", obj, null, 4);
        if (c0383i != null) {
            eVar.h0(new L5.b() { // from class: X5.G
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    switch (r2) {
                        case 0:
                            C0383i c0383i2 = c0383i;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                c0383i2.getClass();
                                E4 = G.i.A(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0383i c0383i3 = c0383i;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj4;
                            try {
                                c0383i3.getClass();
                                httpAuthHandler2.cancel();
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        default:
                            C0383i c0383i4 = c0383i;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj5;
                            Object obj6 = list.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj6;
                            Object obj7 = list.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0383i4.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                    }
                }
            });
        } else {
            eVar.h0(null);
        }
        E.e eVar2 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.cancel", obj, null, 4);
        if (c0383i != null) {
            eVar2.h0(new L5.b() { // from class: X5.G
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    switch (r2) {
                        case 0:
                            C0383i c0383i2 = c0383i;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                c0383i2.getClass();
                                E4 = G.i.A(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0383i c0383i3 = c0383i;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj4;
                            try {
                                c0383i3.getClass();
                                httpAuthHandler2.cancel();
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        default:
                            C0383i c0383i4 = c0383i;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj5;
                            Object obj6 = list.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj6;
                            Object obj7 = list.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0383i4.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                    }
                }
            });
        } else {
            eVar2.h0(null);
        }
        E.e eVar3 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.proceed", obj, null, 4);
        if (c0383i != null) {
            eVar3.h0(new L5.b() { // from class: X5.G
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    switch (r2) {
                        case 0:
                            C0383i c0383i2 = c0383i;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                c0383i2.getClass();
                                E4 = G.i.A(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0383i c0383i3 = c0383i;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj4;
                            try {
                                c0383i3.getClass();
                                httpAuthHandler2.cancel();
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        default:
                            C0383i c0383i4 = c0383i;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj5;
                            Object obj6 = list.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj6;
                            Object obj7 = list.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0383i4.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                    }
                }
            });
        } else {
            eVar3.h0(null);
        }
    }

    public static void y(K0.p pVar) {
        pVar.t(3);
        pVar.t(8);
        boolean h8 = pVar.h();
        boolean h9 = pVar.h();
        if (h8) {
            pVar.t(5);
        }
        if (h9) {
            pVar.t(6);
        }
    }

    public static void z(K0.p pVar) {
        int i7;
        int i8;
        int i9 = pVar.i(2);
        int i10 = 6;
        if (i9 == 0) {
            pVar.t(6);
            return;
        }
        int i11 = 5;
        int u7 = u(pVar, 5, 8, 16) + 1;
        if (i9 == 1) {
            pVar.t(u7 * 7);
        } else if (i9 == 2) {
            boolean h8 = pVar.h();
            if (h8) {
                i7 = 1;
            } else {
                i7 = 5;
            }
            if (h8) {
                i11 = 7;
            }
            if (h8) {
                i10 = 8;
            }
            int i12 = 0;
            while (i12 < u7) {
                if (pVar.h()) {
                    pVar.t(7);
                    i8 = 0;
                } else {
                    if (pVar.i(2) == 3 && pVar.i(i11) * i7 != 0) {
                        pVar.s();
                    }
                    i8 = pVar.i(i10) * i7;
                    if (i8 != 0 && i8 != 180) {
                        pVar.s();
                    }
                    pVar.s();
                }
                if (i8 != 0 && i8 != 180 && pVar.h()) {
                    i12++;
                }
                i12++;
            }
        }
    }

    public abstract Typeface c(Context context, Y.e eVar, Resources resources, int i7);

    public abstract Typeface d(Context context, e0.i[] iVarArr, int i7);

    public Typeface e(Context context, List list, int i7) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface f(Context context, InputStream inputStream) {
        File W7 = f7.a.W(context);
        if (W7 == null) {
            return null;
        }
        try {
            if (!f7.a.f(W7, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(W7.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            W7.delete();
        }
    }

    public Typeface g(Context context, Resources resources, int i7, String str, int i8) {
        File W7 = f7.a.W(context);
        if (W7 == null) {
            return null;
        }
        try {
            if (!f7.a.e(W7, resources, i7)) {
                return null;
            }
            return Typeface.createFromFile(W7.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            W7.delete();
        }
    }

    public abstract String h(byte[] bArr, int i7, int i8);

    public abstract int k(String str, byte[] bArr, int i7, int i8);

    public e0.i l(e0.i[] iVarArr, int i7) {
        int i8;
        boolean z7;
        int i9;
        if ((i7 & 1) == 0) {
            i8 = 400;
        } else {
            i8 = 700;
        }
        if ((i7 & 2) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        e0.i iVar = null;
        int i10 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        for (e0.i iVar2 : iVarArr) {
            int abs = Math.abs(iVar2.f10611c - i8) * 2;
            if (iVar2.f10612d == z7) {
                i9 = 0;
            } else {
                i9 = 1;
            }
            int i11 = abs + i9;
            if (iVar == null || i10 > i11) {
                iVar = iVar2;
                i10 = i11;
            }
        }
        return iVar;
    }
}
