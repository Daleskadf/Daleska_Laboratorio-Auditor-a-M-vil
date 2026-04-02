package B5;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import d5.C0902d;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* renamed from: B5.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035h {

    /* renamed from: a  reason: collision with root package name */
    public AbstractActivityC0032e f360a;

    /* renamed from: b  reason: collision with root package name */
    public C5.c f361b;

    /* renamed from: c  reason: collision with root package name */
    public B f362c;

    /* renamed from: d  reason: collision with root package name */
    public B.a f363d;

    /* renamed from: e  reason: collision with root package name */
    public ViewTreeObserver$OnPreDrawListenerC0034g f364e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f365g;

    /* renamed from: i  reason: collision with root package name */
    public boolean f367i;
    public Integer j;

    /* renamed from: k  reason: collision with root package name */
    public final C0033f f368k = new C0033f(this, 0);

    /* renamed from: h  reason: collision with root package name */
    public boolean f366h = false;

    public C0035h(AbstractActivityC0032e abstractActivityC0032e) {
        this.f360a = abstractActivityC0032e;
    }

    public final void a(C5.g gVar) {
        String b5 = this.f360a.b();
        if (b5 == null || b5.isEmpty()) {
            b5 = (String) ((D5.b) ((F5.d) V2.k.A().f5965b).f1209d).f869c;
        }
        D5.a aVar = new D5.a(b5, this.f360a.f());
        String g3 = this.f360a.g();
        if (g3 == null) {
            AbstractActivityC0032e abstractActivityC0032e = this.f360a;
            abstractActivityC0032e.getClass();
            g3 = d(abstractActivityC0032e.getIntent());
            if (g3 == null) {
                g3 = "/";
            }
        }
        gVar.f588d = aVar;
        gVar.f589e = g3;
        gVar.f = (List) this.f360a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (!this.f360a.k()) {
            AbstractActivityC0032e abstractActivityC0032e = this.f360a;
            abstractActivityC0032e.getClass();
            Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC0032e + " connection to the engine " + abstractActivityC0032e.f353b.f361b + " evicted by another attaching activity");
            C0035h c0035h = abstractActivityC0032e.f353b;
            if (c0035h != null) {
                c0035h.e();
                abstractActivityC0032e.f353b.f();
                return;
            }
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f360a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    public final void c() {
        if (this.f360a != null) {
            return;
        }
        throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
    }

    public final String d(Intent intent) {
        boolean z7;
        Uri data;
        AbstractActivityC0032e abstractActivityC0032e = this.f360a;
        abstractActivityC0032e.getClass();
        try {
            Bundle i7 = abstractActivityC0032e.i();
            int i8 = AbstractC0037j.f369a;
            if (i7 != null && i7.containsKey("flutter_deeplinking_enabled")) {
                z7 = i7.getBoolean("flutter_deeplinking_enabled");
            } else {
                z7 = true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            z7 = false;
        }
        if (z7 && (data = intent.getData()) != null) {
            return data.toString();
        }
        return null;
    }

    public final void e() {
        c();
        if (this.f364e != null) {
            this.f362c.getViewTreeObserver().removeOnPreDrawListener(this.f364e);
            this.f364e = null;
        }
        B b5 = this.f362c;
        if (b5 != null) {
            b5.a();
            B b7 = this.f362c;
            b7.f.remove(this.f368k);
        }
    }

    public final void f() {
        if (!this.f367i) {
            return;
        }
        c();
        this.f360a.getClass();
        this.f360a.getClass();
        AbstractActivityC0032e abstractActivityC0032e = this.f360a;
        abstractActivityC0032e.getClass();
        if (abstractActivityC0032e.isChangingConfigurations()) {
            C5.e eVar = this.f361b.f556d;
            if (eVar.h()) {
                Y5.a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                try {
                    eVar.f577a = true;
                    for (I5.a aVar : ((HashMap) eVar.f579c).values()) {
                        aVar.onDetachedFromActivityForConfigChanges();
                    }
                    io.flutter.plugin.platform.o oVar = ((C5.c) eVar.f580d).f568r;
                    A.f fVar = oVar.f11721g;
                    if (fVar != null) {
                        fVar.f11c = null;
                    }
                    oVar.c();
                    oVar.f11721g = null;
                    oVar.f11718c = null;
                    oVar.f11720e = null;
                    eVar.f = null;
                    eVar.f582g = null;
                    Trace.endSection();
                } finally {
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            }
        } else {
            this.f361b.f556d.f();
        }
        B.a aVar2 = this.f363d;
        if (aVar2 != null) {
            ((A.f) aVar2.f225c).f11c = null;
            this.f363d = null;
        }
        this.f360a.getClass();
        C5.c cVar = this.f361b;
        if (cVar != null) {
            K5.c cVar2 = K5.c.DETACHED;
            K5.d dVar = cVar.f558g;
            dVar.g(cVar2, dVar.f2698b);
        }
        if (this.f360a.k()) {
            C5.c cVar3 = this.f361b;
            Iterator it = cVar3.f569s.iterator();
            while (it.hasNext()) {
                ((C5.b) it.next()).a();
            }
            C5.e eVar2 = cVar3.f556d;
            eVar2.g();
            HashMap hashMap = (HashMap) eVar2.f578b;
            Iterator it2 = new HashSet(hashMap.keySet()).iterator();
            while (it2.hasNext()) {
                Class cls = (Class) it2.next();
                H5.b bVar = (H5.b) hashMap.get(cls);
                if (bVar != null) {
                    Y5.a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                    try {
                        if (bVar instanceof I5.a) {
                            if (eVar2.h()) {
                                ((I5.a) bVar).onDetachedFromActivity();
                            }
                            ((HashMap) eVar2.f579c).remove(cls);
                        }
                        bVar.onDetachedFromEngine((H5.a) eVar2.f581e);
                        hashMap.remove(cls);
                        Trace.endSection();
                    } finally {
                    }
                }
            }
            hashMap.clear();
            while (true) {
                io.flutter.plugin.platform.o oVar2 = cVar3.f568r;
                SparseArray sparseArray = oVar2.f11724k;
                if (sparseArray.size() <= 0) {
                    break;
                }
                oVar2.f11735v.e(sparseArray.keyAt(0));
            }
            ((FlutterJNI) cVar3.f555c.f868b).setPlatformMessageHandler(null);
            FlutterJNI flutterJNI = cVar3.f553a;
            flutterJNI.removeEngineLifecycleListener(cVar3.f570t);
            flutterJNI.setDeferredComponentManager(null);
            flutterJNI.detachFromNativeAndReleaseResources();
            V2.k.A().getClass();
            if (this.f360a.e() != null) {
                if (C0902d.f10353b == null) {
                    C0902d.f10353b = new C0902d();
                }
                C0902d c0902d = C0902d.f10353b;
                c0902d.f10354a.remove(this.f360a.e());
            }
            this.f361b = null;
        }
        this.f367i = false;
    }
}
