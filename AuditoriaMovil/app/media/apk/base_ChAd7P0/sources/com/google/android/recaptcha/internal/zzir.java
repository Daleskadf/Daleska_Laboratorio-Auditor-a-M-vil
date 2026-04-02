package com.google.android.recaptcha.internal;

import l6.f;
import n6.d;
import o6.EnumC1565a;
import p6.AbstractC1700c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzir extends AbstractC1700c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzja zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzir(zzja zzjaVar, d dVar) {
        super(dVar);
        this.zzb = zzjaVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzh = this.zzb.zzh(null, this);
        if (zzh == EnumC1565a.COROUTINE_SUSPENDED) {
            return zzh;
        }
        return new f(zzh);
    }
}
