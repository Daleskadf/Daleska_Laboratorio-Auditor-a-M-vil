package com.google.android.gms.internal.measurement;

import android.util.Log;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzho extends zzhh<Boolean> {
    @Override // com.google.android.gms.internal.measurement.zzhh
    @Nullable
    final /* synthetic */ Boolean zza(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzgg.zzc.matcher(str).matches()) {
                return true;
            }
            if (zzgg.zzd.matcher(str).matches()) {
                return false;
            }
        }
        String zzb = super.zzb();
        String valueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", "Invalid boolean value for " + zzb + ": " + valueOf);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzho(zzhp zzhpVar, String str, Boolean bool, boolean z) {
        super(zzhpVar, str, bool);
    }
}
