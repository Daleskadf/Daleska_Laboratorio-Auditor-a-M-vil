package com.distriqt.extension.inappbilling.controller.amazon;

import com.adobe.air.wand.message.MessageManager;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.Promotion;
import com.amazon.device.iap.model.PromotionPlan;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.distriqt.extension.inappbilling.controller.Product;
import com.distriqt.extension.inappbilling.controller.Purchase;
import com.distriqt.extension.inappbilling.controller.SubscriptionOffer;
import com.distriqt.extension.inappbilling.controller.SubscriptionPeriod;
import com.distriqt.extension.inappbilling.controller.SubscriptionPhase;
import com.distriqt.extension.inappbilling.utils.Errors;
import com.distriqt.extension.inappbilling.utils.Logger;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.net.URLEncoder;
import java.security.InvalidParameterException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AmazonUtils {
    public static final String TAG = "AmazonUtils";
    private static Pattern patternPrice = Pattern.compile("(\\d+[[\\.,\\s]\\d+]*)");

    public static JSONArray receiptsToPurchasesArray(List<Receipt> list, UserData userData, boolean z) {
        JSONObject encodeReceipt;
        try {
            JSONArray jSONArray = new JSONArray();
            for (Receipt receipt : list) {
                if (!receipt.isCanceled() && (encodeReceipt = encodeReceipt(receipt, userData, z)) != null) {
                    jSONArray.put(encodeReceipt);
                }
            }
            return jSONArray;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject encodeReceipt(Receipt receipt, UserData userData, boolean z) {
        try {
            if (receipt == null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error", "Invalid Purchase");
                jSONObject.put("errorCode", "-1");
                return jSONObject;
            }
            Logger.d(TAG, "encodeReceipt( %s )", receipt.getSku());
            JSONObject receiptToObject = receiptToObject(receipt, userData);
            if (z) {
                receiptToObject.put("transactionState", Purchase.STATE_RESTORED);
                receiptToObject.put("originalTransaction", receiptToObject(receipt, userData));
            }
            receiptToObject.put(MessageManager.NAME_ERROR_MESSAGE, "");
            receiptToObject.put("errorCode", "");
            return receiptToObject;
        } catch (Exception e) {
            Errors.handleException(null, e);
            return null;
        }
    }

    public static JSONObject receiptToObject(Receipt receipt, UserData userData) throws Exception {
        JSONObject jSONObject = new JSONObject();
        if (receipt.getTermSku() == null) {
            jSONObject.put("productId", receipt.getSku());
        } else {
            jSONObject.put("productId", receipt.getTermSku());
            jSONObject.put("parentProductId", receipt.getSku());
        }
        jSONObject.put(FirebaseAnalytics.Param.QUANTITY, 1);
        jSONObject.put("transactionTimestamp", receipt.getPurchaseDate().getTime());
        jSONObject.put("transactionIdentifier", receipt.getReceiptId());
        jSONObject.put("transactionState", Purchase.STATE_PURCHASED);
        jSONObject.put("transactionReceipt", receipt.getReceiptId());
        if (receipt.getCancelDate() != null) {
            jSONObject.put("cancelTimestamp", receipt.getCancelDate().getTime());
        }
        jSONObject.put("originalMessage", URLEncoder.encode(receipt.toJSON().toString(), "UTF-8"));
        if (userData != null) {
            jSONObject.put("userData", userDataToObject(userData));
        }
        return jSONObject;
    }

    public static Product convertAmazonProduct(com.amazon.device.iap.model.Product product) {
        if (product == null) {
            return null;
        }
        Logger.d(TAG, "convertAmazonProduct(): %s", product.toString());
        Product product2 = new Product();
        product2.id = product.getSku();
        product2.title = product.getTitle();
        product2.description = product.getDescription();
        product2.source = product.toString();
        product2.type = product.getProductType() == ProductType.SUBSCRIPTION ? "subs" : "inapp";
        if (product.getPrice() != null) {
            product2.priceString = product.getPrice();
            try {
                product2.price = extractPrice(product.getPrice());
                product2.currencySymbol = extractCurrencySymbol(product.getPrice());
                product2.internationalCurrencySymbol = product2.currencySymbol;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (product.getProductType() == ProductType.SUBSCRIPTION) {
            SubscriptionPhase subscriptionPhase = new SubscriptionPhase();
            if (product.getSubscriptionPeriod() != null && product.getSubscriptionPeriod().length() > 0) {
                subscriptionPhase.subscriptionPeriod = subscriptionPeriodFromString(product.getSubscriptionPeriod());
            }
            subscriptionPhase.price = product2.price;
            subscriptionPhase.priceString = product2.priceString;
            subscriptionPhase.currencyCode = product2.currencyCode;
            subscriptionPhase.currencySymbol = product2.currencySymbol;
            if (product.getFreeTrialPeriod() != null && product.getFreeTrialPeriod().length() > 0) {
                try {
                    SubscriptionPhase subscriptionPhase2 = new SubscriptionPhase();
                    subscriptionPhase2.price = 0.0d;
                    subscriptionPhase2.priceString = product2.currencySymbol + "0";
                    subscriptionPhase2.currencyCode = product2.currencyCode;
                    subscriptionPhase2.currencySymbol = product2.currencySymbol;
                    subscriptionPhase2.subscriptionPeriod = subscriptionPeriodFromString(product.getFreeTrialPeriod());
                    subscriptionPhase2.numberOfPeriods = 1;
                    subscriptionPhase2.recurrenceMode = SubscriptionPhase.RECURRENCE_MODE_FINITE;
                    SubscriptionOffer subscriptionOffer = new SubscriptionOffer();
                    subscriptionOffer.id = "freeTrialPeriod";
                    subscriptionOffer.phases.add(subscriptionPhase2);
                    subscriptionOffer.phases.add(subscriptionPhase);
                    product2.subscriptionOffers.add(subscriptionOffer);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            try {
                if (product.getPromotions() != null && product.getPromotions().size() > 0) {
                    for (Promotion promotion : product.getPromotions()) {
                        SubscriptionOffer subscriptionOffer2 = new SubscriptionOffer();
                        subscriptionOffer2.id = promotion.getPromotionType();
                        for (PromotionPlan promotionPlan : promotion.getPromotionPlans()) {
                            SubscriptionPhase subscriptionPhase3 = new SubscriptionPhase();
                            subscriptionPhase3.price = extractPrice(promotionPlan.getPromotionPrice());
                            subscriptionPhase3.priceString = promotionPlan.getPromotionPrice();
                            subscriptionPhase3.currencyCode = "";
                            subscriptionPhase3.currencySymbol = extractCurrencySymbol(promotionPlan.getPromotionPrice());
                            subscriptionPhase3.subscriptionPeriod = subscriptionPeriodFromString(promotionPlan.getPromotionPricePeriod());
                            subscriptionPhase3.numberOfPeriods = promotionPlan.getPromotionPriceCycles();
                            subscriptionPhase3.recurrenceMode = SubscriptionPhase.RECURRENCE_MODE_FINITE;
                            subscriptionOffer2.phases.add(subscriptionPhase3);
                        }
                        subscriptionOffer2.phases.add(subscriptionPhase);
                        product2.subscriptionOffers.add(subscriptionOffer2);
                    }
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            SubscriptionOffer subscriptionOffer3 = new SubscriptionOffer();
            subscriptionOffer3.id = "baseOffer";
            subscriptionOffer3.phases.add(subscriptionPhase);
            product2.subscriptionOffers.add(subscriptionOffer3);
        }
        return product2;
    }

    public static SubscriptionPeriod subscriptionPeriodFromString(String str) {
        if (str.equals("Monthly")) {
            return new SubscriptionPeriod(SubscriptionPeriod.UNIT_MONTH, 1);
        }
        if (str.equals("BiMonthly")) {
            return new SubscriptionPeriod(SubscriptionPeriod.UNIT_MONTH, 2);
        }
        if (str.equals("Weekly")) {
            return new SubscriptionPeriod(SubscriptionPeriod.UNIT_WEEK, 1);
        }
        if (str.equals("BiWeekly")) {
            return new SubscriptionPeriod(SubscriptionPeriod.UNIT_WEEK, 2);
        }
        if (str.equals("Quarterly")) {
            return new SubscriptionPeriod(SubscriptionPeriod.UNIT_MONTH, 3);
        }
        if (str.equals("SemiAnnually")) {
            return new SubscriptionPeriod(SubscriptionPeriod.UNIT_MONTH, 6);
        }
        if (str.equals("Annually")) {
            return new SubscriptionPeriod(SubscriptionPeriod.UNIT_YEAR, 1);
        }
        return null;
    }

    public static double extractPrice(String str) throws InvalidParameterException {
        Matcher matcher = patternPrice.matcher(str);
        if (matcher.find()) {
            String group = matcher.group();
            if (group.contains(" ")) {
                group = group.replace(" ", "");
            }
            if (group.contains(",")) {
                if (group.contains(".") || group.length() - group.replace(",", "").length() > 1) {
                    group = group.replace(",", "");
                } else {
                    group = group.replace(",", ".");
                }
            }
            return Double.parseDouble(group);
        }
        throw new InvalidParameterException(str + " is not a valid parameter.");
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

    public static JSONObject userDataToObject(UserData userData) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", userData.getUserId());
        jSONObject.put("marketplace", userData.getMarketplace());
        return jSONObject;
    }
}
