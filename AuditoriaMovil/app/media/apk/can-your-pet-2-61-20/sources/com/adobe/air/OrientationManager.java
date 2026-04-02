package com.adobe.air;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Display;
import android.view.OrientationEventListener;
import com.harman.services.AIRRuntimeCheck;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class OrientationManager {
    private static final float AIR_NAMESPACE_VERSION_3_3 = 3.3f;
    private static final float AIR_NAMESPACE_VERSION_3_8 = 3.8f;
    private static final String LOG_TAG = "OrientationManager";
    private static OrientationManager sMgr;
    public int mAfterOrientation;
    public int mBeforeOrientation;
    private float mNamespaceVersion;
    private OrientationEventListener mOrientationEventListner;
    private boolean mFirstCreate = true;
    private int mOrientation = EOrientation.DEFAULT.ordinal();
    private int mDeviceOrientation = EOrientation.UNKNOWN.ordinal();
    private int mOldDeviceOrientation = EOrientation.UNKNOWN.ordinal();
    private int mFinalOrientation = EOrientation.UNKNOWN.ordinal();
    private int mDeviceDefault = EDefault.PORTRAIT.ordinal();
    private boolean mAutoOrients = false;
    private boolean mSetOrientation = false;
    private boolean mIgnoreOrients = false;
    private int mHardKeyboardHidden = 2;
    private Activity m_activity = null;
    private AIRWindowSurfaceView mView = null;
    private int mOsDefaultOrientation = 1;
    private int mOsRotatedRightOrientation = 0;
    private int mOsRotatedLeftOrientation = 8;
    private int mOsReversedOrientation = 9;
    public boolean mDispatchOrientationChangePending = false;
    private int mRequestedAspectRatio = -1;

    /* loaded from: classes.dex */
    public enum EAspectRatio {
        UNKNOWN,
        PORTRAIT,
        LANDSCAPE
    }

    /* loaded from: classes.dex */
    public enum EDefault {
        PORTRAIT,
        LANDSCAPE
    }

    /* loaded from: classes.dex */
    public enum EOrientation {
        UNKNOWN,
        DEFAULT,
        ROTATED_LEFT,
        ROTATED_RIGHT,
        UPSIDE_DOWN
    }

    public native void nativeOrientationChanged(int i, int i2);

    public native boolean nativeOrientationChanging(int i, int i2);

    private OrientationManager() {
    }

    public static OrientationManager getOrientationManager() {
        if (sMgr == null) {
            sMgr = new OrientationManager();
        }
        return sMgr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isReOrientingAllowed() {
        if (this.mNamespaceVersion >= AIR_NAMESPACE_VERSION_3_3) {
            if (this.mAutoOrients) {
                int i = this.mRequestedAspectRatio;
                if (i != -1) {
                    boolean z = this.mFirstCreate;
                    if (i == this.mOsDefaultOrientation) {
                        if (this.mDeviceOrientation == EOrientation.DEFAULT.ordinal() || this.mDeviceOrientation == EOrientation.UPSIDE_DOWN.ordinal()) {
                            return true;
                        }
                    } else if (this.mDeviceOrientation == EOrientation.ROTATED_LEFT.ordinal() || this.mDeviceOrientation == EOrientation.ROTATED_RIGHT.ordinal()) {
                        return true;
                    }
                    return z;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean setSensorBasedOrientation() {
        int i = this.mRequestedAspectRatio;
        boolean z = i != -1;
        if (this.mAutoOrients) {
            if (this.mSetOrientation && this.mNamespaceVersion >= AIR_NAMESPACE_VERSION_3_3) {
                this.mSetOrientation = false;
            }
            if (z && this.mNamespaceVersion >= AIR_NAMESPACE_VERSION_3_3) {
                int i2 = this.mOsDefaultOrientation;
                if (i == i2) {
                    if (this.mDeviceOrientation == EOrientation.DEFAULT.ordinal()) {
                        this.m_activity.setRequestedOrientation(this.mRequestedAspectRatio);
                        return true;
                    } else if (this.mDeviceOrientation == EOrientation.UPSIDE_DOWN.ordinal()) {
                        this.m_activity.setRequestedOrientation(this.mOsReversedOrientation);
                        return true;
                    }
                } else {
                    if (this.mDeviceOrientation == (i2 == 1 ? EOrientation.ROTATED_LEFT : EOrientation.ROTATED_RIGHT).ordinal()) {
                        this.m_activity.setRequestedOrientation(this.mRequestedAspectRatio);
                        return true;
                    } else if (this.mOsDefaultOrientation == 1) {
                        this.m_activity.setRequestedOrientation(8);
                        return true;
                    } else {
                        this.m_activity.setRequestedOrientation(9);
                        return true;
                    }
                }
            } else {
                this.m_activity.setRequestedOrientation(2);
                return true;
            }
        }
        return false;
    }

    public void onActivityCreated(Activity activity, AIRWindowSurfaceView aIRWindowSurfaceView) {
        this.m_activity = activity;
        this.mView = aIRWindowSurfaceView;
        this.mHardKeyboardHidden = activity.getResources().getConfiguration().hardKeyboardHidden;
        if (this.mFirstCreate) {
            setDeviceDefault();
            setOrientationParamsFromMetaData();
        }
        this.mOrientationEventListner = this.mIgnoreOrients ? null : new OrientationEventListener(this.m_activity.getApplicationContext(), 3) { // from class: com.adobe.air.OrientationManager.1
            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int i) {
                if (OrientationManager.this.m_activity == null) {
                    return;
                }
                int ordinal = EOrientation.UNKNOWN.ordinal();
                if (i == -1) {
                    OrientationManager.this.mDeviceOrientation = EOrientation.UNKNOWN.ordinal();
                    ordinal = EOrientation.UNKNOWN.ordinal();
                } else if (i >= 45 && i < 135) {
                    OrientationManager.this.mDeviceOrientation = EOrientation.ROTATED_RIGHT.ordinal();
                    ordinal = EOrientation.ROTATED_LEFT.ordinal();
                } else if (i >= 135 && i < 225) {
                    OrientationManager.this.mDeviceOrientation = EOrientation.UPSIDE_DOWN.ordinal();
                    ordinal = EOrientation.UPSIDE_DOWN.ordinal();
                } else if (i >= 225 && i < 315) {
                    OrientationManager.this.mDeviceOrientation = EOrientation.ROTATED_LEFT.ordinal();
                    ordinal = EOrientation.ROTATED_RIGHT.ordinal();
                } else if ((i >= 0 && i < 45) || (i >= 315 && i < 360)) {
                    OrientationManager.this.mDeviceOrientation = EOrientation.DEFAULT.ordinal();
                    ordinal = EOrientation.DEFAULT.ordinal();
                }
                if (!AndroidActivityWrapper.GetAndroidActivityWrapper().isApplicationLaunched() || !OrientationManager.this.mAutoOrients || OrientationManager.this.mOldDeviceOrientation == OrientationManager.this.mDeviceOrientation || ordinal == EOrientation.UNKNOWN.ordinal() || OrientationManager.this.mOrientation == ordinal) {
                    if (OrientationManager.this.mAutoOrients && OrientationManager.this.mSetOrientation && OrientationManager.this.mOldDeviceOrientation != OrientationManager.this.mDeviceOrientation && OrientationManager.this.mOldDeviceOrientation != EOrientation.UNKNOWN.ordinal() && OrientationManager.this.mDeviceOrientation != EOrientation.UNKNOWN.ordinal() && OrientationManager.this.mNamespaceVersion < OrientationManager.AIR_NAMESPACE_VERSION_3_3) {
                        if (OrientationManager.this.m_activity != null) {
                            OrientationManager.this.m_activity.setRequestedOrientation(2);
                        }
                        OrientationManager.this.mSetOrientation = false;
                    }
                } else {
                    int i2 = Settings.System.getInt(OrientationManager.this.m_activity.getContentResolver(), "accelerometer_rotation", 0);
                    if (OrientationManager.this.m_activity != null && i2 != 0 && OrientationManager.this.isReOrientingAllowed()) {
                        OrientationManager orientationManager = OrientationManager.this;
                        if (!orientationManager.nativeOrientationChanging(orientationManager.mOrientation, ordinal)) {
                            if (OrientationManager.this.setSensorBasedOrientation()) {
                                OrientationManager orientationManager2 = OrientationManager.this;
                                orientationManager2.nativeOrientationChanged(orientationManager2.mOrientation, ordinal);
                                OrientationManager.this.mOrientation = ordinal;
                            }
                        } else {
                            OrientationManager orientationManager3 = OrientationManager.this;
                            orientationManager3.setNearestOrientation(orientationManager3.mOrientation);
                        }
                        OrientationManager orientationManager4 = OrientationManager.this;
                        orientationManager4.mFinalOrientation = orientationManager4.mOrientation;
                    }
                }
                OrientationManager orientationManager5 = OrientationManager.this;
                orientationManager5.mOldDeviceOrientation = orientationManager5.mDeviceOrientation;
            }
        };
        AndroidActivityWrapper GetAndroidActivityWrapper = AndroidActivityWrapper.GetAndroidActivityWrapper();
        if (GetAndroidActivityWrapper.isScreenOn() && !GetAndroidActivityWrapper.isScreenLocked()) {
            if (!this.mFirstCreate) {
                applyLastOrientation();
            }
            this.mOrientation = getCurrentOrientation();
        }
        this.mFirstCreate = false;
    }

    public void onActivityDestroyed() {
        this.m_activity = null;
    }

    public void onActivityResumed() {
        enableEventListener(true);
    }

    public void onActivityPaused() {
        enableEventListener(false);
    }

    public void enableEventListener(boolean z) {
        OrientationEventListener orientationEventListener = this.mOrientationEventListner;
        if (orientationEventListener == null) {
            return;
        }
        if (z) {
            orientationEventListener.enable();
        } else {
            orientationEventListener.disable();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mAfterOrientation = getCurrentOrientation();
        this.mBeforeOrientation = this.mOrientation;
        if (this.mHardKeyboardHidden != configuration.hardKeyboardHidden) {
            this.mHardKeyboardHidden = configuration.hardKeyboardHidden;
            if (this.mAutoOrients && this.mSetOrientation) {
                Activity activity = this.m_activity;
                if (activity != null) {
                    activity.setRequestedOrientation(2);
                }
                this.mSetOrientation = false;
            }
        }
        if (this.mBeforeOrientation != this.mAfterOrientation) {
            if (this.mFinalOrientation == EOrientation.UNKNOWN.ordinal() || this.mAfterOrientation == this.mFinalOrientation) {
                this.mFinalOrientation = EOrientation.UNKNOWN.ordinal();
                this.mOrientation = this.mAfterOrientation;
                if (AndroidActivityWrapper.GetAndroidActivityWrapper().isApplicationLaunched()) {
                    if (this.mView.getVisibleBoundHeight() == this.mView.getVisibleBoundWidth()) {
                        nativeOrientationChanged(this.mBeforeOrientation, this.mAfterOrientation);
                        this.mDispatchOrientationChangePending = false;
                        return;
                    }
                    this.mDispatchOrientationChangePending = true;
                }
            }
        }
    }

    public int getOrientation() {
        int currentOrientation = getCurrentOrientation();
        this.mOrientation = currentOrientation;
        return currentOrientation;
    }

    public int getDeviceOrientation() {
        if (this.mHardKeyboardHidden == 1) {
            if (this.mOsDefaultOrientation == 1) {
                return EOrientation.ROTATED_LEFT.ordinal();
            }
            return EOrientation.DEFAULT.ordinal();
        }
        return this.mDeviceOrientation;
    }

    public void setOrientation(int i) {
        int i2 = this.mOrientation;
        setNearestOrientation(i);
        this.mSetOrientation = true;
        this.mOrientation = getCurrentOrientation();
        int currentOrientation = getCurrentOrientation();
        if (this.mNamespaceVersion < AIR_NAMESPACE_VERSION_3_8 || currentOrientation == i2) {
            return;
        }
        nativeOrientationChanged(i2, currentOrientation);
    }

    public void setNearestOrientation(int i) {
        if (this.m_activity != null) {
            if (i == EOrientation.DEFAULT.ordinal()) {
                this.m_activity.setRequestedOrientation(this.mOsDefaultOrientation);
            } else if (i == EOrientation.ROTATED_LEFT.ordinal()) {
                this.m_activity.setRequestedOrientation(this.mOsRotatedLeftOrientation);
            } else if (i == EOrientation.ROTATED_RIGHT.ordinal()) {
                this.m_activity.setRequestedOrientation(this.mOsRotatedRightOrientation);
            } else if (i == EOrientation.UPSIDE_DOWN.ordinal()) {
                this.m_activity.setRequestedOrientation(this.mOsReversedOrientation);
            }
        }
    }

    public void setAspectRatio(int i) {
        if (this.m_activity != null) {
            if (this.mNamespaceVersion < AIR_NAMESPACE_VERSION_3_3) {
                this.mSetOrientation = true;
            }
            if (i == EAspectRatio.PORTRAIT.ordinal()) {
                this.m_activity.setRequestedOrientation(1);
                this.mRequestedAspectRatio = 1;
            } else if (i == EAspectRatio.LANDSCAPE.ordinal()) {
                this.m_activity.setRequestedOrientation(0);
                this.mRequestedAspectRatio = 0;
            } else {
                this.mRequestedAspectRatio = -1;
                if (this.mAutoOrients) {
                    this.m_activity.setRequestedOrientation(2);
                }
            }
            this.mOrientation = getCurrentOrientation();
        }
    }

    public void setAutoOrients(boolean z) {
        Activity activity = this.m_activity;
        if (activity == null) {
            return;
        }
        this.mAutoOrients = z;
        if (z) {
            if (this.mNamespaceVersion < AIR_NAMESPACE_VERSION_3_3 || this.mRequestedAspectRatio == -1) {
                activity.setRequestedOrientation(2);
                return;
            }
            return;
        }
        activity.setRequestedOrientation(5);
    }

    public boolean getAutoOrients() {
        return this.mAutoOrients;
    }

    public int[] getSupportedOrientations() {
        return new int[]{EOrientation.DEFAULT.ordinal(), EOrientation.ROTATED_LEFT.ordinal(), EOrientation.ROTATED_RIGHT.ordinal(), EOrientation.UPSIDE_DOWN.ordinal()};
    }

    private int getCurrentOrientation() {
        int ordinal = EOrientation.DEFAULT.ordinal();
        Activity activity = this.m_activity;
        if (activity == null) {
            return ordinal;
        }
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return EOrientation.DEFAULT.ordinal();
        }
        if (rotation == 1) {
            return EOrientation.ROTATED_RIGHT.ordinal();
        }
        if (rotation == 2) {
            return EOrientation.UPSIDE_DOWN.ordinal();
        }
        return rotation == 3 ? EOrientation.ROTATED_LEFT.ordinal() : ordinal;
    }

    private void setDeviceDefault() {
        Display defaultDisplay = this.m_activity.getWindow().getWindowManager().getDefaultDisplay();
        int rotation = defaultDisplay.getRotation();
        boolean z = defaultDisplay.getHeight() >= defaultDisplay.getWidth();
        boolean z2 = rotation == 0 || rotation == 2;
        if ((z && z2) || (!z && !z2)) {
            this.mOsDefaultOrientation = 1;
            this.mOsRotatedRightOrientation = 0;
            this.mOsRotatedLeftOrientation = 8;
            this.mOsReversedOrientation = 9;
            return;
        }
        this.mOsDefaultOrientation = 0;
        this.mOsRotatedLeftOrientation = 1;
        this.mOsRotatedRightOrientation = 9;
        this.mOsReversedOrientation = 8;
    }

    private void setOrientationParamsFromMetaData() {
        boolean booleanValue;
        try {
            Bundle bundle = this.m_activity.getPackageManager().getActivityInfo(this.m_activity.getComponentName(), 128).metaData;
            if (bundle == null) {
                return;
            }
            if (AIRRuntimeCheck.shouldDisableSensorAccess()) {
                this.mIgnoreOrients = true;
                return;
            }
            Object obj = bundle.get("autoOrients");
            if (obj instanceof String) {
                String str = (String) obj;
                this.mIgnoreOrients = str.equals("ignore");
                booleanValue = str.equals("true");
            } else {
                booleanValue = obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false;
            }
            String str2 = (String) bundle.get("aspectRatio");
            this.mNamespaceVersion = bundle.getFloat("namespaceVersion");
            if (str2 != null) {
                if (str2.equals("portrait")) {
                    setAspectRatio(EAspectRatio.PORTRAIT.ordinal());
                } else if (str2.equals("landscape")) {
                    setAspectRatio(EAspectRatio.LANDSCAPE.ordinal());
                }
            }
            if (booleanValue) {
                setAutoOrients(true);
            } else if (this.mNamespaceVersion >= AIR_NAMESPACE_VERSION_3_8 && (str2 == null || str2.equals("any"))) {
                setAutoOrients(false);
            } else if (this.mNamespaceVersion > AIR_NAMESPACE_VERSION_3_8 || str2 != null) {
            } else {
                setAutoOrients(false);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private void applyLastOrientation() {
        boolean z = this.mAutoOrients;
        if (!z) {
            if (this.mSetOrientation || (this.mNamespaceVersion >= AIR_NAMESPACE_VERSION_3_3 && this.mRequestedAspectRatio != -1)) {
                setOrientation(this.mOrientation);
            } else {
                setAutoOrients(z);
            }
        } else if (this.mSetOrientation && this.mOldDeviceOrientation == this.mDeviceOrientation && this.mNamespaceVersion >= AIR_NAMESPACE_VERSION_3_3) {
        } else {
            setAutoOrients(z);
            int currentOrientation = getCurrentOrientation();
            this.mAfterOrientation = currentOrientation;
            int i = this.mOrientation;
            this.mBeforeOrientation = i;
            if (i != currentOrientation) {
                if (AndroidActivityWrapper.GetAndroidActivityWrapper().isApplicationLaunched() ? nativeOrientationChanging(this.mBeforeOrientation, this.mAfterOrientation) : false) {
                    setNearestOrientation(this.mBeforeOrientation);
                    return;
                }
                this.mOrientation = this.mAfterOrientation;
                if (AndroidActivityWrapper.GetAndroidActivityWrapper().isApplicationLaunched()) {
                    if (this.mView.getVisibleBoundHeight() == this.mView.getVisibleBoundWidth()) {
                        nativeOrientationChanged(this.mBeforeOrientation, this.mAfterOrientation);
                        this.mDispatchOrientationChangePending = false;
                        return;
                    }
                    this.mDispatchOrientationChangePending = true;
                }
            }
        }
    }
}
