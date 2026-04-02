package Q5;

import D.AbstractC0055e;
import H4.C0185t;
import H4.C0187u;
import H4.C0191w;
import H4.W;
import H4.t1;
import Q0.A;
import X5.E;
import a4.AbstractC0467p;
import a6.f0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.J;
import com.google.firebase.storage.r;
import com.google.protobuf.C0871w;
import g6.AbstractC1014c;
import g6.C1013b;
import h1.t;
import io.flutter.plugins.firebase.auth.C1154q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import l4.C1418b;
import n4.M;
import p.Y0;
import t4.p;
import u4.k;
/* loaded from: classes.dex */
public final /* synthetic */ class g implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4435a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4436b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f4437c;

    public /* synthetic */ g(int i7, Object obj, Object obj2) {
        this.f4435a = i7;
        this.f4436b = obj;
        this.f4437c = obj2;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Exception exc;
        Task continueWithTask;
        switch (this.f4435a) {
            case 0:
                j jVar = (j) this.f4436b;
                jVar.getClass();
                HashMap hashMap = new HashMap();
                if (task.getException() == null && ((io.flutter.plugins.firebase.firestore.h) task.getResult()).f11930a == null) {
                    if (task.getResult() != null) {
                        hashMap.put("complete", Boolean.TRUE);
                    }
                } else {
                    if (task.getException() != null) {
                        exc = task.getException();
                    } else {
                        exc = ((io.flutter.plugins.firebase.firestore.h) task.getResult()).f11930a;
                    }
                    U3.h hVar = jVar.f4445b.f9751g;
                    hVar.a();
                    hashMap.put("appName", hVar.f5750b);
                    hashMap.put("error", W.h(exc));
                }
                jVar.f4443Y.post(new h((L5.h) this.f4437c, hashMap, 0));
                return;
            case 1:
                boolean isSuccessful = task.isSuccessful();
                C1154q c1154q = (C1154q) this.f4436b;
                if (isSuccessful) {
                    c1154q.d(AbstractC0055e.t((AbstractC0467p) this.f4437c));
                    return;
                } else {
                    c1154q.b(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            case 2:
                t tVar = (t) this.f4436b;
                tVar.getClass();
                if (task.isSuccessful()) {
                    ((TaskCompletionSource) tVar.f).setResult(((Task) this.f4437c).getResult());
                    return;
                } else {
                    tVar.n(task);
                    return;
                }
            default:
                t tVar2 = (t) this.f4436b;
                M m7 = (M) this.f4437c;
                tVar2.getClass();
                if (!task.isSuccessful()) {
                    tVar2.n(task);
                    return;
                }
                m5.d.i("A transaction object cannot be used after its update callback has been invoked.", !m7.f14314d, new Object[0]);
                J j = m7.f14315e;
                if (j != null) {
                    continueWithTask = Tasks.forException(j);
                } else {
                    HashSet hashSet = new HashSet(m7.f14312b.keySet());
                    Iterator it = m7.f14313c.iterator();
                    while (it.hasNext()) {
                        hashSet.remove(((r4.h) it.next()).f15496a);
                    }
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        q4.h hVar2 = (q4.h) it2.next();
                        m7.f14313c.add(new r4.h(hVar2, m7.a(hVar2)));
                    }
                    m7.f14314d = true;
                    t4.i iVar = m7.f14311a;
                    ArrayList arrayList = m7.f14313c;
                    iVar.getClass();
                    C0185t y2 = C0187u.y();
                    y2.d();
                    C0187u.v((C0187u) y2.f10006b, (String) iVar.f15804a.f14881c);
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        t1 W7 = iVar.f15804a.W((r4.h) it3.next());
                        y2.d();
                        C0187u.w((C0187u) y2.f10006b, W7);
                    }
                    p pVar = iVar.f15806c;
                    A a7 = W.f1998b;
                    if (a7 == null) {
                        synchronized (W.class) {
                            try {
                                a7 = W.f1998b;
                                if (a7 == null) {
                                    D5.b e7 = A.e();
                                    e7.f870d = f0.UNARY;
                                    e7.f871e = A.c("google.firestore.v1.Firestore", "Commit");
                                    e7.f867a = true;
                                    C0187u x7 = C0187u.x();
                                    C0871w c0871w = AbstractC1014c.f11139a;
                                    e7.f868b = new C1013b(x7);
                                    e7.f869c = new C1013b(C0191w.w());
                                    A g3 = e7.g();
                                    W.f1998b = g3;
                                    a7 = g3;
                                }
                            } finally {
                            }
                        }
                    }
                    pVar.getClass();
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    Y0 y02 = pVar.f15831d;
                    ((Task) y02.f14760b).continueWithTask(((u4.e) y02.f14761c).f15988a, new A4.d(25, y02, a7)).addOnCompleteListener(pVar.f15828a.f15988a, new r(pVar, taskCompletionSource, (C0187u) y2.b()));
                    continueWithTask = taskCompletionSource.getTask().continueWith(iVar.f15805b.f15988a, new E(iVar, 20)).continueWithTask(k.f16005b, new C1418b(5));
                }
                continueWithTask.addOnCompleteListener(((u4.e) tVar2.f11318b).f15988a, new g(2, tVar2, task));
                return;
        }
    }
}
