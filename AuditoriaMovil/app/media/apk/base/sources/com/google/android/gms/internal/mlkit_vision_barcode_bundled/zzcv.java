package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import H4.e1;
import com.google.android.libraries.barhopper.RecognitionOptions;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcv {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i7, zzcu zzcuVar) {
        int zzj = zzj(bArr, i7, zzcuVar);
        int i8 = zzcuVar.zza;
        if (i8 >= 0) {
            if (i8 <= bArr.length - zzj) {
                if (i8 == 0) {
                    zzcuVar.zzc = zzdf.zzb;
                    return zzj;
                }
                zzcuVar.zzc = zzdf.zzr(bArr, zzj, i8);
                return zzj + i8;
            }
            throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static int zzb(int i7, byte[] bArr, int i8, int i9, zzed zzedVar, zzef zzefVar, zzgs zzgsVar, zzcu zzcuVar) {
        int i10;
        boolean z7;
        zzdx zzdxVar = zzedVar.zzb;
        zzhf zzhfVar = zzefVar.zzb.zzb;
        Object obj = null;
        if (zzhfVar != zzhf.zzn) {
            switch (zzhfVar.ordinal()) {
                case 0:
                    i10 = i8 + 8;
                    obj = Double.valueOf(Double.longBitsToDouble(zzq(bArr, i8)));
                    i8 = i10;
                    break;
                case 1:
                    i10 = i8 + 4;
                    obj = Float.valueOf(Float.intBitsToFloat(zzc(bArr, i8)));
                    i8 = i10;
                    break;
                case 2:
                case 3:
                    i8 = zzm(bArr, i8, zzcuVar);
                    obj = Long.valueOf(zzcuVar.zzb);
                    break;
                case 4:
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    i8 = zzj(bArr, i8, zzcuVar);
                    obj = Integer.valueOf(zzcuVar.zza);
                    break;
                case 5:
                case 15:
                    i10 = i8 + 8;
                    obj = Long.valueOf(zzq(bArr, i8));
                    i8 = i10;
                    break;
                case 6:
                case 14:
                    i10 = i8 + 4;
                    obj = Integer.valueOf(zzc(bArr, i8));
                    i8 = i10;
                    break;
                case 7:
                    i8 = zzm(bArr, i8, zzcuVar);
                    if (zzcuVar.zzb != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    obj = Boolean.valueOf(z7);
                    break;
                case 8:
                    i8 = zzh(bArr, i8, zzcuVar);
                    obj = zzcuVar.zzc;
                    break;
                case 9:
                    int i11 = ((i7 >>> 3) << 3) | 4;
                    zzge zzb2 = zzfu.zza().zzb(zzefVar.zza.getClass());
                    Object zze = zzdxVar.zze(zzefVar.zzb);
                    if (zze == null) {
                        zze = zzb2.zze();
                        zzdxVar.zzi(zzefVar.zzb, zze);
                    }
                    return zzn(zze, zzb2, bArr, i8, i9, i11, zzcuVar);
                case 10:
                    zzge zzb3 = zzfu.zza().zzb(zzefVar.zza.getClass());
                    Object zze2 = zzdxVar.zze(zzefVar.zzb);
                    if (zze2 == null) {
                        zze2 = zzb3.zze();
                        zzdxVar.zzi(zzefVar.zzb, zze2);
                    }
                    return zzo(zze2, zzb3, bArr, i8, i9, zzcuVar);
                case 11:
                    i8 = zza(bArr, i8, zzcuVar);
                    obj = zzcuVar.zzc;
                    break;
                case 13:
                    throw new IllegalStateException("Shouldn't reach here.");
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    i8 = zzj(bArr, i8, zzcuVar);
                    obj = Integer.valueOf(zzdj.zzb(zzcuVar.zza));
                    break;
                case 17:
                    i8 = zzm(bArr, i8, zzcuVar);
                    obj = Long.valueOf(zzdj.zzc(zzcuVar.zzb));
                    break;
            }
            zzdxVar.zzi(zzefVar.zzb, obj);
            return i8;
        }
        zzj(bArr, i8, zzcuVar);
        throw null;
    }

    public static int zzc(byte[] bArr, int i7) {
        int i8 = bArr[i7] & ForkServer.ERROR;
        int i9 = bArr[i7 + 1] & ForkServer.ERROR;
        int i10 = bArr[i7 + 2] & ForkServer.ERROR;
        return ((bArr[i7 + 3] & ForkServer.ERROR) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    public static int zzd(zzge zzgeVar, byte[] bArr, int i7, int i8, int i9, zzcu zzcuVar) {
        Object zze = zzgeVar.zze();
        int zzn = zzn(zze, zzgeVar, bArr, i7, i8, i9, zzcuVar);
        zzgeVar.zzf(zze);
        zzcuVar.zzc = zze;
        return zzn;
    }

    public static int zze(zzge zzgeVar, byte[] bArr, int i7, int i8, zzcu zzcuVar) {
        Object zze = zzgeVar.zze();
        int zzo = zzo(zze, zzgeVar, bArr, i7, i8, zzcuVar);
        zzgeVar.zzf(zze);
        zzcuVar.zzc = zze;
        return zzo;
    }

    public static int zzf(zzge zzgeVar, int i7, byte[] bArr, int i8, int i9, zzeo zzeoVar, zzcu zzcuVar) {
        int zze = zze(zzgeVar, bArr, i8, i9, zzcuVar);
        zzeoVar.add(zzcuVar.zzc);
        while (zze < i9) {
            int zzj = zzj(bArr, zze, zzcuVar);
            if (i7 != zzcuVar.zza) {
                break;
            }
            zze = zze(zzgeVar, bArr, zzj, i9, zzcuVar);
            zzeoVar.add(zzcuVar.zzc);
        }
        return zze;
    }

    public static int zzg(byte[] bArr, int i7, zzeo zzeoVar, zzcu zzcuVar) {
        zzei zzeiVar = (zzei) zzeoVar;
        int zzj = zzj(bArr, i7, zzcuVar);
        int i8 = zzcuVar.zza + zzj;
        while (zzj < i8) {
            zzj = zzj(bArr, zzj, zzcuVar);
            zzeiVar.zzg(zzcuVar.zza);
        }
        if (zzj == i8) {
            return zzj;
        }
        throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzh(byte[] bArr, int i7, zzcu zzcuVar) {
        int zzj = zzj(bArr, i7, zzcuVar);
        int i8 = zzcuVar.zza;
        if (i8 >= 0) {
            if (i8 == 0) {
                zzcuVar.zzc = StringUtils.EMPTY;
                return zzj;
            }
            zzcuVar.zzc = new String(bArr, zzj, i8, zzep.zza);
            return zzj + i8;
        }
        throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static int zzi(int i7, byte[] bArr, int i8, int i9, zzgt zzgtVar, zzcu zzcuVar) {
        if ((i7 >>> 3) != 0) {
            int i10 = i7 & 7;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 5) {
                                zzgtVar.zzj(i7, Integer.valueOf(zzc(bArr, i8)));
                                return i8 + 4;
                            }
                            throw new zzer("Protocol message contained an invalid tag (zero).");
                        }
                        int i11 = (i7 & (-8)) | 4;
                        zzgt zzf = zzgt.zzf();
                        int i12 = zzcuVar.zze + 1;
                        zzcuVar.zze = i12;
                        zzr(i12);
                        int i13 = 0;
                        while (true) {
                            if (i8 >= i9) {
                                break;
                            }
                            int zzj = zzj(bArr, i8, zzcuVar);
                            i13 = zzcuVar.zza;
                            if (i13 == i11) {
                                i8 = zzj;
                                break;
                            }
                            i8 = zzi(i13, bArr, zzj, i9, zzf, zzcuVar);
                        }
                        zzcuVar.zze--;
                        if (i8 <= i9 && i13 == i11) {
                            zzgtVar.zzj(i7, zzf);
                            return i8;
                        }
                        throw new zzer("Failed to parse the message.");
                    }
                    int zzj2 = zzj(bArr, i8, zzcuVar);
                    int i14 = zzcuVar.zza;
                    if (i14 >= 0) {
                        if (i14 <= bArr.length - zzj2) {
                            if (i14 == 0) {
                                zzgtVar.zzj(i7, zzdf.zzb);
                            } else {
                                zzgtVar.zzj(i7, zzdf.zzr(bArr, zzj2, i14));
                            }
                            return zzj2 + i14;
                        }
                        throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                zzgtVar.zzj(i7, Long.valueOf(zzq(bArr, i8)));
                return i8 + 8;
            }
            int zzm = zzm(bArr, i8, zzcuVar);
            zzgtVar.zzj(i7, Long.valueOf(zzcuVar.zzb));
            return zzm;
        }
        throw new zzer("Protocol message contained an invalid tag (zero).");
    }

    public static int zzj(byte[] bArr, int i7, zzcu zzcuVar) {
        int i8 = i7 + 1;
        byte b5 = bArr[i7];
        if (b5 >= 0) {
            zzcuVar.zza = b5;
            return i8;
        }
        return zzk(b5, bArr, i8, zzcuVar);
    }

    public static int zzk(int i7, byte[] bArr, int i8, zzcu zzcuVar) {
        byte b5 = bArr[i8];
        int i9 = i8 + 1;
        int i10 = i7 & 127;
        if (b5 >= 0) {
            zzcuVar.zza = i10 | (b5 << 7);
            return i9;
        }
        int i11 = i10 | ((b5 & Byte.MAX_VALUE) << 7);
        int i12 = i8 + 2;
        byte b7 = bArr[i9];
        if (b7 >= 0) {
            zzcuVar.zza = i11 | (b7 << 14);
            return i12;
        }
        int i13 = i11 | ((b7 & Byte.MAX_VALUE) << 14);
        int i14 = i8 + 3;
        byte b8 = bArr[i12];
        if (b8 >= 0) {
            zzcuVar.zza = i13 | (b8 << 21);
            return i14;
        }
        int i15 = i13 | ((b8 & Byte.MAX_VALUE) << 21);
        int i16 = i8 + 4;
        byte b9 = bArr[i14];
        if (b9 >= 0) {
            zzcuVar.zza = i15 | (b9 << 28);
            return i16;
        }
        int i17 = i15 | ((b9 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] < 0) {
                i16 = i18;
            } else {
                zzcuVar.zza = i17;
                return i18;
            }
        }
    }

    public static int zzl(int i7, byte[] bArr, int i8, int i9, zzeo zzeoVar, zzcu zzcuVar) {
        zzei zzeiVar = (zzei) zzeoVar;
        int zzj = zzj(bArr, i8, zzcuVar);
        zzeiVar.zzg(zzcuVar.zza);
        while (zzj < i9) {
            int zzj2 = zzj(bArr, zzj, zzcuVar);
            if (i7 != zzcuVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzcuVar);
            zzeiVar.zzg(zzcuVar.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i7, zzcu zzcuVar) {
        byte b5;
        long j = bArr[i7];
        int i8 = i7 + 1;
        if (j >= 0) {
            zzcuVar.zzb = j;
            return i8;
        }
        int i9 = i7 + 2;
        byte b7 = bArr[i8];
        long j8 = (j & 127) | ((b7 & Byte.MAX_VALUE) << 7);
        int i10 = 7;
        while (b7 < 0) {
            int i11 = i9 + 1;
            i10 += 7;
            j8 |= (b5 & Byte.MAX_VALUE) << i10;
            b7 = bArr[i9];
            i9 = i11;
        }
        zzcuVar.zzb = j8;
        return i9;
    }

    public static int zzn(Object obj, zzge zzgeVar, byte[] bArr, int i7, int i8, int i9, zzcu zzcuVar) {
        zzfp zzfpVar = (zzfp) zzgeVar;
        int i10 = zzcuVar.zze + 1;
        zzcuVar.zze = i10;
        zzr(i10);
        int zzc = zzfpVar.zzc(obj, bArr, i7, i8, i9, zzcuVar);
        zzcuVar.zze--;
        zzcuVar.zzc = obj;
        return zzc;
    }

    public static int zzo(Object obj, zzge zzgeVar, byte[] bArr, int i7, int i8, zzcu zzcuVar) {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = zzk(i10, bArr, i9, zzcuVar);
            i10 = zzcuVar.zza;
        }
        int i11 = i9;
        if (i10 >= 0 && i10 <= i8 - i11) {
            int i12 = zzcuVar.zze + 1;
            zzcuVar.zze = i12;
            zzr(i12);
            int i13 = i10 + i11;
            zzgeVar.zzh(obj, bArr, i11, i13, zzcuVar);
            zzcuVar.zze--;
            zzcuVar.zzc = obj;
            return i13;
        }
        throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzp(int i7, byte[] bArr, int i8, int i9, zzcu zzcuVar) {
        if ((i7 >>> 3) != 0) {
            int i10 = i7 & 7;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 5) {
                                return i8 + 4;
                            }
                            throw new zzer("Protocol message contained an invalid tag (zero).");
                        }
                        int i11 = (i7 & (-8)) | 4;
                        int i12 = 0;
                        while (i8 < i9) {
                            i8 = zzj(bArr, i8, zzcuVar);
                            i12 = zzcuVar.zza;
                            if (i12 == i11) {
                                break;
                            }
                            i8 = zzp(i12, bArr, i8, i9, zzcuVar);
                        }
                        if (i8 <= i9 && i12 == i11) {
                            return i8;
                        }
                        throw new zzer("Failed to parse the message.");
                    }
                    return zzj(bArr, i8, zzcuVar) + zzcuVar.zza;
                }
                return i8 + 8;
            }
            return zzm(bArr, i8, zzcuVar);
        }
        throw new zzer("Protocol message contained an invalid tag (zero).");
    }

    public static long zzq(byte[] bArr, int i7) {
        return (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48) | ((bArr[i7 + 7] & 255) << 56);
    }

    private static void zzr(int i7) {
        if (i7 < zzb) {
            return;
        }
        throw new zzer("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }
}
