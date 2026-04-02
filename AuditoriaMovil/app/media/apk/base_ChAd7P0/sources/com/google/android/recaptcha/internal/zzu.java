package com.google.android.recaptcha.internal;

import F6.D;
import java.util.Iterator;
import java.util.List;
import l6.f;
import l6.j;
import n6.d;
import o6.EnumC1565a;
import p6.i;
import w6.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzu extends i implements p {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzsc zzd;
    final /* synthetic */ zzv zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(zzsc zzscVar, zzv zzvVar, d dVar) {
        super(2, dVar);
        this.zzd = zzscVar;
        this.zze = zzvVar;
    }

    @Override // p6.AbstractC1698a
    public final d create(Object obj, d dVar) {
        return new zzu(this.zzd, this.zze, dVar);
    }

    @Override // w6.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzu) create((D) obj, (d) obj2)).invokeSuspend(j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        zzse zzj;
        List list;
        Iterator it;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        if (this.zzc != 0) {
            it = (Iterator) this.zzb;
            zzj = (zzse) this.zza;
            org.slf4j.helpers.i.M(obj);
        } else {
            org.slf4j.helpers.i.M(obj);
            if (!this.zzd.zzS()) {
                return new f(org.slf4j.helpers.i.j(new zzbd(zzbb.zzb, zzba.zzab, null)));
            }
            zzj = this.zzd.zzj();
            if (zzj.zzi().zzd() != 0) {
                this.zze.zzc = zzj.zzi();
                list = this.zze.zzb;
                it = list.iterator();
            } else {
                return new f(org.slf4j.helpers.i.j(new zzbd(zzbb.zzb, zzba.zzab, null)));
            }
        }
        while (it.hasNext()) {
            this.zza = zzj;
            this.zzb = it;
            this.zzc = 1;
            if (((zzy) it.next()).zzd(zzj, this) == enumC1565a) {
                return enumC1565a;
            }
        }
        return new f(j.f13876a);
    }
}
