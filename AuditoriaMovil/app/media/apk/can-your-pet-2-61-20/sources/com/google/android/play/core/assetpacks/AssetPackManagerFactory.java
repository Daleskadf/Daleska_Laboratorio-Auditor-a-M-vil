package com.google.android.play.core.assetpacks;

import android.content.Context;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
public final class AssetPackManagerFactory {
    private AssetPackManagerFactory() {
    }

    public static synchronized AssetPackManager getInstance(Context context) {
        AssetPackManager a;
        synchronized (AssetPackManagerFactory.class) {
            a = d.a(context).a();
        }
        return a;
    }
}
