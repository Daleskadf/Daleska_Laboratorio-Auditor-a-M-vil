package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import java.io.IOException;
import kotlinx.coroutines.scheduling.WorkQueueKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzie {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zza(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzd(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzb(byte[] bArr, int i) {
        return Float.intBitsToFloat(zzc(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i, zzih zzihVar) throws zzkd {
        int zzc = zzc(bArr, i, zzihVar);
        int i2 = zzihVar.zza;
        if (i2 < 0) {
            throw zzkd.zzf();
        }
        if (i2 <= bArr.length - zzc) {
            if (i2 == 0) {
                zzihVar.zzc = zzii.zza;
                return zzc;
            }
            zzihVar.zzc = zzii.zza(bArr, zzc, i2);
            return zzc + i2;
        }
        throw zzkd.zzh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzma zzmaVar, byte[] bArr, int i, int i2, int i3, zzih zzihVar) throws IOException {
        Object zza = zzmaVar.zza();
        int zza2 = zza(zza, zzmaVar, bArr, i, i2, i3, zzihVar);
        zzmaVar.zzc(zza);
        zzihVar.zzc = zza;
        return zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzma zzmaVar, byte[] bArr, int i, int i2, zzih zzihVar) throws IOException {
        Object zza = zzmaVar.zza();
        int zza2 = zza(zza, zzmaVar, bArr, i, i2, zzihVar);
        zzmaVar.zzc(zza);
        zzihVar.zzc = zza;
        return zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzma<?> zzmaVar, int i, byte[] bArr, int i2, int i3, zzke<?> zzkeVar, zzih zzihVar) throws IOException {
        int zza = zza(zzmaVar, bArr, i2, i3, zzihVar);
        zzkeVar.add(zzihVar.zzc);
        while (zza < i3) {
            int zzc = zzc(bArr, zza, zzihVar);
            if (i != zzihVar.zza) {
                break;
            }
            zza = zza(zzmaVar, bArr, zzc, i3, zzihVar);
            zzkeVar.add(zzihVar.zzc);
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i, zzke<?> zzkeVar, zzih zzihVar) throws IOException {
        zzjw zzjwVar = (zzjw) zzkeVar;
        int zzc = zzc(bArr, i, zzihVar);
        int i2 = zzihVar.zza + zzc;
        while (zzc < i2) {
            zzc = zzc(bArr, zzc, zzihVar);
            zzjwVar.zzd(zzihVar.zza);
        }
        if (zzc == i2) {
            return zzc;
        }
        throw zzkd.zzh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i, zzih zzihVar) throws zzkd {
        int zzc = zzc(bArr, i, zzihVar);
        int i2 = zzihVar.zza;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzihVar.zzc = "";
                return zzc;
            }
            zzihVar.zzc = zznf.zzb(bArr, zzc, i2);
            return zzc + i2;
        }
        throw zzkd.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, int i3, zzmy zzmyVar, zzih zzihVar) throws zzkd {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzd = zzd(bArr, i2, zzihVar);
                zzmyVar.zza(i, Long.valueOf(zzihVar.zzb));
                return zzd;
            } else if (i4 == 1) {
                zzmyVar.zza(i, Long.valueOf(zzd(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zzc = zzc(bArr, i2, zzihVar);
                int i5 = zzihVar.zza;
                if (i5 < 0) {
                    throw zzkd.zzf();
                }
                if (i5 <= bArr.length - zzc) {
                    if (i5 == 0) {
                        zzmyVar.zza(i, zzii.zza);
                    } else {
                        zzmyVar.zza(i, zzii.zza(bArr, zzc, i5));
                    }
                    return zzc + i5;
                }
                throw zzkd.zzh();
            } else if (i4 != 3) {
                if (i4 == 5) {
                    zzmyVar.zza(i, Integer.valueOf(zzc(bArr, i2)));
                    return i2 + 4;
                }
                throw zzkd.zzc();
            } else {
                zzmy zzd2 = zzmy.zzd();
                int i6 = (i & (-8)) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zzc2 = zzc(bArr, i2, zzihVar);
                    int i8 = zzihVar.zza;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = zzc2;
                        break;
                    }
                    int zza = zza(i7, bArr, zzc2, i3, zzd2, zzihVar);
                    i7 = i8;
                    i2 = zza;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzkd.zzg();
                }
                zzmyVar.zza(i, zzd2);
                return i2;
            }
        }
        throw zzkd.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(byte[] bArr, int i, zzih zzihVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            zzihVar.zza = b;
            return i2;
        }
        return zza(b, bArr, i2, zzihVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, zzih zzihVar) {
        int i3 = i & WorkQueueKt.MASK;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzihVar.zza = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzihVar.zza = i5 | (b2 << Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzihVar.zza = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzihVar.zza = i9 | (b4 << Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzihVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, int i3, zzke<?> zzkeVar, zzih zzihVar) {
        zzjw zzjwVar = (zzjw) zzkeVar;
        int zzc = zzc(bArr, i2, zzihVar);
        zzjwVar.zzd(zzihVar.zza);
        while (zzc < i3) {
            int zzc2 = zzc(bArr, zzc, zzihVar);
            if (i != zzihVar.zza) {
                break;
            }
            zzc = zzc(bArr, zzc2, zzihVar);
            zzjwVar.zzd(zzihVar.zza);
        }
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(byte[] bArr, int i, zzih zzihVar) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzihVar.zzb = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        zzihVar.zzb = j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(Object obj, zzma zzmaVar, byte[] bArr, int i, int i2, int i3, zzih zzihVar) throws IOException {
        int zza = ((zzlm) zzmaVar).zza((zzlm) obj, bArr, i, i2, i3, zzihVar);
        zzihVar.zzc = obj;
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(Object obj, zzma zzmaVar, byte[] bArr, int i, int i2, zzih zzihVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zza(i4, bArr, i3, zzihVar);
            i4 = zzihVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzkd.zzh();
        }
        int i6 = i4 + i5;
        zzmaVar.zza(obj, bArr, i5, i6, zzihVar);
        zzihVar.zzc = obj;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, int i3, zzih zzihVar) throws zzkd {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw zzkd.zzc();
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = zzc(bArr, i2, zzihVar);
                            i6 = zzihVar.zza;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = zza(i6, bArr, i2, i3, zzihVar);
                        }
                        if (i2 > i3 || i6 != i5) {
                            throw zzkd.zzg();
                        }
                        return i2;
                    }
                    return zzc(bArr, i2, zzihVar) + zzihVar.zza;
                }
                return i2 + 8;
            }
            return zzd(bArr, i2, zzihVar);
        }
        throw zzkd.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzd(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
