package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.InterfaceC0741o;
import p3.l;
/* loaded from: classes.dex */
final class zzdu implements InterfaceC0741o {
    final /* synthetic */ zzdv zza;

    public zzdu(zzdv zzdvVar) {
        this.zza = zzdvVar;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0741o
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        l lVar = (l) obj;
        this.zza.zzh().zzc();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0741o
    public final void onNotifyListenerFailed() {
    }
}
