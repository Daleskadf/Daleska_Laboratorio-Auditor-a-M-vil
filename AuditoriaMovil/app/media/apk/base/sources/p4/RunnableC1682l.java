package p4;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import l4.C1418b;
import p.C1608t;
import q4.C1708a;
/* renamed from: p4.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1682l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15262a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1683m f15263b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f15264c;

    public /* synthetic */ RunnableC1682l(C1683m c1683m, ArrayList arrayList, int i7) {
        this.f15262a = i7;
        this.f15263b = c1683m;
        this.f15264c = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        ArrayList arrayList = this.f15264c;
        C1683m c1683m = this.f15263b;
        int i7 = 1;
        switch (this.f15262a) {
            case 0:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C1685o c1685o = (C1685o) it.next();
                    int i8 = c1685o.f15278a;
                    e4.e eVar = c1685o.f15280c;
                    C1608t c1608t = c1683m.f15272h;
                    c1608t.getClass();
                    Iterator it2 = eVar.iterator();
                    while (true) {
                        e4.d dVar = (e4.d) it2;
                        if (((Iterator) dVar.f10875b).hasNext()) {
                            C1673c c1673c = new C1673c((q4.h) dVar.next(), i8);
                            c1608t.f14880b = ((e4.e) c1608t.f14880b).e(c1673c);
                            c1608t.f14881c = ((e4.e) c1608t.f14881c).e(c1673c);
                        } else {
                            e4.e eVar2 = c1685o.f15281d;
                            Iterator it3 = eVar2.iterator();
                            while (true) {
                                e4.d dVar2 = (e4.d) it3;
                                if (((Iterator) dVar2.f10875b).hasNext()) {
                                    c1683m.f15266a.t().D((q4.h) dVar2.next());
                                } else {
                                    Iterator it4 = eVar2.iterator();
                                    while (true) {
                                        e4.d dVar3 = (e4.d) it4;
                                        if (((Iterator) dVar3.f10875b).hasNext()) {
                                            C1673c c1673c2 = new C1673c((q4.h) dVar3.next(), i8);
                                            c1608t.f14880b = ((e4.e) c1608t.f14880b).h(c1673c2);
                                            c1608t.f14881c = ((e4.e) c1608t.f14881c).h(c1673c2);
                                        } else {
                                            if (!c1685o.f15279b) {
                                                SparseArray sparseArray = c1683m.f15274k;
                                                Y y2 = (Y) sparseArray.get(i8);
                                                if (y2 != null) {
                                                    z7 = i7;
                                                } else {
                                                    z7 = 0;
                                                }
                                                Object[] objArr = new Object[i7];
                                                objArr[0] = Integer.valueOf(i8);
                                                m5.d.i("Can't set limbo-free snapshot version for unknown target: %s", z7, objArr);
                                                q4.q qVar = y2.f15239e;
                                                Y y3 = new Y(y2.f15235a, y2.f15236b, y2.f15237c, y2.f15238d, qVar, qVar, y2.f15240g, y2.f15241h);
                                                sparseArray.put(i8, y3);
                                                if (C1683m.e(y2, y3, null)) {
                                                    c1683m.f15273i.j(y3);
                                                }
                                            }
                                            i7 = 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            default:
                Collection x7 = c1683m.f15267b.x();
                K1.d dVar4 = C1708a.f;
                final InterfaceC1677g interfaceC1677g = c1683m.f15267b;
                Objects.requireNonNull(interfaceC1677g);
                u4.g gVar = new u4.g() { // from class: p4.k
                    @Override // u4.g
                    public final void accept(Object obj) {
                        switch (r2) {
                            case 0:
                                interfaceC1677g.k((C1708a) obj);
                                return;
                            default:
                                interfaceC1677g.w((C1708a) obj);
                                return;
                        }
                    }
                };
                final InterfaceC1677g interfaceC1677g2 = c1683m.f15267b;
                Objects.requireNonNull(interfaceC1677g2);
                u4.g gVar2 = new u4.g() { // from class: p4.k
                    @Override // u4.g
                    public final void accept(Object obj) {
                        switch (r2) {
                            case 0:
                                interfaceC1677g2.k((C1708a) obj);
                                return;
                            default:
                                interfaceC1677g2.w((C1708a) obj);
                                return;
                        }
                    }
                };
                C1418b c1418b = u4.u.f16019a;
                ArrayList arrayList2 = new ArrayList(x7);
                Collections.sort(arrayList2, dVar4);
                ArrayList arrayList3 = new ArrayList(arrayList);
                Collections.sort(arrayList3, dVar4);
                u4.u.g(arrayList2.iterator(), arrayList3.iterator(), dVar4, gVar, gVar2);
                return;
        }
    }
}
