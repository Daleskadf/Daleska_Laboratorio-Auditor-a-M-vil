package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsp  reason: invalid package */
/* loaded from: classes.dex */
public final class zzsp extends zzakg<zzsp, zza> implements zzalp {
    private static final zzsp zzc;
    private static volatile zzalw<zzsp> zzd;
    private int zze;
    private int zzf;
    private zzsv zzg;
    private zzaiw zzh = zzaiw.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsp$zza */
    /* loaded from: classes.dex */
    public static final class zza extends zzakg.zzb<zzsp, zza> implements zzalp {
        public final zza zza(zzaiw zzaiwVar) {
            zzg();
            zzsp.zza((zzsp) this.zza, zzaiwVar);
            return this;
        }

        private zza() {
            super(zzsp.zzc);
        }

        public final zza zza(zzsv zzsvVar) {
            zzg();
            zzsp.zza((zzsp) this.zza, zzsvVar);
            return this;
        }
    }

    static {
        zzsp zzspVar = new zzsp();
        zzc = zzspVar;
        zzakg.zza(zzsp.class, zzspVar);
    }

    private zzsp() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzsp zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzsv zze() {
        zzsv zzsvVar = this.zzg;
        if (zzsvVar == null) {
            return zzsv.zzd();
        }
        return zzsvVar;
    }

    public final zzaiw zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzso.zza[i7 - 1]) {
            case 1:
                return new zzsp();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzsp> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzsp.class) {
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

    public static /* synthetic */ void zza(zzsp zzspVar, zzaiw zzaiwVar) {
        zzaiwVar.getClass();
        zzspVar.zzh = zzaiwVar;
    }

    public static /* synthetic */ void zza(zzsp zzspVar, zzsv zzsvVar) {
        zzsvVar.getClass();
        zzspVar.zzg = zzsvVar;
        zzspVar.zze |= 1;
    }
}
