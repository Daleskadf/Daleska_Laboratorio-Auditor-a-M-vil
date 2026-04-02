package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeyn implements zzewr {
    private final zzcbh zza;
    private final String zzb;
    private final ScheduledExecutorService zzc;
    private final zzgep zzd;
    private final zzbca zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeyn(String str, zzbca zzbcaVar, zzcbh zzcbhVar, ScheduledExecutorService scheduledExecutorService, zzgep zzgepVar) {
        this.zzb = str;
        this.zze = zzbcaVar;
        this.zza = zzcbhVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcF)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcK)).booleanValue()) {
                ListenableFuture zzn = zzgee.zzn(zzftv.zza(Tasks.forResult(null), null), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzeyl
                    @Override // com.google.android.gms.internal.ads.zzgdl
                    public final ListenableFuture zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        if (appSetIdInfo == null) {
                            return zzgee.zzh(new zzeyo(null, -1));
                        }
                        return zzgee.zzh(new zzeyo(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, this.zzd);
                if (((Boolean) zzbfi.zza.zze()).booleanValue()) {
                    zzn = zzgee.zzo(zzn, ((Long) zzbfi.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgee.zze(zzn, Exception.class, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzeym
                    @Override // com.google.android.gms.internal.ads.zzfwf
                    public final Object apply(Object obj) {
                        return zzeyn.this.zzc((Exception) obj);
                    }
                }, this.zzd);
            }
        }
        return zzgee.zzh(new zzeyo(null, -1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeyo zzc(Exception exc) {
        this.zza.zzw(exc, "AppSetIdInfoGmscoreSignal");
        return new zzeyo(null, -1);
    }
}
