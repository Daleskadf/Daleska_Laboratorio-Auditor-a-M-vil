package com.google.android.gms.internal.mlkit_common;

import X.d;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class zzi {
    public static final /* synthetic */ int zza = 0;
    private static final String[] zzb = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};
    private static final String[] zzc;
    private static final String[] zzd;

    static {
        String str;
        String str2;
        String str3 = Build.HARDWARE;
        boolean equals = str3.equals("goldfish");
        String str4 = StringUtils.EMPTY;
        if (!equals && !str3.equals("ranchu")) {
            str = StringUtils.EMPTY;
        } else {
            str = "androidx.test.services.storage.runfiles";
        }
        zzc = new String[]{"media", str};
        int i7 = Build.VERSION.SDK_INT;
        if (i7 <= 25) {
            str2 = "com.google.android.inputmethod.latin.inputcontent";
        } else {
            str2 = StringUtils.EMPTY;
        }
        if (i7 <= 25) {
            str4 = "com.google.android.inputmethod.latin.dev.inputcontent";
        }
        zzd = new String[]{str2, str4, "com.google.android.apps.docs.storage.legacy"};
    }

    public static AssetFileDescriptor zza(Context context, Uri uri, String str) {
        zzh zzhVar = zzh.zza;
        ContentResolver contentResolver = context.getContentResolver();
        Uri zzc2 = zzc(uri);
        String scheme = zzc2.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(zzc2, "r");
        }
        if ("content".equals(scheme)) {
            if (zzj(context, zzc2, 1, zzhVar)) {
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(zzc2, "r");
                zzd(openAssetFileDescriptor);
                return openAssetFileDescriptor;
            }
            throw new FileNotFoundException("Can't open content uri.");
        } else if ("file".equals(scheme)) {
            AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(zzc2, "r");
            zzd(openAssetFileDescriptor2);
            try {
                zzi(context, openAssetFileDescriptor2.getParcelFileDescriptor(), zzc2, zzhVar);
                return openAssetFileDescriptor2;
            } catch (FileNotFoundException e7) {
                zzg(openAssetFileDescriptor2, e7);
                throw e7;
            } catch (IOException e8) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e8);
                zzg(openAssetFileDescriptor2, fileNotFoundException);
                throw fileNotFoundException;
            }
        } else {
            throw new FileNotFoundException("Unsupported scheme");
        }
    }

    public static InputStream zzb(Context context, Uri uri, zzh zzhVar) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri zzc2 = zzc(uri);
        String scheme = zzc2.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(zzc2);
        }
        if ("content".equals(scheme)) {
            if (zzj(context, zzc2, 1, zzhVar)) {
                InputStream openInputStream = contentResolver.openInputStream(zzc2);
                zzd(openInputStream);
                return openInputStream;
            }
            throw new FileNotFoundException("Can't open content uri.");
        } else if ("file".equals(scheme)) {
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(zzc2.getPath()).getCanonicalFile()), "r");
                try {
                    zzi(context, openFileDescriptor, zzc2, zzhVar);
                    return new ParcelFileDescriptor.AutoCloseInputStream(openFileDescriptor);
                } catch (FileNotFoundException e7) {
                    zzh(openFileDescriptor, e7);
                    throw e7;
                } catch (IOException e8) {
                    FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                    fileNotFoundException.initCause(e8);
                    zzh(openFileDescriptor, fileNotFoundException);
                    throw fileNotFoundException;
                }
            } catch (IOException e9) {
                FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
                fileNotFoundException2.initCause(e9);
                throw fileNotFoundException2;
            }
        } else {
            throw new FileNotFoundException("Unsupported scheme");
        }
    }

    private static Uri zzc(Uri uri) {
        if (Build.VERSION.SDK_INT < 30) {
            return Uri.parse(uri.toString());
        }
        return uri;
    }

    private static Object zzd(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new FileNotFoundException("Content resolver returned null value.");
    }

    private static String zze(File file) {
        String canonicalPath = file.getCanonicalPath();
        if (!canonicalPath.endsWith("/")) {
            return canonicalPath.concat("/");
        }
        return canonicalPath;
    }

    private static void zzf(ParcelFileDescriptor parcelFileDescriptor, String str) {
        try {
            StructStat fstat = Os.fstat(parcelFileDescriptor.getFileDescriptor());
            try {
                StructStat lstat = Os.lstat(str);
                if (!OsConstants.S_ISLNK(lstat.st_mode)) {
                    if (fstat.st_dev == lstat.st_dev && fstat.st_ino == lstat.st_ino) {
                        return;
                    }
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
                throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
            } catch (ErrnoException e7) {
                throw new IOException(e7);
            }
        } catch (ErrnoException e8) {
            throw new IOException(e8);
        }
    }

    private static void zzg(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
        } catch (IOException e7) {
            fileNotFoundException.addSuppressed(e7);
        }
    }

    private static void zzh(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e7) {
            fileNotFoundException.addSuppressed(e7);
        }
    }

    private static void zzi(final Context context, ParcelFileDescriptor parcelFileDescriptor, Uri uri, zzh zzhVar) {
        boolean z7;
        File dataDir;
        String canonicalPath = new File(uri.getPath()).getCanonicalPath();
        zzf(parcelFileDescriptor, canonicalPath);
        if (!canonicalPath.startsWith("/proc/") && !canonicalPath.startsWith("/data/misc/")) {
            zzh.zza(zzhVar);
            File dataDir2 = d.getDataDir(context);
            boolean z8 = true;
            if (dataDir2 == null ? !canonicalPath.startsWith(zze(Environment.getDataDirectory())) : !canonicalPath.startsWith(zze(dataDir2))) {
                Context createDeviceProtectedStorageContext = d.createDeviceProtectedStorageContext(context);
                if (createDeviceProtectedStorageContext == null || (dataDir = d.getDataDir(createDeviceProtectedStorageContext)) == null || !canonicalPath.startsWith(zze(dataDir))) {
                    File[] zzk = zzk(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzb
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int i7 = zzi.zza;
                            return d.getExternalFilesDirs(context, null);
                        }
                    });
                    int length = zzk.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 < length) {
                            File file = zzk[i7];
                            if (file != null && canonicalPath.startsWith(zze(file))) {
                                break;
                            }
                            i7++;
                        } else {
                            File[] zzk2 = zzk(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzc
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    int i8 = zzi.zza;
                                    return d.getExternalCacheDirs(context);
                                }
                            });
                            int length2 = zzk2.length;
                            int i8 = 0;
                            while (true) {
                                if (i8 < length2) {
                                    File file2 = zzk2[i8];
                                    if (file2 != null && canonicalPath.startsWith(zze(file2))) {
                                        break;
                                    }
                                    i8++;
                                } else {
                                    z8 = false;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            z7 = zzhVar.zzb;
            if (z8 == z7) {
                return;
            }
        }
        throw new FileNotFoundException("Can't open file: ".concat(canonicalPath));
    }

    private static boolean zzj(Context context, Uri uri, int i7, zzh zzhVar) {
        boolean z7;
        boolean z8;
        boolean z9;
        String authority = uri.getAuthority();
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (resolveContentProvider == null) {
            int lastIndexOf = authority.lastIndexOf(64);
            if (lastIndexOf >= 0) {
                authority = authority.substring(lastIndexOf + 1);
                resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (resolveContentProvider == null) {
                z9 = zzhVar.zzb;
                if (z9) {
                    return false;
                }
                return true;
            }
        }
        if (zzh.zzc(zzhVar, context, new zzj(uri, resolveContentProvider, authority)) - 1 == 1) {
            return false;
        }
        if (context.getPackageName().equals(resolveContentProvider.packageName)) {
            z8 = zzhVar.zzb;
            return z8;
        }
        z7 = zzhVar.zzb;
        if (z7) {
            return false;
        }
        if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), 1) != 0 && resolveContentProvider.exported) {
            String[] strArr = zzc;
            int length = strArr.length;
            for (int i8 = 0; i8 < 2; i8++) {
                if (strArr[i8].equals(authority)) {
                    return true;
                }
            }
            String[] strArr2 = zzd;
            int length2 = strArr2.length;
            for (int i9 = 0; i9 < 3; i9++) {
                if (strArr2[i9].equals(authority)) {
                    return true;
                }
            }
            String[] strArr3 = zzb;
            for (int i10 = 0; i10 < 6; i10++) {
                String str = strArr3[i10];
                if (str.charAt(str.length() - 1) == '.') {
                    if (resolveContentProvider.packageName.startsWith(str)) {
                        return false;
                    }
                } else if (resolveContentProvider.packageName.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static File[] zzk(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e7) {
            throw e7;
        } catch (Exception e8) {
            throw new RuntimeException(e8);
        }
    }
}
