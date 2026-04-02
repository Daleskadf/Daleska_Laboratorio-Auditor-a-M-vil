package com.adobe.air;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.KeyguardManager;
import android.app.UiModeManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.work.WorkRequest;
import com.adobe.air.Entrypoints;
import com.adobe.air.telephony.AndroidTelephonyManager;
import com.adobe.air.utils.Utils;
import com.adobe.flashplayer.HDMIUtils;
import com.adobe.flashruntime.shared.VideoView;
import com.distriqt.core.Core;
import com.harman.air.scout.companion.IscoutAidlInterface;
import com.harman.services.AIRRuntimeCheck;
import java.io.File;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public class AndroidActivityWrapper implements Entrypoints.AsyncEntryHandler {
    private static final String ADOBE_COM = "adobe.com";
    private static final int ASPECT_RATIO_ANY = 3;
    private static final int ASPECT_RATIO_LANDSCAPE = 2;
    private static final int ASPECT_RATIO_PORTRAIT = 1;
    public static final int FILE_CHOOSER_REQUEST_CODE = 7;
    public static final int FILE_MANAGEMENT_REQUEST_CODE = 8;
    public static final int FILE_MANAGEMENT_REQUEST_CODE_DURING_LAUNCH = 9;
    public static final int FILE_STORAGE_REQUEST_CODE = 6;
    public static final int IMAGE_PICKER_REQUEST_CODE = 2;
    private static final int INVOKE_EVENT_OPEN_URL = 1;
    private static final int INVOKE_EVENT_STANDARD = 0;
    public static final int LAUNCH_APP = 1;
    private static final String LOG_TAG = "AndroidActivityWrapper";
    private static final String SCOUT_INTENT_ACTION = "service.ScoutConnection";
    public static final int STILL_PICTURE_REQUEST_CODE = 3;
    private static final String Scout_APP_ID = "com.harman.air.scout.companion";
    public static final int VIDEO_CAPTURE_REQUEST_CODE = 4;
    public static final int WEBVIEW_UPLOAD_FILE_CHOOSER_CODE = 5;
    private static final String WWW_ADOBE_COM = "www.adobe.com";
    private static IscoutAidlInterface iRemoteScoutService = null;
    private static boolean mIsAndroidTV = false;
    private static AndroidActivityWrapper sActivityWrapper = null;
    private static AndroidTelephonyManager sAndroidTelephonyManager = null;
    private static boolean sApplicationLaunched = false;
    private static boolean sDepthAndStencil = false;
    private static Entrypoints sEntryPoint = null;
    private static String sGamePreviewHost = "";
    private static boolean sHasCaptiveRuntime = false;
    private static AndroidIdleState sIdleStateManager = null;
    private static boolean sIsDebugger = false;
    private static boolean sIsSwfPreviewMode = false;
    private static boolean sRuntimeLibrariesLoaded = false;
    ServiceConnection ScoutServiceConnection;
    private KeyguardManager keyGuardManager;
    private Activity m_activity;
    private Application m_application;
    private Lock m_listenerLock;
    private Condition m_newActivityCondition;
    private Lock m_newActivityLock;
    private ConfigDownloadListener mConfigDownloadListener = null;
    private List<ActivityResultCallback> mActivityResultListeners = null;
    private List<RequestPermissionsResultCallback> mRequestPermissionsResultListeners = null;
    private AIRWindowSurfaceView m_mainView = null;
    private SurfaceView m_videoView = null;
    private ImageView m_splashscreenImageView = null;
    private AndroidCameraView m_cameraView = null;
    private FrameLayout m_layout = null;
    private FlashEGL m_flashEGL = null;
    private String mXmlPath = null;
    private String mRootDir = null;
    private String mExtraArgs = null;
    private boolean mIsADL = false;
    private boolean mRGB565Override = false;
    private boolean mIsDebuggerMode = false;
    private int mHardKeyboardHidden = 2;
    private int mHardKeyboardType = 0;
    private boolean mShowDebuggerDialog = false;
    private boolean mDisplayWaitingDialog = false;
    private int debuggerPort = -1;
    private boolean mInvokeEventPendingFromOnCreate = false;
    private boolean mActivateEventPending = false;
    private List<StateChangeCallback> mActivityStateListeners = null;
    private List<InputEventCallback> mInputEventListeners = null;
    private boolean mFullScreenSetFromMetaData = false;
    private boolean mIsFullScreen = false;
    private boolean mContainsVideo = false;
    private String mLibCorePath = null;
    private Context m_runtimeContext = null;
    private int mTargetSdkVersion = 0;
    private List<String> mDeclaredPermissions = null;
    private String mActivePermissionURI = null;
    private RelativeLayout m_overlaysLayout = null;
    private Handler m_uiHandler = null;
    private OrientationManager mOrientationManager = null;
    private boolean mScreenOn = true;
    private DebuggerSettings mDebuggerSettings = new DebuggerSettings();
    private ActivityState mActivityState = ActivityState.STARTED;
    private List<SurfaceView> m_planes = null;
    private int m_planeCascadeStep = 0;
    private boolean m_planeBreakCascade = false;
    private boolean m_planeCascadeInit = false;
    private boolean m_skipKickCascade = true;

    /* loaded from: classes.dex */
    public interface ActivityResultCallback {
        void onActivityResult(int i, int i2, Intent intent);
    }

    /* loaded from: classes.dex */
    public enum ActivityState {
        STARTED,
        RESTARTED,
        RESUMED,
        PAUSED,
        STOPPED,
        DESTROYED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum DebugMode {
        None,
        ConnectMode,
        ListenMode,
        ConflictMode
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface InputEventCallback {
        boolean onGenericMotionEvent(MotionEvent motionEvent);

        boolean onKeyEvent(KeyEvent keyEvent);
    }

    /* loaded from: classes.dex */
    public static class PlaneID {
        public static final int PLANE_CAMERA = 5;
        public static final int PLANE_COUNT = 8;
        public static final int PLANE_FLASH = 3;
        public static final int PLANE_OVERLAY = 2;
        public static final int PLANE_STAGE3D = 6;
        public static final int PLANE_STAGETEXT = 1;
        public static final int PLANE_STAGEVIDEO = 7;
        public static final int PLANE_STAGEVIDEOAUTOMATIC = 4;
        public static final int PLANE_STAGEWEBVIEW = 0;
    }

    /* loaded from: classes.dex */
    public interface RequestPermissionsResultCallback {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface StateChangeCallback {
        void onActivityStateChanged(ActivityState activityState);

        void onConfigurationChanged(Configuration configuration);
    }

    public static boolean isGingerbread() {
        return true;
    }

    public static boolean isHoneycomb() {
        return true;
    }

    public static boolean isIceCreamSandwich() {
        return true;
    }

    public static boolean isJellybean() {
        return true;
    }

    private native void nativeActivateEvent();

    private native void nativeDeactivateEvent();

    private native void nativeLowMemoryEvent();

    private native void nativeNotifyPermissionRequestResult(int i, int i2);

    private native void nativeOnFocusListener(boolean z);

    private native void nativeSendInvokeEventWithData(String str, String str2, int i);

    private native void nativeSetVisible(boolean z);

    public void finishActivityFromChild(Activity activity, int i) {
    }

    public void finishFromChild(Activity activity) {
    }

    public String getScout_APP_ID() {
        return Scout_APP_ID;
    }

    public boolean needsCompositingSurface() {
        return true;
    }

    public void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
    }

    public void onAttachedToWindow() {
    }

    public void onBackPressed() {
    }

    public void onChildTitleChanged(Activity activity, CharSequence charSequence) {
    }

    public void onContentChanged() {
    }

    public boolean onContextItemSelected(MenuItem menuItem, boolean z) {
        return z;
    }

    public void onContextMenuClosed(Menu menu) {
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
    }

    public CharSequence onCreateDescription(CharSequence charSequence) {
        return charSequence;
    }

    public Dialog onCreateDialog(int i, Dialog dialog) {
        return dialog;
    }

    public Dialog onCreateDialog(int i, Bundle bundle, Dialog dialog) {
        return dialog;
    }

    public boolean onCreateOptionsMenu(Menu menu, boolean z) {
        return z;
    }

    public boolean onCreatePanelMenu(int i, Menu menu, boolean z) {
        return z;
    }

    public View onCreatePanelView(int i, View view) {
        return view;
    }

    public boolean onCreateThumbnail(Bitmap bitmap, Canvas canvas, boolean z) {
        return z;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet, View view) {
        return view;
    }

    public void onDetachedFromWindow() {
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent, boolean z) {
        return z;
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent, boolean z) {
        return z;
    }

    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent, boolean z) {
        return z;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent, boolean z) {
        return z;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem, boolean z) {
        return z;
    }

    public boolean onMenuOpened(int i, Menu menu, boolean z) {
        return z;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem, boolean z) {
        return z;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPanelClosed(int i, Menu menu) {
    }

    public void onPostCreate(Bundle bundle) {
    }

    public void onPostResume() {
    }

    public void onPrepareDialog(int i, Dialog dialog) {
    }

    public void onPrepareDialog(int i, Dialog dialog, Bundle bundle) {
    }

    public boolean onPrepareOptionsMenu(Menu menu, boolean z) {
        return z;
    }

    public boolean onPreparePanel(int i, View view, Menu menu, boolean z) {
        return z;
    }

    public void onRestoreInstanceState(Bundle bundle) {
    }

    public Object onRetainNonConfigurationInstance(Object obj) {
        return obj;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public boolean onSearchRequested(boolean z) {
        return z;
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
    }

    public boolean onTouchEvent(MotionEvent motionEvent, boolean z) {
        return z;
    }

    public boolean onTrackballEvent(MotionEvent motionEvent, boolean z) {
        return z;
    }

    public void onUserInteraction() {
    }

    public void onUserLeaveHint() {
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
    }

    public void onWindowFocusChanged(boolean z) {
    }

    public void sendUIMessage(int i) {
        Message.obtain(this.m_uiHandler, i).sendToTarget();
    }

    public void setUpAsyncMode() {
        this.m_uiHandler = new Handler(Looper.getMainLooper()) { // from class: com.adobe.air.AndroidActivityWrapper.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what != 1) {
                    return;
                }
                AndroidActivityWrapper.this.continueLaunch();
            }
        };
    }

    public boolean inAsyncMode() {
        return this.m_uiHandler != null;
    }

    /* loaded from: classes.dex */
    public final class PermissionStatus {
        public static final int DENIED = 2;
        public static final int GRANTED = 1;
        public static final int UNKNOWN = 0;

        public PermissionStatus() {
        }
    }

    /* loaded from: classes.dex */
    public final class FlashPermission {
        public static final int CAMERA = 4;
        public static final int CAMERA_ROLL = 22;
        public static final int CAMERA_UI = 50;
        public static final int LOCATION = 1;
        public static final int MICROPHONE = 2;
        public static final int NETWORK = 296;
        public static final int STORAGE = 8;
        public static final int WIFI = 100;

        public FlashPermission() {
        }
    }

    public boolean isScreenOn() {
        return this.mScreenOn;
    }

    public boolean isScreenLocked() {
        return this.keyGuardManager.inKeyguardRestrictedInputMode();
    }

    public boolean isResumed() {
        return this.mActivityState == ActivityState.RESUMED;
    }

    public boolean isStarted() {
        return this.mActivityState == ActivityState.STARTED || this.mActivityState == ActivityState.RESTARTED;
    }

    public static AndroidActivityWrapper CreateAndroidActivityWrapper(Activity activity) {
        return CreateAndroidActivityWrapper(activity, false, false);
    }

    public static AndroidActivityWrapper CreateAndroidActivityWrapper(Activity activity, Boolean bool) {
        return CreateAndroidActivityWrapper(activity, bool, false);
    }

    private static boolean isAndroidTV(Activity activity) {
        return ((UiModeManager) activity.getSystemService("uimode")).getCurrentModeType() == 4;
    }

    public static AndroidActivityWrapper CreateAndroidActivityWrapper(Activity activity, Boolean bool, Boolean bool2) {
        if (!bool.booleanValue()) {
            Context applicationContext = activity.getApplicationContext();
            if (!(new String[]{"air.com.crestron.andros"}[0].equals(applicationContext.getPackageName()) | false)) {
                Toast.makeText(applicationContext, "Unsupported application:\n" + applicationContext.getPackageName(), 1).show();
                activity.finish();
                return null;
            }
        }
        sHasCaptiveRuntime = bool.booleanValue();
        if (bool.booleanValue()) {
            Utils.setRuntimePackageName(activity.getApplicationContext().getPackageName());
        } else {
            Utils.setRuntimePackageName(BuildConfig.LIBRARY_PACKAGE_NAME);
        }
        sIsDebugger = bool2.booleanValue();
        AndroidActivityWrapper androidActivityWrapper = sActivityWrapper;
        if (androidActivityWrapper == null) {
            sActivityWrapper = new AndroidActivityWrapper(activity);
        } else {
            androidActivityWrapper.m_activity = activity;
            androidActivityWrapper.m_application = activity.getApplication();
        }
        mIsAndroidTV = isAndroidTV(activity);
        return sActivityWrapper;
    }

    boolean manifestDeclaresPermission(int i) {
        return manifestDeclaresPermission(FlashToAndroidPermission(i));
    }

    boolean manifestDeclaresPermission(String str) {
        if (str == null) {
            return false;
        }
        if (this.mDeclaredPermissions == null) {
            try {
                String[] strArr = this.m_application.getPackageManager().getPackageInfo(this.m_application.getPackageName(), 4096).requestedPermissions;
                if (strArr.length > 0) {
                    this.mDeclaredPermissions = Arrays.asList(strArr);
                }
            } catch (Exception unused) {
                this.mDeclaredPermissions = null;
            }
        }
        List<String> list = this.mDeclaredPermissions;
        if (list == null) {
            return false;
        }
        return list.contains(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int GetTargetSdkVersion() {
        if (this.mTargetSdkVersion == 0) {
            try {
                this.mTargetSdkVersion = this.m_application.getPackageManager().getPackageInfo(this.m_application.getPackageName(), 4096).applicationInfo.targetSdkVersion;
            } catch (Exception unused) {
            }
        }
        return this.mTargetSdkVersion;
    }

    private AndroidActivityWrapper(Activity activity) {
        this.m_activity = null;
        this.m_application = null;
        this.m_newActivityLock = null;
        this.m_newActivityCondition = null;
        this.m_listenerLock = null;
        this.keyGuardManager = null;
        this.m_activity = activity;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.m_newActivityLock = reentrantLock;
        this.m_newActivityCondition = reentrantLock.newCondition();
        this.m_application = activity.getApplication();
        this.m_listenerLock = new ReentrantLock();
        LoadRuntimeLibraries();
        this.keyGuardManager = (KeyguardManager) activity.getSystemService("keyguard");
        initScoutServiceConnection();
    }

    public static AndroidActivityWrapper GetAndroidActivityWrapper() {
        return sActivityWrapper;
    }

    public static boolean GetHasCaptiveRuntime() {
        return sHasCaptiveRuntime;
    }

    public static boolean GetIsAndroidTV() {
        return mIsAndroidTV;
    }

    public static boolean IsGamePreviewMode() {
        return sIsSwfPreviewMode;
    }

    public static boolean GetDepthAndStencilForGamePreview() {
        return sDepthAndStencil;
    }

    public static boolean ShouldShowGamePreviewWatermark() {
        Boolean valueOf = Boolean.valueOf(sIsSwfPreviewMode);
        if (valueOf.booleanValue() && (sGamePreviewHost.equalsIgnoreCase("www.adobe.com") || sGamePreviewHost.equalsIgnoreCase(ADOBE_COM))) {
            valueOf = false;
        }
        return valueOf.booleanValue();
    }

    public Activity getActivity() {
        return this.m_activity;
    }

    public void setSpeakerphoneOn(boolean z) {
        ((AudioManager) getActivity().getSystemService("audio")).setSpeakerphoneOn(z);
    }

    public boolean getSpeakerphoneOn() {
        return ((AudioManager) getActivity().getSystemService("audio")).isSpeakerphoneOn();
    }

    public boolean getWebContentsDebuggingEnabled() {
        return getMetaDataBool("webContentsDebuggingEnabled");
    }

    public boolean getWebViewAllowFileAccess() {
        return getMetaDataBool("webViewAllowFileAccess");
    }

    private boolean getMetaDataBool(String str) {
        Boolean bool;
        try {
            Bundle bundle = this.m_activity.getPackageManager().getActivityInfo(this.m_activity.getComponentName(), 128).metaData;
            if (bundle == null || (bool = (Boolean) bundle.get(str)) == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public boolean disableMediaCodec() {
        Boolean bool;
        try {
            Bundle bundle = this.m_activity.getPackageManager().getActivityInfo(this.m_activity.getComponentName(), 128).metaData;
            if (bundle == null || (bool = (Boolean) bundle.get("disableMediaCodec")) == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public boolean embeddedFonts() {
        Boolean bool;
        Activity activity = this.m_activity;
        if (activity == null) {
            return false;
        }
        try {
            Bundle bundle = activity.getPackageManager().getActivityInfo(this.m_activity.getComponentName(), 128).metaData;
            if (bundle != null && (bool = (Boolean) bundle.get("embeddedFonts")) != null) {
                return bool.booleanValue();
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void registerPlane(SurfaceView surfaceView, int i) {
        this.m_planes.set(i, surfaceView);
        planeBreakCascade();
    }

    public void unregisterPlane(int i) {
        this.m_planes.set(i, null);
        planeBreakCascade();
    }

    public void planeCleanCascade() {
        if (this.m_planeCascadeInit) {
            return;
        }
        this.m_planeCascadeInit = true;
        planeBreakCascade();
    }

    public void planeBreakCascade() {
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            if (this.m_planes.get(i2) != null) {
                i++;
            }
        }
        if (i > 1) {
            this.m_planeBreakCascade = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean planeRemovedSuccessfully(SurfaceView surfaceView) {
        if (surfaceView.getHolder().getSurface().isValid()) {
            return (Build.MODEL.equals("LT18i") || Build.MODEL.equals("LT15i") || Build.MODEL.equals("Arc")) && isIceCreamSandwich() && this.m_layout.indexOfChild(surfaceView) < 0;
        }
        return true;
    }

    public void planeKickCascade() {
        Activity activity;
        if (isHoneycomb() && this.m_skipKickCascade) {
            return;
        }
        if ((isJellybean() && this.mContainsVideo) || (activity = this.m_activity) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidActivityWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                AndroidActivityWrapper.this.planeCleanCascade();
                if (AndroidActivityWrapper.this.m_layout == null) {
                    return;
                }
                if (AndroidActivityWrapper.this.m_planeBreakCascade) {
                    for (int i = 0; i < 8; i++) {
                        if (AndroidActivityWrapper.this.m_planes.get(i) != null && AndroidActivityWrapper.this.m_layout.indexOfChild((View) AndroidActivityWrapper.this.m_planes.get(i)) >= 0) {
                            AndroidActivityWrapper.this.m_layout.removeView((View) AndroidActivityWrapper.this.m_planes.get(i));
                        }
                    }
                    AndroidActivityWrapper.this.m_planeBreakCascade = false;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 8) {
                            break;
                        }
                        if (AndroidActivityWrapper.this.m_planes.get(i2) != null) {
                            AndroidActivityWrapper androidActivityWrapper = AndroidActivityWrapper.this;
                            if (!androidActivityWrapper.planeRemovedSuccessfully((SurfaceView) androidActivityWrapper.m_planes.get(i2))) {
                                AndroidActivityWrapper.this.m_planeBreakCascade = true;
                                break;
                            }
                        }
                        i2++;
                    }
                    AndroidActivityWrapper.this.m_planeCascadeStep = 0;
                }
                if (AndroidActivityWrapper.this.m_planeCascadeStep == 0) {
                    AndroidActivityWrapper.this.planeStepCascade();
                    AndroidActivityWrapper.this.m_mainView.requestFocus();
                }
            }
        });
    }

    public void planeStepCascade() {
        this.m_skipKickCascade = false;
        if (this.m_layout == null || this.m_planeBreakCascade) {
            return;
        }
        while (true) {
            int i = this.m_planeCascadeStep;
            if (i >= 8) {
                return;
            }
            if (this.m_planes.get(i) == null) {
                this.m_planeCascadeStep++;
            } else {
                if (this.m_layout.indexOfChild(this.m_planes.get(this.m_planeCascadeStep)) < 0) {
                    this.m_layout.addView(this.m_planes.get(this.m_planeCascadeStep), 0);
                }
                this.m_planeCascadeStep++;
                return;
            }
        }
    }

    public void ensureZOrder() {
        for (int i = 7; i >= 0; i--) {
            if (this.m_planes.get(i) != null && this.m_layout.indexOfChild(this.m_planes.get(i)) >= 0) {
                this.m_layout.bringChildToFront(this.m_planes.get(i));
            }
        }
    }

    public Context getRuntimeContext() {
        return this.m_runtimeContext;
    }

    public Application getApplication() {
        return this.m_application;
    }

    public Context getApplicationContext() {
        return this.m_application;
    }

    public Context getDefaultContext() {
        Activity activity = this.m_activity;
        return activity != null ? activity : this.m_application;
    }

    public int getDefaultIntentFlags() {
        return this.m_activity != null ? 0 : 268435456;
    }

    public RelativeLayout getOverlaysLayout(boolean z) {
        if (z && this.m_overlaysLayout == null) {
            RelativeLayout relativeLayout = new RelativeLayout(this.m_activity);
            this.m_overlaysLayout = relativeLayout;
            this.m_layout.addView(relativeLayout);
        }
        return this.m_overlaysLayout;
    }

    public void didRemoveOverlay() {
        RelativeLayout relativeLayout = this.m_overlaysLayout;
        if (relativeLayout == null || relativeLayout.getChildCount() != 0) {
            return;
        }
        this.m_layout.removeView(this.m_overlaysLayout);
        this.m_overlaysLayout = null;
    }

    public View getView() {
        return this.m_mainView;
    }

    public ImageView getViewSplashScreenImageView() {
        return this.m_splashscreenImageView;
    }

    public AndroidCameraView getCameraView() {
        return this.m_cameraView;
    }

    public boolean isApplicationLaunched() {
        return sApplicationLaunched;
    }

    public FlashEGL getEgl() {
        if (this.m_flashEGL == null) {
            this.m_flashEGL = FlashEGLFactory.CreateFlashEGL();
        }
        return this.m_flashEGL;
    }

    public boolean isSurfaceValid() {
        AIRWindowSurfaceView aIRWindowSurfaceView = this.m_mainView;
        return aIRWindowSurfaceView != null && aIRWindowSurfaceView.isSurfaceValid();
    }

    public void SendIntentToRuntime(Class<?> cls, String str, String str2) {
        try {
            Intent intent = new Intent(this.m_runtimeContext, cls);
            intent.setAction(str);
            intent.addCategory(str2);
            this.m_activity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public void SendIntentToRuntime(Class<?> cls, String str, String str2, String str3, String str4) {
        try {
            Intent intent = new Intent(this.m_runtimeContext, cls);
            intent.setAction(str);
            intent.addCategory(str2);
            intent.putExtra(str3, str4);
            this.m_activity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public void StartDownloadConfigService() {
        Intent intent = new Intent();
        intent.setPackage(Utils.getRuntimePackageName());
        intent.setAction(AIRService.INTENT_DOWNLOAD_CONFIG);
        try {
            getApplicationContext().startService(intent);
        } catch (SecurityException unused) {
        }
    }

    public void ShowImmediateUpdateDialog() {
        String str = null;
        try {
            Bundle bundle = this.m_activity.getPackageManager().getActivityInfo(this.m_activity.getComponentName(), 128).metaData;
            if (bundle != null) {
                str = (String) bundle.get("airDownloadURL");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        String str2 = str;
        if (str2 != null) {
            SendIntentToRuntime(AIRUpdateDialog.class, "android.intent.action.MAIN", "AIRUpdateDialog", "airDownloadURL", str2);
        } else {
            SendIntentToRuntime(AIRUpdateDialog.class, "android.intent.action.MAIN", "AIRUpdateDialog");
        }
    }

    private void initializeAndroidAppVars(ApplicationInfo applicationInfo) {
        ApplicationFileManager.setAndroidPackageName(applicationInfo.packageName);
        ApplicationFileManager.setAndroidAPKPath(applicationInfo.sourceDir);
        ApplicationFileManager.processAndroidDataPath(this.m_application.getCacheDir().getAbsolutePath());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void parseArgs(android.app.Activity r9, java.lang.String[] r10) {
        /*
            r8 = this;
            java.lang.String r9 = ""
            java.lang.String r0 = "false"
            r1 = 0
            r1 = r10[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2d
            r2 = 1
            r2 = r10[r2]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2a
            r3 = 2
            r3 = r10[r3]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L27
            r4 = 3
            r4 = r10[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L25
            r5 = 4
            r5 = r10[r5]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L20
            int r6 = r10.length     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1d
            r7 = 6
            if (r6 < r7) goto L35
            r6 = 5
            r0 = r10[r6]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1d
            r9 = r10[r7]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1d
            goto L35
        L1d:
            r10 = r0
            goto L23
        L20:
            r10 = r0
            r5 = r10
        L23:
            r0 = r4
            goto L33
        L25:
            goto L31
        L27:
            r3 = r9
            goto L31
        L2a:
            r2 = r9
            goto L30
        L2d:
            r1 = r9
            r2 = r1
        L30:
            r3 = r2
        L31:
            r10 = r0
            r5 = r10
        L33:
            r4 = r0
            r0 = r10
        L35:
            r8.mExtraArgs = r3
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r4)
            boolean r10 = r10.booleanValue()
            r8.mIsADL = r10
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r5)
            boolean r10 = r10.booleanValue()
            r8.mIsDebuggerMode = r10
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            boolean r10 = r10.booleanValue()
            com.adobe.air.AndroidActivityWrapper.sIsSwfPreviewMode = r10
            com.adobe.air.AndroidActivityWrapper.sGamePreviewHost = r9
            android.app.Activity r9 = r8.m_activity
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo()
            r8.initializeAndroidAppVars(r9)
            boolean r9 = r8.mIsADL
            if (r9 == 0) goto L69
            r8.mXmlPath = r1
            r8.mRootDir = r2
            goto L75
        L69:
            java.lang.String r9 = com.adobe.air.ApplicationFileManager.getAppXMLRoot()
            r8.mXmlPath = r9
            java.lang.String r9 = com.adobe.air.ApplicationFileManager.getAppRoot()
            r8.mRootDir = r9
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.AndroidActivityWrapper.parseArgs(android.app.Activity, java.lang.String[]):void");
    }

    public void onCreate(Activity activity, String[] strArr) {
        this.m_activity = activity;
        this.mActivityState = ActivityState.STARTED;
        Entrypoints entrypoints = sEntryPoint;
        if (entrypoints != null) {
            entrypoints.EntryLifecycleChange(ActivityState.STARTED.ordinal());
        }
        customHandler.mRunning = true;
        parseArgs(activity, strArr);
        SignalNewActivityCreated();
        try {
            this.m_runtimeContext = this.m_activity.createPackageContext(Utils.getRuntimePackageName(), 4);
        } catch (Exception unused) {
        }
        if (this.mIsDebuggerMode && !this.mIsADL && !sApplicationLaunched && !DeviceProfiling.checkAndInitiateProfiler(this.m_activity)) {
            checkForDebuggerAndLaunchDialog();
        } else {
            afterOnCreate();
        }
        this.mInvokeEventPendingFromOnCreate = true;
        this.mConfigDownloadListener = ConfigDownloadListener.GetConfigDownloadListener();
    }

    private void afterOnCreate() {
        Boolean bool;
        AIRRuntimeCheck.runtimeStartupChecks();
        try {
            if (this.m_planes == null) {
                this.m_planes = new ArrayList(8);
                for (int i = 0; i < 8; i++) {
                    this.m_planes.add(i, null);
                }
            }
            Context applicationContext = getApplicationContext();
            Context defaultContext = getDefaultContext();
            this.m_layout = new FrameLayout(defaultContext);
            this.m_mainView = new AIRWindowSurfaceView(defaultContext, this);
            ImageView imageView = new ImageView(defaultContext);
            this.m_splashscreenImageView = imageView;
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            if (this.m_cameraView == null) {
                this.m_cameraView = new AndroidCameraView(defaultContext, this);
            }
            AndroidCameraView androidCameraView = this.m_cameraView;
            if (androidCameraView != null) {
                this.m_layout.addView(androidCameraView, 8, 16);
            }
            Bundle bundle = this.m_activity.getPackageManager().getActivityInfo(this.m_activity.getComponentName(), 128).metaData;
            if (bundle != null && (bool = (Boolean) bundle.get("containsVideo")) != null && bool.booleanValue()) {
                this.mContainsVideo = bool.booleanValue();
                VideoView videoView = this.m_mainView.getVideoView();
                this.m_videoView = videoView;
                this.m_layout.addView(videoView, 0);
            }
            this.m_layout.addView(this.m_mainView);
            this.m_layout.addView(this.m_splashscreenImageView);
            RelativeLayout relativeLayout = this.m_overlaysLayout;
            if (relativeLayout != null) {
                this.m_layout.addView(relativeLayout);
            }
            this.m_activity.setContentView(this.m_layout);
            Activity activity = this.m_activity;
            if (activity != null) {
                View currentFocus = activity.getCurrentFocus();
                AIRWindowSurfaceView aIRWindowSurfaceView = this.m_mainView;
                if (currentFocus != aIRWindowSurfaceView) {
                    aIRWindowSurfaceView.requestFocus();
                    this.m_mainView.onWindowFocusChanged(true);
                }
            }
            if (!this.mFullScreenSetFromMetaData) {
                setFullScreenFromMetaData();
            }
            this.mFullScreenSetFromMetaData = true;
            if (getIsFullScreen()) {
                this.m_mainView.setFullScreen();
            }
            this.mHardKeyboardHidden = this.m_activity.getResources().getConfiguration().hardKeyboardHidden;
            this.mHardKeyboardType = this.m_activity.getResources().getConfiguration().keyboard;
            OrientationManager orientationManager = OrientationManager.getOrientationManager();
            this.mOrientationManager = orientationManager;
            orientationManager.onActivityCreated(this.m_activity, this.m_mainView);
            callActivityStateListeners();
            HDMIUtils.initHelper(applicationContext);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x012d A[Catch: Exception -> 0x0155, TryCatch #4 {Exception -> 0x0155, blocks: (B:61:0x0125, B:63:0x012d, B:64:0x0134, B:25:0x0067), top: B:79:0x0067 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void LaunchApplication(android.app.Activity r16, com.adobe.air.AIRWindowSurfaceView r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.AndroidActivityWrapper.LaunchApplication(android.app.Activity, com.adobe.air.AIRWindowSurfaceView, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    private void setMainView(View view) {
        if (!sApplicationLaunched || sEntryPoint == null) {
            return;
        }
        boolean isInMultiWindowMode = Build.VERSION.SDK_INT >= 24 ? this.m_activity.isInMultiWindowMode() : false;
        if (isResumed() || isInMultiWindowMode) {
            try {
                sEntryPoint.setMainView(view);
            } catch (Exception unused) {
            }
        }
    }

    public void initCallStateListener() {
        if (!AIRRuntimeCheck.shouldDisableSensorAccess() && sAndroidTelephonyManager == null) {
            AndroidTelephonyManager CreateAndroidTelephonyManager = AndroidTelephonyManager.CreateAndroidTelephonyManager(getApplicationContext());
            sAndroidTelephonyManager = CreateAndroidTelephonyManager;
            CreateAndroidTelephonyManager.listen(true);
        }
    }

    public void onPause() {
        if (this.mActivityState == ActivityState.PAUSED) {
            return;
        }
        Entrypoints entrypoints = sEntryPoint;
        if (entrypoints != null) {
            entrypoints.EntryLifecycleChange(ActivityState.PAUSED.ordinal());
        }
        this.mActivityState = ActivityState.PAUSED;
        callActivityStateListeners();
        AIRWindowSurfaceView aIRWindowSurfaceView = this.m_mainView;
        if (aIRWindowSurfaceView != null) {
            aIRWindowSurfaceView.forceSoftKeyboardDown();
        }
        OrientationManager orientationManager = this.mOrientationManager;
        if (orientationManager != null) {
            orientationManager.onActivityPaused();
        }
        AndroidIdleState androidIdleState = sIdleStateManager;
        if (androidIdleState != null) {
            androidIdleState.releaseLock();
        }
        if (isApplicationLaunched()) {
            sendOnFocusListener(false);
            sendDeactivateEvent();
        }
        planeBreakCascade();
    }

    public void onResume() {
        if (this.mActivityState == ActivityState.RESUMED) {
            return;
        }
        Entrypoints entrypoints = sEntryPoint;
        if (entrypoints != null) {
            entrypoints.EntryLifecycleChange(ActivityState.RESUMED.ordinal());
        }
        this.mActivityState = ActivityState.RESUMED;
        callActivityStateListeners();
        OrientationManager orientationManager = this.mOrientationManager;
        if (orientationManager != null) {
            orientationManager.onActivityResumed();
        }
        AndroidIdleState androidIdleState = sIdleStateManager;
        if (androidIdleState != null) {
            androidIdleState.acquireLock();
        }
        if (isApplicationLaunched()) {
            sendActivateEvent();
            sendOnFocusListener(true);
        } else {
            this.mActivateEventPending = true;
        }
        this.m_skipKickCascade = true;
        planeBreakCascade();
    }

    public void onRestart() {
        Entrypoints entrypoints = sEntryPoint;
        if (entrypoints != null) {
            entrypoints.EntryLifecycleChange(ActivityState.RESTARTED.ordinal());
        }
        for (Display display : ((DisplayManager) getDefaultContext().getSystemService("display")).getDisplays()) {
            if (display.getState() != 1) {
                this.mScreenOn = true;
            }
        }
        this.mActivityState = ActivityState.RESTARTED;
        callActivityStateListeners();
        AIRWindowSurfaceView aIRWindowSurfaceView = this.m_mainView;
        if (aIRWindowSurfaceView != null) {
            aIRWindowSurfaceView.HideSoftKeyboardOnWindowFocusChange();
        }
        SetVisible(true);
    }

    public void onStop() {
        Entrypoints entrypoints = sEntryPoint;
        if (entrypoints != null) {
            entrypoints.EntryLifecycleChange(ActivityState.STOPPED.ordinal());
        }
        this.mActivityState = ActivityState.STOPPED;
        callActivityStateListeners();
        SetVisible(false);
    }

    public void onDestroy() {
        customHandler.mRunning = false;
        Entrypoints entrypoints = sEntryPoint;
        if (entrypoints != null) {
            entrypoints.EntryLifecycleChange(ActivityState.DESTROYED.ordinal());
        }
        this.mActivityState = ActivityState.DESTROYED;
        callActivityStateListeners();
        OrientationManager orientationManager = this.mOrientationManager;
        if (orientationManager != null) {
            orientationManager.onActivityDestroyed();
        }
        for (int i = 0; i < 8; i++) {
            if (this.m_planes.get(i) != null) {
                this.m_layout.removeView(this.m_planes.get(i));
            }
        }
        RelativeLayout relativeLayout = this.m_overlaysLayout;
        if (relativeLayout != null) {
            this.m_layout.removeView(relativeLayout);
        }
        this.m_activity = null;
        this.m_cameraView = null;
        this.m_mainView = null;
        this.m_splashscreenImageView = null;
        this.m_layout = null;
        setMainView(null);
        sApplicationLaunched = false;
        sActivityWrapper = null;
        HDMIUtils.closeHelper();
        if (inAsyncMode()) {
            sEntryPoint.quit();
        }
    }

    public void SendInvokeEvent() {
        Activity activity = this.m_activity;
        String str = null;
        Intent intent = activity != null ? activity.getIntent() : null;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        String type = intent.getType();
        if ("android.intent.action.SEND".equals(action) && type != null) {
            if ("text/plain".equals(type)) {
                str = handleSendText(intent);
            } else if (type.startsWith("image/")) {
                str = handleSendImage(intent);
            }
        } else if ("android.intent.action.SEND_MULTIPLE".equals(action) && type != null) {
            if (type.startsWith("image/")) {
                str = handleSendMultipleImages(intent);
            }
        } else {
            str = intent.getDataString();
            if (str == null) {
                str = intent.getStringExtra("args");
            }
        }
        sendSendInvokeEventWithData(str, intent.getAction(), str != null ? 1 : 0);
    }

    String handleSendText(Intent intent) {
        return intent.getStringExtra("android.intent.extra.TEXT");
    }

    String handleSendImage(Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.STREAM");
        if (parcelableExtra != null) {
            return ((Uri) parcelableExtra).toString();
        }
        return null;
    }

    String handleSendMultipleImages(Intent intent) {
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        if (parcelableArrayListExtra != null) {
            String arrayList = parcelableArrayListExtra.toString();
            return arrayList.substring(1, arrayList.length() - 1);
        }
        return null;
    }

    public void onNewIntent(Intent intent) {
        this.m_activity.setIntent(intent);
        SendInvokeEvent();
    }

    public void onSurfaceInitialized() {
        setMainView(this.m_mainView);
        SetVisible(true);
        if (this.mDisplayWaitingDialog) {
            showDialogWaitingForConnection(this.debuggerPort);
            this.mDisplayWaitingDialog = false;
        }
        if (sEntryPoint == null || !sApplicationLaunched) {
            try {
                Entrypoints entrypoints = new Entrypoints();
                sEntryPoint = entrypoints;
                if (AIRRuntimeCheck.doSplashScreen(entrypoints, this.mXmlPath, Utils.getRuntimePackageName())) {
                    new Handler().postDelayed(new Runnable() { // from class: com.adobe.air.AndroidActivityWrapper.3
                        @Override // java.lang.Runnable
                        public void run() {
                            AndroidActivityWrapper.this.launchApplication();
                        }
                    }, 1500L);
                } else {
                    launchApplication();
                }
            } catch (Exception unused) {
            }
        }
    }

    public void launchApplication() {
        Activity activity = this.m_activity;
        if (activity == null) {
            return;
        }
        LaunchApplication(activity, this.m_mainView, this.mXmlPath, this.mRootDir, this.mExtraArgs, this.mIsADL, this.mIsDebuggerMode);
        if (inAsyncMode()) {
            return;
        }
        continueLaunch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void continueLaunch() {
        if (this.mInvokeEventPendingFromOnCreate) {
            if (!this.mIsADL) {
                SendInvokeEvent();
            }
            this.mInvokeEventPendingFromOnCreate = false;
        }
        if (this.mActivateEventPending) {
            sendActivateEvent();
            this.mActivateEventPending = false;
        }
        planeCleanCascade();
    }

    public void finish() {
        Activity activity = this.m_activity;
        if (activity != null) {
            activity.finish();
        }
    }

    public void onSurfaceDestroyed() {
        SetVisible(false);
    }

    public void onScreenStateChanged(boolean z) {
        this.mScreenOn = z;
        SetVisible(z);
        if (z) {
            this.m_skipKickCascade = false;
            planeBreakCascade();
        }
    }

    private void SetVisible(boolean z) {
        if (z) {
            if (!isSurfaceValid() || !this.mScreenOn || this.mActivityState == ActivityState.STOPPED || this.mActivityState == ActivityState.DESTROYED) {
                return;
            }
            nativeSetVisible(true);
        } else if (isApplicationLaunched()) {
            nativeSetVisible(false);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mHardKeyboardHidden = configuration.hardKeyboardHidden;
        this.mHardKeyboardType = configuration.keyboard;
        this.mOrientationManager.onConfigurationChanged(configuration);
        callActivityStateListeners(configuration);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent, boolean z) {
        return callInputEventListeners(keyEvent);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent, boolean z) {
        return callInputEventListeners(motionEvent);
    }

    public void onLowMemory() {
        sendLowMemoryEvent();
    }

    public int getOrientation() {
        return this.mOrientationManager.getOrientation();
    }

    public int getDeviceOrientation() {
        return this.mOrientationManager.getDeviceOrientation();
    }

    public void setOrientation(int i) {
        this.mOrientationManager.setOrientation(i);
    }

    public void setAspectRatio(int i) {
        this.mOrientationManager.setAspectRatio(i);
    }

    public void setAutoOrients(boolean z) {
        this.mOrientationManager.setAutoOrients(z);
    }

    public boolean getAutoOrients() {
        return this.mOrientationManager.getAutoOrients();
    }

    public int[] getSupportedOrientations() {
        return this.mOrientationManager.getSupportedOrientations();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        boolean isExternalStorageManager;
        int i3 = 1;
        if (6 != i) {
            if (8 != i) {
                if (9 == i) {
                    launchApplication();
                    return;
                } else {
                    callActivityResultListeners(i, i2, intent);
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 30) {
                isExternalStorageManager = Environment.isExternalStorageManager();
                if (!isExternalStorageManager) {
                    i3 = 2;
                }
            } else {
                i3 = 0;
            }
            sendNotifyPermissionRequestResult(8, i3);
            return;
        }
        if (i2 != -1 || intent == null) {
            i3 = 2;
        } else {
            Uri data = intent.getData();
            try {
                try {
                    this.m_activity.getContentResolver().openFileDescriptor(Uri.parse(this.mActivePermissionURI), "r").close();
                    this.m_activity.getContentResolver().takePersistableUriPermission(data, 1);
                    this.m_activity.getContentResolver().takePersistableUriPermission(data, 2);
                } catch (Exception unused) {
                    Log.i("AdobeAIR", "Requested access to " + this.mActivePermissionURI + " but access was instead granted to " + data.toString());
                    this.mActivePermissionURI = null;
                    sendNotifyPermissionRequestResult(8, i3);
                }
            } catch (Exception unused2) {
                i3 = 2;
            }
        }
        this.mActivePermissionURI = null;
        sendNotifyPermissionRequestResult(8, i3);
    }

    public boolean isHardKeyboardHidden() {
        return this.mHardKeyboardHidden == 2;
    }

    public int getHardKeyboardType() {
        return this.mHardKeyboardType;
    }

    public void setUseRGB565(Boolean bool) {
        this.mRGB565Override = bool.booleanValue();
    }

    public boolean useRGB565() {
        if (this.mIsADL) {
            return this.mRGB565Override;
        }
        ResourceFileManager resourceFileManager = new ResourceFileManager(this.m_activity);
        return !resourceFileManager.resExists(resourceFileManager.lookupResId(AndroidConstants.ANDROID_RESOURCE_RGBA8888));
    }

    public void BroadcastIntent(String str, String str2) {
        try {
            if (str2.trim().startsWith("file://") && !isAvailablePath(str2)) {
                Toast.makeText(getDefaultContext(), "Requested URL is not available", 0).show();
            } else {
                getDefaultContext().startActivity(Intent.parseUri(str2, 0).setAction(str).addFlags(getDefaultIntentFlags()));
            }
        } catch (ActivityNotFoundException | URISyntaxException unused) {
        }
    }

    private boolean isAvailablePath(String str) {
        return new File(Uri.parse(str).getPath()).exists();
    }

    public void LaunchMarketPlaceForAIR(String str) {
        if (str == null) {
            str = "market://details?id=" + Utils.getRuntimePackageName();
        }
        try {
            BroadcastIntent("android.intent.action.VIEW", str);
        } catch (Exception unused) {
        }
    }

    public String GetLibCorePath() {
        if (this.mLibCorePath == null) {
            this.mLibCorePath = Utils.GetLibCorePath(this.m_application, Boolean.valueOf(sIsDebugger));
        }
        return this.mLibCorePath;
    }

    private void LoadRuntimeLibraries() {
        boolean z = false;
        if (!sRuntimeLibrariesLoaded) {
            try {
                System.load(Utils.GetLibSTLPath(this.m_application));
                try {
                    System.load(GetLibCorePath());
                    sRuntimeLibrariesLoaded = true;
                } catch (UnsatisfiedLinkError unused) {
                }
                z = true;
            } catch (UnsatisfiedLinkError unused2) {
            }
        }
        if (sRuntimeLibrariesLoaded) {
            return;
        }
        if (!z) {
            try {
                System.loadLibrary("c++_shared");
            } catch (UnsatisfiedLinkError unused3) {
                return;
            }
        }
        System.loadLibrary(Core.TAG);
        sRuntimeLibrariesLoaded = true;
    }

    private void showDialogUnableToListenOnPort(int i) {
        new ListenErrorDialog(this.m_activity, i).createAndShowDialog();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e5  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void checkForDebuggerAndLaunchDialog() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.AndroidActivityWrapper.checkForDebuggerAndLaunchDialog():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adobe.air.AndroidActivityWrapper$6  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$com$adobe$air$AndroidActivityWrapper$DebugMode;

        static {
            int[] iArr = new int[DebugMode.values().length];
            $SwitchMap$com$adobe$air$AndroidActivityWrapper$DebugMode = iArr;
            try {
                iArr[DebugMode.ListenMode.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$DebugMode[DebugMode.ConnectMode.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$DebugMode[DebugMode.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$DebugMode[DebugMode.ConflictMode.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void showDialogforIpAddress(String str) {
        getApplicationContext();
        new RemoteDebuggerDialog(this.m_activity).createAndShowDialog(str);
    }

    private void closeDialogWaitingForConnection() {
        Context applicationContext = getApplicationContext();
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("RemoteDebuggerListenerDialogClose");
            intent.putExtra("debuggerPort", this.debuggerPort);
            applicationContext.sendBroadcast(intent);
        } catch (Exception unused) {
        }
    }

    private void showDialogWaitingForConnection(final int i) {
        if (sHasCaptiveRuntime) {
            new Thread(new Runnable() { // from class: com.adobe.air.AndroidActivityWrapper.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Thread.sleep(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                        new Socket(InetAddress.getLocalHost(), i).close();
                    } catch (Exception unused) {
                    }
                }
            }).start();
            return;
        }
        try {
            getApplicationContext();
            Intent intent = new Intent(this.m_runtimeContext, RemoteDebuggerListenerDialog.class);
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("RemoteDebuggerListenerDialog");
            intent.putExtra("debuggerPort", i);
            this.m_activity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public void gotResultFromDialog(boolean z, String str) {
        boolean z2 = false;
        if (z) {
            boolean nativeConnectDebuggerSocket = str.length() != 0 ? Utils.nativeConnectDebuggerSocket(str) : false;
            if (!nativeConnectDebuggerSocket) {
                showDialogforIpAddress(str);
            } else {
                this.mDebuggerSettings.setHost(str);
                this.mDebuggerSettings.setListen(false);
                this.mShowDebuggerDialog = true;
            }
            z2 = nativeConnectDebuggerSocket;
        }
        if (z2 || !z) {
            afterOnCreate();
        }
    }

    public void addInputEventListner(InputEventCallback inputEventCallback) {
        if (this.mInputEventListeners == null) {
            this.mInputEventListeners = new ArrayList();
        }
        if (this.mInputEventListeners.contains(inputEventCallback)) {
            return;
        }
        this.mInputEventListeners.add(inputEventCallback);
    }

    public void removeInputEventListner(InputEventCallback inputEventCallback) {
        List<InputEventCallback> list = this.mInputEventListeners;
        if (list != null) {
            list.remove(inputEventCallback);
        }
    }

    private boolean callInputEventListeners(KeyEvent keyEvent) {
        List<InputEventCallback> list = this.mInputEventListeners;
        boolean z = false;
        if (list == null) {
            return false;
        }
        try {
            int size = list.size();
            boolean z2 = false;
            for (int i = 0; i < size; i++) {
                if (!z2) {
                    try {
                        if (!this.mInputEventListeners.get(i).onKeyEvent(keyEvent)) {
                            z2 = false;
                        }
                    } catch (Exception unused) {
                        z = z2;
                        return z;
                    }
                }
                z2 = true;
            }
            return z2;
        } catch (Exception unused2) {
        }
    }

    private boolean callInputEventListeners(MotionEvent motionEvent) {
        List<InputEventCallback> list = this.mInputEventListeners;
        boolean z = false;
        if (list == null) {
            return false;
        }
        try {
            int size = list.size();
            boolean z2 = false;
            for (int i = 0; i < size; i++) {
                if (!z2) {
                    try {
                        if (!this.mInputEventListeners.get(i).onGenericMotionEvent(motionEvent)) {
                            z2 = false;
                        }
                    } catch (Exception unused) {
                        z = z2;
                        return z;
                    }
                }
                z2 = true;
            }
            return z2;
        } catch (Exception unused2) {
        }
    }

    public void addActivityStateChangeListner(StateChangeCallback stateChangeCallback) {
        if (this.mActivityStateListeners == null) {
            this.mActivityStateListeners = new ArrayList();
        }
        if (this.mActivityStateListeners.contains(stateChangeCallback)) {
            return;
        }
        this.mActivityStateListeners.add(stateChangeCallback);
    }

    public void removeActivityStateChangeListner(StateChangeCallback stateChangeCallback) {
        List<StateChangeCallback> list = this.mActivityStateListeners;
        if (list != null) {
            list.remove(stateChangeCallback);
        }
    }

    private void callActivityStateListeners() {
        List<StateChangeCallback> list = this.mActivityStateListeners;
        if (list == null) {
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.mActivityStateListeners.get(i).onActivityStateChanged(this.mActivityState);
            }
        } catch (Exception unused) {
        }
    }

    private void callActivityStateListeners(Configuration configuration) {
        List<StateChangeCallback> list = this.mActivityStateListeners;
        if (list == null) {
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.mActivityStateListeners.get(i).onConfigurationChanged(configuration);
            }
        } catch (Exception unused) {
        }
    }

    public void addActivityResultListener(ActivityResultCallback activityResultCallback) {
        this.m_listenerLock.lock();
        if (this.mActivityResultListeners == null) {
            this.mActivityResultListeners = new ArrayList();
        }
        if (!this.mActivityResultListeners.contains(activityResultCallback)) {
            this.mActivityResultListeners.add(activityResultCallback);
        }
        this.m_listenerLock.unlock();
    }

    public void removeActivityResultListener(ActivityResultCallback activityResultCallback) {
        this.m_listenerLock.lock();
        List<ActivityResultCallback> list = this.mActivityResultListeners;
        if (list != null) {
            list.remove(activityResultCallback);
        }
        this.m_listenerLock.unlock();
    }

    private void callActivityResultListeners(int i, int i2, Intent intent) {
        if (this.mActivityResultListeners == null) {
            return;
        }
        this.m_listenerLock.lock();
        int size = this.mActivityResultListeners.size();
        for (int i3 = 0; i3 < size; i3++) {
            try {
                this.mActivityResultListeners.get(i3).onActivityResult(i, i2, intent);
            } catch (Exception unused) {
            }
        }
        this.m_listenerLock.unlock();
    }

    public void addRequestPermissionsResultListener(RequestPermissionsResultCallback requestPermissionsResultCallback) {
        if (this.mRequestPermissionsResultListeners == null) {
            this.mRequestPermissionsResultListeners = new ArrayList();
        }
        if (this.mRequestPermissionsResultListeners.contains(requestPermissionsResultCallback)) {
            return;
        }
        this.mRequestPermissionsResultListeners.add(requestPermissionsResultCallback);
    }

    public void removeRequestPermissionsResultListener(RequestPermissionsResultCallback requestPermissionsResultCallback) {
        List<RequestPermissionsResultCallback> list = this.mRequestPermissionsResultListeners;
        if (list != null) {
            list.remove(requestPermissionsResultCallback);
        }
    }

    private void callRequestPermissionsResultListeners(int i, String[] strArr, int[] iArr) {
        List<RequestPermissionsResultCallback> list = this.mRequestPermissionsResultListeners;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.mRequestPermissionsResultListeners.get(i2).onRequestPermissionsResult(i, strArr, iArr);
            } catch (Exception unused) {
            }
        }
    }

    private void SignalNewActivityCreated() {
        this.m_newActivityLock.lock();
        this.m_newActivityCondition.signalAll();
        this.m_newActivityLock.unlock();
    }

    public Activity WaitForNewActivity() {
        this.m_newActivityLock.lock();
        try {
            if (this.m_activity == null) {
                this.m_newActivityCondition.await();
            }
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            this.m_newActivityLock.unlock();
            throw th;
        }
        this.m_newActivityLock.unlock();
        return this.m_activity;
    }

    private void setFullScreenFromMetaData() {
        Boolean bool;
        try {
            Bundle bundle = this.m_activity.getPackageManager().getActivityInfo(this.m_activity.getComponentName(), 128).metaData;
            if (bundle == null || (bool = (Boolean) bundle.get("fullScreen")) == null || !bool.booleanValue()) {
                return;
            }
            this.m_mainView.setFullScreen();
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setIsFullScreen(boolean z) {
        this.mIsFullScreen = z;
    }

    protected boolean getIsFullScreen() {
        return this.mIsFullScreen;
    }

    public String GetAppCacheDirectory() {
        return this.m_application.getCacheDir().getAbsolutePath();
    }

    public String GetAppDataDirectory() {
        return this.m_application.getApplicationInfo().dataDir;
    }

    public String GetRuntimeDataDirectory() {
        return this.m_runtimeContext.getApplicationInfo().dataDir + "/";
    }

    public DebuggerSettings GetDebuggerSettings() {
        return this.mDebuggerSettings;
    }

    public void applyDownloadedConfig() {
        Entrypoints entrypoints = sEntryPoint;
        if (entrypoints != null) {
            entrypoints.EntryApplyDownloadedConfig();
        }
    }

    public int checkPermission(int i) {
        String FlashToAndroidPermission = FlashToAndroidPermission(i);
        if (manifestDeclaresPermission(FlashToAndroidPermission)) {
            int checkCallingOrSelfPermission = this.m_activity.checkCallingOrSelfPermission(FlashToAndroidPermission);
            boolean shouldShowRequestPermissionRationale = (GetTargetSdkVersion() < 23 || Build.VERSION.SDK_INT < 23) ? true : this.m_activity.shouldShowRequestPermissionRationale(FlashToAndroidPermission);
            if (checkCallingOrSelfPermission == 0) {
                return 1;
            }
            return (checkCallingOrSelfPermission != -1 || shouldShowRequestPermissionRationale) ? 2 : 0;
        }
        return 2;
    }

    public String FlashToAndroidPermission(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        return manifestDeclaresPermission("android.permission.MANAGE_EXTERNAL_STORAGE") ? "android.permission.MANAGE_EXTERNAL_STORAGE" : "android.permission.WRITE_EXTERNAL_STORAGE";
                    } else if (i != 100) {
                        if (i != 296) {
                            return null;
                        }
                        return "android.permission.ACCESS_NETWORK_STATE";
                    } else {
                        return "android.permission.ACCESS_WIFI_STATE";
                    }
                }
                return "android.permission.CAMERA";
            }
            return "android.permission.RECORD_AUDIO";
        }
        return "android.permission.ACCESS_FINE_LOCATION";
    }

    public int AndroidToFlashPermission(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1888586689:
                if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                    c = 0;
                    break;
                }
                break;
            case 393388709:
                if (str.equals("android.permission.ACCESS_NETWORK_STATE")) {
                    c = 1;
                    break;
                }
                break;
            case 463403621:
                if (str.equals("android.permission.CAMERA")) {
                    c = 2;
                    break;
                }
                break;
            case 1365911975:
                if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    c = 3;
                    break;
                }
                break;
            case 1675316546:
                if (str.equals("android.permission.ACCESS_WIFI_STATE")) {
                    c = 4;
                    break;
                }
                break;
            case 1831139720:
                if (str.equals("android.permission.RECORD_AUDIO")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return FlashPermission.NETWORK;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 100;
            case 5:
                return 2;
            default:
                return 0;
        }
    }

    private boolean requestStoragePermission(String str) {
        Intent intent;
        boolean isExternalStorageManager;
        if (this.m_activity == null) {
            sendNotifyPermissionRequestResult(8, 0);
            return true;
        } else if (Build.VERSION.SDK_INT >= 30 && manifestDeclaresPermission("android.permission.MANAGE_EXTERNAL_STORAGE")) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (isExternalStorageManager) {
                Log.i("AdobeAIR", "Storage permission requested -> external storage management already granted");
                sendNotifyPermissionRequestResult(8, 1);
            } else {
                Intent intent2 = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                intent2.setData(Uri.fromParts("package", this.m_activity.getPackageName(), null));
                List<ResolveInfo> queryIntentActivities = this.m_activity.getPackageManager().queryIntentActivities(intent2, 65536);
                if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
                    try {
                        this.m_activity.startActivityForResult(intent2, 8);
                    } catch (Exception unused) {
                        Log.i("AdobeAIR", "Storage permission intent failure -> falling back to old mechanism");
                        return false;
                    }
                } else {
                    Log.i("AdobeAIR", "Storage permission cannot be requested -> no handler for intent -> granting for now");
                    sendNotifyPermissionRequestResult(8, 1);
                }
            }
            return true;
        } else if (str == null) {
            Log.i("AdobeAIR", "Storage permission requested with a null file -> granting permission status internally, but please check for permissions on files with a native path set up");
            sendNotifyPermissionRequestResult(8, 1);
            return true;
        } else {
            if (str.endsWith("/")) {
                intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                intent.setFlags(65);
                intent.setFlags(66);
            } else {
                intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setFlags(65);
                intent.setType("*/*");
            }
            intent.putExtra("android.provider.extra.INITIAL_URI", str);
            List<ResolveInfo> queryIntentActivities2 = this.m_activity.getPackageManager().queryIntentActivities(intent, 65536);
            if (queryIntentActivities2 != null && queryIntentActivities2.size() > 0) {
                try {
                    this.mActivePermissionURI = str;
                    this.m_activity.startActivityForResult(intent, 6);
                } catch (Exception unused2) {
                    Log.i("AdobeAIR", "Storage permission intent failure -> falling back to old mechanism");
                    return false;
                }
            } else {
                Log.i("AdobeAIR", "Storage permission cannot be requested -> no handler for intent -> granting for now");
                sendNotifyPermissionRequestResult(8, 1);
            }
            return true;
        }
    }

    public void requestPermission(int i, String str) {
        if (i == 8 && AIRRuntimeCheck.shouldUseSAF() && requestStoragePermission(str)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && GetTargetSdkVersion() >= 23) {
            this.m_activity.requestPermissions(new String[]{FlashToAndroidPermission(i)}, 0);
            return;
        }
        sendNotifyPermissionRequestResult(i, checkPermission(i));
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 0) {
            callRequestPermissionsResultListeners(i, strArr, iArr);
        } else if (iArr.length > 0) {
            sendNotifyPermissionRequestResult(AndroidToFlashPermission(strArr[0]), iArr[0] == 0 ? 1 : 2);
        }
    }

    void initScoutServiceConnection() {
        this.ScoutServiceConnection = new ServiceConnection() { // from class: com.adobe.air.AndroidActivityWrapper.5
            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                IscoutAidlInterface unused = AndroidActivityWrapper.iRemoteScoutService = null;
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                IscoutAidlInterface unused = AndroidActivityWrapper.iRemoteScoutService = IscoutAidlInterface.Stub.asInterface(iBinder);
            }
        };
        if (iRemoteScoutService == null) {
            Intent intent = new Intent();
            intent.setAction(SCOUT_INTENT_ACTION);
            intent.setPackage(Scout_APP_ID);
            this.m_activity.getApplicationContext().bindService(intent, this.ScoutServiceConnection, 1);
        }
    }

    public Map getScoutConfigDetails() {
        try {
            return iRemoteScoutService.getScoutConfigure();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
        r2 = getActivity().getWindow().getDecorView().getRootWindowInsets();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        r2 = r2.getDisplayCutout();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int[] getSafeArea() {
        /*
            r7 = this;
            r0 = 4
            int[] r0 = new int[r0]
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            r4 = 0
            if (r2 >= r3) goto L10
            return r4
        L10:
            android.app.Activity r2 = r7.getActivity()
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            android.view.WindowInsets r2 = com.adobe.air.AIRFileUtils$$ExternalSyntheticApiModelOutline2.m(r2)
            if (r2 != 0) goto L23
            return r4
        L23:
            android.view.DisplayCutout r2 = androidx.core.util.HalfKt$$ExternalSyntheticApiModelOutline0.m110m(r2)
            if (r2 == 0) goto L59
            int r3 = com.adobe.air.AIRFileUtils$$ExternalSyntheticApiModelOutline2.m(r2)
            int r4 = com.adobe.air.AIRFileUtils$$ExternalSyntheticApiModelOutline2.m$1(r2)
            int r5 = com.adobe.air.AIRFileUtils$$ExternalSyntheticApiModelOutline2.m$2(r2)
            int r6 = com.adobe.air.AIRFileUtils$$ExternalSyntheticApiModelOutline2.m$3(r2)
            r1.set(r3, r4, r5, r6)
            r1 = 0
            int r3 = com.adobe.air.AIRFileUtils$$ExternalSyntheticApiModelOutline2.m(r2)
            r0[r1] = r3
            r1 = 1
            int r3 = com.adobe.air.AIRFileUtils$$ExternalSyntheticApiModelOutline2.m$1(r2)
            r0[r1] = r3
            r1 = 2
            int r3 = com.adobe.air.AIRFileUtils$$ExternalSyntheticApiModelOutline2.m$2(r2)
            r0[r1] = r3
            r1 = 3
            int r2 = com.adobe.air.AIRFileUtils$$ExternalSyntheticApiModelOutline2.m$3(r2)
            r0[r1] = r2
            return r0
        L59:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.AndroidActivityWrapper.getSafeArea():int[]");
    }

    /* loaded from: classes.dex */
    public static final class AsyncEntryDetails {
        public Object _args;
        public Entrypoints.AsyncEntryHandler _h;
        public Method _m;
        public Object _mutex;
        public boolean _result;

        public AsyncEntryDetails(Entrypoints.AsyncEntryHandler asyncEntryHandler, Method method, Object obj) {
            this(asyncEntryHandler, method, obj, null);
        }

        public AsyncEntryDetails(Entrypoints.AsyncEntryHandler asyncEntryHandler, Method method, Object obj, Object obj2) {
            this._h = asyncEntryHandler;
            this._m = method;
            this._args = obj;
            this._mutex = obj2;
        }

        public void apply() {
            this._result = this._h.wrapperInvokeMethod(this._m, this._args);
            Object obj = this._mutex;
            if (obj != null) {
                obj.notify();
            }
        }

        public boolean getResult() {
            Object obj = this._mutex;
            if (obj != null) {
                try {
                    obj.wait();
                } catch (InterruptedException unused) {
                }
            }
            return this._result;
        }
    }

    @Override // com.adobe.air.Entrypoints.AsyncEntryHandler
    public boolean wrapperInvokeMethod(Method method, Object obj) {
        Boolean bool;
        try {
            Object[] objArr = (Object[]) obj;
            if (obj == null) {
                bool = method.invoke(this, new Object[0]);
            } else {
                int length = objArr.length;
                if (length == 1) {
                    bool = method.invoke(this, objArr[0]);
                } else if (length == 2) {
                    bool = method.invoke(this, objArr[0], objArr[1]);
                } else if (length != 3) {
                    bool = length != 4 ? method.invoke(this, obj) : method.invoke(this, objArr[0], objArr[1], objArr[2], objArr[3]);
                } else {
                    bool = method.invoke(this, objArr[0], objArr[1], objArr[2]);
                }
            }
        } catch (Exception e) {
            Log.e("AdobeAIR", "Exception when invoking activity wrapper method asynchronously: " + e.toString());
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private void sendActivateEvent() {
        Handler asyncHandler = Entrypoints.getAsyncHandler();
        if (asyncHandler == null) {
            nativeActivateEvent();
            return;
        }
        try {
            Message obtain = Message.obtain();
            obtain.what = customHandler.ACTIVITY_WRAPPER_MSG_ID;
            obtain.obj = new AsyncEntryDetails(this, getClass().getDeclaredMethod("nativeActivateEvent", new Class[0]), null);
            asyncHandler.sendMessage(obtain);
        } catch (NoSuchMethodException e) {
            Log.e("AdobeAIR", "No such method for activate event: " + e.toString());
        }
    }

    private void sendDeactivateEvent() {
        Handler asyncHandler = Entrypoints.getAsyncHandler();
        if (asyncHandler == null) {
            nativeDeactivateEvent();
            return;
        }
        try {
            Message obtain = Message.obtain();
            obtain.what = customHandler.ACTIVITY_WRAPPER_MSG_ID;
            obtain.obj = new AsyncEntryDetails(this, getClass().getDeclaredMethod("nativeDeactivateEvent", new Class[0]), null);
            asyncHandler.sendMessage(obtain);
        } catch (NoSuchMethodException e) {
            Log.e("AdobeAIR", "No such method for deactivate event: " + e.toString());
        }
    }

    private void sendOnFocusListener(boolean z) {
        Handler asyncHandler = Entrypoints.getAsyncHandler();
        if (asyncHandler == null) {
            nativeOnFocusListener(z);
            return;
        }
        try {
            Message obtain = Message.obtain();
            obtain.what = customHandler.ACTIVITY_WRAPPER_MSG_ID;
            obtain.obj = new AsyncEntryDetails(this, getClass().getDeclaredMethod("nativeOnFocusListener", Boolean.TYPE), new Object[]{Boolean.valueOf(z)});
            asyncHandler.sendMessage(obtain);
        } catch (NoSuchMethodException e) {
            Log.e("AdobeAIR", "No such method for onfocussed event: " + e.toString());
        }
    }

    private void sendLowMemoryEvent() {
        Handler asyncHandler = Entrypoints.getAsyncHandler();
        if (asyncHandler == null) {
            nativeLowMemoryEvent();
            return;
        }
        try {
            Message obtain = Message.obtain();
            obtain.what = customHandler.ACTIVITY_WRAPPER_MSG_ID;
            obtain.obj = new AsyncEntryDetails(this, getClass().getDeclaredMethod("nativeLowMemoryEvent", new Class[0]), null);
            asyncHandler.sendMessage(obtain);
        } catch (NoSuchMethodException e) {
            Log.e("AdobeAIR", "No such method for low memory event: " + e.toString());
        }
    }

    private void sendNotifyPermissionRequestResult(int i, int i2) {
        Handler asyncHandler = Entrypoints.getAsyncHandler();
        if (asyncHandler == null) {
            nativeNotifyPermissionRequestResult(i, i2);
            return;
        }
        try {
            Message obtain = Message.obtain();
            obtain.what = customHandler.ACTIVITY_WRAPPER_MSG_ID;
            obtain.obj = new AsyncEntryDetails(this, getClass().getDeclaredMethod("nativeNotifyPermissionRequestResult", Integer.TYPE, Integer.TYPE), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            asyncHandler.sendMessage(obtain);
        } catch (NoSuchMethodException e) {
            Log.e("AdobeAIR", "No such method for notify permission request result: " + e.toString());
        }
    }

    private void sendSendInvokeEventWithData(String str, String str2, int i) {
        Handler asyncHandler = Entrypoints.getAsyncHandler();
        if (asyncHandler == null) {
            nativeSendInvokeEventWithData(str, str2, i);
            return;
        }
        try {
            Message obtain = Message.obtain();
            obtain.what = customHandler.ACTIVITY_WRAPPER_MSG_ID;
            obtain.obj = new AsyncEntryDetails(this, getClass().getDeclaredMethod("nativeSendInvokeEventWithData", String.class, String.class, Integer.TYPE), new Object[]{str, str2, Integer.valueOf(i)});
            asyncHandler.sendMessage(obtain);
        } catch (NoSuchMethodException e) {
            Log.e("AdobeAIR", "No such method for send invoke event with data: " + e.toString());
        }
    }
}
