package com.distriqt.extension.play.controller;

import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
/* loaded from: classes.dex */
public class playController extends ActivityStateListener {
    public static final String TAG = "playController";
    private IExtensionContext _extContext;

    public void dispose() {
    }

    public playController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }
}
