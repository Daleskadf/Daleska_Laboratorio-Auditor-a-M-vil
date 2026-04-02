package b3;

import D.AbstractC0055e;
import D.C0054d;
import H0.H;
import H4.C0151b1;
import H4.C0158f;
import H4.C0159f0;
import H4.C0160g;
import H4.C0163h0;
import H4.D;
import H4.S;
import H4.d1;
import H4.n1;
import H4.o1;
import H4.p1;
import H4.r1;
import H4.t1;
import K5.r;
import L5.q;
import S0.t;
import U3.p;
import a6.C0475d;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.common.api.internal.InterfaceC0747v;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxy;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzya;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.A;
import com.google.firebase.firestore.C0806h;
import com.google.firebase.firestore.C0814p;
import com.google.firebase.firestore.C0818u;
import com.google.firebase.firestore.C0819v;
import com.google.firebase.firestore.C0820w;
import com.google.firebase.firestore.C0821x;
import com.google.firebase.firestore.C0822y;
import com.google.firebase.firestore.C0823z;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.N;
import com.google.firebase.firestore.s0;
import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.EnumC0870v0;
import com.google.protobuf.M0;
import com.google.protobuf.N0;
import f6.C0994a;
import g.C0996a;
import g.InterfaceC0997b;
import g1.C1006c;
import i3.InterfaceC1109a;
import i5.C1112a;
import i5.C1113b;
import io.flutter.plugins.googlemaps.InterfaceC1183p;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import l4.C1418b;
import n4.F;
import n4.J;
import n4.L;
import n4.O;
import n4.P;
import n4.y;
import o.MenuC1545i;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p.C1581f;
import p.C1587i;
import p.C1608t;
import p.Y0;
import p4.AbstractC1679i;
import p4.EnumC1670A;
import p4.Y;
import p5.C1696b;
import p5.C1697c;
import q4.C1711d;
import q4.j;
import q4.k;
import q4.l;
import q4.m;
import q4.n;
import q4.o;
import q4.s;
import r4.AbstractC1746c;
import s3.C1774b;
import s3.C1783k;
import s4.C1794d;
import u4.u;
import z0.AbstractComponentCallbacksC2061v;
import z0.E;
/* renamed from: b3.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0585f implements InterfaceC0747v, com.dexterous.flutterlocalnotifications.i, InterfaceC1183p, j5.a, InterfaceC0997b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8170a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8171b;

    public /* synthetic */ C0585f(h hVar, C0580a c0580a) {
        this.f8170a = 0;
        this.f8171b = c0580a;
    }

    public static ArrayList D(F4.i iVar) {
        j jVar;
        ArrayList arrayList = new ArrayList();
        for (F4.g gVar : iVar.x()) {
            k l8 = k.l(gVar.y());
            if (gVar.A().equals(F4.f.ARRAY_CONFIG)) {
                jVar = j.CONTAINS;
            } else if (gVar.z().equals(F4.e.ASCENDING)) {
                jVar = j.ASCENDING;
            } else {
                jVar = j.DESCENDING;
            }
            arrayList.add(new C1711d(l8, jVar));
        }
        return arrayList;
    }

    public static boolean I(int i7) {
        if ((48 > i7 || i7 > 57) && i7 != 35 && i7 != 42) {
            return false;
        }
        return true;
    }

    public static p1 Q(p pVar) {
        int i7 = (pVar.f5766b / PipesIterator.DEFAULT_QUEUE_SIZE) * PipesIterator.DEFAULT_QUEUE_SIZE;
        n1 T7 = p1.T();
        M0 A7 = N0.A();
        A7.f(pVar.f5765a);
        A7.d();
        N0.w((N0) A7.f10006b, i7);
        T7.l(A7);
        return (p1) T7.b();
    }

    public static C0475d T(zzxq zzxqVar) {
        if (zzxqVar == null) {
            return null;
        }
        zzxqVar.zzf();
        zzxqVar.zzd();
        zzxqVar.zza();
        zzxqVar.zzb();
        zzxqVar.zzc();
        zzxqVar.zze();
        zzxqVar.zzh();
        return new C0475d(zzxqVar.zzg(), 1);
    }

    @Override // com.dexterous.flutterlocalnotifications.i
    public void A() {
        ((q) this.f8171b).b(null, "permissionRequestInProgress", "Another permission request is already in progress");
    }

    @Override // j5.a
    public Y0 B() {
        Object arrayList;
        zzxs zzd = ((zzyb) this.f8171b).zzd();
        Y0 y02 = null;
        if (zzd == null) {
            return null;
        }
        zzxw zza = zzd.zza();
        if (zza != null) {
            y02 = new Y0(zza.zzb(), zza.zzf(), zza.zze(), zza.zza(), zza.zzd(), zza.zzc(), zza.zzg());
        }
        Y0 y03 = y02;
        String zzb = zzd.zzb();
        String zzc = zzd.zzc();
        zzxx[] zzf = zzd.zzf();
        ArrayList arrayList2 = new ArrayList();
        if (zzf != null) {
            for (zzxx zzxxVar : zzf) {
                if (zzxxVar != null) {
                    arrayList2.add(new i5.e(zzxxVar.zzb(), zzxxVar.zza()));
                }
            }
        }
        zzxu[] zze = zzd.zze();
        ArrayList arrayList3 = new ArrayList();
        if (zze != null) {
            for (zzxu zzxuVar : zze) {
                if (zzxuVar != null) {
                    arrayList3.add(new i5.c(zzxuVar.zza(), zzxuVar.zzb(), zzxuVar.zzd(), zzxuVar.zzc()));
                }
            }
        }
        if (zzd.zzg() != null) {
            String[] zzg = zzd.zzg();
            I.i(zzg);
            arrayList = Arrays.asList(zzg);
        } else {
            arrayList = new ArrayList();
        }
        Object obj = arrayList;
        zzxp[] zzd2 = zzd.zzd();
        ArrayList arrayList4 = new ArrayList();
        if (zzd2 != null) {
            for (zzxp zzxpVar : zzd2) {
                if (zzxpVar != null) {
                    arrayList4.add(new C1112a(zzxpVar.zza(), zzxpVar.zzb()));
                }
            }
        }
        return new Y0(y03, zzb, zzc, arrayList2, arrayList3, obj, arrayList4);
    }

    public p1 C(Object obj, C0054d c0054d) {
        return M(u4.j.b(obj, u4.i.f15999d), c0054d);
    }

    public n E(C1794d c1794d) {
        int i7 = AbstractC1679i.f15256a[c1794d.A().ordinal()];
        C1608t c1608t = (C1608t) this.f8171b;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    s4.n D4 = c1794d.D();
                    q4.h y2 = c1608t.y(D4.y());
                    q4.q D7 = C1608t.D(D4.z());
                    n nVar = new n(y2);
                    nVar.f15364c = D7;
                    nVar.f15363b = m.UNKNOWN_DOCUMENT;
                    nVar.f15366e = new o();
                    nVar.f = l.HAS_COMMITTED_MUTATIONS;
                    return nVar;
                }
                m5.d.g("Unknown MaybeDocument %s", c1794d);
                throw null;
            }
            s4.g C7 = c1794d.C();
            boolean B7 = c1794d.B();
            n h8 = n.h(c1608t.y(C7.y()), C1608t.D(C7.z()));
            if (B7) {
                h8.f = l.HAS_COMMITTED_MUTATIONS;
            }
            return h8;
        }
        D z7 = c1794d.z();
        boolean B8 = c1794d.B();
        q4.h y3 = c1608t.y(z7.A());
        q4.q D8 = C1608t.D(z7.B());
        o e7 = o.e(z7.z());
        n nVar2 = new n(y3);
        nVar2.a(D8, e7);
        if (B8) {
            nVar2.f = l.HAS_COMMITTED_MUTATIONS;
        }
        return nVar2;
    }

    public r4.i F(s4.q qVar) {
        int B7 = qVar.B();
        N0 C7 = qVar.C();
        C1608t c1608t = (C1608t) this.f8171b;
        p pVar = new p(C7.y(), C7.z());
        int A7 = qVar.A();
        ArrayList arrayList = new ArrayList(A7);
        for (int i7 = 0; i7 < A7; i7++) {
            arrayList.add(c1608t.A(qVar.z(i7)));
        }
        ArrayList arrayList2 = new ArrayList(qVar.E());
        int i8 = 0;
        while (i8 < qVar.E()) {
            t1 D4 = qVar.D(i8);
            int i9 = i8 + 1;
            if (i9 < qVar.E() && qVar.D(i9).K()) {
                m5.d.i("TransformMutation should be preceded by a patch or set mutation", qVar.D(i8).L(), new Object[0]);
                r1 O7 = t1.O(D4);
                for (S s7 : qVar.D(i9).E().w()) {
                    O7.d();
                    t1.w((t1) O7.f10006b, s7);
                }
                arrayList2.add(c1608t.A((t1) O7.b()));
                i8 = i9;
            } else {
                arrayList2.add(c1608t.A(D4));
            }
            i8++;
        }
        return new r4.i(B7, pVar, arrayList, arrayList2);
    }

    public Y G(s4.k kVar) {
        boolean z7;
        q4.p a02;
        L i7;
        int J5 = kVar.J();
        q4.q D4 = C1608t.D(kVar.I());
        q4.q D7 = C1608t.D(kVar.E());
        AbstractC0852m H7 = kVar.H();
        long F7 = kVar.F();
        int i8 = AbstractC1679i.f15257b[kVar.K().ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                d1 G2 = kVar.G();
                i7 = C1608t.C(G2.y(), G2.z());
            } else {
                m5.d.g("Unknown targetType %d", kVar.K());
                throw null;
            }
        } else {
            C0151b1 D8 = kVar.D();
            int y2 = D8.y();
            if (y2 == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            m5.d.i("DocumentsTarget contained other than 1 document %d", z7, Integer.valueOf(y2));
            q4.p l8 = q4.p.l(D8.x());
            m5.d.i("Tried to deserialize invalid key %s", C1608t.i0(l8), l8);
            if (l8.f15351a.size() == 4) {
                a02 = q4.p.f15369b;
            } else {
                a02 = C1608t.a0(l8);
            }
            i7 = new n4.D(a02, null).i();
        }
        return new Y(i7, J5, F7, EnumC1670A.LISTEN, D4, D7, H7, null);
    }

    public e4.e H(int i7) {
        J e7 = ((y) this.f8171b).e();
        n4.I i8 = (n4.I) e7.f14296g.get(Integer.valueOf(i7));
        if (i8 != null && i8.f14290b) {
            return q4.h.f15356c.e(i8.f14289a);
        }
        e4.e eVar = q4.h.f15356c;
        HashMap hashMap = e7.f14294d;
        if (hashMap.containsKey(Integer.valueOf(i7))) {
            for (n4.D d7 : (List) hashMap.get(Integer.valueOf(i7))) {
                HashMap hashMap2 = e7.f14293c;
                if (hashMap2.containsKey(d7)) {
                    e4.e eVar2 = (e4.e) ((F) hashMap2.get(d7)).f14287c.f581e;
                    if (eVar.f10876a.size() >= eVar2.f10876a.size()) {
                        eVar2 = eVar;
                        eVar = eVar2;
                    }
                    Iterator it = eVar.iterator();
                    while (true) {
                        e4.d dVar = (e4.d) it;
                        if (!((Iterator) dVar.f10875b).hasNext()) {
                            break;
                        }
                        eVar2 = eVar2.e(dVar.next());
                    }
                    eVar = eVar2;
                }
            }
        }
        return eVar;
    }

    public void J(MenuC1545i menuC1545i) {
        C1581f c1581f;
        switch (this.f8170a) {
            case 13:
                C0585f c0585f = ((ActionMenuView) this.f8171b).f7340r0;
                if (c0585f != null) {
                    c0585f.J(menuC1545i);
                    return;
                }
                return;
            default:
                Toolbar toolbar = (Toolbar) this.f8171b;
                C1587i c1587i = toolbar.f7456a.q0;
                if (c1587i == null || (c1581f = c1587i.f14833m0) == null || !c1581f.b()) {
                    Iterator it = ((CopyOnWriteArrayList) toolbar.f7446E0.f4683c).iterator();
                    while (it.hasNext()) {
                        ((E) it.next()).f16634a.t();
                    }
                    return;
                }
                return;
        }
    }

    public void K(String str) {
        r rVar = (r) this.f8171b;
        if (str == null) {
            rVar.a(Boolean.TRUE);
        } else if (str.equals("MOBILE_SCANNER_CAMERA_PERMISSION_DENIED")) {
            rVar.a(Boolean.FALSE);
        } else if (str.equals("MOBILE_SCANNER_CAMERA_PERMISSION_REQUEST_PENDING")) {
            rVar.b(null, "MOBILE_SCANNER_CAMERA_PERMISSION_REQUEST_PENDING", "Another request is ongoing and multiple requests cannot be handled at once.");
        } else {
            rVar.b(null, "MOBILE_SCANNER_GENERIC_ERROR", "An unknown error occurred.");
        }
    }

    public ArrayList L(List list) {
        R1.j jVar = new R1.j(P.Argument);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i7 = 0; i7 < list.size(); i7++) {
            arrayList.add(C(list.get(i7), new C0054d((R1.j) jVar.Q0().f689b, null, true)));
        }
        return arrayList;
    }

    public p1 M(Object obj, C0054d c0054d) {
        q4.f fVar;
        String name;
        k kVar;
        boolean z7 = true;
        boolean z8 = obj instanceof Map;
        R1.j jVar = (R1.j) c0054d.f689b;
        k kVar2 = (k) c0054d.f690c;
        if (z8) {
            Map map = (Map) obj;
            if (map.isEmpty()) {
                if (kVar2 != null && !kVar2.h()) {
                    c0054d.a(kVar2);
                }
                n1 T7 = p1.T();
                T7.j(C0163h0.w());
                return (p1) T7.b();
            }
            C0159f0 B7 = C0163h0.B();
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() instanceof String) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (kVar2 == null) {
                        kVar = null;
                    } else {
                        kVar = (k) kVar2.a(str);
                    }
                    C0054d c0054d2 = new C0054d(jVar, kVar, false);
                    c0054d2.v(str);
                    p1 M7 = M(value, c0054d2);
                    if (M7 != null) {
                        B7.f(M7, str);
                    }
                } else {
                    throw c0054d.h(String.format("Non-String Map key (%s) is not allowed", entry.getValue()));
                }
            }
            n1 T8 = p1.T();
            T8.i(B7);
            return (p1) T8.b();
        } else if (obj instanceof A) {
            A a7 = (A) obj;
            if (c0054d.k()) {
                if (kVar2 != null) {
                    if (a7 instanceof C0821x) {
                        P p7 = (P) jVar.f4682b;
                        if (p7 == P.MergeSet) {
                            c0054d.a(kVar2);
                        } else if (p7 == P.Update) {
                            if (kVar2.f15351a.size() <= 0) {
                                z7 = false;
                            }
                            m5.d.i("FieldValue.delete() at the top level should have already been handled.", z7, new Object[0]);
                            throw c0054d.h("FieldValue.delete() can only appear at the top level of your update data");
                        } else {
                            throw c0054d.h("FieldValue.delete() can only be used with update() and set() with SetOptions.merge()");
                        }
                    } else if (a7 instanceof C0823z) {
                        c0054d.b(kVar2, r4.n.f15511a);
                    } else if (a7 instanceof C0820w) {
                        c0054d.b(kVar2, new AbstractC1746c(L(((C0820w) a7).f9853c)));
                    } else if (a7 instanceof C0819v) {
                        c0054d.b(kVar2, new AbstractC1746c(L(((C0819v) a7).f9852c)));
                    } else if (a7 instanceof C0822y) {
                        c0054d.b(kVar2, new r4.k(O(((C0822y) a7).f9854c, false)));
                    } else {
                        C1418b c1418b = u.f16019a;
                        if (a7 == null) {
                            name = "null";
                        } else {
                            name = a7.getClass().getName();
                        }
                        m5.d.g("Unknown FieldValue type: %s", name);
                        throw null;
                    }
                    return null;
                }
                throw c0054d.h(a7.a().concat("() is not currently supported inside arrays"));
            }
            throw c0054d.h(a7.a().concat("() can only be used with set() and update()"));
        } else {
            if (kVar2 != null) {
                c0054d.a(kVar2);
            }
            if (obj instanceof List) {
                if (c0054d.f688a && ((P) jVar.f4682b) != P.ArrayArgument) {
                    throw c0054d.h("Nested arrays are not supported");
                }
                C0158f B8 = C0160g.B();
                for (Object obj2 : (List) obj) {
                    p1 M8 = M(obj2, new C0054d(jVar, null, true));
                    if (M8 == null) {
                        n1 T9 = p1.T();
                        EnumC0870v0 enumC0870v0 = EnumC0870v0.NULL_VALUE;
                        T9.d();
                        p1.C((p1) T9.f10006b, enumC0870v0);
                        M8 = (p1) T9.b();
                    }
                    B8.d();
                    C0160g.v((C0160g) B8.f10006b, M8);
                }
                n1 T10 = p1.T();
                T10.f(B8);
                return (p1) T10.b();
            } else if (obj == null) {
                n1 T11 = p1.T();
                EnumC0870v0 enumC0870v02 = EnumC0870v0.NULL_VALUE;
                T11.d();
                p1.C((p1) T11.f10006b, enumC0870v02);
                return (p1) T11.b();
            } else if (obj instanceof Integer) {
                n1 T12 = p1.T();
                T12.h(((Integer) obj).intValue());
                return (p1) T12.b();
            } else if (obj instanceof Long) {
                n1 T13 = p1.T();
                T13.h(((Long) obj).longValue());
                return (p1) T13.b();
            } else if (obj instanceof Float) {
                n1 T14 = p1.T();
                T14.g(((Float) obj).doubleValue());
                return (p1) T14.b();
            } else if (obj instanceof Double) {
                n1 T15 = p1.T();
                T15.g(((Double) obj).doubleValue());
                return (p1) T15.b();
            } else if (obj instanceof Boolean) {
                n1 T16 = p1.T();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                T16.d();
                p1.D((p1) T16.f10006b, booleanValue);
                return (p1) T16.b();
            } else if (obj instanceof String) {
                n1 T17 = p1.T();
                T17.k((String) obj);
                return (p1) T17.b();
            } else if (obj instanceof Date) {
                return Q(new p((Date) obj));
            } else {
                if (obj instanceof p) {
                    return Q((p) obj);
                }
                if (obj instanceof N) {
                    N n7 = (N) obj;
                    n1 T18 = p1.T();
                    C1696b A7 = C1697c.A();
                    A7.d();
                    C1697c.v((C1697c) A7.f10006b, n7.f9779a);
                    A7.d();
                    C1697c.w((C1697c) A7.f10006b, n7.f9780b);
                    T18.d();
                    p1.z((p1) T18.f10006b, (C1697c) A7.b());
                    return (p1) T18.b();
                } else if (obj instanceof C0806h) {
                    n1 T19 = p1.T();
                    AbstractC0852m abstractC0852m = ((C0806h) obj).f9810a;
                    T19.d();
                    p1.x((p1) T19.f10006b, abstractC0852m);
                    return (p1) T19.b();
                } else if (obj instanceof C0814p) {
                    C0814p c0814p = (C0814p) obj;
                    q4.f fVar2 = (q4.f) this.f8171b;
                    String str2 = fVar2.f15353b;
                    String str3 = fVar2.f15352a;
                    FirebaseFirestore firebaseFirestore = c0814p.f9839b;
                    if (firebaseFirestore != null) {
                        if (!firebaseFirestore.f9748c.equals(fVar2)) {
                            throw c0054d.h("Document reference is for database " + fVar.f15352a + "/" + fVar.f15353b + " but should be for database " + str3 + "/" + str2);
                        }
                    }
                    n1 T20 = p1.T();
                    String d7 = c0814p.d();
                    StringBuilder l8 = io.flutter.plugins.pathprovider.b.l("projects/", str3, "/databases/", str2, "/documents/");
                    l8.append(d7);
                    String sb = l8.toString();
                    T20.d();
                    p1.y((p1) T20.f10006b, sb);
                    return (p1) T20.b();
                } else if (obj instanceof s0) {
                    C0159f0 B9 = C0163h0.B();
                    B9.f(s.f, "__type__");
                    double[] dArr = ((s0) obj).f9848a;
                    ArrayList arrayList = new ArrayList(dArr.length);
                    for (int i7 = 0; i7 < dArr.length; i7++) {
                        arrayList.add(i7, Double.valueOf(dArr[i7]));
                    }
                    B9.f(M(arrayList, c0054d), MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
                    n1 T21 = p1.T();
                    T21.i(B9);
                    return (p1) T21.b();
                } else if (!obj.getClass().isArray()) {
                    C1418b c1418b2 = u.f16019a;
                    throw c0054d.h("Unsupported type: ".concat(obj.getClass().getName()));
                } else {
                    throw c0054d.h("Arrays are not supported; use a List instead");
                }
            }
        }
    }

    public O N(Object obj, r4.f fVar) {
        R1.j jVar = new R1.j(P.MergeSet);
        o z7 = z(obj, jVar.Q0());
        HashSet hashSet = (HashSet) jVar.f4683c;
        ArrayList arrayList = (ArrayList) jVar.f4684d;
        if (fVar != null) {
            HashSet hashSet2 = fVar.f15493a;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                k kVar = (k) it.next();
                Iterator it2 = hashSet.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (kVar.i((k) it2.next())) {
                            break;
                        }
                    } else {
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            if (kVar.i(((r4.g) it3.next()).f15494a)) {
                                break;
                            }
                        }
                        throw new IllegalArgumentException("Field '" + kVar.c() + "' is specified in your field mask but not in your input data.");
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                r4.g gVar = (r4.g) it4.next();
                k kVar2 = gVar.f15494a;
                Iterator it5 = hashSet2.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    } else if (((k) it5.next()).i(kVar2)) {
                        arrayList2.add(gVar);
                        break;
                    }
                }
            }
            return new O(z7, fVar, DesugarCollections.unmodifiableList(arrayList2));
        }
        return new O(z7, new r4.f(hashSet), DesugarCollections.unmodifiableList(arrayList));
    }

    public p1 O(Object obj, boolean z7) {
        P p7;
        boolean z8;
        if (z7) {
            p7 = P.ArrayArgument;
        } else {
            p7 = P.Argument;
        }
        R1.j jVar = new R1.j(p7);
        p1 C7 = C(obj, jVar.Q0());
        if (C7 != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        m5.d.i("Parsed data should not be null.", z8, new Object[0]);
        m5.d.i("Field transforms should have been disallowed.", ((ArrayList) jVar.f4684d).isEmpty(), new Object[0]);
        return C7;
    }

    public O P(Object obj) {
        R1.j jVar = new R1.j(P.Set);
        return new O(z(obj, jVar.Q0()), null, DesugarCollections.unmodifiableList((ArrayList) jVar.f4684d));
    }

    public O R(Map map) {
        AbstractC0055e.b(map, "Provided update data must not be null.");
        R1.j jVar = new R1.j(P.Update);
        C0054d Q02 = jVar.Q0();
        o oVar = new o();
        for (Map.Entry entry : map.entrySet()) {
            C0818u a7 = C0818u.a((String) entry.getKey());
            Object value = entry.getValue();
            boolean z7 = value instanceof C0821x;
            k kVar = a7.f9851a;
            if (z7) {
                Q02.a(kVar);
            } else {
                p1 C7 = C(value, Q02.f(kVar));
                if (C7 != null) {
                    Q02.a(kVar);
                    oVar.g(C7, kVar);
                }
            }
        }
        return new O(oVar, new r4.f((HashSet) jVar.f4683c), DesugarCollections.unmodifiableList((ArrayList) jVar.f4684d));
    }

    public H S(m1.l lVar, A.i iVar) {
        K0.q qVar = (K0.q) this.f8171b;
        H h8 = null;
        int i7 = 0;
        while (true) {
            try {
                lVar.q(qVar.f2513a, 0, 10, false);
                qVar.G(0);
                if (qVar.x() != 4801587) {
                    break;
                }
                qVar.H(3);
                int t7 = qVar.t();
                int i8 = t7 + 10;
                if (h8 == null) {
                    byte[] bArr = new byte[i8];
                    System.arraycopy(qVar.f2513a, 0, bArr, 0, 10);
                    lVar.q(bArr, 10, t7, false);
                    h8 = new A1.h(iVar).j0(bArr, i8);
                } else {
                    lVar.b(t7, false);
                }
                i7 += i8;
            } catch (EOFException unused) {
            }
        }
        lVar.f = 0;
        lVar.b(i7, false);
        return h8;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1183p
    public void a(float f) {
        ((C1783k) this.f8171b).f15609X = f;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
    public void accept(Object obj, Object obj2) {
        BinderC0586g binderC0586g = new BinderC0586g(1, (TaskCompletionSource) obj2);
        C0584e c0584e = (C0584e) ((i) obj).getService();
        Parcel zaa = c0584e.zaa();
        zac.zad(zaa, binderC0586g);
        zac.zac(zaa, (C0580a) this.f8171b);
        zac.zad(zaa, null);
        c0584e.zac(2, zaa);
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1183p
    public void b(float f) {
        C1783k c1783k = (C1783k) this.f8171b;
        boolean z7 = false;
        if (f >= 0.0f && f <= 1.0f) {
            z7 = true;
        }
        I.a("Transparency must be in the range [0..1]", z7);
        c1783k.f15611Z = f;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1183p
    public void c(float f, float f4) {
        C1783k c1783k = (C1783k) this.f8171b;
        c1783k.f15617e0 = f;
        c1783k.f15618f0 = f4;
    }

    @Override // j5.a
    public i5.c d() {
        zzxu zzf = ((zzyb) this.f8171b).zzf();
        if (zzf == null) {
            return null;
        }
        return new i5.c(zzf.zza(), zzf.zzb(), zzf.zzd(), zzf.zzc());
    }

    @Override // j5.a
    public int e() {
        return ((zzyb) this.f8171b).zza();
    }

    @Override // j5.a
    public i5.e f() {
        zzxx zzh = ((zzyb) this.f8171b).zzh();
        if (zzh != null) {
            return new i5.e(zzh.zzb(), zzh.zza());
        }
        return null;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1183p
    public void g(boolean z7) {
        ((C1783k) this.f8171b).f15619g0 = z7;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1183p
    public void h(C1774b c1774b) {
        ((C1783k) this.f8171b).f15612a = c1774b;
    }

    @Override // g.InterfaceC0997b
    public void i(Object obj) {
        C0996a c0996a = (C0996a) obj;
        z0.L l8 = (z0.L) this.f8171b;
        z0.H h8 = (z0.H) l8.f16647E.pollLast();
        if (h8 == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = h8.f16638a;
        AbstractComponentCallbacksC2061v E4 = l8.f16660c.E(str);
        if (E4 == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            return;
        }
        E4.u(h8.f16639b, c0996a.f11075a, c0996a.f11076b);
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1183p
    public void j(LatLng latLng, Float f, Float f4) {
        boolean z7;
        boolean z8;
        boolean z9;
        C1783k c1783k = (C1783k) this.f8171b;
        boolean z10 = true;
        if (f4 != null) {
            float floatValue = f.floatValue();
            float floatValue2 = f4.floatValue();
            if (c1783k.f15616e == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            I.k("Position has already been set using positionFromBounds", z8);
            if (floatValue >= 0.0f) {
                z9 = true;
            } else {
                z9 = false;
            }
            I.a("Width must be non-negative", z9);
            if (floatValue2 < 0.0f) {
                z10 = false;
            }
            I.a("Height must be non-negative", z10);
            c1783k.f15613b = latLng;
            c1783k.f15614c = floatValue;
            c1783k.f15615d = floatValue2;
            return;
        }
        float floatValue3 = f.floatValue();
        if (c1783k.f15616e == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        I.k("Position has already been set using positionFromBounds", z7);
        if (floatValue3 < 0.0f) {
            z10 = false;
        }
        I.a("Width must be non-negative", z10);
        c1783k.f15613b = latLng;
        c1783k.f15614c = floatValue3;
        c1783k.f15615d = -1.0f;
    }

    @Override // j5.a
    public C1113b k() {
        zzxt zze = ((zzyb) this.f8171b).zze();
        if (zze != null) {
            return new C1113b(zze.zzf(), zze.zzh(), zze.zzn(), zze.zzl(), zze.zzi(), zze.zzc(), zze.zza(), zze.zzb(), zze.zzd(), zze.zzm(), zze.zzj(), zze.zzg(), zze.zze(), zze.zzk());
        }
        return null;
    }

    @Override // j5.a
    public String l() {
        return ((zzyb) this.f8171b).zzl();
    }

    @Override // j5.a
    public Rect m() {
        Point[] zzo = ((zzyb) this.f8171b).zzo();
        if (zzo != null) {
            int i7 = Integer.MIN_VALUE;
            int i8 = Integer.MAX_VALUE;
            int i9 = Integer.MAX_VALUE;
            int i10 = Integer.MIN_VALUE;
            for (Point point : zzo) {
                i8 = Math.min(i8, point.x);
                i7 = Math.max(i7, point.x);
                i9 = Math.min(i9, point.y);
                i10 = Math.max(i10, point.y);
            }
            return new Rect(i8, i9, i7, i10);
        }
        return null;
    }

    @Override // j5.a
    public byte[] n() {
        return ((zzyb) this.f8171b).zzn();
    }

    @Override // j5.a
    public String o() {
        return ((zzyb) this.f8171b).zzm();
    }

    @Override // j5.a
    public Y0 p() {
        zzxr zzc = ((zzyb) this.f8171b).zzc();
        if (zzc != null) {
            return new Y0(zzc.zzg(), zzc.zzc(), zzc.zzd(), zzc.zze(), zzc.zzf(), T(zzc.zzb()), T(zzc.zza()));
        }
        return null;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1183p
    public void q(LatLngBounds latLngBounds) {
        boolean z7;
        C1783k c1783k = (C1783k) this.f8171b;
        LatLng latLng = c1783k.f15613b;
        String valueOf = String.valueOf(latLng);
        if (latLng == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        I.k("Position has already been set using position: ".concat(valueOf), z7);
        c1783k.f15616e = latLngBounds;
    }

    @Override // j5.a
    public int r() {
        return ((zzyb) this.f8171b).zzb();
    }

    @Override // j5.a
    public Point[] s() {
        return ((zzyb) this.f8171b).zzo();
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1183p
    public void setVisible(boolean z7) {
        ((C1783k) this.f8171b).f15610Y = z7;
    }

    @Override // j5.a
    public i5.d t() {
        zzxv zzg = ((zzyb) this.f8171b).zzg();
        if (zzg != null) {
            return new i5.d(zzg.zza(), zzg.zzb());
        }
        return null;
    }

    @Override // j5.a
    public t u() {
        zzxz zzj = ((zzyb) this.f8171b).zzj();
        if (zzj != null) {
            return new t(zzj.zza(), zzj.zzb(), 3);
        }
        return null;
    }

    @Override // com.dexterous.flutterlocalnotifications.i
    public void v(boolean z7) {
        ((q) this.f8171b).a(Boolean.valueOf(z7));
    }

    @Override // j5.a
    public t w() {
        zzxy zzi = ((zzyb) this.f8171b).zzi();
        if (zzi != null) {
            return new t(zzi.zza(), zzi.zzb(), 2);
        }
        return null;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1183p
    public void x(float f) {
        ((C1783k) this.f8171b).f = ((f % 360.0f) + 360.0f) % 360.0f;
    }

    @Override // j5.a
    public C0994a y() {
        zzya zzk = ((zzyb) this.f8171b).zzk();
        if (zzk != null) {
            return new C0994a(zzk.zzc(), zzk.zzb(), zzk.zza());
        }
        return null;
    }

    public o z(Object obj, C0054d c0054d) {
        if (!obj.getClass().isArray()) {
            p1 M7 = M(u4.j.b(obj, u4.i.f15999d), c0054d);
            if (M7.R() == o1.MAP_VALUE) {
                return new o(M7);
            }
            C1418b c1418b = u.f16019a;
            throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was of type: ".concat(obj.getClass().getName()));
        }
        throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was an array");
    }

    public /* synthetic */ C0585f(Object obj, int i7) {
        this.f8170a = i7;
        this.f8171b = obj;
    }

    public C0585f(InterfaceC1109a interfaceC1109a) {
        this.f8170a = 16;
        I.i(interfaceC1109a);
        this.f8171b = interfaceC1109a;
    }

    public C0585f(G.k kVar) {
        this.f8170a = 19;
        this.f8171b = new AtomicInteger(0);
    }

    public C0585f(boolean z7) {
        this.f8170a = 17;
        this.f8171b = new AtomicBoolean(z7);
    }

    public C0585f(CameraDevice cameraDevice, Handler handler) {
        this.f8170a = 20;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            cameraDevice.getClass();
            this.f8171b = new C1608t(cameraDevice, (C1006c) null);
        } else if (i7 >= 24) {
            this.f8171b = new C1608t(cameraDevice, new C1006c(handler));
        } else {
            this.f8171b = new C1608t(cameraDevice, new C1006c(handler));
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [s3.k, java.lang.Object] */
    public C0585f(int i7) {
        this.f8170a = i7;
        switch (i7) {
            case 5:
                this.f8171b = new CopyOnWriteArrayList();
                return;
            case 7:
                ?? obj = new Object();
                obj.f15610Y = true;
                obj.f15611Z = 0.0f;
                obj.f15617e0 = 0.5f;
                obj.f15618f0 = 0.5f;
                obj.f15619g0 = false;
                this.f8171b = obj;
                return;
            case 11:
                this.f8171b = new K0.q(10);
                return;
            default:
                this.f8171b = new AtomicLong();
                return;
        }
    }
}
