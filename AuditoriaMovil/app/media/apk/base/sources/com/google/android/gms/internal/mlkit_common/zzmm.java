package com.google.android.gms.internal.mlkit_common;
/* loaded from: classes.dex */
public enum zzmm implements zzba {
    UNKNOWN(0),
    TRANSLATE(1);
    
    private final int zzd;

    zzmm(int i7) {
        this.zzd = i7;
    }

    public static zzmm zzb(int i7) {
        zzmm[] values;
        for (zzmm zzmmVar : values()) {
            if (zzmmVar.zzd == i7) {
                return zzmmVar;
            }
        }
        return UNKNOWN;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzba
    public final int zza() {
        return this.zzd;
    }
}
