package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzqn implements zzqk {
    private static final zzhh<Boolean> zza;
    private static final zzhh<Boolean> zzb;
    private static final zzhh<Boolean> zzc;
    private static final zzhh<Boolean> zzd;

    static {
        zzhp zza2 = new zzhp(zzhi.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.collection.enable_session_stitching_token.client.dev", true);
        zzb = zza2.zza("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        zzc = zza2.zza("measurement.session_stitching_token_enabled", false);
        zzd = zza2.zza("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzqk
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqk
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqk
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqk
    public final boolean zzd() {
        return zzc.zza().booleanValue();
    }
}
