package com.google.android.recaptcha.internal;

import F6.K;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public final class zzas {
    public static final Task zza(K k2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        k2.invokeOnCompletion(new zzar(taskCompletionSource, k2));
        return taskCompletionSource.getTask();
    }
}
