package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzflk implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private int zzi;
    private final zzdrv zzj;
    private final List zzk;
    private final zzedj zzm;
    private final zzbxm zzn;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzflz zzg = zzfmc.zzc();
    private String zzh = "";
    private boolean zzl = false;

    public zzflk(Context context, VersionInfoParcel versionInfoParcel, zzdrv zzdrvVar, zzedj zzedjVar, zzbxm zzbxmVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdrvVar;
        this.zzm = zzedjVar;
        this.zzn = zzbxmVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziK)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzt.zzd();
        } else {
            this.zzk = zzfzn.zzm();
        }
    }

    public static boolean zza() {
        boolean booleanValue;
        synchronized (zza) {
            if (zzb == null) {
                if (((Boolean) zzbfm.zzb.zze()).booleanValue()) {
                    zzb = Boolean.valueOf(Math.random() < ((Double) zzbfm.zza.zze()).doubleValue());
                } else {
                    zzb = false;
                }
            }
            booleanValue = zzb.booleanValue();
        }
        return booleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] zzaV;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                if (this.zzg.zza() == 0) {
                    return;
                }
                try {
                    synchronized (obj) {
                        zzaV = ((zzfmc) this.zzg.zzbr()).zzaV();
                        this.zzg.zzc();
                    }
                    new zzedi(this.zze, this.zzf.afmaVersion, this.zzn, Binder.getCallingUid()).zza(new zzedg((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziE), 60000, new HashMap(), zzaV, "application/x-protobuf", false));
                } catch (Exception e) {
                    if ((e instanceof zzdyi) && ((zzdyi) e).zza() == 3) {
                        return;
                    }
                    com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "CuiMonitor.sendCuiPing");
                }
            }
        }
    }

    public final void zzb(final zzfla zzflaVar) {
        zzcbr.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzflj
            @Override // java.lang.Runnable
            public final void run() {
                zzflk.this.zzc(zzflaVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzfla zzflaVar) {
        synchronized (zzd) {
            if (!this.zzl) {
                this.zzl = true;
                if (zza()) {
                    try {
                        com.google.android.gms.ads.internal.zzu.zzp();
                        this.zzh = com.google.android.gms.ads.internal.util.zzt.zzp(this.zze);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "CuiMonitor.gettingAppIdFromManifest");
                    }
                    this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                    int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziF)).intValue();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzly)).booleanValue()) {
                        long j = intValue;
                        zzcbr.zzd.scheduleWithFixedDelay(this, j, j, TimeUnit.MILLISECONDS);
                    } else {
                        long j2 = intValue;
                        zzcbr.zzd.scheduleAtFixedRate(this, j2, j2, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
        if (zza() && zzflaVar != null) {
            synchronized (zzc) {
                if (this.zzg.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziG)).intValue()) {
                    return;
                }
                zzflm zza2 = zzflx.zza();
                zza2.zzk(zzflaVar.zzd());
                zza2.zzt(zzflaVar.zzn());
                zza2.zzh(zzflaVar.zzb());
                zza2.zzn(zzflu.OS_ANDROID);
                zza2.zzq(this.zzf.afmaVersion);
                zza2.zzb(this.zzh);
                zza2.zzo(Build.VERSION.RELEASE);
                zza2.zzu(Build.VERSION.SDK_INT);
                zza2.zzm(zzflaVar.zzf());
                zza2.zzl(zzflaVar.zza());
                zza2.zzf(this.zzi);
                zza2.zze(zzflaVar.zze());
                zza2.zzc(zzflaVar.zzg());
                zza2.zzg(zzflaVar.zzi());
                zza2.zzi(zzflaVar.zzj());
                zza2.zzj(this.zzj.zzb(zzflaVar.zzj()));
                zza2.zzp(zzflaVar.zzk());
                zza2.zzd(zzflaVar.zzh());
                zza2.zzv(zzflaVar.zzm());
                zza2.zzr(zzflaVar.zzl());
                zza2.zzs(zzflaVar.zzc());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziK)).booleanValue()) {
                    zza2.zza(this.zzk);
                }
                zzflz zzflzVar = this.zzg;
                zzfma zza3 = zzfmb.zza();
                zza3.zza(zza2);
                zzflzVar.zzb(zza3);
            }
        }
    }
}
