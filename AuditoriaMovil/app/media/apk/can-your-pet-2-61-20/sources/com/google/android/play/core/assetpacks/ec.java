package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
final class ec {
    private static final com.google.android.play.core.assetpacks.internal.o a = new com.google.android.play.core.assetpacks.internal.o("PackageStateCache");
    private final Context b;
    private int c = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ec(Context context) {
        this.b = context;
    }

    public final synchronized int a() {
        if (this.c == -1) {
            try {
                this.c = this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                a.b("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.c;
    }
}
