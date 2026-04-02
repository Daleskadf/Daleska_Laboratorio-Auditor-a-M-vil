package Y1;

import D.AbstractC0059i;
import java.util.ArrayList;
/* renamed from: Y1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0401b extends r {

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f6624e;
    public ArrayList f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f6625g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f6626h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f6627i;
    public ArrayList j;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f6628k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f6629l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f6630m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f6631n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f6632o;

    public static void c(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    @Override // Y1.r
    public final void a() {
        ArrayList arrayList = this.f6625g;
        int size = arrayList.size() - 1;
        if (size < 0) {
            ArrayList arrayList2 = this.f6624e;
            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                if (arrayList2.get(size2) == null) {
                    if (this.f6681a == null) {
                        arrayList2.remove(size2);
                    } else {
                        throw null;
                    }
                } else {
                    throw new ClassCastException();
                }
            }
            ArrayList arrayList3 = this.f;
            int size3 = arrayList3.size() - 1;
            if (size3 < 0) {
                ArrayList arrayList4 = this.f6626h;
                int size4 = arrayList4.size() - 1;
                if (size4 < 0) {
                    arrayList4.clear();
                    if (!b()) {
                        return;
                    }
                    ArrayList arrayList5 = this.j;
                    for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                        ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                        int size6 = arrayList6.size() - 1;
                        if (size6 >= 0) {
                            AbstractC0059i.I(arrayList6.get(size6));
                            throw null;
                        }
                    }
                    ArrayList arrayList7 = this.f6627i;
                    for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                        ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                        int size8 = arrayList8.size() - 1;
                        if (size8 >= 0) {
                            arrayList8.get(size8).getClass();
                            throw new ClassCastException();
                        }
                    }
                    ArrayList arrayList9 = this.f6628k;
                    for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                        ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                        int size10 = arrayList10.size() - 1;
                        if (size10 >= 0) {
                            AbstractC0059i.I(arrayList10.get(size10));
                            throw null;
                        }
                    }
                    c(this.f6631n);
                    c(this.f6630m);
                    c(this.f6629l);
                    c(this.f6632o);
                    ArrayList arrayList11 = this.f6682b;
                    if (arrayList11.size() <= 0) {
                        arrayList11.clear();
                        return;
                    } else {
                        arrayList11.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
                AbstractC0059i.I(arrayList4.get(size4));
                throw null;
            }
            arrayList3.get(size3).getClass();
            throw new ClassCastException();
        }
        AbstractC0059i.I(arrayList.get(size));
        throw null;
    }

    @Override // Y1.r
    public final boolean b() {
        if (this.f.isEmpty() && this.f6626h.isEmpty() && this.f6625g.isEmpty() && this.f6624e.isEmpty() && this.f6630m.isEmpty() && this.f6631n.isEmpty() && this.f6629l.isEmpty() && this.f6632o.isEmpty() && this.j.isEmpty() && this.f6627i.isEmpty() && this.f6628k.isEmpty()) {
            return false;
        }
        return true;
    }
}
