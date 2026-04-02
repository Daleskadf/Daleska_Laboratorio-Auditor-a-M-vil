package com.google.android.gms.cast.framework.media;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.images.WebImage;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzo {
    public final Uri zza;
    public Bitmap zzb;

    public zzo(WebImage webImage) {
        Uri url;
        if (webImage == null) {
            url = null;
        } else {
            url = webImage.getUrl();
        }
        this.zza = url;
    }
}
