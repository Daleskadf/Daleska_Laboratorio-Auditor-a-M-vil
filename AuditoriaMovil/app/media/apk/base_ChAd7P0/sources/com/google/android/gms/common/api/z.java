package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
/* loaded from: classes.dex */
public final class z extends BasePendingResult {

    /* renamed from: a  reason: collision with root package name */
    public final Status f9289a;

    public z(Status status) {
        super(null);
        this.f9289a = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final t createFailedResult(Status status) {
        return this.f9289a;
    }
}
