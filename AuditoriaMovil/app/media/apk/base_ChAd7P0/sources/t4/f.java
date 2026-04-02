package T4;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import g1.C1006c;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import s3.C1786n;
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final Set f5357a;

    /* renamed from: b  reason: collision with root package name */
    public C.b f5358b;

    /* renamed from: c  reason: collision with root package name */
    public C1006c f5359c;

    /* renamed from: d  reason: collision with root package name */
    public X4.b f5360d;

    /* renamed from: e  reason: collision with root package name */
    public float f5361e;
    public final /* synthetic */ h f;

    public f(h hVar, Set set) {
        this.f = hVar;
        this.f5357a = set;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, s3.l] */
    @Override // java.lang.Runnable
    public final void run() {
        Set emptySet;
        Set emptySet2;
        boolean z7;
        LatLngBounds a7;
        ArrayList arrayList;
        LatLngBounds latLngBounds;
        Object obj;
        h hVar = this.f;
        Set set = hVar.f5376l;
        if (set != null) {
            emptySet = DesugarCollections.unmodifiableSet(set);
        } else {
            emptySet = Collections.emptySet();
        }
        Set<R4.a> set2 = this.f5357a;
        if (set2 != null) {
            emptySet2 = DesugarCollections.unmodifiableSet(set2);
        } else {
            emptySet2 = Collections.emptySet();
        }
        if (emptySet2.equals(emptySet)) {
            this.f5358b.run();
            return;
        }
        d dVar = new d(hVar);
        float f = this.f5361e;
        float f4 = hVar.f5378n;
        boolean z8 = true;
        if (f > f4) {
            z7 = true;
        } else {
            z7 = false;
        }
        float f8 = f - f4;
        Set<e> set3 = hVar.f5373h;
        try {
            a7 = this.f5359c.D().f15586e;
        } catch (Exception e7) {
            e7.printStackTrace();
            ?? obj2 = new Object();
            obj2.f15620a = Double.POSITIVE_INFINITY;
            obj2.f15621b = Double.NEGATIVE_INFINITY;
            obj2.f15622c = Double.NaN;
            obj2.f15623d = Double.NaN;
            obj2.b(new LatLng(0.0d, 0.0d));
            a7 = obj2.a();
        }
        if (hVar.f5376l != null && hVar.f5370d) {
            arrayList = new ArrayList();
            for (R4.a aVar : hVar.f5376l) {
                if (aVar.d() >= hVar.f5375k && a7.k(aVar.a())) {
                    arrayList.add(this.f5360d.b(aVar.a()));
                }
            }
        } else {
            arrayList = null;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        for (R4.a aVar2 : set2) {
            boolean k2 = a7.k(aVar2.a());
            if (z7 && k2 && hVar.f5370d) {
                X4.a a8 = h.a(hVar, arrayList, this.f5360d.b(aVar2.a()));
                if (a8 != null) {
                    dVar.a(z8, new c(hVar, aVar2, newSetFromMap, this.f5360d.a(a8)));
                    obj = null;
                } else {
                    obj = null;
                    dVar.a(z8, new c(hVar, aVar2, newSetFromMap, null));
                }
            } else {
                dVar.a(k2, new c(hVar, aVar2, newSetFromMap, null));
            }
            z8 = true;
        }
        ArrayList arrayList2 = null;
        dVar.e();
        set3.removeAll(newSetFromMap);
        if (hVar.f5370d) {
            arrayList2 = new ArrayList();
            for (R4.a aVar3 : set2) {
                if (aVar3.d() >= hVar.f5375k && a7.k(aVar3.a())) {
                    arrayList2.add(this.f5360d.b(aVar3.a()));
                }
            }
        }
        for (e eVar : set3) {
            boolean k8 = a7.k(eVar.f5356b);
            C1786n c1786n = eVar.f5355a;
            if (!z7 && f8 > -3.0f && k8 && hVar.f5370d) {
                X4.a a9 = h.a(hVar, arrayList2, this.f5360d.b(eVar.f5356b));
                if (a9 != null) {
                    LatLng a10 = this.f5360d.a(a9);
                    LatLng latLng = eVar.f5356b;
                    ReentrantLock reentrantLock = dVar.f5350a;
                    reentrantLock.lock();
                    latLngBounds = a7;
                    h hVar2 = dVar.f5349Z;
                    b bVar = new b(hVar2, eVar, latLng, a10);
                    bVar.f = hVar2.f5369c.f4771a;
                    bVar.f5341e = true;
                    dVar.f5347X.add(bVar);
                    reentrantLock.unlock();
                } else {
                    latLngBounds = a7;
                    dVar.d(c1786n, true);
                }
            } else {
                latLngBounds = a7;
                dVar.d(c1786n, k8);
            }
            a7 = latLngBounds;
        }
        dVar.e();
        hVar.f5373h = newSetFromMap;
        hVar.f5376l = set2;
        hVar.f5378n = f;
        this.f5358b.run();
    }
}
