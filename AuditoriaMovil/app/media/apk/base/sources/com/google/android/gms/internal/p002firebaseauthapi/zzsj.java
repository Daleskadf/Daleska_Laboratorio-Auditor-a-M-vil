package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsj  reason: invalid package */
/* loaded from: classes.dex */
public final class zzsj extends zzakg<zzsj, zza> implements zzalp {
    private static final zzsj zzc;
    private static volatile zzalw<zzsj> zzd;
    private int zze;
    private int zzf;
    private zzsp zzg;
    private zzvb zzh;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsj$zza */
    /* loaded from: classes.dex */
    public static final class zza extends zzakg.zzb<zzsj, zza> implements zzalp {
        public final zza zza(zzsp zzspVar) {
            zzg();
            zzsj.zza((zzsj) this.zza, zzspVar);
            return this;
        }

        private zza() {
            super(zzsj.zzc);
        }

        public final zza zza(zzvb zzvbVar) {
            zzg();
            zzsj.zza((zzsj) this.zza, zzvbVar);
            return this;
        }
    }

    static {
        zzsj zzsjVar = new zzsj();
        zzc = zzsjVar;
        zzakg.zza(zzsj.class, zzsjVar);
    }

    private zzsj() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalw<zzsj> zzf() {
        return (zzalw) zzc.zza(zzakg.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzsp zzd() {
        zzsp zzspVar = this.zzg;
        if (zzspVar == null) {
            return zzsp.zzd();
        }
        return zzspVar;
    }

    public final zzvb zze() {
        zzvb zzvbVar = this.zzh;
        if (zzvbVar == null) {
            return zzvb.zzd();
        }
        return zzvbVar;
    }

    public static zzsj zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zzsj) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzsi.zza[i7 - 1]) {
            case 1:
                return new zzsj();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzsj> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzsj.class) {
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

    public static /* synthetic */ void zza(zzsj zzsjVar, zzsp zzspVar) {
        zzspVar.getClass();
        zzsjVar.zzg = zzspVar;
        zzsjVar.zze |= 1;
    }

    public static /* synthetic */ void zza(zzsj zzsjVar, zzvb zzvbVar) {
        zzvbVar.getClass();
        zzsjVar.zzh = zzvbVar;
        zzsjVar.zze |= 2;
    }
}
