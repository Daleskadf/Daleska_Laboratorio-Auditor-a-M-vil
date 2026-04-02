package com.google.android.recaptcha.internal;

import l6.f;
import n6.d;
import o6.EnumC1565a;
import p6.AbstractC1700c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzc extends AbstractC1700c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zze zzc;
    int zzd;
    zzen zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(zze zzeVar, d dVar) {
        super(dVar);
        this.zzc = zzeVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object zze = this.zzc.zze(0L, null, this);
        if (zze == EnumC1565a.COROUTINE_SUSPENDED) {
            return zze;
        }
        return new f(zze);
    }
}
