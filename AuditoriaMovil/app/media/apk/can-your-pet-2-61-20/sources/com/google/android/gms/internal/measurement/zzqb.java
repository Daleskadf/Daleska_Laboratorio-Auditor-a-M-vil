package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzqb implements zzpy {
    private static final zzhh<Boolean> zza;
    private static final zzhh<Boolean> zzb;
    private static final zzhh<Boolean> zzc;
    private static final zzhh<Boolean> zzd;
    private static final zzhh<Boolean> zze;
    private static final zzhh<Boolean> zzf;
    private static final zzhh<Boolean> zzg;
    private static final zzhh<Long> zzh;
    private static final zzhh<Boolean> zzi;

    static {
        zzhp zza2 = new zzhp(zzhi.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.rb.attribution.client2", true);
        zzb = zza2.zza("measurement.rb.attribution.dma_fix", true);
        zzc = zza2.zza("measurement.rb.attribution.followup1.service", false);
        zzd = zza2.zza("measurement.rb.attribution.index_out_of_bounds_fix", false);
        zze = zza2.zza("measurement.rb.attribution.service", true);
        zzf = zza2.zza("measurement.rb.attribution.enable_trigger_redaction", true);
        zzg = zza2.zza("measurement.rb.attribution.uuid_generation", true);
        zzh = zza2.zza("measurement.id.rb.attribution.index_out_of_bounds_fix", 0L);
        zzi = zza2.zza("measurement.rb.attribution.improved_retry", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzpy
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpy
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpy
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpy
    public final boolean zzd() {
        return zzc.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpy
    public final boolean zze() {
        return zzd.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpy
    public final boolean zzf() {
        return zze.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpy
    public final boolean zzg() {
        return zzf.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpy
    public final boolean zzh() {
        return zzg.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpy
    public final boolean zzi() {
        return zzi.zza().booleanValue();
    }
}
