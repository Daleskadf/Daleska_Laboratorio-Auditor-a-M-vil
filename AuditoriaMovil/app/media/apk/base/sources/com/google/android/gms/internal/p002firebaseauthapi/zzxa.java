package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
import org.apache.tika.utils.StringUtils;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxa  reason: invalid package */
/* loaded from: classes.dex */
public final class zzxa extends zzakg<zzxa, zza> implements zzalp {
    private static final zzxa zzc;
    private static volatile zzalw<zzxa> zzd;
    private int zze;
    private String zzf = StringUtils.EMPTY;
    private zzwf zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxa$zza */
    /* loaded from: classes.dex */
    public static final class zza extends zzakg.zzb<zzxa, zza> implements zzalp {
        public final zza zza(zzwf zzwfVar) {
            zzg();
            zzxa.zza((zzxa) this.zza, zzwfVar);
            return this;
        }

        private zza() {
            super(zzxa.zzc);
        }

        public final zza zza(String str) {
            zzg();
            zzxa.zza((zzxa) this.zza, str);
            return this;
        }
    }

    static {
        zzxa zzxaVar = new zzxa();
        zzc = zzxaVar;
        zzakg.zza(zzxa.class, zzxaVar);
    }

    private zzxa() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzxa zzd() {
        return zzc;
    }

    public final zzwf zza() {
        zzwf zzwfVar = this.zzg;
        return zzwfVar == null ? zzwf.zzc() : zzwfVar;
    }

    public final String zze() {
        return this.zzf;
    }

    public static zzxa zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zzxa) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzwz.zza[i7 - 1]) {
            case 1:
                return new zzxa();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzxa> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzxa.class) {
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

    public static /* synthetic */ void zza(zzxa zzxaVar, zzwf zzwfVar) {
        zzwfVar.getClass();
        zzxaVar.zzg = zzwfVar;
        zzxaVar.zze |= 1;
    }

    public static /* synthetic */ void zza(zzxa zzxaVar, String str) {
        str.getClass();
        zzxaVar.zzf = str;
    }
}
