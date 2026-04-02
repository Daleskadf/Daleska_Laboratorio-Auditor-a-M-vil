package com.google.android.gms.internal.ads;

import android.media.Spatializer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzyp implements Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ zzyx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyp(zzyq zzyqVar, zzyx zzyxVar) {
        this.zza = zzyxVar;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.zza.zzv();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.zza.zzv();
    }
}
