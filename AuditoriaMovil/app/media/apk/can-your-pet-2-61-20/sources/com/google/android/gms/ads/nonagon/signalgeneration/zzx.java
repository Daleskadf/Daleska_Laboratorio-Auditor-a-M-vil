package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbfm;
import com.google.android.gms.internal.ads.zzcam;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzfkw;
import com.google.android.gms.internal.ads.zzflh;
import com.google.android.gms.internal.ads.zzgea;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes.dex */
final class zzx implements zzgea {
    final /* synthetic */ ListenableFuture zza;
    final /* synthetic */ zzcat zzb;
    final /* synthetic */ zzcam zzc;
    final /* synthetic */ zzfkw zzd;
    final /* synthetic */ zzab zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzx(zzab zzabVar, ListenableFuture listenableFuture, zzcat zzcatVar, zzcam zzcamVar, zzfkw zzfkwVar) {
        this.zza = listenableFuture;
        this.zzb = zzcatVar;
        this.zzc = zzcamVar;
        this.zzd = zzfkwVar;
        this.zze = zzabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) zzba.zzc().zza(zzbdz.zzhJ)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(th, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "SignalGeneratorImpl.generateSignals");
        }
        zzflh zzr = zzab.zzr(this.zza, this.zzb);
        if (((Boolean) zzbfm.zze.zze()).booleanValue() && zzr != null) {
            zzfkw zzfkwVar = this.zzd;
            zzfkwVar.zzh(th);
            zzfkwVar.zzg(false);
            zzr.zza(zzfkwVar);
            zzr.zzh();
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            this.zzc.zzb(message);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AtomicBoolean atomicBoolean;
        boolean z;
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        Context context;
        VersionInfoParcel versionInfoParcel;
        String str5;
        String str6;
        AtomicInteger atomicInteger;
        zzap zzapVar = (zzap) obj;
        zzflh zzr = zzab.zzr(this.zza, this.zzb);
        atomicBoolean = this.zze.zzH;
        atomicBoolean.set(true);
        if (!((Boolean) zzba.zzc().zza(zzbdz.zzhE)).booleanValue()) {
            try {
                this.zzc.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (!((Boolean) zzbfm.zze.zze()).booleanValue() || zzr == null) {
                return;
            }
            zzfkw zzfkwVar = this.zzd;
            zzfkwVar.zzc("QueryInfo generation has been disabled.");
            zzfkwVar.zzg(false);
            zzr.zza(zzfkwVar);
            zzr.zzh();
            return;
        }
        try {
            try {
                if (zzapVar == null) {
                    this.zzc.zzc(null, null, null);
                    this.zzd.zzg(true);
                    if (!((Boolean) zzbfm.zze.zze()).booleanValue() || zzr == null) {
                        return;
                    }
                    zzr.zza(this.zzd);
                    zzr.zzh();
                    return;
                }
                try {
                    if (TextUtils.isEmpty(new JSONObject(zzapVar.zzb).optString("request_id", ""))) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("The request ID is empty in request JSON.");
                        this.zzc.zzb("Internal error: request ID is empty in request JSON.");
                        zzfkw zzfkwVar2 = this.zzd;
                        zzfkwVar2.zzc("Request ID empty");
                        zzfkwVar2.zzg(false);
                        if (!((Boolean) zzbfm.zze.zze()).booleanValue() || zzr == null) {
                            return;
                        }
                        zzr.zza(this.zzd);
                        zzr.zzh();
                        return;
                    }
                    Bundle bundle = zzapVar.zzd;
                    zzab zzabVar = this.zze;
                    z = zzabVar.zzv;
                    if (z && bundle != null) {
                        str5 = zzabVar.zzx;
                        if (bundle.getInt(str5, -1) == -1) {
                            zzab zzabVar2 = this.zze;
                            str6 = zzabVar2.zzx;
                            atomicInteger = zzabVar2.zzy;
                            bundle.putInt(str6, atomicInteger.get());
                        }
                    }
                    zzab zzabVar3 = this.zze;
                    z2 = zzabVar3.zzu;
                    if (z2 && bundle != null) {
                        str = zzabVar3.zzw;
                        if (TextUtils.isEmpty(bundle.getString(str))) {
                            str2 = this.zze.zzA;
                            if (TextUtils.isEmpty(str2)) {
                                zzab zzabVar4 = this.zze;
                                com.google.android.gms.ads.internal.util.zzt zzp = com.google.android.gms.ads.internal.zzu.zzp();
                                zzab zzabVar5 = this.zze;
                                context = zzabVar5.zzg;
                                versionInfoParcel = zzabVar5.zzz;
                                zzabVar4.zzA = zzp.zzc(context, versionInfoParcel.afmaVersion);
                            }
                            zzab zzabVar6 = this.zze;
                            str3 = zzabVar6.zzw;
                            str4 = zzabVar6.zzA;
                            bundle.putString(str3, str4);
                        }
                    }
                    this.zzc.zzc(zzapVar.zza, zzapVar.zzb, bundle);
                    this.zzd.zzg(true);
                    if (!((Boolean) zzbfm.zze.zze()).booleanValue() || zzr == null) {
                        return;
                    }
                    zzr.zza(this.zzd);
                    zzr.zzh();
                } catch (JSONException e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to create JSON object from the request string.");
                    zzcam zzcamVar = this.zzc;
                    String obj2 = e2.toString();
                    zzcamVar.zzb("Internal error for request JSON: " + obj2);
                    zzfkw zzfkwVar3 = this.zzd;
                    zzfkwVar3.zzh(e2);
                    zzfkwVar3.zzg(false);
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(e2, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) zzbfm.zze.zze()).booleanValue() || zzr == null) {
                        return;
                    }
                    zzr.zza(this.zzd);
                    zzr.zzh();
                }
            } catch (RemoteException e3) {
                zzfkw zzfkwVar4 = this.zzd;
                zzfkwVar4.zzh(e3);
                zzfkwVar4.zzg(false);
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e3);
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbfm.zze.zze()).booleanValue() || zzr == null) {
                    return;
                }
                zzr.zza(this.zzd);
                zzr.zzh();
            }
        } catch (Throwable th) {
            if (((Boolean) zzbfm.zze.zze()).booleanValue() && zzr != null) {
                zzr.zza(this.zzd);
                zzr.zzh();
            }
            throw th;
        }
    }
}
