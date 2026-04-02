package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztt  reason: invalid package */
/* loaded from: classes.dex */
public final class zztt extends zzakg<zztt, zza> implements zzalp {
    private static final zztt zzc;
    private static volatile zzalw<zztt> zzd;
    private int zze;
    private zzaiw zzf = zzaiw.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zztt$zza */
    /* loaded from: classes.dex */
    public static final class zza extends zzakg.zzb<zztt, zza> implements zzalp {
        public final zza zza(zzaiw zzaiwVar) {
            zzg();
            zztt.zza((zztt) this.zza, zzaiwVar);
            return this;
        }

        private zza() {
            super(zztt.zzc);
        }
    }

    static {
        zztt zzttVar = new zztt();
        zzc = zzttVar;
        zzakg.zza(zztt.class, zzttVar);
    }

    private zztt() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalw<zztt> zze() {
        return (zzalw) zzc.zza(zzakg.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zze;
    }

    public final zzaiw zzd() {
        return this.zzf;
    }

    public static zztt zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zztt) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzts.zza[i7 - 1]) {
            case 1:
                return new zztt();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalw<zztt> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zztt.class) {
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

    public static /* synthetic */ void zza(zztt zzttVar, zzaiw zzaiwVar) {
        zzaiwVar.getClass();
        zzttVar.zzf = zzaiwVar;
    }
}
