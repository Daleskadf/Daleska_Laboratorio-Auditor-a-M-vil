package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.gtm.zzgb;
import com.google.android.gms.internal.gtm.zzro;
import java.io.File;
import java.util.concurrent.ExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
public final class zzel implements zzaj {
    private final Context zza;
    private final String zzb;
    private final ExecutorService zzc = zzgb.zza().zza(2);
    private zzdf zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzel(Context context, String str) {
        this.zza = context;
        this.zzb = str;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final synchronized void release() {
        this.zzc.shutdown();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c0 A[Catch: IOException -> 0x00ed, TryCatch #2 {IOException -> 0x00ed, blocks: (B:5:0x0037, B:6:0x003f, B:7:0x0058, B:9:0x005e, B:10:0x00ab, B:16:0x00c0, B:18:0x00c8, B:19:0x00cc, B:21:0x00e1, B:22:0x00e7, B:12:0x00b0, B:13:0x00b6), top: B:28:0x0037, inners: #6, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8 A[Catch: IOException -> 0x00ed, TRY_LEAVE, TryCatch #2 {IOException -> 0x00ed, blocks: (B:5:0x0037, B:6:0x003f, B:7:0x0058, B:9:0x005e, B:10:0x00ab, B:16:0x00c0, B:18:0x00c8, B:19:0x00cc, B:21:0x00e1, B:22:0x00e7, B:12:0x00b0, B:13:0x00b6), top: B:28:0x0037, inners: #6, #5 }] */
    @Override // com.google.android.gms.tagmanager.zzaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.gtm.zzrv zza(int r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzel.zza(int):com.google.android.gms.internal.gtm.zzrv");
    }

    @Override // com.google.android.gms.tagmanager.zzaj
    public final void zzb() {
        this.zzc.execute(new zzej(this));
    }

    @Override // com.google.android.gms.tagmanager.zzaj
    public final void zzc(zzro zzroVar) {
        this.zzc.execute(new zzek(this, zzroVar));
    }

    @Override // com.google.android.gms.tagmanager.zzaj
    public final void zzd(zzdf zzdfVar) {
        this.zzd = zzdfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File zze() {
        return new File(this.zza.getDir("google_tagmanager", 0), "resource_".concat(String.valueOf(this.zzb)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r2 == 3) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf() {
        /*
            r10 = this;
            java.lang.String r0 = "Error closing stream for reading resource from disk"
            java.lang.String r1 = "GoogleTagManager"
            com.google.android.gms.tagmanager.zzdf r2 = r10.zzd
            if (r2 == 0) goto Ld8
            com.google.android.gms.tagmanager.zzbf r2 = com.google.android.gms.tagmanager.zzdg.zzb
            java.lang.String r3 = "Attempting to load resource from disk"
            r2.zzd(r3)
            com.google.android.gms.tagmanager.zzdz r2 = com.google.android.gms.tagmanager.zzdz.zza()
            int r2 = r2.zze()
            r3 = 1
            r4 = 2
            if (r2 == r4) goto L26
            com.google.android.gms.tagmanager.zzdz r2 = com.google.android.gms.tagmanager.zzdz.zza()
            int r2 = r2.zze()
            r5 = 3
            if (r2 != r5) goto L36
        L26:
            java.lang.String r2 = r10.zzb
            com.google.android.gms.tagmanager.zzdz r5 = com.google.android.gms.tagmanager.zzdz.zza()
            java.lang.String r5 = r5.zzc()
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto Ld2
        L36:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> Lc5
            java.io.File r5 = r10.zze()     // Catch: java.io.FileNotFoundException -> Lc5
            r2.<init>(r5)     // Catch: java.io.FileNotFoundException -> Lc5
            com.google.android.gms.internal.gtm.zzxf r5 = com.google.android.gms.internal.gtm.zzxf.zza()     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
            com.google.android.gms.internal.gtm.zzro r5 = com.google.android.gms.internal.gtm.zzro.zzg(r2, r5)     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
            boolean r6 = r5.zzk()     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
            if (r6 != 0) goto L5c
            boolean r6 = r5.zzl()     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
            if (r6 == 0) goto L54
            goto L5c
        L54:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
            java.lang.String r5 = "Resource and SupplementedResource are NULL."
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
            throw r3     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
        L5c:
            com.google.android.gms.tagmanager.zzdf r6 = r10.zzd     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
            boolean r7 = r5.zzl()     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
            if (r7 == 0) goto L6f
            com.google.android.gms.internal.gtm.zzak r7 = r5.zzd()     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
            com.google.android.gms.internal.gtm.zzxp r7 = r7.zzZ()     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
            com.google.android.gms.internal.gtm.zzaj r7 = (com.google.android.gms.internal.gtm.zzaj) r7     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
            goto L85
        L6f:
            com.google.android.gms.internal.gtm.zzac r7 = r5.zzc()     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
            com.google.android.gms.internal.gtm.zzaj r8 = com.google.android.gms.internal.gtm.zzak.zzd()     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
            r8.zzc(r7)     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
            r8.zza()     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
            java.lang.String r7 = r7.zzn()     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
            r8.zzb(r7)     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
            r7 = r8
        L85:
            com.google.android.gms.tagmanager.zzad r6 = (com.google.android.gms.tagmanager.zzad) r6     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
            com.google.android.gms.tagmanager.zzak r6 = r6.zza     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
            com.google.android.gms.internal.gtm.zzxv r7 = r7.zzB()     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
            com.google.android.gms.internal.gtm.zzak r7 = (com.google.android.gms.internal.gtm.zzak) r7     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
            long r8 = r5.zza()     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
            com.google.android.gms.tagmanager.zzak.zzk(r6, r7, r8, r3)     // Catch: java.lang.Throwable -> L97 java.lang.IllegalArgumentException -> L99 java.io.IOException -> La7
            goto La3
        L97:
            r3 = move-exception
            goto Lbd
        L99:
            com.google.android.gms.tagmanager.zzdf r3 = r10.zzd     // Catch: java.lang.Throwable -> L97
            r3.zza(r4)     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = "Failed to read the resource from disk. The resource is inconsistent"
            android.util.Log.w(r1, r3)     // Catch: java.lang.Throwable -> L97
        La3:
            r2.close()     // Catch: java.io.IOException -> Lb2
            goto Lb5
        La7:
            com.google.android.gms.tagmanager.zzdf r3 = r10.zzd     // Catch: java.lang.Throwable -> L97
            r3.zza(r4)     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = "Failed to read the resource from disk"
            android.util.Log.w(r1, r3)     // Catch: java.lang.Throwable -> L97
            goto La3
        Lb2:
            android.util.Log.w(r1, r0)
        Lb5:
            com.google.android.gms.tagmanager.zzbf r0 = com.google.android.gms.tagmanager.zzdg.zzb
            java.lang.String r1 = "The Disk resource was successfully read."
            r0.zzd(r1)
            return
        Lbd:
            r2.close()     // Catch: java.io.IOException -> Lc1
            goto Lc4
        Lc1:
            android.util.Log.w(r1, r0)
        Lc4:
            throw r3
        Lc5:
            com.google.android.gms.tagmanager.zzbf r0 = com.google.android.gms.tagmanager.zzdg.zzb
            java.lang.String r1 = "Failed to find the resource in the disk"
            r0.zza(r1)
            com.google.android.gms.tagmanager.zzdf r0 = r10.zzd
            r0.zza(r3)
            return
        Ld2:
            com.google.android.gms.tagmanager.zzdf r0 = r10.zzd
            r0.zza(r3)
            return
        Ld8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Callback must be set before execute"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzel.zzf():void");
    }
}
