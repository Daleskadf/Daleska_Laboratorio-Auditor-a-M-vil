package com.google.android.gms.internal.mlkit_vision_barcode;
/* loaded from: classes.dex */
public final class zzqb {
    private Long zza;
    private Long zzb;
    private Long zzc;
    private Long zzd;
    private Long zze;
    private Long zzf;

    public final zzqb zza(Long l8) {
        this.zzc = Long.valueOf(l8.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzb(Long l8) {
        this.zzd = Long.valueOf(l8.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzc(Long l8) {
        this.zza = Long.valueOf(l8.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzd(Long l8) {
        this.zze = Long.valueOf(l8.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zze(Long l8) {
        this.zzb = Long.valueOf(l8.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzf(Long l8) {
        this.zzf = Long.valueOf(l8.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqd zzg() {
        return new zzqd(this, null);
    }
}
