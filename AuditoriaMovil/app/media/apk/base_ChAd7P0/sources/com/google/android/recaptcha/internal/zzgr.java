package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.k;
import l6.j;
import w6.p;
/* loaded from: classes.dex */
final class zzgr extends k implements p {
    final /* synthetic */ zzgd zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgr(zzgd zzgdVar, String str, int i7) {
        super(2);
        this.zza = zzgdVar;
        this.zzb = str;
        this.zzc = i7;
    }

    @Override // w6.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzi().zzb(this.zzb, (String) obj2);
        int i7 = this.zzc;
        if (i7 != -1) {
            this.zza.zzc().zze(i7, objArr);
        }
        return j.f13876a;
    }
}
