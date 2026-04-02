package com.distriqt.extension.inappbilling.controller.samsung;

import com.distriqt.extension.inappbilling.controller.Product;
import com.distriqt.extension.inappbilling.controller.Purchase;
import com.distriqt.extension.inappbilling.controller.SubscriptionOffer;
import com.distriqt.extension.inappbilling.controller.SubscriptionPeriod;
import com.distriqt.extension.inappbilling.controller.SubscriptionPhase;
import com.distriqt.extension.inappbilling.utils.Errors;
import com.distriqt.extension.inappbilling.utils.Logger;
import com.samsung.android.sdk.iap.lib.vo.ErrorVo;
import com.samsung.android.sdk.iap.lib.vo.OwnedProductVo;
import com.samsung.android.sdk.iap.lib.vo.ProductVo;
import com.samsung.android.sdk.iap.lib.vo.PurchaseVo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class SamsungIAPUtils {
    public static final String TAG = "SamsungIAPUtils";

    public static int toErrorCode(int i) {
        if (i != -1013) {
            if (i != -1005) {
                if (i != -1000) {
                    if (i != -1003) {
                        if (i != -1002) {
                            if (i != 0) {
                                if (i != 1) {
                                    return i;
                                }
                                return 1;
                            }
                            return 0;
                        }
                        return 5;
                    }
                    return 7;
                }
                return 2;
            }
            return 4;
        }
        return 3;
    }

    public static String toErrorMessage(ErrorVo errorVo) {
        String errorString = errorVo.getErrorString();
        if (errorVo.getErrorDetailsString() != null) {
            return errorString + " [" + errorVo.getErrorDetailsString() + "]";
        }
        return errorString;
    }

    public static Product encodeProduct(String str, ProductVo productVo) {
        Logger.d(TAG, "encodeProduct( %s ) : %s ", str, productVo.toString());
        try {
            Product product = new Product();
            product.id = str;
            product.title = productVo.getItemName();
            product.description = productVo.getItemDesc();
            product.price = productVo.getItemPrice().doubleValue();
            product.priceString = productVo.getItemPriceString();
            product.currencySymbol = productVo.getCurrencyUnit();
            product.currencyCode = productVo.getCurrencyCode();
            if (productVo.getType().equals("item")) {
                product.type = "inapp";
            } else if (productVo.getType().equals("subscription")) {
                product.type = "subs";
                SubscriptionPhase subscriptionPhase = new SubscriptionPhase();
                subscriptionPhase.subscriptionPeriod = new SubscriptionPeriod(productVo.getSubscriptionDurationUnit().toLowerCase(), Integer.parseInt(productVo.getSubscriptionDurationMultiplier()));
                subscriptionPhase.price = product.price;
                subscriptionPhase.priceString = product.priceString;
                subscriptionPhase.currencyCode = product.currencyCode;
                subscriptionPhase.currencySymbol = product.currencySymbol;
                if (productVo.getFreeTrialPeriod() != null) {
                    try {
                        SubscriptionPhase subscriptionPhase2 = new SubscriptionPhase();
                        subscriptionPhase2.price = 0.0d;
                        subscriptionPhase2.priceString = product.currencySymbol + "0";
                        subscriptionPhase2.currencyCode = product.currencyCode;
                        subscriptionPhase2.currencySymbol = product.currencySymbol;
                        subscriptionPhase2.subscriptionPeriod = new SubscriptionPeriod(SubscriptionPeriod.UNIT_DAY, 1);
                        subscriptionPhase2.numberOfPeriods = Integer.parseInt(productVo.getFreeTrialPeriod());
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
                if (productVo.getTieredSubscriptionYN().equals("Y")) {
                    try {
                        SubscriptionPhase subscriptionPhase3 = new SubscriptionPhase();
                        subscriptionPhase3.price = Double.parseDouble(productVo.getTieredPrice());
                        subscriptionPhase3.priceString = productVo.getTieredPriceString();
                        subscriptionPhase3.currencyCode = product.currencyCode;
                        subscriptionPhase3.currencySymbol = product.currencySymbol;
                        subscriptionPhase3.subscriptionPeriod = new SubscriptionPeriod(productVo.getTieredSubscriptionDurationUnit().toLowerCase(), Integer.parseInt(productVo.getTieredSubscriptionDurationMultiplier()));
                        subscriptionPhase3.numberOfPeriods = Integer.parseInt(productVo.getTieredSubscriptionCount());
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
            product.source = productVo.getJsonString();
            return product;
        } catch (Exception e3) {
            Errors.handleException(e3);
            return null;
        }
    }

    public static JSONArray ownedProductsToPurchasesArray(ArrayList<OwnedProductVo> arrayList, boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<OwnedProductVo> it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = ownedProductToPurchase(it.next(), z).toJSONObject();
                if (jSONObject != null) {
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Purchase ownedProductToPurchase(OwnedProductVo ownedProductVo, boolean z) {
        Date parse;
        Purchase purchase = new Purchase();
        purchase.productId = ownedProductVo.getItemId();
        purchase.quantity = 1;
        try {
            Date parse2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).parse(ownedProductVo.getPurchaseDate());
            if (parse2 != null) {
                purchase.transactionTimestamp = parse2.getTime();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        purchase.transactionId = ownedProductVo.getPurchaseId();
        purchase.transactionReceipt = ownedProductVo.getPaymentId();
        if (z) {
            purchase.transactionState = Purchase.STATE_RESTORED;
            purchase.originalPurchase = ownedProductToPurchase(ownedProductVo, false);
        } else {
            purchase.transactionState = Purchase.STATE_PURCHASED;
        }
        purchase.packageName = "";
        purchase.developerPayload = ownedProductVo.getPassThroughParam();
        purchase.applicationUsername = ownedProductVo.getPassThroughParam();
        try {
            if (ownedProductVo.getSubscriptionEndDate().length() > 0 && (parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).parse(ownedProductVo.getSubscriptionEndDate())) != null) {
                purchase.cancelTimestamp = parse.getTime();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        purchase.originalMessage = ownedProductVo.getJsonString();
        return purchase;
    }

    public static Purchase purchaseVoToPurchase(PurchaseVo purchaseVo, boolean z) {
        Purchase purchase = new Purchase();
        purchase.productId = purchaseVo.getItemId();
        purchase.quantity = 1;
        try {
            Date parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).parse(purchaseVo.getPurchaseDate());
            if (parse != null) {
                purchase.transactionTimestamp = parse.getTime();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        purchase.transactionId = purchaseVo.getPurchaseId();
        purchase.transactionReceipt = purchaseVo.getPaymentId();
        if (z) {
            purchase.transactionState = Purchase.STATE_RESTORED;
            purchase.originalPurchase = purchaseVoToPurchase(purchaseVo, false);
        } else {
            purchase.transactionState = Purchase.STATE_PURCHASED;
        }
        purchase.packageName = "";
        purchase.developerPayload = purchaseVo.getPassThroughParam();
        purchase.applicationUsername = purchaseVo.getPassThroughParam();
        purchase.originalMessage = purchaseVo.getJsonString();
        return purchase;
    }
}
