package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwx  reason: invalid package */
/* loaded from: classes.dex */
public final class zzwx extends zzakg<zzwx, zza> implements zzalp {
    private static final zzwx zzc;
    private static volatile zzalw<zzwx> zzd;
    private int zze;
    private int zzf;
    private zzxa zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwx$zza */
    /* loaded from: classes.dex */
    public static final class zza extends zzakg.zzb<zzwx, zza> implements zzalp {
        public final zza zza(zzxa zzxaVar) {
            zzg();
            zzwx.zza((zzwx) this.zza, zzxaVar);
            return this;
        }

        private zza() {
            super(zzwx.zzc);
        }
    }

    static {
        zzwx zzwxVar = new zzwx();
        zzc = zzwxVar;
        zzakg.zza(zzwx.class, zzwxVar);
    }

    private zzwx() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalw<zzwx> zze() {
        return (zzalw) zzc.zza(zzakg.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzxa zzd() {
        zzxa zzxaVar = this.zzg;
        if (zzxaVar == null) {
            return zzxa.zzd();
        }
        return zzxaVar;
    }

    public static zzwx zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zzwx) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzww.zza[i7 - 1]) {
            case 1:
                return new zzwx();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzwx> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzwx.class) {
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

    public static /* synthetic */ void zza(zzwx zzwxVar, zzxa zzxaVar) {
        zzxaVar.getClass();
        zzwxVar.zzg = zzxaVar;
        zzwxVar.zze |= 1;
    }
}
