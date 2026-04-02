package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzye extends zzyt implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzyl zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    public zzye(int i, zzcz zzczVar, int i2, zzyl zzylVar, int i3, boolean z, zzfws zzfwsVar, int i4) {
        super(i, zzczVar, i2);
        int i5;
        int i6;
        String[] strArr;
        int i7;
        boolean z2;
        LocaleList locales;
        String languageTags;
        this.zzh = zzylVar;
        int i8 = 1;
        int i9 = true != zzylVar.zzR ? 16 : 24;
        boolean z3 = zzylVar.zzN;
        this.zzg = zzyx.zzh(this.zzd.zzd);
        this.zzi = zzyx.zzo(i3, false);
        int i10 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i10 >= zzylVar.zzq.size()) {
                i10 = Integer.MAX_VALUE;
                i6 = 0;
                break;
            }
            i6 = zzyx.zzc(this.zzd, (String) zzylVar.zzq.get(i10), false);
            if (i6 > 0) {
                break;
            }
            i10++;
        }
        this.zzk = i10;
        this.zzj = i6;
        int i11 = this.zzd.zzf;
        int i12 = zzylVar.zzr;
        this.zzl = zzyx.zzb(i11, 0);
        zzam zzamVar = this.zzd;
        int i13 = zzamVar.zzf;
        this.zzm = i13 == 0 || (i13 & 1) != 0;
        this.zzp = 1 == (zzamVar.zze & 1);
        this.zzq = zzamVar.zzz;
        this.zzr = zzamVar.zzA;
        this.zzs = zzamVar.zzi;
        if (zzamVar.zzi != -1) {
            int i14 = zzylVar.zzt;
        }
        if (zzamVar.zzz != -1) {
            int i15 = zzylVar.zzs;
        }
        this.zzf = zzfwsVar.zza(zzamVar);
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (zzfx.zza >= 24) {
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            strArr = languageTags.split(",", -1);
        } else {
            strArr = new String[]{configuration.locale.toLanguageTag()};
        }
        for (int i16 = 0; i16 < strArr.length; i16++) {
            strArr[i16] = zzfx.zzD(strArr[i16]);
        }
        int i17 = 0;
        while (true) {
            if (i17 >= strArr.length) {
                i17 = Integer.MAX_VALUE;
                i7 = 0;
                break;
            }
            i7 = zzyx.zzc(this.zzd, strArr[i17], false);
            if (i7 > 0) {
                break;
            }
            i17++;
        }
        this.zzn = i17;
        this.zzo = i7;
        int i18 = 0;
        while (true) {
            if (i18 >= zzylVar.zzu.size()) {
                break;
            }
            String str = this.zzd.zzm;
            if (str != null && str.equals(zzylVar.zzu.get(i18))) {
                i5 = i18;
                break;
            }
            i18++;
        }
        this.zzt = i5;
        this.zzu = (i3 & 384) == 128;
        this.zzv = (i3 & 64) == 64;
        zzyl zzylVar2 = this.zzh;
        if (zzyx.zzo(i3, zzylVar2.zzT) && ((z2 = this.zzf) || zzylVar2.zzM)) {
            zzde zzdeVar = zzylVar2.zzv;
            if (zzyx.zzo(i3, false) && z2 && this.zzd.zzi != -1) {
                boolean z4 = zzylVar2.zzC;
                boolean z5 = zzylVar2.zzB;
                if ((zzylVar2.zzV || !z) && (i9 & i3) != 0) {
                    i8 = 2;
                }
            }
        } else {
            i8 = 0;
        }
        this.zze = i8;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzye zzyeVar) {
        zzgay zzgayVar;
        zzgay zza;
        if (this.zzf && this.zzi) {
            zza = zzyx.zzb;
        } else {
            zzgayVar = zzyx.zzb;
            zza = zzgayVar.zza();
        }
        zzfzc zzd = zzfzc.zzk().zze(this.zzi, zzyeVar.zzi).zzd(Integer.valueOf(this.zzk), Integer.valueOf(zzyeVar.zzk), zzgay.zzc().zza()).zzb(this.zzj, zzyeVar.zzj).zzb(this.zzl, zzyeVar.zzl).zze(this.zzp, zzyeVar.zzp).zze(this.zzm, zzyeVar.zzm).zzd(Integer.valueOf(this.zzn), Integer.valueOf(zzyeVar.zzn), zzgay.zzc().zza()).zzb(this.zzo, zzyeVar.zzo).zze(this.zzf, zzyeVar.zzf).zzd(Integer.valueOf(this.zzt), Integer.valueOf(zzyeVar.zzt), zzgay.zzc().zza());
        boolean z = this.zzh.zzB;
        zzfzc zzd2 = zzd.zze(this.zzu, zzyeVar.zzu).zze(this.zzv, zzyeVar.zzv).zzd(Integer.valueOf(this.zzq), Integer.valueOf(zzyeVar.zzq), zza).zzd(Integer.valueOf(this.zzr), Integer.valueOf(zzyeVar.zzr), zza);
        if (zzfx.zzG(this.zzg, zzyeVar.zzg)) {
            zzd2 = zzd2.zzd(Integer.valueOf(this.zzs), Integer.valueOf(zzyeVar.zzs), zza);
        }
        return zzd2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final /* bridge */ /* synthetic */ boolean zzc(zzyt zzytVar) {
        String str;
        zzye zzyeVar = (zzye) zzytVar;
        boolean z = this.zzh.zzP;
        zzam zzamVar = this.zzd;
        int i = zzamVar.zzz;
        if (i != -1) {
            zzam zzamVar2 = zzyeVar.zzd;
            if (i == zzamVar2.zzz && (str = zzamVar.zzm) != null && TextUtils.equals(str, zzamVar2.zzm)) {
                zzyl zzylVar = this.zzh;
                boolean z2 = zzylVar.zzO;
                int i2 = this.zzd.zzA;
                if (i2 == -1 || i2 != zzyeVar.zzd.zzA) {
                    return false;
                }
                boolean z3 = zzylVar.zzQ;
                return this.zzu == zzyeVar.zzu && this.zzv == zzyeVar.zzv;
            }
            return false;
        }
        return false;
    }
}
