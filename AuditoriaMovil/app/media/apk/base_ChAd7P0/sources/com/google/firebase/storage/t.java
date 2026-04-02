package com.google.firebase.storage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public final /* synthetic */ class t implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SuccessContinuation f9947a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9948b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CancellationTokenSource f9949c;

    public /* synthetic */ t(SuccessContinuation successContinuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource) {
        this.f9947a = successContinuation;
        this.f9948b = taskCompletionSource;
        this.f9949c = cancellationTokenSource;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        SuccessContinuation successContinuation = this.f9947a;
        TaskCompletionSource taskCompletionSource = this.f9948b;
        try {
            Task then = successContinuation.then((u) obj);
            then.addOnSuccessListener(new o(0, taskCompletionSource));
            then.addOnFailureListener(new p(0, taskCompletionSource));
            then.addOnCanceledListener(new q(this.f9949c));
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
