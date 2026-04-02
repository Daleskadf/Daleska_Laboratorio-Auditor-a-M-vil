package com.distriqt.extension.gson.controller;

import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
/* loaded from: classes.dex */
public class GSONController extends ActivityStateListener {
    public static final String TAG = "GSONController";
    private IExtensionContext _extContext;

    public void dispose() {
    }

    public GSONController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }
}
