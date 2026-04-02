package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.I;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zznl {
    private final zznh zza;
    private final zznj zzb;
    private final zznj zzc;
    private final Boolean zzd;

    public /* synthetic */ zznl(zzni zzniVar, zznk zznkVar) {
        zznh zznhVar;
        zznhVar = zzniVar.zza;
        this.zza = zznhVar;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zznl) && I.m(this.zza, ((zznl) obj).zza) && I.m(null, null) && I.m(null, null) && I.m(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, null, null, null});
    }

    @zzbc(zza = 1)
    public final zznh zza() {
        return this.zza;
    }
}
