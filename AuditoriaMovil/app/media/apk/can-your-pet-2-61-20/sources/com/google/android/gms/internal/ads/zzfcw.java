package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfcw implements zzfwf {
    final /* synthetic */ zzfda zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfcw(zzfda zzfdaVar) {
        this.zza = zzfdaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzfig zze;
        zzfcz zzfczVar;
        com.google.android.gms.ads.internal.util.client.zzm.zzh("", (zzeal) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzfda zzfdaVar = this.zza;
        zze = zzfdaVar.zze();
        zzfdaVar.zzd = new zzfcz(null, zze, null);
        zzfczVar = this.zza.zzd;
        return zzfczVar;
    }
}
