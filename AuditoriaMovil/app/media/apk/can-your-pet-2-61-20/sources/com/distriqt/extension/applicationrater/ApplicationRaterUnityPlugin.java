package com.distriqt.extension.applicationrater;

import android.app.Activity;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.applicationrater.controller.ApplicationRaterController;
import com.distriqt.extension.applicationrater.controller.ReviewControllerSupport;
import com.unity3d.player.UnityPlayer;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ApplicationRaterUnityPlugin implements IExtensionContext {
    private static final String TAG = "ApplicationRaterUnityPlugin";
    private static ApplicationRaterUnityPlugin _instance;
    private ApplicationRaterController _controller = null;

    public static boolean isSupported() {
        return true;
    }

    public String implementation() {
        return "Android";
    }

    public String version() {
        return ApplicationRater.VERSION;
    }

    public static ApplicationRaterUnityPlugin instance() {
        if (_instance == null) {
            _instance = new ApplicationRaterUnityPlugin();
        }
        return _instance;
    }

    public ApplicationRaterController controller() {
        if (this._controller == null) {
            this._controller = new ApplicationRaterController(this);
        }
        return this._controller;
    }

    public ApplicationRaterUnityPlugin() {
        controller();
    }

    public void showRateDialog(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        try {
            this._controller.showRateDialog(str, str2, str3, str4, str5, str6, str7, str8);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void retrieveApplicationId() {
        try {
            this._controller.retrieveApplicationId();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void rate(String str, String str2) {
        try {
            this._controller.rate(str, str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getInstallerStore() {
        try {
            return this._controller.getInstallerStore();
        } catch (Exception e) {
            e.printStackTrace();
            return "unknown";
        }
    }

    public boolean review_isSupported() {
        try {
            return ReviewControllerSupport.isSupported(getActivity());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean review_requestReview() {
        try {
            if (review_isSupported()) {
                return this._controller.reviewController().requestReview();
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
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
            UnityPlayer.UnitySendMessage(ApplicationRater.ID, "Dispatch", jSONObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.distriqt.core.utils.IExtensionContext
    public Activity getActivity() {
        return UnityPlayer.currentActivity;
    }
}
