package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.InterfaceC0741o;
import com.google.android.gms.location.LocationAvailability;
import p3.l;
/* loaded from: classes.dex */
final class zzdt implements InterfaceC0741o {
    final /* synthetic */ LocationAvailability zza;

    public zzdt(zzdv zzdvVar, LocationAvailability locationAvailability) {
        this.zza = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0741o
    public final /* synthetic */ void notifyListener(Object obj) {
        ((l) obj).onLocationAvailability(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0741o
    public final void onNotifyListenerFailed() {
    }
}
