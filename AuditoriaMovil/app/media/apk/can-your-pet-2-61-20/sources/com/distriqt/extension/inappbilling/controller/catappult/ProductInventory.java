package com.distriqt.extension.inappbilling.controller.catappult;

import com.appcoins.sdk.billing.SkuDetails;
import com.distriqt.extension.inappbilling.controller.Product;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class ProductInventory {
    public static final String TAG = "ProductInventory";
    private Map<String, SkuDetails> _productDetailsMap = null;

    public void addProducts(List<SkuDetails> list) {
        if (this._productDetailsMap == null) {
            this._productDetailsMap = new HashMap();
        }
        for (SkuDetails skuDetails : list) {
            String sku = skuDetails.getSku();
            this._productDetailsMap.remove(sku);
            this._productDetailsMap.put(sku, skuDetails);
        }
    }

    public SkuDetails getProductDetails(String str) {
        if (hasProductDetails(str)) {
            return this._productDetailsMap.get(str);
        }
        return null;
    }

    public boolean hasProductDetails(String str) {
        Map<String, SkuDetails> map = this._productDetailsMap;
        return map != null && map.containsKey(str);
    }

    public HashMap<String, Product> getActiveProducts() {
        HashMap<String, Product> hashMap = new HashMap<>();
        Map<String, SkuDetails> map = this._productDetailsMap;
        if (map != null) {
            for (Map.Entry<String, SkuDetails> entry : map.entrySet()) {
                String key = entry.getKey();
                hashMap.put(key, CatappultUtils.encodeProduct(key, entry.getValue()));
            }
        }
        return hashMap;
    }

    public boolean hasProduct(String str) {
        return hasProductDetails(str);
    }

    public boolean hasProducts() {
        Map<String, SkuDetails> map = this._productDetailsMap;
        return map != null && map.size() > 0;
    }
}
