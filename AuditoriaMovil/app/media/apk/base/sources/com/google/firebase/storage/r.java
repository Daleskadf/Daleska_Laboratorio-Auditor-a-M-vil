package com.google.firebase.storage;

import A3.N;
import H4.C0168k;
import a6.AbstractC0479h;
import a6.C0489s;
import a6.e0;
import a6.o0;
import c1.RunnableC0626c;
import c6.C0693o1;
import c6.InterfaceC0711v;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.protobuf.J;
import y4.C2035a;
/* loaded from: classes.dex */
public final /* synthetic */ class r implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9939a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9940b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9941c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f9942d;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, int i7) {
        this.f9939a = i7;
        this.f9940b = obj;
        this.f9941c = obj2;
        this.f9942d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6, types: [a6.e0, java.lang.Object] */
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Object obj = this.f9941c;
        Object obj2 = this.f9942d;
        Object obj3 = this.f9940b;
        switch (this.f9939a) {
            case 0:
                Continuation continuation = (Continuation) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                v vVar = (v) obj3;
                vVar.getClass();
                try {
                    Object then = continuation.then(vVar);
                    if (!taskCompletionSource.getTask().isComplete()) {
                        taskCompletionSource.setResult(then);
                        return;
                    }
                    return;
                } catch (RuntimeExecutionException e7) {
                    if (e7.getCause() instanceof Exception) {
                        taskCompletionSource.setException((Exception) e7.getCause());
                        return;
                    } else {
                        taskCompletionSource.setException(e7);
                        return;
                    }
                } catch (Exception e8) {
                    taskCompletionSource.setException(e8);
                    return;
                }
            case 1:
                ?? obj4 = new Object();
                Task task2 = (Task) obj3;
                C0693o1 c0693o1 = (C0693o1) obj;
                if (task2.isSuccessful()) {
                    String str = (String) task2.getResult();
                    u4.q.a("FirestoreCallCredentials", "Successfully fetched auth token.", new Object[0]);
                    if (str != null) {
                        obj4.f(t4.k.f15812c, "Bearer ".concat(str));
                    }
                } else {
                    Exception exception = task2.getException();
                    if (exception instanceof U3.c) {
                        u4.q.a("FirestoreCallCredentials", "Firebase Auth API not available, not using authentication.", new Object[0]);
                    } else if (exception instanceof C2035a) {
                        u4.q.a("FirestoreCallCredentials", "No user signed in, not using authentication.", new Object[0]);
                    } else {
                        u4.q.d("FirestoreCallCredentials", "Failed to get auth token: %s.", exception);
                        c0693o1.a(o0.j.f(exception));
                        return;
                    }
                }
                Task task3 = (Task) obj2;
                if (task3.isSuccessful()) {
                    String str2 = (String) task3.getResult();
                    if (str2 != null && !str2.isEmpty()) {
                        u4.q.a("FirestoreCallCredentials", "Successfully fetched AppCheck token.", new Object[0]);
                        obj4.f(t4.k.f15813d, str2);
                    }
                } else {
                    Exception exception2 = task3.getException();
                    if (exception2 instanceof U3.c) {
                        u4.q.a("FirestoreCallCredentials", "Firebase AppCheck API not available.", new Object[0]);
                    } else {
                        u4.q.d("FirestoreCallCredentials", "Failed to get AppCheck token: %s.", exception2);
                        c0693o1.a(o0.j.f(exception2));
                        return;
                    }
                }
                G.i.o("apply() or fail() already called", !c0693o1.j);
                e0 e0Var = c0693o1.f8940c;
                e0Var.d(obj4);
                C0489s c0489s = c0693o1.f8942e;
                C0489s a7 = c0489s.a();
                try {
                    InterfaceC0711v b5 = c0693o1.f8938a.b(c0693o1.f8939b, e0Var, c0693o1.f8941d, c0693o1.f8943g);
                    c0489s.c(a7);
                    c0693o1.b(b5);
                    return;
                } catch (Throwable th) {
                    c0489s.c(a7);
                    throw th;
                }
            case 2:
                t4.p pVar = (t4.p) obj3;
                pVar.getClass();
                AbstractC0479h abstractC0479h = (AbstractC0479h) task.getResult();
                abstractC0479h.e(new t4.o((E.e) obj, abstractC0479h), pVar.a());
                abstractC0479h.c(1);
                abstractC0479h.d((C0168k) obj2);
                abstractC0479h.b();
                return;
            case 3:
                t4.p pVar2 = (t4.p) obj3;
                pVar2.getClass();
                AbstractC0479h abstractC0479h2 = (AbstractC0479h) task.getResult();
                AbstractC0479h[] abstractC0479hArr = (AbstractC0479h[]) obj;
                abstractC0479hArr[0] = abstractC0479h2;
                N n7 = (N) obj2;
                abstractC0479h2.e(new t4.l(pVar2, n7, abstractC0479hArr), pVar2.a());
                ((J2.e) n7.f105c).E(new RunnableC0626c(n7, 17));
                abstractC0479hArr[0].c(1);
                return;
            default:
                t4.p pVar3 = (t4.p) obj3;
                pVar3.getClass();
                AbstractC0479h abstractC0479h3 = (AbstractC0479h) task.getResult();
                abstractC0479h3.e(new t4.o(pVar3, (TaskCompletionSource) obj2), pVar3.a());
                abstractC0479h3.c(2);
                abstractC0479h3.d((J) obj);
                abstractC0479h3.b();
                return;
        }
    }

    public /* synthetic */ r(t4.p pVar, TaskCompletionSource taskCompletionSource, J j) {
        this.f9939a = 4;
        this.f9940b = pVar;
        this.f9942d = taskCompletionSource;
        this.f9941c = j;
    }
}
