package com.google.android.gms.measurement.internal;

import java.util.List;
/* loaded from: classes.dex */
final class zzfg implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzfi zza;

    public zzfg(zzfi zzfiVar) {
        this.zza = zzfiVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i10, String str, List list, boolean z10, boolean z11) {
        zzef zzc;
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        zzc = this.zza.zzt.zzay().zzi();
                    } else if (z10) {
                        zzc = this.zza.zzt.zzay().zzm();
                    } else if (!z11) {
                        zzc = this.zza.zzt.zzay().zzl();
                    } else {
                        zzc = this.zza.zzt.zzay().zzk();
                    }
                } else {
                    zzc = this.zza.zzt.zzay().zzj();
                }
            } else if (z10) {
                zzc = this.zza.zzt.zzay().zzh();
            } else if (!z11) {
                zzc = this.zza.zzt.zzay().zze();
            } else {
                zzc = this.zza.zzt.zzay().zzd();
            }
        } else {
            zzc = this.zza.zzt.zzay().zzc();
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    zzc.zza(str);
                    return;
                } else {
                    zzc.zzd(str, list.get(0), list.get(1), list.get(2));
                    return;
                }
            }
            zzc.zzc(str, list.get(0), list.get(1));
            return;
        }
        zzc.zzb(str, list.get(0));
    }
}
