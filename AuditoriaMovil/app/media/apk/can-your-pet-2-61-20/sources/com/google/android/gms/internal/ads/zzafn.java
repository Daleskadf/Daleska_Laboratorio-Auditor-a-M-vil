package com.google.android.gms.internal.ads;

import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzafn extends zzafs {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzafn(zzaem zzaemVar) {
        super(zzaemVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    protected final boolean zza(zzfo zzfoVar) throws zzafr {
        if (!this.zzc) {
            int zzm = zzfoVar.zzm();
            int i = zzm >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(zzm >> 2) & 3];
                zzak zzakVar = new zzak();
                zzakVar.zzW("audio/mpeg");
                zzakVar.zzy(1);
                zzakVar.zzX(i2);
                this.zza.zzl(zzakVar.zzac());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                zzak zzakVar2 = new zzak();
                zzakVar2.zzW(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zzakVar2.zzy(1);
                zzakVar2.zzX(8000);
                this.zza.zzl(zzakVar2.zzac());
                this.zzd = true;
            } else if (i != 10) {
                throw new zzafr("Audio format not supported: " + i);
            }
            this.zzc = true;
        } else {
            zzfoVar.zzL(1);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    protected final boolean zzb(zzfo zzfoVar, long j) throws zzcc {
        if (this.zze == 2) {
            int zzb2 = zzfoVar.zzb();
            this.zza.zzq(zzfoVar, zzb2);
            this.zza.zzs(j, 1, zzb2, 0, null);
            return true;
        }
        int zzm = zzfoVar.zzm();
        if (zzm != 0 || this.zzd) {
            if (this.zze != 10 || zzm == 1) {
                int zzb3 = zzfoVar.zzb();
                this.zza.zzq(zzfoVar, zzb3);
                this.zza.zzs(j, 1, zzb3, 0, null);
                return true;
            }
            return false;
        }
        int zzb4 = zzfoVar.zzb();
        byte[] bArr = new byte[zzb4];
        zzfoVar.zzG(bArr, 0, zzb4);
        zzaca zza = zzacb.zza(bArr);
        zzak zzakVar = new zzak();
        zzakVar.zzW("audio/mp4a-latm");
        zzakVar.zzz(zza.zzc);
        zzakVar.zzy(zza.zzb);
        zzakVar.zzX(zza.zza);
        zzakVar.zzL(Collections.singletonList(bArr));
        this.zza.zzl(zzakVar.zzac());
        this.zzd = true;
        return false;
    }
}
