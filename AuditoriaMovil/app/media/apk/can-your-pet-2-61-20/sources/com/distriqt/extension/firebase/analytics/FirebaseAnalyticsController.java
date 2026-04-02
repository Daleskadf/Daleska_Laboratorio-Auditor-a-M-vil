package com.distriqt.extension.firebase.analytics;

import android.os.Bundle;
import com.distriqt.core.utils.DebugUtil;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.firebase.utils.Errors;
import com.distriqt.extension.firebase.utils.Logger;
import com.google.firebase.analytics.FirebaseAnalytics;
/* loaded from: classes.dex */
public class FirebaseAnalyticsController {
    public static final String TAG = "FirebaseAnalyticsController";
    private IExtensionContext _extContext;

    public FirebaseAnalyticsController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }

    public void dispose() {
        this._extContext = null;
    }

    public boolean logEvent(EventObject eventObject) {
        Logger.d(TAG, "logEvent( [%s], %s )", eventObject.name, DebugUtil.bundleToString(eventObject.params));
        try {
            FirebaseAnalytics.getInstance(this._extContext.getActivity().getApplicationContext()).logEvent(eventObject.name, eventObject.params);
        } catch (Throwable th) {
            Errors.handleException(th);
        }
        return true;
    }

    public boolean setAnalyticsCollectionEnabled(boolean z) {
        Logger.d(TAG, "setAnalyticsCollectionEnabled( %b )", Boolean.valueOf(z));
        try {
            FirebaseAnalytics.getInstance(this._extContext.getActivity().getApplicationContext()).setAnalyticsCollectionEnabled(z);
        } catch (Throwable th) {
            Errors.handleException(th);
        }
        return true;
    }

    public boolean setUserID(String str) {
        Logger.d(TAG, "setUserID( %s )", str);
        try {
            FirebaseAnalytics.getInstance(this._extContext.getActivity().getApplicationContext()).setUserId(str);
        } catch (Throwable th) {
            Errors.handleException(th);
        }
        return true;
    }

    public boolean setUserProperty(String str, String str2) {
        Logger.d(TAG, "setUserProperty( %s, %s )", str, str2);
        try {
            FirebaseAnalytics.getInstance(this._extContext.getActivity().getApplicationContext()).setUserProperty(str, str2);
        } catch (Throwable th) {
            Errors.handleException(th);
        }
        return true;
    }

    public boolean setCurrentScreen(String str, String str2) {
        String str3 = TAG;
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = str2 == null ? "null" : str2;
        Logger.d(str3, "setCurrentScreen( %s, %s )", objArr);
        if (str2 != null) {
            try {
                if (str2.length() == 0) {
                    str2 = null;
                }
            } catch (Throwable th) {
                Errors.handleException(th);
            }
        }
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this._extContext.getActivity());
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.SCREEN_NAME, str);
        bundle.putString(FirebaseAnalytics.Param.SCREEN_CLASS, str2);
        firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW, bundle);
        return true;
    }

    public boolean setSessionTimeoutDuration(int i) {
        Logger.d(TAG, "setMinimumSessionDuration( %d )", Integer.valueOf(i));
        try {
            FirebaseAnalytics.getInstance(this._extContext.getActivity().getApplicationContext()).setSessionTimeoutDuration(i);
        } catch (Throwable th) {
            Errors.handleException(th);
        }
        return true;
    }
}
