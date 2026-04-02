package com.google.android.play.core.assetpacks;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
final class bm extends AssetPackLocation {
    private final int a;
    private final String b;
    private final String c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bm(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    public final String assetsPath() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackLocation) {
            AssetPackLocation assetPackLocation = (AssetPackLocation) obj;
            if (this.a == assetPackLocation.packStorageMethod() && ((str = this.b) != null ? str.equals(assetPackLocation.path()) : assetPackLocation.path() == null) && ((str2 = this.c) != null ? str2.equals(assetPackLocation.assetsPath()) : assetPackLocation.assetsPath() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    public final int packStorageMethod() {
        return this.a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    public final String path() {
        return this.b;
    }

    public final String toString() {
        return "AssetPackLocation{packStorageMethod=" + this.a + ", path=" + this.b + ", assetsPath=" + this.c + "}";
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = str == null ? 0 : str.hashCode();
        int i = this.a;
        String str2 = this.c;
        return ((hashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }
}
