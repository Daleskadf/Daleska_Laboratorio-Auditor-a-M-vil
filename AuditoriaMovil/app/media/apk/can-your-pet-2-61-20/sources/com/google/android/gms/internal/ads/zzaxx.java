package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaxx implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzaxy zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxx(zzaxy zzaxyVar) {
        this.zza = zzaxyVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        long j;
        long j2;
        long j3;
        if (z) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        zzaxy zzaxyVar = this.zza;
        long currentTimeMillis = System.currentTimeMillis();
        j = zzaxyVar.zzc;
        if (j > 0) {
            zzaxy zzaxyVar2 = this.zza;
            j2 = zzaxyVar2.zzc;
            if (currentTimeMillis >= j2) {
                j3 = zzaxyVar2.zzc;
                zzaxyVar2.zzd = currentTimeMillis - j3;
            }
        }
        this.zza.zze = false;
    }
}
