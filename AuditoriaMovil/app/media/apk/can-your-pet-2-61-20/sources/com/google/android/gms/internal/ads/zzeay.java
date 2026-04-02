package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeay {
    private final zzgep zza;
    private final zzeac zzb;
    private final zzhip zzc;
    private final zzflk zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;

    public zzeay(zzgep zzgepVar, zzeac zzeacVar, zzhip zzhipVar, zzflk zzflkVar, Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgepVar;
        this.zzb = zzeacVar;
        this.zzc = zzhipVar;
        this.zzd = zzflkVar;
        this.zze = context;
        this.zzf = versionInfoParcel;
    }

    private final ListenableFuture zzh(final zzbxd zzbxdVar, zzeax zzeaxVar, final zzeax zzeaxVar2, final zzgdl zzgdlVar) {
        ListenableFuture zzf;
        String str = zzbxdVar.zzd;
        com.google.android.gms.ads.internal.zzu.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzC(str)) {
            zzf = zzgee.zzg(new zzeal(1));
        } else {
            zzf = zzgee.zzf(zzeaxVar.zza(zzbxdVar), ExecutionException.class, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzeaw
                @Override // com.google.android.gms.internal.ads.zzgdl
                public final ListenableFuture zza(Object obj) {
                    ExecutionException executionException = (ExecutionException) obj;
                    Throwable cause = executionException.getCause();
                    Throwable th = executionException;
                    if (cause != null) {
                        th = executionException.getCause();
                    }
                    return zzgee.zzg(th);
                }
            }, this.zza);
        }
        return zzgee.zzf(zzgee.zzn(zzgee.zzn(zzgdv.zzu(zzf), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzeau
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzgee.zzh(((zzeam) obj).zzb());
            }
        }, this.zza), zzgdlVar, this.zza), zzeal.class, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzeav
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzeay.this.zzc(zzeaxVar2, zzbxdVar, zzgdlVar, (zzeal) obj);
            }
        }, this.zza);
    }

    public final ListenableFuture zza(final zzbxd zzbxdVar) {
        zzgdl zzgdlVar = new zzgdl() { // from class: com.google.android.gms.internal.ads.zzear
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                String str = new String(zzgbx.zzb((InputStream) obj), zzfwd.zzc);
                zzbxd zzbxdVar2 = zzbxd.this;
                zzbxdVar2.zzj = str;
                return zzgee.zzh(zzbxdVar2);
            }
        };
        final zzeac zzeacVar = this.zzb;
        Objects.requireNonNull(zzeacVar);
        return zzh(zzbxdVar, new zzeax() { // from class: com.google.android.gms.internal.ads.zzeas
            @Override // com.google.android.gms.internal.ads.zzeax
            public final ListenableFuture zza(zzbxd zzbxdVar2) {
                return zzeac.this.zzb(zzbxdVar2);
            }
        }, new zzeax() { // from class: com.google.android.gms.internal.ads.zzeat
            @Override // com.google.android.gms.internal.ads.zzeax
            public final ListenableFuture zza(zzbxd zzbxdVar2) {
                return zzeay.this.zzd(zzbxdVar2);
            }
        }, zzgdlVar);
    }

    public final ListenableFuture zzb(JSONObject jSONObject) {
        return zzgee.zzn(zzgdv.zzu(zzgee.zzh(jSONObject)), com.google.android.gms.ads.internal.zzu.zzf().zza(this.zze, this.zzf, this.zzd).zza("AFMA_getAdDictionary", zzbpn.zza, new zzbpi() { // from class: com.google.android.gms.internal.ads.zzean
            @Override // com.google.android.gms.internal.ads.zzbpi
            public final Object zza(JSONObject jSONObject2) {
                return new zzbxg(jSONObject2);
            }
        }), this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(zzeax zzeaxVar, zzbxd zzbxdVar, zzgdl zzgdlVar, zzeal zzealVar) throws Exception {
        return zzgee.zzn(zzeaxVar.zza(zzbxdVar), zzgdlVar, this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzd(zzbxd zzbxdVar) {
        return ((zzecu) this.zzc.zzb()).zzb(zzbxdVar, Binder.getCallingUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zze(zzbxd zzbxdVar) {
        return this.zzb.zzc(zzbxdVar.zzh);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzf(zzbxd zzbxdVar) {
        return ((zzecu) this.zzc.zzb()).zzi(zzbxdVar.zzh);
    }

    public final ListenableFuture zzg(zzbxd zzbxdVar) {
        return zzh(zzbxdVar, new zzeax() { // from class: com.google.android.gms.internal.ads.zzeap
            @Override // com.google.android.gms.internal.ads.zzeax
            public final ListenableFuture zza(zzbxd zzbxdVar2) {
                return zzeay.this.zze(zzbxdVar2);
            }
        }, new zzeax() { // from class: com.google.android.gms.internal.ads.zzeaq
            @Override // com.google.android.gms.internal.ads.zzeax
            public final ListenableFuture zza(zzbxd zzbxdVar2) {
                return zzeay.this.zzf(zzbxdVar2);
            }
        }, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzeao
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                return zzgee.zzh(null);
            }
        });
    }
}
