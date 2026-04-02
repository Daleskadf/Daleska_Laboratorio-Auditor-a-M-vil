package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzheo implements zzgzz {
    UNKNOWN_USER_POPULATION(0),
    SAFE_BROWSING(1),
    EXTENDED_REPORTING(2),
    ENHANCED_PROTECTION(3);
    
    private static final zzhaa zze = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzhem
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            return zzheo.zzb(i);
        }
    };
    private final int zzg;

    zzheo(int i) {
        this.zzg = i;
    }

    public static zzheo zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return ENHANCED_PROTECTION;
                }
                return EXTENDED_REPORTING;
            }
            return SAFE_BROWSING;
        }
        return UNKNOWN_USER_POPULATION;
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
