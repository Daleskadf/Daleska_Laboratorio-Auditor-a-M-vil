package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
import org.apache.tika.utils.StringUtils;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwb  reason: invalid package */
/* loaded from: classes.dex */
public final class zzwb extends zzakg<zzwb, zzb> implements zzalp {
    private static final zzwb zzc;
    private static volatile zzalw<zzwb> zzd;
    private String zze = StringUtils.EMPTY;
    private zzaiw zzf = zzaiw.zza;
    private int zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwb$zzb */
    /* loaded from: classes.dex */
    public static final class zzb extends zzakg.zzb<zzwb, zzb> implements zzalp {
        public final zzb zza(zza zzaVar) {
            zzg();
            zzwb.zza((zzwb) this.zza, zzaVar);
            return this;
        }

        private zzb() {
            super(zzwb.zzc);
        }

        public final zzb zza(String str) {
            zzg();
            zzwb.zza((zzwb) this.zza, str);
            return this;
        }

        public final zzb zza(zzaiw zzaiwVar) {
            zzg();
            zzwb.zza((zzwb) this.zza, zzaiwVar);
            return this;
        }
    }

    static {
        zzwb zzwbVar = new zzwb();
        zzc = zzwbVar;
        zzakg.zza(zzwb.class, zzwbVar);
    }

    private zzwb() {
    }

    public static zzb zza() {
        return zzc.zzm();
    }

    public static zzwb zzd() {
        return zzc;
    }

    public final zza zzb() {
        zza zza2 = zza.zza(this.zzg);
        if (zza2 == null) {
            return zza.UNRECOGNIZED;
        }
        return zza2;
    }

    public final zzaiw zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzwa.zza[i7 - 1]) {
            case 1:
                return new zzwb();
            case 2:
                return new zzb();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzwb> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzwb.class) {
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

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwb$zza */
    /* loaded from: classes.dex */
    public enum zza implements zzakl {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        private final int zzh;

        zza(int i7) {
            this.zzh = i7;
        }

        @Override // java.lang.Enum
        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(zza.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb.append(" number=");
                sb.append(zza());
            }
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakl
        public final int zza() {
            if (this != UNRECOGNIZED) {
                return this.zzh;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static zza zza(int i7) {
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                return null;
                            }
                            return REMOTE;
                        }
                        return ASYMMETRIC_PUBLIC;
                    }
                    return ASYMMETRIC_PRIVATE;
                }
                return SYMMETRIC;
            }
            return UNKNOWN_KEYMATERIAL;
        }
    }

    public static /* synthetic */ void zza(zzwb zzwbVar, zza zzaVar) {
        zzwbVar.zzg = zzaVar.zza();
    }

    public static /* synthetic */ void zza(zzwb zzwbVar, String str) {
        str.getClass();
        zzwbVar.zze = str;
    }

    public static /* synthetic */ void zza(zzwb zzwbVar, zzaiw zzaiwVar) {
        zzaiwVar.getClass();
        zzwbVar.zzf = zzaiwVar;
    }
}
