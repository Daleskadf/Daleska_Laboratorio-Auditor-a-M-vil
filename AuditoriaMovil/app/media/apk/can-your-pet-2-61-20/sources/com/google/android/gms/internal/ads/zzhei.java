package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzhei implements zzgzz {
    UNKNOWN(0),
    UNAVAILABLE(1),
    NOT_MANAGED(2),
    ENTERPRISE_MANAGED(3);
    
    private static final zzhaa zze = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzheg
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            return zzhei.zzb(i);
        }
    };
    private final int zzg;

    zzhei(int i) {
        this.zzg = i;
    }

    public static zzhei zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return ENTERPRISE_MANAGED;
                }
                return NOT_MANAGED;
            }
            return UNAVAILABLE;
        }
        return UNKNOWN;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgzz
    public final int zza() {
        return this.zzg;
    }
}
