package com.google.android.recaptcha.internal;

import F6.D;
import l6.j;
import n6.d;
import p6.i;
import w6.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzin extends i implements p {
    int zza;
    final /* synthetic */ zzja zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzin(zzja zzjaVar, String str, d dVar) {
        super(2, dVar);
        this.zzb = zzjaVar;
        this.zzc = str;
    }

    @Override // p6.AbstractC1698a
    public final d create(Object obj, d dVar) {
        return new zzin(this.zzb, this.zzc, dVar);
    }

    @Override // w6.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzin) create((D) obj, (d) obj2)).invokeSuspend(j.f13876a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        return l6.j.f13876a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (r1 != 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r4 != r0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r4 == r0) goto L6;
     */
    @Override // p6.AbstractC1698a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            o6.a r0 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r1 = r3.zza
            r2 = 1
            org.slf4j.helpers.i.M(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L17
            goto L2a
        Ld:
            com.google.android.recaptcha.internal.zzja r4 = r3.zzb
            r3.zza = r2
            java.lang.Object r4 = r4.zzw(r3)
            if (r4 == r0) goto L2d
        L17:
            android.webkit.WebView r4 = (android.webkit.WebView) r4
            r4.clearCache(r2)
            com.google.android.recaptcha.internal.zzja r4 = r3.zzb
            java.lang.String r1 = r3.zzc
            r2 = 2
            r3.zza = r2
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzja.zzu(r4, r1, r3)
            if (r4 != r0) goto L2a
            goto L2d
        L2a:
            l6.j r4 = l6.j.f13876a
            return r4
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzin.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
