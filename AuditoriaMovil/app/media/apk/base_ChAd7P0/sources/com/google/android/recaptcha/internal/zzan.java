package com.google.android.recaptcha.internal;

import F6.D;
import F6.InterfaceC0105s;
import O6.a;
import O6.e;
import android.content.Context;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import l6.j;
import n6.d;
/* loaded from: classes.dex */
public final class zzan {
    public InterfaceC0105s zza;
    private final D zzb;
    private final zzek zzc;
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;
    private zzao zze = zzao.zza;
    private final a zzg = e.a();

    public zzan(Context context, D d7, zzek zzekVar, StandardIntegrityManager standardIntegrityManager, long j) {
        this.zzb = d7;
        this.zzc = zzekVar;
        this.zzd = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzi(n6.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzag
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzag r0 = (com.google.android.recaptcha.internal.zzag) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzag r0 = new com.google.android.recaptcha.internal.zzag
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.zza
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            org.slf4j.helpers.i.M(r7)
            goto L53
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            org.slf4j.helpers.i.M(r7)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r7 = com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.builder()
            long r4 = r6.zzf
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r7 = r7.setCloudProjectNumber(r4)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest r7 = r7.build()
            com.google.android.play.core.integrity.StandardIntegrityManager r2 = r6.zzd
            com.google.android.gms.tasks.Task r7 = r2.prepareIntegrityToken(r7)
            F6.K r7 = com.google.android.recaptcha.internal.zzbx.zza(r7)
            r0.zzc = r3
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzi(n6.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r7 != r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (r7 != r1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzj(java.lang.String r6, n6.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzah
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzah r0 = (com.google.android.recaptcha.internal.zzah) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzah r0 = new com.google.android.recaptcha.internal.zzah
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            org.slf4j.helpers.i.M(r7)
            goto L6d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.zzd
            org.slf4j.helpers.i.M(r7)
            goto L4b
        L38:
            org.slf4j.helpers.i.M(r7)
            F6.s r7 = r5.zzf()
            r0.zzd = r6
            r0.zzc = r4
            F6.t r7 = (F6.C0106t) r7
            java.lang.Object r7 = r7.j(r0)
            if (r7 == r1) goto L74
        L4b:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r7
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r2 = com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder()
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r6 = r2.setRequestHash(r6)
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest r6 = r6.build()
            com.google.android.gms.tasks.Task r6 = r7.request(r6)
            F6.K r6 = com.google.android.recaptcha.internal.zzbx.zza(r6)
            r7 = 0
            r0.zzd = r7
            r0.zzc = r3
            java.lang.Object r7 = r6.await(r0)
            if (r7 != r1) goto L6d
            goto L74
        L6d:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken) r7
            java.lang.String r6 = r7.token()
            return r6
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzj(java.lang.String, n6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzc(java.lang.String r7, n6.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzaf
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzaf r0 = (com.google.android.recaptcha.internal.zzaf) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzaf r0 = new com.google.android.recaptcha.internal.zzaf
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.zza
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            org.slf4j.helpers.i.M(r8)
            goto L74
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzan r2 = r0.zzd
            org.slf4j.helpers.i.M(r8)
            goto L67
        L3d:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzan r2 = r0.zzd
            org.slf4j.helpers.i.M(r8)     // Catch: java.lang.Exception -> L5a
            goto L56
        L45:
            org.slf4j.helpers.i.M(r8)
            r0.zzd = r6     // Catch: java.lang.Exception -> L59
            r0.zze = r7     // Catch: java.lang.Exception -> L59
            r0.zzc = r5     // Catch: java.lang.Exception -> L59
            java.lang.Object r8 = r6.zzj(r7, r0)     // Catch: java.lang.Exception -> L59
            if (r8 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L5a
            goto L76
        L59:
            r2 = r6
        L5a:
            r0.zzd = r2
            r0.zze = r7
            r0.zzc = r4
            java.lang.Object r8 = r2.zze(r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            r8 = 0
            r0.zzd = r8
            r0.zze = r8
            r0.zzc = r3
            java.lang.Object r8 = r2.zzj(r7, r0)
            if (r8 == r1) goto L77
        L74:
            java.lang.String r8 = (java.lang.String) r8
        L76:
            return r8
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzc(java.lang.String, n6.d):java.lang.Object");
    }

    public final Object zzd(long j, d dVar) {
        this.zzf = j;
        return j.f13876a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[Catch: all -> 0x00b2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b2, blocks: (B:20:0x0055, B:24:0x0065), top: B:35:0x0055 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zze(n6.d r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzak
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzak r0 = (com.google.android.recaptcha.internal.zzak) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzak r0 = new com.google.android.recaptcha.internal.zzak
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.zzb
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.zzd
            l6.j r3 = l6.j.f13876a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            org.slf4j.helpers.i.M(r14)
            goto Lb1
        L2d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L35:
            java.lang.Object r2 = r0.zza
            O6.a r2 = (O6.a) r2
            com.google.android.recaptcha.internal.zzan r6 = r0.zze
            org.slf4j.helpers.i.M(r14)
            goto L54
        L3f:
            org.slf4j.helpers.i.M(r14)
            O6.a r14 = r13.zzg
            r0.zze = r13
            r0.zza = r14
            r0.zzd = r5
            r2 = r14
            O6.d r2 = (O6.d) r2
            java.lang.Object r14 = r2.c(r0)
            if (r14 == r1) goto Lb9
            r6 = r13
        L54:
            r14 = 0
            com.google.android.recaptcha.internal.zzao r7 = r6.zze     // Catch: java.lang.Throwable -> Lb2
            com.google.android.recaptcha.internal.zzao r8 = com.google.android.recaptcha.internal.zzao.zza     // Catch: java.lang.Throwable -> Lb2
            boolean r7 = kotlin.jvm.internal.j.a(r7, r8)     // Catch: java.lang.Throwable -> Lb2
            if (r7 != 0) goto L65
            O6.d r2 = (O6.d) r2
            r2.e(r14)
            return r3
        L65:
            com.google.android.recaptcha.internal.zzao r7 = com.google.android.recaptcha.internal.zzao.zzb     // Catch: java.lang.Throwable -> Lb2
            r6.zze = r7     // Catch: java.lang.Throwable -> Lb2
            O6.d r2 = (O6.d) r2
            r2.e(r14)
            com.google.android.recaptcha.internal.zzek r2 = r6.zzc
            java.lang.String r7 = r2.zzd()
            r2.zzc(r7)
            r2.zzb(r4)
            r7 = 38
            com.google.android.recaptcha.internal.zzen r2 = r2.zzf(r7)
            F6.t r7 = F6.H.a()
            r6.zza = r7
            F6.D r7 = r6.zzb
            com.google.android.recaptcha.internal.zzam r8 = new com.google.android.recaptcha.internal.zzam
            r8.<init>(r6, r2, r14)
            r2 = 3
            F6.H.q(r7, r14, r8, r2)
            r0.zze = r14
            r0.zza = r14
            r0.zzd = r4
            boolean r14 = r6.zzh
            if (r14 != 0) goto Lae
            java.util.Timer r7 = new java.util.Timer
            r7.<init>()
            com.google.android.recaptcha.internal.zzai r8 = new com.google.android.recaptcha.internal.zzai
            r8.<init>(r6)
            r11 = 28800000(0x1b77400, double:1.42290906E-316)
            r9 = r11
            r7.schedule(r8, r9, r11)
            r6.zzh = r5
        Lae:
            if (r3 != r1) goto Lb1
            goto Lb9
        Lb1:
            return r3
        Lb2:
            r0 = move-exception
            O6.d r2 = (O6.d) r2
            r2.e(r14)
            throw r0
        Lb9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zze(n6.d):java.lang.Object");
    }

    public final InterfaceC0105s zzf() {
        InterfaceC0105s interfaceC0105s = this.zza;
        if (interfaceC0105s != null) {
            return interfaceC0105s;
        }
        return null;
    }
}
