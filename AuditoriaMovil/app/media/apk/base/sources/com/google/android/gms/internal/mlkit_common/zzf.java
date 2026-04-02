package com.google.android.gms.internal.mlkit_common;
/* loaded from: classes.dex */
public final class zzf {
    private final zzac zza = new zzac();
    private Boolean zzb;

    private zzf() {
    }

    public final zzf zza(zzk zzkVar) {
        zzt.zzc(this.zzb, "Must call internal() or external() before appending rules.");
        this.zza.zzb(zzkVar);
        return this;
    }

    public final zzf zzb() {
        boolean z7;
        if (this.zzb == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        zzt.zze(z7, "A SourcePolicy can only set internal() or external() once.");
        this.zzb = Boolean.FALSE;
        return this;
    }

    public final zzf zzc() {
        boolean z7;
        if (this.zzb == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        zzt.zze(z7, "A SourcePolicy can only set internal() or external() once.");
        this.zzb = Boolean.TRUE;
        return this;
    }

    public final zzh zzd() {
        zzt.zzc(this.zzb, "Must call internal() or external() when building a SourcePolicy.");
        return new zzh(this.zzb.booleanValue(), false, this.zza.zzc(), null);
    }

    public /* synthetic */ zzf(zze zzeVar) {
    }
}
