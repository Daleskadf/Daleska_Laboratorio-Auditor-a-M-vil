package com.google.android.gms.tagmanager;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
abstract class zzdq extends zzdx {
    public zzdq(String str) {
        super(str);
    }

    protected abstract boolean zzc(zzft zzftVar, zzft zzftVar2, Map map);

    @Override // com.google.android.gms.tagmanager.zzdx
    protected final boolean zzd(com.google.android.gms.internal.gtm.zzam zzamVar, com.google.android.gms.internal.gtm.zzam zzamVar2, Map map) {
        zzft zzd = zzfu.zzd(zzfu.zzk(zzamVar));
        zzft zzd2 = zzfu.zzd(zzfu.zzk(zzamVar2));
        if (zzd == zzfu.zzc() || zzd2 == zzfu.zzc()) {
            return false;
        }
        return zzc(zzd, zzd2, map);
    }
}
