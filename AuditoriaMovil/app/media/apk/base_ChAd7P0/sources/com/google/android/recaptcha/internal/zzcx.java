package com.google.android.recaptcha.internal;

import l6.f;
import n6.d;
import o6.EnumC1565a;
import p6.AbstractC1700c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcx extends AbstractC1700c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzdc zzdcVar, d dVar) {
        super(dVar);
        this.zzb = zzdcVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object mo4executegIAlus = this.zzb.mo4executegIAlus(null, this);
        if (mo4executegIAlus == EnumC1565a.COROUTINE_SUSPENDED) {
            return mo4executegIAlus;
        }
        return new f(mo4executegIAlus);
    }
}
