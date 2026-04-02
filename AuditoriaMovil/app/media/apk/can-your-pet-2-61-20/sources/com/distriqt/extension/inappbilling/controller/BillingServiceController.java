package com.distriqt.extension.inappbilling.controller;

import android.content.Intent;
import android.content.res.Configuration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
/* loaded from: classes.dex */
public interface BillingServiceController {
    ArrayList<String> activeProductIds();

    Map<String, Product> activeProducts();

    boolean areSubscriptionsSupported();

    boolean canMakePayments();

    boolean changePurchase(PurchaseChangeRequest purchaseChangeRequest);

    String checkAvailability();

    boolean consumePurchase(Purchase purchase);

    void dispose();

    boolean finishPurchase(Purchase purchase);

    JSONArray getPendingPurchases();

    boolean getProducts(List<String> list, List<String> list2, Boolean bool);

    boolean getPurchases(boolean z);

    boolean getUserData();

    InAppUpdates inAppUpdates();

    boolean isChangePurchaseSupported();

    boolean isInAppUpdatesSupported();

    boolean isProductViewSupported();

    boolean isSupported();

    boolean makePurchase(PurchaseRequest purchaseRequest);

    void onActivityResult(int i, int i2, Intent intent);

    void onConfigurationChanged(Configuration configuration);

    void onDestroy();

    void onPause();

    void onRestart();

    void onResume();

    void onStart();

    void onStop();

    boolean restorePurchases();

    boolean setup(BillingService billingService);

    boolean showProductView(String str);
}
