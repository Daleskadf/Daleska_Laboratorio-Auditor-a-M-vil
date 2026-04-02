package com.distriqt.extension.packagemanager.controller;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Base64;
import com.adobe.air.wand.view.CompanionView;
import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.DebugUtil;
import com.distriqt.core.utils.FileProviderUtils;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.packagemanager.content.PackageManagerFileProvider;
import com.distriqt.extension.packagemanager.events.PackageManagerEvent;
import com.distriqt.extension.packagemanager.receivers.NotificationDispatch;
import com.distriqt.extension.packagemanager.receivers.PackageManagerNotificationStore;
import com.distriqt.extension.packagemanager.receivers.PackageManagerReceiver;
import com.distriqt.extension.packagemanager.utils.Errors;
import com.distriqt.extension.packagemanager.utils.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class PackageManagerController extends ActivityStateListener {
    private static final String PLAY_STORE_PACKAGE = "com.android.vending";
    public static final int RC_INSTALL_APPLICATION = 46552;
    public static final String TAG = "PackageManagerController";
    private IExtensionContext _extContext;
    private PackageManagerReceiver _receiver = null;
    private Handler _handler = new Handler(Looper.getMainLooper());

    public PackageManagerController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }

    public void dispose() {
        IExtensionContext iExtensionContext = this._extContext;
        if (iExtensionContext != null) {
            if (this._receiver != null) {
                iExtensionContext.getActivity().unregisterReceiver(this._receiver);
                this._receiver = null;
            }
            this._extContext = null;
        }
    }

    public boolean addEventListener(String str) {
        Logger.d(TAG, "addEventListener( %s )", str);
        try {
            PackageManagerNotificationStore packageManagerNotificationStore = new PackageManagerNotificationStore(this._extContext.getActivity());
            Iterator<NotificationDispatch> it = packageManagerNotificationStore.getNotificationForDispatch().iterator();
            while (it.hasNext()) {
                NotificationDispatch next = it.next();
                this._extContext.dispatchEvent(next.code, next.data);
            }
            packageManagerNotificationStore.clearNotificationForDispatch();
            if (!hasManifestReceiver(this._extContext.getActivity()) && this._receiver == null) {
                Logger.d(TAG, "addEventListener(): ADDING RUNTIME LISTENER", new Object[0]);
                this._receiver = new PackageManagerReceiver();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addDataScheme("package");
                this._extContext.getActivity().getApplicationContext().registerReceiver(this._receiver, intentFilter);
            }
            return true;
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    private boolean hasManifestReceiver(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent();
        intent.setAction("android.intent.action.PACKAGE_REMOVED");
        intent.setData(Uri.parse("package://"));
        for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(intent, 0)) {
            try {
                if (context.getPackageName().equals(resolveInfo.activityInfo.packageName) && resolveInfo.activityInfo.name.equals(PackageManagerReceiver.class.getName())) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public String getInstallerPackageName() {
        return this._extContext.getActivity().getPackageManager().getInstallerPackageName(this._extContext.getActivity().getPackageName());
    }

    public boolean wasInstalledFromPlayStore() {
        String installerPackageName = this._extContext.getActivity().getPackageManager().getInstallerPackageName(this._extContext.getActivity().getPackageName());
        return installerPackageName != null && installerPackageName.startsWith("com.android.vending");
    }

    public boolean validateSignature(String str) {
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] apkContentsSigners;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                signingInfo = this._extContext.getActivity().getPackageManager().getPackageInfo(this._extContext.getActivity().getPackageName(), CompanionView.kTouchMetaStateSideButton1).signingInfo;
                hasMultipleSigners = signingInfo.hasMultipleSigners();
                if (hasMultipleSigners) {
                    apkContentsSigners = signingInfo.getApkContentsSigners();
                    for (Signature signature : apkContentsSigners) {
                        if (matchSignature(str, signature)) {
                            return true;
                        }
                    }
                } else {
                    signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    for (Signature signature2 : signingCertificateHistory) {
                        if (matchSignature(str, signature2)) {
                            return true;
                        }
                    }
                }
            } else {
                PackageInfo packageInfo = this._extContext.getActivity().getPackageManager().getPackageInfo(this._extContext.getActivity().getPackageName(), 64);
                if (packageInfo.signatures.length > 1) {
                    return false;
                }
                for (Signature signature3 : packageInfo.signatures) {
                    if (matchSignature(str, signature3)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
        return false;
    }

    private boolean matchSignature(String str, Signature signature) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(signature.toByteArray());
            String bytesToHex = bytesToHex(messageDigest.digest());
            String encodeToString = Base64.encodeToString(messageDigest.digest(), 3);
            if (str.compareToIgnoreCase(bytesToHex) == 0) {
                return true;
            }
            return str.compareToIgnoreCase(encodeToString) == 0;
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    public static String bytesToHex(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            cArr2[i3] = cArr[i2 >>> 4];
            cArr2[i3 + 1] = cArr[i2 & 15];
        }
        return new String(cArr2);
    }

    public String getInstalledApplicationsAsync(final int i) {
        Logger.d(TAG, "getInstalledApplicationsAsync( %d )", Integer.valueOf(i));
        final String uuid = UUID.randomUUID().toString();
        this._handler.post(new Runnable() { // from class: com.distriqt.extension.packagemanager.controller.PackageManagerController$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                PackageManagerController.this.m303x3de7917d(i, uuid);
            }
        });
        return uuid;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$getInstalledApplicationsAsync$0$com-distriqt-extension-packagemanager-controller-PackageManagerController  reason: not valid java name */
    public /* synthetic */ void m303x3de7917d(int i, String str) {
        Logger.d(TAG, "getInstalledApplicationsAsync():run", new Object[0]);
        JSONArray installedApplicationsAsJSONArray = getInstalledApplicationsAsJSONArray(i);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("identifier", str);
            jSONObject.put("applications", installedApplicationsAsJSONArray);
        } catch (Exception e) {
            Errors.handleException(e);
        }
        this._extContext.dispatchEvent(PackageManagerEvent.GET_INSTALLED_APPLICATIONS, jSONObject.toString());
    }

    public String getInstalledApplicationsAsJSON(int i) {
        Logger.d(TAG, "getInstalledApplicationsAsJSON( %d )", Integer.valueOf(i));
        try {
            JSONArray installedApplicationsAsJSONArray = getInstalledApplicationsAsJSONArray(i);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applications", installedApplicationsAsJSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            Errors.handleException(e);
            return "{}";
        }
    }

    private JSONArray getInstalledApplicationsAsJSONArray(int i) {
        long longVersionCode;
        Logger.d(TAG, "getInstalledApplicationsAsJSONArray( %d )", Integer.valueOf(i));
        JSONArray jSONArray = new JSONArray();
        try {
            PackageManager packageManager = this._extContext.getActivity().getPackageManager();
            for (ApplicationInfo applicationInfo : packageManager.getInstalledApplications(1152)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("flags", applicationInfo.flags);
                if ((applicationInfo.flags & 1) == 1) {
                    jSONObject.put("type", "system");
                } else {
                    jSONObject.put("type", "user");
                }
                jSONObject.put("packageName", applicationInfo.packageName);
                jSONObject.put("permission", applicationInfo.permission);
                jSONObject.put("label", packageManager.getApplicationLabel(applicationInfo));
                PackageInfo packageInfo = packageManager.getPackageInfo(applicationInfo.packageName, 4096);
                if (packageInfo != null) {
                    jSONObject.put("versionName", packageInfo.versionName);
                    if (Build.VERSION.SDK_INT >= 28) {
                        longVersionCode = packageInfo.getLongVersionCode();
                        jSONObject.put("versionCode", longVersionCode);
                    } else {
                        jSONObject.put("versionCode", packageInfo.versionCode);
                    }
                    jSONObject.put("firstInstallTime", packageInfo.firstInstallTime);
                    jSONObject.put("lastUpdateTime", packageInfo.lastUpdateTime);
                    JSONArray jSONArray2 = new JSONArray();
                    String[] strArr = packageInfo.requestedPermissions;
                    if (strArr != null) {
                        for (String str : strArr) {
                            jSONArray2.put(str);
                        }
                    }
                    jSONObject.put("requestedPermissions", jSONArray2);
                }
                jSONArray.put(jSONObject);
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
        return jSONArray;
    }

    public JSONObject getPackageInfo(String str, int i) {
        long longVersionCode;
        try {
            PackageManager packageManager = this._extContext.getActivity().getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 129);
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("label", packageManager.getApplicationLabel(packageInfo.applicationInfo));
            jSONObject.putOpt("packageName", packageInfo.packageName);
            jSONObject.putOpt("versionName", packageInfo.versionName);
            if (Build.VERSION.SDK_INT >= 28) {
                longVersionCode = packageInfo.getLongVersionCode();
                jSONObject.putOpt("versionCode", Long.valueOf(longVersionCode));
            } else {
                jSONObject.putOpt("versionCode", Integer.valueOf(packageInfo.versionCode));
            }
            jSONObject.putOpt("firstInstallTime", Long.valueOf(packageInfo.firstInstallTime));
            jSONObject.putOpt("lastUpdateTime", Long.valueOf(packageInfo.lastUpdateTime));
            JSONArray jSONArray = new JSONArray();
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                for (String str2 : strArr) {
                    jSONArray.put(str2);
                }
            }
            return jSONObject;
        } catch (Exception e) {
            Errors.handleException(e);
            return null;
        }
    }

    public boolean killProcess(String str) {
        try {
            Logger.d(TAG, "killProcess( %s )", str);
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) this._extContext.getActivity().getSystemService("activity")).getRunningAppProcesses()) {
                String str2 = TAG;
                Logger.d(str2, "killProcess(): %s", runningAppProcessInfo.processName);
                if (!runningAppProcessInfo.processName.equals(str)) {
                    Logger.d(str2, "killProcess(): killing process id: %d", Integer.valueOf(runningAppProcessInfo.pid));
                    Process.killProcess(runningAppProcessInfo.pid);
                    return true;
                }
            }
            Logger.d(TAG, "killProcess(): No running process found", new Object[0]);
        } catch (Exception e) {
            Errors.handleException(e);
        }
        return false;
    }

    public boolean canRequestApplicationInstalls() {
        boolean canRequestPackageInstalls;
        Logger.d(TAG, "canRequestApplicationInstalls()", new Object[0]);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                canRequestPackageInstalls = this._extContext.getActivity().getPackageManager().canRequestPackageInstalls();
                return canRequestPackageInstalls;
            }
            return true;
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    public void showManageUnknownAppSourcesSettings() {
        Intent intent;
        Logger.d(TAG, "showManageUnknownAppSourcesSettings()", new Object[0]);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
                intent.setData(Uri.parse("package:" + this._extContext.getActivity().getPackageName()));
            } else {
                intent = new Intent("android.settings.SECURITY_SETTINGS");
            }
            this._extContext.getActivity().startActivity(intent);
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    public boolean installApplication(String str) {
        return installApplication(str, true);
    }

    public boolean installApplication(final String str, final boolean z) {
        Logger.d(TAG, "installApplication( %s )", str);
        if (canRequestApplicationInstalls()) {
            final Activity activity = this._extContext.getActivity();
            final Context applicationContext = this._extContext.getActivity().getApplicationContext();
            new Thread(new Runnable() { // from class: com.distriqt.extension.packagemanager.controller.PackageManagerController.1
                @Override // java.lang.Runnable
                public void run() {
                    Uri fromFile;
                    Intent intent;
                    try {
                        if (Build.VERSION.SDK_INT >= 24) {
                            Context context = applicationContext;
                            fromFile = FileProviderUtils.copyFileToProvider(context, PackageManagerFileProvider.authority(context), str, true);
                        } else if (z) {
                            File copyFileToPublic = PackageManagerController.copyFileToPublic(applicationContext, str);
                            fromFile = copyFileToPublic != null ? Uri.fromFile(copyFileToPublic) : null;
                        } else {
                            fromFile = Uri.fromFile(new File(str));
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            intent = new Intent("android.intent.action.INSTALL_PACKAGE");
                            intent.setData(fromFile);
                            intent.putExtra("android.intent.extra.RETURN_RESULT", true);
                            intent.setFlags(1);
                        } else {
                            intent = new Intent("android.intent.action.VIEW");
                            intent.setDataAndType(fromFile, "application/vnd.android.package-archive");
                            intent.setFlags(268435456);
                        }
                        activity.startActivityForResult(intent, PackageManagerController.RC_INSTALL_APPLICATION);
                    } catch (Exception e) {
                        Errors.handleException(e);
                    }
                }
            }).start();
            return true;
        }
        return false;
    }

    public static File copyFileToPublic(Context context, String str) {
        String str2 = TAG;
        Logger.d(str2, "copyFileToPublic( %s )", str);
        try {
            File file = new File(str);
            if (file.exists()) {
                File file2 = new File(context.getExternalCacheDir(), ".dt/");
                file2.mkdirs();
                File file3 = new File(file2, file.getName());
                Logger.d(str2, "copyFileToPublic() from: %s", file.getAbsolutePath());
                Logger.d(str2, "copyFileToPublic() to:   %s", file3.getAbsolutePath());
                copyFile(new FileInputStream(new File(str)), new FileOutputStream(file3));
                return file3;
            }
            return null;
        } catch (Exception e) {
            Errors.handleException(e);
            return null;
        }
    }

    private static void copyFile(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1048576];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 46552) {
            return;
        }
        String str = TAG;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = intent == null ? "null" : DebugUtil.bundleToString(intent.getExtras());
        Logger.d(str, "installApplication::onActivityResult( %d, %d, %s )", objArr);
    }
}
