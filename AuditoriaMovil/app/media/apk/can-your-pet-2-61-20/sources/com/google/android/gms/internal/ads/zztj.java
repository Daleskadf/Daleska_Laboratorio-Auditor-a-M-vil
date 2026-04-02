package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zztj {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        r6 = ((com.google.android.gms.internal.ads.zzti) r4.get(r5)).zzd.getVideoCapabilities().getSupportedPerformancePoints();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
        com.google.android.gms.internal.ads.zzox$$ExternalSyntheticApiModelOutline1.m$2();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
        if (zzb(r6, com.google.android.gms.internal.ads.zzox$$ExternalSyntheticApiModelOutline1.m(1280, 720, 60)) != 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zza(android.media.MediaCodecInfo.VideoCapabilities r2, int r3, int r4, double r5) {
        /*
            java.util.List r2 = com.google.android.gms.internal.ads.zzox$$ExternalSyntheticApiModelOutline1.m(r2)
            r0 = 0
            if (r2 == 0) goto L9d
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto Lf
            goto L9d
        Lf:
            int r5 = (int) r5
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r3 = com.google.android.gms.internal.ads.zzox$$ExternalSyntheticApiModelOutline1.m(r3, r4, r5)
            int r2 = zzb(r2, r3)
            r3 = 1
            if (r2 != r3) goto L9c
            java.lang.Boolean r4 = com.google.android.gms.internal.ads.zztk.zzb()
            if (r4 != 0) goto L9c
            com.google.android.gms.internal.ads.zzak r4 = new com.google.android.gms.internal.ads.zzak     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            r4.<init>()     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            java.lang.String r5 = "video/avc"
            r4.zzW(r5)     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            com.google.android.gms.internal.ads.zzam r4 = r4.zzac()     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            java.lang.String r5 = r4.zzm     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            if (r5 == 0) goto L8a
            com.google.android.gms.internal.ads.zztq r5 = com.google.android.gms.internal.ads.zztq.zzb     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            java.util.List r4 = com.google.android.gms.internal.ads.zzuc.zzf(r5, r4, r0, r0)     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            r5 = 0
        L3a:
            int r6 = r4.size()     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            if (r5 >= r6) goto L8a
            java.lang.Object r6 = r4.get(r5)     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            com.google.android.gms.internal.ads.zzti r6 = (com.google.android.gms.internal.ads.zzti) r6     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.zzd     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            if (r6 == 0) goto L86
            java.lang.Object r6 = r4.get(r5)     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            com.google.android.gms.internal.ads.zzti r6 = (com.google.android.gms.internal.ads.zzti) r6     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.zzd     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            if (r6 == 0) goto L86
            java.lang.Object r6 = r4.get(r5)     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            com.google.android.gms.internal.ads.zzti r6 = (com.google.android.gms.internal.ads.zzti) r6     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.zzd     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            java.util.List r6 = com.google.android.gms.internal.ads.zzox$$ExternalSyntheticApiModelOutline1.m(r6)     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            if (r6 == 0) goto L86
            boolean r1 = r6.isEmpty()     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            if (r1 != 0) goto L86
            com.google.android.gms.internal.ads.zzox$$ExternalSyntheticApiModelOutline1.m$2()     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            r4 = 720(0x2d0, float:1.009E-42)
            r5 = 60
            r1 = 1280(0x500, float:1.794E-42)
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = com.google.android.gms.internal.ads.zzox$$ExternalSyntheticApiModelOutline1.m(r1, r4, r5)     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            int r4 = zzb(r6, r4)     // Catch: com.google.android.gms.internal.ads.zztw -> L89
            if (r4 != r3) goto L84
            goto L8a
        L84:
            r3 = 0
            goto L8a
        L86:
            int r5 = r5 + 1
            goto L3a
        L89:
        L8a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.google.android.gms.internal.ads.zztk.zzc(r3)
            java.lang.Boolean r3 = com.google.android.gms.internal.ads.zztk.zzb()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L9c
            return r0
        L9c:
            return r2
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztj.zza(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
    }

    private static int zzb(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        boolean covers;
        for (int i = 0; i < list.size(); i++) {
            covers = zzox$$ExternalSyntheticApiModelOutline1.m350m(list.get(i)).covers(performancePoint);
            if (covers) {
                return 2;
            }
        }
        return 1;
    }
}
