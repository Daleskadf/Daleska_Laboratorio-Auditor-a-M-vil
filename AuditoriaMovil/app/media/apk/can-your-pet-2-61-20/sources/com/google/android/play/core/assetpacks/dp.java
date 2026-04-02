package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
public final class dp implements com.google.android.play.core.assetpacks.internal.as {
    private final com.google.android.play.core.assetpacks.internal.av a;
    private final com.google.android.play.core.assetpacks.internal.av b;
    private final com.google.android.play.core.assetpacks.internal.av c;
    private final com.google.android.play.core.assetpacks.internal.av d;
    private final com.google.android.play.core.assetpacks.internal.av e;
    private final com.google.android.play.core.assetpacks.internal.av f;
    private final com.google.android.play.core.assetpacks.internal.av g;

    public dp(com.google.android.play.core.assetpacks.internal.av avVar, com.google.android.play.core.assetpacks.internal.av avVar2, com.google.android.play.core.assetpacks.internal.av avVar3, com.google.android.play.core.assetpacks.internal.av avVar4, com.google.android.play.core.assetpacks.internal.av avVar5, com.google.android.play.core.assetpacks.internal.av avVar6, com.google.android.play.core.assetpacks.internal.av avVar7) {
        this.a = avVar;
        this.b = avVar2;
        this.c = avVar3;
        this.d = avVar4;
        this.e = avVar5;
        this.f = avVar6;
        this.g = avVar7;
    }

    @Override // com.google.android.play.core.assetpacks.internal.av
    public final /* bridge */ /* synthetic */ Object a() {
        File externalFilesDir;
        String str = (String) this.a.a();
        Object a = this.b.a();
        Object a2 = this.c.a();
        Context b = ((u) this.d).b();
        Object a3 = this.e.a();
        com.google.android.play.core.assetpacks.internal.aq c = com.google.android.play.core.assetpacks.internal.aq.c(com.google.android.play.core.assetpacks.internal.au.a(this.f));
        bb bbVar = (bb) a;
        co coVar = (co) a2;
        ec ecVar = (ec) a3;
        ea eaVar = (ea) this.g.a();
        if (str != null) {
            externalFilesDir = new File(b.getExternalFilesDir(null), str);
        } else {
            externalFilesDir = b.getExternalFilesDir(null);
        }
        return new Cdo(externalFilesDir, bbVar, coVar, b, ecVar, c, eaVar);
    }
}
