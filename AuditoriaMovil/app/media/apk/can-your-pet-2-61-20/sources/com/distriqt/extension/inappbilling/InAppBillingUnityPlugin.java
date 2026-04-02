package com.distriqt.extension.inappbilling;

import android.app.Activity;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.inappbilling.controller.InAppBillingController;
import com.distriqt.extension.inappbilling.utils.Logger;
import com.unity3d.player.UnityPlayer;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class InAppBillingUnityPlugin implements IExtensionContext {
    private static final String TAG = "InAppBillingUnityPlugin";
    private static InAppBillingUnityPlugin _instance;
    private InAppBillingController _controller = null;

    public static InAppBillingUnityPlugin instance() {
        if (_instance == null) {
            InAppBillingUnityPlugin inAppBillingUnityPlugin = new InAppBillingUnityPlugin();
            _instance = inAppBillingUnityPlugin;
            InAppBilling.context = inAppBillingUnityPlugin;
        }
        return _instance;
    }

    private InAppBillingController controller() {
        if (this._controller == null) {
            this._controller = new InAppBillingController(this);
        }
        return this._controller;
    }

    public InAppBillingUnityPlugin() {
        controller();
    }

    public static boolean isSupported() {
        Logger.d(TAG, "isSupported()", new Object[0]);
        return false;
    }

    public String implementation() {
        Logger.d(TAG, "implementation()", new Object[0]);
        return "Android";
    }

    public String version() {
        Logger.d(TAG, "version()", new Object[0]);
        return InAppBilling.VERSION;
    }

    @Override // com.distriqt.core.utils.IExtensionContext
    public void dispatchEvent(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (str == null) {
                str = "";
            }
            jSONObject.put("code", str);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("data", str2);
            UnityPlayer.UnitySendMessage(InAppBilling.ID, "Dispatch", jSONObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.distriqt.core.utils.IExtensionContext
    public Activity getActivity() {
        return UnityPlayer.currentActivity;
    }
}
