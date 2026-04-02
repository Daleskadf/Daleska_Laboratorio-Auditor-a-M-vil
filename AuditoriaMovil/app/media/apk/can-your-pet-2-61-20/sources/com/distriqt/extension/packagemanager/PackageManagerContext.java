package com.distriqt.extension.packagemanager;

import android.content.Intent;
import android.content.res.Configuration;
import com.adobe.air.ActivityResultCallback;
import com.adobe.air.AndroidActivityWrapper;
import com.adobe.air.StateChangeCallback;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.packagemanager.controller.PackageManagerController;
import com.distriqt.extension.packagemanager.functions.AddEventListenerFunction;
import com.distriqt.extension.packagemanager.functions.CanRequestApplicationInstallsFunction;
import com.distriqt.extension.packagemanager.functions.GetInstalledApplicationsAsyncFunction;
import com.distriqt.extension.packagemanager.functions.GetInstalledApplicationsFunction;
import com.distriqt.extension.packagemanager.functions.GetInstallerPackageNameFunction;
import com.distriqt.extension.packagemanager.functions.GetPackageInfoFunction;
import com.distriqt.extension.packagemanager.functions.ImplementationFunction;
import com.distriqt.extension.packagemanager.functions.InstallApplicationFunction;
import com.distriqt.extension.packagemanager.functions.IsSupportedFunction;
import com.distriqt.extension.packagemanager.functions.KillProcessFunction;
import com.distriqt.extension.packagemanager.functions.ShowManageUnknownAppSourcesSettingsFunction;
import com.distriqt.extension.packagemanager.functions.ValidateSignatureFunction;
import com.distriqt.extension.packagemanager.functions.VersionFunction;
import com.distriqt.extension.packagemanager.functions.WasInstalledFromPlayStoreFunction;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class PackageManagerContext extends FREContext implements IExtensionContext, ActivityResultCallback, StateChangeCallback {
    public static final String TAG = "PackageManagerContext";
    private AndroidActivityWrapper _aaw;
    public boolean v = true;
    private PackageManagerController _controller = null;

    @Override // com.adobe.air.AndroidActivityWrapper.StateChangeCallback
    public void onConfigurationChanged(Configuration configuration) {
    }

    public PackageManagerContext() {
        AndroidActivityWrapper GetAndroidActivityWrapper = AndroidActivityWrapper.GetAndroidActivityWrapper();
        this._aaw = GetAndroidActivityWrapper;
        GetAndroidActivityWrapper.addActivityResultListener(this);
        this._aaw.addActivityStateChangeListner(this);
    }

    @Override // com.adobe.fre.FREContext
    public void dispose() {
        PackageManagerController packageManagerController = this._controller;
        if (packageManagerController != null) {
            packageManagerController.dispose();
            this._controller = null;
        }
        AndroidActivityWrapper androidActivityWrapper = this._aaw;
        if (androidActivityWrapper != null) {
            androidActivityWrapper.removeActivityResultListener(this);
            this._aaw.removeActivityStateChangeListner(this);
            this._aaw = null;
        }
    }

    @Override // com.adobe.fre.FREContext
    public Map<String, FREFunction> getFunctions() {
        HashMap hashMap = new HashMap();
        hashMap.put("isSupported", new IsSupportedFunction());
        hashMap.put("version", new VersionFunction());
        hashMap.put("implementation", new ImplementationFunction());
        hashMap.put("addEventListener", new AddEventListenerFunction());
        hashMap.put("getInstalledApplications", new GetInstalledApplicationsFunction());
        hashMap.put("getInstalledApplicationsAsync", new GetInstalledApplicationsAsyncFunction());
        hashMap.put("getPackageInfo", new GetPackageInfoFunction());
        hashMap.put("getInstallerPackageName", new GetInstallerPackageNameFunction());
        hashMap.put("wasInstalledFromPlayStore", new WasInstalledFromPlayStoreFunction());
        hashMap.put("validateSignature", new ValidateSignatureFunction());
        hashMap.put("canRequestApplicationInstalls", new CanRequestApplicationInstallsFunction());
        hashMap.put("showManageUnknownAppSourcesSettings", new ShowManageUnknownAppSourcesSettingsFunction());
        hashMap.put("installApplication", new InstallApplicationFunction());
        hashMap.put("killProcess", new KillProcessFunction());
        return hashMap;
    }

    public PackageManagerController controller() {
        if (this._controller == null) {
            this._controller = new PackageManagerController(this);
        }
        return this._controller;
    }

    @Override // com.adobe.air.AndroidActivityWrapper.ActivityResultCallback
    public void onActivityResult(int i, int i2, Intent intent) {
        PackageManagerController packageManagerController = this._controller;
        if (packageManagerController != null) {
            packageManagerController.onActivityResult(i, i2, intent);
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

    /* renamed from: com.distriqt.extension.packagemanager.PackageManagerContext$1  reason: invalid class name */
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

    @Override // com.distriqt.core.utils.IExtensionContext
    public void dispatchEvent(String str, String str2) {
        try {
            dispatchStatusEventAsync(str, str2);
        } catch (Exception unused) {
        }
    }
}
