package com.google.android.recaptcha.internal;

import G.i;
import l6.c;
import l6.g;
import l6.j;
import m5.d;
import m6.s;
/* loaded from: classes.dex */
public final class zzp implements zzy {
    private final zzek zza;
    private final c zzb;
    private boolean zzc;

    public zzp(zzek zzekVar) {
        this.zza = zzekVar;
        int i7 = zzav.zza;
        this.zzb = d.m(zzo.zza);
        this.zzc = true;
    }

    private final zzbf zzg() {
        return (zzbf) ((g) this.zzb).a();
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(String str, n6.d dVar) {
        zzen zzb = zzz.zzb(this, str);
        String zza = zzg().zza();
        zzb.zza();
        zztf zzf = zzti.zzf();
        zztg zzf2 = zzth.zzf();
        zzf2.zzw(zza);
        zzf.zze(i.A(zzf2.zzk()));
        return zzz.zza(this, (zzti) zzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzd(zzse zzseVar, n6.d dVar) {
        zzen zzc = zzz.zzc(this);
        int length = zzseVar.zzl().length();
        j jVar = j.f13876a;
        if (length == 0) {
            this.zzc = false;
            zzc.zzb(new zzbd(zzbb.zzb, zzba.zzab, null));
            return jVar;
        }
        zzg().zzb(s.P(new l6.d("_GRECAPTCHA_KC", zzseVar.zzl())));
        zzc.zza();
        return jVar;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(zzsr zzsrVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return this.zzc;
    }
}
