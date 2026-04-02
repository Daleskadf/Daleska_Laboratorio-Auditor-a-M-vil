package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzdum;
import com.google.android.gms.internal.ads.zzgea;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes.dex */
public final class zzaa implements zzgea {
    final /* synthetic */ zzab zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaa(zzab zzabVar) {
        this.zza = zzabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        zzdum zzdumVar;
        AtomicInteger atomicInteger;
        AtomicBoolean atomicBoolean;
        AtomicInteger atomicInteger2;
        com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzdumVar = this.zza.zzq;
        atomicInteger = this.zza.zzI;
        zzh.zzc(zzdumVar, null, "sgf", new Pair("sgf_reason", th.getMessage()), new Pair("se", "query_g"), new Pair(FirebaseAnalytics.Param.AD_FORMAT, AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to initialize webview for loading SDKCore. ", th);
        if (((Boolean) zzba.zzc().zza(zzbdz.zzjC)).booleanValue()) {
            atomicBoolean = this.zza.zzH;
            if (atomicBoolean.get()) {
                return;
            }
            atomicInteger2 = this.zza.zzI;
            if (atomicInteger2.getAndIncrement() < ((Integer) zzba.zzc().zza(zzbdz.zzjD)).intValue()) {
                this.zza.zzT();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdum zzdumVar;
        AtomicInteger atomicInteger;
        AtomicBoolean atomicBoolean;
        zzap zzapVar = (zzap) obj;
        com.google.android.gms.ads.internal.util.client.zzm.zze("Initialized webview successfully for SDKCore.");
        if (((Boolean) zzba.zzc().zza(zzbdz.zzjC)).booleanValue()) {
            zzdumVar = this.zza.zzq;
            atomicInteger = this.zza.zzI;
            zzh.zzc(zzdumVar, null, "sgs", new Pair("se", "query_g"), new Pair(FirebaseAnalytics.Param.AD_FORMAT, AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
            atomicBoolean = this.zza.zzH;
            atomicBoolean.set(true);
        }
    }
}
