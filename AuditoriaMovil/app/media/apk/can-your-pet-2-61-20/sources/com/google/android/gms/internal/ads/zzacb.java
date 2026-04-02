package com.google.android.gms.internal.ads;

import com.google.android.gms.safetynet.SafetyNetStatusCodes;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzacb {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzaca zza(byte[] bArr) throws zzcc {
        return zzb(new zzfn(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
        if (r11 != 3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzaca zzb(com.google.android.gms.internal.ads.zzfn r11, boolean r12) throws com.google.android.gms.internal.ads.zzcc {
        /*
            int r0 = zzc(r11)
            int r1 = zzd(r11)
            r2 = 4
            int r3 = r11.zzd(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "mp4a.40."
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r5 = 5
            r6 = 22
            if (r0 == r5) goto L24
            r5 = 29
            if (r0 != r5) goto L32
        L24:
            int r1 = zzd(r11)
            int r0 = zzc(r11)
            if (r0 != r6) goto L32
            int r3 = r11.zzd(r2)
        L32:
            if (r12 == 0) goto Lcc
            r12 = 17
            r5 = 6
            r7 = 1
            r8 = 2
            r9 = 3
            if (r0 == r7) goto L5f
            if (r0 == r8) goto L5f
            if (r0 == r9) goto L5f
            if (r0 == r2) goto L5f
            if (r0 == r5) goto L5f
            r2 = 7
            if (r0 == r2) goto L5f
            if (r0 == r12) goto L5f
            switch(r0) {
                case 19: goto L5f;
                case 20: goto L5f;
                case 21: goto L5f;
                case 22: goto L5f;
                case 23: goto L5f;
                default: goto L4c;
            }
        L4c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Unsupported audio object type: "
            r11.<init>(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.google.android.gms.internal.ads.zzcc r11 = com.google.android.gms.internal.ads.zzcc.zzc(r11)
            throw r11
        L5f:
            boolean r2 = r11.zzo()
            if (r2 == 0) goto L6c
            java.lang.String r2 = "AacUtil"
            java.lang.String r10 = "Unexpected frameLengthFlag = 1"
            com.google.android.gms.internal.ads.zzfe.zzf(r2, r10)
        L6c:
            boolean r2 = r11.zzo()
            if (r2 == 0) goto L77
            r2 = 14
            r11.zzm(r2)
        L77:
            boolean r2 = r11.zzo()
            if (r3 == 0) goto Lc6
            r10 = 20
            if (r0 == r5) goto L85
            if (r0 != r10) goto L88
            r0 = 20
        L85:
            r11.zzm(r9)
        L88:
            if (r2 == 0) goto La5
            if (r0 != r6) goto L92
            r2 = 16
            r11.zzm(r2)
            goto L93
        L92:
            r6 = r0
        L93:
            if (r6 == r12) goto L9f
            r12 = 19
            if (r6 == r12) goto L9f
            if (r6 == r10) goto L9f
            r12 = 23
            if (r6 != r12) goto La2
        L9f:
            r11.zzm(r9)
        La2:
            r11.zzm(r7)
        La5:
            switch(r0) {
                case 17: goto La9;
                case 18: goto La8;
                case 19: goto La9;
                case 20: goto La9;
                case 21: goto La9;
                case 22: goto La9;
                case 23: goto La9;
                default: goto La8;
            }
        La8:
            goto Lcc
        La9:
            int r11 = r11.zzd(r8)
            if (r11 == r8) goto Lb2
            if (r11 == r9) goto Lb3
            goto Lcc
        Lb2:
            r9 = r11
        Lb3:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Unsupported epConfig: "
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.google.android.gms.internal.ads.zzcc r11 = com.google.android.gms.internal.ads.zzcc.zzc(r11)
            throw r11
        Lc6:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            r11.<init>()
            throw r11
        Lcc:
            int[] r11 = com.google.android.gms.internal.ads.zzacb.zzc
            r11 = r11[r3]
            r12 = -1
            r0 = 0
            if (r11 == r12) goto Lda
            com.google.android.gms.internal.ads.zzaca r12 = new com.google.android.gms.internal.ads.zzaca
            r12.<init>(r1, r11, r4, r0)
            return r12
        Lda:
            com.google.android.gms.internal.ads.zzcc r11 = com.google.android.gms.internal.ads.zzcc.zza(r0, r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacb.zzb(com.google.android.gms.internal.ads.zzfn, boolean):com.google.android.gms.internal.ads.zzaca");
    }

    private static int zzc(zzfn zzfnVar) {
        int zzd = zzfnVar.zzd(5);
        return zzd == 31 ? zzfnVar.zzd(6) + 32 : zzd;
    }

    private static int zzd(zzfn zzfnVar) throws zzcc {
        int zzd = zzfnVar.zzd(4);
        if (zzd == 15) {
            if (zzfnVar.zza() < 24) {
                throw zzcc.zza("AAC header insufficient data", null);
            }
            return zzfnVar.zzd(24);
        } else if (zzd < 13) {
            return zzb[zzd];
        } else {
            throw zzcc.zza("AAC header wrong Sampling Frequency Index", null);
        }
    }
}
