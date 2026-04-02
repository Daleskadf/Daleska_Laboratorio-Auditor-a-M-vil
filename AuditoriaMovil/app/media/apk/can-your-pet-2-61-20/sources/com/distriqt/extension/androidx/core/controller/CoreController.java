package com.distriqt.extension.androidx.core.controller;

import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
/* loaded from: classes.dex */
public class CoreController extends ActivityStateListener {
    public static final String TAG = "CoreController";
    private IExtensionContext _extContext;

    public void dispose() {
    }

    public CoreController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }
}
