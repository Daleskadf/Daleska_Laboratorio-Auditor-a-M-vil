package com.it_nomads.fluttersecurestorage.ciphers;

import A3.AbstractC0021t;
import A3.K;
import H0.W;
import H4.p1;
import M3.q;
import R1.j;
import a.AbstractC0412a;
import a6.t0;
import android.content.Context;
import c4.InterfaceC0635d;
import c4.n;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.firestore.AbstractC0802d;
import com.google.firebase.firestore.C0803e;
import com.google.firebase.firestore.C0818u;
import com.google.firebase.firestore.S;
import com.google.firebase.firestore.g0;
import d4.k;
import e1.InterfaceC0958x;
import e1.Q;
import e1.b0;
import io.flutter.plugins.firebase.auth.C1154q;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.firestore.AbstractC1161f;
import io.flutter.plugins.firebase.firestore.C1162g;
import io.flutter.plugins.firebase.firestore.t;
import io.flutter.plugins.firebase.firestore.y;
import io.flutter.plugins.firebase.firestore.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import m1.o;
import org.apache.tika.utils.XMLReaderUtils;
import z3.i;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements g, InterfaceC0635d, i, K0.c, L5.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10151a;

    public /* synthetic */ d(int i7) {
        this.f10151a = i7;
    }

    @Override // K0.c
    public void accept(Object obj) {
        ((Q) obj).f10722b.getClass();
    }

    @Override // z3.i
    public Object apply(Object obj) {
        switch (this.f10151a) {
            case 5:
                return ((o) obj).c().getClass().getSimpleName();
            case 6:
                b0 m7 = ((InterfaceC0958x) obj).m();
                return K.p(AbstractC0021t.w(m7.f10781b, new d(8)));
            case 7:
            default:
                return Long.valueOf(((J1.a) obj).f2356c);
            case 8:
                return Integer.valueOf(((W) obj).f1741c);
            case 9:
                return Long.valueOf(((J1.a) obj).f2355b);
        }
    }

    @Override // c4.InterfaceC0635d
    public Object d(q qVar) {
        switch (this.f10151a) {
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.f9733a.get();
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.f9735c.get();
            case 3:
                return (ScheduledExecutorService) ExecutorsRegistrar.f9734b.get();
            default:
                n nVar = ExecutorsRegistrar.f9733a;
                return k.INSTANCE;
        }
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.g
    public j i(t0 t0Var, Context context) {
        return new j(t0Var, context);
    }

    /* JADX WARN: Type inference failed for: r4v49, types: [com.google.firebase.firestore.d0, java.util.AbstractCollection, java.util.ArrayList] */
    @Override // L5.b
    public void j(Object obj, A.f fVar) {
        switch (this.f10151a) {
            case 14:
                ArrayList arrayList = (ArrayList) obj;
                FlutterFirebasePlugin.cachedThreadPool.execute(new A.h((io.flutter.plugins.firebase.firestore.q) arrayList.get(0), (List) arrayList.get(1), new C1154q(new ArrayList(), fVar, 18), 18));
                return;
            case 15:
                ArrayList arrayList2 = (ArrayList) obj;
                FlutterFirebasePlugin.cachedThreadPool.execute(new M.d((io.flutter.plugins.firebase.firestore.q) arrayList2.get(0), (String) arrayList2.get(1), new C1154q(new ArrayList(), fVar, 20), (y) arrayList2.get(2), 13));
                return;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = (ArrayList) obj;
                FlutterFirebasePlugin.cachedThreadPool.execute(new A.h((io.flutter.plugins.firebase.firestore.q) arrayList4.get(0), t.values()[((Integer) arrayList4.get(1)).intValue()], new C1154q(arrayList3, fVar, 19), 19));
                return;
            case 17:
                FlutterFirebasePlugin.cachedThreadPool.execute(new S(8, (io.flutter.plugins.firebase.firestore.q) ((ArrayList) obj).get(0), new C1154q(new ArrayList(), fVar, 21)));
                return;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                FlutterFirebasePlugin.cachedThreadPool.execute(new S(9, (io.flutter.plugins.firebase.firestore.q) ((ArrayList) obj).get(0), new C1154q(new ArrayList(), fVar, 22)));
                return;
            case 19:
                FlutterFirebasePlugin.cachedThreadPool.execute(new S(12, (io.flutter.plugins.firebase.firestore.q) ((ArrayList) obj).get(0), new C1154q(new ArrayList(), fVar, 23)));
                return;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                FlutterFirebasePlugin.cachedThreadPool.execute(new S(14, (io.flutter.plugins.firebase.firestore.q) ((ArrayList) obj).get(0), new C1154q(new ArrayList(), fVar, 24)));
                return;
            case 21:
                FlutterFirebasePlugin.cachedThreadPool.execute(new S(13, (io.flutter.plugins.firebase.firestore.q) ((ArrayList) obj).get(0), new C1154q(new ArrayList(), fVar, 25)));
                return;
            case 22:
                ArrayList arrayList5 = (ArrayList) obj;
                FlutterFirebasePlugin.cachedThreadPool.execute(new A.h((io.flutter.plugins.firebase.firestore.q) arrayList5.get(0), (String) arrayList5.get(1), new C1154q(new ArrayList(), fVar, 26), 14));
                return;
            case 23:
                FlutterFirebasePlugin.cachedThreadPool.execute(new S(10, (Boolean) ((ArrayList) obj).get(0), new C1154q(new ArrayList(), fVar, 27)));
                return;
            case 24:
                ArrayList arrayList6 = (ArrayList) obj;
                FlutterFirebasePlugin.cachedThreadPool.execute(new A.h((io.flutter.plugins.firebase.firestore.q) arrayList6.get(0), (io.flutter.plugins.firebase.firestore.n) arrayList6.get(1), new C1154q(new ArrayList(), fVar, 12), 16));
                return;
            case 25:
                ArrayList arrayList7 = (ArrayList) obj;
                FlutterFirebasePlugin.cachedThreadPool.execute(new A.h((io.flutter.plugins.firebase.firestore.q) arrayList7.get(0), (io.flutter.plugins.firebase.firestore.n) arrayList7.get(1), new C1154q(new ArrayList(), fVar, 13), 20));
                return;
            case 26:
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = (ArrayList) obj;
                FlutterFirebasePlugin.cachedThreadPool.execute(new A.h((io.flutter.plugins.firebase.firestore.n) arrayList9.get(1), (io.flutter.plugins.firebase.firestore.q) arrayList9.get(0), new C1154q(arrayList8, fVar, 14), 17));
                return;
            case 27:
                ArrayList arrayList10 = (ArrayList) obj;
                FlutterFirebasePlugin.cachedThreadPool.execute(new A.h((io.flutter.plugins.firebase.firestore.q) arrayList10.get(0), (io.flutter.plugins.firebase.firestore.n) arrayList10.get(1), new C1154q(new ArrayList(), fVar, 15), 15));
                return;
            case 28:
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = (ArrayList) obj;
                FlutterFirebasePlugin.cachedThreadPool.execute(new N.f((y) arrayList12.get(4), (io.flutter.plugins.firebase.firestore.q) arrayList12.get(0), (String) arrayList12.get(1), (Boolean) arrayList12.get(2), (z) arrayList12.get(3), new C1154q(arrayList11, fVar, 16), 1));
                return;
            default:
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = (ArrayList) obj;
                io.flutter.plugins.firebase.firestore.k kVar = io.flutter.plugins.firebase.firestore.k.values()[((Integer) arrayList14.get(3)).intValue()];
                List<io.flutter.plugins.firebase.firestore.i> list = (List) arrayList14.get(4);
                C1154q c1154q = new C1154q(arrayList13, fVar, 17);
                g0 P7 = AbstractC0412a.P(C1162g.c((io.flutter.plugins.firebase.firestore.q) arrayList14.get(0)), (String) arrayList14.get(1), ((Boolean) arrayList14.get(5)).booleanValue(), (z) arrayList14.get(2));
                ArrayList arrayList15 = new ArrayList();
                for (io.flutter.plugins.firebase.firestore.i iVar : list) {
                    int i7 = AbstractC1161f.f11919a[iVar.f11931a.ordinal()];
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 == 3) {
                                arrayList15.add(new AbstractC0802d(C0818u.a(iVar.f11932b), "average"));
                            }
                        } else {
                            arrayList15.add(new AbstractC0802d(C0818u.a(iVar.f11932b), "sum"));
                        }
                    } else {
                        arrayList15.add(new AbstractC0802d(null, "count"));
                    }
                }
                P7.getClass();
                ?? arrayList16 = new ArrayList();
                arrayList16.add((AbstractC0802d) arrayList15.get(0));
                arrayList16.addAll(Arrays.asList((AbstractC0802d[]) arrayList15.subList(1, arrayList15.size()).toArray(new AbstractC0802d[0])));
                FlutterFirebasePlugin.cachedThreadPool.execute(new M.d(new C0803e(P7, arrayList16), kVar, list, c1154q, 14));
                return;
        }
    }

    public /* synthetic */ d(C1162g c1162g, int i7) {
        this.f10151a = i7;
    }
}
