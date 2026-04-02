package com.google.android.recaptcha.internal;

import E6.m;
import F6.H;
import l6.c;
import l6.g;
import m5.d;
/* loaded from: classes.dex */
public final class zzff {
    private final c zza;
    private final c zzb;
    private final c zzc;

    public zzff() {
        int i7 = zzav.zza;
        this.zza = d.m(zzfc.zza);
        this.zzb = d.m(zzfd.zza);
        this.zzc = d.m(zzfe.zza);
    }

    public static final /* synthetic */ zzfk zzb(zzff zzffVar) {
        return (zzfk) ((g) zzffVar.zza).a();
    }

    public static /* synthetic */ Object zze(zzff zzffVar, zzsc zzscVar, zzek zzekVar, n6.d dVar) {
        try {
            String zzl = zzscVar.zzl();
            String zzM = zzscVar.zzM();
            zzaq zzf = zzffVar.zzf();
            String str = null;
            if (zzf != null && zzf.zzd(zzM)) {
                zzen zzf2 = zzekVar.zzf(25);
                try {
                    String zza = zzffVar.zzf().zza(zzM);
                    if (zza != null) {
                        zzf2.zza();
                        str = zza;
                    }
                } catch (Exception e7) {
                    zzf2.zzb(new zzbd(zzbb.zzk, zzba.zzR, e7.getMessage()));
                }
                zzf2.zzb(new zzbd(zzbb.zzk, zzba.zzS, null));
            }
            if (str == null) {
                zzaq zzf3 = zzffVar.zzf();
                if (zzf3 != null) {
                    zzf3.zzb();
                }
                zzen zzf4 = zzekVar.zzf(23);
                try {
                    str = zzffVar.zzg().zzb(zzl);
                    zzf4.zza();
                    zzen zzf5 = zzekVar.zzf(24);
                    try {
                        zzaq zzf6 = zzffVar.zzf();
                        if (zzf6 != null) {
                            zzf6.zzc(zzM, str);
                        }
                        zzf5.zza();
                    } catch (Exception e8) {
                        zzf5.zzb(new zzbd(zzbb.zzk, zzba.zzT, e8.getMessage()));
                    }
                } catch (zzbd e9) {
                    zzf4.zzb(e9);
                    throw e9;
                }
            }
            return m.Z(zzscVar.zzk(), "JAVASCRIPT_TAG", str);
        } catch (Exception e10) {
            if (e10 instanceof zzbd) {
                throw e10;
            }
            throw new zzbd(zzbb.zzb, zzba.zzL, e10.getMessage());
        }
    }

    private final zzaq zzf() {
        return (zzaq) ((g) this.zzb).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzey zzg() {
        return (zzey) ((g) this.zzc).a();
    }

    public final Object zzc(String str, zzto zztoVar, n6.d dVar) {
        return H.e(new zzfb(this, str, zztoVar, null), dVar);
    }

    public final Object zzd(zzsc zzscVar, zzek zzekVar, n6.d dVar) {
        return zze(this, zzscVar, zzekVar, dVar);
    }
}
