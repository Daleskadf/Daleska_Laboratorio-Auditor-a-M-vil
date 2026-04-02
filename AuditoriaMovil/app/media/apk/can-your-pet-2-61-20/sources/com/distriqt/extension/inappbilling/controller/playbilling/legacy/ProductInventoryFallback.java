package com.distriqt.extension.inappbilling.controller.playbilling.legacy;

import com.android.billingclient.api.SkuDetails;
import com.distriqt.extension.inappbilling.controller.Product;
import com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingUtils;
import com.distriqt.extension.inappbilling.controller.playbilling.ProductInventory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class ProductInventoryFallback extends ProductInventory {
    public static final String TAG = "ProductInventoryFallback";
    private Map<String, SkuDetails> _skuDetailsMap = null;

    public void addSkuProducts(List<SkuDetails> list) {
        if (this._skuDetailsMap == null) {
            this._skuDetailsMap = new HashMap();
        }
        for (SkuDetails skuDetails : list) {
            String sku = skuDetails.getSku();
            if (this._skuDetailsMap.containsKey(sku)) {
                this._skuDetailsMap.remove(sku);
            }
            this._skuDetailsMap.put(sku, skuDetails);
        }
    }

    public SkuDetails getSkuDetails(String str) {
        if (hasSkuDetails(str)) {
            return this._skuDetailsMap.get(str);
        }
        return null;
    }

    public boolean hasSkuDetails(String str) {
        return hasSkuDetails() && this._skuDetailsMap.containsKey(str);
    }

    public boolean hasSkuDetails() {
        Map<String, SkuDetails> map = this._skuDetailsMap;
        return map != null && map.size() > 0;
    }

    @Override // com.distriqt.extension.inappbilling.controller.playbilling.ProductInventory
    public HashMap<String, Product> getActiveProducts() {
        HashMap<String, Product> hashMap = new HashMap<>();
        Map<String, SkuDetails> map = this._skuDetailsMap;
        if (map != null) {
            for (Map.Entry<String, SkuDetails> entry : map.entrySet()) {
                String key = entry.getKey();
                hashMap.put(key, PlayBillingUtils.encodeProduct(key, entry.getValue()));
            }
        }
        hashMap.putAll(super.getActiveProducts());
        return hashMap;
    }

    @Override // com.distriqt.extension.inappbilling.controller.playbilling.ProductInventory
    public boolean hasProduct(String str) {
        return hasSkuDetails(str) || super.hasProduct(str);
    }

    @Override // com.distriqt.extension.inappbilling.controller.playbilling.ProductInventory
    public boolean hasProducts() {
        return hasSkuDetails() || super.hasProducts();
    }
}
