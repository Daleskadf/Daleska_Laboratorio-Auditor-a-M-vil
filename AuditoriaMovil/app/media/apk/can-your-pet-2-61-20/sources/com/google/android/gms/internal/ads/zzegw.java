package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzegw implements zzdiu {
    private final VersionInfoParcel zza;
    private final ListenableFuture zzb;
    private final zzffn zzc;
    private final zzcgm zzd;
    private final zzfgi zze;
    private final zzblb zzf;
    private final boolean zzg;
    private final zzefo zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzegw(VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzffn zzffnVar, zzcgm zzcgmVar, zzfgi zzfgiVar, boolean z, zzblb zzblbVar, zzefo zzefoVar) {
        this.zza = versionInfoParcel;
        this.zzb = listenableFuture;
        this.zzc = zzffnVar;
        this.zzd = zzcgmVar;
        this.zze = zzfgiVar;
        this.zzg = z;
        this.zzf = zzblbVar;
        this.zzh = zzefoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    @Override // com.google.android.gms.internal.ads.zzdiu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(boolean r19, android.content.Context r20, com.google.android.gms.internal.ads.zzczd r21) {
        /*
            r18 = this;
            r0 = r18
            com.google.common.util.concurrent.ListenableFuture r1 = r0.zzb
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzgee.zzq(r1)
            com.google.android.gms.internal.ads.zzcqx r1 = (com.google.android.gms.internal.ads.zzcqx) r1
            com.google.android.gms.internal.ads.zzcgm r2 = r0.zzd
            r3 = 1
            r2.zzao(r3)
            com.google.android.gms.ads.internal.zzk r2 = new com.google.android.gms.ads.internal.zzk
            boolean r4 = r0.zzg
            if (r4 == 0) goto L1e
            com.google.android.gms.internal.ads.zzblb r4 = r0.zzf
            boolean r4 = r4.zze(r3)
            r5 = r4
            goto L1f
        L1e:
            r5 = 1
        L1f:
            boolean r4 = r0.zzg
            if (r4 == 0) goto L2b
            com.google.android.gms.internal.ads.zzblb r6 = r0.zzf
            boolean r6 = r6.zzd()
            r7 = r6
            goto L2d
        L2b:
            r6 = 0
            r7 = 0
        L2d:
            if (r4 == 0) goto L37
            com.google.android.gms.internal.ads.zzblb r4 = r0.zzf
            float r4 = r4.zza()
            r8 = r4
            goto L39
        L37:
            r4 = 0
            r8 = 0
        L39:
            r6 = 1
            r9 = -1
            com.google.android.gms.internal.ads.zzffn r4 = r0.zzc
            boolean r11 = r4.zzP
            r12 = 0
            r4 = r2
            r10 = r19
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r21 == 0) goto L4b
            r21.zzf()
        L4b:
            com.google.android.gms.ads.internal.zzu.zzi()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r15 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.zzdij r6 = r1.zzg()
            com.google.android.gms.internal.ads.zzcgm r8 = r0.zzd
            com.google.android.gms.internal.ads.zzffn r1 = r0.zzc
            int r1 = r1.zzR
            r4 = -1
            if (r1 == r4) goto L5f
        L5d:
            r9 = r1
            goto L7c
        L5f:
            com.google.android.gms.internal.ads.zzfgi r1 = r0.zze
            com.google.android.gms.ads.internal.client.zzw r1 = r1.zzj
            if (r1 == 0) goto L72
            int r1 = r1.zza
            if (r1 != r3) goto L6c
            r1 = 7
            r9 = 7
            goto L7c
        L6c:
            r4 = 2
            if (r1 != r4) goto L72
            r1 = 6
            r9 = 6
            goto L7c
        L72:
            java.lang.String r1 = "Error setting app open orientation; no targeting orientation available."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r1)
            com.google.android.gms.internal.ads.zzffn r1 = r0.zzc
            int r1 = r1.zzR
            goto L5d
        L7c:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r10 = r0.zza
            com.google.android.gms.internal.ads.zzffn r1 = r0.zzc
            java.lang.String r11 = r1.zzC
            com.google.android.gms.internal.ads.zzffs r4 = r1.zzt
            java.lang.String r13 = r4.zzb
            java.lang.String r14 = r4.zza
            com.google.android.gms.internal.ads.zzfgi r4 = r0.zze
            boolean r1 = r1.zzaj
            if (r1 == 0) goto L91
            com.google.android.gms.internal.ads.zzefo r1 = r0.zzh
            goto L92
        L91:
            r1 = 0
        L92:
            r17 = r1
            r5 = 0
            r7 = 0
            java.lang.String r1 = r4.zzf
            r4 = r15
            r12 = r2
            r2 = r15
            r15 = r1
            r16 = r21
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r20
            com.google.android.gms.ads.internal.overlay.zzn.zza(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegw.zza(boolean, android.content.Context, com.google.android.gms.internal.ads.zzczd):void");
    }
}
