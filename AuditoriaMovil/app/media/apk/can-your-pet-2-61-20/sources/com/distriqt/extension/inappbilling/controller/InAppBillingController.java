package com.distriqt.extension.inappbilling.controller;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.applicationrater.controller.ApplicationRaterController;
import com.distriqt.extension.inappbilling.controller.amazon.AmazonBillingController;
import com.distriqt.extension.inappbilling.controller.amazon.AmazonBillingControllerSupport;
import com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryController;
import com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryControllerSupport;
import com.distriqt.extension.inappbilling.controller.catappult.CatappultController;
import com.distriqt.extension.inappbilling.controller.catappult.CatappultControllerSupport;
import com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingController;
import com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingControllerSupport;
import com.distriqt.extension.inappbilling.controller.playbilling.legacy.PlayBillingControllerWithFallback;
import com.distriqt.extension.inappbilling.controller.samsung.SamsungIAPController;
import com.distriqt.extension.inappbilling.controller.samsung.SamsungIAPControllerSupport;
import com.distriqt.extension.inappbilling.utils.Errors;
import com.distriqt.extension.inappbilling.utils.Logger;
/* loaded from: classes.dex */
public class InAppBillingController extends ActivityStateListener {
    private static final String TAG = "InAppBillingController";
    private IExtensionContext _extContext;
    private BillingServiceController _serviceController = null;

    public boolean isSupported() {
        return true;
    }

    public InAppBillingController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }

    public void dispose() {
        BillingServiceController billingServiceController = this._serviceController;
        if (billingServiceController != null) {
            billingServiceController.dispose();
            this._serviceController = null;
        }
        this._extContext = null;
    }

    public boolean setup(BillingService billingService) {
        String str = TAG;
        Logger.d(str, "setup( %s )", billingService.toString());
        try {
            if ("default".equals(billingService.type)) {
                String determineDefaultServiceType = determineDefaultServiceType();
                Logger.d(str, "setup(): default = %s", determineDefaultServiceType);
                billingService.type = determineDefaultServiceType;
            }
            if (this._serviceController == null) {
                if (BillingService.GOOGLE_PLAY_INAPP_BILLING.equals(billingService.type) && PlayBillingControllerSupport.supported(this._extContext.getActivity())) {
                    if (billingService.useDeprecatedAsFallback.booleanValue()) {
                        this._serviceController = new PlayBillingControllerWithFallback(this._extContext);
                    } else {
                        this._serviceController = new PlayBillingController(this._extContext);
                    }
                } else if (BillingService.AMAZON_INAPP_PURCHASING.equals(billingService.type) && AmazonBillingControllerSupport.supported(this._extContext.getActivity())) {
                    this._serviceController = new AmazonBillingController(this._extContext);
                } else if (BillingService.HUAWEI_APP_GALLERY.equals(billingService.type) && AppGalleryControllerSupport.supported(this._extContext.getActivity())) {
                    this._serviceController = new AppGalleryController(this._extContext);
                } else if (BillingService.SAMSUNG_INAPP_PURCHASE.equals(billingService.type) && SamsungIAPControllerSupport.supported(this._extContext.getActivity())) {
                    this._serviceController = new SamsungIAPController(this._extContext);
                } else if (BillingService.CATAPPULT_NATIVE_BILLING.equals(billingService.type) && CatappultControllerSupport.supported(this._extContext.getActivity())) {
                    this._serviceController = new CatappultController(this._extContext);
                }
            }
            BillingServiceController billingServiceController = this._serviceController;
            if (billingServiceController != null) {
                return billingServiceController.setup(billingService);
            }
            return false;
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    public BillingServiceController service() {
        return this._serviceController;
    }

    public String determineDefaultServiceType() {
        String installerPackageName = this._extContext.getActivity().getPackageManager().getInstallerPackageName(this._extContext.getActivity().getPackageName());
        String str = TAG;
        Object[] objArr = new Object[1];
        objArr[0] = installerPackageName == null ? "null" : installerPackageName;
        Logger.d(str, "determineDefaultServiceType(): installer: %s", objArr);
        String str2 = BillingService.AMAZON_INAPP_PURCHASING;
        if (installerPackageName != null) {
            Logger.d(str, "determineDefaultServiceType(): installer: %s", installerPackageName);
            if (!installerPackageName.contains(ApplicationRaterController.STORE_AMAZON)) {
                if ("com.huawei.appmarket".equalsIgnoreCase(installerPackageName)) {
                    return BillingService.HUAWEI_APP_GALLERY;
                }
                "com.android.vending".equalsIgnoreCase(installerPackageName);
                return BillingService.GOOGLE_PLAY_INAPP_BILLING;
            }
        } else {
            Logger.d(str, "determineDefaultServiceType(): manufacturer: %s", Build.MANUFACTURER);
            if (!Build.MANUFACTURER.equalsIgnoreCase(ApplicationRaterController.STORE_AMAZON)) {
                str2 = BillingService.GOOGLE_PLAY_INAPP_BILLING;
            }
            if (Build.MANUFACTURER.equalsIgnoreCase("huawei")) {
                return BillingService.HUAWEI_APP_GALLERY;
            }
        }
        return str2;
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onStart() {
        BillingServiceController billingServiceController = this._serviceController;
        if (billingServiceController != null) {
            billingServiceController.onStart();
        }
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onStop() {
        BillingServiceController billingServiceController = this._serviceController;
        if (billingServiceController != null) {
            billingServiceController.onStop();
        }
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onPause() {
        BillingServiceController billingServiceController = this._serviceController;
        if (billingServiceController != null) {
            billingServiceController.onPause();
        }
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onResume() {
        BillingServiceController billingServiceController = this._serviceController;
        if (billingServiceController != null) {
            billingServiceController.onResume();
        }
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onDestroy() {
        BillingServiceController billingServiceController = this._serviceController;
        if (billingServiceController != null) {
            billingServiceController.onDestroy();
        }
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onRestart() {
        BillingServiceController billingServiceController = this._serviceController;
        if (billingServiceController != null) {
            billingServiceController.onRestart();
        }
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onActivityResult(int i, int i2, Intent intent) {
        BillingServiceController billingServiceController = this._serviceController;
        if (billingServiceController != null) {
            billingServiceController.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onConfigurationChanged(Configuration configuration) {
        BillingServiceController billingServiceController = this._serviceController;
        if (billingServiceController != null) {
            billingServiceController.onConfigurationChanged(configuration);
        }
    }
}
