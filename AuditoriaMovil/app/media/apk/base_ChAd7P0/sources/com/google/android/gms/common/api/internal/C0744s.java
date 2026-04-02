package com.google.android.gms.common.api.internal;

import java.util.concurrent.TimeUnit;
/* renamed from: com.google.android.gms.common.api.internal.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0744s extends com.google.android.gms.common.api.r {

    /* renamed from: a  reason: collision with root package name */
    public final BasePendingResult f9272a;

    public C0744s(BasePendingResult basePendingResult) {
        this.f9272a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.r
    public final com.google.android.gms.common.api.t await(long j, TimeUnit timeUnit) {
        return this.f9272a.await(0L, timeUnit);
    }
}
