package com.distriqt.extension.guava.controller;

import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
/* loaded from: classes.dex */
public class GuavaController extends ActivityStateListener {
    public static final String TAG = "GuavaController";
    private IExtensionContext _extContext;

    public void dispose() {
    }

    public GuavaController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }
}
