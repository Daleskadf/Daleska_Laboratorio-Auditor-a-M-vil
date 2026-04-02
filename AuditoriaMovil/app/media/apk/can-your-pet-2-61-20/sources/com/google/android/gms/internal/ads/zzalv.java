package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.zip.Inflater;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzalv implements zzalh {
    private final zzfo zza = new zzfo();
    private final zzfo zzb = new zzfo();
    private final zzalu zzc = new zzalu();
    private Inflater zzd;

    @Override // com.google.android.gms.internal.ads.zzalh
    public final void zza(byte[] bArr, int i, int i2, zzalg zzalgVar, zzep zzepVar) {
        this.zza.zzI(bArr, i2 + i);
        this.zza.zzK(i);
        zzfo zzfoVar = this.zza;
        if (zzfoVar.zzb() > 0 && zzfoVar.zzf() == 120) {
            if (this.zzd == null) {
                this.zzd = new Inflater();
            }
            if (zzfx.zzI(zzfoVar, this.zzb, this.zzd)) {
                zzfo zzfoVar2 = this.zzb;
                zzfoVar.zzI(zzfoVar2.zzM(), zzfoVar2.zze());
            }
        }
        this.zzc.zze();
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzfo zzfoVar3 = this.zza;
            if (zzfoVar3.zzb() >= 3) {
                zzalu zzaluVar = this.zzc;
                int zze = zzfoVar3.zze();
                int zzm = zzfoVar3.zzm();
                int zzq = zzfoVar3.zzq();
                int zzd = zzfoVar3.zzd() + zzq;
                zzec zzecVar = null;
                if (zzd > zze) {
                    zzfoVar3.zzK(zze);
                } else {
                    if (zzm == 128) {
                        zzec zza = zzaluVar.zza();
                        zzaluVar.zze();
                        zzecVar = zza;
                    } else {
                        switch (zzm) {
                            case 20:
                                zzalu.zzd(zzaluVar, zzfoVar3, zzq);
                                break;
                            case 21:
                                zzalu.zzb(zzaluVar, zzfoVar3, zzq);
                                break;
                            case 22:
                                zzalu.zzc(zzaluVar, zzfoVar3, zzq);
                                break;
                        }
                    }
                    zzfoVar3.zzK(zzd);
                }
                if (zzecVar != null) {
                    arrayList.add(zzecVar);
                }
            } else {
                zzepVar.zza(new zzakz(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
        }
    }
}
