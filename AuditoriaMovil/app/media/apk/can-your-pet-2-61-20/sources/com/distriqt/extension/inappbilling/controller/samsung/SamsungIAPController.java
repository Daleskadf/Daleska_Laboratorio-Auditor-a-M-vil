package com.distriqt.extension.inappbilling.controller.samsung;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
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
import com.distriqt.extension.inappbilling.events.PurchaseEvent;
import com.distriqt.extension.inappbilling.utils.Errors;
import com.distriqt.extension.inappbilling.utils.Logger;
import com.samsung.android.sdk.iap.lib.helper.HelperDefine;
import com.samsung.android.sdk.iap.lib.helper.IapHelper;
import com.samsung.android.sdk.iap.lib.listener.OnConsumePurchasedItemsListener;
import com.samsung.android.sdk.iap.lib.listener.OnGetOwnedListListener;
import com.samsung.android.sdk.iap.lib.listener.OnGetProductsDetailsListener;
import com.samsung.android.sdk.iap.lib.listener.OnPaymentListener;
import com.samsung.android.sdk.iap.lib.vo.ConsumeVo;
import com.samsung.android.sdk.iap.lib.vo.ErrorVo;
import com.samsung.android.sdk.iap.lib.vo.OwnedProductVo;
import com.samsung.android.sdk.iap.lib.vo.ProductVo;
import com.samsung.android.sdk.iap.lib.vo.PurchaseVo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
/* loaded from: classes.dex */
public class SamsungIAPController extends ActivityStateListener implements BillingServiceController {
    private static final String TAG = "SamsungIAPController";
    private IExtensionContext _extContext;
    private Map<String, ProductVo> _products;
    private Boolean _setupComplete = false;
    private BillingService _service = null;
    private ArrayList<String> _productIds = new ArrayList<>();
    private ArrayList<String> _subscriptionIds = new ArrayList<>();
    protected final Handler _handler = new Handler(Looper.getMainLooper());

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
    public boolean isProductViewSupported() {
        return false;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean showProductView(String str) {
        return false;
    }

    public SamsungIAPController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean setup(BillingService billingService) {
        Logger.d(TAG, "setup( %s )", billingService.toString());
        try {
            this._service = billingService;
            IapHelper iapHelper = IapHelper.getInstance(this._extContext.getActivity());
            if (this._service.operationMode.equals(BillingService.OPERATION_MODE_TEST)) {
                iapHelper.setOperationMode(HelperDefine.OperationMode.OPERATION_MODE_TEST);
            } else if (this._service.operationMode.equals(BillingService.OPERATION_MODE_TEST_FAILURE)) {
                iapHelper.setOperationMode(HelperDefine.OperationMode.OPERATION_MODE_TEST_FAILURE);
            } else {
                iapHelper.setOperationMode(HelperDefine.OperationMode.OPERATION_MODE_PRODUCTION);
            }
            iapHelper.setShowErrorDialog(false);
            this._setupComplete = true;
            this._extContext.dispatchEvent(InAppBillingEvent.SETUP_SUCCESS, "");
            return true;
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean isSupported() {
        return SamsungIAPControllerSupport.supported(this._extContext.getActivity());
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
            this._handler.postDelayed(new Runnable() { // from class: com.distriqt.extension.inappbilling.controller.samsung.SamsungIAPController$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SamsungIAPController.this.m302xa59fe22d(uuid);
                }
            }, 200L);
            return uuid;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$checkAvailability$0$com-distriqt-extension-inappbilling-controller-samsung-SamsungIAPController  reason: not valid java name */
    public /* synthetic */ void m302xa59fe22d(String str) {
        this._extContext.dispatchEvent(AvailabilityEvent.COMPLETE, AvailabilityEvent.formatForEvent(str, canMakePayments() ? InAppBillingAvailability.AVAILABLE : InAppBillingAvailability.NOT_AVAILABLE));
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean areSubscriptionsSupported() {
        return isSupported();
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public void dispose() {
        this._setupComplete = false;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean getProducts(List<String> list, List<String> list2, Boolean bool) {
        try {
        } catch (Exception e) {
            Errors.handleException(e);
        }
        if (this._setupComplete.booleanValue()) {
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
            IapHelper iapHelper = IapHelper.getInstance(this._extContext.getActivity());
            if (activeProductIds().size() > 0) {
                iapHelper.getProductsDetails(TextUtils.join(",", activeProductIds()), new OnGetProductsDetailsListener() { // from class: com.distriqt.extension.inappbilling.controller.samsung.SamsungIAPController.1
                    public void onGetProducts(ErrorVo errorVo, ArrayList<ProductVo> arrayList) {
                        if (errorVo != null) {
                            try {
                                if (errorVo.getErrorCode() != 0) {
                                    SamsungIAPController.this._extContext.dispatchEvent(InAppBillingEvent.PRODUCTS_FAILED, InAppBillingEvent.formatErrorForEvent(SamsungIAPUtils.toErrorCode(errorVo.getErrorCode()), SamsungIAPUtils.toErrorMessage(errorVo)));
                                }
                            } catch (Exception e2) {
                                Errors.handleException(e2);
                                return;
                            }
                        }
                        SamsungIAPController.this.handleProductList(arrayList);
                        SamsungIAPController.this._extContext.dispatchEvent(InAppBillingEvent.PRODUCTS_LOADED, InAppBillingEvent.formatProductsForEvent(SamsungIAPController.this.activeProducts()));
                    }
                });
                return true;
            }
            this._extContext.dispatchEvent(InAppBillingEvent.PRODUCTS_FAILED, InAppBillingEvent.formatErrorForEvent(0, "No products specified"));
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleProductList(ArrayList<ProductVo> arrayList) {
        if (this._products == null) {
            this._products = new HashMap();
        }
        Iterator<ProductVo> it = arrayList.iterator();
        while (it.hasNext()) {
            ProductVo next = it.next();
            String itemId = next.getItemId();
            if (this._products.containsKey(itemId)) {
                this._products.remove(itemId);
            }
            this._products.put(itemId, next);
        }
        Iterator<String> it2 = this._productIds.iterator();
        while (it2.hasNext()) {
            String next2 = it2.next();
            if (!this._products.containsKey(next2)) {
                this._extContext.dispatchEvent(InAppBillingEvent.PRODUCT_INVALID, next2);
            }
        }
        Iterator<String> it3 = this._subscriptionIds.iterator();
        while (it3.hasNext()) {
            String next3 = it3.next();
            if (!this._products.containsKey(next3)) {
                this._extContext.dispatchEvent(InAppBillingEvent.PRODUCT_INVALID, next3);
            }
        }
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public Map<String, Product> activeProducts() {
        HashMap hashMap = new HashMap();
        Map<String, ProductVo> map = this._products;
        if (map != null) {
            for (Map.Entry<String, ProductVo> entry : map.entrySet()) {
                String key = entry.getKey();
                hashMap.put(key, SamsungIAPUtils.encodeProduct(key, entry.getValue()));
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
        Map<String, ProductVo> map = this._products;
        return map != null && map.size() > 0;
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean restorePurchases() {
        Logger.d(TAG, "restorePurchases()", new Object[0]);
        try {
            if (this._setupComplete.booleanValue()) {
                return IapHelper.getInstance(this._extContext.getActivity()).getOwnedList("all", new OnGetOwnedListListener() { // from class: com.distriqt.extension.inappbilling.controller.samsung.SamsungIAPController.2
                    public void onGetOwnedProducts(ErrorVo errorVo, ArrayList<OwnedProductVo> arrayList) {
                        if (errorVo != null) {
                            try {
                                if (errorVo.getErrorCode() != 0) {
                                    SamsungIAPController.this._extContext.dispatchEvent(InAppBillingEvent.RESTORE_PURCHASES_FAILED, InAppBillingEvent.formatErrorForEvent(SamsungIAPUtils.toErrorCode(errorVo.getErrorCode()), SamsungIAPUtils.toErrorMessage(errorVo)));
                                }
                            } catch (Exception e) {
                                Errors.handleException(e);
                                return;
                            }
                        }
                        SamsungIAPController.this._extContext.dispatchEvent(PurchaseEvent.PURCHASES_UPDATED, PurchaseEvent.formatPurchasesForEvent(SamsungIAPUtils.ownedProductsToPurchasesArray(arrayList, true), 0, ""));
                        SamsungIAPController.this._extContext.dispatchEvent(InAppBillingEvent.RESTORE_PURCHASES_SUCCESS, "");
                    }
                });
            }
            return false;
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean getPurchases(boolean z) {
        Logger.d(TAG, "getPurchases( %b )", Boolean.valueOf(z));
        try {
            if (this._setupComplete.booleanValue()) {
                return IapHelper.getInstance(this._extContext.getActivity()).getOwnedList("all", new OnGetOwnedListListener() { // from class: com.distriqt.extension.inappbilling.controller.samsung.SamsungIAPController.3
                    public void onGetOwnedProducts(ErrorVo errorVo, ArrayList<OwnedProductVo> arrayList) {
                        if (errorVo != null) {
                            try {
                                if (errorVo.getErrorCode() != 0) {
                                    SamsungIAPController.this._extContext.dispatchEvent(PurchaseEvent.GET_PURCHASES_FAILED, PurchaseEvent.formatErrorForEvent(SamsungIAPUtils.toErrorCode(errorVo.getErrorCode()), SamsungIAPUtils.toErrorMessage(errorVo)));
                                }
                            } catch (Exception e) {
                                Errors.handleException(e);
                                return;
                            }
                        }
                        SamsungIAPController.this._extContext.dispatchEvent(PurchaseEvent.GET_PURCHASES_COMPLETE, PurchaseEvent.formatPurchasesForEvent(SamsungIAPUtils.ownedProductsToPurchasesArray(arrayList, false), 0, ""));
                    }
                });
            }
            return false;
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

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean makePurchase(PurchaseRequest purchaseRequest) {
        Logger.d(TAG, "makePurchase( %s )", purchaseRequest.toString());
        try {
            if (this._setupComplete.booleanValue()) {
                IapHelper.getInstance(this._extContext.getActivity()).startPayment(purchaseRequest.productId, purchaseRequest.applicationUsername, new OnPaymentListener() { // from class: com.distriqt.extension.inappbilling.controller.samsung.SamsungIAPController.4
                    public void onPayment(ErrorVo errorVo, PurchaseVo purchaseVo) {
                        if (errorVo != null) {
                            try {
                                if (errorVo.getErrorCode() != 0) {
                                    Logger.d(SamsungIAPController.TAG, "makePurchase(): startPayment: onPayment: failed[%d] %s - %s", Integer.valueOf(errorVo.getErrorCode()), errorVo.getErrorString(), errorVo.getErrorDetailsString());
                                    SamsungIAPController.this._extContext.dispatchEvent(PurchaseEvent.PURCHASE_FAILED, PurchaseEvent.formatPurchaseForEvent(null, SamsungIAPUtils.toErrorCode(errorVo.getErrorCode()), SamsungIAPUtils.toErrorMessage(errorVo)));
                                }
                            } catch (Exception e) {
                                Errors.handleException(e);
                                SamsungIAPController.this._extContext.dispatchEvent(PurchaseEvent.PURCHASE_FAILED, PurchaseEvent.formatPurchaseForEvent(null, 6, e.getMessage()));
                                return;
                            }
                        }
                        SamsungIAPController.this._extContext.dispatchEvent(PurchaseEvent.PURCHASES_UPDATED, PurchaseEvent.formatPurchasesForEvent(SamsungIAPUtils.purchaseVoToPurchase(purchaseVo, false).toJSONObject(), 0, ""));
                    }
                });
                return true;
            }
            return false;
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean finishPurchase(Purchase purchase) {
        Logger.d(TAG, "finishPurchase( %s )", purchase.productId);
        if (this._setupComplete.booleanValue() && isSupported() && hasProducts()) {
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
        Logger.d(TAG, "consumePurchase( %s )", purchase.toString());
        try {
            if (this._setupComplete.booleanValue() && hasProducts()) {
                IapHelper.getInstance(this._extContext.getActivity()).getOwnedList("all", new OnGetOwnedListListener() { // from class: com.distriqt.extension.inappbilling.controller.samsung.SamsungIAPController.5
                    public void onGetOwnedProducts(ErrorVo errorVo, ArrayList<OwnedProductVo> arrayList) {
                        if (errorVo != null) {
                            try {
                                if (errorVo.getErrorCode() != 0) {
                                    SamsungIAPController.this._extContext.dispatchEvent(InAppBillingEvent.CONSUME_FAILED, InAppBillingEvent.formatErrorForEvent(SamsungIAPUtils.toErrorCode(errorVo.getErrorCode()), SamsungIAPUtils.toErrorMessage(errorVo)));
                                    return;
                                }
                            } catch (Exception e) {
                                Errors.handleException(e);
                                return;
                            }
                        }
                        Iterator<OwnedProductVo> it = arrayList.iterator();
                        while (it.hasNext()) {
                            OwnedProductVo next = it.next();
                            if (next.getItemId().equals(purchase.productId)) {
                                if (next.getIsConsumable().booleanValue()) {
                                    SamsungIAPController.this.consumePurchaseWithValidPurchase(SamsungIAPUtils.ownedProductToPurchase(next, false));
                                } else {
                                    SamsungIAPController.this._extContext.dispatchEvent(InAppBillingEvent.CONSUME_FAILED, InAppBillingEvent.formatErrorForEvent(5, "Purchase not consumable product"));
                                }
                            }
                        }
                    }
                });
                return true;
            }
            return false;
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void consumePurchaseWithValidPurchase(final Purchase purchase) {
        try {
            IapHelper.getInstance(this._extContext.getActivity()).consumePurchasedItems(purchase.transactionId, new OnConsumePurchasedItemsListener() { // from class: com.distriqt.extension.inappbilling.controller.samsung.SamsungIAPController.6
                public void onConsumePurchasedItems(ErrorVo errorVo, ArrayList<ConsumeVo> arrayList) {
                    if (errorVo != null) {
                        try {
                            if (errorVo.getErrorCode() != 0) {
                                SamsungIAPController.this._extContext.dispatchEvent(InAppBillingEvent.CONSUME_FAILED, InAppBillingEvent.formatErrorForEvent(SamsungIAPUtils.toErrorCode(errorVo.getErrorCode()), SamsungIAPUtils.toErrorMessage(errorVo)));
                            }
                        } catch (Exception e) {
                            Errors.handleException(e);
                            return;
                        }
                    }
                    if (arrayList.get(0).getStatusCode() == 0) {
                        SamsungIAPController.this._extContext.dispatchEvent(InAppBillingEvent.CONSUME_SUCCESS, PurchaseEvent.formatPurchaseForEvent(purchase.toJSONObject(), 0, ""));
                    } else {
                        SamsungIAPController.this._extContext.dispatchEvent(InAppBillingEvent.CONSUME_FAILED, InAppBillingEvent.formatErrorForEvent(SamsungIAPUtils.toErrorCode(errorVo.getErrorCode()), SamsungIAPUtils.toErrorMessage(errorVo)));
                    }
                }
            });
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean isInAppUpdatesSupported() {
        return SamsungIAPControllerSupport.inAppUpdatesSupported(this._extContext.getActivity());
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onActivityResult(int i, int i2, Intent intent) {
        Logger.d(TAG, "onActivityResult( %d, %d, ...)", Integer.valueOf(i), Integer.valueOf(i2));
    }
}
