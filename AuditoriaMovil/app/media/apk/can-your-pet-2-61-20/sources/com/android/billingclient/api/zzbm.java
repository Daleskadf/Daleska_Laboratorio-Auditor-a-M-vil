package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes.dex */
final class zzbm extends com.google.android.gms.internal.play_billing.zzo {
    final ExternalOfferAvailabilityListener zza;
    final zzby zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbm(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, zzby zzbyVar, zzbl zzblVar) {
        this.zza = externalOfferAvailabilityListener;
        this.zzb = zzbyVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzp
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            this.zzb.zza(zzbx.zzb(92, 23, zzca.zzj));
            this.zza.onExternalOfferAvailabilityResponse(zzca.zzj);
            return;
        }
        int zzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        BillingResult zza = zzca.zza(zzb, com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
        if (zzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "isExternalOfferAvailableAsync() failed. Response code: " + zzb);
            this.zzb.zza(zzbx.zzb(23, 23, zza));
        }
        this.zza.onExternalOfferAvailabilityResponse(zza);
    }
}
