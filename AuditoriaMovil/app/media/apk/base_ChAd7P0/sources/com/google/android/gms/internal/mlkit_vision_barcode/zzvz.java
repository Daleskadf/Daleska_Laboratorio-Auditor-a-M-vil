package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.I;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzvz {
    private final zzcs zza;

    public /* synthetic */ zzvz(zzvx zzvxVar, zzvy zzvyVar) {
        this.zza = zzvx.zza(zzvxVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzvz)) {
            return false;
        }
        return I.m(this.zza, ((zzvz) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    @zzfe(zza = 1)
    public final zzcs zza() {
        return this.zza;
    }
}
