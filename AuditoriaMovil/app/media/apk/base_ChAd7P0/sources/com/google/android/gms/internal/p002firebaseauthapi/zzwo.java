package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
import org.apache.tika.utils.StringUtils;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwo  reason: invalid package */
/* loaded from: classes.dex */
public final class zzwo extends zzakg<zzwo, zzb> implements zzalp {
    private static final zzwo zzc;
    private static volatile zzalw<zzwo> zzd;
    private int zze;
    private zzakn<zza> zzf = zzakg.zzp();

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwo$zza */
    /* loaded from: classes.dex */
    public static final class zza extends zzakg<zza, C0002zza> implements zzalp {
        private static final zza zzc;
        private static volatile zzalw<zza> zzd;
        private String zze = StringUtils.EMPTY;
        private int zzf;
        private int zzg;
        private int zzh;

        /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwo$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0002zza extends zzakg.zzb<zza, C0002zza> implements zzalp {
            public final C0002zza zza(int i7) {
                zzg();
                ((zza) this.zza).zzg = i7;
                return this;
            }

            private C0002zza() {
                super(zza.zzc);
            }

            public final C0002zza zza(zzxd zzxdVar) {
                zzg();
                zza.zza((zza) this.zza, zzxdVar);
                return this;
            }

            public final C0002zza zza(zzwc zzwcVar) {
                zzg();
                zza.zza((zza) this.zza, zzwcVar);
                return this;
            }

            public final C0002zza zza(String str) {
                zzg();
                zza.zza((zza) this.zza, str);
                return this;
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzakg.zza(zza.class, zzaVar);
        }

        private zza() {
        }

        public static C0002zza zza() {
            return zzc.zzm();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final Object zza(int i7, Object obj, Object obj2) {
            switch (zzwn.zza[i7 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0002zza();
                case 3:
                    return zzakg.zza(zzc, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzalw<zza> zzalwVar = zzd;
                    if (zzalwVar == null) {
                        synchronized (zza.class) {
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

        public static /* synthetic */ void zza(zza zzaVar, zzxd zzxdVar) {
            zzaVar.zzh = zzxdVar.zza();
        }

        public static /* synthetic */ void zza(zza zzaVar, zzwc zzwcVar) {
            zzaVar.zzf = zzwcVar.zza();
        }

        public static /* synthetic */ void zza(zza zzaVar, String str) {
            str.getClass();
            zzaVar.zze = str;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwo$zzb */
    /* loaded from: classes.dex */
    public static final class zzb extends zzakg.zzb<zzwo, zzb> implements zzalp {
        public final zzb zza(zza zzaVar) {
            zzg();
            zzwo.zza((zzwo) this.zza, zzaVar);
            return this;
        }

        private zzb() {
            super(zzwo.zzc);
        }

        public final zzb zza(int i7) {
            zzg();
            ((zzwo) this.zza).zze = i7;
            return this;
        }
    }

    static {
        zzwo zzwoVar = new zzwo();
        zzc = zzwoVar;
        zzakg.zza(zzwo.class, zzwoVar);
    }

    private zzwo() {
    }

    public static zzb zza() {
        return zzc.zzm();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzwn.zza[i7 - 1]) {
            case 1:
                return new zzwo();
            case 2:
                return new zzb();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zza.class});
            case 4:
                return zzc;
            case 5:
                zzalw<zzwo> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzwo.class) {
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

    public static /* synthetic */ void zza(zzwo zzwoVar, zza zzaVar) {
        zzaVar.getClass();
        zzakn<zza> zzaknVar = zzwoVar.zzf;
        if (!zzaknVar.zzc()) {
            zzwoVar.zzf = zzakg.zza(zzaknVar);
        }
        zzwoVar.zzf.add(zzaVar);
    }
}
