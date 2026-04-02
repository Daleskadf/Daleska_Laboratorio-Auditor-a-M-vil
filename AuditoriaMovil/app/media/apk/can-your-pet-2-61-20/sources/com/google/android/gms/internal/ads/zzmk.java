package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@Deprecated
/* loaded from: classes3.dex */
public final class zzmk {
    private final zzji zza;

    @Deprecated
    public zzmk(Context context, zzcfw zzcfwVar) {
        this.zza = new zzji(context, zzcfwVar);
    }

    @Deprecated
    public final zzmk zza(final zzlc zzlcVar) {
        zzji zzjiVar = this.zza;
        zzek.zzf(!zzjiVar.zzq);
        zzlcVar.getClass();
        zzjiVar.zzf = new zzfxh() { // from class: com.google.android.gms.internal.ads.zzja
            @Override // com.google.android.gms.internal.ads.zzfxh
            public final Object zza() {
                return zzlc.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzmk zzb(final zzzf zzzfVar) {
        zzji zzjiVar = this.zza;
        zzek.zzf(!zzjiVar.zzq);
        zzzfVar.getClass();
        zzjiVar.zze = new zzfxh() { // from class: com.google.android.gms.internal.ads.zzjh
            @Override // com.google.android.gms.internal.ads.zzfxh
            public final Object zza() {
                return zzzf.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzml zzc() {
        zzji zzjiVar = this.zza;
        zzek.zzf(!zzjiVar.zzq);
        zzjiVar.zzq = true;
        return new zzml(zzjiVar);
    }
}
