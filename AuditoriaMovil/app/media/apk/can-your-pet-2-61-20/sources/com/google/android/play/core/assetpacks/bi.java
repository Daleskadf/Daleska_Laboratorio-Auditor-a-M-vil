package com.google.android.play.core.assetpacks;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
public final class bi implements com.google.android.play.core.assetpacks.internal.as {
    private final com.google.android.play.core.assetpacks.internal.av a;
    private final com.google.android.play.core.assetpacks.internal.av b;

    public bi(com.google.android.play.core.assetpacks.internal.av avVar, com.google.android.play.core.assetpacks.internal.av avVar2) {
        this.a = avVar;
        this.b = avVar2;
    }

    @Override // com.google.android.play.core.assetpacks.internal.av
    public final /* bridge */ /* synthetic */ Object a() {
        return new bh(((u) this.a).b(), (ec) this.b.a());
    }
}
