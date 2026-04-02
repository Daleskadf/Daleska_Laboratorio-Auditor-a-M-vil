package io.flutter.plugins.firebase.auth;

import B5.AbstractActivityC0032e;
import androidx.datastore.preferences.protobuf.Y;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import e0.C0927b;
import f5.C0993a;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
/* renamed from: io.flutter.plugins.firebase.auth.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1140c implements FlutterFirebasePlugin, H5.b, I5.a {

    /* renamed from: Z  reason: collision with root package name */
    public static final HashMap f11846Z = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public L5.f f11849a;

    /* renamed from: b  reason: collision with root package name */
    public L5.r f11850b;

    /* renamed from: c  reason: collision with root package name */
    public AbstractActivityC0032e f11851c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f11852d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final C0927b f11853e = new Object();
    public final C1147j f = new Object();

    /* renamed from: X  reason: collision with root package name */
    public final C1148k f11847X = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public final C0993a f11848Y = new C0993a(18);

    public static FirebaseAuth a(C1150m c1150m) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(U3.h.e(c1150m.f11875a));
        String str = c1150m.f11876b;
        if (str != null) {
            firebaseAuth.g(str);
        }
        String str2 = (String) P5.d.f4034c.get(c1150m.f11875a);
        if (str2 != null) {
            firebaseAuth.e(str2);
        }
        String str3 = c1150m.f11877c;
        if (str3 != null) {
            firebaseAuth.e(str3);
        }
        return firebaseAuth;
    }

    public final void b() {
        HashMap hashMap = this.f11852d;
        for (L5.j jVar : hashMap.keySet()) {
            L5.i iVar = (L5.i) hashMap.get(jVar);
            if (iVar != null) {
                iVar.b();
            }
            jVar.a(null);
        }
        hashMap.clear();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new com.google.firebase.firestore.S(7, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task getPluginConstantsForFirebaseApp(U3.h hVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new P5.f(hVar, taskCompletionSource, 1));
        return taskCompletionSource.getTask();
    }

    @Override // I5.a
    public final void onAttachedToActivity(I5.b bVar) {
        AbstractActivityC0032e abstractActivityC0032e = ((C5.d) bVar).f571a;
        this.f11851c = abstractActivityC0032e;
        this.f11853e.f10587a = abstractActivityC0032e;
    }

    @Override // H5.b
    public final void onAttachedToEngine(H5.a aVar) {
        L5.f fVar = aVar.f2030b;
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_auth", this);
        this.f11850b = new L5.r(fVar, "plugins.flutter.io/firebase_auth");
        Y.v(fVar, this);
        Y.t(fVar, this.f11853e);
        C1147j c1147j = this.f;
        Y.y(fVar, c1147j);
        Y.w(fVar, c1147j);
        Y.x(fVar, this.f11847X);
        Y.u(fVar, this.f11848Y);
        this.f11849a = fVar;
    }

    @Override // I5.a
    public final void onDetachedFromActivity() {
        this.f11851c = null;
        this.f11853e.f10587a = null;
    }

    @Override // I5.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f11851c = null;
        this.f11853e.f10587a = null;
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a aVar) {
        this.f11850b.b(null);
        Y.v(this.f11849a, null);
        Y.t(this.f11849a, null);
        Y.y(this.f11849a, null);
        Y.w(this.f11849a, null);
        Y.x(this.f11849a, null);
        Y.u(this.f11849a, null);
        this.f11850b = null;
        this.f11849a = null;
        b();
    }

    @Override // I5.a
    public final void onReattachedToActivityForConfigChanges(I5.b bVar) {
        AbstractActivityC0032e abstractActivityC0032e = ((C5.d) bVar).f571a;
        this.f11851c = abstractActivityC0032e;
        this.f11853e.f10587a = abstractActivityC0032e;
    }
}
