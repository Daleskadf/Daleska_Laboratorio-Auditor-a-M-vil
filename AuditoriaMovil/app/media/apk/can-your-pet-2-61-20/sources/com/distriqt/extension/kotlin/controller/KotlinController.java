package com.distriqt.extension.kotlin.controller;

import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
/* loaded from: classes.dex */
public class KotlinController extends ActivityStateListener {
    public static final String TAG = "KotlinController";
    private IExtensionContext _extContext;

    public void dispose() {
    }

    public KotlinController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }
}
