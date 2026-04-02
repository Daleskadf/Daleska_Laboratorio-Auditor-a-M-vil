package V0;

import A3.AbstractC0021t;
import A3.K;
import G1.t;
import H0.AbstractC0128h;
import H0.C0134n;
import H0.C0135o;
import H0.J;
import K0.x;
import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class o implements i1.p {

    /* renamed from: a  reason: collision with root package name */
    public final l f5927a;

    /* renamed from: b  reason: collision with root package name */
    public final i f5928b;

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f5903c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f5904d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f5905e = Pattern.compile("AUDIO=\"(.+?)\"");
    public static final Pattern f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: X  reason: collision with root package name */
    public static final Pattern f5900X = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: Y  reason: collision with root package name */
    public static final Pattern f5901Y = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: Z  reason: collision with root package name */
    public static final Pattern f5902Z = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: e0  reason: collision with root package name */
    public static final Pattern f5906e0 = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: f0  reason: collision with root package name */
    public static final Pattern f5907f0 = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: g0  reason: collision with root package name */
    public static final Pattern f5908g0 = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: h0  reason: collision with root package name */
    public static final Pattern f5909h0 = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: i0  reason: collision with root package name */
    public static final Pattern f5910i0 = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: j0  reason: collision with root package name */
    public static final Pattern f5911j0 = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: k0  reason: collision with root package name */
    public static final Pattern f5912k0 = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: l0  reason: collision with root package name */
    public static final Pattern f5913l0 = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: m0  reason: collision with root package name */
    public static final Pattern f5914m0 = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: n0  reason: collision with root package name */
    public static final Pattern f5915n0 = a("CAN-SKIP-DATERANGES");

    /* renamed from: o0  reason: collision with root package name */
    public static final Pattern f5916o0 = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: p0  reason: collision with root package name */
    public static final Pattern f5917p0 = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern q0 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: r0  reason: collision with root package name */
    public static final Pattern f5918r0 = a("CAN-BLOCK-RELOAD");

    /* renamed from: s0  reason: collision with root package name */
    public static final Pattern f5919s0 = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: t0  reason: collision with root package name */
    public static final Pattern f5920t0 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: u0  reason: collision with root package name */
    public static final Pattern f5921u0 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: v0  reason: collision with root package name */
    public static final Pattern f5922v0 = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: w0  reason: collision with root package name */
    public static final Pattern f5923w0 = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: x0  reason: collision with root package name */
    public static final Pattern f5924x0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: y0  reason: collision with root package name */
    public static final Pattern f5925y0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: z0  reason: collision with root package name */
    public static final Pattern f5926z0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: A0  reason: collision with root package name */
    public static final Pattern f5877A0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: B0  reason: collision with root package name */
    public static final Pattern f5878B0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: C0  reason: collision with root package name */
    public static final Pattern f5879C0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: D0  reason: collision with root package name */
    public static final Pattern f5880D0 = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: E0  reason: collision with root package name */
    public static final Pattern f5881E0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: F0  reason: collision with root package name */
    public static final Pattern f5882F0 = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: G0  reason: collision with root package name */
    public static final Pattern f5883G0 = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: H0  reason: collision with root package name */
    public static final Pattern f5884H0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: I0  reason: collision with root package name */
    public static final Pattern f5885I0 = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: J0  reason: collision with root package name */
    public static final Pattern f5886J0 = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: K0  reason: collision with root package name */
    public static final Pattern f5887K0 = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: L0  reason: collision with root package name */
    public static final Pattern f5888L0 = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: M0  reason: collision with root package name */
    public static final Pattern f5889M0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: N0  reason: collision with root package name */
    public static final Pattern f5890N0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: O0  reason: collision with root package name */
    public static final Pattern f5891O0 = a("AUTOSELECT");

    /* renamed from: P0  reason: collision with root package name */
    public static final Pattern f5892P0 = a("DEFAULT");

    /* renamed from: Q0  reason: collision with root package name */
    public static final Pattern f5893Q0 = a("FORCED");

    /* renamed from: R0  reason: collision with root package name */
    public static final Pattern f5894R0 = a("INDEPENDENT");

    /* renamed from: S0  reason: collision with root package name */
    public static final Pattern f5895S0 = a("GAP");

    /* renamed from: T0  reason: collision with root package name */
    public static final Pattern f5896T0 = a("PRECISE");

    /* renamed from: U0  reason: collision with root package name */
    public static final Pattern f5897U0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: V0  reason: collision with root package name */
    public static final Pattern f5898V0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: W0  reason: collision with root package name */
    public static final Pattern f5899W0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public o(l lVar, i iVar) {
        this.f5927a = lVar;
        this.f5928b = iVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static C0135o b(String str, C0134n[] c0134nArr) {
        C0134n[] c0134nArr2 = new C0134n[c0134nArr.length];
        for (int i7 = 0; i7 < c0134nArr.length; i7++) {
            C0134n c0134n = c0134nArr[i7];
            c0134nArr2[i7] = new C0134n(c0134n.f1823b, c0134n.f1824c, c0134n.f1825d, null);
        }
        return new C0135o(str, true, c0134nArr2);
    }

    public static C0134n c(String str, String str2, HashMap hashMap) {
        String i7 = i(str, f5881E0, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f5882F0;
        if (equals) {
            String k2 = k(str, pattern, hashMap);
            return new C0134n(AbstractC0128h.f1803d, null, "video/mp4", Base64.decode(k2.substring(k2.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            UUID uuid = AbstractC0128h.f1803d;
            int i8 = x.f2529a;
            return new C0134n(uuid, null, "hls", str.getBytes(z3.h.f16886c));
        } else if (!"com.microsoft.playready".equals(str2) || !"1".equals(i7)) {
            return null;
        } else {
            String k8 = k(str, pattern, hashMap);
            byte[] decode = Base64.decode(k8.substring(k8.indexOf(44)), 0);
            UUID uuid2 = AbstractC0128h.f1804e;
            return new C0134n(uuid2, null, "video/mp4", t.a(uuid2, null, decode));
        }
    }

    public static i d(l lVar, i iVar, R1.j jVar, String str) {
        boolean z7;
        int i7;
        List list;
        String str2;
        long j;
        long j8;
        long j9;
        HashMap hashMap;
        HashMap hashMap2;
        d dVar;
        ArrayList arrayList;
        String str3;
        boolean z8;
        d dVar2;
        int i8;
        String str4;
        HashMap hashMap3;
        String str5;
        int i9;
        String hexString;
        long j10;
        String hexString2;
        boolean z9;
        long j11;
        String hexString3;
        long j12;
        HashMap hashMap4;
        f fVar;
        C0135o c0135o;
        f fVar2;
        l lVar2 = lVar;
        i iVar2 = iVar;
        boolean z10 = lVar2.f5876c;
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        h hVar = new h(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str6 = StringUtils.EMPTY;
        boolean z11 = z10;
        h hVar2 = hVar;
        String str7 = StringUtils.EMPTY;
        long j13 = -1;
        int i10 = 0;
        boolean z12 = false;
        long j14 = -9223372036854775807L;
        long j15 = 0;
        boolean z13 = false;
        int i11 = 0;
        long j16 = 0;
        int i12 = 1;
        long j17 = -9223372036854775807L;
        long j18 = -9223372036854775807L;
        boolean z14 = false;
        C0135o c0135o2 = null;
        long j19 = 0;
        C0135o c0135o3 = null;
        long j20 = 0;
        long j21 = 0;
        boolean z15 = false;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        int i13 = 0;
        long j22 = 0;
        boolean z16 = false;
        f fVar3 = null;
        long j23 = 0;
        long j24 = 0;
        ArrayList arrayList6 = arrayList3;
        d dVar3 = null;
        while (jVar.C0()) {
            String I02 = jVar.I0();
            if (I02.startsWith("#EXT")) {
                arrayList5.add(I02);
            }
            if (I02.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String k2 = k(I02, f5913l0, hashMap5);
                if ("VOD".equals(k2)) {
                    i10 = 1;
                } else if ("EVENT".equals(k2)) {
                    i10 = 2;
                }
            } else if (I02.equals("#EXT-X-I-FRAMES-ONLY")) {
                z16 = true;
            } else {
                if (I02.startsWith("#EXT-X-START")) {
                    Map emptyMap = Collections.emptyMap();
                    str2 = str6;
                    z12 = f(I02, f5896T0);
                    j14 = (long) (Double.parseDouble(k(I02, f5924x0, emptyMap)) * 1000000.0d);
                } else {
                    str2 = str6;
                    if (I02.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double g3 = g(I02, f5914m0);
                        if (g3 == -9.223372036854776E18d) {
                            j = -9223372036854775807L;
                        } else {
                            j = (long) (g3 * 1000000.0d);
                        }
                        boolean f4 = f(I02, f5915n0);
                        double g4 = g(I02, f5917p0);
                        if (g4 == -9.223372036854776E18d) {
                            j8 = -9223372036854775807L;
                        } else {
                            j8 = (long) (g4 * 1000000.0d);
                        }
                        double g8 = g(I02, q0);
                        if (g8 == -9.223372036854776E18d) {
                            j9 = -9223372036854775807L;
                        } else {
                            j9 = (long) (g8 * 1000000.0d);
                        }
                        hVar2 = new h(j, f4, j8, j9, f(I02, f5918r0));
                    } else if (I02.startsWith("#EXT-X-PART-INF")) {
                        j18 = (long) (Double.parseDouble(k(I02, f5911j0, Collections.emptyMap())) * 1000000.0d);
                    } else {
                        boolean startsWith = I02.startsWith("#EXT-X-MAP");
                        Pattern pattern = f5926z0;
                        boolean z17 = z12;
                        Pattern pattern2 = f5882F0;
                        if (startsWith) {
                            String k8 = k(I02, pattern2, hashMap5);
                            String i14 = i(I02, pattern, null, hashMap5);
                            if (i14 != null) {
                                int i15 = x.f2529a;
                                String[] split = i14.split("@", -1);
                                j13 = Long.parseLong(split[0]);
                                if (split.length > 1) {
                                    j19 = Long.parseLong(split[1]);
                                }
                            }
                            int i16 = (j13 > (-1L) ? 1 : (j13 == (-1L) ? 0 : -1));
                            if (i16 == 0) {
                                j19 = 0;
                            }
                            if (str8 != null && str9 == null) {
                                throw J.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            fVar3 = new f(k8, j19, j13, str8, str9);
                            if (i16 != 0) {
                                j19 += j13;
                            }
                            j13 = -1;
                            str6 = str2;
                            z12 = z17;
                        } else {
                            ArrayList arrayList7 = arrayList6;
                            ArrayList arrayList8 = arrayList5;
                            if (I02.startsWith("#EXT-X-TARGETDURATION")) {
                                j17 = Integer.parseInt(k(I02, f5909h0, Collections.emptyMap())) * 1000000;
                            } else if (I02.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j20 = Long.parseLong(k(I02, f5919s0, Collections.emptyMap()));
                                j16 = j20;
                            } else if (I02.startsWith("#EXT-X-VERSION")) {
                                i12 = Integer.parseInt(k(I02, f5912k0, Collections.emptyMap()));
                            } else {
                                if (I02.startsWith("#EXT-X-DEFINE")) {
                                    String i17 = i(I02, f5898V0, null, hashMap5);
                                    if (i17 != null) {
                                        String str11 = (String) lVar2.f5872l.get(i17);
                                        if (str11 != null) {
                                            hashMap5.put(i17, str11);
                                        }
                                    } else {
                                        hashMap5.put(k(I02, f5887K0, hashMap5), k(I02, f5897U0, hashMap5));
                                    }
                                    hashMap = hashMap5;
                                    hashMap2 = hashMap6;
                                    dVar = dVar3;
                                    arrayList = arrayList7;
                                    str3 = str10;
                                } else if (I02.startsWith("#EXTINF")) {
                                    j23 = new BigDecimal(k(I02, f5920t0, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
                                    str7 = i(I02, f5921u0, str2, hashMap5);
                                    str6 = str2;
                                    arrayList6 = arrayList7;
                                    z12 = z17;
                                    arrayList5 = arrayList8;
                                } else {
                                    String str12 = str2;
                                    if (I02.startsWith("#EXT-X-SKIP")) {
                                        int parseInt = Integer.parseInt(k(I02, f5916o0, Collections.emptyMap()));
                                        if (iVar2 != null && arrayList2.isEmpty()) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        K0.a.j(z8);
                                        int i18 = x.f2529a;
                                        int i19 = (int) (j16 - iVar2.f5845k);
                                        int i20 = parseInt + i19;
                                        if (i19 >= 0) {
                                            K k9 = iVar2.f5852r;
                                            if (i20 <= k9.size()) {
                                                while (i19 < i20) {
                                                    f fVar4 = (f) k9.get(i19);
                                                    if (j16 != iVar2.f5845k) {
                                                        int i21 = (iVar2.j - i11) + fVar4.f5831d;
                                                        ArrayList arrayList9 = new ArrayList();
                                                        long j25 = j22;
                                                        int i22 = 0;
                                                        while (true) {
                                                            K k10 = fVar4.f5824h0;
                                                            i8 = i20;
                                                            if (i22 >= k10.size()) {
                                                                break;
                                                            }
                                                            d dVar4 = (d) k10.get(i22);
                                                            String str13 = str12;
                                                            long j26 = j25;
                                                            arrayList9.add(new d(dVar4.f5828a, dVar4.f5829b, dVar4.f5830c, i21, j26, dVar4.f, dVar4.f5825X, dVar4.f5826Y, dVar4.f5827Z, dVar4.f5833e0, dVar4.f5834f0, dVar4.f5818g0, dVar4.f5819h0));
                                                            j25 += dVar4.f5830c;
                                                            i22++;
                                                            hashMap6 = hashMap6;
                                                            i20 = i8;
                                                            str12 = str13;
                                                            dVar3 = dVar3;
                                                        }
                                                        dVar2 = dVar3;
                                                        str4 = str12;
                                                        hashMap3 = hashMap6;
                                                        fVar4 = new f(fVar4.f5828a, fVar4.f5829b, fVar4.f5823g0, fVar4.f5830c, i21, j22, fVar4.f, fVar4.f5825X, fVar4.f5826Y, fVar4.f5827Z, fVar4.f5833e0, fVar4.f5834f0, arrayList9);
                                                    } else {
                                                        dVar2 = dVar3;
                                                        i8 = i20;
                                                        str4 = str12;
                                                        hashMap3 = hashMap6;
                                                    }
                                                    arrayList2.add(fVar4);
                                                    j22 += fVar4.f5830c;
                                                    long j27 = fVar4.f5833e0;
                                                    if (j27 != -1) {
                                                        j19 = fVar4.f5827Z + j27;
                                                    }
                                                    String str14 = fVar4.f5826Y;
                                                    if (str14 == null || !str14.equals(Long.toHexString(j20))) {
                                                        str9 = str14;
                                                    }
                                                    j20++;
                                                    i19++;
                                                    int i23 = fVar4.f5831d;
                                                    i13 = i23;
                                                    fVar3 = fVar4.f5829b;
                                                    c0135o3 = fVar4.f;
                                                    str8 = fVar4.f5825X;
                                                    hashMap6 = hashMap3;
                                                    i20 = i8;
                                                    j21 = j22;
                                                    str12 = str4;
                                                    dVar3 = dVar2;
                                                    iVar2 = iVar;
                                                }
                                                str2 = str12;
                                                lVar2 = lVar;
                                                iVar2 = iVar;
                                            }
                                        }
                                        throw new IOException();
                                    }
                                    dVar = dVar3;
                                    str2 = str12;
                                    hashMap2 = hashMap6;
                                    if (I02.startsWith("#EXT-X-KEY")) {
                                        String k11 = k(I02, f5879C0, hashMap5);
                                        String i24 = i(I02, f5880D0, "identity", hashMap5);
                                        if ("NONE".equals(k11)) {
                                            treeMap.clear();
                                            c0135o3 = null;
                                            str8 = null;
                                            str9 = null;
                                        } else {
                                            String i25 = i(I02, f5883G0, null, hashMap5);
                                            if ("identity".equals(i24)) {
                                                if ("AES-128".equals(k11)) {
                                                    str8 = k(I02, pattern2, hashMap5);
                                                    str9 = i25;
                                                }
                                            } else {
                                                String str15 = str10;
                                                if (str15 == null) {
                                                    if (!"SAMPLE-AES-CENC".equals(k11) && !"SAMPLE-AES-CTR".equals(k11)) {
                                                        str5 = "cbcs";
                                                    } else {
                                                        str5 = "cenc";
                                                    }
                                                    str10 = str5;
                                                } else {
                                                    str10 = str15;
                                                }
                                                C0134n c8 = c(I02, i24, hashMap5);
                                                if (c8 != null) {
                                                    treeMap.put(i24, c8);
                                                    str9 = i25;
                                                    c0135o3 = null;
                                                    str8 = null;
                                                }
                                            }
                                            str9 = i25;
                                            str8 = null;
                                        }
                                        lVar2 = lVar;
                                        iVar2 = iVar;
                                        hashMap6 = hashMap2;
                                    } else {
                                        str3 = str10;
                                        if (I02.startsWith("#EXT-X-BYTERANGE")) {
                                            String k12 = k(I02, f5925y0, hashMap5);
                                            int i26 = x.f2529a;
                                            String[] split2 = k12.split("@", -1);
                                            j13 = Long.parseLong(split2[0]);
                                            if (split2.length > 1) {
                                                j19 = Long.parseLong(split2[1]);
                                            }
                                        } else if (I02.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i11 = Integer.parseInt(I02.substring(I02.indexOf(58) + 1));
                                            lVar2 = lVar;
                                            iVar2 = iVar;
                                            z13 = true;
                                            hashMap6 = hashMap2;
                                            str10 = str3;
                                        } else if (I02.equals("#EXT-X-DISCONTINUITY")) {
                                            i13++;
                                        } else if (I02.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (j15 == 0) {
                                                j15 = x.M(x.P(I02.substring(I02.indexOf(58) + 1))) - j22;
                                            } else {
                                                hashMap = hashMap5;
                                                arrayList = arrayList7;
                                            }
                                        } else if (I02.equals("#EXT-X-GAP")) {
                                            lVar2 = lVar;
                                            iVar2 = iVar;
                                            hashMap6 = hashMap2;
                                            str10 = str3;
                                            arrayList6 = arrayList7;
                                            str6 = str2;
                                            z12 = z17;
                                            arrayList5 = arrayList8;
                                            dVar3 = dVar;
                                            z15 = true;
                                        } else if (I02.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                            lVar2 = lVar;
                                            iVar2 = iVar;
                                            hashMap6 = hashMap2;
                                            str10 = str3;
                                            arrayList6 = arrayList7;
                                            str6 = str2;
                                            z12 = z17;
                                            arrayList5 = arrayList8;
                                            dVar3 = dVar;
                                            z11 = true;
                                        } else if (I02.equals("#EXT-X-ENDLIST")) {
                                            lVar2 = lVar;
                                            iVar2 = iVar;
                                            hashMap6 = hashMap2;
                                            str10 = str3;
                                            arrayList6 = arrayList7;
                                            str6 = str2;
                                            z12 = z17;
                                            arrayList5 = arrayList8;
                                            dVar3 = dVar;
                                            z14 = true;
                                        } else {
                                            if (I02.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long h8 = h(I02, f5922v0);
                                                Matcher matcher = f5923w0.matcher(I02);
                                                if (matcher.find()) {
                                                    String group = matcher.group(1);
                                                    group.getClass();
                                                    i9 = Integer.parseInt(group);
                                                } else {
                                                    i9 = -1;
                                                }
                                                arrayList4.add(new e(i9, h8, Uri.parse(K0.a.x(str, k(I02, pattern2, hashMap5)))));
                                            } else if (I02.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                if (dVar == null && "PART".equals(k(I02, f5885I0, hashMap5))) {
                                                    String k13 = k(I02, pattern2, hashMap5);
                                                    long h9 = h(I02, f5877A0);
                                                    long h10 = h(I02, f5878B0);
                                                    if (str8 == null) {
                                                        hexString = null;
                                                    } else if (str9 != null) {
                                                        hexString = str9;
                                                    } else {
                                                        hexString = Long.toHexString(j20);
                                                    }
                                                    if (c0135o3 == null && !treeMap.isEmpty()) {
                                                        C0134n[] c0134nArr = (C0134n[]) treeMap.values().toArray(new C0134n[0]);
                                                        C0135o c0135o4 = new C0135o(str3, true, c0134nArr);
                                                        if (c0135o2 == null) {
                                                            c0135o2 = b(str3, c0134nArr);
                                                        }
                                                        c0135o3 = c0135o4;
                                                    }
                                                    int i27 = (h9 > (-1L) ? 1 : (h9 == (-1L) ? 0 : -1));
                                                    if (i27 == 0 || h10 != -1) {
                                                        if (i27 != 0) {
                                                            j10 = h9;
                                                        } else {
                                                            j10 = 0;
                                                        }
                                                        dVar = new d(k13, fVar3, 0L, i13, j21, c0135o3, str8, hexString, j10, h10, false, false, true);
                                                    }
                                                }
                                            } else if (I02.startsWith("#EXT-X-PART")) {
                                                if (str8 == null) {
                                                    hexString2 = null;
                                                } else if (str9 != null) {
                                                    hexString2 = str9;
                                                } else {
                                                    hexString2 = Long.toHexString(j20);
                                                }
                                                String k14 = k(I02, pattern2, hashMap5);
                                                long parseDouble = (long) (Double.parseDouble(k(I02, f5910i0, Collections.emptyMap())) * 1000000.0d);
                                                boolean f8 = f(I02, f5894R0);
                                                if (z11 && arrayList7.isEmpty()) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                boolean z18 = f8 | z9;
                                                boolean f9 = f(I02, f5895S0);
                                                String i28 = i(I02, pattern, null, hashMap5);
                                                if (i28 != null) {
                                                    int i29 = x.f2529a;
                                                    String[] split3 = i28.split("@", -1);
                                                    j11 = Long.parseLong(split3[0]);
                                                    if (split3.length > 1) {
                                                        j24 = Long.parseLong(split3[1]);
                                                    }
                                                } else {
                                                    j11 = -1;
                                                }
                                                int i30 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
                                                if (i30 == 0) {
                                                    j24 = 0;
                                                }
                                                if (c0135o3 == null && !treeMap.isEmpty()) {
                                                    C0134n[] c0134nArr2 = (C0134n[]) treeMap.values().toArray(new C0134n[0]);
                                                    C0135o c0135o5 = new C0135o(str3, true, c0134nArr2);
                                                    if (c0135o2 == null) {
                                                        c0135o2 = b(str3, c0134nArr2);
                                                    }
                                                    c0135o3 = c0135o5;
                                                }
                                                arrayList7.add(new d(k14, fVar3, parseDouble, i13, j21, c0135o3, str8, hexString2, j24, j11, f9, z18, false));
                                                j21 += parseDouble;
                                                if (i30 != 0) {
                                                    j24 += j11;
                                                }
                                                lVar2 = lVar;
                                                iVar2 = iVar;
                                                hashMap6 = hashMap2;
                                                str10 = str3;
                                                arrayList6 = arrayList7;
                                                str6 = str2;
                                                z12 = z17;
                                                arrayList5 = arrayList8;
                                                dVar3 = dVar;
                                            } else {
                                                arrayList = arrayList7;
                                                if (!I02.startsWith("#")) {
                                                    if (str8 == null) {
                                                        hexString3 = null;
                                                    } else if (str9 != null) {
                                                        hexString3 = str9;
                                                    } else {
                                                        hexString3 = Long.toHexString(j20);
                                                    }
                                                    long j28 = j20 + 1;
                                                    String l8 = l(I02, hashMap5);
                                                    f fVar5 = (f) hashMap2.get(l8);
                                                    int i31 = (j13 > (-1L) ? 1 : (j13 == (-1L) ? 0 : -1));
                                                    if (i31 == 0) {
                                                        j12 = 0;
                                                    } else {
                                                        if (z16 && fVar3 == null && fVar5 == null) {
                                                            fVar5 = new f(l8, 0L, j19, null, null);
                                                            hashMap2.put(l8, fVar5);
                                                        }
                                                        j12 = j19;
                                                    }
                                                    if (c0135o3 == null && !treeMap.isEmpty()) {
                                                        hashMap4 = hashMap5;
                                                        fVar = fVar5;
                                                        C0134n[] c0134nArr3 = (C0134n[]) treeMap.values().toArray(new C0134n[0]);
                                                        c0135o = new C0135o(str3, true, c0134nArr3);
                                                        if (c0135o2 == null) {
                                                            c0135o2 = b(str3, c0134nArr3);
                                                        }
                                                    } else {
                                                        hashMap4 = hashMap5;
                                                        fVar = fVar5;
                                                        c0135o = c0135o3;
                                                    }
                                                    if (fVar3 != null) {
                                                        fVar2 = fVar3;
                                                    } else {
                                                        fVar2 = fVar;
                                                    }
                                                    arrayList2.add(new f(l8, fVar2, str7, j23, i13, j22, c0135o, str8, hexString3, j12, j13, z15, arrayList));
                                                    j21 = j22 + j23;
                                                    ArrayList arrayList10 = new ArrayList();
                                                    if (i31 != 0) {
                                                        j12 += j13;
                                                    }
                                                    j19 = j12;
                                                    iVar2 = iVar;
                                                    arrayList6 = arrayList10;
                                                    hashMap6 = hashMap2;
                                                    str10 = str3;
                                                    c0135o3 = c0135o;
                                                    j13 = -1;
                                                    j22 = j21;
                                                    j20 = j28;
                                                    hashMap5 = hashMap4;
                                                    str6 = str2;
                                                    str7 = str6;
                                                    z12 = z17;
                                                    arrayList5 = arrayList8;
                                                    dVar3 = dVar;
                                                    z15 = false;
                                                    j23 = 0;
                                                    lVar2 = lVar;
                                                } else {
                                                    hashMap = hashMap5;
                                                }
                                            }
                                            hashMap = hashMap5;
                                            arrayList = arrayList7;
                                        }
                                        lVar2 = lVar;
                                        iVar2 = iVar;
                                        hashMap6 = hashMap2;
                                        str10 = str3;
                                    }
                                    arrayList6 = arrayList7;
                                    str6 = str2;
                                    z12 = z17;
                                    arrayList5 = arrayList8;
                                    dVar3 = dVar;
                                }
                                lVar2 = lVar;
                                iVar2 = iVar;
                                hashMap6 = hashMap2;
                                str10 = str3;
                                arrayList6 = arrayList;
                                hashMap5 = hashMap;
                                str6 = str2;
                                z12 = z17;
                                arrayList5 = arrayList8;
                                dVar3 = dVar;
                            }
                            arrayList6 = arrayList7;
                            str6 = str2;
                            z12 = z17;
                            arrayList5 = arrayList8;
                        }
                    }
                }
                str6 = str2;
            }
        }
        d dVar5 = dVar3;
        ArrayList arrayList11 = arrayList6;
        ArrayList arrayList12 = arrayList5;
        boolean z19 = z12;
        HashMap hashMap7 = new HashMap();
        int i32 = 0;
        while (i32 < arrayList4.size()) {
            e eVar = (e) arrayList4.get(i32);
            long j29 = eVar.f5821b;
            if (j29 == -1) {
                j29 = (j16 + arrayList2.size()) - (arrayList11.isEmpty() ? 1L : 0L);
            }
            int i33 = eVar.f5822c;
            if (i33 == -1 && j18 != -9223372036854775807L) {
                if (arrayList11.isEmpty()) {
                    list = ((f) AbstractC0021t.l(arrayList2)).f5824h0;
                } else {
                    list = arrayList11;
                }
                i7 = 1;
                i33 = list.size() - 1;
            } else {
                i7 = 1;
            }
            Uri uri = eVar.f5820a;
            hashMap7.put(uri, new e(i33, j29, uri));
            i32 += i7;
        }
        if (dVar5 != null) {
            arrayList11.add(dVar5);
        }
        if (j15 != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        return new i(i10, str, arrayList12, j14, z19, j15, z13, i11, j16, i12, j17, j18, z11, z14, z7, c0135o2, arrayList2, arrayList11, hVar2, hashMap7);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x015f, code lost:
        if (r9 > 0) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static V0.l e(R1.j r38, java.lang.String r39) {
        /*
            Method dump skipped, instructions count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.o.e(R1.j, java.lang.String):V0.l");
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            return Double.parseDouble(group);
        }
        return -9.223372036854776E18d;
    }

    public static long h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            return Long.parseLong(group);
        }
        return -1L;
    }

    public static String i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        if (!map.isEmpty() && str2 != null) {
            return l(str2, map);
        }
        return str2;
    }

    public static String k(String str, Pattern pattern, Map map) {
        String i7 = i(str, pattern, null, map);
        if (i7 != null) {
            return i7;
        }
        throw J.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String l(String str, Map map) {
        Matcher matcher = f5899W0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0069 A[Catch: all -> 0x0096, LOOP:0: B:32:0x0069->B:83:0x0069, LOOP_START, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:43:0x0098, B:45:0x00a0, B:47:0x00a8, B:49:0x00b0, B:51:0x00b8, B:53:0x00c0, B:55:0x00c8, B:57:0x00d0, B:60:0x00d9, B:61:0x00dd, B:66:0x00fd, B:67:0x0103, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:70:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd A[Catch: all -> 0x0096, TRY_ENTER, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:43:0x0098, B:45:0x00a0, B:47:0x00a8, B:49:0x00b0, B:51:0x00b8, B:53:0x00c0, B:55:0x00c8, B:57:0x00d0, B:60:0x00d9, B:61:0x00dd, B:66:0x00fd, B:67:0x0103, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:70:0x000f }] */
    @Override // i1.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(android.net.Uri r7, M0.j r8) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.o.j(android.net.Uri, M0.j):java.lang.Object");
    }
}
