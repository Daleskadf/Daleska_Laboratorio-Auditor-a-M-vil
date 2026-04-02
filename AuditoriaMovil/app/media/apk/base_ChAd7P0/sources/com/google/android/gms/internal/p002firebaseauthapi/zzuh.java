package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuh  reason: invalid package */
/* loaded from: classes.dex */
public final class zzuh extends zzakg<zzuh, zza> implements zzalp {
    private static final zzuh zzc;
    private static volatile zzalw<zzuh> zzd;
    private int zze;
    private zzuk zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuh$zza */
    /* loaded from: classes.dex */
    public static final class zza extends zzakg.zzb<zzuh, zza> implements zzalp {
        public final zza zza(zzuk zzukVar) {
            zzg();
            zzuh.zza((zzuh) this.zza, zzukVar);
            return this;
        }

        private zza() {
            super(zzuh.zzc);
        }
    }

    static {
        zzuh zzuhVar = new zzuh();
        zzc = zzuhVar;
        zzakg.zza(zzuh.class, zzuhVar);
    }

    private zzuh() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public final zzuk zzc() {
        zzuk zzukVar = this.zzf;
        if (zzukVar == null) {
            return zzuk.zze();
        }
        return zzukVar;
    }

    public static zzuh zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zzuh) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzuj.zza[i7 - 1]) {
            case 1:
                return new zzuh();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzuh> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzuh.class) {
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

    public static /* synthetic */ void zza(zzuh zzuhVar, zzuk zzukVar) {
        zzukVar.getClass();
        zzuhVar.zzf = zzukVar;
        zzuhVar.zze |= 1;
    }
}
