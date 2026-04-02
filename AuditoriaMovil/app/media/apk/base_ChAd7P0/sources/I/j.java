package I;

import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC0519v;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0519v f2112a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2113b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2114c;

    /* renamed from: d  reason: collision with root package name */
    public final Rational f2115d;

    /* renamed from: e  reason: collision with root package name */
    public final k f2116e;

    public j(InterfaceC0519v interfaceC0519v, Size size) {
        Rational rational;
        this.f2112a = interfaceC0519v;
        this.f2113b = interfaceC0519v.a();
        this.f2114c = interfaceC0519v.b();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List i7 = interfaceC0519v.i(RecognitionOptions.QR_CODE);
            if (i7.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(i7, new F.c(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.f2115d = rational;
        this.f2116e = new k(interfaceC0519v, rational);
    }

    public static ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(F.b.f1092a);
        arrayList2.add(F.b.f1094c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList2.contains(rational)) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (F.b.a((Rational) it2.next(), size)) {
                            break;
                        }
                    } else {
                        arrayList2.add(rational);
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    public static Rational c(int i7, boolean z7) {
        if (i7 != -1) {
            if (i7 != 0) {
                if (i7 != 1) {
                    org.slf4j.helpers.i.t("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i7);
                } else if (z7) {
                    return F.b.f1094c;
                } else {
                    return F.b.f1095d;
                }
            } else if (z7) {
                return F.b.f1092a;
            } else {
                return F.b.f1093b;
            }
        }
        return null;
    }

    public static HashMap d(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        Iterator it = a(arrayList).iterator();
        while (it.hasNext()) {
            hashMap.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : hashMap.keySet()) {
                if (F.b.a(rational, size)) {
                    ((List) hashMap.get(rational)).add(size);
                }
            }
        }
        return hashMap;
    }

    public static void e(List list, Size size, boolean z7) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z7) {
            list.addAll(arrayList);
        }
    }

    public static void f(List list, Size size, boolean z7) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            Size size2 = (Size) list.get(i7);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z7) {
            list.addAll(arrayList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
        if (L.a.a(r2) < (r5.getHeight() * r5.getWidth())) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(androidx.camera.core.impl.y0 r14) {
        /*
            Method dump skipped, instructions count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I.j.b(androidx.camera.core.impl.y0):java.util.List");
    }
}
