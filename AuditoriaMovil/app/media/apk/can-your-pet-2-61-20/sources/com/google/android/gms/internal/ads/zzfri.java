package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfri {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzazh zzd;

    public zzfri(Context context, zzazh zzazhVar) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfrj.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfrj.zza(dir2, true);
        this.zza = dir2;
        this.zzd = zzazhVar;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd.zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        int zza = this.zzd.zza();
        return "FBAMTD" + zza;
    }

    private final String zzf() {
        int zza = this.zzd.zza();
        return "LATMTD" + zza;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzazk r8, com.google.android.gms.internal.ads.zzfro r9) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfri.zza(com.google.android.gms.internal.ads.zzazk, com.google.android.gms.internal.ads.zzfro):boolean");
    }

    final zzazn zzb(int i) {
        String string;
        if (i == 1) {
            string = this.zzc.getString(zzf(), null);
        } else {
            string = this.zzc.getString(zze(), null);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] stringToBytes = Hex.stringToBytes(string);
            zzgyj zzgyjVar = zzgyj.zzb;
            zzazn zzh = zzazn.zzh(zzgyj.zzv(stringToBytes, 0, stringToBytes.length));
            String zzk = zzh.zzk();
            File zzb = zzfrj.zzb(zzk, "pcam.jar", zzd());
            if (!zzb.exists()) {
                zzb = zzfrj.zzb(zzk, "pcam", zzd());
            }
            File zzb2 = zzfrj.zzb(zzk, "pcbc", zzd());
            if (zzb.exists()) {
                if (zzb2.exists()) {
                    return zzh;
                }
            }
        } catch (zzhak unused) {
        }
        return null;
    }

    public final zzfrh zzc(int i) {
        zzazn zzb = zzb(1);
        if (zzb == null) {
            return null;
        }
        String zzk = zzb.zzk();
        File zzb2 = zzfrj.zzb(zzk, "pcam.jar", zzd());
        if (!zzb2.exists()) {
            zzb2 = zzfrj.zzb(zzk, "pcam", zzd());
        }
        return new zzfrh(zzb, zzb2, zzfrj.zzb(zzk, "pcbc", zzd()), zzfrj.zzb(zzk, "pcopt", zzd()));
    }
}
