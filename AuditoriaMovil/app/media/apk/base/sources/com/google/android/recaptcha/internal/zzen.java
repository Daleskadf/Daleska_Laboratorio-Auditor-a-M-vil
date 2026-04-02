package com.google.android.recaptcha.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;
import m5.d;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class zzen {
    private static zzqk zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final zzeo zzf;
    private final Context zzg;
    private final Integer zzh;
    private final String zzi = zzqb.zzc(zzqb.zzb(System.currentTimeMillis()));
    private final long zzj = System.currentTimeMillis();
    private final int zzk;
    private final int zzl;

    public zzen(int i7, String str, int i8, String str2, String str3, String str4, String str5, zzeo zzeoVar, zzcc zzccVar, Context context, Integer num) {
        this.zzk = i7;
        this.zzb = str;
        this.zzl = i8;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = zzeoVar;
        this.zzg = context;
        this.zzh = num;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00df -> B:36:0x00df). Please submit an issue!!! */
    private final void zzc(int i7, zzqq zzqqVar) {
        zzbl zzblVar;
        String str;
        String str2;
        long longVersionCode;
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        long longVersionCode2;
        PackageManager.ApplicationInfoFlags of2;
        ApplicationInfo applicationInfo;
        String str3 = StringUtils.EMPTY;
        zzra zzi = zzrc.zzi();
        zzi.zzy(this.zzk);
        zzi.zzq(this.zzc);
        zzi.zzt(this.zzd);
        zzi.zzz(this.zzl);
        String str4 = this.zze;
        if (str4 != null) {
            zzi.zzx(str4);
        }
        Integer num = this.zzh;
        if (num != null) {
            zzi.zzv(num.intValue());
        }
        if (zzqqVar != null) {
            zzi.zzs(zzqqVar);
        }
        zzi.zzA(i7);
        zzi.zzw(this.zzi);
        zzi.zzr(System.currentTimeMillis() - this.zzj);
        int i8 = zzav.zza;
        for (zzax zzaxVar : ((zzaz) d.m(zzel.zza).a()).zza()) {
            zzi.zzf(0);
        }
        int i9 = zzbk.zza;
        int i10 = this.zzk;
        long zze = zzi.zze() * 1000;
        int i11 = i10 - 2;
        if (i11 != 4) {
            if (i11 != 5) {
                if (i11 != 6) {
                    if (i11 != 7) {
                        if (i11 != 14) {
                            zzblVar = zzbl.zza;
                        } else {
                            zzblVar = zzbl.zzf;
                        }
                    } else {
                        zzblVar = zzbl.zze;
                    }
                } else {
                    zzblVar = zzbl.zzd;
                }
            } else {
                zzblVar = zzbl.zzc;
            }
        } else {
            zzblVar = zzbl.zzb;
        }
        zzbk.zza(zzblVar.zza(), zze);
        zzbe zzbeVar = (zzbe) d.m(zzem.zza).a();
        Context context = this.zzg;
        Set zza2 = zzbe.zza(context);
        zzqk zzqkVar = zza;
        if (zzqkVar == null) {
            zzqh zzf = zzqk.zzf();
            int i12 = Build.VERSION.SDK_INT;
            zzf.zzf(i12);
            String str5 = "unknown";
            if (i12 >= 33) {
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                of2 = PackageManager.ApplicationInfoFlags.of(128L);
                applicationInfo = packageManager.getApplicationInfo(packageName, of2);
                int i13 = applicationInfo.metaData.getInt("com.google.android.gms.version", -1);
                if (i13 != -1) {
                    str2 = String.valueOf(i13);
                }
                str2 = "unknown";
            } else {
                int i14 = context.getPackageManager().getApplicationInfo(context.getPackageName(), RecognitionOptions.ITF).metaData.getInt("com.google.android.gms.version", -1);
                if (i14 == -1) {
                    str2 = "unknown";
                } else {
                    str2 = String.valueOf(i14);
                }
            }
            zzf.zzs(str2);
            zzf.zzu("18.6.1");
            zzf.zzr(Build.MODEL);
            zzf.zzt(Build.MANUFACTURER);
            try {
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 33) {
                    PackageManager packageManager2 = context.getPackageManager();
                    String packageName2 = context.getPackageName();
                    of = PackageManager.PackageInfoFlags.of(0L);
                    packageInfo = packageManager2.getPackageInfo(packageName2, of);
                    longVersionCode2 = packageInfo.getLongVersionCode();
                    str5 = String.valueOf(longVersionCode2);
                } else if (i15 >= 28) {
                    longVersionCode = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode();
                    str5 = String.valueOf(longVersionCode);
                } else {
                    str5 = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            zzf.zzq(str5);
            zzqkVar = (zzqk) zzf.zzk();
        }
        zza = zzqkVar;
        zzqh zzqhVar = (zzqh) zzqkVar.zzr();
        zzqhVar.zze(zza2);
        zzqk zzqkVar2 = (zzqk) zzqhVar.zzk();
        try {
            str = Locale.getDefault().getISO3Language();
        } catch (MissingResourceException unused2) {
            str = StringUtils.EMPTY;
        }
        try {
            str3 = Locale.getDefault().getISO3Country();
        } catch (MissingResourceException unused3) {
        }
        String str6 = this.zzb;
        zzrm zzf2 = zzro.zzf();
        zzf2.zzr(str6);
        zzf2.zze(zzqkVar2);
        zzf2.zzq(str);
        zzf2.zzf(str3);
        zzi.zzu((zzro) zzf2.zzk());
        zztw zzi2 = zztx.zzi();
        zzi2.zze(zzi);
        this.zzf.zza((zztx) zzi2.zzk());
    }

    public final void zza() {
        zzc(3, null);
    }

    public final void zzb(zzbd zzbdVar) {
        zzqo zzg = zzqq.zzg();
        zzg.zzr(String.valueOf(zzbdVar.zzb().zza()));
        zzg.zze(zzbdVar.zza().zza());
        zzg.zzq(zzbdVar.zzc().getErrorCode().getErrorCode());
        String zzd = zzbdVar.zzd();
        if (zzd != null) {
            zzg.zzf(zzd);
        }
        zzc(4, (zzqq) zzg.zzk());
    }
}
