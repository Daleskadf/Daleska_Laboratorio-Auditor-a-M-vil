package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzahc {
    public static final zzaha zza = new zzaha() { // from class: com.google.android.gms.internal.ads.zzagz
    };

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.android.gms.internal.ads.zzby zza(byte[] r11, int r12, com.google.android.gms.internal.ads.zzaha r13, com.google.android.gms.internal.ads.zzagd r14) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahc.zza(byte[], int, com.google.android.gms.internal.ads.zzaha, com.google.android.gms.internal.ads.zzagd):com.google.android.gms.internal.ads.zzby");
    }

    private static int zzb(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i, int i2) {
        int zzd = zzd(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return zzd;
        }
        while (true) {
            int length = bArr.length;
            if (zzd >= length - 1) {
                return length;
            }
            int i3 = zzd + 1;
            if ((zzd - i) % 2 == 0 && bArr[i3] == 0) {
                return zzd;
            }
            zzd = zzd(bArr, i3);
        }
    }

    private static int zzd(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int zze(zzfo zzfoVar, int i) {
        byte[] zzM = zzfoVar.zzM();
        int zzd = zzfoVar.zzd();
        int i2 = zzd;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= zzd + i) {
                return i;
            }
            if ((zzM[i2] & 255) == 255 && zzM[i3] == 0) {
                System.arraycopy(zzM, i2 + 2, zzM, i3, (i - (i2 - zzd)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:79|(2:81|(1:87)(1:86))|88|89|(2:91|(1:114)(12:97|98|99|100|101|102|103|104|66|54|(0)|57))(1:297)|115|116|(3:153|154|(2:168|(5:(5:253|(2:255|(2:257|(5:261|262|(1:264)|265|266))(1:279))(1:280)|270|271|272)(13:199|200|(1:202)(1:250)|203|(10:205|206|207|208|209|210|211|212|213|214)|231|232|(4:235|(3:237|238|239)(1:241)|240|233)|242|243|(1:245)(1:249)|246|247)|136|54|(0)|57)(13:175|(1:177)|178|(1:180)|181|(4:184|(3:186|187|188)(1:190)|189|182)|191|192|135|136|54|(0)|57))(2:162|(5:164|64|54|(0)|57)(3:165|166|167)))(7:123|124|(3:126|(1:128)|129)(4:139|140|141|(1:143))|130|131|132|133)|134|135|136|54|(0)|57) */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x039f, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03a0, code lost:
        r8 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03a4, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03a6, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03a7, code lost:
        r8 = r36;
     */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05bf  */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v58 */
    /* JADX WARN: Type inference failed for: r8v59 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzahd zzf(int r35, com.google.android.gms.internal.ads.zzfo r36, boolean r37, int r38, com.google.android.gms.internal.ads.zzaha r39) {
        /*
            Method dump skipped, instructions count: 1523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahc.zzf(int, com.google.android.gms.internal.ads.zzfo, boolean, int, com.google.android.gms.internal.ads.zzaha):com.google.android.gms.internal.ads.zzahd");
    }

    private static zzfzn zzg(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return zzfzn.zzn("");
        }
        zzfzk zzfzkVar = new zzfzk();
        int zzc = zzc(bArr, i2, i);
        while (i2 < zzc) {
            zzfzkVar.zzf(new String(bArr, i2, zzc - i2, zzj(i)));
            i2 = zzb(i) + zzc;
            zzc = zzc(bArr, i2, i);
        }
        zzfzn zzi = zzfzkVar.zzi();
        return zzi.isEmpty() ? zzfzn.zzn("") : zzi;
    }

    private static String zzh(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    private static String zzi(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean zzk(com.google.android.gms.internal.ads.zzfo r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r21.zzd()
        L8:
            int r3 = r21.zzb()     // Catch: java.lang.Throwable -> La5
            r4 = 1
            r5 = r23
            if (r3 < r5) goto La1
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r21.zzg()     // Catch: java.lang.Throwable -> La5
            long r8 = r21.zzu()     // Catch: java.lang.Throwable -> La5
            int r10 = r21.zzq()     // Catch: java.lang.Throwable -> La5
            goto L2c
        L22:
            int r7 = r21.zzo()     // Catch: java.lang.Throwable -> La5
            int r8 = r21.zzo()     // Catch: java.lang.Throwable -> La5
            long r8 = (long) r8     // Catch: java.lang.Throwable -> La5
            r10 = 0
        L2c:
            r11 = 0
            if (r7 != 0) goto L38
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L38
            if (r10 != 0) goto L38
            goto La1
        L38:
            r7 = 4
            if (r0 != r7) goto L67
            if (r24 != 0) goto L67
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L47
        L45:
            r4 = 0
            goto La1
        L47:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L67:
            if (r0 != r7) goto L77
            r3 = r10 & 64
            if (r3 == 0) goto L6e
            goto L6f
        L6e:
            r4 = 0
        L6f:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L87
        L77:
            if (r0 != r3) goto L85
            r3 = r10 & 32
            if (r3 == 0) goto L7f
            r3 = 1
            goto L80
        L7f:
            r3 = 0
        L80:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L86
            goto L87
        L85:
            r3 = 0
        L86:
            r4 = 0
        L87:
            if (r4 == 0) goto L8b
            int r3 = r3 + 4
        L8b:
            long r3 = (long) r3     // Catch: java.lang.Throwable -> La5
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L91
            goto L45
        L91:
            int r3 = r21.zzb()     // Catch: java.lang.Throwable -> La5
            long r3 = (long) r3     // Catch: java.lang.Throwable -> La5
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L9b
            goto L45
        L9b:
            int r3 = (int) r8     // Catch: java.lang.Throwable -> La5
            r1.zzL(r3)     // Catch: java.lang.Throwable -> La5
            goto L8
        La1:
            r1.zzK(r2)
            return r4
        La5:
            r0 = move-exception
            r1.zzK(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahc.zzk(com.google.android.gms.internal.ads.zzfo, int, int, boolean):boolean");
    }

    private static byte[] zzl(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return zzfx.zzf;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    private static Charset zzj(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return zzfwd.zzc;
                }
                return zzfwd.zzb;
            }
            return zzfwd.zzd;
        }
        return zzfwd.zzf;
    }
}
