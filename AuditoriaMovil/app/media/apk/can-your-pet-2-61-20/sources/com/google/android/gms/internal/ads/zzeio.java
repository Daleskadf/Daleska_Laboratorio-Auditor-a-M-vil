package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzeio implements zzdiu {
    private final zzffn zza;
    private final zzbsn zzb;
    private final AdFormat zzc;
    private zzczi zzd = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeio(zzffn zzffnVar, zzbsn zzbsnVar, AdFormat adFormat) {
        this.zza = zzffnVar;
        this.zzb = zzbsnVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zza(boolean z, Context context, zzczd zzczdVar) throws zzdit {
        boolean zzs;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int ordinal = this.zzc.ordinal();
            if (ordinal == 1) {
                zzs = this.zzb.zzs(ObjectWrapper.wrap(context));
            } else if (ordinal == 2) {
                zzs = this.zzb.zzt(ObjectWrapper.wrap(context));
            } else {
                if (ordinal == 5) {
                    zzs = this.zzb.zzr(ObjectWrapper.wrap(context));
                }
                throw new zzdit("Adapter failed to show.");
            }
            if (zzs) {
                if (this.zzd == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbw)).booleanValue() || this.zza.zzZ != 2) {
                    return;
                }
                this.zzd.zza();
                return;
            }
            throw new zzdit("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdit(th);
        }
    }

    public final void zzb(zzczi zzcziVar) {
        this.zzd = zzcziVar;
    }
}
