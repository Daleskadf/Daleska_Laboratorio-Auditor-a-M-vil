package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
import org.apache.tika.utils.StringUtils;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwu  reason: invalid package */
/* loaded from: classes.dex */
public final class zzwu extends zzakg<zzwu, zza> implements zzalp {
    private static final zzwu zzc;
    private static volatile zzalw<zzwu> zzd;
    private String zze = StringUtils.EMPTY;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwu$zza */
    /* loaded from: classes.dex */
    public static final class zza extends zzakg.zzb<zzwu, zza> implements zzalp {
        public final zza zza(String str) {
            zzg();
            zzwu.zza((zzwu) this.zza, str);
            return this;
        }

        private zza() {
            super(zzwu.zzc);
        }
    }

    static {
        zzwu zzwuVar = new zzwu();
        zzc = zzwuVar;
        zzakg.zza(zzwu.class, zzwuVar);
    }

    private zzwu() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public static zzwu zzc() {
        return zzc;
    }

    public final String zzd() {
        return this.zze;
    }

    public static zzwu zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zzwu) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzwt.zza[i7 - 1]) {
            case 1:
                return new zzwu();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzwu> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzwu.class) {
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

    public static /* synthetic */ void zza(zzwu zzwuVar, String str) {
        str.getClass();
        zzwuVar.zze = str;
    }
}
