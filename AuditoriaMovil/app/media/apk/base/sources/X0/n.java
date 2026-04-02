package X0;
/* loaded from: classes.dex */
public abstract class n {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
        r6 = ((X0.m) r4.get(r5)).f6289d.getVideoCapabilities().getSupportedPerformancePoints();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
        B5.AbstractC0038k.m();
        r4 = B5.AbstractC0038k.e();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
        if (r5 >= r6.size()) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
        r2 = B5.AbstractC0038k.g(r6.get(r5)).covers(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ae, code lost:
        if (r2 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b1, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b5, code lost:
        if (r7 != 1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.media.MediaCodecInfo.VideoCapabilities r3, int r4, int r5, double r6) {
        /*
            java.util.List r3 = B5.AbstractC0038k.l(r3)
            r0 = 0
            if (r3 == 0) goto Lc5
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Lf
            goto Lc5
        Lf:
            B5.AbstractC0038k.m()
            int r6 = (int) r6
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = B5.AbstractC0038k.f(r4, r5, r6)
            r5 = r0
        L18:
            int r6 = r3.size()
            r7 = 2
            r1 = 1
            if (r5 >= r6) goto L33
            java.lang.Object r6 = r3.get(r5)
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r6 = B5.AbstractC0038k.g(r6)
            boolean r6 = B5.AbstractC0038k.x(r6, r4)
            if (r6 == 0) goto L30
            r3 = r7
            goto L34
        L30:
            int r5 = r5 + 1
            goto L18
        L33:
            r3 = r1
        L34:
            if (r3 != r1) goto Lc4
            java.lang.Boolean r4 = h3.AbstractC1079a.f11334c
            if (r4 != 0) goto Lc4
            int r4 = K0.x.f2529a
            r5 = 35
            if (r4 < r5) goto L43
        L40:
            r1 = r0
            goto Lbb
        L43:
            H0.q r4 = new H0.q     // Catch: X0.w -> Lbb
            r4.<init>()     // Catch: X0.w -> Lbb
            java.lang.String r5 = "video/avc"
            java.lang.String r5 = H0.I.l(r5)     // Catch: X0.w -> Lbb
            r4.f1850l = r5     // Catch: X0.w -> Lbb
            H0.r r5 = new H0.r     // Catch: X0.w -> Lbb
            r5.<init>(r4)     // Catch: X0.w -> Lbb
            java.lang.String r4 = r5.f1886m     // Catch: X0.w -> Lbb
            if (r4 == 0) goto Lbb
            X0.u r4 = X0.u.f6364b     // Catch: X0.w -> Lbb
            A3.e0 r4 = X0.z.g(r4, r5, r0, r0)     // Catch: X0.w -> Lbb
            r5 = r0
        L60:
            int r6 = r4.f140d     // Catch: X0.w -> Lbb
            if (r5 >= r6) goto Lbb
            java.lang.Object r6 = r4.get(r5)     // Catch: X0.w -> Lbb
            X0.m r6 = (X0.m) r6     // Catch: X0.w -> Lbb
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.f6289d     // Catch: X0.w -> Lbb
            if (r6 == 0) goto Lb8
            java.lang.Object r6 = r4.get(r5)     // Catch: X0.w -> Lbb
            X0.m r6 = (X0.m) r6     // Catch: X0.w -> Lbb
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.f6289d     // Catch: X0.w -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: X0.w -> Lbb
            if (r6 == 0) goto Lb8
            java.lang.Object r6 = r4.get(r5)     // Catch: X0.w -> Lbb
            X0.m r6 = (X0.m) r6     // Catch: X0.w -> Lbb
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.f6289d     // Catch: X0.w -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: X0.w -> Lbb
            java.util.List r6 = B5.AbstractC0038k.l(r6)     // Catch: X0.w -> Lbb
            if (r6 == 0) goto Lb8
            boolean r2 = r6.isEmpty()     // Catch: X0.w -> Lbb
            if (r2 != 0) goto Lb8
            B5.AbstractC0038k.m()     // Catch: X0.w -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = B5.AbstractC0038k.e()     // Catch: X0.w -> Lbb
            r5 = r0
        L9c:
            int r2 = r6.size()     // Catch: X0.w -> Lbb
            if (r5 >= r2) goto Lb4
            java.lang.Object r2 = r6.get(r5)     // Catch: X0.w -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r2 = B5.AbstractC0038k.g(r2)     // Catch: X0.w -> Lbb
            boolean r2 = B5.AbstractC0038k.x(r2, r4)     // Catch: X0.w -> Lbb
            if (r2 == 0) goto Lb1
            goto Lb5
        Lb1:
            int r5 = r5 + 1
            goto L9c
        Lb4:
            r7 = r1
        Lb5:
            if (r7 != r1) goto L40
            goto Lbb
        Lb8:
            int r5 = r5 + 1
            goto L60
        Lbb:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            h3.AbstractC1079a.f11334c = r4
            if (r1 == 0) goto Lc4
            return r0
        Lc4:
            return r3
        Lc5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.n.a(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
    }
}
