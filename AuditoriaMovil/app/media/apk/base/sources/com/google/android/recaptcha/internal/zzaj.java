package com.google.android.recaptcha.internal;

import F6.D;
import l6.j;
import n6.d;
import o6.EnumC1565a;
import p6.i;
import w6.p;
/* loaded from: classes.dex */
final class zzaj extends i implements p {
    int zza;
    final /* synthetic */ zzan zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaj(zzan zzanVar, d dVar) {
        super(2, dVar);
        this.zzb = zzanVar;
    }

    @Override // p6.AbstractC1698a
    public final d create(Object obj, d dVar) {
        return new zzaj(this.zzb, dVar);
    }

    @Override // w6.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaj) create((D) obj, (d) obj2)).invokeSuspend(j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.zza;
        org.slf4j.helpers.i.M(obj);
        if (i7 == 0) {
            this.zzb.zze = zzao.zza;
            zzan zzanVar = this.zzb;
            this.zza = 1;
            if (zzanVar.zze(this) == enumC1565a) {
                return enumC1565a;
            }
        }
        return j.f13876a;
    }
}
