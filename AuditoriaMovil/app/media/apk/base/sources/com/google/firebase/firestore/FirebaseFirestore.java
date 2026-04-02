package com.google.firebase.firestore;

import D.AbstractC0055e;
import D.AbstractC0059i;
import D.RunnableC0053c;
import a1.C0415A;
import android.content.Context;
import androidx.annotation.Keep;
import b3.C0585f;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.List;
import l4.C1419c;
import l4.C1421e;
import n4.C1533t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q4.C1708a;
import q4.C1711d;
/* loaded from: classes.dex */
public class FirebaseFirestore {

    /* renamed from: a  reason: collision with root package name */
    public final X5.L f9746a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f9747b;

    /* renamed from: c  reason: collision with root package name */
    public final q4.f f9748c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9749d;

    /* renamed from: e  reason: collision with root package name */
    public final C1421e f9750e;
    public final C1419c f;

    /* renamed from: g  reason: collision with root package name */
    public final U3.h f9751g;

    /* renamed from: h  reason: collision with root package name */
    public final C0585f f9752h;

    /* renamed from: i  reason: collision with root package name */
    public final M f9753i;
    public L j;

    /* renamed from: k  reason: collision with root package name */
    public final R1.j f9754k;

    /* renamed from: l  reason: collision with root package name */
    public final t4.j f9755l;

    /* renamed from: m  reason: collision with root package name */
    public C0415A f9756m;

    public FirebaseFirestore(Context context, q4.f fVar, String str, C1421e c1421e, C1419c c1419c, X5.L l8, U3.h hVar, M m7, t4.j jVar) {
        context.getClass();
        this.f9747b = context;
        this.f9748c = fVar;
        this.f9752h = new C0585f(fVar, 3);
        str.getClass();
        this.f9749d = str;
        this.f9750e = c1421e;
        this.f = c1419c;
        this.f9746a = l8;
        this.f9754k = new R1.j(new E(this));
        this.f9751g = hVar;
        this.f9753i = m7;
        this.f9755l = jVar;
        this.j = new K().a();
    }

    public static FirebaseFirestore e(U3.h hVar, String str) {
        FirebaseFirestore firebaseFirestore;
        AbstractC0055e.b(str, "Provided database name must not be null.");
        hVar.a();
        M m7 = (M) hVar.f5752d.a(M.class);
        AbstractC0055e.b(m7, "Firestore component is not present.");
        synchronized (m7) {
            firebaseFirestore = (FirebaseFirestore) m7.f9774a.get(str);
            if (firebaseFirestore == null) {
                firebaseFirestore = g(m7.f9776c, m7.f9775b, m7.f9777d, m7.f9778e, str, m7, m7.f);
                m7.f9774a.put(str, firebaseFirestore);
            }
        }
        return firebaseFirestore;
    }

    public static FirebaseFirestore g(Context context, U3.h hVar, c4.p pVar, c4.p pVar2, String str, M m7, t4.j jVar) {
        hVar.a();
        String str2 = hVar.f5751c.f5762g;
        if (str2 != null) {
            q4.f fVar = new q4.f(str2, str);
            C1421e c1421e = new C1421e(pVar);
            C1419c c1419c = new C1419c(pVar2);
            hVar.a();
            return new FirebaseFirestore(context, fVar, hVar.f5750b, c1421e, c1419c, new X5.L(23), hVar, m7, jVar);
        }
        throw new IllegalArgumentException("FirebaseOptions.getProjectId() cannot be null");
    }

    @Keep
    public static void setClientLanguage(String str) {
        t4.p.j = str;
    }

    public final Task a() {
        Task task;
        R1.j jVar = this.f9754k;
        synchronized (jVar) {
            Q0.F f = new Q0.F(jVar, 1);
            C1533t c1533t = (C1533t) jVar.f4683c;
            if (c1533t != null && !c1533t.f14363d.f15988a.b()) {
                task = Tasks.forException(new J("Persistence cannot be cleared while the firestore instance is running.", I.FAILED_PRECONDITION));
            }
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            f.execute(new RunnableC0053c(29, this, taskCompletionSource));
            task = taskCompletionSource.getTask();
        }
        return task;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.firebase.firestore.g0, com.google.firebase.firestore.i] */
    public final C0807i b(String str) {
        AbstractC0055e.b(str, "Provided collection path must not be null.");
        this.f9754k.n0();
        q4.p l8 = q4.p.l(str);
        ?? g0Var = new g0(new n4.D(l8, null), this);
        List list = l8.f15351a;
        if (list.size() % 2 == 1) {
            return g0Var;
        }
        throw new IllegalArgumentException("Invalid collection reference. Collection references must have an odd number of segments, but " + l8.c() + " has " + list.size());
    }

    public final g0 c(String str) {
        AbstractC0055e.b(str, "Provided collection ID must not be null.");
        if (!str.contains("/")) {
            this.f9754k.n0();
            return new g0(new n4.D(q4.p.f15369b, str), this);
        }
        throw new IllegalArgumentException(AbstractC0059i.M("Invalid collectionId '", str, "'. Collection IDs must not contain '/'."));
    }

    public final C0814p d(String str) {
        AbstractC0055e.b(str, "Provided document path must not be null.");
        this.f9754k.n0();
        q4.p l8 = q4.p.l(str);
        List list = l8.f15351a;
        if (list.size() % 2 == 0) {
            return new C0814p(new q4.h(l8), this);
        }
        throw new IllegalArgumentException("Invalid document reference. Document references must have an even number of segments, but " + l8.c() + " has " + list.size());
    }

    public final Task f(String str) {
        Task task;
        R1.j jVar = this.f9754k;
        synchronized (jVar) {
            jVar.n0();
            C1533t c1533t = (C1533t) jVar.f4683c;
            c1533t.e();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            c1533t.f14363d.a(new A.h(c1533t, str, taskCompletionSource, 24));
            task = taskCompletionSource.getTask();
        }
        return task.continueWith(new E(this));
    }

    public final void h(L l8) {
        boolean z7;
        AbstractC0055e.b(l8, "Provided settings must not be null.");
        synchronized (this.f9748c) {
            try {
                if (((C1533t) this.f9754k.f4683c) != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7 && !this.j.equals(l8)) {
                    throw new IllegalStateException("FirebaseFirestore has already been started and its settings can no longer be changed. You can only call setFirestoreSettings() before calling any other methods on a FirebaseFirestore object.");
                }
                this.j = l8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Task i(String str) {
        boolean z7;
        Task a7;
        this.f9754k.n0();
        L l8 = this.j;
        X x7 = l8.f9773e;
        if (x7 != null) {
            z7 = x7 instanceof b0;
        } else {
            z7 = l8.f9771c;
        }
        if (z7) {
            ArrayList arrayList = new ArrayList();
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("indexes")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("indexes");
                    for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
                        String string = jSONObject2.getString("collectionGroup");
                        ArrayList arrayList2 = new ArrayList();
                        JSONArray optJSONArray = jSONObject2.optJSONArray("fields");
                        for (int i8 = 0; optJSONArray != null && i8 < optJSONArray.length(); i8++) {
                            JSONObject jSONObject3 = optJSONArray.getJSONObject(i8);
                            q4.k l9 = q4.k.l(jSONObject3.getString("fieldPath"));
                            if ("CONTAINS".equals(jSONObject3.optString("arrayConfig"))) {
                                arrayList2.add(new C1711d(l9, q4.j.CONTAINS));
                            } else if ("ASCENDING".equals(jSONObject3.optString("order"))) {
                                arrayList2.add(new C1711d(l9, q4.j.ASCENDING));
                            } else {
                                arrayList2.add(new C1711d(l9, q4.j.DESCENDING));
                            }
                        }
                        arrayList.add(new C1708a(-1, string, arrayList2, C1708a.f15337e));
                    }
                }
                R1.j jVar = this.f9754k;
                synchronized (jVar) {
                    jVar.n0();
                    C1533t c1533t = (C1533t) jVar.f4683c;
                    c1533t.e();
                    a7 = c1533t.f14363d.a(new S(20, c1533t, arrayList));
                }
                return a7;
            } catch (JSONException e7) {
                throw new IllegalArgumentException("Failed to parse index configuration", e7);
            }
        }
        throw new IllegalStateException("Cannot enable indexes when persistence is disabled");
    }

    public final Task j() {
        M m7 = this.f9753i;
        String str = this.f9748c.f15353b;
        synchronized (m7) {
            m7.f9774a.remove(str);
        }
        return this.f9754k.S0();
    }

    public final void k(C0814p c0814p) {
        if (c0814p.f9839b == this) {
            return;
        }
        throw new IllegalArgumentException("Provided document reference is from a different Cloud Firestore instance.");
    }

    public final Task l() {
        Task task;
        R1.j jVar = this.f9754k;
        synchronized (jVar) {
            jVar.n0();
            C1533t c1533t = (C1533t) jVar.f4683c;
            c1533t.e();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            c1533t.f14363d.a(new S(19, c1533t, taskCompletionSource));
            task = taskCompletionSource.getTask();
        }
        return task;
    }
}
