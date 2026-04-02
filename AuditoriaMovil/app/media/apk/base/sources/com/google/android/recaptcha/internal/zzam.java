package com.google.android.recaptcha.internal;

import F6.D;
import l6.j;
import n6.d;
import p6.i;
import w6.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzam extends i implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzan zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(zzan zzanVar, zzen zzenVar, d dVar) {
        super(2, dVar);
        this.zzc = zzanVar;
        this.zzd = zzenVar;
    }

    @Override // p6.AbstractC1698a
    public final d create(Object obj, d dVar) {
        return new zzam(this.zzc, this.zzd, dVar);
    }

    @Override // w6.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzam) create((D) obj, (d) obj2)).invokeSuspend(j.f13876a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.internal.r, java.lang.Object] */
    @Override // p6.AbstractC1698a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            o6.a r0 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r1 = r6.zzb
            if (r1 == 0) goto L10
            java.lang.Object r0 = r6.zza
            kotlin.jvm.internal.r r0 = (kotlin.jvm.internal.r) r0
            org.slf4j.helpers.i.M(r7)     // Catch: java.lang.Exception -> Le
            goto L60
        Le:
            r7 = move-exception
            goto L35
        L10:
            org.slf4j.helpers.i.M(r7)
            kotlin.jvm.internal.r r7 = new kotlin.jvm.internal.r
            r7.<init>()
            com.google.android.recaptcha.internal.zzal r1 = new com.google.android.recaptcha.internal.zzal     // Catch: java.lang.Exception -> L31
            com.google.android.recaptcha.internal.zzan r2 = r6.zzc     // Catch: java.lang.Exception -> L31
            com.google.android.recaptcha.internal.zzen r3 = r6.zzd     // Catch: java.lang.Exception -> L31
            r4 = 0
            r1.<init>(r2, r3, r7, r4)     // Catch: java.lang.Exception -> L31
            r6.zza = r7     // Catch: java.lang.Exception -> L31
            r2 = 1
            r6.zzb = r2     // Catch: java.lang.Exception -> L31
            r2 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r7 = F6.H.z(r2, r1, r6)     // Catch: java.lang.Exception -> L31
            if (r7 != r0) goto L60
            return r0
        L31:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L35:
            com.google.android.recaptcha.internal.zzan r1 = r6.zzc
            F6.s r1 = r1.zzf()
            java.lang.Object r0 = r0.f13796a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 != 0) goto L42
            r0 = r7
        L42:
            F6.t r1 = (F6.C0106t) r1
            r1.O(r0)
            com.google.android.recaptcha.internal.zzan r0 = r6.zzc
            com.google.android.recaptcha.internal.zzao r1 = com.google.android.recaptcha.internal.zzao.zza
            com.google.android.recaptcha.internal.zzan.zzh(r0, r1)
            com.google.android.recaptcha.internal.zzen r0 = r6.zzd
            com.google.android.recaptcha.internal.zzbd r1 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r2 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r3 = com.google.android.recaptcha.internal.zzba.zza
            java.lang.String r7 = r7.getMessage()
            r1.<init>(r2, r3, r7)
            r0.zzb(r1)
        L60:
            l6.j r7 = l6.j.f13876a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzam.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
