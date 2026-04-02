package com.distriqt.core.auth.impl;

import android.os.Build;
import androidx.core.app.ActivityCompat;
import com.adobe.air.AndroidActivityWrapper;
import com.distriqt.core.auth.AuthorisationRequestListener;
import com.distriqt.core.auth.AuthorisationRequestTypeListener;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.core.utils.LogUtil;
/* loaded from: classes.dex */
public class AuthorisationWithAIRCallback extends AuthorisationBase {
    public static final String TAG = "AuthorisationWithAIRCallback";
    private AndroidActivityWrapper _aaw;

    public AuthorisationWithAIRCallback(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
        try {
            this._aaw = AndroidActivityWrapper.GetAndroidActivityWrapper();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public AuthorisationWithAIRCallback(IExtensionContext iExtensionContext, AuthorisationRequestTypeListener authorisationRequestTypeListener) {
        this._extContext = iExtensionContext;
        this._listener = authorisationRequestTypeListener;
        try {
            this._aaw = AndroidActivityWrapper.GetAndroidActivityWrapper();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public AuthorisationWithAIRCallback(IExtensionContext iExtensionContext, AuthorisationRequestListener authorisationRequestListener) {
        this._extContext = iExtensionContext;
        this._listener = authorisationRequestListener;
        try {
            this._aaw = AndroidActivityWrapper.GetAndroidActivityWrapper();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.distriqt.core.auth.impl.AuthorisationBase
    public boolean requestPermissions(String[] strArr, final String str) {
        LogUtil.d("com.distriqt.corelibraries", TAG, "requestPermissions(): use AIR callback", new Object[0]);
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                this._aaw.addRequestPermissionsResultListener(new AndroidActivityWrapper.RequestPermissionsResultCallback() { // from class: com.distriqt.core.auth.impl.AuthorisationWithAIRCallback.1
                    @Override // com.adobe.air.AndroidActivityWrapper.RequestPermissionsResultCallback
                    public void onRequestPermissionsResult(int i, String[] strArr2, int[] iArr) {
                        AuthorisationWithAIRCallback.this._aaw.removeRequestPermissionsResultListener(this);
                        AuthorisationWithAIRCallback.this.onRequestPermissionsResult(i, strArr2, iArr, str);
                    }
                });
                ActivityCompat.requestPermissions(this._extContext.getActivity(), strArr, 11);
                return true;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
