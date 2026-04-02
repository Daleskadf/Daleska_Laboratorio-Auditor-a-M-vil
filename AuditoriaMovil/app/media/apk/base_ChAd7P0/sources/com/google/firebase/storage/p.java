package com.google.firebase.storage;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public final /* synthetic */ class p implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9936a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9937b;

    public /* synthetic */ p(int i7, TaskCompletionSource taskCompletionSource) {
        this.f9936a = i7;
        this.f9937b = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.f9936a) {
            case 0:
                this.f9937b.setException(exc);
                return;
            default:
                this.f9937b.setException(exc);
                return;
        }
    }
}
