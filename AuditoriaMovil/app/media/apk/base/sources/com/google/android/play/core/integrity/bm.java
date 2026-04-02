package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
abstract class bm extends w3.z {
    final /* synthetic */ bn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f = bnVar;
    }

    @Override // w3.z
    public final void a(Exception exc) {
        if (!(exc instanceof w3.e)) {
            super.a(exc);
        } else if (bn.k(this.f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
