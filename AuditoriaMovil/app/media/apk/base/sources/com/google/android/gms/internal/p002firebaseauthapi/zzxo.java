package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxo  reason: invalid package */
/* loaded from: classes.dex */
public final class zzxo extends zzakg<zzxo, zza> implements zzalp {
    private static final zzxo zzc;
    private static volatile zzalw<zzxo> zzd;
    private int zze;
    private zzaiw zzf = zzaiw.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxo$zza */
    /* loaded from: classes.dex */
    public static final class zza extends zzakg.zzb<zzxo, zza> implements zzalp {
        public final zza zza(zzaiw zzaiwVar) {
            zzg();
            zzxo.zza((zzxo) this.zza, zzaiwVar);
            return this;
        }

        private zza() {
            super(zzxo.zzc);
        }
    }

    static {
        zzxo zzxoVar = new zzxo();
        zzc = zzxoVar;
        zzakg.zza(zzxo.class, zzxoVar);
    }

    private zzxo() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalw<zzxo> zze() {
        return (zzalw) zzc.zza(zzakg.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zze;
    }

    public final zzaiw zzd() {
        return this.zzf;
    }

    public static zzxo zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zzxo) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzxq.zza[i7 - 1]) {
            case 1:
                return new zzxo();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzxo> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzxo.class) {
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

    public static /* synthetic */ void zza(zzxo zzxoVar, zzaiw zzaiwVar) {
        zzaiwVar.getClass();
        zzxoVar.zzf = zzaiwVar;
    }
}
