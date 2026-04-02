package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcvd {
    private final zzdzr zza;
    private final zzfgi zzb;
    private final zzfkn zzc;
    private final zzcny zzd;
    private final zzekk zze;
    private final zzddv zzf;
    private zzffz zzg;
    private final zzeay zzh;
    private final zzcxu zzi;
    private final Executor zzj;
    private final zzeai zzk;
    private final zzego zzl;
    private final zzebo zzm;
    private final zzebv zzn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcvd(zzdzr zzdzrVar, zzfgi zzfgiVar, zzfkn zzfknVar, zzcny zzcnyVar, zzekk zzekkVar, zzddv zzddvVar, zzffz zzffzVar, zzeay zzeayVar, zzcxu zzcxuVar, Executor executor, zzeai zzeaiVar, zzego zzegoVar, zzebo zzeboVar, zzebv zzebvVar) {
        this.zza = zzdzrVar;
        this.zzb = zzfgiVar;
        this.zzc = zzfknVar;
        this.zzd = zzcnyVar;
        this.zze = zzekkVar;
        this.zzf = zzddvVar;
        this.zzg = zzffzVar;
        this.zzh = zzeayVar;
        this.zzi = zzcxuVar;
        this.zzj = executor;
        this.zzk = zzeaiVar;
        this.zzl = zzegoVar;
        this.zzm = zzeboVar;
        this.zzn = zzebvVar;
    }

    public final com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        return zzfhk.zzb(th, this.zzl);
    }

    public final zzddv zzc() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzffz zzd(zzffz zzffzVar) throws Exception {
        this.zzd.zza(zzffzVar);
        return zzffzVar;
    }

    public final ListenableFuture zze(final zzfid zzfidVar) {
        zzfjs zza = this.zzc.zzb(zzfkh.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzcuz
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzcvd.this.zzf(zzfidVar, (zzbxd) obj);
            }
        }).zza();
        zzgee.zzr(zza, new zzcvb(this), this.zzj);
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzf(zzfid zzfidVar, zzbxd zzbxdVar) throws Exception {
        zzbxdVar.zzi = zzfidVar;
        return this.zzh.zza(zzbxdVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzg(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3) throws Exception {
        return this.zzn.zzc((zzbxd) listenableFuture.get(), (JSONObject) listenableFuture2.get(), (zzbxg) listenableFuture3.get());
    }

    public final ListenableFuture zzh(zzbxd zzbxdVar) {
        zzfjs zza = this.zzc.zzb(zzfkh.NOTIFY_CACHE_HIT, this.zzh.zzg(zzbxdVar)).zza();
        zzgee.zzr(zza, new zzcvc(this), this.zzj);
        return zza;
    }

    public final ListenableFuture zzi(ListenableFuture listenableFuture) {
        zzfke zzf = this.zzc.zzb(zzfkh.RENDERER, listenableFuture).zze(new zzfjq() { // from class: com.google.android.gms.internal.ads.zzcuu
            @Override // com.google.android.gms.internal.ads.zzfjq
            public final Object zza(Object obj) {
                zzffz zzffzVar = (zzffz) obj;
                zzcvd.this.zzd(zzffzVar);
                return zzffzVar;
            }
        }).zzf(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfx)).booleanValue()) {
            zzf = zzf.zzi(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfz)).intValue(), TimeUnit.SECONDS);
        }
        return zzf.zza();
    }

    public final ListenableFuture zzj() {
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzb.zzd;
        if (zzlVar.zzx != null || zzlVar.zzs != null) {
            zzfkn zzfknVar = this.zzc;
            zzdzr zzdzrVar = this.zza;
            return zzfjx.zzc(zzdzrVar.zza(), zzfkh.PRELOADED_LOADER, zzfknVar).zza();
        }
        return zzk(this.zzi.zzc());
    }

    public final ListenableFuture zzk(final ListenableFuture listenableFuture) {
        if (this.zzg != null) {
            return zzfjx.zzc(zzgee.zzh(this.zzg), zzfkh.SERVER_TRANSACTION, this.zzc).zza();
        }
        com.google.android.gms.ads.internal.zzu.zzc().zzj();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlk)).booleanValue() || ((Boolean) zzbfy.zzc.zze()).booleanValue()) {
            zzfke zzb = this.zzc.zzb(zzfkh.SERVER_TRANSACTION, listenableFuture);
            final zzeai zzeaiVar = this.zzk;
            Objects.requireNonNull(zzeaiVar);
            return zzb.zzf(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzcva
                @Override // com.google.android.gms.internal.ads.zzgdl
                public final ListenableFuture zza(Object obj) {
                    return zzeai.this.zzb((zzbxd) obj);
                }
            }).zza();
        }
        final zzebo zzeboVar = this.zzm;
        Objects.requireNonNull(zzeboVar);
        final ListenableFuture zzn = zzgee.zzn(listenableFuture, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzcuv
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzebo.this.zza((zzbxd) obj);
            }
        }, this.zzj);
        zzfke zzb2 = this.zzc.zzb(zzfkh.BUILD_URL, zzn);
        final zzeay zzeayVar = this.zzh;
        Objects.requireNonNull(zzeayVar);
        final zzfjs zza = zzb2.zzf(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzcuw
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzeay.this.zzb((JSONObject) obj);
            }
        }).zza();
        return this.zzc.zza(zzfkh.SERVER_TRANSACTION, listenableFuture, zzn, zza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcux
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcvd.this.zzg(listenableFuture, zzn, zza);
            }
        }).zzf(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzcuy
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return (ListenableFuture) obj;
            }
        }).zza();
    }

    public final void zzl(zzffz zzffzVar) {
        this.zzg = zzffzVar;
    }
}
