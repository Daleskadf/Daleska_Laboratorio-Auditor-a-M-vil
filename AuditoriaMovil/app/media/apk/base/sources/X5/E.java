package X5;

import D.AbstractC0055e;
import D.AbstractC0059i;
import H4.C0191w;
import H4.e1;
import a4.C0450C;
import a4.C0460i;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.view.View;
import android.webkit.WebStorage;
import b4.C0599g;
import b4.C0602j;
import b4.C0603k;
import b4.C0610s;
import b4.InterfaceC0593a;
import c4.InterfaceC0635d;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.C0814p;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.p0;
import com.google.firebase.storage.StorageRegistrar;
import h1.C1073g;
import h1.C1076j;
import io.flutter.plugins.firebase.auth.C1147j;
import io.flutter.plugins.firebase.auth.C1154q;
import io.flutter.plugins.firebase.auth.InterfaceC1155s;
import io.flutter.plugins.googlemaps.AbstractC1174g;
import io.flutter.plugins.googlemaps.C1190x;
import io.flutter.plugins.googlemaps.r0;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import l4.C1420d;
import l4.C1421e;
import m1.InterfaceC1433g;
import org.apache.tika.utils.XMLReaderUtils;
import p.C1608t;
import p4.C1674d;
import p4.C1675e;
import p4.C1678h;
import p4.InterfaceC1672b;
import p4.InterfaceC1677g;
import q4.C1709b;
import t4.RunnableC1822b;
import w.C1925j;
import w4.InterfaceC1955a;
import w4.InterfaceC1956b;
/* loaded from: classes.dex */
public final /* synthetic */ class E implements L5.b, Y5.b, Continuation, InterfaceC0635d, h1.m, InterfaceC1955a, u4.r, InterfaceC1433g, U.j, androidx.camera.core.impl.S {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6408a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6409b;

    public /* synthetic */ E(Object obj, int i7) {
        this.f6408a = i7;
        this.f6409b = obj;
    }

    @Override // m1.InterfaceC1433g
    public long a(long j) {
        m1.t tVar = (m1.t) this.f6409b;
        return K0.x.k((j * tVar.f13991e) / 1000000, 0L, tVar.j - 1);
    }

    @Override // androidx.camera.core.impl.S
    public void b(androidx.camera.core.impl.T t7) {
        U2.b bVar = (U2.b) this.f6409b;
        bVar.getClass();
        try {
            D.b0 acquireLatestImage = t7.acquireLatestImage();
            if (acquireLatestImage != null) {
                ((V2.k) bVar.f5723e).p(acquireLatestImage);
            }
        } catch (IllegalStateException e7) {
            org.slf4j.helpers.i.t("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e7.getMessage());
        }
    }

    @Override // Y5.b
    public boolean c(View view) {
        int i7 = 0;
        while (true) {
            Class[] clsArr = (Class[]) this.f6409b;
            if (i7 >= clsArr.length) {
                return false;
            }
            if (clsArr[i7].isInstance(view)) {
                return true;
            }
            i7++;
        }
    }

    @Override // c4.InterfaceC0635d
    public Object d(M3.q qVar) {
        switch (this.f6408a) {
            case 9:
                return StorageRegistrar.a((StorageRegistrar) this.f6409b, qVar);
            default:
                return new v4.c((Context) qVar.a(Context.class), ((U3.h) qVar.a(U3.h.class)).f(), qVar.x(v4.d.class), qVar.e(A4.b.class), (Executor) qVar.b((c4.r) this.f6409b));
        }
    }

    @Override // h1.m
    public A3.e0 e(int i7, H0.W w2, int[] iArr) {
        A3.H o7 = A3.K.o();
        for (int i8 = 0; i8 < w2.f1739a; i8++) {
            int i9 = i8;
            o7.a(new C1073g(i7, w2, i9, (C1076j) this.f6409b, iArr[i8]));
        }
        return o7.g();
    }

    @Override // w4.InterfaceC1955a
    public void f(InterfaceC1956b interfaceC1956b) {
        C1421e c1421e = (C1421e) this.f6409b;
        synchronized (c1421e) {
            c1421e.f13853e = (InterfaceC0593a) interfaceC1956b.get();
            c1421e.D();
            InterfaceC0593a interfaceC0593a = c1421e.f13853e;
            C1420d c1420d = c1421e.f13852d;
            FirebaseAuth firebaseAuth = (FirebaseAuth) interfaceC0593a;
            firebaseAuth.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = firebaseAuth.f9705c;
            copyOnWriteArrayList.add(c1420d);
            firebaseAuth.t().a(copyOnWriteArrayList.size());
        }
    }

    public void g(Bitmap bitmap) {
        io.flutter.plugins.firebase.storage.g gVar = (io.flutter.plugins.firebase.storage.g) this.f6409b;
        if (bitmap == null) {
            gVar.b(new C1190x(null, "Snapshot failure", "Unable to take snapshot"));
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        bitmap.recycle();
        gVar.a(byteArray);
    }

    @Override // u4.r
    public Object get() {
        HashMap hashMap;
        C1675e c1675e;
        q4.n g3;
        char c8 = 0;
        int i7 = 1;
        C1675e c1675e2 = (C1675e) this.f6409b;
        C1674d c1674d = c1675e2.f15251c;
        InterfaceC1677g interfaceC1677g = c1674d.f15247b.f15267b;
        HashSet hashSet = new HashSet();
        int i8 = c1675e2.f15253e;
        int i9 = i8;
        while (i9 > 0) {
            String z7 = interfaceC1677g.z();
            if (z7 == null || hashSet.contains(z7)) {
                break;
            }
            Object[] objArr = new Object[i7];
            objArr[c8] = z7;
            u4.q.a("IndexBackfiller", "Processing collection: %s", objArr);
            InterfaceC1677g interfaceC1677g2 = c1674d.f15247b.f15267b;
            E.e eVar = c1675e2.f15252d.f15247b.f;
            C1709b p7 = interfaceC1677g2.p(z7);
            Map o7 = ((p4.C) eVar.f920b).o(z7, p7, i9);
            if (i9 - o7.size() > 0) {
                hashMap = ((InterfaceC1672b) eVar.f922d).v(p7.f15346c, i9 - o7.size(), z7);
            } else {
                hashMap = new HashMap();
            }
            Iterator it = hashMap.values().iterator();
            int i10 = -1;
            while (it.hasNext()) {
                Iterator it2 = it;
                r4.d dVar = (r4.d) it.next();
                if (!o7.containsKey(dVar.f15491b.f15496a)) {
                    r4.h hVar = dVar.f15491b;
                    c1675e = c1675e2;
                    boolean z8 = hVar instanceof r4.l;
                    q4.h hVar2 = hVar.f15496a;
                    if (z8) {
                        g3 = ((p4.C) eVar.f920b).j(hVar2);
                    } else {
                        g3 = q4.n.g(hVar2);
                    }
                    o7.put(hVar2, g3);
                } else {
                    c1675e = c1675e2;
                }
                i10 = Math.max(i10, dVar.f15490a);
                c1675e2 = c1675e;
                it = it2;
            }
            C1675e c1675e3 = c1675e2;
            eVar.T(hashMap, o7.keySet());
            C1678h a7 = C1678h.a(i10, eVar.y(o7, hashMap, Collections.emptySet()));
            e4.c<Map.Entry> cVar = a7.f15255b;
            interfaceC1677g2.u(cVar);
            C1709b c1709b = p7;
            for (Map.Entry entry : cVar) {
                C1709b b5 = C1709b.b((q4.n) entry.getValue());
                if (b5.compareTo(c1709b) > 0) {
                    c1709b = b5;
                }
            }
            C1709b c1709b2 = new C1709b(c1709b.f15344a, c1709b.f15345b, Math.max(a7.f15254a, p7.f15346c));
            u4.q.a("IndexBackfiller", "Updating offset: %s", c1709b2);
            interfaceC1677g2.v(z7, c1709b2);
            i9 -= cVar.size();
            hashSet.add(z7);
            i7 = 1;
            c8 = 0;
            c1675e2 = c1675e3;
        }
        return Integer.valueOf(i8 - i9);
    }

    @Override // U.j
    public Object i(U.i iVar) {
        C1925j c1925j = (C1925j) this.f6409b;
        c1925j.getClass();
        c1925j.f16216b.execute(new RunnableC1822b(11, c1925j, iVar));
        return "updateSessionConfigAsync";
    }

    @Override // L5.b
    public void j(Object obj, A.f fVar) {
        List E4;
        List E7;
        List E8;
        List E9;
        Object obj2;
        Task<b4.W> zza;
        switch (this.f6408a) {
            case 0:
                C0392s c0392s = (C0392s) this.f6409b;
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj3 = ((List) obj).get(0);
                kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((C0377c) c0392s.f6530a.f1179c).a(new r(c0392s), ((Long) obj3).longValue());
                    E4 = G.i.A(null);
                } catch (Throwable th) {
                    E4 = AbstractC0055e.E(th);
                }
                fVar.h(E4);
                return;
            case 1:
                C0388n c0388n = (C0388n) this.f6409b;
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj4 = list.get(0);
                kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                long longValue = ((Long) obj4).longValue();
                Object obj5 = list.get(1);
                kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                try {
                    ((C0377c) c0388n.f6519a.f1179c).a(new C0397x((String) obj5, c0388n), longValue);
                    E7 = G.i.A(null);
                } catch (Throwable th2) {
                    E7 = AbstractC0055e.E(th2);
                }
                fVar.h(E7);
                return;
            case 2:
                C0383i c0383i = (C0383i) this.f6409b;
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                int i7 = 0;
                Object obj6 = list2.get(0);
                kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.net.http.SslError");
                SslError sslError = (SslError) obj6;
                Object obj7 = list2.get(1);
                kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.SslErrorType");
                V v6 = (V) obj7;
                try {
                    switch (T.f6437a[v6.ordinal()]) {
                        case 1:
                            i7 = 4;
                            break;
                        case 2:
                            i7 = 1;
                            break;
                        case 3:
                            i7 = 2;
                            break;
                        case 4:
                            i7 = 5;
                            break;
                        case 5:
                            break;
                        case 6:
                            i7 = 3;
                            break;
                        case 7:
                            c0383i.f6499a.getClass();
                            throw new IllegalArgumentException(v6 + " doesn't represent a native value.");
                        default:
                            i7 = -1;
                            break;
                    }
                    E8 = G.i.A(Boolean.valueOf(sslError.hasError(i7)));
                } catch (Throwable th3) {
                    E8 = AbstractC0055e.E(th3);
                }
                fVar.h(E8);
                return;
            case 3:
                C0383i c0383i2 = (C0383i) this.f6409b;
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj8 = ((List) obj).get(0);
                kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((C0377c) c0383i2.f6499a.f1179c).a(WebStorage.getInstance(), ((Long) obj8).longValue());
                    E9 = G.i.A(null);
                } catch (Throwable th4) {
                    E9 = AbstractC0055e.E(th4);
                }
                fVar.h(E9);
                return;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                io.flutter.plugins.firebase.auth.H h8 = (io.flutter.plugins.firebase.auth.H) arrayList2.get(1);
                String str = (String) arrayList2.get(2);
                C1154q c1154q = new C1154q(arrayList, fVar, 5);
                ((C1147j) ((InterfaceC1155s) this.f6409b)).getClass();
                C0602j c0602j = (C0602j) C1147j.f11872c.get((String) arrayList2.get(0));
                if (c0602j == null) {
                    c1154q.b(org.slf4j.helpers.i.J(new Exception("Resolver not found")));
                    return;
                }
                if (h8 != null) {
                    obj2 = new a4.z(a4.v.n(h8.f11793a, h8.f11794b));
                } else {
                    obj2 = (a4.t) C1147j.f11873d.get(str);
                }
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(U3.h.e(c0602j.f8267c));
                firebaseAuth.getClass();
                com.google.android.gms.common.internal.I.i(obj2);
                C0603k c0603k = c0602j.f8266b;
                com.google.android.gms.common.internal.I.i(c0603k);
                boolean z7 = obj2 instanceof a4.z;
                C0599g c0599g = c0602j.f8269e;
                if (z7) {
                    String str2 = c0603k.f8271b;
                    com.google.android.gms.common.internal.I.e(str2);
                    zza = firebaseAuth.f9707e.zza(firebaseAuth.f9703a, c0599g, (a4.z) obj2, str2, new C0460i(firebaseAuth));
                } else if (obj2 instanceof C0450C) {
                    String str3 = c0603k.f8271b;
                    com.google.android.gms.common.internal.I.e(str3);
                    zza = firebaseAuth.f9707e.zza(firebaseAuth.f9703a, c0599g, (C0450C) obj2, str3, firebaseAuth.f9711k, new C0460i(firebaseAuth));
                } else {
                    throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
                }
                zza.continueWithTask(new C0610s(c0602j, 2)).addOnCompleteListener(new P5.c(c1154q, 21));
                return;
            default:
                ArrayList arrayList3 = new ArrayList();
                r0 r0Var = (r0) ((ArrayList) obj).get(0);
                io.flutter.plugins.firebase.storage.g gVar = new io.flutter.plugins.firebase.storage.g(arrayList3, fVar, 7);
                A.l lVar = (A.l) this.f6409b;
                q3.g gVar2 = null;
                if (!lVar.f25a && A.l.f24d == null) {
                    A.l.f24d = gVar;
                    if (r0Var != null) {
                        int i8 = AbstractC1174g.f12138c[r0Var.ordinal()];
                        if (i8 != 1) {
                            if (i8 == 2) {
                                gVar2 = q3.g.LEGACY;
                            }
                        } else {
                            gVar2 = q3.g.LATEST;
                        }
                    }
                    q3.h.a((Context) lVar.f26b, gVar2, lVar);
                    return;
                }
                gVar.b(new C1190x(null, "Renderer already initialized", "Renderer initialization called multiple times"));
                return;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z7;
        q4.q qVar;
        switch (this.f6408a) {
            case 6:
                C0814p c0814p = (C0814p) this.f6409b;
                c0814p.getClass();
                q4.n nVar = (q4.n) task.getResult();
                if (nVar != null && nVar.c()) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                return new com.google.firebase.firestore.r(c0814p.f9839b, c0814p.f9838a, nVar, true, z7);
            case 7:
                com.google.firebase.firestore.g0 g0Var = (com.google.firebase.firestore.g0) this.f6409b;
                n4.D d7 = g0Var.f9808a;
                FirebaseFirestore firebaseFirestore = g0Var.f9809b;
                return new com.google.firebase.firestore.j0(new com.google.firebase.firestore.g0(d7, firebaseFirestore), (n4.T) task.getResult(), firebaseFirestore);
            case 8:
                p0 p0Var = (p0) this.f6409b;
                p0Var.getClass();
                if (task.isSuccessful()) {
                    List list = (List) task.getResult();
                    if (list.size() == 1) {
                        q4.n nVar2 = (q4.n) list.get(0);
                        boolean d8 = nVar2.d();
                        FirebaseFirestore firebaseFirestore2 = p0Var.f9841b;
                        if (d8) {
                            return new com.google.firebase.firestore.r(firebaseFirestore2, nVar2.f15362a, nVar2, false, false);
                        }
                        if (nVar2.e()) {
                            return new com.google.firebase.firestore.r(firebaseFirestore2, nVar2.f15362a, null, false, false);
                        }
                        m5.d.g(AbstractC0059i.w(q4.n.class, new StringBuilder("BatchGetDocumentsRequest returned unexpected document type: ")), new Object[0]);
                        throw null;
                    }
                    m5.d.g("Mismatch in docs returned from document lookup.", new Object[0]);
                    throw null;
                }
                throw task.getException();
            case 17:
                n4.M m7 = (n4.M) this.f6409b;
                m7.getClass();
                if (task.isSuccessful()) {
                    for (q4.n nVar3 : (List) task.getResult()) {
                        if (nVar3.d()) {
                            qVar = nVar3.f15364c;
                        } else if (nVar3.e()) {
                            qVar = q4.q.f15370b;
                        } else {
                            m5.d.g("Unexpected document type in transaction: " + nVar3, new Object[0]);
                            throw null;
                        }
                        HashMap hashMap = m7.f14312b;
                        q4.h hVar = nVar3.f15362a;
                        if (hashMap.containsKey(hVar)) {
                            if (!((q4.q) hashMap.get(hVar)).equals(nVar3.f15364c)) {
                                throw new com.google.firebase.firestore.J("Document version changed between two reads.", com.google.firebase.firestore.I.ABORTED);
                            }
                        } else {
                            hashMap.put(hVar, qVar);
                        }
                    }
                }
                return task;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                t4.i iVar = (t4.i) this.f6409b;
                iVar.getClass();
                if (!task.isSuccessful()) {
                    if ((task.getException() instanceof com.google.firebase.firestore.J) && ((com.google.firebase.firestore.J) task.getException()).f9763a == com.google.firebase.firestore.I.UNAUTHENTICATED) {
                        t4.p pVar = iVar.f15806c;
                        pVar.f15829b.C();
                        pVar.f15830c.B();
                    }
                    throw task.getException();
                }
                C0191w c0191w = (C0191w) task.getResult();
                q4.q D4 = C1608t.D(c0191w.v());
                int y2 = c0191w.y();
                ArrayList arrayList = new ArrayList(y2);
                for (int i7 = 0; i7 < y2; i7++) {
                    arrayList.add(C1608t.B(c0191w.x(i7), D4));
                }
                return arrayList;
            default:
                boolean isSuccessful = task.isSuccessful();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f6409b;
                if (isSuccessful) {
                    taskCompletionSource.setResult(task.getResult());
                    return null;
                }
                taskCompletionSource.setException(task.getException());
                return null;
        }
    }
}
