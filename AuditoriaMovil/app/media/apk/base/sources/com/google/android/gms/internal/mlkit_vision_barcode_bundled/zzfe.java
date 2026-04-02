package com.google.android.gms.internal.mlkit_vision_barcode_bundled;
/* loaded from: classes.dex */
final class zzfe implements zzgf {
    private static final zzfk zza = new zzfc();
    private final zzfk zzb;

    public zzfe() {
        zzea zza2 = zzea.zza();
        int i7 = zzfu.zza;
        zzfd zzfdVar = new zzfd(zza2, zza);
        byte[] bArr = zzep.zzb;
        this.zzb = zzfdVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgf
    public final zzge zza(Class cls) {
        zzdt zzdtVar;
        int i7 = zzgg.zza;
        if (!zzeh.class.isAssignableFrom(cls)) {
            int i8 = zzfu.zza;
        }
        zzfj zzb = this.zzb.zzb(cls);
        if (!zzb.zzb()) {
            int i9 = zzfu.zza;
            zzfs zza2 = zzft.zza();
            zzez zza3 = zzfa.zza();
            zzgs zzm = zzgg.zzm();
            if (zzb.zzc() - 1 != 1) {
                zzdtVar = zzdv.zza();
            } else {
                zzdtVar = null;
            }
            return zzfp.zzl(cls, zzb, zza2, zza3, zzm, zzdtVar, zzfi.zza());
        }
        int i10 = zzfu.zza;
        return zzfq.zzc(zzgg.zzm(), zzdv.zza(), zzb.zza());
    }
}
