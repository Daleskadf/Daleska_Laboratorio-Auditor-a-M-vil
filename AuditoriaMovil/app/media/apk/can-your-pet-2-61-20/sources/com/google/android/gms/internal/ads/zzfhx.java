package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbdg;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfhx implements zzfhw {
    private final ConcurrentHashMap zza;
    private final zzfid zzb;
    private final zzfhz zzc = new zzfhz();

    public zzfhx(zzfid zzfidVar) {
        this.zza = new ConcurrentHashMap(zzfidVar.zzd);
        this.zzb = zzfidVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfid> creator = zzfid.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgv)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfig) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzfhv) entry.getValue()).zzb(); i2++) {
                    sb.append("[O]");
                }
                for (int zzb = ((zzfhv) entry.getValue()).zzb(); zzb < this.zzb.zzd; zzb++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfhv) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < this.zzb.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            com.google.android.gms.ads.internal.util.client.zzm.zze(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhw
    public final zzfid zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfhw
    public final synchronized zzfif zzb(zzfig zzfigVar) {
        zzfif zzfifVar;
        zzfhv zzfhvVar = (zzfhv) this.zza.get(zzfigVar);
        if (zzfhvVar != null) {
            zzfifVar = zzfhvVar.zze();
            if (zzfifVar == null) {
                this.zzc.zze();
            }
            zzfit zzf = zzfhvVar.zzf();
            if (zzfifVar != null) {
                zzbdg.zzb.zzc zzd = zzbdg.zzb.zzd();
                zzbdg.zzb.zza.C0010zza zza = zzbdg.zzb.zza.zza();
                zza.zzf(zzbdg.zzb.zzd.IN_MEMORY);
                zzbdg.zzb.zze.zza zzc = zzbdg.zzb.zze.zzc();
                zzc.zzd(zzf.zza);
                zzc.zze(zzf.zzb);
                zza.zzg(zzc);
                zzd.zzd(zza);
                zzfifVar.zza.zzb().zzc().zzi(zzd.zzbr());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzfifVar = null;
        }
        return zzfifVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhw
    @Deprecated
    public final zzfig zzc(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, com.google.android.gms.ads.internal.client.zzw zzwVar) {
        return new zzfih(zzlVar, str, new zzbxh(this.zzb.zza).zza().zzk, this.zzb.zzf, zzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfhw
    public final synchronized boolean zzd(zzfig zzfigVar, zzfif zzfifVar) {
        boolean zzh;
        zzfhv zzfhvVar = (zzfhv) this.zza.get(zzfigVar);
        zzfifVar.zzd = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
        if (zzfhvVar == null) {
            zzfid zzfidVar = this.zzb;
            zzfhv zzfhvVar2 = new zzfhv(zzfidVar.zzd, zzfidVar.zze * 1000);
            if (this.zza.size() == this.zzb.zzc) {
                int i = this.zzb.zzg;
                int i2 = i - 1;
                zzfig zzfigVar2 = null;
                if (i == 0) {
                    throw null;
                }
                long j = Long.MAX_VALUE;
                if (i2 == 0) {
                    for (Map.Entry entry : this.zza.entrySet()) {
                        if (((zzfhv) entry.getValue()).zzc() < j) {
                            j = ((zzfhv) entry.getValue()).zzc();
                            zzfigVar2 = (zzfig) entry.getKey();
                        }
                    }
                    if (zzfigVar2 != null) {
                        this.zza.remove(zzfigVar2);
                    }
                } else if (i2 == 1) {
                    for (Map.Entry entry2 : this.zza.entrySet()) {
                        if (((zzfhv) entry2.getValue()).zzd() < j) {
                            j = ((zzfhv) entry2.getValue()).zzd();
                            zzfigVar2 = (zzfig) entry2.getKey();
                        }
                    }
                    if (zzfigVar2 != null) {
                        this.zza.remove(zzfigVar2);
                    }
                } else if (i2 == 2) {
                    int i3 = Integer.MAX_VALUE;
                    for (Map.Entry entry3 : this.zza.entrySet()) {
                        if (((zzfhv) entry3.getValue()).zza() < i3) {
                            i3 = ((zzfhv) entry3.getValue()).zza();
                            zzfigVar2 = (zzfig) entry3.getKey();
                        }
                    }
                    if (zzfigVar2 != null) {
                        this.zza.remove(zzfigVar2);
                    }
                }
                this.zzc.zzg();
            }
            this.zza.put(zzfigVar, zzfhvVar2);
            this.zzc.zzd();
            zzfhvVar = zzfhvVar2;
        }
        zzh = zzfhvVar.zzh(zzfifVar);
        this.zzc.zzc();
        zzfhy zza = this.zzc.zza();
        zzfit zzf = zzfhvVar.zzf();
        if (zzfifVar != null) {
            zzbdg.zzb.zzc zzd = zzbdg.zzb.zzd();
            zzbdg.zzb.zza.C0010zza zza2 = zzbdg.zzb.zza.zza();
            zza2.zzf(zzbdg.zzb.zzd.IN_MEMORY);
            zzbdg.zzb.zzg.zza zzc = zzbdg.zzb.zzg.zzc();
            zzc.zze(zza.zza);
            zzc.zzf(zza.zzb);
            zzc.zzg(zzf.zzb);
            zza2.zzi(zzc);
            zzd.zzd(zza2);
            zzfifVar.zza.zzb().zzc().zzj(zzd.zzbr());
        }
        zzf();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfhw
    public final synchronized boolean zze(zzfig zzfigVar) {
        zzfhv zzfhvVar = (zzfhv) this.zza.get(zzfigVar);
        if (zzfhvVar != null) {
            return zzfhvVar.zzb() < this.zzb.zzd;
        }
        return true;
    }
}
