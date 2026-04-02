package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC0731e;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.t;
import p3.r;
/* loaded from: classes.dex */
abstract class zzcy extends AbstractC0731e {
    public zzcy(o oVar) {
        super(zzbi.zzb, oVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ t createFailedResult(Status status) {
        return new r(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.InterfaceC0732f
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzcy) ((t) obj));
    }
}
