package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzos implements zzot {
    private static final zzhh<Boolean> zza;
    private static final zzhh<Boolean> zzb;
    private static final zzhh<Boolean> zzc;

    static {
        zzhp zza2 = new zzhp(zzhi.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.collection.event_safelist", true);
        zzb = zza2.zza("measurement.service.store_null_safelist", true);
        zzc = zza2.zza("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzot
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzot
    public final boolean zzb() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzot
    public final boolean zzc() {
        return zzc.zza().booleanValue();
    }
}
