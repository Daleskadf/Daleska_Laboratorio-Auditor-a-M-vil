package com.distriqt.core.utils;

import android.content.Intent;
import com.distriqt.core.ActivityStateListener;
/* loaded from: classes.dex */
public interface IActivityResultExtensionContext extends IExtensionContext {
    void registerActivityStateListener(ActivityStateListener activityStateListener);

    void startActivityForResult(Intent intent, int i);

    void unregisterActivityStateListener(ActivityStateListener activityStateListener);
}
