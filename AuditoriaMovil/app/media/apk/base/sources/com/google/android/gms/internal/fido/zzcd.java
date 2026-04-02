package com.google.android.gms.internal.fido;

import io.flutter.plugins.pathprovider.b;
import java.math.RoundingMode;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzcd {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzcd(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r0 = 128(0x80, float:1.794E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = r3
        La:
            int r5 = r11.length
            if (r4 >= r5) goto L2b
            char r5 = r11[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = r6
            goto L15
        L14:
            r7 = r3
        L15:
            java.lang.String r8 = "Non-ASCII character: %s"
            com.google.android.gms.internal.fido.zzap.zzd(r7, r8, r5)
            r7 = r1[r5]
            if (r7 != r2) goto L1f
            goto L20
        L1f:
            r6 = r3
        L20:
            java.lang.String r7 = "Duplicate character: %s"
            com.google.android.gms.internal.fido.zzap.zzd(r6, r7, r5)
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L2b:
            r9.<init>(r10, r11, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzcd.<init>(java.lang.String, char[]):void");
    }

    public static /* bridge */ /* synthetic */ char[] zzd(zzcd zzcdVar) {
        return zzcdVar.zzf;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcd) {
            zzcd zzcdVar = (zzcd) obj;
            if (this.zzh == zzcdVar.zzh && Arrays.equals(this.zzf, zzcdVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = Arrays.hashCode(this.zzf);
        if (true != this.zzh) {
            i7 = 1237;
        } else {
            i7 = 1231;
        }
        return hashCode + i7;
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i7) {
        return this.zzf[i7];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15 */
    public final zzcd zzb() {
        int i7;
        boolean z7;
        for (char c8 : this.zzf) {
            if (zzad.zza(c8)) {
                char[] cArr = this.zzf;
                int length = cArr.length;
                int i8 = 0;
                while (true) {
                    if (i8 < length) {
                        char c9 = cArr[i8];
                        if (c9 >= 'A' && c9 <= 'Z') {
                            z7 = true;
                            break;
                        }
                        i8++;
                    } else {
                        z7 = false;
                        break;
                    }
                }
                if (!z7) {
                    char[] cArr2 = new char[this.zzf.length];
                    int i9 = 0;
                    while (true) {
                        char[] cArr3 = this.zzf;
                        if (i9 >= cArr3.length) {
                            break;
                        }
                        char c10 = cArr3[i9];
                        if (zzad.zza(c10)) {
                            c10 ^= 32;
                        }
                        cArr2[i9] = (char) c10;
                        i9++;
                    }
                    zzcd zzcdVar = new zzcd(this.zze.concat(".upperCase()"), cArr2);
                    if (this.zzh && !zzcdVar.zzh) {
                        byte[] bArr = zzcdVar.zzg;
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i7 = 65; i7 <= 90; i7++) {
                            int i10 = i7 | 32;
                            byte[] bArr2 = zzcdVar.zzg;
                            byte b5 = bArr2[i7];
                            byte b7 = bArr2[i10];
                            if (b5 == -1) {
                                copyOf[i7] = b7;
                            } else {
                                char c11 = (char) i7;
                                char c12 = (char) i10;
                                if (b7 == -1) {
                                    copyOf[i10] = b5;
                                } else {
                                    throw new IllegalStateException(zzaq.zza("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c11), Character.valueOf(c12)));
                                }
                            }
                        }
                        return new zzcd(zzcdVar.zze.concat(".ignoreCase()"), zzcdVar.zzf, copyOf, true);
                    }
                    return zzcdVar;
                }
                throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
            }
        }
        return this;
    }

    public final boolean zzc(char c8) {
        byte[] bArr = this.zzg;
        if (bArr.length > 61 && bArr[61] != -1) {
            return true;
        }
        return false;
    }

    private zzcd(String str, char[] cArr, byte[] bArr, boolean z7) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zzb = zzcj.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = zzb;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(zzb);
            int i7 = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i7;
            this.zzd = zzb >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i7];
            for (int i8 = 0; i8 < this.zzd; i8++) {
                zArr[zzcj.zza(i8 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = z7;
        } catch (ArithmeticException e7) {
            throw new IllegalArgumentException(b.e(cArr.length, "Illegal alphabet length "), e7);
        }
    }
}
