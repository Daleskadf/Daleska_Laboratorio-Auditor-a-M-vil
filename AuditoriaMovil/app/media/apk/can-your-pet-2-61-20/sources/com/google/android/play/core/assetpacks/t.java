package com.google.android.play.core.assetpacks;

import android.content.Context;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
public final class t implements com.google.android.play.core.assetpacks.internal.as {
    private final com.google.android.play.core.assetpacks.internal.av a;
    private final com.google.android.play.core.assetpacks.internal.av b;
    private final com.google.android.play.core.assetpacks.internal.av c;

    public t(com.google.android.play.core.assetpacks.internal.av avVar, com.google.android.play.core.assetpacks.internal.av avVar2, com.google.android.play.core.assetpacks.internal.av avVar3) {
        this.a = avVar;
        this.b = avVar2;
        this.c = avVar3;
    }

    @Override // com.google.android.play.core.assetpacks.internal.av
    public final /* bridge */ /* synthetic */ Object a() {
        y yVar;
        Context b = ((u) this.a).b();
        com.google.android.play.core.assetpacks.internal.aq c = com.google.android.play.core.assetpacks.internal.aq.c(com.google.android.play.core.assetpacks.internal.au.a(this.b));
        com.google.android.play.core.assetpacks.internal.aq c2 = com.google.android.play.core.assetpacks.internal.aq.c(com.google.android.play.core.assetpacks.internal.au.a(this.c));
        if (p.b(b) == null) {
            yVar = (y) c.a();
        } else {
            yVar = (y) c2.a();
        }
        com.google.android.play.core.assetpacks.internal.ar.a(yVar);
        return yVar;
    }
}
