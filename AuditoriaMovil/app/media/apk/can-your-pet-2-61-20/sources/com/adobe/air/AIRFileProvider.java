package com.adobe.air;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileNotFoundException;
/* loaded from: classes.dex */
public class AIRFileProvider extends ContentProvider {
    private Context mContext;
    private boolean mIsDebugging;

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    private void debug(String str) {
        if (this.mIsDebugging) {
            Log.d("AdobeAIR", str);
        }
    }

    public AIRFileProvider(Context context) {
        this.mContext = context;
        try {
            this.mIsDebugging = context.getPackageName().contains("harman");
        } catch (Exception unused) {
        }
    }

    public AIRFileProvider() {
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        initContext();
        String uri2 = uri.toString();
        debug("File provider request to open file (" + str + ") for " + uri2);
        String pathFromURI = getPathFromURI(uri);
        if (pathFromURI != null) {
            try {
                if (pathFromURI.startsWith("content://")) {
                    return this.mContext.getContentResolver().openFileDescriptor(Uri.parse(pathFromURI), str);
                }
                File file = new File(pathFromURI);
                int parseMode = ParcelFileDescriptor.parseMode(str);
                debug("Opening " + file.getAbsolutePath() + " using mode " + parseMode);
                return ParcelFileDescriptor.open(file, parseMode);
            } catch (FileNotFoundException e) {
                Log.w("AdobeAIR", "Cannot open file [" + pathFromURI + "] - " + e.toString());
                throw e;
            } catch (Exception e2) {
                Log.w("AdobeAIR", "Failure when attempting to open file [" + pathFromURI + "] - " + e2.toString());
                return null;
            }
        }
        return null;
    }

    private void initContext() {
        if (this.mContext == null) {
            try {
                Context applicationContext = AndroidActivityWrapper.GetAndroidActivityWrapper().getApplicationContext();
                this.mContext = applicationContext;
                this.mIsDebugging = applicationContext.getPackageName().contains("harman");
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        debug("AIR file provider query for " + uri.toString());
        String pathFromURI = getPathFromURI(uri);
        if (pathFromURI != null) {
            uri = Uri.parse(pathFromURI);
        }
        return this.mContext.getContentResolver().query(uri, strArr, str, strArr2, str2);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        debug("AIR file provider getType for " + uri.toString());
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()));
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        debug("AIR file provider insert for " + uri.toString());
        throw new UnsupportedOperationException("AdobeAIR: function not supported");
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        debug("AIR file provider delete for " + uri.toString());
        throw new UnsupportedOperationException("AdobeAIR: function not supported");
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        debug("AIR file provider update for " + uri.toString());
        throw new UnsupportedOperationException("AdobeAIR: function not supported");
    }

    public Uri getURIforPath(String str) {
        initContext();
        if (this.mContext == null) {
            return null;
        }
        debug("AIR file provider getting URI for path: " + str);
        if (str.startsWith("content://")) {
            str = FirebaseAnalytics.Param.CONTENT + str.substring(9);
        }
        Uri build = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(this.mContext.getPackageName() + ".air_file_provider").encodedPath(str).build();
        StringBuilder sb = new StringBuilder("Returning: ");
        sb.append(build.toString());
        debug(sb.toString());
        return build;
    }

    private String getPathFromURI(Uri uri) {
        String substring;
        String str;
        initContext();
        String str2 = null;
        if (this.mContext == null) {
            return null;
        }
        String uri2 = uri.toString();
        String str3 = "content://" + this.mContext.getPackageName() + ".air_file_provider";
        if (uri2.startsWith(str3)) {
            try {
                substring = uri2.substring(str3.length());
            } catch (Exception e) {
                e = e;
            }
            try {
                if (substring.startsWith("/content/")) {
                    substring = "content://" + substring.substring(9);
                }
                str2 = substring;
                debug("File is from our provider, filename: " + str2);
            } catch (Exception e2) {
                e = e2;
                str2 = str;
                debug("Could not determine filename: " + e.toString());
                return str2;
            }
        }
        return str2;
    }
}
