package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.I;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzft {
    private final zzrb zza;
    private final Boolean zzc;
    private final zzvz zze;
    private final zzcs zzf;
    private final zzcs zzg;
    private final Boolean zzb = null;
    private final zzqk zzd = null;

    public /* synthetic */ zzft(zzfr zzfrVar, zzfs zzfsVar) {
        this.zza = zzfr.zzi(zzfrVar);
        this.zzc = zzfr.zzk(zzfrVar);
        this.zze = zzfr.zzj(zzfrVar);
        this.zzf = zzfr.zza(zzfrVar);
        this.zzg = zzfr.zzb(zzfrVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzft)) {
            return false;
        }
        zzft zzftVar = (zzft) obj;
        if (I.m(this.zza, zzftVar.zza) && I.m(null, null) && I.m(this.zzc, zzftVar.zzc) && I.m(null, null) && I.m(this.zze, zzftVar.zze) && I.m(this.zzf, zzftVar.zzf) && I.m(this.zzg, zzftVar.zzg)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, null, this.zzc, null, this.zze, this.zzf, this.zzg});
    }

    @zzfe(zza = 6)
    public final zzcs zza() {
        return this.zzf;
    }

    @zzfe(zza = 7)
    public final zzcs zzb() {
        return this.zzg;
    }

    @zzfe(zza = 1)
    public final zzrb zzc() {
        return this.zza;
    }

    @zzfe(zza = 5)
    public final zzvz zzd() {
        return this.zze;
    }

    @zzfe(zza = 3)
    public final Boolean zze() {
        return this.zzc;
    }
}
