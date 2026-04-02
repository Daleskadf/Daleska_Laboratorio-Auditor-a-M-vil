package com.distriqt.extension.inappbilling.controller.playbilling.legacy;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.inappbilling.controller.PurchaseChangeRequest;
import com.distriqt.extension.inappbilling.controller.PurchaseRequest;
import com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController;
import com.distriqt.extension.inappbilling.events.InAppBillingEvent;
import com.distriqt.extension.inappbilling.utils.Logger;
import java.util.List;
/* loaded from: classes.dex */
public class PlayBillingControllerWithFallback extends PlayBillingController {
    public static final String TAG = "PlayBillingControllerWithFallback";

    public PlayBillingControllerWithFallback(IExtensionContext iExtensionContext) {
        super(iExtensionContext, new ProductInventoryFallback());
    }

    private boolean useFallbackMode() {
        return this._billingClient.isFeatureSupported(BillingClient.FeatureType.PRODUCT_DETAILS).getResponseCode() == -2;
    }

    private ProductInventoryFallback productInventoryFallback() {
        return (ProductInventoryFallback) this._productInventory;
    }

    @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController, com.distriqt.extension.inappbilling.controller.BillingServiceController
    public boolean getProducts(List<String> list, List<String> list2, Boolean bool) {
        if (useFallbackMode()) {
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
            return executeServiceRequest(new PlayBillingController.ServiceRequest() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.legacy.PlayBillingControllerWithFallback$$ExternalSyntheticLambda1
                @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController.ServiceRequest
                public final void run() {
                    PlayBillingControllerWithFallback.this.m301x9dd6dee5();
                }
            });
        }
        return super.getProducts(list, list2, bool);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$getProducts$1$com-distriqt-extension-inappbilling-controller-playbilling-legacy-PlayBillingControllerWithFallback  reason: not valid java name */
    public /* synthetic */ void m301x9dd6dee5() {
        try {
            this._billingClient.querySkuDetailsAsync(SkuDetailsParams.newBuilder().setSkusList(this._productIds).setType("inapp").build(), new SkuDetailsResponseListener() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.legacy.PlayBillingControllerWithFallback$$ExternalSyntheticLambda0
                @Override // com.android.billingclient.api.SkuDetailsResponseListener
                public final void onSkuDetailsResponse(BillingResult billingResult, List list) {
                    PlayBillingControllerWithFallback.this.m300x44cb9364(billingResult, list);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$getProducts$0$com-distriqt-extension-inappbilling-controller-playbilling-legacy-PlayBillingControllerWithFallback  reason: not valid java name */
    public /* synthetic */ void m300x44cb9364(BillingResult billingResult, List list) {
        if (handleSkuDetailsResponse(billingResult.getResponseCode(), list, this._productIds)) {
            if (areSubscriptionsSupported()) {
                this._billingClient.querySkuDetailsAsync(SkuDetailsParams.newBuilder().setSkusList(this._subscriptionIds).setType("subs").build(), new SkuDetailsResponseListener() { // from class: com.distriqt.extension.inappbilling.controller.playbilling.legacy.PlayBillingControllerWithFallback.1
                    @Override // com.android.billingclient.api.SkuDetailsResponseListener
                    public void onSkuDetailsResponse(BillingResult billingResult2, List<SkuDetails> list2) {
                        int responseCode = billingResult2.getResponseCode();
                        PlayBillingControllerWithFallback playBillingControllerWithFallback = PlayBillingControllerWithFallback.this;
                        if (playBillingControllerWithFallback.handleSkuDetailsResponse(responseCode, list2, playBillingControllerWithFallback._subscriptionIds)) {
                            PlayBillingControllerWithFallback.this._extContext.dispatchEvent(InAppBillingEvent.PRODUCTS_LOADED, InAppBillingEvent.formatProductsForEvent(PlayBillingControllerWithFallback.this.activeProducts()));
                        } else {
                            PlayBillingControllerWithFallback.this._extContext.dispatchEvent(InAppBillingEvent.PRODUCTS_FAILED, InAppBillingEvent.formatErrorForEvent(billingResult2.getResponseCode(), billingResult2.getDebugMessage()));
                        }
                    }
                });
                return;
            }
            this._extContext.dispatchEvent(InAppBillingEvent.PRODUCTS_LOADED, InAppBillingEvent.formatProductsForEvent(activeProducts()));
            return;
        }
        this._extContext.dispatchEvent(InAppBillingEvent.PRODUCTS_FAILED, InAppBillingEvent.formatErrorForEvent(billingResult.getResponseCode(), billingResult.getDebugMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleSkuDetailsResponse(int i, List<SkuDetails> list, List<String> list2) {
        if (i == 0) {
            for (String str : list2) {
                boolean z = false;
                for (SkuDetails skuDetails : list) {
                    if (skuDetails.getSku().equals(str)) {
                        z = true;
                    }
                }
                if (!z) {
                    this._extContext.dispatchEvent(InAppBillingEvent.PRODUCT_INVALID, str);
                }
            }
            productInventoryFallback().addSkuProducts(list);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController
    public BillingFlowParams createPurchaseFlowParams(PurchaseRequest purchaseRequest) {
        if (useFallbackMode()) {
            SkuDetails skuDetails = productInventoryFallback().getSkuDetails(purchaseRequest.productId);
            if (skuDetails == null) {
                Logger.d(TAG, "createPurchaseFlowParams(): Could not find matching product, have you called getProducts()?", new Object[0]);
                return null;
            }
            BillingFlowParams.Builder skuDetails2 = BillingFlowParams.newBuilder().setSkuDetails(skuDetails);
            if (purchaseRequest.applicationUsername != null && purchaseRequest.applicationUsername.length() > 0) {
                skuDetails2.setObfuscatedAccountId(purchaseRequest.applicationUsername);
            }
            if (purchaseRequest.profileId != null && purchaseRequest.profileId.length() > 0) {
                skuDetails2.setObfuscatedProfileId(purchaseRequest.profileId);
            }
            if (purchaseRequest.developerPayload != null) {
                purchaseRequest.developerPayload.length();
            }
            return skuDetails2.build();
        }
        return super.createPurchaseFlowParams(purchaseRequest);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController
    public BillingFlowParams createChangePurchaseParams(PurchaseChangeRequest purchaseChangeRequest) {
        if (useFallbackMode()) {
            SkuDetails skuDetails = productInventoryFallback().getSkuDetails(purchaseChangeRequest.newProductId);
            if (skuDetails == null) {
                Logger.d(TAG, "createChangePurchaseParams(): Could not find matching product, have you called getProducts()?", new Object[0]);
                return null;
            }
            int i = purchaseChangeRequest.prorationMode;
            int i2 = 1;
            if (i != 1) {
                if (i == 2) {
                    i2 = 2;
                } else if (i == 3) {
                    i2 = 3;
                } else if (i == 4) {
                    i2 = 4;
                }
            }
            BillingFlowParams.Builder subscriptionUpdateParams = BillingFlowParams.newBuilder().setSkuDetails(skuDetails).setSubscriptionUpdateParams(BillingFlowParams.SubscriptionUpdateParams.newBuilder().setReplaceSkusProrationMode(i2).setOldSkuPurchaseToken(purchaseChangeRequest.currentTransactionId).build());
            if (purchaseChangeRequest.applicationUsername != null && purchaseChangeRequest.applicationUsername.length() > 0) {
                subscriptionUpdateParams.setObfuscatedAccountId(purchaseChangeRequest.applicationUsername);
            }
            return subscriptionUpdateParams.build();
        }
        return super.createChangePurchaseParams(purchaseChangeRequest);
    }
}
