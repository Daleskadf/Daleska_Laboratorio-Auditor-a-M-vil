package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import H4.e1;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Map;
/* loaded from: classes.dex */
final class zzdu extends zzdt {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdt
    public final void zza(Object obj) {
        ((zzed) obj).zzb.zzg();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdt
    public final void zzb(zzhh zzhhVar, Map.Entry entry) {
        zzee zzeeVar = (zzee) entry.getKey();
        zzhf zzhfVar = zzhf.zza;
        switch (zzeeVar.zzb.ordinal()) {
            case 0:
                zzhhVar.zzf(zzeeVar.zza, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                zzhhVar.zzo(zzeeVar.zza, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                zzhhVar.zzt(zzeeVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                zzhhVar.zzK(zzeeVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zzhhVar.zzr(zzeeVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                zzhhVar.zzm(zzeeVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                zzhhVar.zzk(zzeeVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                zzhhVar.zzb(zzeeVar.zza, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                zzhhVar.zzG(zzeeVar.zza, (String) entry.getValue());
                return;
            case 9:
                zzhhVar.zzq(zzeeVar.zza, entry.getValue(), zzfu.zza().zzb(entry.getValue().getClass()));
                return;
            case 10:
                zzhhVar.zzv(zzeeVar.zza, entry.getValue(), zzfu.zza().zzb(entry.getValue().getClass()));
                return;
            case 11:
                zzhhVar.zzd(zzeeVar.zza, (zzdf) entry.getValue());
                return;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                zzhhVar.zzI(zzeeVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zzhhVar.zzr(zzeeVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                zzhhVar.zzx(zzeeVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zzhhVar.zzz(zzeeVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                zzhhVar.zzB(zzeeVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                zzhhVar.zzD(zzeeVar.zza, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }
}
