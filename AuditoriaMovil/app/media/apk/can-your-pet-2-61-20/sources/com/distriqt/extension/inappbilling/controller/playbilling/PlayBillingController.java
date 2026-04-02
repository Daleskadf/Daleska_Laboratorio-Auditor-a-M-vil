package com.distriqt.extension.inappbilling.controller.playbilling;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchaseHistoryParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.inappbilling.activities.ProductViewActivity;
import com.distriqt.extension.inappbilling.controller.BillingService;
import com.distriqt.extension.inappbilling.controller.BillingServiceController;
import com.distriqt.extension.inappbilling.controller.InAppBillingAvailability;
import com.distriqt.extension.inappbilling.controller.InAppUpdates;
import com.distriqt.extension.inappbilling.controller.Product;
import com.distriqt.extension.inappbilling.controller.PurchaseChangeRequest;
import com.distriqt.extension.inappbilling.controller.PurchaseRequest;
import com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController;
import com.distriqt.extension.inappbilling.events.AvailabilityEvent;
import com.distriqt.extension.inappbilling.events.InAppBillingEvent;
import com.distriqt.extension.inappbilling.events.ProductViewEvent;
import com.distriqt.extension.inappbilling.events.PurchaseEvent;
import com.distriqt.extension.inappbilling.utils.Errors;
import com.distriqt.extension.inappbilling.utils.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class PlayBillingController extends ActivityStateListener implements BillingServiceController, PurchasesUpdatedListener {
    private static final String TAG = "PlayBillingController";
    protected BillingClient _billingClient;
    protected IExtensionContext _extContext;
    protected final Handler _handler;
    private PlayInAppUpdates _inAppUpdates;
    protected List<Purchase> _pendingPurchases;
    protected ArrayList<String> _productIds;
    protected ProductInventory _productInventory;
    protected BillingService _service;
    protected Boolean _setupComplete;
    protected ArrayList<String> _subscriptionIds;
    protected List<Purchase> _verifiedPurchases;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public interface GetProductsQueryListener {
        void onGetProducts(BillingResult billingResult, List<ProductDetails> list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public interface GetPurchaseAsyncListener {
        void onGetPurchase(BillingResult billingResult, Purchase purchase);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public interface QueryPendingPurchasesHandler {
        void onComplete();
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
        void onError(BillingResult billingResult);

        void onSuccess();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public interface ServiceRequest {
        void run();
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean getUserData() {
        return false;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean isChangePurchaseSupported() {
        return true;
    }

    public PlayBillingController(IExtensionContext iExtensionContext) {
        this._setupComplete = false;
        this._service = null;
        this._verifiedPurchases = null;
        this._pendingPurchases = null;
        this._handler = new Handler(Looper.getMainLooper());
        this._extContext = iExtensionContext;
        this._productIds = new ArrayList<>();
        this._subscriptionIds = new ArrayList<>();
        this._productInventory = new ProductInventory();
    }

    public PlayBillingController(IExtensionContext iExtensionContext, ProductInventory productInventory) {
        this._setupComplete = false;
        this._service = null;
        this._verifiedPurchases = null;
        this._pendingPurchases = null;
        this._handler = new Handler(Looper.getMainLooper());
        this._extContext = iExtensionContext;
        this._productIds = new ArrayList<>();
        this._subscriptionIds = new ArrayList<>();
        this._productInventory = productInventory;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean isSupported() {
        return PlayBillingControllerSupport.supported(this._extContext.getActivity());
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
            this._handler.postDelayed(new Runnable() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    PlayBillingController.this.m280xc5a39b1d(uuid);
                }
            }, 200L);
            return uuid;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$checkAvailability$0$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m280xc5a39b1d(String str) {
        BillingClient billingClient = this._billingClient;
        if (billingClient == null) {
            this._extContext.dispatchEvent(AvailabilityEvent.COMPLETE, AvailabilityEvent.formatForEvent(str, "unknown"));
            return;
        }
        try {
            BillingResult isFeatureSupported = billingClient.isFeatureSupported(BillingClient.FeatureType.PRODUCT_DETAILS);
            Logger.d(TAG, "checkAvailability::isFeatureSupported: [%d]: %s", Integer.valueOf(isFeatureSupported.getResponseCode()), isFeatureSupported.getDebugMessage());
            String str2 = InAppBillingAvailability.NOT_AVAILABLE;
            int responseCode = isFeatureSupported.getResponseCode();
            if (responseCode == -2) {
                str2 = InAppBillingAvailability.STORE_UPGRADE_REQUIRED;
            } else if (responseCode == 0) {
                str2 = InAppBillingAvailability.AVAILABLE;
            }
            this._extContext.dispatchEvent(AvailabilityEvent.COMPLETE, AvailabilityEvent.formatForEvent(str, str2));
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean areSubscriptionsSupported() {
        if (this._setupComplete.booleanValue()) {
            BillingResult isFeatureSupported = this._billingClient.isFeatureSupported(BillingClient.FeatureType.SUBSCRIPTIONS);
            if (isFeatureSupported.getResponseCode() != 0) {
                Logger.d(TAG, "areSubscriptionsSupported() got an error response: %d:%s", Integer.valueOf(isFeatureSupported.getResponseCode()), isFeatureSupported.getDebugMessage());
            }
            return isFeatureSupported.getResponseCode() == 0;
        }
        return false;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean setup(BillingService billingService) {
        Logger.d(TAG, "setup()", new Object[0]);
        if (billingService.googlePlayPublicKey == null || billingService.googlePlayPublicKey.length() == 0) {
            this._extContext.dispatchEvent(InAppBillingEvent.SETUP_FAILURE, InAppBillingEvent.formatErrorForEvent(0, "Invalid Key"));
            return false;
        }
        this._service = billingService;
        try {
            this._billingClient = BillingClient.newBuilder(this._extContext.getActivity()).setListener(this).enablePendingPurchases().build();
            startServiceConnection(new AnonymousClass1());
            return true;
        } catch (Exception e) {
            Errors.handleException(e);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements ServiceConnectionListener {
        AnonymousClass1() {
        }

        @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.ServiceConnectionListener
        public void onSuccess() {
            Logger.d(PlayBillingController.TAG, "setup(): starting pending purchases check", new Object[0]);
            PlayBillingController.this._setupComplete = true;
            PlayBillingController.this.getPendingPurchasesAsync(new QueryPendingPurchasesHandler() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$1$$ExternalSyntheticLambda0
                @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.QueryPendingPurchasesHandler
                public final void onComplete() {
                    PlayBillingController.AnonymousClass1.this.m299x8bad8169();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$onSuccess$0$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController$1  reason: not valid java name */
        public /* synthetic */ void m299x8bad8169() {
            PlayBillingController.this.onSetupComplete();
        }

        @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.ServiceConnectionListener
        public void onError(BillingResult billingResult) {
            PlayBillingController.this._extContext.dispatchEvent(InAppBillingEvent.SETUP_FAILURE, InAppBillingEvent.formatErrorForEvent(billingResult.getResponseCode(), "Failed to connect to billing service"));
            PlayBillingController.this._setupComplete = false;
        }
    }

    protected void onSetupComplete() {
        Logger.d(TAG, "setup() success", new Object[0]);
        this._extContext.dispatchEvent(InAppBillingEvent.SETUP_SUCCESS, "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean executeServiceRequest(final ServiceRequest serviceRequest) {
        String str = TAG;
        Logger.d(str, "executeServiceRequest()", new Object[0]);
        if (this._setupComplete.booleanValue()) {
            if (this._billingClient.isReady()) {
                Logger.d(str, "executeServiceRequest(): client ready", new Object[0]);
                serviceRequest.run();
                return true;
            }
            startServiceConnection(new ServiceConnectionListener() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.2
                @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.ServiceConnectionListener
                public void onSuccess() {
                    serviceRequest.run();
                }

                @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.ServiceConnectionListener
                public void onError(BillingResult billingResult) {
                    Logger.d(PlayBillingController.TAG, "executeServiceRequest():startServiceConnection:onError", new Object[0]);
                }
            });
            return true;
        }
        return false;
    }

    protected void startServiceConnection(final ServiceConnectionListener serviceConnectionListener) {
        Logger.d(TAG, "startServiceConnection()", new Object[0]);
        this._billingClient.startConnection(new BillingClientStateListener() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.3
            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingSetupFinished(BillingResult billingResult) {
                Logger.d(PlayBillingController.TAG, "Setup finished. Response code: %d", Integer.valueOf(billingResult.getResponseCode()));
                if (serviceConnectionListener != null) {
                    if (billingResult.getResponseCode() == 0) {
                        serviceConnectionListener.onSuccess();
                    } else {
                        serviceConnectionListener.onError(billingResult);
                    }
                }
            }

            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingServiceDisconnected() {
                Logger.d(PlayBillingController.TAG, "onBillingServiceDisconnected()", new Object[0]);
            }
        });
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public void dispose() {
        this._setupComplete = false;
        BillingClient billingClient = this._billingClient;
        if (billingClient != null && billingClient.isReady()) {
            this._billingClient.endConnection();
            this._billingClient = null;
        }
        PlayInAppUpdates playInAppUpdates = this._inAppUpdates;
        if (playInAppUpdates != null) {
            playInAppUpdates.dispose();
            this._inAppUpdates = null;
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
        return executeServiceRequest(new ServiceRequest() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda30
            @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.ServiceRequest
            public final void run() {
                PlayBillingController.this.m287xce3b7183();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$getProducts$3$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m287xce3b7183() {
        try {
            getProductsImpl(this._productIds, "inapp", new GetProductsQueryListener() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda4
                @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.GetProductsQueryListener
                public final void onGetProducts(BillingResult billingResult, List list) {
                    PlayBillingController.this.m286x9f8a0764(billingResult, list);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$getProducts$2$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m286x9f8a0764(final BillingResult billingResult, List list) {
        if (handleProductDetailsResponse(billingResult, list, "inapp")) {
            getProductsImpl(this._subscriptionIds, "subs", new GetProductsQueryListener() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda28
                @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.GetProductsQueryListener
                public final void onGetProducts(BillingResult billingResult2, List list2) {
                    PlayBillingController.this.m285x70d89d45(billingResult, billingResult2, list2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$getProducts$1$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m285x70d89d45(BillingResult billingResult, BillingResult billingResult2, List list) {
        if (handleProductDetailsResponse(billingResult, list, "subs")) {
            this._extContext.dispatchEvent(InAppBillingEvent.PRODUCTS_LOADED, InAppBillingEvent.formatProductsForEvent(activeProducts()));
        }
    }

    private void getProductsImpl(List<String> list, String str, final GetProductsQueryListener getProductsQueryListener) {
        if (list.size() == 0) {
            getProductsQueryListener.onGetProducts(BillingResult.newBuilder().setResponseCode(0).build(), new ArrayList());
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductType(str).setProductId(str2).build());
        }
        QueryProductDetailsParams.Builder productList = QueryProductDetailsParams.newBuilder().setProductList(arrayList);
        BillingClient billingClient = this._billingClient;
        QueryProductDetailsParams build = productList.build();
        Objects.requireNonNull(getProductsQueryListener);
        billingClient.queryProductDetailsAsync(build, new ProductDetailsResponseListener() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda25
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            public final void onProductDetailsResponse(BillingResult billingResult, List list2) {
                PlayBillingController.GetProductsQueryListener.this.onGetProducts(billingResult, list2);
            }
        });
    }

    private boolean handleProductDetailsResponse(BillingResult billingResult, List<ProductDetails> list, String str) {
        boolean z;
        if (billingResult.getResponseCode() != 0) {
            this._extContext.dispatchEvent(InAppBillingEvent.PRODUCTS_FAILED, InAppBillingEvent.formatErrorForEvent(billingResult.getResponseCode(), billingResult.getDebugMessage()));
            return false;
        }
        if (str.equals("inapp")) {
            Iterator<String> it = this._productIds.iterator();
            while (it.hasNext()) {
                String next = it.next();
                boolean z2 = false;
                for (ProductDetails productDetails : list) {
                    if (productDetails.getProductId().equals(next)) {
                        z2 = true;
                    }
                }
                if (!z2) {
                    this._extContext.dispatchEvent(InAppBillingEvent.PRODUCT_INVALID, next);
                }
            }
        }
        if (str.equals("subs")) {
            Iterator<String> it2 = this._subscriptionIds.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                Iterator<ProductDetails> it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (it3.next().getProductId().equals(next2)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
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
        return queryPurchasesServer(new QueryPurchasesHandler() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.4
            @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.QueryPurchasesHandler
            public void onSuccess(int i, List<Purchase> list) {
                PlayBillingController.this._extContext.dispatchEvent(PurchaseEvent.PURCHASES_UPDATED, PurchaseEvent.formatPurchasesForEvent(PlayBillingUtils.purchasesToPurchasesArray(list, true), i, ""));
                PlayBillingController.this._extContext.dispatchEvent(InAppBillingEvent.RESTORE_PURCHASES_SUCCESS, "");
            }

            @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.QueryPurchasesHandler
            public void onFailure(int i, String str) {
                PlayBillingController.this._extContext.dispatchEvent(InAppBillingEvent.RESTORE_PURCHASES_FAILED, InAppBillingEvent.formatErrorForEvent(i, str));
            }
        });
    }

    public boolean getPurchases() {
        return getPurchases(true);
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean getPurchases(boolean z) {
        Logger.d(TAG, "getPurchases( %b )", Boolean.valueOf(z));
        QueryPurchasesHandler queryPurchasesHandler = new QueryPurchasesHandler() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.5
            @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.QueryPurchasesHandler
            public void onSuccess(int i, List<Purchase> list) {
                PlayBillingController.this.processPendingPurchases(list);
                PlayBillingController.this._extContext.dispatchEvent(PurchaseEvent.GET_PURCHASES_COMPLETE, PurchaseEvent.formatPurchasesForEvent(PlayBillingUtils.purchasesToPurchasesArray(list, false), i, ""));
            }

            @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.QueryPurchasesHandler
            public void onFailure(int i, String str) {
                PlayBillingController.this._extContext.dispatchEvent(PurchaseEvent.GET_PURCHASES_FAILED, PurchaseEvent.formatErrorForEvent(i, str));
            }
        };
        if (z) {
            return queryPurchasesServer(queryPurchasesHandler);
        }
        return queryPurchasesLocal(queryPurchasesHandler);
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public JSONArray getPendingPurchases() {
        Logger.d(TAG, "getPendingPurchases()", new Object[0]);
        getPendingPurchasesAsync(null);
        return PlayBillingUtils.purchasesToPurchasesArray(this._pendingPurchases, false);
    }

    private void addPendingPurchase(Purchase purchase) {
        if (this._pendingPurchases == null) {
            this._pendingPurchases = new ArrayList();
        }
        boolean z = false;
        for (Purchase purchase2 : this._pendingPurchases) {
            z |= purchase2.getOrderId().equals(purchase.getOrderId());
        }
        if (z) {
            return;
        }
        this._pendingPurchases.add(purchase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getPendingPurchasesAsync(final QueryPendingPurchasesHandler queryPendingPurchasesHandler) {
        queryPurchasesLocal(new QueryPurchasesHandler() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.6
            @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.QueryPurchasesHandler
            public void onSuccess(int i, List<Purchase> list) {
                PlayBillingController.this.processPendingPurchases(list);
                QueryPendingPurchasesHandler queryPendingPurchasesHandler2 = queryPendingPurchasesHandler;
                if (queryPendingPurchasesHandler2 != null) {
                    queryPendingPurchasesHandler2.onComplete();
                }
            }

            @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.QueryPurchasesHandler
            public void onFailure(int i, String str) {
                QueryPendingPurchasesHandler queryPendingPurchasesHandler2 = queryPendingPurchasesHandler;
                if (queryPendingPurchasesHandler2 != null) {
                    queryPendingPurchasesHandler2.onComplete();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processPendingPurchases(List<Purchase> list) {
        this._pendingPurchases = new ArrayList();
        for (Purchase purchase : list) {
            if (!purchase.isAcknowledged()) {
                this._pendingPurchases.add(purchase);
            }
        }
    }

    private boolean queryPurchasesLocal(final QueryPurchasesHandler queryPurchasesHandler) {
        return executeServiceRequest(new ServiceRequest() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda5
            @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.ServiceRequest
            public final void run() {
                PlayBillingController.this.m295xc6c38079(queryPurchasesHandler);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$queryPurchasesLocal$6$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m295xc6c38079(final QueryPurchasesHandler queryPurchasesHandler) {
        Logger.d(TAG, "queryPurchasesLocal()", new Object[0]);
        try {
            final ArrayList arrayList = new ArrayList();
            this._billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), new PurchasesResponseListener() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda17
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    PlayBillingController.this.m294x9812165a(queryPurchasesHandler, arrayList, billingResult, list);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$queryPurchasesLocal$5$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m294x9812165a(final QueryPurchasesHandler queryPurchasesHandler, final List list, BillingResult billingResult, List list2) {
        int responseCode = billingResult.getResponseCode();
        Logger.d(TAG, "queryPurchasesLocal(): response: inapp: %d", Integer.valueOf(responseCode));
        if (responseCode != 0) {
            queryPurchasesHandler.onFailure(billingResult.getResponseCode(), billingResult.getDebugMessage());
            return;
        }
        list.addAll(list2);
        if (areSubscriptionsSupported()) {
            this._billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("subs").build(), new PurchasesResponseListener() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda9
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult2, List list3) {
                    PlayBillingController.this.m293x6960ac3b(queryPurchasesHandler, list, billingResult2, list3);
                }
            });
        } else {
            queryPurchasesHandler.onSuccess(responseCode, verifyPurchases(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$queryPurchasesLocal$4$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m293x6960ac3b(QueryPurchasesHandler queryPurchasesHandler, List list, BillingResult billingResult, List list2) {
        int responseCode = billingResult.getResponseCode();
        Logger.d(TAG, "queryPurchasesLocal(): response: subs: %d", Integer.valueOf(responseCode));
        if (responseCode != 0) {
            queryPurchasesHandler.onFailure(responseCode, billingResult.getDebugMessage());
            return;
        }
        list.addAll(list2);
        queryPurchasesHandler.onSuccess(responseCode, verifyPurchases(list));
    }

    private boolean queryPurchasesServer(final QueryPurchasesHandler queryPurchasesHandler) {
        return executeServiceRequest(new ServiceRequest() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda24
            @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.ServiceRequest
            public final void run() {
                PlayBillingController.this.m298xc9351650(queryPurchasesHandler);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$queryPurchasesServer$9$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m298xc9351650(final QueryPurchasesHandler queryPurchasesHandler) {
        this._billingClient.queryPurchaseHistoryAsync(QueryPurchaseHistoryParams.newBuilder().setProductType("inapp").build(), new PurchaseHistoryResponseListener() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda8
            @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
            public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
                PlayBillingController.this.m297x9a83ac31(queryPurchasesHandler, billingResult, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$queryPurchasesServer$8$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m297x9a83ac31(final QueryPurchasesHandler queryPurchasesHandler, BillingResult billingResult, List list) {
        int responseCode = billingResult.getResponseCode();
        Logger.d(TAG, "queryPurchasesServer(): response: %d", Integer.valueOf(responseCode));
        if (responseCode != 0) {
            queryPurchasesHandler.onFailure(billingResult.getResponseCode(), billingResult.getDebugMessage());
            return;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Logger.d(TAG, "queryPurchasesServer(): inapp: %s", ((PurchaseHistoryRecord) it.next()).getOriginalJson());
            }
        }
        if (areSubscriptionsSupported()) {
            Logger.d(TAG, "queryPurchasesServer() adding subscriptions", new Object[0]);
            this._billingClient.queryPurchaseHistoryAsync(QueryPurchaseHistoryParams.newBuilder().setProductType("subs").build(), new PurchaseHistoryResponseListener() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda21
                @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
                public final void onPurchaseHistoryResponse(BillingResult billingResult2, List list2) {
                    PlayBillingController.this.m296x6bd24212(queryPurchasesHandler, billingResult2, list2);
                }
            });
            return;
        }
        queryPurchasesLocal(queryPurchasesHandler);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$queryPurchasesServer$7$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m296x6bd24212(QueryPurchasesHandler queryPurchasesHandler, BillingResult billingResult, List list) {
        int responseCode = billingResult.getResponseCode();
        Logger.d(TAG, "queryPurchasesServer(): subs response: %d", Integer.valueOf(responseCode));
        if (responseCode != 0) {
            queryPurchasesHandler.onFailure(billingResult.getResponseCode(), billingResult.getDebugMessage());
            return;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Logger.d(TAG, "queryPurchasesServer(): subs: %s", ((PurchaseHistoryRecord) it.next()).getOriginalJson());
            }
        }
        queryPurchasesLocal(queryPurchasesHandler);
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean isProductViewSupported() {
        PackageManager packageManager = this._extContext.getActivity().getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id="));
        return packageManager.queryIntentActivities(intent, 0).size() > 0;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean showProductView(String str) {
        if (isProductViewSupported()) {
            Intent intent = new Intent(this._extContext.getActivity().getApplicationContext(), ProductViewActivity.class);
            intent.putExtra("productId", str);
            intent.putExtra(NotificationCompat.CATEGORY_SERVICE, BillingService.GOOGLE_PLAY_INAPP_BILLING);
            this._extContext.getActivity().startActivity(intent);
            this._extContext.dispatchEvent(ProductViewEvent.LOADED, "");
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BillingFlowParams createPurchaseFlowParams(PurchaseRequest purchaseRequest) {
        String str = TAG;
        Logger.d(str, "makePurchase(): createBillingFlowParams", new Object[0]);
        ProductDetails productDetails = this._productInventory.getProductDetails(purchaseRequest.productId);
        if (productDetails == null) {
            Logger.d(str, "makePurchase(): Could not find matching product, have you called getProducts()?", new Object[0]);
            return null;
        } else if (productDetails.getProductType().equals("subs") && (purchaseRequest.subscriptionOfferId == null || purchaseRequest.subscriptionOfferId.length() == 0)) {
            Logger.d(str, "makePurchase(): NO SUBSCRIPTION OFFER SUPPLIED", new Object[0]);
            return null;
        } else {
            BillingFlowParams.ProductDetailsParams.Builder productDetails2 = BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails);
            if (productDetails.getProductType().equals("subs")) {
                productDetails2.setOfferToken(purchaseRequest.subscriptionOfferId);
            }
            BillingFlowParams.Builder productDetailsParamsList = BillingFlowParams.newBuilder().setProductDetailsParamsList(Arrays.asList(productDetails2.build()));
            if (purchaseRequest.applicationUsername != null && purchaseRequest.applicationUsername.length() > 0) {
                productDetailsParamsList.setObfuscatedAccountId(purchaseRequest.applicationUsername);
            }
            if (purchaseRequest.profileId != null && purchaseRequest.profileId.length() > 0) {
                productDetailsParamsList.setObfuscatedProfileId(purchaseRequest.profileId);
            }
            return productDetailsParamsList.build();
        }
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean makePurchase(final PurchaseRequest purchaseRequest) {
        Logger.d(TAG, "makePurchase( %s )", purchaseRequest.toString());
        if (hasProducts()) {
            return executeServiceRequest(new ServiceRequest() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda16
                @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.ServiceRequest
                public final void run() {
                    PlayBillingController.this.m291xdcde58b8(purchaseRequest);
                }
            });
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$makePurchase$10$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m291xdcde58b8(PurchaseRequest purchaseRequest) {
        try {
            String str = TAG;
            Logger.d(str, "makePurchase(): Starting purchase flow", new Object[0]);
            BillingFlowParams createPurchaseFlowParams = createPurchaseFlowParams(purchaseRequest);
            if (createPurchaseFlowParams != null) {
                Logger.d(str, "makePurchase(): launchBillingFlow(): %d", Integer.valueOf(this._billingClient.launchBillingFlow(this._extContext.getActivity(), createPurchaseFlowParams).getResponseCode()));
            } else {
                IExtensionContext iExtensionContext = this._extContext;
                iExtensionContext.dispatchEvent(PurchaseEvent.PURCHASE_FAILED, PurchaseEvent.formatPurchaseForEvent(null, 4, "Could not find product details for " + purchaseRequest.productId + " or there was no subscription offer specified"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean finishPurchase(final com.distriqt.extension.inappbilling.controller.Purchase purchase) {
        String str = TAG;
        Logger.d(str, "finishPurchase()", new Object[0]);
        if (purchase.transactionState.equals(com.distriqt.extension.inappbilling.controller.Purchase.STATE_PURCHASED) || purchase.transactionState.equals(com.distriqt.extension.inappbilling.controller.Purchase.STATE_RESTORED)) {
            return executeServiceRequest(new ServiceRequest() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda15
                @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.ServiceRequest
                public final void run() {
                    PlayBillingController.this.m284xfcf7f6db(purchase);
                }
            });
        }
        Logger.d(str, "finishPurchase(): Invalid transaction state: %s", purchase.transactionState);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$finishPurchase$12$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m284xfcf7f6db(final com.distriqt.extension.inappbilling.controller.Purchase purchase) {
        Logger.d(TAG, "finishPurchase(): Find purchase from product id: %s", purchase.productId);
        getPurchaseAsync(purchase.productId, new GetPurchaseAsyncListener() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda27
            @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.GetPurchaseAsyncListener
            public final void onGetPurchase(BillingResult billingResult, Purchase purchase2) {
                PlayBillingController.this.m283xce468cbc(purchase, billingResult, purchase2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$finishPurchase$11$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m283xce468cbc(com.distriqt.extension.inappbilling.controller.Purchase purchase, BillingResult billingResult, Purchase purchase2) {
        String str = TAG;
        Object[] objArr = new Object[1];
        objArr[0] = purchase2 == null ? "null" : purchase2.getOriginalJson();
        Logger.d(str, "finishPurchase(): getPurchaseAsync(): complete: %s", objArr);
        _finishPurchaseImpl(purchase2, purchase);
    }

    private void _finishPurchaseImpl(final Purchase purchase, com.distriqt.extension.inappbilling.controller.Purchase purchase2) {
        try {
            if (purchase != null) {
                String str = TAG;
                Logger.d(str, "finishPurchase(): purchase( [%s] )", TextUtils.join(",", purchase.getProducts()));
                if (purchase.isAcknowledged()) {
                    Logger.d(str, "finishPurchase(): purchase already acknowledged - dispatching FINISH_SUCCESS", new Object[0]);
                    getPendingPurchasesAsync(new QueryPendingPurchasesHandler() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda18
                        @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.QueryPendingPurchasesHandler
                        public final void onComplete() {
                            PlayBillingController.this.m274xe82c407f(purchase);
                        }
                    });
                } else {
                    Logger.d(str, "finishPurchase(): starting purchase acknowledge", new Object[0]);
                    this._billingClient.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new AcknowledgePurchaseResponseListener() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda19
                        @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
                        public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {
                            PlayBillingController.this.m277x74407edc(purchase, billingResult);
                        }
                    });
                }
            } else {
                Logger.d(TAG, "finishPurchase(): purchase is null ?", new Object[0]);
                getPendingPurchasesAsync(new QueryPendingPurchasesHandler() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda20
                    @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.QueryPendingPurchasesHandler
                    public final void onComplete() {
                        PlayBillingController.this.m278xa2f1e8fb();
                    }
                });
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$_finishPurchaseImpl$13$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m274xe82c407f(Purchase purchase) {
        this._extContext.dispatchEvent(InAppBillingEvent.FINISH_SUCCESS, PurchaseEvent.formatPurchaseForEvent(PlayBillingUtils.encodePurchase(purchase, false), 0, "Purchase already finished"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$_finishPurchaseImpl$16$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m277x74407edc(final Purchase purchase, final BillingResult billingResult) {
        Logger.d(TAG, "finishPurchase(): acknowledge complete: [%d]:%s", Integer.valueOf(billingResult.getResponseCode()), billingResult.getDebugMessage());
        if (billingResult.getResponseCode() == 0) {
            getPendingPurchasesAsync(new QueryPendingPurchasesHandler() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda13
                @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.QueryPendingPurchasesHandler
                public final void onComplete() {
                    PlayBillingController.this.m275x16ddaa9e(purchase, billingResult);
                }
            });
        } else {
            getPendingPurchasesAsync(new QueryPendingPurchasesHandler() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda14
                @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.QueryPendingPurchasesHandler
                public final void onComplete() {
                    PlayBillingController.this.m276x458f14bd(purchase, billingResult);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$_finishPurchaseImpl$14$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m275x16ddaa9e(Purchase purchase, BillingResult billingResult) {
        this._extContext.dispatchEvent(InAppBillingEvent.FINISH_SUCCESS, PurchaseEvent.formatPurchaseForEvent(PlayBillingUtils.encodePurchase(purchase, false), billingResult.getResponseCode(), billingResult.getDebugMessage()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$_finishPurchaseImpl$15$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m276x458f14bd(Purchase purchase, BillingResult billingResult) {
        this._extContext.dispatchEvent(InAppBillingEvent.FINISH_FAILED, PurchaseEvent.formatPurchaseForEvent(PlayBillingUtils.encodePurchase(purchase, false), billingResult.getResponseCode(), billingResult.getDebugMessage()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$_finishPurchaseImpl$17$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m278xa2f1e8fb() {
        this._extContext.dispatchEvent(InAppBillingEvent.FINISH_FAILED, PurchaseEvent.formatErrorForEvent(8, "Item not owned"));
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean consumePurchase(final com.distriqt.extension.inappbilling.controller.Purchase purchase) {
        Logger.d(TAG, "consumePurchase( %s )", purchase.toString());
        return executeServiceRequest(new ServiceRequest() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda1
            @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.ServiceRequest
            public final void run() {
                PlayBillingController.this.m282x13c32143(purchase);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$consumePurchase$19$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m282x13c32143(final com.distriqt.extension.inappbilling.controller.Purchase purchase) {
        Logger.d(TAG, "consumePurchase(): Find purchase from product id: %s", purchase.productId);
        getPurchaseAsync(purchase.productId, new GetPurchaseAsyncListener() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda23
            @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.GetPurchaseAsyncListener
            public final void onGetPurchase(BillingResult billingResult, Purchase purchase2) {
                PlayBillingController.this.m281xe511b724(purchase, billingResult, purchase2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$consumePurchase$18$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m281xe511b724(com.distriqt.extension.inappbilling.controller.Purchase purchase, BillingResult billingResult, Purchase purchase2) {
        _consumePurchaseImpl(purchase, purchase2);
    }

    private void _consumePurchaseImpl(final com.distriqt.extension.inappbilling.controller.Purchase purchase, final Purchase purchase2) {
        ConsumeParams consumeParams;
        try {
            if (purchase2 != null) {
                Logger.d(TAG, "consumePurchase(): using purchase data ( [%s] )", TextUtils.join(",", purchase2.getProducts()));
                consumeParams = ConsumeParams.newBuilder().setPurchaseToken(purchase2.getPurchaseToken()).build();
            } else if (purchase.transactionId != null && purchase.transactionId.length() > 0) {
                Logger.d(TAG, "consumePurchase(): using purchaseToken = %s", purchase.transactionId);
                consumeParams = ConsumeParams.newBuilder().setPurchaseToken(purchase.transactionId).build();
            } else {
                Logger.d(TAG, "consumePurchase(): purchase cannot be found and doesn't contain purchase token", new Object[0]);
                getPendingPurchasesAsync(new QueryPendingPurchasesHandler() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda2
                    @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.QueryPendingPurchasesHandler
                    public final void onComplete() {
                        PlayBillingController.this.m270x2e5f2508();
                    }
                });
                consumeParams = null;
            }
            if (consumeParams != null) {
                this._billingClient.consumeAsync(consumeParams, new ConsumeResponseListener() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda3
                    @Override // com.android.billingclient.api.ConsumeResponseListener
                    public final void onConsumeResponse(BillingResult billingResult, String str) {
                        PlayBillingController.this.m273xba736365(purchase2, purchase, billingResult, str);
                    }
                });
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$_consumePurchaseImpl$20$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m270x2e5f2508() {
        this._extContext.dispatchEvent(InAppBillingEvent.CONSUME_FAILED, PurchaseEvent.formatErrorForEvent(8, "Item not owned"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$_consumePurchaseImpl$23$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m273xba736365(Purchase purchase, com.distriqt.extension.inappbilling.controller.Purchase purchase2, final BillingResult billingResult, String str) {
        final JSONObject jSONObject;
        int responseCode = billingResult.getResponseCode();
        Logger.d(TAG, "consumePurchase(): onConsumeResponse( %d, %s )", Integer.valueOf(responseCode), str);
        if (purchase != null) {
            jSONObject = PlayBillingUtils.encodePurchase(purchase, false);
        } else {
            jSONObject = purchase2.toJSONObject();
        }
        if (responseCode == 0) {
            getPendingPurchasesAsync(new QueryPendingPurchasesHandler() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda10
                @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.QueryPendingPurchasesHandler
                public final void onComplete() {
                    PlayBillingController.this.m271x5d108f27(jSONObject, billingResult);
                }
            });
        } else {
            getPendingPurchasesAsync(new QueryPendingPurchasesHandler() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda12
                @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.QueryPendingPurchasesHandler
                public final void onComplete() {
                    PlayBillingController.this.m272x8bc1f946(jSONObject, billingResult);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$_consumePurchaseImpl$21$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m271x5d108f27(JSONObject jSONObject, BillingResult billingResult) {
        this._extContext.dispatchEvent(InAppBillingEvent.CONSUME_SUCCESS, PurchaseEvent.formatPurchaseForEvent(jSONObject, billingResult.getResponseCode(), billingResult.getDebugMessage()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$_consumePurchaseImpl$22$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m272x8bc1f946(JSONObject jSONObject, BillingResult billingResult) {
        this._extContext.dispatchEvent(InAppBillingEvent.CONSUME_FAILED, PurchaseEvent.formatPurchaseForEvent(jSONObject, billingResult.getResponseCode(), billingResult.getDebugMessage()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x000f, code lost:
        if (r0 != 5) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.android.billingclient.api.BillingFlowParams createChangePurchaseParams(com.distriqt.extension.inappbilling.controller.PurchaseChangeRequest r7) {
        /*
            r6 = this;
            int r0 = r7.prorationMode
            r1 = 1
            if (r0 == r1) goto L11
            r2 = 2
            if (r0 == r2) goto L14
            r2 = 3
            if (r0 == r2) goto L14
            r2 = 4
            if (r0 == r2) goto L13
            r2 = 5
            if (r0 == r2) goto L14
        L11:
            r2 = 1
            goto L14
        L13:
            r2 = 6
        L14:
            com.distriqt.extension.inappbilling.controller.playbilling.ProductInventory r0 = r6._productInventory
            java.lang.String r3 = r7.newProductId
            com.android.billingclient.api.ProductDetails r0 = r0.getProductDetails(r3)
            r3 = 0
            if (r0 != 0) goto L20
            return r3
        L20:
            com.android.billingclient.api.BillingFlowParams$ProductDetailsParams$Builder r4 = com.android.billingclient.api.BillingFlowParams.ProductDetailsParams.newBuilder()
            com.android.billingclient.api.BillingFlowParams$ProductDetailsParams$Builder r4 = r4.setProductDetails(r0)
            java.lang.String r0 = r0.getProductType()
            java.lang.String r5 = "subs"
            boolean r0 = r0.equals(r5)
            r5 = 0
            if (r0 == 0) goto L52
            java.lang.String r0 = r7.subscriptionOfferId
            if (r0 == 0) goto L48
            java.lang.String r0 = r7.subscriptionOfferId
            int r0 = r0.length()
            if (r0 != 0) goto L42
            goto L48
        L42:
            java.lang.String r0 = r7.subscriptionOfferId
            r4.setOfferToken(r0)
            goto L52
        L48:
            java.lang.String r7 = com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.TAG
            java.lang.String r0 = "makePurchase(): NO SUBSCRIPTION OFFER SUPPLIED"
            java.lang.Object[] r1 = new java.lang.Object[r5]
            com.distriqt.extension.inappbilling.utils.Logger.d(r7, r0, r1)
            return r3
        L52:
            com.android.billingclient.api.BillingFlowParams$Builder r0 = com.android.billingclient.api.BillingFlowParams.newBuilder()
            com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams$Builder r3 = com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.newBuilder()
            com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams$Builder r2 = r3.setSubscriptionReplacementMode(r2)
            java.lang.String r3 = r7.currentTransactionId
            com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams$Builder r2 = r2.setOldPurchaseToken(r3)
            com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams r2 = r2.build()
            com.android.billingclient.api.BillingFlowParams$Builder r0 = r0.setSubscriptionUpdateParams(r2)
            com.android.billingclient.api.BillingFlowParams$ProductDetailsParams[] r1 = new com.android.billingclient.api.BillingFlowParams.ProductDetailsParams[r1]
            com.android.billingclient.api.BillingFlowParams$ProductDetailsParams r2 = r4.build()
            r1[r5] = r2
            java.util.List r1 = java.util.Arrays.asList(r1)
            com.android.billingclient.api.BillingFlowParams$Builder r0 = r0.setProductDetailsParamsList(r1)
            java.lang.String r1 = r7.applicationUsername
            if (r1 == 0) goto L8d
            java.lang.String r1 = r7.applicationUsername
            int r1 = r1.length()
            if (r1 <= 0) goto L8d
            java.lang.String r7 = r7.applicationUsername
            r0.setObfuscatedAccountId(r7)
        L8d:
            com.android.billingclient.api.BillingFlowParams r7 = r0.build()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.createChangePurchaseParams(com.distriqt.extension.inappbilling.controller.PurchaseChangeRequest):com.android.billingclient.api.BillingFlowParams");
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean changePurchase(final PurchaseChangeRequest purchaseChangeRequest) {
        String str = TAG;
        Logger.d(str, "changePurchase( %s )", purchaseChangeRequest.toString());
        if (purchaseChangeRequest.currentProductId == null || purchaseChangeRequest.currentProductId.length() == 0 || purchaseChangeRequest.currentTransactionId == null || purchaseChangeRequest.currentTransactionId.length() == 0 || purchaseChangeRequest.newProductId == null || purchaseChangeRequest.newProductId.length() == 0 || !this._productInventory.hasProduct(purchaseChangeRequest.newProductId)) {
            return false;
        }
        Logger.d(str, "changePurchase(): request valid", new Object[0]);
        return executeServiceRequest(new ServiceRequest() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda29
            @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.ServiceRequest
            public final void run() {
                PlayBillingController.this.m279x71552677(purchaseChangeRequest);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$changePurchase$24$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m279x71552677(PurchaseChangeRequest purchaseChangeRequest) {
        try {
            String str = TAG;
            Logger.d(str, "changePurchase(): Starting purchase upgrade / downgrade flow", new Object[0]);
            BillingFlowParams createChangePurchaseParams = createChangePurchaseParams(purchaseChangeRequest);
            if (createChangePurchaseParams != null) {
                Logger.d(str, "changePurchase(): launchBillingFlow(): %d", Integer.valueOf(this._billingClient.launchBillingFlow(this._extContext.getActivity(), createChangePurchaseParams).getResponseCode()));
            } else {
                IExtensionContext iExtensionContext = this._extContext;
                iExtensionContext.dispatchEvent(PurchaseEvent.PURCHASE_FAILED, PurchaseEvent.formatPurchaseForEvent(null, 4, "Could not find product details for " + purchaseChangeRequest.newProductId + " or there was no subscription offer specified"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getPurchaseAsync(final String str, final GetPurchaseAsyncListener getPurchaseAsyncListener) {
        Logger.d(TAG, "getPurchaseAsync( %s )", str);
        if (this._productInventory.hasProductDetails(str)) {
            getPurchaseAsync(this._productInventory.getProductDetails(str), getPurchaseAsyncListener);
        } else {
            getPurchaseAsync(str, "inapp", new GetPurchaseAsyncListener() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda0
                @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.GetPurchaseAsyncListener
                public final void onGetPurchase(BillingResult billingResult, Purchase purchase) {
                    PlayBillingController.this.m289xfe7e82e9(getPurchaseAsyncListener, str, billingResult, purchase);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$getPurchaseAsync$26$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m289xfe7e82e9(final GetPurchaseAsyncListener getPurchaseAsyncListener, final String str, BillingResult billingResult, Purchase purchase) {
        if (purchase != null) {
            getPurchaseAsyncListener.onGetPurchase(billingResult, purchase);
        } else {
            getPurchaseAsync(str, "subs", new GetPurchaseAsyncListener() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda6
                @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.GetPurchaseAsyncListener
                public final void onGetPurchase(BillingResult billingResult2, Purchase purchase2) {
                    PlayBillingController.this.m288xcfcd18ca(getPurchaseAsyncListener, str, billingResult2, purchase2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$getPurchaseAsync$25$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m288xcfcd18ca(GetPurchaseAsyncListener getPurchaseAsyncListener, String str, BillingResult billingResult, Purchase purchase) {
        if (purchase != null) {
            getPurchaseAsyncListener.onGetPurchase(billingResult, purchase);
            return;
        }
        List<Purchase> list = this._verifiedPurchases;
        if (list != null) {
            for (Purchase purchase2 : list) {
                Logger.d(TAG, "getPurchaseAsync(): _verifiedPurchases: %s", purchase2.toString());
                for (String str2 : purchase2.getProducts()) {
                    if (str2.equals(str)) {
                        getPurchaseAsyncListener.onGetPurchase(null, purchase2);
                        return;
                    }
                }
            }
        }
        getPurchaseAsyncListener.onGetPurchase(null, null);
    }

    private void getPurchaseAsync(final String str, String str2, final GetPurchaseAsyncListener getPurchaseAsyncListener) {
        try {
            this._billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(str2).build(), new PurchasesResponseListener() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda26
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    PlayBillingController.lambda$getPurchaseAsync$27(str, getPurchaseAsyncListener, billingResult, list);
                }
            });
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$getPurchaseAsync$27(String str, GetPurchaseAsyncListener getPurchaseAsyncListener, BillingResult billingResult, List list) {
        Logger.d(TAG, "getPurchaseAsync(): onQueryPurchasesResponse: %d", Integer.valueOf(billingResult.getResponseCode()));
        try {
            if (billingResult.getResponseCode() == 0) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Purchase purchase = (Purchase) it.next();
                    Logger.d(TAG, "getPurchase(): queryPurchases: %s", purchase.toString());
                    for (String str2 : purchase.getProducts()) {
                        if (str2.equals(str)) {
                            getPurchaseAsyncListener.onGetPurchase(billingResult, purchase);
                            return;
                        }
                    }
                }
            }
            getPurchaseAsyncListener.onGetPurchase(billingResult, null);
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    private void getPurchaseAsync(final ProductDetails productDetails, final GetPurchaseAsyncListener getPurchaseAsyncListener) {
        String str = TAG;
        Object[] objArr = new Object[1];
        objArr[0] = productDetails == null ? "null" : productDetails.toString();
        Logger.d(str, "getPurchaseAsync( %s ) [product]", objArr);
        if (productDetails == null) {
            getPurchaseAsyncListener.onGetPurchase(null, null);
            return;
        }
        try {
            this._billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(productDetails.getProductType()).build(), new PurchasesResponseListener() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda22
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    PlayBillingController.this.m290x5be15727(productDetails, getPurchaseAsyncListener, billingResult, list);
                }
            });
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$getPurchaseAsync$28$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m290x5be15727(ProductDetails productDetails, GetPurchaseAsyncListener getPurchaseAsyncListener, BillingResult billingResult, List list) {
        Logger.d(TAG, "getPurchaseAsync() [product]: onQueryPurchasesResponse: %d", Integer.valueOf(billingResult.getResponseCode()));
        try {
            if (billingResult.getResponseCode() == 0) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Purchase purchase = (Purchase) it.next();
                    Logger.d(TAG, "getPurchaseAsync() [product]: onQueryPurchasesResponse: %s", TextUtils.join(",", purchase.getProducts()));
                    for (String str : purchase.getProducts()) {
                        if (str.equals(productDetails.getProductId())) {
                            getPurchaseAsyncListener.onGetPurchase(billingResult, purchase);
                            return;
                        }
                    }
                }
            }
            List<Purchase> list2 = this._verifiedPurchases;
            if (list2 != null) {
                for (Purchase purchase2 : list2) {
                    Logger.d(TAG, "getPurchaseAsync() [product]: _verifiedPurchases: %s", purchase2.toString());
                    for (String str2 : purchase2.getProducts()) {
                        if (str2.equals(productDetails.getProductId())) {
                            getPurchaseAsyncListener.onGetPurchase(billingResult, purchase2);
                            return;
                        }
                    }
                }
            }
            getPurchaseAsyncListener.onGetPurchase(billingResult, null);
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onActivityResult(int i, int i2, Intent intent) {
        Logger.d(TAG, "onActivityResult( %d, %d, ...)", Integer.valueOf(i), Integer.valueOf(i2));
        PlayInAppUpdates playInAppUpdates = this._inAppUpdates;
        if (playInAppUpdates != null) {
            playInAppUpdates.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onStop() {
        Logger.d(TAG, "onStop()", new Object[0]);
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onRestart() {
        Logger.d(TAG, "onRestart()", new Object[0]);
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onPause() {
        this._handler.removeCallbacksAndMessages(null);
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onResume() {
        Logger.d(TAG, "onResume()", new Object[0]);
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        final String formatPurchaseForEvent;
        Logger.d(TAG, "onPurchasesUpdated( %d, [] )", Integer.valueOf(billingResult.getResponseCode()));
        int responseCode = billingResult.getResponseCode();
        final String str = PurchaseEvent.PURCHASE_FAILED;
        if (responseCode != 0) {
            formatPurchaseForEvent = PurchaseEvent.formatPurchaseForEvent(null, billingResult.getResponseCode(), billingResult.getDebugMessage());
        } else if (list != null) {
            for (Purchase purchase : list) {
                if (!verifyValidSignature(purchase.getOriginalJson(), purchase.getSignature())) {
                    this._extContext.dispatchEvent(PurchaseEvent.PURCHASE_FAILED, PurchaseEvent.formatPurchaseForEvent(PlayBillingUtils.encodePurchase(purchase, false), 6, "Invalid signature"));
                }
            }
            formatPurchaseForEvent = PurchaseEvent.formatPurchasesForEvent(PlayBillingUtils.purchasesToPurchasesArray(verifyPurchases(list), false), billingResult.getResponseCode(), billingResult.getDebugMessage());
            str = PurchaseEvent.PURCHASES_UPDATED;
        } else {
            formatPurchaseForEvent = PurchaseEvent.formatPurchaseForEvent(null, billingResult.getResponseCode(), "Purchases response invalid");
        }
        getPendingPurchasesAsync(new QueryPendingPurchasesHandler() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController$$ExternalSyntheticLambda11
            @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.QueryPendingPurchasesHandler
            public final void onComplete() {
                PlayBillingController.this.m292x29331509(str, formatPurchaseForEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$onPurchasesUpdated$29$com-distriqt-extension-inappbilling-controller-playbilling-PlayBillingController  reason: not valid java name */
    public /* synthetic */ void m292x29331509(String str, String str2) {
        this._extContext.dispatchEvent(str, str2);
    }

    private List<Purchase> verifyPurchases(List<Purchase> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                for (Purchase purchase : list) {
                    if (verifyValidSignature(purchase.getOriginalJson(), purchase.getSignature())) {
                        arrayList.add(purchase);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    private boolean verifyValidSignature(String str, String str2) {
        if (this._service.googlePlayPublicKey == null || this._service.googlePlayPublicKey.length() == 0) {
            Logger.d(TAG, "You need to call setup with your billing key", new Object[0]);
            return false;
        }
        try {
            return Security.verifyPurchase(this._service.googlePlayPublicKey, str, str2);
        } catch (Exception e) {
            Logger.d(TAG, "Got an exception trying to validate a purchase: %s", e.getMessage());
            return false;
        }
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean isInAppUpdatesSupported() {
        if (PlayBillingControllerSupport.inAppUpdatesSupported(this._extContext.getActivity())) {
            return inAppUpdates().isSupported();
        }
        return false;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public InAppUpdates inAppUpdates() {
        if (this._inAppUpdates == null) {
            this._inAppUpdates = new PlayInAppUpdates(this._extContext);
        }
        return this._inAppUpdates;
    }
}
