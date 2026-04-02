package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzqo implements zzqp {
    private static final zzhh<Boolean> zza;
    private static final zzhh<Boolean> zzb;
    private static final zzhh<Boolean> zzc;
    private static final zzhh<Boolean> zzd;
    private static final zzhh<Boolean> zze;
    private static final zzhh<Boolean> zzf;
    private static final zzhh<Long> zzg;
    private static final zzhh<Long> zzh;

    static {
        zzhp zza2 = new zzhp(zzhi.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.client.sessions.background_sessions_enabled", true);
        zzb = zza2.zza("measurement.client.sessions.enable_fix_background_engagement", false);
        zzc = zza2.zza("measurement.client.sessions.immediate_start_enabled_foreground", true);
        zzd = zza2.zza("measurement.client.sessions.enable_pause_engagement_in_background", false);
        zze = zza2.zza("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        zzf = zza2.zza("measurement.client.sessions.session_id_enabled", true);
        zzg = zza2.zza("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
        zzh = zza2.zza("measurement.id.client.sessions.enable_pause_engagement_in_background", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final boolean zza() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final boolean zzb() {
        return zzd.zza().booleanValue();
    }
}
