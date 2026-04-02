package com.google.android.recaptcha.internal;

import F6.H;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;
import m6.AbstractC1446g;
import m6.p;
import n6.d;
/* loaded from: classes.dex */
public final class zzl {
    private final List zza;
    private zzek zzb;

    public zzl() {
        this(null, 1, null);
    }

    private final void zzh(zze... elements) {
        List list = this.zza;
        j.e(list, "<this>");
        j.e(elements, "elements");
        list.addAll(AbstractC1446g.H(elements));
    }

    public final Object zzb(String str, long j, d dVar) {
        return H.e(new zzh(this, str, j, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzc(long r13, com.google.android.recaptcha.internal.zzsc r15, com.google.android.recaptcha.internal.zzek r16, n6.d r17) {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzi
            if (r1 == 0) goto L16
            r1 = r0
            com.google.android.recaptcha.internal.zzi r1 = (com.google.android.recaptcha.internal.zzi) r1
            int r2 = r1.zzc
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.zzc = r2
            r9 = r12
            goto L1c
        L16:
            com.google.android.recaptcha.internal.zzi r1 = new com.google.android.recaptcha.internal.zzi
            r9 = r12
            r1.<init>(r12, r0)
        L1c:
            java.lang.Object r0 = r1.zza
            o6.a r10 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r1.zzc
            r11 = 1
            if (r2 == 0) goto L33
            if (r2 != r11) goto L2b
            org.slf4j.helpers.i.M(r0)
            goto L4b
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L33:
            org.slf4j.helpers.i.M(r0)
            com.google.android.recaptcha.internal.zzk r0 = new com.google.android.recaptcha.internal.zzk
            r8 = 0
            r2 = r0
            r3 = r12
            r4 = r16
            r5 = r13
            r7 = r15
            r2.<init>(r3, r4, r5, r7, r8)
            r1.zzc = r11
            java.lang.Object r0 = F6.H.e(r0, r1)
            if (r0 != r10) goto L4b
            return r10
        L4b:
            l6.f r0 = (l6.f) r0
            java.lang.Object r0 = r0.f13868a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzl.zzc(long, com.google.android.recaptcha.internal.zzsc, com.google.android.recaptcha.internal.zzek, n6.d):java.lang.Object");
    }

    public final List zzd() {
        return this.zza;
    }

    public final void zzf(zze... zzeVarArr) {
        zzh((zze[]) Arrays.copyOf(zzeVarArr, 1));
    }

    public final void zzg(zzsr zzsrVar) {
        for (zze zzeVar : this.zza) {
            zzeVar.zzk(zzsrVar);
        }
    }

    public /* synthetic */ zzl(List list, int i7, f fVar) {
        p pVar = p.f14074a;
        this.zza = new ArrayList();
        zze[] zzeVarArr = (zze[]) pVar.toArray(new zze[0]);
        zzh((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }
}
