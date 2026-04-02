package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.common.api.internal.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0750y extends BasePendingResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9279a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0750y(com.google.android.gms.common.api.o oVar, int i7) {
        super(oVar);
        this.f9279a = i7;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final com.google.android.gms.common.api.t createFailedResult(Status status) {
        switch (this.f9279a) {
            case 0:
                return status;
            default:
                throw new UnsupportedOperationException("Creating failed results is not supported");
        }
    }
}
