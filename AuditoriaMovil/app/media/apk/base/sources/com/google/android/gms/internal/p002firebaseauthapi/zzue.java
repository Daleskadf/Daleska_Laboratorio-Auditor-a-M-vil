package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzue  reason: invalid package */
/* loaded from: classes.dex */
public final class zzue extends zzakg<zzue, zza> implements zzalp {
    private static final zzue zzc;
    private static volatile zzalw<zzue> zzd;
    private int zze;
    private zzwf zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzue$zza */
    /* loaded from: classes.dex */
    public static final class zza extends zzakg.zzb<zzue, zza> implements zzalp {
        public final zza zza(zzwf zzwfVar) {
            zzg();
            zzue.zza((zzue) this.zza, zzwfVar);
            return this;
        }

        private zza() {
            super(zzue.zzc);
        }
    }

    static {
        zzue zzueVar = new zzue();
        zzc = zzueVar;
        zzakg.zza(zzue.class, zzueVar);
    }

    private zzue() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public static zzue zzc() {
        return zzc;
    }

    public final zzwf zzd() {
        zzwf zzwfVar = this.zzf;
        if (zzwfVar == null) {
            return zzwf.zzc();
        }
        return zzwfVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzug.zza[i7 - 1]) {
            case 1:
                return new zzue();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzue> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzue.class) {
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

    public static /* synthetic */ void zza(zzue zzueVar, zzwf zzwfVar) {
        zzwfVar.getClass();
        zzueVar.zzf = zzwfVar;
        zzueVar.zze |= 1;
    }
}
