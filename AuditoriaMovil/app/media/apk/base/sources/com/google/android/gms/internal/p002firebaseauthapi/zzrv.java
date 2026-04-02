package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrv  reason: invalid package */
/* loaded from: classes.dex */
public final class zzrv implements zzcd {
    private static final byte[] zza = {0};
    private final zzcd zzb;
    private final zzxd zzc;
    private final byte[] zzd;

    private zzrv(zzcd zzcdVar, zzxd zzxdVar, byte[] bArr) {
        this.zzb = zzcdVar;
        this.zzc = zzxdVar;
        this.zzd = bArr;
    }

    public static zzcd zza(zznn zznnVar) {
        byte[] zzb;
        zzpn zza2 = zznnVar.zza(zzbl.zza());
        zzpr.zza();
        zzcd zzcdVar = (zzcd) zzpr.zza((zzwb) ((zzakg) zzwb.zza().zza(zza2.zzf()).zza(zza2.zzd()).zza(zza2.zza()).zze()), zzcd.class);
        zzxd zzc = zza2.zzc();
        int i7 = zzry.zza[zzc.ordinal()];
        if (i7 == 1) {
            zzb = zzor.zza.zzb();
        } else if (i7 == 2 || i7 == 3) {
            zzb = zzor.zza(zznnVar.zza().intValue()).zzb();
        } else if (i7 == 4) {
            zzb = zzor.zzb(zznnVar.zza().intValue()).zzb();
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return new zzrv(zzcdVar, zzc, zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcd
    public final void zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 10) {
            if (this.zzc.equals(zzxd.LEGACY)) {
                bArr2 = zzyc.zza(bArr2, zza);
            }
            byte[] bArr3 = new byte[0];
            if (!this.zzc.equals(zzxd.RAW)) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
                bArr3 = copyOf;
            }
            if (Arrays.equals(this.zzd, bArr3)) {
                this.zzb.zza(bArr, bArr2);
                return;
            }
            throw new GeneralSecurityException("wrong prefix");
        }
        throw new GeneralSecurityException("tag too short");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcd
    public final byte[] zza(byte[] bArr) {
        if (this.zzc.equals(zzxd.LEGACY)) {
            bArr = zzyc.zza(bArr, zza);
        }
        return zzyc.zza(this.zzd, this.zzb.zza(bArr));
    }
}
