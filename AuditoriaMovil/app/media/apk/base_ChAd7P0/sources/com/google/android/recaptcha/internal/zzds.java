package com.google.android.recaptcha.internal;

import F6.D;
import F6.H;
import l6.j;
import n6.d;
import o6.EnumC1565a;
import p6.i;
import w6.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzds extends i implements p {
    int zza;
    final /* synthetic */ zzdt zzb;
    final /* synthetic */ zzen zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzdt zzdtVar, zzen zzenVar, d dVar) {
        super(2, dVar);
        this.zzb = zzdtVar;
        this.zzc = zzenVar;
    }

    @Override // p6.AbstractC1698a
    public final d create(Object obj, d dVar) {
        return new zzds(this.zzb, this.zzc, dVar);
    }

    @Override // w6.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzds) create((D) obj, (d) obj2)).invokeSuspend(j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.zza;
        org.slf4j.helpers.i.M(obj);
        if (i7 == 0) {
            zzdt zzdtVar = this.zzb;
            this.zza = 1;
            obj = H.y(zzdtVar.zzi.zza().a(), new zzdh(zzdtVar, null), this);
            if (obj == enumC1565a) {
                return enumC1565a;
            }
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zza();
        return zzscVar;
    }
}
