package com.distriqt.extension.inappbilling;

import android.content.Intent;
import android.content.res.Configuration;
import com.adobe.air.ActivityResultCallback;
import com.adobe.air.AndroidActivityWrapper;
import com.adobe.air.StateChangeCallback;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.inappbilling.controller.InAppBillingController;
import com.distriqt.extension.inappbilling.functions.ActiveProductIdsFunction;
import com.distriqt.extension.inappbilling.functions.ActiveProductsFunction;
import com.distriqt.extension.inappbilling.functions.CanMakePaymentsFunction;
import com.distriqt.extension.inappbilling.functions.CheckAvailabilityFunction;
import com.distriqt.extension.inappbilling.functions.CleanupFunction;
import com.distriqt.extension.inappbilling.functions.GetProductsFunction;
import com.distriqt.extension.inappbilling.functions.GetUserDataFunction;
import com.distriqt.extension.inappbilling.functions.ImplementationFunction;
import com.distriqt.extension.inappbilling.functions.IsProductOverlaySupportedFunction;
import com.distriqt.extension.inappbilling.functions.IsProductViewSupportedFunction;
import com.distriqt.extension.inappbilling.functions.IsServiceSupportedFunction;
import com.distriqt.extension.inappbilling.functions.IsSupportedFunction;
import com.distriqt.extension.inappbilling.functions.SetupFunction;
import com.distriqt.extension.inappbilling.functions.ShowProductOverlayFunction;
import com.distriqt.extension.inappbilling.functions.ShowProductViewFunction;
import com.distriqt.extension.inappbilling.functions.VersionFunction;
import com.distriqt.extension.inappbilling.functions.applicationreceipt.GetAppReceiptFunction;
import com.distriqt.extension.inappbilling.functions.applicationreceipt.RefreshFunction;
import com.distriqt.extension.inappbilling.functions.purchases.ChangePurchaseFunction;
import com.distriqt.extension.inappbilling.functions.purchases.ConsumePurchaseFunction;
import com.distriqt.extension.inappbilling.functions.purchases.FinishPurchaseFunction;
import com.distriqt.extension.inappbilling.functions.purchases.GetPendingPurchasesFunction;
import com.distriqt.extension.inappbilling.functions.purchases.GetPurchasesFunction;
import com.distriqt.extension.inappbilling.functions.purchases.IsChangePurchaseSupportedFunction;
import com.distriqt.extension.inappbilling.functions.purchases.IsGetPurchasesSupportedFunction;
import com.distriqt.extension.inappbilling.functions.purchases.MakePurchaseFunction;
import com.distriqt.extension.inappbilling.functions.purchases.RestorePurchasesFunction;
import com.distriqt.extension.inappbilling.functions.purchases.StartDownloadsFunction;
import com.distriqt.extension.inappbilling.functions.updates.CheckAppUpdateFunction;
import com.distriqt.extension.inappbilling.functions.updates.StartAppUpdateFunction;
import com.distriqt.extension.inappbilling.utils.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class InAppBillingContext extends FREContext implements IExtensionContext, StateChangeCallback, ActivityResultCallback {
    private static String TAG = "InAppBillingContext";
    private AndroidActivityWrapper _aaw;
    private InAppBillingController _controller;
    private ArrayList<ActivityStateListener> _stateListeners;
    public boolean v = true;

    public InAppBillingContext() {
        AndroidActivityWrapper GetAndroidActivityWrapper = AndroidActivityWrapper.GetAndroidActivityWrapper();
        this._aaw = GetAndroidActivityWrapper;
        GetAndroidActivityWrapper.addActivityResultListener(this);
        this._aaw.addActivityStateChangeListner(this);
        this._stateListeners = new ArrayList<>();
    }

    @Override // com.adobe.fre.FREContext
    public void dispose() {
        AndroidActivityWrapper androidActivityWrapper = this._aaw;
        if (androidActivityWrapper != null) {
            androidActivityWrapper.removeActivityResultListener(this);
            this._aaw.removeActivityStateChangeListner(this);
            this._aaw = null;
        }
        InAppBillingController inAppBillingController = this._controller;
        if (inAppBillingController != null) {
            inAppBillingController.dispose();
            this._controller = null;
        }
        this._stateListeners.clear();
    }

    @Override // com.adobe.fre.FREContext
    public Map<String, FREFunction> getFunctions() {
        HashMap hashMap = new HashMap();
        hashMap.put("isSupported", new IsSupportedFunction());
        hashMap.put("version", new VersionFunction());
        hashMap.put("implementation", new ImplementationFunction());
        hashMap.put("isServiceSupported", new IsServiceSupportedFunction());
        hashMap.put("setup", new SetupFunction());
        hashMap.put("canMakePayments", new CanMakePaymentsFunction());
        hashMap.put("checkAvailability", new CheckAvailabilityFunction());
        hashMap.put("cleanup", new CleanupFunction());
        hashMap.put("getProducts", new GetProductsFunction());
        hashMap.put("activeProducts", new ActiveProductsFunction());
        hashMap.put("activeProductIds", new ActiveProductIdsFunction());
        hashMap.put("isProductViewSupported", new IsProductViewSupportedFunction());
        hashMap.put("showProductView", new ShowProductViewFunction());
        hashMap.put("isProductOverlaySupported", new IsProductOverlaySupportedFunction());
        hashMap.put("showProductOverlay", new ShowProductOverlayFunction());
        hashMap.put("applicationReceipt_isSupported", new com.distriqt.extension.inappbilling.functions.applicationreceipt.IsSupportedFunction());
        hashMap.put("applicationReceipt_getAppReceipt", new GetAppReceiptFunction());
        hashMap.put("applicationReceipt_refresh", new RefreshFunction());
        hashMap.put("makePurchase", new MakePurchaseFunction());
        hashMap.put("finishPurchase", new FinishPurchaseFunction());
        hashMap.put("consumePurchase", new ConsumePurchaseFunction());
        hashMap.put("isChangePurchaseSupported", new IsChangePurchaseSupportedFunction());
        hashMap.put("changePurchase", new ChangePurchaseFunction());
        hashMap.put("isGetPurchasesSupported", new IsGetPurchasesSupportedFunction());
        hashMap.put("getPurchases", new GetPurchasesFunction());
        hashMap.put("restorePurchases", new RestorePurchasesFunction());
        hashMap.put("getPendingPurchases", new GetPendingPurchasesFunction());
        hashMap.put("startDownloads", new StartDownloadsFunction());
        hashMap.put("getUserData", new GetUserDataFunction());
        hashMap.put("inAppUpdates_isSupported", new com.distriqt.extension.inappbilling.functions.updates.IsSupportedFunction());
        hashMap.put("inAppUpdates_checkAppUpdate", new CheckAppUpdateFunction());
        hashMap.put("inAppUpdates_startAppUpdate", new StartAppUpdateFunction());
        return hashMap;
    }

    public InAppBillingController controller() {
        if (this._controller == null) {
            InAppBillingController inAppBillingController = new InAppBillingController(this);
            this._controller = inAppBillingController;
            this._stateListeners.add(inAppBillingController);
        }
        return this._controller;
    }

    public void cleanup() {
        InAppBillingController inAppBillingController = this._controller;
        if (inAppBillingController != null) {
            this._stateListeners.remove(inAppBillingController);
            this._controller.dispose();
            this._controller = null;
        }
    }

    @Override // com.adobe.air.AndroidActivityWrapper.ActivityResultCallback
    public void onActivityResult(int i, int i2, Intent intent) {
        Logger.d(TAG, "onActivityResult( %d, %d, ... )", Integer.valueOf(i), Integer.valueOf(i2));
        Iterator<ActivityStateListener> it = this._stateListeners.iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(i, i2, intent);
        }
    }

    @Override // com.adobe.air.AndroidActivityWrapper.StateChangeCallback
    public void onActivityStateChanged(AndroidActivityWrapper.ActivityState activityState) {
        Logger.d(TAG, "onActivityStateChanged( %s ) %s", activityState.name(), getActivity().getIntent().getAction());
        Iterator<ActivityStateListener> it = this._stateListeners.iterator();
        while (it.hasNext()) {
            ActivityStateListener next = it.next();
            switch (AnonymousClass1.$SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[activityState.ordinal()]) {
                case 1:
                    next.onStart();
                    break;
                case 2:
                    next.onStop();
                    break;
                case 3:
                    next.onPause();
                    break;
                case 4:
                    next.onRestart();
                    break;
                case 5:
                    next.onDestroy();
                    break;
                case 6:
                    next.onResume();
                    break;
            }
        }
    }

    /* renamed from: com.distriqt.extension.inappbilling.InAppBillingContext$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState;

        static {
            int[] iArr = new int[AndroidActivityWrapper.ActivityState.values().length];
            $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState = iArr;
            try {
                iArr[AndroidActivityWrapper.ActivityState.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[AndroidActivityWrapper.ActivityState.STOPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[AndroidActivityWrapper.ActivityState.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[AndroidActivityWrapper.ActivityState.RESTARTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[AndroidActivityWrapper.ActivityState.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[AndroidActivityWrapper.ActivityState.RESUMED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.adobe.air.AndroidActivityWrapper.StateChangeCallback
    public void onConfigurationChanged(Configuration configuration) {
        Logger.d(TAG, "onConfigurationChanged( ... )", new Object[0]);
        Iterator<ActivityStateListener> it = this._stateListeners.iterator();
        while (it.hasNext()) {
            it.next().onConfigurationChanged(configuration);
        }
    }

    @Override // com.distriqt.core.utils.IExtensionContext
    public void dispatchEvent(String str, String str2) {
        try {
            dispatchStatusEventAsync(str, str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
