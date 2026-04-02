package com.distriqt.extension.androidx.constraintlayout.controller;

import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
/* loaded from: classes.dex */
public class constraintlayoutController extends ActivityStateListener {
    public static final String TAG = "constraintlayoutController";
    private IExtensionContext _extContext;

    public void dispose() {
    }

    public constraintlayoutController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }
}
