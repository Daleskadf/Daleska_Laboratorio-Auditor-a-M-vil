package com.distriqt.core.auth.impl;

import android.content.Intent;
import android.os.Build;
import com.distriqt.core.auth.AuthorisationActivity;
import com.distriqt.core.auth.AuthorisationRequestListener;
import com.distriqt.core.auth.AuthorisationRequestTypeListener;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.core.utils.LogUtil;
/* loaded from: classes.dex */
public class AuthorisationWithActivity extends AuthorisationBase {
    public static final String TAG = "AuthorisationWithActivity";

    public AuthorisationWithActivity(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }

    public AuthorisationWithActivity(IExtensionContext iExtensionContext, AuthorisationRequestTypeListener authorisationRequestTypeListener) {
        this._extContext = iExtensionContext;
        this._listener = authorisationRequestTypeListener;
    }

    public AuthorisationWithActivity(IExtensionContext iExtensionContext, AuthorisationRequestListener authorisationRequestListener) {
        this._extContext = iExtensionContext;
        this._listener = authorisationRequestListener;
    }

    @Override // com.distriqt.core.auth.impl.AuthorisationBase
    public boolean requestPermissions(String[] strArr, String str) {
        LogUtil.d("com.distriqt.corelibraries", TAG, "requestPermissions(): use activity", new Object[0]);
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                AuthorisationActivity.authorisation = this;
                Intent intent = new Intent(this._extContext.getActivity(), AuthorisationActivity.class);
                intent.putExtra(AuthorisationActivity.EXTRA_PERMISSIONS, strArr);
                if (str != null) {
                    intent.putExtra(AuthorisationActivity.EXTRA_AUTHTYPE, str);
                }
                this._extContext.getActivity().startActivity(intent);
                return true;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
