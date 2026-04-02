package com.google.android.gms.internal.gtm;

import android.util.Log;
import com.google.android.gms.tagmanager.zzfu;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
public final class zzsd {
    public static zzam zza(zzam zzamVar) {
        zzan zzg = zzam.zzg();
        zzg.zzt(zzat.zza);
        zzg.zzt(zzamVar.zzh());
        zzg.zzi();
        zzg.zza(zzamVar.zzr());
        zzg.zzo(zzamVar.zzP());
        return zzg.zzB();
    }

    public static zzrv zzb(zzac zzacVar) throws zzsc {
        zzam[] zzamVarArr = new zzam[zzacVar.zzf()];
        for (int i = 0; i < zzacVar.zzf(); i++) {
            zze(i, zzacVar, zzamVarArr, new HashSet(0));
        }
        zzrx zzrxVar = new zzrx(null);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < zzacVar.zze(); i2++) {
            arrayList.add(zzf(zzacVar.zzi(i2), zzacVar, zzamVarArr));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < zzacVar.zzc(); i3++) {
            arrayList2.add(zzf(zzacVar.zzh(i3), zzacVar, zzamVarArr));
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i4 = 0; i4 < zzacVar.zza(); i4++) {
            zzrr zzf = zzf(zzacVar.zzg(i4), zzacVar, zzamVarArr);
            zzrxVar.zzb(zzf);
            arrayList3.add(zzf);
        }
        for (zzae zzaeVar : zzacVar.zzq()) {
            zzsb zzsbVar = new zzsb(null);
            for (Integer num : zzaeVar.zzh()) {
                zzsbVar.zzg((zzrr) arrayList2.get(num.intValue()));
            }
            for (Integer num2 : zzaeVar.zzg()) {
                zzsbVar.zzf((zzrr) arrayList2.get(num2.intValue()));
            }
            for (Integer num3 : zzaeVar.zze()) {
                zzsbVar.zzd((zzrr) arrayList.get(num3.intValue()));
            }
            for (Integer num4 : zzaeVar.zzf()) {
                zzsbVar.zze(zzacVar.zzm(num4.intValue()).zzq());
            }
            for (Integer num5 : zzaeVar.zzk()) {
                zzsbVar.zzj((zzrr) arrayList.get(num5.intValue()));
            }
            for (Integer num6 : zzaeVar.zzl()) {
                zzsbVar.zzk(zzacVar.zzm(num6.intValue()).zzq());
            }
            for (Integer num7 : zzaeVar.zzc()) {
                zzsbVar.zzb((zzrr) arrayList3.get(num7.intValue()));
            }
            for (Integer num8 : zzaeVar.zzd()) {
                zzsbVar.zzc(zzacVar.zzm(num8.intValue()).zzq());
            }
            for (Integer num9 : zzaeVar.zzi()) {
                zzsbVar.zzh((zzrr) arrayList3.get(num9.intValue()));
            }
            for (Integer num10 : zzaeVar.zzj()) {
                zzsbVar.zzi(zzacVar.zzm(num10.intValue()).zzq());
            }
            zzrxVar.zzc(zzsbVar.zza());
        }
        zzrxVar.zze(zzacVar.zzn());
        zzrxVar.zzd(zzacVar.zzd());
        return zzrxVar.zza();
    }

    public static void zzc(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    private static zzag zzd(zzam zzamVar) throws zzsc {
        if (!zzamVar.zzV(zzag.zza)) {
            zzh("Expected a ServingValue and didn't get one. Value is: ".concat(String.valueOf(String.valueOf(zzamVar))));
        }
        return (zzag) zzamVar.zzU(zzag.zza);
    }

    private static zzam zze(int i, zzac zzacVar, zzam[] zzamVarArr, Set set) throws zzsc {
        zzxp zzxpVar;
        Integer valueOf = Integer.valueOf(i);
        if (set.contains(valueOf)) {
            String obj = set.toString();
            zzh("Value cycle detected.  Current value reference: " + i + ".  Previous value references: " + obj + ".");
        }
        zzxp zzxpVar2 = (zzan) ((zzam) zzg(zzacVar.zzr(), i, "values")).zzZ();
        zzam zzamVar = zzamVarArr[i];
        if (zzamVar != null) {
            return zzamVar;
        }
        set.add(valueOf);
        zzat zzatVar = zzat.zza;
        switch (zzxpVar2.zzu().ordinal()) {
            case 0:
            case 4:
            case 5:
            case 7:
                zzxpVar = zzxpVar2;
                break;
            case 1:
                zzag zzd = zzd(zzxpVar2.zzB());
                zzxp zzxpVar3 = (zzan) zza(zzxpVar2.zzB()).zzZ();
                zzxpVar3.zzj();
                for (Integer num : zzd.zzf()) {
                    zzxpVar3.zze(zze(num.intValue(), zzacVar, zzamVarArr, set));
                }
                zzxpVar = zzxpVar3;
                break;
            case 2:
                zzxpVar = (zzan) zza(zzxpVar2.zzB()).zzZ();
                zzag zzd2 = zzd(zzxpVar2.zzB());
                if (zzd2.zzc() != zzd2.zzd()) {
                    int zzc = zzd2.zzc();
                    int zzd3 = zzd2.zzd();
                    zzh("Uneven map keys (" + zzc + ") and map values (" + zzd3 + ")");
                }
                zzxpVar.zzk();
                zzxpVar.zzl();
                for (Integer num2 : zzd2.zzg()) {
                    zzxpVar.zzf(zze(num2.intValue(), zzacVar, zzamVarArr, set));
                }
                for (Integer num3 : zzd2.zzh()) {
                    zzxpVar.zzg(zze(num3.intValue(), zzacVar, zzamVarArr, set));
                }
                break;
            case 3:
                zzxpVar = (zzan) zza(zzxpVar2.zzB()).zzZ();
                zzxpVar.zzr(zzfu.zzm(zzfu.zzk(zze(zzd(zzxpVar2.zzB()).zza(), zzacVar, zzamVarArr, set))));
                break;
            case 6:
                zzxpVar = (zzan) zza(zzxpVar2.zzB()).zzZ();
                zzag zzd4 = zzd(zzxpVar2.zzB());
                zzxpVar.zzm();
                for (Integer num4 : zzd4.zzi()) {
                    zzxpVar.zzh(zze(num4.intValue(), zzacVar, zzamVarArr, set));
                }
                break;
            default:
                zzxpVar = null;
                break;
        }
        if (zzxpVar == null) {
            zzh("Invalid value: ".concat(zzxpVar2.toString()));
        }
        zzamVarArr[i] = (zzam) zzxpVar.zzB();
        set.remove(Integer.valueOf(i));
        return zzxpVar.zzB();
    }

    private static zzrr zzf(zzu zzuVar, zzac zzacVar, zzam[] zzamVarArr) throws zzsc {
        zzrt zzrtVar = new zzrt(null);
        for (Integer num : zzuVar.zzc()) {
            zzaa zzaaVar = (zzaa) zzg(zzacVar.zzp(), num.intValue(), "properties");
            String str = (String) zzg(zzacVar.zzo(), zzaaVar.zza(), "keys");
            int zzc = zzaaVar.zzc();
            if (zzc < 0 || zzc >= zzamVarArr.length) {
                zzh("Index out of bounds detected: " + zzc + " in values");
            }
            zzam zzamVar = zzamVarArr[zzc];
            if (zzb.zzcL.toString().equals(str)) {
                zzrtVar.zzc(zzamVar);
            } else {
                zzrtVar.zzb(str, zzamVar);
            }
        }
        return zzrtVar.zza();
    }

    private static Object zzg(List list, int i, String str) throws zzsc {
        if (i < 0 || i >= list.size()) {
            zzh("Index out of bounds detected: " + i + " in " + str);
        }
        return list.get(i);
    }

    private static void zzh(String str) throws zzsc {
        Log.e("GoogleTagManager", str);
        throw new zzsc(str);
    }
}
