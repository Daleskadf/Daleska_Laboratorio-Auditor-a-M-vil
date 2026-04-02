package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsy  reason: invalid package */
/* loaded from: classes.dex */
public final class zzsy extends zzakg<zzsy, zza> implements zzalp {
    private static final zzsy zzc;
    private static volatile zzalw<zzsy> zzd;
    private int zze;
    private int zzf;
    private zzte zzg;
    private zzaiw zzh = zzaiw.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsy$zza */
    /* loaded from: classes.dex */
    public static final class zza extends zzakg.zzb<zzsy, zza> implements zzalp {
        public final zza zza(zzaiw zzaiwVar) {
            zzg();
            zzsy.zza((zzsy) this.zza, zzaiwVar);
            return this;
        }

        private zza() {
            super(zzsy.zzc);
        }

        public final zza zza(zzte zzteVar) {
            zzg();
            zzsy.zza((zzsy) this.zza, zzteVar);
            return this;
        }
    }

    static {
        zzsy zzsyVar = new zzsy();
        zzc = zzsyVar;
        zzakg.zza(zzsy.class, zzsyVar);
    }

    private zzsy() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalw<zzsy> zzf() {
        return (zzalw) zzc.zza(zzakg.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzte zzd() {
        zzte zzteVar = this.zzg;
        if (zzteVar == null) {
            return zzte.zzd();
        }
        return zzteVar;
    }

    public final zzaiw zze() {
        return this.zzh;
    }

    public static zzsy zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zzsy) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzsx.zza[i7 - 1]) {
            case 1:
                return new zzsy();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzsy> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzsy.class) {
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

    public static /* synthetic */ void zza(zzsy zzsyVar, zzaiw zzaiwVar) {
        zzaiwVar.getClass();
        zzsyVar.zzh = zzaiwVar;
    }

    public static /* synthetic */ void zza(zzsy zzsyVar, zzte zzteVar) {
        zzteVar.getClass();
        zzsyVar.zzg = zzteVar;
        zzsyVar.zze |= 1;
    }
}
