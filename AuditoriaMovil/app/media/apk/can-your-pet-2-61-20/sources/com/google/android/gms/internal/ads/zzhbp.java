package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhbp implements zzhcg {
    private final zzhbl zza;
    private final zzhcx zzb;
    private final boolean zzc;
    private final zzgzg zzd;

    private zzhbp(zzhcx zzhcxVar, zzgzg zzgzgVar, zzhbl zzhblVar) {
        this.zzb = zzhcxVar;
        this.zzc = zzgzgVar.zzi(zzhblVar);
        this.zzd = zzgzgVar;
        this.zza = zzhblVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhbp zzc(zzhcx zzhcxVar, zzgzg zzgzgVar, zzhbl zzhblVar) {
        return new zzhbp(zzhcxVar, zzgzgVar, zzhblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final int zza(Object obj) {
        zzhcx zzhcxVar = this.zzb;
        int zzb = zzhcxVar.zzb(zzhcxVar.zzd(obj));
        return this.zzc ? zzb + this.zzd.zzb(obj).zzd() : zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zzb(obj).zza.hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final Object zze() {
        zzhbl zzhblVar = this.zza;
        return zzhblVar instanceof zzgzv ? ((zzgzv) zzhblVar).zzbj() : zzhblVar.zzcY().zzbs();
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zzf(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final void zzg(Object obj, Object obj2) {
        zzhci.zzr(this.zzb, obj, obj2);
        if (this.zzc) {
            zzhci.zzq(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final void zzh(Object obj, zzhby zzhbyVar, zzgzf zzgzfVar) throws IOException {
        boolean zzQ;
        zzhcx zzhcxVar = this.zzb;
        Object zzc = zzhcxVar.zzc(obj);
        zzgzg zzgzgVar = this.zzd;
        zzgzk zzc2 = zzgzgVar.zzc(obj);
        while (zzhbyVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzhbyVar.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zzd2 = zzgzgVar.zzd(zzgzfVar, this.zza, zzd >>> 3);
                        if (zzd2 != null) {
                            zzgzgVar.zzg(zzhbyVar, zzd2, zzgzfVar, zzc2);
                        } else {
                            zzQ = zzhcxVar.zzp(zzc, zzhbyVar);
                        }
                    } else {
                        zzQ = zzhbyVar.zzQ();
                    }
                    if (!zzQ) {
                        break;
                    }
                } else {
                    Object obj2 = null;
                    zzgyj zzgyjVar = null;
                    int i = 0;
                    while (zzhbyVar.zzc() != Integer.MAX_VALUE) {
                        int zzd3 = zzhbyVar.zzd();
                        if (zzd3 == 16) {
                            i = zzhbyVar.zzj();
                            obj2 = zzgzgVar.zzd(zzgzfVar, this.zza, i);
                        } else if (zzd3 == 26) {
                            if (obj2 != null) {
                                zzgzgVar.zzg(zzhbyVar, obj2, zzgzfVar, zzc2);
                            } else {
                                zzgyjVar = zzhbyVar.zzp();
                            }
                        } else if (!zzhbyVar.zzQ()) {
                            break;
                        }
                    }
                    if (zzhbyVar.zzd() != 12) {
                        throw zzhak.zzb();
                    } else if (zzgyjVar != null) {
                        if (obj2 != null) {
                            zzgzgVar.zzh(zzgyjVar, obj2, zzgzfVar, zzc2);
                        } else {
                            zzhcxVar.zzk(zzc, i, zzgyjVar);
                        }
                    }
                }
            } finally {
                zzhcxVar.zzn(obj, zzc);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgxv zzgxvVar) throws IOException {
        zzgzv zzgzvVar = (zzgzv) obj;
        if (zzgzvVar.zzt == zzhcy.zzc()) {
            zzgzvVar.zzt = zzhcy.zzf();
        }
        zzgzr zzgzrVar = (zzgzr) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final boolean zzj(Object obj, Object obj2) {
        zzhcx zzhcxVar = this.zzb;
        if (zzhcxVar.zzd(obj).equals(zzhcxVar.zzd(obj2))) {
            if (this.zzc) {
                return this.zzd.zzb(obj).equals(this.zzd.zzb(obj2));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final boolean zzk(Object obj) {
        return this.zzd.zzb(obj).zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final void zzm(Object obj, zzgzb zzgzbVar) throws IOException {
        Iterator zzg = this.zzd.zzb(obj).zzg();
        while (zzg.hasNext()) {
            Map.Entry entry = (Map.Entry) zzg.next();
            zzgzj zzgzjVar = (zzgzj) entry.getKey();
            if (zzgzjVar.zze() != zzhdo.MESSAGE || zzgzjVar.zzg() || zzgzjVar.zzf()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzhao) {
                zzgzbVar.zzw(zzgzjVar.zza(), ((zzhao) entry).zza().zzb());
            } else {
                zzgzbVar.zzw(zzgzjVar.zza(), entry.getValue());
            }
        }
        zzhcx zzhcxVar = this.zzb;
        zzhcxVar.zzr(zzhcxVar.zzd(obj), zzgzbVar);
    }
}
