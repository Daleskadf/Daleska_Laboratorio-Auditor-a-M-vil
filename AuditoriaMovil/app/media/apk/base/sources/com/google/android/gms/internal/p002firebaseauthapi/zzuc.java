package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuc  reason: invalid package */
/* loaded from: classes.dex */
public final class zzuc extends zzakg<zzuc, zza> implements zzalp {
    private static final zzuc zzc;
    private static volatile zzalw<zzuc> zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuc$zza */
    /* loaded from: classes.dex */
    public static final class zza extends zzakg.zzb<zzuc, zza> implements zzalp {
        private zza() {
            super(zzuc.zzc);
        }
    }

    static {
        zzuc zzucVar = new zzuc();
        zzc = zzucVar;
        zzakg.zza(zzuc.class, zzucVar);
    }

    private zzuc() {
    }

    public static zzuc zzb() {
        return zzc;
    }

    public static zzuc zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zzuc) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzub.zza[i7 - 1]) {
            case 1:
                return new zzuc();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzc;
            case 5:
                zzalw<zzuc> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzuc.class) {
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
}
