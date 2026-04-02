package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class at {

    /* renamed from: a  reason: collision with root package name */
    private final w3.i f9513a;

    /* renamed from: b  reason: collision with root package name */
    private final w3.i f9514b;

    public at(w3.i iVar, w3.i iVar2) {
        this.f9513a = iVar;
        this.f9514b = iVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, w3.d dVar) {
        Object a7 = this.f9513a.a();
        a7.getClass();
        k kVar = (k) this.f9514b.a();
        kVar.getClass();
        activity.getClass();
        dVar.getClass();
        return new as((Context) a7, kVar, activity, taskCompletionSource, dVar);
    }
}
