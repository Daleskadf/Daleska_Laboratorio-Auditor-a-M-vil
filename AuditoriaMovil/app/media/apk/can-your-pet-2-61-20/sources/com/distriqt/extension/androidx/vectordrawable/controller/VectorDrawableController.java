package com.distriqt.extension.androidx.vectordrawable.controller;

import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
/* loaded from: classes.dex */
public class VectorDrawableController extends ActivityStateListener {
    public static final String TAG = "VectorDrawableController";
    private IExtensionContext _extContext;

    public void dispose() {
    }

    public VectorDrawableController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }
}
