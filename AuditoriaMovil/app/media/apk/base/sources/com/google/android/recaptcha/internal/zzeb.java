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
public final class zzeb extends i implements p {
    int zza;
    final /* synthetic */ zzec zzb;
    final /* synthetic */ InterfaceC0105s zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzec zzecVar, InterfaceC0105s interfaceC0105s, long j, d dVar) {
        super(2, dVar);
        this.zzb = zzecVar;
        this.zzc = interfaceC0105s;
        this.zzd = j;
    }

    @Override // p6.AbstractC1698a
    public final d create(Object obj, d dVar) {
        return new zzeb(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // w6.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((D) obj, (d) obj2)).invokeSuspend(j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        zzci zzciVar;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        try {
            if (this.zza != 0) {
                org.slf4j.helpers.i.M(obj);
            } else {
                org.slf4j.helpers.i.M(obj);
                zzbq zzbqVar = zzbq.zza;
                zzdz zzdzVar = new zzdz(this.zzb);
                zzea zzeaVar = new zzea(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                obj = zzbqVar.zza(zzdzVar, 100L, 1000L, 2.0d, zzeaVar, this);
                if (obj == enumC1565a) {
                    return enumC1565a;
                }
            }
            ((Boolean) obj).getClass();
        } catch (zzbd e7) {
            zzec zzecVar = this.zzb;
            zzciVar = zzcm.zzd;
            zzecVar.zzf = zzciVar;
            ((C0106t) this.zzc).O(e7);
        }
        return j.f13876a;
    }
}
