package com.google.firebase.firestore;

import android.app.Activity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class U extends Task {

    /* renamed from: a  reason: collision with root package name */
    public final Object f9786a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public W f9787b = W.f9791g;

    /* renamed from: c  reason: collision with root package name */
    public final TaskCompletionSource f9788c;

    /* renamed from: d  reason: collision with root package name */
    public final Task f9789d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque f9790e;

    public U() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f9788c = taskCompletionSource;
        this.f9789d = taskCompletionSource.getTask();
        this.f9790e = new ArrayDeque();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.firebase.firestore.T] */
    public final void a(Q5.c cVar) {
        ?? obj = new Object();
        obj.f9784a = TaskExecutors.MAIN_THREAD;
        obj.f9785b = cVar;
        synchronized (this.f9786a) {
            this.f9790e.add(obj);
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(OnCanceledListener onCanceledListener) {
        return this.f9789d.addOnCanceledListener(onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        return this.f9789d.addOnCompleteListener(onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(OnFailureListener onFailureListener) {
        return this.f9789d.addOnFailureListener(onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(OnSuccessListener onSuccessListener) {
        return this.f9789d.addOnSuccessListener(onSuccessListener);
    }

    public final void b(J j) {
        synchronized (this.f9786a) {
            try {
                W w2 = this.f9787b;
                W w7 = new W(w2.f9792a, w2.f9793b, w2.f9794c, w2.f9795d, j, V.ERROR);
                this.f9787b = w7;
                Iterator it = this.f9790e.iterator();
                while (it.hasNext()) {
                    T t7 = (T) it.next();
                    t7.getClass();
                    t7.f9784a.execute(new S(0, t7, w7));
                }
                this.f9790e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f9788c.setException(j);
    }

    public final void c(W w2) {
        boolean equals = w2.f9796e.equals(V.SUCCESS);
        m5.d.i("Expected success, but was " + w2.f9796e, equals, new Object[0]);
        synchronized (this.f9786a) {
            try {
                this.f9787b = w2;
                Iterator it = this.f9790e.iterator();
                while (it.hasNext()) {
                    T t7 = (T) it.next();
                    W w7 = this.f9787b;
                    t7.getClass();
                    t7.f9784a.execute(new S(0, t7, w7));
                }
                this.f9790e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f9788c.setResult(w2);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWith(Continuation continuation) {
        return this.f9789d.continueWith(continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWithTask(Continuation continuation) {
        return this.f9789d.continueWithTask(continuation);
    }

    public final void d(W w2) {
        synchronized (this.f9786a) {
            try {
                this.f9787b = w2;
                Iterator it = this.f9790e.iterator();
                while (it.hasNext()) {
                    T t7 = (T) it.next();
                    t7.getClass();
                    t7.f9784a.execute(new S(0, t7, w2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        return this.f9789d.getException();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult() {
        return (W) this.f9789d.getResult();
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        return this.f9789d.isCanceled();
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        return this.f9789d.isComplete();
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        return this.f9789d.isSuccessful();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(SuccessContinuation successContinuation) {
        return this.f9789d.onSuccessTask(successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        return this.f9789d.addOnCanceledListener(executor, onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(Executor executor, OnCompleteListener onCompleteListener) {
        return this.f9789d.addOnCompleteListener(executor, onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        return this.f9789d.addOnFailureListener(executor, onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(Executor executor, OnSuccessListener onSuccessListener) {
        return this.f9789d.addOnSuccessListener(executor, onSuccessListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWith(Executor executor, Continuation continuation) {
        return this.f9789d.continueWith(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWithTask(Executor executor, Continuation continuation) {
        return this.f9789d.continueWithTask(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult(Class cls) {
        return (W) this.f9789d.getResult(cls);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(Executor executor, SuccessContinuation successContinuation) {
        return this.f9789d.onSuccessTask(executor, successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        return this.f9789d.addOnCanceledListener(activity, onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(Activity activity, OnCompleteListener onCompleteListener) {
        return this.f9789d.addOnCompleteListener(activity, onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        return this.f9789d.addOnFailureListener(activity, onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(Activity activity, OnSuccessListener onSuccessListener) {
        return this.f9789d.addOnSuccessListener(activity, onSuccessListener);
    }
}
