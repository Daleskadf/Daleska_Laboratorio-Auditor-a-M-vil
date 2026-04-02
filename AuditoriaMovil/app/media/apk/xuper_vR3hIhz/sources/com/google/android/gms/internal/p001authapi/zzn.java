package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.internal.auth-api.zzn  reason: invalid package */
/* loaded from: classes.dex */
final class zzn extends zzp<Status> {
    public zzn(zzi zziVar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    @Override // com.google.android.gms.internal.p001authapi.zzp
    public final void zzc(Context context, zzw zzwVar) {
        zzwVar.zzc(new zzo(this));
    }
}
