package K1;

import A3.B;
import A3.C0027z;
import A3.d0;
import H0.r;
import H4.e1;
import H4.p1;
import I.k;
import a1.C0433j;
import androidx.camera.core.impl.C0501c;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h1.C1072f;
import h1.C1073g;
import h1.l;
import h1.o;
import h1.p;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import n4.C1529o;
import org.apache.tika.language.detect.LanguageDetector;
import org.apache.tika.language.translate.Translator;
import org.apache.tika.utils.CompareUtils;
import org.apache.tika.utils.XMLReaderUtils;
import p4.C1673c;
import q4.C1708a;
import q4.C1709b;
import q4.C1711d;
import q4.n;
import u4.u;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2578a;

    public /* synthetic */ d(int i7) {
        this.f2578a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        d0 a7;
        int compareTo;
        switch (this.f2578a) {
            case 0:
                return Integer.compare(((e) obj2).f2581b, ((e) obj).f2581b);
            case 1:
                S0.b bVar = (S0.b) obj;
                S0.b bVar2 = (S0.b) obj2;
                int compare = Integer.compare(bVar.f4845c, bVar2.f4845c);
                if (compare == 0) {
                    return bVar.f4844b.compareTo(bVar2.f4844b);
                }
                return compare;
            case 2:
                return Integer.compare(((R1.d) obj).f4659a.f4662b, ((R1.d) obj2).f4659a.f4662b);
            case 3:
                return Long.compare(((R1.c) obj).f4656b, ((R1.c) obj2).f4656b);
            case 4:
                return k.b(((C0433j) obj).f6838a.f6835c, ((C0433j) obj2).f6838a.f6835c);
            case 5:
                return CompareUtils.compareClassName((Translator) obj, (Translator) obj2);
            case 6:
                return ((C0501c) obj).f7606a.compareTo(((C0501c) obj2).f7606a);
            case 7:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i7 = 0; i7 < bArr.length; i7++) {
                    byte b5 = bArr[i7];
                    byte b7 = bArr2[i7];
                    if (b5 != b7) {
                        return b5 - b7;
                    }
                }
                return 0;
            case 8:
                return ((r) obj2).f1883i - ((r) obj).f1883i;
            case 9:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    if (num2.intValue() != -1) {
                        return -1;
                    }
                    return 0;
                } else if (num2.intValue() == -1) {
                    return 1;
                } else {
                    return num.intValue() - num2.intValue();
                }
            case 10:
                return Integer.compare(((C1073g) ((List) obj).get(0)).f, ((C1073g) ((List) obj2).get(0)).f);
            case 11:
                return ((C1072f) Collections.max((List) obj)).compareTo((C1072f) Collections.max((List) obj2));
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                List list = (List) obj;
                List list2 = (List) obj2;
                return C0027z.f(o.c((o) Collections.max(list, new d(14)), (o) Collections.max(list2, new d(14)))).a(list.size(), list2.size()).b((o) Collections.max(list, new d(15)), (o) Collections.max(list2, new d(15)), new d(15)).e();
            case 13:
                return ((l) ((List) obj).get(0)).compareTo((l) ((List) obj2).get(0));
            case 14:
                return o.c((o) obj, (o) obj2);
            case 15:
                o oVar = (o) obj;
                o oVar2 = (o) obj2;
                if (oVar.f11298e && oVar.f11296Y) {
                    a7 = p.f11309i;
                } else {
                    a7 = p.f11309i.a();
                }
                C0027z c0027z = B.f81a;
                oVar.f.getClass();
                return c0027z.b(Integer.valueOf(oVar.f11300f0), Integer.valueOf(oVar2.f11300f0), a7).b(Integer.valueOf(oVar.f11299e0), Integer.valueOf(oVar2.f11299e0), a7).e();
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                return ((i1.r) obj).f11437a - ((i1.r) obj2).f11437a;
            case 17:
                return Float.compare(((i1.r) obj).f11439c, ((i1.r) obj2).f11439c);
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return CompareUtils.compareClassName((LanguageDetector) obj, (LanguageDetector) obj2);
            case 19:
                return CompareUtils.compareClassName(obj, obj2);
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                C1673c c1673c = (C1673c) obj;
                C1673c c1673c2 = (C1673c) obj2;
                int compareTo2 = c1673c.f15244a.compareTo(c1673c2.f15244a);
                if (compareTo2 == 0) {
                    return u.d(c1673c.f15245b, c1673c2.f15245b);
                }
                return compareTo2;
            case 21:
                C1673c c1673c3 = (C1673c) obj;
                C1673c c1673c4 = (C1673c) obj2;
                int d7 = u.d(c1673c3.f15245b, c1673c4.f15245b);
                if (d7 == 0) {
                    return c1673c3.f15244a.compareTo(c1673c4.f15244a);
                }
                return d7;
            case 22:
                return ((Long) obj2).compareTo((Long) obj);
            case 23:
                C1708a c1708a = (C1708a) obj;
                C1708a c1708a2 = (C1708a) obj2;
                int compare2 = Long.compare(c1708a.f15341d.f15347a, c1708a2.f15341d.f15347a);
                if (compare2 == 0) {
                    return c1708a.f15339b.compareTo(c1708a2.f15339b);
                }
                return compare2;
            case 24:
                return u.d(((r4.i) obj).f15499a, ((r4.i) obj2).f15499a);
            case 25:
                return ((q4.h) obj).compareTo((q4.h) obj2);
            case 26:
                C1708a c1708a3 = (C1708a) obj;
                C1708a c1708a4 = (C1708a) obj2;
                int compareTo3 = c1708a3.f15339b.compareTo(c1708a4.f15339b);
                if (compareTo3 == 0) {
                    Iterator it = c1708a3.f15340c.iterator();
                    Iterator it2 = c1708a4.f15340c.iterator();
                    while (it.hasNext() && it2.hasNext()) {
                        C1711d c1711d = (C1711d) it.next();
                        C1711d c1711d2 = (C1711d) it2.next();
                        c1711d.getClass();
                        int compareTo4 = c1711d.f15349a.compareTo(c1711d2.f15349a);
                        if (compareTo4 != 0) {
                            compareTo = compareTo4;
                            continue;
                        } else {
                            compareTo = c1711d.f15350b.compareTo(c1711d2.f15350b);
                            continue;
                        }
                        if (compareTo != 0) {
                            return compareTo;
                        }
                    }
                    return Boolean.compare(it.hasNext(), it2.hasNext());
                }
                return compareTo3;
            case 27:
                return C1709b.b((n) obj).compareTo(C1709b.b((n) obj2));
            case 28:
                return ((C1529o) obj).f14351c.compareTo(((C1529o) obj2).f14351c);
            default:
                return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }
}
