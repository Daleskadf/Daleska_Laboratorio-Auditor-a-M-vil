package com.distriqt.extension.inappbilling.controller.playbilling;

import com.android.billingclient.api.ProductDetails;
import com.distriqt.extension.inappbilling.controller.Product;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class ProductInventory {
    public static final String TAG = "ProductInventory";
    private Map<String, ProductDetails> _productDetailsMap = null;

    public void addProducts(List<ProductDetails> list) {
        if (this._productDetailsMap == null) {
            this._productDetailsMap = new HashMap();
        }
        for (ProductDetails productDetails : list) {
            String productId = productDetails.getProductId();
            if (this._productDetailsMap.containsKey(productId)) {
                this._productDetailsMap.remove(productId);
            }
            this._productDetailsMap.put(productId, productDetails);
        }
    }

    public ProductDetails getProductDetails(String str) {
        if (hasProductDetails(str)) {
            return this._productDetailsMap.get(str);
        }
        return null;
    }

    public boolean hasProductDetails(String str) {
        Map<String, ProductDetails> map = this._productDetailsMap;
        return map != null && map.containsKey(str);
    }

    public HashMap<String, Product> getActiveProducts() {
        HashMap<String, Product> hashMap = new HashMap<>();
        Map<String, ProductDetails> map = this._productDetailsMap;
        if (map != null) {
            for (Map.Entry<String, ProductDetails> entry : map.entrySet()) {
                String key = entry.getKey();
                hashMap.put(key, PlayBillingUtils.encodeProduct(key, entry.getValue()));
            }
        }
        return hashMap;
    }

    public boolean hasProduct(String str) {
        return hasProductDetails(str);
    }

    public boolean hasProducts() {
        Map<String, ProductDetails> map = this._productDetailsMap;
        return map != null && map.size() > 0;
    }
}
