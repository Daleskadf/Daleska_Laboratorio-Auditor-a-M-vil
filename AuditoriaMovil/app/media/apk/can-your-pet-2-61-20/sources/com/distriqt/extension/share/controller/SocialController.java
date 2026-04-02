package com.distriqt.extension.share.controller;

import android.content.pm.PackageManager;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.share.utils.Logger;
/* loaded from: classes.dex */
public class SocialController {
    public static final String TAG = "SocialController";
    private IExtensionContext _extContext;

    public void dispose() {
    }

    public SocialController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }

    public boolean isNetworkSupported(String str) {
        Logger.d(TAG, "isNetworkSupported( %s )", str);
        try {
            this._extContext.getActivity().getPackageManager().getPackageInfo(applicationPackageFromNetwork(str), 1);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public boolean sharePost(SocialPost socialPost, String str) {
        Logger.d(TAG, "sharePost( %s, %s )", socialPost.text, str);
        isNetworkSupported(str);
        return false;
    }

    public String applicationPackageFromNetwork(String str) {
        return str.equals("facebook") ? "com.facebook.katana" : str.equals("twitter") ? "com.twitter.android" : "";
    }
}
