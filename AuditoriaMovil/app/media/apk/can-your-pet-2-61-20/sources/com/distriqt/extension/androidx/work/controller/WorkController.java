package com.distriqt.extension.androidx.work.controller;

import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
/* loaded from: classes.dex */
public class WorkController extends ActivityStateListener {
    public static final String TAG = "WorkController";
    private IExtensionContext _extContext;

    public void dispose() {
    }

    public WorkController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }
}
