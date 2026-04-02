package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzawn;
import com.google.android.gms.internal.ads.zzawo;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes.dex */
public final class zzp implements Callable {
    final /* synthetic */ zzt zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzp(zzt zztVar) {
        this.zza = zztVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        VersionInfoParcel versionInfoParcel;
        Context context;
        zzt zztVar = this.zza;
        versionInfoParcel = zztVar.zza;
        String str = versionInfoParcel.afmaVersion;
        context = zztVar.zzd;
        return new zzawo(zzawn.zzt(str, context, false));
    }
}
