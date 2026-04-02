package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
public final class s implements com.google.android.play.core.assetpacks.internal.as {
    private final com.google.android.play.core.assetpacks.internal.av a;
    private final com.google.android.play.core.assetpacks.internal.av b;

    public s(com.google.android.play.core.assetpacks.internal.av avVar, com.google.android.play.core.assetpacks.internal.av avVar2) {
        this.a = avVar;
        this.b = avVar2;
    }

    @Override // com.google.android.play.core.assetpacks.internal.av
    public final /* bridge */ /* synthetic */ Object a() {
        Object a = this.a.a();
        Context b = ((u) this.b).b();
        l lVar = (l) a;
        com.google.android.play.core.assetpacks.internal.af.a(b.getPackageManager(), new ComponentName(b.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        com.google.android.play.core.assetpacks.internal.af.a(b.getPackageManager(), new ComponentName(b.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
        com.google.android.play.core.assetpacks.internal.ar.a(lVar);
        return lVar;
    }
}
