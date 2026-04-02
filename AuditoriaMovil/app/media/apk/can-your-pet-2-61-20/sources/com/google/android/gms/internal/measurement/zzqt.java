package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzqt implements zzqq {
    private static final zzhh<Boolean> zza;
    private static final zzhh<Boolean> zzb;
    private static final zzhh<Long> zzc;

    static {
        zzhp zza2 = new zzhp(zzhi.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.sgtm.preview_mode_enabled", false);
        zzb = zza2.zza("measurement.sgtm.service", false);
        zzc = zza2.zza("measurement.id.sgtm", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzqq
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqq
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqq
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }
}
