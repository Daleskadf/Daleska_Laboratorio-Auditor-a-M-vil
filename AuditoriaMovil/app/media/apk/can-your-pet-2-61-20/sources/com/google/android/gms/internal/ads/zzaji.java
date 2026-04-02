package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import kotlinx.coroutines.scheduling.WorkQueueKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaji {
    private static final byte[] zza;

    static {
        int i = zzfx.zza;
        zza = "OpusHead".getBytes(zzfwd.zzc);
    }

    public static zzby zza(zzaiy zzaiyVar) {
        zzgb zzgbVar;
        zzaiz zzb = zzaiyVar.zzb(1751411826);
        zzaiz zzb2 = zzaiyVar.zzb(1801812339);
        zzaiz zzb3 = zzaiyVar.zzb(1768715124);
        if (zzb != null && zzb2 != null && zzb3 != null && zzg(zzb.zza) == 1835299937) {
            zzfo zzfoVar = zzb2.zza;
            zzfoVar.zzK(12);
            int zzg = zzfoVar.zzg();
            String[] strArr = new String[zzg];
            for (int i = 0; i < zzg; i++) {
                int zzg2 = zzfoVar.zzg();
                zzfoVar.zzL(4);
                strArr[i] = zzfoVar.zzA(zzg2 - 8, zzfwd.zzc);
            }
            zzfo zzfoVar2 = zzb3.zza;
            zzfoVar2.zzK(8);
            ArrayList arrayList = new ArrayList();
            while (zzfoVar2.zzb() > 8) {
                int zzd = zzfoVar2.zzd() + zzfoVar2.zzg();
                int zzg3 = zzfoVar2.zzg() - 1;
                if (zzg3 < 0 || zzg3 >= zzg) {
                    zzfe.zzf("AtomParsers", "Skipped metadata with unknown key index: " + zzg3);
                } else {
                    String str = strArr[zzg3];
                    int i2 = zzajr.zzb;
                    while (true) {
                        int zzd2 = zzfoVar2.zzd();
                        if (zzd2 >= zzd) {
                            zzgbVar = null;
                            break;
                        }
                        int zzg4 = zzfoVar2.zzg();
                        if (zzfoVar2.zzg() != 1684108385) {
                            zzfoVar2.zzK(zzd2 + zzg4);
                        } else {
                            int zzg5 = zzfoVar2.zzg();
                            int zzg6 = zzfoVar2.zzg();
                            int i3 = zzg4 - 16;
                            byte[] bArr = new byte[i3];
                            zzfoVar2.zzG(bArr, 0, i3);
                            zzgbVar = new zzgb(str, bArr, zzg6, zzg5);
                            break;
                        }
                    }
                    if (zzgbVar != null) {
                        arrayList.add(zzgbVar);
                    }
                }
                zzfoVar2.zzK(zzd);
            }
            if (!arrayList.isEmpty()) {
                return new zzby(arrayList);
            }
        }
        return null;
    }

    public static zzby zzb(zzaiz zzaizVar) {
        int zzn;
        zzfo zzfoVar = zzaizVar.zza;
        zzfoVar.zzK(8);
        zzby zzbyVar = new zzby(-9223372036854775807L, new zzbx[0]);
        while (zzfoVar.zzb() >= 8) {
            int zzd = zzfoVar.zzd();
            int zzg = zzfoVar.zzg() + zzd;
            int zzg2 = zzfoVar.zzg();
            zzby zzbyVar2 = null;
            if (zzg2 == 1835365473) {
                zzfoVar.zzK(zzd);
                zzfoVar.zzL(8);
                zze(zzfoVar);
                while (true) {
                    if (zzfoVar.zzd() >= zzg) {
                        break;
                    }
                    int zzd2 = zzfoVar.zzd();
                    int zzg3 = zzfoVar.zzg() + zzd2;
                    if (zzfoVar.zzg() != 1768715124) {
                        zzfoVar.zzK(zzg3);
                    } else {
                        zzfoVar.zzK(zzd2);
                        zzfoVar.zzL(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzfoVar.zzd() < zzg3) {
                            zzbx zza2 = zzajr.zza(zzfoVar);
                            if (zza2 != null) {
                                arrayList.add(zza2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzbyVar2 = new zzby(arrayList);
                        }
                    }
                }
                zzbyVar = zzbyVar.zzd(zzbyVar2);
            } else if (zzg2 == 1936553057) {
                zzfoVar.zzK(zzd);
                zzfoVar.zzL(12);
                while (true) {
                    if (zzfoVar.zzd() >= zzg) {
                        break;
                    }
                    int zzd3 = zzfoVar.zzd();
                    int zzg4 = zzfoVar.zzg();
                    if (zzfoVar.zzg() != 1935766900) {
                        zzfoVar.zzK(zzd3 + zzg4);
                    } else if (zzg4 >= 16) {
                        zzfoVar.zzL(4);
                        int i = -1;
                        int i2 = 0;
                        for (int i3 = 0; i3 < 2; i3++) {
                            int zzm = zzfoVar.zzm();
                            int zzm2 = zzfoVar.zzm();
                            if (zzm == 0) {
                                i = zzm2;
                            } else if (zzm == 1) {
                                i2 = zzm2;
                            }
                        }
                        if (i == 12) {
                            zzn = 240;
                        } else if (i == 13) {
                            zzn = 120;
                        } else {
                            if (i == 21 && zzfoVar.zzb() >= 8 && zzfoVar.zzd() + 8 <= zzg) {
                                int zzg5 = zzfoVar.zzg();
                                int zzg6 = zzfoVar.zzg();
                                if (zzg5 >= 12 && zzg6 == 1936877170) {
                                    zzn = zzfoVar.zzn();
                                }
                            }
                            zzn = -2147483647;
                        }
                        if (zzn != -2147483647) {
                            zzbyVar2 = new zzby(-9223372036854775807L, new zzahy(zzn, i2));
                        }
                    }
                }
                zzbyVar = zzbyVar.zzd(zzbyVar2);
            } else if (zzg2 == -1451722374) {
                zzbyVar = zzbyVar.zzd(zzi(zzfoVar));
            }
            zzfoVar.zzK(zzg);
        }
        return zzbyVar;
    }

    public static zzgh zzc(zzfo zzfoVar) {
        long zzt;
        long zzt2;
        zzfoVar.zzK(8);
        if (zzaja.zze(zzfoVar.zzg()) == 0) {
            zzt = zzfoVar.zzu();
            zzt2 = zzfoVar.zzu();
        } else {
            zzt = zzfoVar.zzt();
            zzt2 = zzfoVar.zzt();
        }
        return new zzgh(zzt, zzt2, zzfoVar.zzu());
    }

    /* JADX WARN: Code restructure failed: missing block: B:350:0x0713, code lost:
        if (r8.zzd(1) > 0) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0737, code lost:
        if (r15 == 1) goto L310;
     */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0970  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0b06  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0b0a  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0b70 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List zzd(com.google.android.gms.internal.ads.zzaiy r56, com.google.android.gms.internal.ads.zzadv r57, long r58, com.google.android.gms.internal.ads.zzae r60, boolean r61, boolean r62, com.google.android.gms.internal.ads.zzfwf r63) throws com.google.android.gms.internal.ads.zzcc {
        /*
            Method dump skipped, instructions count: 2938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaji.zzd(com.google.android.gms.internal.ads.zzaiy, com.google.android.gms.internal.ads.zzadv, long, com.google.android.gms.internal.ads.zzae, boolean, boolean, com.google.android.gms.internal.ads.zzfwf):java.util.List");
    }

    public static void zze(zzfo zzfoVar) {
        int zzd = zzfoVar.zzd();
        zzfoVar.zzL(4);
        if (zzfoVar.zzg() != 1751411826) {
            zzd += 4;
        }
        zzfoVar.zzK(zzd);
    }

    private static int zzf(zzfo zzfoVar) {
        int zzm = zzfoVar.zzm();
        int i = zzm & WorkQueueKt.MASK;
        while ((zzm & 128) == 128) {
            zzm = zzfoVar.zzm();
            i = (i << 7) | (zzm & WorkQueueKt.MASK);
        }
        return i;
    }

    private static int zzg(zzfo zzfoVar) {
        zzfoVar.zzK(16);
        return zzfoVar.zzg();
    }

    private static Pair zzh(zzfo zzfoVar, int i, int i2) throws zzcc {
        Integer num;
        zzakc zzakcVar;
        Pair create;
        int i3;
        int i4;
        byte[] bArr;
        int zzd = zzfoVar.zzd();
        while (zzd - i < i2) {
            zzfoVar.zzK(zzd);
            int zzg = zzfoVar.zzg();
            zzadj.zzb(zzg > 0, "childAtomSize must be positive");
            if (zzfoVar.zzg() == 1936289382) {
                int i5 = zzd + 8;
                int i6 = -1;
                int i7 = 0;
                String str = null;
                Integer num2 = null;
                while (i5 - zzd < zzg) {
                    zzfoVar.zzK(i5);
                    int zzg2 = zzfoVar.zzg();
                    int zzg3 = zzfoVar.zzg();
                    if (zzg3 == 1718775137) {
                        num2 = Integer.valueOf(zzfoVar.zzg());
                    } else if (zzg3 == 1935894637) {
                        zzfoVar.zzL(4);
                        str = zzfoVar.zzA(4, zzfwd.zzc);
                    } else if (zzg3 == 1935894633) {
                        i6 = i5;
                        i7 = zzg2;
                    }
                    i5 += zzg2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzadj.zzb(num2 != null, "frma atom is mandatory");
                    zzadj.zzb(i6 != -1, "schi atom is mandatory");
                    int i8 = i6 + 8;
                    while (true) {
                        if (i8 - i6 >= i7) {
                            num = num2;
                            zzakcVar = null;
                            break;
                        }
                        zzfoVar.zzK(i8);
                        int zzg4 = zzfoVar.zzg();
                        if (zzfoVar.zzg() == 1952804451) {
                            int zze = zzaja.zze(zzfoVar.zzg());
                            zzfoVar.zzL(1);
                            if (zze == 0) {
                                zzfoVar.zzL(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int zzm = zzfoVar.zzm();
                                i3 = zzm & 15;
                                i4 = (zzm & 240) >> 4;
                            }
                            boolean z = zzfoVar.zzm() == 1;
                            int zzm2 = zzfoVar.zzm();
                            byte[] bArr2 = new byte[16];
                            zzfoVar.zzG(bArr2, 0, 16);
                            if (z && zzm2 == 0) {
                                int zzm3 = zzfoVar.zzm();
                                byte[] bArr3 = new byte[zzm3];
                                zzfoVar.zzG(bArr3, 0, zzm3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            zzakcVar = new zzakc(z, str, zzm2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += zzg4;
                        }
                    }
                    zzadj.zzb(zzakcVar != null, "tenc atom is mandatory");
                    int i9 = zzfx.zza;
                    create = Pair.create(num, zzakcVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            zzd += zzg;
        }
        return null;
    }

    private static zzby zzi(zzfo zzfoVar) {
        short zzD = zzfoVar.zzD();
        zzfoVar.zzL(2);
        String zzA = zzfoVar.zzA(zzD, zzfwd.zzc);
        int max = Math.max(zzA.lastIndexOf(43), zzA.lastIndexOf(45));
        try {
            return new zzby(-9223372036854775807L, new zzge(Float.parseFloat(zzA.substring(0, max)), Float.parseFloat(zzA.substring(max, zzA.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzajc zzj(zzfo zzfoVar, int i) {
        zzfoVar.zzK(i + 12);
        zzfoVar.zzL(1);
        zzf(zzfoVar);
        zzfoVar.zzL(2);
        int zzm = zzfoVar.zzm();
        if ((zzm & 128) != 0) {
            zzfoVar.zzL(2);
        }
        if ((zzm & 64) != 0) {
            zzfoVar.zzL(zzfoVar.zzm());
        }
        if ((zzm & 32) != 0) {
            zzfoVar.zzL(2);
        }
        zzfoVar.zzL(1);
        zzf(zzfoVar);
        String zzd = zzcb.zzd(zzfoVar.zzm());
        if ("audio/mpeg".equals(zzd) || "audio/vnd.dts".equals(zzd) || "audio/vnd.dts.hd".equals(zzd)) {
            return new zzajc(zzd, null, -1L, -1L);
        }
        zzfoVar.zzL(4);
        long zzu = zzfoVar.zzu();
        long zzu2 = zzfoVar.zzu();
        zzfoVar.zzL(1);
        int zzf = zzf(zzfoVar);
        byte[] bArr = new byte[zzf];
        zzfoVar.zzG(bArr, 0, zzf);
        return new zzajc(zzd, bArr, zzu2 <= 0 ? -1L : zzu2, zzu > 0 ? zzu : -1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0353  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzake zzk(com.google.android.gms.internal.ads.zzakb r40, com.google.android.gms.internal.ads.zzaiy r41, com.google.android.gms.internal.ads.zzadv r42) throws com.google.android.gms.internal.ads.zzcc {
        /*
            Method dump skipped, instructions count: 1505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaji.zzk(com.google.android.gms.internal.ads.zzakb, com.google.android.gms.internal.ads.zzaiy, com.google.android.gms.internal.ads.zzadv):com.google.android.gms.internal.ads.zzake");
    }

    private static ByteBuffer zzl() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzm(com.google.android.gms.internal.ads.zzfo r26, int r27, int r28, int r29, int r30, java.lang.String r31, boolean r32, com.google.android.gms.internal.ads.zzae r33, com.google.android.gms.internal.ads.zzaje r34, int r35) throws com.google.android.gms.internal.ads.zzcc {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaji.zzm(com.google.android.gms.internal.ads.zzfo, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzae, com.google.android.gms.internal.ads.zzaje, int):void");
    }
}
