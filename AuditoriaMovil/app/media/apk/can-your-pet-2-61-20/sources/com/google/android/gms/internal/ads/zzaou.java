package com.google.android.gms.internal.ads;

import android.util.SparseArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaou implements zzaon {
    final /* synthetic */ zzaow zza;
    private final zzfn zzb = new zzfn(new byte[4], 4);

    public zzaou(zzaow zzaowVar) {
        this.zza = zzaowVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza(zzfo zzfoVar) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i;
        if (zzfoVar.zzm() == 0 && (zzfoVar.zzm() & 128) != 0) {
            zzfoVar.zzL(6);
            int zzb = zzfoVar.zzb() / 4;
            for (int i2 = 0; i2 < zzb; i2++) {
                zzfoVar.zzF(this.zzb, 4);
                zzfn zzfnVar = this.zzb;
                int zzd = zzfnVar.zzd(16);
                zzfnVar.zzm(3);
                if (zzd == 0) {
                    this.zzb.zzm(13);
                } else {
                    int zzd2 = this.zzb.zzd(13);
                    sparseArray2 = this.zza.zzg;
                    if (sparseArray2.get(zzd2) == null) {
                        zzaow zzaowVar = this.zza;
                        sparseArray3 = zzaowVar.zzg;
                        sparseArray3.put(zzd2, new zzaoo(new zzaov(zzaowVar, zzd2)));
                        zzaow zzaowVar2 = this.zza;
                        i = zzaowVar2.zzm;
                        zzaowVar2.zzm = i + 1;
                    }
                }
            }
            sparseArray = this.zza.zzg;
            sparseArray.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzfv zzfvVar, zzadi zzadiVar, zzapa zzapaVar) {
    }
}
