package a1;

import A3.K;
import A3.N;
import A3.e0;
import A3.j0;
import H0.C0129i;
import H0.C0137q;
import H0.J;
import H4.e1;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.libraries.barhopper.RecognitionOptions;
import m1.AbstractC1428b;
import m1.C1427a;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.utils.StringUtils;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final C0434k f6909a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f6910b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public v(C0437n c0437n, C0426c c0426c, Uri uri) {
        Object obj;
        char c8;
        String str;
        C0425b c0425b;
        int i7;
        j0 j0Var;
        Object obj2;
        int i8;
        boolean z7;
        int i9;
        j0 d7;
        char c9;
        int i10;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        int i11;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        int i12;
        boolean z27;
        j0 j0Var2 = c0426c.f6804i;
        K0.a.d("missing attribute control", j0Var2.containsKey("control"));
        C0137q c0137q = new C0137q();
        int i13 = c0426c.f6801e;
        if (i13 > 0) {
            c0137q.f1846g = i13;
        }
        C0425b c0425b2 = c0426c.j;
        String str2 = c0425b2.f6794b;
        String B7 = AbstractC1740d.B(str2);
        B7.getClass();
        switch (B7.hashCode()) {
            case -1922091719:
                obj = "audio/3gpp";
                if (B7.equals("MPEG4-GENERIC")) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case 2412:
                obj = "audio/3gpp";
                if (B7.equals("L8")) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case 64593:
                obj = "audio/3gpp";
                if (B7.equals("AC3")) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case 64934:
                obj = "audio/3gpp";
                if (B7.equals("AMR")) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case 74609:
                obj = "audio/3gpp";
                if (B7.equals("L16")) {
                    c8 = 4;
                    break;
                }
                c8 = 65535;
                break;
            case 85182:
                obj = "audio/3gpp";
                if (B7.equals("VP8")) {
                    c8 = 5;
                    break;
                }
                c8 = 65535;
                break;
            case 85183:
                obj = "audio/3gpp";
                if (B7.equals("VP9")) {
                    c8 = 6;
                    break;
                }
                c8 = 65535;
                break;
            case 2194728:
                obj = "audio/3gpp";
                if (B7.equals("H264")) {
                    c8 = 7;
                    break;
                }
                c8 = 65535;
                break;
            case 2194729:
                obj = "audio/3gpp";
                if (B7.equals("H265")) {
                    c8 = '\b';
                    break;
                }
                c8 = 65535;
                break;
            case 2433087:
                obj = "audio/3gpp";
                if (B7.equals("OPUS")) {
                    c8 = '\t';
                    break;
                }
                c8 = 65535;
                break;
            case 2450119:
                obj = "audio/3gpp";
                if (B7.equals("PCMA")) {
                    c8 = '\n';
                    break;
                }
                c8 = 65535;
                break;
            case 2450139:
                obj = "audio/3gpp";
                if (B7.equals("PCMU")) {
                    c8 = 11;
                    break;
                }
                c8 = 65535;
                break;
            case 1061166827:
                obj = "audio/3gpp";
                if (B7.equals("MP4A-LATM")) {
                    c8 = '\f';
                    break;
                }
                c8 = 65535;
                break;
            case 1934494802:
                obj = "audio/3gpp";
                if (B7.equals("AMR-WB")) {
                    c8 = '\r';
                    break;
                }
                c8 = 65535;
                break;
            case 1959269366:
                obj = "audio/3gpp";
                if (B7.equals("MP4V-ES")) {
                    c8 = 14;
                    break;
                }
                c8 = 65535;
                break;
            case 2137188397:
                obj = "audio/3gpp";
                if (B7.equals("H263-1998")) {
                    c8 = 15;
                    break;
                }
                c8 = 65535;
                break;
            case 2137209252:
                obj = "audio/3gpp";
                if (B7.equals("H263-2000")) {
                    c8 = 16;
                    break;
                }
                c8 = 65535;
                break;
            default:
                obj = "audio/3gpp";
                c8 = 65535;
                break;
        }
        switch (c8) {
            case 0:
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                str = "audio/mp4a-latm";
                break;
            case 1:
            case 4:
                str = "audio/raw";
                break;
            case 2:
                str = "audio/ac3";
                break;
            case 3:
                str = obj;
                break;
            case 5:
                str = "video/x-vnd.on2.vp8";
                break;
            case 6:
                str = "video/x-vnd.on2.vp9";
                break;
            case 7:
                str = "video/avc";
                break;
            case '\b':
                str = "video/hevc";
                break;
            case '\t':
                str = "audio/opus";
                break;
            case '\n':
                str = "audio/g711-alaw";
                break;
            case 11:
                str = "audio/g711-mlaw";
                break;
            case '\r':
                str = "audio/amr-wb";
                break;
            case 14:
                str = "video/mp4v-es";
                break;
            case 15:
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                str = "video/3gpp";
                break;
            default:
                throw new IllegalArgumentException(str2);
        }
        c0137q.g(str);
        boolean equals = "audio".equals(c0426c.f6797a);
        int i14 = c0425b2.f6795c;
        if (equals) {
            int i15 = c0425b2.f6796d;
            c0425b = c0425b2;
            if (i15 == -1) {
                if (str.equals("audio/ac3")) {
                    i15 = 6;
                } else {
                    i15 = 1;
                }
            }
            c0137q.f1832A = i14;
            c0137q.f1864z = i15;
            i7 = i15;
        } else {
            c0425b = c0425b2;
            i7 = -1;
        }
        String str3 = (String) j0Var2.get("fmtp");
        if (str3 == null) {
            d7 = j0.f157X;
            j0Var = j0Var2;
            obj2 = "MP4A-LATM";
            i9 = i7;
            i8 = i14;
        } else {
            int i16 = K0.x.f2529a;
            j0Var = j0Var2;
            obj2 = "MP4A-LATM";
            String[] split = str3.split(StringUtils.SPACE, 2);
            i8 = i14;
            if (split.length == 2) {
                z7 = true;
            } else {
                z7 = false;
            }
            K0.a.d(str3, z7);
            int i17 = 0;
            String[] split2 = split[1].split(";\\s?", 0);
            N n7 = new N(4, 0);
            int length = split2.length;
            while (i17 < length) {
                String[] strArr = split2;
                String[] split3 = split2[i17].split("=", 2);
                n7.m(split3[0], split3[1]);
                i17++;
                length = length;
                split2 = strArr;
                i7 = i7;
            }
            i9 = i7;
            d7 = n7.d();
        }
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c9 = 7;
                    break;
                }
                c9 = 65535;
                break;
            case -1606874997:
                if (str.equals("audio/amr-wb")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c9 = 11;
                    break;
                }
                c9 = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c9 = '\n';
                    break;
                }
                c9 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c9 = 6;
                    break;
                }
                c9 = 65535;
                break;
            case 1503095341:
                if (str.equals(obj)) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c9 = '\b';
                    break;
                }
                c9 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c9 = '\t';
                    break;
                }
                c9 = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c9 = '\f';
                    break;
                }
                c9 = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c9 = '\r';
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
                i10 = i8;
                int i18 = i9;
                if (i18 != -1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                K0.a.e(z8);
                K0.a.d("missing attribute fmtp", !d7.isEmpty());
                Object obj3 = obj2;
                if (str2.equals(obj3)) {
                    if (d7.containsKey("cpresent") && ((String) d7.get("cpresent")).equals("0")) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    K0.a.d("Only supports cpresent=0 in AAC audio.", z12);
                    String str4 = (String) d7.get("config");
                    if (str4 != null) {
                        if (str4.length() % 2 == 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        K0.a.d("Malformat MPEG4 config: ".concat(str4), z13);
                        byte[] t7 = K0.x.t(str4);
                        K0.p pVar = new K0.p(t7, t7.length);
                        z9 = true;
                        if (pVar.i(1) == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        K0.a.d("Only supports audio mux version 0.", z14);
                        if (pVar.i(1) == 1) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        K0.a.d("Only supports allStreamsSameTimeFraming.", z15);
                        pVar.t(6);
                        if (pVar.i(4) == 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        K0.a.d("Only supports one program.", z16);
                        if (pVar.i(3) == 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        K0.a.d("Only supports one numLayer.", z17);
                        z10 = false;
                        try {
                            C1427a q2 = AbstractC1428b.q(pVar, false);
                            c0137q.f1832A = q2.f13903b;
                            c0137q.f1864z = q2.f13904c;
                            c0137q.b(q2.f13902a);
                        } catch (J e7) {
                            throw new IllegalArgumentException(e7);
                        }
                    } else {
                        throw new NullPointerException("AAC audio stream must include config fmtp parameter");
                    }
                } else {
                    z9 = true;
                    z10 = false;
                }
                String str5 = (String) d7.get("profile-level-id");
                if (str5 == null && str2.equals(obj3)) {
                    str5 = "30";
                }
                if (str5 != null && !str5.isEmpty()) {
                    z11 = z9;
                } else {
                    z11 = z10;
                }
                K0.a.d("missing profile-level-id param", z11);
                c0137q.f1848i = "mp4a.40." + str5;
                c0137q.f1853o = K.u(AbstractC1428b.a(i10, i18));
                break;
            case 1:
            case 2:
                i10 = i8;
                if (i9 == 1) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                K0.a.d("Multi channel AMR is not currently supported.", z18);
                K0.a.d("fmtp parameters must include octet-align.", !d7.isEmpty());
                K0.a.d("Only octet aligned mode is currently supported.", d7.containsKey("octet-align"));
                K0.a.d("Interleaving mode is not currently supported.", !d7.containsKey("interleaving"));
                z9 = true;
                z10 = false;
                break;
            case 3:
                if (i9 != -1) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                K0.a.e(z19);
                i10 = i8;
                if (i10 == 48000) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                K0.a.d("Invalid OPUS clock rate.", z20);
                z9 = true;
                z10 = false;
                break;
            case 4:
                K0.a.e(!d7.isEmpty());
                String str6 = (String) d7.get("config");
                if (str6 != null) {
                    byte[] t8 = K0.x.t(str6);
                    c0137q.f1853o = K.u(t8);
                    K0.q qVar = new K0.q(t8);
                    int i19 = 0;
                    while (true) {
                        int i20 = i19 + 3;
                        if (i20 < t8.length) {
                            if (qVar.x() == 1 && (t8[i20] & 240) == 32) {
                                z21 = true;
                            } else {
                                qVar.G(qVar.f2514b - 2);
                                i19++;
                            }
                        } else {
                            z21 = false;
                        }
                    }
                    K0.a.d("Invalid input: VOL not found.", z21);
                    K0.p pVar2 = new K0.p(t8, t8.length);
                    pVar2.t((i19 + 4) * 8);
                    pVar2.t(1);
                    pVar2.t(8);
                    if (pVar2.h()) {
                        pVar2.t(4);
                        pVar2.t(3);
                    }
                    if (pVar2.i(4) == 15) {
                        pVar2.t(8);
                        pVar2.t(8);
                    }
                    if (pVar2.h()) {
                        i11 = 2;
                        pVar2.t(2);
                        pVar2.t(1);
                        if (pVar2.h()) {
                            pVar2.t(79);
                        }
                    } else {
                        i11 = 2;
                    }
                    if (pVar2.i(i11) == 0) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    K0.a.d("Only supports rectangular video object layer shape.", z22);
                    K0.a.e(pVar2.h());
                    int i21 = pVar2.i(16);
                    K0.a.e(pVar2.h());
                    if (pVar2.h()) {
                        if (i21 > 0) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        K0.a.e(z23);
                        int i22 = 0;
                        for (int i23 = i21 - 1; i23 > 0; i23 >>= 1) {
                            i22++;
                        }
                        pVar2.t(i22);
                    }
                    K0.a.e(pVar2.h());
                    int i24 = pVar2.i(13);
                    K0.a.e(pVar2.h());
                    int i25 = pVar2.i(13);
                    K0.a.e(pVar2.h());
                    pVar2.t(1);
                    Pair create = Pair.create(Integer.valueOf(i24), Integer.valueOf(i25));
                    c0137q.f1856r = ((Integer) create.first).intValue();
                    c0137q.f1857s = ((Integer) create.second).intValue();
                } else {
                    c0137q.f1856r = 352;
                    c0137q.f1857s = 288;
                }
                String str7 = (String) d7.get("profile-level-id");
                c0137q.f1848i = "mp4v.".concat(str7 == null ? "1" : str7);
                i10 = i8;
                z9 = true;
                z10 = false;
                break;
            case 5:
                c0137q.h(352);
                c0137q.d(288);
                i10 = i8;
                z9 = true;
                z10 = false;
                break;
            case 6:
                K0.a.d("missing attribute fmtp", !d7.isEmpty());
                K0.a.d("missing sprop parameter", d7.containsKey("sprop-parameter-sets"));
                String str8 = (String) d7.get("sprop-parameter-sets");
                K0.a.h(str8);
                String[] W7 = K0.x.W(str8, ",");
                if (W7.length == 2) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                K0.a.d("empty sprop value", z24);
                e0 v6 = K.v(a(W7[0]), a(W7[1]));
                c0137q.e(v6);
                byte[] bArr = (byte[]) v6.get(0);
                L0.f d8 = L0.g.d(bArr, 4, bArr.length);
                c0137q.f(d8.f2849g);
                c0137q.d(d8.f);
                c0137q.h(d8.f2848e);
                C0129i c0129i = new C0129i();
                c0129i.f(d8.f2857p);
                c0129i.e(d8.f2858q);
                c0129i.g(d8.f2859r);
                c0129i.h(d8.f2850h + 8);
                c0129i.d(d8.f2851i + 8);
                c0137q.c(c0129i.b());
                String str9 = (String) d7.get("profile-level-id");
                if (str9 != null) {
                    c0137q.b("avc1.".concat(str9));
                } else {
                    c0137q.b(K0.a.b(d8.f2844a, d8.f2845b, d8.f2846c));
                }
                i10 = i8;
                z9 = true;
                z10 = false;
                break;
            case 7:
                K0.a.d("missing attribute fmtp", !d7.isEmpty());
                if (d7.containsKey("sprop-max-don-diff")) {
                    String str10 = (String) d7.get("sprop-max-don-diff");
                    K0.a.h(str10);
                    int parseInt = Integer.parseInt(str10);
                    if (parseInt == 0) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    K0.a.d("non-zero sprop-max-don-diff " + parseInt + " is not supported", z25);
                }
                K0.a.d("missing sprop-vps parameter", d7.containsKey("sprop-vps"));
                String str11 = (String) d7.get("sprop-vps");
                K0.a.h(str11);
                K0.a.d("missing sprop-sps parameter", d7.containsKey("sprop-sps"));
                String str12 = (String) d7.get("sprop-sps");
                K0.a.h(str12);
                K0.a.d("missing sprop-pps parameter", d7.containsKey("sprop-pps"));
                String str13 = (String) d7.get("sprop-pps");
                K0.a.h(str13);
                e0 w2 = K.w(a(str11), a(str12), a(str13));
                c0137q.e(w2);
                byte[] bArr2 = (byte[]) w2.get(1);
                L0.d c10 = L0.g.c(bArr2, 4, bArr2.length);
                c0137q.f(c10.f2837k);
                c0137q.d(c10.j);
                c0137q.h(c10.f2836i);
                C0129i c0129i2 = new C0129i();
                c0129i2.f(c10.f2839m);
                c0129i2.e(c10.f2840n);
                c0129i2.g(c10.f2841o);
                c0129i2.h(c10.f2833e + 8);
                c0129i2.d(c10.f + 8);
                c0137q.c(c0129i2.b());
                c0137q.b(K0.a.c(c10.f2829a, c10.f2830b, c10.f2831c, c10.f2832d, c10.f2834g, c10.f2835h));
                i10 = i8;
                z9 = true;
                z10 = false;
                break;
            case '\b':
                c0137q.f1856r = 320;
                c0137q.f1857s = 240;
                i10 = i8;
                z9 = true;
                z10 = false;
                break;
            case '\t':
                c0137q.f1856r = 320;
                c0137q.f1857s = 240;
                i10 = i8;
                z9 = true;
                z10 = false;
                break;
            case '\n':
                if (!str2.equals("L8") && !str2.equals("L16")) {
                    z26 = false;
                } else {
                    z26 = true;
                }
                K0.a.e(z26);
                if (str2.equals("L8")) {
                    i12 = 3;
                } else {
                    i12 = 268435456;
                }
                c0137q.f1833B = i12;
                i10 = i8;
                z9 = true;
                z10 = false;
                break;
            default:
                i10 = i8;
                z9 = true;
                z10 = false;
                break;
        }
        if (i10 > 0) {
            z27 = z9;
        } else {
            z27 = z10;
        }
        K0.a.e(z27);
        this.f6909a = new C0434k(c0137q.a(), c0425b.f6793a, i10, d7, str2);
        String str14 = (String) j0Var.get("control");
        int i26 = K0.x.f2529a;
        Uri parse = Uri.parse(str14);
        if (!parse.isAbsolute()) {
            if (!TextUtils.isEmpty(c0437n.c("Content-Base"))) {
                parse = Uri.parse(c0437n.c("Content-Base"));
            } else if (!TextUtils.isEmpty(c0437n.c(HttpHeaders.CONTENT_LOCATION))) {
                parse = Uri.parse(c0437n.c(HttpHeaders.CONTENT_LOCATION));
            } else {
                parse = uri;
            }
            if (!str14.equals("*")) {
                parse = parse.buildUpon().appendEncodedPath(str14).build();
            }
        }
        this.f6910b = parse;
    }

    public static byte[] a(String str) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length + 4];
        System.arraycopy(L0.g.f2861a, 0, bArr, 0, 4);
        System.arraycopy(decode, 0, bArr, 4, decode.length);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f6909a.equals(vVar.f6909a) && this.f6910b.equals(vVar.f6910b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6910b.hashCode() + ((this.f6909a.hashCode() + 217) * 31);
    }
}
