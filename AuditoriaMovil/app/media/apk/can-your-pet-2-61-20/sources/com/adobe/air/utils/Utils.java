package com.adobe.air.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adobe.air.AndroidActivityWrapper;
import com.adobe.air.BuildConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Scanner;
/* loaded from: classes.dex */
public class Utils {
    private static String sRuntimePackageName;

    public static native boolean nativeConnectDebuggerSocket(String str);

    public static String getRuntimePackageName() {
        return sRuntimePackageName;
    }

    public static void setRuntimePackageName(String str) {
        sRuntimePackageName = str;
    }

    public static boolean hasCaptiveRuntime() {
        return !BuildConfig.LIBRARY_PACKAGE_NAME.equals(sRuntimePackageName);
    }

    static void KillProcess() {
        Process.killProcess(Process.myPid());
    }

    public static boolean writeStringToFile(String str, String str2) {
        File file = new File(str2);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException unused) {
                return false;
            }
        }
        byte[] bytes = str.getBytes();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes, 0, bytes.length);
            fileOutputStream.close();
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static void writeOut(InputStream inputStream, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        writeThrough(inputStream, fileOutputStream);
        fileOutputStream.close();
    }

    public static void writeThrough(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            if (outputStream != null) {
                outputStream.write(bArr, 0, read);
                outputStream.flush();
            }
        }
    }

    public static void copyTo(File file, File file2) throws IOException {
        File[] listFiles;
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                copyTo(file3, new File(file2, file3.getName()));
            }
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        copyTo(fileInputStream, fileOutputStream);
        fileInputStream.close();
        fileOutputStream.close();
    }

    public static void copyTo(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    public static void writeBufferToFile(StringBuffer stringBuffer, File file) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(stringBuffer.toString());
        fileWriter.close();
    }

    public static HashMap<String, String> parseKeyValuePairFile(File file, String str) throws FileNotFoundException, IllegalStateException {
        return parseKeyValuePairFile(new FileInputStream(file), str);
    }

    public static HashMap<String, String> parseKeyValuePairFile(InputStream inputStream, String str) throws IllegalStateException {
        HashMap<String, String> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNextLine()) {
            Scanner scanner2 = new Scanner(scanner.nextLine());
            scanner2.useDelimiter(str);
            if (scanner2.hasNext()) {
                hashMap.put(scanner2.next().trim(), scanner2.next().trim());
            }
            scanner2.close();
        }
        scanner.close();
        return hashMap;
    }

    public static void writeStringToFile(String str, File file) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(str);
        fileWriter.close();
    }

    public static String ReplaceTextContentWithStars(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = '*';
        }
        return new String(cArr);
    }

    public static String GetResourceStringFromRuntime(String str, Resources resources) {
        return resources.getString(resources.getIdentifier(str, TypedValues.Custom.S_STRING, sRuntimePackageName));
    }

    public static View GetWidgetInViewByName(String str, Resources resources, View view) {
        return view.findViewById(resources.getIdentifier(str, "id", sRuntimePackageName));
    }

    public static View GetLayoutViewFromRuntime(String str, Resources resources, LayoutInflater layoutInflater) {
        int identifier = resources.getIdentifier(str, "layout", sRuntimePackageName);
        if (identifier != 0) {
            return layoutInflater.inflate(identifier, (ViewGroup) null);
        }
        return null;
    }

    public static View GetLayoutView(String str, Resources resources, LayoutInflater layoutInflater) {
        int identifier = resources.getIdentifier(str, "layout", AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity().getPackageName());
        if (identifier != 0) {
            return layoutInflater.inflate(identifier, (ViewGroup) null);
        }
        return null;
    }

    public static View GetWidgetInViewByNameFromPackage(String str, Resources resources, View view) {
        return view.findViewById(resources.getIdentifier(str, "id", AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity().getPackageName()));
    }

    public static View GetWidgetInView(String str, Resources resources, View view) {
        return view.findViewById(resources.getIdentifier(str, "id", AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity().getPackageName()));
    }

    public static String GetResourceString(String str, Resources resources) {
        return resources.getString(resources.getIdentifier(str, TypedValues.Custom.S_STRING, AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity().getPackageName()));
    }

    public static String GetExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public static String GetRemovableStorageDirectory() {
        File[] externalFilesDirs = AndroidActivityWrapper.GetAndroidActivityWrapper().getApplicationContext().getExternalFilesDirs(null);
        if (externalFilesDirs.length > 0) {
            int length = externalFilesDirs.length;
            for (int i = 0; i < length; i++) {
                File file = externalFilesDirs[i];
                try {
                    boolean isExternalStorageEmulated = Environment.isExternalStorageEmulated(new File(file.getPath()));
                    boolean isExternalStorageRemovable = Environment.isExternalStorageRemovable(new File(file.getPath()));
                    String storageState = Environment.getStorageState(new File(file.getPath()));
                    if (!isExternalStorageEmulated && isExternalStorageRemovable && storageState.equals("mounted")) {
                        return file.getAbsolutePath();
                    }
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public static String GetSharedDataDirectory() {
        return Environment.getDataDirectory().getAbsolutePath();
    }

    public static String GetLibCorePath(Context context, Boolean bool) {
        return GetNativeLibraryPath(context, "libCore.so", bool);
    }

    public static String GetLibCorePath(Context context) {
        return GetNativeLibraryPath(context, "libCore.so", false);
    }

    public static String GetLibSTLPath(Context context) {
        return GetNativeLibraryPath(context, "libc++_shared.so", false);
    }

    public static String GetNativeLibraryPath(Context context, String str) {
        return GetNativeLibraryPath(context, str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[Catch: Exception -> 0x0074, TRY_ENTER, TryCatch #1 {Exception -> 0x0074, blocks: (B:3:0x0003, B:11:0x0019, B:12:0x001f, B:14:0x0031, B:17:0x0042, B:18:0x005c), top: B:26:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[Catch: Exception -> 0x0074, TRY_LEAVE, TryCatch #1 {Exception -> 0x0074, blocks: (B:3:0x0003, B:11:0x0019, B:12:0x001f, B:14:0x0031, B:17:0x0042, B:18:0x005c), top: B:26:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String GetNativeLibraryPath(android.content.Context r5, java.lang.String r6, java.lang.Boolean r7) {
        /*
            java.lang.String r0 = "/system/lib/"
            r1 = 0
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Exception -> L74
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Exception -> L74
            r2 = 0
            if (r7 == 0) goto L16
            java.lang.String r7 = "com.harman.services.AirDebugger"
            android.content.pm.ApplicationInfo r7 = r5.getApplicationInfo(r7, r2)     // Catch: java.lang.Exception -> L15
            goto L17
        L15:
        L16:
            r7 = r1
        L17:
            if (r7 != 0) goto L1f
            java.lang.String r7 = com.adobe.air.utils.Utils.sRuntimePackageName     // Catch: java.lang.Exception -> L74
            android.content.pm.ApplicationInfo r7 = r5.getApplicationInfo(r7, r2)     // Catch: java.lang.Exception -> L74
        L1f:
            java.lang.Class<android.content.pm.ApplicationInfo> r5 = android.content.pm.ApplicationInfo.class
            java.lang.String r2 = "nativeLibraryDir"
            java.lang.reflect.Field r5 = r5.getField(r2)     // Catch: java.lang.Exception -> L74
            java.lang.Class<android.content.pm.ApplicationInfo> r2 = android.content.pm.ApplicationInfo.class
            java.lang.String r3 = "sourceDir"
            java.lang.reflect.Field r2 = r2.getField(r3)     // Catch: java.lang.Exception -> L74
            if (r5 == 0) goto L75
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Exception -> L74
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L74
            java.lang.String r3 = "/system/app/"
            boolean r2 = r2.startsWith(r3)     // Catch: java.lang.Exception -> L74
            r3 = 1
            java.lang.String r4 = "/"
            if (r2 != r3) goto L5c
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Exception -> L74
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L74
            r7.<init>(r0)     // Catch: java.lang.Exception -> L74
            java.lang.String r0 = com.adobe.air.utils.Utils.sRuntimePackageName     // Catch: java.lang.Exception -> L74
            r7.append(r0)     // Catch: java.lang.Exception -> L74
            r7.append(r4)     // Catch: java.lang.Exception -> L74
            r7.append(r6)     // Catch: java.lang.Exception -> L74
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L74
            r5.<init>(r7)     // Catch: java.lang.Exception -> L74
            goto L72
        L5c:
            java.lang.Object r5 = r5.get(r7)     // Catch: java.lang.Exception -> L74
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L74
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L74
            r7.<init>(r4)     // Catch: java.lang.Exception -> L74
            r7.append(r6)     // Catch: java.lang.Exception -> L74
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L74
            java.lang.String r5 = r5.concat(r7)     // Catch: java.lang.Exception -> L74
        L72:
            r1 = r5
            goto L75
        L74:
        L75:
            if (r1 != 0) goto L94
            java.lang.String r1 = new java.lang.String
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "/data/data/"
            r5.<init>(r7)
            java.lang.String r7 = com.adobe.air.utils.Utils.sRuntimePackageName
            r5.append(r7)
            java.lang.String r7 = "/lib/"
            r5.append(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.utils.Utils.GetNativeLibraryPath(android.content.Context, java.lang.String, java.lang.Boolean):java.lang.String");
    }

    public static String GetNativeExtensionPath(Context context, String str) {
        ApplicationInfo applicationInfo;
        Field field;
        Field field2;
        File file;
        if (Build.VERSION.SDK_INT >= 28) {
            return str;
        }
        String str2 = null;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(sRuntimePackageName, 0);
            field = ApplicationInfo.class.getField("nativeLibraryDir");
            field2 = ApplicationInfo.class.getField("sourceDir");
            try {
                file = new File(applicationInfo.nativeLibraryDir, str);
            } catch (Exception unused) {
                file = null;
            }
        } catch (Exception unused2) {
        }
        if (file == null || !file.exists()) {
            if (field != null) {
                if (((String) field2.get(applicationInfo)).startsWith("/system/app/")) {
                    str2 = new String("/system/lib/" + sRuntimePackageName + "/" + str);
                } else {
                    str2 = new String("/data/data/" + context.getPackageName() + "/lib/" + str);
                }
            }
            if (str2 == null) {
                return new String("/data/data/" + sRuntimePackageName + "/lib/" + str);
            }
            return str2;
        }
        return file.getAbsolutePath();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
        if (r2 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String GetTelemetrySettings(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
        /*
            r0 = 1
            r1 = 0
            android.content.res.Resources r2 = r6.getResources()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L3b
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L3b
            java.io.InputStream r7 = r2.open(r7, r0)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L3b
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            r2.<init>()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            copyTo(r7, r2)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L3d
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L3d
            if (r7 == 0) goto L22
            r7.close()     // Catch: java.lang.Exception -> L20
            goto L22
        L20:
            goto L45
        L22:
            r2.close()     // Catch: java.lang.Exception -> L20
            goto L45
        L26:
            r6 = move-exception
            goto L2a
        L28:
            r6 = move-exception
            r2 = r1
        L2a:
            r1 = r7
            goto L30
        L2c:
            r2 = r1
            goto L3d
        L2e:
            r6 = move-exception
            r2 = r1
        L30:
            if (r1 == 0) goto L35
            r1.close()     // Catch: java.lang.Exception -> L3a
        L35:
            if (r2 == 0) goto L3a
            r2.close()     // Catch: java.lang.Exception -> L3a
        L3a:
            throw r6
        L3b:
            r7 = r1
            r2 = r7
        L3d:
            if (r7 == 0) goto L42
            r7.close()     // Catch: java.lang.Exception -> L20
        L42:
            if (r2 == 0) goto L45
            goto L22
        L45:
            java.lang.String r7 = "content"
            if (r1 != 0) goto L63
            com.adobe.air.AndroidActivityWrapper r2 = com.adobe.air.AndroidActivityWrapper.GetAndroidActivityWrapper()
            java.util.Map r2 = r2.getScoutConfigDetails()
            if (r2 == 0) goto L63
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L63
            java.lang.Object r2 = r2.get(r7)
            if (r2 == 0) goto L63
            java.lang.String r1 = r2.toString()
        L63:
            java.lang.String r2 = ""
            java.lang.String r3 = "telemetry"
            r4 = 0
            if (r1 != 0) goto L80
            com.adobe.air.AndroidActivityWrapper r5 = com.adobe.air.AndroidActivityWrapper.GetAndroidActivityWrapper()     // Catch: java.lang.Exception -> L7f
            java.lang.String r5 = r5.getScout_APP_ID()     // Catch: java.lang.Exception -> L7f
            android.content.Context r5 = r6.createPackageContext(r5, r4)     // Catch: java.lang.Exception -> L7f
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r3, r0)     // Catch: java.lang.Exception -> L7f
            java.lang.String r1 = r5.getString(r7, r2)     // Catch: java.lang.Exception -> L7f
            goto L80
        L7f:
        L80:
            if (r1 != 0) goto L8e
            android.content.Context r6 = r6.createPackageContext(r8, r4)     // Catch: java.lang.Exception -> L8e
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r3, r0)     // Catch: java.lang.Exception -> L8e
            java.lang.String r1 = r6.getString(r7, r2)     // Catch: java.lang.Exception -> L8e
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.utils.Utils.GetTelemetrySettings(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
