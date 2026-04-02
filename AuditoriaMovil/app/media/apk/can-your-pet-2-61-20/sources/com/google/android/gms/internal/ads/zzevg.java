package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzevg implements zzewr {
    private final Context zza;
    private final zzgep zzb;
    private final zzfgi zzc;
    private final VersionInfoParcel zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzevg(Context context, zzgep zzgepVar, zzfgi zzfgiVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzgepVar;
        this.zzc = zzfgiVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 53;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzevg.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdz.zzcP)).booleanValue() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
        r1 = com.google.android.gms.internal.ads.zzftr.zzj(r0).zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdz.zzdb)).longValue(), com.google.android.gms.ads.internal.zzu.zzo().zzi().zzO());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bb, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdz.zzcO)).booleanValue() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cf, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdz.zzcQ)).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d1, code lost:
        r0 = com.google.android.gms.internal.ads.zzfts.zzi(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e9, code lost:
        if (r8.zzd.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdz.zzcX)).intValue()) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00eb, code lost:
        r2 = r0.zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdz.zzdc)).longValue(), com.google.android.gms.ads.internal.zzu.zzo().zzi().zzO());
        r3 = r0.zzo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x010f, code lost:
        r6 = r0.zzp();
        r4 = r2;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdz.zzcN)).booleanValue() == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzevh zzc() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzevg.zzc():com.google.android.gms.internal.ads.zzevh");
    }
}
