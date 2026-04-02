package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgrp implements zzggh {
    private final zzggh zza;
    private final zzgvv zzb;
    private final byte[] zzc;

    private zzgrp(zzggh zzgghVar, zzgvv zzgvvVar, byte[] bArr) {
        this.zza = zzgghVar;
        this.zzb = zzgvvVar;
        this.zzc = bArr;
    }

    public static zzggh zza(zzgnd zzgndVar) throws GeneralSecurityException {
        byte[] array;
        zzgot zza = zzgndVar.zza(zzgfs.zza());
        zzgum zza2 = zzgup.zza();
        zza2.zzb(zza.zzg());
        zza2.zzc(zza.zze());
        zza2.zza(zza.zzb());
        zzggh zzgghVar = (zzggh) zzggm.zzb((zzgup) zza2.zzbr(), zzggh.class);
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
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            array = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgndVar.zzb().intValue()).array();
        }
        return new zzgrp(zzgghVar, zzc, array);
    }
}
