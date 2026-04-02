package com.adobe.air;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import com.adobe.air.AndroidActivityWrapper;
import com.adobe.air.utils.Utils;
import com.harman.services.AIRRuntimeCheck;
import java.io.File;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class Entrypoints implements Runnable {
    private static final int MSG_ENTRYMAINWRAPPER = 1;
    private static final int MSG_QUIT = 2;
    static boolean mCallEntryMain;
    private static String mLibCorePath;
    public static Context s_context;
    private static String s_packageName;
    private Object _activityWrapper;
    private Object _app;
    private Object _appInfo;
    private String _appRootDir;
    private String _appXmlPath;
    private Object _context;
    private String _extraArgs;
    private boolean _isADL;
    private boolean _isDebuggerMode;
    private Object _mainView;
    private String _runtimePackageName;
    private static customHandler mMainHandler = new customHandler();
    private static Handler mEntryPointHandler = null;

    /* loaded from: classes.dex */
    public interface AsyncEntryHandler {
        boolean wrapperInvokeMethod(Method method, Object obj);
    }

    public native void EntryDownloadConfigNative(Object obj, String str);

    public native String EntryGetRuntimeDetails();

    public native void EntryLifecycleChange(int i);

    public native void EntryMainWrapper(String str, String str2, String str3, String str4, Object obj, Object obj2, Object obj3, Object obj4, boolean z, boolean z2);

    public native void EntryStopRuntimeNative();

    public native void applyDownloadedConfig();

    public native boolean checkSplashScreen(String str, String str2, String str3);

    public native void setMainViewOnCreate(AIRWindowSurfaceView aIRWindowSurfaceView);

    public static Handler getMainHandler() {
        return mMainHandler;
    }

    public static Handler getAsyncHandler() {
        if (mEntryPointHandler == null || Looper.myLooper() == mEntryPointHandler.getLooper()) {
            return null;
        }
        return mEntryPointHandler;
    }

    public static void registerCallback(int i, int i2, int i3, Handler handler) {
        if (handler == null && (handler = mEntryPointHandler) == null) {
            handler = mMainHandler;
        }
        Message obtain = Message.obtain();
        obtain.what = customHandler.TIME_OUT_MSG_ID;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        if (i > 0) {
            handler.sendMessageDelayed(obtain, i);
        } else {
            handler.sendMessage(obtain);
        }
    }

    public static boolean registerTouchCallback(int i, TouchEventData touchEventData, Handler handler) {
        if (handler == null && (handler = mEntryPointHandler) == null) {
            handler = mMainHandler;
        }
        Message obtain = Message.obtain();
        obtain.what = customHandler.TOUCH_MSG_ID;
        obtain.obj = touchEventData;
        if (i > 0) {
            handler.sendMessageDelayed(obtain, i);
            return true;
        }
        handler.sendMessage(obtain);
        return true;
    }

    public static boolean registerKeyCallback(int i, KeyEventData keyEventData, Handler handler) {
        if (handler == null && (handler = mEntryPointHandler) == null) {
            handler = mMainHandler;
        }
        Message obtain = Message.obtain();
        obtain.what = customHandler.KEY_MSG_ID;
        obtain.obj = keyEventData;
        if (i > 0) {
            handler.sendMessageDelayed(obtain, i);
            return true;
        }
        handler.sendMessage(obtain);
        return true;
    }

    public static boolean registerPanningCallback(int i, PanEventData panEventData, Handler handler) {
        if (handler == null && (handler = mEntryPointHandler) == null) {
            handler = mMainHandler;
        }
        Message obtain = Message.obtain();
        obtain.what = customHandler.PAN_MSG_ID;
        obtain.obj = panEventData;
        if (i > 0) {
            handler.sendMessageDelayed(obtain, i);
            return true;
        }
        handler.sendMessage(obtain);
        return true;
    }

    public static boolean registerWindowCallback(int i, WindowEventData windowEventData, Handler handler) {
        if (handler == null && (handler = mEntryPointHandler) == null) {
            handler = mMainHandler;
        }
        Message obtain = Message.obtain();
        obtain.what = customHandler.WINDOW_MSG_ID;
        obtain.obj = windowEventData;
        if (i > 0) {
            handler.sendMessageDelayed(obtain, i);
            return true;
        }
        handler.sendMessage(obtain);
        return true;
    }

    public static boolean registerCertificateCallback(int i, CertificateEventData certificateEventData, Handler handler) {
        if (handler == null && (handler = mEntryPointHandler) == null) {
            handler = mMainHandler;
        }
        Message obtain = Message.obtain();
        obtain.what = customHandler.CERTIFICATE_MSG_ID;
        obtain.obj = certificateEventData;
        if (i > 0) {
            handler.sendMessageDelayed(obtain, i);
            return true;
        }
        handler.sendMessage(obtain);
        return true;
    }

    public static void BroadcastIntent(String str, String str2) {
        AndroidActivityWrapper.GetAndroidActivityWrapper().BroadcastIntent(str, str2);
    }

    public void EntryMain(String str, String str2, String str3, String str4, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, boolean z2) {
        s_context = (Context) obj4;
        s_packageName = ((ApplicationInfo) obj3).packageName;
        Log.i("AIR RUNTIME", EntryGetRuntimeDetails());
        if (mCallEntryMain) {
            return;
        }
        mCallEntryMain = true;
        if (str2.length() <= 0 || str.length() <= 0) {
            return;
        }
        if (AIRRuntimeCheck.shouldRunInAsyncMode()) {
            Log.i("AIR RUNTIME", "Starting in asynchronous mode");
            AndroidActivityWrapper.GetAndroidActivityWrapper().setUpAsyncMode();
            this._appXmlPath = str;
            this._appRootDir = str2;
            this._extraArgs = str3;
            this._runtimePackageName = str4;
            this._mainView = obj;
            this._app = obj2;
            this._appInfo = obj3;
            this._context = obj4;
            this._activityWrapper = obj5;
            this._isADL = z;
            this._isDebuggerMode = z2;
            new Thread(this).start();
            return;
        }
        Log.i("AIR RUNTIME", "Starting in synchronous mode");
        EntryMainWrapper(str, str2, str3, str4, obj, obj2, obj4, obj5, z, z2);
    }

    public String GetLibCorePath() {
        if (mLibCorePath == null) {
            mLibCorePath = Utils.GetLibCorePath(s_context);
        }
        return mLibCorePath;
    }

    public boolean EntryDownloadConfig(Object obj, String str) {
        Context context = (Context) obj;
        s_context = context;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String str2 = applicationInfo.packageName;
        s_packageName = str2;
        ApplicationFileManager.setAndroidPackageName(str2);
        ApplicationFileManager.setAndroidAPKPath(applicationInfo.sourceDir);
        File cacheDir = s_context.getCacheDir();
        if (cacheDir == null) {
            return false;
        }
        ApplicationFileManager.processAndroidDataPath(cacheDir.getAbsolutePath());
        System.load(Utils.GetLibSTLPath(s_context));
        System.load(GetLibCorePath());
        EntryDownloadConfigNative(obj, str);
        return true;
    }

    public void EntryApplyDownloadedConfig() {
        applyDownloadedConfig();
    }

    public void EntryStopRuntime() {
        System.load(GetLibCorePath());
        EntryStopRuntimeNative();
    }

    public void setMainView(View view) {
        setMainViewOnCreate((AIRWindowSurfaceView) view);
    }

    public static String getPackageName() {
        return s_packageName;
    }

    public static String getAppCacheDirectory() {
        return s_context.getCacheDir().getAbsolutePath();
    }

    public static String getRuntimeDataDirectory() {
        return s_context.getApplicationInfo().dataDir + "/";
    }

    @Override // java.lang.Runnable
    public void run() {
        Looper.prepare();
        mEntryPointHandler = new Handler(Looper.myLooper()) { // from class: com.adobe.air.Entrypoints.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 2) {
                    Looper.myLooper().quit();
                } else if (i == 1123) {
                    ((WindowEventData) message.obj).run();
                } else if (i != 1125) {
                    switch (i) {
                        case customHandler.TIME_OUT_MSG_ID /* 1119 */:
                            Entrypoints.mMainHandler.callTimeoutFunction(message.arg1, message.arg2);
                            return;
                        case customHandler.TOUCH_MSG_ID /* 1120 */:
                            TouchEventData touchEventData = (TouchEventData) message.obj;
                            Entrypoints.mMainHandler.nativeOnTouchCallback(touchEventData.mTouchEventType, touchEventData.mXCoord, touchEventData.mYCoord, touchEventData.mPressure, touchEventData.mPointerID, touchEventData.mContactX, touchEventData.mContactY, touchEventData.mIsPrimaryPoint, touchEventData.mHistory, touchEventData.mMetaState);
                            return;
                        case customHandler.KEY_MSG_ID /* 1121 */:
                            KeyEventData keyEventData = (KeyEventData) message.obj;
                            Entrypoints.mMainHandler.nativeOnKeyCallback(keyEventData.mKeyAction, keyEventData.mKeyCode, keyEventData.mUnicode, keyEventData.mAlt, keyEventData.mShift, keyEventData.mSym);
                            return;
                        default:
                            return;
                    }
                } else {
                    ((AndroidActivityWrapper.AsyncEntryDetails) message.obj).apply();
                }
            }
        };
        EntryMainWrapper(this._appXmlPath, this._appRootDir, this._extraArgs, this._runtimePackageName, this._mainView, this._app, this._context, this._activityWrapper, this._isADL, this._isDebuggerMode);
        AndroidActivityWrapper.GetAndroidActivityWrapper().sendUIMessage(1);
        Looper.loop();
    }

    public void quit() {
        Message.obtain(mEntryPointHandler, 2).sendToTarget();
    }
}
