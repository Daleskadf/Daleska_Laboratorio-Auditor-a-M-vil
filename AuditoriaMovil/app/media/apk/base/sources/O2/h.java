package o2;

import R1.j;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.Log;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import e0.C0927b;
import g0.InterfaceC1003a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import l2.k;
import m6.p;
import o2.AbstractC1555g;
import o2.C1554f;
import o2.h;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final SidecarInterface f14559a;

    /* renamed from: b  reason: collision with root package name */
    public final C1554f f14560b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f14561c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f14562d;

    /* renamed from: e  reason: collision with root package name */
    public R1.j f14563e;

    public h(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        SidecarInterface b5 = AbstractC1555g.b(context);
        C1554f c1554f = new C1554f();
        this.f14559a = b5;
        this.f14560b = c1554f;
        this.f14561c = new LinkedHashMap();
        this.f14562d = new LinkedHashMap();
    }

    public final SidecarInterface d() {
        return this.f14559a;
    }

    public final k e(Activity activity) {
        SidecarWindowLayoutInfo sidecarWindowLayoutInfo;
        SidecarDeviceState sidecarDeviceState;
        IBinder a7 = AbstractC1555g.a(activity);
        if (a7 == null) {
            return new k(p.f14074a);
        }
        SidecarInterface sidecarInterface = this.f14559a;
        if (sidecarInterface != null) {
            sidecarWindowLayoutInfo = sidecarInterface.getWindowLayoutInfo(a7);
        } else {
            sidecarWindowLayoutInfo = null;
        }
        SidecarInterface sidecarInterface2 = this.f14559a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f14560b.f(sidecarWindowLayoutInfo, sidecarDeviceState);
    }

    public final void f(Activity activity) {
        boolean z7;
        SidecarInterface sidecarInterface;
        IBinder a7 = AbstractC1555g.a(activity);
        if (a7 == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f14559a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(a7);
        }
        LinkedHashMap linkedHashMap = this.f14562d;
        InterfaceC1003a interfaceC1003a = (InterfaceC1003a) linkedHashMap.get(activity);
        if (interfaceC1003a != null) {
            if (activity instanceof X.g) {
                ((X.g) activity).i(interfaceC1003a);
            }
            linkedHashMap.remove(activity);
        }
        R1.j jVar = this.f14563e;
        if (jVar != null) {
            jVar.i0(activity);
        }
        LinkedHashMap linkedHashMap2 = this.f14561c;
        if (linkedHashMap2.size() == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        linkedHashMap2.remove(a7);
        if (z7 && (sidecarInterface = this.f14559a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(true);
        }
    }

    public final void g(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f14561c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f14559a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f14559a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        R1.j jVar = this.f14563e;
        if (jVar != null) {
            jVar.K0(activity, e(activity));
        }
        LinkedHashMap linkedHashMap2 = this.f14562d;
        if (linkedHashMap2.get(activity) == null && (activity instanceof X.g)) {
            I.d dVar = new I.d(3, this, activity);
            linkedHashMap2.put(activity, dVar);
            ((X.g) activity).d(dVar);
        }
    }

    public final void h(C0927b c0927b) {
        this.f14563e = new R1.j(c0927b);
        SidecarInterface sidecarInterface = this.f14559a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f14560b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
                    LinkedHashMap linkedHashMap;
                    j jVar;
                    C1554f c1554f;
                    SidecarInterface d7;
                    kotlin.jvm.internal.j.e(newDeviceState, "newDeviceState");
                    linkedHashMap = h.this.f14561c;
                    Collection<Activity> values = linkedHashMap.values();
                    h hVar = h.this;
                    for (Activity activity : values) {
                        IBinder a7 = AbstractC1555g.a(activity);
                        SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                        if (a7 != null && (d7 = hVar.d()) != null) {
                            sidecarWindowLayoutInfo = d7.getWindowLayoutInfo(a7);
                        }
                        jVar = hVar.f14563e;
                        if (jVar != null) {
                            c1554f = hVar.f14560b;
                            jVar.K0(activity, c1554f.f(sidecarWindowLayoutInfo, newDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
                    LinkedHashMap linkedHashMap;
                    C1554f c1554f;
                    SidecarDeviceState sidecarDeviceState;
                    j jVar;
                    kotlin.jvm.internal.j.e(windowToken, "windowToken");
                    kotlin.jvm.internal.j.e(newLayout, "newLayout");
                    linkedHashMap = h.this.f14561c;
                    Activity activity = (Activity) linkedHashMap.get(windowToken);
                    if (activity != null) {
                        c1554f = h.this.f14560b;
                        SidecarInterface d7 = h.this.d();
                        if (d7 == null || (sidecarDeviceState = d7.getDeviceState()) == null) {
                            sidecarDeviceState = new SidecarDeviceState();
                        }
                        k f = c1554f.f(newLayout, sidecarDeviceState);
                        jVar = h.this.f14563e;
                        if (jVar != null) {
                            jVar.K0(activity, f);
                            return;
                        }
                        return;
                    }
                    Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                }
            }));
        }
    }

    public final boolean i() {
        Method method;
        Class<?> cls;
        Method method2;
        Class<?> cls2;
        Method method3;
        Class<?> cls3;
        Method method4;
        Class<?> cls4;
        Class<?> cls5;
        Class<?> cls6;
        Class<?> cls7;
        Class<?> cls8;
        try {
            SidecarInterface sidecarInterface = this.f14559a;
            if (sidecarInterface != null && (cls8 = sidecarInterface.getClass()) != null) {
                method = cls8.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            } else {
                method = null;
            }
            if (method != null) {
                cls = method.getReturnType();
            } else {
                cls = null;
            }
            Class cls9 = Void.TYPE;
            if (kotlin.jvm.internal.j.a(cls, cls9)) {
                SidecarInterface sidecarInterface2 = this.f14559a;
                if (sidecarInterface2 != null) {
                    sidecarInterface2.getDeviceState();
                }
                SidecarInterface sidecarInterface3 = this.f14559a;
                if (sidecarInterface3 != null) {
                    sidecarInterface3.onDeviceStateListenersChanged(true);
                }
                SidecarInterface sidecarInterface4 = this.f14559a;
                if (sidecarInterface4 != null && (cls7 = sidecarInterface4.getClass()) != null) {
                    method2 = cls7.getMethod("getWindowLayoutInfo", IBinder.class);
                } else {
                    method2 = null;
                }
                if (method2 != null) {
                    cls2 = method2.getReturnType();
                } else {
                    cls2 = null;
                }
                if (kotlin.jvm.internal.j.a(cls2, SidecarWindowLayoutInfo.class)) {
                    SidecarInterface sidecarInterface5 = this.f14559a;
                    if (sidecarInterface5 != null && (cls6 = sidecarInterface5.getClass()) != null) {
                        method3 = cls6.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
                    } else {
                        method3 = null;
                    }
                    if (method3 != null) {
                        cls3 = method3.getReturnType();
                    } else {
                        cls3 = null;
                    }
                    if (kotlin.jvm.internal.j.a(cls3, cls9)) {
                        SidecarInterface sidecarInterface6 = this.f14559a;
                        if (sidecarInterface6 != null && (cls5 = sidecarInterface6.getClass()) != null) {
                            method4 = cls5.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
                        } else {
                            method4 = null;
                        }
                        if (method4 != null) {
                            cls4 = method4.getReturnType();
                        } else {
                            cls4 = null;
                        }
                        if (kotlin.jvm.internal.j.a(cls4, cls9)) {
                            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
                            try {
                                sidecarDeviceState.posture = 3;
                            } catch (NoSuchFieldError unused) {
                                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                                kotlin.jvm.internal.j.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                                if (((Integer) invoke).intValue() != 3) {
                                    throw new Exception("Invalid device posture getter/setter");
                                }
                            }
                            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
                            Rect rect = sidecarDisplayFeature.getRect();
                            kotlin.jvm.internal.j.d(rect, "displayFeature.rect");
                            sidecarDisplayFeature.setRect(rect);
                            sidecarDisplayFeature.getType();
                            sidecarDisplayFeature.setType(1);
                            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
                            try {
                                List list = sidecarWindowLayoutInfo.displayFeatures;
                            } catch (NoSuchFieldError unused2) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(sidecarDisplayFeature);
                                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                                Object invoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                                kotlin.jvm.internal.j.c(invoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                                if (!kotlin.jvm.internal.j.a(arrayList, (List) invoke2)) {
                                    throw new Exception("Invalid display feature getter/setter");
                                }
                            }
                            return true;
                        }
                        throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + cls4);
                    }
                    throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + cls3);
                }
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + cls2);
            }
            throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + cls);
        } catch (Throwable unused3) {
            return false;
        }
    }
}
