package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC0731e;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.t;
import p3.AbstractC1661a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzae extends AbstractC0731e {
    public zzae(o oVar) {
        super(AbstractC1661a.f15082a, oVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ t createFailedResult(Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.InterfaceC0732f
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzae) ((t) obj));
    }
}
