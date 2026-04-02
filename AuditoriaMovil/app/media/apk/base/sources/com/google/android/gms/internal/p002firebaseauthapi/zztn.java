package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztn  reason: invalid package */
/* loaded from: classes.dex */
public final class zztn extends zzakg<zztn, zza> implements zzalp {
    private static final zztn zzc;
    private static volatile zzalw<zztn> zzd;
    private int zze;
    private zzaiw zzf = zzaiw.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zztn$zza */
    /* loaded from: classes.dex */
    public static final class zza extends zzakg.zzb<zztn, zza> implements zzalp {
        public final zza zza(zzaiw zzaiwVar) {
            zzg();
            zztn.zza((zztn) this.zza, zzaiwVar);
            return this;
        }

        private zza() {
            super(zztn.zzc);
        }
    }

    static {
        zztn zztnVar = new zztn();
        zzc = zztnVar;
        zzakg.zza(zztn.class, zztnVar);
    }

    private zztn() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalw<zztn> zze() {
        return (zzalw) zzc.zza(zzakg.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zze;
    }

    public final zzaiw zzd() {
        return this.zzf;
    }

    public static zztn zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zztn) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zztm.zza[i7 - 1]) {
            case 1:
                return new zztn();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalw<zztn> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zztn.class) {
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

    public static /* synthetic */ void zza(zztn zztnVar, zzaiw zzaiwVar) {
        zzaiwVar.getClass();
        zztnVar.zzf = zzaiwVar;
    }
}
