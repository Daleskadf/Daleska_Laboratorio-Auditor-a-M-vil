package com.adobe.air;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import com.adobe.air.utils.Utils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class ResourceFileManager {
    private final Context mAppContext;
    private final Resources mAppResources;
    private ResourceIdMap mResourceIdMap;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ResourceFileManager(Context context) {
        this.mResourceIdMap = null;
        this.mAppContext = context;
        this.mAppResources = context.getResources();
        try {
            ClassLoader classLoader = context.getClassLoader();
            this.mResourceIdMap = new ResourceIdMap(classLoader.loadClass(context.getPackageName() + ".R"));
        } catch (ClassNotFoundException unused) {
        }
    }

    public InputStream getFileStreamFromRawRes(int i) throws Resources.NotFoundException {
        return this.mAppResources.openRawResource(i);
    }

    public String readFileFromRawRes(int i) {
        String str = new String();
        try {
            InputStream fileStreamFromRawRes = getFileStreamFromRawRes(i);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Utils.writeThrough(fileStreamFromRawRes, byteArrayOutputStream);
            return new String(byteArrayOutputStream.toByteArray(), "UTF-8");
        } catch (Exception unused) {
            return str;
        }
    }

    public InputStream getStream(int i) throws Resources.NotFoundException {
        return this.mAppResources.openRawResource(i);
    }

    public void extractResource(int i, File file) throws IOException {
        InputStream stream = getStream(i);
        Utils.writeOut(stream, file);
        stream.close();
    }

    public boolean resExists(int i) {
        if (i <= 0) {
            return false;
        }
        try {
            return this.mAppResources.openRawResource(i) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public int lookupResId(String str) {
        try {
            ResourceIdMap resourceIdMap = this.mResourceIdMap;
            if (resourceIdMap != null) {
                return resourceIdMap.getId(str);
            }
            return -1;
        } catch (Resources.NotFoundException unused) {
            return -1;
        }
    }

    private String remapSpecialFileNames(String str) {
        if (str.equals("ss.cfg") || str.equals("ss.sgn") || str.equals("mms.cfg")) {
            return str.replace('.', '_');
        }
        return null;
    }

    private boolean resExists(String str) {
        String remapSpecialFileNames = remapSpecialFileNames(str);
        if (remapSpecialFileNames != null) {
            return resExists(lookupResId("raw." + remapSpecialFileNames));
        }
        return false;
    }

    public AssetFileDescriptor GetAssetFileDescriptor(String str) {
        try {
            String remapSpecialFileNames = remapSpecialFileNames(str);
            if (remapSpecialFileNames != null) {
                str = remapSpecialFileNames;
            }
            return this.mAppContext.getContentResolver().openAssetFileDescriptor(Uri.parse("android.resource://" + this.mAppContext.getPackageName() + "/raw/" + str), "r");
        } catch (Exception unused) {
            return null;
        }
    }

    public String getResourceName(int i) {
        try {
            return this.mAppResources.getResourceName(i);
        } catch (Exception unused) {
            return "null";
        }
    }

    public String getResourceEntryName(int i) {
        try {
            return this.mAppResources.getResourceEntryName(i);
        } catch (Exception unused) {
            return "null";
        }
    }
}
