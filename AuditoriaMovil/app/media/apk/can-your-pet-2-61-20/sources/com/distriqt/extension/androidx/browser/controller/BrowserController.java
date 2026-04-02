package com.distriqt.extension.androidx.browser.controller;

import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
/* loaded from: classes.dex */
public class BrowserController extends ActivityStateListener {
    public static final String TAG = "BrowserController";
    private IExtensionContext _extContext;

    public void dispose() {
    }

    public BrowserController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }
}
