package S0;

import A3.AbstractC0021t;
import H0.J;
import H4.e1;
import K0.x;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class e extends DefaultHandler implements i1.p {

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f4866b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f4867c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f4868d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f4869e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a  reason: collision with root package name */
    public final XmlPullParserFactory f4870a;

    public e() {
        try {
            this.f4870a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    public static long a(ArrayList arrayList, long j, long j8, int i7, long j9) {
        int i8;
        if (i7 >= 0) {
            i8 = i7 + 1;
        } else {
            int i9 = x.f2529a;
            i8 = (int) ((((j9 - j) + j8) - 1) / j8);
        }
        for (int i10 = 0; i10 < i8; i10++) {
            arrayList.add(new q(j, j8));
            j += j8;
        }
        return j;
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (!K0.a.t(xmlPullParser)) {
            return;
        }
        int i7 = 1;
        while (i7 != 0) {
            xmlPullParser.next();
            if (K0.a.t(xmlPullParser)) {
                i7++;
            } else if (xmlPullParser.getEventType() == 3) {
                i7--;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
        if (r0 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b5, code lost:
        if (r8.equals("fa01") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00fe, code lost:
        if (r0 < 33) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(org.xmlpull.v1.XmlPullParser r12) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.e.c(org.xmlpull.v1.XmlPullParser):int");
    }

    public static long d(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return Float.parseFloat(attributeValue) * 1000000.0f;
    }

    public static ArrayList e(XmlPullParser xmlPullParser, List list, boolean z7) {
        int i7;
        int i8;
        String str;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i7 = Integer.parseInt(attributeValue);
        } else if (z7) {
            i7 = 1;
        } else {
            i7 = Integer.MIN_VALUE;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        if (attributeValue2 != null) {
            i8 = Integer.parseInt(attributeValue2);
        } else {
            i8 = 1;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str2 = StringUtils.EMPTY;
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!K0.a.s(xmlPullParser, "BaseURL"));
        if (str2 != null && K0.a.q(str2)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str2;
            }
            return AbstractC0021t.p(new b(str2, i7, i8, attributeValue3));
        }
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            b bVar = (b) list.get(i9);
            String x7 = K0.a.x(bVar.f4843a, str2);
            if (attributeValue3 == null) {
                str = x7;
            } else {
                str = attributeValue3;
            }
            if (z7) {
                i7 = bVar.f4845c;
                i8 = bVar.f4846d;
                str = bVar.f4844b;
            }
            arrayList.add(new b(x7, i7, i8, str));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair f(org.xmlpull.v1.XmlPullParser r14) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.e.f(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        if (!"image".equals(attributeValue)) {
            return -1;
        }
        return 4;
    }

    public static f h(XmlPullParser xmlPullParser, String str) {
        String str2 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = StringUtils.EMPTY;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        if (attributeValue3 != null) {
            str2 = attributeValue3;
        }
        do {
            xmlPullParser.next();
        } while (!K0.a.s(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j) {
        double d7;
        double d8;
        double d9;
        double d10;
        double d11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = x.f2536i.matcher(attributeValue);
        if (matcher.matches()) {
            boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
            String group = matcher.group(3);
            double d12 = 0.0d;
            if (group != null) {
                d7 = Double.parseDouble(group) * 3.1556908E7d;
            } else {
                d7 = 0.0d;
            }
            String group2 = matcher.group(5);
            if (group2 != null) {
                d8 = Double.parseDouble(group2) * 2629739.0d;
            } else {
                d8 = 0.0d;
            }
            double d13 = d7 + d8;
            String group3 = matcher.group(7);
            if (group3 != null) {
                d9 = Double.parseDouble(group3) * 86400.0d;
            } else {
                d9 = 0.0d;
            }
            double d14 = d13 + d9;
            String group4 = matcher.group(10);
            if (group4 != null) {
                d10 = Double.parseDouble(group4) * 3600.0d;
            } else {
                d10 = 0.0d;
            }
            double d15 = d14 + d10;
            String group5 = matcher.group(12);
            if (group5 != null) {
                d11 = Double.parseDouble(group5) * 60.0d;
            } else {
                d11 = 0.0d;
            }
            double d16 = d15 + d11;
            String group6 = matcher.group(14);
            if (group6 != null) {
                d12 = Double.parseDouble(group6);
            }
            long j8 = (long) ((d16 + d12) * 1000.0d);
            if (!isEmpty) {
                return -j8;
            }
            return j8;
        }
        return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
    }

    public static float k(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f4866b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                String group = matcher.group(2);
                if (!TextUtils.isEmpty(group)) {
                    return parseInt / Integer.parseInt(group);
                }
                return parseInt;
            }
            return f;
        }
        return f;
    }

    public static int l(XmlPullParser xmlPullParser, String str, int i7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return Integer.parseInt(attributeValue);
        }
        return i7;
    }

    public static long m(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return Long.parseLong(attributeValue);
        }
        return j;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: SSATransform
        java.lang.IndexOutOfBoundsException: bitIndex < 0: -124
        	at java.base/java.util.BitSet.get(BitSet.java:624)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.fillBasicBlockInfo(LiveVarAnalysis.java:65)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.runAnalysis(LiveVarAnalysis.java:36)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:55)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
        */
    public static S0.c n(org.xmlpull.v1.XmlPullParser r155, android.net.Uri r156) {
        /*
            Method dump skipped, instructions count: 5216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.e.n(org.xmlpull.v1.XmlPullParser, android.net.Uri):S0.c");
    }

    public static j o(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j8;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j8 = (Long.parseLong(split[1]) - j) + 1;
                return new j(j, j8, attributeValue);
            }
        } else {
            j = 0;
        }
        j8 = -1;
        return new j(j, j8, attributeValue);
    }

    public static int p(String str) {
        if (str == null) {
            return 0;
        }
        char c8 = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c8 = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c8 = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c8 = 2;
                    break;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    c8 = 3;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c8 = 4;
                    break;
                }
                break;
            case -1396432756:
                if (str.equals("forced-subtitle")) {
                    c8 = 5;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c8 = 6;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c8 = 7;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c8 = '\b';
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c8 = '\t';
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c8 = '\n';
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c8 = 11;
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c8 = '\f';
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
            case 3:
            case 5:
                return RecognitionOptions.ITF;
            case 1:
                return RecognitionOptions.UPC_A;
            case 2:
                return RecognitionOptions.PDF417;
            case 4:
                return 2;
            case 6:
                return 16;
            case 7:
                return 1;
            case '\b':
                return RecognitionOptions.QR_CODE;
            case '\t':
                return 64;
            case '\n':
                return 8;
            case 11:
                return 32;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return 4;
            default:
                return 0;
        }
    }

    public static int q(ArrayList arrayList) {
        int i7 = 0;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            if (AbstractC1740d.m("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i8)).f4871a)) {
                i7 = 16384;
            }
        }
        return i7;
    }

    public static r r(XmlPullParser xmlPullParser, r rVar) {
        long j;
        long j8;
        long j9;
        long j10;
        long j11;
        if (rVar != null) {
            j = rVar.f4909b;
        } else {
            j = 1;
        }
        long m7 = m(xmlPullParser, "timescale", j);
        long j12 = 0;
        if (rVar != null) {
            j8 = rVar.f4910c;
        } else {
            j8 = 0;
        }
        long m8 = m(xmlPullParser, "presentationTimeOffset", j8);
        if (rVar != null) {
            j9 = rVar.f4906d;
        } else {
            j9 = 0;
        }
        if (rVar != null) {
            j12 = rVar.f4907e;
        }
        j jVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j10 = (Long.parseLong(split[1]) - parseLong) + 1;
            j11 = parseLong;
        } else {
            j10 = j12;
            j11 = j9;
        }
        if (rVar != null) {
            jVar = rVar.f4908a;
        }
        do {
            xmlPullParser.next();
            if (K0.a.u(xmlPullParser, "Initialization")) {
                jVar = o(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
        } while (!K0.a.s(xmlPullParser, "SegmentBase"));
        return new r(jVar, m7, m8, j11, j10);
    }

    public static o s(XmlPullParser xmlPullParser, o oVar, long j, long j8, long j9, long j10, long j11) {
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17 = 1;
        if (oVar != null) {
            j12 = oVar.f4909b;
        } else {
            j12 = 1;
        }
        long m7 = m(xmlPullParser, "timescale", j12);
        if (oVar != null) {
            j13 = oVar.f4910c;
        } else {
            j13 = 0;
        }
        long m8 = m(xmlPullParser, "presentationTimeOffset", j13);
        if (oVar != null) {
            j14 = oVar.f4898e;
        } else {
            j14 = -9223372036854775807L;
        }
        long m9 = m(xmlPullParser, "duration", j14);
        if (oVar != null) {
            j17 = oVar.f4897d;
        }
        long m10 = m(xmlPullParser, "startNumber", j17);
        if (j10 == -9223372036854775807L) {
            j15 = j9;
        } else {
            j15 = j10;
        }
        if (j15 == Long.MAX_VALUE) {
            j16 = -9223372036854775807L;
        } else {
            j16 = j15;
        }
        List list = null;
        j jVar = null;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (K0.a.u(xmlPullParser, "Initialization")) {
                jVar = o(xmlPullParser, "sourceURL", "range");
            } else if (K0.a.u(xmlPullParser, "SegmentTimeline")) {
                list2 = u(xmlPullParser, m7, j8);
            } else if (K0.a.u(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(o(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!K0.a.s(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVar == null) {
                jVar = oVar.f4908a;
            }
            if (list2 == null) {
                list2 = oVar.f;
            }
            if (list == null) {
                list = oVar.j;
            }
        }
        return new o(jVar, m7, m8, m10, m9, list2, j16, list, x.M(j11), x.M(j));
    }

    public static p t(XmlPullParser xmlPullParser, p pVar, List list, long j, long j8, long j9, long j10, long j11) {
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        R1.j jVar;
        R1.j jVar2;
        long j18 = 1;
        if (pVar != null) {
            j12 = pVar.f4909b;
        } else {
            j12 = 1;
        }
        long m7 = m(xmlPullParser, "timescale", j12);
        if (pVar != null) {
            j13 = pVar.f4910c;
        } else {
            j13 = 0;
        }
        long m8 = m(xmlPullParser, "presentationTimeOffset", j13);
        if (pVar != null) {
            j14 = pVar.f4898e;
        } else {
            j14 = -9223372036854775807L;
        }
        long m9 = m(xmlPullParser, "duration", j14);
        if (pVar != null) {
            j18 = pVar.f4897d;
        }
        long m10 = m(xmlPullParser, "startNumber", j18);
        int i7 = 0;
        while (true) {
            if (i7 < list.size()) {
                f fVar = (f) list.get(i7);
                if (AbstractC1740d.m("http://dashif.org/guidelines/last-segment-number", fVar.f4871a)) {
                    j15 = Long.parseLong(fVar.f4872b);
                    break;
                }
                i7++;
            } else {
                j15 = -1;
                break;
            }
        }
        long j19 = j15;
        if (j10 == -9223372036854775807L) {
            j16 = j9;
        } else {
            j16 = j10;
        }
        if (j16 == Long.MAX_VALUE) {
            j17 = -9223372036854775807L;
        } else {
            j17 = j16;
        }
        j jVar3 = null;
        if (pVar != null) {
            jVar = pVar.f4902k;
        } else {
            jVar = null;
        }
        R1.j v6 = v(xmlPullParser, "media", jVar);
        if (pVar != null) {
            jVar2 = pVar.j;
        } else {
            jVar2 = null;
        }
        R1.j v7 = v(xmlPullParser, "initialization", jVar2);
        List list2 = null;
        do {
            xmlPullParser.next();
            if (K0.a.u(xmlPullParser, "Initialization")) {
                jVar3 = o(xmlPullParser, "sourceURL", "range");
            } else if (K0.a.u(xmlPullParser, "SegmentTimeline")) {
                list2 = u(xmlPullParser, m7, j8);
            } else {
                b(xmlPullParser);
            }
        } while (!K0.a.s(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVar3 == null) {
                jVar3 = pVar.f4908a;
            }
            if (list2 == null) {
                list2 = pVar.f;
            }
        }
        return new p(jVar3, m7, m8, m10, j19, m9, list2, j17, v7, v6, x.M(j11), x.M(j));
    }

    public static ArrayList u(XmlPullParser xmlPullParser, long j, long j8) {
        ArrayList arrayList = new ArrayList();
        long j9 = 0;
        long j10 = -9223372036854775807L;
        boolean z7 = false;
        int i7 = 0;
        do {
            xmlPullParser.next();
            if (K0.a.u(xmlPullParser, "S")) {
                long m7 = m(xmlPullParser, "t", -9223372036854775807L);
                if (z7) {
                    j9 = a(arrayList, j9, j10, i7, m7);
                }
                if (m7 == -9223372036854775807L) {
                    m7 = j9;
                }
                long m8 = m(xmlPullParser, "d", -9223372036854775807L);
                i7 = l(xmlPullParser, "r", 0);
                z7 = true;
                j10 = m8;
                j9 = m7;
            } else {
                b(xmlPullParser);
            }
        } while (!K0.a.s(xmlPullParser, "SegmentTimeline"));
        if (z7) {
            int i8 = x.f2529a;
            a(arrayList, j9, j10, i7, x.U(j8, j, 1000L, RoundingMode.FLOOR));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static R1.j v(XmlPullParser xmlPullParser, String str, R1.j jVar) {
        String str2;
        boolean z7;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList.add(StringUtils.EMPTY);
            int i7 = 0;
            while (i7 < attributeValue.length()) {
                int indexOf = attributeValue.indexOf("$", i7);
                if (indexOf == -1) {
                    arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i7));
                    i7 = attributeValue.length();
                } else if (indexOf != i7) {
                    arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i7, indexOf));
                    i7 = indexOf;
                } else if (attributeValue.startsWith("$$", i7)) {
                    arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                    i7 += 2;
                } else {
                    arrayList3.add(StringUtils.EMPTY);
                    int i8 = i7 + 1;
                    int indexOf2 = attributeValue.indexOf("$", i8);
                    String substring = attributeValue.substring(i8, indexOf2);
                    if (substring.equals("RepresentationID")) {
                        arrayList2.add(1);
                    } else {
                        int indexOf3 = substring.indexOf("%0");
                        if (indexOf3 != -1) {
                            str2 = substring.substring(indexOf3);
                            if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                                str2 = str2.concat("d");
                            }
                            substring = substring.substring(0, indexOf3);
                        } else {
                            str2 = "%01d";
                        }
                        substring.getClass();
                        switch (substring.hashCode()) {
                            case -1950496919:
                                if (substring.equals("Number")) {
                                    z7 = false;
                                    break;
                                }
                                z7 = true;
                                break;
                            case 2606829:
                                if (substring.equals("Time")) {
                                    z7 = true;
                                    break;
                                }
                                z7 = true;
                                break;
                            case 38199441:
                                if (substring.equals("Bandwidth")) {
                                    z7 = true;
                                    break;
                                }
                                z7 = true;
                                break;
                            default:
                                z7 = true;
                                break;
                        }
                        switch (z7) {
                            case false:
                                arrayList2.add(2);
                                break;
                            case true:
                                arrayList2.add(4);
                                break;
                            case true:
                                arrayList2.add(3);
                                break;
                            default:
                                throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                        }
                        arrayList3.set(arrayList2.size() - 1, str2);
                    }
                    arrayList.add(StringUtils.EMPTY);
                    i7 = indexOf2 + 1;
                }
            }
            return new R1.j(arrayList, arrayList2, arrayList3, 1);
        }
        return jVar;
    }

    @Override // i1.p
    public final Object j(Uri uri, M0.j jVar) {
        try {
            XmlPullParser newPullParser = this.f4870a.newPullParser();
            newPullParser.setInput(jVar, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return n(newPullParser, uri);
            }
            throw J.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e7) {
            throw J.b(null, e7);
        }
    }
}
