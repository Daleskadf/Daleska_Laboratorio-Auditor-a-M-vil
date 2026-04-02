package com.google.firebase.storage;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
/* loaded from: classes.dex */
public final /* synthetic */ class o implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9934a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9935b;

    public /* synthetic */ o(int i7, TaskCompletionSource taskCompletionSource) {
        this.f9934a = i7;
        this.f9935b = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.f9934a) {
            case 0:
                this.f9935b.setResult(obj);
                return;
            default:
                this.f9935b.setResult((Map) obj);
                return;
        }
    }
}
