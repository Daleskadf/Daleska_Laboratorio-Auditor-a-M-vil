package com.distriqt.extension.inappbilling.controller.playbilling;

import android.text.TextUtils;
import com.adobe.air.wand.message.MessageManager;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.SkuDetails;
import com.distriqt.extension.inappbilling.controller.Product;
import com.distriqt.extension.inappbilling.controller.Purchase;
import com.distriqt.extension.inappbilling.controller.SubscriptionOffer;
import com.distriqt.extension.inappbilling.controller.SubscriptionPeriod;
import com.distriqt.extension.inappbilling.controller.SubscriptionPhase;
import com.distriqt.extension.inappbilling.utils.Errors;
import com.distriqt.extension.inappbilling.utils.Logger;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.net.URLEncoder;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class PlayBillingUtils {
    public static final String TAG = "PlayBillingUtils";

    public static String getPurchaseState(int i) {
        return i != 1 ? i != 2 ? Purchase.STATE_UNKNOWN : Purchase.STATE_DEFERRED : Purchase.STATE_PURCHASED;
    }

    public static Product encodeProduct(String str, ProductDetails productDetails) {
        Logger.d(TAG, "encodeProduct( %s ) : %s ", str, productDetails.toString());
        try {
            Product product = new Product();
            product.id = str;
            product.title = productDetails.getTitle();
            product.description = productDetails.getDescription();
            product.source = productDetails.toString().substring(12);
            if (productDetails.getProductType().equals("inapp")) {
                product.type = "inapp";
            }
            if (productDetails.getProductType().equals("subs")) {
                product.type = "subs";
            }
            if (productDetails.getOneTimePurchaseOfferDetails() != null) {
                product.price = productDetails.getOneTimePurchaseOfferDetails().getPriceAmountMicros() / 1000000.0d;
                product.priceString = productDetails.getOneTimePurchaseOfferDetails().getFormattedPrice();
                product.currencySymbol = productDetails.getOneTimePurchaseOfferDetails().getFormattedPrice().replaceAll("[\\d.,]+", "");
                product.currencyCode = productDetails.getOneTimePurchaseOfferDetails().getPriceCurrencyCode();
            }
            if (productDetails.getSubscriptionOfferDetails() != null) {
                for (ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails : productDetails.getSubscriptionOfferDetails()) {
                    Logger.d(TAG, "encodeProduct( %s ): OFFER: %s [%s]", str, subscriptionOfferDetails.getOfferToken(), TextUtils.join(",", subscriptionOfferDetails.getOfferTags()));
                    SubscriptionOffer subscriptionOffer = new SubscriptionOffer();
                    subscriptionOffer.id = subscriptionOfferDetails.getOfferToken();
                    subscriptionOffer.tags.addAll(subscriptionOfferDetails.getOfferTags());
                    for (ProductDetails.PricingPhase pricingPhase : subscriptionOfferDetails.getPricingPhases().getPricingPhaseList()) {
                        Logger.d(TAG, "encodeProduct( %s ):   PHASE: %s [%s] - %s %d %d", str, pricingPhase.getFormattedPrice(), pricingPhase.getPriceCurrencyCode(), pricingPhase.getBillingPeriod(), Integer.valueOf(pricingPhase.getBillingCycleCount()), Integer.valueOf(pricingPhase.getRecurrenceMode()));
                        SubscriptionPhase subscriptionPhase = new SubscriptionPhase();
                        subscriptionPhase.price = pricingPhase.getPriceAmountMicros() / 1000000.0d;
                        subscriptionPhase.priceString = pricingPhase.getFormattedPrice();
                        subscriptionPhase.currencyCode = pricingPhase.getPriceCurrencyCode();
                        subscriptionPhase.currencySymbol = pricingPhase.getFormattedPrice().replaceAll("[\\d.,]+", "");
                        subscriptionPhase.subscriptionPeriod = SubscriptionPeriod.fromIOS8601(pricingPhase.getBillingPeriod());
                        subscriptionPhase.numberOfPeriods = pricingPhase.getBillingCycleCount();
                        int recurrenceMode = pricingPhase.getRecurrenceMode();
                        if (recurrenceMode == 1) {
                            subscriptionPhase.recurrenceMode = SubscriptionPhase.RECURRENCE_MODE_INFINITE;
                        } else if (recurrenceMode == 2) {
                            subscriptionPhase.recurrenceMode = SubscriptionPhase.RECURRENCE_MODE_FINITE;
                        } else if (recurrenceMode == 3) {
                            subscriptionPhase.recurrenceMode = SubscriptionPhase.RECURRENCE_MODE_NONE;
                        }
                        subscriptionOffer.phases.add(subscriptionPhase);
                    }
                    product.subscriptionOffers.add(subscriptionOffer);
                }
            }
            return product;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Product encodeProduct(String str, SkuDetails skuDetails) {
        Logger.d(TAG, "encodeProduct( %s ) : %s ", str, skuDetails.toString());
        try {
            Product product = new Product();
            product.id = str;
            product.title = skuDetails.getTitle();
            product.description = skuDetails.getDescription();
            product.price = skuDetails.getPriceAmountMicros() / 1000000.0d;
            product.priceString = skuDetails.getPrice();
            product.currencySymbol = skuDetails.getPrice().replaceAll("[\\d.,]+", "");
            product.currencyCode = skuDetails.getPriceCurrencyCode();
            if (skuDetails.getType().equals("inapp")) {
                product.type = "inapp";
            }
            if (skuDetails.getType().equals("subs")) {
                product.type = "subs";
            }
            product.source = skuDetails.toString().substring(12);
            if (product.type.equals("subs")) {
                SubscriptionPhase subscriptionPhase = new SubscriptionPhase();
                if (skuDetails.getSubscriptionPeriod().length() > 0) {
                    subscriptionPhase.subscriptionPeriod = SubscriptionPeriod.fromIOS8601(skuDetails.getSubscriptionPeriod());
                }
                subscriptionPhase.price = product.price;
                subscriptionPhase.priceString = product.priceString;
                subscriptionPhase.currencyCode = product.currencyCode;
                subscriptionPhase.currencySymbol = product.currencySymbol;
                if (skuDetails.getFreeTrialPeriod().length() > 0) {
                    try {
                        SubscriptionPhase subscriptionPhase2 = new SubscriptionPhase();
                        subscriptionPhase2.price = 0.0d;
                        subscriptionPhase2.priceString = product.currencySymbol + "0";
                        subscriptionPhase2.currencyCode = product.currencyCode;
                        subscriptionPhase2.currencySymbol = product.currencySymbol;
                        subscriptionPhase2.subscriptionPeriod = SubscriptionPeriod.fromIOS8601(skuDetails.getFreeTrialPeriod());
                        subscriptionPhase2.numberOfPeriods = 1;
                        subscriptionPhase2.recurrenceMode = SubscriptionPhase.RECURRENCE_MODE_FINITE;
                        SubscriptionOffer subscriptionOffer = new SubscriptionOffer();
                        subscriptionOffer.id = "freeTrialPeriod";
                        subscriptionOffer.phases.add(subscriptionPhase2);
                        subscriptionOffer.phases.add(subscriptionPhase);
                        product.subscriptionOffers.add(subscriptionOffer);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (skuDetails.getIntroductoryPricePeriod().length() > 0) {
                    try {
                        SubscriptionPhase subscriptionPhase3 = new SubscriptionPhase();
                        subscriptionPhase3.price = skuDetails.getIntroductoryPriceAmountMicros() / 1000000.0d;
                        subscriptionPhase3.priceString = skuDetails.getIntroductoryPrice();
                        subscriptionPhase3.currencyCode = product.currencyCode;
                        subscriptionPhase3.currencySymbol = product.currencySymbol;
                        subscriptionPhase3.subscriptionPeriod = SubscriptionPeriod.fromIOS8601(skuDetails.getIntroductoryPricePeriod());
                        subscriptionPhase3.numberOfPeriods = skuDetails.getIntroductoryPriceCycles();
                        subscriptionPhase3.recurrenceMode = SubscriptionPhase.RECURRENCE_MODE_FINITE;
                        SubscriptionOffer subscriptionOffer2 = new SubscriptionOffer();
                        subscriptionOffer2.id = "introductoryOffer";
                        subscriptionOffer2.phases.add(subscriptionPhase3);
                        subscriptionOffer2.phases.add(subscriptionPhase);
                        product.subscriptionOffers.add(subscriptionOffer2);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                SubscriptionOffer subscriptionOffer3 = new SubscriptionOffer();
                subscriptionOffer3.id = "baseOffer";
                subscriptionOffer3.phases.add(subscriptionPhase);
                product.subscriptionOffers.add(subscriptionOffer3);
            }
            return product;
        } catch (Exception e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static JSONArray purchasesToPurchasesArray(List<com.android.billingclient.api.Purchase> list, boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            if (list != null) {
                for (com.android.billingclient.api.Purchase purchase : list) {
                    JSONObject encodePurchase = encodePurchase(purchase, z);
                    if (encodePurchase != null) {
                        jSONArray.put(encodePurchase);
                    }
                }
            }
            return jSONArray;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject encodePurchase(com.android.billingclient.api.Purchase purchase, boolean z) {
        try {
            if (purchase == null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("error", "Invalid Purchase");
                jSONObject.putOpt("errorCode", "-1");
                return jSONObject;
            }
            Logger.d(TAG, "encodeReceipt( %s )", TextUtils.join(",", purchase.getProducts()));
            JSONObject purchaseToObject = purchaseToObject(purchase);
            if (z) {
                purchaseToObject.putOpt("transactionState", Purchase.STATE_RESTORED);
                purchaseToObject.putOpt("originalTransaction", purchaseToObject(purchase));
            }
            purchaseToObject.putOpt(MessageManager.NAME_ERROR_MESSAGE, "");
            purchaseToObject.putOpt("errorCode", "");
            return purchaseToObject;
        } catch (Exception e) {
            Errors.handleException(null, e);
            return null;
        }
    }

    public static JSONObject purchaseToObject(com.android.billingclient.api.Purchase purchase) throws Exception {
        JSONObject jSONObject = new JSONObject();
        String purchaseState = getPurchaseState(purchase.getPurchaseState());
        Logger.d(TAG, "productIds: %s", TextUtils.join(",", purchase.getProducts()));
        jSONObject.putOpt("productId", purchase.getProducts().get(0));
        jSONObject.putOpt("productIds", purchase.getProducts());
        jSONObject.putOpt(FirebaseAnalytics.Param.QUANTITY, Integer.valueOf(purchase.getQuantity()));
        jSONObject.putOpt("transactionTimestamp", Long.valueOf(purchase.getPurchaseTime()));
        jSONObject.putOpt("transactionIdentifier", purchase.getPurchaseToken());
        jSONObject.putOpt("transactionState", purchaseState);
        jSONObject.putOpt("transactionReceipt", purchase.getOrderId());
        jSONObject.putOpt("packageName", purchase.getPackageName());
        if (purchase.getAccountIdentifiers() != null) {
            if (purchase.getAccountIdentifiers().getObfuscatedAccountId() != null) {
                jSONObject.putOpt("applicationUsername", purchase.getAccountIdentifiers().getObfuscatedAccountId());
            }
            if (purchase.getAccountIdentifiers().getObfuscatedProfileId() != null) {
                jSONObject.putOpt("profileId", purchase.getAccountIdentifiers().getObfuscatedProfileId());
            }
        }
        jSONObject.putOpt("developerPayload", purchase.getDeveloperPayload());
        jSONObject.putOpt("signature", purchase.getSignature());
        jSONObject.putOpt("originalMessage", URLEncoder.encode(purchase.getOriginalJson(), "UTF-8"));
        jSONObject.putOpt("isAutoRenewing", Boolean.valueOf(purchase.isAutoRenewing()));
        return jSONObject;
    }
}
