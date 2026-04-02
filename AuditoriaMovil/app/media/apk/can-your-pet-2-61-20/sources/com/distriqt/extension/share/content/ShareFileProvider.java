package com.distriqt.extension.share.content;

import android.content.Context;
import androidx.core.content.FileProvider;
/* loaded from: classes.dex */
public class ShareFileProvider extends FileProvider {
    public static String authority(Context context) {
        return context.getPackageName() + ".sharefileprovider";
    }
}
