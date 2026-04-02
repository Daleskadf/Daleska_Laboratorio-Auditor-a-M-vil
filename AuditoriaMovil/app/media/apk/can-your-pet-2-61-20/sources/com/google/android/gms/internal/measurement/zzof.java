package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzof implements zzoc {
    private static final zzhh<Boolean> zza;
    private static final zzhh<Boolean> zzb;
    private static final zzhh<Boolean> zzc;
    private static final zzhh<Long> zzd;

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final long zza() {
        return zzd.zza().longValue();
    }

    static {
        zzhp zza2 = new zzhp(zzhi.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.client.consent_state_v1", true);
        zzb = zza2.zza("measurement.client.3p_consent_state_v1", true);
        zzc = zza2.zza("measurement.service.consent_state_v1_W36", true);
        zzd = zza2.zza("measurement.service.storage_consent_support_version", 203600L);
    }
}
