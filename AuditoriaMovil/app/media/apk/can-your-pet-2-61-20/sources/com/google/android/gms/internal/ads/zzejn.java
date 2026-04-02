package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzejn {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcty zzc;
    private final zzekd zzd;
    private final zzfmp zze;
    private final zzgex zzf = zzgex.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    private zzejo zzh;
    private zzffz zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzejn(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcty zzctyVar, zzekd zzekdVar, zzfmp zzfmpVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzctyVar;
        this.zzd = zzekdVar;
        this.zze = zzfmpVar;
    }

    private final synchronized ListenableFuture zzd(zzffn zzffnVar) {
        for (String str : zzffnVar.zza) {
            zzegj zza = this.zzc.zza(zzffnVar.zzb, str);
            if (zza != null && zza.zzb(this.zzi, zzffnVar)) {
                ListenableFuture zza2 = zza.zza(this.zzi, zzffnVar);
                int i = zzffnVar.zzS;
                return zzgee.zzo(zza2, i, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzgee.zzg(new zzdyi(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(zzffn zzffnVar) {
        if (zzffnVar == null) {
            return;
        }
        ListenableFuture zzd = zzd(zzffnVar);
        this.zzd.zzf(this.zzi, zzffnVar, zzd, this.zze);
        zzgee.zzr(zzd, new zzejm(this, zzffnVar), this.zza);
    }

    public final synchronized ListenableFuture zzb(zzffz zzffzVar) {
        if (!this.zzg.getAndSet(true)) {
            if (!zzffzVar.zzb.zza.isEmpty()) {
                this.zzi = zzffzVar;
                this.zzh = new zzejo(zzffzVar, this.zzd, this.zzf);
                this.zzd.zzk(zzffzVar.zzb.zza);
                while (this.zzh.zze()) {
                    zze(this.zzh.zza());
                }
            } else {
                this.zzf.zzd(new zzekh(3, zzekk.zzc(zzffzVar)));
            }
        }
        return this.zzf;
    }
}
