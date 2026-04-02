package com.distriqt.core.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
/* loaded from: classes.dex */
public class FileProviderUtils {
    private static final String FILEPROVIDER_SUFFIX = ".fileprovider";
    public static final String TAG = "com.distriqt.core.utils.FileProviderUtils";

    public static Uri copyAssetToProvider(Context context, String str) {
        return copyAssetToProvider(context, str, context.getPackageName() + FILEPROVIDER_SUFFIX);
    }

    public static Uri copyAssetToProvider(Context context, String str, String str2) {
        FREUtils.log(TAG, "copyAssetToProvider( %s )", str2);
        if (Assets.exists(context, str2)) {
            try {
                if (str2.substring(0, 1).equals("/")) {
                    str2 = str2.substring(1);
                }
                String replace = str2.replace("/", "_");
                File file = new File(context.getFilesDir(), ".distriqt_files");
                file.mkdirs();
                File file2 = new File(file, replace);
                if (!file2.exists()) {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    InputStream open = context.getAssets().open(str2);
                    copyFile(open, fileOutputStream);
                    fileOutputStream.close();
                    open.close();
                }
                return getUriForFile(context, str, file2);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static Uri copyFileToProvider(Context context, String str) {
        return copyFileToProvider(context, str, true);
    }

    public static Uri copyFileToProvider(Context context, String str, boolean z) {
        return copyFileToProvider(context, context.getPackageName() + FILEPROVIDER_SUFFIX, str, z);
    }

    public static Uri copyFileToProvider(Context context, String str, String str2, boolean z) {
        return copyFileToProviderDir(context, str, new File(context.getFilesDir(), ".distriqt_files"), str2, z);
    }

    public static Uri copyFileToProviderCache(Context context, String str, String str2, boolean z) {
        return copyFileToProviderDir(context, str, new File(context.getCacheDir(), ".distriqt_cache"), str2, z);
    }

    private static Uri copyFileToProviderDir(Context context, String str, File file, String str2, boolean z) {
        try {
            if (str2.substring(0, 7).equals("file://")) {
                str2 = str2.substring(7);
            }
            File file2 = new File(str2);
            if (file2.exists()) {
                file.mkdirs();
                File file3 = new File(file, file2.getName());
                if (z && file3.exists()) {
                    file3.delete();
                }
                if (!file3.exists()) {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    FileInputStream fileInputStream = new FileInputStream(new File(str2));
                    copyFile(fileInputStream, fileOutputStream);
                    fileOutputStream.close();
                    fileInputStream.close();
                } else {
                    FREUtils.log(TAG, "file provider file exists", new Object[0]);
                }
                return getUriForFile(context, str, file3);
            }
            FREUtils.log(TAG, "file doesn't exist", new Object[0]);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void grantPermissions(Context context, Intent intent, Uri uri) {
        List<ResolveInfo> queryIntentActivities;
        if (Build.VERSION.SDK_INT >= 23) {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 131072);
        } else {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            context.grantUriPermission(resolveInfo.activityInfo.packageName, uri, 3);
        }
    }

    public static void copyFile(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    private static Uri getUriForFile(Context context, String str, File file) {
        FREUtils.log(TAG, "getUriForFile( ..., %s, %s )", str, file.getAbsolutePath());
        try {
            return FileProvider.getUriForFile(context, str, file);
        } catch (Exception e) {
            String str2 = context.getPackageName() + FILEPROVIDER_SUFFIX;
            if (!str.equals(str2)) {
                FREUtils.log(TAG, "getUriForFile( ..., %s, %s )", str2, file.getAbsolutePath());
                return FileProvider.getUriForFile(context, str2, file);
            }
            throw e;
        }
    }
}
