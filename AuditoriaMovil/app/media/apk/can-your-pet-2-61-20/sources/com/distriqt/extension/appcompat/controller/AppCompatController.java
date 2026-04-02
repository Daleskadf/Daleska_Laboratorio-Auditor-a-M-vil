package com.distriqt.extension.appcompat.controller;

import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
/* loaded from: classes.dex */
public class AppCompatController extends ActivityStateListener {
    public static final String TAG = "AppCompatController";
    private IExtensionContext _extContext;

    public void dispose() {
    }

    public AppCompatController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }
}
