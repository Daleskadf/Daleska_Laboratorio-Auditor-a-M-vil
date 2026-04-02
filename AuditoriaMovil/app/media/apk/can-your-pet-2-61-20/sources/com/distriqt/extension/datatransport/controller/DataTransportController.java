package com.distriqt.extension.datatransport.controller;

import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
/* loaded from: classes.dex */
public class DataTransportController extends ActivityStateListener {
    public static final String TAG = "DataTransportController";
    private IExtensionContext _extContext;

    public void dispose() {
    }

    public DataTransportController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }
}
