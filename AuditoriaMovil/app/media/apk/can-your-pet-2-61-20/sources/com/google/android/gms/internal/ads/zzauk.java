package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzauk implements zzgzz {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3),
    DG(4),
    DG_XTEA(5);
    
    private static final zzhaa zzg = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzaui
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            return zzauk.zzb(i);
        }
    };
    private final int zzi;

    zzauk(int i) {
        this.zzi = i;
    }

    public static zzauk zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return DG_XTEA;
                        }
                        return DG;
                    }
                    return UNENCRYPTED;
                }
                return TINK_HYBRID;
            }
            return BITSLICER;
        }
        return UNKNOWN_ENCRYPTION_METHOD;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzgzz
    public final int zza() {
        return this.zzi;
    }
}
