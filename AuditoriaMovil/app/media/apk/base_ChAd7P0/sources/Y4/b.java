package Y4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final V4.a f6703a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6704b;

    /* renamed from: c  reason: collision with root package name */
    public LinkedHashSet f6705c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f6706d;

    public b(double d7, double d8, double d9, double d10, int i7) {
        this(new V4.a(d7, d8, d9, d10), i7);
    }

    public final void a(double d7, double d8, a aVar) {
        int i7;
        ArrayList arrayList = this.f6706d;
        V4.a aVar2 = this.f6703a;
        if (arrayList != null) {
            int i8 = (d8 > aVar2.f ? 1 : (d8 == aVar2.f ? 0 : -1));
            double d9 = aVar2.f5973e;
            if (i8 < 0) {
                if (d7 < d9) {
                    ((b) arrayList.get(0)).a(d7, d8, aVar);
                    return;
                } else {
                    ((b) arrayList.get(1)).a(d7, d8, aVar);
                    return;
                }
            } else if (d7 < d9) {
                ((b) arrayList.get(2)).a(d7, d8, aVar);
                return;
            } else {
                ((b) arrayList.get(3)).a(d7, d8, aVar);
                return;
            }
        }
        if (this.f6705c == null) {
            this.f6705c = new LinkedHashSet();
        }
        this.f6705c.add(aVar);
        if (this.f6705c.size() > 50 && (i7 = this.f6704b) < 40) {
            ArrayList arrayList2 = new ArrayList(4);
            this.f6706d = arrayList2;
            int i9 = 1 + i7;
            arrayList2.add(new b(aVar2.f5969a, aVar2.f5973e, aVar2.f5970b, aVar2.f, i9));
            this.f6706d.add(new b(aVar2.f5973e, aVar2.f5971c, aVar2.f5970b, aVar2.f, i9));
            this.f6706d.add(new b(aVar2.f5969a, aVar2.f5973e, aVar2.f, aVar2.f5972d, i9));
            this.f6706d.add(new b(aVar2.f5973e, aVar2.f5971c, aVar2.f, aVar2.f5972d, i9));
            LinkedHashSet<a> linkedHashSet = this.f6705c;
            this.f6705c = null;
            for (a aVar3 : linkedHashSet) {
                a(aVar3.b().f6398a, aVar3.b().f6399b, aVar3);
            }
        }
    }

    public final boolean b(double d7, double d8, S4.a aVar) {
        ArrayList arrayList = this.f6706d;
        if (arrayList != null) {
            V4.a aVar2 = this.f6703a;
            int i7 = (d8 > aVar2.f ? 1 : (d8 == aVar2.f ? 0 : -1));
            double d9 = aVar2.f5973e;
            if (i7 < 0) {
                if (d7 < d9) {
                    return ((b) arrayList.get(0)).b(d7, d8, aVar);
                }
                return ((b) arrayList.get(1)).b(d7, d8, aVar);
            } else if (d7 < d9) {
                return ((b) arrayList.get(2)).b(d7, d8, aVar);
            } else {
                return ((b) arrayList.get(3)).b(d7, d8, aVar);
            }
        }
        LinkedHashSet linkedHashSet = this.f6705c;
        if (linkedHashSet == null) {
            return false;
        }
        return linkedHashSet.remove(aVar);
    }

    public final void c(V4.a aVar, ArrayList arrayList) {
        V4.a aVar2 = this.f6703a;
        double d7 = aVar2.f5971c;
        double d8 = aVar.f5969a;
        if (d8 < d7) {
            double d9 = aVar2.f5969a;
            double d10 = aVar.f5971c;
            if (d9 < d10) {
                double d11 = aVar.f5970b;
                double d12 = aVar2.f5972d;
                if (d11 < d12) {
                    double d13 = aVar2.f5970b;
                    double d14 = aVar.f5972d;
                    if (d13 < d14) {
                        ArrayList arrayList2 = this.f6706d;
                        if (arrayList2 != null) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                ((b) it.next()).c(aVar, arrayList);
                            }
                            return;
                        }
                        LinkedHashSet<a> linkedHashSet = this.f6705c;
                        if (linkedHashSet != null) {
                            if (d9 >= d8 && d7 <= d10 && d13 >= d11 && d12 <= d14) {
                                arrayList.addAll(linkedHashSet);
                                return;
                            }
                            for (a aVar3 : linkedHashSet) {
                                X4.a b5 = aVar3.b();
                                if (aVar.a(b5.f6398a, b5.f6399b)) {
                                    arrayList.add(aVar3);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public b(V4.a aVar, int i7) {
        this.f6706d = null;
        this.f6703a = aVar;
        this.f6704b = i7;
    }
}
