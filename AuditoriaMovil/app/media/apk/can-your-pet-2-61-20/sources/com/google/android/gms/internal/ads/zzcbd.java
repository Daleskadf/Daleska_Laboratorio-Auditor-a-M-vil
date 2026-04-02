package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcbd extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzcbh zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbd(zzcbh zzcbhVar) {
        this.zza = zzcbhVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        Context context;
        VersionInfoParcel versionInfoParcel;
        Object obj;
        zzbee zzbeeVar;
        zzcbh zzcbhVar = this.zza;
        context = zzcbhVar.zze;
        versionInfoParcel = zzcbhVar.zzf;
        zzbec zzbecVar = new zzbec(context, versionInfoParcel.afmaVersion);
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.zzu.zze();
                zzbeeVar = this.zza.zzh;
                zzbef.zza(zzbeeVar, zzbecVar);
            } catch (IllegalArgumentException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}
