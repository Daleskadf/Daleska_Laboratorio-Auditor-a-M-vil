package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzewu {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzflh zzd;
    private final zzduh zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzewu(Context context, Executor executor, Set set, zzflh zzflhVar, zzduh zzduhVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzflhVar;
        this.zze = zzduhVar;
    }

    public final ListenableFuture zza(final Object obj, final Bundle bundle) {
        zzfkw zza = zzfkv.zza(this.zza, zzflo.CUI_NAME_ADREQUEST_SIGNALS);
        zza.zzi();
        final ArrayList arrayList = new ArrayList(this.zzb.size());
        List arrayList2 = new ArrayList();
        if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlv)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlv)).split(","));
        }
        this.zzf = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcc)).booleanValue() && bundle != null) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            if (obj instanceof Bundle) {
                bundle.putLong(zzdtq.CLIENT_SIGNALS_START.zza(), currentTimeMillis);
            } else {
                bundle.putLong(zzdtq.GMS_SIGNALS_START.zza(), currentTimeMillis);
            }
        }
        for (final zzewr zzewrVar : this.zzb) {
            if (!arrayList2.contains(String.valueOf(zzewrVar.zza()))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfY)).booleanValue() || zzewrVar.zza() != 44) {
                    final long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
                    ListenableFuture zzb = zzewrVar.zzb();
                    zzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzews
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzewu.this.zzb(elapsedRealtime, zzewrVar, bundle2);
                        }
                    }, zzcbr.zzf);
                    arrayList.add(zzb);
                }
            }
        }
        ListenableFuture zza2 = zzgee.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzewt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzewq zzewqVar = (zzewq) ((ListenableFuture) it.next()).get();
                    if (zzewqVar != null) {
                        zzewqVar.zzj(obj2);
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcc)).booleanValue() && (bundle3 = bundle) != null) {
                    Bundle bundle4 = bundle2;
                    long currentTimeMillis2 = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
                    if (obj2 instanceof Bundle) {
                        bundle3.putLong(zzdtq.CLIENT_SIGNALS_END.zza(), currentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                    } else {
                        bundle3.putLong(zzdtq.GMS_SIGNALS_END.zza(), currentTimeMillis2);
                        bundle3.putBundle("gms_sig_latency_key", bundle4);
                    }
                }
                return obj2;
            }
        }, this.zzc);
        if (zzflk.zza()) {
            zzflg.zzb(zza2, this.zzd, zza);
        }
        return zza2;
    }

    public final void zzb(long j, zzewr zzewrVar, Bundle bundle) {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - j;
        if (((Boolean) zzbfv.zza.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal runtime (ms) : " + zzfxg.zzc(zzewrVar.getClass().getCanonicalName()) + " = " + elapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcc)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcd)).booleanValue()) {
                synchronized (this) {
                    bundle.putLong("sig" + zzewrVar.zza(), elapsedRealtime);
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzca)).booleanValue()) {
            zzdug zza = this.zze.zza();
            zza.zzb("action", "lat_ms");
            zza.zzb("lat_grp", "sig_lat_grp");
            zza.zzb("lat_id", String.valueOf(zzewrVar.zza()));
            zza.zzb("clat_ms", String.valueOf(elapsedRealtime));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcb)).booleanValue()) {
                synchronized (this) {
                    this.zzg++;
                }
                zza.zzb("seq_num", com.google.android.gms.ads.internal.zzu.zzo().zzh().zzd());
                synchronized (this) {
                    if (this.zzg == this.zzb.size() && this.zzf != 0) {
                        this.zzg = 0;
                        String valueOf = String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzf);
                        if (zzewrVar.zza() <= 39 || zzewrVar.zza() >= 52) {
                            zza.zzb("lat_clsg", valueOf);
                        } else {
                            zza.zzb("lat_gmssg", valueOf);
                        }
                    }
                }
            }
            zza.zzg();
        }
    }
}
