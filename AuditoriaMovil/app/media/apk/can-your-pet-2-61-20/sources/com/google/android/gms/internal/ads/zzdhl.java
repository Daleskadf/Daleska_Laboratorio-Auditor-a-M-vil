package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdhl extends zzctv {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdfr zze;
    private final zzdiu zzf;
    private final zzcuq zzg;
    private final zzfqa zzh;
    private final zzczd zzi;
    private final zzcbl zzj;
    private boolean zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdhl(zzctu zzctuVar, Context context, @Nullable zzcgm zzcgmVar, zzdfr zzdfrVar, zzdiu zzdiuVar, zzcuq zzcuqVar, zzfqa zzfqaVar, zzczd zzczdVar, zzcbl zzcblVar) {
        super(zzctuVar);
        this.zzk = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcgmVar);
        this.zze = zzdfrVar;
        this.zzf = zzdiuVar;
        this.zzg = zzcuqVar;
        this.zzh = zzfqaVar;
        this.zzi = zzczdVar;
        this.zzj = zzcblVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcgm zzcgmVar = (zzcgm) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgO)).booleanValue()) {
                if (!this.zzk && zzcgmVar != null) {
                    zzgep zzgepVar = zzcbr.zze;
                    Objects.requireNonNull(zzcgmVar);
                    zzgepVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhk
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcgm.this.destroy();
                        }
                    });
                }
            } else if (zzcgmVar != null) {
                zzcgmVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzc(boolean z, @Nullable Activity activity) {
        zzffn zzD;
        this.zze.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaB)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzG(this.zzc)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaC)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        zzcgm zzcgmVar = (zzcgm) this.zzd.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlz)).booleanValue() || zzcgmVar == null || (zzD = zzcgmVar.zzD()) == null || !zzD.zzar || zzD.zzas == this.zzj.zzb()) {
            if (this.zzk) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("The interstitial ad has been shown.");
                this.zzi.zza(zzfhk.zzd(10, null, null));
            }
            Activity activity2 = activity;
            if (!this.zzk) {
                if (activity == null) {
                    activity2 = this.zzc;
                }
                try {
                    this.zzf.zza(z, activity2, this.zzi);
                    this.zze.zza();
                    this.zzk = true;
                    return true;
                } catch (zzdit e) {
                    this.zzi.zzc(e);
                }
            }
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("The interstitial consent form has been shown.");
            this.zzi.zza(zzfhk.zzd(12, "The consent form has already been shown.", null));
        }
        return false;
    }
}
