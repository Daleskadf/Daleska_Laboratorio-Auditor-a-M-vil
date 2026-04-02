package com.google.android.recaptcha.internal;

import l6.f;
import n6.d;
import o6.EnumC1565a;
import p6.AbstractC1700c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcw extends AbstractC1700c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(zzdc zzdcVar, d dVar) {
        super(dVar);
        this.zzb = zzdcVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object mo3execute0E7RQCE = this.zzb.mo3execute0E7RQCE(null, 0L, this);
        if (mo3execute0E7RQCE == EnumC1565a.COROUTINE_SUSPENDED) {
            return mo3execute0E7RQCE;
        }
        return new f(mo3execute0E7RQCE);
    }
}
