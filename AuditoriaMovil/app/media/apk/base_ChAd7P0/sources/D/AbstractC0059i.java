package D;

import B5.AbstractActivityC0032e;
import D.AbstractC0055e;
import H0.C0137q;
import R1.j;
import T5.C0342a;
import T5.C0343b;
import X5.C0375a;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.C0501c;
import com.google.android.libraries.barhopper.RecognitionOptions;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* renamed from: D.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0059i {
    public static String A(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String B(StringBuilder sb, int i7, String str) {
        sb.append(i7);
        sb.append(str);
        return sb.toString();
    }

    public static String C(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String D(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static l6.e E(String str, String str2, String str3) {
        return org.slf4j.helpers.i.j(new C0375a(str, str2, str3));
    }

    public static void F(int i7, int i8, int i9, int i10, int i11) {
        K0.x.H(i7);
        K0.x.H(i8);
        K0.x.H(i9);
        K0.x.H(i10);
        K0.x.H(i11);
    }

    public static void G(int i7, HashMap hashMap, String str, int i8, String str2) {
        hashMap.put(str, Integer.valueOf(i7));
        hashMap.put(str2, Integer.valueOf(i8));
    }

    public static void H(C0137q c0137q, m1.G g3) {
        g3.c(new H0.r(c0137q));
    }

    public static /* synthetic */ void I(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void J(String str, int i7, String str2) {
        K0.a.A(str2, str + i7);
    }

    public static void K(String str, String str2, String str3) {
        K0.a.A(str3, str + str2);
    }

    public static void L(l6.e eVar, w6.l lVar) {
        lVar.invoke(new l6.f(eVar));
    }

    public static String M(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static void N(String str, String str2, String str3) {
        org.slf4j.helpers.i.j(new C0375a(str, str2, str3));
    }

    public static androidx.camera.core.impl.Z O(androidx.camera.core.impl.G g3, androidx.camera.core.impl.G g4) {
        androidx.camera.core.impl.W b5;
        if (g3 == null && g4 == null) {
            return androidx.camera.core.impl.Z.f7595c;
        }
        if (g4 != null) {
            b5 = androidx.camera.core.impl.W.c(g4);
        } else {
            b5 = androidx.camera.core.impl.W.b();
        }
        if (g3 != null) {
            for (C0501c c0501c : g3.H()) {
                P(b5, g4, g3, c0501c);
            }
        }
        return androidx.camera.core.impl.Z.a(b5);
    }

    public static void P(androidx.camera.core.impl.W w2, androidx.camera.core.impl.G g3, androidx.camera.core.impl.G g4, C0501c c0501c) {
        if (Objects.equals(c0501c, androidx.camera.core.impl.Q.f7583G)) {
            P.b bVar = (P.b) g4.f0(c0501c, null);
            P.b bVar2 = (P.b) g3.f0(c0501c, null);
            androidx.camera.core.impl.F e02 = g4.e0(c0501c);
            if (bVar == null) {
                bVar = bVar2;
            } else if (bVar2 != null) {
                M0.x xVar = new M0.x((char) 0, 7);
                xVar.f3210b = bVar2.f3888a;
                xVar.f3211c = bVar2.f3889b;
                P.a aVar = bVar.f3888a;
                if (aVar != null) {
                    xVar.f3210b = aVar;
                }
                P.c cVar = bVar.f3889b;
                if (cVar != null) {
                    xVar.f3211c = cVar;
                }
                bVar = new P.b((P.a) xVar.f3210b, (P.c) xVar.f3211c, null);
            }
            w2.i(c0501c, e02, bVar);
            return;
        }
        w2.i(c0501c, g4.e0(c0501c), g4.G(c0501c));
    }

    public static void Q(L5.f fVar, final R1.j jVar) {
        U5.c cVar = U5.c.f5777d;
        E.e eVar = new E.e(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", cVar, null, 4);
        if (jVar != null) {
            eVar.h0(new L5.b() { // from class: U5.d
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    Boolean bool;
                    switch (r2) {
                        case 0:
                            j jVar2 = jVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, jVar2.h0((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.G(th);
                            }
                            fVar2.h(arrayList);
                            return;
                        case 1:
                            j jVar3 = jVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.G(th2);
                            }
                            if (((AbstractActivityC0032e) jVar3.f4684d) != null) {
                                try {
                                    ((AbstractActivityC0032e) jVar3.f4684d).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", j.o0(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                                fVar2.h(arrayList2);
                                return;
                            }
                            throw new b();
                        case 2:
                            j jVar4 = jVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, jVar4.L0((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = android.support.v4.media.session.a.G(th3);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 3:
                            j jVar5 = jVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, jVar5.R0());
                            } catch (Throwable th4) {
                                arrayList6 = android.support.v4.media.session.a.G(th4);
                            }
                            fVar2.h(arrayList6);
                            return;
                        default:
                            j jVar6 = jVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                jVar6.getClass();
                                ((Context) jVar6.f4682b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = android.support.v4.media.session.a.G(th5);
                            }
                            fVar2.h(arrayList7);
                            return;
                    }
                }
            });
        } else {
            eVar.h0(null);
        }
        E.e eVar2 = new E.e(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", cVar, null, 4);
        if (jVar != null) {
            eVar2.h0(new L5.b() { // from class: U5.d
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    Boolean bool;
                    switch (r2) {
                        case 0:
                            j jVar2 = jVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, jVar2.h0((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.G(th);
                            }
                            fVar2.h(arrayList);
                            return;
                        case 1:
                            j jVar3 = jVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.G(th2);
                            }
                            if (((AbstractActivityC0032e) jVar3.f4684d) != null) {
                                try {
                                    ((AbstractActivityC0032e) jVar3.f4684d).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", j.o0(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                                fVar2.h(arrayList2);
                                return;
                            }
                            throw new b();
                        case 2:
                            j jVar4 = jVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, jVar4.L0((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = android.support.v4.media.session.a.G(th3);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 3:
                            j jVar5 = jVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, jVar5.R0());
                            } catch (Throwable th4) {
                                arrayList6 = android.support.v4.media.session.a.G(th4);
                            }
                            fVar2.h(arrayList6);
                            return;
                        default:
                            j jVar6 = jVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                jVar6.getClass();
                                ((Context) jVar6.f4682b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = android.support.v4.media.session.a.G(th5);
                            }
                            fVar2.h(arrayList7);
                            return;
                    }
                }
            });
        } else {
            eVar2.h0(null);
        }
        E.e eVar3 = new E.e(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", cVar, null, 4);
        if (jVar != null) {
            eVar3.h0(new L5.b() { // from class: U5.d
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    Boolean bool;
                    switch (r2) {
                        case 0:
                            j jVar2 = jVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, jVar2.h0((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.G(th);
                            }
                            fVar2.h(arrayList);
                            return;
                        case 1:
                            j jVar3 = jVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.G(th2);
                            }
                            if (((AbstractActivityC0032e) jVar3.f4684d) != null) {
                                try {
                                    ((AbstractActivityC0032e) jVar3.f4684d).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", j.o0(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                                fVar2.h(arrayList2);
                                return;
                            }
                            throw new b();
                        case 2:
                            j jVar4 = jVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, jVar4.L0((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = android.support.v4.media.session.a.G(th3);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 3:
                            j jVar5 = jVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, jVar5.R0());
                            } catch (Throwable th4) {
                                arrayList6 = android.support.v4.media.session.a.G(th4);
                            }
                            fVar2.h(arrayList6);
                            return;
                        default:
                            j jVar6 = jVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                jVar6.getClass();
                                ((Context) jVar6.f4682b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = android.support.v4.media.session.a.G(th5);
                            }
                            fVar2.h(arrayList7);
                            return;
                    }
                }
            });
        } else {
            eVar3.h0(null);
        }
        E.e eVar4 = new E.e(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", cVar, null, 4);
        if (jVar != null) {
            eVar4.h0(new L5.b() { // from class: U5.d
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    Boolean bool;
                    switch (r2) {
                        case 0:
                            j jVar2 = jVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, jVar2.h0((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.G(th);
                            }
                            fVar2.h(arrayList);
                            return;
                        case 1:
                            j jVar3 = jVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.G(th2);
                            }
                            if (((AbstractActivityC0032e) jVar3.f4684d) != null) {
                                try {
                                    ((AbstractActivityC0032e) jVar3.f4684d).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", j.o0(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                                fVar2.h(arrayList2);
                                return;
                            }
                            throw new b();
                        case 2:
                            j jVar4 = jVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, jVar4.L0((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = android.support.v4.media.session.a.G(th3);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 3:
                            j jVar5 = jVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, jVar5.R0());
                            } catch (Throwable th4) {
                                arrayList6 = android.support.v4.media.session.a.G(th4);
                            }
                            fVar2.h(arrayList6);
                            return;
                        default:
                            j jVar6 = jVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                jVar6.getClass();
                                ((Context) jVar6.f4682b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = android.support.v4.media.session.a.G(th5);
                            }
                            fVar2.h(arrayList7);
                            return;
                    }
                }
            });
        } else {
            eVar4.h0(null);
        }
        E.e eVar5 = new E.e(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", cVar, null, 4);
        if (jVar != null) {
            eVar5.h0(new L5.b() { // from class: U5.d
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    Boolean bool;
                    switch (r2) {
                        case 0:
                            j jVar2 = jVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, jVar2.h0((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.G(th);
                            }
                            fVar2.h(arrayList);
                            return;
                        case 1:
                            j jVar3 = jVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.G(th2);
                            }
                            if (((AbstractActivityC0032e) jVar3.f4684d) != null) {
                                try {
                                    ((AbstractActivityC0032e) jVar3.f4684d).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", j.o0(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                                fVar2.h(arrayList2);
                                return;
                            }
                            throw new b();
                        case 2:
                            j jVar4 = jVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, jVar4.L0((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = android.support.v4.media.session.a.G(th3);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 3:
                            j jVar5 = jVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, jVar5.R0());
                            } catch (Throwable th4) {
                                arrayList6 = android.support.v4.media.session.a.G(th4);
                            }
                            fVar2.h(arrayList6);
                            return;
                        default:
                            j jVar6 = jVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                jVar6.getClass();
                                ((Context) jVar6.f4682b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = android.support.v4.media.session.a.G(th5);
                            }
                            fVar2.h(arrayList7);
                            return;
                    }
                }
            });
        } else {
            eVar5.h0(null);
        }
    }

    public static void R(L5.f fVar, final C0342a c0342a) {
        com.google.firebase.firestore.Z f = fVar.f();
        C0343b c0343b = C0343b.f5426e;
        E.e eVar = new E.e(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", c0343b, f, 4);
        if (c0342a != null) {
            eVar.h0(new L5.b() { // from class: T5.c
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    switch (r2) {
                        case 0:
                            C0342a c0342a2 = c0342a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0342a2.f5424a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0055e.D(th);
                            }
                            fVar2.h(arrayList);
                            return;
                        case 1:
                            C0342a c0342a3 = c0342a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0342a3.f5424a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0055e.D(th2);
                            }
                            fVar2.h(arrayList2);
                            return;
                        case 2:
                            C0342a c0342a4 = c0342a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0342a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0055e.D(th3);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 3:
                            C0342a c0342a5 = c0342a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0342a5.f5424a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0055e.D(th4);
                            }
                            fVar2.h(arrayList6);
                            return;
                        case 4:
                            C0342a c0342a6 = c0342a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0342a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                SharedPreferences.Editor edit = c0342a6.f5424a.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0055e.D(th5);
                            }
                            fVar2.h(arrayList8);
                            return;
                        case 5:
                            C0342a c0342a7 = c0342a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0342a7.f5424a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0055e.D(th6);
                            }
                            fVar2.h(arrayList10);
                            return;
                        case 6:
                            C0342a c0342a8 = c0342a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0342a8.f5424a.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0342a8.f5425b.p(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0055e.D(th7);
                            }
                            fVar2.h(arrayList12);
                            return;
                        case 7:
                            C0342a c0342a9 = c0342a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0342a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0055e.D(th8);
                            }
                            fVar2.h(arrayList14);
                            return;
                        default:
                            C0342a c0342a10 = c0342a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0342a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0055e.D(th9);
                            }
                            fVar2.h(arrayList16);
                            return;
                    }
                }
            });
        } else {
            eVar.h0(null);
        }
        E.e eVar2 = new E.e(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", c0343b, f, 4);
        if (c0342a != null) {
            eVar2.h0(new L5.b() { // from class: T5.c
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    switch (r2) {
                        case 0:
                            C0342a c0342a2 = c0342a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0342a2.f5424a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0055e.D(th);
                            }
                            fVar2.h(arrayList);
                            return;
                        case 1:
                            C0342a c0342a3 = c0342a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0342a3.f5424a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0055e.D(th2);
                            }
                            fVar2.h(arrayList2);
                            return;
                        case 2:
                            C0342a c0342a4 = c0342a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0342a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0055e.D(th3);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 3:
                            C0342a c0342a5 = c0342a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0342a5.f5424a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0055e.D(th4);
                            }
                            fVar2.h(arrayList6);
                            return;
                        case 4:
                            C0342a c0342a6 = c0342a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0342a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                SharedPreferences.Editor edit = c0342a6.f5424a.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0055e.D(th5);
                            }
                            fVar2.h(arrayList8);
                            return;
                        case 5:
                            C0342a c0342a7 = c0342a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0342a7.f5424a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0055e.D(th6);
                            }
                            fVar2.h(arrayList10);
                            return;
                        case 6:
                            C0342a c0342a8 = c0342a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0342a8.f5424a.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0342a8.f5425b.p(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0055e.D(th7);
                            }
                            fVar2.h(arrayList12);
                            return;
                        case 7:
                            C0342a c0342a9 = c0342a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0342a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0055e.D(th8);
                            }
                            fVar2.h(arrayList14);
                            return;
                        default:
                            C0342a c0342a10 = c0342a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0342a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0055e.D(th9);
                            }
                            fVar2.h(arrayList16);
                            return;
                    }
                }
            });
        } else {
            eVar2.h0(null);
        }
        E.e eVar3 = new E.e(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", c0343b, f, 4);
        if (c0342a != null) {
            eVar3.h0(new L5.b() { // from class: T5.c
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    switch (r2) {
                        case 0:
                            C0342a c0342a2 = c0342a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0342a2.f5424a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0055e.D(th);
                            }
                            fVar2.h(arrayList);
                            return;
                        case 1:
                            C0342a c0342a3 = c0342a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0342a3.f5424a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0055e.D(th2);
                            }
                            fVar2.h(arrayList2);
                            return;
                        case 2:
                            C0342a c0342a4 = c0342a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0342a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0055e.D(th3);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 3:
                            C0342a c0342a5 = c0342a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0342a5.f5424a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0055e.D(th4);
                            }
                            fVar2.h(arrayList6);
                            return;
                        case 4:
                            C0342a c0342a6 = c0342a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0342a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                SharedPreferences.Editor edit = c0342a6.f5424a.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0055e.D(th5);
                            }
                            fVar2.h(arrayList8);
                            return;
                        case 5:
                            C0342a c0342a7 = c0342a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0342a7.f5424a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0055e.D(th6);
                            }
                            fVar2.h(arrayList10);
                            return;
                        case 6:
                            C0342a c0342a8 = c0342a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0342a8.f5424a.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0342a8.f5425b.p(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0055e.D(th7);
                            }
                            fVar2.h(arrayList12);
                            return;
                        case 7:
                            C0342a c0342a9 = c0342a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0342a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0055e.D(th8);
                            }
                            fVar2.h(arrayList14);
                            return;
                        default:
                            C0342a c0342a10 = c0342a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0342a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0055e.D(th9);
                            }
                            fVar2.h(arrayList16);
                            return;
                    }
                }
            });
        } else {
            eVar3.h0(null);
        }
        E.e eVar4 = new E.e(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", c0343b, f, 4);
        if (c0342a != null) {
            eVar4.h0(new L5.b() { // from class: T5.c
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    switch (r2) {
                        case 0:
                            C0342a c0342a2 = c0342a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0342a2.f5424a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0055e.D(th);
                            }
                            fVar2.h(arrayList);
                            return;
                        case 1:
                            C0342a c0342a3 = c0342a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0342a3.f5424a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0055e.D(th2);
                            }
                            fVar2.h(arrayList2);
                            return;
                        case 2:
                            C0342a c0342a4 = c0342a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0342a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0055e.D(th3);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 3:
                            C0342a c0342a5 = c0342a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0342a5.f5424a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0055e.D(th4);
                            }
                            fVar2.h(arrayList6);
                            return;
                        case 4:
                            C0342a c0342a6 = c0342a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0342a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                SharedPreferences.Editor edit = c0342a6.f5424a.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0055e.D(th5);
                            }
                            fVar2.h(arrayList8);
                            return;
                        case 5:
                            C0342a c0342a7 = c0342a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0342a7.f5424a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0055e.D(th6);
                            }
                            fVar2.h(arrayList10);
                            return;
                        case 6:
                            C0342a c0342a8 = c0342a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0342a8.f5424a.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0342a8.f5425b.p(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0055e.D(th7);
                            }
                            fVar2.h(arrayList12);
                            return;
                        case 7:
                            C0342a c0342a9 = c0342a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0342a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0055e.D(th8);
                            }
                            fVar2.h(arrayList14);
                            return;
                        default:
                            C0342a c0342a10 = c0342a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0342a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0055e.D(th9);
                            }
                            fVar2.h(arrayList16);
                            return;
                    }
                }
            });
        } else {
            eVar4.h0(null);
        }
        E.e eVar5 = new E.e(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", c0343b, f, 4);
        if (c0342a != null) {
            eVar5.h0(new L5.b() { // from class: T5.c
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    switch (r2) {
                        case 0:
                            C0342a c0342a2 = c0342a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0342a2.f5424a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0055e.D(th);
                            }
                            fVar2.h(arrayList);
                            return;
                        case 1:
                            C0342a c0342a3 = c0342a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0342a3.f5424a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0055e.D(th2);
                            }
                            fVar2.h(arrayList2);
                            return;
                        case 2:
                            C0342a c0342a4 = c0342a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0342a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0055e.D(th3);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 3:
                            C0342a c0342a5 = c0342a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0342a5.f5424a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0055e.D(th4);
                            }
                            fVar2.h(arrayList6);
                            return;
                        case 4:
                            C0342a c0342a6 = c0342a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0342a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                SharedPreferences.Editor edit = c0342a6.f5424a.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0055e.D(th5);
                            }
                            fVar2.h(arrayList8);
                            return;
                        case 5:
                            C0342a c0342a7 = c0342a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0342a7.f5424a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0055e.D(th6);
                            }
                            fVar2.h(arrayList10);
                            return;
                        case 6:
                            C0342a c0342a8 = c0342a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0342a8.f5424a.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0342a8.f5425b.p(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0055e.D(th7);
                            }
                            fVar2.h(arrayList12);
                            return;
                        case 7:
                            C0342a c0342a9 = c0342a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0342a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0055e.D(th8);
                            }
                            fVar2.h(arrayList14);
                            return;
                        default:
                            C0342a c0342a10 = c0342a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0342a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0055e.D(th9);
                            }
                            fVar2.h(arrayList16);
                            return;
                    }
                }
            });
        } else {
            eVar5.h0(null);
        }
        E.e eVar6 = new E.e(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", c0343b, f, 4);
        if (c0342a != null) {
            eVar6.h0(new L5.b() { // from class: T5.c
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    switch (r2) {
                        case 0:
                            C0342a c0342a2 = c0342a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0342a2.f5424a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0055e.D(th);
                            }
                            fVar2.h(arrayList);
                            return;
                        case 1:
                            C0342a c0342a3 = c0342a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0342a3.f5424a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0055e.D(th2);
                            }
                            fVar2.h(arrayList2);
                            return;
                        case 2:
                            C0342a c0342a4 = c0342a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0342a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0055e.D(th3);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 3:
                            C0342a c0342a5 = c0342a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0342a5.f5424a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0055e.D(th4);
                            }
                            fVar2.h(arrayList6);
                            return;
                        case 4:
                            C0342a c0342a6 = c0342a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0342a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                SharedPreferences.Editor edit = c0342a6.f5424a.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0055e.D(th5);
                            }
                            fVar2.h(arrayList8);
                            return;
                        case 5:
                            C0342a c0342a7 = c0342a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0342a7.f5424a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0055e.D(th6);
                            }
                            fVar2.h(arrayList10);
                            return;
                        case 6:
                            C0342a c0342a8 = c0342a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0342a8.f5424a.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0342a8.f5425b.p(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0055e.D(th7);
                            }
                            fVar2.h(arrayList12);
                            return;
                        case 7:
                            C0342a c0342a9 = c0342a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0342a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0055e.D(th8);
                            }
                            fVar2.h(arrayList14);
                            return;
                        default:
                            C0342a c0342a10 = c0342a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0342a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0055e.D(th9);
                            }
                            fVar2.h(arrayList16);
                            return;
                    }
                }
            });
        } else {
            eVar6.h0(null);
        }
        E.e eVar7 = new E.e(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", c0343b, f, 4);
        if (c0342a != null) {
            eVar7.h0(new L5.b() { // from class: T5.c
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    switch (r2) {
                        case 0:
                            C0342a c0342a2 = c0342a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0342a2.f5424a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0055e.D(th);
                            }
                            fVar2.h(arrayList);
                            return;
                        case 1:
                            C0342a c0342a3 = c0342a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0342a3.f5424a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0055e.D(th2);
                            }
                            fVar2.h(arrayList2);
                            return;
                        case 2:
                            C0342a c0342a4 = c0342a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0342a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0055e.D(th3);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 3:
                            C0342a c0342a5 = c0342a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0342a5.f5424a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0055e.D(th4);
                            }
                            fVar2.h(arrayList6);
                            return;
                        case 4:
                            C0342a c0342a6 = c0342a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0342a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                SharedPreferences.Editor edit = c0342a6.f5424a.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0055e.D(th5);
                            }
                            fVar2.h(arrayList8);
                            return;
                        case 5:
                            C0342a c0342a7 = c0342a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0342a7.f5424a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0055e.D(th6);
                            }
                            fVar2.h(arrayList10);
                            return;
                        case 6:
                            C0342a c0342a8 = c0342a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0342a8.f5424a.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0342a8.f5425b.p(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0055e.D(th7);
                            }
                            fVar2.h(arrayList12);
                            return;
                        case 7:
                            C0342a c0342a9 = c0342a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0342a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0055e.D(th8);
                            }
                            fVar2.h(arrayList14);
                            return;
                        default:
                            C0342a c0342a10 = c0342a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0342a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0055e.D(th9);
                            }
                            fVar2.h(arrayList16);
                            return;
                    }
                }
            });
        } else {
            eVar7.h0(null);
        }
        E.e eVar8 = new E.e(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", c0343b, f, 4);
        if (c0342a != null) {
            eVar8.h0(new L5.b() { // from class: T5.c
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    switch (r2) {
                        case 0:
                            C0342a c0342a2 = c0342a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0342a2.f5424a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0055e.D(th);
                            }
                            fVar2.h(arrayList);
                            return;
                        case 1:
                            C0342a c0342a3 = c0342a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0342a3.f5424a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0055e.D(th2);
                            }
                            fVar2.h(arrayList2);
                            return;
                        case 2:
                            C0342a c0342a4 = c0342a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0342a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0055e.D(th3);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 3:
                            C0342a c0342a5 = c0342a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0342a5.f5424a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0055e.D(th4);
                            }
                            fVar2.h(arrayList6);
                            return;
                        case 4:
                            C0342a c0342a6 = c0342a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0342a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                SharedPreferences.Editor edit = c0342a6.f5424a.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0055e.D(th5);
                            }
                            fVar2.h(arrayList8);
                            return;
                        case 5:
                            C0342a c0342a7 = c0342a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0342a7.f5424a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0055e.D(th6);
                            }
                            fVar2.h(arrayList10);
                            return;
                        case 6:
                            C0342a c0342a8 = c0342a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0342a8.f5424a.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0342a8.f5425b.p(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0055e.D(th7);
                            }
                            fVar2.h(arrayList12);
                            return;
                        case 7:
                            C0342a c0342a9 = c0342a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0342a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0055e.D(th8);
                            }
                            fVar2.h(arrayList14);
                            return;
                        default:
                            C0342a c0342a10 = c0342a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0342a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0055e.D(th9);
                            }
                            fVar2.h(arrayList16);
                            return;
                    }
                }
            });
        } else {
            eVar8.h0(null);
        }
        E.e eVar9 = new E.e(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", c0343b, f, 4);
        if (c0342a != null) {
            eVar9.h0(new L5.b() { // from class: T5.c
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    switch (r2) {
                        case 0:
                            C0342a c0342a2 = c0342a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0342a2.f5424a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0055e.D(th);
                            }
                            fVar2.h(arrayList);
                            return;
                        case 1:
                            C0342a c0342a3 = c0342a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0342a3.f5424a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0055e.D(th2);
                            }
                            fVar2.h(arrayList2);
                            return;
                        case 2:
                            C0342a c0342a4 = c0342a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0342a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0055e.D(th3);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 3:
                            C0342a c0342a5 = c0342a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0342a5.f5424a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0055e.D(th4);
                            }
                            fVar2.h(arrayList6);
                            return;
                        case 4:
                            C0342a c0342a6 = c0342a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0342a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                SharedPreferences.Editor edit = c0342a6.f5424a.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0055e.D(th5);
                            }
                            fVar2.h(arrayList8);
                            return;
                        case 5:
                            C0342a c0342a7 = c0342a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0342a7.f5424a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0055e.D(th6);
                            }
                            fVar2.h(arrayList10);
                            return;
                        case 6:
                            C0342a c0342a8 = c0342a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0342a8.f5424a.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0342a8.f5425b.p(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0055e.D(th7);
                            }
                            fVar2.h(arrayList12);
                            return;
                        case 7:
                            C0342a c0342a9 = c0342a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0342a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0055e.D(th8);
                            }
                            fVar2.h(arrayList14);
                            return;
                        default:
                            C0342a c0342a10 = c0342a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0342a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0055e.D(th9);
                            }
                            fVar2.h(arrayList16);
                            return;
                    }
                }
            });
        } else {
            eVar9.h0(null);
        }
    }

    public static void S(L5.f fVar, P5.d dVar) {
        E.e eVar = new E.e(fVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", new Object(), null, 4);
        if (dVar != null) {
            eVar.h0(new P5.g(dVar, 0));
        } else {
            eVar.h0(null);
        }
        E.e eVar2 = new E.e(fVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", new Object(), null, 4);
        if (dVar != null) {
            eVar2.h0(new P5.g(dVar, 1));
        } else {
            eVar2.h0(null);
        }
        E.e eVar3 = new E.e(fVar, "dev.flutter.pigeon.FirebaseAppHostApi.delete", new Object(), null, 4);
        if (dVar != null) {
            eVar3.h0(new P5.g(dVar, 2));
        } else {
            eVar3.h0(null);
        }
    }

    public static void T(L5.f fVar, P5.d dVar) {
        P5.i iVar = P5.i.f4047d;
        E.e eVar = new E.e(fVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeApp", iVar, null, 4);
        if (dVar != null) {
            eVar.h0(new P5.g(dVar, 3));
        } else {
            eVar.h0(null);
        }
        E.e eVar2 = new E.e(fVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeCore", iVar, null, 4);
        if (dVar != null) {
            eVar2.h0(new P5.g(dVar, 4));
        } else {
            eVar2.h0(null);
        }
        E.e eVar3 = new E.e(fVar, "dev.flutter.pigeon.FirebaseCoreHostApi.optionsFromResource", iVar, null, 4);
        if (dVar != null) {
            eVar3.h0(new P5.g(dVar, 5));
        } else {
            eVar3.h0(null);
        }
    }

    public static boolean a(androidx.camera.core.impl.f0 f0Var, C0501c c0501c) {
        return f0Var.u().h(c0501c);
    }

    public static void b(androidx.camera.core.impl.f0 f0Var, A4.d dVar) {
        f0Var.u().m(dVar);
    }

    public static A0 c(androidx.camera.core.impl.y0 y0Var) {
        return (A0) y0Var.G(androidx.camera.core.impl.y0.f7691Q);
    }

    public static D d(androidx.camera.core.impl.y0 y0Var) {
        D d7 = (D) y0Var.f0(androidx.camera.core.impl.O.f7575x, D.f606c);
        d7.getClass();
        return d7;
    }

    public static androidx.camera.core.impl.F e(androidx.camera.core.impl.f0 f0Var, C0501c c0501c) {
        return f0Var.u().e0(c0501c);
    }

    public static int f(androidx.camera.core.impl.y0 y0Var) {
        return ((Integer) y0Var.f0(androidx.camera.core.impl.y0.f7692R, 0)).intValue();
    }

    public static Set g(androidx.camera.core.impl.f0 f0Var, C0501c c0501c) {
        return f0Var.u().U(c0501c);
    }

    public static int h(androidx.camera.core.impl.y0 y0Var) {
        return ((Integer) y0Var.f0(androidx.camera.core.impl.y0.f7687M, 0)).intValue();
    }

    public static String i(androidx.camera.core.impl.y0 y0Var) {
        return (String) y0Var.G(I.l.f2121i);
    }

    public static String j(androidx.camera.core.impl.y0 y0Var, String str) {
        return (String) y0Var.f0(I.l.f2121i, str);
    }

    public static int k(androidx.camera.core.impl.y0 y0Var) {
        return ((Integer) y0Var.f0(androidx.camera.core.impl.y0.f7693S, 0)).intValue();
    }

    public static boolean l(androidx.camera.core.impl.y0 y0Var) {
        return ((Boolean) y0Var.f0(androidx.camera.core.impl.y0.f7690P, Boolean.FALSE)).booleanValue();
    }

    public static boolean m(androidx.camera.core.impl.y0 y0Var) {
        return ((Boolean) y0Var.f0(androidx.camera.core.impl.y0.f7689O, Boolean.FALSE)).booleanValue();
    }

    public static Set n(androidx.camera.core.impl.f0 f0Var) {
        return f0Var.u().H();
    }

    public static J1.b o(J1.l lVar, byte[] bArr, int i7) {
        A3.H o7 = A3.K.o();
        lVar.l(bArr, 0, i7, J1.k.f2376c, new A.j(o7, 7));
        return new J1.b(o7.g());
    }

    public static Object p(androidx.camera.core.impl.f0 f0Var, C0501c c0501c) {
        return f0Var.u().G(c0501c);
    }

    public static Object q(androidx.camera.core.impl.f0 f0Var, C0501c c0501c, Object obj) {
        return f0Var.u().f0(c0501c, obj);
    }

    public static Object r(androidx.camera.core.impl.f0 f0Var, C0501c c0501c, androidx.camera.core.impl.F f) {
        return f0Var.u().n(c0501c, f);
    }

    public static int s(int i7, int i8, int i9, int i10) {
        return i7 | i8 | i9 | RecognitionOptions.ITF | i10;
    }

    public static int t(int i7) {
        return i7 & 384;
    }

    public static int u(int i7) {
        return i7 & 64;
    }

    public static boolean v(int i7, boolean z7) {
        int i8 = i7 & 7;
        if (i8 != 4 && (!z7 || i8 != 3)) {
            return false;
        }
        return true;
    }

    public static String w(Class cls, StringBuilder sb) {
        sb.append(cls.getCanonicalName());
        return sb.toString();
    }

    public static String x(String str, int i7, int i8, String str2) {
        return str + i7 + str2 + i8;
    }

    public static String y(String str, int i7, String str2, int i8, String str3) {
        return str + i7 + str2 + i8 + str3;
    }

    public static String z(String str, String str2) {
        return str + str2;
    }
}
