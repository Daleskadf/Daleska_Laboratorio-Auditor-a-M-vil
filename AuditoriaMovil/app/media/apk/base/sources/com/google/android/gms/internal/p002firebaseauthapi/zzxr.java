package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxr  reason: invalid package */
/* loaded from: classes.dex */
public final class zzxr extends zzakg<zzxr, zza> implements zzalp {
    private static final zzxr zzc;
    private static volatile zzalw<zzxr> zzd;
    private int zze;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxr$zza */
    /* loaded from: classes.dex */
    public static final class zza extends zzakg.zzb<zzxr, zza> implements zzalp {
        private zza() {
            super(zzxr.zzc);
        }
    }

    static {
        zzxr zzxrVar = new zzxr();
        zzc = zzxrVar;
        zzakg.zza(zzxr.class, zzxrVar);
    }

    private zzxr() {
    }

    public static zzxr zzc() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzxr zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zzxr) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzxt.zza[i7 - 1]) {
            case 1:
                return new zzxr();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzxr> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzxr.class) {
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
