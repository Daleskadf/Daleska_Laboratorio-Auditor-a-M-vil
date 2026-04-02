package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzecu extends zzbwl {
    private final Context zza;
    private final zzgep zzb;
    private final zzedm zzc;
    private final zzcnx zzd;
    private final ArrayDeque zze;
    private final zzflk zzf;
    private final zzbxm zzg;
    private final zzedj zzh;

    public zzecu(Context context, zzgep zzgepVar, zzbxm zzbxmVar, zzcnx zzcnxVar, zzedm zzedmVar, ArrayDeque arrayDeque, zzedj zzedjVar, zzflk zzflkVar) {
        zzbdz.zza(context);
        this.zza = context;
        this.zzb = zzgepVar;
        this.zzg = zzbxmVar;
        this.zzc = zzedmVar;
        this.zzd = zzcnxVar;
        this.zze = arrayDeque;
        this.zzh = zzedjVar;
        this.zzf = zzflkVar;
    }

    private final synchronized zzecr zzk(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzecr zzecrVar = (zzecr) it.next();
            if (zzecrVar.zzc.equals(str)) {
                it.remove();
                return zzecrVar;
            }
        }
        return null;
    }

    private static ListenableFuture zzl(ListenableFuture listenableFuture, zzfkn zzfknVar, zzbpq zzbpqVar, zzflh zzflhVar, zzfkw zzfkwVar) {
        zzbpg zza = zzbpqVar.zza("AFMA_getAdDictionary", zzbpn.zza, new zzbpi() { // from class: com.google.android.gms.internal.ads.zzecm
            @Override // com.google.android.gms.internal.ads.zzbpi
            public final Object zza(JSONObject jSONObject) {
                return new zzbxg(jSONObject);
            }
        });
        zzflg.zze(listenableFuture, zzfkwVar);
        zzfjs zza2 = zzfknVar.zzb(zzfkh.BUILD_URL, listenableFuture).zzf(zza).zza();
        zzflg.zzd(zza2, zzflhVar, zzfkwVar);
        return zza2;
    }

    private static ListenableFuture zzm(final zzbxd zzbxdVar, zzfkn zzfknVar, final zzexp zzexpVar) {
        zzgdl zzgdlVar = new zzgdl() { // from class: com.google.android.gms.internal.ads.zzecg
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzexp.this.zzb().zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzi((Bundle) obj), zzbxdVar.zzm);
            }
        };
        return zzfknVar.zzb(zzfkh.GMS_SIGNALS, zzgee.zzh(zzbxdVar.zza)).zzf(zzgdlVar).zze(new zzfjq() { // from class: com.google.android.gms.internal.ads.zzech
            @Override // com.google.android.gms.internal.ads.zzfjq
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzn(zzecr zzecrVar) {
        zzo();
        this.zze.addLast(zzecrVar);
    }

    private final synchronized void zzo() {
        int intValue = ((Long) zzbfz.zzc.zze()).intValue();
        while (this.zze.size() >= intValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzp(ListenableFuture listenableFuture, zzbww zzbwwVar, zzbxd zzbxdVar) {
        zzgee.zzr(zzgee.zzn(listenableFuture, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzecn
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzgee.zzh(zzfhj.zza((InputStream) obj));
            }
        }, zzcbr.zza), new zzecq(this, zzbwwVar, zzbxdVar), zzcbr.zzf);
    }

    public final ListenableFuture zzb(final zzbxd zzbxdVar, int i) {
        if (!((Boolean) zzbfz.zza.zze()).booleanValue()) {
            return zzgee.zzg(new Exception("Split request is disabled."));
        }
        zzfid zzfidVar = zzbxdVar.zzi;
        if (zzfidVar == null) {
            return zzgee.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzfidVar.zzc == 0 || zzfidVar.zzd == 0) {
            return zzgee.zzg(new Exception("Caching is disabled."));
        }
        zzbpq zzb = com.google.android.gms.ads.internal.zzu.zzf().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        zzexp zzr = this.zzd.zzr(zzbxdVar, i);
        zzfkn zzc = zzr.zzc();
        final ListenableFuture zzm = zzm(zzbxdVar, zzc, zzr);
        zzflh zzd = zzr.zzd();
        final zzfkw zza = zzfkv.zza(this.zza, zzflo.CUI_NAME_ADREQUEST_BUILDURL);
        final ListenableFuture zzl = zzl(zzm, zzc, zzb, zzd, zza);
        return zzc.zza(zzfkh.GET_URL_AND_CACHE_KEY, zzm, zzl).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeck
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzecu.this.zzj(zzl, zzm, zzbxdVar, zza);
            }
        }).zza();
    }

    public final ListenableFuture zzc(final zzbxd zzbxdVar, int i) {
        zzecr zzk;
        zzfkw zzfkwVar;
        zzfjs zza;
        zzbpq zzb = com.google.android.gms.ads.internal.zzu.zzf().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        zzexp zzr = this.zzd.zzr(zzbxdVar, i);
        zzbpg zza2 = zzb.zza("google.afma.response.normalize", zzect.zza, zzbpn.zzb);
        if (!((Boolean) zzbfz.zza.zze()).booleanValue()) {
            String str = zzbxdVar.zzj;
            zzk = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        } else {
            zzk = zzk(zzbxdVar.zzh);
            if (zzk == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        }
        if (zzk == null) {
            zzfkwVar = zzfkv.zza(this.zza, zzflo.CUI_NAME_ADREQUEST_BUILDURL);
        } else {
            zzfkwVar = zzk.zze;
        }
        zzflh zzd = zzr.zzd();
        zzd.zze(zzbxdVar.zza.getStringArrayList("ad_types"));
        zzedl zzedlVar = new zzedl(zzbxdVar.zzg, zzd, zzfkwVar);
        zzedi zzediVar = new zzedi(this.zza, zzbxdVar.zzb.afmaVersion, this.zzg, i);
        zzfkn zzc = zzr.zzc();
        zzfkw zza3 = zzfkv.zza(this.zza, zzflo.CUI_NAME_ADREQUEST_PARSERESPONSE);
        if (zzk == null) {
            final ListenableFuture zzm = zzm(zzbxdVar, zzc, zzr);
            final ListenableFuture zzl = zzl(zzm, zzc, zzb, zzd, zzfkwVar);
            zzfkw zza4 = zzfkv.zza(this.zza, zzflo.CUI_NAME_ADREQUEST_REQUEST);
            final zzfjs zza5 = zzc.zza(zzfkh.HTTP, zzl, zzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeci
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzbxd zzbxdVar2;
                    Bundle bundle;
                    zzbxg zzbxgVar = (zzbxg) ListenableFuture.this.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcc)).booleanValue() && (bundle = (zzbxdVar2 = zzbxdVar).zzm) != null) {
                        bundle.putLong(zzdtq.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbxgVar.zzc());
                        zzbxdVar2.zzm.putLong(zzdtq.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbxgVar.zzb());
                    }
                    return new zzedk((JSONObject) zzm.get(), zzbxgVar);
                }
            }).zze(zzedlVar).zze(new zzflc(zza4)).zze(zzediVar).zza();
            zzflg.zzb(zza5, zzd, zza4);
            zzflg.zze(zza5, zza3);
            zza = zzc.zza(zzfkh.PRE_PROCESS, zzm, zzl, zza5).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzecj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcc)).booleanValue() && (bundle = zzbxd.this.zzm) != null) {
                        bundle.putLong(zzdtq.HTTP_RESPONSE_READY.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
                    }
                    return new zzect((zzedh) zza5.get(), (JSONObject) zzm.get(), (zzbxg) zzl.get());
                }
            }).zzf(zza2).zza();
        } else {
            zzedk zzedkVar = new zzedk(zzk.zzb, zzk.zza);
            zzfkw zza6 = zzfkv.zza(this.zza, zzflo.CUI_NAME_ADREQUEST_REQUEST);
            final zzfjs zza7 = zzc.zzb(zzfkh.HTTP, zzgee.zzh(zzedkVar)).zze(zzedlVar).zze(new zzflc(zza6)).zze(zzediVar).zza();
            zzflg.zzb(zza7, zzd, zza6);
            final ListenableFuture zzh = zzgee.zzh(zzk);
            zzflg.zze(zza7, zza3);
            zza = zzc.zza(zzfkh.PRE_PROCESS, zza7, zzh).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzecf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ListenableFuture listenableFuture = zzh;
                    return new zzect((zzedh) ListenableFuture.this.get(), ((zzecr) listenableFuture.get()).zzb, ((zzecr) listenableFuture.get()).zza);
                }
            }).zzf(zza2).zza();
        }
        zzflg.zzb(zza, zzd, zza3);
        return zza;
    }

    public final ListenableFuture zzd(final zzbxd zzbxdVar, int i) {
        zzbpq zzb = com.google.android.gms.ads.internal.zzu.zzf().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzbge.zza.zze()).booleanValue()) {
            return zzgee.zzg(new Exception("Signal collection disabled."));
        }
        zzexp zzr = this.zzd.zzr(zzbxdVar, i);
        final zzewu zza = zzr.zza();
        zzbpg zza2 = zzb.zza("google.afma.request.getSignals", zzbpn.zza, zzbpn.zzb);
        zzfkw zza3 = zzfkv.zza(this.zza, zzflo.CUI_NAME_SCAR_SIGNALS);
        zzfjs zza4 = zzr.zzc().zzb(zzfkh.GET_SIGNALS, zzgee.zzh(zzbxdVar.zza)).zze(new zzflc(zza3)).zzf(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzeco
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzewu.this.zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzi((Bundle) obj), zzbxdVar.zzm);
            }
        }).zzb(zzfkh.JS_SIGNALS).zzf(zza2).zza();
        zzflh zzd = zzr.zzd();
        zzd.zze(zzbxdVar.zza.getStringArrayList("ad_types"));
        zzflg.zzc(zza4, zzd, zza3);
        if (((Boolean) zzbft.zzg.zze()).booleanValue()) {
            zzedm zzedmVar = this.zzc;
            Objects.requireNonNull(zzedmVar);
            zza4.addListener(new zzecl(zzedmVar), this.zzb);
        }
        return zza4;
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zze(zzbxd zzbxdVar, zzbww zzbwwVar) {
        zzp(zzb(zzbxdVar, Binder.getCallingUid()), zzbwwVar, zzbxdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzf(zzbxd zzbxdVar, zzbww zzbwwVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcc)).booleanValue() && (bundle = zzbxdVar.zzm) != null) {
            bundle.putLong(zzdtq.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
        }
        zzp(zzd(zzbxdVar, Binder.getCallingUid()), zzbwwVar, zzbxdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzg(zzbxd zzbxdVar, zzbww zzbwwVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcc)).booleanValue() && (bundle = zzbxdVar.zzm) != null) {
            bundle.putLong(zzdtq.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
        }
        ListenableFuture zzc = zzc(zzbxdVar, Binder.getCallingUid());
        zzp(zzc, zzbwwVar, zzbxdVar);
        if (((Boolean) zzbft.zze.zze()).booleanValue()) {
            zzedm zzedmVar = this.zzc;
            Objects.requireNonNull(zzedmVar);
            zzc.addListener(new zzecl(zzedmVar), this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzh(String str, zzbww zzbwwVar) {
        zzp(zzi(str), zzbwwVar, null);
    }

    public final ListenableFuture zzi(String str) {
        if (!((Boolean) zzbfz.zza.zze()).booleanValue()) {
            return zzgee.zzg(new Exception("Split request is disabled."));
        }
        zzecp zzecpVar = new zzecp(this);
        if (zzk(str) == null) {
            return zzgee.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
        }
        return zzgee.zzh(zzecpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzj(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzbxd zzbxdVar, zzfkw zzfkwVar) throws Exception {
        String zze = ((zzbxg) listenableFuture.get()).zze();
        String str = zzbxdVar.zzh;
        zzn(new zzecr((zzbxg) listenableFuture.get(), (JSONObject) listenableFuture2.get(), str, zze, zzfkwVar));
        return new ByteArrayInputStream(zze.getBytes(zzfwd.zzc));
    }
}
