package com.google.firebase.firestore;

import D.AbstractC0055e;
import H4.C0166j;
import H4.C0168k;
import H4.C0174n;
import b3.C0585f;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.protobuf.C0871w;
import g6.AbstractC1014c;
import g6.C1013b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p.Y0;
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final n4.M f9840a;

    /* renamed from: b  reason: collision with root package name */
    public final FirebaseFirestore f9841b;

    public p0(n4.M m7, FirebaseFirestore firebaseFirestore) {
        m7.getClass();
        this.f9840a = m7;
        firebaseFirestore.getClass();
        this.f9841b = firebaseFirestore;
    }

    public final r a(C0814p c0814p) {
        this.f9841b.k(c0814p);
        try {
            return (r) Tasks.await(b(c0814p));
        } catch (InterruptedException e7) {
            throw new RuntimeException(e7);
        } catch (ExecutionException e8) {
            if (e8.getCause() instanceof J) {
                throw ((J) e8.getCause());
            }
            throw new RuntimeException(e8.getCause());
        }
    }

    public final Task b(C0814p c0814p) {
        Task continueWithTask;
        n4.M m7 = this.f9840a;
        List<q4.h> singletonList = Collections.singletonList(c0814p.f9838a);
        m5.d.i("A transaction object cannot be used after its update callback has been invoked.", !m7.f14314d, new Object[0]);
        if (m7.f14313c.size() != 0) {
            continueWithTask = Tasks.forException(new J("Firestore transactions require all reads to be executed before all writes.", I.INVALID_ARGUMENT));
        } else {
            t4.i iVar = m7.f14311a;
            iVar.getClass();
            C0166j y2 = C0168k.y();
            y2.d();
            C0168k.v((C0168k) y2.f10006b, (String) iVar.f15804a.f14881c);
            for (q4.h hVar : singletonList) {
                String V7 = iVar.f15804a.V(hVar);
                y2.d();
                C0168k.w((C0168k) y2.f10006b, V7);
            }
            ArrayList arrayList = new ArrayList();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            t4.p pVar = iVar.f15806c;
            Q0.A a7 = H4.W.f1997a;
            if (a7 == null) {
                synchronized (H4.W.class) {
                    try {
                        a7 = H4.W.f1997a;
                        if (a7 == null) {
                            D5.b e7 = Q0.A.e();
                            e7.f870d = a6.f0.SERVER_STREAMING;
                            e7.f871e = Q0.A.c("google.firestore.v1.Firestore", "BatchGetDocuments");
                            e7.f867a = true;
                            C0168k x7 = C0168k.x();
                            C0871w c0871w = AbstractC1014c.f11139a;
                            e7.f868b = new C1013b(x7);
                            e7.f869c = new C1013b(C0174n.v());
                            Q0.A g3 = e7.g();
                            H4.W.f1997a = g3;
                            a7 = g3;
                        }
                    } finally {
                    }
                }
            }
            E.e eVar = new E.e(iVar, arrayList, singletonList, taskCompletionSource);
            Y0 y02 = pVar.f15831d;
            ((Task) y02.f14760b).continueWithTask(((u4.e) y02.f14761c).f15988a, new A4.d(25, y02, a7)).addOnCompleteListener(pVar.f15828a.f15988a, new com.google.firebase.storage.r(pVar, eVar, (C0168k) y2.b(), 2));
            continueWithTask = taskCompletionSource.getTask().continueWithTask(u4.k.f16005b, new X5.E(m7, 17));
        }
        return continueWithTask.continueWith(u4.k.f16005b, new X5.E(this, 8));
    }

    public final void c(C0814p c0814p, Map map, l0 l0Var) {
        n4.O P7;
        FirebaseFirestore firebaseFirestore = this.f9841b;
        firebaseFirestore.k(c0814p);
        AbstractC0055e.b(map, "Provided data must not be null.");
        AbstractC0055e.b(l0Var, "Provided options must not be null.");
        boolean z7 = l0Var.f9826a;
        C0585f c0585f = firebaseFirestore.f9752h;
        if (z7) {
            P7 = c0585f.N(map, l0Var.f9827b);
        } else {
            P7 = c0585f.P(map);
        }
        n4.M m7 = this.f9840a;
        q4.h hVar = c0814p.f9838a;
        List singletonList = Collections.singletonList(P7.a(hVar, m7.a(hVar)));
        m5.d.i("A transaction object cannot be used after its update callback has been invoked.", !m7.f14314d, new Object[0]);
        m7.f14313c.addAll(singletonList);
        m7.f.add(hVar);
    }
}
