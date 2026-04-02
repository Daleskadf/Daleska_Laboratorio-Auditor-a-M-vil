package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzais  reason: invalid package */
/* loaded from: classes.dex */
public final class zzais {
    private static volatile int zza = 100;

    public static double zza(byte[] bArr, int i7) {
        return Double.longBitsToDouble(zzd(bArr, i7));
    }

    public static float zzb(byte[] bArr, int i7) {
        return Float.intBitsToFloat(zzc(bArr, i7));
    }

    public static int zzc(byte[] bArr, int i7) {
        return ((bArr[i7 + 3] & ForkServer.ERROR) << 24) | (bArr[i7] & ForkServer.ERROR) | ((bArr[i7 + 1] & ForkServer.ERROR) << 8) | ((bArr[i7 + 2] & ForkServer.ERROR) << 16);
    }

    public static int zzd(byte[] bArr, int i7, zzaiv zzaivVar) {
        byte b5;
        int i8 = i7 + 1;
        long j = bArr[i7];
        if (j >= 0) {
            zzaivVar.zzb = j;
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
        zzaivVar.zzb = j8;
        return i9;
    }

    public static int zza(byte[] bArr, int i7, zzaiv zzaivVar) {
        int zzc = zzc(bArr, i7, zzaivVar);
        int i8 = zzaivVar.zza;
        if (i8 >= 0) {
            if (i8 <= bArr.length - zzc) {
                if (i8 == 0) {
                    zzaivVar.zzc = zzaiw.zza;
                    return zzc;
                }
                zzaivVar.zzc = zzaiw.zza(bArr, zzc, i8);
                return zzc + i8;
            }
            throw zzakm.zzj();
        }
        throw zzakm.zzf();
    }

    public static int zzb(zzamc<?> zzamcVar, int i7, byte[] bArr, int i8, int i9, zzakn<?> zzaknVar, zzaiv zzaivVar) {
        int zza2 = zza(zzamcVar, bArr, i8, i9, zzaivVar);
        zzaknVar.add(zzaivVar.zzc);
        while (zza2 < i9) {
            int zzc = zzc(bArr, zza2, zzaivVar);
            if (i7 != zzaivVar.zza) {
                break;
            }
            zza2 = zza(zzamcVar, bArr, zzc, i9, zzaivVar);
            zzaknVar.add(zzaivVar.zzc);
        }
        return zza2;
    }

    public static int zzc(byte[] bArr, int i7, zzaiv zzaivVar) {
        int i8 = i7 + 1;
        byte b5 = bArr[i7];
        if (b5 >= 0) {
            zzaivVar.zza = b5;
            return i8;
        }
        return zza(b5, bArr, i8, zzaivVar);
    }

    public static long zzd(byte[] bArr, int i7) {
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public static int zzb(byte[] bArr, int i7, zzaiv zzaivVar) {
        int zzc = zzc(bArr, i7, zzaivVar);
        int i8 = zzaivVar.zza;
        if (i8 >= 0) {
            if (i8 == 0) {
                zzaivVar.zzc = StringUtils.EMPTY;
                return zzc;
            }
            zzaivVar.zzc = zzanb.zzb(bArr, zzc, i8);
            return zzc + i8;
        }
        throw zzakm.zzf();
    }

    public static int zza(int i7, byte[] bArr, int i8, int i9, Object obj, zzaln zzalnVar, zzamv<zzamy, zzamy> zzamvVar, zzaiv zzaivVar) {
        if (zzaivVar.zzd.zza(zzalnVar, i7 >>> 3) == null) {
            return zza(i7, bArr, i8, i9, zzalr.zzc(obj), zzaivVar);
        }
        zzakg.zzd zzdVar = (zzakg.zzd) obj;
        zzdVar.zza();
        zzajy<zzakg.zzc> zzajyVar = zzdVar.zzc;
        throw new NoSuchMethodError();
    }

    private static <T> int zza(zzamc<T> zzamcVar, byte[] bArr, int i7, int i8, int i9, zzaiv zzaivVar) {
        T zza2 = zzamcVar.zza();
        int zza3 = zza(zza2, zzamcVar, bArr, i7, i8, i9, zzaivVar);
        zzamcVar.zzd(zza2);
        zzaivVar.zzc = zza2;
        return zza3;
    }

    public static int zza(zzamc<?> zzamcVar, int i7, byte[] bArr, int i8, int i9, zzakn<Object> zzaknVar, zzaiv zzaivVar) {
        int i10 = (i7 & (-8)) | 4;
        int zza2 = zza(zzamcVar, bArr, i8, i9, i10, zzaivVar);
        zzaknVar.add(zzaivVar.zzc);
        while (zza2 < i9) {
            int zzc = zzc(bArr, zza2, zzaivVar);
            if (i7 != zzaivVar.zza) {
                break;
            }
            zza2 = zza(zzamcVar, bArr, zzc, i9, i10, zzaivVar);
            zzaknVar.add(zzaivVar.zzc);
        }
        return zza2;
    }

    public static <T> int zza(zzamc<T> zzamcVar, byte[] bArr, int i7, int i8, zzaiv zzaivVar) {
        T zza2 = zzamcVar.zza();
        int zza3 = zza(zza2, zzamcVar, bArr, i7, i8, zzaivVar);
        zzamcVar.zzd(zza2);
        zzaivVar.zzc = zza2;
        return zza3;
    }

    public static int zza(byte[] bArr, int i7, zzakn<?> zzaknVar, zzaiv zzaivVar) {
        zzakj zzakjVar = (zzakj) zzaknVar;
        int zzc = zzc(bArr, i7, zzaivVar);
        int i8 = zzaivVar.zza + zzc;
        while (zzc < i8) {
            zzc = zzc(bArr, zzc, zzaivVar);
            zzakjVar.zzc(zzaivVar.zza);
        }
        if (zzc == i8) {
            return zzc;
        }
        throw zzakm.zzj();
    }

    public static int zza(int i7, byte[] bArr, int i8, int i9, zzamy zzamyVar, zzaiv zzaivVar) {
        if ((i7 >>> 3) != 0) {
            int i10 = i7 & 7;
            if (i10 == 0) {
                int zzd = zzd(bArr, i8, zzaivVar);
                zzamyVar.zza(i7, Long.valueOf(zzaivVar.zzb));
                return zzd;
            } else if (i10 == 1) {
                zzamyVar.zza(i7, Long.valueOf(zzd(bArr, i8)));
                return i8 + 8;
            } else if (i10 == 2) {
                int zzc = zzc(bArr, i8, zzaivVar);
                int i11 = zzaivVar.zza;
                if (i11 >= 0) {
                    if (i11 <= bArr.length - zzc) {
                        if (i11 == 0) {
                            zzamyVar.zza(i7, zzaiw.zza);
                        } else {
                            zzamyVar.zza(i7, zzaiw.zza(bArr, zzc, i11));
                        }
                        return zzc + i11;
                    }
                    throw zzakm.zzj();
                }
                throw zzakm.zzf();
            } else if (i10 != 3) {
                if (i10 == 5) {
                    zzamyVar.zza(i7, Integer.valueOf(zzc(bArr, i8)));
                    return i8 + 4;
                }
                throw zzakm.zzc();
            } else {
                zzamy zzd2 = zzamy.zzd();
                int i12 = (i7 & (-8)) | 4;
                int i13 = zzaivVar.zze + 1;
                zzaivVar.zze = i13;
                zza(i13);
                int i14 = 0;
                while (true) {
                    if (i8 >= i9) {
                        break;
                    }
                    int zzc2 = zzc(bArr, i8, zzaivVar);
                    int i15 = zzaivVar.zza;
                    i14 = i15;
                    if (i15 == i12) {
                        i8 = zzc2;
                        break;
                    }
                    int zza2 = zza(i14, bArr, zzc2, i9, zzd2, zzaivVar);
                    i14 = i15;
                    i8 = zza2;
                }
                zzaivVar.zze--;
                if (i8 <= i9 && i14 == i12) {
                    zzamyVar.zza(i7, zzd2);
                    return i8;
                }
                throw zzakm.zzg();
            }
        }
        throw zzakm.zzc();
    }

    public static int zza(int i7, byte[] bArr, int i8, zzaiv zzaivVar) {
        int i9 = i7 & 127;
        int i10 = i8 + 1;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            zzaivVar.zza = i9 | (b5 << 7);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 7);
        int i12 = i8 + 2;
        byte b7 = bArr[i10];
        if (b7 >= 0) {
            zzaivVar.zza = i11 | (b7 << 14);
            return i12;
        }
        int i13 = i11 | ((b7 & Byte.MAX_VALUE) << 14);
        int i14 = i8 + 3;
        byte b8 = bArr[i12];
        if (b8 >= 0) {
            zzaivVar.zza = i13 | (b8 << 21);
            return i14;
        }
        int i15 = i13 | ((b8 & Byte.MAX_VALUE) << 21);
        int i16 = i8 + 4;
        byte b9 = bArr[i14];
        if (b9 >= 0) {
            zzaivVar.zza = i15 | (b9 << 28);
            return i16;
        }
        int i17 = i15 | ((b9 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                zzaivVar.zza = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    public static int zza(int i7, byte[] bArr, int i8, int i9, zzakn<?> zzaknVar, zzaiv zzaivVar) {
        zzakj zzakjVar = (zzakj) zzaknVar;
        int zzc = zzc(bArr, i8, zzaivVar);
        zzakjVar.zzc(zzaivVar.zza);
        while (zzc < i9) {
            int zzc2 = zzc(bArr, zzc, zzaivVar);
            if (i7 != zzaivVar.zza) {
                break;
            }
            zzc = zzc(bArr, zzc2, zzaivVar);
            zzakjVar.zzc(zzaivVar.zza);
        }
        return zzc;
    }

    public static <T> int zza(Object obj, zzamc<T> zzamcVar, byte[] bArr, int i7, int i8, int i9, zzaiv zzaivVar) {
        zzalr zzalrVar = (zzalr) zzamcVar;
        int i10 = zzaivVar.zze + 1;
        zzaivVar.zze = i10;
        zza(i10);
        int zza2 = zzalrVar.zza((zzalr) obj, bArr, i7, i8, i9, zzaivVar);
        zzaivVar.zze--;
        zzaivVar.zzc = obj;
        return zza2;
    }

    public static <T> int zza(Object obj, zzamc<T> zzamcVar, byte[] bArr, int i7, int i8, zzaiv zzaivVar) {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = zza(i10, bArr, i9, zzaivVar);
            i10 = zzaivVar.zza;
        }
        int i11 = i9;
        if (i10 >= 0 && i10 <= i8 - i11) {
            int i12 = zzaivVar.zze + 1;
            zzaivVar.zze = i12;
            zza(i12);
            int i13 = i10 + i11;
            zzamcVar.zza(obj, bArr, i11, i13, zzaivVar);
            zzaivVar.zze--;
            zzaivVar.zzc = obj;
            return i13;
        }
        throw zzakm.zzj();
    }

    public static int zza(int i7, byte[] bArr, int i8, int i9, zzaiv zzaivVar) {
        if ((i7 >>> 3) != 0) {
            int i10 = i7 & 7;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 5) {
                                return i8 + 4;
                            }
                            throw zzakm.zzc();
                        }
                        int i11 = (i7 & (-8)) | 4;
                        int i12 = 0;
                        while (i8 < i9) {
                            i8 = zzc(bArr, i8, zzaivVar);
                            i12 = zzaivVar.zza;
                            if (i12 == i11) {
                                break;
                            }
                            i8 = zza(i12, bArr, i8, i9, zzaivVar);
                        }
                        if (i8 > i9 || i12 != i11) {
                            throw zzakm.zzg();
                        }
                        return i8;
                    }
                    return zzc(bArr, i8, zzaivVar) + zzaivVar.zza;
                }
                return i8 + 8;
            }
            return zzd(bArr, i8, zzaivVar);
        }
        throw zzakm.zzc();
    }

    private static void zza(int i7) {
        if (i7 >= zza) {
            throw zzakm.zzh();
        }
    }
}
