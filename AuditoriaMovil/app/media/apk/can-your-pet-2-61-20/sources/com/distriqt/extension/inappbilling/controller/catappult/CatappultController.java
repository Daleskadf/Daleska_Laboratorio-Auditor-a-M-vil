package com.distriqt.extension.inappbilling.controller.catappult;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.appcoins.sdk.billing.AppcoinsBillingClient;
import com.appcoins.sdk.billing.BillingFlowParams;
import com.appcoins.sdk.billing.Purchase;
import com.appcoins.sdk.billing.PurchasesResult;
import com.appcoins.sdk.billing.PurchasesUpdatedListener;
import com.appcoins.sdk.billing.ResponseCode;
import com.appcoins.sdk.billing.SkuDetails;
import com.appcoins.sdk.billing.SkuDetailsParams;
import com.appcoins.sdk.billing.helpers.CatapultBillingAppCoinsFactory;
import com.appcoins.sdk.billing.listeners.AppCoinsBillingStateListener;
import com.appcoins.sdk.billing.listeners.ConsumeResponseListener;
import com.appcoins.sdk.billing.listeners.SkuDetailsResponseListener;
import com.appcoins.sdk.billing.types.SkuType;
import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.DebugUtil;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.inappbilling.controller.BillingService;
import com.distriqt.extension.inappbilling.controller.BillingServiceController;
import com.distriqt.extension.inappbilling.controller.InAppBillingAvailability;
import com.distriqt.extension.inappbilling.controller.InAppUpdates;
import com.distriqt.extension.inappbilling.controller.Product;
import com.distriqt.extension.inappbilling.controller.PurchaseChangeRequest;
import com.distriqt.extension.inappbilling.controller.PurchaseRequest;
import com.distriqt.extension.inappbilling.events.AvailabilityEvent;
import com.distriqt.extension.inappbilling.events.InAppBillingEvent;
import com.distriqt.extension.inappbilling.events.PurchaseEvent;
import com.distriqt.extension.inappbilling.utils.Errors;
import com.distriqt.extension.inappbilling.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
/* loaded from: classes.dex */
public class CatappultController extends ActivityStateListener implements BillingServiceController, PurchasesUpdatedListener {
    public static final String TAG = "CatappultController";
    private AppcoinsBillingClient _client;
    private IExtensionContext _extContext;
    protected Boolean _setupComplete = false;
    protected BillingService _service = null;
    protected final Handler _handler = new Handler(Looper.getMainLooper());
    protected ArrayList<String> _productIds = new ArrayList<>();
    protected ArrayList<String> _subscriptionIds = new ArrayList<>();
    protected ProductInventory _productInventory = new ProductInventory();

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public interface QueryPurchaseHandler {
        void onComplete(int i, Purchase purchase);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public interface QueryPurchasesHandler {
        void onFailure(int i, String str);

        void onSuccess(int i, List<Purchase> list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public interface ServiceConnectionListener {
        void onError(int i);

        void onSuccess();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public interface ServiceRequest {
        void run();
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean areSubscriptionsSupported() {
        return true;
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
    public InAppUpdates inAppUpdates() {
        return null;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean isChangePurchaseSupported() {
        return false;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean isInAppUpdatesSupported() {
        return false;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean isProductViewSupported() {
        return false;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean showProductView(String str) {
        return false;
    }

    public CatappultController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean isSupported() {
        return CatappultControllerSupport.supported(this._extContext.getActivity());
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean setup(BillingService billingService) {
        if (billingService.catappultPublicKey == null || billingService.catappultPublicKey.length() == 0) {
            this._extContext.dispatchEvent(InAppBillingEvent.SETUP_FAILURE, InAppBillingEvent.formatErrorForEvent(0, "Invalid Key"));
            return false;
        } else if (this._setupComplete.booleanValue()) {
            return executeServiceRequest(new ServiceRequest() { // from class: com.distriqt.extension.inappbilling.controller.catappult.CatappultController$$ExternalSyntheticLambda5
                @Override // com.distriqt.extension.inappbilling.controller.catappult.CatappultController.ServiceRequest
                public final void run() {
                    CatappultController.this.m269x2f4aa7d9();
                }
            });
        } else {
            this._service = billingService;
            try {
                this._client = CatapultBillingAppCoinsFactory.BuildAppcoinsBilling(this._extContext.getActivity().getApplicationContext(), billingService.catappultPublicKey, this);
                startServiceConnection(new ServiceConnectionListener() { // from class: com.distriqt.extension.inappbilling.controller.catappult.CatappultController.1
                    @Override // com.distriqt.extension.inappbilling.controller.catappult.CatappultController.ServiceConnectionListener
                    public void onSuccess() {
                        Logger.d(CatappultController.TAG, "setup(): starting pending purchases check", new Object[0]);
                        CatappultController.this._setupComplete = true;
                        CatappultController.this.m269x2f4aa7d9();
                    }

                    @Override // com.distriqt.extension.inappbilling.controller.catappult.CatappultController.ServiceConnectionListener
                    public void onError(int i) {
                        CatappultController.this._extContext.dispatchEvent(InAppBillingEvent.SETUP_FAILURE, InAppBillingEvent.formatErrorForEvent(i, "Failed to connect to billing service"));
                        CatappultController.this._setupComplete = false;
                    }
                });
                return true;
            } catch (Exception e) {
                Errors.handleException(e);
                return true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: onSetupComplete */
    public void m269x2f4aa7d9() {
        Logger.d(TAG, "setup(): success", new Object[0]);
        this._extContext.dispatchEvent(InAppBillingEvent.SETUP_SUCCESS, "");
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean canMakePayments() {
        return isSupported();
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public String checkAvailability() {
        Logger.d(TAG, "checkAvailability()", new Object[0]);
        if (this._setupComplete.booleanValue()) {
            final Context applicationContext = this._extContext.getActivity().getApplicationContext();
            final String uuid = UUID.randomUUID().toString();
            this._handler.postDelayed(new Runnable() { // from class: com.distriqt.extension.inappbilling.controller.catappult.CatappultController$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    CatappultController.this.m259xbf556132(applicationContext, uuid);
                }
            }, 200L);
            return uuid;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$checkAvailability$1$com-distriqt-extension-inappbilling-controller-catappult-CatappultController  reason: not valid java name */
    public /* synthetic */ void m259xbf556132(Context context, String str) {
        this._extContext.dispatchEvent(AvailabilityEvent.COMPLETE, AvailabilityEvent.formatForEvent(str, !CatappultControllerSupport.isAppcoinsAppInstalled(context) ? InAppBillingAvailability.STORE_UPGRADE_REQUIRED : InAppBillingAvailability.AVAILABLE));
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public void dispose() {
        AppcoinsBillingClient appcoinsBillingClient = this._client;
        if (appcoinsBillingClient != null) {
            appcoinsBillingClient.endConnection();
            this._client = null;
        }
        this._extContext = null;
    }

    protected boolean executeServiceRequest(final ServiceRequest serviceRequest) {
        String str = TAG;
        Logger.d(str, "executeServiceRequest()", new Object[0]);
        if (this._setupComplete.booleanValue()) {
            if (this._client.isReady()) {
                Logger.d(str, "executeServiceRequest(): client ready", new Object[0]);
                serviceRequest.run();
                return true;
            }
            startServiceConnection(new ServiceConnectionListener() { // from class: com.distriqt.extension.inappbilling.controller.catappult.CatappultController.2
                @Override // com.distriqt.extension.inappbilling.controller.catappult.CatappultController.ServiceConnectionListener
                public void onSuccess() {
                    serviceRequest.run();
                }

                @Override // com.distriqt.extension.inappbilling.controller.catappult.CatappultController.ServiceConnectionListener
                public void onError(int i) {
                    Logger.d(CatappultController.TAG, "executeServiceRequest():startServiceConnection:onError", new Object[0]);
                }
            });
            return true;
        }
        return false;
    }

    protected void startServiceConnection(final ServiceConnectionListener serviceConnectionListener) {
        Logger.d(TAG, "startServiceConnection()", new Object[0]);
        this._client.startConnection(new AppCoinsBillingStateListener() { // from class: com.distriqt.extension.inappbilling.controller.catappult.CatappultController.3
            public void onBillingSetupFinished(int i) {
                Logger.d(CatappultController.TAG, "Setup finished. Response code: %d", Integer.valueOf(i));
                if (serviceConnectionListener != null) {
                    if (i == ResponseCode.OK.getValue()) {
                        serviceConnectionListener.onSuccess();
                    } else {
                        serviceConnectionListener.onError(i);
                    }
                }
            }

            public void onBillingServiceDisconnected() {
                Logger.d(CatappultController.TAG, "onBillingServiceDisconnected()", new Object[0]);
            }
        });
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
        return executeServiceRequest(new ServiceRequest() { // from class: com.distriqt.extension.inappbilling.controller.catappult.CatappultController$$ExternalSyntheticLambda4
            @Override // com.distriqt.extension.inappbilling.controller.catappult.CatappultController.ServiceRequest
            public final void run() {
                CatappultController.this.m264xcc745a98();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$getProducts$4$com-distriqt-extension-inappbilling-controller-catappult-CatappultController  reason: not valid java name */
    public /* synthetic */ void m264xcc745a98() {
        try {
            getProductsImpl(this._productIds, SkuType.inapp, new SkuDetailsResponseListener() { // from class: com.distriqt.extension.inappbilling.controller.catappult.CatappultController$$ExternalSyntheticLambda6
                public final void onSkuDetailsResponse(int i, List list) {
                    CatappultController.this.m263xb37308f9(i, list);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$getProducts$3$com-distriqt-extension-inappbilling-controller-catappult-CatappultController  reason: not valid java name */
    public /* synthetic */ void m263xb37308f9(final int i, List list) {
        Logger.d(TAG, "getProducts(): inapp: response: %d::[%d]", Integer.valueOf(i), Integer.valueOf(list.size()));
        if (handleProductDetailsResponse(i, list, SkuType.inapp)) {
            getProductsImpl(this._subscriptionIds, SkuType.subs, new SkuDetailsResponseListener() { // from class: com.distriqt.extension.inappbilling.controller.catappult.CatappultController$$ExternalSyntheticLambda2
                public final void onSkuDetailsResponse(int i2, List list2) {
                    CatappultController.this.m262x9a71b75a(i, i2, list2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$getProducts$2$com-distriqt-extension-inappbilling-controller-catappult-CatappultController  reason: not valid java name */
    public /* synthetic */ void m262x9a71b75a(int i, int i2, List list) {
        Logger.d(TAG, "getProducts(): subs: response: %d::[%d]", Integer.valueOf(i), Integer.valueOf(list.size()));
        if (handleProductDetailsResponse(i2, list, SkuType.subs)) {
            this._extContext.dispatchEvent(InAppBillingEvent.PRODUCTS_LOADED, InAppBillingEvent.formatProductsForEvent(activeProducts()));
        }
    }

    private void getProductsImpl(List<String> list, SkuType skuType, SkuDetailsResponseListener skuDetailsResponseListener) {
        Logger.d(TAG, "getProductsImpl( %s, %s )", list.toString(), skuType.toString());
        if (list.size() == 0) {
            skuDetailsResponseListener.onSkuDetailsResponse(ResponseCode.OK.getValue(), new ArrayList());
            return;
        }
        SkuDetailsParams skuDetailsParams = new SkuDetailsParams();
        skuDetailsParams.setItemType(skuType.toString());
        skuDetailsParams.setMoreItemSkus(list);
        this._client.querySkuDetailsAsync(skuDetailsParams, skuDetailsResponseListener);
    }

    private boolean handleProductDetailsResponse(int i, List<SkuDetails> list, SkuType skuType) {
        if (i != ResponseCode.OK.getValue()) {
            this._extContext.dispatchEvent(InAppBillingEvent.PRODUCTS_FAILED, InAppBillingEvent.formatErrorForEvent(i, "Failed to retrieve products"));
            return false;
        }
        if (skuType == SkuType.inapp) {
            Iterator<String> it = this._productIds.iterator();
            while (it.hasNext()) {
                String next = it.next();
                boolean z = false;
                for (SkuDetails skuDetails : list) {
                    if (skuDetails.getSku().equals(next)) {
                        z = true;
                    }
                }
                if (!z) {
                    this._extContext.dispatchEvent(InAppBillingEvent.PRODUCT_INVALID, next);
                }
            }
        }
        if (skuType == SkuType.subs) {
            Iterator<String> it2 = this._subscriptionIds.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                boolean z2 = false;
                for (SkuDetails skuDetails2 : list) {
                    if (skuDetails2.getSku().equals(next2)) {
                        z2 = true;
                    }
                }
                if (!z2) {
                    this._extContext.dispatchEvent(InAppBillingEvent.PRODUCT_INVALID, next2);
                }
            }
        }
        this._productInventory.addProducts(list);
        return true;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public Map<String, Product> activeProducts() {
        return this._productInventory.getActiveProducts();
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public ArrayList<String> activeProductIds() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(this._productIds);
        arrayList.addAll(this._subscriptionIds);
        return arrayList;
    }

    private boolean hasProducts() {
        return this._productInventory.hasProducts();
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean restorePurchases() {
        Logger.d(TAG, "restorePurchases()", new Object[0]);
        if (hasProducts()) {
            return queryPurchases(new QueryPurchasesHandler() { // from class: com.distriqt.extension.inappbilling.controller.catappult.CatappultController.4
                @Override // com.distriqt.extension.inappbilling.controller.catappult.CatappultController.QueryPurchasesHandler
                public void onSuccess(int i, List<Purchase> list) {
                    CatappultController.this._extContext.dispatchEvent(PurchaseEvent.PURCHASES_UPDATED, PurchaseEvent.formatPurchasesForEvent(CatappultUtils.purchasesToPurchasesArray(list, true), i, ""));
                    CatappultController.this._extContext.dispatchEvent(InAppBillingEvent.RESTORE_PURCHASES_SUCCESS, "");
                }

                @Override // com.distriqt.extension.inappbilling.controller.catappult.CatappultController.QueryPurchasesHandler
                public void onFailure(int i, String str) {
                    CatappultController.this._extContext.dispatchEvent(InAppBillingEvent.RESTORE_PURCHASES_FAILED, InAppBillingEvent.formatErrorForEvent(i, str));
                }
            });
        }
        return false;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean getPurchases(boolean z) {
        Logger.d(TAG, "getPurchases( %b )", Boolean.valueOf(z));
        return queryPurchases(new QueryPurchasesHandler() { // from class: com.distriqt.extension.inappbilling.controller.catappult.CatappultController.5
            @Override // com.distriqt.extension.inappbilling.controller.catappult.CatappultController.QueryPurchasesHandler
            public void onSuccess(int i, List<Purchase> list) {
                CatappultController.this._extContext.dispatchEvent(PurchaseEvent.GET_PURCHASES_COMPLETE, PurchaseEvent.formatPurchasesForEvent(CatappultUtils.purchasesToPurchasesArray(list, false), i, ""));
            }

            @Override // com.distriqt.extension.inappbilling.controller.catappult.CatappultController.QueryPurchasesHandler
            public void onFailure(int i, String str) {
                CatappultController.this._extContext.dispatchEvent(PurchaseEvent.GET_PURCHASES_FAILED, PurchaseEvent.formatErrorForEvent(i, str));
            }
        });
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public JSONArray getPendingPurchases() {
        Logger.d(TAG, "getPendingPurchases()", new Object[0]);
        return new JSONArray();
    }

    public boolean queryPurchases(final QueryPurchasesHandler queryPurchasesHandler) {
        Logger.d(TAG, "queryPurchases()", new Object[0]);
        return executeServiceRequest(new ServiceRequest() { // from class: com.distriqt.extension.inappbilling.controller.catappult.CatappultController$$ExternalSyntheticLambda7
            @Override // com.distriqt.extension.inappbilling.controller.catappult.CatappultController.ServiceRequest
            public final void run() {
                CatappultController.this.m268xb7751bec(queryPurchasesHandler);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$queryPurchases$6$com-distriqt-extension-inappbilling-controller-catappult-CatappultController  reason: not valid java name */
    public /* synthetic */ void m268xb7751bec(final QueryPurchasesHandler queryPurchasesHandler) {
        new Thread(new Runnable() { // from class: com.distriqt.extension.inappbilling.controller.catappult.CatappultController$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                CatappultController.this.m267x9e73ca4d(queryPurchasesHandler);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$queryPurchases$5$com-distriqt-extension-inappbilling-controller-catappult-CatappultController  reason: not valid java name */
    public /* synthetic */ void m267x9e73ca4d(QueryPurchasesHandler queryPurchasesHandler) {
        PurchasesResult queryPurchases = this._client.queryPurchases(SkuType.inapp.toString());
        String str = TAG;
        Logger.d(str, "queryPurchases(): query inapp purchases: %d", Integer.valueOf(queryPurchases.getResponseCode()));
        if (queryPurchases.getResponseCode() != ResponseCode.OK.getValue()) {
            queryPurchasesHandler.onFailure(queryPurchases.getResponseCode(), "Error retrieving inapp purchases");
            return;
        }
        PurchasesResult queryPurchases2 = this._client.queryPurchases(SkuType.subs.toString());
        Logger.d(str, "queryPurchases(): query subs purchases: %d", Integer.valueOf(queryPurchases2.getResponseCode()));
        if (queryPurchases2.getResponseCode() != ResponseCode.OK.getValue()) {
            queryPurchasesHandler.onFailure(queryPurchases2.getResponseCode(), "Error retrieving subscription purchases");
            return;
        }
        List purchases = queryPurchases.getPurchases();
        Logger.d(str, "queryPurchases(): query purchases: [%d]", Integer.valueOf(purchases.size()));
        List purchases2 = queryPurchases2.getPurchases();
        Logger.d(str, "queryPurchases(): query subs: [%d]", Integer.valueOf(purchases2.size()));
        List<Purchase> arrayList = new ArrayList<>();
        arrayList.addAll(purchases);
        arrayList.addAll(purchases2);
        queryPurchasesHandler.onSuccess(ResponseCode.OK.getValue(), arrayList);
    }

    public void queryPurchase(final String str, final QueryPurchaseHandler queryPurchaseHandler) {
        Logger.d(TAG, "queryPurchase( %s )", str);
        queryPurchases(new QueryPurchasesHandler() { // from class: com.distriqt.extension.inappbilling.controller.catappult.CatappultController.6
            @Override // com.distriqt.extension.inappbilling.controller.catappult.CatappultController.QueryPurchasesHandler
            public void onSuccess(int i, List<Purchase> list) {
                for (Purchase purchase : list) {
                    if (purchase.getSku().equals(str)) {
                        queryPurchaseHandler.onComplete(i, purchase);
                        return;
                    }
                }
                queryPurchaseHandler.onComplete(ResponseCode.ITEM_NOT_OWNED.getValue(), null);
            }

            @Override // com.distriqt.extension.inappbilling.controller.catappult.CatappultController.QueryPurchasesHandler
            public void onFailure(int i, String str2) {
                queryPurchaseHandler.onComplete(i, null);
            }
        });
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean makePurchase(PurchaseRequest purchaseRequest) {
        SkuDetails productDetails;
        Logger.d(TAG, "makePurchase( %s )", purchaseRequest.toString());
        if (isSupported() && hasProducts() && (productDetails = this._productInventory.getProductDetails(purchaseRequest.productId)) != null) {
            try {
                String sku = productDetails.getSku();
                String itemType = productDetails.getItemType();
                final BillingFlowParams billingFlowParams = new BillingFlowParams(sku, itemType, "orderId=" + System.currentTimeMillis(), purchaseRequest.developerPayload, "BDS");
                final Activity activity = this._extContext.getActivity();
                return executeServiceRequest(new ServiceRequest() { // from class: com.distriqt.extension.inappbilling.controller.catappult.CatappultController$$ExternalSyntheticLambda8
                    @Override // com.distriqt.extension.inappbilling.controller.catappult.CatappultController.ServiceRequest
                    public final void run() {
                        CatappultController.this.m266xcc754fe5(activity, billingFlowParams);
                    }
                });
            } catch (Exception e) {
                Errors.handleException(e);
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$makePurchase$8$com-distriqt-extension-inappbilling-controller-catappult-CatappultController  reason: not valid java name */
    public /* synthetic */ void m266xcc754fe5(final Activity activity, final BillingFlowParams billingFlowParams) {
        Logger.d(TAG, "makePurchase(): starting thread", new Object[0]);
        new Thread(new Runnable() { // from class: com.distriqt.extension.inappbilling.controller.catappult.CatappultController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CatappultController.this.m265xb373fe46(activity, billingFlowParams);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$makePurchase$7$com-distriqt-extension-inappbilling-controller-catappult-CatappultController  reason: not valid java name */
    public /* synthetic */ void m265xb373fe46(Activity activity, BillingFlowParams billingFlowParams) {
        String str = TAG;
        Logger.d(str, "makePurchase(): launch billing flow", new Object[0]);
        int launchBillingFlow = this._client.launchBillingFlow(activity, billingFlowParams);
        if (launchBillingFlow != ResponseCode.OK.getValue()) {
            Logger.d(str, "makePurchase(): launch failed: %d", Integer.valueOf(launchBillingFlow));
            this._extContext.dispatchEvent(PurchaseEvent.PURCHASE_FAILED, PurchaseEvent.formatErrorForEvent(launchBillingFlow, "Failed to initiate purchase"));
        }
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean finishPurchase(com.distriqt.extension.inappbilling.controller.Purchase purchase) {
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
    public boolean consumePurchase(final com.distriqt.extension.inappbilling.controller.Purchase purchase) {
        Logger.d(TAG, "consumePurchase( %s )", purchase.productId);
        return executeServiceRequest(new ServiceRequest() { // from class: com.distriqt.extension.inappbilling.controller.catappult.CatappultController$$ExternalSyntheticLambda11
            @Override // com.distriqt.extension.inappbilling.controller.catappult.CatappultController.ServiceRequest
            public final void run() {
                CatappultController.this.m260x60bcba22(purchase);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$consumePurchase$10$com-distriqt-extension-inappbilling-controller-catappult-CatappultController  reason: not valid java name */
    public /* synthetic */ void m260x60bcba22(final com.distriqt.extension.inappbilling.controller.Purchase purchase) {
        queryPurchase(purchase.productId, new QueryPurchaseHandler() { // from class: com.distriqt.extension.inappbilling.controller.catappult.CatappultController$$ExternalSyntheticLambda1
            @Override // com.distriqt.extension.inappbilling.controller.catappult.CatappultController.QueryPurchaseHandler
            public final void onComplete(int i, Purchase purchase2) {
                CatappultController.this.m261x4fb0fb90(purchase, i, purchase2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$consumePurchase$9$com-distriqt-extension-inappbilling-controller-catappult-CatappultController  reason: not valid java name */
    public /* synthetic */ void m261x4fb0fb90(com.distriqt.extension.inappbilling.controller.Purchase purchase, int i, Purchase purchase2) {
        if (purchase2 != null) {
            _consumePurchaseImpl(purchase2.getToken(), CatappultUtils.encodePurchase(purchase2, false));
        } else if (purchase.transactionId != null && purchase.transactionId.length() > 0) {
            _consumePurchaseImpl(purchase.transactionId, purchase);
        } else {
            this._extContext.dispatchEvent(InAppBillingEvent.CONSUME_FAILED, PurchaseEvent.formatErrorForEvent(8, "Item not owned"));
        }
    }

    private void _consumePurchaseImpl(String str, final com.distriqt.extension.inappbilling.controller.Purchase purchase) {
        Logger.d(TAG, "_consumePurchaseImpl()", new Object[0]);
        this._client.consumeAsync(str, new ConsumeResponseListener() { // from class: com.distriqt.extension.inappbilling.controller.catappult.CatappultController$$ExternalSyntheticLambda10
            public final void onConsumeResponse(int i, String str2) {
                CatappultController.this.m258xb177b65c(purchase, i, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$_consumePurchaseImpl$11$com-distriqt-extension-inappbilling-controller-catappult-CatappultController  reason: not valid java name */
    public /* synthetic */ void m258xb177b65c(com.distriqt.extension.inappbilling.controller.Purchase purchase, int i, String str) {
        Logger.d(TAG, "_consumePurchaseImpl(): response: %d", Integer.valueOf(i));
        if (i != ResponseCode.OK.getValue()) {
            this._extContext.dispatchEvent(InAppBillingEvent.CONSUME_FAILED, PurchaseEvent.formatPurchaseForEvent(purchase.toJSONObject(), i, "Failed to consume purchase"));
        } else {
            this._extContext.dispatchEvent(InAppBillingEvent.CONSUME_SUCCESS, PurchaseEvent.formatPurchaseForEvent(purchase.toJSONObject(), 0, ""));
        }
    }

    public void onPurchasesUpdated(int i, List<Purchase> list) {
        Logger.d(TAG, "onPurchasesUpdated( %d, [%d] )", Integer.valueOf(i), Integer.valueOf(list.size()));
        if (i != ResponseCode.OK.getValue()) {
            this._extContext.dispatchEvent(PurchaseEvent.PURCHASE_FAILED, PurchaseEvent.formatErrorForEvent(i, "Purchase failed"));
        } else {
            this._extContext.dispatchEvent(PurchaseEvent.PURCHASES_UPDATED, PurchaseEvent.formatPurchasesForEvent(CatappultUtils.purchasesToPurchasesArray(list, false), i, ""));
        }
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onActivityResult(int i, int i2, Intent intent) {
        String str = TAG;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = intent == null ? "null" : DebugUtil.bundleToString(intent.getExtras());
        Logger.d(str, "onActivityResult( %d, %d, %s )", objArr);
        AppcoinsBillingClient appcoinsBillingClient = this._client;
        if (appcoinsBillingClient != null) {
            appcoinsBillingClient.onActivityResult(i, i2, intent);
        }
    }
}
