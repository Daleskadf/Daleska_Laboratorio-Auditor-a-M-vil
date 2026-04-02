package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzamo {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzfo zzc = new zzfo();
    private final StringBuilder zzd = new StringBuilder();

    static String zza(zzfo zzfoVar, StringBuilder sb) {
        zzc(zzfoVar);
        if (zzfoVar.zzb() == 0) {
            return null;
        }
        String zzd = zzd(zzfoVar, sb);
        if ("".equals(zzd)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((char) zzfoVar.zzm());
            return sb2.toString();
        }
        return zzd;
    }

    static void zzc(zzfo zzfoVar) {
        while (true) {
            for (boolean z = true; zzfoVar.zzb() > 0 && z; z = false) {
                char c = (char) zzfoVar.zzM()[zzfoVar.zzd()];
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    zzfoVar.zzL(1);
                } else {
                    int zzd = zzfoVar.zzd();
                    int zze = zzfoVar.zze();
                    byte[] zzM = zzfoVar.zzM();
                    if (zzd + 2 <= zze) {
                        int i = zzd + 1;
                        if (zzM[zzd] == 47) {
                            int i2 = i + 1;
                            if (zzM[i] == 42) {
                                while (true) {
                                    int i3 = i2 + 1;
                                    if (i3 >= zze) {
                                        break;
                                    } else if (((char) zzM[i2]) == '*' && ((char) zzM[i3]) == '/') {
                                        zze = i3 + 1;
                                        i2 = zze;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                zzfoVar.zzL(zze - zzfoVar.zzd());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    private static String zzd(zzfo zzfoVar, StringBuilder sb) {
        sb.setLength(0);
        int zzd = zzfoVar.zzd();
        int zze = zzfoVar.zze();
        loop0: while (true) {
            for (boolean z = false; zzd < zze && !z; z = true) {
                char c = (char) zzfoVar.zzM()[zzd];
                if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                    sb.append(c);
                    zzd++;
                }
            }
        }
        zzfoVar.zzL(zzd - zzfoVar.zzd());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0318, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
        if (")".equals(zza(r3, r4)) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzb(com.google.android.gms.internal.ads.zzfo r18) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamo.zzb(com.google.android.gms.internal.ads.zzfo):java.util.List");
    }
}
