package Q;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC0519v;
import androidx.camera.core.impl.InterfaceC0521x;
import androidx.camera.core.impl.y0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: h  reason: collision with root package name */
    public static final double f4089h = Math.sqrt(2.3703703703703702d);

    /* renamed from: a  reason: collision with root package name */
    public final Size f4090a;

    /* renamed from: b  reason: collision with root package name */
    public final Rational f4091b;

    /* renamed from: c  reason: collision with root package name */
    public final Rational f4092c;

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f4093d;

    /* renamed from: e  reason: collision with root package name */
    public final I.j f4094e;
    public final InterfaceC0519v f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f4095g;

    public b(InterfaceC0521x interfaceC0521x, HashSet hashSet) {
        Rational rational;
        Size d7 = F.g.d(interfaceC0521x.n().q());
        InterfaceC0519v m7 = interfaceC0521x.m();
        I.j jVar = new I.j(m7, d7);
        this.f4095g = new HashMap();
        this.f4090a = d7;
        if (d7.getWidth() / d7.getHeight() > f4089h) {
            rational = F.b.f1094c;
        } else {
            rational = F.b.f1092a;
        }
        org.slf4j.helpers.i.l("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + d7 + ") is " + rational + ".");
        this.f4091b = rational;
        Rational rational2 = F.b.f1092a;
        if (rational.equals(rational2)) {
            rational2 = F.b.f1094c;
        } else if (!rational.equals(F.b.f1094c)) {
            throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
        }
        this.f4092c = rational2;
        this.f = m7;
        this.f4093d = hashSet;
        this.f4094e = jVar;
    }

    public static Rect a(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational g3 = g(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational g4 = g(size);
        if (g3.floatValue() == g4.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (g3.floatValue() > g4.floatValue()) {
                float f = width;
                float floatValue = f / g3.floatValue();
                float f4 = (height - floatValue) / 2.0f;
                rectF = new RectF(0.0f, f4, f, floatValue + f4);
            } else {
                float f8 = height;
                float floatValue2 = g3.floatValue() * f8;
                float f9 = (width - floatValue2) / 2.0f;
                rectF = new RectF(f9, 0.0f, floatValue2 + f9, f8);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static boolean c(Size size, Size size2) {
        if (size.getHeight() <= size2.getHeight() && size.getWidth() <= size2.getWidth()) {
            return false;
        }
        return true;
    }

    public static Rational g(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final List b(y0 y0Var) {
        Rational rational;
        if (this.f4093d.contains(y0Var)) {
            HashMap hashMap = this.f4095g;
            if (hashMap.containsKey(y0Var)) {
                List list = (List) hashMap.get(y0Var);
                Objects.requireNonNull(list);
                return list;
            }
            List<Size> b5 = this.f4094e.b(y0Var);
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (Size size : b5) {
                Iterator it = hashMap2.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        rational = (Rational) it.next();
                        if (F.b.a(rational, size)) {
                            break;
                        }
                    } else {
                        rational = null;
                        break;
                    }
                }
                if (rational != null) {
                    Size size2 = (Size) hashMap2.get(rational);
                    Objects.requireNonNull(size2);
                    if (size.getHeight() <= size2.getHeight()) {
                        if (size.getWidth() <= size2.getWidth()) {
                            if (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight()) {
                            }
                        }
                    }
                } else {
                    rational = g(size);
                }
                arrayList.add(size);
                hashMap2.put(rational, size);
            }
            hashMap.put(y0Var, arrayList);
            return arrayList;
        }
        throw new IllegalArgumentException("Invalid child config: " + y0Var);
    }

    public final boolean d(Rational rational, Size size) {
        int i7;
        Rational rational2 = this.f4091b;
        if (rational2.equals(rational) || F.b.a(rational, size)) {
            return false;
        }
        float floatValue = rational2.floatValue();
        float floatValue2 = rational.floatValue();
        Rational rational3 = F.b.f1092a;
        if (!F.b.a(rational3, size)) {
            rational3 = F.b.f1094c;
            if (!F.b.a(rational3, size)) {
                rational3 = g(size);
            }
        }
        float floatValue3 = rational3.floatValue();
        int i8 = (floatValue > floatValue2 ? 1 : (floatValue == floatValue2 ? 0 : -1));
        if (i8 == 0 || floatValue2 == floatValue3) {
            return false;
        }
        if (i8 > 0) {
            if (floatValue2 >= floatValue3) {
                return false;
            }
        } else if (i7 <= 0) {
            return false;
        }
        return true;
    }

    public final ArrayList e(List list, boolean z7) {
        List list2;
        HashMap hashMap = new HashMap();
        Rational rational = F.b.f1092a;
        hashMap.put(rational, new ArrayList());
        Rational rational2 = F.b.f1094c;
        hashMap.put(rational2, new ArrayList());
        ArrayList arrayList = new ArrayList();
        arrayList.add(rational);
        arrayList.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Rational rational3 = (Rational) it2.next();
                        if (F.b.a(rational3, size)) {
                            list2 = (List) hashMap.get(rational3);
                            break;
                        }
                    } else {
                        list2 = null;
                        break;
                    }
                }
                if (list2 == null) {
                    list2 = new ArrayList();
                    Rational g3 = g(size);
                    arrayList.add(g3);
                    hashMap.put(g3, list2);
                }
                list2.add(size);
            }
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2, new a(g(this.f4090a), 0));
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Rational rational4 = (Rational) it3.next();
            if (!rational4.equals(F.b.f1094c) && !rational4.equals(F.b.f1092a)) {
                List list3 = (List) hashMap.get(rational4);
                Objects.requireNonNull(list3);
                arrayList3.addAll(f(rational4, list3, z7));
            }
        }
        return arrayList3;
    }

    public final ArrayList f(Rational rational, List list, boolean z7) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2;
        ArrayList<Size> arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (F.b.a(rational, size)) {
                arrayList3.add(size);
            }
        }
        Collections.sort(arrayList3, new F.c(true));
        HashSet hashSet = new HashSet(arrayList3);
        Iterator it2 = this.f4093d.iterator();
        while (it2.hasNext()) {
            List<Size> b5 = b((y0) it2.next());
            if (!z7) {
                ArrayList arrayList4 = new ArrayList();
                for (Size size2 : b5) {
                    if (!d(rational, size2)) {
                        arrayList4.add(size2);
                    }
                }
                b5 = arrayList4;
            }
            if (b5.isEmpty()) {
                return new ArrayList();
            }
            if (!b5.isEmpty() && !arrayList3.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                for (Size size3 : arrayList3) {
                    Iterator it3 = b5.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!c((Size) it3.next(), size3)) {
                                arrayList5.add(size3);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                arrayList3 = arrayList5;
            } else {
                arrayList3 = new ArrayList();
            }
            if (!b5.isEmpty() && !arrayList3.isEmpty()) {
                if (arrayList3.isEmpty()) {
                    arrayList2 = arrayList3;
                } else {
                    arrayList2 = new ArrayList(new LinkedHashSet(arrayList3));
                }
                arrayList = new ArrayList();
                for (Size size4 : arrayList2) {
                    Iterator it4 = b5.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (c((Size) it4.next(), size4)) {
                                break;
                            }
                        } else {
                            arrayList.add(size4);
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            } else {
                arrayList = new ArrayList();
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Size size5 : arrayList3) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }
}
