package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbbj implements Comparator {
    public zzbbj(zzbbk zzbbkVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbay zzbayVar = (zzbay) obj;
        zzbay zzbayVar2 = (zzbay) obj2;
        if (zzbayVar.zzd() < zzbayVar2.zzd()) {
            return -1;
        }
        if (zzbayVar.zzd() <= zzbayVar2.zzd()) {
            if (zzbayVar.zzb() < zzbayVar2.zzb()) {
                return -1;
            }
            if (zzbayVar.zzb() <= zzbayVar2.zzb()) {
                float zza = (zzbayVar.zza() - zzbayVar.zzd()) * (zzbayVar.zzc() - zzbayVar.zzb());
                float zza2 = (zzbayVar2.zza() - zzbayVar2.zzd()) * (zzbayVar2.zzc() - zzbayVar2.zzb());
                if (zza > zza2) {
                    return -1;
                }
                if (zza >= zza2) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
