package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgca {
    static {
        Math.log(2.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (java.lang.Math.abs(r9 - r4) == 0.5d) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long zza(double r9, java.math.RoundingMode r11) {
        /*
            boolean r0 = com.google.android.gms.internal.ads.zzgcb.zza(r9)
            if (r0 == 0) goto Lb9
            int[] r0 = com.google.android.gms.internal.ads.zzgbz.zza
            int r1 = r11.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r4 = 0
            switch(r0) {
                case 1: goto L76;
                case 2: goto L65;
                case 3: goto L56;
                case 4: goto L7d;
                case 5: goto L45;
                case 6: goto L40;
                case 7: goto L2b;
                case 8: goto L1c;
                default: goto L16;
            }
        L16:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L1c:
            double r4 = java.lang.Math.rint(r9)
            double r6 = r9 - r4
            double r6 = java.lang.Math.abs(r6)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L7e
            goto L7d
        L2b:
            double r4 = java.lang.Math.rint(r9)
            double r6 = r9 - r4
            double r6 = java.lang.Math.abs(r6)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L7e
            double r2 = java.lang.Math.copySign(r2, r9)
            double r4 = r9 + r2
            goto L7e
        L40:
            double r4 = java.lang.Math.rint(r9)
            goto L7e
        L45:
            boolean r0 = zzb(r9)
            if (r0 == 0) goto L4c
            goto L7d
        L4c:
            long r2 = (long) r9
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 <= 0) goto L53
            r0 = 1
            goto L54
        L53:
            r0 = -1
        L54:
            long r4 = (long) r0
            goto L73
        L56:
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 <= 0) goto L7d
            boolean r0 = zzb(r9)
            if (r0 == 0) goto L61
            goto L7d
        L61:
            long r2 = (long) r9
            r4 = 1
            goto L73
        L65:
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 >= 0) goto L7d
            boolean r0 = zzb(r9)
            if (r0 == 0) goto L70
            goto L7d
        L70:
            long r2 = (long) r9
            r4 = -1
        L73:
            long r2 = r2 + r4
            double r4 = (double) r2
            goto L7e
        L76:
            boolean r0 = zzb(r9)
            com.google.android.gms.internal.ads.zzgcg.zzb(r0)
        L7d:
            r4 = r9
        L7e:
            r2 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            double r2 = r2 - r4
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 >= 0) goto L8a
            r2 = 1
            goto L8b
        L8a:
            r2 = 0
        L8b:
            r6 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 >= 0) goto L92
            goto L93
        L92:
            r1 = 0
        L93:
            r0 = r2 & r1
            if (r0 == 0) goto L99
            long r9 = (long) r4
            return r9
        L99:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "rounded value is out of range for input "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = " and rounding mode "
            r1.append(r9)
            r1.append(r11)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        Lb9:
            java.lang.ArithmeticException r9 = new java.lang.ArithmeticException
            java.lang.String r10 = "input is infinite or NaN"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgca.zza(double, java.math.RoundingMode):long");
    }

    public static boolean zzb(double d) {
        if (zzgcb.zza(d)) {
            if (d != 0.0d) {
                zzfwr.zzf(zzgcb.zza(d), "not a normal value");
                int exponent = Math.getExponent(d);
                long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
                return 52 - Long.numberOfTrailingZeros(exponent == -1023 ? doubleToRawLongBits + doubleToRawLongBits : doubleToRawLongBits | 4503599627370496L) <= Math.getExponent(d);
            }
            return true;
        }
        return false;
    }
}
