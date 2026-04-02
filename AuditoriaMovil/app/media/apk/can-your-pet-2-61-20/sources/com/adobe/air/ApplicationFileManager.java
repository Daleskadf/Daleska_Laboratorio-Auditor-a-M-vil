package com.adobe.air;

import android.content.pm.PackageManager;
import android.os.Bundle;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
/* loaded from: classes.dex */
public final class ApplicationFileManager {
    private static final String APP_PREFIX = "app";
    private static final String APP_XML_PATH = "META-INF/AIR/application.xml";
    private static final String ASSET_STRING = "assets";
    public static String sAndroidPackageName;
    public static String sApkPath;
    public static String sAppDataPath;
    public static String sInitialContentName;
    private final int BUFFER_SIZE = 8192;
    private final int DEFAULT_SIZE = -1;
    private HashMap<Object, Object> mFileInfoMap = new HashMap<>();

    public static void setAndroidPackageName(String str) {
        sAndroidPackageName = str;
    }

    public static void setAndroidAPKPath(String str) {
        sApkPath = str;
    }

    private static void setAndroidDataPath(String str) {
        sAppDataPath = str;
    }

    public static String getAndroidApkPath() {
        return sApkPath;
    }

    public static String getAndroidAppDataPath() {
        return sAppDataPath;
    }

    public static String getAppXMLRoot() {
        return getAndroidUnzipContentPath() + File.separatorChar + APP_XML_PATH;
    }

    public static String getAppRoot() {
        return getAndroidUnzipContentPath() + File.separatorChar + ASSET_STRING;
    }

    public static String getAndroidUnzipContentPath() {
        return sAppDataPath;
    }

    private File getApkPathFile() {
        return new File(getAndroidApkPath());
    }

    private static void setInitialContentName(String str) {
        sInitialContentName = str;
    }

    ApplicationFileManager() {
        procZipContents(getApkPathFile());
    }

    public static boolean deleteUnzippedContents(String str) {
        File file = new File(str);
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                deleteUnzippedContents(file2.getAbsolutePath());
            }
        }
        return file.delete();
    }

    public void deleteFile(String str) {
        new File(str).delete();
    }

    public void procZipContents(File file) {
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                String name = nextElement.getName();
                if (name.substring(0, 6).equals(ASSET_STRING)) {
                    this.mFileInfoMap.put(name, new FileInfo(nextElement.getSize(), true, false));
                    for (File file2 = new File(name); file2.getParent() != null && ((FileInfo) this.mFileInfoMap.get(file2.getParent())) == null; file2 = new File(file2.getParent())) {
                        this.mFileInfoMap.put(file2.getParent(), new FileInfo(-1L, false, true));
                    }
                }
            }
            zipFile.close();
        } catch (Exception unused) {
        }
    }

    public boolean fileExists(String str) {
        boolean equals = str.equals("");
        String str2 = ASSET_STRING;
        if (!equals) {
            str2 = ASSET_STRING + File.separator + str;
        }
        return this.mFileInfoMap.containsKey(str2);
    }

    public boolean isDirectory(String str) {
        boolean equals = str.equals("");
        String str2 = ASSET_STRING;
        if (!equals) {
            str2 = ASSET_STRING + File.separator + str;
        }
        FileInfo fileInfo = (FileInfo) this.mFileInfoMap.get(str2);
        return fileInfo != null && fileInfo.mIsDirectory;
    }

    public long getLSize(String str) {
        FileInfo fileInfo = (FileInfo) this.mFileInfoMap.get(ASSET_STRING + File.separator + str);
        if (fileInfo == null || fileInfo.mFileSize == -1) {
            return 0L;
        }
        return fileInfo.mFileSize;
    }

    public boolean addToCache(String str) {
        String str2 = sInitialContentName;
        return (str2 == null || str.indexOf(str2) == -1) ? false : true;
    }

    public boolean readFileName(String str) {
        ZipFile zipFile;
        String str2 = ASSET_STRING + File.separator + str;
        String str3 = getAndroidUnzipContentPath() + File.separatorChar;
        File file = new File(str3 + str2);
        if (file.exists()) {
            return true;
        }
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(getApkPathFile());
            } catch (Exception unused) {
                return true;
            }
            try {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (true) {
                    if (!entries.hasMoreElements()) {
                        break;
                    }
                    ZipEntry nextElement = entries.nextElement();
                    String name = nextElement.getName();
                    if (name.substring(0, 6).equals(ASSET_STRING)) {
                        if (name.equals(str2)) {
                            InputStream inputStream = zipFile.getInputStream(nextElement);
                            new File(file.getParent()).mkdirs();
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 8192);
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                bufferedOutputStream.write(bArr, 0, read);
                            }
                            closeInputStream(inputStream);
                            closeOutputStream(bufferedOutputStream);
                        }
                        if (name.startsWith(str2 + "/")) {
                            new File(str3 + str2).mkdirs();
                            break;
                        }
                    }
                }
                zipFile.close();
            } catch (Exception unused2) {
                zipFile2 = zipFile;
                if (zipFile2 != null) {
                    zipFile2.close();
                }
                return true;
            } catch (Throwable th) {
                th = th;
                zipFile2 = zipFile;
                if (zipFile2 != null) {
                    try {
                        zipFile2.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void copyFolder(String str) {
        String str2;
        if (str.equals("")) {
            str2 = ASSET_STRING;
        } else {
            str2 = ASSET_STRING + File.separator + str;
        }
        String str3 = getAndroidUnzipContentPath() + File.separatorChar;
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(getApkPathFile()), 8192));
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (name != null && name.length() >= 6 && name.substring(0, 6).equals(ASSET_STRING) && name.startsWith(str2)) {
                        File file = new File(str3 + name);
                        new File(file.getParent()).mkdirs();
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 8192);
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = zipInputStream.read(bArr, 0, 8192);
                            if (read == -1) {
                                break;
                            }
                            bufferedOutputStream.write(bArr, 0, read);
                        }
                        closeOutputStream(bufferedOutputStream);
                    }
                } else {
                    closeInputStream(zipInputStream);
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    public String[] appDirectoryNameList(String str) {
        boolean equals = str.equals("");
        String str2 = ASSET_STRING;
        if (!equals) {
            str2 = ASSET_STRING + File.separator + str;
        }
        Iterator<Object> it = this.mFileInfoMap.keySet().iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (!str3.equals(str2) && str3.startsWith(str2) && -1 == str3.indexOf(File.separator, str2.length() + 1)) {
                arrayList.add(str3.substring(str2.length() + 1));
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public boolean[] appDirectoryTypeList(String str) {
        boolean equals = str.equals("");
        String str2 = ASSET_STRING;
        if (!equals) {
            str2 = ASSET_STRING + File.separator + str;
        }
        Iterator<Object> it = this.mFileInfoMap.keySet().iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (!str3.equals(str2) && str3.startsWith(str2) && -1 == str3.indexOf(File.separator, str2.length() + 1)) {
                arrayList.add(new Boolean(((FileInfo) this.mFileInfoMap.get(str3)).mIsFile));
            }
        }
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = ((Boolean) arrayList.get(i)).booleanValue();
        }
        return zArr;
    }

    private static void RefreshAppCache(String str, String str2) {
        if (new File(str + File.separator + str2).exists()) {
            return;
        }
        deleteDir(new File(str));
    }

    public static boolean deleteDir(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (!deleteDir(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static void processAndroidDataPath(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(File.separator);
        String str2 = APP_PREFIX;
        sb.append(APP_PREFIX);
        String sb2 = sb.toString();
        String str3 = null;
        try {
            Bundle bundle = AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity().getPackageManager().getActivityInfo(AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity().getComponentName(), 128).metaData;
            if (bundle != null) {
                String str4 = (String) bundle.get("uniqueappversionid");
                try {
                    str2 = AndroidActivityWrapper.IsGamePreviewMode() ? UUID.randomUUID().toString() : str4;
                    RefreshAppCache(sb2, str2);
                    str3 = (String) bundle.get("initialcontent");
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    str2 = str4;
                }
            }
        } catch (PackageManager.NameNotFoundException | NullPointerException unused2) {
        }
        setAndroidDataPath(sb2 + File.separator + str2);
        new File(sb2 + File.separator + str2).mkdirs();
        setInitialContentName(str3);
    }

    private void closeInputStream(InputStream inputStream) throws Exception {
        inputStream.close();
    }

    private void closeOutputStream(OutputStream outputStream) throws Exception {
        outputStream.flush();
        outputStream.close();
    }

    public static void checkAndCreateAppDataDir() {
        File file = new File(sAppDataPath);
        if (file.exists()) {
            return;
        }
        try {
            file.mkdirs();
        } catch (SecurityException unused) {
        }
    }
}
