package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzfav implements zzeoq {
    protected final zzcik zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzfbl zzd;
    private final zzfde zze;
    private final VersionInfoParcel zzf;
    private final ViewGroup zzg;
    private final zzflk zzh;
    private final zzfgg zzi;
    @Nullable
    private ListenableFuture zzj;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzfav(Context context, Executor executor, zzcik zzcikVar, zzfde zzfdeVar, zzfbl zzfblVar, zzfgg zzfggVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcikVar;
        this.zze = zzfdeVar;
        this.zzd = zzfblVar;
        this.zzi = zzfggVar;
        this.zzf = versionInfoParcel;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcikVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzcxw zzm(zzfdc zzfdcVar) {
        zzfau zzfauVar = (zzfau) zzfdcVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzif)).booleanValue()) {
            zzcrj zzcrjVar = new zzcrj(this.zzg);
            zzcxy zzcxyVar = new zzcxy();
            zzcxyVar.zze(this.zzb);
            zzcxyVar.zzi(zzfauVar.zza);
            zzcya zzj = zzcxyVar.zzj();
            zzdef zzdefVar = new zzdef();
            zzdefVar.zzc(this.zzd, this.zzc);
            zzdefVar.zzl(this.zzd, this.zzc);
            return zze(zzcrjVar, zzj, zzdefVar.zzn());
        }
        zzfbl zzi = zzfbl.zzi(this.zzd);
        zzdef zzdefVar2 = new zzdef();
        zzdefVar2.zzb(zzi, this.zzc);
        zzdefVar2.zzg(zzi, this.zzc);
        zzdefVar2.zzh(zzi, this.zzc);
        zzdefVar2.zzi(zzi, this.zzc);
        zzdefVar2.zzc(zzi, this.zzc);
        zzdefVar2.zzl(zzi, this.zzc);
        zzdefVar2.zzm(zzi);
        zzcrj zzcrjVar2 = new zzcrj(this.zzg);
        zzcxy zzcxyVar2 = new zzcxy();
        zzcxyVar2.zze(this.zzb);
        zzcxyVar2.zzi(zzfauVar.zza);
        return zze(zzcrjVar2, zzcxyVar2.zzj(), zzdefVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final boolean zza() {
        ListenableFuture listenableFuture = this.zzj;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeoo zzeooVar, zzeop zzeopVar) throws RemoteException {
        zzflh zzflhVar;
        boolean z = ((Boolean) zzbfr.zzd.zze()).booleanValue() && ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkP)).booleanValue();
        if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkQ)).intValue() || !z) {
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for app open ad.");
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfap
                @Override // java.lang.Runnable
                public final void run() {
                    zzfav.this.zzk();
                }
            });
            return false;
        } else if (this.zzj != null) {
            return false;
        } else {
            if (((Boolean) zzbfm.zzc.zze()).booleanValue()) {
                zzfde zzfdeVar = this.zze;
                if (zzfdeVar.zzd() != null) {
                    zzflh zzh = ((zzcqw) zzfdeVar.zzd()).zzh();
                    zzh.zzd(zzflq.FORMAT_APP_OPEN);
                    zzh.zzb(zzlVar.zzp);
                    zzflhVar = zzh;
                    zzfhf.zza(this.zzb, zzlVar.zzf);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziO)).booleanValue() && zzlVar.zzf) {
                        this.zza.zzl().zzo(true);
                    }
                    Bundle zza = zzdts.zza(new Pair(zzdtq.PUBLIC_API_CALL.zza(), Long.valueOf(zzlVar.zzz)), new Pair(zzdtq.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
                    zzfgg zzfggVar = this.zzi;
                    zzfggVar.zzt(str);
                    zzfggVar.zzs(com.google.android.gms.ads.internal.client.zzq.zzb());
                    zzfggVar.zzG(zzlVar);
                    zzfggVar.zzz(zza);
                    Context context = this.zzb;
                    zzfgi zzI = zzfggVar.zzI();
                    zzfkw zzb = zzfkv.zzb(context, zzflg.zza(zzI), zzflq.FORMAT_APP_OPEN, zzlVar);
                    zzfau zzfauVar = new zzfau(null);
                    zzfauVar.zza = zzI;
                    ListenableFuture zzc = this.zze.zzc(new zzfdf(zzfauVar, null), new zzfdd() { // from class: com.google.android.gms.internal.ads.zzfaq
                        @Override // com.google.android.gms.internal.ads.zzfdd
                        public final zzcxw zza(zzfdc zzfdcVar) {
                            zzcxw zzm;
                            zzm = zzfav.this.zzm(zzfdcVar);
                            return zzm;
                        }
                    }, null);
                    this.zzj = zzc;
                    zzgee.zzr(zzc, new zzfas(this, zzeopVar, zzflhVar, zzb, zzfauVar), this.zzc);
                    return true;
                }
            }
            zzflhVar = null;
            zzfhf.zza(this.zzb, zzlVar.zzf);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziO)).booleanValue()) {
                this.zza.zzl().zzo(true);
            }
            Bundle zza2 = zzdts.zza(new Pair(zzdtq.PUBLIC_API_CALL.zza(), Long.valueOf(zzlVar.zzz)), new Pair(zzdtq.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
            zzfgg zzfggVar2 = this.zzi;
            zzfggVar2.zzt(str);
            zzfggVar2.zzs(com.google.android.gms.ads.internal.client.zzq.zzb());
            zzfggVar2.zzG(zzlVar);
            zzfggVar2.zzz(zza2);
            Context context2 = this.zzb;
            zzfgi zzI2 = zzfggVar2.zzI();
            zzfkw zzb2 = zzfkv.zzb(context2, zzflg.zza(zzI2), zzflq.FORMAT_APP_OPEN, zzlVar);
            zzfau zzfauVar2 = new zzfau(null);
            zzfauVar2.zza = zzI2;
            ListenableFuture zzc2 = this.zze.zzc(new zzfdf(zzfauVar2, null), new zzfdd() { // from class: com.google.android.gms.internal.ads.zzfaq
                @Override // com.google.android.gms.internal.ads.zzfdd
                public final zzcxw zza(zzfdc zzfdcVar) {
                    zzcxw zzm;
                    zzm = zzfav.this.zzm(zzfdcVar);
                    return zzm;
                }
            }, null);
            this.zzj = zzc2;
            zzgee.zzr(zzc2, new zzfas(this, zzeopVar, zzflhVar, zzb2, zzfauVar2), this.zzc);
            return true;
        }
    }

    protected abstract zzcxw zze(zzcrj zzcrjVar, zzcya zzcyaVar, zzdeh zzdehVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzk() {
        this.zzd.zzdB(zzfhk.zzd(6, null, null));
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi.zzu(zzwVar);
    }
}
