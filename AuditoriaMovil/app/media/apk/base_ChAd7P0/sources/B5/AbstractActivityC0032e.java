package B5;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0570w;
import androidx.lifecycle.EnumC0562n;
import androidx.lifecycle.InterfaceC0568u;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.embedding.engine.FlutterJNI;
import j$.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.tika.utils.StringUtils;
/* renamed from: B5.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0032e extends Activity implements InterfaceC0568u {

    /* renamed from: e  reason: collision with root package name */
    public static final int f351e = View.generateViewId();

    /* renamed from: a  reason: collision with root package name */
    public boolean f352a = false;

    /* renamed from: b  reason: collision with root package name */
    public C0035h f353b;

    /* renamed from: c  reason: collision with root package name */
    public final C0570w f354c;

    /* renamed from: d  reason: collision with root package name */
    public final OnBackInvokedCallback f355d;

    public AbstractActivityC0032e() {
        OnBackInvokedCallback c0030c;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 33) {
            c0030c = null;
        } else if (i7 >= 34) {
            c0030c = new C0031d(this);
        } else {
            c0030c = new C0030c(this, 0);
        }
        this.f355d = c0030c;
        this.f354c = new C0570w(this);
    }

    public final String b() {
        String dataString;
        if ((getApplicationInfo().flags & 2) != 0 && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    public final EnumC0036i d() {
        if (getIntent().hasExtra("background_mode")) {
            return EnumC0036i.valueOf(getIntent().getStringExtra("background_mode"));
        }
        return EnumC0036i.opaque;
    }

    public final String e() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public final String f() {
        String str;
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle i7 = i();
            if (i7 != null) {
                str = i7.getString("io.flutter.Entrypoint");
            } else {
                str = null;
            }
            if (str == null) {
                return "main";
            }
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public final String g() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle i7 = i();
            if (i7 == null) {
                return null;
            }
            return i7.getString("io.flutter.InitialRoute");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0568u
    public final C0570w h() {
        return this.f354c;
    }

    public final Bundle i() {
        return getPackageManager().getActivityInfo(getComponentName(), RecognitionOptions.ITF).metaData;
    }

    public final void j(boolean z7) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcher2;
        if (z7 && !this.f352a) {
            if (Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.f355d);
                this.f352a = true;
            }
        } else if (!z7 && this.f352a && Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f355d);
            this.f352a = false;
        }
    }

    public final boolean k() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        if (e() == null && !this.f353b.f) {
            return getIntent().getBooleanExtra("destroy_engine_with_activity", true);
        }
        return booleanExtra;
    }

    public final boolean l() {
        if (getIntent().hasExtra("enable_state_restoration")) {
            return getIntent().getBooleanExtra("enable_state_restoration", false);
        }
        if (e() != null) {
            return false;
        }
        return true;
    }

    public final boolean m(String str) {
        C0035h c0035h = this.f353b;
        if (c0035h == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + StringUtils.SPACE + str + " called after release.");
            return false;
        } else if (!c0035h.f367i) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + StringUtils.SPACE + str + " called after detach.");
            return false;
        } else {
            return true;
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        if (m("onActivityResult")) {
            C0035h c0035h = this.f353b;
            c0035h.c();
            if (c0035h.f361b != null) {
                Objects.toString(intent);
                C5.e eVar = c0035h.f361b.f556d;
                if (eVar.h()) {
                    Y5.a.b("FlutterEngineConnectionRegistry#onActivityResult");
                    try {
                        C5.d dVar = (C5.d) eVar.f582g;
                        dVar.getClass();
                        Iterator it = new HashSet(dVar.f574d).iterator();
                        while (true) {
                            boolean z7 = false;
                            while (it.hasNext()) {
                                if (((L5.t) it.next()).onActivityResult(i7, i8, intent) || z7) {
                                    z7 = true;
                                }
                            }
                            Trace.endSection();
                            return;
                        }
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (m("onBackPressed")) {
            C0035h c0035h = this.f353b;
            c0035h.c();
            C5.c cVar = c0035h.f361b;
            if (cVar != null) {
                ((L5.r) cVar.f560i.f218b).a("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:113|114|(1:116)|117|118|(1:120)|121|(1:123)(1:255)|124|(2:126|(1:128)(2:129|(1:131)(1:132)))|133|(6:135|136|137|(4:140|(3:146|147|148)(3:142|143|144)|145|138)|149|150)(1:254)|151|(1:153)|154|(1:156)(1:245)|157|(1:159)(1:244)|160|(1:162)(1:243)|(5:164|(1:166)(1:233)|167|(1:169)(1:232)|170)(5:234|(1:236)(1:242)|237|(1:239)(1:241)|240)|171|(6:173|(1:175)|176|(4:178|(1:180)(1:189)|181|(3:183|(1:185)|186)(2:187|188))|190|191)|192|(1:194)|195|(1:197)|198|199|200|201|(2:(1:228)(1:205)|206)(1:229)|207|(2:208|(1:210)(1:211))|212|(2:213|(1:215)(1:216))|(2:217|(1:219)(1:220))|221|(6:223|(1:225)|176|(0)|190|191)(2:226|227)) */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x048e, code lost:
        android.util.Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
     */
    /* JADX WARN: Removed duplicated region for block: B:231:0x059f  */
    /* JADX WARN: Type inference failed for: r4v2, types: [B5.s, android.view.TextureView] */
    /* JADX WARN: Type inference failed for: r5v19, types: [android.view.View, io.flutter.embedding.engine.renderer.o] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 1549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B5.AbstractActivityC0032e.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onDestroy();
        if (m("onDestroy")) {
            this.f353b.e();
            this.f353b.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f355d);
            this.f352a = false;
        }
        C0035h c0035h = this.f353b;
        if (c0035h != null) {
            c0035h.f360a = null;
            c0035h.f361b = null;
            c0035h.f362c = null;
            c0035h.f363d = null;
            this.f353b = null;
        }
        this.f354c.e(EnumC0562n.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (m("onNewIntent")) {
            C0035h c0035h = this.f353b;
            c0035h.c();
            C5.c cVar = c0035h.f361b;
            if (cVar != null) {
                C5.e eVar = cVar.f556d;
                if (eVar.h()) {
                    Y5.a.b("FlutterEngineConnectionRegistry#onNewIntent");
                    try {
                        Iterator it = ((C5.d) eVar.f582g).f575e.iterator();
                        while (it.hasNext()) {
                            ((L5.u) it.next()).onNewIntent(intent);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
                }
                String d7 = c0035h.d(intent);
                if (d7 != null && !d7.isEmpty()) {
                    A4.c cVar2 = c0035h.f361b.f560i;
                    cVar2.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("location", d7);
                    ((L5.r) cVar2.f218b).a("pushRouteInformation", hashMap, null);
                    return;
                }
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (m("onPause")) {
            C0035h c0035h = this.f353b;
            c0035h.c();
            c0035h.f360a.getClass();
            C5.c cVar = c0035h.f361b;
            if (cVar != null) {
                K5.c cVar2 = K5.c.INACTIVE;
                K5.d dVar = cVar.f558g;
                dVar.g(cVar2, dVar.f2698b);
            }
        }
        this.f354c.e(EnumC0562n.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (m("onPostResume")) {
            C0035h c0035h = this.f353b;
            c0035h.c();
            if (c0035h.f361b != null) {
                B.a aVar = c0035h.f363d;
                if (aVar != null) {
                    aVar.i();
                }
                c0035h.f361b.f568r.j();
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        if (m("onRequestPermissionsResult")) {
            C0035h c0035h = this.f353b;
            c0035h.c();
            if (c0035h.f361b != null) {
                Arrays.toString(strArr);
                Arrays.toString(iArr);
                C5.e eVar = c0035h.f361b.f556d;
                if (eVar.h()) {
                    Y5.a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
                    try {
                        Iterator it = ((C5.d) eVar.f582g).f573c.iterator();
                        while (true) {
                            boolean z7 = false;
                            while (it.hasNext()) {
                                if (((L5.v) it.next()).onRequestPermissionsResult(i7, strArr, iArr) || z7) {
                                    z7 = true;
                                }
                            }
                            Trace.endSection();
                            return;
                        }
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f354c.e(EnumC0562n.ON_RESUME);
        if (m("onResume")) {
            C0035h c0035h = this.f353b;
            c0035h.c();
            c0035h.f360a.getClass();
            C5.c cVar = c0035h.f361b;
            if (cVar != null) {
                K5.c cVar2 = K5.c.RESUMED;
                K5.d dVar = cVar.f558g;
                dVar.g(cVar2, dVar.f2698b);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (m("onSaveInstanceState")) {
            C0035h c0035h = this.f353b;
            c0035h.c();
            if (c0035h.f360a.l()) {
                bundle.putByteArray("framework", (byte[]) c0035h.f361b.f561k.f2738d);
            }
            c0035h.f360a.getClass();
            Bundle bundle2 = new Bundle();
            C5.e eVar = c0035h.f361b.f556d;
            if (eVar.h()) {
                Y5.a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    ((C5.d) eVar.f582g).c(bundle2);
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            }
            bundle.putBundle("plugins", bundle2);
            if (c0035h.f360a.e() != null && !c0035h.f360a.k()) {
                bundle.putBoolean("enableOnBackInvokedCallbackState", c0035h.f360a.f352a);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() {
        /*
            r6 = this;
            super.onStart()
            androidx.lifecycle.w r0 = r6.f354c
            androidx.lifecycle.n r1 = androidx.lifecycle.EnumC0562n.ON_START
            r0.e(r1)
            java.lang.String r0 = "onStart"
            boolean r0 = r6.m(r0)
            if (r0 == 0) goto Lc4
            B5.h r0 = r6.f353b
            r0.c()
            B5.e r1 = r0.f360a
            java.lang.String r1 = r1.e()
            if (r1 == 0) goto L21
            goto Lb7
        L21:
            C5.c r1 = r0.f361b
            D5.b r1 = r1.f555c
            boolean r1 = r1.f867a
            if (r1 == 0) goto L2b
            goto Lb7
        L2b:
            B5.e r1 = r0.f360a
            java.lang.String r1 = r1.g()
            if (r1 != 0) goto L44
            B5.e r1 = r0.f360a
            r1.getClass()
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r1 = r0.d(r1)
            if (r1 != 0) goto L44
            java.lang.String r1 = "/"
        L44:
            B5.e r2 = r0.f360a
            r2.getClass()
            r3 = 0
            android.os.Bundle r2 = r2.i()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L57
            if (r2 == 0) goto L57
            java.lang.String r4 = "io.flutter.EntrypointUri"
            java.lang.String r2 = r2.getString(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L57
            goto L58
        L57:
            r2 = r3
        L58:
            B5.e r4 = r0.f360a
            r4.f()
            C5.c r4 = r0.f361b
            A4.c r4 = r4.f560i
            java.lang.Object r4 = r4.f218b
            L5.r r4 = (L5.r) r4
            java.lang.String r5 = "setInitialRoute"
            r4.a(r5, r1, r3)
            B5.e r1 = r0.f360a
            java.lang.String r1 = r1.b()
            if (r1 == 0) goto L78
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L88
        L78:
            V2.k r1 = V2.k.A()
            java.lang.Object r1 = r1.f5965b
            F5.d r1 = (F5.d) r1
            java.lang.Object r1 = r1.f1209d
            D5.b r1 = (D5.b) r1
            java.lang.Object r1 = r1.f869c
            java.lang.String r1 = (java.lang.String) r1
        L88:
            if (r2 != 0) goto L96
            D5.a r2 = new D5.a
            B5.e r3 = r0.f360a
            java.lang.String r3 = r3.f()
            r2.<init>(r1, r3)
            goto La2
        L96:
            D5.a r3 = new D5.a
            B5.e r4 = r0.f360a
            java.lang.String r4 = r4.f()
            r3.<init>(r1, r2, r4)
            r2 = r3
        La2:
            C5.c r1 = r0.f361b
            D5.b r1 = r1.f555c
            B5.e r3 = r0.f360a
            android.content.Intent r3 = r3.getIntent()
            java.lang.String r4 = "dart_entrypoint_args"
            java.io.Serializable r3 = r3.getSerializableExtra(r4)
            java.util.List r3 = (java.util.List) r3
            r1.j(r2, r3)
        Lb7:
            java.lang.Integer r1 = r0.j
            if (r1 == 0) goto Lc4
            B5.B r0 = r0.f362c
            int r1 = r1.intValue()
            r0.setVisibility(r1)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B5.AbstractActivityC0032e.onStart():void");
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (m("onStop")) {
            C0035h c0035h = this.f353b;
            c0035h.c();
            c0035h.f360a.getClass();
            C5.c cVar = c0035h.f361b;
            if (cVar != null) {
                K5.c cVar2 = K5.c.PAUSED;
                K5.d dVar = cVar.f558g;
                dVar.g(cVar2, dVar.f2698b);
            }
            c0035h.j = Integer.valueOf(c0035h.f362c.getVisibility());
            c0035h.f362c.setVisibility(8);
            C5.c cVar3 = c0035h.f361b;
            if (cVar3 != null) {
                cVar3.f554b.e(40);
            }
        }
        this.f354c.e(EnumC0562n.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        if (m("onTrimMemory")) {
            C0035h c0035h = this.f353b;
            c0035h.c();
            C5.c cVar = c0035h.f361b;
            if (cVar != null) {
                if (c0035h.f366h && i7 >= 10) {
                    FlutterJNI flutterJNI = (FlutterJNI) cVar.f555c.f868b;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    C5.i iVar = c0035h.f361b.f566p;
                    iVar.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("type", "memoryPressure");
                    ((E.e) iVar.f593b).f0(hashMap, null);
                }
                c0035h.f361b.f554b.e(i7);
                io.flutter.plugin.platform.o oVar = c0035h.f361b.f568r;
                if (i7 < 40) {
                    oVar.getClass();
                    return;
                }
                for (io.flutter.plugin.platform.A a7 : oVar.f11723i.values()) {
                    a7.f11682h.setSurface(null);
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (m("onUserLeaveHint")) {
            C0035h c0035h = this.f353b;
            c0035h.c();
            C5.c cVar = c0035h.f361b;
            if (cVar != null) {
                C5.e eVar = cVar.f556d;
                if (eVar.h()) {
                    Y5.a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
                    try {
                        Iterator it = ((C5.d) eVar.f582g).f.iterator();
                        if (!it.hasNext()) {
                            Trace.endSection();
                            return;
                        } else if (it.next() == null) {
                            throw null;
                        } else {
                            throw new ClassCastException();
                        }
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z7) {
        super.onWindowFocusChanged(z7);
        if (m("onWindowFocusChanged")) {
            C0035h c0035h = this.f353b;
            c0035h.c();
            c0035h.f360a.getClass();
            C5.c cVar = c0035h.f361b;
            if (cVar != null) {
                K5.d dVar = cVar.f558g;
                if (z7) {
                    dVar.g((K5.c) dVar.f2699c, true);
                } else {
                    dVar.g((K5.c) dVar.f2699c, false);
                }
            }
        }
    }
}
