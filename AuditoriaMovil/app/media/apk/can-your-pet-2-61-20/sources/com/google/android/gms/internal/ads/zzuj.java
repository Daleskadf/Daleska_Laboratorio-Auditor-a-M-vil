package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzuj implements zzvz {
    private final zzadm zza;
    private zzadf zzb;
    private zzadg zzc;

    public zzuj(zzadm zzadmVar) {
        this.zza = zzadmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final long zzb() {
        zzadg zzadgVar = this.zzc;
        if (zzadgVar != null) {
            return zzadgVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzc() {
        zzadf zzadfVar = this.zzb;
        if (zzadfVar != null && (zzadfVar instanceof zzais)) {
            ((zzais) zzadfVar).zza();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r6.zzf() != r11) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
        if (r6.zzf() != r11) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007c, code lost:
        r2 = false;
     */
    @Override // com.google.android.gms.internal.ads.zzvz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzu r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.zzadi r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzact r6 = new com.google.android.gms.internal.ads.zzact
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.zzc = r6
            com.google.android.gms.internal.ads.zzadf r8 = r7.zzb
            if (r8 == 0) goto L10
            return
        L10:
            com.google.android.gms.internal.ads.zzadm r8 = r7.zza
            com.google.android.gms.internal.ads.zzadf[] r8 = r8.zza(r9, r10)
            int r10 = r8.length
            com.google.android.gms.internal.ads.zzfzk r13 = com.google.android.gms.internal.ads.zzfzn.zzi(r10)
            r14 = 0
            r0 = 1
            if (r10 != r0) goto L25
            r8 = r8[r14]
            r7.zzb = r8
            goto Lce
        L25:
            r1 = 0
        L26:
            if (r1 >= r10) goto L88
            r2 = r8[r1]
            boolean r3 = r2.zzf(r6)     // Catch: java.lang.Throwable -> L59 java.io.EOFException -> L6e
            if (r3 == 0) goto L45
            r7.zzb = r2     // Catch: java.lang.Throwable -> L59 java.io.EOFException -> L6e
            if (r2 != 0) goto L3e
            long r1 = r6.zzf()
            int r10 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r10 != 0) goto L3d
            goto L3e
        L3d:
            r0 = 0
        L3e:
            com.google.android.gms.internal.ads.zzek.zzf(r0)
            r6.zzj()
            goto L88
        L45:
            java.util.List r2 = r2.zzc()     // Catch: java.lang.Throwable -> L59 java.io.EOFException -> L6e
            r13.zzh(r2)     // Catch: java.lang.Throwable -> L59 java.io.EOFException -> L6e
            com.google.android.gms.internal.ads.zzadf r2 = r7.zzb
            if (r2 != 0) goto L7e
            long r2 = r6.zzf()
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 != 0) goto L7c
            goto L7e
        L59:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzadf r9 = r7.zzb
            if (r9 != 0) goto L66
            long r9 = r6.zzf()
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L67
        L66:
            r14 = 1
        L67:
            com.google.android.gms.internal.ads.zzek.zzf(r14)
            r6.zzj()
            throw r8
        L6e:
            com.google.android.gms.internal.ads.zzadf r2 = r7.zzb
            if (r2 != 0) goto L7e
            long r2 = r6.zzf()
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 != 0) goto L7c
            goto L7e
        L7c:
            r2 = 0
            goto L7f
        L7e:
            r2 = 1
        L7f:
            com.google.android.gms.internal.ads.zzek.zzf(r2)
            r6.zzj()
            int r1 = r1 + 1
            goto L26
        L88:
            com.google.android.gms.internal.ads.zzadf r10 = r7.zzb
            if (r10 != 0) goto Lce
            com.google.android.gms.internal.ads.zzxl r10 = new com.google.android.gms.internal.ads.zzxl
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
        L93:
            int r12 = r8.length
            if (r14 >= r12) goto Laf
            r15 = r8[r14]
            java.lang.Class r15 = r15.getClass()
            java.lang.String r15 = r15.getSimpleName()
            r11.append(r15)
            int r12 = r12 + (-1)
            if (r14 >= r12) goto Lac
            java.lang.String r12 = ", "
            r11.append(r12)
        Lac:
            int r14 = r14 + 1
            goto L93
        Laf:
            java.lang.String r8 = r11.toString()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "None of the available extractors ("
            r11.<init>(r12)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            com.google.android.gms.internal.ads.zzfzn r11 = r13.zzi()
            r10.<init>(r8, r9, r11)
            throw r10
        Lce:
            com.google.android.gms.internal.ads.zzadf r8 = r7.zzb
            r8.zzd(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuj.zzd(com.google.android.gms.internal.ads.zzu, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.zzadi):void");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final int zza(zzaec zzaecVar) throws IOException {
        zzadf zzadfVar = this.zzb;
        zzadfVar.getClass();
        zzadg zzadgVar = this.zzc;
        zzadgVar.getClass();
        return zzadfVar.zzb(zzadgVar, zzaecVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzf(long j, long j2) {
        zzadf zzadfVar = this.zzb;
        zzadfVar.getClass();
        zzadfVar.zze(j, j2);
    }
}
