package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzi extends zzp {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzi(zzm zzmVar, GoogleApiClient googleApiClient, String str, String str2, zzbq zzbqVar) {
        super(googleApiClient);
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.cast.zzp, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.cast.internal.zzw zzwVar) {
        doExecute(zzwVar);
    }

    @Override // com.google.android.gms.cast.zzp
    public final void zza(com.google.android.gms.cast.internal.zzw zzwVar) {
        try {
            zzwVar.zzL(this.zza, this.zzb, null, this);
        } catch (IllegalStateException unused) {
            zzc(CastStatusCodes.INVALID_REQUEST);
        }
    }
}
