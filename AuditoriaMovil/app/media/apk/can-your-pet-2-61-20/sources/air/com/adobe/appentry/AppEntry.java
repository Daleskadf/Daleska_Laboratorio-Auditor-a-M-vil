package air.com.adobe.appentry;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.adobe.air.InstallOfferPingUtils;
import com.adobe.air.ResourceIdMap;
import dalvik.system.DexClassLoader;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.List;
/* loaded from: classes.dex */
public class AppEntry extends Activity {
    private static String AIR_PING_URL = "https://airdownload2.adobe.com/air?";
    private static final String LOG_TAG = "AppEntry";
    private static final String RESOURCE_BUTTON_EXIT = "string.button_exit";
    private static final String RESOURCE_BUTTON_INSTALL = "string.button_install";
    private static final String RESOURCE_CLASS = "air.com.adobe.appentry.R";
    private static final String RESOURCE_TEXT_RUNTIME_REQUIRED = "string.text_runtime_required";
    private static final String RESOURCE_TITLE_ADOBE_AIR = "string.title_adobe_air";
    private static String RUNTIME_PACKAGE_ID = "com.adobe.air";
    private static Class<?> sAndroidActivityWrapperClass = null;
    private static DexClassLoader sDloader = null;
    private static boolean sRuntimeClassesLoaded = false;
    private static AppEntry sThis;
    private Object sAndroidActivityWrapper = null;

    private void BroadcastIntent(String str, String str2) {
        try {
            startActivity(Intent.parseUri(str2, 0).setAction(str).addFlags(268435456));
        } catch (ActivityNotFoundException | URISyntaxException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchMarketPlaceForAIR() {
        String str = null;
        try {
            Bundle bundle = getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
            if (bundle != null) {
                str = (String) bundle.get("airDownloadURL");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (str == null) {
            str = "market://details?id=" + RUNTIME_PACKAGE_ID;
        }
        try {
            BroadcastIntent("android.intent.action.VIEW", str);
        } catch (Exception unused2) {
        }
    }

    private boolean isRuntimeInstalled() {
        try {
            getPackageManager().getPackageInfo(RUNTIME_PACKAGE_ID, 256);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private boolean isRuntimeOnExternalStorage() {
        try {
            return (getPackageManager().getApplicationInfo(RUNTIME_PACKAGE_ID, 8192).flags & 262144) == 262144;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private void showDialog(int i, String str, int i2, int i3) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(i);
        builder.setMessage(str);
        builder.setPositiveButton(i2, new DialogInterface.OnClickListener() { // from class: air.com.adobe.appentry.AppEntry.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                AppEntry.this.launchMarketPlaceForAIR();
                InstallOfferPingUtils.PingAndExit(AppEntry.sThis, AppEntry.AIR_PING_URL, true, false, true);
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: air.com.adobe.appentry.AppEntry.2
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                InstallOfferPingUtils.PingAndExit(AppEntry.sThis, AppEntry.AIR_PING_URL, false, false, true);
            }
        });
        builder.show();
    }

    private void showRuntimeNotInstalledDialog() {
        ResourceIdMap resourceIdMap = new ResourceIdMap(RESOURCE_CLASS);
        showDialog(resourceIdMap.getId(RESOURCE_TITLE_ADOBE_AIR), getString(resourceIdMap.getId(RESOURCE_TEXT_RUNTIME_REQUIRED)) + getString(resourceIdMap.getId("string.text_install_runtime")), resourceIdMap.getId(RESOURCE_BUTTON_INSTALL), resourceIdMap.getId(RESOURCE_BUTTON_EXIT));
    }

    private void showRuntimeOnExternalStorageDialog() {
        ResourceIdMap resourceIdMap = new ResourceIdMap(RESOURCE_CLASS);
        showDialog(resourceIdMap.getId(RESOURCE_TITLE_ADOBE_AIR), getString(resourceIdMap.getId(RESOURCE_TEXT_RUNTIME_REQUIRED)) + getString(resourceIdMap.getId("string.text_runtime_on_external_storage")), resourceIdMap.getId(RESOURCE_BUTTON_INSTALL), resourceIdMap.getId(RESOURCE_BUTTON_EXIT));
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        List<ActivityManager.AppTask> appTasks;
        super.onCreate(bundle);
        AppEntry appEntry = sThis;
        if (appEntry != null) {
            appEntry.onDestroy();
            ActivityManager activityManager = (ActivityManager) getSystemService("activity");
            if (activityManager != null && (appTasks = activityManager.getAppTasks()) != null && appTasks.size() == 2) {
                appTasks.get(1).finishAndRemoveTask();
            }
        }
        sThis = this;
        long time = new Date().getTime();
        Log.i("StartupTime1", ":" + time);
        Log.i("AIR VERSION", ":" + GetVersionCode.AIR_BUILD_VERSION);
        Log.i("DEVICE ARCH", ":" + GetVersionCode.getAbi());
        boolean loadCaptiveRuntimeClasses = loadCaptiveRuntimeClasses();
        if (!loadCaptiveRuntimeClasses) {
            if (!sRuntimeClassesLoaded && !isRuntimeInstalled()) {
                if (isRuntimeOnExternalStorage()) {
                    showRuntimeOnExternalStorageDialog();
                    return;
                } else {
                    showRuntimeNotInstalledDialog();
                    return;
                }
            }
            loadSharedRuntimeDex();
        }
        if (sRuntimeClassesLoaded) {
            createActivityWrapper(loadCaptiveRuntimeClasses);
            InvokeWrapperOnCreate();
        } else if (loadCaptiveRuntimeClasses) {
            KillSelf();
        } else {
            launchAIRService();
        }
    }

    private void registerForNotifications() {
        Intent intent = new Intent("com.adobe.air.AndroidGcmRegistrationService");
        intent.setClassName(RUNTIME_PACKAGE_ID, "com.adobe.air.AndroidGcmRegistrationService");
        startService(intent);
    }

    private void launchAIRService() {
        try {
            Intent intent = new Intent("com.adobe.air.AIRServiceAction");
            intent.setClassName(RUNTIME_PACKAGE_ID, "com.adobe.air.AIRService");
            bindService(intent, new ServiceConnection() { // from class: air.com.adobe.appentry.AppEntry.3
                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                }

                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    AppEntry.this.unbindService(this);
                    AppEntry.this.loadSharedRuntimeDex();
                    AppEntry.this.createActivityWrapper(false);
                    if (AppEntry.sRuntimeClassesLoaded) {
                        AppEntry.this.InvokeWrapperOnCreate();
                    } else {
                        AppEntry.KillSelf();
                    }
                }
            }, 1);
        } catch (Exception unused) {
        }
    }

    public static Boolean inDebuggerMode() {
        return new Boolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void InvokeWrapperOnCreate() {
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onCreate", Activity.class, String[].class), this, new String[]{"", "", "-nodebug", new Boolean(false).toString(), inDebuggerMode().toString()});
        } catch (Exception unused) {
        }
    }

    private Object InvokeMethod(Method method, Object... objArr) {
        Object obj;
        Object invoke;
        Object obj2 = null;
        if (sRuntimeClassesLoaded && (obj = this.sAndroidActivityWrapper) != null) {
            try {
                if (objArr != null) {
                    invoke = method.invoke(obj, objArr);
                } else {
                    invoke = method.invoke(obj, new Object[0]);
                }
                obj2 = invoke;
                return obj2;
            } catch (Exception unused) {
                return obj2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void KillSelf() {
        Process.killProcess(Process.myPid());
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        try {
            if (sRuntimeClassesLoaded) {
                InvokeMethod(sAndroidActivityWrapperClass.getMethod("onRestart", new Class[0]), new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            if (sRuntimeClassesLoaded) {
                InvokeMethod(sAndroidActivityWrapperClass.getMethod("onPause", new Class[0]), new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            if (sRuntimeClassesLoaded) {
                InvokeMethod(sAndroidActivityWrapperClass.getMethod("onResume", new Class[0]), new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onStop", new Class[0]), new Object[0]);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onDestroy", new Class[0]), new Object[0]);
        } catch (Exception unused) {
        }
        sThis = null;
        this.sAndroidActivityWrapper = null;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onConfigurationChanged", Configuration.class), configuration);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("dispatchKeyEvent", KeyEvent.class, Boolean.TYPE), keyEvent, false);
        } catch (Exception unused) {
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("dispatchGenericMotionEvent", MotionEvent.class, Boolean.TYPE), motionEvent, false);
        } catch (Exception unused) {
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onLowMemory", new Class[0]), new Object[0]);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        try {
            if (sRuntimeClassesLoaded) {
                InvokeMethod(sAndroidActivityWrapperClass.getMethod("onActivityResult", Integer.TYPE, Integer.TYPE, Intent.class), Integer.valueOf(i), Integer.valueOf(i2), intent);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onNewIntent", Intent.class), intent);
        } catch (Exception unused) {
        }
    }

    private boolean loadCaptiveRuntimeClasses() {
        boolean z = false;
        try {
            Class<?> cls = Class.forName("com.adobe.air.AndroidActivityWrapper");
            sAndroidActivityWrapperClass = cls;
            z = true;
            if (cls != null) {
                sRuntimeClassesLoaded = true;
            }
        } catch (Exception unused) {
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadSharedRuntimeDex() {
        try {
            if (sRuntimeClassesLoaded) {
                return;
            }
            DexClassLoader dexClassLoader = new DexClassLoader(RUNTIME_PACKAGE_ID, getFilesDir().getAbsolutePath(), null, createPackageContext(RUNTIME_PACKAGE_ID, 3).getClassLoader());
            sDloader = dexClassLoader;
            Class<?> loadClass = dexClassLoader.loadClass("com.adobe.air.AndroidActivityWrapper");
            sAndroidActivityWrapperClass = loadClass;
            if (loadClass != null) {
                sRuntimeClassesLoaded = true;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createActivityWrapper(boolean z) {
        try {
            if (z) {
                this.sAndroidActivityWrapper = sAndroidActivityWrapperClass.getMethod("CreateAndroidActivityWrapper", Activity.class, Boolean.class, Boolean.class).invoke(null, this, Boolean.valueOf(z), inDebuggerMode());
            } else {
                this.sAndroidActivityWrapper = sAndroidActivityWrapperClass.getMethod("CreateAndroidActivityWrapper", Activity.class).invoke(null, this);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void finishActivityFromChild(Activity activity, int i) {
        super.finishActivityFromChild(activity, i);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("finishActivityFromChild", Activity.class, Integer.TYPE), activity, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void finishFromChild(Activity activity) {
        super.finishFromChild(activity);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("finishFromChild", Activity.class), activity);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onAttachedToWindow", new Class[0]), new Object[0]);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onBackPressed", new Class[0]), new Object[0]);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        super.onContentChanged();
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onContentChanged", new Class[0]), new Object[0]);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(MenuItem menuItem) {
        boolean onContextItemSelected = super.onContextItemSelected(menuItem);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onContextItemSelected", MenuItem.class, Boolean.TYPE), menuItem, Boolean.valueOf(onContextItemSelected))).booleanValue();
        } catch (Exception unused) {
            return onContextItemSelected;
        }
    }

    @Override // android.app.Activity
    public void onContextMenuClosed(Menu menu) {
        super.onContextMenuClosed(menu);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onContextMenuClosed", Menu.class), menu);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onCreateContextMenu", ContextMenu.class, View.class, ContextMenu.ContextMenuInfo.class), contextMenu, view, contextMenuInfo);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public CharSequence onCreateDescription() {
        CharSequence onCreateDescription = super.onCreateDescription();
        try {
            return (CharSequence) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onCreateDescription", CharSequence.class), onCreateDescription);
        } catch (Exception unused) {
            return onCreateDescription;
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onCreateOptionsMenu", Menu.class, Boolean.TYPE), menu, Boolean.valueOf(onCreateOptionsMenu))).booleanValue();
        } catch (Exception unused) {
            return onCreateOptionsMenu;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onCreatePanelMenu", Integer.TYPE, Menu.class, Boolean.TYPE), Integer.valueOf(i), menu, Boolean.valueOf(onCreatePanelMenu))).booleanValue();
        } catch (Exception unused) {
            return onCreatePanelMenu;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public View onCreatePanelView(int i) {
        View onCreatePanelView = super.onCreatePanelView(i);
        try {
            return (View) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onCreatePanelView", Integer.TYPE, View.class), Integer.valueOf(i), onCreatePanelView);
        } catch (Exception unused) {
            return onCreatePanelView;
        }
    }

    @Override // android.app.Activity
    public boolean onCreateThumbnail(Bitmap bitmap, Canvas canvas) {
        boolean onCreateThumbnail = super.onCreateThumbnail(bitmap, canvas);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onCreateThumbnail", Bitmap.class, Canvas.class, Boolean.TYPE), bitmap, canvas, Boolean.valueOf(onCreateThumbnail))).booleanValue();
        } catch (Exception unused) {
            return onCreateThumbnail;
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = super.onCreateView(str, context, attributeSet);
        try {
            return (View) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onCreateView", String.class, Context.class, AttributeSet.class, View.class), str, context, attributeSet, onCreateView);
        } catch (Exception unused) {
            return onCreateView;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onDetachedFromWindow", new Class[0]), new Object[0]);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean onKeyDown = super.onKeyDown(i, keyEvent);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onKeyDown", Integer.TYPE, KeyEvent.class, Boolean.TYPE), Integer.valueOf(i), keyEvent, Boolean.valueOf(onKeyDown))).booleanValue();
        } catch (Exception unused) {
            return onKeyDown;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        boolean onKeyLongPress = super.onKeyLongPress(i, keyEvent);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onKeyLongPress", Integer.TYPE, KeyEvent.class, Boolean.TYPE), Integer.valueOf(i), keyEvent, Boolean.valueOf(onKeyLongPress))).booleanValue();
        } catch (Exception unused) {
            return onKeyLongPress;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        boolean onKeyMultiple = super.onKeyMultiple(i, i2, keyEvent);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onKeyMultiple", Integer.TYPE, Integer.TYPE, KeyEvent.class, Boolean.TYPE), Integer.valueOf(i), Integer.valueOf(i2), keyEvent, Boolean.valueOf(onKeyMultiple))).booleanValue();
        } catch (Exception unused) {
            return onKeyMultiple;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        boolean onKeyUp = super.onKeyUp(i, keyEvent);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onKeyUp", Integer.TYPE, KeyEvent.class, Boolean.TYPE), Integer.valueOf(i), keyEvent, Boolean.valueOf(onKeyUp))).booleanValue();
        } catch (Exception unused) {
            return onKeyUp;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        boolean onMenuItemSelected = super.onMenuItemSelected(i, menuItem);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onMenuItemSelected", Integer.TYPE, MenuItem.class, Boolean.TYPE), Integer.valueOf(i), menuItem, Boolean.valueOf(onMenuItemSelected))).booleanValue();
        } catch (Exception unused) {
            return onMenuItemSelected;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        boolean onMenuOpened = super.onMenuOpened(i, menu);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onMenuOpened", Integer.TYPE, Menu.class, Boolean.TYPE), Integer.valueOf(i), menu, Boolean.valueOf(onMenuOpened))).booleanValue();
        } catch (Exception unused) {
            return onMenuOpened;
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onOptionsItemSelected", MenuItem.class, Boolean.TYPE), menuItem, Boolean.valueOf(onOptionsItemSelected))).booleanValue();
        } catch (Exception unused) {
            return onOptionsItemSelected;
        }
    }

    @Override // android.app.Activity
    public void onOptionsMenuClosed(Menu menu) {
        super.onOptionsMenuClosed(menu);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onOptionsMenuClosed", Menu.class), menu);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onPanelClosed", Integer.TYPE, Menu.class), Integer.valueOf(i), menu);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        boolean onPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onPrepareOptionsMenu", Menu.class, Boolean.TYPE), menu, Boolean.valueOf(onPrepareOptionsMenu))).booleanValue();
        } catch (Exception unused) {
            return onPrepareOptionsMenu;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onPreparePanel", Integer.TYPE, View.class, Menu.class, Boolean.TYPE), Integer.valueOf(i), view, menu, Boolean.valueOf(onPreparePanel))).booleanValue();
        } catch (Exception unused) {
            return onPreparePanel;
        }
    }

    @Override // android.app.Activity
    public Object onRetainNonConfigurationInstance() {
        Object onRetainNonConfigurationInstance = super.onRetainNonConfigurationInstance();
        try {
            return InvokeMethod(sAndroidActivityWrapperClass.getMethod("onRetainNonConfigurationInstance", Object.class), onRetainNonConfigurationInstance);
        } catch (Exception unused) {
            return onRetainNonConfigurationInstance;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        boolean onSearchRequested = super.onSearchRequested();
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onSearchRequested", Boolean.TYPE), Boolean.valueOf(onSearchRequested))).booleanValue();
        } catch (Exception unused) {
            return onSearchRequested;
        }
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onTouchEvent", MotionEvent.class, Boolean.TYPE), motionEvent, Boolean.valueOf(onTouchEvent))).booleanValue();
        } catch (Exception unused) {
            return onTouchEvent;
        }
    }

    @Override // android.app.Activity
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        boolean onTrackballEvent = super.onTrackballEvent(motionEvent);
        try {
            return ((Boolean) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onTrackballEvent", MotionEvent.class, Boolean.TYPE), motionEvent, Boolean.valueOf(onTrackballEvent))).booleanValue();
        } catch (Exception unused) {
            return onTrackballEvent;
        }
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        super.onUserInteraction();
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onUserInteraction", new Class[0]), new Object[0]);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        super.onWindowAttributesChanged(layoutParams);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onWindowAttributesChanged", WindowManager.LayoutParams.class), layoutParams);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onWindowFocusChanged", Boolean.TYPE), Boolean.valueOf(z));
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper
    protected void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        super.onApplyThemeResource(theme, i, z);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onApplyThemeResource", Resources.Theme.class, Integer.TYPE, Boolean.TYPE), theme, Integer.valueOf(i), Boolean.valueOf(z));
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onChildTitleChanged(Activity activity, CharSequence charSequence) {
        super.onChildTitleChanged(activity, charSequence);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onChildTitleChanged", Activity.class, CharSequence.class), activity, charSequence);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int i) {
        Dialog onCreateDialog = super.onCreateDialog(i);
        try {
            return (Dialog) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onCreateDialog", Integer.TYPE, Dialog.class), Integer.valueOf(i), onCreateDialog);
        } catch (Exception unused) {
            return onCreateDialog;
        }
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int i, Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(i, bundle);
        try {
            return (Dialog) InvokeMethod(sAndroidActivityWrapperClass.getMethod("onCreateDialog", Integer.TYPE, Bundle.class, Dialog.class), Integer.valueOf(i), bundle, onCreateDialog);
        } catch (Exception unused) {
            return onCreateDialog;
        }
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onPostCreate", Bundle.class), bundle);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onPostResume", new Class[0]), new Object[0]);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onPrepareDialog(int i, Dialog dialog) {
        super.onPrepareDialog(i, dialog);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onPrepareDialog", R.id.class, Dialog.class), Integer.valueOf(i), dialog);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onPrepareDialog(int i, Dialog dialog, Bundle bundle) {
        super.onPrepareDialog(i, dialog, bundle);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onPrepareDialog", R.id.class, Dialog.class, Bundle.class), Integer.valueOf(i), dialog, bundle);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onRestoreInstanceState", Bundle.class), bundle);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onSaveInstanceState", Bundle.class), bundle);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onTitleChanged", CharSequence.class, Integer.TYPE), charSequence, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onUserLeaveHint", new Class[0]), new Object[0]);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            InvokeMethod(sAndroidActivityWrapperClass.getMethod("onRequestPermissionsResult", Integer.TYPE, String[].class, int[].class), Integer.valueOf(i), strArr, iArr);
        } catch (Exception unused) {
        }
    }
}
