package com.distriqt.extension.inappbilling.controller.catappult;

import android.util.Base64;
import com.appcoins.sdk.billing.Purchase;
import com.appcoins.sdk.billing.SkuDetails;
import com.appcoins.sdk.billing.types.SkuType;
import com.distriqt.extension.inappbilling.controller.Product;
import com.distriqt.extension.inappbilling.controller.SubscriptionOffer;
import com.distriqt.extension.inappbilling.controller.SubscriptionPhase;
import com.distriqt.extension.inappbilling.utils.Errors;
import com.distriqt.extension.inappbilling.utils.Logger;
import java.net.URLEncoder;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class CatappultUtils {
    public static final String TAG = "CatappultUtils";

    public static Product encodeProduct(String str, SkuDetails skuDetails) {
        Logger.d(TAG, "encodeProduct( %s ) : %s ", str, skuDetails.toString());
        try {
            Product product = new Product();
            product.id = str;
            product.title = skuDetails.getTitle();
            product.description = skuDetails.getDescription();
            product.source = skuDetails.toString().substring(12);
            if (skuDetails.getItemType().equals(SkuType.inapp.toString())) {
                product.type = "inapp";
            }
            if (skuDetails.getItemType().equals(SkuType.subs.toString())) {
                product.type = "subs";
            }
            if (skuDetails.getPrice() != null) {
                product.priceString = skuDetails.getPrice();
                try {
                    product.price = skuDetails.getPriceAmountMicros() / 1000000.0d;
                    product.currencyCode = skuDetails.getPriceCurrencyCode();
                    product.currencySymbol = extractCurrencySymbol(product.priceString);
                    product.internationalCurrencySymbol = product.currencySymbol;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (product.type.equals("subs")) {
                SubscriptionPhase subscriptionPhase = new SubscriptionPhase();
                subscriptionPhase.price = product.price;
                subscriptionPhase.priceString = product.priceString;
                subscriptionPhase.currencyCode = product.currencyCode;
                subscriptionPhase.currencySymbol = product.currencySymbol;
                SubscriptionOffer subscriptionOffer = new SubscriptionOffer();
                subscriptionOffer.id = "baseOffer";
                subscriptionOffer.phases.add(subscriptionPhase);
                product.subscriptionOffers.add(subscriptionOffer);
            }
            return product;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String extractCurrencySymbol(String str) throws Exception {
        Matcher matcher = Pattern.compile("[^0-9\\.,\\s]*").matcher(str);
        while (matcher.find()) {
            if (matcher.groupCount() + 1 > 0) {
                return matcher.group(0);
            }
        }
        return "";
    }

    public static JSONArray purchasesToPurchasesArray(List<Purchase> list, boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            if (list != null) {
                for (Purchase purchase : list) {
                    JSONObject jSONObject = encodePurchase(purchase, z).toJSONObject();
                    if (jSONObject != null) {
                        jSONArray.put(jSONObject);
                    }
                }
            }
            return jSONArray;
        } catch (Exception unused) {
            return null;
        }
    }

    public static com.distriqt.extension.inappbilling.controller.Purchase encodePurchase(Purchase purchase, boolean z) {
        try {
            com.distriqt.extension.inappbilling.controller.Purchase purchase2 = new com.distriqt.extension.inappbilling.controller.Purchase();
            if (purchase == null) {
                purchase2.error = "Invalid Purchase";
                purchase2.errorCode = "-1";
                return purchase2;
            }
            purchase2.productId = purchase.getSku();
            purchase2.transactionTimestamp = purchase.getPurchaseTime();
            purchase2.transactionId = purchase.getToken();
            purchase2.transactionState = getPurchaseState(purchase.getPurchaseState());
            purchase2.transactionReceipt = purchase.getOrderId();
            purchase2.packageName = purchase.getPackageName();
            purchase2.developerPayload = purchase.getDeveloperPayload();
            purchase2.signature = Base64.encodeToString(purchase.getSignature(), 0);
            purchase2.originalMessage = URLEncoder.encode(purchase.getOriginalJson(), "UTF-8");
            purchase2.isAutoRenewing = purchase.isAutoRenewing();
            if (z) {
                purchase2.transactionState = com.distriqt.extension.inappbilling.controller.Purchase.STATE_RESTORED;
                purchase2.originalPurchase = encodePurchase(purchase, false);
            }
            return purchase2;
        } catch (Exception e) {
            Errors.handleException(e);
            return null;
        }
    }

    public static String getPurchaseState(int i) {
        Logger.d(TAG, "getPurchaseState( %d )", Integer.valueOf(i));
        return com.distriqt.extension.inappbilling.controller.Purchase.STATE_PURCHASED;
    }
}
