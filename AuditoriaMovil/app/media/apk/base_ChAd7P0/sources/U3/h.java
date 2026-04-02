package U3;

import a6.t0;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import c4.C0632a;
import c4.C0634c;
import c4.C0638g;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C0730d;
import com.google.android.gms.common.internal.I;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.M;
import com.google.firebase.provider.FirebaseInitProvider;
import f3.AbstractC0989b;
import f5.C0993a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.tika.utils.StringUtils;
import w4.InterfaceC1956b;
import x4.C1997a;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f5747k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public static final S.f f5748l = new S.k(0);

    /* renamed from: a  reason: collision with root package name */
    public final Context f5749a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5750b;

    /* renamed from: c  reason: collision with root package name */
    public final k f5751c;

    /* renamed from: d  reason: collision with root package name */
    public final C0638g f5752d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f5753e;
    public final AtomicBoolean f;

    /* renamed from: g  reason: collision with root package name */
    public final c4.n f5754g;

    /* renamed from: h  reason: collision with root package name */
    public final InterfaceC1956b f5755h;

    /* renamed from: i  reason: collision with root package name */
    public final CopyOnWriteArrayList f5756i;
    public final CopyOnWriteArrayList j;

    public h(k kVar, Context context, String str) {
        boolean z7;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f5753e = atomicBoolean;
        this.f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f5756i = copyOnWriteArrayList;
        this.j = new CopyOnWriteArrayList();
        this.f5749a = context;
        I.e(str);
        this.f5750b = str;
        this.f5751c = kVar;
        a aVar = FirebaseInitProvider.f9855a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList z8 = new t0(5, context, new A.m(ComponentDiscoveryService.class, 25)).z();
        Trace.endSection();
        Trace.beginSection("Runtime");
        d4.k kVar2 = d4.k.INSTANCE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(z8);
        arrayList.add(new C0634c(new FirebaseCommonRegistrar(), 1));
        arrayList.add(new C0634c(new ExecutorsRegistrar(), 1));
        arrayList2.add(C0632a.c(context, Context.class, new Class[0]));
        arrayList2.add(C0632a.c(this, h.class, new Class[0]));
        arrayList2.add(C0632a.c(kVar, k.class, new Class[0]));
        C0993a c0993a = new C0993a(3);
        if (Build.VERSION.SDK_INT >= 24) {
            z7 = X.a.g(context);
        } else {
            z7 = true;
        }
        if (z7 && FirebaseInitProvider.f9856b.get()) {
            arrayList2.add(C0632a.c(aVar, a.class, new Class[0]));
        }
        C0638g c0638g = new C0638g(kVar2, arrayList, arrayList2, c0993a);
        this.f5752d = c0638g;
        Trace.endSection();
        this.f5754g = new c4.n(new d(0, this, context));
        this.f5755h = c0638g.e(v4.c.class);
        e eVar = new e(this);
        a();
        if (atomicBoolean.get()) {
            ComponentCallbacks2C0730d.f9232e.f9233a.get();
        }
        copyOnWriteArrayList.add(eVar);
        Trace.endSection();
    }

    public static ArrayList c() {
        ArrayList arrayList = new ArrayList();
        synchronized (f5747k) {
            try {
                Iterator it = ((S.e) f5748l.values()).iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    hVar.a();
                    arrayList.add(hVar.f5750b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static h d() {
        h hVar;
        synchronized (f5747k) {
            try {
                hVar = (h) f5748l.get("[DEFAULT]");
                if (hVar != null) {
                    ((v4.c) hVar.f5755h.get()).b();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + AbstractC0989b.b() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public static h e(String str) {
        h hVar;
        ArrayList c8;
        String str2;
        synchronized (f5747k) {
            try {
                hVar = (h) f5748l.get(str.trim());
                if (hVar != null) {
                    ((v4.c) hVar.f5755h.get()).b();
                } else {
                    if (c().isEmpty()) {
                        str2 = StringUtils.EMPTY;
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", c8);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
            } finally {
            }
        }
        return hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.common.api.internal.c, java.lang.Object] */
    public static h h(k kVar, Context context, String str) {
        h hVar;
        AtomicReference atomicReference = f.f5744a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = f.f5744a;
            if (atomicReference2.get() == null) {
                ?? obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        ComponentCallbacks2C0730d.b(application);
                        ComponentCallbacks2C0730d.f9232e.a(obj);
                        break;
                    } else if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f5747k) {
            S.f fVar = f5748l;
            I.k("FirebaseApp name " + trim + " already exists!", !fVar.containsKey(trim));
            I.j(context, "Application context cannot be null.");
            hVar = new h(kVar, context, trim);
            fVar.put(trim, hVar);
        }
        hVar.g();
        return hVar;
    }

    public static h i(Context context) {
        synchronized (f5747k) {
            try {
                if (f5748l.containsKey("[DEFAULT]")) {
                    return d();
                }
                k a7 = k.a(context);
                if (a7 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return h(a7, context, "[DEFAULT]");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        I.k("FirebaseApp was deleted", !this.f.get());
    }

    public final void b() {
        if (!this.f.compareAndSet(false, true)) {
            return;
        }
        synchronized (f5747k) {
            f5748l.remove(this.f5750b);
        }
        k();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        hVar.a();
        return this.f5750b.equals(hVar.f5750b);
    }

    public final String f() {
        String encodeToString;
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f5750b.getBytes(Charset.defaultCharset());
        String str = null;
        if (bytes == null) {
            encodeToString = null;
        } else {
            encodeToString = Base64.encodeToString(bytes, 11);
        }
        sb.append(encodeToString);
        sb.append("+");
        a();
        byte[] bytes2 = this.f5751c.f5758b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str);
        return sb.toString();
    }

    public final void g() {
        boolean z7;
        int i7 = Build.VERSION.SDK_INT;
        Context context = this.f5749a;
        if (i7 >= 24) {
            z7 = X.a.g(context);
        } else {
            z7 = true;
        }
        String str = this.f5750b;
        if (!z7) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(str);
            Log.i("FirebaseApp", sb.toString());
            AtomicReference atomicReference = g.f5745b;
            if (atomicReference.get() == null) {
                g gVar = new g(context);
                while (!atomicReference.compareAndSet(null, gVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(gVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(str);
        Log.i("FirebaseApp", sb2.toString());
        a();
        this.f5752d.i("[DEFAULT]".equals(str));
        ((v4.c) this.f5755h.get()).b();
    }

    public final int hashCode() {
        return this.f5750b.hashCode();
    }

    public final void j(boolean z7) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f5756i.iterator();
        while (it.hasNext()) {
            h hVar = ((e) it.next()).f5743a;
            if (!z7) {
                ((v4.c) hVar.f5755h.get()).b();
            } else {
                hVar.getClass();
            }
        }
    }

    public final void k() {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            M m7 = (M) it.next();
            synchronized (m7) {
                Iterator it2 = new ArrayList(m7.f9774a.entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    ((FirebaseFirestore) entry.getValue()).j();
                    m5.d.i("terminate() should have removed its entry from `instances` for key: %s", !m7.f9774a.containsKey(entry.getKey()), entry.getKey());
                }
            }
        }
    }

    public final void l(Boolean bool) {
        a();
        C1997a c1997a = (C1997a) this.f5754g.get();
        synchronized (c1997a) {
            try {
                if (bool == null) {
                    c1997a.f16502b.edit().remove("firebase_data_collection_default_enabled").apply();
                    c1997a.b(c1997a.a());
                } else {
                    boolean equals = Boolean.TRUE.equals(bool);
                    c1997a.f16502b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
                    c1997a.b(equals);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        t0 t0Var = new t0(this);
        t0Var.m(this.f5750b, "name");
        t0Var.m(this.f5751c, "options");
        return t0Var.toString();
    }
}
