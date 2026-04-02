package P1;

import D.AbstractC0059i;
import F3.o;
import G.i;
import H0.C0132l;
import J1.k;
import J1.l;
import K0.x;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* loaded from: classes.dex */
public final class e implements l {

    /* renamed from: a  reason: collision with root package name */
    public final XmlPullParserFactory f3983a;

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f3979b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f3980c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f3981d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f3982e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: X  reason: collision with root package name */
    public static final Pattern f3976X = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: Y  reason: collision with root package name */
    public static final Pattern f3977Y = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: Z  reason: collision with root package name */
    public static final d f3978Z = new d(30.0f, 1, 1);

    public e() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f3983a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    public static g b(g gVar) {
        if (gVar == null) {
            return new g();
        }
        return gVar;
    }

    public static boolean c(String str) {
        if (!str.equals("tt") && !str.equals("head") && !str.equals("body") && !str.equals("div") && !str.equals("p") && !str.equals("span") && !str.equals("br") && !str.equals("style") && !str.equals("styling") && !str.equals("layout") && !str.equals("region") && !str.equals(ExternalParsersConfigReaderMetKeys.METADATA_TAG) && !str.equals("image") && !str.equals("data") && !str.equals("information")) {
            return false;
        }
        return true;
    }

    public static int d(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f3977Y.matcher(attributeValue);
        if (!matcher.matches()) {
            K0.a.A("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z7 = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z7 = false;
            }
            K0.a.d("Invalid cell resolution " + parseInt + StringUtils.SPACE + parseInt2, z7);
            return parseInt2;
        } catch (NumberFormatException unused) {
            K0.a.A("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void e(String str, g gVar) {
        Matcher matcher;
        char c8 = 65535;
        int i7 = x.f2529a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = f3981d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            K0.a.A("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new Exception(AbstractC0059i.B(new StringBuilder("Invalid number of entries for fontSize: "), split.length, "."));
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c8 = 2;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    gVar.j = 3;
                    break;
                case 1:
                    gVar.j = 2;
                    break;
                case 2:
                    gVar.j = 1;
                    break;
                default:
                    throw new Exception(AbstractC0059i.M("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            gVar.f4000k = Float.parseFloat(group2);
            return;
        }
        throw new Exception(AbstractC0059i.M("Invalid expression for fontSize: '", str, "'."));
    }

    public static d f(XmlPullParser xmlPullParser) {
        int i7;
        float f4;
        int i8;
        String[] split;
        boolean z7;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i7 = Integer.parseInt(attributeValue);
        } else {
            i7 = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i9 = x.f2529a;
            if (attributeValue2.split(StringUtils.SPACE, -1).length == 2) {
                z7 = true;
            } else {
                z7 = false;
            }
            K0.a.d("frameRateMultiplier doesn't have 2 parts", z7);
            f4 = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
        } else {
            f4 = 1.0f;
        }
        d dVar = f3978Z;
        int i10 = dVar.f3974b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i8 = Integer.parseInt(attributeValue4);
        } else {
            i8 = dVar.f3975c;
        }
        return new d(i7 * f4, i10, i8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024d A[LOOP:0: B:3:0x000a->B:104:0x024d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, H0.C0132l r23, java.util.HashMap r24, java.util.HashMap r25) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.e.h(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, H0.l, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static c i(XmlPullParser xmlPullParser, c cVar, HashMap hashMap, d dVar) {
        long j;
        long j8;
        char c8;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        g j9 = j(xmlPullParser, null);
        String[] strArr = null;
        String str = null;
        String str2 = StringUtils.EMPTY;
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        for (int i7 = 0; i7 < attributeCount; i7++) {
            String attributeName = xmlPullParser.getAttributeName(i7);
            String attributeValue = xmlPullParser.getAttributeValue(i7);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c8 = 0;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c8 = 1;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c8 = 2;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c8 = 3;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c8 = 4;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c8 = 5;
                        break;
                    }
                    c8 = 65535;
                    break;
                default:
                    c8 = 65535;
                    break;
            }
            switch (c8) {
                case 0:
                    if (hashMap.containsKey(attributeValue)) {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j12 = k(attributeValue, dVar);
                    break;
                case 2:
                    j11 = k(attributeValue, dVar);
                    break;
                case 3:
                    j10 = k(attributeValue, dVar);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i8 = x.f2529a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (cVar != null) {
            long j13 = cVar.f3965d;
            j = -9223372036854775807L;
            if (j13 != -9223372036854775807L) {
                if (j10 != -9223372036854775807L) {
                    j10 += j13;
                }
                if (j11 != -9223372036854775807L) {
                    j11 += j13;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (j11 == j) {
            if (j12 != j) {
                j8 = j10 + j12;
            } else if (cVar != null) {
                long j14 = cVar.f3966e;
                if (j14 != j) {
                    j8 = j14;
                }
            }
            return new c(xmlPullParser.getName(), null, j10, j8, j9, strArr, str2, str, cVar);
        }
        j8 = j11;
        return new c(xmlPullParser.getName(), null, j10, j8, j9, strArr, str2, str, cVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02db  */
    /* JADX WARN: Type inference failed for: r11v84, types: [P1.b] */
    /* JADX WARN: Type inference failed for: r12v46, types: [P1.b] */
    /* JADX WARN: Type inference failed for: r12v55, types: [P1.b] */
    /* JADX WARN: Type inference failed for: r1v50, types: [P1.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static P1.g j(org.xmlpull.v1.XmlPullParser r19, P1.g r20) {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.e.j(org.xmlpull.v1.XmlPullParser, P1.g):P1.g");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long k(java.lang.String r13, P1.d r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.e.k(java.lang.String, P1.d):long");
    }

    public static C0132l n(XmlPullParser xmlPullParser) {
        String p7 = K0.a.p(xmlPullParser, "extent");
        if (p7 == null) {
            return null;
        }
        Matcher matcher = f3976X.matcher(p7);
        if (!matcher.matches()) {
            K0.a.A("TtmlParser", "Ignoring non-pixel tts extent: ".concat(p7));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new C0132l(parseInt, Integer.parseInt(group2), 3);
        } catch (NumberFormatException unused) {
            K0.a.A("TtmlParser", "Ignoring malformed tts extent: ".concat(p7));
            return null;
        }
    }

    @Override // J1.l
    public final /* synthetic */ void a() {
    }

    @Override // J1.l
    public final J1.d g(byte[] bArr, int i7, int i8) {
        d dVar;
        try {
            XmlPullParser newPullParser = this.f3983a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put(StringUtils.EMPTY, new f(StringUtils.EMPTY, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C0132l c0132l = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i7, i8), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            d dVar2 = f3978Z;
            int i9 = 15;
            o oVar = null;
            int i10 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i10 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            dVar2 = f(newPullParser);
                            i9 = d(newPullParser);
                            c0132l = n(newPullParser);
                        }
                        C0132l c0132l2 = c0132l;
                        d dVar3 = dVar2;
                        int i11 = i9;
                        if (!c(name)) {
                            K0.a.r("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            i10++;
                            dVar2 = dVar3;
                        } else {
                            if ("head".equals(name)) {
                                dVar = dVar3;
                                h(newPullParser, hashMap, i11, c0132l2, hashMap2, hashMap3);
                            } else {
                                dVar = dVar3;
                                try {
                                    c i12 = i(newPullParser, cVar, hashMap2, dVar);
                                    arrayDeque.push(i12);
                                    if (cVar != null) {
                                        if (cVar.f3972m == null) {
                                            cVar.f3972m = new ArrayList();
                                        }
                                        cVar.f3972m.add(i12);
                                    }
                                } catch (J1.f e7) {
                                    K0.a.B("TtmlParser", "Suppressing parser error", e7);
                                    i10++;
                                }
                            }
                            dVar2 = dVar;
                        }
                        c0132l = c0132l2;
                        i9 = i11;
                    } else if (eventType == 4) {
                        cVar.getClass();
                        c a7 = c.a(newPullParser.getText());
                        if (cVar.f3972m == null) {
                            cVar.f3972m = new ArrayList();
                        }
                        cVar.f3972m.add(a7);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            c cVar2 = (c) arrayDeque.peek();
                            cVar2.getClass();
                            oVar = new o(cVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i10++;
                } else if (eventType == 3) {
                    i10--;
                }
                newPullParser.next();
            }
            oVar.getClass();
            return oVar;
        } catch (IOException e8) {
            throw new IllegalStateException("Unexpected error when reading input.", e8);
        } catch (XmlPullParserException e9) {
            throw new IllegalStateException("Unable to decode source", e9);
        }
    }

    @Override // J1.l
    public final void l(byte[] bArr, int i7, int i8, k kVar, K0.c cVar) {
        i.I(g(bArr, i7, i8), kVar, cVar);
    }

    @Override // J1.l
    public final int m() {
        return 1;
    }
}
