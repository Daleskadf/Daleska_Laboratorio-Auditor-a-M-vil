package io.flutter.plugins.firebase.firestore;

import D.AbstractC0059i;
import a.AbstractC0412a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.C0814p;
import com.google.firebase.firestore.EnumC0815q;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.K;
import com.google.firebase.firestore.L;
import com.google.firebase.firestore.P;
import com.google.firebase.firestore.S;
import com.google.firebase.firestore.Z;
import com.google.firebase.firestore.a0;
import com.google.firebase.firestore.b0;
import com.google.firebase.firestore.g0;
import io.flutter.plugins.firebase.auth.C1154q;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.flutter.plugins.firebase.firestore.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1162g implements FlutterFirebasePlugin, H5.b, I5.a {

    /* renamed from: Y  reason: collision with root package name */
    public static final HashMap f11922Y = new HashMap();

    /* renamed from: Z  reason: collision with root package name */
    public static final HashMap f11923Z = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public L5.f f11926b;

    /* renamed from: a  reason: collision with root package name */
    public final L5.y f11925a = new L5.y(C1160e.f11918d);

    /* renamed from: c  reason: collision with root package name */
    public final AtomicReference f11927c = new AtomicReference(null);

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f11928d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f11929e = new HashMap();
    public final HashMap f = new HashMap();

    /* renamed from: X  reason: collision with root package name */
    public final HashMap f11924X = new HashMap();

    public static void a(FirebaseFirestore firebaseFirestore) {
        HashMap hashMap = f11922Y;
        synchronized (hashMap) {
            try {
                if (((C1158c) hashMap.get(firebaseFirestore)) != null) {
                    hashMap.remove(firebaseFirestore);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C1158c b(FirebaseFirestore firebaseFirestore) {
        C1158c c1158c;
        HashMap hashMap = f11922Y;
        synchronized (hashMap) {
            c1158c = (C1158c) hashMap.get(firebaseFirestore);
        }
        return c1158c;
    }

    public static FirebaseFirestore c(q qVar) {
        synchronized (f11922Y) {
            try {
                FirebaseFirestore d7 = d(qVar.f11944a, qVar.f11946c);
                if (d7 != null) {
                    return d7;
                }
                FirebaseFirestore e7 = FirebaseFirestore.e(U3.h.e(qVar.f11944a), qVar.f11946c);
                e7.h(e(qVar));
                i(e7, qVar.f11946c);
                return e7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static FirebaseFirestore d(String str, String str2) {
        HashMap hashMap = f11922Y;
        synchronized (hashMap) {
            try {
                for (Map.Entry entry : hashMap.entrySet()) {
                    U3.h hVar = ((C1158c) entry.getValue()).f11914a.f9751g;
                    hVar.a();
                    if (hVar.f5750b.equals(str) && ((C1158c) entry.getValue()).f11915b.equals(str2)) {
                        return (FirebaseFirestore) entry.getKey();
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.firebase.firestore.X, com.google.firebase.firestore.Y, java.lang.Object] */
    public static L e(q qVar) {
        long j;
        K k2 = new K();
        String str = qVar.f11945b.f11959b;
        if (str != null) {
            k2.f9764a = str;
        }
        Boolean bool = qVar.f11945b.f11960c;
        if (bool != null) {
            k2.f9765b = bool.booleanValue();
        }
        Boolean bool2 = qVar.f11945b.f11958a;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                Long l8 = qVar.f11945b.f11961d;
                if (l8 != null && l8.longValue() != -1) {
                    j = l8.longValue();
                } else {
                    j = 104857600;
                }
                k2.b(new b0(j));
            } else {
                Z z7 = new Z(0);
                ?? obj = new Object();
                obj.f9797a = z7;
                k2.b(obj);
            }
        }
        return k2.a();
    }

    public static void i(FirebaseFirestore firebaseFirestore, String str) {
        HashMap hashMap = f11922Y;
        synchronized (hashMap) {
            try {
                if (((C1158c) hashMap.get(firebaseFirestore)) == null) {
                    hashMap.put(firebaseFirestore, new C1158c(firebaseFirestore, str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new S(11, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final String f(String str, L5.i iVar) {
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        g(str, lowerCase, iVar);
        return lowerCase;
    }

    public final void g(String str, String str2, L5.i iVar) {
        L5.j jVar = new L5.j(this.f11926b, AbstractC0059i.A(str, "/", str2), this.f11925a);
        jVar.a(iVar);
        this.f11929e.put(str2, jVar);
        this.f.put(str2, iVar);
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task getPluginConstantsForFirebaseApp(U3.h hVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new P5.e(1, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final void h() {
        synchronized (this.f11929e) {
            try {
                for (String str : this.f11929e.keySet()) {
                    L5.j jVar = (L5.j) this.f11929e.get(str);
                    Objects.requireNonNull(jVar);
                    jVar.a(null);
                }
                this.f11929e.clear();
            } finally {
            }
        }
        synchronized (this.f) {
            try {
                for (String str2 : this.f.keySet()) {
                    L5.i iVar = (L5.i) this.f.get(str2);
                    Objects.requireNonNull(iVar);
                    iVar.b();
                }
                this.f.clear();
            } finally {
            }
        }
        this.f11924X.clear();
    }

    @Override // I5.a
    public final void onAttachedToActivity(I5.b bVar) {
        this.f11927c.set(((C5.d) bVar).f571a);
    }

    @Override // H5.b
    public final void onAttachedToEngine(H5.a aVar) {
        this.f11926b = aVar.f2030b;
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_firestore", this);
        L5.f fVar = this.f11926b;
        p pVar = p.f11943e;
        new E.e(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.loadBundle", pVar, null, 4).h0(new L5.b(this) { // from class: io.flutter.plugins.firebase.firestore.o

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ C1162g f11942b;

            {
                this.f11942b = this;
            }

            @Override // L5.b
            public final void j(Object obj, A.f fVar2) {
                a0 a0Var;
                a0 a0Var2;
                Long valueOf;
                switch (r2) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = (ArrayList) obj;
                        arrayList.add(0, this.f11942b.f("plugins.flutter.io/firebase_firestore/loadBundle", new Q5.e(C1162g.c((q) arrayList2.get(0)), (byte[]) arrayList2.get(1))));
                        fVar2.h(arrayList);
                        return;
                    case 1:
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = (ArrayList) obj;
                        y yVar = (y) arrayList4.get(4);
                        Boolean bool = (Boolean) arrayList4.get(5);
                        s sVar = s.values()[((Integer) arrayList4.get(6)).intValue()];
                        C1162g c1162g = this.f11942b;
                        g0 P7 = AbstractC0412a.P(C1162g.c((q) arrayList4.get(0)), (String) arrayList4.get(1), ((Boolean) arrayList4.get(2)).booleanValue(), (z) arrayList4.get(3));
                        if (P7 == null) {
                            fVar2.h(F.f.F(new r("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null)));
                            return;
                        }
                        EnumC0815q N7 = AbstractC0412a.N(yVar.f11964b);
                        P L6 = AbstractC0412a.L(sVar);
                        Q5.b bVar = new Q5.b(1);
                        bVar.f = P7;
                        if (bool.booleanValue()) {
                            a0Var = a0.INCLUDE;
                        } else {
                            a0Var = a0.EXCLUDE;
                        }
                        bVar.f4420b = a0Var;
                        bVar.f4421c = N7;
                        bVar.f4422d = L6;
                        arrayList3.add(0, c1162g.f("plugins.flutter.io/firebase_firestore/query", bVar));
                        fVar2.h(arrayList3);
                        return;
                    case 2:
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = (ArrayList) obj;
                        q qVar = (q) arrayList6.get(0);
                        n nVar = (n) arrayList6.get(1);
                        s sVar2 = s.values()[((Integer) arrayList6.get(3)).intValue()];
                        C1162g c1162g2 = this.f11942b;
                        C1162g.c(qVar);
                        C0814p d7 = C1162g.c(qVar).d(nVar.f11936a);
                        EnumC0815q N8 = AbstractC0412a.N(nVar.f11940e);
                        P L7 = AbstractC0412a.L(sVar2);
                        Q5.b bVar2 = new Q5.b(0);
                        bVar2.f = d7;
                        if (((Boolean) arrayList6.get(2)).booleanValue()) {
                            a0Var2 = a0.INCLUDE;
                        } else {
                            a0Var2 = a0.EXCLUDE;
                        }
                        bVar2.f4420b = a0Var2;
                        bVar2.f4421c = N8;
                        bVar2.f4422d = L7;
                        arrayList5.add(0, c1162g2.f("plugins.flutter.io/firebase_firestore/document", bVar2));
                        fVar2.h(arrayList5);
                        return;
                    case 3:
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = (ArrayList) obj;
                        q qVar2 = (q) arrayList8.get(0);
                        Number number = (Number) arrayList8.get(1);
                        Number number2 = (Number) arrayList8.get(2);
                        Long l8 = null;
                        if (number == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(number.longValue());
                        }
                        if (number2 != null) {
                            l8 = Long.valueOf(number2.longValue());
                        }
                        C1162g c1162g3 = this.f11942b;
                        FirebaseFirestore c8 = C1162g.c(qVar2);
                        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                        Q5.j jVar = new Q5.j(new A4.d(lowerCase, 16, c1162g3), c8, valueOf, l8);
                        c1162g3.g("plugins.flutter.io/firebase_firestore/transaction", lowerCase, jVar);
                        c1162g3.f11924X.put(lowerCase, jVar);
                        arrayList7.add(0, lowerCase);
                        fVar2.h(arrayList7);
                        return;
                    case 4:
                        ArrayList arrayList9 = new ArrayList();
                        C1162g c1162g4 = this.f11942b;
                        FirebaseFirestore c9 = C1162g.c((q) ((ArrayList) obj).get(0));
                        Q5.f fVar3 = new Q5.f(0);
                        fVar3.f4434c = c9;
                        arrayList9.add(0, c1162g4.f("plugins.flutter.io/firebase_firestore/snapshotsInSync", fVar3));
                        fVar2.h(arrayList9);
                        return;
                    case 5:
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = (ArrayList) obj;
                        D d8 = D.values()[((Integer) arrayList11.get(1)).intValue()];
                        Q5.j jVar2 = (Q5.j) this.f11942b.f11924X.get((String) arrayList11.get(0));
                        Objects.requireNonNull(jVar2);
                        jVar2.f = d8;
                        jVar2.f4442X = (List) arrayList11.get(2);
                        jVar2.f4448e.release();
                        arrayList10.add(0, null);
                        fVar2.h(arrayList10);
                        return;
                    default:
                        ArrayList arrayList12 = new ArrayList();
                        ArrayList arrayList13 = (ArrayList) obj;
                        FlutterFirebasePlugin.cachedThreadPool.execute(new Q0.x(this.f11942b, (q) arrayList13.get(0), (String) arrayList13.get(2), (String) arrayList13.get(1), new C1154q(arrayList12, fVar2, 11), 5));
                        return;
                }
            }
        });
        new E.e(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.namedQueryGet", pVar, null, 4).h0(new com.it_nomads.fluttersecurestorage.ciphers.d(this, 15));
        new E.e(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.clearPersistence", pVar, null, 4).h0(new com.it_nomads.fluttersecurestorage.ciphers.d(this, 17));
        new E.e(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.disableNetwork", pVar, null, 4).h0(new com.it_nomads.fluttersecurestorage.ciphers.d(this, 18));
        new E.e(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.enableNetwork", pVar, null, 4).h0(new com.it_nomads.fluttersecurestorage.ciphers.d(this, 19));
        new E.e(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.terminate", pVar, null, 4).h0(new com.it_nomads.fluttersecurestorage.ciphers.d(this, 20));
        new E.e(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.waitForPendingWrites", pVar, null, 4).h0(new com.it_nomads.fluttersecurestorage.ciphers.d(this, 21));
        new E.e(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.setIndexConfiguration", pVar, null, 4).h0(new com.it_nomads.fluttersecurestorage.ciphers.d(this, 22));
        new E.e(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.setLoggingEnabled", pVar, null, 4).h0(new com.it_nomads.fluttersecurestorage.ciphers.d(this, 23));
        new E.e(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.snapshotsInSyncSetup", pVar, null, 4).h0(new L5.b(this) { // from class: io.flutter.plugins.firebase.firestore.o

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ C1162g f11942b;

            {
                this.f11942b = this;
            }

            @Override // L5.b
            public final void j(Object obj, A.f fVar2) {
                a0 a0Var;
                a0 a0Var2;
                Long valueOf;
                switch (r2) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = (ArrayList) obj;
                        arrayList.add(0, this.f11942b.f("plugins.flutter.io/firebase_firestore/loadBundle", new Q5.e(C1162g.c((q) arrayList2.get(0)), (byte[]) arrayList2.get(1))));
                        fVar2.h(arrayList);
                        return;
                    case 1:
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = (ArrayList) obj;
                        y yVar = (y) arrayList4.get(4);
                        Boolean bool = (Boolean) arrayList4.get(5);
                        s sVar = s.values()[((Integer) arrayList4.get(6)).intValue()];
                        C1162g c1162g = this.f11942b;
                        g0 P7 = AbstractC0412a.P(C1162g.c((q) arrayList4.get(0)), (String) arrayList4.get(1), ((Boolean) arrayList4.get(2)).booleanValue(), (z) arrayList4.get(3));
                        if (P7 == null) {
                            fVar2.h(F.f.F(new r("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null)));
                            return;
                        }
                        EnumC0815q N7 = AbstractC0412a.N(yVar.f11964b);
                        P L6 = AbstractC0412a.L(sVar);
                        Q5.b bVar = new Q5.b(1);
                        bVar.f = P7;
                        if (bool.booleanValue()) {
                            a0Var = a0.INCLUDE;
                        } else {
                            a0Var = a0.EXCLUDE;
                        }
                        bVar.f4420b = a0Var;
                        bVar.f4421c = N7;
                        bVar.f4422d = L6;
                        arrayList3.add(0, c1162g.f("plugins.flutter.io/firebase_firestore/query", bVar));
                        fVar2.h(arrayList3);
                        return;
                    case 2:
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = (ArrayList) obj;
                        q qVar = (q) arrayList6.get(0);
                        n nVar = (n) arrayList6.get(1);
                        s sVar2 = s.values()[((Integer) arrayList6.get(3)).intValue()];
                        C1162g c1162g2 = this.f11942b;
                        C1162g.c(qVar);
                        C0814p d7 = C1162g.c(qVar).d(nVar.f11936a);
                        EnumC0815q N8 = AbstractC0412a.N(nVar.f11940e);
                        P L7 = AbstractC0412a.L(sVar2);
                        Q5.b bVar2 = new Q5.b(0);
                        bVar2.f = d7;
                        if (((Boolean) arrayList6.get(2)).booleanValue()) {
                            a0Var2 = a0.INCLUDE;
                        } else {
                            a0Var2 = a0.EXCLUDE;
                        }
                        bVar2.f4420b = a0Var2;
                        bVar2.f4421c = N8;
                        bVar2.f4422d = L7;
                        arrayList5.add(0, c1162g2.f("plugins.flutter.io/firebase_firestore/document", bVar2));
                        fVar2.h(arrayList5);
                        return;
                    case 3:
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = (ArrayList) obj;
                        q qVar2 = (q) arrayList8.get(0);
                        Number number = (Number) arrayList8.get(1);
                        Number number2 = (Number) arrayList8.get(2);
                        Long l8 = null;
                        if (number == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(number.longValue());
                        }
                        if (number2 != null) {
                            l8 = Long.valueOf(number2.longValue());
                        }
                        C1162g c1162g3 = this.f11942b;
                        FirebaseFirestore c8 = C1162g.c(qVar2);
                        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                        Q5.j jVar = new Q5.j(new A4.d(lowerCase, 16, c1162g3), c8, valueOf, l8);
                        c1162g3.g("plugins.flutter.io/firebase_firestore/transaction", lowerCase, jVar);
                        c1162g3.f11924X.put(lowerCase, jVar);
                        arrayList7.add(0, lowerCase);
                        fVar2.h(arrayList7);
                        return;
                    case 4:
                        ArrayList arrayList9 = new ArrayList();
                        C1162g c1162g4 = this.f11942b;
                        FirebaseFirestore c9 = C1162g.c((q) ((ArrayList) obj).get(0));
                        Q5.f fVar3 = new Q5.f(0);
                        fVar3.f4434c = c9;
                        arrayList9.add(0, c1162g4.f("plugins.flutter.io/firebase_firestore/snapshotsInSync", fVar3));
                        fVar2.h(arrayList9);
                        return;
                    case 5:
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = (ArrayList) obj;
                        D d8 = D.values()[((Integer) arrayList11.get(1)).intValue()];
                        Q5.j jVar2 = (Q5.j) this.f11942b.f11924X.get((String) arrayList11.get(0));
                        Objects.requireNonNull(jVar2);
                        jVar2.f = d8;
                        jVar2.f4442X = (List) arrayList11.get(2);
                        jVar2.f4448e.release();
                        arrayList10.add(0, null);
                        fVar2.h(arrayList10);
                        return;
                    default:
                        ArrayList arrayList12 = new ArrayList();
                        ArrayList arrayList13 = (ArrayList) obj;
                        FlutterFirebasePlugin.cachedThreadPool.execute(new Q0.x(this.f11942b, (q) arrayList13.get(0), (String) arrayList13.get(2), (String) arrayList13.get(1), new C1154q(arrayList12, fVar2, 11), 5));
                        return;
                }
            }
        });
        new E.e(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.transactionCreate", pVar, null, 4).h0(new L5.b(this) { // from class: io.flutter.plugins.firebase.firestore.o

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ C1162g f11942b;

            {
                this.f11942b = this;
            }

            @Override // L5.b
            public final void j(Object obj, A.f fVar2) {
                a0 a0Var;
                a0 a0Var2;
                Long valueOf;
                switch (r2) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = (ArrayList) obj;
                        arrayList.add(0, this.f11942b.f("plugins.flutter.io/firebase_firestore/loadBundle", new Q5.e(C1162g.c((q) arrayList2.get(0)), (byte[]) arrayList2.get(1))));
                        fVar2.h(arrayList);
                        return;
                    case 1:
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = (ArrayList) obj;
                        y yVar = (y) arrayList4.get(4);
                        Boolean bool = (Boolean) arrayList4.get(5);
                        s sVar = s.values()[((Integer) arrayList4.get(6)).intValue()];
                        C1162g c1162g = this.f11942b;
                        g0 P7 = AbstractC0412a.P(C1162g.c((q) arrayList4.get(0)), (String) arrayList4.get(1), ((Boolean) arrayList4.get(2)).booleanValue(), (z) arrayList4.get(3));
                        if (P7 == null) {
                            fVar2.h(F.f.F(new r("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null)));
                            return;
                        }
                        EnumC0815q N7 = AbstractC0412a.N(yVar.f11964b);
                        P L6 = AbstractC0412a.L(sVar);
                        Q5.b bVar = new Q5.b(1);
                        bVar.f = P7;
                        if (bool.booleanValue()) {
                            a0Var = a0.INCLUDE;
                        } else {
                            a0Var = a0.EXCLUDE;
                        }
                        bVar.f4420b = a0Var;
                        bVar.f4421c = N7;
                        bVar.f4422d = L6;
                        arrayList3.add(0, c1162g.f("plugins.flutter.io/firebase_firestore/query", bVar));
                        fVar2.h(arrayList3);
                        return;
                    case 2:
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = (ArrayList) obj;
                        q qVar = (q) arrayList6.get(0);
                        n nVar = (n) arrayList6.get(1);
                        s sVar2 = s.values()[((Integer) arrayList6.get(3)).intValue()];
                        C1162g c1162g2 = this.f11942b;
                        C1162g.c(qVar);
                        C0814p d7 = C1162g.c(qVar).d(nVar.f11936a);
                        EnumC0815q N8 = AbstractC0412a.N(nVar.f11940e);
                        P L7 = AbstractC0412a.L(sVar2);
                        Q5.b bVar2 = new Q5.b(0);
                        bVar2.f = d7;
                        if (((Boolean) arrayList6.get(2)).booleanValue()) {
                            a0Var2 = a0.INCLUDE;
                        } else {
                            a0Var2 = a0.EXCLUDE;
                        }
                        bVar2.f4420b = a0Var2;
                        bVar2.f4421c = N8;
                        bVar2.f4422d = L7;
                        arrayList5.add(0, c1162g2.f("plugins.flutter.io/firebase_firestore/document", bVar2));
                        fVar2.h(arrayList5);
                        return;
                    case 3:
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = (ArrayList) obj;
                        q qVar2 = (q) arrayList8.get(0);
                        Number number = (Number) arrayList8.get(1);
                        Number number2 = (Number) arrayList8.get(2);
                        Long l8 = null;
                        if (number == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(number.longValue());
                        }
                        if (number2 != null) {
                            l8 = Long.valueOf(number2.longValue());
                        }
                        C1162g c1162g3 = this.f11942b;
                        FirebaseFirestore c8 = C1162g.c(qVar2);
                        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                        Q5.j jVar = new Q5.j(new A4.d(lowerCase, 16, c1162g3), c8, valueOf, l8);
                        c1162g3.g("plugins.flutter.io/firebase_firestore/transaction", lowerCase, jVar);
                        c1162g3.f11924X.put(lowerCase, jVar);
                        arrayList7.add(0, lowerCase);
                        fVar2.h(arrayList7);
                        return;
                    case 4:
                        ArrayList arrayList9 = new ArrayList();
                        C1162g c1162g4 = this.f11942b;
                        FirebaseFirestore c9 = C1162g.c((q) ((ArrayList) obj).get(0));
                        Q5.f fVar3 = new Q5.f(0);
                        fVar3.f4434c = c9;
                        arrayList9.add(0, c1162g4.f("plugins.flutter.io/firebase_firestore/snapshotsInSync", fVar3));
                        fVar2.h(arrayList9);
                        return;
                    case 5:
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = (ArrayList) obj;
                        D d8 = D.values()[((Integer) arrayList11.get(1)).intValue()];
                        Q5.j jVar2 = (Q5.j) this.f11942b.f11924X.get((String) arrayList11.get(0));
                        Objects.requireNonNull(jVar2);
                        jVar2.f = d8;
                        jVar2.f4442X = (List) arrayList11.get(2);
                        jVar2.f4448e.release();
                        arrayList10.add(0, null);
                        fVar2.h(arrayList10);
                        return;
                    default:
                        ArrayList arrayList12 = new ArrayList();
                        ArrayList arrayList13 = (ArrayList) obj;
                        FlutterFirebasePlugin.cachedThreadPool.execute(new Q0.x(this.f11942b, (q) arrayList13.get(0), (String) arrayList13.get(2), (String) arrayList13.get(1), new C1154q(arrayList12, fVar2, 11), 5));
                        return;
                }
            }
        });
        new E.e(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.transactionStoreResult", pVar, null, 4).h0(new L5.b(this) { // from class: io.flutter.plugins.firebase.firestore.o

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ C1162g f11942b;

            {
                this.f11942b = this;
            }

            @Override // L5.b
            public final void j(Object obj, A.f fVar2) {
                a0 a0Var;
                a0 a0Var2;
                Long valueOf;
                switch (r2) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = (ArrayList) obj;
                        arrayList.add(0, this.f11942b.f("plugins.flutter.io/firebase_firestore/loadBundle", new Q5.e(C1162g.c((q) arrayList2.get(0)), (byte[]) arrayList2.get(1))));
                        fVar2.h(arrayList);
                        return;
                    case 1:
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = (ArrayList) obj;
                        y yVar = (y) arrayList4.get(4);
                        Boolean bool = (Boolean) arrayList4.get(5);
                        s sVar = s.values()[((Integer) arrayList4.get(6)).intValue()];
                        C1162g c1162g = this.f11942b;
                        g0 P7 = AbstractC0412a.P(C1162g.c((q) arrayList4.get(0)), (String) arrayList4.get(1), ((Boolean) arrayList4.get(2)).booleanValue(), (z) arrayList4.get(3));
                        if (P7 == null) {
                            fVar2.h(F.f.F(new r("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null)));
                            return;
                        }
                        EnumC0815q N7 = AbstractC0412a.N(yVar.f11964b);
                        P L6 = AbstractC0412a.L(sVar);
                        Q5.b bVar = new Q5.b(1);
                        bVar.f = P7;
                        if (bool.booleanValue()) {
                            a0Var = a0.INCLUDE;
                        } else {
                            a0Var = a0.EXCLUDE;
                        }
                        bVar.f4420b = a0Var;
                        bVar.f4421c = N7;
                        bVar.f4422d = L6;
                        arrayList3.add(0, c1162g.f("plugins.flutter.io/firebase_firestore/query", bVar));
                        fVar2.h(arrayList3);
                        return;
                    case 2:
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = (ArrayList) obj;
                        q qVar = (q) arrayList6.get(0);
                        n nVar = (n) arrayList6.get(1);
                        s sVar2 = s.values()[((Integer) arrayList6.get(3)).intValue()];
                        C1162g c1162g2 = this.f11942b;
                        C1162g.c(qVar);
                        C0814p d7 = C1162g.c(qVar).d(nVar.f11936a);
                        EnumC0815q N8 = AbstractC0412a.N(nVar.f11940e);
                        P L7 = AbstractC0412a.L(sVar2);
                        Q5.b bVar2 = new Q5.b(0);
                        bVar2.f = d7;
                        if (((Boolean) arrayList6.get(2)).booleanValue()) {
                            a0Var2 = a0.INCLUDE;
                        } else {
                            a0Var2 = a0.EXCLUDE;
                        }
                        bVar2.f4420b = a0Var2;
                        bVar2.f4421c = N8;
                        bVar2.f4422d = L7;
                        arrayList5.add(0, c1162g2.f("plugins.flutter.io/firebase_firestore/document", bVar2));
                        fVar2.h(arrayList5);
                        return;
                    case 3:
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = (ArrayList) obj;
                        q qVar2 = (q) arrayList8.get(0);
                        Number number = (Number) arrayList8.get(1);
                        Number number2 = (Number) arrayList8.get(2);
                        Long l8 = null;
                        if (number == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(number.longValue());
                        }
                        if (number2 != null) {
                            l8 = Long.valueOf(number2.longValue());
                        }
                        C1162g c1162g3 = this.f11942b;
                        FirebaseFirestore c8 = C1162g.c(qVar2);
                        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                        Q5.j jVar = new Q5.j(new A4.d(lowerCase, 16, c1162g3), c8, valueOf, l8);
                        c1162g3.g("plugins.flutter.io/firebase_firestore/transaction", lowerCase, jVar);
                        c1162g3.f11924X.put(lowerCase, jVar);
                        arrayList7.add(0, lowerCase);
                        fVar2.h(arrayList7);
                        return;
                    case 4:
                        ArrayList arrayList9 = new ArrayList();
                        C1162g c1162g4 = this.f11942b;
                        FirebaseFirestore c9 = C1162g.c((q) ((ArrayList) obj).get(0));
                        Q5.f fVar3 = new Q5.f(0);
                        fVar3.f4434c = c9;
                        arrayList9.add(0, c1162g4.f("plugins.flutter.io/firebase_firestore/snapshotsInSync", fVar3));
                        fVar2.h(arrayList9);
                        return;
                    case 5:
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = (ArrayList) obj;
                        D d8 = D.values()[((Integer) arrayList11.get(1)).intValue()];
                        Q5.j jVar2 = (Q5.j) this.f11942b.f11924X.get((String) arrayList11.get(0));
                        Objects.requireNonNull(jVar2);
                        jVar2.f = d8;
                        jVar2.f4442X = (List) arrayList11.get(2);
                        jVar2.f4448e.release();
                        arrayList10.add(0, null);
                        fVar2.h(arrayList10);
                        return;
                    default:
                        ArrayList arrayList12 = new ArrayList();
                        ArrayList arrayList13 = (ArrayList) obj;
                        FlutterFirebasePlugin.cachedThreadPool.execute(new Q0.x(this.f11942b, (q) arrayList13.get(0), (String) arrayList13.get(2), (String) arrayList13.get(1), new C1154q(arrayList12, fVar2, 11), 5));
                        return;
                }
            }
        });
        new E.e(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.transactionGet", pVar, null, 4).h0(new L5.b(this) { // from class: io.flutter.plugins.firebase.firestore.o

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ C1162g f11942b;

            {
                this.f11942b = this;
            }

            @Override // L5.b
            public final void j(Object obj, A.f fVar2) {
                a0 a0Var;
                a0 a0Var2;
                Long valueOf;
                switch (r2) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = (ArrayList) obj;
                        arrayList.add(0, this.f11942b.f("plugins.flutter.io/firebase_firestore/loadBundle", new Q5.e(C1162g.c((q) arrayList2.get(0)), (byte[]) arrayList2.get(1))));
                        fVar2.h(arrayList);
                        return;
                    case 1:
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = (ArrayList) obj;
                        y yVar = (y) arrayList4.get(4);
                        Boolean bool = (Boolean) arrayList4.get(5);
                        s sVar = s.values()[((Integer) arrayList4.get(6)).intValue()];
                        C1162g c1162g = this.f11942b;
                        g0 P7 = AbstractC0412a.P(C1162g.c((q) arrayList4.get(0)), (String) arrayList4.get(1), ((Boolean) arrayList4.get(2)).booleanValue(), (z) arrayList4.get(3));
                        if (P7 == null) {
                            fVar2.h(F.f.F(new r("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null)));
                            return;
                        }
                        EnumC0815q N7 = AbstractC0412a.N(yVar.f11964b);
                        P L6 = AbstractC0412a.L(sVar);
                        Q5.b bVar = new Q5.b(1);
                        bVar.f = P7;
                        if (bool.booleanValue()) {
                            a0Var = a0.INCLUDE;
                        } else {
                            a0Var = a0.EXCLUDE;
                        }
                        bVar.f4420b = a0Var;
                        bVar.f4421c = N7;
                        bVar.f4422d = L6;
                        arrayList3.add(0, c1162g.f("plugins.flutter.io/firebase_firestore/query", bVar));
                        fVar2.h(arrayList3);
                        return;
                    case 2:
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = (ArrayList) obj;
                        q qVar = (q) arrayList6.get(0);
                        n nVar = (n) arrayList6.get(1);
                        s sVar2 = s.values()[((Integer) arrayList6.get(3)).intValue()];
                        C1162g c1162g2 = this.f11942b;
                        C1162g.c(qVar);
                        C0814p d7 = C1162g.c(qVar).d(nVar.f11936a);
                        EnumC0815q N8 = AbstractC0412a.N(nVar.f11940e);
                        P L7 = AbstractC0412a.L(sVar2);
                        Q5.b bVar2 = new Q5.b(0);
                        bVar2.f = d7;
                        if (((Boolean) arrayList6.get(2)).booleanValue()) {
                            a0Var2 = a0.INCLUDE;
                        } else {
                            a0Var2 = a0.EXCLUDE;
                        }
                        bVar2.f4420b = a0Var2;
                        bVar2.f4421c = N8;
                        bVar2.f4422d = L7;
                        arrayList5.add(0, c1162g2.f("plugins.flutter.io/firebase_firestore/document", bVar2));
                        fVar2.h(arrayList5);
                        return;
                    case 3:
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = (ArrayList) obj;
                        q qVar2 = (q) arrayList8.get(0);
                        Number number = (Number) arrayList8.get(1);
                        Number number2 = (Number) arrayList8.get(2);
                        Long l8 = null;
                        if (number == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(number.longValue());
                        }
                        if (number2 != null) {
                            l8 = Long.valueOf(number2.longValue());
                        }
                        C1162g c1162g3 = this.f11942b;
                        FirebaseFirestore c8 = C1162g.c(qVar2);
                        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                        Q5.j jVar = new Q5.j(new A4.d(lowerCase, 16, c1162g3), c8, valueOf, l8);
                        c1162g3.g("plugins.flutter.io/firebase_firestore/transaction", lowerCase, jVar);
                        c1162g3.f11924X.put(lowerCase, jVar);
                        arrayList7.add(0, lowerCase);
                        fVar2.h(arrayList7);
                        return;
                    case 4:
                        ArrayList arrayList9 = new ArrayList();
                        C1162g c1162g4 = this.f11942b;
                        FirebaseFirestore c9 = C1162g.c((q) ((ArrayList) obj).get(0));
                        Q5.f fVar3 = new Q5.f(0);
                        fVar3.f4434c = c9;
                        arrayList9.add(0, c1162g4.f("plugins.flutter.io/firebase_firestore/snapshotsInSync", fVar3));
                        fVar2.h(arrayList9);
                        return;
                    case 5:
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = (ArrayList) obj;
                        D d8 = D.values()[((Integer) arrayList11.get(1)).intValue()];
                        Q5.j jVar2 = (Q5.j) this.f11942b.f11924X.get((String) arrayList11.get(0));
                        Objects.requireNonNull(jVar2);
                        jVar2.f = d8;
                        jVar2.f4442X = (List) arrayList11.get(2);
                        jVar2.f4448e.release();
                        arrayList10.add(0, null);
                        fVar2.h(arrayList10);
                        return;
                    default:
                        ArrayList arrayList12 = new ArrayList();
                        ArrayList arrayList13 = (ArrayList) obj;
                        FlutterFirebasePlugin.cachedThreadPool.execute(new Q0.x(this.f11942b, (q) arrayList13.get(0), (String) arrayList13.get(2), (String) arrayList13.get(1), new C1154q(arrayList12, fVar2, 11), 5));
                        return;
                }
            }
        });
        new E.e(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceSet", pVar, null, 4).h0(new com.it_nomads.fluttersecurestorage.ciphers.d(this, 24));
        new E.e(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceUpdate", pVar, null, 4).h0(new com.it_nomads.fluttersecurestorage.ciphers.d(this, 25));
        new E.e(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceGet", pVar, null, 4).h0(new com.it_nomads.fluttersecurestorage.ciphers.d(this, 26));
        new E.e(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceDelete", pVar, null, 4).h0(new com.it_nomads.fluttersecurestorage.ciphers.d(this, 27));
        new E.e(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.queryGet", pVar, null, 4).h0(new com.it_nomads.fluttersecurestorage.ciphers.d(this, 28));
        new E.e(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.aggregateQuery", pVar, null, 4).h0(new com.it_nomads.fluttersecurestorage.ciphers.d(this, 29));
        new E.e(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.writeBatchCommit", pVar, null, 4).h0(new com.it_nomads.fluttersecurestorage.ciphers.d(this, 14));
        new E.e(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.querySnapshot", pVar, null, 4).h0(new L5.b(this) { // from class: io.flutter.plugins.firebase.firestore.o

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ C1162g f11942b;

            {
                this.f11942b = this;
            }

            @Override // L5.b
            public final void j(Object obj, A.f fVar2) {
                a0 a0Var;
                a0 a0Var2;
                Long valueOf;
                switch (r2) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = (ArrayList) obj;
                        arrayList.add(0, this.f11942b.f("plugins.flutter.io/firebase_firestore/loadBundle", new Q5.e(C1162g.c((q) arrayList2.get(0)), (byte[]) arrayList2.get(1))));
                        fVar2.h(arrayList);
                        return;
                    case 1:
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = (ArrayList) obj;
                        y yVar = (y) arrayList4.get(4);
                        Boolean bool = (Boolean) arrayList4.get(5);
                        s sVar = s.values()[((Integer) arrayList4.get(6)).intValue()];
                        C1162g c1162g = this.f11942b;
                        g0 P7 = AbstractC0412a.P(C1162g.c((q) arrayList4.get(0)), (String) arrayList4.get(1), ((Boolean) arrayList4.get(2)).booleanValue(), (z) arrayList4.get(3));
                        if (P7 == null) {
                            fVar2.h(F.f.F(new r("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null)));
                            return;
                        }
                        EnumC0815q N7 = AbstractC0412a.N(yVar.f11964b);
                        P L6 = AbstractC0412a.L(sVar);
                        Q5.b bVar = new Q5.b(1);
                        bVar.f = P7;
                        if (bool.booleanValue()) {
                            a0Var = a0.INCLUDE;
                        } else {
                            a0Var = a0.EXCLUDE;
                        }
                        bVar.f4420b = a0Var;
                        bVar.f4421c = N7;
                        bVar.f4422d = L6;
                        arrayList3.add(0, c1162g.f("plugins.flutter.io/firebase_firestore/query", bVar));
                        fVar2.h(arrayList3);
                        return;
                    case 2:
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = (ArrayList) obj;
                        q qVar = (q) arrayList6.get(0);
                        n nVar = (n) arrayList6.get(1);
                        s sVar2 = s.values()[((Integer) arrayList6.get(3)).intValue()];
                        C1162g c1162g2 = this.f11942b;
                        C1162g.c(qVar);
                        C0814p d7 = C1162g.c(qVar).d(nVar.f11936a);
                        EnumC0815q N8 = AbstractC0412a.N(nVar.f11940e);
                        P L7 = AbstractC0412a.L(sVar2);
                        Q5.b bVar2 = new Q5.b(0);
                        bVar2.f = d7;
                        if (((Boolean) arrayList6.get(2)).booleanValue()) {
                            a0Var2 = a0.INCLUDE;
                        } else {
                            a0Var2 = a0.EXCLUDE;
                        }
                        bVar2.f4420b = a0Var2;
                        bVar2.f4421c = N8;
                        bVar2.f4422d = L7;
                        arrayList5.add(0, c1162g2.f("plugins.flutter.io/firebase_firestore/document", bVar2));
                        fVar2.h(arrayList5);
                        return;
                    case 3:
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = (ArrayList) obj;
                        q qVar2 = (q) arrayList8.get(0);
                        Number number = (Number) arrayList8.get(1);
                        Number number2 = (Number) arrayList8.get(2);
                        Long l8 = null;
                        if (number == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(number.longValue());
                        }
                        if (number2 != null) {
                            l8 = Long.valueOf(number2.longValue());
                        }
                        C1162g c1162g3 = this.f11942b;
                        FirebaseFirestore c8 = C1162g.c(qVar2);
                        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                        Q5.j jVar = new Q5.j(new A4.d(lowerCase, 16, c1162g3), c8, valueOf, l8);
                        c1162g3.g("plugins.flutter.io/firebase_firestore/transaction", lowerCase, jVar);
                        c1162g3.f11924X.put(lowerCase, jVar);
                        arrayList7.add(0, lowerCase);
                        fVar2.h(arrayList7);
                        return;
                    case 4:
                        ArrayList arrayList9 = new ArrayList();
                        C1162g c1162g4 = this.f11942b;
                        FirebaseFirestore c9 = C1162g.c((q) ((ArrayList) obj).get(0));
                        Q5.f fVar3 = new Q5.f(0);
                        fVar3.f4434c = c9;
                        arrayList9.add(0, c1162g4.f("plugins.flutter.io/firebase_firestore/snapshotsInSync", fVar3));
                        fVar2.h(arrayList9);
                        return;
                    case 5:
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = (ArrayList) obj;
                        D d8 = D.values()[((Integer) arrayList11.get(1)).intValue()];
                        Q5.j jVar2 = (Q5.j) this.f11942b.f11924X.get((String) arrayList11.get(0));
                        Objects.requireNonNull(jVar2);
                        jVar2.f = d8;
                        jVar2.f4442X = (List) arrayList11.get(2);
                        jVar2.f4448e.release();
                        arrayList10.add(0, null);
                        fVar2.h(arrayList10);
                        return;
                    default:
                        ArrayList arrayList12 = new ArrayList();
                        ArrayList arrayList13 = (ArrayList) obj;
                        FlutterFirebasePlugin.cachedThreadPool.execute(new Q0.x(this.f11942b, (q) arrayList13.get(0), (String) arrayList13.get(2), (String) arrayList13.get(1), new C1154q(arrayList12, fVar2, 11), 5));
                        return;
                }
            }
        });
        new E.e(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceSnapshot", pVar, null, 4).h0(new L5.b(this) { // from class: io.flutter.plugins.firebase.firestore.o

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ C1162g f11942b;

            {
                this.f11942b = this;
            }

            @Override // L5.b
            public final void j(Object obj, A.f fVar2) {
                a0 a0Var;
                a0 a0Var2;
                Long valueOf;
                switch (r2) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = (ArrayList) obj;
                        arrayList.add(0, this.f11942b.f("plugins.flutter.io/firebase_firestore/loadBundle", new Q5.e(C1162g.c((q) arrayList2.get(0)), (byte[]) arrayList2.get(1))));
                        fVar2.h(arrayList);
                        return;
                    case 1:
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = (ArrayList) obj;
                        y yVar = (y) arrayList4.get(4);
                        Boolean bool = (Boolean) arrayList4.get(5);
                        s sVar = s.values()[((Integer) arrayList4.get(6)).intValue()];
                        C1162g c1162g = this.f11942b;
                        g0 P7 = AbstractC0412a.P(C1162g.c((q) arrayList4.get(0)), (String) arrayList4.get(1), ((Boolean) arrayList4.get(2)).booleanValue(), (z) arrayList4.get(3));
                        if (P7 == null) {
                            fVar2.h(F.f.F(new r("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null)));
                            return;
                        }
                        EnumC0815q N7 = AbstractC0412a.N(yVar.f11964b);
                        P L6 = AbstractC0412a.L(sVar);
                        Q5.b bVar = new Q5.b(1);
                        bVar.f = P7;
                        if (bool.booleanValue()) {
                            a0Var = a0.INCLUDE;
                        } else {
                            a0Var = a0.EXCLUDE;
                        }
                        bVar.f4420b = a0Var;
                        bVar.f4421c = N7;
                        bVar.f4422d = L6;
                        arrayList3.add(0, c1162g.f("plugins.flutter.io/firebase_firestore/query", bVar));
                        fVar2.h(arrayList3);
                        return;
                    case 2:
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = (ArrayList) obj;
                        q qVar = (q) arrayList6.get(0);
                        n nVar = (n) arrayList6.get(1);
                        s sVar2 = s.values()[((Integer) arrayList6.get(3)).intValue()];
                        C1162g c1162g2 = this.f11942b;
                        C1162g.c(qVar);
                        C0814p d7 = C1162g.c(qVar).d(nVar.f11936a);
                        EnumC0815q N8 = AbstractC0412a.N(nVar.f11940e);
                        P L7 = AbstractC0412a.L(sVar2);
                        Q5.b bVar2 = new Q5.b(0);
                        bVar2.f = d7;
                        if (((Boolean) arrayList6.get(2)).booleanValue()) {
                            a0Var2 = a0.INCLUDE;
                        } else {
                            a0Var2 = a0.EXCLUDE;
                        }
                        bVar2.f4420b = a0Var2;
                        bVar2.f4421c = N8;
                        bVar2.f4422d = L7;
                        arrayList5.add(0, c1162g2.f("plugins.flutter.io/firebase_firestore/document", bVar2));
                        fVar2.h(arrayList5);
                        return;
                    case 3:
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = (ArrayList) obj;
                        q qVar2 = (q) arrayList8.get(0);
                        Number number = (Number) arrayList8.get(1);
                        Number number2 = (Number) arrayList8.get(2);
                        Long l8 = null;
                        if (number == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(number.longValue());
                        }
                        if (number2 != null) {
                            l8 = Long.valueOf(number2.longValue());
                        }
                        C1162g c1162g3 = this.f11942b;
                        FirebaseFirestore c8 = C1162g.c(qVar2);
                        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                        Q5.j jVar = new Q5.j(new A4.d(lowerCase, 16, c1162g3), c8, valueOf, l8);
                        c1162g3.g("plugins.flutter.io/firebase_firestore/transaction", lowerCase, jVar);
                        c1162g3.f11924X.put(lowerCase, jVar);
                        arrayList7.add(0, lowerCase);
                        fVar2.h(arrayList7);
                        return;
                    case 4:
                        ArrayList arrayList9 = new ArrayList();
                        C1162g c1162g4 = this.f11942b;
                        FirebaseFirestore c9 = C1162g.c((q) ((ArrayList) obj).get(0));
                        Q5.f fVar3 = new Q5.f(0);
                        fVar3.f4434c = c9;
                        arrayList9.add(0, c1162g4.f("plugins.flutter.io/firebase_firestore/snapshotsInSync", fVar3));
                        fVar2.h(arrayList9);
                        return;
                    case 5:
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = (ArrayList) obj;
                        D d8 = D.values()[((Integer) arrayList11.get(1)).intValue()];
                        Q5.j jVar2 = (Q5.j) this.f11942b.f11924X.get((String) arrayList11.get(0));
                        Objects.requireNonNull(jVar2);
                        jVar2.f = d8;
                        jVar2.f4442X = (List) arrayList11.get(2);
                        jVar2.f4448e.release();
                        arrayList10.add(0, null);
                        fVar2.h(arrayList10);
                        return;
                    default:
                        ArrayList arrayList12 = new ArrayList();
                        ArrayList arrayList13 = (ArrayList) obj;
                        FlutterFirebasePlugin.cachedThreadPool.execute(new Q0.x(this.f11942b, (q) arrayList13.get(0), (String) arrayList13.get(2), (String) arrayList13.get(1), new C1154q(arrayList12, fVar2, 11), 5));
                        return;
                }
            }
        });
        new E.e(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.persistenceCacheIndexManagerRequest", pVar, null, 4).h0(new com.it_nomads.fluttersecurestorage.ciphers.d(this, 16));
    }

    @Override // I5.a
    public final void onDetachedFromActivity() {
        this.f11927c.set(null);
    }

    @Override // I5.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f11927c.set(null);
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a aVar) {
        h();
        this.f11926b = null;
    }

    @Override // I5.a
    public final void onReattachedToActivityForConfigChanges(I5.b bVar) {
        this.f11927c.set(((C5.d) bVar).f571a);
    }
}
