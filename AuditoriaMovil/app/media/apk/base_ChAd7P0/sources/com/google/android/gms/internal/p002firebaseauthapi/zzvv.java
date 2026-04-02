package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvv  reason: invalid package */
/* loaded from: classes.dex */
public final class zzvv extends zzakg<zzvv, zza> implements zzalp {
    private static final zzvv zzc;
    private static volatile zzalw<zzvv> zzd;
    private int zze;
    private int zzf;
    private zzvy zzg;
    private zzaiw zzh = zzaiw.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvv$zza */
    /* loaded from: classes.dex */
    public static final class zza extends zzakg.zzb<zzvv, zza> implements zzalp {
        public final zza zza(zzaiw zzaiwVar) {
            zzg();
            zzvv.zza((zzvv) this.zza, zzaiwVar);
            return this;
        }

        private zza() {
            super(zzvv.zzc);
        }

        public final zza zza(zzvy zzvyVar) {
            zzg();
            zzvv.zza((zzvv) this.zza, zzvyVar);
            return this;
        }

        public final zza zza(int i7) {
            zzg();
            ((zzvv) this.zza).zzf = 0;
            return this;
        }
    }

    static {
        zzvv zzvvVar = new zzvv();
        zzc = zzvvVar;
        zzakg.zza(zzvv.class, zzvvVar);
    }

    private zzvv() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalw<zzvv> zzf() {
        return (zzalw) zzc.zza(zzakg.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzvy zzd() {
        zzvy zzvyVar = this.zzg;
        if (zzvyVar == null) {
            return zzvy.zze();
        }
        return zzvyVar;
    }

    public final zzaiw zze() {
        return this.zzh;
    }

    public static zzvv zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zzvv) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzvu.zza[i7 - 1]) {
            case 1:
                return new zzvv();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzvv> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzvv.class) {
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

    public static /* synthetic */ void zza(zzvv zzvvVar, zzaiw zzaiwVar) {
        zzaiwVar.getClass();
        zzvvVar.zzh = zzaiwVar;
    }

    public static /* synthetic */ void zza(zzvv zzvvVar, zzvy zzvyVar) {
        zzvyVar.getClass();
        zzvvVar.zzg = zzvyVar;
        zzvvVar.zze |= 1;
    }
}
