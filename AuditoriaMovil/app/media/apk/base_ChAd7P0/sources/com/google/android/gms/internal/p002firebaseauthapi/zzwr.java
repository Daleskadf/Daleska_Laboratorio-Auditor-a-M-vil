package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwr  reason: invalid package */
/* loaded from: classes.dex */
public final class zzwr extends zzakg<zzwr, zza> implements zzalp {
    private static final zzwr zzc;
    private static volatile zzalw<zzwr> zzd;
    private int zze;
    private int zzf;
    private zzwu zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwr$zza */
    /* loaded from: classes.dex */
    public static final class zza extends zzakg.zzb<zzwr, zza> implements zzalp {
        public final zza zza(zzwu zzwuVar) {
            zzg();
            zzwr.zza((zzwr) this.zza, zzwuVar);
            return this;
        }

        private zza() {
            super(zzwr.zzc);
        }
    }

    static {
        zzwr zzwrVar = new zzwr();
        zzc = zzwrVar;
        zzakg.zza(zzwr.class, zzwrVar);
    }

    private zzwr() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalw<zzwr> zze() {
        return (zzalw) zzc.zza(zzakg.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzwu zzd() {
        zzwu zzwuVar = this.zzg;
        if (zzwuVar == null) {
            return zzwu.zzc();
        }
        return zzwuVar;
    }

    public static zzwr zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zzwr) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzwq.zza[i7 - 1]) {
            case 1:
                return new zzwr();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzwr> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzwr.class) {
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

    public static /* synthetic */ void zza(zzwr zzwrVar, zzwu zzwuVar) {
        zzwuVar.getClass();
        zzwrVar.zzg = zzwuVar;
        zzwrVar.zze |= 1;
    }
}
