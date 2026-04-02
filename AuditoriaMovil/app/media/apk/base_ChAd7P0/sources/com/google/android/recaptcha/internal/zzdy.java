package com.google.android.recaptcha.internal;

import F6.H;
import l6.j;
import n6.d;
import o6.EnumC1565a;
import p6.i;
import w6.l;
/* loaded from: classes.dex */
final class zzdy extends i implements l {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzec zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(long j, zzec zzecVar, d dVar) {
        super(1, dVar);
        this.zzb = j;
        this.zzc = zzecVar;
    }

    @Override // p6.AbstractC1698a
    public final d create(d dVar) {
        return new zzdy(this.zzb, this.zzc, dVar);
    }

    @Override // w6.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzdy) create((d) obj)).invokeSuspend(j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.zza;
        org.slf4j.helpers.i.M(obj);
        if (i7 == 0) {
            long j = this.zzb;
            zzdx zzdxVar = new zzdx(this.zzc, null);
            this.zza = 1;
            if (H.z(j, zzdxVar, this) == enumC1565a) {
                return enumC1565a;
            }
        }
        return j.f13876a;
    }
}
