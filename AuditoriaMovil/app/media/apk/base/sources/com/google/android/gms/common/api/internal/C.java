package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
/* loaded from: classes.dex */
public final class C implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9164a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ D f9165b;

    public C(D d7, TaskCompletionSource taskCompletionSource) {
        this.f9165b = d7;
        this.f9164a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        ((Map) this.f9165b.f9167b).remove(this.f9164a);
    }
}
