package X;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.metadata.OfficeOpenXMLExtended;
import org.apache.tika.mime.MimeTypes;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public abstract class f extends ContentProvider {

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f6237d = {"_display_name", "_size"};

    /* renamed from: e  reason: collision with root package name */
    public static final File f6238e = new File("/");
    public static final HashMap f = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Object f6239a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public String f6240b;

    /* renamed from: c  reason: collision with root package name */
    public e f6241c;

    public static String a(String str) {
        if (str.length() > 0 && str.charAt(str.length() - 1) == '/') {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static e c(Context context, String str) {
        e eVar;
        HashMap hashMap = f;
        synchronized (hashMap) {
            try {
                eVar = (e) hashMap.get(str);
                if (eVar == null) {
                    try {
                        try {
                            eVar = e(context, str);
                            hashMap.put(str, eVar);
                        } catch (IOException e7) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e7);
                        }
                    } catch (XmlPullParserException e8) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e8);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public static Uri d(Context context, String str, File file) {
        String substring;
        e c8 = c(context, str);
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : c8.f6236b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                String a7 = a(canonicalPath);
                String a8 = a(path);
                if (a7.startsWith(a8 + '/') && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                if (path2.endsWith("/")) {
                    substring = canonicalPath.substring(path2.length());
                } else {
                    substring = canonicalPath.substring(path2.length() + 1);
                }
                return new Uri.Builder().scheme("content").authority(c8.f6235a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
            }
            throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.h("Failed to find configured root that contains ", canonicalPath));
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }

    public static e e(Context context, String str) {
        e eVar = new e(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, RecognitionOptions.ITF);
        if (resolveContentProvider != null) {
            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData == null) {
                throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            }
            while (true) {
                int next = loadXmlMetaData.next();
                if (next != 1) {
                    if (next == 2) {
                        String name = loadXmlMetaData.getName();
                        File file = null;
                        String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                        String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                        if ("root-path".equals(name)) {
                            file = f6238e;
                        } else if ("files-path".equals(name)) {
                            file = context.getFilesDir();
                        } else if ("cache-path".equals(name)) {
                            file = context.getCacheDir();
                        } else if ("external-path".equals(name)) {
                            file = Environment.getExternalStorageDirectory();
                        } else if ("external-files-path".equals(name)) {
                            File[] externalFilesDirs = d.getExternalFilesDirs(context, null);
                            if (externalFilesDirs.length > 0) {
                                file = externalFilesDirs[0];
                            }
                        } else if ("external-cache-path".equals(name)) {
                            File[] externalCacheDirs = d.getExternalCacheDirs(context);
                            if (externalCacheDirs.length > 0) {
                                file = externalCacheDirs[0];
                            }
                        } else if ("external-media-path".equals(name)) {
                            File[] externalMediaDirs = context.getExternalMediaDirs();
                            if (externalMediaDirs.length > 0) {
                                file = externalMediaDirs[0];
                            }
                        }
                        if (file == null) {
                            continue;
                        } else {
                            String str2 = new String[]{attributeValue2}[0];
                            if (str2 != null) {
                                file = new File(file, str2);
                            }
                            if (!TextUtils.isEmpty(attributeValue)) {
                                try {
                                    eVar.f6236b.put(attributeValue, file.getCanonicalFile());
                                } catch (IOException e7) {
                                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e7);
                                }
                            } else {
                                throw new IllegalArgumentException("Name must not be empty");
                            }
                        }
                    }
                } else {
                    return eVar;
                }
            }
        } else {
            throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.h("Couldn't find meta-data for provider with authority ", str));
        }
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                String str = providerInfo.authority;
                if (str != null && !str.trim().isEmpty()) {
                    String str2 = providerInfo.authority.split(";")[0];
                    synchronized (this.f6239a) {
                        this.f6240b = str2;
                    }
                    HashMap hashMap = f;
                    synchronized (hashMap) {
                        hashMap.remove(str2);
                    }
                    return;
                }
                throw new SecurityException("Provider must have a non-empty authority");
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    public final e b() {
        e eVar;
        synchronized (this.f6239a) {
            try {
                if (this.f6240b != null) {
                    if (this.f6241c == null) {
                        this.f6241c = c(getContext(), this.f6240b);
                    }
                    eVar = this.f6241c;
                } else {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return b().a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File a7 = b().a(uri);
        int lastIndexOf = a7.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a7.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
            return MimeTypes.OCTET_STREAM;
        }
        return MimeTypes.OCTET_STREAM;
    }

    public final String getTypeAnonymous(Uri uri) {
        return MimeTypes.OCTET_STREAM;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i7;
        File a7 = b().a(uri);
        if ("r".equals(str)) {
            i7 = 268435456;
        } else if (!OfficeOpenXMLExtended.WORD_PROCESSING_PREFIX.equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                i7 = 704643072;
            } else if ("rw".equals(str)) {
                i7 = 939524096;
            } else if ("rwt".equals(str)) {
                i7 = 1006632960;
            } else {
                throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.h("Invalid mode: ", str));
            }
        } else {
            i7 = 738197504;
        }
        return ParcelFileDescriptor.open(a7, i7);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i7;
        String str3;
        File a7 = b().a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f6237d;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i8 = 0;
        for (String str4 : strArr) {
            if ("_display_name".equals(str4)) {
                strArr3[i8] = "_display_name";
                i7 = i8 + 1;
                if (queryParameter == null) {
                    str3 = a7.getName();
                } else {
                    str3 = queryParameter;
                }
                objArr[i8] = str3;
            } else if ("_size".equals(str4)) {
                strArr3[i8] = "_size";
                i7 = i8 + 1;
                objArr[i8] = Long.valueOf(a7.length());
            }
            i8 = i7;
        }
        String[] strArr4 = new String[i8];
        System.arraycopy(strArr3, 0, strArr4, 0, i8);
        Object[] objArr2 = new Object[i8];
        System.arraycopy(objArr, 0, objArr2, 0, i8);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
