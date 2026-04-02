package d1;

import H0.J;
import H0.r;
import K0.x;
import h3.AbstractC1079a;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public final class i extends d {

    /* renamed from: e  reason: collision with root package name */
    public final String f10209e;
    public final LinkedList f;

    /* renamed from: g  reason: collision with root package name */
    public int f10210g;

    /* renamed from: h  reason: collision with root package name */
    public String f10211h;

    /* renamed from: i  reason: collision with root package name */
    public long f10212i;
    public String j;

    /* renamed from: k  reason: collision with root package name */
    public String f10213k;

    /* renamed from: l  reason: collision with root package name */
    public int f10214l;

    /* renamed from: m  reason: collision with root package name */
    public int f10215m;

    /* renamed from: n  reason: collision with root package name */
    public int f10216n;

    /* renamed from: o  reason: collision with root package name */
    public int f10217o;

    /* renamed from: p  reason: collision with root package name */
    public String f10218p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f10219q;

    /* renamed from: r  reason: collision with root package name */
    public long f10220r;

    public i(d dVar, String str) {
        super(dVar, str, "StreamIndex");
        this.f10209e = str;
        this.f = new LinkedList();
    }

    @Override // d1.d
    public final void a(Object obj) {
        if (obj instanceof r) {
            this.f.add((r) obj);
        }
    }

    @Override // d1.d
    public final Object b() {
        int i7;
        int i8;
        int i9;
        ArrayList arrayList;
        ArrayList arrayList2;
        RoundingMode roundingMode;
        int i10;
        long[] jArr;
        int i11;
        ArrayList arrayList3;
        long[] jArr2;
        LinkedList linkedList = this.f;
        r[] rVarArr = new r[linkedList.size()];
        linkedList.toArray(rVarArr);
        String str = this.f10213k;
        int i12 = this.f10210g;
        String str2 = this.f10211h;
        long j = this.f10212i;
        String str3 = this.j;
        int i13 = this.f10214l;
        int i14 = this.f10215m;
        int i15 = this.f10216n;
        int i16 = this.f10217o;
        String str4 = this.f10218p;
        ArrayList arrayList4 = this.f10219q;
        long j8 = this.f10220r;
        int i17 = x.f2529a;
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        int size = arrayList4.size();
        long[] jArr3 = new long[size];
        int i18 = (j > 1000000L ? 1 : (j == 1000000L ? 0 : -1));
        if (i18 >= 0 && j % 1000000 == 0) {
            i7 = i14;
            long g3 = AbstractC1079a.g(j, 1000000L, RoundingMode.UNNECESSARY);
            int i19 = 0;
            while (i19 < size) {
                jArr3[i19] = AbstractC1079a.g(((Long) arrayList4.get(i19)).longValue(), g3, roundingMode2);
                i19++;
                i13 = i13;
                i15 = i15;
            }
            arrayList3 = arrayList4;
            jArr2 = jArr3;
            i8 = i15;
            i9 = i13;
        } else {
            i7 = i14;
            i8 = i15;
            i9 = i13;
            if (i18 < 0 && 1000000 % j == 0) {
                long g4 = AbstractC1079a.g(1000000L, j, RoundingMode.UNNECESSARY);
                for (int i20 = 0; i20 < size; i20++) {
                    jArr3[i20] = AbstractC1079a.t(((Long) arrayList4.get(i20)).longValue(), g4);
                }
            } else {
                int i21 = 0;
                while (i21 < size) {
                    long longValue = ((Long) arrayList4.get(i21)).longValue();
                    if (longValue == 0) {
                        arrayList2 = arrayList4;
                        roundingMode = roundingMode2;
                        i10 = size;
                        jArr = jArr3;
                        i11 = i21;
                    } else {
                        int i22 = (j > longValue ? 1 : (j == longValue ? 0 : -1));
                        if (i22 >= 0 && j % longValue == 0) {
                            arrayList = arrayList4;
                            jArr3[i21] = AbstractC1079a.g(1000000L, AbstractC1079a.g(j, longValue, RoundingMode.UNNECESSARY), roundingMode2);
                        } else {
                            arrayList = arrayList4;
                            if (i22 < 0 && longValue % j == 0) {
                                jArr3[i21] = AbstractC1079a.t(1000000L, AbstractC1079a.g(longValue, j, RoundingMode.UNNECESSARY));
                            } else {
                                arrayList2 = arrayList;
                                roundingMode = roundingMode2;
                                i10 = size;
                                jArr = jArr3;
                                i11 = i21;
                                jArr[i11] = x.V(longValue, 1000000L, j, roundingMode);
                            }
                        }
                        i10 = size;
                        jArr = jArr3;
                        i11 = i21;
                        arrayList2 = arrayList;
                        roundingMode = roundingMode2;
                    }
                    i21 = i11 + 1;
                    arrayList4 = arrayList2;
                    roundingMode2 = roundingMode;
                    size = i10;
                    jArr3 = jArr;
                }
            }
            arrayList3 = arrayList4;
            jArr2 = jArr3;
        }
        return new b(this.f10209e, str, i12, str2, j, str3, i9, i7, i8, i16, str4, rVarArr, arrayList3, jArr2, x.U(j8, 1000000L, j, RoundingMode.FLOOR));
    }

    @Override // d1.d
    public final boolean d(String str) {
        return "c".equals(str);
    }

    @Override // d1.d
    public final void j(XmlPullParser xmlPullParser) {
        int i7 = 1;
        if ("c".equals(xmlPullParser.getName())) {
            int size = this.f10219q.size();
            long h8 = d.h(xmlPullParser, "t", -9223372036854775807L);
            if (h8 == -9223372036854775807L) {
                if (size == 0) {
                    h8 = 0;
                } else if (this.f10220r != -1) {
                    h8 = this.f10220r + ((Long) this.f10219q.get(size - 1)).longValue();
                } else {
                    throw J.b("Unable to infer start time", null);
                }
            }
            this.f10219q.add(Long.valueOf(h8));
            this.f10220r = d.h(xmlPullParser, "d", -9223372036854775807L);
            long h9 = d.h(xmlPullParser, "r", 1L);
            if (h9 > 1 && this.f10220r == -9223372036854775807L) {
                throw J.b("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j = i7;
                if (j < h9) {
                    this.f10219q.add(Long.valueOf((this.f10220r * j) + h8));
                    i7++;
                } else {
                    return;
                }
            }
        } else {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue != null) {
                if (!"audio".equalsIgnoreCase(attributeValue)) {
                    if ("video".equalsIgnoreCase(attributeValue)) {
                        i7 = 2;
                    } else if ("text".equalsIgnoreCase(attributeValue)) {
                        i7 = 3;
                    } else {
                        throw J.b("Invalid key value[" + attributeValue + "]", null);
                    }
                }
                this.f10210g = i7;
                l(Integer.valueOf(i7), "Type");
                if (this.f10210g == 3) {
                    String attributeValue2 = xmlPullParser.getAttributeValue(null, "Subtype");
                    if (attributeValue2 != null) {
                        this.f10211h = attributeValue2;
                    } else {
                        throw new e("Subtype", 0);
                    }
                } else {
                    this.f10211h = xmlPullParser.getAttributeValue(null, "Subtype");
                }
                l(this.f10211h, "Subtype");
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "Name");
                this.j = attributeValue3;
                l(attributeValue3, "Name");
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "Url");
                if (attributeValue4 != null) {
                    this.f10213k = attributeValue4;
                    this.f10214l = d.g(xmlPullParser, "MaxWidth");
                    this.f10215m = d.g(xmlPullParser, "MaxHeight");
                    this.f10216n = d.g(xmlPullParser, "DisplayWidth");
                    this.f10217o = d.g(xmlPullParser, "DisplayHeight");
                    String attributeValue5 = xmlPullParser.getAttributeValue(null, "Language");
                    this.f10218p = attributeValue5;
                    l(attributeValue5, "Language");
                    long g3 = d.g(xmlPullParser, "TimeScale");
                    this.f10212i = g3;
                    if (g3 == -1) {
                        this.f10212i = ((Long) c("TimeScale")).longValue();
                    }
                    this.f10219q = new ArrayList();
                    return;
                }
                throw new e("Url", 0);
            }
            throw new e("Type", 0);
        }
    }
}
