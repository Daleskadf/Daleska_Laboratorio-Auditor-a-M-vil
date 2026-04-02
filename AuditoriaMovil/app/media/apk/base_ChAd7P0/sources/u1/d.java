package u1;

import A3.H;
import A3.K;
import A3.e0;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f15971a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f15972b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f15973c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r8 == (-1)) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static J2.e a(java.lang.String r20) {
        /*
            r0 = 1
            org.xmlpull.v1.XmlPullParserFactory r1 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r1 = r1.newPullParser()
            java.io.StringReader r2 = new java.io.StringReader
            r3 = r20
            r2.<init>(r3)
            r1.setInput(r2)
            r1.next()
            java.lang.String r2 = "x:xmpmeta"
            boolean r3 = K0.a.u(r1, r2)
            r4 = 0
            if (r3 == 0) goto Ld1
            A3.I r3 = A3.K.f98b
            A3.e0 r3 = A3.e0.f138e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r5
        L29:
            r1.next()
            java.lang.String r9 = "rdf:Description"
            boolean r9 = K0.a.u(r1, r9)
            if (r9 == 0) goto L9b
            java.lang.String[] r3 = u1.d.f15971a
            r7 = 0
            r8 = r7
        L38:
            r9 = 4
            if (r8 >= r9) goto L9a
            r10 = r3[r8]
            java.lang.String r10 = K0.a.p(r1, r10)
            if (r10 == 0) goto L98
            int r3 = java.lang.Integer.parseInt(r10)
            if (r3 != r0) goto L9a
            java.lang.String[] r3 = u1.d.f15972b
            r8 = r7
        L4c:
            if (r8 >= r9) goto L63
            r10 = r3[r8]
            java.lang.String r10 = K0.a.p(r1, r10)
            if (r10 == 0) goto L61
            long r8 = java.lang.Long.parseLong(r10)
            r10 = -1
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 != 0) goto L64
            goto L63
        L61:
            int r8 = r8 + r0
            goto L4c
        L63:
            r8 = r5
        L64:
            java.lang.String[] r3 = u1.d.f15973c
        L66:
            r10 = 2
            if (r7 >= r10) goto L92
            r10 = r3[r7]
            java.lang.String r10 = K0.a.p(r1, r10)
            if (r10 == 0) goto L90
            long r12 = java.lang.Long.parseLong(r10)
            u1.b r3 = new u1.b
            r15 = 0
            r17 = 0
            java.lang.String r19 = "image/jpeg"
            r14 = r3
            r14.<init>(r15, r17, r19)
            u1.b r7 = new u1.b
            r14 = 0
            java.lang.String r16 = "video/mp4"
            r11 = r7
            r11.<init>(r12, r14, r16)
            A3.e0 r3 = A3.K.v(r3, r7)
            goto L96
        L90:
            int r7 = r7 + r0
            goto L66
        L92:
            A3.I r3 = A3.K.f98b
            A3.e0 r3 = A3.e0.f138e
        L96:
            r7 = r8
            goto Lbc
        L98:
            int r8 = r8 + r0
            goto L38
        L9a:
            return r4
        L9b:
            java.lang.String r9 = "Container:Directory"
            boolean r9 = K0.a.u(r1, r9)
            if (r9 == 0) goto Lac
            java.lang.String r3 = "Container"
            java.lang.String r9 = "Item"
            A3.e0 r3 = b(r1, r3, r9)
            goto Lbc
        Lac:
            java.lang.String r9 = "GContainer:Directory"
            boolean r9 = K0.a.u(r1, r9)
            if (r9 == 0) goto Lbc
            java.lang.String r3 = "GContainer"
            java.lang.String r9 = "GContainerItem"
            A3.e0 r3 = b(r1, r3, r9)
        Lbc:
            boolean r9 = K0.a.s(r1, r2)
            if (r9 == 0) goto L29
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lc9
            return r4
        Lc9:
            J2.e r0 = new J2.e
            r1 = 8
            r0.<init>(r7, r3, r1)
            return r0
        Ld1:
            java.lang.String r0 = "Couldn't find xmp metadata"
            H0.J r0 = H0.J.a(r4, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.d.a(java.lang.String):J2.e");
    }

    public static e0 b(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j8;
        H o7 = K.o();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (K0.a.u(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String p7 = K0.a.p(xmlPullParser, concat3);
                String p8 = K0.a.p(xmlPullParser, concat4);
                String p9 = K0.a.p(xmlPullParser, concat5);
                String p10 = K0.a.p(xmlPullParser, concat6);
                if (p7 != null && p8 != null) {
                    if (p9 != null) {
                        j = Long.parseLong(p9);
                    } else {
                        j = 0;
                    }
                    if (p10 != null) {
                        j8 = Long.parseLong(p10);
                    } else {
                        j8 = 0;
                    }
                    o7.a(new b(j, j8, p7));
                } else {
                    return e0.f138e;
                }
            }
        } while (!K0.a.s(xmlPullParser, concat2));
        return o7.g();
    }
}
