package com.distriqt.extension.kotlin;

import android.content.Intent;
import android.content.res.Configuration;
import com.adobe.air.ActivityResultCallback;
import com.adobe.air.AndroidActivityWrapper;
import com.adobe.air.StateChangeCallback;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.kotlin.controller.KotlinController;
import com.distriqt.extension.kotlin.functions.ImplementationFunction;
import com.distriqt.extension.kotlin.functions.IsSupportedFunction;
import com.distriqt.extension.kotlin.functions.VersionFunction;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class KotlinContext extends FREContext implements IExtensionContext, ActivityResultCallback, StateChangeCallback {
    public static final String IMPLEMENTATION = "Android";
    public static final String TAG = "KotlinContext";
    public static final String VERSION = "1.0";
    private AndroidActivityWrapper _aaw;
    private KotlinController _controller = null;

    public KotlinContext() {
        AndroidActivityWrapper GetAndroidActivityWrapper = AndroidActivityWrapper.GetAndroidActivityWrapper();
        this._aaw = GetAndroidActivityWrapper;
        GetAndroidActivityWrapper.addActivityResultListener(this);
        this._aaw.addActivityStateChangeListner(this);
    }

    @Override // com.adobe.fre.FREContext
    public void dispose() {
        AndroidActivityWrapper androidActivityWrapper = this._aaw;
        if (androidActivityWrapper != null) {
            androidActivityWrapper.removeActivityResultListener(this);
            this._aaw.removeActivityStateChangeListner(this);
            this._aaw = null;
        }
        KotlinController kotlinController = this._controller;
        if (kotlinController != null) {
            kotlinController.dispose();
            this._controller = null;
        }
    }

    @Override // com.adobe.fre.FREContext
    public Map<String, FREFunction> getFunctions() {
        HashMap hashMap = new HashMap();
        hashMap.put("isSupported", new IsSupportedFunction());
        hashMap.put("version", new VersionFunction());
        hashMap.put("implementation", new ImplementationFunction());
        return hashMap;
    }

    public KotlinController controller() {
        if (this._controller == null) {
            this._controller = new KotlinController(this);
        }
        return this._controller;
    }

    @Override // com.adobe.air.AndroidActivityWrapper.ActivityResultCallback
    public void onActivityResult(int i, int i2, Intent intent) {
        KotlinController kotlinController = this._controller;
        if (kotlinController != null) {
            kotlinController.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.adobe.air.AndroidActivityWrapper.StateChangeCallback
    public void onActivityStateChanged(AndroidActivityWrapper.ActivityState activityState) {
        if (this._controller != null) {
            switch (AnonymousClass1.$SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[activityState.ordinal()]) {
                case 1:
                    this._controller.onStart();
                    return;
                case 2:
                    this._controller.onStop();
                    return;
                case 3:
                    this._controller.onPause();
                    return;
                case 4:
                    this._controller.onRestart();
                    return;
                case 5:
                    this._controller.onDestroy();
                    return;
                case 6:
                    this._controller.onResume();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.distriqt.extension.kotlin.KotlinContext$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState;

        static {
            int[] iArr = new int[AndroidActivityWrapper.ActivityState.values().length];
            $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState = iArr;
            try {
                iArr[AndroidActivityWrapper.ActivityState.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[AndroidActivityWrapper.ActivityState.STOPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[AndroidActivityWrapper.ActivityState.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[AndroidActivityWrapper.ActivityState.RESTARTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[AndroidActivityWrapper.ActivityState.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[AndroidActivityWrapper.ActivityState.RESUMED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.adobe.air.AndroidActivityWrapper.StateChangeCallback
    public void onConfigurationChanged(Configuration configuration) {
        this._controller.onConfigurationChanged(configuration);
    }

    @Override // com.distriqt.core.utils.IExtensionContext
    public void dispatchEvent(String str, String str2) {
        try {
            dispatchStatusEventAsync(str, str2);
        } catch (Exception unused) {
        }
    }
}
