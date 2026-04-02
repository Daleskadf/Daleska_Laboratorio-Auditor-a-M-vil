package com.google.android.play.core.assetpacks.internal;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
public final class ap implements as {
    private as a;

    public static void b(as asVar, as asVar2) {
        ap apVar = (ap) asVar;
        if (apVar.a != null) {
            throw new IllegalStateException();
        }
        apVar.a = asVar2;
    }

    @Override // com.google.android.play.core.assetpacks.internal.av
    public final Object a() {
        as asVar = this.a;
        if (asVar == null) {
            throw new IllegalStateException();
        }
        return asVar.a();
    }
}
