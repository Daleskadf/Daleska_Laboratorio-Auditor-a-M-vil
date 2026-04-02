package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzgh;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes.dex */
public final class zzj extends BroadcastReceiver {
    final /* synthetic */ zzk zza;
    private boolean zzb;
    private final boolean zzc;
    private boolean zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(zzk zzkVar, boolean z) {
        this.zza = zzkVar;
        this.zzc = z;
    }

    private final void zzc(Bundle bundle, BillingResult billingResult, int i) {
        zzby zzbyVar;
        zzby zzbyVar2;
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
            try {
                zzbyVar = this.zza.zze;
                zzbyVar.zza(zzgh.zzB(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), com.google.android.gms.internal.play_billing.zzcp.zza()));
                return;
            } catch (Throwable unused) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "Failed parsing Api failure.");
                return;
            }
        }
        zzbyVar2 = this.zza.zze;
        zzbyVar2.zza(zzbx.zzb(23, i, billingResult));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzby zzbyVar;
        zzby zzbyVar2;
        PurchasesUpdatedListener purchasesUpdatedListener;
        zzby zzbyVar3;
        zzby zzbyVar4;
        AlternativeBillingListener alternativeBillingListener;
        zzby zzbyVar5;
        PurchasesUpdatedListener purchasesUpdatedListener2;
        UserChoiceBillingListener userChoiceBillingListener;
        AlternativeBillingListener alternativeBillingListener2;
        zzby zzbyVar6;
        UserChoiceBillingListener userChoiceBillingListener2;
        zzby zzbyVar7;
        PurchasesUpdatedListener purchasesUpdatedListener3;
        UserChoiceBillingListener userChoiceBillingListener3;
        zzby zzbyVar8;
        PurchasesUpdatedListener purchasesUpdatedListener4;
        PurchasesUpdatedListener purchasesUpdatedListener5;
        zzby zzbyVar9;
        PurchasesUpdatedListener purchasesUpdatedListener6;
        PurchasesUpdatedListener purchasesUpdatedListener7;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "Bundle is null.");
            zzbyVar9 = this.zza.zze;
            zzbyVar9.zza(zzbx.zzb(11, 1, zzca.zzj));
            zzk zzkVar = this.zza;
            purchasesUpdatedListener6 = zzkVar.zzb;
            if (purchasesUpdatedListener6 != null) {
                purchasesUpdatedListener7 = zzkVar.zzb;
                purchasesUpdatedListener7.onPurchasesUpdated(zzca.zzj, null);
                return;
            }
            return;
        }
        BillingResult zze = com.google.android.gms.internal.play_billing.zzb.zze(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i = true != Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 1 : 2;
        if (extras.getByteArray("BROADCAST_RECEIVER_LOGGING_PAYLOAD") != null) {
            try {
                zzbyVar = this.zza.zze;
                zzbyVar.zzc(extras.getByteArray("BROADCAST_RECEIVER_LOGGING_PAYLOAD"));
            } catch (Throwable unused) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "Failed parsing Api failure.");
            }
        }
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            List<Purchase> zzi = com.google.android.gms.internal.play_billing.zzb.zzi(extras);
            if (zze.getResponseCode() == 0) {
                zzbyVar3 = this.zza.zze;
                zzbyVar3.zzb(zzbx.zzd(i));
            } else {
                zzc(extras, zze, i);
            }
            zzbyVar2 = this.zza.zze;
            zzbyVar2.zzf(4, com.google.android.gms.internal.play_billing.zzai.zzl(zzbx.zza(action)), zzi, zze, false, this.zzd);
            purchasesUpdatedListener = this.zza.zzb;
            purchasesUpdatedListener.onPurchasesUpdated(zze, zzi);
        } else if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            zzbyVar4 = this.zza.zze;
            zzbyVar4.zze(4, com.google.android.gms.internal.play_billing.zzai.zzl(zzbx.zza(action)), false, this.zzd);
            if (zze.getResponseCode() != 0) {
                zzc(extras, zze, i);
                purchasesUpdatedListener5 = this.zza.zzb;
                purchasesUpdatedListener5.onPurchasesUpdated(zze, com.google.android.gms.internal.play_billing.zzai.zzk());
                return;
            }
            zzk zzkVar2 = this.zza;
            alternativeBillingListener = zzkVar2.zzc;
            if (alternativeBillingListener == null) {
                userChoiceBillingListener3 = zzkVar2.zzd;
                if (userChoiceBillingListener3 == null) {
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                    zzbyVar8 = this.zza.zze;
                    zzbyVar8.zza(zzbx.zzb(77, i, zzca.zzj));
                    purchasesUpdatedListener4 = this.zza.zzb;
                    purchasesUpdatedListener4.onPurchasesUpdated(zzca.zzj, com.google.android.gms.internal.play_billing.zzai.zzk());
                    return;
                }
            }
            String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
            if (string != null) {
                try {
                    userChoiceBillingListener = this.zza.zzd;
                    if (userChoiceBillingListener != null) {
                        UserChoiceDetails userChoiceDetails = new UserChoiceDetails(string);
                        userChoiceBillingListener2 = this.zza.zzd;
                        userChoiceBillingListener2.userSelectedAlternativeBilling(userChoiceDetails);
                    } else {
                        AlternativeChoiceDetails alternativeChoiceDetails = new AlternativeChoiceDetails(string);
                        alternativeBillingListener2 = this.zza.zzc;
                        alternativeBillingListener2.userSelectedAlternativeBilling(alternativeChoiceDetails);
                    }
                    zzbyVar6 = this.zza.zze;
                    zzbyVar6.zzb(zzbx.zzd(i));
                    return;
                } catch (JSONException unused2) {
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", String.format("Error when parsing invalid user choice data: [%s]", string));
                    zzbyVar5 = this.zza.zze;
                    zzbyVar5.zza(zzbx.zzb(17, i, zzca.zzj));
                    purchasesUpdatedListener2 = this.zza.zzb;
                    purchasesUpdatedListener2.onPurchasesUpdated(zzca.zzj, com.google.android.gms.internal.play_billing.zzai.zzk());
                    return;
                }
            }
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
            zzbyVar7 = this.zza.zze;
            zzbyVar7.zza(zzbx.zzb(16, i, zzca.zzj));
            purchasesUpdatedListener3 = this.zza.zzb;
            purchasesUpdatedListener3.onPurchasesUpdated(zzca.zzj, com.google.android.gms.internal.play_billing.zzai.zzk());
        }
    }

    public final synchronized void zza(Context context, IntentFilter intentFilter) {
        boolean z;
        zzby zzbyVar;
        if (this.zzb) {
            return;
        }
        zzk zzkVar = this.zza;
        z = zzkVar.zzh;
        this.zzd = z;
        zzbyVar = zzkVar.zze;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < intentFilter.countActions(); i++) {
            arrayList.add(zzbx.zza(intentFilter.getAction(i)));
        }
        zzbyVar.zze(2, arrayList, false, this.zzd);
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(this, intentFilter, true != this.zzc ? 4 : 2);
        } else {
            context.registerReceiver(this, intentFilter);
        }
        this.zzb = true;
    }

    public final synchronized void zzb(Context context) {
        if (!this.zzb) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "Receiver is not registered.");
            return;
        }
        context.unregisterReceiver(this);
        this.zzb = false;
    }
}
