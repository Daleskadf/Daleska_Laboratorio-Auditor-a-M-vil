package com.google.android.recaptcha.internal;

import android.os.Build;
import l6.j;
import m6.AbstractC1446g;
import m6.AbstractC1448i;
import n6.d;
/* loaded from: classes.dex */
public final class zzn implements zzy {
    private final zzek zza;

    public zzn(zzek zzekVar) {
        this.zza = zzekVar;
    }

    private static final zzth zzg(String str) {
        zztg zzf = zzth.zzf();
        zzf.zzw(str);
        return (zzth) zzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(String str, d dVar) {
        zzen zzb = zzz.zzb(this, str);
        zztf zzf = zzti.zzf();
        zzth zzg = zzg(Build.MANUFACTURER);
        zzth zzg2 = zzg(Build.MODEL);
        zzth zzg3 = zzg(Build.DEVICE);
        zzth zzg4 = zzg(Build.HARDWARE);
        zzth zzg5 = zzg(Build.FINGERPRINT);
        zzth zzg6 = zzg(Build.PRODUCT);
        zzth zzg7 = zzg(Build.BOARD);
        zzth zzg8 = zzg(Build.BRAND);
        zzth zzg9 = zzg(AbstractC1446g.P(Build.SUPPORTED_ABIS));
        long j = Build.TIME;
        zztg zzf2 = zzth.zzf();
        zzf2.zzv(j);
        zzf.zze(AbstractC1448i.L(zzg, zzg2, zzg3, zzg4, zzg5, zzg6, zzg7, zzg8, zzg9, (zzth) zzf2.zzk(), zzg(Build.ID), zzg(Build.BOOTLOADER), zzg(Build.DISPLAY), zzg(Build.TYPE), zzg(Build.TAGS)));
        zzb.zza();
        return zzz.zza(this, (zzti) zzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzd(zzse zzseVar, d dVar) {
        zzz.zzc(this).zza();
        return j.f13876a;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(zzsr zzsrVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return true;
    }
}
