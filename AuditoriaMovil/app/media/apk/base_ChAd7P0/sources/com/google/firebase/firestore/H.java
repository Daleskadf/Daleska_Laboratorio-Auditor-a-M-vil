package com.google.firebase.firestore;

import a.AbstractC0412a;
import c1.RunnableC0626c;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.firestore.C1162g;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import n4.C1533t;
/* loaded from: classes.dex */
public final /* synthetic */ class H implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9759a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9760b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9761c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f9762d;

    public /* synthetic */ H(Object obj, Object obj2, Object obj3, int i7) {
        this.f9759a = i7;
        this.f9760b = obj;
        this.f9761c = obj2;
        this.f9762d = obj3;
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, h1.t] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        l0 l0Var;
        q4.h hVar;
        switch (this.f9759a) {
            case 0:
                FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f9760b;
                firebaseFirestore.getClass();
                p0 p0Var = new p0((n4.M) this.f9762d, firebaseFirestore);
                A4.d dVar = (A4.d) this.f9761c;
                Q5.j jVar = (Q5.j) dVar.f220b;
                A4.d dVar2 = jVar.f4444a;
                ((C1162g) dVar2.f221c).f11928d.put((String) dVar2.f220b, p0Var);
                HashMap hashMap = new HashMap();
                FirebaseFirestore firebaseFirestore2 = jVar.f4445b;
                U3.h hVar2 = firebaseFirestore2.f9751g;
                hVar2.a();
                hashMap.put("appName", hVar2.f5750b);
                jVar.f4443Y.post(new Q5.h((L5.h) dVar.f221c, hashMap, 1));
                try {
                    if (!jVar.f4448e.tryAcquire(jVar.f4446c.longValue(), TimeUnit.MILLISECONDS)) {
                        return new io.flutter.plugins.firebase.firestore.h(new J("timed out", I.DEADLINE_EXCEEDED));
                    }
                    if (jVar.f4442X.isEmpty()) {
                        return new io.flutter.plugins.firebase.firestore.h();
                    }
                    if (jVar.f == io.flutter.plugins.firebase.firestore.D.FAILURE) {
                        return new io.flutter.plugins.firebase.firestore.h();
                    }
                    for (io.flutter.plugins.firebase.firestore.C c8 : jVar.f4442X) {
                        C0814p d7 = firebaseFirestore2.d(c8.f11908b);
                        int i7 = Q5.i.f4441a[c8.f11907a.ordinal()];
                        n4.M m7 = p0Var.f9840a;
                        FirebaseFirestore firebaseFirestore3 = p0Var.f9841b;
                        q4.h hVar3 = d7.f9838a;
                        if (i7 != 1) {
                            if (i7 != 2) {
                                if (i7 == 3) {
                                    io.flutter.plugins.firebase.firestore.v vVar = c8.f11910d;
                                    Objects.requireNonNull(vVar);
                                    Boolean bool = vVar.f11953a;
                                    if (bool != null && bool.booleanValue()) {
                                        l0Var = l0.f9825d;
                                    } else {
                                        List list = vVar.f11954b;
                                        if (list != null) {
                                            l0Var = l0.a(AbstractC0412a.K(list));
                                        } else {
                                            l0Var = null;
                                        }
                                    }
                                    Map map = c8.f11909c;
                                    Objects.requireNonNull(map);
                                    Map map2 = map;
                                    if (l0Var == null) {
                                        p0Var.c(d7, map2, l0.f9824c);
                                    } else {
                                        p0Var.c(d7, map2, l0Var);
                                    }
                                }
                            } else {
                                Map map3 = c8.f11909c;
                                Objects.requireNonNull(map3);
                                n4.O R7 = firebaseFirestore3.f9752h.R(map3);
                                firebaseFirestore3.k(d7);
                                m7.getClass();
                                try {
                                    hVar = hVar3;
                                } catch (J e7) {
                                    e = e7;
                                    hVar = hVar3;
                                }
                                try {
                                    List singletonList = Collections.singletonList(new r4.l(hVar3, R7.f14317a, R7.f14318b, m7.b(hVar3), R7.f14319c));
                                    m5.d.i("A transaction object cannot be used after its update callback has been invoked.", !m7.f14314d, new Object[0]);
                                    m7.f14313c.addAll(singletonList);
                                } catch (J e8) {
                                    e = e8;
                                    m7.f14315e = e;
                                    m7.f.add(hVar);
                                }
                                m7.f.add(hVar);
                            }
                        } else {
                            firebaseFirestore3.k(d7);
                            List singletonList2 = Collections.singletonList(new r4.h(hVar3, m7.a(hVar3)));
                            m5.d.i("A transaction object cannot be used after its update callback has been invoked.", !m7.f14314d, new Object[0]);
                            m7.f14313c.addAll(singletonList2);
                            m7.f.add(hVar3);
                        }
                    }
                    return new io.flutter.plugins.firebase.firestore.h();
                } catch (InterruptedException unused) {
                    return new io.flutter.plugins.firebase.firestore.h(new J("interrupted", I.DEADLINE_EXCEEDED));
                }
            case 1:
                d4.f fVar = (d4.f) this.f9760b;
                fVar.getClass();
                return fVar.f10344a.submit(new S(3, (Callable) this.f9761c, (A.c) this.f9762d));
            default:
                C1533t c1533t = (C1533t) this.f9760b;
                n4.J j = c1533t.f14367i;
                j.getClass();
                ?? obj = new Object();
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                obj.f = taskCompletionSource;
                u4.e eVar = c1533t.f14363d;
                obj.f11318b = eVar;
                obj.f11319c = j.f14292b;
                obj.f11320d = (M.b) this.f9762d;
                obj.f11317a = ((q0) this.f9761c).f9842a;
                u4.l lVar = new u4.l(eVar, u4.d.RETRY_TRANSACTION, 1000L, 60000L);
                obj.f11321e = lVar;
                obj.f11317a--;
                lVar.a(new RunnableC0626c((Object) obj, 10));
                return taskCompletionSource.getTask();
        }
    }
}
