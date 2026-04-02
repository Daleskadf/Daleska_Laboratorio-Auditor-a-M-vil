package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfbz implements zzeoq {
    private final Context zza;
    private final Executor zzb;
    private final zzcik zzc;
    private final zzeoa zzd;
    private final zzeoe zze;
    private final ViewGroup zzf;
    private zzbeu zzg;
    private final zzdbf zzh;
    private final zzflk zzi;
    private final zzddm zzj;
    private final zzfgg zzk;
    private ListenableFuture zzl;

    public zzfbz(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcik zzcikVar, zzeoa zzeoaVar, zzeoe zzeoeVar, zzfgg zzfggVar, zzddm zzddmVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcikVar;
        this.zzd = zzeoaVar;
        this.zze = zzeoeVar;
        this.zzk = zzfggVar;
        this.zzh = zzcikVar.zzf();
        this.zzi = zzcikVar.zzz();
        this.zzf = new FrameLayout(context);
        this.zzj = zzddmVar;
        zzfggVar.zzs(zzqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final boolean zza() {
        ListenableFuture listenableFuture = this.zzl;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeoo zzeooVar, zzeop zzeopVar) throws RemoteException {
        zzcsm zzk;
        zzflh zzflhVar;
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbv
                @Override // java.lang.Runnable
                public final void run() {
                    zzfbz.this.zzm();
                }
            });
            return false;
        }
        if (!zza()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziO)).booleanValue() && zzlVar.zzf) {
                this.zzc.zzl().zzo(true);
            }
            Bundle zza = zzdts.zza(new Pair(zzdtq.PUBLIC_API_CALL.zza(), Long.valueOf(zzlVar.zzz)), new Pair(zzdtq.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
            zzfgg zzfggVar = this.zzk;
            zzfggVar.zzt(str);
            zzfggVar.zzG(zzlVar);
            zzfggVar.zzz(zza);
            Context context = this.zza;
            zzfgi zzI = zzfggVar.zzI();
            zzfkw zzb = zzfkv.zzb(context, zzflg.zza(zzI), zzflq.FORMAT_BANNER, zzlVar);
            if (!((Boolean) zzbfy.zze.zze()).booleanValue() || !this.zzk.zzh().zzk) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzie)).booleanValue()) {
                    zzcsl zze = this.zzc.zze();
                    zzcxy zzcxyVar = new zzcxy();
                    zzcxyVar.zze(this.zza);
                    zzcxyVar.zzi(zzI);
                    zze.zzi(zzcxyVar.zzj());
                    zzdef zzdefVar = new zzdef();
                    zzdefVar.zzj(this.zzd, this.zzb);
                    zzdefVar.zzk(this.zzd, this.zzb);
                    zze.zzf(zzdefVar.zzn());
                    zze.zze(new zzemj(this.zzg));
                    zze.zzd(new zzdjd(zzdlj.zza, null));
                    zze.zzg(new zzctn(this.zzh, this.zzj));
                    zze.zzc(new zzcrj(this.zzf));
                    zzk = zze.zzk();
                } else {
                    zzcsl zze2 = this.zzc.zze();
                    zzcxy zzcxyVar2 = new zzcxy();
                    zzcxyVar2.zze(this.zza);
                    zzcxyVar2.zzi(zzI);
                    zze2.zzi(zzcxyVar2.zzj());
                    zzdef zzdefVar2 = new zzdef();
                    zzdefVar2.zzj(this.zzd, this.zzb);
                    zzdefVar2.zza(this.zzd, this.zzb);
                    zzdefVar2.zza(this.zze, this.zzb);
                    zzdefVar2.zzl(this.zzd, this.zzb);
                    zzdefVar2.zzd(this.zzd, this.zzb);
                    zzdefVar2.zze(this.zzd, this.zzb);
                    zzdefVar2.zzf(this.zzd, this.zzb);
                    zzdefVar2.zzb(this.zzd, this.zzb);
                    zzdefVar2.zzk(this.zzd, this.zzb);
                    zzdefVar2.zzi(this.zzd, this.zzb);
                    zze2.zzf(zzdefVar2.zzn());
                    zze2.zze(new zzemj(this.zzg));
                    zze2.zzd(new zzdjd(zzdlj.zza, null));
                    zze2.zzg(new zzctn(this.zzh, this.zzj));
                    zze2.zzc(new zzcrj(this.zzf));
                    zzk = zze2.zzk();
                }
                zzcsm zzcsmVar = zzk;
                if (((Boolean) zzbfm.zzc.zze()).booleanValue()) {
                    zzflh zzj = zzcsmVar.zzj();
                    zzj.zzd(zzflq.FORMAT_BANNER);
                    zzj.zzb(zzlVar.zzp);
                    zzflhVar = zzj;
                } else {
                    zzflhVar = null;
                }
                zzcvd zzd = zzcsmVar.zzd();
                ListenableFuture zzi = zzd.zzi(zzd.zzj());
                this.zzl = zzi;
                zzgee.zzr(zzi, new zzfby(this, zzeopVar, zzflhVar, zzb, zzcsmVar), this.zzb);
                return true;
            }
            zzeoa zzeoaVar = this.zzd;
            if (zzeoaVar != null) {
                zzeoaVar.zzdB(zzfhk.zzd(7, null, null));
            }
        }
        return false;
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final zzfgg zzi() {
        return this.zzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        this.zzd.zzdB(zzfhk.zzd(6, null, null));
    }

    public final void zzn() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        this.zze.zza(zzbeVar);
    }

    public final void zzp(zzdbg zzdbgVar) {
        this.zzh.zzo(zzdbgVar, this.zzb);
    }

    public final void zzq(zzbeu zzbeuVar) {
        this.zzg = zzbeuVar;
    }

    public final boolean zzr() {
        ViewParent parent = this.zzf.getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            com.google.android.gms.ads.internal.zzu.zzp();
            return com.google.android.gms.ads.internal.util.zzt.zzW(view, view.getContext());
        }
        return false;
    }
}
