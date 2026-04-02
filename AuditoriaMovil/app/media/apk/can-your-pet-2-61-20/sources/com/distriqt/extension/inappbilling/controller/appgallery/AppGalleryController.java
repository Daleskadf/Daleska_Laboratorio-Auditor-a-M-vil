package com.distriqt.extension.inappbilling.controller.appgallery;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.DebugUtil;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.inappbilling.activities.ProductViewActivity;
import com.distriqt.extension.inappbilling.controller.BillingService;
import com.distriqt.extension.inappbilling.controller.BillingServiceController;
import com.distriqt.extension.inappbilling.controller.InAppBillingAvailability;
import com.distriqt.extension.inappbilling.controller.InAppUpdates;
import com.distriqt.extension.inappbilling.controller.Product;
import com.distriqt.extension.inappbilling.controller.Purchase;
import com.distriqt.extension.inappbilling.controller.PurchaseChangeRequest;
import com.distriqt.extension.inappbilling.controller.PurchaseRequest;
import com.distriqt.extension.inappbilling.events.AvailabilityEvent;
import com.distriqt.extension.inappbilling.events.InAppBillingEvent;
import com.distriqt.extension.inappbilling.events.ProductViewEvent;
import com.distriqt.extension.inappbilling.events.PurchaseEvent;
import com.distriqt.extension.inappbilling.utils.Errors;
import com.distriqt.extension.inappbilling.utils.Logger;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.AGConnectOptionsBuilder;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.iap.Iap;
import com.huawei.hms.iap.IapApiException;
import com.huawei.hms.iap.entity.ConsumeOwnedPurchaseReq;
import com.huawei.hms.iap.entity.ConsumeOwnedPurchaseResult;
import com.huawei.hms.iap.entity.IsEnvReadyResult;
import com.huawei.hms.iap.entity.OwnedPurchasesReq;
import com.huawei.hms.iap.entity.OwnedPurchasesResult;
import com.huawei.hms.iap.entity.ProductInfo;
import com.huawei.hms.iap.entity.ProductInfoReq;
import com.huawei.hms.iap.entity.ProductInfoResult;
import com.huawei.hms.iap.entity.PurchaseIntentReq;
import com.huawei.hms.iap.entity.PurchaseIntentResult;
import com.huawei.hms.iap.entity.PurchaseResultInfo;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.common.Base64;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONArray;
/* loaded from: classes.dex */
public class AppGalleryController extends ActivityStateListener implements BillingServiceController {
    private static final int RC_ERROR_RESOLUTION = 667659;
    private static final int RC_MAKEPURCHASE = 667658;
    private static final String TAG = "AppGalleryController";
    private IExtensionContext _extContext;
    private ArrayList<Purchase> _getPurchasesList;
    private AppGalleryInAppUpdates _inAppUpdates;
    private ArrayList<Purchase> _restorePurchasesList;
    private Boolean _setupComplete = false;
    private BillingService _service = null;
    private final OnFailureListener getProductsFailureListener = new OnFailureListener() { // from class: com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryController.4
        public void onFailure(Exception exc) {
            String str = AppGalleryController.TAG;
            Object[] objArr = new Object[1];
            int i = 0;
            objArr[0] = exc == null ? "null" : exc.getLocalizedMessage();
            Logger.d(str, "getProducts():onFailure( %s )", objArr);
            String localizedMessage = exc == null ? "Unknown error" : exc.getLocalizedMessage();
            if (exc != null) {
                exc.printStackTrace();
                if (exc instanceof IapApiException) {
                    Status status = ((IapApiException) exc).getStatus();
                    i = status.getStatusCode();
                    localizedMessage = status.getStatusMessage();
                }
            }
            AppGalleryController.this._extContext.dispatchEvent(InAppBillingEvent.PRODUCTS_FAILED, InAppBillingEvent.formatErrorForEvent(AppGalleryUtils.toErrorCode(i), localizedMessage));
        }
    };
    private final OnFailureListener restorePurchases_failureListener = new OnFailureListener() { // from class: com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryController.8
        public void onFailure(Exception exc) {
            String str = AppGalleryController.TAG;
            Object[] objArr = new Object[1];
            int i = 0;
            objArr[0] = exc == null ? "null" : exc.getLocalizedMessage();
            Logger.d(str, "restorePurchases_failureListener():onFailure( %s )", objArr);
            String localizedMessage = exc == null ? "Unknown error" : exc.getLocalizedMessage();
            if (exc != null) {
                exc.printStackTrace();
                if (exc instanceof IapApiException) {
                    Status status = ((IapApiException) exc).getStatus();
                    i = status.getStatusCode();
                    localizedMessage = status.getStatusMessage();
                }
            }
            AppGalleryController.this._extContext.dispatchEvent(InAppBillingEvent.RESTORE_PURCHASES_FAILED, InAppBillingEvent.formatErrorForEvent(AppGalleryUtils.toErrorCode(i), localizedMessage));
        }
    };
    private final OnFailureListener getPurchases_failureListener = new OnFailureListener() { // from class: com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryController.12
        public void onFailure(Exception exc) {
            String str = AppGalleryController.TAG;
            Object[] objArr = new Object[1];
            int i = 0;
            objArr[0] = exc == null ? "null" : exc.getLocalizedMessage();
            Logger.d(str, "getPurchases():onFailure( %s )", objArr);
            String localizedMessage = exc == null ? "Unknown error" : exc.getLocalizedMessage();
            if (exc != null) {
                exc.printStackTrace();
                if (exc instanceof IapApiException) {
                    Status status = ((IapApiException) exc).getStatus();
                    i = status.getStatusCode();
                    localizedMessage = status.getStatusMessage();
                }
            }
            AppGalleryController.this._extContext.dispatchEvent(PurchaseEvent.GET_PURCHASES_FAILED, PurchaseEvent.formatErrorForEvent(AppGalleryUtils.toErrorCode(i), localizedMessage));
        }
    };
    private ArrayList<String> _productIds = new ArrayList<>();
    private ArrayList<String> _subscriptionIds = new ArrayList<>();
    private HashMap<String, ProductInfo> _productMap = new HashMap<>();
    protected final Handler _handler = new Handler(Looper.getMainLooper());

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean areSubscriptionsSupported() {
        return false;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean changePurchase(PurchaseChangeRequest purchaseChangeRequest) {
        return false;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean getUserData() {
        return false;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean isChangePurchaseSupported() {
        return false;
    }

    public AppGalleryController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean isSupported() {
        return AppGalleryControllerSupport.supported(this._extContext.getActivity());
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean setup(BillingService billingService) {
        Activity activity;
        try {
            this._service = billingService;
            activity = this._extContext.getActivity();
        } catch (Exception e) {
            Errors.handleException(e);
        }
        if (configurationFileExists(activity)) {
            AGConnectInstance.initialize(activity, new AGConnectOptionsBuilder().setInputStream(activity.getAssets().open("agconnect-services.json")));
            Iap.getIapClient(activity).isEnvReady().addOnSuccessListener(new OnSuccessListener() { // from class: com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryController$$ExternalSyntheticLambda1
                public final void onSuccess(Object obj) {
                    AppGalleryController.this.m256x9543c5af((IsEnvReadyResult) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryController$$ExternalSyntheticLambda2
                public final void onFailure(Exception exc) {
                    AppGalleryController.this.m257x73372b8e(exc);
                }
            });
            return true;
        }
        this._extContext.dispatchEvent(InAppBillingEvent.SETUP_FAILURE, InAppBillingEvent.formatErrorForEvent(0, "Missing agconnect-services.json configuration file"));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setup$0$com-distriqt-extension-inappbilling-controller-appgallery-AppGalleryController  reason: not valid java name */
    public /* synthetic */ void m256x9543c5af(IsEnvReadyResult isEnvReadyResult) {
        Logger.d(TAG, "setup():isEnvReady():onSuccess()", new Object[0]);
        this._extContext.dispatchEvent(InAppBillingEvent.SETUP_SUCCESS, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setup$1$com-distriqt-extension-inappbilling-controller-appgallery-AppGalleryController  reason: not valid java name */
    public /* synthetic */ void m257x73372b8e(Exception exc) {
        int i = 0;
        Logger.d(TAG, "setup():isEnvReady():onFailure(): %s", exc.getLocalizedMessage());
        String localizedMessage = exc.getLocalizedMessage();
        if (exc instanceof IapApiException) {
            Status status = ((IapApiException) exc).getStatus();
            i = status.getStatusCode();
            localizedMessage = status.getStatusMessage();
            try {
                if (status.hasResolution()) {
                    status.startResolutionForResult(this._extContext.getActivity(), (int) RC_ERROR_RESOLUTION);
                    return;
                }
            } catch (Exception e) {
                Errors.handleException(e);
            }
        }
        this._extContext.dispatchEvent(InAppBillingEvent.SETUP_FAILURE, InAppBillingEvent.formatErrorForEvent(AppGalleryUtils.toErrorCode(i), localizedMessage));
    }

    private boolean configurationFileExists(Context context) {
        try {
            context.getAssets().open("agconnect-services.json").close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private void setup_handleResolution(int i, int i2, Intent intent) {
        int intExtra;
        String str = TAG;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = intent == null ? "null" : DebugUtil.bundleToString(intent.getExtras());
        Logger.d(str, "setup_handleResolution( %d, %d, %s )", objArr);
        if (intent != null && (intExtra = intent.getIntExtra("returnCode", 1)) == 60000) {
            this._extContext.dispatchEvent(InAppBillingEvent.SETUP_FAILURE, InAppBillingEvent.formatErrorForEvent(AppGalleryUtils.toErrorCode(intExtra), "User cancelled login"));
        } else {
            setup(this._service);
        }
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean canMakePayments() {
        return isSupported();
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public String checkAvailability() {
        Logger.d(TAG, "checkAvailability()", new Object[0]);
        if (this._setupComplete.booleanValue()) {
            final String uuid = UUID.randomUUID().toString();
            this._handler.postDelayed(new Runnable() { // from class: com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryController$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AppGalleryController.this.m255x2b78f2a7(uuid);
                }
            }, 200L);
            return uuid;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$checkAvailability$2$com-distriqt-extension-inappbilling-controller-appgallery-AppGalleryController  reason: not valid java name */
    public /* synthetic */ void m255x2b78f2a7(String str) {
        this._extContext.dispatchEvent(AvailabilityEvent.COMPLETE, AvailabilityEvent.formatForEvent(str, canMakePayments() ? InAppBillingAvailability.AVAILABLE : InAppBillingAvailability.NOT_AVAILABLE));
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public void dispose() {
        try {
            this._setupComplete = false;
            isSupported();
            AppGalleryInAppUpdates appGalleryInAppUpdates = this._inAppUpdates;
            if (appGalleryInAppUpdates != null) {
                appGalleryInAppUpdates.dispose();
                this._inAppUpdates = null;
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean getProducts(List<String> list, List<String> list2, Boolean bool) {
        Logger.d(TAG, "getProducts( %s, %s )", list.toString(), list2.toString());
        if (bool.booleanValue()) {
            this._productIds.clear();
            this._subscriptionIds.clear();
        }
        for (String str : list) {
            if (!this._productIds.contains(str)) {
                this._productIds.add(str);
            }
        }
        for (String str2 : list2) {
            if (!this._subscriptionIds.contains(str2)) {
                this._subscriptionIds.add(str2);
            }
        }
        if (this._productIds.size() == 0 && this._subscriptionIds.size() == 0) {
            Logger.d(TAG, "getProducts(): NO PRODUCT IDS PROVIDED!", new Object[0]);
            return false;
        }
        try {
            final Context applicationContext = this._extContext.getActivity().getApplicationContext();
            final OnSuccessListener<ProductInfoResult> onSuccessListener = new OnSuccessListener<ProductInfoResult>() { // from class: com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryController.1
                public void onSuccess(ProductInfoResult productInfoResult) {
                    Logger.d(AppGalleryController.TAG, "getProducts():subscriptionsSuccessListener:onSuccess( %d )", Integer.valueOf(productInfoResult.getReturnCode()));
                    AppGalleryController.this.addProducts(productInfoResult.getProductInfoList());
                    AppGalleryController.this.processProductsLoaded();
                }
            };
            final OnSuccessListener<ProductInfoResult> onSuccessListener2 = new OnSuccessListener<ProductInfoResult>() { // from class: com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryController.2
                public void onSuccess(ProductInfoResult productInfoResult) {
                    Logger.d(AppGalleryController.TAG, "getProducts():nonconsumableSuccessListener:onSuccess( %d )", Integer.valueOf(productInfoResult.getReturnCode()));
                    AppGalleryController.this.addProducts(productInfoResult.getProductInfoList());
                    if (AppGalleryController.this._subscriptionIds.size() <= 0) {
                        AppGalleryController.this.processProductsLoaded();
                        return;
                    }
                    ProductInfoReq productInfoReq = new ProductInfoReq();
                    productInfoReq.setProductIds(AppGalleryController.this._subscriptionIds);
                    productInfoReq.setPriceType(2);
                    Iap.getIapClient(applicationContext).obtainProductInfo(productInfoReq).addOnSuccessListener(onSuccessListener).addOnFailureListener(AppGalleryController.this.getProductsFailureListener);
                }
            };
            OnSuccessListener<ProductInfoResult> onSuccessListener3 = new OnSuccessListener<ProductInfoResult>() { // from class: com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryController.3
                public void onSuccess(ProductInfoResult productInfoResult) {
                    Logger.d(AppGalleryController.TAG, "getProducts():consumableSuccessListener:onSuccess( %d )", Integer.valueOf(productInfoResult.getReturnCode()));
                    AppGalleryController.this.addProducts(productInfoResult.getProductInfoList());
                    ProductInfoReq productInfoReq = new ProductInfoReq();
                    productInfoReq.setProductIds(AppGalleryController.this._productIds);
                    productInfoReq.setPriceType(1);
                    Iap.getIapClient(applicationContext).obtainProductInfo(productInfoReq).addOnSuccessListener(onSuccessListener2).addOnFailureListener(AppGalleryController.this.getProductsFailureListener);
                }
            };
            if (this._productIds.size() > 0) {
                ProductInfoReq productInfoReq = new ProductInfoReq();
                productInfoReq.setProductIds(this._productIds);
                productInfoReq.setPriceType(0);
                Iap.getIapClient(applicationContext).obtainProductInfo(productInfoReq).addOnSuccessListener(onSuccessListener3).addOnFailureListener(this.getProductsFailureListener);
            } else if (this._subscriptionIds.size() > 0) {
                ProductInfoReq productInfoReq2 = new ProductInfoReq();
                productInfoReq2.setProductIds(this._subscriptionIds);
                productInfoReq2.setPriceType(2);
                Iap.getIapClient(applicationContext).obtainProductInfo(productInfoReq2).addOnSuccessListener(onSuccessListener).addOnFailureListener(this.getProductsFailureListener);
            }
            return true;
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProducts(List<ProductInfo> list) {
        Logger.d(TAG, "addProducts( [%d] )", Integer.valueOf(list.size()));
        for (ProductInfo productInfo : list) {
            Logger.d(TAG, "addProducts(): productId:%s", productInfo.getProductId());
            this._productMap.put(productInfo.getProductId(), productInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processProductsLoaded() {
        Iterator<String> it = this._productIds.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!this._productMap.containsKey(next)) {
                this._extContext.dispatchEvent(InAppBillingEvent.PRODUCT_INVALID, next);
            }
        }
        Iterator<String> it2 = this._subscriptionIds.iterator();
        while (it2.hasNext()) {
            String next2 = it2.next();
            if (!this._productMap.containsKey(next2)) {
                this._extContext.dispatchEvent(InAppBillingEvent.PRODUCT_INVALID, next2);
            }
        }
        this._extContext.dispatchEvent(InAppBillingEvent.PRODUCTS_LOADED, InAppBillingEvent.formatProductsForEvent(activeProducts()));
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public Map<String, Product> activeProducts() {
        HashMap hashMap = new HashMap();
        HashMap<String, ProductInfo> hashMap2 = this._productMap;
        if (hashMap2 != null) {
            for (Map.Entry<String, ProductInfo> entry : hashMap2.entrySet()) {
                String key = entry.getKey();
                hashMap.put(key, AppGalleryUtils.encodeProduct(key, entry.getValue()));
            }
        }
        return hashMap;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public ArrayList<String> activeProductIds() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(this._productIds);
        arrayList.addAll(this._subscriptionIds);
        return arrayList;
    }

    private boolean hasProducts() {
        HashMap<String, ProductInfo> hashMap = this._productMap;
        return hashMap != null && hashMap.size() > 0;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean restorePurchases() {
        Logger.d(TAG, "restorePurchases()", new Object[0]);
        try {
            this._restorePurchasesList = new ArrayList<>();
            final Context applicationContext = this._extContext.getActivity().getApplicationContext();
            final OnSuccessListener<OwnedPurchasesResult> onSuccessListener = new OnSuccessListener<OwnedPurchasesResult>() { // from class: com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryController.5
                public void onSuccess(OwnedPurchasesResult ownedPurchasesResult) {
                    Logger.d(AppGalleryController.TAG, "restorePurchases():subscriptionSuccessListener()", new Object[0]);
                    AppGalleryController.this.restorePurchases_process(ownedPurchasesResult);
                    AppGalleryController.this._extContext.dispatchEvent(PurchaseEvent.PURCHASES_UPDATED, PurchaseEvent.formatPurchasesForEvent(AppGalleryUtils.purchasesToPurchasesArray(AppGalleryController.this._restorePurchasesList), 0, ""));
                    AppGalleryController.this._extContext.dispatchEvent(InAppBillingEvent.RESTORE_PURCHASES_SUCCESS, "");
                }
            };
            final OnSuccessListener<OwnedPurchasesResult> onSuccessListener2 = new OnSuccessListener<OwnedPurchasesResult>() { // from class: com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryController.6
                public void onSuccess(OwnedPurchasesResult ownedPurchasesResult) {
                    Logger.d(AppGalleryController.TAG, "restorePurchases():nonconsumableSuccessListener()", new Object[0]);
                    AppGalleryController.this.restorePurchases_process(ownedPurchasesResult);
                    OwnedPurchasesReq ownedPurchasesReq = new OwnedPurchasesReq();
                    ownedPurchasesReq.setPriceType(2);
                    Iap.getIapClient(applicationContext).obtainOwnedPurchases(ownedPurchasesReq).addOnSuccessListener(onSuccessListener).addOnFailureListener(AppGalleryController.this.restorePurchases_failureListener);
                }
            };
            OnSuccessListener<OwnedPurchasesResult> onSuccessListener3 = new OnSuccessListener<OwnedPurchasesResult>() { // from class: com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryController.7
                public void onSuccess(OwnedPurchasesResult ownedPurchasesResult) {
                    Logger.d(AppGalleryController.TAG, "restorePurchases():consumableSuccessListener()", new Object[0]);
                    AppGalleryController.this.restorePurchases_process(ownedPurchasesResult);
                    OwnedPurchasesReq ownedPurchasesReq = new OwnedPurchasesReq();
                    ownedPurchasesReq.setPriceType(1);
                    Iap.getIapClient(applicationContext).obtainOwnedPurchases(ownedPurchasesReq).addOnSuccessListener(onSuccessListener2).addOnFailureListener(AppGalleryController.this.restorePurchases_failureListener);
                }
            };
            OwnedPurchasesReq ownedPurchasesReq = new OwnedPurchasesReq();
            ownedPurchasesReq.setPriceType(0);
            Iap.getIapClient(applicationContext).obtainOwnedPurchases(ownedPurchasesReq).addOnSuccessListener(onSuccessListener3).addOnFailureListener(this.restorePurchases_failureListener);
            return true;
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restorePurchases_process(OwnedPurchasesResult ownedPurchasesResult) {
        if (ownedPurchasesResult == null || ownedPurchasesResult.getInAppPurchaseDataList() == null) {
            return;
        }
        for (int i = 0; i < ownedPurchasesResult.getInAppPurchaseDataList().size(); i++) {
            String str = (String) ownedPurchasesResult.getInAppPurchaseDataList().get(i);
            String str2 = (String) ownedPurchasesResult.getInAppSignature().get(i);
            if (verifySignature(str, str2, this._service.huaweiAppGalleryPublicKey)) {
                Purchase createPurchase = AppGalleryUtils.createPurchase(str, str2, true);
                if (createPurchase != null) {
                    this._restorePurchasesList.add(createPurchase);
                } else {
                    Logger.d(TAG, "restorePurchases_process(): COULD NOT PROCESS DATA: %s", str);
                }
            } else {
                Logger.d(TAG, "restorePurchases_process(): VALIDATION FAILED: %s", str);
            }
        }
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean getPurchases(boolean z) {
        Logger.d(TAG, "getPurchases( %b )", Boolean.valueOf(z));
        try {
            this._getPurchasesList = new ArrayList<>();
            final Context applicationContext = this._extContext.getActivity().getApplicationContext();
            final OnSuccessListener<OwnedPurchasesResult> onSuccessListener = new OnSuccessListener<OwnedPurchasesResult>() { // from class: com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryController.9
                public void onSuccess(OwnedPurchasesResult ownedPurchasesResult) {
                    Logger.d(AppGalleryController.TAG, "getPurchases():subscriptionSuccessListener()", new Object[0]);
                    AppGalleryController.this.getPurchases_process(ownedPurchasesResult);
                    AppGalleryController.this.getPurchases_complete();
                }
            };
            final OnSuccessListener<OwnedPurchasesResult> onSuccessListener2 = new OnSuccessListener<OwnedPurchasesResult>() { // from class: com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryController.10
                public void onSuccess(OwnedPurchasesResult ownedPurchasesResult) {
                    Logger.d(AppGalleryController.TAG, "getPurchases():nonconsumableSuccessListener()", new Object[0]);
                    AppGalleryController.this.getPurchases_process(ownedPurchasesResult);
                    OwnedPurchasesReq ownedPurchasesReq = new OwnedPurchasesReq();
                    ownedPurchasesReq.setPriceType(2);
                    Iap.getIapClient(applicationContext).obtainOwnedPurchases(ownedPurchasesReq).addOnSuccessListener(onSuccessListener).addOnFailureListener(AppGalleryController.this.getPurchases_failureListener);
                }
            };
            OnSuccessListener<OwnedPurchasesResult> onSuccessListener3 = new OnSuccessListener<OwnedPurchasesResult>() { // from class: com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryController.11
                public void onSuccess(OwnedPurchasesResult ownedPurchasesResult) {
                    Logger.d(AppGalleryController.TAG, "getPurchases():consumableSuccessListener()", new Object[0]);
                    AppGalleryController.this.getPurchases_process(ownedPurchasesResult);
                    OwnedPurchasesReq ownedPurchasesReq = new OwnedPurchasesReq();
                    ownedPurchasesReq.setPriceType(1);
                    Iap.getIapClient(applicationContext).obtainOwnedPurchases(ownedPurchasesReq).addOnSuccessListener(onSuccessListener2).addOnFailureListener(AppGalleryController.this.getPurchases_failureListener);
                }
            };
            OwnedPurchasesReq ownedPurchasesReq = new OwnedPurchasesReq();
            ownedPurchasesReq.setPriceType(0);
            Iap.getIapClient(applicationContext).obtainOwnedPurchases(ownedPurchasesReq).addOnSuccessListener(onSuccessListener3).addOnFailureListener(this.getPurchases_failureListener);
            return true;
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getPurchases_process(OwnedPurchasesResult ownedPurchasesResult) {
        if (ownedPurchasesResult == null || ownedPurchasesResult.getInAppPurchaseDataList() == null) {
            return;
        }
        for (int i = 0; i < ownedPurchasesResult.getInAppPurchaseDataList().size(); i++) {
            String str = (String) ownedPurchasesResult.getInAppPurchaseDataList().get(i);
            String str2 = (String) ownedPurchasesResult.getInAppSignature().get(i);
            String str3 = TAG;
            Logger.d(str3, "getPurchases_process():[%d]:inAppPurchaseData=%s", Integer.valueOf(i), str);
            Logger.d(str3, "getPurchases_process():[%d]:inAppPurchaseDataSignature=%s", Integer.valueOf(i), str2);
            if (verifySignature(str, str2, this._service.huaweiAppGalleryPublicKey)) {
                Purchase createPurchase = AppGalleryUtils.createPurchase(str, str2, false);
                if (createPurchase != null) {
                    this._getPurchasesList.add(createPurchase);
                } else {
                    Logger.d(str3, "getPurchases_process(): COULD NOT PROCESS DATA: %s", str);
                }
            } else {
                Logger.d(str3, "getPurchases_process(): VALIDATION FAILED: %s", str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getPurchases_complete() {
        this._extContext.dispatchEvent(PurchaseEvent.GET_PURCHASES_COMPLETE, PurchaseEvent.formatPurchasesForEvent(AppGalleryUtils.purchasesToPurchasesArray(this._getPurchasesList), 0, ""));
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public JSONArray getPendingPurchases() {
        Logger.d(TAG, "getPendingPurchases()", new Object[0]);
        return new JSONArray();
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean isProductViewSupported() {
        PackageManager packageManager = this._extContext.getActivity().getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("appmarket://details?id="));
        return packageManager.queryIntentActivities(intent, 0).size() > 0;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean showProductView(String str) {
        if (isProductViewSupported()) {
            Intent intent = new Intent(this._extContext.getActivity().getApplicationContext(), ProductViewActivity.class);
            intent.putExtra("productId", str);
            intent.putExtra(NotificationCompat.CATEGORY_SERVICE, BillingService.HUAWEI_APP_GALLERY);
            this._extContext.getActivity().startActivity(intent);
            this._extContext.dispatchEvent(ProductViewEvent.LOADED, "");
            return true;
        }
        return false;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean makePurchase(PurchaseRequest purchaseRequest) {
        String str = TAG;
        Logger.d(str, "makePurchase( %s )", purchaseRequest.toString());
        if (hasProducts()) {
            ProductInfo productInfo = this._productMap.get(purchaseRequest.productId);
            if (productInfo == null) {
                Logger.d(str, "makePurchase(): Could not find matching product, have you called getProducts()?", new Object[0]);
                return false;
            }
            try {
                PurchaseIntentReq purchaseIntentReq = new PurchaseIntentReq();
                purchaseIntentReq.setPriceType(productInfo.getPriceType());
                purchaseIntentReq.setProductId(productInfo.getProductId());
                if (purchaseRequest.developerPayload != null && purchaseRequest.developerPayload.length() > 0) {
                    purchaseIntentReq.setDeveloperPayload(purchaseRequest.developerPayload);
                } else if (purchaseRequest.applicationUsername != null && purchaseRequest.applicationUsername.length() > 0) {
                    purchaseIntentReq.setDeveloperPayload(purchaseRequest.applicationUsername);
                }
                final Activity activity = this._extContext.getActivity();
                Iap.getIapClient(activity).createPurchaseIntent(purchaseIntentReq).addOnSuccessListener(new OnSuccessListener<PurchaseIntentResult>() { // from class: com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryController.14
                    public void onSuccess(PurchaseIntentResult purchaseIntentResult) {
                        Status status = purchaseIntentResult.getStatus();
                        if (status.hasResolution()) {
                            Logger.d(AppGalleryController.TAG, "makePurchase(): createPurchaseIntent:onSuccess: starting resolution", new Object[0]);
                            try {
                                status.startResolutionForResult(activity, (int) AppGalleryController.RC_MAKEPURCHASE);
                                return;
                            } catch (IntentSender.SendIntentException e) {
                                e.printStackTrace();
                                return;
                            }
                        }
                        Logger.d(AppGalleryController.TAG, "makePurchase(): createPurchaseIntent:onSuccess: failed", new Object[0]);
                        AppGalleryController.this._extContext.dispatchEvent(PurchaseEvent.PURCHASE_FAILED, PurchaseEvent.formatPurchaseForEvent(null, status.getStatusCode(), status.getStatusMessage()));
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryController.13
                    public void onFailure(Exception exc) {
                        String str2;
                        int i = 0;
                        Logger.d(AppGalleryController.TAG, "makePurchase(): createPurchaseIntent:onFailure", new Object[0]);
                        if (exc instanceof IapApiException) {
                            Status status = ((IapApiException) exc).getStatus();
                            i = status.getStatusCode();
                            str2 = status.getStatusMessage();
                        } else {
                            str2 = "Purchase failed";
                        }
                        AppGalleryController.this._extContext.dispatchEvent(PurchaseEvent.PURCHASE_FAILED, PurchaseEvent.formatPurchaseForEvent(null, AppGalleryUtils.toErrorCode(i), str2));
                    }
                });
                return true;
            } catch (Exception e) {
                Errors.handleException(e);
                return false;
            }
        }
        return false;
    }

    private void makePurchase_processResult(int i, int i2, Intent intent) {
        String str = TAG;
        Logger.d(str, "processMakePurchaseResult( %d, %d, %s )", Integer.valueOf(i), Integer.valueOf(i2), "");
        PurchaseResultInfo parsePurchaseResultInfoFromIntent = Iap.getIapClient(this._extContext.getActivity()).parsePurchaseResultInfoFromIntent(intent);
        Logger.d(str, "processMakePurchaseResult(): returnCode=%d", Integer.valueOf(parsePurchaseResultInfoFromIntent.getReturnCode()));
        int returnCode = parsePurchaseResultInfoFromIntent.getReturnCode();
        if (returnCode == -1) {
            this._extContext.dispatchEvent(PurchaseEvent.PURCHASE_FAILED, PurchaseEvent.formatPurchaseForEvent(null, 6, "Order state failed"));
        } else if (returnCode != 0) {
            if (returnCode == 60000) {
                this._extContext.dispatchEvent(PurchaseEvent.PURCHASE_FAILED, PurchaseEvent.formatPurchaseForEvent(null, 1, "Cancelled"));
            } else if (returnCode != 60051) {
            } else {
                this._extContext.dispatchEvent(PurchaseEvent.PURCHASE_FAILED, PurchaseEvent.formatPurchaseForEvent(null, 7, "Already owned"));
            }
        } else {
            try {
                String inAppPurchaseData = parsePurchaseResultInfoFromIntent.getInAppPurchaseData();
                String inAppDataSignature = parsePurchaseResultInfoFromIntent.getInAppDataSignature();
                Logger.d(str, "processMakePurchaseResult(): inAppPurchaseData=%s", inAppPurchaseData);
                Logger.d(str, "processMakePurchaseResult(): inAppPurchaseDataSignature=%s", inAppDataSignature);
                if (verifySignature(inAppPurchaseData, inAppDataSignature, this._service.huaweiAppGalleryPublicKey)) {
                    this._extContext.dispatchEvent(PurchaseEvent.PURCHASES_UPDATED, PurchaseEvent.formatPurchasesForEvent(AppGalleryUtils.encodePurchase(inAppPurchaseData, inAppDataSignature, false), parsePurchaseResultInfoFromIntent.getReturnCode(), parsePurchaseResultInfoFromIntent.getErrMsg()));
                } else {
                    this._extContext.dispatchEvent(PurchaseEvent.PURCHASE_FAILED, PurchaseEvent.formatPurchaseForEvent(AppGalleryUtils.encodePurchase(inAppPurchaseData, inAppDataSignature, false), 6, "Invalid signature"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean finishPurchase(Purchase purchase) {
        Logger.d(TAG, "finishPurchase( %s )", purchase.productId);
        if (isSupported() && hasProducts()) {
            try {
                this._extContext.dispatchEvent(InAppBillingEvent.FINISH_SUCCESS, PurchaseEvent.formatPurchaseForEvent(purchase.toJSONObject(), 0, ""));
                return true;
            } catch (Exception e) {
                Errors.handleException(e);
                return false;
            }
        }
        return false;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean consumePurchase(final Purchase purchase) {
        String str = TAG;
        Logger.d(str, "consumePurchase( %s )", purchase.toString());
        try {
            if (hasProducts()) {
                ProductInfo productInfo = this._productMap.get(purchase.productId);
                if (productInfo == null) {
                    Logger.d(str, "consumePurchase(): ERROR: Could not find product data", new Object[0]);
                    return false;
                } else if (productInfo.getPriceType() != 0) {
                    Logger.d(str, "consumePurchase(): ERROR: Product not consumable", new Object[0]);
                    return false;
                } else {
                    if (purchase.transactionId.length() > 0) {
                        consumePurchaseWithToken(purchase);
                    } else {
                        Context applicationContext = this._extContext.getActivity().getApplicationContext();
                        OwnedPurchasesReq ownedPurchasesReq = new OwnedPurchasesReq();
                        ownedPurchasesReq.setPriceType(0);
                        Iap.getIapClient(applicationContext).obtainOwnedPurchases(ownedPurchasesReq).addOnSuccessListener(new OnSuccessListener<OwnedPurchasesResult>() { // from class: com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryController.16
                            public void onSuccess(OwnedPurchasesResult ownedPurchasesResult) {
                                boolean z = false;
                                Logger.d(AppGalleryController.TAG, "consumePurchase():onSuccess()", new Object[0]);
                                if (ownedPurchasesResult != null && ownedPurchasesResult.getInAppPurchaseDataList() != null) {
                                    boolean z2 = false;
                                    for (int i = 0; i < ownedPurchasesResult.getInAppPurchaseDataList().size(); i++) {
                                        Purchase createPurchase = AppGalleryUtils.createPurchase((String) ownedPurchasesResult.getInAppPurchaseDataList().get(i), (String) ownedPurchasesResult.getInAppSignature().get(i), false);
                                        if (createPurchase != null && createPurchase.productId.equals(purchase.productId)) {
                                            AppGalleryController.this.consumePurchaseWithToken(createPurchase);
                                            z2 = true;
                                        }
                                    }
                                    z = z2;
                                }
                                if (z) {
                                    return;
                                }
                                AppGalleryController.this._extContext.dispatchEvent(InAppBillingEvent.CONSUME_FAILED, PurchaseEvent.formatPurchaseForEvent(purchase.toJSONObject(), 8, "Could not find owned consumable item"));
                            }
                        }).addOnFailureListener(new OnFailureListener() { // from class: com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryController.15
                            public void onFailure(Exception exc) {
                                String str2 = AppGalleryController.TAG;
                                Object[] objArr = new Object[1];
                                int i = 0;
                                objArr[0] = exc == null ? "null" : exc.getLocalizedMessage();
                                Logger.d(str2, "consumePurchase():onFailure( %s )", objArr);
                                String localizedMessage = exc == null ? "Unknown error" : exc.getLocalizedMessage();
                                if (exc != null && (exc instanceof IapApiException)) {
                                    Status status = ((IapApiException) exc).getStatus();
                                    i = status.getStatusCode();
                                    localizedMessage = status.getStatusMessage();
                                }
                                AppGalleryController.this._extContext.dispatchEvent(InAppBillingEvent.CONSUME_FAILED, PurchaseEvent.formatPurchaseForEvent(purchase.toJSONObject(), AppGalleryUtils.toErrorCode(i), localizedMessage));
                            }
                        });
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    private String randomString(int i) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append((char) (random.nextInt(96) + 32));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void consumePurchaseWithToken(final Purchase purchase) {
        Logger.d(TAG, "consumePurchaseWithToken( %s )", purchase.toString());
        try {
            ConsumeOwnedPurchaseReq consumeOwnedPurchaseReq = new ConsumeOwnedPurchaseReq();
            consumeOwnedPurchaseReq.setPurchaseToken(purchase.transactionId);
            consumeOwnedPurchaseReq.setDeveloperChallenge(randomString(64));
            Iap.getIapClient(this._extContext.getActivity().getApplicationContext()).consumeOwnedPurchase(consumeOwnedPurchaseReq).addOnSuccessListener(new OnSuccessListener<ConsumeOwnedPurchaseResult>() { // from class: com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryController.18
                public void onSuccess(ConsumeOwnedPurchaseResult consumeOwnedPurchaseResult) {
                    Logger.d(AppGalleryController.TAG, "consumePurchaseWithToken():onSuccess(): %s", consumeOwnedPurchaseResult.getConsumePurchaseData());
                    AppGalleryController.this._extContext.dispatchEvent(InAppBillingEvent.CONSUME_SUCCESS, PurchaseEvent.formatPurchaseForEvent(purchase.toJSONObject(), consumeOwnedPurchaseResult.getReturnCode(), consumeOwnedPurchaseResult.getErrMsg()));
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryController.17
                public void onFailure(Exception exc) {
                    String str = AppGalleryController.TAG;
                    Object[] objArr = new Object[1];
                    int i = 0;
                    objArr[0] = exc == null ? "null" : exc.getLocalizedMessage();
                    Logger.d(str, "consumePurchaseWithToken():onFailure( %s )", objArr);
                    String localizedMessage = exc == null ? "Unknown error" : exc.getLocalizedMessage();
                    if (exc != null && (exc instanceof IapApiException)) {
                        Status status = ((IapApiException) exc).getStatus();
                        i = status.getStatusCode();
                        localizedMessage = status.getStatusMessage();
                    }
                    AppGalleryController.this._extContext.dispatchEvent(InAppBillingEvent.CONSUME_FAILED, PurchaseEvent.formatPurchaseForEvent(purchase.toJSONObject(), AppGalleryUtils.toErrorCode(i), localizedMessage));
                }
            });
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onActivityResult(int i, int i2, Intent intent) {
        Logger.d(TAG, "onActivityResult( %d, %d, ...)", Integer.valueOf(i), Integer.valueOf(i2));
        switch (i) {
            case RC_MAKEPURCHASE /* 667658 */:
                makePurchase_processResult(i, i2, intent);
                return;
            case RC_ERROR_RESOLUTION /* 667659 */:
                setup_handleResolution(i, i2, intent);
                return;
            default:
                return;
        }
    }

    public static boolean verifySignature(String str, String str2, String str3) {
        if (str2 == null || str3 == null) {
            return false;
        }
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str3)));
            Signature signature = Signature.getInstance("SHA256WithRSA");
            signature.initVerify(generatePublic);
            signature.update(str.getBytes(Charset.forName("UTF-8")));
            return signature.verify(Base64.decode(str2));
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean isInAppUpdatesSupported() {
        if (AppGalleryControllerSupport.inAppUpdatesSupported(this._extContext.getActivity())) {
            return inAppUpdates().isSupported();
        }
        return false;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public InAppUpdates inAppUpdates() {
        if (this._inAppUpdates == null) {
            this._inAppUpdates = new AppGalleryInAppUpdates(this._extContext);
        }
        return this._inAppUpdates;
    }
}
