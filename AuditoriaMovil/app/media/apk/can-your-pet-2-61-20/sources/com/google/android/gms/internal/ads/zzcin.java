package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcin {
    private final VersionInfoParcel zza;
    private final Context zzb;
    private final long zzc;
    private final WeakReference zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcin(zzcil zzcilVar, zzcim zzcimVar) {
        VersionInfoParcel versionInfoParcel;
        Context context;
        WeakReference weakReference;
        long j;
        versionInfoParcel = zzcilVar.zza;
        this.zza = versionInfoParcel;
        context = zzcilVar.zzb;
        this.zzb = context;
        weakReference = zzcilVar.zzd;
        this.zzd = weakReference;
        j = zzcilVar.zzc;
        this.zzc = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zza() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zzb() {
        return this.zzb;
    }

    public final com.google.android.gms.ads.internal.zzj zzc() {
        return new com.google.android.gms.ads.internal.zzj(this.zzb, this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzbgm zzd() {
        return new zzbgm(this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final VersionInfoParcel zze() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzf() {
        return com.google.android.gms.ads.internal.zzu.zzp().zzc(this.zzb, this.zza.afmaVersion);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final WeakReference zzg() {
        return this.zzd;
    }
}
