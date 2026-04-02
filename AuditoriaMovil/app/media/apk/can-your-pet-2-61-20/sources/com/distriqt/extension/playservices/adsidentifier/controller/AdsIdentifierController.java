package com.distriqt.extension.playservices.adsidentifier.controller;

import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
/* loaded from: classes.dex */
public class AdsIdentifierController extends ActivityStateListener {
    public static final String TAG = "AdsIdentifierController";
    private IExtensionContext _extContext;

    public void dispose() {
    }

    public AdsIdentifierController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }
}
