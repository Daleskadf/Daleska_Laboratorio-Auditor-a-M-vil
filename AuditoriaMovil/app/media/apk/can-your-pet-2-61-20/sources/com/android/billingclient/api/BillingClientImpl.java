package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.BundleCompat;
import androidx.work.WorkRequest;
import com.android.billingclient.BuildConfig;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.google.android.gms.internal.play_billing.zzgg;
import com.google.android.gms.internal.play_billing.zzgh;
import com.google.android.gms.internal.play_billing.zzgk;
import com.google.android.gms.internal.play_billing.zzgl;
import com.google.android.gms.internal.play_billing.zzgn;
import com.google.android.gms.internal.play_billing.zzgr;
import com.google.android.gms.internal.play_billing.zzha;
import com.google.android.gms.internal.play_billing.zzhb;
import com.google.android.gms.internal.play_billing.zzhg;
import com.google.android.gms.internal.play_billing.zzhi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes.dex */
public class BillingClientImpl extends BillingClient {
    private boolean zzA;
    private ExecutorService zzB;
    private volatile int zza;
    private final String zzb;
    private final Handler zzc;
    private volatile zzk zzd;
    private Context zze;
    private zzby zzf;
    private volatile com.google.android.gms.internal.play_billing.zzs zzg;
    private volatile zzay zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private zzcn zzz;

    private BillingClientImpl(Activity activity, zzcn zzcnVar, String str) {
        this(activity.getApplicationContext(), zzcnVar, new zzbq(), str, null, null, null, null);
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzcn zzcnVar, AlternativeBillingListener alternativeBillingListener, String str, zzby zzbyVar) {
        this.zze = context.getApplicationContext();
        zzha zzz = zzhb.zzz();
        zzz.zzj(str);
        zzz.zzi(this.zze.getPackageName());
        if (zzbyVar != null) {
            this.zzf = zzbyVar;
        } else {
            this.zzf = new zzcd(this.zze, (zzhb) zzz.zzc());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzd = new zzk(this.zze, purchasesUpdatedListener, null, alternativeBillingListener, null, this.zzf);
        this.zzz = zzcnVar;
        this.zzA = alternativeBillingListener != null;
        this.zze.getPackageName();
    }

    private int launchBillingFlowCpp(Activity activity, BillingFlowParams billingFlowParams) {
        return launchBillingFlow(activity, billingFlowParams).getResponseCode();
    }

    private void startConnection(long j) {
        zzbq zzbqVar = new zzbq(j);
        if (isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service connection is valid. No need to re-initialize.");
            this.zzf.zzb(zzbx.zzd(6));
            zzbqVar.onBillingSetupFinished(zzca.zzl);
            return;
        }
        int i = 1;
        if (this.zza == 1) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Client is already in the process of connecting to billing service.");
            this.zzf.zza(zzbx.zzb(37, 6, zzca.zzd));
            zzbqVar.onBillingSetupFinished(zzca.zzd);
        } else if (this.zza == 3) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            this.zzf.zza(zzbx.zzb(38, 6, zzca.zzm));
            zzbqVar.onBillingSetupFinished(zzca.zzm);
        } else {
            this.zza = 1;
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Starting in-app billing setup.");
            this.zzh = new zzay(this, zzbqVar, null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.zze.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                i = 41;
            } else {
                ResolveInfo resolveInfo = queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null) {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "The device doesn't have valid Play Store.");
                        i = 40;
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.zzb);
                        if (this.zze.bindService(intent2, this.zzh, 1)) {
                            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service was bonded successfully.");
                            return;
                        } else {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Connection to Billing service is blocked.");
                            i = 39;
                        }
                    }
                }
            }
            this.zza = 0;
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing service unavailable on device.");
            this.zzf.zza(zzbx.zzb(i, 6, zzca.zzc));
            zzbqVar.onBillingSetupFinished(zzca.zzc);
        }
    }

    public static /* synthetic */ zzcx zzaf(BillingClientImpl billingClientImpl, String str, int i) {
        Bundle zzi;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        Bundle zzc = com.google.android.gms.internal.play_billing.zzb.zzc(billingClientImpl.zzn, billingClientImpl.zzv, true, false, billingClientImpl.zzb);
        List list = null;
        String str2 = null;
        while (true) {
            try {
                if (billingClientImpl.zzn) {
                    zzi = billingClientImpl.zzg.zzj(z != billingClientImpl.zzv ? 9 : 19, billingClientImpl.zze.getPackageName(), str, str2, zzc);
                } else {
                    zzi = billingClientImpl.zzg.zzi(3, billingClientImpl.zze.getPackageName(), str, str2);
                }
                zzcy zza = zzcz.zza(zzi, "BillingClient", "getPurchase()");
                BillingResult zza2 = zza.zza();
                if (zza2 == zzca.zzl) {
                    ArrayList<String> stringArrayList = zzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList2 = zzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList3 = zzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    boolean z2 = false;
                    for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                        String str3 = stringArrayList2.get(i2);
                        String str4 = stringArrayList3.get(i2);
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i2))));
                        try {
                            Purchase purchase = new Purchase(str3, str4);
                            if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "BUG: empty/null token!");
                                z2 = true;
                            }
                            arrayList.add(purchase);
                        } catch (JSONException e) {
                            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got an exception trying to decode the purchase!", e);
                            billingClientImpl.zzf.zza(zzbx.zzb(51, 9, zzca.zzj));
                            return new zzcx(zzca.zzj, null);
                        }
                    }
                    if (z2) {
                        billingClientImpl.zzf.zza(zzbx.zzb(26, 9, zzca.zzj));
                    }
                    str2 = zzi.getString("INAPP_CONTINUATION_TOKEN");
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                    if (TextUtils.isEmpty(str2)) {
                        return new zzcx(zzca.zzl, arrayList);
                    }
                    list = null;
                    z = true;
                } else {
                    billingClientImpl.zzf.zza(zzbx.zzb(zza.zzb(), 9, zza2));
                    return new zzcx(zza2, list);
                }
            } catch (Exception e2) {
                billingClientImpl.zzf.zza(zzbx.zzb(52, 9, zzca.zzm));
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got exception trying to get purchasesm try to reconnect", e2);
                return new zzcx(zzca.zzm, null);
            }
        }
    }

    public final Handler zzag() {
        return Looper.myLooper() == null ? this.zzc : new Handler(Looper.myLooper());
    }

    private final BillingResult zzah(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return billingResult;
        }
        this.zzc.post(new Runnable() { // from class: com.android.billingclient.api.zzm
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzR(billingResult);
            }
        });
        return billingResult;
    }

    public final BillingResult zzai() {
        if (this.zza == 0 || this.zza == 3) {
            return zzca.zzm;
        }
        return zzca.zzj;
    }

    private static String zzaj() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    public final Future zzak(Callable callable, long j, final Runnable runnable, Handler handler) {
        if (this.zzB == null) {
            this.zzB = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.zzb.zza, new zzap(this));
        }
        try {
            final Future submit = this.zzB.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzu
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j * 0.95d));
            return submit;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    private final void zzal(String str, final PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            this.zzf.zza(zzbx.zzb(2, 11, zzca.zzm));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzca.zzm, null);
        } else if (zzak(new zzar(this, str, purchaseHistoryResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzai
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzZ(purchaseHistoryResponseListener);
            }
        }, zzag()) == null) {
            BillingResult zzai = zzai();
            this.zzf.zza(zzbx.zzb(25, 11, zzai));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzai, null);
        }
    }

    private final void zzam(String str, final PurchasesResponseListener purchasesResponseListener) {
        if (!isReady()) {
            this.zzf.zza(zzbx.zzb(2, 9, zzca.zzm));
            purchasesResponseListener.onQueryPurchasesResponse(zzca.zzm, com.google.android.gms.internal.play_billing.zzai.zzk());
        } else if (TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please provide a valid product type.");
            this.zzf.zza(zzbx.zzb(50, 9, zzca.zzg));
            purchasesResponseListener.onQueryPurchasesResponse(zzca.zzg, com.google.android.gms.internal.play_billing.zzai.zzk());
        } else if (zzak(new zzaq(this, str, purchasesResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzaa
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzaa(purchasesResponseListener);
            }
        }, zzag()) == null) {
            BillingResult zzai = zzai();
            this.zzf.zza(zzbx.zzb(25, 9, zzai));
            purchasesResponseListener.onQueryPurchasesResponse(zzai, com.google.android.gms.internal.play_billing.zzai.zzk());
        }
    }

    private final void zzan(BillingResult billingResult, int i, int i2) {
        zzgl zzglVar = null;
        zzgh zzghVar = null;
        if (billingResult.getResponseCode() != 0) {
            zzby zzbyVar = this.zzf;
            int i3 = zzbx.zza;
            try {
                zzgg zzz = zzgh.zzz();
                zzgn zzz2 = zzgr.zzz();
                zzz2.zzk(billingResult.getResponseCode());
                zzz2.zzj(billingResult.getDebugMessage());
                zzz2.zzl(i);
                zzz.zzi(zzz2);
                zzz.zzk(5);
                zzhg zzz3 = zzhi.zzz();
                zzz3.zzi(i2);
                zzz.zzj((zzhi) zzz3.zzc());
                zzghVar = (zzgh) zzz.zzc();
            } catch (Exception e) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e);
            }
            zzbyVar.zza(zzghVar);
            return;
        }
        zzby zzbyVar2 = this.zzf;
        int i4 = zzbx.zza;
        try {
            zzgk zzz4 = zzgl.zzz();
            zzz4.zzj(5);
            zzhg zzz5 = zzhi.zzz();
            zzz5.zzi(i2);
            zzz4.zzi((zzhi) zzz5.zzc());
            zzglVar = (zzgl) zzz4.zzc();
        } catch (Exception e2) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e2);
        }
        zzbyVar2.zzb(zzglVar);
    }

    public static /* synthetic */ zzbp zzg(BillingClientImpl billingClientImpl, String str) {
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle zzc = com.google.android.gms.internal.play_billing.zzb.zzc(billingClientImpl.zzn, billingClientImpl.zzv, true, false, billingClientImpl.zzb);
        String str2 = null;
        while (billingClientImpl.zzl) {
            try {
                Bundle zzh = billingClientImpl.zzg.zzh(6, billingClientImpl.zze.getPackageName(), str, str2, zzc);
                zzcy zza = zzcz.zza(zzh, "BillingClient", "getPurchaseHistory()");
                BillingResult zza2 = zza.zza();
                if (zza2 == zzca.zzl) {
                    ArrayList<String> stringArrayList = zzh.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList2 = zzh.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList3 = zzh.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    boolean z = false;
                    for (int i = 0; i < stringArrayList2.size(); i++) {
                        String str3 = stringArrayList2.get(i);
                        String str4 = stringArrayList3.get(i);
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i))));
                        try {
                            PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                            if (TextUtils.isEmpty(purchaseHistoryRecord.getPurchaseToken())) {
                                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "BUG: empty/null token!");
                                z = true;
                            }
                            arrayList.add(purchaseHistoryRecord);
                        } catch (JSONException e) {
                            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got an exception trying to decode the purchase!", e);
                            billingClientImpl.zzf.zza(zzbx.zzb(51, 11, zzca.zzj));
                            return new zzbp(zzca.zzj, null);
                        }
                    }
                    if (z) {
                        billingClientImpl.zzf.zza(zzbx.zzb(26, 11, zzca.zzj));
                    }
                    str2 = zzh.getString("INAPP_CONTINUATION_TOKEN");
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                    if (TextUtils.isEmpty(str2)) {
                        return new zzbp(zzca.zzl, arrayList);
                    }
                } else {
                    billingClientImpl.zzf.zza(zzbx.zzb(zza.zzb(), 11, zza2));
                    return new zzbp(zza2, null);
                }
            } catch (RemoteException e2) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got exception trying to get purchase history, try to reconnect", e2);
                billingClientImpl.zzf.zza(zzbx.zzb(59, 11, zzca.zzm));
                return new zzbp(zzca.zzm, null);
            }
        }
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getPurchaseHistory is not supported on current device");
        return new zzbp(zzca.zzq, null);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (!isReady()) {
            this.zzf.zza(zzbx.zzb(2, 3, zzca.zzm));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzca.zzm);
        } else if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please provide a valid purchase token.");
            this.zzf.zza(zzbx.zzb(26, 3, zzca.zzi));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzca.zzi);
        } else if (!this.zzn) {
            this.zzf.zza(zzbx.zzb(27, 3, zzca.zzb));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzca.zzb);
        } else if (zzak(new Callable() { // from class: com.android.billingclient.api.zzq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzk(acknowledgePurchaseParams, acknowledgePurchaseResponseListener);
                return null;
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzr
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzQ(acknowledgePurchaseResponseListener);
            }
        }, zzag()) == null) {
            BillingResult zzai = zzai();
            this.zzf.zza(zzbx.zzb(25, 3, zzai));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzai);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        if (!isReady()) {
            this.zzf.zza(zzbx.zzb(2, 4, zzca.zzm));
            consumeResponseListener.onConsumeResponse(zzca.zzm, consumeParams.getPurchaseToken());
        } else if (zzak(new Callable() { // from class: com.android.billingclient.api.zzad
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzl(consumeParams, consumeResponseListener);
                return null;
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzae
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzS(consumeResponseListener, consumeParams);
            }
        }, zzag()) == null) {
            BillingResult zzai = zzai();
            this.zzf.zza(zzbx.zzb(25, 4, zzai));
            consumeResponseListener.onConsumeResponse(zzai, consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void createAlternativeBillingOnlyReportingDetailsAsync(final AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        if (!isReady()) {
            this.zzf.zza(zzbx.zzb(2, 15, zzca.zzm));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(zzca.zzm, null);
        } else if (!this.zzx) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support alternative billing only.");
            this.zzf.zza(zzbx.zzb(66, 15, zzca.zzE));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(zzca.zzE, null);
        } else if (zzak(new Callable() { // from class: com.android.billingclient.api.zzv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzq(alternativeBillingOnlyReportingDetailsListener);
                return null;
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzw
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzT(alternativeBillingOnlyReportingDetailsListener);
            }
        }, zzag()) == null) {
            BillingResult zzai = zzai();
            this.zzf.zza(zzbx.zzb(25, 15, zzai));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(zzai, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void createExternalOfferReportingDetailsAsync(final ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        if (!isReady()) {
            this.zzf.zza(zzbx.zzb(2, 24, zzca.zzm));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(zzca.zzm, null);
        } else if (!this.zzy) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support external offer.");
            this.zzf.zza(zzbx.zzb(103, 24, zzca.zzy));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(zzca.zzy, null);
        } else if (zzak(new Callable() { // from class: com.android.billingclient.api.zzx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzr(externalOfferReportingDetailsListener);
                return null;
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzag
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzU(externalOfferReportingDetailsListener);
            }
        }, zzag()) == null) {
            BillingResult zzai = zzai();
            this.zzf.zza(zzbx.zzb(25, 24, zzai));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(zzai, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void endConnection() {
        this.zzf.zzb(zzbx.zzd(12));
        try {
            try {
                if (this.zzd != null) {
                    this.zzd.zzf();
                }
                if (this.zzh != null) {
                    this.zzh.zzc();
                }
                if (this.zzh != null && this.zzg != null) {
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Unbinding from service.");
                    this.zze.unbindService(this.zzh);
                    this.zzh = null;
                }
                this.zzg = null;
                ExecutorService executorService = this.zzB;
                if (executorService != null) {
                    executorService.shutdownNow();
                    this.zzB = null;
                }
            } catch (Exception e) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "There was an exception while ending connection!", e);
            }
        } finally {
            this.zza = 3;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, final BillingConfigResponseListener billingConfigResponseListener) {
        if (!isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Service disconnected.");
            this.zzf.zza(zzbx.zzb(2, 13, zzca.zzm));
            billingConfigResponseListener.onBillingConfigResponse(zzca.zzm, null);
        } else if (!this.zzu) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support get billing config.");
            this.zzf.zza(zzbx.zzb(32, 13, zzca.zzA));
            billingConfigResponseListener.onBillingConfigResponse(zzca.zzA, null);
        } else {
            String str = this.zzb;
            final Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            if (zzak(new Callable() { // from class: com.android.billingclient.api.zzs
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    BillingClientImpl.this.zzm(bundle, billingConfigResponseListener);
                    return null;
                }
            }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzt
                @Override // java.lang.Runnable
                public final void run() {
                    BillingClientImpl.this.zzV(billingConfigResponseListener);
                }
            }, zzag()) == null) {
                BillingResult zzai = zzai();
                this.zzf.zza(zzbx.zzb(25, 13, zzai));
                billingConfigResponseListener.onBillingConfigResponse(zzai, null);
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final int getConnectionState() {
        return this.zza;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void isAlternativeBillingOnlyAvailableAsync(final AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        if (!isReady()) {
            this.zzf.zza(zzbx.zzb(2, 14, zzca.zzm));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(zzca.zzm);
        } else if (!this.zzx) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support alternative billing only.");
            this.zzf.zza(zzbx.zzb(66, 14, zzca.zzE));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(zzca.zzE);
        } else if (zzak(new Callable() { // from class: com.android.billingclient.api.zzab
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzs(alternativeBillingOnlyAvailabilityListener);
                return null;
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzac
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzW(alternativeBillingOnlyAvailabilityListener);
            }
        }, zzag()) == null) {
            BillingResult zzai = zzai();
            this.zzf.zza(zzbx.zzb(25, 14, zzai));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(zzai);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void isExternalOfferAvailableAsync(final ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        if (!isReady()) {
            this.zzf.zza(zzbx.zzb(2, 23, zzca.zzm));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(zzca.zzm);
        } else if (!this.zzy) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support external offer.");
            this.zzf.zza(zzbx.zzb(103, 23, zzca.zzy));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(zzca.zzy);
        } else if (zzak(new Callable() { // from class: com.android.billingclient.api.zzam
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzt(externalOfferAvailabilityListener);
                return null;
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzan
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzX(externalOfferAvailabilityListener);
            }
        }, zzag()) == null) {
            BillingResult zzai = zzai();
            this.zzf.zza(zzbx.zzb(25, 23, zzai));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(zzai);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult isFeatureSupported(String str) {
        char c;
        if (!isReady()) {
            BillingResult billingResult = zzca.zzm;
            if (billingResult.getResponseCode() != 0) {
                this.zzf.zza(zzbx.zzb(2, 5, billingResult));
            } else {
                this.zzf.zzb(zzbx.zzd(5));
            }
            return zzca.zzm;
        }
        int i = zzca.zzG;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS_UPDATE)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 96321:
                if (str.equals("aaa")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 97314:
                if (str.equals(BillingClient.FeatureType.IN_APP_MESSAGING)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 98307:
                if (str.equals("ccc")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 99300:
                if (str.equals("ddd")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 100293:
                if (str.equals("eee")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 101286:
                if (str.equals(BillingClient.FeatureType.PRODUCT_DETAILS)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 102279:
                if (str.equals(BillingClient.FeatureType.BILLING_CONFIG)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 103272:
                if (str.equals("hhh")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 104265:
                if (str.equals("iii")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 105258:
                if (str.equals(BillingClient.FeatureType.ALTERNATIVE_BILLING_ONLY)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 106251:
                if (str.equals(BillingClient.FeatureType.EXTERNAL_OFFER)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 207616302:
                if (str.equals(BillingClient.FeatureType.PRICE_CHANGE_CONFIRMATION)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1987365622:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                BillingResult billingResult2 = this.zzi ? zzca.zzl : zzca.zzo;
                zzan(billingResult2, 9, 2);
                return billingResult2;
            case 1:
                BillingResult billingResult3 = this.zzj ? zzca.zzl : zzca.zzp;
                zzan(billingResult3, 10, 3);
                return billingResult3;
            case 2:
                BillingResult billingResult4 = this.zzm ? zzca.zzl : zzca.zzr;
                zzan(billingResult4, 35, 4);
                return billingResult4;
            case 3:
                BillingResult billingResult5 = this.zzp ? zzca.zzl : zzca.zzw;
                zzan(billingResult5, 30, 5);
                return billingResult5;
            case 4:
                BillingResult billingResult6 = this.zzr ? zzca.zzl : zzca.zzs;
                zzan(billingResult6, 31, 6);
                return billingResult6;
            case 5:
                BillingResult billingResult7 = this.zzq ? zzca.zzl : zzca.zzu;
                zzan(billingResult7, 21, 7);
                return billingResult7;
            case 6:
                BillingResult billingResult8 = this.zzs ? zzca.zzl : zzca.zzt;
                zzan(billingResult8, 19, 8);
                return billingResult8;
            case 7:
                BillingResult billingResult9 = this.zzs ? zzca.zzl : zzca.zzt;
                zzan(billingResult9, 61, 9);
                return billingResult9;
            case '\b':
                BillingResult billingResult10 = this.zzt ? zzca.zzl : zzca.zzv;
                zzan(billingResult10, 20, 10);
                return billingResult10;
            case '\t':
                BillingResult billingResult11 = this.zzu ? zzca.zzl : zzca.zzA;
                zzan(billingResult11, 32, 11);
                return billingResult11;
            case '\n':
                BillingResult billingResult12 = this.zzu ? zzca.zzl : zzca.zzB;
                zzan(billingResult12, 33, 12);
                return billingResult12;
            case 11:
                BillingResult billingResult13 = this.zzw ? zzca.zzl : zzca.zzD;
                zzan(billingResult13, 60, 13);
                return billingResult13;
            case '\f':
                BillingResult billingResult14 = this.zzx ? zzca.zzl : zzca.zzE;
                zzan(billingResult14, 66, 14);
                return billingResult14;
            case '\r':
                BillingResult billingResult15 = this.zzy ? zzca.zzl : zzca.zzy;
                zzan(billingResult15, 103, 18);
                return billingResult15;
            default:
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Unsupported feature: ".concat(String.valueOf(str)));
                zzan(zzca.zzz, 34, 1);
                return zzca.zzz;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        return (this.zza != 2 || this.zzg == null || this.zzh == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:368:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0438 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0481 A[Catch: Exception -> 0x04ed, CancellationException -> 0x0506, TimeoutException -> 0x0508, TRY_ENTER, TryCatch #4 {CancellationException -> 0x0506, TimeoutException -> 0x0508, Exception -> 0x04ed, blocks: (B:397:0x0481, B:399:0x0495, B:401:0x04a9, B:404:0x04c7, B:406:0x04d3), top: B:424:0x047f }] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0495 A[Catch: Exception -> 0x04ed, CancellationException -> 0x0506, TimeoutException -> 0x0508, TryCatch #4 {CancellationException -> 0x0506, TimeoutException -> 0x0508, Exception -> 0x04ed, blocks: (B:397:0x0481, B:399:0x0495, B:401:0x04a9, B:404:0x04c7, B:406:0x04d3), top: B:424:0x047f }] */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.android.billingclient.api.BillingResult launchBillingFlow(android.app.Activity r32, final com.android.billingclient.api.BillingFlowParams r33) {
        /*
            Method dump skipped, instructions count: 1330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.launchBillingFlow(android.app.Activity, com.android.billingclient.api.BillingFlowParams):com.android.billingclient.api.BillingResult");
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        if (!isReady()) {
            this.zzf.zza(zzbx.zzb(2, 7, zzca.zzm));
            productDetailsResponseListener.onProductDetailsResponse(zzca.zzm, new ArrayList());
        } else if (!this.zzt) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Querying product details is not supported.");
            this.zzf.zza(zzbx.zzb(20, 7, zzca.zzv));
            productDetailsResponseListener.onProductDetailsResponse(zzca.zzv, new ArrayList());
        } else if (zzak(new Callable() { // from class: com.android.billingclient.api.zzaj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzn(queryProductDetailsParams, productDetailsResponseListener);
                return null;
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzak
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzY(productDetailsResponseListener);
            }
        }, zzag()) == null) {
            BillingResult zzai = zzai();
            this.zzf.zza(zzbx.zzb(25, 7, zzai));
            productDetailsResponseListener.onProductDetailsResponse(zzai, new ArrayList());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(QueryPurchaseHistoryParams queryPurchaseHistoryParams, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzal(queryPurchaseHistoryParams.zza(), purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener) {
        zzam(queryPurchasesParams.zza(), purchasesResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, final SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!isReady()) {
            this.zzf.zza(zzbx.zzb(2, 8, zzca.zzm));
            skuDetailsResponseListener.onSkuDetailsResponse(zzca.zzm, null);
            return;
        }
        String skuType = skuDetailsParams.getSkuType();
        List<String> skusList = skuDetailsParams.getSkusList();
        if (TextUtils.isEmpty(skuType)) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please fix the input params. SKU type can't be empty.");
            this.zzf.zza(zzbx.zzb(49, 8, zzca.zzf));
            skuDetailsResponseListener.onSkuDetailsResponse(zzca.zzf, null);
        } else if (skusList == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            this.zzf.zza(zzbx.zzb(48, 8, zzca.zze));
            skuDetailsResponseListener.onSkuDetailsResponse(zzca.zze, null);
        } else if (zzak(new Callable(skuType, skusList, null, skuDetailsResponseListener) { // from class: com.android.billingclient.api.zzy
            public final /* synthetic */ String zzb;
            public final /* synthetic */ List zzc;
            public final /* synthetic */ SkuDetailsResponseListener zzd;

            {
                this.zzd = skuDetailsResponseListener;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzo(this.zzb, this.zzc, null, this.zzd);
                return null;
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzz
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzab(skuDetailsResponseListener);
            }
        }, zzag()) == null) {
            BillingResult zzai = zzai();
            this.zzf.zza(zzbx.zzb(25, 8, zzai));
            skuDetailsResponseListener.onSkuDetailsResponse(zzai, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showInAppMessages(final Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {
        if (!isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Service disconnected.");
            return zzca.zzm;
        } else if (!this.zzp) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support showing in-app messages.");
            return zzca.zzw;
        } else {
            View findViewById = activity.findViewById(16908290);
            IBinder windowToken = findViewById.getWindowToken();
            Rect rect = new Rect();
            findViewById.getGlobalVisibleRect(rect);
            final Bundle bundle = new Bundle();
            BundleCompat.putBinder(bundle, "KEY_WINDOW_TOKEN", windowToken);
            bundle.putInt("KEY_DIMEN_LEFT", rect.left);
            bundle.putInt("KEY_DIMEN_TOP", rect.top);
            bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
            bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
            bundle.putString("playBillingLibraryVersion", this.zzb);
            bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.zza());
            final zzas zzasVar = new zzas(this, this.zzc, inAppMessageResponseListener);
            zzak(new Callable() { // from class: com.android.billingclient.api.zzal
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    BillingClientImpl.this.zzp(bundle, activity, zzasVar);
                    return null;
                }
            }, 5000L, null, this.zzc);
            return zzca.zzl;
        }
    }

    public final /* synthetic */ void zzQ(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        this.zzf.zza(zzbx.zzb(24, 3, zzca.zzn));
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzca.zzn);
    }

    public final /* synthetic */ void zzR(BillingResult billingResult) {
        if (this.zzd.zzd() != null) {
            this.zzd.zzd().onPurchasesUpdated(billingResult, null);
        } else {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    public final /* synthetic */ void zzS(ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        this.zzf.zza(zzbx.zzb(24, 4, zzca.zzn));
        consumeResponseListener.onConsumeResponse(zzca.zzn, consumeParams.getPurchaseToken());
    }

    public final /* synthetic */ void zzT(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        this.zzf.zza(zzbx.zzb(24, 15, zzca.zzn));
        alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(zzca.zzn, null);
    }

    public final /* synthetic */ void zzU(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        this.zzf.zza(zzbx.zzb(24, 24, zzca.zzn));
        externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(zzca.zzn, null);
    }

    public final /* synthetic */ void zzV(BillingConfigResponseListener billingConfigResponseListener) {
        this.zzf.zza(zzbx.zzb(24, 13, zzca.zzn));
        billingConfigResponseListener.onBillingConfigResponse(zzca.zzn, null);
    }

    public final /* synthetic */ void zzW(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        this.zzf.zza(zzbx.zzb(24, 14, zzca.zzn));
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(zzca.zzn);
    }

    public final /* synthetic */ void zzX(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        this.zzf.zza(zzbx.zzb(24, 23, zzca.zzn));
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(zzca.zzn);
    }

    public final /* synthetic */ void zzY(ProductDetailsResponseListener productDetailsResponseListener) {
        this.zzf.zza(zzbx.zzb(24, 7, zzca.zzn));
        productDetailsResponseListener.onProductDetailsResponse(zzca.zzn, new ArrayList());
    }

    public final /* synthetic */ void zzZ(PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        this.zzf.zza(zzbx.zzb(24, 11, zzca.zzn));
        purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzca.zzn, null);
    }

    public final /* synthetic */ void zzaa(PurchasesResponseListener purchasesResponseListener) {
        this.zzf.zza(zzbx.zzb(24, 9, zzca.zzn));
        purchasesResponseListener.onQueryPurchasesResponse(zzca.zzn, com.google.android.gms.internal.play_billing.zzai.zzk());
    }

    public final /* synthetic */ void zzab(SkuDetailsResponseListener skuDetailsResponseListener) {
        this.zzf.zza(zzbx.zzb(24, 8, zzca.zzn));
        skuDetailsResponseListener.onSkuDetailsResponse(zzca.zzn, null);
    }

    public final /* synthetic */ void zzac(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        this.zzf.zza(zzbx.zzb(24, 16, zzca.zzn));
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(zzca.zzn);
    }

    public final /* synthetic */ void zzad(ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        this.zzf.zza(zzbx.zzb(24, 25, zzca.zzn));
        externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(zzca.zzn);
    }

    public final /* synthetic */ Bundle zzc(int i, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) throws Exception {
        return this.zzg.zzg(i, this.zze.getPackageName(), str, str2, null, bundle);
    }

    public final /* synthetic */ Bundle zzd(String str, String str2) throws Exception {
        return this.zzg.zzf(3, this.zze.getPackageName(), str, str2, null);
    }

    public final /* synthetic */ Object zzk(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) throws Exception {
        try {
            com.google.android.gms.internal.play_billing.zzs zzsVar = this.zzg;
            String packageName = this.zze.getPackageName();
            String purchaseToken = acknowledgePurchaseParams.getPurchaseToken();
            String str = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            Bundle zzd = zzsVar.zzd(9, packageName, purchaseToken, bundle);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzca.zza(com.google.android.gms.internal.play_billing.zzb.zzb(zzd, "BillingClient"), com.google.android.gms.internal.play_billing.zzb.zzg(zzd, "BillingClient")));
            return null;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Error acknowledge purchase!", e);
            this.zzf.zza(zzbx.zzb(28, 3, zzca.zzm));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzca.zzm);
            return null;
        }
    }

    public final /* synthetic */ Object zzl(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) throws Exception {
        int zza;
        String str;
        String purchaseToken = consumeParams.getPurchaseToken();
        try {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Consuming purchase with token: " + purchaseToken);
            if (this.zzn) {
                com.google.android.gms.internal.play_billing.zzs zzsVar = this.zzg;
                String packageName = this.zze.getPackageName();
                boolean z = this.zzn;
                String str2 = this.zzb;
                Bundle bundle = new Bundle();
                if (z) {
                    bundle.putString("playBillingLibraryVersion", str2);
                }
                Bundle zze = zzsVar.zze(9, packageName, purchaseToken, bundle);
                zza = zze.getInt("RESPONSE_CODE");
                str = com.google.android.gms.internal.play_billing.zzb.zzg(zze, "BillingClient");
            } else {
                zza = this.zzg.zza(3, this.zze.getPackageName(), purchaseToken);
                str = "";
            }
            BillingResult zza2 = zzca.zza(zza, str);
            if (zza == 0) {
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Successfully consumed purchase.");
                consumeResponseListener.onConsumeResponse(zza2, purchaseToken);
                return null;
            }
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Error consuming purchase with token. Response code: " + zza);
            this.zzf.zza(zzbx.zzb(23, 4, zza2));
            consumeResponseListener.onConsumeResponse(zza2, purchaseToken);
            return null;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Error consuming purchase!", e);
            this.zzf.zza(zzbx.zzb(29, 4, zzca.zzm));
            consumeResponseListener.onConsumeResponse(zzca.zzm, purchaseToken);
            return null;
        }
    }

    public final /* synthetic */ Object zzm(Bundle bundle, BillingConfigResponseListener billingConfigResponseListener) throws Exception {
        try {
            this.zzg.zzp(18, this.zze.getPackageName(), bundle, new zzbg(billingConfigResponseListener, this.zzf, null));
        } catch (DeadObjectException e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "getBillingConfig got a dead object exception (try to reconnect).", e);
            this.zzf.zza(zzbx.zzb(62, 13, zzca.zzm));
            billingConfigResponseListener.onBillingConfigResponse(zzca.zzm, null);
        } catch (Exception e2) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "getBillingConfig got an exception.", e2);
            this.zzf.zza(zzbx.zzb(62, 13, zzca.zzj));
            billingConfigResponseListener.onBillingConfigResponse(zzca.zzj, null);
        }
        return null;
    }

    public final /* synthetic */ Object zzn(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener) throws Exception {
        String str;
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        String zzb = queryProductDetailsParams.zzb();
        com.google.android.gms.internal.play_billing.zzai zza = queryProductDetailsParams.zza();
        int size = zza.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                str = "";
                i = 0;
                break;
            }
            int i4 = i3 + 20;
            ArrayList arrayList2 = new ArrayList(zza.subList(i3, i4 > size ? size : i4));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                arrayList3.add(((QueryProductDetailsParams.Product) arrayList2.get(i5)).zza());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.zzb);
            try {
                com.google.android.gms.internal.play_billing.zzs zzsVar = this.zzg;
                int i6 = true != this.zzw ? 17 : 20;
                String packageName = this.zze.getPackageName();
                String str2 = this.zzb;
                if (TextUtils.isEmpty(null)) {
                    this.zze.getPackageName();
                }
                if (TextUtils.isEmpty(null)) {
                    this.zze.getPackageName();
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("playBillingLibraryVersion", str2);
                bundle2.putBoolean("enablePendingPurchases", true);
                bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                int size3 = arrayList2.size();
                com.google.android.gms.internal.play_billing.zzai zzaiVar = zza;
                int i7 = 0;
                boolean z = false;
                boolean z2 = false;
                while (i7 < size3) {
                    ArrayList arrayList6 = arrayList2;
                    arrayList4.add(null);
                    z2 |= !TextUtils.isEmpty(null);
                    int i8 = size;
                    if (((QueryProductDetailsParams.Product) arrayList2.get(i7)).zzb().equals("first_party")) {
                        com.google.android.gms.internal.play_billing.zzaa.zzc(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                        arrayList5.add(null);
                        z = true;
                    }
                    i7++;
                    size = i8;
                    arrayList2 = arrayList6;
                }
                int i9 = size;
                if (z2) {
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (z && !TextUtils.isEmpty(null)) {
                    bundle2.putString("accountName", null);
                }
                i2 = 7;
                try {
                    Bundle zzl = zzsVar.zzl(i6, packageName, zzb, bundle, bundle2);
                    str = "Item is unavailable for purchase.";
                    if (zzl != null) {
                        if (zzl.containsKey("DETAILS_LIST")) {
                            ArrayList<String> stringArrayList = zzl.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList != null) {
                                for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                                    try {
                                        ProductDetails productDetails = new ProductDetails(stringArrayList.get(i10));
                                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Got product details: ".concat(productDetails.toString()));
                                        arrayList.add(productDetails);
                                    } catch (JSONException e) {
                                        com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                                        str = "Error trying to decode SkuDetails.";
                                        this.zzf.zza(zzbx.zzb(47, 7, zzca.zza(6, "Error trying to decode SkuDetails.")));
                                        i = 6;
                                        productDetailsResponseListener.onProductDetailsResponse(zzca.zza(i, str), arrayList);
                                        return null;
                                    }
                                }
                                i3 = i4;
                                zza = zzaiVar;
                                size = i9;
                            } else {
                                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "queryProductDetailsAsync got null response list");
                                this.zzf.zza(zzbx.zzb(46, 7, zzca.zzC));
                                break;
                            }
                        } else {
                            i = com.google.android.gms.internal.play_billing.zzb.zzb(zzl, "BillingClient");
                            str = com.google.android.gms.internal.play_billing.zzb.zzg(zzl, "BillingClient");
                            if (i != 0) {
                                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + i);
                                this.zzf.zza(zzbx.zzb(23, 7, zzca.zza(i, str)));
                            } else {
                                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                                this.zzf.zza(zzbx.zzb(45, 7, zzca.zza(6, str)));
                            }
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "queryProductDetailsAsync got empty product details response.");
                        this.zzf.zza(zzbx.zzb(44, 7, zzca.zzC));
                        break;
                    }
                } catch (Exception e2) {
                    e = e2;
                    com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    this.zzf.zza(zzbx.zzb(43, i2, zzca.zzj));
                    str = "An internal error occurred.";
                    i = 6;
                    productDetailsResponseListener.onProductDetailsResponse(zzca.zza(i, str), arrayList);
                    return null;
                }
            } catch (Exception e3) {
                e = e3;
                i2 = 7;
            }
        }
        i = 4;
        productDetailsResponseListener.onProductDetailsResponse(zzca.zza(i, str), arrayList);
        return null;
    }

    public final /* synthetic */ Object zzo(String str, List list, String str2, SkuDetailsResponseListener skuDetailsResponseListener) throws Exception {
        String str3;
        int i;
        Bundle zzk;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                str3 = "";
                i = 0;
                break;
            }
            int i3 = i2 + 20;
            ArrayList<String> arrayList2 = new ArrayList<>(list.subList(i2, i3 > size ? size : i3));
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle.putString("playBillingLibraryVersion", this.zzb);
            try {
                if (this.zzo) {
                    com.google.android.gms.internal.play_billing.zzs zzsVar = this.zzg;
                    String packageName = this.zze.getPackageName();
                    int i4 = this.zzk;
                    String str4 = this.zzb;
                    Bundle bundle2 = new Bundle();
                    if (i4 >= 9) {
                        bundle2.putString("playBillingLibraryVersion", str4);
                    }
                    if (i4 >= 9) {
                        bundle2.putBoolean("enablePendingPurchases", true);
                    }
                    zzk = zzsVar.zzl(10, packageName, str, bundle, bundle2);
                } else {
                    zzk = this.zzg.zzk(3, this.zze.getPackageName(), str, bundle);
                }
                str3 = "Item is unavailable for purchase.";
                if (zzk != null) {
                    if (zzk.containsKey("DETAILS_LIST")) {
                        ArrayList<String> stringArrayList = zzk.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null) {
                            for (int i5 = 0; i5 < stringArrayList.size(); i5++) {
                                try {
                                    SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i5));
                                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                                    arrayList.add(skuDetails);
                                } catch (JSONException e) {
                                    com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got a JSON exception trying to decode SkuDetails.", e);
                                    str3 = "Error trying to decode SkuDetails.";
                                    this.zzf.zza(zzbx.zzb(47, 8, zzca.zza(6, "Error trying to decode SkuDetails.")));
                                    arrayList = null;
                                    i = 6;
                                    skuDetailsResponseListener.onSkuDetailsResponse(zzca.zza(i, str3), arrayList);
                                    return null;
                                }
                            }
                            i2 = i3;
                        } else {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "querySkuDetailsAsync got null response list");
                            this.zzf.zza(zzbx.zzb(46, 8, zzca.zzC));
                            break;
                        }
                    } else {
                        int zzb = com.google.android.gms.internal.play_billing.zzb.zzb(zzk, "BillingClient");
                        str3 = com.google.android.gms.internal.play_billing.zzb.zzg(zzk, "BillingClient");
                        if (zzb != 0) {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() failed. Response code: " + zzb);
                            this.zzf.zza(zzbx.zzb(23, 8, zzca.zza(zzb, str3)));
                            i = zzb;
                        } else {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                            this.zzf.zza(zzbx.zzb(45, 8, zzca.zza(6, str3)));
                        }
                    }
                } else {
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "querySkuDetailsAsync got null sku details list");
                    this.zzf.zza(zzbx.zzb(44, 8, zzca.zzC));
                    break;
                }
            } catch (Exception e2) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect).", e2);
                this.zzf.zza(zzbx.zzb(43, 8, zzca.zzm));
                str3 = "Service connection is disconnected.";
                i = -1;
                arrayList = null;
            }
        }
        arrayList = null;
        i = 4;
        skuDetailsResponseListener.onSkuDetailsResponse(zzca.zza(i, str3), arrayList);
        return null;
    }

    public final /* synthetic */ Object zzp(Bundle bundle, Activity activity, ResultReceiver resultReceiver) throws Exception {
        this.zzg.zzt(12, this.zze.getPackageName(), bundle, new zzbo(new WeakReference(activity), resultReceiver, null));
        return null;
    }

    public final /* synthetic */ Void zzq(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) throws Exception {
        try {
            this.zzg.zzm(21, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new zzba(alternativeBillingOnlyReportingDetailsListener, this.zzf, null));
        } catch (Exception unused) {
            this.zzf.zza(zzbx.zzb(70, 15, zzca.zzj));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(zzca.zzj, null);
        }
        return null;
    }

    public final /* synthetic */ Void zzr(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) throws Exception {
        try {
            this.zzg.zzn(22, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new zzbc(externalOfferReportingDetailsListener, this.zzf, null));
        } catch (Exception e) {
            this.zzf.zza(zzbx.zzc(94, 24, zzca.zzj, String.format("%s: %s", e.getClass().getName(), com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage()))));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(zzca.zzj, null);
        }
        return null;
    }

    public final /* synthetic */ Void zzs(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) throws Exception {
        try {
            this.zzg.zzr(21, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new zzbk(alternativeBillingOnlyAvailabilityListener, this.zzf, null));
        } catch (Exception unused) {
            this.zzf.zza(zzbx.zzb(69, 14, zzca.zzj));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(zzca.zzj);
        }
        return null;
    }

    public final /* synthetic */ Void zzt(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) throws Exception {
        try {
            this.zzg.zzs(22, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new zzbm(externalOfferAvailabilityListener, this.zzf, null));
        } catch (Exception e) {
            this.zzf.zza(zzbx.zzc(91, 23, zzca.zzj, String.format("%s: %s", e.getClass().getName(), com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage()))));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(zzca.zzj);
        }
        return null;
    }

    public final /* synthetic */ Void zzu(Activity activity, ResultReceiver resultReceiver, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) throws Exception {
        try {
            this.zzg.zzo(21, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new zzbe(new WeakReference(activity), resultReceiver, null));
        } catch (Exception unused) {
            this.zzf.zza(zzbx.zzb(74, 16, zzca.zzj));
            alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(zzca.zzj);
        }
        return null;
    }

    public final /* synthetic */ Void zzv(Activity activity, ResultReceiver resultReceiver, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) throws Exception {
        try {
            this.zzg.zzq(22, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new zzbi(new WeakReference(activity), resultReceiver, null));
        } catch (Exception e) {
            this.zzf.zza(zzbx.zzc(98, 25, zzca.zzj, String.format("%s: %s", e.getClass().getName(), com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage()))));
            externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(zzca.zzj);
        }
        return null;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzal(str, purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener) {
        zzam(str, purchasesResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public BillingResult showAlternativeBillingOnlyInformationDialog(final Activity activity, final AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            this.zzf.zza(zzbx.zzb(2, 16, zzca.zzm));
            return zzca.zzm;
        } else if (!this.zzx) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            this.zzf.zza(zzbx.zzb(66, 16, zzca.zzE));
            return zzca.zzE;
        } else {
            final zzat zzatVar = new zzat(this, this.zzc, alternativeBillingOnlyInformationDialogListener);
            if (zzak(new Callable() { // from class: com.android.billingclient.api.zzo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    BillingClientImpl.this.zzu(activity, zzatVar, alternativeBillingOnlyInformationDialogListener);
                    return null;
                }
            }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzp
                @Override // java.lang.Runnable
                public final void run() {
                    BillingClientImpl.this.zzac(alternativeBillingOnlyInformationDialogListener);
                }
            }, this.zzc) == null) {
                BillingResult zzai = zzai();
                this.zzf.zza(zzbx.zzb(25, 16, zzai));
                return zzai;
            }
            return zzca.zzl;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public BillingResult showExternalOfferInformationDialog(final Activity activity, final ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            this.zzf.zza(zzbx.zzb(2, 25, zzca.zzm));
            return zzca.zzm;
        } else if (!this.zzy) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current Play Store version doesn't support external offer.");
            this.zzf.zza(zzbx.zzb(103, 25, zzca.zzy));
            return zzca.zzy;
        } else {
            final zzau zzauVar = new zzau(this, this.zzc, externalOfferInformationDialogListener);
            if (zzak(new Callable() { // from class: com.android.billingclient.api.zzaf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    BillingClientImpl.this.zzv(activity, zzauVar, externalOfferInformationDialogListener);
                    return null;
                }
            }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new Runnable() { // from class: com.android.billingclient.api.zzah
                @Override // java.lang.Runnable
                public final void run() {
                    BillingClientImpl.this.zzad(externalOfferInformationDialogListener);
                }
            }, this.zzc) == null) {
                BillingResult zzai = zzai();
                this.zzf.zza(zzbx.zzb(25, 25, zzai));
                return zzai;
            }
            return zzca.zzl;
        }
    }

    private BillingClientImpl(Context context, zzcn zzcnVar, PurchasesUpdatedListener purchasesUpdatedListener, String str, String str2, UserChoiceBillingListener userChoiceBillingListener, zzby zzbyVar, ExecutorService executorService) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
        initialize(context, purchasesUpdatedListener, zzcnVar, userChoiceBillingListener, str, (zzby) null);
    }

    private BillingClientImpl(String str) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
    }

    public BillingClientImpl(String str, Context context, zzby zzbyVar, ExecutorService executorService) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        String zzaj = zzaj();
        this.zzb = zzaj;
        this.zze = context.getApplicationContext();
        zzha zzz = zzhb.zzz();
        zzz.zzj(zzaj);
        zzz.zzi(this.zze.getPackageName());
        this.zzf = new zzcd(this.zze, (zzhb) zzz.zzc());
        this.zze.getPackageName();
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzcn zzcnVar, UserChoiceBillingListener userChoiceBillingListener, String str, zzby zzbyVar) {
        this.zze = context.getApplicationContext();
        zzha zzz = zzhb.zzz();
        zzz.zzj(str);
        zzz.zzi(this.zze.getPackageName());
        if (zzbyVar != null) {
            this.zzf = zzbyVar;
        } else {
            this.zzf = new zzcd(this.zze, (zzhb) zzz.zzc());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzd = new zzk(this.zze, purchasesUpdatedListener, null, null, userChoiceBillingListener, this.zzf);
        this.zzz = zzcnVar;
        this.zzA = userChoiceBillingListener != null;
    }

    public BillingClientImpl(String str, zzcn zzcnVar, Context context, zzcg zzcgVar, zzby zzbyVar, ExecutorService executorService) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = zzaj();
        this.zze = context.getApplicationContext();
        zzha zzz = zzhb.zzz();
        zzz.zzj(zzaj());
        zzz.zzi(this.zze.getPackageName());
        this.zzf = new zzcd(this.zze, (zzhb) zzz.zzc());
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.zzd = new zzk(this.zze, null, null, null, null, this.zzf);
        this.zzz = zzcnVar;
        this.zze.getPackageName();
    }

    public BillingClientImpl(String str, zzcn zzcnVar, Context context, PurchasesUpdatedListener purchasesUpdatedListener, AlternativeBillingListener alternativeBillingListener, zzby zzbyVar, ExecutorService executorService) {
        String zzaj = zzaj();
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = zzaj;
        initialize(context, purchasesUpdatedListener, zzcnVar, alternativeBillingListener, zzaj, (zzby) null);
    }

    public BillingClientImpl(String str, zzcn zzcnVar, Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, zzby zzbyVar, ExecutorService executorService) {
        this(context, zzcnVar, purchasesUpdatedListener, zzaj(), null, userChoiceBillingListener, null, null);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        if (isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service connection is valid. No need to re-initialize.");
            this.zzf.zzb(zzbx.zzd(6));
            billingClientStateListener.onBillingSetupFinished(zzca.zzl);
            return;
        }
        int i = 1;
        if (this.zza == 1) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Client is already in the process of connecting to billing service.");
            this.zzf.zza(zzbx.zzb(37, 6, zzca.zzd));
            billingClientStateListener.onBillingSetupFinished(zzca.zzd);
        } else if (this.zza == 3) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            this.zzf.zza(zzbx.zzb(38, 6, zzca.zzm));
            billingClientStateListener.onBillingSetupFinished(zzca.zzm);
        } else {
            this.zza = 1;
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Starting in-app billing setup.");
            this.zzh = new zzay(this, billingClientStateListener, null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.zze.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                i = 41;
            } else {
                ResolveInfo resolveInfo = queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null) {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "The device doesn't have valid Play Store.");
                        i = 40;
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.zzb);
                        if (this.zze.bindService(intent2, this.zzh, 1)) {
                            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service was bonded successfully.");
                            return;
                        } else {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Connection to Billing service is blocked.");
                            i = 39;
                        }
                    }
                }
            }
            this.zza = 0;
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing service unavailable on device.");
            this.zzf.zza(zzbx.zzb(i, 6, zzca.zzc));
            billingClientStateListener.onBillingSetupFinished(zzca.zzc);
        }
    }
}
