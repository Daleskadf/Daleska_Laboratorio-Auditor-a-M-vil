package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzac extends zzz {
    private zzfi.zze zzg;
    private final /* synthetic */ zzu zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.zzz
    public final int zza() {
        return this.zzg.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.zzz
    public final boolean zzb() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.zzz
    public final boolean zzc() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzu zzuVar, String str, int i, zzfi.zze zzeVar) {
        super(str, i);
        this.zzh = zzuVar;
        this.zzg = zzeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(Long l, Long l2, zzfu.zzn zznVar, boolean z) {
        boolean z2 = zzow.zza() && this.zzh.zze().zzf(this.zza, zzbf.zzbh);
        boolean zzf = this.zzg.zzf();
        boolean zzg = this.zzg.zzg();
        boolean zzh = this.zzg.zzh();
        boolean z3 = zzf || zzg || zzh;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z && !z3) {
            this.zzh.zzj().zzp().zza("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzb), this.zzg.zzi() ? Integer.valueOf(this.zzg.zza()) : null);
            return true;
        }
        zzfi.zzc zzb = this.zzg.zzb();
        boolean zzf2 = zzb.zzf();
        if (zznVar.zzk()) {
            if (!zzb.zzh()) {
                this.zzh.zzj().zzu().zza("No number filter for long property. property", this.zzh.zzi().zzc(zznVar.zzg()));
            } else {
                bool = zza(zza(zznVar.zzc(), zzb.zzc()), zzf2);
            }
        } else if (zznVar.zzi()) {
            if (!zzb.zzh()) {
                this.zzh.zzj().zzu().zza("No number filter for double property. property", this.zzh.zzi().zzc(zznVar.zzg()));
            } else {
                bool = zza(zza(zznVar.zza(), zzb.zzc()), zzf2);
            }
        } else if (zznVar.zzm()) {
            if (!zzb.zzj()) {
                if (!zzb.zzh()) {
                    this.zzh.zzj().zzu().zza("No string or number filter defined. property", this.zzh.zzi().zzc(zznVar.zzg()));
                } else if (zznr.zzb(zznVar.zzh())) {
                    bool = zza(zza(zznVar.zzh(), zzb.zzc()), zzf2);
                } else {
                    this.zzh.zzj().zzu().zza("Invalid user property value for Numeric number filter. property, value", this.zzh.zzi().zzc(zznVar.zzg()), zznVar.zzh());
                }
            } else {
                bool = zza(zza(zznVar.zzh(), zzb.zzd(), this.zzh.zzj()), zzf2);
            }
        } else {
            this.zzh.zzj().zzu().zza("User property has no value, property", this.zzh.zzi().zzc(zznVar.zzg()));
        }
        this.zzh.zzj().zzp().zza("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.zzc = true;
        if (!zzh || bool.booleanValue()) {
            if (!z || this.zzg.zzf()) {
                this.zzd = bool;
            }
            if (bool.booleanValue() && z3 && zznVar.zzl()) {
                long zzd = zznVar.zzd();
                if (l != null) {
                    zzd = l.longValue();
                }
                if (z2 && this.zzg.zzf() && !this.zzg.zzg() && l2 != null) {
                    zzd = l2.longValue();
                }
                if (this.zzg.zzg()) {
                    this.zzf = Long.valueOf(zzd);
                } else {
                    this.zze = Long.valueOf(zzd);
                }
            }
            return true;
        }
        return true;
    }
}
