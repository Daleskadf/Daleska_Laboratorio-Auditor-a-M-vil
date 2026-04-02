package com.google.android.gms.measurement.internal;

import android.net.Uri;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzkn implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ Uri zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ zzko zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkn(zzko zzkoVar, boolean z, Uri uri, String str, String str2) {
        this.zza = z;
        this.zzb = uri;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzkoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzko.zza(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
