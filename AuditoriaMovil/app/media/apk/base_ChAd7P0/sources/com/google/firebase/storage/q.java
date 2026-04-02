package com.google.firebase.storage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCanceledListener;
/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnCanceledListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CancellationTokenSource f9938a;

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f9938a.cancel();
    }
}
