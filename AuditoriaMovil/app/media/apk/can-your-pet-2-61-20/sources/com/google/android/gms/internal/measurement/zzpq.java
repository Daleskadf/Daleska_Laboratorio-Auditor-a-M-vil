package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzpq implements zzpr {
    private static final zzhh<Boolean> zza;
    private static final zzhh<Boolean> zzb;
    private static final zzhh<Boolean> zzc;
    private static final zzhh<Long> zzd;

    static {
        zzhp zza2 = new zzhp(zzhi.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.sdk.collection.enable_extend_user_property_size", true);
        zzb = zza2.zza("measurement.sdk.collection.last_deep_link_referrer2", true);
        zzc = zza2.zza("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        zzd = zza2.zza("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzpr
    public final boolean zza() {
        return zzc.zza().booleanValue();
    }
}
