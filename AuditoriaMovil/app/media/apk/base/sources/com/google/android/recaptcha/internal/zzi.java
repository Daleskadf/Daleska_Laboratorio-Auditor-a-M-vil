package com.google.android.recaptcha.internal;

import l6.f;
import n6.d;
import o6.EnumC1565a;
import p6.AbstractC1700c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzi extends AbstractC1700c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzl zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzi(zzl zzlVar, d dVar) {
        super(dVar);
        this.zzb = zzlVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzc = this.zzb.zzc(0L, null, null, this);
        if (zzc == EnumC1565a.COROUTINE_SUSPENDED) {
            return zzc;
        }
        return new f(zzc);
    }
}
