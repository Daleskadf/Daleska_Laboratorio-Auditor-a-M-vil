package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzhm;
import com.google.android.gms.measurement.internal.zzix;
import com.google.android.gms.measurement.internal.zziy;
import com.google.android.gms.measurement.internal.zzjc;
import com.google.android.gms.measurement.internal.zznt;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzb extends AppMeasurement.zza {
    private final zzhm zza;
    private final zzjc zzb;

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final int zza(String str) {
        Preconditions.checkNotEmpty(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final long zzf() {
        return this.zza.zzt().zzm();
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Boolean zza() {
        return this.zzb.zzaa();
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Double zzb() {
        return this.zzb.zzab();
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Integer zzc() {
        return this.zzb.zzac();
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Long zzd() {
        return this.zzb.zzad();
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final Object zza(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return zza();
                    }
                    return zzc();
                }
                return zzb();
            }
            return zzd();
        }
        return zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final String zzg() {
        return this.zzb.zzae();
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final String zzh() {
        return this.zzb.zzaf();
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final String zzi() {
        return this.zzb.zzag();
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final String zzj() {
        return this.zzb.zzae();
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final String zze() {
        return this.zzb.zzai();
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final List<Bundle> zza(String str, String str2) {
        return this.zzb.zza(str, str2);
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Map<String, Object> zza(boolean z) {
        List<zznt> zza = this.zzb.zza(z);
        ArrayMap arrayMap = new ArrayMap(zza.size());
        for (zznt zzntVar : zza) {
            Object zza2 = zzntVar.zza();
            if (zza2 != null) {
                arrayMap.put(zzntVar.zza, zza2);
            }
        }
        return arrayMap;
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final Map<String, Object> zza(String str, String str2, boolean z) {
        return this.zzb.zza(str, str2, z);
    }

    public zzb(zzhm zzhmVar) {
        super();
        Preconditions.checkNotNull(zzhmVar);
        this.zza = zzhmVar;
        this.zzb = zzhmVar.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final void zzb(String str) {
        this.zza.zze().zza(str, this.zza.zzb().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final void zza(String str, String str2, Bundle bundle) {
        this.zza.zzp().zza(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final void zzc(String str) {
        this.zza.zze().zzb(str, this.zza.zzb().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final void zzb(String str, String str2, Bundle bundle) {
        this.zzb.zzb(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final void zza(String str, String str2, Bundle bundle, long j) {
        this.zzb.zza(str, str2, bundle, true, false, j);
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final void zza(zzix zzixVar) {
        this.zzb.zza(zzixVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final void zza(Bundle bundle) {
        this.zzb.zzb(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final void zza(zziy zziyVar) {
        this.zzb.zza(zziyVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final void zzb(zzix zzixVar) {
        this.zzb.zzb(zzixVar);
    }
}
