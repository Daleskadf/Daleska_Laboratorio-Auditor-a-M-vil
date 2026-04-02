package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzazh implements zzgzz {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(999);
    
    private static final zzhaa zzh = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzazg
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            zzazh zzazhVar = zzazh.UNSUPPORTED;
            if (i != 0) {
                if (i != 2) {
                    if (i != 999) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 6) {
                                    if (i != 7) {
                                        return null;
                                    }
                                    return zzazh.RISCV64;
                                }
                                return zzazh.X86_64;
                            }
                            return zzazh.ARM64;
                        }
                        return zzazh.X86;
                    }
                    return zzazh.UNKNOWN;
                }
                return zzazh.ARM7;
            }
            return zzazh.UNSUPPORTED;
        }
    };
    private final int zzj;

    zzazh(int i) {
        this.zzj = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzz
    public final int zza() {
        return this.zzj;
    }
}
