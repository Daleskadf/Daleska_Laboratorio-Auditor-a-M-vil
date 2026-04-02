package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbmv implements zzaqj {
    private volatile zzbmi zza;
    private final Context zzb;

    public zzbmv(Context context) {
        this.zzb = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzc(zzbmv zzbmvVar) {
        if (zzbmvVar.zza == null) {
            return;
        }
        zzbmvVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    @Override // com.google.android.gms.internal.ads.zzaqj
    public final zzaqm zza(zzaqq zzaqqVar) throws zzaqz {
        Parcelable.Creator<zzbmj> creator = zzbmj.CREATOR;
        Map zzl = zzaqqVar.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        zzbmj zzbmjVar = new zzbmj(zzaqqVar.zzk(), strArr, strArr2);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        try {
            zzcbw zzcbwVar = new zzcbw();
            this.zza = new zzbmi(this.zzb, com.google.android.gms.ads.internal.zzu.zzt().zzb(), new zzbmt(this, zzcbwVar), new zzbmu(this, zzcbwVar));
            this.zza.checkAvailabilityAndConnect();
            ListenableFuture zzo = zzgee.zzo(zzgee.zzn(zzcbwVar, new zzbmr(this, zzbmjVar), zzcbr.zza), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzev)).intValue(), TimeUnit.MILLISECONDS, zzcbr.zzd);
            zzo.addListener(new zzbms(this), zzcbr.zza);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzo.get();
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime;
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + elapsedRealtime2 + "ms");
            zzbml zzbmlVar = (zzbml) new zzbxb(parcelFileDescriptor).zza(zzbml.CREATOR);
            if (zzbmlVar == null) {
                return null;
            }
            if (zzbmlVar.zza) {
                throw new zzaqz(zzbmlVar.zzb);
            }
            if (zzbmlVar.zze.length != zzbmlVar.zzf.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String[] strArr3 = zzbmlVar.zze;
                if (i < strArr3.length) {
                    hashMap.put(strArr3[i], zzbmlVar.zzf[i]);
                    i++;
                } else {
                    return new zzaqm(zzbmlVar.zzc, zzbmlVar.zzd, hashMap, zzbmlVar.zzg, zzbmlVar.zzh);
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            throw th;
        }
    }
}
