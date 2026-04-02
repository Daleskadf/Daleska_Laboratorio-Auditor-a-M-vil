package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzggp {
    public static zzggi zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzguu zzf = zzguu.zzf(bArr, zzgzf.zza());
            zzgnu zzc = zzgnu.zzc();
            zzgou zza = zzgou.zza(zzf);
            return !zzc.zzk(zza) ? new zzgne(zza) : zzc.zzb(zza);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] zzb(zzggi zzggiVar) throws GeneralSecurityException {
        return ((zzgou) zzgnu.zzc().zze(zzggiVar, zzgou.class)).zzc().zzaV();
    }
}
