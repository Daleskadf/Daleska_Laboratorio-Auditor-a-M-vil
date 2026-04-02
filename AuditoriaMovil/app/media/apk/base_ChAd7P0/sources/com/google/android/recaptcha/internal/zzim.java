package com.google.android.recaptcha.internal;

import n6.d;
import p6.AbstractC1700c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzim extends AbstractC1700c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzja zzb;
    int zzc;
    zzja zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzim(zzja zzjaVar, d dVar) {
        super(dVar);
        this.zzb = zzjaVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        Object zzE;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzE = this.zzb.zzE(null, this);
        return zzE;
    }
}
