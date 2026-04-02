package com.google.android.play.core.assetpacks;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
public abstract class AssetPackLocation {
    private static final AssetPackLocation a = new bm(1, null, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AssetPackLocation a() {
        return a;
    }

    public abstract String assetsPath();

    public abstract int packStorageMethod();

    public abstract String path();
}
