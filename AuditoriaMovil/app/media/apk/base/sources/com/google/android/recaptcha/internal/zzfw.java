package com.google.android.recaptcha.internal;

import F6.D;
import F6.H;
import android.webkit.WebView;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzfw {
    private final WebView zza;
    private final D zzb;

    public zzfw(WebView webView, D d7) {
        this.zza = webView;
        this.zzb = d7;
    }

    public final void zzb(String str, String... strArr) {
        H.q(this.zzb, null, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3);
    }
}
