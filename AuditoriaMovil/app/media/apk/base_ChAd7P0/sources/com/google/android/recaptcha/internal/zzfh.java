package com.google.android.recaptcha.internal;

import F6.D;
import l6.j;
import n6.d;
import o6.EnumC1565a;
import p6.i;
import w6.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfh extends i implements p {
    final /* synthetic */ zzfj zza;
    final /* synthetic */ zzbr zzb;
    final /* synthetic */ zzsp zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfh(zzfj zzfjVar, zzbr zzbrVar, zzsp zzspVar, d dVar) {
        super(2, dVar);
        this.zza = zzfjVar;
        this.zzb = zzbrVar;
        this.zzc = zzspVar;
    }

    @Override // p6.AbstractC1698a
    public final d create(Object obj, d dVar) {
        return new zzfh(this.zza, this.zzb, this.zzc, dVar);
    }

    @Override // w6.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfh) create((D) obj, (d) obj2)).invokeSuspend(j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        org.slf4j.helpers.i.M(obj);
        zzew zzewVar = null;
        try {
            try {
                try {
                    zzewVar = zzfj.zza(this.zza).zza(this.zzb.zzd());
                    zzewVar.zzc();
                    zzewVar.zze(this.zzc.zzd());
                    zzsr zzsrVar = (zzsr) zzewVar.zza(zzsr.zzi());
                    zzewVar.zzd();
                    return zzsrVar;
                } catch (zzbd e7) {
                    throw e7;
                }
            } catch (Exception e8) {
                throw new zzbd(zzbb.zzc, zzba.zzF, e8.getMessage());
            }
        } catch (Throwable th) {
            if (zzewVar != null) {
                zzewVar.zzd();
            }
            throw th;
        }
    }
}
