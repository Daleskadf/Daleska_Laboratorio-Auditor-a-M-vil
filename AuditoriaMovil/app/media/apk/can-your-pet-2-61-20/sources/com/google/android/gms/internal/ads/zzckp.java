package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzckp implements zzfan {
    private final zzckh zza;
    private Context zzb;
    private String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzckp(zzckh zzckhVar, zzcko zzckoVar) {
        this.zza = zzckhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfan
    public final /* synthetic */ zzfan zza(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfan
    public final /* synthetic */ zzfan zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfan
    public final zzfao zzc() {
        zzhjd.zzc(this.zzb, Context.class);
        zzhjd.zzc(this.zzc, String.class);
        return new zzckr(this.zza, this.zzb, this.zzc, null);
    }
}
