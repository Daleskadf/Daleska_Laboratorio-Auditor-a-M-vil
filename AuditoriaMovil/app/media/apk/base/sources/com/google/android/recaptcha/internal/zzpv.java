package com.google.android.recaptcha.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzpv {
    static {
        if (zzps.zzx() && zzps.zzy()) {
            int i7 = zzks.zza;
        }
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i7, int i8) {
        int i9 = i8 - i7;
        byte b5 = bArr[i7 - 1];
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    byte b7 = bArr[i7];
                    byte b8 = bArr[i7 + 1];
                    if (b5 <= -12 && b7 <= -65 && b8 <= -65) {
                        return (b8 << 16) ^ ((b7 << 8) ^ b5);
                    }
                    return -1;
                }
                throw new AssertionError();
            }
            byte b9 = bArr[i7];
            if (b5 <= -12 && b9 <= -65) {
                return (b9 << 8) ^ b5;
            }
            return -1;
        } else if (b5 <= -12) {
            return b5;
        } else {
            return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fe, code lost:
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzb(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzpv.zzb(java.lang.String, byte[], int, int):int");
    }

    public static int zzc(String str) {
        int length = str.length();
        int i7 = 0;
        int i8 = 0;
        while (i8 < length && str.charAt(i8) < 128) {
            i8++;
        }
        int i9 = length;
        while (true) {
            if (i8 >= length) {
                break;
            }
            char charAt = str.charAt(i8);
            if (charAt < 2048) {
                i9 += (127 - charAt) >>> 31;
                i8++;
            } else {
                int length2 = str.length();
                while (i8 < length2) {
                    char charAt2 = str.charAt(i8);
                    if (charAt2 < 2048) {
                        i7 += (127 - charAt2) >>> 31;
                    } else {
                        i7 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i8) >= 65536) {
                                i8++;
                            } else {
                                throw new zzpu(i8, length2);
                            }
                        }
                    }
                    i8++;
                }
                i9 += i7;
            }
        }
        if (i9 >= length) {
            return i9;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i9 + 4294967296L));
    }

    public static String zzd(byte[] bArr, int i7, int i8) {
        int i9;
        int length = bArr.length;
        if ((((length - i7) - i8) | i7 | i8) >= 0) {
            int i10 = i7 + i8;
            char[] cArr = new char[i8];
            int i11 = 0;
            while (i7 < i10) {
                byte b5 = bArr[i7];
                if (!zzpt.zzd(b5)) {
                    break;
                }
                i7++;
                cArr[i11] = (char) b5;
                i11++;
            }
            int i12 = i11;
            while (i7 < i10) {
                int i13 = i7 + 1;
                byte b7 = bArr[i7];
                if (zzpt.zzd(b7)) {
                    cArr[i12] = (char) b7;
                    i12++;
                    i7 = i13;
                    while (i7 < i10) {
                        byte b8 = bArr[i7];
                        if (zzpt.zzd(b8)) {
                            i7++;
                            cArr[i12] = (char) b8;
                            i12++;
                        }
                    }
                } else {
                    if (b7 < -32) {
                        if (i13 < i10) {
                            i9 = i12 + 1;
                            i7 += 2;
                            zzpt.zzc(b7, bArr[i13], cArr, i12);
                        } else {
                            throw new zznn("Protocol message had invalid UTF-8.");
                        }
                    } else if (b7 < -16) {
                        if (i13 < i10 - 1) {
                            i9 = i12 + 1;
                            int i14 = i7 + 2;
                            i7 += 3;
                            zzpt.zzb(b7, bArr[i13], bArr[i14], cArr, i12);
                        } else {
                            throw new zznn("Protocol message had invalid UTF-8.");
                        }
                    } else if (i13 < i10 - 2) {
                        byte b9 = bArr[i13];
                        int i15 = i7 + 3;
                        i7 += 4;
                        zzpt.zza(b7, b9, bArr[i7 + 2], bArr[i15], cArr, i12);
                        i12 += 2;
                    } else {
                        throw new zznn("Protocol message had invalid UTF-8.");
                    }
                    i12 = i9;
                }
            }
            return new String(cArr, 0, i12);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i7), Integer.valueOf(i8)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0076 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zze(byte[] r6, int r7, int r8) {
        /*
        L0:
            if (r7 >= r8) goto L9
            r0 = r6[r7]
            if (r0 < 0) goto L9
            int r7 = r7 + 1
            goto L0
        L9:
            if (r7 < r8) goto Ld
            goto L7a
        Ld:
            if (r7 >= r8) goto L7a
            int r0 = r7 + 1
            r1 = r6[r7]
            if (r1 >= 0) goto L78
            r2 = -32
            r3 = -65
            if (r1 >= r2) goto L29
            if (r0 < r8) goto L1e
            goto L57
        L1e:
            r2 = -62
            if (r1 < r2) goto L76
            int r7 = r7 + 2
            r0 = r6[r0]
            if (r0 <= r3) goto Ld
            goto L76
        L29:
            r4 = -16
            if (r1 >= r4) goto L4f
            int r4 = r8 + (-1)
            if (r0 < r4) goto L36
            int r1 = zza(r6, r0, r8)
            goto L57
        L36:
            int r4 = r7 + 2
            r0 = r6[r0]
            if (r0 > r3) goto L76
            r5 = -96
            if (r1 != r2) goto L42
            if (r0 < r5) goto L76
        L42:
            r2 = -19
            if (r1 != r2) goto L48
            if (r0 >= r5) goto L76
        L48:
            int r7 = r7 + 3
            r0 = r6[r4]
            if (r0 <= r3) goto Ld
            goto L76
        L4f:
            int r2 = r8 + (-2)
            if (r0 < r2) goto L5a
            int r1 = zza(r6, r0, r8)
        L57:
            if (r1 == 0) goto L7a
            goto L76
        L5a:
            int r2 = r7 + 2
            r0 = r6[r0]
            if (r0 > r3) goto L76
            int r1 = r1 << 28
            int r0 = r0 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L76
            int r0 = r7 + 3
            r1 = r6[r2]
            if (r1 > r3) goto L76
            int r7 = r7 + 4
            r0 = r6[r0]
            if (r0 > r3) goto L76
            goto Ld
        L76:
            r6 = 0
            return r6
        L78:
            r7 = r0
            goto Ld
        L7a:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzpv.zze(byte[], int, int):boolean");
    }
}
