package com.google.android.recaptcha.internal;

import F6.D;
import l6.j;
import n6.d;
import o6.EnumC1565a;
import p6.i;
import w6.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdl extends i implements p {
    int zza;
    final /* synthetic */ zzdt zzb;
    final /* synthetic */ zzsc zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdl(zzdt zzdtVar, zzsc zzscVar, long j, d dVar) {
        super(2, dVar);
        this.zzb = zzdtVar;
        this.zzc = zzscVar;
        this.zzd = j;
    }

    @Override // p6.AbstractC1698a
    public final d create(Object obj, d dVar) {
        return new zzdl(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // w6.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdl) create((D) obj, (d) obj2)).invokeSuspend(j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        Object zzv;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.zza;
        org.slf4j.helpers.i.M(obj);
        if (i7 == 0) {
            zzdt zzdtVar = this.zzb;
            zzsc zzscVar = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            zzv = zzdtVar.zzv(zzscVar, j, this);
            if (zzv == enumC1565a) {
                return enumC1565a;
            }
        }
        return j.f13876a;
    }
}
