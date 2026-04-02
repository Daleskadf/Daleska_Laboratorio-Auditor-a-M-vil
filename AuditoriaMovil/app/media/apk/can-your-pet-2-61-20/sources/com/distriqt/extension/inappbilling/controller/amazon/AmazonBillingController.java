package com.distriqt.extension.inappbilling.controller.amazon;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import com.amazon.device.drm.LicensingListener;
import com.amazon.device.drm.LicensingService;
import com.amazon.device.drm.model.LicenseResponse;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.inappbilling.controller.BillingService;
import com.distriqt.extension.inappbilling.controller.BillingServiceController;
import com.distriqt.extension.inappbilling.controller.InAppBillingAvailability;
import com.distriqt.extension.inappbilling.controller.InAppUpdates;
import com.distriqt.extension.inappbilling.controller.Purchase;
import com.distriqt.extension.inappbilling.controller.PurchaseChangeRequest;
import com.distriqt.extension.inappbilling.controller.PurchaseRequest;
import com.distriqt.extension.inappbilling.events.AvailabilityEvent;
import com.distriqt.extension.inappbilling.events.InAppBillingEvent;
import com.distriqt.extension.inappbilling.events.PurchaseEvent;
import com.distriqt.extension.inappbilling.events.UserDataEvent;
import com.distriqt.extension.inappbilling.utils.Errors;
import com.distriqt.extension.inappbilling.utils.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
/* loaded from: classes.dex */
public class AmazonBillingController extends ActivityStateListener implements BillingServiceController, PurchasingListener {
    public static final String TAG = "AmazonBillingController";
    private IExtensionContext _extContext;
    private ArrayList<Receipt> _getPurchaseReceipts;
    private ArrayList<Receipt> _restorePurchaseReceipts;
    private Boolean _setupComplete = false;
    private ArrayList<String> _productIds = new ArrayList<>();
    private ArrayList<String> _subscriptionIds = new ArrayList<>();
    private Map<String, PURCHASE_UPDATES_TYPE> _purchaseUpdatesType = new HashMap();
    private Map<String, String> _consumeRequests = new HashMap();
    private Map<String, Product> _skuMap = null;
    protected final Handler _handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum PURCHASE_UPDATES_TYPE {
        GET_PURCHASES,
        RESTORE,
        CONSUME
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

    @Override // com.distriqt.core.ActivityStateListener
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onDestroy() {
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onPause() {
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onRestart() {
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onResume() {
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onStart() {
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onStop() {
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean showProductView(String str) {
        return false;
    }

    public AmazonBillingController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean isSupported() {
        return AmazonBillingControllerSupport.supported(this._extContext.getActivity());
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
            this._handler.postDelayed(new Runnable() { // from class: com.distriqt.extension.inappbilling.controller.amazon.AmazonBillingController$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AmazonBillingController.this.m254xfa3129ca(uuid);
                }
            }, 200L);
            return uuid;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$checkAvailability$0$com-distriqt-extension-inappbilling-controller-amazon-AmazonBillingController  reason: not valid java name */
    public /* synthetic */ void m254xfa3129ca(String str) {
        this._extContext.dispatchEvent(AvailabilityEvent.COMPLETE, AvailabilityEvent.formatForEvent(str, canMakePayments() ? InAppBillingAvailability.AVAILABLE : InAppBillingAvailability.NOT_AVAILABLE));
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean setup(BillingService billingService) {
        String str = TAG;
        Logger.d(str, "setup()", new Object[0]);
        try {
        } catch (Exception e) {
            Errors.handleException(e);
            this._extContext.dispatchEvent(InAppBillingEvent.SETUP_FAILURE, e.getMessage());
        }
        if (isSupported()) {
            PurchasingService.registerListener(this._extContext.getActivity().getApplicationContext(), this);
            Logger.d(str, "SDK_VERSION: %s", "2.10.3.0");
            this._setupComplete = true;
            if (LicensingService.getAppstoreSDKMode().equals("PRODUCTION")) {
                LicensingService.verifyLicense(this._extContext.getActivity().getApplicationContext(), new LicensingListener() { // from class: com.distriqt.extension.inappbilling.controller.amazon.AmazonBillingController.1
                    public void onLicenseCommandResponse(LicenseResponse licenseResponse) {
                        Logger.d(AmazonBillingController.TAG, "onLicenseCommandResponse()", new Object[0]);
                        int i = AnonymousClass2.$SwitchMap$com$amazon$device$drm$model$LicenseResponse$RequestStatus[licenseResponse.getRequestStatus().ordinal()];
                        if (i == 1) {
                            Logger.d(AmazonBillingController.TAG, "onLicenseCommandResponse( LICENSED )", new Object[0]);
                        } else if (i == 2) {
                            Logger.d(AmazonBillingController.TAG, "onLicenseCommandResponse( NOT_LICENSED )", new Object[0]);
                        } else if (i == 3) {
                            Logger.d(AmazonBillingController.TAG, "onLicenseCommandResponse( EXPIRED )", new Object[0]);
                        } else if (i == 4) {
                            Logger.d(AmazonBillingController.TAG, "onLicenseCommandResponse( ERROR_INVALID_LICENSING_KEYS )", new Object[0]);
                        } else if (i == 5) {
                            Logger.d(AmazonBillingController.TAG, "onLicenseCommandResponse( ERROR_VERIFICATION )", new Object[0]);
                        }
                        Logger.d(AmazonBillingController.TAG, "onLicenseCommandResponse(): mode: %s", LicensingService.getAppstoreSDKMode());
                    }
                });
            }
            Logger.d(str, "setup(): STARTING HACK FOR AMAZON LIFECYCLE EVENTS", new Object[0]);
            this._extContext.getActivity().startActivity(new Intent(this._extContext.getActivity(), AmazonActivity.class));
            this._extContext.dispatchEvent(InAppBillingEvent.SETUP_SUCCESS, "");
            return true;
        }
        this._extContext.dispatchEvent(InAppBillingEvent.SETUP_FAILURE, "Service not supported");
        return false;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public void dispose() {
        try {
            this._setupComplete = false;
            isSupported();
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean getProducts(List<String> list, List<String> list2, Boolean bool) {
        Logger.d(TAG, "getProducts( %s, %s )", list.toString(), list2.toString());
        try {
            if (isSupported()) {
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
                HashSet hashSet = new HashSet();
                hashSet.addAll(this._productIds);
                hashSet.addAll(this._subscriptionIds);
                Logger.d(TAG, "getProducts(): started request: %s", PurchasingService.getProductData(hashSet).toString());
                return true;
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
        return false;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public Map<String, com.distriqt.extension.inappbilling.controller.Product> activeProducts() {
        HashMap hashMap = new HashMap();
        Map<String, Product> map = this._skuMap;
        if (map != null) {
            for (Map.Entry<String, Product> entry : map.entrySet()) {
                com.distriqt.extension.inappbilling.controller.Product convertAmazonProduct = AmazonUtils.convertAmazonProduct(entry.getValue());
                if (convertAmazonProduct != null) {
                    hashMap.put(convertAmazonProduct.id, convertAmazonProduct);
                }
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
        Map<String, Product> map = this._skuMap;
        return map != null && map.size() > 0;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean restorePurchases() {
        Logger.d(TAG, "restorePurchases()", new Object[0]);
        if (hasProducts()) {
            try {
                this._restorePurchaseReceipts = new ArrayList<>();
                this._purchaseUpdatesType.put(PurchasingService.getPurchaseUpdates(true).toString(), PURCHASE_UPDATES_TYPE.RESTORE);
                return true;
            } catch (Exception e) {
                Errors.handleException(e);
                return false;
            }
        }
        return false;
    }

    private void handleRestorePurchasesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        if (AnonymousClass2.$SwitchMap$com$amazon$device$iap$model$PurchaseUpdatesResponse$RequestStatus[purchaseUpdatesResponse.getRequestStatus().ordinal()] == 1) {
            Logger.d(TAG, "handleRestorePurchasesResponse(): success", new Object[0]);
            this._restorePurchaseReceipts.addAll(purchaseUpdatesResponse.getReceipts());
            if (purchaseUpdatesResponse.hasMore()) {
                this._purchaseUpdatesType.put(PurchasingService.getPurchaseUpdates(true).toString(), PURCHASE_UPDATES_TYPE.RESTORE);
                return;
            }
            this._extContext.dispatchEvent(InAppBillingEvent.RESTORE_PURCHASES_SUCCESS, PurchaseEvent.formatPurchasesForEvent(AmazonUtils.receiptsToPurchasesArray(this._restorePurchaseReceipts, purchaseUpdatesResponse.getUserData(), true), 0, ""));
            return;
        }
        Logger.d(TAG, "handleRestorePurchasesResponse(): failed", new Object[0]);
        this._extContext.dispatchEvent(InAppBillingEvent.RESTORE_PURCHASES_FAILED, PurchaseEvent.formatErrorForEvent(0, "Failed to retrieve purchases"));
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean getPurchases(boolean z) {
        Logger.d(TAG, "getPurchases( %b )", Boolean.valueOf(z));
        try {
            this._getPurchaseReceipts = new ArrayList<>();
            this._purchaseUpdatesType.put(PurchasingService.getPurchaseUpdates(true).toString(), PURCHASE_UPDATES_TYPE.GET_PURCHASES);
            return true;
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public JSONArray getPendingPurchases() {
        Logger.d(TAG, "getPendingPurchases()", new Object[0]);
        return new JSONArray();
    }

    private void handleGetPurchasesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        if (AnonymousClass2.$SwitchMap$com$amazon$device$iap$model$PurchaseUpdatesResponse$RequestStatus[purchaseUpdatesResponse.getRequestStatus().ordinal()] == 1) {
            Logger.d(TAG, "handleGetPurchasesResponse(): success", new Object[0]);
            this._getPurchaseReceipts.addAll(purchaseUpdatesResponse.getReceipts());
            if (purchaseUpdatesResponse.hasMore()) {
                this._purchaseUpdatesType.put(PurchasingService.getPurchaseUpdates(true).toString(), PURCHASE_UPDATES_TYPE.GET_PURCHASES);
                return;
            }
            this._extContext.dispatchEvent(PurchaseEvent.GET_PURCHASES_COMPLETE, PurchaseEvent.formatPurchasesForEvent(AmazonUtils.receiptsToPurchasesArray(this._getPurchaseReceipts, purchaseUpdatesResponse.getUserData(), false), 0, ""));
            return;
        }
        Logger.d(TAG, "handleGetPurchasesResponse(): failed", new Object[0]);
        this._extContext.dispatchEvent(PurchaseEvent.GET_PURCHASES_FAILED, PurchaseEvent.formatErrorForEvent(0, "Failed to retrieve purchases"));
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean makePurchase(final PurchaseRequest purchaseRequest) {
        Logger.d(TAG, "makePurchase( %s )", purchaseRequest.toString());
        if (isSupported() && hasProducts()) {
            try {
                this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.inappbilling.controller.amazon.AmazonBillingController$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        PurchasingService.purchase(PurchaseRequest.this.productId);
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

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean finishPurchase(Purchase purchase) {
        String str = TAG;
        Logger.d(str, "finishPurchase( %s )", purchase.toString());
        if (isSupported() && hasProducts()) {
            try {
                Product product = this._skuMap.get(purchase.productId);
                if (product == null && purchase.parentProductId != null && purchase.parentProductId.length() > 0) {
                    Logger.d(str, "finishPurchase(): Could not find matching product - trying parentProductId: %s", purchase.parentProductId);
                    product = this._skuMap.get(purchase.parentProductId);
                }
                if (product == null) {
                    Logger.d(str, "finishPurchase(): Could not find matching product", new Object[0]);
                    this._extContext.dispatchEvent(InAppBillingEvent.FINISH_FAILED, PurchaseEvent.formatPurchaseForEvent(purchase.toJSONObject(), 6, "Could not find matching product or purchase"));
                    return false;
                } else if (product.getProductType().equals(ProductType.CONSUMABLE)) {
                    Logger.d(str, "finishPurchase(): Product is consumable... ", new Object[0]);
                    this._extContext.dispatchEvent(InAppBillingEvent.FINISH_SUCCESS, PurchaseEvent.formatPurchaseForEvent(purchase.toJSONObject(), 0, ""));
                    return true;
                } else {
                    Logger.d(str, "finishPurchase(): notifyFulfillment( %s, ... )", purchase.transactionReceipt);
                    PurchasingService.notifyFulfillment(purchase.transactionReceipt, FulfillmentResult.FULFILLED);
                    this._extContext.dispatchEvent(InAppBillingEvent.FINISH_SUCCESS, PurchaseEvent.formatPurchaseForEvent(purchase.toJSONObject(), 0, ""));
                    return true;
                }
            } catch (Exception e) {
                Errors.handleException(e);
                return false;
            }
        }
        return false;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean consumePurchase(Purchase purchase) {
        String str = TAG;
        Logger.d(str, "consumePurchase( %s )", purchase.toString());
        if (isSupported() && hasProducts()) {
            try {
                if (purchase.transactionReceipt != null && purchase.transactionReceipt.length() > 0) {
                    Logger.d(str, "consumePurchase(): using purchase object transaction receipt", new Object[0]);
                    PurchasingService.notifyFulfillment(purchase.transactionReceipt, FulfillmentResult.FULFILLED);
                    this._extContext.dispatchEvent(InAppBillingEvent.CONSUME_SUCCESS, PurchaseEvent.formatPurchaseForEvent(purchase.toJSONObject(), 0, ""));
                } else {
                    Logger.d(str, "consumePurchase(): retrieving receipt", new Object[0]);
                    RequestId purchaseUpdates = PurchasingService.getPurchaseUpdates(true);
                    this._purchaseUpdatesType.put(purchaseUpdates.toString(), PURCHASE_UPDATES_TYPE.CONSUME);
                    this._consumeRequests.put(purchaseUpdates.toString(), purchase.productId);
                }
                return true;
            } catch (Exception e) {
                Errors.handleException(e);
                return false;
            }
        }
        return false;
    }

    private void handleConsumePurchaseResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        try {
            boolean z = false;
            if (AnonymousClass2.$SwitchMap$com$amazon$device$iap$model$PurchaseUpdatesResponse$RequestStatus[purchaseUpdatesResponse.getRequestStatus().ordinal()] == 1) {
                String str = TAG;
                Logger.d(str, "handleConsumePurchaseResponse(): success", new Object[0]);
                String requestId = purchaseUpdatesResponse.getRequestId().toString();
                if (this._consumeRequests.containsKey(requestId)) {
                    List receipts = purchaseUpdatesResponse.getReceipts();
                    String remove = this._consumeRequests.remove(requestId);
                    Logger.d(str, "handleConsumePurchaseResponse(): Finding receipt for product: %s from %d receipts", remove, Integer.valueOf(receipts.size()));
                    boolean z2 = false;
                    for (int i = 0; i < receipts.size(); i++) {
                        Receipt receipt = (Receipt) receipts.get(i);
                        String str2 = TAG;
                        Object[] objArr = new Object[2];
                        String str3 = "null";
                        objArr[0] = receipt.getSku() == null ? "null" : receipt.getSku();
                        if (receipt.getTermSku() != null) {
                            str3 = receipt.getTermSku();
                        }
                        objArr[1] = str3;
                        Logger.d(str2, "handleConsumePurchaseResponse(): Receipt: %s:%s", objArr);
                        boolean z3 = receipt.getSku() != null && receipt.getSku().equals(remove);
                        boolean z4 = receipt.getTermSku() != null && receipt.getTermSku().equals(remove);
                        if (z3 || z4) {
                            if (receipt.getProductType() == ProductType.CONSUMABLE) {
                                PurchasingService.notifyFulfillment(receipt.getReceiptId(), FulfillmentResult.FULFILLED);
                                this._extContext.dispatchEvent(InAppBillingEvent.CONSUME_SUCCESS, PurchaseEvent.formatPurchaseForEvent(AmazonUtils.encodeReceipt(receipt, purchaseUpdatesResponse.getUserData(), false), 0, ""));
                            } else {
                                this._extContext.dispatchEvent(InAppBillingEvent.CONSUME_FAILED, PurchaseEvent.formatErrorForEvent(5, "Product is not consumable"));
                            }
                            z2 = true;
                        }
                    }
                    if (!z2 && purchaseUpdatesResponse.hasMore()) {
                        Logger.d(TAG, "handleConsumePurchaseResponse(): querying for more receipts", new Object[0]);
                        RequestId purchaseUpdates = PurchasingService.getPurchaseUpdates(true);
                        this._purchaseUpdatesType.put(purchaseUpdates.toString(), PURCHASE_UPDATES_TYPE.CONSUME);
                        this._consumeRequests.put(purchaseUpdates.toString(), remove);
                        return;
                    }
                    z = z2;
                } else {
                    Logger.d(str, "handleConsumePurchaseResponse(): could not find consumeRequest", new Object[0]);
                }
                if (z) {
                    return;
                }
                this._extContext.dispatchEvent(InAppBillingEvent.CONSUME_FAILED, PurchaseEvent.formatErrorForEvent(6, "Unknown error occurred"));
                return;
            }
            Logger.d(TAG, "handleConsumePurchaseResponse(): failed", new Object[0]);
            this._extContext.dispatchEvent(InAppBillingEvent.CONSUME_FAILED, PurchaseEvent.formatErrorForEvent(6, "Could not retrieve purchase information"));
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    public void onUserDataResponse(UserDataResponse userDataResponse) {
        Logger.d(TAG, "onUserDataResponse()", new Object[0]);
        try {
            int i = AnonymousClass2.$SwitchMap$com$amazon$device$iap$model$UserDataResponse$RequestStatus[userDataResponse.getRequestStatus().ordinal()];
            if (i == 1) {
                this._extContext.dispatchEvent(UserDataEvent.GET_SUCCESS, UserDataEvent.formatForEvent(AmazonUtils.userDataToObject(userDataResponse.getUserData())));
            } else if (i == 2 || i == 3) {
                this._extContext.dispatchEvent(UserDataEvent.GET_FAILED, "");
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    public void onProductDataResponse(ProductDataResponse productDataResponse) {
        String str = TAG;
        Logger.d(str, "onProductDataResponse()", new Object[0]);
        if (AnonymousClass2.$SwitchMap$com$amazon$device$iap$model$ProductDataResponse$RequestStatus[productDataResponse.getRequestStatus().ordinal()] == 1) {
            Logger.d(str, "onProductDataResponse(): success", new Object[0]);
            for (String str2 : productDataResponse.getUnavailableSkus()) {
                this._extContext.dispatchEvent(InAppBillingEvent.PRODUCT_INVALID, str2);
            }
            this._skuMap = productDataResponse.getProductData();
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : productDataResponse.getProductData().entrySet()) {
                com.distriqt.extension.inappbilling.controller.Product convertAmazonProduct = AmazonUtils.convertAmazonProduct((Product) entry.getValue());
                if (convertAmazonProduct != null) {
                    Logger.d(TAG, "onProductDataResponse(): Product[%s, %s]", convertAmazonProduct.id, convertAmazonProduct.type);
                    hashMap.put(convertAmazonProduct.id, convertAmazonProduct);
                }
            }
            this._extContext.dispatchEvent(InAppBillingEvent.PRODUCTS_LOADED, InAppBillingEvent.formatProductsForEvent(hashMap));
            return;
        }
        Logger.d(str, "onProductDataResponse(): failed: %s", productDataResponse.toString());
        this._extContext.dispatchEvent(InAppBillingEvent.PRODUCTS_FAILED, InAppBillingEvent.formatErrorForEvent(-1, "Failed to retrieve products"));
    }

    public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
        String str = TAG;
        Logger.d(str, "onPurchaseResponse()", new Object[0]);
        Receipt receipt = purchaseResponse.getReceipt();
        UserData userData = purchaseResponse.getUserData();
        int i = AnonymousClass2.$SwitchMap$com$amazon$device$iap$model$PurchaseResponse$RequestStatus[purchaseResponse.getRequestStatus().ordinal()];
        if (i == 1) {
            Logger.d(str, "onPurchaseResponse(): success", new Object[0]);
            this._extContext.dispatchEvent(PurchaseEvent.PURCHASES_UPDATED, PurchaseEvent.formatPurchasesForEvent(AmazonUtils.encodeReceipt(receipt, userData, false), 0, ""));
        } else if (i == 2) {
            Logger.d(str, "onPurchaseResponse(): ALREADY_PURCHASED", new Object[0]);
            this._extContext.dispatchEvent(PurchaseEvent.PURCHASE_FAILED, PurchaseEvent.formatPurchaseForEvent(AmazonUtils.encodeReceipt(receipt, userData, false), 7, ""));
        } else if (i == 3) {
            Logger.d(str, "onPurchaseResponse(): INVALID_SKU", new Object[0]);
            this._extContext.dispatchEvent(PurchaseEvent.PURCHASE_FAILED, PurchaseEvent.formatPurchaseForEvent(AmazonUtils.encodeReceipt(receipt, userData, false), 4, ""));
        } else {
            Logger.d(str, "onPurchaseResponse(): failed", new Object[0]);
            this._extContext.dispatchEvent(PurchaseEvent.PURCHASE_FAILED, PurchaseEvent.formatPurchaseForEvent(AmazonUtils.encodeReceipt(receipt, userData, false), 6, ""));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049 A[Catch: Exception -> 0x004d, TRY_LEAVE, TryCatch #0 {Exception -> 0x004d, blocks: (B:15:0x0033, B:19:0x0041, B:20:0x0045, B:21:0x0049), top: B:26:0x0033 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPurchaseUpdatesResponse(com.amazon.device.iap.model.PurchaseUpdatesResponse r5) {
        /*
            r4 = this;
            java.lang.String r0 = com.distriqt.extension.inappbilling.controller.amazon.AmazonBillingController.TAG
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "onPurchaseUpdatesResponse()"
            com.distriqt.extension.inappbilling.utils.Logger.d(r0, r2, r1)
            com.distriqt.extension.inappbilling.controller.amazon.AmazonBillingController$PURCHASE_UPDATES_TYPE r0 = com.distriqt.extension.inappbilling.controller.amazon.AmazonBillingController.PURCHASE_UPDATES_TYPE.GET_PURCHASES
            com.amazon.device.iap.model.RequestId r1 = r5.getRequestId()     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L2b
            java.util.Map<java.lang.String, com.distriqt.extension.inappbilling.controller.amazon.AmazonBillingController$PURCHASE_UPDATES_TYPE> r2 = r4._purchaseUpdatesType     // Catch: java.lang.Exception -> L2b
            boolean r2 = r2.containsKey(r1)     // Catch: java.lang.Exception -> L2b
            if (r2 == 0) goto L33
            java.util.Map<java.lang.String, com.distriqt.extension.inappbilling.controller.amazon.AmazonBillingController$PURCHASE_UPDATES_TYPE> r2 = r4._purchaseUpdatesType     // Catch: java.lang.Exception -> L2b
            java.lang.Object r1 = r2.remove(r1)     // Catch: java.lang.Exception -> L2b
            com.distriqt.extension.inappbilling.controller.amazon.AmazonBillingController$PURCHASE_UPDATES_TYPE r1 = (com.distriqt.extension.inappbilling.controller.amazon.AmazonBillingController.PURCHASE_UPDATES_TYPE) r1     // Catch: java.lang.Exception -> L2b
            if (r1 != 0) goto L32
            com.distriqt.extension.inappbilling.controller.amazon.AmazonBillingController$PURCHASE_UPDATES_TYPE r0 = com.distriqt.extension.inappbilling.controller.amazon.AmazonBillingController.PURCHASE_UPDATES_TYPE.GET_PURCHASES     // Catch: java.lang.Exception -> L29
            goto L33
        L29:
            r0 = move-exception
            goto L2f
        L2b:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
        L2f:
            r0.printStackTrace()
        L32:
            r0 = r1
        L33:
            int[] r1 = com.distriqt.extension.inappbilling.controller.amazon.AmazonBillingController.AnonymousClass2.$SwitchMap$com$distriqt$extension$inappbilling$controller$amazon$AmazonBillingController$PURCHASE_UPDATES_TYPE     // Catch: java.lang.Exception -> L4d
            int r0 = r0.ordinal()     // Catch: java.lang.Exception -> L4d
            r0 = r1[r0]     // Catch: java.lang.Exception -> L4d
            r1 = 2
            if (r0 == r1) goto L49
            r1 = 3
            if (r0 == r1) goto L45
            r4.handleGetPurchasesResponse(r5)     // Catch: java.lang.Exception -> L4d
            goto L51
        L45:
            r4.handleConsumePurchaseResponse(r5)     // Catch: java.lang.Exception -> L4d
            goto L51
        L49:
            r4.handleRestorePurchasesResponse(r5)     // Catch: java.lang.Exception -> L4d
            goto L51
        L4d:
            r5 = move-exception
            com.distriqt.extension.inappbilling.utils.Errors.handleException(r5)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.distriqt.extension.inappbilling.controller.amazon.AmazonBillingController.onPurchaseUpdatesResponse(com.amazon.device.iap.model.PurchaseUpdatesResponse):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.distriqt.extension.inappbilling.controller.amazon.AmazonBillingController$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$drm$model$LicenseResponse$RequestStatus;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$iap$model$ProductDataResponse$RequestStatus;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$iap$model$PurchaseResponse$RequestStatus;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$iap$model$PurchaseUpdatesResponse$RequestStatus;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$iap$model$UserDataResponse$RequestStatus;
        static final /* synthetic */ int[] $SwitchMap$com$distriqt$extension$inappbilling$controller$amazon$AmazonBillingController$PURCHASE_UPDATES_TYPE;

        static {
            int[] iArr = new int[PURCHASE_UPDATES_TYPE.values().length];
            $SwitchMap$com$distriqt$extension$inappbilling$controller$amazon$AmazonBillingController$PURCHASE_UPDATES_TYPE = iArr;
            try {
                iArr[PURCHASE_UPDATES_TYPE.GET_PURCHASES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$distriqt$extension$inappbilling$controller$amazon$AmazonBillingController$PURCHASE_UPDATES_TYPE[PURCHASE_UPDATES_TYPE.RESTORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$distriqt$extension$inappbilling$controller$amazon$AmazonBillingController$PURCHASE_UPDATES_TYPE[PURCHASE_UPDATES_TYPE.CONSUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[PurchaseResponse.RequestStatus.values().length];
            $SwitchMap$com$amazon$device$iap$model$PurchaseResponse$RequestStatus = iArr2;
            try {
                iArr2[PurchaseResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$device$iap$model$PurchaseResponse$RequestStatus[PurchaseResponse.RequestStatus.ALREADY_PURCHASED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$device$iap$model$PurchaseResponse$RequestStatus[PurchaseResponse.RequestStatus.INVALID_SKU.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$device$iap$model$PurchaseResponse$RequestStatus[PurchaseResponse.RequestStatus.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[ProductDataResponse.RequestStatus.values().length];
            $SwitchMap$com$amazon$device$iap$model$ProductDataResponse$RequestStatus = iArr3;
            try {
                iArr3[ProductDataResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$amazon$device$iap$model$ProductDataResponse$RequestStatus[ProductDataResponse.RequestStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[UserDataResponse.RequestStatus.values().length];
            $SwitchMap$com$amazon$device$iap$model$UserDataResponse$RequestStatus = iArr4;
            try {
                iArr4[UserDataResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$amazon$device$iap$model$UserDataResponse$RequestStatus[UserDataResponse.RequestStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$amazon$device$iap$model$UserDataResponse$RequestStatus[UserDataResponse.RequestStatus.NOT_SUPPORTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr5 = new int[PurchaseUpdatesResponse.RequestStatus.values().length];
            $SwitchMap$com$amazon$device$iap$model$PurchaseUpdatesResponse$RequestStatus = iArr5;
            try {
                iArr5[PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$amazon$device$iap$model$PurchaseUpdatesResponse$RequestStatus[PurchaseUpdatesResponse.RequestStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr6 = new int[LicenseResponse.RequestStatus.values().length];
            $SwitchMap$com$amazon$device$drm$model$LicenseResponse$RequestStatus = iArr6;
            try {
                iArr6[LicenseResponse.RequestStatus.LICENSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$amazon$device$drm$model$LicenseResponse$RequestStatus[LicenseResponse.RequestStatus.NOT_LICENSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$amazon$device$drm$model$LicenseResponse$RequestStatus[LicenseResponse.RequestStatus.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$amazon$device$drm$model$LicenseResponse$RequestStatus[LicenseResponse.RequestStatus.ERROR_INVALID_LICENSING_KEYS.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$amazon$device$drm$model$LicenseResponse$RequestStatus[LicenseResponse.RequestStatus.ERROR_VERIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean getUserData() {
        Logger.d(TAG, "getUserData()", new Object[0]);
        try {
            PurchasingService.getUserData();
            return true;
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }
}
