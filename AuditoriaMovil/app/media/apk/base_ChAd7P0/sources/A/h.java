package A;

import A3.H;
import A3.e0;
import B5.K;
import B5.Q;
import D.AbstractC0055e;
import H0.P;
import H0.T;
import H4.W;
import H4.e1;
import H4.p1;
import K5.r;
import O0.V;
import X5.C0391q;
import X5.g0;
import X5.i0;
import a.AbstractC0412a;
import a1.C0415A;
import a1.C0422H;
import a1.C0429f;
import a1.C0436m;
import a1.InterfaceC0428e;
import a1.p;
import a4.AbstractC0467p;
import a4.C0468q;
import android.graphics.pdf.PdfRenderer;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import b4.C0599g;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.C0814p;
import com.google.firebase.firestore.C0818u;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.I;
import com.google.firebase.firestore.J;
import com.google.firebase.firestore.L;
import com.google.firebase.firestore.S;
import com.google.firebase.firestore.U;
import com.google.firebase.firestore.X;
import com.google.firebase.firestore.b0;
import com.google.firebase.firestore.l0;
import e0.C0927b;
import e1.C0960z;
import io.flutter.plugins.firebase.auth.C1150m;
import io.flutter.plugins.firebase.auth.C1154q;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.firestore.AbstractC1161f;
import io.flutter.plugins.firebase.firestore.C;
import io.flutter.plugins.firebase.firestore.C1162g;
import io.flutter.plugins.firebase.firestore.E;
import io.flutter.plugins.firebase.firestore.q;
import io.flutter.plugins.firebase.firestore.t;
import io.flutter.plugins.firebase.firestore.v;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import n4.C1516b;
import n4.C1533t;
import n4.D;
import n4.O;
import n4.RunnableC1531q;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.external.ExternalParser;
import org.apache.tika.utils.XMLReaderUtils;
import p4.C1678h;
import p4.C1683m;
import p4.EnumC1670A;
import p4.Y;
import u0.C1854j;
import u0.C1855k;
import u0.C1857m;
import u0.C1858n;
import x4.C1997a;
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f14b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f15c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f16d;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i7) {
        this.f13a = i7;
        this.f14b = obj;
        this.f15c = obj2;
        this.f16d = obj3;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [P5.k, java.lang.Object] */
    private final void a() {
        boolean z7;
        U3.h hVar = (U3.h) this.f15c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f16d;
        HashMap hashMap = P5.d.f4034c;
        ((P5.d) this.f14b).getClass();
        try {
            hVar.a();
            String str = hVar.f5750b;
            hVar.a();
            P5.j a7 = P5.d.a(hVar.f5751c);
            hVar.a();
            C1997a c1997a = (C1997a) hVar.f5754g.get();
            synchronized (c1997a) {
                z7 = c1997a.f16504d;
            }
            Boolean valueOf = Boolean.valueOf(z7);
            Map map = (Map) Tasks.await(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(hVar));
            ?? obj = new Object();
            if (str != null) {
                obj.f4060a = str;
                obj.f4061b = a7;
                obj.f4062c = valueOf;
                if (map != null) {
                    obj.f4063d = map;
                    taskCompletionSource.setResult(obj);
                    return;
                }
                throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
            }
            throw new IllegalStateException("Nonnull field \"name\" is null.");
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, a1.A] */
    private final void b() {
        boolean z7;
        t tVar = (t) this.f15c;
        C1154q c1154q = (C1154q) this.f16d;
        FirebaseFirestore c8 = C1162g.c((q) this.f14b);
        R1.j jVar = c8.f9754k;
        jVar.n0();
        if (c8.f9756m == null) {
            L l8 = c8.j;
            X x7 = l8.f9773e;
            if (x7 != null) {
                z7 = x7 instanceof b0;
            } else {
                z7 = l8.f9771c;
            }
            if (z7 || (x7 instanceof b0)) {
                ?? obj = new Object();
                obj.f6744a = jVar;
                c8.f9756m = obj;
            }
        }
        C0415A c0415a = c8.f9756m;
        if (c0415a != null) {
            int i7 = AbstractC1161f.f11921c[tVar.ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        R1.j jVar2 = (R1.j) c0415a.f6744a;
                        synchronized (jVar2) {
                            jVar2.n0();
                            C1533t c1533t = (C1533t) jVar2.f4683c;
                            c1533t.e();
                            c1533t.f14363d.a(new RunnableC1531q(c1533t, 3));
                        }
                    }
                } else {
                    c0415a.g();
                }
            } else {
                c0415a.h();
            }
        } else {
            Log.d("FlutterFirestorePlugin", "`PersistentCacheIndexManager` is not available.");
        }
        c1154q.d(null);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [s5.a, java.lang.Object] */
    private final void c() {
        PdfRenderer pdfRenderer;
        r rVar = (r) this.f16d;
        s5.c cVar = (s5.c) this.f14b;
        cVar.getClass();
        L5.o oVar = (L5.o) this.f15c;
        byte[] bArr = (byte[]) oVar.a("documentBytes");
        String str = (String) oVar.a("documentID");
        String str2 = (String) oVar.a("password");
        try {
            File createTempFile = File.createTempFile(".syncfusion", ".pdf", cVar.f15698b.getCacheDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            ParcelFileDescriptor open = ParcelFileDescriptor.open(createTempFile, 268435456);
            if (Build.VERSION.SDK_INT >= 35 && str2 != null) {
                pdfRenderer = s5.c.a(open, str2);
            } else {
                pdfRenderer = new PdfRenderer(open);
            }
            ?? obj = new Object();
            obj.f15692a = pdfRenderer;
            obj.f15693b = open;
            cVar.f15699c.put(str, obj);
            int pageCount = pdfRenderer.getPageCount();
            createTempFile.delete();
            rVar.a(String.valueOf(pageCount));
        } catch (SecurityException unused) {
            rVar.b(null, "PASSWORD_ERROR", "Incorrect password or document is encrypted");
        } catch (Exception e7) {
            rVar.b(null, "PDF_RENDERER_ERROR", e7.getMessage());
        }
    }

    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, e1.D] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, D.d] */
    @Override // java.lang.Runnable
    public final void run() {
        Task e7;
        Throwable th;
        m4.e eVar;
        String str;
        String str2;
        String str3 = null;
        String str4 = null;
        switch (this.f13a) {
            case 0:
                l lVar = (l) this.f14b;
                lVar.getClass();
                Log.d("RequestMonitor", "RequestListener " + ((k) this.f15c) + " done " + lVar);
                ((List) lVar.f26b).remove((E3.b) this.f16d);
                return;
            case 1:
                K k2 = (K) this.f14b;
                k2.getClass();
                Q q2 = (Q) this.f15c;
                k2.c(false, Long.valueOf(q2.f333b), Long.valueOf(q2.f332a), ((KeyEvent) this.f16d).getEventTime());
                return;
            case 2:
                if (((M.e) this.f14b).f3072e0) {
                    ((Runnable) this.f15c).run();
                    return;
                } else {
                    ((Runnable) this.f16d).run();
                    return;
                }
            case 3:
                ((V2.k) this.f14b).k((M.m) this.f15c, (Map.Entry) this.f16d);
                return;
            case 4:
                if (((N.e) this.f14b).f) {
                    ((Runnable) this.f15c).run();
                    return;
                } else {
                    ((Runnable) this.f16d).run();
                    return;
                }
            case 5:
                V v6 = (V) this.f14b;
                v6.getClass();
                e0 g3 = ((H) this.f15c).g();
                P0.d dVar = v6.f3636c;
                P p7 = dVar.f3903X;
                p7.getClass();
                M3.q qVar = dVar.f3909d;
                qVar.getClass();
                qVar.f3254c = A3.K.p(g3);
                if (!g3.isEmpty()) {
                    qVar.f = (C0960z) g3.get(0);
                    C0960z c0960z = (C0960z) this.f16d;
                    c0960z.getClass();
                    qVar.f3253b = c0960z;
                }
                if (((C0960z) qVar.f3256e) == null) {
                    qVar.f3256e = M3.q.o(p7, (A3.K) qVar.f3254c, (C0960z) qVar.f, (T) qVar.f3252a);
                }
                qVar.z(((O0.H) p7).H());
                return;
            case 6:
                a();
                return;
            case 7:
                C0391q c0391q = new C0391q(2);
                g0 g0Var = (g0) this.f14b;
                g0Var.f6492b.g(g0Var, (WebView) this.f15c, (ClientCertRequest) this.f16d, c0391q);
                return;
            case 8:
                C0391q c0391q2 = new C0391q(2);
                g0 g0Var2 = (g0) this.f14b;
                g0Var2.f6492b.n(g0Var2, (WebView) this.f15c, (WebResourceRequest) this.f16d, c0391q2);
                return;
            case 9:
                C0391q c0391q3 = new C0391q(3);
                i0 i0Var = (i0) this.f14b;
                i0Var.f6501a.g(i0Var, (WebView) this.f15c, (ClientCertRequest) this.f16d, c0391q3);
                return;
            case 10:
                C0391q c0391q4 = new C0391q(3);
                i0 i0Var2 = (i0) this.f14b;
                i0Var2.f6501a.n(i0Var2, (WebView) this.f15c, (WebResourceRequest) this.f16d, c0391q4);
                return;
            case 11:
                p pVar = (p) ((C0429f) this.f14b).f6810c.f6409b;
                pVar.f6872c = (String) this.f15c;
                InterfaceC0428e interfaceC0428e = (InterfaceC0428e) this.f16d;
                C0422H u7 = interfaceC0428e.u();
                a1.r rVar = pVar.f6873d;
                if (u7 != null) {
                    C0436m c0436m = rVar.f6885d;
                    int g4 = interfaceC0428e.g();
                    c0436m.f6851Z.f6922c.put(Integer.valueOf(g4), u7);
                    rVar.q0 = true;
                }
                rVar.z();
                return;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                T0.d dVar2 = (T0.d) this.f14b;
                this.f15c.B(dVar2.f5287a, dVar2.f5288b, (b1.g) this.f16d);
                return;
            case 13:
                Boolean bool = (Boolean) this.f16d;
                AbstractC0467p A7 = C0927b.A((C1150m) this.f14b);
                P5.h hVar = (P5.h) this.f15c;
                if (A7 == null) {
                    hVar.a(org.slf4j.helpers.i.G());
                    return;
                }
                try {
                    hVar.c(AbstractC0055e.u((C0468q) Tasks.await(FirebaseAuth.getInstance(U3.h.e(((C0599g) A7).f8255c)).j(A7, bool.booleanValue()))));
                    return;
                } catch (Exception e8) {
                    hVar.a(org.slf4j.helpers.i.J(e8));
                    return;
                }
            case 14:
                q qVar2 = (q) this.f14b;
                String str5 = (String) this.f15c;
                C1154q c1154q = (C1154q) this.f16d;
                try {
                    Tasks.await(C1162g.c(qVar2).i(str5));
                    c1154q.d(null);
                    return;
                } catch (Exception e9) {
                    W.H(c1154q, e9);
                    return;
                }
            case 15:
                q qVar3 = (q) this.f14b;
                io.flutter.plugins.firebase.firestore.n nVar = (io.flutter.plugins.firebase.firestore.n) this.f15c;
                C1154q c1154q2 = (C1154q) this.f16d;
                try {
                    c1154q2.d((Void) Tasks.await(C1162g.c(qVar3).d(nVar.f11936a).b()));
                    return;
                } catch (Exception e10) {
                    W.H(c1154q2, e10);
                    return;
                }
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                q qVar4 = (q) this.f14b;
                io.flutter.plugins.firebase.firestore.n nVar2 = (io.flutter.plugins.firebase.firestore.n) this.f15c;
                C1154q c1154q3 = (C1154q) this.f16d;
                try {
                    C0814p d7 = C1162g.c(qVar4).d(nVar2.f11936a);
                    Map map = nVar2.f11937b;
                    Objects.requireNonNull(map);
                    Map map2 = map;
                    Boolean bool2 = nVar2.f11938c.f11953a;
                    if (bool2 != null && bool2.booleanValue()) {
                        e7 = d7.e(map2, l0.f9825d);
                    } else {
                        List list = nVar2.f11938c.f11954b;
                        if (list != null) {
                            e7 = d7.e(map2, l0.a(AbstractC0412a.K(list)));
                        } else {
                            e7 = d7.e(map2, l0.f9824c);
                        }
                    }
                    c1154q3.d((Void) Tasks.await(e7));
                    return;
                } catch (Exception e11) {
                    W.H(c1154q3, e11);
                    return;
                }
            case 17:
                io.flutter.plugins.firebase.firestore.n nVar3 = (io.flutter.plugins.firebase.firestore.n) this.f14b;
                q qVar5 = (q) this.f15c;
                C1154q c1154q4 = (C1154q) this.f16d;
                HashMap hashMap = C1162g.f11922Y;
                try {
                    c1154q4.d(AbstractC0412a.a0((com.google.firebase.firestore.r) Tasks.await(C1162g.c(qVar5).d(nVar3.f11936a).c(AbstractC0412a.O(nVar3.f11939d))), AbstractC0412a.N(nVar3.f11940e)));
                    return;
                } catch (Exception e12) {
                    W.H(c1154q4, e12);
                    return;
                }
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                q qVar6 = (q) this.f14b;
                List<C> list2 = (List) this.f15c;
                C1154q c1154q5 = (C1154q) this.f16d;
                try {
                    FirebaseFirestore c8 = C1162g.c(qVar6);
                    c8.f9754k.n0();
                    ?? obj = new Object();
                    obj.f690c = new ArrayList();
                    obj.f688a = false;
                    obj.f689b = c8;
                    ArrayList arrayList = (ArrayList) obj.f690c;
                    FirebaseFirestore firebaseFirestore = (FirebaseFirestore) obj.f689b;
                    for (C c9 : list2) {
                        E e13 = c9.f11907a;
                        Objects.requireNonNull(e13);
                        String str6 = c9.f11908b;
                        Objects.requireNonNull(str6);
                        Map map3 = c9.f11909c;
                        C0814p d8 = c8.d(str6);
                        int i7 = AbstractC1161f.f11920b[e13.ordinal()];
                        q4.h hVar2 = d8.f9838a;
                        if (i7 != 1) {
                            if (i7 != 2) {
                                if (i7 == 3) {
                                    v vVar = c9.f11910d;
                                    Objects.requireNonNull(vVar);
                                    Boolean bool3 = vVar.f11953a;
                                    if (bool3 != null && bool3.booleanValue()) {
                                        Objects.requireNonNull(map3);
                                        obj.o(d8, map3, l0.f9825d);
                                    } else {
                                        List list3 = vVar.f11954b;
                                        if (list3 != null) {
                                            ArrayList K7 = AbstractC0412a.K(list3);
                                            Objects.requireNonNull(map3);
                                            obj.o(d8, map3, l0.a(K7));
                                        } else {
                                            Objects.requireNonNull(map3);
                                            obj.o(d8, map3, l0.f9824c);
                                        }
                                    }
                                }
                            } else {
                                Objects.requireNonNull(map3);
                                O R7 = firebaseFirestore.f9752h.R(map3);
                                firebaseFirestore.k(d8);
                                obj.w();
                                arrayList.add(new r4.l(hVar2, R7.f14317a, R7.f14318b, r4.m.a(true), R7.f14319c));
                            }
                        } else {
                            firebaseFirestore.k(d8);
                            obj.w();
                            arrayList.add(new r4.h(hVar2, r4.m.f15508c));
                        }
                    }
                    Tasks.await(obj.g());
                    c1154q5.d(null);
                    return;
                } catch (Exception e14) {
                    W.H(c1154q5, e14);
                    return;
                }
            case 19:
                b();
                return;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                q qVar7 = (q) this.f14b;
                io.flutter.plugins.firebase.firestore.n nVar4 = (io.flutter.plugins.firebase.firestore.n) this.f15c;
                C1154q c1154q6 = (C1154q) this.f16d;
                try {
                    C0814p d9 = C1162g.c(qVar7).d(nVar4.f11936a);
                    Map map4 = nVar4.f11937b;
                    Objects.requireNonNull(map4);
                    Map map5 = map4;
                    HashMap hashMap2 = new HashMap();
                    for (Object obj2 : map5.keySet()) {
                        if (obj2 instanceof String) {
                            hashMap2.put(C0818u.b((String) obj2), map5.get(obj2));
                        } else if (obj2 instanceof C0818u) {
                            hashMap2.put((C0818u) obj2, map5.get(obj2));
                        } else {
                            throw new IllegalArgumentException("Invalid key type in update data. Supported types are String and FieldPath.");
                        }
                    }
                    C0818u c0818u = (C0818u) hashMap2.keySet().iterator().next();
                    Object obj3 = hashMap2.get(c0818u);
                    ArrayList arrayList2 = new ArrayList();
                    for (C0818u c0818u2 : hashMap2.keySet()) {
                        if (!c0818u2.equals(c0818u)) {
                            arrayList2.add(c0818u2);
                            arrayList2.add(hashMap2.get(c0818u2));
                        }
                    }
                    c1154q6.d((Void) Tasks.await(d9.f(c0818u, obj3, arrayList2.toArray())));
                    return;
                } catch (Exception e15) {
                    W.H(c1154q6, e15);
                    return;
                }
            case 21:
                C1516b c1516b = (C1516b) this.f14b;
                Object obj4 = this.f15c;
                J j = (J) this.f16d;
                if (!c1516b.f14332c) {
                    c1516b.f14331b.a(obj4, j);
                    return;
                }
                return;
            case 22:
                m4.f fVar = (m4.f) this.f15c;
                ByteArrayInputStream byteArrayInputStream = fVar.f14036b;
                U u8 = (U) this.f16d;
                n4.J j8 = ((C1533t) this.f14b).f14367i;
                C1683m c1683m = j8.f14291a;
                W w2 = c1683m.f15266a;
                String str7 = "Exception while closing bundle";
                String str8 = "SyncEngine";
                try {
                    try {
                        try {
                            eVar = fVar.f14037c;
                            try {
                                if (eVar == null) {
                                    m4.c c10 = fVar.c();
                                    if (c10 instanceof m4.e) {
                                        eVar = (m4.e) c10;
                                        fVar.f14037c = eVar;
                                        fVar.f14039e = 0L;
                                    } else {
                                        fVar.a("Expected first element in bundle to be a metadata object");
                                        throw null;
                                    }
                                }
                            } catch (Exception e16) {
                                e = e16;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Exception e17) {
                        e = e17;
                        str3 = "Exception while closing bundle";
                        str4 = "SyncEngine";
                    }
                    if (((Boolean) w2.F("Has newer bundle", new A4.d(21, c1683m, eVar))).booleanValue()) {
                        try {
                            int i8 = eVar.f14033d;
                            com.google.firebase.firestore.V v7 = com.google.firebase.firestore.V.SUCCESS;
                            long j9 = eVar.f14034e;
                            u8.c(new com.google.firebase.firestore.W(i8, i8, j9, j9, null, v7));
                            try {
                                byteArrayInputStream.close();
                                return;
                            } catch (IOException e18) {
                                u4.q.d("SyncEngine", "Exception while closing bundle", e18);
                                return;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            str3 = "Exception while closing bundle";
                            str4 = "SyncEngine";
                        }
                    } else {
                        u8.d(new com.google.firebase.firestore.W(0, eVar.f14033d, 0L, eVar.f14034e, null, com.google.firebase.firestore.V.RUNNING));
                        m4.d dVar3 = new m4.d(c1683m, eVar);
                        long j10 = 0;
                        while (true) {
                            if (fVar.f14037c == null) {
                                m4.c c11 = fVar.c();
                                if (c11 instanceof m4.e) {
                                    fVar.f14037c = (m4.e) c11;
                                    fVar.f14039e = 0L;
                                } else {
                                    fVar.a("Expected first element in bundle to be a metadata object");
                                    throw null;
                                }
                            }
                            m4.c c12 = fVar.c();
                            if (c12 != null) {
                                str = str7;
                                str2 = str8;
                                try {
                                    try {
                                        long j11 = fVar.f14039e;
                                        com.google.firebase.firestore.W a7 = dVar3.a(c12, j11 - j10);
                                        if (a7 != null) {
                                            u8.d(a7);
                                        }
                                        j10 = j11;
                                        str7 = str;
                                        str8 = str2;
                                    } catch (Exception e19) {
                                        e = e19;
                                        str3 = str;
                                        str4 = str2;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    str3 = str;
                                    str4 = str2;
                                }
                            } else {
                                str = str7;
                                str2 = str8;
                                try {
                                    j8.b(dVar3.b(), null);
                                    w2.G("Save bundle", new S(26, c1683m, eVar));
                                    int i9 = eVar.f14033d;
                                    com.google.firebase.firestore.V v8 = com.google.firebase.firestore.V.SUCCESS;
                                    long j12 = eVar.f14034e;
                                    u8.c(new com.google.firebase.firestore.W(i9, i9, j12, j12, null, v8));
                                    try {
                                        byteArrayInputStream.close();
                                        return;
                                    } catch (IOException e20) {
                                        u4.q.d(str2, str, e20);
                                        return;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    str3 = str;
                                    str4 = str2;
                                    th = th;
                                    byteArrayInputStream.close();
                                    throw th;
                                }
                            }
                            e = e19;
                            str3 = str;
                            str4 = str2;
                            u4.q.d("Firestore", "Loading bundle failed : %s", e);
                            u8.b(new J("Bundle failed to load", I.INVALID_ARGUMENT, e));
                            try {
                                byteArrayInputStream.close();
                                return;
                            } catch (IOException e21) {
                                u4.q.d(str4, str3, e21);
                                return;
                            }
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    str3 = str7;
                    str4 = str8;
                }
                try {
                    byteArrayInputStream.close();
                } catch (IOException e22) {
                    u4.q.d(str4, str3, e22);
                }
                throw th;
            case 23:
                n4.J j13 = ((C1533t) this.f14b).f14367i;
                j13.a("writeMutations");
                C1683m c1683m2 = j13.f14291a;
                U3.p pVar2 = new U3.p(new Date());
                HashSet hashSet = new HashSet();
                List<r4.h> list4 = (List) this.f15c;
                for (r4.h hVar3 : list4) {
                    hashSet.add(hVar3.f15496a);
                }
                C1678h c1678h = (C1678h) c1683m2.f15266a.F("Locally write mutations", new W3.a(c1683m2, hashSet, list4, pVar2));
                int i10 = c1678h.f15254a;
                HashMap hashMap3 = j13.f14298i;
                Map map6 = (Map) hashMap3.get(j13.f14300l);
                if (map6 == null) {
                    map6 = new HashMap();
                    hashMap3.put(j13.f14300l, map6);
                }
                map6.put(Integer.valueOf(i10), (TaskCompletionSource) this.f16d);
                j13.b(c1678h.f15255b, null);
                j13.f14292b.f();
                return;
            case 24:
                C1683m c1683m3 = ((C1533t) this.f14b).f14365g;
                c1683m3.getClass();
                m4.i iVar = (m4.i) c1683m3.f15266a.F("Get named query", new A4.d((String) this.f15c, 18, c1683m3));
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f16d;
                if (iVar != null) {
                    m4.h hVar4 = iVar.f14047b;
                    n4.L l8 = hVar4.f14044a;
                    taskCompletionSource.setResult(new D(l8.f14306d, l8.f14307e, l8.f14305c, l8.f14304b, l8.f, hVar4.f14045b, l8.f14308g, l8.f14309h));
                    return;
                }
                taskCompletionSource.setResult(null);
                return;
            case 25:
                ((ExternalParser) this.f14b).lambda$extractMetadata$2((InputStream) this.f15c, (Metadata) this.f16d);
                return;
            case 26:
                C1683m c1683m4 = (C1683m) this.f14b;
                B5.L l9 = c1683m4.f15276m;
                int i11 = l9.f327a;
                l9.f327a = 2 + i11;
                p4.r rVar2 = (p4.r) this.f15c;
                rVar2.f15285a = i11;
                Y y2 = new Y((n4.L) this.f16d, i11, c1683m4.f15266a.t().S(), EnumC1670A.LISTEN);
                rVar2.f15286b = y2;
                c1683m4.f15273i.h(y2);
                return;
            case 27:
                c();
                return;
            default:
                C1855k c1855k = (C1855k) this.f14b;
                f7.a aVar = (f7.a) this.f15c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f16d;
                c1855k.getClass();
                try {
                    C1858n a8 = android.support.v4.media.session.a.a(c1855k.f15931a);
                    if (a8 != null) {
                        C1857m c1857m = (C1857m) a8.f15944a;
                        synchronized (c1857m.f15939d) {
                            c1857m.f = threadPoolExecutor;
                        }
                        a8.f15944a.a(new C1854j(aVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th7) {
                    aVar.f0(th7);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }
}
