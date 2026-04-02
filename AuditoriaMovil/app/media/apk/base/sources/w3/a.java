package W3;

import E3.b;
import H.h;
import H.i;
import H.k;
import H4.p1;
import M3.q;
import U.j;
import U.l;
import U3.p;
import a.AbstractC0412a;
import a1.C0415A;
import android.hardware.camera2.CameraDevice;
import b3.C0585f;
import c4.InterfaceC0635d;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.S;
import g0.c;
import j3.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import l4.C1422f;
import m5.d;
import n4.C1533t;
import p.C1608t;
import p4.C1678h;
import p4.C1683m;
import p4.InterfaceC1672b;
import p4.z;
import q4.m;
import q4.o;
import r4.g;
import u4.e;
import u4.n;
import u4.r;
import w.C1914Y;
import y.u;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC0635d, n, r, j, H.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f6197a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6198b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f6199c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f6200d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f6197a = obj;
        this.f6198b = obj2;
        this.f6199c = obj3;
        this.f6200d = obj4;
    }

    @Override // u4.n
    public void a(Object obj) {
        C1422f c1422f = (C1422f) obj;
        C1533t c1533t = (C1533t) this.f6197a;
        c1533t.getClass();
        if (((AtomicBoolean) this.f6198b).compareAndSet(false, true)) {
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f6199c;
            d.i("Already fulfilled first user task", !taskCompletionSource.getTask().isComplete(), new Object[0]);
            taskCompletionSource.setResult(c1422f);
            return;
        }
        ((e) this.f6200d).a(new S(23, c1533t, c1422f));
    }

    @Override // H.a, J2.g
    public b apply(Object obj) {
        b d7;
        C1914Y c1914y = (C1914Y) this.f6197a;
        CameraDevice cameraDevice = (CameraDevice) this.f6198b;
        u uVar = (u) this.f6199c;
        List list = (List) this.f6200d;
        List list2 = (List) obj;
        if (c1914y.f16166v.f29a) {
            Iterator it = c1914y.f16148b.p().iterator();
            while (it.hasNext()) {
                ((C1914Y) it.next()).j();
            }
        }
        c1914y.l("start openCaptureSession");
        synchronized (c1914y.f16147a) {
            try {
                if (c1914y.f16157m) {
                    d7 = new k(new CancellationException("Opener is disabled"), 1);
                } else {
                    c1914y.f16148b.w(c1914y);
                    l s7 = AbstractC0412a.s(new a(c1914y, list, new C0585f(cameraDevice, c1914y.f16149c), uVar));
                    c1914y.f16153h = s7;
                    C0415A c0415a = new C0415A(c1914y);
                    s7.a(new h(0, s7, c0415a), f.r());
                    d7 = i.d(c1914y.f16153h);
                }
            } finally {
            }
        }
        return d7;
    }

    @Override // c4.InterfaceC0635d
    public Object d(q qVar) {
        return new X3.d((U3.h) qVar.a(U3.h.class), qVar.e(v4.e.class), (Executor) qVar.b((c4.r) this.f6197a), (Executor) qVar.b((c4.r) this.f6198b), (Executor) qVar.b((c4.r) this.f6199c), (ScheduledExecutorService) qVar.b((c4.r) this.f6200d));
    }

    @Override // u4.r
    public Object get() {
        C1683m c1683m = (C1683m) this.f6197a;
        HashMap p7 = c1683m.f15270e.p((HashSet) this.f6198b);
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : p7.entrySet()) {
            if (((q4.n) entry.getValue()).f15363b.equals(m.INVALID)) {
                hashSet.add((q4.h) entry.getKey());
            }
        }
        E.e eVar = c1683m.f;
        eVar.getClass();
        HashMap hashMap = new HashMap();
        eVar.T(hashMap, p7.keySet());
        HashMap y2 = eVar.y(p7, hashMap, new HashSet());
        ArrayList arrayList = new ArrayList();
        List list = (List) this.f6199c;
        Iterator it = list.iterator();
        while (true) {
            o oVar = null;
            if (!it.hasNext()) {
                break;
            }
            r4.h hVar = (r4.h) it.next();
            q4.n nVar = ((z) y2.get(hVar.f15496a)).f15310a;
            for (g gVar : hVar.f15498c) {
                p1 a7 = gVar.f15495b.a(nVar.f15366e.f(gVar.f15494a));
                if (a7 != null) {
                    if (oVar == null) {
                        oVar = new o();
                    }
                    oVar.g(a7, gVar.f15494a);
                }
            }
            if (oVar != null) {
                arrayList.add(new r4.l(hVar.f15496a, oVar, o.c(oVar.b().N()), r4.m.a(true)));
            }
        }
        r4.i a8 = c1683m.f15268c.a((p) this.f6200d, arrayList, list);
        HashMap hashMap2 = new HashMap();
        Iterator it2 = a8.b().iterator();
        while (it2.hasNext()) {
            q4.h hVar2 = (q4.h) it2.next();
            q4.n nVar2 = ((z) y2.get(hVar2)).f15310a;
            r4.f a9 = a8.a(nVar2, ((z) y2.get(hVar2)).f15311b);
            if (hashSet.contains(hVar2)) {
                a9 = null;
            }
            r4.h c8 = r4.h.c(nVar2, a9);
            if (c8 != null) {
                hashMap2.put(hVar2, c8);
            }
            if (nVar2.f15363b.equals(m.INVALID)) {
                nVar2.b(q4.q.f15370b);
            }
        }
        InterfaceC1672b interfaceC1672b = c1683m.f15269d;
        int i7 = a8.f15499a;
        interfaceC1672b.i(i7, hashMap2);
        return C1678h.a(i7, y2);
    }

    @Override // U.j
    public Object i(U.i iVar) {
        boolean z7;
        String str;
        C1914Y c1914y = (C1914Y) this.f6197a;
        List list = (List) this.f6198b;
        C0585f c0585f = (C0585f) this.f6199c;
        u uVar = (u) this.f6200d;
        synchronized (c1914y.f16147a) {
            c1914y.m(list);
            if (c1914y.f16154i == null) {
                z7 = true;
            } else {
                z7 = false;
            }
            c.g("The openCaptureSessionCompleter can only set once!", z7);
            c1914y.f16154i = iVar;
            ((C1608t) c0585f.f8171b).w(uVar);
            str = "openCaptureSession[session=" + c1914y + "]";
        }
        return str;
    }
}
