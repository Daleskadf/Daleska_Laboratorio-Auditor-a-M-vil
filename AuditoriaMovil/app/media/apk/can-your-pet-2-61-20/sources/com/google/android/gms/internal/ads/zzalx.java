package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzalx implements zzalh {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;
    private final zzalw zzc;
    private final zzfo zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzalx() {
        this(null);
    }

    private static float zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                return i != 2 ? -3.4028235E38f : 0.95f;
            }
            return 0.5f;
        }
        return 0.05f;
    }

    private static int zzc(long j, List list, List list2) {
        int i;
        ArrayList arrayList;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            } else if (((Long) list.get(size)).longValue() != j) {
                if (((Long) list.get(size)).longValue() < j) {
                    i = size + 1;
                    break;
                }
            } else {
                return size;
            }
        }
        list.add(i, Long.valueOf(j));
        if (i == 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList((Collection) list2.get(i - 1));
        }
        list2.add(i, arrayList);
        return i;
    }

    private static long zzd(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (matcher.matches()) {
            String group = matcher.group(1);
            int i = zzfx.zza;
            return (Long.parseLong(group) * 3600000000L) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * WorkRequest.MIN_BACKOFF_MILLIS);
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r3.equals("playresx") != false) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zze(com.google.android.gms.internal.ads.zzfo r7, java.nio.charset.Charset r8) {
        /*
            r6 = this;
        L0:
            java.lang.String r0 = r7.zzy(r8)
            if (r0 == 0) goto Ldf
            java.lang.String r1 = "[Script Info]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            r2 = 91
            if (r1 == 0) goto L75
        L10:
            java.lang.String r0 = r7.zzy(r8)
            if (r0 == 0) goto L0
            int r1 = r7.zzb()
            if (r1 == 0) goto L22
            char r1 = r7.zza(r8)
            if (r1 == r2) goto L0
        L22:
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r3 = 2
            if (r1 != r3) goto L10
            r1 = 0
            r3 = r0[r1]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = com.google.android.gms.internal.ads.zzfvx.zza(r3)
            int r4 = r3.hashCode()
            r5 = 1
            switch(r4) {
                case 1879649548: goto L4a;
                case 1879649549: goto L40;
                default: goto L3f;
            }
        L3f:
            goto L53
        L40:
            java.lang.String r1 = "playresy"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L53
            r1 = 1
            goto L54
        L4a:
            java.lang.String r4 = "playresx"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L53
            goto L54
        L53:
            r1 = -1
        L54:
            if (r1 == 0) goto L68
            if (r1 == r5) goto L59
            goto L10
        L59:
            r0 = r0[r5]     // Catch: java.lang.NumberFormatException -> L66
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L66
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L66
            r6.zzg = r0     // Catch: java.lang.NumberFormatException -> L66
            goto L10
        L66:
            goto L10
        L68:
            r0 = r0[r5]     // Catch: java.lang.NumberFormatException -> L66
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L66
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L66
            r6.zzf = r0     // Catch: java.lang.NumberFormatException -> L66
            goto L10
        L75:
            java.lang.String r1 = "[V4+ Styles]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            java.lang.String r3 = "SsaParser"
            if (r1 == 0) goto Lc8
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1 = 0
        L85:
            java.lang.String r4 = r7.zzy(r8)
            if (r4 == 0) goto Lc4
            int r5 = r7.zzb()
            if (r5 == 0) goto L97
            char r5 = r7.zza(r8)
            if (r5 == r2) goto Lc4
        L97:
            java.lang.String r5 = "Format:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto La4
            com.google.android.gms.internal.ads.zzaly r1 = com.google.android.gms.internal.ads.zzaly.zza(r4)
            goto L85
        La4:
            java.lang.String r5 = "Style:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L85
            if (r1 != 0) goto Lb8
            java.lang.String r5 = "Skipping 'Style:' line before 'Format:' line: "
            java.lang.String r4 = r5.concat(r4)
            com.google.android.gms.internal.ads.zzfe.zzf(r3, r4)
            goto L85
        Lb8:
            com.google.android.gms.internal.ads.zzama r4 = com.google.android.gms.internal.ads.zzama.zzb(r4, r1)
            if (r4 == 0) goto L85
            java.lang.String r5 = r4.zza
            r0.put(r5, r4)
            goto L85
        Lc4:
            r6.zze = r0
            goto L0
        Lc8:
            java.lang.String r1 = "[V4 Styles]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto Ld7
            java.lang.String r0 = "[V4 Styles] are not supported"
            com.google.android.gms.internal.ads.zzfe.zze(r3, r0)
            goto L0
        Ld7:
            java.lang.String r1 = "[Events]"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L0
        Ldf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalx.zze(com.google.android.gms.internal.ads.zzfo, java.nio.charset.Charset):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01aa  */
    @Override // com.google.android.gms.internal.ads.zzalh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(byte[] r24, int r25, int r26, com.google.android.gms.internal.ads.zzalg r27, com.google.android.gms.internal.ads.zzep r28) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalx.zza(byte[], int, int, com.google.android.gms.internal.ads.zzalg, com.google.android.gms.internal.ads.zzep):void");
    }

    public zzalx(List list) {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzfo();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String zzA = zzfx.zzA((byte[]) list.get(0));
        zzek.zzd(zzA.startsWith("Format:"));
        zzalw zza2 = zzalw.zza(zzA);
        zza2.getClass();
        this.zzc = zza2;
        zze(new zzfo((byte[]) list.get(1)), zzfwd.zzc);
    }
}
