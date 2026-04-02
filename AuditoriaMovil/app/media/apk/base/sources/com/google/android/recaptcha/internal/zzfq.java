package com.google.android.recaptcha.internal;

import F6.C;
import F6.D;
import F6.InterfaceC0091h0;
import java.util.List;
import l6.j;
import m6.AbstractC1447h;
import n6.d;
import o6.EnumC1565a;
import p6.i;
import w6.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfq extends i implements p {
    int zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzft zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfq(zzgd zzgdVar, List list, zzft zzftVar, d dVar) {
        super(2, dVar);
        this.zzb = zzgdVar;
        this.zzc = list;
        this.zzd = zzftVar;
    }

    @Override // p6.AbstractC1698a
    public final d create(Object obj, d dVar) {
        zzfq zzfqVar = new zzfq(this.zzb, this.zzc, this.zzd, dVar);
        zzfqVar.zze = obj;
        return zzfqVar;
    }

    @Override // w6.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfq) create((D) obj, (d) obj2)).invokeSuspend(j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        boolean z7;
        Object zzh;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.zza;
        j jVar = j.f13876a;
        org.slf4j.helpers.i.M(obj);
        if (i7 == 0) {
            D d7 = (D) this.zze;
            while (true) {
                zzgd zzgdVar = this.zzb;
                if (zzgdVar.zza() < 0) {
                    break;
                }
                if (zzgdVar.zza() < this.zzc.size()) {
                    InterfaceC0091h0 interfaceC0091h0 = (InterfaceC0091h0) d7.a().get(C.f1216b);
                    if (interfaceC0091h0 != null) {
                        z7 = interfaceC0091h0.isActive();
                    } else {
                        z7 = true;
                    }
                    if (!z7) {
                        break;
                    }
                    zzuf zzufVar = (zzuf) this.zzc.get(this.zzb.zza());
                    try {
                        zzft.zzf(this.zzd, zzufVar, this.zzb);
                    } catch (Exception e7) {
                        zzufVar.zzk();
                        new Integer(zzufVar.zzg());
                        AbstractC1447h.R(zzufVar.zzj(), null, null, null, new zzfp(this.zzd), 31);
                        zzft zzftVar = this.zzd;
                        zzgd zzgdVar2 = this.zzb;
                        this.zza = 1;
                        zzh = zzftVar.zzh(e7, zzgdVar2, this);
                        if (zzh == enumC1565a) {
                            return enumC1565a;
                        }
                    }
                } else {
                    break;
                }
            }
        }
        return jVar;
    }
}
