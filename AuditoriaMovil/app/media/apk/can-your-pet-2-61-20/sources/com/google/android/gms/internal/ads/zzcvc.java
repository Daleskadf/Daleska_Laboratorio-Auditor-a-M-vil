package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcvc implements zzgea {
    final /* synthetic */ zzcvd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcvc(zzcvd zzcvdVar) {
        this.zza = zzcvdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        zzddv zzddvVar;
        zzddvVar = this.zza.zzf;
        zzddvVar.zzl(false);
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzddv zzddvVar;
        Void r2 = (Void) obj;
        zzddvVar = this.zza.zzf;
        zzddvVar.zzl(true);
    }
}
