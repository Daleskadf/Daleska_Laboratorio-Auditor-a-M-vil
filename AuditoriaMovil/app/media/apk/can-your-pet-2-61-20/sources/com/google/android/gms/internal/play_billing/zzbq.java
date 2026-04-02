package com.google.android.gms.internal.play_billing;

import com.google.common.base.Ascii;
import java.io.IOException;
import kotlinx.coroutines.scheduling.WorkQueueKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
public final class zzbq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i, zzbp zzbpVar) throws zzdn {
        int zzh = zzh(bArr, i, zzbpVar);
        int i2 = zzbpVar.zza;
        if (i2 < 0) {
            throw zzdn.zzd();
        }
        if (i2 <= bArr.length - zzh) {
            if (i2 == 0) {
                zzbpVar.zzc = zzcc.zzb;
                return zzh;
            }
            zzbpVar.zzc = zzcc.zzl(bArr, zzh, i2);
            return zzh + i2;
        }
        throw zzdn.zzg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i) {
        int i2 = (bArr[i + 1] & 255) << 8;
        return ((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(zzev zzevVar, byte[] bArr, int i, int i2, int i3, zzbp zzbpVar) throws IOException {
        Object zze = zzevVar.zze();
        int zzl = zzl(zze, zzevVar, bArr, i, i2, i3, zzbpVar);
        zzevVar.zzf(zze);
        zzbpVar.zzc = zze;
        return zzl;
    }

    static int zzd(zzev zzevVar, byte[] bArr, int i, int i2, zzbp zzbpVar) throws IOException {
        Object zze = zzevVar.zze();
        int zzm = zzm(zze, zzevVar, bArr, i, i2, zzbpVar);
        zzevVar.zzf(zze);
        zzbpVar.zzc = zze;
        return zzm;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(zzev zzevVar, int i, byte[] bArr, int i2, int i3, zzdk zzdkVar, zzbp zzbpVar) throws IOException {
        int zzd = zzd(zzevVar, bArr, i2, i3, zzbpVar);
        zzdkVar.add(zzbpVar.zzc);
        while (zzd < i3) {
            int zzh = zzh(bArr, zzd, zzbpVar);
            if (i != zzbpVar.zza) {
                break;
            }
            zzd = zzd(zzevVar, bArr, zzh, i3, zzbpVar);
            zzdkVar.add(zzbpVar.zzc);
        }
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(byte[] bArr, int i, zzdk zzdkVar, zzbp zzbpVar) throws IOException {
        zzde zzdeVar = (zzde) zzdkVar;
        int zzh = zzh(bArr, i, zzbpVar);
        int i2 = zzbpVar.zza + zzh;
        while (zzh < i2) {
            zzh = zzh(bArr, zzh, zzbpVar);
            zzdeVar.zzh(zzbpVar.zza);
        }
        if (zzh == i2) {
            return zzh;
        }
        throw zzdn.zzg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(int i, byte[] bArr, int i2, int i3, zzfn zzfnVar, zzbp zzbpVar) throws zzdn {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzk = zzk(bArr, i2, zzbpVar);
                zzfnVar.zzj(i, Long.valueOf(zzbpVar.zzb));
                return zzk;
            } else if (i4 == 1) {
                zzfnVar.zzj(i, Long.valueOf(zzn(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zzh = zzh(bArr, i2, zzbpVar);
                int i5 = zzbpVar.zza;
                if (i5 < 0) {
                    throw zzdn.zzd();
                }
                if (i5 <= bArr.length - zzh) {
                    if (i5 == 0) {
                        zzfnVar.zzj(i, zzcc.zzb);
                    } else {
                        zzfnVar.zzj(i, zzcc.zzl(bArr, zzh, i5));
                    }
                    return zzh + i5;
                }
                throw zzdn.zzg();
            } else if (i4 != 3) {
                if (i4 == 5) {
                    zzfnVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
                    return i2 + 4;
                }
                throw zzdn.zzb();
            } else {
                int i6 = (i & (-8)) | 4;
                zzfn zzf = zzfn.zzf();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zzh2 = zzh(bArr, i2, zzbpVar);
                    int i8 = zzbpVar.zza;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = zzh2;
                        break;
                    }
                    int zzg = zzg(i7, bArr, zzh2, i3, zzf, zzbpVar);
                    i7 = i8;
                    i2 = zzg;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzdn.zze();
                }
                zzfnVar.zzj(i, zzf);
                return i2;
            }
        }
        throw zzdn.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(byte[] bArr, int i, zzbp zzbpVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            zzbpVar.zza = b;
            return i2;
        }
        return zzi(b, bArr, i2, zzbpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i, byte[] bArr, int i2, zzbp zzbpVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & WorkQueueKt.MASK;
        if (b >= 0) {
            zzbpVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzbpVar.zza = i5 | (b2 << Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzbpVar.zza = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzbpVar.zza = i9 | (b4 << Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzbpVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(int i, byte[] bArr, int i2, int i3, zzdk zzdkVar, zzbp zzbpVar) {
        zzde zzdeVar = (zzde) zzdkVar;
        int zzh = zzh(bArr, i2, zzbpVar);
        zzdeVar.zzh(zzbpVar.zza);
        while (zzh < i3) {
            int zzh2 = zzh(bArr, zzh, zzbpVar);
            if (i != zzbpVar.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzbpVar);
            zzdeVar.zzh(zzbpVar.zza);
        }
        return zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(byte[] bArr, int i, zzbp zzbpVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzbpVar.zzb = j;
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
        zzbpVar.zzb = j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(Object obj, zzev zzevVar, byte[] bArr, int i, int i2, int i3, zzbp zzbpVar) throws IOException {
        int zzc = ((zzen) zzevVar).zzc(obj, bArr, i, i2, i3, zzbpVar);
        zzbpVar.zzc = obj;
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(Object obj, zzev zzevVar, byte[] bArr, int i, int i2, zzbp zzbpVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzi(i4, bArr, i3, zzbpVar);
            i4 = zzbpVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzdn.zzg();
        }
        int i6 = i4 + i5;
        zzevVar.zzh(obj, bArr, i5, i6, zzbpVar);
        zzbpVar.zzc = obj;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzn(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
