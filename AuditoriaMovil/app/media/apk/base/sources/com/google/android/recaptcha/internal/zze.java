package com.google.android.recaptcha.internal;

import l6.j;
import n6.d;
/* loaded from: classes.dex */
public abstract class zze {
    private boolean zza;

    public zzen zza(String str) {
        throw null;
    }

    public zzen zzb() {
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(1:(2:11|12)(2:14|15))(3:16|17|(1:19)(1:12)))(4:20|21|22|23))(4:41|42|43|(1:45)(1:46))|24|25|(1:27)|12))|50|6|(0)(0)|24|25|(0)|12) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
        r10 = r0;
        r16 = r3;
        r4 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f A[Catch: Exception -> 0x0093, TRY_LEAVE, TryCatch #2 {Exception -> 0x0093, blocks: (B:27:0x0084, B:29:0x008f), top: B:50:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3 A[PHI: r0 
      PHI: (r0v14 java.lang.Object) = (r0v12 java.lang.Object), (r0v12 java.lang.Object), (r0v13 java.lang.Object), (r0v1 java.lang.Object) binds: [B:28:0x008d, B:29:0x008f, B:42:0x00d0, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzc(java.lang.String r19, long r20, n6.d r22) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zzc(java.lang.String, long, n6.d):java.lang.Object");
    }

    public abstract Object zzd(String str, d dVar);

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
        if (r13 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082 A[Catch: Exception -> 0x0051, TRY_LEAVE, TryCatch #1 {Exception -> 0x0051, blocks: (B:18:0x004d, B:29:0x0077, B:31:0x0082), top: B:50:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zze(long r10, com.google.android.recaptcha.internal.zzsc r12, n6.d r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzc
            if (r0 == 0) goto L13
            r0 = r13
            com.google.android.recaptcha.internal.zzc r0 = (com.google.android.recaptcha.internal.zzc) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzc r0 = new com.google.android.recaptcha.internal.zzc
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.zzb
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.zzd
            l6.j r3 = l6.j.f13876a
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L53
            if (r2 == r7) goto L47
            if (r2 == r6) goto L3d
            if (r2 != r5) goto L35
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zzbd r10 = (com.google.android.recaptcha.internal.zzbd) r10
            org.slf4j.helpers.i.M(r13)
            goto Lb0
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            com.google.android.recaptcha.internal.zzen r10 = r0.zze
            java.lang.Object r11 = r0.zza
            com.google.android.recaptcha.internal.zze r11 = (com.google.android.recaptcha.internal.zze) r11
            org.slf4j.helpers.i.M(r13)
            goto L9b
        L47:
            com.google.android.recaptcha.internal.zzen r10 = r0.zze
            java.lang.Object r11 = r0.zza
            com.google.android.recaptcha.internal.zze r11 = (com.google.android.recaptcha.internal.zze) r11
            org.slf4j.helpers.i.M(r13)     // Catch: java.lang.Exception -> L51
            goto L77
        L51:
            r12 = move-exception
            goto L8c
        L53:
            org.slf4j.helpers.i.M(r13)
            com.google.android.recaptcha.internal.zzen r13 = r9.zzb()
            boolean r2 = r9.zza
            if (r2 == 0) goto L62
            r13.zza()
            return r3
        L62:
            com.google.android.recaptcha.internal.zzd r2 = new com.google.android.recaptcha.internal.zzd     // Catch: java.lang.Exception -> L88
            r2.<init>(r9, r12, r4)     // Catch: java.lang.Exception -> L88
            r0.zza = r9     // Catch: java.lang.Exception -> L88
            r0.zze = r13     // Catch: java.lang.Exception -> L88
            r0.zzd = r7     // Catch: java.lang.Exception -> L88
            java.lang.Object r10 = F6.H.z(r10, r2, r0)     // Catch: java.lang.Exception -> L88
            if (r10 == r1) goto Lb5
            r11 = r9
            r8 = r13
            r13 = r10
            r10 = r8
        L77:
            l6.f r13 = (l6.f) r13     // Catch: java.lang.Exception -> L51
            java.lang.Object r12 = r13.f13868a     // Catch: java.lang.Exception -> L51
            org.slf4j.helpers.i.M(r12)     // Catch: java.lang.Exception -> L51
            r11.zza = r7     // Catch: java.lang.Exception -> L51
            if (r10 == 0) goto L85
            r10.zza()     // Catch: java.lang.Exception -> L51
        L85:
            return r3
        L86:
            r12 = r10
            goto L8a
        L88:
            r10 = move-exception
            goto L86
        L8a:
            r11 = r9
            r10 = r13
        L8c:
            r13 = 0
            r11.zza = r13
            r0.zza = r11
            r0.zze = r10
            r0.zzd = r6
            java.lang.Object r13 = r11.zzj(r12, r0)
            if (r13 == r1) goto Lb5
        L9b:
            r12 = r13
            com.google.android.recaptcha.internal.zzbd r12 = (com.google.android.recaptcha.internal.zzbd) r12
            if (r10 == 0) goto La3
            r10.zzb(r12)
        La3:
            r0.zza = r12
            r0.zze = r4
            r0.zzd = r5
            java.lang.Object r10 = r11.zzg(r12, r0)
            if (r10 == r1) goto Lb5
            r10 = r12
        Lb0:
            l6.e r10 = org.slf4j.helpers.i.j(r10)
            return r10
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zze(long, com.google.android.recaptcha.internal.zzsc, n6.d):java.lang.Object");
    }

    public abstract Object zzf(String str, d dVar);

    public Object zzg(zzbd zzbdVar, d dVar) {
        return j.f13876a;
    }

    public abstract Object zzh(zzsc zzscVar, d dVar);

    public Object zzi(String str, long j, Exception exc, d dVar) {
        return j.f13876a;
    }

    public Object zzj(Exception exc, d dVar) {
        return zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzap, exc.getMessage()));
    }

    public void zzk(zzsr zzsrVar) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
