package com.distriqt.extension.androidx.core;

import android.content.Intent;
import android.content.res.Configuration;
import com.adobe.air.ActivityResultCallback;
import com.adobe.air.AndroidActivityWrapper;
import com.adobe.air.StateChangeCallback;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.androidx.core.controller.CoreController;
import com.distriqt.extension.androidx.core.functions.ImplementationFunction;
import com.distriqt.extension.androidx.core.functions.IsSupportedFunction;
import com.distriqt.extension.androidx.core.functions.VersionFunction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class CoreContext extends FREContext implements IExtensionContext, ActivityResultCallback, StateChangeCallback {
    public static final String IMPLEMENTATION = "Android";
    public static final String VERSION = "1.0";
    private AndroidActivityWrapper _aaw;
    private CoreController _controller;
    private ArrayList<ActivityStateListener> _stateListeners;
    public boolean v = false;

    public CoreContext() {
        AndroidActivityWrapper GetAndroidActivityWrapper = AndroidActivityWrapper.GetAndroidActivityWrapper();
        this._aaw = GetAndroidActivityWrapper;
        GetAndroidActivityWrapper.addActivityResultListener(this);
        this._aaw.addActivityStateChangeListner(this);
        this._stateListeners = new ArrayList<>();
    }

    @Override // com.adobe.fre.FREContext
    public void dispose() {
        AndroidActivityWrapper androidActivityWrapper = this._aaw;
        if (androidActivityWrapper != null) {
            androidActivityWrapper.removeActivityResultListener(this);
            this._aaw.removeActivityStateChangeListner(this);
            this._aaw = null;
        }
        CoreController coreController = this._controller;
        if (coreController != null) {
            coreController.dispose();
            this._controller = null;
        }
        this._stateListeners.clear();
    }

    @Override // com.adobe.fre.FREContext
    public Map<String, FREFunction> getFunctions() {
        HashMap hashMap = new HashMap();
        hashMap.put("isSupported", new IsSupportedFunction());
        hashMap.put("version", new VersionFunction());
        hashMap.put("implementation", new ImplementationFunction());
        return hashMap;
    }

    public CoreController controller() {
        if (this._controller == null) {
            CoreController coreController = new CoreController(this);
            this._controller = coreController;
            addStateListener(coreController);
        }
        return this._controller;
    }

    public void addStateListener(ActivityStateListener activityStateListener) {
        this._stateListeners.add(activityStateListener);
    }

    @Override // com.adobe.air.AndroidActivityWrapper.ActivityResultCallback
    public void onActivityResult(int i, int i2, Intent intent) {
        Iterator<ActivityStateListener> it = this._stateListeners.iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(i, i2, intent);
        }
    }

    @Override // com.adobe.air.AndroidActivityWrapper.StateChangeCallback
    public void onActivityStateChanged(AndroidActivityWrapper.ActivityState activityState) {
        Iterator<ActivityStateListener> it = this._stateListeners.iterator();
        while (it.hasNext()) {
            ActivityStateListener next = it.next();
            switch (AnonymousClass1.$SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[activityState.ordinal()]) {
                case 1:
                    next.onStart();
                    break;
                case 2:
                    next.onStop();
                    break;
                case 3:
                    next.onPause();
                    break;
                case 4:
                    next.onRestart();
                    break;
                case 5:
                    next.onDestroy();
                    break;
                case 6:
                    next.onResume();
                    break;
            }
        }
    }

    /* renamed from: com.distriqt.extension.androidx.core.CoreContext$1  reason: invalid class name */
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
        Iterator<ActivityStateListener> it = this._stateListeners.iterator();
        while (it.hasNext()) {
            it.next().onConfigurationChanged(configuration);
        }
    }

    @Override // com.distriqt.core.utils.IExtensionContext
    public void dispatchEvent(String str, String str2) {
        try {
            dispatchStatusEventAsync(str, str2);
        } catch (Exception unused) {
        }
    }
}
