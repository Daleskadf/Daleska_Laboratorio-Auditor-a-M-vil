package com.google.android.gms.measurement.internal;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzhf implements com.google.android.gms.internal.measurement.zzv {
    private final /* synthetic */ zzgz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhf(zzgz zzgzVar) {
        this.zza = zzgzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public final void zza(com.google.android.gms.internal.measurement.zzs zzsVar, String str, List<String> list, boolean z, boolean z2) {
        zzgb zzc;
        int i = zzhh.zza[zzsVar.ordinal()];
        if (i == 1) {
            zzc = this.zza.zzj().zzc();
        } else if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    zzc = this.zza.zzj().zzp();
                } else {
                    zzc = this.zza.zzj().zzn();
                }
            } else if (z) {
                zzc = this.zza.zzj().zzw();
            } else if (!z2) {
                zzc = this.zza.zzj().zzv();
            } else {
                zzc = this.zza.zzj().zzu();
            }
        } else if (z) {
            zzc = this.zza.zzj().zzm();
        } else if (!z2) {
            zzc = this.zza.zzj().zzh();
        } else {
            zzc = this.zza.zzj().zzg();
        }
        int size = list.size();
        if (size == 1) {
            zzc.zza(str, list.get(0));
        } else if (size == 2) {
            zzc.zza(str, list.get(0), list.get(1));
        } else if (size == 3) {
            zzc.zza(str, list.get(0), list.get(1), list.get(2));
        } else {
            zzc.zza(str);
        }
    }
}
