package com.distriqt.extension.playservices.appset.controller;

import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.playservices.appset.events.AppSetIdEvent;
import com.distriqt.extension.playservices.appset.utils.Errors;
import com.distriqt.extension.playservices.appset.utils.Logger;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
/* loaded from: classes.dex */
public class AppSetController extends ActivityStateListener {
    public static final String TAG = "AppSetController";
    private IExtensionContext _extContext;

    public void dispose() {
    }

    public boolean isSupported() {
        return true;
    }

    public AppSetController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }

    public void getAppSetIdInfo() {
        Logger.d(TAG, "getAppSetIdInfo()", new Object[0]);
        try {
            Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(this._extContext.getActivity().getApplicationContext()).getAppSetIdInfo();
            appSetIdInfo.addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.distriqt.extension.playservices.appset.controller.AppSetController.1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(AppSetIdInfo appSetIdInfo2) {
                    Logger.d(AppSetController.TAG, "getAppSetIdInfo():onSuccess", new Object[0]);
                    AppSetController.this._extContext.dispatchEvent(AppSetIdEvent.GETAPPSETIDINFO_COMPLETE, AppSetIdEvent.formatForEvent(appSetIdInfo2));
                }
            });
            appSetIdInfo.addOnFailureListener(new OnFailureListener() { // from class: com.distriqt.extension.playservices.appset.controller.AppSetController.2
                @Override // com.google.android.gms.tasks.OnFailureListener
                public void onFailure(Exception exc) {
                    Logger.d(AppSetController.TAG, "getAppSetIdInfo():onFailure", new Object[0]);
                    Errors.handleException(exc);
                }
            });
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }
}
