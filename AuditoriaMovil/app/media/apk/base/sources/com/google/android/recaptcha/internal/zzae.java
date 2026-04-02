package com.google.android.recaptcha.internal;

import F6.D;
import F6.H;
import android.content.Context;
import java.nio.charset.StandardCharsets;
import n6.d;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class zzae implements zzy {
    private final zzek zza;
    private final Context zzb;
    private final zzan zzc;
    private boolean zzd = true;
    private String zze = StringUtils.EMPTY;
    private final zzbs zzf;

    public zzae(zzek zzekVar, Context context, D d7, zzan zzanVar, zzbs zzbsVar) {
        this.zza = zzekVar;
        this.zzb = context;
        this.zzc = zzanVar;
        this.zzf = zzbsVar;
    }

    private static final String zzi(zzle zzleVar) {
        zzkh zzg = zzkh.zzg();
        byte[] zzl = zzleVar.zzl();
        byte[] zzd = zzjz.zza().zza(zzg.zzi(zzl, 0, zzl.length), StandardCharsets.UTF_8).zzd();
        zzle zzk = zzle.zzk(zzd, 0, zzd.length);
        zzkh zzh = zzkh.zzh();
        byte[] zzl2 = zzk.zzl();
        return zzh.zzi(zzl2, 0, zzl2.length);
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(String str, d dVar) {
        return H.e(new zzac(this, str, null), dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
        if (r13.zze(r0) != r1) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    @Override // com.google.android.recaptcha.internal.zzy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzd(com.google.android.recaptcha.internal.zzse r12, n6.d r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzad
            if (r0 == 0) goto L13
            r0 = r13
            com.google.android.recaptcha.internal.zzad r0 = (com.google.android.recaptcha.internal.zzad) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzad r0 = new com.google.android.recaptcha.internal.zzad
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.zzb
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.zzd
            l6.j r3 = l6.j.f13876a
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L43
            if (r2 == r6) goto L39
            if (r2 != r5) goto L31
            java.lang.Object r12 = r0.zza
            com.google.android.recaptcha.internal.zzen r12 = (com.google.android.recaptcha.internal.zzen) r12
            org.slf4j.helpers.i.M(r13)
            goto L8d
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            com.google.android.recaptcha.internal.zzen r12 = r0.zze
            java.lang.Object r2 = r0.zza
            com.google.android.recaptcha.internal.zzae r2 = (com.google.android.recaptcha.internal.zzae) r2
            org.slf4j.helpers.i.M(r13)
            goto L7e
        L43:
            org.slf4j.helpers.i.M(r13)
            com.google.android.recaptcha.internal.zzen r13 = com.google.android.recaptcha.internal.zzz.zzc(r11)
            com.google.android.recaptcha.internal.zzbs r2 = r11.zzf
            android.content.Context r7 = r11.zzb
            int r2 = r2.zza(r7)
            r7 = 3
            if (r2 != r7) goto L92
            long r7 = r12.zzf()
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L60
            goto L92
        L60:
            com.google.android.recaptcha.internal.zzle r2 = r12.zzg()
            java.lang.String r2 = zzi(r2)
            r11.zze = r2
            com.google.android.recaptcha.internal.zzan r2 = r11.zzc
            long r7 = r12.zzf()
            r0.zza = r11
            r0.zze = r13
            r0.zzd = r6
            java.lang.Object r12 = r2.zzd(r7, r0)
            if (r12 == r1) goto L91
            r2 = r11
            r12 = r13
        L7e:
            com.google.android.recaptcha.internal.zzan r13 = r2.zzc
            r0.zza = r12
            r0.zze = r4
            r0.zzd = r5
            java.lang.Object r13 = r13.zze(r0)
            if (r13 != r1) goto L8d
            goto L91
        L8d:
            r12.zza()
            return r3
        L91:
            return r1
        L92:
            r12 = 0
            r11.zzd = r12
            com.google.android.recaptcha.internal.zzbd r12 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r0 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r1 = com.google.android.recaptcha.internal.zzba.zzab
            r12.<init>(r0, r1, r4)
            r13.zzb(r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzae.zzd(com.google.android.recaptcha.internal.zzse, n6.d):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(zzsr zzsrVar) {
        this.zze = zzi(zzsrVar.zzf());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return this.zzd;
    }
}
