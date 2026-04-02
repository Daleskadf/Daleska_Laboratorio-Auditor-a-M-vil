package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdg;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfck implements zzfde {
    private final zzfde zza;
    private final zzfde zzb;
    private final zzfis zzc;
    private final String zzd;
    private zzcxx zze;
    private final Executor zzf;

    public zzfck(zzfde zzfdeVar, zzfde zzfdeVar2, zzfis zzfisVar, String str, Executor executor) {
        this.zza = zzfdeVar;
        this.zzb = zzfdeVar2;
        this.zzc = zzfisVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final ListenableFuture zzg(zzfif zzfifVar, zzfdf zzfdfVar) {
        zzcxx zzcxxVar = zzfifVar.zza;
        this.zze = zzcxxVar;
        if (zzfifVar.zzc != null) {
            if (zzcxxVar.zzf() != null) {
                zzfifVar.zzc.zzo().zzl(zzfifVar.zza.zzf());
            }
            return zzgee.zzh(zzfifVar.zzc);
        }
        zzcxxVar.zzb().zzl(zzfifVar.zzb);
        return ((zzfcu) this.zza).zzb(zzfdfVar, null, zzfifVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfde
    /* renamed from: zza */
    public final synchronized zzcxx zzd() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzb(zzfdf zzfdfVar, zzfcj zzfcjVar, zzfdd zzfddVar, zzcxx zzcxxVar, zzfcp zzfcpVar) throws Exception {
        if (zzfcpVar != null) {
            zzfcj zzfcjVar2 = new zzfcj(zzfcjVar.zza, zzfcjVar.zzb, zzfcjVar.zzc, zzfcjVar.zzd, zzfcjVar.zze, zzfcjVar.zzf, zzfcpVar.zza);
            if (zzfcpVar.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzfcjVar2);
                return zzg(zzfcpVar.zzc, zzfdfVar);
            }
            ListenableFuture zza = this.zzc.zza(zzfcjVar2);
            if (zza != null) {
                this.zze = null;
                return zzgee.zzn(zza, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzfcg
                    @Override // com.google.android.gms.internal.ads.zzgdl
                    public final ListenableFuture zza(Object obj) {
                        return zzfck.this.zze((zzfip) obj);
                    }
                }, this.zzf);
            }
            this.zzc.zze(zzfcjVar2);
            zzfdfVar = new zzfdf(zzfdfVar.zzb, zzfcpVar.zzb);
        }
        ListenableFuture zzb = ((zzfcu) this.zza).zzb(zzfdfVar, zzfddVar, zzcxxVar);
        this.zze = zzcxxVar;
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfde
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfdf zzfdfVar, zzfdd zzfddVar, Object obj) {
        return zzf(zzfdfVar, zzfddVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zze(zzfip zzfipVar) throws Exception {
        zzfir zzfirVar;
        if (zzfipVar == null || zzfipVar.zza == null || (zzfirVar = zzfipVar.zzb) == null) {
            throw new zzdyi(1, "Empty prefetch");
        }
        zzbdg.zzb.zzc zzd = zzbdg.zzb.zzd();
        zzbdg.zzb.zza.C0010zza zza = zzbdg.zzb.zza.zza();
        zza.zzf(zzbdg.zzb.zzd.IN_MEMORY);
        zza.zzh(zzbdg.zzb.zze.zzi());
        zzd.zzd(zza);
        zzfipVar.zza.zza.zzb().zzc().zzm(zzd.zzbr());
        return zzg(zzfipVar.zza, ((zzfcj) zzfirVar).zzb);
    }

    public final synchronized ListenableFuture zzf(final zzfdf zzfdfVar, final zzfdd zzfddVar, zzcxx zzcxxVar) {
        zzcxw zza = zzfddVar.zza(zzfdfVar.zzb);
        zza.zza(new zzfcl(this.zzd));
        final zzcxx zzcxxVar2 = (zzcxx) zza.zzh();
        zzcxxVar2.zzg();
        zzcxxVar2.zzg();
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzcxxVar2.zzg().zzd;
        if (zzlVar.zzs == null && zzlVar.zzx == null) {
            zzfgi zzg = zzcxxVar2.zzg();
            final zzfcj zzfcjVar = new zzfcj(zzfddVar, zzfdfVar, zzg.zzd, zzg.zzf, this.zzf, zzg.zzj, null);
            return zzgee.zzn(zzgdv.zzu(((zzfcq) this.zzb).zzb(zzfdfVar, zzfddVar, zzcxxVar2)), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzfch
                @Override // com.google.android.gms.internal.ads.zzgdl
                public final ListenableFuture zza(Object obj) {
                    return zzfck.this.zzb(zzfdfVar, zzfcjVar, zzfddVar, zzcxxVar2, (zzfcp) obj);
                }
            }, this.zzf);
        }
        this.zze = zzcxxVar2;
        return ((zzfcu) this.zza).zzb(zzfdfVar, zzfddVar, zzcxxVar2);
    }
}
