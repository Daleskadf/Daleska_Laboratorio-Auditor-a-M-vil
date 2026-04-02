package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzle implements zzlb {
    @Override // com.google.android.gms.internal.measurement.zzlb
    public final int zza(int i, Object obj, Object obj2) {
        zzlc zzlcVar = (zzlc) obj;
        zzla zzlaVar = (zzla) obj2;
        if (zzlcVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzlcVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final zzkz<?, ?> zza(Object obj) {
        zzla zzlaVar = (zzla) obj;
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zza(Object obj, Object obj2) {
        zzlc zzlcVar = (zzlc) obj;
        zzlc zzlcVar2 = (zzlc) obj2;
        if (!zzlcVar2.isEmpty()) {
            if (!zzlcVar.zzd()) {
                zzlcVar = zzlcVar.zzb();
            }
            zzlcVar.zza(zzlcVar2);
        }
        return zzlcVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzb(Object obj) {
        return zzlc.zza().zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzc(Object obj) {
        ((zzlc) obj).zzc();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Map<?, ?> zzd(Object obj) {
        return (zzlc) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Map<?, ?> zze(Object obj) {
        return (zzlc) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final boolean zzf(Object obj) {
        return !((zzlc) obj).zzd();
    }
}
