package com.google.android.recaptcha;

import l6.f;
import n6.d;
import o6.EnumC1565a;
import p6.AbstractC1700c;
/* loaded from: classes.dex */
public final class Recaptcha$getClient$1 extends AbstractC1700c {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, d dVar) {
        super(dVar);
        this.zzb = recaptcha;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object m2getClientBWLJW6A = this.zzb.m2getClientBWLJW6A(null, null, 0L, this);
        if (m2getClientBWLJW6A == EnumC1565a.COROUTINE_SUSPENDED) {
            return m2getClientBWLJW6A;
        }
        return new f(m2getClientBWLJW6A);
    }
}
