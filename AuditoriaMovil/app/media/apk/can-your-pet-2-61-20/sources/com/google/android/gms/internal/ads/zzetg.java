package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzetg implements zzewr {
    private final Context zza;
    private final zzgep zzb;

    public zzetg(Context context, zzgep zzgepVar) {
        this.zza = context;
        this.zzb = zzgepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 19;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String zzi;
                String zzj;
                String str;
                com.google.android.gms.ads.internal.zzu.zzp();
                zzbax zzf = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzf();
                Bundle bundle = null;
                if (zzf != null && (!com.google.android.gms.ads.internal.zzu.zzo().zzi().zzL() || !com.google.android.gms.ads.internal.zzu.zzo().zzi().zzM())) {
                    if (zzf.zzh()) {
                        zzf.zzg();
                    }
                    zzban zza = zzf.zza();
                    if (zza != null) {
                        zzi = zza.zzd();
                        str = zza.zze();
                        zzj = zza.zzf();
                        if (zzi != null) {
                            com.google.android.gms.ads.internal.zzu.zzo().zzi().zzv(zzi);
                        }
                        if (zzj != null) {
                            com.google.android.gms.ads.internal.zzu.zzo().zzi().zzx(zzj);
                        }
                    } else {
                        zzi = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzi();
                        zzj = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzj();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!com.google.android.gms.ads.internal.zzu.zzo().zzi().zzM()) {
                        if (zzj == null || TextUtils.isEmpty(zzj)) {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        } else {
                            bundle2.putString("v_fp_vertical", zzj);
                        }
                    }
                    if (zzi != null && !com.google.android.gms.ads.internal.zzu.zzo().zzi().zzL()) {
                        bundle2.putString("fingerprint", zzi);
                        if (!zzi.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzeth(bundle);
            }
        });
    }
}
