package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.InterfaceC0741o;
import com.google.android.gms.location.LocationResult;
import p3.l;
/* loaded from: classes.dex */
final class zzds implements InterfaceC0741o {
    final /* synthetic */ LocationResult zza;

    public zzds(zzdv zzdvVar, LocationResult locationResult) {
        this.zza = locationResult;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0741o
    public final /* synthetic */ void notifyListener(Object obj) {
        ((l) obj).onLocationResult(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0741o
    public final void onNotifyListenerFailed() {
    }
}
