package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
import org.apache.tika.utils.StringUtils;
@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxc  reason: invalid package */
/* loaded from: classes.dex */
public final class zzxc extends zzakg<zzxc, zza> implements zzalp {
    private static final zzxc zzc;
    private static volatile zzalw<zzxc> zzd;
    private String zze = StringUtils.EMPTY;
    private zzakn<zzwi> zzf = zzakg.zzp();

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxc$zza */
    /* loaded from: classes.dex */
    public static final class zza extends zzakg.zzb<zzxc, zza> implements zzalp {
        private zza() {
            super(zzxc.zzc);
        }
    }

    static {
        zzxc zzxcVar = new zzxc();
        zzc = zzxcVar;
        zzakg.zza(zzxc.class, zzxcVar);
    }

    private zzxc() {
    }

    public static zzxc zzb() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzxe.zza[i7 - 1]) {
            case 1:
                return new zzxc();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zzwi.class});
            case 4:
                return zzc;
            case 5:
                zzalw<zzxc> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzxc.class) {
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
