package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;
import kotlinx.coroutines.scheduling.WorkQueueKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgxw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i, zzgxv zzgxvVar) throws zzhak {
        int zzh = zzh(bArr, i, zzgxvVar);
        int i2 = zzgxvVar.zza;
        if (i2 < 0) {
            throw zzhak.zzf();
        }
        if (i2 <= bArr.length - zzh) {
            if (i2 == 0) {
                zzgxvVar.zzc = zzgyj.zzb;
                return zzh;
            }
            zzgxvVar.zzc = zzgyj.zzv(bArr, zzh, i2);
            return zzh + i2;
        }
        throw zzhak.zzj();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i) {
        int i2 = (bArr[i + 1] & 255) << 8;
        return ((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(zzhcg zzhcgVar, byte[] bArr, int i, int i2, int i3, zzgxv zzgxvVar) throws IOException {
        Object zze = zzhcgVar.zze();
        int zzl = zzl(zze, zzhcgVar, bArr, i, i2, i3, zzgxvVar);
        zzhcgVar.zzf(zze);
        zzgxvVar.zzc = zze;
        return zzl;
    }

    static int zzd(zzhcg zzhcgVar, byte[] bArr, int i, int i2, zzgxv zzgxvVar) throws IOException {
        Object zze = zzhcgVar.zze();
        int zzm = zzm(zze, zzhcgVar, bArr, i, i2, zzgxvVar);
        zzhcgVar.zzf(zze);
        zzgxvVar.zzc = zze;
        return zzm;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(zzhcg zzhcgVar, int i, byte[] bArr, int i2, int i3, zzhah zzhahVar, zzgxv zzgxvVar) throws IOException {
        int zzd = zzd(zzhcgVar, bArr, i2, i3, zzgxvVar);
        zzhahVar.add(zzgxvVar.zzc);
        while (zzd < i3) {
            int zzh = zzh(bArr, zzd, zzgxvVar);
            if (i != zzgxvVar.zza) {
                break;
            }
            zzd = zzd(zzhcgVar, bArr, zzh, i3, zzgxvVar);
            zzhahVar.add(zzgxvVar.zzc);
        }
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(byte[] bArr, int i, zzhah zzhahVar, zzgxv zzgxvVar) throws IOException {
        zzgzw zzgzwVar = (zzgzw) zzhahVar;
        int zzh = zzh(bArr, i, zzgxvVar);
        int i2 = zzgxvVar.zza + zzh;
        while (zzh < i2) {
            zzh = zzh(bArr, zzh, zzgxvVar);
            zzgzwVar.zzi(zzgxvVar.zza);
        }
        if (zzh == i2) {
            return zzh;
        }
        throw zzhak.zzj();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(int i, byte[] bArr, int i2, int i3, zzhcy zzhcyVar, zzgxv zzgxvVar) throws zzhak {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzk = zzk(bArr, i2, zzgxvVar);
                zzhcyVar.zzj(i, Long.valueOf(zzgxvVar.zzb));
                return zzk;
            } else if (i4 == 1) {
                zzhcyVar.zzj(i, Long.valueOf(zzn(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zzh = zzh(bArr, i2, zzgxvVar);
                int i5 = zzgxvVar.zza;
                if (i5 < 0) {
                    throw zzhak.zzf();
                }
                if (i5 <= bArr.length - zzh) {
                    if (i5 == 0) {
                        zzhcyVar.zzj(i, zzgyj.zzb);
                    } else {
                        zzhcyVar.zzj(i, zzgyj.zzv(bArr, zzh, i5));
                    }
                    return zzh + i5;
                }
                throw zzhak.zzj();
            } else if (i4 != 3) {
                if (i4 == 5) {
                    zzhcyVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
                    return i2 + 4;
                }
                throw zzhak.zzc();
            } else {
                int i6 = (i & (-8)) | 4;
                zzhcy zzf = zzhcy.zzf();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zzh2 = zzh(bArr, i2, zzgxvVar);
                    int i8 = zzgxvVar.zza;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = zzh2;
                        break;
                    }
                    int zzg = zzg(i7, bArr, zzh2, i3, zzf, zzgxvVar);
                    i7 = i8;
                    i2 = zzg;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzhak.zzg();
                }
                zzhcyVar.zzj(i, zzf);
                return i2;
            }
        }
        throw zzhak.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(byte[] bArr, int i, zzgxv zzgxvVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            zzgxvVar.zza = b;
            return i2;
        }
        return zzi(b, bArr, i2, zzgxvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i, byte[] bArr, int i2, zzgxv zzgxvVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & WorkQueueKt.MASK;
        if (b >= 0) {
            zzgxvVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzgxvVar.zza = i5 | (b2 << Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzgxvVar.zza = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzgxvVar.zza = i9 | (b4 << Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzgxvVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(int i, byte[] bArr, int i2, int i3, zzhah zzhahVar, zzgxv zzgxvVar) {
        zzgzw zzgzwVar = (zzgzw) zzhahVar;
        int zzh = zzh(bArr, i2, zzgxvVar);
        zzgzwVar.zzi(zzgxvVar.zza);
        while (zzh < i3) {
            int zzh2 = zzh(bArr, zzh, zzgxvVar);
            if (i != zzgxvVar.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzgxvVar);
            zzgzwVar.zzi(zzgxvVar.zza);
        }
        return zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(byte[] bArr, int i, zzgxv zzgxvVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzgxvVar.zzb = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= (b2 & Byte.MAX_VALUE) << i4;
            i3 = i5;
            b = b2;
        }
        zzgxvVar.zzb = j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(Object obj, zzhcg zzhcgVar, byte[] bArr, int i, int i2, int i3, zzgxv zzgxvVar) throws IOException {
        int zzc = ((zzhbo) zzhcgVar).zzc(obj, bArr, i, i2, i3, zzgxvVar);
        zzgxvVar.zzc = obj;
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(Object obj, zzhcg zzhcgVar, byte[] bArr, int i, int i2, zzgxv zzgxvVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzi(i4, bArr, i3, zzgxvVar);
            i4 = zzgxvVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzhak.zzj();
        }
        int i6 = i4 + i5;
        zzhcgVar.zzi(obj, bArr, i5, i6, zzgxvVar);
        zzgxvVar.zzc = obj;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzn(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
