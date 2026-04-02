package d1;

import H0.C0134n;
import H0.C0135o;
import H0.C0137q;
import H0.J;
import H0.r;
import K0.x;
import java.math.RoundingMode;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: e  reason: collision with root package name */
    public final LinkedList f10202e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f10203g;

    /* renamed from: h  reason: collision with root package name */
    public long f10204h;

    /* renamed from: i  reason: collision with root package name */
    public long f10205i;
    public long j;

    /* renamed from: k  reason: collision with root package name */
    public int f10206k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f10207l;

    /* renamed from: m  reason: collision with root package name */
    public C0886a f10208m;

    public h(String str) {
        super(null, str, "SmoothStreamingMedia");
        this.f10206k = -1;
        this.f10208m = null;
        this.f10202e = new LinkedList();
    }

    @Override // d1.d
    public final void a(Object obj) {
        boolean z7;
        if (obj instanceof b) {
            this.f10202e.add((b) obj);
        } else if (obj instanceof C0886a) {
            if (this.f10208m == null) {
                z7 = true;
            } else {
                z7 = false;
            }
            K0.a.j(z7);
            this.f10208m = (C0886a) obj;
        }
    }

    @Override // d1.d
    public final Object b() {
        boolean z7;
        C0886a c0886a;
        int i7;
        long U7;
        long U8;
        LinkedList linkedList = this.f10202e;
        int size = linkedList.size();
        b[] bVarArr = new b[size];
        linkedList.toArray(bVarArr);
        C0886a c0886a2 = this.f10208m;
        if (c0886a2 != null) {
            C0135o c0135o = new C0135o(new C0134n(c0886a2.f10171a, null, "video/mp4", c0886a2.f10172b));
            for (int i8 = 0; i8 < size; i8++) {
                b bVar = bVarArr[i8];
                int i9 = bVar.f10174a;
                if (i9 == 2 || i9 == 1) {
                    int i10 = 0;
                    while (true) {
                        r[] rVarArr = bVar.j;
                        if (i10 < rVarArr.length) {
                            C0137q a7 = rVarArr[i10].a();
                            a7.f1854p = c0135o;
                            rVarArr[i10] = new r(a7);
                            i10++;
                        }
                    }
                }
            }
        }
        int i11 = this.f;
        int i12 = this.f10203g;
        long j = this.f10204h;
        long j8 = this.f10205i;
        long j9 = this.j;
        int i13 = this.f10206k;
        boolean z8 = this.f10207l;
        C0886a c0886a3 = this.f10208m;
        if (j8 == 0) {
            z7 = z8;
            c0886a = c0886a3;
            i7 = i13;
            U7 = -9223372036854775807L;
        } else {
            int i14 = x.f2529a;
            z7 = z8;
            c0886a = c0886a3;
            i7 = i13;
            U7 = x.U(j8, 1000000L, j, RoundingMode.FLOOR);
        }
        if (j9 == 0) {
            U8 = -9223372036854775807L;
        } else {
            int i15 = x.f2529a;
            U8 = x.U(j9, 1000000L, j, RoundingMode.FLOOR);
        }
        return new c(i11, i12, U7, U8, i7, z7, c0886a, bVarArr);
    }

    @Override // d1.d
    public final void j(XmlPullParser xmlPullParser) {
        boolean z7;
        this.f = d.i(xmlPullParser, "MajorVersion");
        this.f10203g = d.i(xmlPullParser, "MinorVersion");
        this.f10204h = d.h(xmlPullParser, "TimeScale", 10000000L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
        if (attributeValue != null) {
            try {
                this.f10205i = Long.parseLong(attributeValue);
                this.j = d.h(xmlPullParser, "DVRWindowLength", 0L);
                this.f10206k = d.g(xmlPullParser, "LookaheadCount");
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
                if (attributeValue2 != null) {
                    z7 = Boolean.parseBoolean(attributeValue2);
                } else {
                    z7 = false;
                }
                this.f10207l = z7;
                l(Long.valueOf(this.f10204h), "TimeScale");
                return;
            } catch (NumberFormatException e7) {
                throw J.b(null, e7);
            }
        }
        throw new e("Duration", 0);
    }
}
