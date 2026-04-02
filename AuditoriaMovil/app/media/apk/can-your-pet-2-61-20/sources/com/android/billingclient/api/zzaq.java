package com.android.billingclient.api;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes.dex */
public final class zzaq implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ PurchasesResponseListener zzb;
    final /* synthetic */ BillingClientImpl zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaq(BillingClientImpl billingClientImpl, String str, PurchasesResponseListener purchasesResponseListener) {
        this.zza = str;
        this.zzb = purchasesResponseListener;
        this.zzc = billingClientImpl;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzcx zzaf = BillingClientImpl.zzaf(this.zzc, this.zza, 9);
        if (zzaf.zzb() != null) {
            this.zzb.onQueryPurchasesResponse(zzaf.zza(), zzaf.zzb());
            return null;
        }
        this.zzb.onQueryPurchasesResponse(zzaf.zza(), com.google.android.gms.internal.play_billing.zzai.zzk());
        return null;
    }
}
