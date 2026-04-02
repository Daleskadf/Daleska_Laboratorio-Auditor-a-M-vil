package com.distriqt.extension.inappbilling.controller;

import java.util.Locale;
/* loaded from: classes.dex */
public class BillingService {
    public static final String AMAZON_INAPP_PURCHASING = "amazon_inapp_purchasing";
    public static final String APPLE_INAPP_PURCHASE = "apple_inapp_purchase";
    public static final String CATAPPULT_NATIVE_BILLING = "catappult_native_billing";
    public static final String DEFAULT = "default";
    public static final String GOOGLE_PLAY_INAPP_BILLING = "google_play_inapp_billing";
    public static final String HUAWEI_APP_GALLERY = "huawei_app_gallery";
    public static final String OPERATION_MODE_PRODUCTION = "production";
    public static final String OPERATION_MODE_TEST = "test";
    public static final String OPERATION_MODE_TEST_FAILURE = "test_failure";
    public static final String SAMSUNG_INAPP_PURCHASE = "samsung_inapp_purchase";
    public static final String UNIMPLEMENTED = "unimplemented";
    public String type = "default";
    public String googlePlayPublicKey = "";
    public String huaweiAppGalleryPublicKey = "";
    public String catappultPublicKey = "";
    public Boolean useDeprecatedAsFallback = true;
    public String operationMode = OPERATION_MODE_PRODUCTION;

    public String toString() {
        return String.format(Locale.UK, "[%s, %s, ...]", this.type, this.operationMode);
    }
}
