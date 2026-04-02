package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes.dex */
final class zzbe extends com.google.android.gms.internal.play_billing.zzg {
    final WeakReference zza;
    final ResultReceiver zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbe(WeakReference weakReference, ResultReceiver resultReceiver, zzbd zzbdVar) {
        this.zza = weakReference;
        this.zzb = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzh
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            this.zzb.send(6, null);
        } else if (!bundle.containsKey("RESPONSE_CODE")) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Response bundle doesn't contain a response code");
            this.zzb.send(6, bundle);
        } else {
            int zzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
            if (zzb != 0) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Unable to launch intent for alternative billing only dialog" + zzb);
                this.zzb.send(zzb, bundle);
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            if (pendingIntent == null) {
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "User has acknowledged the alternative billing only dialog before.");
                this.zzb.send(0, bundle);
                return;
            }
            try {
                Activity activity = (Activity) this.zza.get();
                Intent intent = new Intent(activity, ProxyBillingActivityV2.class);
                intent.putExtra("alternative_billing_only_dialog_result_receiver", this.zzb);
                intent.putExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT", pendingIntent);
                activity.startActivity(intent);
            } catch (RuntimeException e) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Runtime error while launching intent for alternative billing only dialog.", e);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("RESPONSE_CODE", 6);
                bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
                bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 75);
                bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("%s: %s", e.getClass().getName(), com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage())));
                this.zzb.send(6, bundle2);
            }
        }
    }
}
