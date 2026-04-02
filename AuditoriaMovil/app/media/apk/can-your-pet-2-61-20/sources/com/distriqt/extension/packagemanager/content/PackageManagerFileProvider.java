package com.distriqt.extension.packagemanager.content;

import android.content.Context;
import androidx.core.content.FileProvider;
/* loaded from: classes.dex */
public class PackageManagerFileProvider extends FileProvider {
    public static String authority(Context context) {
        return context.getPackageName() + ".packagemanagerfileprovider";
    }
}
