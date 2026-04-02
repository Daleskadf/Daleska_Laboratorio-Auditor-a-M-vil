package com.google.android.recaptcha.internal;
/* loaded from: classes.dex */
final class zzoa implements zzox {
    private static final zzog zza = new zzny();
    private final zzog zzb;

    public zzoa() {
        zzmw zza2 = zzmw.zza();
        int i7 = zzos.zza;
        zznz zznzVar = new zznz(zza2, zza);
        byte[] bArr = zznl.zzb;
        this.zzb = zznzVar;
    }

    @Override // com.google.android.recaptcha.internal.zzox
    public final zzow zza(Class cls) {
        zzmp zzmpVar;
        int i7 = zzoy.zza;
        if (!zznd.class.isAssignableFrom(cls)) {
            int i8 = zzos.zza;
        }
        zzof zzb = this.zzb.zzb(cls);
        if (!zzb.zzb()) {
            int i9 = zzos.zza;
            zzoo zza2 = zzop.zza();
            zznv zza3 = zznw.zza();
            zzpl zzm = zzoy.zzm();
            if (zzb.zzc() - 1 != 1) {
                zzmpVar = zzmr.zza();
            } else {
                zzmpVar = null;
            }
            return zzol.zzm(cls, zzb, zza2, zza3, zzm, zzmpVar, zzoe.zza());
        }
        int i10 = zzos.zza;
        return zzom.zzc(zzoy.zzm(), zzmr.zza(), zzb.zza());
    }
}
