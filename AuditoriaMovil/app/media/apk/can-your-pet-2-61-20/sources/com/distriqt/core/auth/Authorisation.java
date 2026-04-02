package com.distriqt.core.auth;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.distriqt.core.auth.impl.AuthorisationBase;
import com.distriqt.core.auth.impl.AuthorisationWithAIRCallback;
import com.distriqt.core.auth.impl.AuthorisationWithActivity;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.core.utils.LogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class Authorisation {
    public static final int PERMISSIONS_REQUEST = 11;
    private static final String TAG = "Authorisation";
    private AuthorisationBase _authorisation;
    private IExtensionContext _extContext;
    private AuthorisationRequestListener _listener;

    public Authorisation(IExtensionContext iExtensionContext) {
        this._listener = null;
        this._authorisation = null;
        this._extContext = iExtensionContext;
        try {
            Class.forName("com.adobe.air.AndroidActivityWrapper$RequestPermissionsResultCallback");
            this._authorisation = new AuthorisationWithAIRCallback(iExtensionContext);
        } catch (ClassNotFoundException e) {
            LogUtil.d("com.distriqt.corelibraries", TAG, "AIR permissions result callback not found", new Object[0]);
            e.printStackTrace();
        }
        if (this._authorisation == null) {
            this._authorisation = new AuthorisationWithActivity(iExtensionContext);
        }
    }

    public Authorisation(IExtensionContext iExtensionContext, AuthorisationRequestTypeListener authorisationRequestTypeListener) {
        this._authorisation = null;
        this._extContext = iExtensionContext;
        this._listener = authorisationRequestTypeListener;
        try {
            Class.forName("com.adobe.air.AndroidActivityWrapper$RequestPermissionsResultCallback");
            this._authorisation = new AuthorisationWithAIRCallback(iExtensionContext, authorisationRequestTypeListener);
        } catch (ClassNotFoundException e) {
            LogUtil.d("com.distriqt.corelibraries", TAG, "AIR permissions result callback not found", new Object[0]);
            e.printStackTrace();
        }
        if (this._authorisation == null) {
            this._authorisation = new AuthorisationWithActivity(iExtensionContext, authorisationRequestTypeListener);
        }
    }

    public Authorisation(IExtensionContext iExtensionContext, AuthorisationRequestListener authorisationRequestListener) {
        this._authorisation = null;
        this._extContext = iExtensionContext;
        this._listener = authorisationRequestListener;
        try {
            Class.forName("com.adobe.air.AndroidActivityWrapper$RequestPermissionsResultCallback");
            this._authorisation = new AuthorisationWithAIRCallback(iExtensionContext, authorisationRequestListener);
        } catch (ClassNotFoundException e) {
            LogUtil.d("com.distriqt.corelibraries", TAG, "New permissions result callback not found", new Object[0]);
            e.printStackTrace();
        }
        if (this._authorisation == null) {
            this._authorisation = new AuthorisationWithActivity(iExtensionContext, authorisationRequestListener);
        }
    }

    public static String[] filterOptionalPermissionsFromManifest(Context context, List<String> list, List<String> list2) {
        ArrayList arrayList = new ArrayList(list);
        if (list2 != null) {
            try {
                if (list2.size() > 0) {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                    for (String str : list2) {
                        for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                            if (str.equals(packageInfo.requestedPermissions[i])) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (String[]) Arrays.copyOf(arrayList.toArray(), arrayList.size(), String[].class);
    }

    public boolean hasPermissions(String[] strArr) {
        LogUtil.d("com.distriqt.corelibraries", TAG, "hasPermissions()", new Object[0]);
        boolean z = true;
        for (String str : strArr) {
            if (!hasPermission(str)) {
                z = false;
            }
        }
        return z;
    }

    public boolean hasPermission(String str) {
        boolean z = Build.VERSION.SDK_INT < 23 ? this._extContext.getActivity().checkCallingOrSelfPermission(str) == 0 : ContextCompat.checkSelfPermission(this._extContext.getActivity(), str) == 0;
        String str2 = TAG;
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = z ? "true" : "false";
        LogUtil.d("com.distriqt.corelibraries", str2, "hasPermission( %s )=%s", objArr);
        return z;
    }

    public boolean requestPermissions(String[] strArr) {
        return requestPermissions(strArr, null);
    }

    public boolean requestPermissions(String[] strArr, String str) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                AuthorisationBase authorisationBase = this._authorisation;
                if (authorisationBase == null) {
                    return false;
                }
                return authorisationBase.requestPermissions(strArr, str);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean shouldExplainPermissions(String[] strArr) {
        LogUtil.d("com.distriqt.corelibraries", TAG, "shouldExplainPermissions()", new Object[0]);
        boolean z = false;
        for (String str : strArr) {
            if (shouldExplainPermission(str)) {
                z = true;
            }
        }
        return z;
    }

    public boolean shouldExplainPermission(String str) {
        LogUtil.d("com.distriqt.corelibraries", TAG, "shouldExplainPermission( %s )", str);
        return ActivityCompat.shouldShowRequestPermissionRationale(this._extContext.getActivity(), str);
    }
}
