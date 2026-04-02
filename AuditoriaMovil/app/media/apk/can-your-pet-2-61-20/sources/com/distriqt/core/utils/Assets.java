package com.distriqt.core.utils;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
/* loaded from: classes.dex */
public class Assets {
    public static final String TAG = "com.distriqt.core.utils.Assets";

    public static boolean exists(Context context, String str) {
        try {
            if (str.substring(0, 1).equals("/")) {
                str = str.substring(1);
            }
            context.getAssets().open(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static File getAssetFile(Context context, String str) {
        return getAssetFile(context, str, (str.substring(0, 1).equals("/") ? str.substring(1) : str).replace("/", "_"));
    }

    public static File getAssetFile(Context context, String str, String str2) {
        if (exists(context, str)) {
            try {
                String substring = str.substring(0, 1).equals("/") ? str.substring(1) : str;
                File file = new File(context.getCacheDir(), str2);
                LogUtil.d("com.distriqt.corelibraries", TAG, "COPYING ASSET TO CACHE: %s -> %s", str, file.getAbsolutePath());
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                InputStream open = context.getAssets().open(substring);
                copyFile(open, fileOutputStream);
                fileOutputStream.close();
                open.close();
                return file;
            } catch (Exception e) {
                FREUtils.handleException(null, e);
                return null;
            }
        }
        return null;
    }

    public static String getAssetFilePath(Context context, String str) {
        try {
            File assetFile = getAssetFile(context, str);
            if (assetFile != null) {
                return assetFile.getAbsolutePath();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static AssetFileDescriptor getAssetFileDescriptor(Context context, String str) {
        if (exists(context, str)) {
            try {
                if (str.substring(0, 1).equals("/")) {
                    str = str.substring(1);
                }
                FREUtils.log(TAG, String.format("opening %s", str), new Object[0]);
                return context.getAssets().openFd(str);
            } catch (FileNotFoundException e) {
                FREUtils.handleException(null, e);
                return null;
            } catch (Exception e2) {
                FREUtils.handleException(null, e2);
                return null;
            }
        }
        return null;
    }

    public static void listAssets(Context context) {
        String str = TAG;
        FREUtils.log(str, " ==================== LIST ASSETS : BEGIN =========================", new Object[0]);
        listAssetsInDirectory(context.getAssets(), "");
        FREUtils.log(str, " ==================== LIST ASSETS : END   =========================", new Object[0]);
    }

    private static void listAssetsInDirectory(AssetManager assetManager, String str) {
        try {
            if (!str.equals("images") && !str.equals("webkit") && !str.equals("sounds") && !str.equals("META-INF")) {
                String[] list = assetManager.list(str);
                for (int i = 0; i < list.length; i++) {
                    FREUtils.log(TAG, String.format(Locale.UK, "%s/%s", str, list[i]), new Object[0]);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(str.length() > 0 ? "/" : "");
                    sb.append(list[i]);
                    listAssetsInDirectory(assetManager, sb.toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static File copyFileToPublicCache(Context context, String str) {
        String str2 = TAG;
        FREUtils.log(str2, "copyFileToPublicCache( %s )", str);
        try {
            File file = new File(str);
            if (file.exists()) {
                FREUtils.log(str2, "copyFileToPublicCache(): %s", file.getName());
                File file2 = new File(context.getExternalCacheDir(), file.getName());
                copyFile(new FileInputStream(new File(str)), new FileOutputStream(file2));
                return file2;
            }
        } catch (Exception e) {
            FREUtils.handleException(null, e);
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
}
