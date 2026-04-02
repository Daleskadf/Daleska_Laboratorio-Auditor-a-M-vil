package C5;

import B5.AbstractActivityC0032e;
import B5.C0035h;
import a1.C0415A;
import a6.t0;
import android.content.Context;
import android.os.Trace;
import android.util.Log;
import androidx.lifecycle.C0570w;
import io.flutter.plugin.platform.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import n4.C1521g;
import n4.D;
import n4.Q;
import n4.S;
import n4.T;
import n4.x;
import q4.n;
import t4.w;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f577a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f578b;

    /* renamed from: c  reason: collision with root package name */
    public Serializable f579c;

    /* renamed from: d  reason: collision with root package name */
    public Object f580d;

    /* renamed from: e  reason: collision with root package name */
    public Object f581e;
    public Object f;

    /* renamed from: g  reason: collision with root package name */
    public Object f582g;

    public e(D d7, e4.e eVar) {
        this.f578b = d7;
        this.f579c = S.NONE;
        this.f580d = new q4.i(q4.g.f15354a, new e4.e(Collections.emptyList(), new K.a(d7.a(), 3)));
        this.f581e = eVar;
        e4.e eVar2 = q4.h.f15356c;
        this.f = eVar2;
        this.f582g = eVar2;
    }

    public static int d(C1521g c1521g) {
        int i7 = Q.f14320a[c1521g.f14338a.ordinal()];
        int i8 = 1;
        if (i7 != 1) {
            i8 = 2;
            if (i7 != 2 && i7 != 3) {
                if (i7 == 4) {
                    return 0;
                }
                throw new IllegalArgumentException("Unknown change type: " + c1521g.f14338a);
            }
        }
        return i8;
    }

    public void a(H5.b bVar) {
        Y5.a.b("FlutterEngineConnectionRegistry#add ".concat(bVar.getClass().getSimpleName()));
        try {
            Class<?> cls = bVar.getClass();
            HashMap hashMap = (HashMap) this.f578b;
            if (hashMap.containsKey(cls)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + bVar + ") but it was already registered with this FlutterEngine (" + ((c) this.f580d) + ").");
                Trace.endSection();
                return;
            }
            bVar.toString();
            hashMap.put(bVar.getClass(), bVar);
            bVar.onAttachedToEngine((H5.a) this.f581e);
            if (bVar instanceof I5.a) {
                I5.a aVar = (I5.a) bVar;
                ((HashMap) this.f579c).put(bVar.getClass(), aVar);
                if (h()) {
                    aVar.onAttachedToActivity((d) this.f582g);
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public t0 b(K5.d dVar, w wVar, boolean z7) {
        List list;
        n nVar;
        S s7;
        boolean z8;
        boolean z9;
        boolean z10;
        T t7;
        m5.d.i("Cannot apply changes that need a refill", !dVar.f2698b, new Object[0]);
        q4.i iVar = (q4.i) this.f580d;
        this.f580d = (q4.i) dVar.f2699c;
        this.f582g = (e4.e) dVar.f2701e;
        C0415A c0415a = (C0415A) dVar.f2700d;
        c0415a.getClass();
        ArrayList arrayList = new ArrayList(((TreeMap) c0415a.f6744a).values());
        Collections.sort(arrayList, new K.a(this, 2));
        if (wVar != null) {
            Iterator it = wVar.f15851c.iterator();
            while (true) {
                e4.d dVar2 = (e4.d) it;
                if (!((Iterator) dVar2.f10875b).hasNext()) {
                    break;
                }
                this.f581e = ((e4.e) this.f581e).e((q4.h) dVar2.next());
            }
            Iterator it2 = wVar.f15852d.iterator();
            while (true) {
                e4.d dVar3 = (e4.d) it2;
                if (!((Iterator) dVar3.f10875b).hasNext()) {
                    break;
                }
                q4.h hVar = (q4.h) dVar3.next();
                m5.d.i("Modified document %s not found in view.", ((e4.e) this.f581e).f10876a.e(hVar), hVar);
            }
            Iterator it3 = wVar.f15853e.iterator();
            while (true) {
                e4.d dVar4 = (e4.d) it3;
                if (!((Iterator) dVar4.f10875b).hasNext()) {
                    break;
                }
                this.f581e = ((e4.e) this.f581e).h((q4.h) dVar4.next());
            }
            this.f577a = wVar.f15850b;
        }
        if (z7) {
            list = Collections.emptyList();
        } else if (!this.f577a) {
            list = Collections.emptyList();
        } else {
            e4.e eVar = (e4.e) this.f;
            this.f = q4.h.f15356c;
            Iterator it4 = ((q4.i) this.f580d).f15359b.iterator();
            while (true) {
                e4.d dVar5 = (e4.d) it4;
                if (!((Iterator) dVar5.f10875b).hasNext()) {
                    break;
                }
                n nVar2 = (n) dVar5.next();
                q4.h hVar2 = nVar2.f15362a;
                if (!((e4.e) this.f581e).f10876a.e(hVar2) && (nVar = (n) ((q4.i) this.f580d).f15358a.f(hVar2)) != null && !nVar.c()) {
                    this.f = ((e4.e) this.f).e(nVar2.f15362a);
                }
            }
            ArrayList arrayList2 = new ArrayList(((e4.e) this.f).f10876a.size() + eVar.f10876a.size());
            Iterator it5 = eVar.iterator();
            while (true) {
                e4.d dVar6 = (e4.d) it5;
                if (!((Iterator) dVar6.f10875b).hasNext()) {
                    break;
                }
                q4.h hVar3 = (q4.h) dVar6.next();
                if (!((e4.e) this.f).f10876a.e(hVar3)) {
                    arrayList2.add(new x(n4.w.REMOVED, hVar3));
                }
            }
            Iterator it6 = ((e4.e) this.f).iterator();
            while (true) {
                e4.d dVar7 = (e4.d) it6;
                if (!((Iterator) dVar7.f10875b).hasNext()) {
                    break;
                }
                q4.h hVar4 = (q4.h) dVar7.next();
                if (!eVar.f10876a.e(hVar4)) {
                    arrayList2.add(new x(n4.w.ADDED, hVar4));
                }
            }
            list = arrayList2;
        }
        if (((e4.e) this.f).f10876a.size() == 0 && this.f577a && !z7) {
            s7 = S.SYNCED;
        } else {
            s7 = S.LOCAL;
        }
        if (s7 != ((S) this.f579c)) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f579c = s7;
        if (arrayList.size() == 0 && !z8) {
            t7 = null;
        } else {
            if (s7 == S.LOCAL) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (wVar == null || wVar.f15849a.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            t7 = new T((D) this.f578b, (q4.i) dVar.f2699c, iVar, arrayList, z9, (e4.e) dVar.f2701e, z8, false, z10);
        }
        return new t0(29, t7, list);
    }

    public void c(AbstractActivityC0032e abstractActivityC0032e, C0570w c0570w) {
        boolean z7;
        this.f582g = new d(abstractActivityC0032e, c0570w);
        if (abstractActivityC0032e.getIntent() != null) {
            z7 = abstractActivityC0032e.getIntent().getBooleanExtra("enable-software-rendering", false);
        } else {
            z7 = false;
        }
        c cVar = (c) this.f580d;
        o oVar = cVar.f568r;
        oVar.f11734u = z7;
        if (oVar.f11718c == null) {
            oVar.f11718c = abstractActivityC0032e;
            oVar.f11720e = cVar.f554b;
            A.f fVar = new A.f(cVar.f555c, 21);
            oVar.f11721g = fVar;
            fVar.f11c = oVar.f11735v;
            for (I5.a aVar : ((HashMap) this.f579c).values()) {
                if (this.f577a) {
                    aVar.onReattachedToActivityForConfigChanges((d) this.f582g);
                } else {
                    aVar.onAttachedToActivity((d) this.f582g);
                }
            }
            this.f577a = false;
            return;
        }
        throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x011f, code lost:
        if (r4.a().compare(r2, r5) > 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012b, code lost:
        if (r4.a().compare(r2, r11) < 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015e, code lost:
        if (r11 == null) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public K5.d e(e4.c r21, K5.d r22) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C5.e.e(e4.c, K5.d):K5.d");
    }

    public void f() {
        if (h()) {
            Y5.a.b("FlutterEngineConnectionRegistry#detachFromActivity");
            try {
                for (I5.a aVar : ((HashMap) this.f579c).values()) {
                    aVar.onDetachedFromActivity();
                }
                o oVar = ((c) this.f580d).f568r;
                A.f fVar = oVar.f11721g;
                if (fVar != null) {
                    fVar.f11c = null;
                }
                oVar.c();
                oVar.f11721g = null;
                oVar.f11718c = null;
                oVar.f11720e = null;
                this.f = null;
                this.f582g = null;
                Trace.endSection();
                return;
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
    }

    public void g() {
        if (h()) {
            f();
        }
    }

    public boolean h() {
        if (((C0035h) this.f) != null) {
            return true;
        }
        return false;
    }

    public e(Context context, c cVar, F5.d dVar) {
        this.f578b = new HashMap();
        this.f579c = new HashMap();
        this.f577a = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.f580d = cVar;
        this.f581e = new H5.a(context, cVar.f555c, cVar.f554b, cVar.f568r.f11716a, new A4.c(dVar, 5));
    }
}
