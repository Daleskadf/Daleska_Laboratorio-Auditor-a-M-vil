package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class bt {

    /* renamed from: a  reason: collision with root package name */
    private final bn f9566a;

    public bt(bn bnVar) {
        this.f9566a = bnVar;
    }

    public final /* synthetic */ Task a(long j, long j8, int i7, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f9566a.d(standardIntegrityTokenRequest.a(), j, j8, 0);
    }
}
