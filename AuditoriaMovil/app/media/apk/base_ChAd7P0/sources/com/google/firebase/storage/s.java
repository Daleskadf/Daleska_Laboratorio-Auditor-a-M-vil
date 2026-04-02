package com.google.firebase.storage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public final /* synthetic */ class s implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f9943a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Continuation f9944b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9945c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CancellationTokenSource f9946d;

    public /* synthetic */ s(v vVar, Continuation continuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource) {
        this.f9943a = vVar;
        this.f9944b = continuation;
        this.f9945c = taskCompletionSource;
        this.f9946d = cancellationTokenSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Continuation continuation = this.f9944b;
        TaskCompletionSource taskCompletionSource = this.f9945c;
        v vVar = this.f9943a;
        vVar.getClass();
        try {
            Task task2 = (Task) continuation.then(vVar);
            if (!taskCompletionSource.getTask().isComplete()) {
                if (task2 == null) {
                    taskCompletionSource.setException(new NullPointerException("Continuation returned null"));
                    return;
                }
                task2.addOnSuccessListener(new o(0, taskCompletionSource));
                task2.addOnFailureListener(new p(0, taskCompletionSource));
                task2.addOnCanceledListener(new q(this.f9946d));
            }
        } catch (RuntimeExecutionException e7) {
            if (e7.getCause() instanceof Exception) {
                taskCompletionSource.setException((Exception) e7.getCause());
            } else {
                taskCompletionSource.setException(e7);
            }
        } catch (Exception e8) {
            taskCompletionSource.setException(e8);
        }
    }
}
