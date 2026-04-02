package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.I;
import p3.p;
/* loaded from: classes.dex */
final class zzcx extends zzcy {
    final /* synthetic */ p zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzcz zzczVar, o oVar, p pVar, String str) {
        super(oVar);
        this.zza = pVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0731e
    public final /* synthetic */ void doExecute(b bVar) {
        boolean z7;
        p pVar = this.zza;
        if (pVar != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        I.a("locationSettingsRequest can't be null", z7);
        ((zzv) ((zzdz) bVar).getService()).zzD(pVar, new zzdf(this), null);
    }
}
