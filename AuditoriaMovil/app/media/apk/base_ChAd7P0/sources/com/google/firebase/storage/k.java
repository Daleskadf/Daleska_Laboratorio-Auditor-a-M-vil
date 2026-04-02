package com.google.firebase.storage;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public final class k implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9928a;

    public k(TaskCompletionSource taskCompletionSource) {
        this.f9928a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f9928a.setException(i.b(0, exc));
    }
}
