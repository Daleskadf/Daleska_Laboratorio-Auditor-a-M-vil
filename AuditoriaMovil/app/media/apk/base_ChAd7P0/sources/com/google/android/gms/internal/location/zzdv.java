package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C0742p;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import p3.E;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdv extends E {
    private final zzdr zza;

    public zzdv(zzdr zzdrVar) {
        super("com.google.android.gms.location.ILocationCallback");
        this.zza = zzdrVar;
    }

    public final zzdv zzc(C0742p c0742p) {
        this.zza.zzb(c0742p);
        return this;
    }

    @Override // p3.F
    public final void zzd(LocationResult locationResult) {
        this.zza.zza().b(new zzds(this, locationResult));
    }

    @Override // p3.F
    public final void zze(LocationAvailability locationAvailability) {
        this.zza.zza().b(new zzdt(this, locationAvailability));
    }

    @Override // p3.F
    public final void zzf() {
        this.zza.zza().b(new zzdu(this));
    }

    public final void zzg() {
        this.zza.zza().a();
    }

    public final /* synthetic */ zzdr zzh() {
        return this.zza;
    }
}
