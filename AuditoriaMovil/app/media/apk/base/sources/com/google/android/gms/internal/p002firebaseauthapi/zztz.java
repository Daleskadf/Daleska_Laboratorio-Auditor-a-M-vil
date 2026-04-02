package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztz  reason: invalid package */
/* loaded from: classes.dex */
public final class zztz extends zzakg<zztz, zza> implements zzalp {
    private static final zztz zzc;
    private static volatile zzalw<zztz> zzd;
    private int zze;
    private zzaiw zzf = zzaiw.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zztz$zza */
    /* loaded from: classes.dex */
    public static final class zza extends zzakg.zzb<zztz, zza> implements zzalp {
        public final zza zza(zzaiw zzaiwVar) {
            zzg();
            zztz.zza((zztz) this.zza, zzaiwVar);
            return this;
        }

        private zza() {
            super(zztz.zzc);
        }
    }

    static {
        zztz zztzVar = new zztz();
        zzc = zztzVar;
        zzakg.zza(zztz.class, zztzVar);
    }

    private zztz() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalw<zztz> zze() {
        return (zzalw) zzc.zza(zzakg.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zze;
    }

    public final zzaiw zzd() {
        return this.zzf;
    }

    public static zztz zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zztz) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzty.zza[i7 - 1]) {
            case 1:
                return new zztz();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalw<zztz> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zztz.class) {
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

    public static /* synthetic */ void zza(zztz zztzVar, zzaiw zzaiwVar) {
        zzaiwVar.getClass();
        zztzVar.zzf = zzaiwVar;
    }
}
