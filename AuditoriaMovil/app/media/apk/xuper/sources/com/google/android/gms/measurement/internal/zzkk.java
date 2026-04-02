package com.google.android.gms.measurement.internal;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzkk implements zzej {
    final /* synthetic */ String zza;
    final /* synthetic */ zzkt zzb;

    public zzkk(zzkt zzktVar, String str) {
        this.zzb = zzktVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zza(String str, int i10, Throwable th, byte[] bArr, Map map) {
        this.zzb.zzK(i10, th, bArr, this.zza);
    }
}
