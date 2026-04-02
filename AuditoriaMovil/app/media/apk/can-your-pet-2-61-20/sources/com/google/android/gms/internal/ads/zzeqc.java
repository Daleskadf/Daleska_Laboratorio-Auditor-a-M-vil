package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeqc implements zzewr {
    private final zzgep zza;
    private final zzdry zzb;
    private final zzdwk zzc;
    private final zzeqe zzd;

    public zzeqc(zzgep zzgepVar, zzdry zzdryVar, zzdwk zzdwkVar, zzeqe zzeqeVar) {
        this.zza = zzgepVar;
        this.zzb = zzdryVar;
        this.zzc = zzdwkVar;
        this.zzd = zzeqeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlq)).booleanValue() || this.zzd.zza() == null) {
            if (!zzfxg.zzd((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbr))) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlq)).booleanValue() || (!this.zzd.zzd() && this.zzc.zzt())) {
                    this.zzd.zzc(true);
                    return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqb
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzeqc.this.zzc();
                        }
                    });
                }
            }
            return zzgee.zzh(new zzeqd(new Bundle()));
        }
        zzeqd zza = this.zzd.zza();
        zza.getClass();
        return zzgee.zzh(zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeqd zzc() throws Exception {
        List<String> asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbr)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                zzfhg zzc = this.zzb.zzc(str, new JSONObject());
                zzc.zzC();
                boolean zzt = this.zzc.zzt();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlq)).booleanValue() || zzt) {
                    try {
                        zzbtc zzf = zzc.zzf();
                        if (zzf != null) {
                            bundle2.putString("sdk_version", zzf.toString());
                        }
                    } catch (zzfgp unused) {
                    }
                }
                try {
                    zzbtc zze = zzc.zze();
                    if (zze != null) {
                        bundle2.putString("adapter_version", zze.toString());
                    }
                } catch (zzfgp unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfgp unused3) {
            }
        }
        zzeqd zzeqdVar = new zzeqd(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlq)).booleanValue()) {
            this.zzd.zzb(zzeqdVar);
        }
        return zzeqdVar;
    }
}
