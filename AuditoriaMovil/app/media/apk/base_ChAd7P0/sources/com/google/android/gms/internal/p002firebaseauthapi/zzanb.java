package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.pathprovider.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzanb  reason: invalid package */
/* loaded from: classes.dex */
public final class zzanb {
    private static final zzanc zza;

    static {
        if (zzana.zzc()) {
            zzana.zzd();
        }
        zza = new zzanf();
    }

    public static /* synthetic */ int zza(byte[] bArr, int i7, int i8) {
        byte b5 = bArr[i7 - 1];
        int i9 = i8 - i7;
        if (i9 == 0) {
            if (b5 > -12) {
                return -1;
            }
            return b5;
        } else if (i9 == 1) {
            byte b7 = bArr[i7];
            if (b5 > -12 || b7 > -65) {
                return -1;
            }
            return (b7 << 8) ^ b5;
        } else if (i9 == 2) {
            byte b8 = bArr[i7];
            byte b9 = bArr[i7 + 1];
            if (b5 > -12 || b8 > -65 || b9 > -65) {
                return -1;
            }
            return (b9 << 16) ^ ((b8 << 8) ^ b5);
        } else {
            throw new AssertionError();
        }
    }

    public static String zzb(byte[] bArr, int i7, int i8) {
        return zza.zza(bArr, i7, i8);
    }

    public static boolean zzc(byte[] bArr, int i7, int i8) {
        if (zza.zza(0, bArr, i7, i8) != 0) {
            return false;
        }
        return true;
    }

    public static int zza(String str, byte[] bArr, int i7, int i8) {
        return zza.zza(str, bArr, i7, i8);
    }

    public static int zza(String str) {
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
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i8) < 65536) {
                                throw new zzane(i8, length2);
                            }
                            i8++;
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
        throw new IllegalArgumentException(b.g("UTF-8 length does not fit in int: ", i9 + 4294967296L));
    }
}
