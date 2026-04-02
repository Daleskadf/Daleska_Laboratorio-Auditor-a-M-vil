package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsd  reason: invalid package */
/* loaded from: classes.dex */
public final class zzsd extends zzakg<zzsd, zza> implements zzalp {
    private static final zzsd zzc;
    private static volatile zzalw<zzsd> zzd;
    private int zze;
    private int zzf;
    private zzsg zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsd$zza */
    /* loaded from: classes.dex */
    public static final class zza extends zzakg.zzb<zzsd, zza> implements zzalp {
        public final zza zza(int i7) {
            zzg();
            ((zzsd) this.zza).zzf = i7;
            return this;
        }

        private zza() {
            super(zzsd.zzc);
        }

        public final zza zza(zzsg zzsgVar) {
            zzg();
            zzsd.zza((zzsd) this.zza, zzsgVar);
            return this;
        }
    }

    static {
        zzsd zzsdVar = new zzsd();
        zzc = zzsdVar;
        zzakg.zza(zzsd.class, zzsdVar);
    }

    private zzsd() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzsg zzd() {
        zzsg zzsgVar = this.zzg;
        if (zzsgVar == null) {
            return zzsg.zzd();
        }
        return zzsgVar;
    }

    public static zzsd zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zzsd) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzsc.zza[i7 - 1]) {
            case 1:
                return new zzsd();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzsd> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzsd.class) {
                        try {
                            zzalwVar = zzd;
                            if (zzalwVar == null) {
                                zzalwVar = new zzakg.zza<>(zzc);
                                zzd = zzalwVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzalwVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public static /* synthetic */ void zza(zzsd zzsdVar, zzsg zzsgVar) {
        zzsgVar.getClass();
        zzsdVar.zzg = zzsgVar;
        zzsdVar.zze |= 1;
    }
}
