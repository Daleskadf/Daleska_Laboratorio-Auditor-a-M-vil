package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
public final class zzro extends zzxv implements zzzh {
    private static final zzro zza;
    private int zzd;
    private long zze;
    private zzac zzf;
    private zzak zzg;
    private byte zzh = 2;

    static {
        zzro zzroVar = new zzro();
        zza = zzroVar;
        zzxv.zzan(zzro.class, zzroVar);
    }

    private zzro() {
    }

    public static zzrn zze() {
        return (zzrn) zza.zzY();
    }

    public static /* synthetic */ zzro zzf() {
        return zza;
    }

    public static zzro zzg(InputStream inputStream, zzxf zzxfVar) throws IOException {
        return (zzro) zzxv.zzae(zza, inputStream, zzxfVar);
    }

    public static /* synthetic */ void zzh(zzro zzroVar, long j) {
        zzroVar.zzd |= 1;
        zzroVar.zze = j;
    }

    public static /* synthetic */ void zzi(zzro zzroVar, zzac zzacVar) {
        zzacVar.getClass();
        zzroVar.zzf = zzacVar;
        zzroVar.zzd |= 2;
    }

    public static /* synthetic */ void zzj(zzro zzroVar, zzak zzakVar) {
        zzakVar.getClass();
        zzroVar.zzg = zzakVar;
        zzroVar.zzd |= 4;
    }

    public final long zza() {
        return this.zze;
    }

    public final zzac zzc() {
        zzac zzacVar = this.zzf;
        return zzacVar == null ? zzac.zzk() : zzacVar;
    }

    public final zzak zzd() {
        zzak zzakVar = this.zzg;
        return zzakVar == null ? zzak.zzf() : zzakVar;
    }

    public final boolean zzk() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzl() {
        return (this.zzd & 4) != 0;
    }

    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zza;
                        }
                        this.zzh = obj == null ? (byte) 0 : (byte) 1;
                        return null;
                    }
                    return new zzrn(null);
                }
                return new zzro();
            }
            return zzak(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0002ᔉ\u0001\u0003ᐉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}
