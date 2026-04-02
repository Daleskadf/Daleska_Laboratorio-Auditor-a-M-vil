package H0;

import D.AbstractC0059i;
import H4.e1;
import H4.p1;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.utils.XMLReaderUtils;
/* loaded from: classes.dex */
public final class F {

    /* renamed from: y  reason: collision with root package name */
    public static final F f1669y = new F(new Object());

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f1670a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f1671b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f1672c;

    /* renamed from: d  reason: collision with root package name */
    public final CharSequence f1673d;

    /* renamed from: e  reason: collision with root package name */
    public final CharSequence f1674e;
    public final byte[] f;

    /* renamed from: g  reason: collision with root package name */
    public final Integer f1675g;

    /* renamed from: h  reason: collision with root package name */
    public final Integer f1676h;

    /* renamed from: i  reason: collision with root package name */
    public final Integer f1677i;
    public final Integer j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f1678k;

    /* renamed from: l  reason: collision with root package name */
    public final Integer f1679l;

    /* renamed from: m  reason: collision with root package name */
    public final Integer f1680m;

    /* renamed from: n  reason: collision with root package name */
    public final Integer f1681n;

    /* renamed from: o  reason: collision with root package name */
    public final Integer f1682o;

    /* renamed from: p  reason: collision with root package name */
    public final Integer f1683p;

    /* renamed from: q  reason: collision with root package name */
    public final Integer f1684q;

    /* renamed from: r  reason: collision with root package name */
    public final Integer f1685r;

    /* renamed from: s  reason: collision with root package name */
    public final CharSequence f1686s;

    /* renamed from: t  reason: collision with root package name */
    public final CharSequence f1687t;

    /* renamed from: u  reason: collision with root package name */
    public final CharSequence f1688u;

    /* renamed from: v  reason: collision with root package name */
    public final CharSequence f1689v;

    /* renamed from: w  reason: collision with root package name */
    public final CharSequence f1690w;

    /* renamed from: x  reason: collision with root package name */
    public final Integer f1691x;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, H0.E] */
    static {
        AbstractC0059i.F(0, 1, 2, 3, 4);
        AbstractC0059i.F(5, 6, 8, 9, 10);
        AbstractC0059i.F(11, 12, 13, 14, 15);
        AbstractC0059i.F(16, 17, 18, 19, 20);
        AbstractC0059i.F(21, 22, 23, 24, 25);
        AbstractC0059i.F(26, 27, 28, 29, 30);
        K0.x.H(31);
        K0.x.H(32);
        K0.x.H(33);
        K0.x.H(PipesIterator.DEFAULT_QUEUE_SIZE);
    }

    public F(E e7) {
        Boolean bool = e7.f1656k;
        Integer num = e7.j;
        Integer num2 = e7.f1668w;
        int i7 = 1;
        int i8 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                        case 13:
                        case 14:
                        case 15:
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                        case 17:
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        case 19:
                        case 31:
                        case RecognitionOptions.EAN_13 /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i7 = 0;
                            break;
                        case 21:
                            i7 = 2;
                            break;
                        case 22:
                            i7 = 3;
                            break;
                        case 23:
                            i7 = 4;
                            break;
                        case 24:
                            i7 = 5;
                            break;
                        case 25:
                            i7 = 6;
                            break;
                    }
                    i8 = i7;
                }
                num = Integer.valueOf(i8);
            }
        } else if (num != null) {
            boolean z7 = num.intValue() != -1;
            bool = Boolean.valueOf(z7);
            if (z7 && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i8 = 21;
                        break;
                    case 3:
                        i8 = 22;
                        break;
                    case 4:
                        i8 = 23;
                        break;
                    case 5:
                        i8 = 24;
                        break;
                    case 6:
                        i8 = 25;
                        break;
                    default:
                        i8 = 20;
                        break;
                }
                num2 = Integer.valueOf(i8);
            }
        }
        this.f1670a = e7.f1648a;
        this.f1671b = e7.f1649b;
        this.f1672c = e7.f1650c;
        this.f1673d = e7.f1651d;
        this.f1674e = e7.f1652e;
        this.f = e7.f;
        this.f1675g = e7.f1653g;
        this.f1676h = e7.f1654h;
        this.f1677i = e7.f1655i;
        this.j = num;
        this.f1678k = bool;
        Integer num3 = e7.f1657l;
        this.f1679l = num3;
        this.f1680m = num3;
        this.f1681n = e7.f1658m;
        this.f1682o = e7.f1659n;
        this.f1683p = e7.f1660o;
        this.f1684q = e7.f1661p;
        this.f1685r = e7.f1662q;
        this.f1686s = e7.f1663r;
        this.f1687t = e7.f1664s;
        this.f1688u = e7.f1665t;
        this.f1689v = e7.f1666u;
        this.f1690w = e7.f1667v;
        this.f1691x = num2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, H0.E] */
    public final E a() {
        ?? obj = new Object();
        obj.f1648a = this.f1670a;
        obj.f1649b = this.f1671b;
        obj.f1650c = this.f1672c;
        obj.f1651d = this.f1673d;
        obj.f1652e = this.f1674e;
        obj.f = this.f;
        obj.f1653g = this.f1675g;
        obj.f1654h = this.f1676h;
        obj.f1655i = this.f1677i;
        obj.j = this.j;
        obj.f1656k = this.f1678k;
        obj.f1657l = this.f1680m;
        obj.f1658m = this.f1681n;
        obj.f1659n = this.f1682o;
        obj.f1660o = this.f1683p;
        obj.f1661p = this.f1684q;
        obj.f1662q = this.f1685r;
        obj.f1663r = this.f1686s;
        obj.f1664s = this.f1687t;
        obj.f1665t = this.f1688u;
        obj.f1666u = this.f1689v;
        obj.f1667v = this.f1690w;
        obj.f1668w = this.f1691x;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        F f = (F) obj;
        if (K0.x.a(this.f1670a, f.f1670a) && K0.x.a(this.f1671b, f.f1671b) && K0.x.a(this.f1672c, f.f1672c) && K0.x.a(this.f1673d, f.f1673d) && K0.x.a(null, null) && K0.x.a(null, null) && K0.x.a(this.f1674e, f.f1674e) && K0.x.a(null, null) && K0.x.a(null, null) && K0.x.a(null, null) && Arrays.equals(this.f, f.f) && K0.x.a(this.f1675g, f.f1675g) && K0.x.a(null, null) && K0.x.a(this.f1676h, f.f1676h) && K0.x.a(this.f1677i, f.f1677i) && K0.x.a(this.j, f.j) && K0.x.a(this.f1678k, f.f1678k) && K0.x.a(null, null) && K0.x.a(this.f1680m, f.f1680m) && K0.x.a(this.f1681n, f.f1681n) && K0.x.a(this.f1682o, f.f1682o) && K0.x.a(this.f1683p, f.f1683p) && K0.x.a(this.f1684q, f.f1684q) && K0.x.a(this.f1685r, f.f1685r) && K0.x.a(this.f1686s, f.f1686s) && K0.x.a(this.f1687t, f.f1687t) && K0.x.a(this.f1688u, f.f1688u) && K0.x.a(null, null) && K0.x.a(null, null) && K0.x.a(this.f1689v, f.f1689v) && K0.x.a(null, null) && K0.x.a(this.f1690w, f.f1690w) && K0.x.a(this.f1691x, f.f1691x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1670a, this.f1671b, this.f1672c, this.f1673d, null, null, this.f1674e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f)), this.f1675g, null, this.f1676h, this.f1677i, this.j, this.f1678k, null, this.f1680m, this.f1681n, this.f1682o, this.f1683p, this.f1684q, this.f1685r, this.f1686s, this.f1687t, this.f1688u, null, null, this.f1689v, null, this.f1690w, this.f1691x, true});
    }
}
