package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzqv {
    private final Context zza;
    private Boolean zzb;

    public zzqv() {
        this.zza = null;
    }

    public zzqv(Context context) {
        this.zza = context;
    }

    public final zzps zza(zzam zzamVar, zzk zzkVar) {
        boolean booleanValue;
        zzamVar.getClass();
        zzkVar.getClass();
        if (zzfx.zza < 29 || zzamVar.zzA == -1) {
            return zzps.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            boolean z = false;
            if (context != null) {
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                if (audioManager != null) {
                    String parameters = audioManager.getParameters("offloadVariableRateSupported");
                    if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                        z = true;
                    }
                    this.zzb = Boolean.valueOf(z);
                } else {
                    this.zzb = false;
                }
            } else {
                this.zzb = false;
            }
            booleanValue = this.zzb.booleanValue();
        }
        String str = zzamVar.zzm;
        str.getClass();
        int zza = zzcb.zza(str, zzamVar.zzj);
        if (zza == 0 || zzfx.zza < zzfx.zzg(zza)) {
            return zzps.zza;
        }
        int zzh = zzfx.zzh(zzamVar.zzz);
        if (zzh == 0) {
            return zzps.zza;
        }
        try {
            AudioFormat zzw = zzfx.zzw(zzamVar.zzA, zzh, zza);
            if (zzfx.zza >= 31) {
                return zzqu.zza(zzw, zzkVar.zza().zza, booleanValue);
            }
            return zzqt.zza(zzw, zzkVar.zza().zza, booleanValue);
        } catch (IllegalArgumentException unused) {
            return zzps.zza;
        }
    }
}
