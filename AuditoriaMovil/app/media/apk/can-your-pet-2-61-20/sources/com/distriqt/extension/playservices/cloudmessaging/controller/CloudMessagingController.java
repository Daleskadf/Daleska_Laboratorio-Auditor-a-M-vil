package com.distriqt.extension.playservices.cloudmessaging.controller;

import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
/* loaded from: classes.dex */
public class CloudMessagingController extends ActivityStateListener {
    public static final String TAG = "CloudMessagingController";
    private IExtensionContext _extContext;

    public void dispose() {
    }

    public CloudMessagingController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }
}
