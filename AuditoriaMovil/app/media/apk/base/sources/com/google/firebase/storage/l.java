package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public final class l implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9929a;

    public l(TaskCompletionSource taskCompletionSource) {
        this.f9929a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        y yVar = (y) obj;
        TaskCompletionSource taskCompletionSource = this.f9929a;
        if (!taskCompletionSource.getTask().isComplete()) {
            Log.e("StorageReference", "getBytes 'succeeded', but failed to set a Result.");
            taskCompletionSource.setException(i.a(Status.f9149X));
        }
    }
}
