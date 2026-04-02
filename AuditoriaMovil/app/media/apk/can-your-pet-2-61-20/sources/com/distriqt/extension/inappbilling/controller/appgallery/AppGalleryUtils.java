package com.distriqt.extension.inappbilling.controller.appgallery;

import com.adobe.air.wand.message.MessageManager;
import com.distriqt.extension.inappbilling.controller.Product;
import com.distriqt.extension.inappbilling.controller.Purchase;
import com.distriqt.extension.inappbilling.controller.SubscriptionOffer;
import com.distriqt.extension.inappbilling.controller.SubscriptionPeriod;
import com.distriqt.extension.inappbilling.controller.SubscriptionPhase;
import com.distriqt.extension.inappbilling.utils.Errors;
import com.distriqt.extension.inappbilling.utils.Logger;
import com.huawei.hms.iap.entity.InAppPurchaseData;
import com.huawei.hms.iap.entity.ProductInfo;
import java.net.URLEncoder;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AppGalleryUtils {
    public static final String TAG = "AppGalleryUtils";

    public static String getPurchaseState(int i) {
        return i != 0 ? i != 1 ? i != 2 ? Purchase.STATE_UNKNOWN : Purchase.STATE_REFUNDED : Purchase.STATE_CANCELLED : Purchase.STATE_PURCHASED;
    }

    public static String priceTypeToProductType(int i) {
        return (i == 0 || i == 1) ? "inapp" : i != 2 ? "" : "subs";
    }

    public static int toErrorCode(int i) {
        if (i != -1) {
            if (i != 60005) {
                switch (i) {
                    case 60000:
                        return 1;
                    case 60001:
                        return 5;
                    case 60002:
                        return 2;
                    case 60003:
                        return 4;
                    default:
                        switch (i) {
                            case 60050:
                                return -1;
                            case 60051:
                                return 7;
                            case 60052:
                                return 8;
                            case 60053:
                                return 9;
                            case 60054:
                                return 3;
                            default:
                                return i;
                        }
                }
            }
            return 2;
        }
        return 6;
    }

    public static Product encodeProduct(String str, ProductInfo productInfo) {
        Logger.d(TAG, "encodeProduct( %s ) ", str);
        try {
            Product product = new Product();
            product.id = productInfo.getProductId();
            product.title = productInfo.getProductName();
            product.description = productInfo.getProductDesc();
            product.price = productInfo.getMicrosPrice() / 1000000.0d;
            product.priceString = productInfo.getPrice();
            product.type = priceTypeToProductType(productInfo.getPriceType());
            product.currencySymbol = productInfo.getPrice().replaceAll("[\\d., ]+", "");
            product.currencyCode = productInfo.getCurrency();
            product.source = "";
            if (product.type.equals("subs")) {
                SubscriptionPhase subscriptionPhase = new SubscriptionPhase();
                if (productInfo.getSubPeriod() != null && productInfo.getSubPeriod().length() > 0) {
                    subscriptionPhase.subscriptionPeriod = SubscriptionPeriod.fromIOS8601(productInfo.getSubPeriod());
                }
                subscriptionPhase.price = product.price;
                subscriptionPhase.priceString = product.priceString;
                subscriptionPhase.currencyCode = product.currencyCode;
                subscriptionPhase.currencySymbol = product.currencySymbol;
                if (productInfo.getSubFreeTrialPeriod() != null && productInfo.getSubFreeTrialPeriod().length() > 0) {
                    try {
                        SubscriptionPhase subscriptionPhase2 = new SubscriptionPhase();
                        subscriptionPhase2.price = 0.0d;
                        subscriptionPhase2.priceString = product.currencySymbol + "0";
                        subscriptionPhase2.currencyCode = product.currencyCode;
                        subscriptionPhase2.currencySymbol = product.currencySymbol;
                        subscriptionPhase2.subscriptionPeriod = SubscriptionPeriod.fromIOS8601(productInfo.getSubFreeTrialPeriod());
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
                if (productInfo.getSubSpecialPeriod() != null && productInfo.getSubSpecialPeriod().length() > 0) {
                    try {
                        SubscriptionPhase subscriptionPhase3 = new SubscriptionPhase();
                        subscriptionPhase3.price = productInfo.getSubSpecialPriceMicros() / 1000000.0d;
                        subscriptionPhase3.priceString = productInfo.getSubSpecialPrice();
                        subscriptionPhase3.currencyCode = product.currencyCode;
                        subscriptionPhase3.currencySymbol = product.currencySymbol;
                        subscriptionPhase3.subscriptionPeriod = SubscriptionPeriod.fromIOS8601(productInfo.getSubSpecialPeriod());
                        subscriptionPhase3.numberOfPeriods = productInfo.getSubSpecialPeriodCycles();
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

    public static Purchase createPurchase(String str, String str2, boolean z) {
        try {
            InAppPurchaseData inAppPurchaseData = new InAppPurchaseData(str);
            Purchase purchase = new Purchase();
            purchase.productId = inAppPurchaseData.getProductId();
            purchase.quantity = 1;
            purchase.transactionTimestamp = inAppPurchaseData.getPurchaseTime();
            purchase.transactionId = inAppPurchaseData.getPurchaseToken();
            if (z) {
                purchase.transactionState = Purchase.STATE_RESTORED;
                purchase.originalPurchase = createPurchase(str, str2, false);
            } else {
                purchase.transactionState = getPurchaseState(inAppPurchaseData.getPurchaseState());
            }
            inAppPurchaseData.getKind();
            purchase.transactionReceipt = inAppPurchaseData.getOrderID();
            purchase.packageName = inAppPurchaseData.getPackageName();
            if (inAppPurchaseData.getDeveloperPayload() != null) {
                purchase.developerPayload = inAppPurchaseData.getDeveloperPayload();
                purchase.applicationUsername = inAppPurchaseData.getDeveloperPayload();
            }
            purchase.cancelTimestamp = inAppPurchaseData.getCancelTime();
            purchase.signature = str2;
            purchase.originalMessage = URLEncoder.encode(str, "UTF-8");
            return purchase;
        } catch (Exception e) {
            Errors.handleException(e);
            return null;
        }
    }

    public static JSONArray purchasesToPurchasesArray(List<Purchase> list) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (Purchase purchase : list) {
                JSONObject jSONObject = purchase.toJSONObject();
                if (jSONObject != null) {
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject encodePurchase(String str, String str2, boolean z) {
        try {
            if (str == null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(MessageManager.NAME_ERROR_MESSAGE, "Invalid Purchase");
                jSONObject.put("errorCode", "-1");
                return jSONObject;
            }
            Purchase createPurchase = createPurchase(str, str2, z);
            if (createPurchase != null) {
                return createPurchase.toJSONObject();
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(MessageManager.NAME_ERROR_MESSAGE, "Could not process purchase data");
            jSONObject2.put("errorCode", "-2");
            return jSONObject2;
        } catch (Exception e) {
            Errors.handleException(e);
            return null;
        }
    }
}
