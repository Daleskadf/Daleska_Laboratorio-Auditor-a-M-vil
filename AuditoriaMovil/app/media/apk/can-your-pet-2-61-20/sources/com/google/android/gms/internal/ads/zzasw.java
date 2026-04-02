package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzasw implements zzgzz {
    ENUM_SIGNAL_SOURCE_UNKNOWN(0),
    ENUM_SIGNAL_SOURCE_DISABLE(1),
    ENUM_SIGNAL_SOURCE_ADSHIELD(2),
    ENUM_SIGNAL_SOURCE_GASS(3),
    ENUM_SIGNAL_SOURCE_CALLER_PROVIDED(4);
    
    private static final zzhaa zzf = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzasu
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            return zzasw.zzb(i);
        }
    };
    private final int zzh;

    zzasw(int i) {
        this.zzh = i;
    }

    public static zzasw zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
                    }
                    return ENUM_SIGNAL_SOURCE_GASS;
                }
                return ENUM_SIGNAL_SOURCE_ADSHIELD;
            }
            return ENUM_SIGNAL_SOURCE_DISABLE;
        }
        return ENUM_SIGNAL_SOURCE_UNKNOWN;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgzz
    public final int zza() {
        return this.zzh;
    }
}
