package com.distriqt.core.auth.impl;

import androidx.core.app.ActivityCompat;
import com.distriqt.core.auth.AuthorisationRequestListener;
import com.distriqt.core.auth.AuthorisationRequestTypeListener;
import com.distriqt.core.auth.AuthorisationStatus;
import com.distriqt.core.auth.events.AuthorisationEvent;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.core.utils.LogUtil;
/* loaded from: classes.dex */
public class AuthorisationBase {
    public static final String TAG = "AuthorisationBase";
    protected IExtensionContext _extContext = null;
    protected AuthorisationRequestListener _listener = null;

    public boolean requestPermissions(String[] strArr, String str) {
        return false;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr, String str) {
        String str2 = TAG;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(iArr.length);
        objArr[2] = str == null ? "null" : str;
        LogUtil.d("com.distriqt.corelibraries", str2, "onRequestPermissionsResult( %d, [%d], %s )", objArr);
        if (11 == i) {
            AuthorisationRequestListener authorisationRequestListener = this._listener;
            if (authorisationRequestListener != null) {
                if (authorisationRequestListener instanceof AuthorisationRequestTypeListener) {
                    ((AuthorisationRequestTypeListener) authorisationRequestListener).authorisationChangedWithType(strArr, iArr, str);
                }
                this._listener.authorisationChanged(strArr, iArr);
                return;
            }
            IExtensionContext iExtensionContext = this._extContext;
            if (iExtensionContext != null) {
                iExtensionContext.dispatchEvent(AuthorisationEvent.COMPLETE, AuthorisationEvent.formatForEvent(null, str));
                if (iArr.length == 0) {
                    return;
                }
                String str3 = AuthorisationStatus.AUTHORISED;
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    LogUtil.d("com.distriqt.corelibraries", TAG, "%s=%d", strArr[i2], Integer.valueOf(iArr[i2]));
                    if (iArr[i2] != 0) {
                        str3 = (str3.equals(AuthorisationStatus.DENIED) || !ActivityCompat.shouldShowRequestPermissionRationale(this._extContext.getActivity(), strArr[i2])) ? AuthorisationStatus.DENIED : AuthorisationStatus.SHOULD_EXPLAIN;
                    }
                }
                this._extContext.dispatchEvent(AuthorisationEvent.CHANGED, AuthorisationEvent.formatForEvent(str3, str));
            }
        }
    }
}
