package e;

import D.C0054d;
import W.AbstractActivityC0362e;
import W.C0364g;
import W.M;
import W.N;
import W.P;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0570w;
import androidx.lifecycle.EnumC0563o;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0557i;
import androidx.lifecycle.K;
import androidx.lifecycle.O;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import c6.C0644E;
import com.example.appecoactivate.R;
import f5.C0993a;
import g.InterfaceC1000e;
import g0.InterfaceC1003a;
import h0.InterfaceC1045e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import w6.InterfaceC1959a;
import z0.AbstractActivityC2064y;
/* loaded from: classes.dex */
public abstract class n extends AbstractActivityC0362e implements Y, InterfaceC0557i, Z1.e, InterfaceC0919E, InterfaceC1000e, X.g, X.h, M, N, InterfaceC1045e {

    /* renamed from: m0 */
    public static final /* synthetic */ int f10547m0 = 0;

    /* renamed from: X */
    public final l6.g f10548X;

    /* renamed from: Y */
    public final l f10549Y;

    /* renamed from: Z */
    public final CopyOnWriteArrayList f10550Z;

    /* renamed from: b */
    public final C0644E f10551b;

    /* renamed from: c */
    public final R1.j f10552c;

    /* renamed from: d */
    public final C0054d f10553d;

    /* renamed from: e */
    public X f10554e;

    /* renamed from: e0 */
    public final CopyOnWriteArrayList f10555e0;
    public final k f;

    /* renamed from: f0 */
    public final CopyOnWriteArrayList f10556f0;

    /* renamed from: g0 */
    public final CopyOnWriteArrayList f10557g0;

    /* renamed from: h0 */
    public final CopyOnWriteArrayList f10558h0;

    /* renamed from: i0 */
    public final CopyOnWriteArrayList f10559i0;

    /* renamed from: j0 */
    public boolean f10560j0;

    /* renamed from: k0 */
    public boolean f10561k0;

    /* renamed from: l0 */
    public final l6.g f10562l0;

    /* JADX WARN: Type inference failed for: r0v0, types: [c6.E, java.lang.Object] */
    public n() {
        ?? obj = new Object();
        obj.f8442b = new CopyOnWriteArraySet();
        this.f10551b = obj;
        AbstractActivityC2064y abstractActivityC2064y = (AbstractActivityC2064y) this;
        this.f10552c = new R1.j(new RunnableC0923d(abstractActivityC2064y, 0));
        C0054d c0054d = new C0054d((Z1.e) this);
        this.f10553d = c0054d;
        this.f = new k(abstractActivityC2064y);
        this.f10548X = m5.d.m(new m(abstractActivityC2064y, 2));
        new AtomicInteger();
        this.f10549Y = new l(abstractActivityC2064y);
        this.f10550Z = new CopyOnWriteArrayList();
        this.f10555e0 = new CopyOnWriteArrayList();
        this.f10556f0 = new CopyOnWriteArrayList();
        this.f10557g0 = new CopyOnWriteArrayList();
        this.f10558h0 = new CopyOnWriteArrayList();
        this.f10559i0 = new CopyOnWriteArrayList();
        C0570w c0570w = this.f6028a;
        if (c0570w != null) {
            c0570w.a(new C0924e(abstractActivityC2064y, 0));
            this.f6028a.a(new C0924e(abstractActivityC2064y, 1));
            this.f6028a.a(new Z1.b(abstractActivityC2064y, 3));
            c0054d.l();
            O.d(this);
            if (Build.VERSION.SDK_INT <= 23) {
                this.f6028a.a(new u(this));
            }
            ((K5.s) c0054d.f690c).d("android:support:activity-result", new C0925f(abstractActivityC2064y, 0));
            g gVar = new g(abstractActivityC2064y, 0);
            n nVar = (n) obj.f8441a;
            if (nVar != null) {
                gVar.a(nVar);
            }
            ((CopyOnWriteArraySet) obj.f8442b).add(gVar);
            m5.d.m(new m(abstractActivityC2064y, 0));
            this.f10562l0 = m5.d.m(new m(abstractActivityC2064y, 3));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    @Override // e.InterfaceC0919E
    public final C0918D a() {
        return (C0918D) this.f10562l0.a();
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        this.f.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // Z1.e
    public final K5.s c() {
        return (K5.s) this.f10553d.f690c;
    }

    @Override // X.g
    public final void d(InterfaceC1003a listener) {
        kotlin.jvm.internal.j.e(listener, "listener");
        this.f10550Z.add(listener);
    }

    @Override // androidx.lifecycle.InterfaceC0557i
    public final B0.c e() {
        Bundle bundle;
        B0.c cVar = new B0.c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f229a;
        if (application != null) {
            C0993a c0993a = V.f7925e;
            Application application2 = getApplication();
            kotlin.jvm.internal.j.d(application2, "application");
            linkedHashMap.put(c0993a, application2);
        }
        linkedHashMap.put(O.f7908a, this);
        linkedHashMap.put(O.f7909b, this);
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            linkedHashMap.put(O.f7910c, bundle);
        }
        return cVar;
    }

    public final void f() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView3, "window.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView4, "window.decorView");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // androidx.lifecycle.Y
    public final X g() {
        if (getApplication() != null) {
            if (this.f10554e == null) {
                j jVar = (j) getLastNonConfigurationInstance();
                if (jVar != null) {
                    this.f10554e = jVar.f10533a;
                }
                if (this.f10554e == null) {
                    this.f10554e = new X();
                }
            }
            X x7 = this.f10554e;
            kotlin.jvm.internal.j.b(x7);
            return x7;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // androidx.lifecycle.InterfaceC0568u
    public final C0570w h() {
        return this.f6028a;
    }

    @Override // X.g
    public final void i(InterfaceC1003a listener) {
        kotlin.jvm.internal.j.e(listener, "listener");
        this.f10550Z.remove(listener);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i7, int i8, Intent intent) {
        if (!this.f10549Y.a(i7, i8, intent)) {
            super.onActivityResult(i7, i8, intent);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        a().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.j.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator it = this.f10550Z.iterator();
        while (it.hasNext()) {
            ((InterfaceC1003a) it.next()).accept(newConfig);
        }
    }

    @Override // W.AbstractActivityC0362e, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f10553d.m(bundle);
        C0644E c0644e = this.f10551b;
        c0644e.getClass();
        c0644e.f8441a = this;
        Iterator it = ((CopyOnWriteArraySet) c0644e.f8442b).iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i7 = K.f7896b;
        I.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i7, Menu menu) {
        kotlin.jvm.internal.j.e(menu, "menu");
        if (i7 == 0) {
            super.onCreatePanelMenu(i7, menu);
            getMenuInflater();
            Iterator it = ((CopyOnWriteArrayList) this.f10552c.f4683c).iterator();
            while (it.hasNext()) {
                ((z0.E) it.next()).f16634a.k();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem item) {
        kotlin.jvm.internal.j.e(item, "item");
        boolean z7 = true;
        if (super.onMenuItemSelected(i7, item)) {
            return true;
        }
        if (i7 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f10552c.f4683c).iterator();
        while (true) {
            if (it.hasNext()) {
                if (((z0.E) it.next()).f16634a.p()) {
                    break;
                }
            } else {
                z7 = false;
                break;
            }
        }
        return z7;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z7) {
        if (this.f10560j0) {
            return;
        }
        Iterator it = this.f10557g0.iterator();
        while (it.hasNext()) {
            ((InterfaceC1003a) it.next()).accept(new C0364g(z7));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.j.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f10556f0.iterator();
        while (it.hasNext()) {
            ((InterfaceC1003a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i7, Menu menu) {
        kotlin.jvm.internal.j.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f10552c.f4683c).iterator();
        while (it.hasNext()) {
            ((z0.E) it.next()).f16634a.q();
        }
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z7) {
        if (this.f10561k0) {
            return;
        }
        Iterator it = this.f10558h0.iterator();
        while (it.hasNext()) {
            ((InterfaceC1003a) it.next()).accept(new P(z7));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i7, View view, Menu menu) {
        kotlin.jvm.internal.j.e(menu, "menu");
        if (i7 == 0) {
            super.onPreparePanel(i7, view, menu);
            Iterator it = ((CopyOnWriteArrayList) this.f10552c.f4683c).iterator();
            while (it.hasNext()) {
                ((z0.E) it.next()).f16634a.t();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.j.e(permissions, "permissions");
        kotlin.jvm.internal.j.e(grantResults, "grantResults");
        if (!this.f10549Y.a(i7, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            super.onRequestPermissionsResult(i7, permissions, grantResults);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [e.j, java.lang.Object] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        j jVar;
        X x7 = this.f10554e;
        if (x7 == null && (jVar = (j) getLastNonConfigurationInstance()) != null) {
            x7 = jVar.f10533a;
        }
        if (x7 == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f10533a = x7;
        return obj;
    }

    @Override // W.AbstractActivityC0362e, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.j.e(outState, "outState");
        C0570w c0570w = this.f6028a;
        if (c0570w instanceof C0570w) {
            kotlin.jvm.internal.j.c(c0570w, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            c0570w.g(EnumC0563o.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.f10553d.n(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        Iterator it = this.f10555e0.iterator();
        while (it.hasNext()) {
            ((InterfaceC1003a) it.next()).accept(Integer.valueOf(i7));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f10559i0.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (F.f.w()) {
                Trace.beginSection(F.f.D("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            p pVar = (p) this.f10548X.a();
            synchronized (pVar.f10567b) {
                pVar.f10568c = true;
                Iterator it = pVar.f10569d.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1959a) it.next()).invoke();
                }
                pVar.f10569d.clear();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i7) {
        f();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        this.f.a(decorView);
        super.setContentView(i7);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i7) {
        kotlin.jvm.internal.j.e(intent, "intent");
        super.startActivityForResult(intent, i7);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intent, int i7, Intent intent2, int i8, int i9, int i10) {
        kotlin.jvm.internal.j.e(intent, "intent");
        super.startIntentSenderForResult(intent, i7, intent2, i8, i9, i10);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i7, Bundle bundle) {
        kotlin.jvm.internal.j.e(intent, "intent");
        super.startActivityForResult(intent, i7, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intent, int i7, Intent intent2, int i8, int i9, int i10, Bundle bundle) {
        kotlin.jvm.internal.j.e(intent, "intent");
        super.startIntentSenderForResult(intent, i7, intent2, i8, i9, i10, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z7, Configuration newConfig) {
        kotlin.jvm.internal.j.e(newConfig, "newConfig");
        this.f10560j0 = true;
        try {
            super.onMultiWindowModeChanged(z7, newConfig);
            this.f10560j0 = false;
            Iterator it = this.f10557g0.iterator();
            while (it.hasNext()) {
                ((InterfaceC1003a) it.next()).accept(new C0364g(z7));
            }
        } catch (Throwable th) {
            this.f10560j0 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z7, Configuration newConfig) {
        kotlin.jvm.internal.j.e(newConfig, "newConfig");
        this.f10561k0 = true;
        try {
            super.onPictureInPictureModeChanged(z7, newConfig);
            this.f10561k0 = false;
            Iterator it = this.f10558h0.iterator();
            while (it.hasNext()) {
                ((InterfaceC1003a) it.next()).accept(new P(z7));
            }
        } catch (Throwable th) {
            this.f10561k0 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        f();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        this.f.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        this.f.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
