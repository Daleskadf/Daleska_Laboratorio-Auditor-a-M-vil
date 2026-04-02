package A4;

import A3.N;
import B5.AbstractActivityC0032e;
import B5.C0050x;
import D.AbstractC0059i;
import D.C0064n;
import D.C0075z;
import D.RunnableC0073x;
import D.i0;
import D.n0;
import D.t0;
import D.v0;
import E6.l;
import F3.o;
import H.k;
import H0.C0140u;
import H4.C0181q0;
import H4.p1;
import K0.h;
import K0.i;
import M.e;
import M.g;
import M0.x;
import O.f;
import Q0.A;
import U.j;
import U3.p;
import a1.C0415A;
import a6.C0476e;
import a6.U;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Size;
import android.util.SparseArray;
import android.view.Surface;
import androidx.camera.core.impl.S;
import androidx.camera.core.impl.T;
import androidx.datastore.preferences.protobuf.Y;
import c4.C0632a;
import c4.InterfaceC0635d;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.firestore.C0803e;
import com.google.firebase.firestore.C0804f;
import com.google.firebase.firestore.I;
import com.google.firebase.firestore.J;
import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.X;
import e1.C0960z;
import h1.m;
import io.flutter.plugins.googlemaps.C1190x;
import io.flutter.plugins.googlemaps.s0;
import io.flutter.plugins.googlemaps.w0;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import n4.D;
import n4.EnumC1514C;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import p.C1608t;
import p.Y0;
import p4.C;
import p4.C1683m;
import p4.C1688s;
import p4.K;
import p4.L;
import p4.P;
import p4.Q;
import p4.V;
import q4.n;
import q4.q;
import u4.r;
import w.C1903M;
import w.C1914Y;
import w4.InterfaceC1955a;
import w4.InterfaceC1956b;
import x5.C2010l;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC0635d, j, S, h, i, InterfaceC1955a, Continuation, m, L5.c, r, u4.m, H.a, i0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f219a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f220b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f221c;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.f219a = i7;
        this.f220b = obj;
        this.f221c = obj2;
    }

    @Override // D.i0
    public void a(v0 request) {
        C2010l this$0 = (C2010l) this.f220b;
        kotlin.jvm.internal.j.e(this$0, "this$0");
        TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) this.f221c;
        kotlin.jvm.internal.j.e(request, "request");
        textureRegistry$SurfaceProducer.setCallback(new C0415A(request));
        Size size = request.f783b;
        textureRegistry$SurfaceProducer.setSize(size.getWidth(), size.getHeight());
        Surface surface = textureRegistry$SurfaceProducer.getSurface();
        kotlin.jvm.internal.j.d(surface, "surfaceProducer.surface");
        request.a(surface, Executors.newSingleThreadExecutor(), new C0050x(surface, 4));
    }

    @Override // u4.m, H.a, J2.g
    public Object apply(Object obj) {
        EnumC1514C enumC1514C;
        Object obj2 = this.f221c;
        Object obj3 = this.f220b;
        boolean z7 = true;
        switch (this.f219a) {
            case 22:
                String str = (String) obj3;
                Cursor cursor = (Cursor) obj;
                ((C1608t) obj2).getClass();
                if (cursor != null) {
                    try {
                        G4.d C7 = G4.d.C(cursor.getBlob(2));
                        if (C7.y().equals(G4.c.FIRST)) {
                            enumC1514C = EnumC1514C.LIMIT_TO_FIRST;
                        } else {
                            enumC1514C = EnumC1514C.LIMIT_TO_LAST;
                        }
                        return new m4.i(str, new m4.h(C1608t.C(C7.z(), C7.A()), enumC1514C), new q(new p(cursor.getInt(1), cursor.getLong(0))));
                    } catch (X e7) {
                        m5.d.g("NamedQuery failed to parse: %s", e7);
                        throw null;
                    }
                }
                return null;
            default:
                n nVar = (n) obj;
                if (!((D) obj3).g(nVar) && !((Set) obj2).contains(nVar.f15362a)) {
                    z7 = false;
                }
                return Boolean.valueOf(z7);
        }
    }

    @Override // androidx.camera.core.impl.S
    public void b(T t7) {
        switch (this.f219a) {
            case 3:
                n0 n0Var = (n0) this.f220b;
                n0Var.getClass();
                ((S) this.f221c).b(n0Var);
                return;
            default:
                A.m mVar = (A.m) this.f220b;
                mVar.getClass();
                ((S) this.f221c).b(mVar);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:402:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15, types: [A3.N] */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31, types: [java.lang.Object, H0.r] */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    @Override // K0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.Object r28, H0.C0136p r29) {
        /*
            Method dump skipped, instructions count: 1726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.d.c(java.lang.Object, H0.p):void");
    }

    @Override // c4.InterfaceC0635d
    public Object d(M3.q qVar) {
        String str;
        int i7;
        switch (this.f219a) {
            case 0:
                Context context = (Context) qVar.a(Context.class);
                switch (((P0.b) this.f221c).f3901a) {
                    case 21:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            str = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        } else {
                            str = StringUtils.EMPTY;
                            break;
                        }
                    case 22:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null && Build.VERSION.SDK_INT >= 24) {
                            i7 = applicationInfo2.minSdkVersion;
                            str = String.valueOf(i7);
                            break;
                        } else {
                            str = StringUtils.EMPTY;
                            break;
                        }
                        break;
                    case 23:
                        int i8 = Build.VERSION.SDK_INT;
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            str = "tv";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            str = "watch";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            str = "auto";
                            break;
                        } else if (i8 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            str = "embedded";
                            break;
                        } else {
                            str = StringUtils.EMPTY;
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            str = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        } else {
                            str = StringUtils.EMPTY;
                            break;
                        }
                }
                return new a((String) this.f220b, str);
            default:
                String str2 = (String) this.f220b;
                C0632a c0632a = (C0632a) this.f221c;
                try {
                    Trace.beginSection(str2);
                    return c0632a.f.d(qVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    @Override // h1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public A3.e0 e(int r17, H0.W r18, int[] r19) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.d.e(int, H0.W, int[]):A3.e0");
    }

    @Override // w4.InterfaceC1955a
    public void f(InterfaceC1956b interfaceC1956b) {
        ((InterfaceC1955a) this.f220b).f(interfaceC1956b);
        ((InterfaceC1955a) this.f221c).f(interfaceC1956b);
    }

    public void g(C0064n c0064n) {
        e eVar = (e) this.f220b;
        eVar.getClass();
        f fVar = f.DEFAULT;
        if (((v0) this.f221c).f784c.a() && c0064n.f749d) {
            fVar = f.YUV;
        }
        g gVar = eVar.f3067a;
        O.i.d(gVar.f3076a, true);
        O.i.c(gVar.f3078c);
        if (gVar.f3085l != fVar) {
            gVar.f3085l = fVar;
            gVar.k(gVar.f3086m);
        }
    }

    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, p4.r] */
    @Override // u4.r
    public Object get() {
        boolean z7;
        boolean z8;
        Long l8;
        Long l9;
        Long l10 = null;
        Object obj = this.f221c;
        Object obj2 = this.f220b;
        boolean z9 = true;
        switch (this.f219a) {
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return ((C1683m) obj).j.f((String) obj2);
            case 19:
                C1683m c1683m = (C1683m) obj2;
                o oVar = (o) obj;
                r4.i iVar = (r4.i) oVar.f1178b;
                c1683m.f15268c.c(iVar, (AbstractC0852m) oVar.f1181e);
                Iterator it = iVar.b().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    ArrayList arrayList = (ArrayList) oVar.f1180d;
                    List list = iVar.f15502d;
                    if (hasNext) {
                        q4.h hVar = (q4.h) it.next();
                        C c8 = c1683m.f15270e;
                        n j = c8.j(hVar);
                        q qVar = (q) ((e4.c) oVar.f).f(hVar);
                        if (qVar != null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        m5.d.i("docVersions should contain every doc in the write.", z7, new Object[0]);
                        if (j.f15364c.compareTo(qVar) < 0) {
                            int size = list.size();
                            if (arrayList.size() == size) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            m5.d.i("Mismatch between mutations length (%d) and results length (%d)", z8, Integer.valueOf(size), Integer.valueOf(arrayList.size()));
                            for (int i7 = 0; i7 < size; i7++) {
                                r4.h hVar2 = (r4.h) list.get(i7);
                                if (hVar2.f15496a.equals(j.f15362a)) {
                                    hVar2.b(j, (r4.j) arrayList.get(i7));
                                }
                            }
                            if (!j.f15363b.equals(q4.m.INVALID)) {
                                c8.h(j, (q) oVar.f1179c);
                            }
                        }
                    } else {
                        c1683m.f15268c.i(iVar);
                        c1683m.f15268c.b();
                        c1683m.f15269d.I(iVar.f15499a);
                        E.e eVar = c1683m.f;
                        HashSet hashSet = new HashSet();
                        for (int i8 = 0; i8 < arrayList.size(); i8++) {
                            if (!((r4.j) arrayList.get(i8)).f15504b.isEmpty()) {
                                hashSet.add(((r4.h) list.get(i8)).f15496a);
                            }
                        }
                        eVar.X(((C) eVar.f920b).p(hashSet));
                        return c1683m.f.H(iVar.b());
                    }
                }
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                SparseArray sparseArray = ((C1683m) obj2).f15274k;
                C1688s c1688s = (C1688s) obj;
                C0140u c0140u = c1688s.f15290b;
                long j8 = -1;
                if (c0140u.f1902a == -1) {
                    u4.q.a("LruGarbageCollector", "Garbage collection skipped; disabled", new Object[0]);
                    return new Object();
                }
                Object obj3 = c1688s.f15289a;
                Q q2 = ((K) obj3).f15196a;
                Cursor s7 = q2.R("PRAGMA page_count").s();
                try {
                    if (s7.moveToFirst()) {
                        l8 = Long.valueOf(s7.getLong(0));
                        s7.close();
                    } else {
                        s7.close();
                        l8 = null;
                    }
                    long longValue = l8.longValue();
                    Cursor s8 = q2.R("PRAGMA page_size").s();
                    try {
                        if (s8.moveToFirst()) {
                            l9 = Long.valueOf(s8.getLong(0));
                            s8.close();
                        } else {
                            s8.close();
                            l9 = null;
                        }
                        long longValue2 = l9.longValue() * longValue;
                        long j9 = c0140u.f1902a;
                        if (longValue2 < j9) {
                            u4.q.a("LruGarbageCollector", "Garbage collection skipped; Cache size " + longValue2 + " is lower than threshold " + j9, new Object[0]);
                            return new Object();
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        Q q7 = ((K) obj3).f15196a;
                        long j10 = q7.f15215i.f;
                        Cursor s9 = q7.R("SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)").s();
                        try {
                            if (s9.moveToFirst()) {
                                l10 = Long.valueOf(s9.getLong(0));
                            }
                            s9.close();
                            int longValue3 = (int) ((10 / 100.0f) * ((float) (l10.longValue() + j10)));
                            if (longValue3 > 1000) {
                                u4.q.a("LruGarbageCollector", io.flutter.plugins.pathprovider.b.e(longValue3, "Capping sequence numbers to collect down to the maximum of 1000 from "), new Object[0]);
                                longValue3 = 1000;
                            }
                            long currentTimeMillis2 = System.currentTimeMillis();
                            if (longValue3 != 0) {
                                final ?? obj4 = new Object();
                                obj4.f15285a = longValue3;
                                obj4.f15286b = new PriorityQueue(longValue3, p4.r.f15284c);
                                u4.g gVar = new u4.g() { // from class: p4.p
                                    @Override // u4.g
                                    public final void accept(Object obj5) {
                                        switch (r2) {
                                            case 0:
                                                obj4.a(Long.valueOf(((Y) obj5).f15237c));
                                                return;
                                            default:
                                                obj4.a((Long) obj5);
                                                return;
                                        }
                                    }
                                };
                                V v6 = ((K) obj3).f15196a.f15215i;
                                Cursor s10 = v6.f15230a.R("SELECT target_proto FROM targets").s();
                                while (s10.moveToNext()) {
                                    try {
                                        gVar.accept(v6.k(s10.getBlob(0)));
                                    } finally {
                                    }
                                }
                                s10.close();
                                u4.g gVar2 = new u4.g() { // from class: p4.p
                                    @Override // u4.g
                                    public final void accept(Object obj5) {
                                        switch (r2) {
                                            case 0:
                                                obj4.a(Long.valueOf(((Y) obj5).f15237c));
                                                return;
                                            default:
                                                obj4.a((Long) obj5);
                                                return;
                                        }
                                    }
                                };
                                s10 = ((K) obj3).f15196a.R("select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0").s();
                                while (s10.moveToNext()) {
                                    try {
                                        gVar2.accept(Long.valueOf(s10.getLong(0)));
                                    } finally {
                                    }
                                }
                                s10.close();
                                j8 = ((Long) ((PriorityQueue) obj4.f15286b).peek()).longValue();
                            }
                            long currentTimeMillis3 = System.currentTimeMillis();
                            V v7 = ((K) obj3).f15196a.f15215i;
                            int[] iArr = new int[1];
                            P R7 = v7.f15230a.R("SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?");
                            int i9 = longValue3;
                            R7.a(Long.valueOf(j8));
                            R7.e(new L(v7, sparseArray, iArr, 1));
                            v7.m();
                            int i10 = iArr[0];
                            long currentTimeMillis4 = System.currentTimeMillis();
                            final K k2 = (K) obj3;
                            k2.getClass();
                            final int[] iArr2 = new int[1];
                            final ArrayList arrayList2 = new ArrayList();
                            final q4.p[] pVarArr = {q4.p.f15369b};
                            while (true) {
                                Q q8 = k2.f15196a;
                                int i11 = i10;
                                P R8 = q8.R("select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? AND path > ? LIMIT ?");
                                long j11 = j8;
                                R8.a(Long.valueOf(j8), G.i.x(pVarArr[0]), 100);
                                if (R8.e(new u4.g() { // from class: p4.J
                                    @Override // u4.g
                                    public final void accept(Object obj5) {
                                        boolean moveToFirst;
                                        K k8 = K.this;
                                        k8.getClass();
                                        q4.p v8 = G.i.v(((Cursor) obj5).getString(0));
                                        q4.h hVar3 = new q4.h(v8);
                                        boolean v9 = k8.f15200e.v(hVar3);
                                        Q q9 = k8.f15196a;
                                        q4.p pVar = hVar3.f15357a;
                                        if (v9) {
                                            moveToFirst = true;
                                        } else {
                                            P R9 = q9.R("SELECT 1 FROM document_mutations WHERE path = ?");
                                            R9.a(G.i.x(pVar));
                                            Cursor s11 = R9.s();
                                            try {
                                                moveToFirst = s11.moveToFirst();
                                                s11.close();
                                            } catch (Throwable th) {
                                                if (s11 != null) {
                                                    try {
                                                        s11.close();
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                }
                                                throw th;
                                            }
                                        }
                                        if (!moveToFirst) {
                                            int[] iArr3 = iArr2;
                                            iArr3[0] = iArr3[0] + 1;
                                            arrayList2.add(hVar3);
                                            q9.Q("DELETE FROM target_documents WHERE path = ? AND target_id = 0", G.i.x(pVar));
                                        }
                                        pVarArr[0] = v8;
                                    }
                                }) == 100) {
                                    i10 = i11;
                                    j8 = j11;
                                } else {
                                    q8.f15216k.c(arrayList2);
                                    int i12 = iArr2[0];
                                    long currentTimeMillis5 = System.currentTimeMillis();
                                    if (u4.q.c()) {
                                        StringBuilder l11 = Y.l(AbstractC0059i.C(new StringBuilder("LRU Garbage Collection:\n\tCounted targets in "), currentTimeMillis2 - currentTimeMillis, "ms\n"));
                                        Locale locale = Locale.ROOT;
                                        l11.append("\tDetermined least recently used " + i9 + " sequence numbers in " + (currentTimeMillis3 - currentTimeMillis2) + "ms\n");
                                        StringBuilder l12 = Y.l(l11.toString());
                                        l12.append("\tRemoved " + i11 + " targets in " + (currentTimeMillis4 - currentTimeMillis3) + "ms\n");
                                        StringBuilder l13 = Y.l(l12.toString());
                                        l13.append("\tRemoved " + i12 + " documents in " + (currentTimeMillis5 - currentTimeMillis4) + "ms\n");
                                        StringBuilder l14 = Y.l(l13.toString());
                                        StringBuilder sb = new StringBuilder("Total Duration: ");
                                        sb.append(currentTimeMillis5 - currentTimeMillis);
                                        sb.append("ms");
                                        l14.append(sb.toString());
                                        u4.q.a("LruGarbageCollector", l14.toString(), new Object[0]);
                                    }
                                    return new Object();
                                }
                            }
                        } finally {
                            if (s9 != null) {
                                try {
                                    s9.close();
                                } catch (Throwable th) {
                                    th.addSuppressed(th);
                                }
                            }
                        }
                    } finally {
                        if (s8 != null) {
                            try {
                                s8.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                    }
                } finally {
                    if (s7 != null) {
                        try {
                            s7.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                }
            default:
                C1683m c1683m2 = (C1683m) obj2;
                c1683m2.getClass();
                m4.e eVar2 = (m4.e) obj;
                m4.e e7 = c1683m2.j.e(eVar2.f14030a);
                return Boolean.valueOf((e7 == null || e7.f14032c.f15371a.compareTo(eVar2.f14032c.f15371a) < 0) ? false : false);
        }
    }

    @Override // L5.c
    public void h(Object obj) {
        boolean z7 = obj instanceof List;
        w0 w0Var = (w0) this.f221c;
        if (z7) {
            List list = (List) obj;
            if (list.size() > 1) {
                w0Var.b(new C1190x(list.get(2), (String) list.get(0), (String) list.get(1)));
                return;
            } else if (list.get(0) == null) {
                w0Var.b(new C1190x(StringUtils.EMPTY, "null-error", "Flutter api returned null value for non-null return value."));
                return;
            } else {
                w0Var.a((s0) list.get(0));
                return;
            }
        }
        w0Var.b(android.support.v4.media.session.a.b((String) this.f220b));
    }

    @Override // U.j
    public Object i(U.i iVar) {
        switch (this.f219a) {
            case 2:
                C0075z c0075z = (C0075z) this.f220b;
                c0075z.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Executor executor = c0075z.f816d;
                executor.execute(new RunnableC0073x(c0075z, (AbstractActivityC0032e) this.f221c, executor, 1, iVar, elapsedRealtime));
                return "CameraX initInternal";
            case 3:
            default:
                R.e this$0 = (R.e) this.f220b;
                C0075z c0075z2 = (C0075z) this.f221c;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                synchronized (this$0.f4514a) {
                    H.d b5 = H.d.b(k.f1628c);
                    A.j jVar = new A.j(new l(c0075z2, 4), 24);
                    G.a r7 = j3.f.r();
                    b5.getClass();
                    H.b f = H.i.f(b5, jVar, r7);
                    x xVar = new x(iVar, c0075z2, 11, false);
                    f.a(new H.h(0, f, xVar), j3.f.r());
                }
                return "ProcessCameraProvider-initializeCameraX";
            case 4:
                v0 v0Var = (v0) this.f220b;
                v0Var.getClass();
                ((AtomicReference) this.f221c).set(iVar);
                return "SurfaceRequest-surface-recreation(" + v0Var.hashCode() + ")";
        }
    }

    @Override // K0.h
    public void invoke(Object obj) {
        P0.i iVar = (P0.i) obj;
        iVar.getClass();
        P0.a aVar = (P0.a) this.f220b;
        C0960z c0960z = aVar.f3896d;
        if (c0960z != null) {
            b1.g gVar = (b1.g) this.f221c;
            H0.r rVar = (H0.r) gVar.f;
            rVar.getClass();
            c0960z.getClass();
            N n7 = new N(rVar, gVar.f8137c, iVar.f3927b.d(aVar.f3894b, c0960z), 2);
            int i7 = gVar.f8136b;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            iVar.f3940q = n7;
                            return;
                        }
                        return;
                    }
                } else {
                    iVar.f3939p = n7;
                    return;
                }
            }
            iVar.f3938o = n7;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Object obj = this.f221c;
        Object obj2 = this.f220b;
        switch (this.f219a) {
            case 13:
                C0803e c0803e = (C0803e) obj2;
                c0803e.getClass();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                if (task.isSuccessful()) {
                    taskCompletionSource.setResult(new C0804f(c0803e, (Map) task.getResult()));
                    return null;
                }
                taskCompletionSource.setException(task.getException());
                return null;
            case 24:
                t4.i iVar = (t4.i) obj2;
                iVar.getClass();
                if (!task.isSuccessful()) {
                    if ((task.getException() instanceof J) && ((J) task.getException()).f9763a == I.UNAUTHENTICATED) {
                        t4.p pVar = iVar.f15806c;
                        pVar.f15829b.C();
                        pVar.f15830c.B();
                    }
                    throw task.getException();
                }
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((C0181q0) task.getResult()).w().v().entrySet()) {
                    HashMap hashMap2 = (HashMap) obj;
                    m5.d.i("%s not present in aliasMap", hashMap2.containsKey(entry.getKey()), entry.getKey());
                    hashMap.put((String) hashMap2.get(entry.getKey()), (p1) entry.getValue());
                }
                return hashMap;
            default:
                Y0 y02 = (Y0) obj2;
                y02.getClass();
                return Tasks.forResult(((U) task.getResult()).n((A) obj, (C0476e) y02.f14762d));
        }
    }

    public /* synthetic */ d(String str, int i7, Object obj) {
        this.f219a = i7;
        this.f221c = obj;
        this.f220b = str;
    }

    @Override // u4.m, H.a, J2.g
    public E3.b apply(Object obj) {
        switch (this.f219a) {
            case 26:
                Void r42 = (Void) obj;
                C1903M c1903m = (C1903M) this.f220b;
                c1903m.a();
                ((t0) this.f221c).a();
                return c1903m.n();
            default:
                List list = (List) obj;
                C1914Y c1914y = (C1914Y) this.f220b;
                c1914y.getClass();
                org.slf4j.helpers.i.l("SyncCaptureSessionBase", "[" + c1914y + "] getSurface done with results: " + list);
                if (list.isEmpty()) {
                    return new k(new IllegalArgumentException("Unable to open capture session without surfaces"), 1);
                }
                if (list.contains(null)) {
                    return new k(new androidx.camera.core.impl.I("Surface closed", (androidx.camera.core.impl.J) ((ArrayList) this.f221c).get(list.indexOf(null))), 1);
                }
                return H.i.c(list);
        }
    }
}
