package com.google.android.gms.internal.auth;

import T2.a;
import android.content.Context;
import com.google.android.gms.common.api.o;
/* loaded from: classes.dex */
final class zzbq extends zzbi {
    final /* synthetic */ a zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbq(zzbt zzbtVar, o oVar, a aVar) {
        super(oVar);
        this.zza = aVar;
    }

    @Override // com.google.android.gms.internal.auth.zzbi
    public final void zza(Context context, zzbh zzbhVar) {
        zzbhVar.zze(new zzbp(this), this.zza);
    }
}
