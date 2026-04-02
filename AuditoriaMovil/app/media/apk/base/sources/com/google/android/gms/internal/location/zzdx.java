package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.InterfaceC0741o;
/* loaded from: classes.dex */
final class zzdx implements InterfaceC0741o {
    final /* synthetic */ zzdy zza;

    public zzdx(zzdy zzdyVar) {
        this.zza = zzdyVar;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0741o
    public final /* synthetic */ void notifyListener(Object obj) {
        if (obj == null) {
            this.zza.zzg().zzc();
            return;
        }
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0741o
    public final void onNotifyListenerFailed() {
    }
}
