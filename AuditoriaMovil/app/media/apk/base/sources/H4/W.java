package H4;

import D.AbstractC0055e;
import D.AbstractC0059i;
import X5.C0388n;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.EdgeEffect;
import androidx.datastore.preferences.protobuf.C0530g;
import com.google.protobuf.C0871w;
import g6.AbstractC1014c;
import g6.C1013b;
import h0.AbstractC1028H;
import h0.C1023C;
import h0.C1025E;
import h0.C1026F;
import h0.C1027G;
import h0.C1036P;
import io.flutter.plugins.GeneratedPluginRegistrant;
import io.flutter.plugins.firebase.auth.C1154q;
import io.flutter.plugins.firebase.firestore.C1157b;
import j$.util.Objects;
import java.io.Closeable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import k0.AbstractC1376c;
import k0.AbstractC1377d;
import l4.C1422f;
import org.apache.tika.utils.StringUtils;
import p2.C1658a;
import p4.InterfaceC1671a;
import p4.InterfaceC1672b;
import p4.InterfaceC1677g;
import p4.InterfaceC1693x;
import p4.InterfaceC1694y;
/* loaded from: classes.dex */
public abstract class W {

    /* renamed from: a  reason: collision with root package name */
    public static volatile Q0.A f1997a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile Q0.A f1998b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile Q0.A f1999c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile Q0.A f2000d;

    /* renamed from: e  reason: collision with root package name */
    public static volatile Q0.A f2001e;
    public static final /* synthetic */ int f = 0;

    public static String A(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return StringUtils.EMPTY;
        }
        if (!str.startsWith("/") && !str.endsWith("/") && !str.contains("//")) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split("/", -1)) {
            if (!TextUtils.isEmpty(str2)) {
                if (sb.length() > 0) {
                    sb.append("/");
                    sb.append(str2);
                } else {
                    sb.append(str2);
                }
            }
        }
        return sb.toString();
    }

    public static float B(EdgeEffect edgeEffect, float f4, float f8) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1377d.c(edgeEffect, f4, f8);
        }
        AbstractC1376c.a(edgeEffect, f4, f8);
        return f4;
    }

    public static void E(C5.c cVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", C5.c.class).invoke(null, cVar);
        } catch (Exception e7) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + cVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e7);
        }
    }

    public static void H(C1154q c1154q, Exception exc) {
        c1154q.b(new io.flutter.plugins.firebase.firestore.r("firebase_firestore", exc.getMessage(), h(exc)));
    }

    public static void I(L5.f binaryMessenger, final C0388n c0388n) {
        Object obj;
        F3.o oVar;
        kotlin.jvm.internal.j.e(binaryMessenger, "binaryMessenger");
        if (c0388n != null && (oVar = c0388n.f6519a) != null) {
            obj = oVar.j();
        } else {
            obj = new Object();
        }
        E.e eVar = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.instance", obj, null, 4);
        if (c0388n != null) {
            eVar.h0(new L5.b() { // from class: X5.C
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    switch (r2) {
                        case 0:
                            C0388n c0388n2 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0388n2.f6519a.f1179c).a(CookieManager.getInstance(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0388n c0388n3 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0388n3.getClass();
                                cookieManager.setCookie(str, str2);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            D d7 = new D(fVar, 0);
                            c0388n.getClass();
                            ((CookieManager) obj7).removeAllCookies(new C0387m(d7, 0));
                            return;
                        default:
                            C0388n c0388n4 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0388n4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
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
        E.e eVar2 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setCookie", obj, null, 4);
        if (c0388n != null) {
            eVar2.h0(new L5.b() { // from class: X5.C
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    switch (r2) {
                        case 0:
                            C0388n c0388n2 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0388n2.f6519a.f1179c).a(CookieManager.getInstance(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0388n c0388n3 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0388n3.getClass();
                                cookieManager.setCookie(str, str2);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            D d7 = new D(fVar, 0);
                            c0388n.getClass();
                            ((CookieManager) obj7).removeAllCookies(new C0387m(d7, 0));
                            return;
                        default:
                            C0388n c0388n4 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0388n4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
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
        E.e eVar3 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.removeAllCookies", obj, null, 4);
        if (c0388n != null) {
            eVar3.h0(new L5.b() { // from class: X5.C
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    switch (r2) {
                        case 0:
                            C0388n c0388n2 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0388n2.f6519a.f1179c).a(CookieManager.getInstance(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0388n c0388n3 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0388n3.getClass();
                                cookieManager.setCookie(str, str2);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            D d7 = new D(fVar, 0);
                            c0388n.getClass();
                            ((CookieManager) obj7).removeAllCookies(new C0387m(d7, 0));
                            return;
                        default:
                            C0388n c0388n4 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0388n4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
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
        E.e eVar4 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setAcceptThirdPartyCookies", obj, null, 4);
        if (c0388n != null) {
            eVar4.h0(new L5.b() { // from class: X5.C
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    switch (r2) {
                        case 0:
                            C0388n c0388n2 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0388n2.f6519a.f1179c).a(CookieManager.getInstance(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0388n c0388n3 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0388n3.getClass();
                                cookieManager.setCookie(str, str2);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            D d7 = new D(fVar, 0);
                            c0388n.getClass();
                            ((CookieManager) obj7).removeAllCookies(new C0387m(d7, 0));
                            return;
                        default:
                            C0388n c0388n4 = c0388n;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0388n4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
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
            eVar4.h0(null);
        }
    }

    public static boolean L(View view, Y5.b bVar) {
        if (view == null) {
            return false;
        }
        if (bVar.c(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                if (L(viewGroup.getChildAt(i7), bVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ArrayList M(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof io.flutter.plugins.firebase.storage.i) {
            io.flutter.plugins.firebase.storage.i iVar = (io.flutter.plugins.firebase.storage.i) th;
            arrayList.add(iVar.f11998a);
            arrayList.add(iVar.getMessage());
            arrayList.add(null);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }

    public static void a(StringBuilder sb, Object obj, w6.l lVar) {
        boolean z7;
        if (lVar != null) {
            sb.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null) {
            z7 = true;
        } else {
            z7 = obj instanceof CharSequence;
        }
        if (z7) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static void b(Context context, C5.c cVar) {
        Rect rect;
        AbstractC1028H c1023c;
        C1036P _windowInsetsCompat;
        WindowMetrics maximumWindowMetrics;
        Activity k2 = k(context);
        if (k2 != null) {
            int i7 = l2.m.f13843a;
            l2.n.f13844a.getClass();
            int i8 = l2.o.f13845b;
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 30) {
                maximumWindowMetrics = ((WindowManager) k2.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                kotlin.jvm.internal.j.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = k2.getSystemService("window");
                kotlin.jvm.internal.j.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display display = ((WindowManager) systemService).getDefaultDisplay();
                kotlin.jvm.internal.j.d(display, "display");
                Point point = new Point();
                display.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i9 >= 30) {
                if (i9 >= 30) {
                    _windowInsetsCompat = C1658a.f15081a.a(k2);
                } else {
                    throw new Exception("Incompatible SDK version");
                }
            } else {
                if (i9 >= 34) {
                    c1023c = new C1027G();
                } else if (i9 >= 30) {
                    c1023c = new C1026F();
                } else if (i9 >= 29) {
                    c1023c = new C1025E();
                } else {
                    c1023c = new C1023C();
                }
                _windowInsetsCompat = c1023c.b();
                kotlin.jvm.internal.j.d(_windowInsetsCompat, "{\n            WindowInse…ilder().build()\n        }");
            }
            int i10 = rect.left;
            int i11 = rect.top;
            int i12 = rect.right;
            int i13 = rect.bottom;
            if (i10 <= i12) {
                if (i11 <= i13) {
                    kotlin.jvm.internal.j.e(_windowInsetsCompat, "_windowInsetsCompat");
                    float f4 = context.getResources().getDisplayMetrics().density;
                    cVar.f553a.updateDisplayMetrics(0, new Rect(i10, i11, i12, i13).width(), new Rect(i10, i11, i12, i13).height(), f4);
                    return;
                }
                throw new IllegalArgumentException(AbstractC0059i.x("top must be less than or equal to bottom, top: ", i11, i13, ", bottom: ").toString());
            }
            throw new IllegalArgumentException(AbstractC0059i.x("Left must be less than or equal to right, left: ", i10, i12, ", right: ").toString());
        }
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static final void g(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                j3.f.a(th, th2);
            }
        }
    }

    public static HashMap h(Exception exc) {
        C1157b c1157b;
        Throwable cause;
        HashMap hashMap = new HashMap();
        if (exc == null) {
            return hashMap;
        }
        if (exc instanceof com.google.firebase.firestore.J) {
            c1157b = new C1157b((com.google.firebase.firestore.J) exc, exc.getCause());
        } else if (exc.getCause() != null && (exc.getCause() instanceof com.google.firebase.firestore.J)) {
            com.google.firebase.firestore.J j = (com.google.firebase.firestore.J) exc.getCause();
            if (exc.getCause().getCause() != null) {
                cause = exc.getCause().getCause();
            } else {
                cause = exc.getCause();
            }
            c1157b = new C1157b(j, cause);
        } else {
            c1157b = null;
        }
        if (c1157b != null) {
            hashMap.put("code", c1157b.f11912a);
            hashMap.put("message", c1157b.f11913b);
        }
        if (hashMap.containsKey("code")) {
            String str = (String) hashMap.get("code");
            Objects.requireNonNull(str);
            if (str.equals("unknown")) {
                Log.e("FLTFirebaseFirestore", "An unknown error occurred", exc);
            }
        }
        return hashMap;
    }

    public static String i(C0530g c0530g) {
        StringBuilder sb = new StringBuilder(c0530g.size());
        for (int i7 = 0; i7 < c0530g.size(); i7++) {
            byte e7 = c0530g.e(i7);
            if (e7 != 34) {
                if (e7 != 39) {
                    if (e7 != 92) {
                        switch (e7) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (e7 >= 32 && e7 <= 126) {
                                    sb.append((char) e7);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((e7 >>> 6) & 3) + 48));
                                    sb.append((char) (((e7 >>> 3) & 7) + 48));
                                    sb.append((char) ((e7 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static InvocationHandler j() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e7) {
                throw new RuntimeException(e7);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static Activity k(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return k(((ContextWrapper) context).getBaseContext());
    }

    public static final Map m(i5.c cVar) {
        return m6.s.Q(new l6.d("address", cVar.f11495b), new l6.d("body", cVar.f11497d), new l6.d("subject", cVar.f11496c), new l6.d("type", Integer.valueOf(cVar.f11494a)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x03b1, code lost:
        if (r0 == 0) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map n(i5.f r27) {
        /*
            Method dump skipped, instructions count: 1409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H4.W.n(i5.f):java.util.Map");
    }

    public static float o(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1377d.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Q0.A v() {
        Q0.A a7 = f1999c;
        if (a7 == null) {
            synchronized (W.class) {
                try {
                    a7 = f1999c;
                    if (a7 == null) {
                        D5.b e7 = Q0.A.e();
                        e7.f870d = a6.f0.SERVER_STREAMING;
                        e7.f871e = Q0.A.c("google.firestore.v1.Firestore", "RunAggregationQuery");
                        e7.f867a = true;
                        C0177o0 x7 = C0177o0.x();
                        C0871w c0871w = AbstractC1014c.f11139a;
                        e7.f868b = new C1013b(x7);
                        e7.f869c = new C1013b(C0181q0.v());
                        a7 = e7.g();
                        f1999c = a7;
                    }
                } finally {
                }
            }
        }
        return a7;
    }

    public static boolean x(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }

    public static String z(String str, Object... objArr) {
        int indexOf;
        String sb;
        String valueOf = String.valueOf(str);
        int i7 = 0;
        for (int i8 = 0; i8 < objArr.length; i8++) {
            Object obj = objArr[i8];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e7) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e7);
                    StringBuilder m7 = androidx.datastore.preferences.protobuf.Y.m("<", str2, " threw ");
                    m7.append(e7.getClass().getName());
                    m7.append(">");
                    sb = m7.toString();
                }
            }
            objArr[i8] = sb;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i9 = 0;
        while (i7 < objArr.length && (indexOf = valueOf.indexOf("%s", i9)) != -1) {
            sb2.append((CharSequence) valueOf, i9, indexOf);
            sb2.append(objArr[i7]);
            i9 = indexOf + 2;
            i7++;
        }
        sb2.append((CharSequence) valueOf, i9, valueOf.length());
        if (i7 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i7]);
            for (int i10 = i7 + 1; i10 < objArr.length; i10++) {
                sb2.append(", ");
                sb2.append(objArr[i10]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public abstract void C(U.g gVar, U.g gVar2);

    public abstract void D(U.g gVar, Thread thread);

    public abstract Object F(String str, u4.r rVar);

    public abstract void G(String str, Runnable runnable);

    public abstract void J();

    public abstract void K();

    public abstract boolean c(U.h hVar, U.d dVar, U.d dVar2);

    public abstract boolean d(U.h hVar, Object obj, Object obj2);

    public abstract boolean e(U.h hVar, U.g gVar, U.g gVar2);

    public abstract InterfaceC1671a l();

    public abstract InterfaceC1672b p(C1422f c1422f);

    public abstract InterfaceC1677g q(C1422f c1422f);

    public abstract InterfaceC1693x r(C1422f c1422f, InterfaceC1677g interfaceC1677g);

    public abstract InterfaceC1694y s();

    public abstract p4.B t();

    public abstract p4.C u();

    public abstract p4.X w();

    public abstract boolean y();
}
