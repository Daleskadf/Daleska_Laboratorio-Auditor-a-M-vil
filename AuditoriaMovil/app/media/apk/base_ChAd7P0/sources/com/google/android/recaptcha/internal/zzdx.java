package com.google.android.recaptcha.internal;

import F6.C0106t;
import F6.D;
import F6.InterfaceC0105s;
import l6.j;
import n6.d;
import o6.EnumC1565a;
import p6.i;
import w6.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdx extends i implements p {
    int zza;
    final /* synthetic */ zzec zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(zzec zzecVar, d dVar) {
        super(2, dVar);
        this.zzb = zzecVar;
    }

    @Override // p6.AbstractC1698a
    public final d create(Object obj, d dVar) {
        return new zzdx(this.zzb, dVar);
    }

    @Override // w6.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((D) obj, (d) obj2)).invokeSuspend(j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0105s interfaceC0105s;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.zza;
        org.slf4j.helpers.i.M(obj);
        if (i7 == 0) {
            interfaceC0105s = this.zzb.zzc;
            this.zza = 1;
            if (((C0106t) interfaceC0105s).j(this) == enumC1565a) {
                return enumC1565a;
            }
        }
        return j.f13876a;
    }
}
