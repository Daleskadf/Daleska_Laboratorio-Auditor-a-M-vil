package com.google.android.gms.internal.p002firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkq  reason: invalid package */
/* loaded from: classes.dex */
public final class zzkq {
    public static final zzwf zza;
    private static final byte[] zzb;

    static {
        byte[] bArr = new byte[0];
        zzb = bArr;
        zzuw zzuwVar = zzuw.NIST_P256;
        zzvc zzvcVar = zzvc.SHA256;
        zzuf zzufVar = zzuf.UNCOMPRESSED;
        zzwf zzwfVar = zzcs.zza;
        zzxd zzxdVar = zzxd.TINK;
        zza = zza(zzuwVar, zzvcVar, zzufVar, zzwfVar, zzxdVar, bArr);
        zza(zzuwVar, zzvcVar, zzuf.COMPRESSED, zzwfVar, zzxd.RAW, bArr);
        zza(zzuwVar, zzvcVar, zzufVar, zzcs.zzb, zzxdVar, bArr);
    }

    @Deprecated
    private static zzwf zza(zzuw zzuwVar, zzvc zzvcVar, zzuf zzufVar, zzwf zzwfVar, zzxd zzxdVar, byte[] bArr) {
        return (zzwf) ((zzakg) zzwf.zza().zza(zzjm.zza()).zza(zzxdVar).zza(((zzuh) ((zzakg) zzuh.zza().zza((zzuk) ((zzakg) zzuk.zzc().zza((zzut) ((zzakg) zzut.zza().zza(zzuwVar).zza(zzvcVar).zza(zzaiw.zza(bArr)).zze())).zza((zzue) ((zzakg) zzue.zza().zza(zzwfVar).zze())).zza(zzufVar).zze())).zze())).zzj()).zze());
    }
}
