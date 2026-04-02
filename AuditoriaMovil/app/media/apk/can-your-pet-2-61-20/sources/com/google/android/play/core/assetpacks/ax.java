package com.google.android.play.core.assetpacks;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
public final class ax implements com.google.android.play.core.assetpacks.internal.as {
    private final com.google.android.play.core.assetpacks.internal.av a;
    private final com.google.android.play.core.assetpacks.internal.av b;
    private final com.google.android.play.core.assetpacks.internal.av c;

    public ax(com.google.android.play.core.assetpacks.internal.av avVar, com.google.android.play.core.assetpacks.internal.av avVar2, com.google.android.play.core.assetpacks.internal.av avVar3) {
        this.a = avVar;
        this.b = avVar2;
        this.c = avVar3;
    }

    @Override // com.google.android.play.core.assetpacks.internal.av
    public final /* bridge */ /* synthetic */ Object a() {
        return new aw(((u) this.a).b(), (co) this.b.a(), (ea) this.c.a());
    }
}
