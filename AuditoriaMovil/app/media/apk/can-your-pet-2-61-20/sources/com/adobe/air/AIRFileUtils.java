package com.adobe.air;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.UriPermission;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.DocumentsContract;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.print.PrintHelper$$ExternalSyntheticApiModelOutline0;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
/* loaded from: classes.dex */
public class AIRFileUtils {
    private static final String PRIMARY_VOLUME_NAME = "primary";
    private static boolean m_debug;
    private static boolean m_debugChecked;
    private Context m_ctx;
    private int m_lastError;

    private static String FILEUTIL_getVolumePathBeforeAndroid11(String str, Context context) {
        return null;
    }

    public static String FILEUTIL_getFullPathFromTreeUri(Uri uri, Context context) {
        if (uri == null) {
            return null;
        }
        String FILEUTIL_getVolumePath = FILEUTIL_getVolumePath(FILEUTIL_getVolumeIdFromTreeUri(uri), context);
        if (FILEUTIL_getVolumePath == null) {
            return File.separator;
        }
        if (FILEUTIL_getVolumePath.endsWith(File.separator)) {
            FILEUTIL_getVolumePath = FILEUTIL_getVolumePath.substring(0, FILEUTIL_getVolumePath.length() - 1);
        }
        String FILEUTIL_getDocumentPathFromTreeUri = FILEUTIL_getDocumentPathFromTreeUri(uri);
        if (FILEUTIL_getDocumentPathFromTreeUri.endsWith(File.separator)) {
            FILEUTIL_getDocumentPathFromTreeUri = FILEUTIL_getDocumentPathFromTreeUri.substring(0, FILEUTIL_getDocumentPathFromTreeUri.length() - 1);
        }
        if (FILEUTIL_getDocumentPathFromTreeUri.length() > 0) {
            if (FILEUTIL_getDocumentPathFromTreeUri.startsWith(File.separator)) {
                return FILEUTIL_getVolumePath + FILEUTIL_getDocumentPathFromTreeUri;
            }
            return FILEUTIL_getVolumePath + File.separator + FILEUTIL_getDocumentPathFromTreeUri;
        }
        return FILEUTIL_getVolumePath;
    }

    private static String FILEUTIL_getVolumePath(String str, Context context) {
        String FILEUTIL_getVolumePathForAndroid11AndAbove = FILEUTIL_getVolumePathForAndroid11AndAbove(str, context);
        return FILEUTIL_getVolumePathForAndroid11AndAbove == null ? FILEUTIL_getVolumePathBeforeAndroid11(str, context) : FILEUTIL_getVolumePathForAndroid11AndAbove;
    }

    private static String FILEUTIL_getVolumePathForAndroid11AndAbove(String str, Context context) {
        List<Object> storageVolumes;
        boolean isPrimary;
        String uuid;
        File directory;
        File directory2;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                storageVolumes = ((StorageManager) context.getSystemService("storage")).getStorageVolumes();
                for (Object obj : storageVolumes) {
                    StorageVolume m157m = PrintHelper$$ExternalSyntheticApiModelOutline0.m157m(obj);
                    isPrimary = m157m.isPrimary();
                    if (isPrimary && PRIMARY_VOLUME_NAME.equals(str)) {
                        directory2 = m157m.getDirectory();
                        return directory2.getPath();
                    }
                    uuid = m157m.getUuid();
                    if (uuid != null && uuid.equals(str)) {
                        directory = m157m.getDirectory();
                        return directory.getPath();
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static String FILEUTIL_getVolumeIdFromTreeUri(Uri uri) {
        String[] split = DocumentsContract.getTreeDocumentId(uri).split(":");
        if (split.length > 0) {
            return split[0];
        }
        return null;
    }

    private static String FILEUTIL_getDocumentPathFromTreeUri(Uri uri) {
        String str;
        String[] split = DocumentsContract.getTreeDocumentId(uri).split(":");
        return (split.length < 2 || (str = split[1]) == null) ? File.separator : str;
    }

    private void debug(String str) {
        if (m_debug) {
            Log.d("AdobeAIR", str);
        }
    }

    public static boolean isDebugging() {
        return m_debug;
    }

    private UriPermission getPermissionFor(Uri uri) {
        List<UriPermission> persistedUriPermissions = this.m_ctx.getContentResolver().getPersistedUriPermissions();
        UriPermission uriPermission = null;
        for (int i = 0; i < persistedUriPermissions.size(); i++) {
            if (uri.toString().contains(persistedUriPermissions.get(i).getUri().toString())) {
                uriPermission = persistedUriPermissions.get(i);
            }
        }
        return uriPermission;
    }

    private Uri convertToFileUri(Uri uri) {
        String FILEUTIL_getFullPathFromTreeUri = FILEUTIL_getFullPathFromTreeUri(uri, this.m_ctx);
        return FILEUTIL_getFullPathFromTreeUri != null ? Uri.fromFile(new File(FILEUTIL_getFullPathFromTreeUri)) : uri;
    }

    private Uri createValidUri(Uri uri) {
        UriPermission permissionFor;
        String[] split;
        if (uri.getScheme().equals(FirebaseAnalytics.Param.CONTENT)) {
            UriPermission permissionFor2 = getPermissionFor(uri);
            if (permissionFor2 != null) {
                return DocumentsContract.buildDocumentUriUsingTree(permissionFor2.getUri(), DocumentsContract.getTreeDocumentId(uri));
            }
            if (uri.toString().split("%3A").length >= 2) {
                String str = split[0] + "%3A" + split[split.length - 1];
                debug("Creating URI [" + str + "] from [" + uri.toString() + "]");
                return Uri.parse(str);
            }
        }
        return (!isTreeUri(uri) || (permissionFor = getPermissionFor(uri)) == null) ? uri : DocumentsContract.buildDocumentUriUsingTree(permissionFor.getUri(), DocumentsContract.getTreeDocumentId(uri));
    }

    private boolean isTreeUri(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        return pathSegments.size() >= 2 && pathSegments.get(0).equals("tree");
    }

    private Uri getTreeUri(Uri uri) {
        String documentId;
        if (isTreeUri(uri)) {
            documentId = DocumentsContract.getTreeDocumentId(uri);
        } else {
            documentId = DocumentsContract.isDocumentUri(this.m_ctx, uri) ? DocumentsContract.getDocumentId(uri) : null;
        }
        return DocumentsContract.buildDocumentUriUsingTree(uri, documentId);
    }

    public AIRFileUtils() {
        Activity activity = AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity();
        this.m_ctx = activity;
        if (m_debugChecked) {
            return;
        }
        m_debugChecked = true;
        try {
            m_debug = activity.getPackageName().contains("harman");
        } catch (Exception unused) {
        }
    }

    private String validatePath(String str) {
        debug("Validating path: " + str);
        if (str.indexOf("content://com.android.externalstorage.documents/document/primary%3A") == 0) {
            debug("Replacing document path with tree path ...");
        }
        return str;
    }

    public boolean DirEnsure(String str) {
        debug("DirEnsure for " + str);
        UriPermission permissionFor = getPermissionFor(Uri.parse(str));
        if (permissionFor == null) {
            this.m_lastError = 3001;
            return false;
        }
        String uri = permissionFor.getUri().toString();
        boolean FileIsDir = FileIsDir(uri);
        String[] split = str.substring(uri.length()).split("%2F");
        if (split.length > 1) {
            try {
                Uri createValidUri = createValidUri(Uri.parse(uri));
                if (createValidUri.getScheme().equals("file")) {
                    this.m_lastError = 0;
                    File file = new File(createValidUri.getPath());
                    for (int i = 1; i < split.length && this.m_lastError == 0; i++) {
                        File file2 = new File(file, split[i]);
                        if (file2.exists()) {
                            if (!file2.isDirectory()) {
                                debug("Cannot create folder, there's already a file of that name");
                                this.m_lastError = 3007;
                            }
                        } else {
                            file2.mkdir();
                        }
                        file = file2;
                    }
                    if (this.m_lastError == 0) {
                        return true;
                    }
                    return FileIsDir;
                }
            } catch (Exception e) {
                debug("Error trying to convert URL to File: " + e.toString());
            }
        }
        for (int i2 = 1; i2 < split.length; i2++) {
            try {
                Uri createValidUri2 = createValidUri(Uri.parse(uri));
                uri = uri + "%2F" + split[i2];
                String FileType = FileType(uri);
                if (FileType == null) {
                    DocumentsContract.createDocument(this.m_ctx.getContentResolver(), createValidUri2, "vnd.android.document/directory", split[i2]);
                } else if (!FileType.equals("vnd.android.document/directory")) {
                    debug("Not a folder! " + uri);
                    this.m_lastError = 3007;
                    FileIsDir = false;
                }
            } catch (Exception e2) {
                Log.w("AdobeAIR", "Failed to ensure folder was present (" + str + "): " + e2.toString());
                this.m_lastError = 3001;
                return false;
            }
        }
        return FileIsDir;
    }

    public boolean DirEnsure2(String str) {
        debug("DirEnsure for " + str);
        String validatePath = validatePath(str);
        Uri.parse(validatePath);
        this.m_lastError = 0;
        String[] split = validatePath.split("%2F");
        String str2 = split[0];
        boolean z = true;
        Uri uri = null;
        int i = 1;
        while (z && i < split.length) {
            String str3 = str2 + "%2F" + split[i];
            String FileType = FileType(str3);
            if (FileType == null) {
                debug("Need to create a folder " + split[i]);
                if (uri == null) {
                    uri = Uri.parse(str2);
                }
                try {
                    debug("Creating based on parent = " + str2);
                    DocumentsContract.createDocument(this.m_ctx.getContentResolver(), DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(Uri.parse(str2))), "vnd.android.document/directory", split[i]);
                } catch (Exception e) {
                    debug("ERROR -> " + e.toString());
                    this.m_lastError = 3001;
                }
            } else if (!FileType.equals("vnd.android.document/directory")) {
                debug("Not a folder! " + str3);
                this.m_lastError = 3007;
                z = false;
            }
            i++;
            str2 = str3;
        }
        return z;
    }

    public boolean FileExists(String str) {
        InputStream openInputStream;
        debug("FileExists for " + str);
        Uri createValidUri = createValidUri(Uri.parse(str));
        boolean z = false;
        try {
            if (createValidUri.getScheme().equals("file")) {
                openInputStream = new FileInputStream(new File(createValidUri.getPath()));
            } else {
                openInputStream = this.m_ctx.getContentResolver().openInputStream(createValidUri);
            }
            z = true;
            openInputStream.close();
            return true;
        } catch (Exception e) {
            debug("Expected exception checking for existing file -> " + e.toString());
            return z;
        }
    }

    public boolean FileIsDir(String str) {
        debug("FileIsDir for " + str);
        String FileType = FileType(str);
        return FileType != null && FileType.equals("vnd.android.document/directory");
    }

    public String FileType(String str) {
        this.m_lastError = 0;
        debug("FileType for " + str);
        String validatePath = validatePath(str);
        String str2 = null;
        try {
            ContentResolver contentResolver = this.m_ctx.getContentResolver();
            Uri createValidUri = createValidUri(Uri.parse(validatePath));
            if (createValidUri.getScheme().equals(FirebaseAnalytics.Param.CONTENT) && (str2 = contentResolver.getType(createValidUri)) == null) {
                Uri convertToFileUri = convertToFileUri(createValidUri);
                String[] split = validatePath.split("%2F");
                String[] split2 = convertToFileUri.toString().split("/");
                if (split.length > 1 && split2.length > 1 && split[split.length - 1].equals(split2[split2.length - 1])) {
                    createValidUri = convertToFileUri;
                }
            }
            if (createValidUri.getScheme().equals("file")) {
                File file = new File(createValidUri.getPath());
                if (file.isDirectory()) {
                    return "vnd.android.document/directory";
                }
                String name = file.getName();
                int lastIndexOf = name.lastIndexOf(46);
                return lastIndexOf >= 0 ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(lastIndexOf + 1)) : str2;
            }
            return str2;
        } catch (Exception unused) {
            this.m_lastError = PathInterpolatorCompat.MAX_NUM_POINTS;
            return null;
        }
    }

    public long FileSize(String str) {
        debug("FileSize for " + str);
        AIRFileDescriptorWrapper OpenFile = OpenFile(str, "r");
        if (OpenFile != null) {
            long Size = OpenFile.Size();
            OpenFile.Close();
            return Size;
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc A[Catch: FileNotFoundException -> 0x0154, Exception -> 0x0156, TryCatch #1 {FileNotFoundException -> 0x0154, blocks: (B:18:0x0083, B:20:0x00a7, B:22:0x00bf, B:33:0x00fc, B:43:0x0136, B:35:0x010a, B:24:0x00c7, B:26:0x00cf, B:27:0x00d5, B:29:0x00dd, B:31:0x00e4, B:37:0x0118, B:39:0x0120, B:41:0x0126, B:42:0x012c), top: B:56:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.adobe.air.AIRFileDescriptorWrapper OpenFile(java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.AIRFileUtils.OpenFile(java.lang.String, java.lang.String):com.adobe.air.AIRFileDescriptorWrapper");
    }

    public String[] ListFiles(String str) {
        debug("ListFiles for " + str);
        String[] strArr = null;
        if (this.m_ctx != null) {
            try {
                Uri parse = Uri.parse(str);
                String treeDocumentId = DocumentsContract.getTreeDocumentId(parse);
                Uri buildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(parse, treeDocumentId);
                Cursor query = this.m_ctx.getContentResolver().query(DocumentsContract.buildChildDocumentsUriUsingTree(buildDocumentUriUsingTree, treeDocumentId), new String[]{"document_id"}, null, null, null);
                strArr = new String[query.getCount()];
                int i = 0;
                while (query.moveToNext()) {
                    int i2 = i + 1;
                    strArr[i] = DocumentsContract.buildDocumentUriUsingTree(buildDocumentUriUsingTree, query.getString(0)).toString();
                    i = i2;
                }
            } catch (Exception unused) {
            }
        }
        return strArr;
    }

    public boolean LaunchFile(String str) {
        debug("Launching file : " + str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(new AIRFileProvider(this.m_ctx).getURIforPath(str));
        intent.setFlags(1);
        try {
            this.m_ctx.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            Log.w("AdobeAIR", "Cannot find an intent to handle the URL: " + str);
            this.m_lastError = 3016;
            return false;
        }
    }

    public int LastError() {
        debug("Getting LastError = " + this.m_lastError);
        return this.m_lastError;
    }
}
