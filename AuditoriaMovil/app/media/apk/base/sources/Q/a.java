package Q;

import H4.p1;
import a6.m0;
import android.util.Rational;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import n4.C1513B;
import n4.EnumC1512A;
import q4.k;
import q4.n;
import q4.s;
/* loaded from: classes.dex */
public final class a implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4087a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4088b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f4087a = i7;
        this.f4088b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float f;
        float f4;
        int i7;
        boolean z7;
        int a7;
        int b5;
        switch (this.f4087a) {
            case 0:
                Rational rational = (Rational) obj2;
                Rational rational2 = (Rational) this.f4088b;
                float floatValue = ((Rational) obj).floatValue();
                float floatValue2 = rational2.floatValue();
                if (floatValue > floatValue2) {
                    f = floatValue2 / floatValue;
                } else {
                    f = floatValue / floatValue2;
                }
                float floatValue3 = rational.floatValue();
                float floatValue4 = rational2.floatValue();
                if (floatValue3 > floatValue4) {
                    f4 = floatValue4 / floatValue3;
                } else {
                    f4 = floatValue3 / floatValue4;
                }
                return Float.compare(f4, f);
            case 1:
                m0 m0Var = (m0) this.f4088b;
                int f8 = m0Var.f(obj) - m0Var.f(obj2);
                if (f8 == 0) {
                    return obj.getClass().getName().compareTo(obj2.getClass().getName());
                }
                return f8;
            default:
                n nVar = (n) obj;
                n nVar2 = (n) obj2;
                Iterator it = ((List) this.f4088b).iterator();
                do {
                    i7 = 0;
                    if (it.hasNext()) {
                        C1513B c1513b = (C1513B) it.next();
                        c1513b.getClass();
                        k kVar = k.f15360b;
                        k kVar2 = c1513b.f14268b;
                        boolean equals = kVar2.equals(kVar);
                        EnumC1512A enumC1512A = c1513b.f14267a;
                        if (equals) {
                            a7 = enumC1512A.a();
                            b5 = nVar.f15362a.compareTo(nVar2.f15362a);
                        } else {
                            p1 f9 = nVar.f15366e.f(kVar2);
                            p1 f10 = nVar2.f15366e.f(kVar2);
                            if (f9 != null && f10 != null) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            m5.d.i("Trying to compare documents on fields that don't exist.", z7, new Object[0]);
                            a7 = enumC1512A.a();
                            b5 = s.b(f9, f10);
                        }
                        i7 = b5 * a7;
                    }
                    return i7;
                } while (i7 == 0);
                return i7;
        }
    }

    public a(List list) {
        boolean z7;
        this.f4087a = 2;
        Iterator it = list.iterator();
        loop0: while (true) {
            z7 = false;
            while (it.hasNext()) {
                z7 = (z7 || ((C1513B) it.next()).f14268b.equals(k.f15360b)) ? true : z7;
            }
        }
        if (z7) {
            this.f4088b = list;
            return;
        }
        throw new IllegalArgumentException("QueryComparator needs to have a key ordering");
    }
}
