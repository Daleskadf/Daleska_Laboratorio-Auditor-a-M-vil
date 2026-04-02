package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcmb implements zzffg {
    private final zzckh zza;
    private Context zzb;
    private String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcmb(zzckh zzckhVar, zzcma zzcmaVar) {
        this.zza = zzckhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffg
    public final /* synthetic */ zzffg zza(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffg
    public final /* synthetic */ zzffg zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffg
    public final zzffh zzc() {
        zzhjd.zzc(this.zzb, Context.class);
        return new zzcmd(this.zza, this.zzb, this.zzc, null);
    }
}
