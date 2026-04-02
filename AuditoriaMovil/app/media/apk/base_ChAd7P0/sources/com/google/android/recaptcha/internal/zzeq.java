package com.google.android.recaptcha.internal;

import F6.D;
import java.util.Timer;
import l6.j;
import n6.d;
import o6.EnumC1565a;
import p6.i;
import w6.p;
/* loaded from: classes.dex */
final class zzeq extends i implements p {
    final /* synthetic */ zzes zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeq(zzes zzesVar, d dVar) {
        super(2, dVar);
        this.zza = zzesVar;
    }

    @Override // p6.AbstractC1698a
    public final d create(Object obj, d dVar) {
        return new zzeq(this.zza, dVar);
    }

    @Override // w6.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeq) create((D) obj, (d) obj2)).invokeSuspend(j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        zzei zzeiVar;
        Timer timer;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        org.slf4j.helpers.i.M(obj);
        zzes zzesVar = this.zza;
        synchronized (zzeo.class) {
            try {
                zzeiVar = zzesVar.zze;
                if (zzeiVar != null && zzeiVar.zzb() == 0) {
                    timer = zzes.zza;
                    if (timer != null) {
                        timer.cancel();
                    }
                    zzes.zza = null;
                }
                zzesVar.zzg();
            } catch (Throwable th) {
                throw th;
            }
        }
        return j.f13876a;
    }
}
