package com.distriqt.extension.share.controller;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.DebugUtil;
import com.distriqt.core.utils.FileProviderUtils;
import com.distriqt.core.utils.IExtensionContextWithResult;
import com.distriqt.extension.share.activities.ShareOptions;
import com.distriqt.extension.share.content.ShareFileProvider;
import com.distriqt.extension.share.events.ShareEvent;
import com.distriqt.extension.share.utils.Errors;
import com.distriqt.extension.share.utils.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class ShareController extends ActivityStateListener {
    public static final int SHAREFILE_REQUEST_CODE = 550045;
    public static final int SHARE_REQUEST_CODE = 550044;
    public static final int SHOWOPENIN_REQUEST_CODE = 550046;
    public static final String TAG = "ShareController";
    public static Intent shareIntent;
    private IExtensionContextWithResult _extContext;

    public void dispose() {
    }

    public boolean isShareSupported() {
        return true;
    }

    public ShareController(IExtensionContextWithResult iExtensionContextWithResult) {
        this._extContext = iExtensionContextWithResult;
    }

    public boolean isApplicationInstalled(String str) {
        if (isShareSupported()) {
            try {
                this._extContext.getActivity().getPackageManager().getPackageInfo(str, 1);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }
        return false;
    }

    public void share(String str, String str2, String str3, ShareOptions shareOptions) {
        Uri uri;
        Logger.d(TAG, "share( %s, %s, %s )", str, str2, str3);
        Intent intent = new Intent("android.intent.action.SEND");
        if (shareOptions.title.length() > 0) {
            intent.putExtra("android.intent.extra.TITLE", shareOptions.title);
        }
        if (str3.length() > 0) {
            intent.putExtra("android.intent.extra.SUBJECT", str);
            intent.putExtra("android.intent.extra.TEXT", str3);
        } else {
            intent.putExtra("android.intent.extra.TEXT", str);
        }
        if (str2.length() > 0) {
            try {
                Context applicationContext = this._extContext.getActivity().getApplicationContext();
                uri = FileProviderUtils.copyFileToProviderCache(applicationContext, ShareFileProvider.authority(applicationContext), str2, true);
            } catch (Exception e) {
                Errors.handleException(e);
                uri = null;
            }
            if (uri != null) {
                intent.setFlags(1);
                intent.putExtra("android.intent.extra.STREAM", uri);
                intent.setType("image/*");
                intent.setClipData(ClipData.newUri(this._extContext.getActivity().getContentResolver(), "preview", uri));
            }
        } else {
            intent.setType("text/plain");
        }
        if (shareOptions.packageName.length() > 0) {
            intent.setPackage(shareOptions.packageName);
        }
        if (shareOptions.useChooser) {
            intent = Intent.createChooser(intent, shareOptions.title);
        }
        this._extContext.startActivityForResult(intent, 550044);
    }

    public void shareFile(String str, String str2, String str3, ShareOptions shareOptions, String str4) {
        Logger.d(TAG, "shareFile( %s, %s, %s )", str, str2, str3);
        try {
            try {
                Context applicationContext = this._extContext.getActivity().getApplicationContext();
                Uri copyFileToProviderCache = FileProviderUtils.copyFileToProviderCache(applicationContext, ShareFileProvider.authority(applicationContext), str, true);
                if (copyFileToProviderCache == null) {
                    this._extContext.dispatchEvent(ShareEvent.FAILED, ShareEvent.formatErrorForEvent("shareFile", "Could not access file. Check WRITE_EXTERNAL_STORAGE permission and FileProvider"));
                    return;
                }
                if (str3 == null || str3.length() == 0) {
                    str3 = this._extContext.getActivity().getContentResolver().getType(copyFileToProviderCache);
                }
                str3 = (str3 == null || str3.length() == 0) ? "*/*" : "*/*";
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", copyFileToProviderCache);
                intent.setClipData(ClipData.newUri(this._extContext.getActivity().getContentResolver(), "preview", copyFileToProviderCache));
                if (str4 != null && str4.length() > 0) {
                    intent.putExtra("android.intent.extra.TEXT", str4);
                }
                intent.setType(str3);
                intent.addFlags(1);
                if (shareOptions.packageName.length() > 0) {
                    intent.setPackage(shareOptions.packageName);
                }
                if (shareOptions.useChooser) {
                    intent = Intent.createChooser(intent, shareOptions.title);
                }
                this._extContext.startActivityForResult(intent, SHAREFILE_REQUEST_CODE);
            } catch (Exception e) {
                Errors.handleException(e);
                this._extContext.dispatchEvent(ShareEvent.FAILED, ShareEvent.formatErrorForEvent("shareFile", "Could not access file. Check WRITE_EXTERNAL_STORAGE permission and FileProvider"));
            }
        } catch (Throwable unused) {
            this._extContext.dispatchEvent(ShareEvent.FAILED, ShareEvent.formatErrorForEvent("shareFile", "Could not access file. Check WRITE_EXTERNAL_STORAGE permission and FileProvider"));
        }
    }

    public void showOpenIn(final String str, final String str2, final String str3, final ShareOptions shareOptions) {
        Logger.d(TAG, "showOpenIn( %s, %s, %s )", str, str2, str3);
        final Activity activity = this._extContext.getActivity();
        new Thread(new Runnable() { // from class: com.distriqt.extension.share.controller.ShareController.1
            @Override // java.lang.Runnable
            public void run() {
                String str4 = str3;
                String str5 = str;
                Uri uri = null;
                try {
                    try {
                        if (Build.VERSION.SDK_INT >= 24 || !"application/vnd.android.package-archive".equals(str4)) {
                            Context applicationContext = activity.getApplicationContext();
                            uri = FileProviderUtils.copyFileToProviderCache(applicationContext, ShareFileProvider.authority(applicationContext), str5, true);
                            String str6 = ShareController.TAG;
                            Object[] objArr = new Object[1];
                            objArr[0] = uri == null ? "null" : uri.toString();
                            Logger.d(str6, "sharing uri: %s", objArr);
                        } else {
                            if (str5.substring(0, 7).equals("file://")) {
                                str5 = str.substring(7);
                            }
                            if (shareOptions.copyFileToPublic) {
                                File copyFileToPublic = ShareController.copyFileToPublic(activity, str5);
                                if (copyFileToPublic != null) {
                                    uri = Uri.fromFile(copyFileToPublic);
                                }
                            } else {
                                uri = Uri.fromFile(new File(str));
                            }
                        }
                        if (uri == null) {
                            ShareController.this._extContext.dispatchEvent(ShareEvent.FAILED, ShareEvent.formatErrorForEvent("showOpenIn", "Could not access file. Check file exists and FileProvider in manifest is correct"));
                            return;
                        }
                    } catch (Exception e) {
                        Errors.handleException(e);
                        if (0 == 0) {
                            ShareController.this._extContext.dispatchEvent(ShareEvent.FAILED, ShareEvent.formatErrorForEvent("showOpenIn", "Could not access file. Check file exists and FileProvider in manifest is correct"));
                            return;
                        }
                    }
                    if (str4 == null || str4.length() == 0) {
                        str4 = activity.getContentResolver().getType(uri);
                    }
                    str4 = (str4 == null || str4.length() == 0) ? "*/*" : "*/*";
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.putExtra("android.intent.extra.TEXT", str2);
                    intent.setDataAndType(uri, str4);
                    intent.addFlags(1);
                    if (shareOptions.packageName.length() > 0) {
                        intent.setPackage(shareOptions.packageName);
                    }
                    intent.setClipData(ClipData.newUri(activity.getContentResolver(), "preview", uri));
                    if (shareOptions.useChooser) {
                        intent = Intent.createChooser(intent, shareOptions.title);
                    }
                    ShareController.this._extContext.startActivityForResult(intent, ShareController.SHOWOPENIN_REQUEST_CODE);
                } catch (Throwable th) {
                    if (0 != 0) {
                        throw th;
                    }
                    ShareController.this._extContext.dispatchEvent(ShareEvent.FAILED, ShareEvent.formatErrorForEvent("showOpenIn", "Could not access file. Check file exists and FileProvider in manifest is correct"));
                }
            }
        }).start();
    }

    public void clearCache() {
        Logger.d(TAG, "clearCache()", new Object[0]);
        try {
            deleteRecursive(new File(this._extContext.getActivity().getCacheDir(), ".distriqt_cache"));
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    private void deleteRecursive(File file) throws Exception {
        try {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    deleteRecursive(file2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        file.delete();
    }

    public static File copyFileToPublic(Context context, String str) {
        String str2 = TAG;
        Logger.d(str2, "copyFileToPublic( %s )", str);
        try {
            File file = new File(str);
            if (file.exists()) {
                File file2 = new File(context.getExternalFilesDir(null), file.getName());
                Logger.d(str2, "copyFileToPublic() from: %s", file.getAbsolutePath());
                Logger.d(str2, "copyFileToPublic() to:   %s", file2.getAbsolutePath());
                copyFile(new FileInputStream(new File(str)), new FileOutputStream(file2));
                return file2;
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
        return null;
    }

    private static void copyFile(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
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
        String str = TAG;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = intent == null ? "null" : DebugUtil.bundleToString(intent.getExtras());
        Logger.d(str, "onActivityResult( %d, %d, %s )", objArr);
        switch (i) {
            case 550044:
            case SHAREFILE_REQUEST_CODE /* 550045 */:
            case SHOWOPENIN_REQUEST_CODE /* 550046 */:
                try {
                    if (i == 550044) {
                        if (i2 != 0) {
                            this._extContext.dispatchEvent(ShareEvent.COMPLETE, ShareEvent.formatActivityForEvent(""));
                        } else {
                            this._extContext.dispatchEvent(ShareEvent.CANCELLED, ShareEvent.formatErrorForEvent("", ""));
                        }
                    }
                    this._extContext.dispatchEvent(ShareEvent.CLOSED, ShareEvent.formatActivityForEvent(""));
                    return;
                } catch (Exception e) {
                    Errors.handleException(e);
                    return;
                }
            default:
                return;
        }
    }
}
