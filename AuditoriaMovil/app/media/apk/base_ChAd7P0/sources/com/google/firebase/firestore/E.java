package com.google.firebase.firestore;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import n4.C1533t;
/* loaded from: classes.dex */
public final /* synthetic */ class E implements u4.m, Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseFirestore f9744a;

    public /* synthetic */ E(FirebaseFirestore firebaseFirestore) {
        this.f9744a = firebaseFirestore;
    }

    @Override // u4.m, H.a, J2.g
    public Object apply(Object obj) {
        C1533t c1533t;
        FirebaseFirestore firebaseFirestore = this.f9744a;
        u4.e eVar = (u4.e) obj;
        synchronized (firebaseFirestore.f9754k) {
            q4.f fVar = firebaseFirestore.f9748c;
            String str = firebaseFirestore.f9749d;
            L l8 = firebaseFirestore.j;
            c1533t = new C1533t(firebaseFirestore.f9747b, new K5.d(fVar, str, l8.f9769a, l8.f9770b, 3), firebaseFirestore.f9750e, firebaseFirestore.f, eVar, firebaseFirestore.f9755l, (n4.y) firebaseFirestore.f9746a.apply(l8));
        }
        return c1533t;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        FirebaseFirestore firebaseFirestore = this.f9744a;
        firebaseFirestore.getClass();
        n4.D d7 = (n4.D) task.getResult();
        if (d7 != null) {
            return new g0(d7, firebaseFirestore);
        }
        return null;
    }
}
