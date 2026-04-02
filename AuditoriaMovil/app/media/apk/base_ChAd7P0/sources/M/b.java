package M;

import D.D;
import F3.o;
import H4.W;
import android.util.SparseArray;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.H;
import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.C0850l;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import n4.M;
import p.C1608t;
import p4.C1683m;
import p4.X;
import p4.Y;
import q4.q;
import t4.w;
import u4.r;
/* loaded from: classes.dex */
public final /* synthetic */ class b implements U.j, u4.m, r, H.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3051a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3052b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3053c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f3054d;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i7) {
        this.f3051a = i7;
        this.f3054d = obj;
        this.f3052b = obj2;
        this.f3053c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0148 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, CameraAccessException -> 0x0214, blocks: (B:4:0x001c, B:10:0x002b, B:11:0x0043, B:15:0x0049, B:16:0x004f, B:18:0x0055, B:19:0x006a, B:20:0x00cb, B:22:0x00d1, B:23:0x00e6, B:25:0x00f6, B:27:0x00fa, B:28:0x0106, B:29:0x011e, B:31:0x0124, B:33:0x0132, B:35:0x013a, B:39:0x0148, B:41:0x015a, B:44:0x0176, B:45:0x0184, B:47:0x01a4, B:49:0x01a8, B:50:0x01b1, B:51:0x01d2, B:53:0x01d8, B:54:0x01e8, B:56:0x0205, B:57:0x020a, B:58:0x0212, B:61:0x0215, B:62:0x021b, B:64:0x021d, B:65:0x0236), top: B:69:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0171  */
    @Override // u4.m, H.a, J2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public E3.b apply(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M.b.apply(java.lang.Object):E3.b");
    }

    @Override // u4.r
    public Object get() {
        boolean z7;
        C1683m c1683m;
        W w2;
        long j;
        Iterator it;
        Object obj = this.f3053c;
        Object obj2 = this.f3052b;
        C1683m c1683m2 = (C1683m) this.f3054d;
        switch (this.f3051a) {
            case 4:
                o oVar = (o) obj2;
                W w7 = c1683m2.f15266a;
                long S7 = w7.t().S();
                Iterator it2 = ((Map) oVar.f1179c).entrySet().iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    X x7 = c1683m2.f15273i;
                    if (hasNext) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        Integer num = (Integer) entry.getKey();
                        int intValue = num.intValue();
                        w wVar = (w) entry.getValue();
                        SparseArray sparseArray = c1683m2.f15274k;
                        Y y2 = (Y) sparseArray.get(intValue);
                        if (y2 != null) {
                            x7.g(wVar.f15853e, intValue);
                            x7.a(wVar.f15851c, intValue);
                            Y b5 = y2.b(S7);
                            if (((Map) oVar.f1180d).containsKey(num)) {
                                C0850l c0850l = AbstractC0852m.f10085b;
                                q qVar = q.f15370b;
                                Y a7 = b5.a(c0850l, qVar);
                                j = S7;
                                it = it2;
                                c1683m = c1683m2;
                                w2 = w7;
                                b5 = new Y(a7.f15235a, a7.f15236b, a7.f15237c, a7.f15238d, a7.f15239e, qVar, a7.f15240g, null);
                            } else {
                                c1683m = c1683m2;
                                w2 = w7;
                                j = S7;
                                it = it2;
                                AbstractC0852m abstractC0852m = wVar.f15849a;
                                if (!abstractC0852m.isEmpty()) {
                                    b5 = b5.a(abstractC0852m, (q) oVar.f1178b);
                                }
                            }
                            sparseArray.put(intValue, b5);
                            if (C1683m.e(y2, b5, wVar)) {
                                x7.j(b5);
                            }
                            S7 = j;
                            it2 = it;
                            c1683m2 = c1683m;
                            w7 = w2;
                        }
                    } else {
                        C1683m c1683m3 = c1683m2;
                        W w8 = w7;
                        Map map = (Map) oVar.f1181e;
                        for (q4.h hVar : map.keySet()) {
                            if (((Set) oVar.f).contains(hVar)) {
                                w8.t().j(hVar);
                            }
                        }
                        C1608t d7 = c1683m3.d(map);
                        q d8 = x7.d();
                        q qVar2 = (q) obj;
                        if (!qVar2.equals(q.f15370b)) {
                            if (qVar2.compareTo(d8) >= 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            m5.d.i("Watch stream reverted to previous snapshot?? (%s < %s)", z7, qVar2, d8);
                            x7.f(qVar2);
                        }
                        return c1683m3.f.L((HashMap) d7.f14880b, (HashSet) d7.f14881c);
                    }
                }
            default:
                e4.e eVar = q4.h.f15356c;
                HashMap hashMap = new HashMap();
                for (Map.Entry entry2 : (e4.c) obj2) {
                    q4.h hVar2 = (q4.h) entry2.getKey();
                    q4.n nVar = (q4.n) entry2.getValue();
                    if (nVar.d()) {
                        eVar = eVar.e(hVar2);
                    }
                    hashMap.put(hVar2, nVar);
                }
                Y y3 = (Y) obj;
                int i7 = y3.f15236b;
                X x8 = c1683m2.f15273i;
                x8.e(i7);
                x8.a(eVar, y3.f15236b);
                C1608t d9 = c1683m2.d(hashMap);
                return c1683m2.f.L((HashMap) d9.f14880b, (HashSet) d9.f14881c);
        }
    }

    @Override // U.j
    public Object i(U.i iVar) {
        switch (this.f3051a) {
            case 0:
                e eVar = (e) this.f3054d;
                eVar.getClass();
                eVar.b(new d(eVar, (D) this.f3052b, (Map) this.f3053c, iVar, 0), new org.apache.tika.parser.a(2));
                return "Init GlRenderer";
            case 1:
                N.e eVar2 = (N.e) this.f3054d;
                eVar2.getClass();
                eVar2.b(new d(eVar2, (D) this.f3052b, (Map) this.f3053c, iVar, 1), new org.apache.tika.parser.a(2));
                return "Init GlRenderer";
            default:
                U.l lVar = (U.l) this.f3054d;
                C.b bVar = new C.b(lVar, 28);
                G.k kVar = (G.k) this.f3052b;
                U.m mVar = iVar.f5531c;
                if (mVar != null) {
                    mVar.a(bVar, kVar);
                }
                lVar.a(new H.h(0, lVar, new A.m(iVar, 23)), kVar);
                return "surfaceList[" + ((List) this.f3053c) + "]";
        }
    }

    @Override // u4.m, H.a, J2.g
    public Object apply(Object obj) {
        FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f3054d;
        firebaseFirestore.getClass();
        return Tasks.call((ThreadPoolExecutor) this.f3052b, new H(firebaseFirestore, (A4.d) this.f3053c, (M) obj, 0));
    }
}
