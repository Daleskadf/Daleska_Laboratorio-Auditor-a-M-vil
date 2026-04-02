package com.google.android.recaptcha.internal;

import n6.d;
import p6.AbstractC1700c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdj extends AbstractC1700c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzdt zzc;
    int zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdj(zzdt zzdtVar, d dVar) {
        super(dVar);
        this.zzc = zzdtVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        Object zzv;
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        zzv = this.zzc.zzv(null, 0L, this);
        return zzv;
    }
}
