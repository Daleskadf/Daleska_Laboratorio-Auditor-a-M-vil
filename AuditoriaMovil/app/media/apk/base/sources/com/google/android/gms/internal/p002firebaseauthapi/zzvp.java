package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvp  reason: invalid package */
/* loaded from: classes.dex */
public final class zzvp extends zzakg<zzvp, zza> implements zzalp {
    private static final zzvp zzc;
    private static volatile zzalw<zzvp> zzd;
    private int zze;
    private zzvs zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvp$zza */
    /* loaded from: classes.dex */
    public static final class zza extends zzakg.zzb<zzvp, zza> implements zzalp {
        public final zza zza(zzvs zzvsVar) {
            zzg();
            zzvp.zza((zzvp) this.zza, zzvsVar);
            return this;
        }

        private zza() {
            super(zzvp.zzc);
        }
    }

    static {
        zzvp zzvpVar = new zzvp();
        zzc = zzvpVar;
        zzakg.zza(zzvp.class, zzvpVar);
    }

    private zzvp() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public final zzvs zzc() {
        zzvs zzvsVar = this.zzf;
        if (zzvsVar == null) {
            return zzvs.zzf();
        }
        return zzvsVar;
    }

    public static zzvp zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zzvp) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzvo.zza[i7 - 1]) {
            case 1:
                return new zzvp();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzvp> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzvp.class) {
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

    public static /* synthetic */ void zza(zzvp zzvpVar, zzvs zzvsVar) {
        zzvsVar.getClass();
        zzvpVar.zzf = zzvsVar;
        zzvpVar.zze |= 1;
    }
}
