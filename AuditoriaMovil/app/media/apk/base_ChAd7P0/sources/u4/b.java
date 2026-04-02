package U4;

import a.AbstractC0412a;
import android.os.Handler;
import android.os.Looper;
import g1.C1006c;
import io.flutter.plugins.googlemaps.C1168c0;
import io.flutter.plugins.googlemaps.C1177j;
import io.flutter.plugins.googlemaps.r;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p.C1608t;
import q3.c;
import q3.d;
import q3.e;
import s3.BinderC1771F;
import s3.C1767B;
import s3.C1786n;
/* loaded from: classes.dex */
public final class b implements q3.b, d, e, c {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f5773a;

    /* renamed from: b  reason: collision with root package name */
    public C1608t f5774b;

    public b() {
        this.f5773a = new HashMap();
    }

    @Override // q3.b
    public void W(C1786n c1786n) {
        q3.b bVar;
        a aVar = (a) this.f5773a.get(c1786n);
        if (aVar != null && (bVar = aVar.f5769c) != null) {
            bVar.W(c1786n);
        }
    }

    @Override // q3.c
    public void a(C1786n c1786n) {
        c cVar;
        a aVar = (a) this.f5773a.get(c1786n);
        if (aVar != null && (cVar = aVar.f5770d) != null) {
            cVar.a(c1786n);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [s3.C, java.lang.Object, W4.c] */
    public void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = ((C1168c0) it.next()).f12118a;
            if (map != null) {
                C1006c c1006c = new C1006c(2);
                String y2 = AbstractC0412a.y(map, c1006c);
                W4.b bVar = (W4.b) c1006c.f11091a;
                if (bVar.f6204a != null) {
                    ?? obj = new Object();
                    obj.f6214b = bVar.f6204a;
                    int i7 = bVar.f6205b;
                    obj.f6216d = i7;
                    obj.f6217e = bVar.f6206c;
                    obj.f6211Y = bVar.f6207d;
                    obj.f6218e0 = bVar.f6208e;
                    obj.f6210X = W4.c.a(i7, i7 / 3.0d);
                    obj.c(obj.f6217e);
                    obj.d(obj.f6214b);
                    C1608t c1608t = this.f5774b;
                    C1767B c1767b = new C1767B();
                    c1767b.f15576a = new BinderC1771F(obj);
                    this.f5773a.put(y2, new r(obj, c1608t.r(c1767b)));
                } else {
                    throw new IllegalStateException("No input data: you must use either .data or .weightedData before building");
                }
            }
        }
    }

    @Override // q3.d
    public boolean e(C1786n c1786n) {
        d dVar;
        a aVar = (a) this.f5773a.get(c1786n);
        if (aVar != null && (dVar = aVar.f5771e) != null) {
            return dVar.e(c1786n);
        }
        return false;
    }

    @Override // q3.e
    public void f(C1786n c1786n) {
        C1177j c1177j;
        a aVar = (a) this.f5773a.get(c1786n);
        if (aVar != null && (c1177j = aVar.f) != null) {
            c1177j.f(c1786n);
        }
    }

    @Override // q3.e
    public void p(C1786n c1786n) {
        C1177j c1177j;
        a aVar = (a) this.f5773a.get(c1786n);
        if (aVar != null && (c1177j = aVar.f) != null) {
            c1177j.p(c1786n);
        }
    }

    @Override // q3.e
    public void y(C1786n c1786n) {
        C1177j c1177j;
        a aVar = (a) this.f5773a.get(c1786n);
        if (aVar != null && (c1177j = aVar.f) != null) {
            c1177j.y(c1786n);
        }
    }

    public b(C1608t c1608t) {
        new HashMap();
        this.f5773a = new HashMap();
        this.f5774b = c1608t;
        new Handler(Looper.getMainLooper()).post(new G.c(this, 5));
    }
}
