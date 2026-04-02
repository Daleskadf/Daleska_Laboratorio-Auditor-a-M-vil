package com.distriqt.extension.androidx.room.controller;

import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
/* loaded from: classes.dex */
public class RoomController extends ActivityStateListener {
    public static final String TAG = "RoomController";
    private IExtensionContext _extContext;

    public void dispose() {
    }

    public RoomController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }
}
