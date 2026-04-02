package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.core.location.LocationRequestCompat;
import org.json.JSONException;
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes.dex */
final class zzbc extends com.google.android.gms.internal.play_billing.zze {
    final ExternalOfferReportingDetailsListener zza;
    final zzby zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbc(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, zzby zzbyVar, zzbb zzbbVar) {
        this.zza = externalOfferReportingDetailsListener;
        this.zzb = zzbyVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzf
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            this.zzb.zza(zzbx.zzb(95, 24, zzca.zzj));
            this.zza.onExternalOfferReportingDetailsResponse(zzca.zzj, null);
            return;
        }
        int zzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        BillingResult zza = zzca.zza(zzb, com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
        if (zzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "createExternalOfferReportingDetailsAsync() failed. Response code: " + zzb);
            this.zzb.zza(zzbx.zzb(23, 24, zza));
            this.zza.onExternalOfferReportingDetailsResponse(zza, null);
            return;
        }
        try {
            this.zza.onExternalOfferReportingDetailsResponse(zza, new ExternalOfferReportingDetails(bundle.getString("CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS")));
        } catch (JSONException e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Error when parsing invalid external offer reporting details. \n Exception: ", e);
            this.zzb.zza(zzbx.zzb(LocationRequestCompat.QUALITY_LOW_POWER, 24, zzca.zzj));
            this.zza.onExternalOfferReportingDetailsResponse(zzca.zzj, null);
        }
    }
}
