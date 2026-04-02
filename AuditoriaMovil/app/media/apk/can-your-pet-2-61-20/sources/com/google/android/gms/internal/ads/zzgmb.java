package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgmb implements zzgfj {
    private final zzgfj zza;
    private final zzgvv zzb;
    private final byte[] zzc;

    private zzgmb(zzgfj zzgfjVar, zzgvv zzgvvVar, byte[] bArr) {
        this.zza = zzgfjVar;
        this.zzb = zzgvvVar;
        this.zzc = bArr;
    }

    public static zzgfj zzb(zzgnd zzgndVar) throws GeneralSecurityException {
        byte[] array;
        zzgot zza = zzgndVar.zza(zzgfs.zza());
        zzgum zza2 = zzgup.zza();
        zza2.zzb(zza.zzg());
        zza2.zzc(zza.zze());
        zza2.zza(zza.zzb());
        zzgfj zzgfjVar = (zzgfj) zzggm.zzb((zzgup) zza2.zzbr(), zzgfj.class);
        zzgvv zzc = zza.zzc();
        zzgvv zzgvvVar = zzgvv.UNKNOWN_PREFIX;
        int ordinal = zzc.ordinal();
        if (ordinal == 1) {
            array = ByteBuffer.allocate(5).put((byte) 1).putInt(zzgndVar.zzb().intValue()).array();
        } else {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    array = new byte[0];
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(String.valueOf(zzc))));
                }
            }
            array = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgndVar.zzb().intValue()).array();
        }
        return new zzgmb(zzgfjVar, zzc, array);
    }

    @Override // com.google.android.gms.internal.ads.zzgfj
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (this.zzb == zzgvv.RAW) {
            return this.zza.zza(bArr, bArr2);
        }
        if (!zzgpi.zzb(this.zzc, bArr)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
    }
}
