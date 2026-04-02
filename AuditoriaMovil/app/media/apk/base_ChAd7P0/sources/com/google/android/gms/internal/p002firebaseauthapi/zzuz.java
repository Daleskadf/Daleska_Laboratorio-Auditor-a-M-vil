package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
import java.io.InputStream;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuz  reason: invalid package */
/* loaded from: classes.dex */
public final class zzuz extends zzakg<zzuz, zza> implements zzalp {
    private static final zzuz zzc;
    private static volatile zzalw<zzuz> zzd;
    private int zze;
    private zzaiw zzf = zzaiw.zza;
    private zzwo zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuz$zza */
    /* loaded from: classes.dex */
    public static final class zza extends zzakg.zzb<zzuz, zza> implements zzalp {
        public final zza zza() {
            zzg();
            zzuz.zza((zzuz) this.zza);
            return this;
        }

        private zza() {
            super(zzuz.zzc);
        }

        public final zza zza(zzaiw zzaiwVar) {
            zzg();
            zzuz.zza((zzuz) this.zza, zzaiwVar);
            return this;
        }

        public final zza zza(zzwo zzwoVar) {
            zzg();
            zzuz.zza((zzuz) this.zza, zzwoVar);
            return this;
        }
    }

    static {
        zzuz zzuzVar = new zzuz();
        zzc = zzuzVar;
        zzakg.zza(zzuz.class, zzuzVar);
    }

    private zzuz() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public final zzaiw zzc() {
        return this.zzf;
    }

    public static zzuz zza(InputStream inputStream, zzajv zzajvVar) {
        return (zzuz) zzakg.zza(zzc, inputStream, zzajvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzuy.zza[i7 - 1]) {
            case 1:
                return new zzuz();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzuz> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzuz.class) {
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

    public static /* synthetic */ void zza(zzuz zzuzVar) {
        zzuzVar.zzg = null;
        zzuzVar.zze &= -2;
    }

    public static /* synthetic */ void zza(zzuz zzuzVar, zzaiw zzaiwVar) {
        zzaiwVar.getClass();
        zzuzVar.zzf = zzaiwVar;
    }

    public static /* synthetic */ void zza(zzuz zzuzVar, zzwo zzwoVar) {
        zzwoVar.getClass();
        zzuzVar.zzg = zzwoVar;
        zzuzVar.zze |= 1;
    }
}
