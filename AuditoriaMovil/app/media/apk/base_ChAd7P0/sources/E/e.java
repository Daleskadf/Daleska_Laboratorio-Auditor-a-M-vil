package E;

import A3.AbstractC0021t;
import B5.L;
import D.AbstractC0059i;
import D.C0054d;
import D.J;
import D.n0;
import D.t0;
import F6.H;
import F6.InterfaceC0091h0;
import G3.C0118f;
import H4.e1;
import J1.l;
import K0.x;
import M3.s;
import M3.t;
import M3.u;
import N2.h;
import U3.p;
import a6.S;
import a6.o0;
import android.accounts.Account;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.core.impl.F;
import b4.C0610s;
import b6.C0615a;
import b6.C0616b;
import c6.Q0;
import c6.Z0;
import c6.k2;
import c6.q2;
import c6.s2;
import com.example.appecoactivate.R;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.auth.zze;
import com.google.android.gms.internal.p002firebaseauthapi.zzadr;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.InterfaceC0816s;
import com.google.firebase.firestore.Z;
import com.google.maps.android.ui.RotationLayout;
import e1.AbstractC0945j;
import e1.C0960z;
import e1.InterfaceC0934D;
import e1.b0;
import e1.r;
import e4.g;
import e4.i;
import e4.k;
import e4.m;
import g1.C1006c;
import h3.AbstractC1079a;
import j$.util.Objects;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import k6.InterfaceC1408a;
import m6.AbstractC1447h;
import n4.C1526l;
import n4.D;
import n4.E;
import p0.C1632K;
import p4.C;
import p4.InterfaceC1672b;
import p4.InterfaceC1677g;
import p4.InterfaceC1693x;
import p4.z;
import q4.C1709b;
import q4.n;
import t4.C1824d;
import t4.ComponentCallbacks2C1825e;
import t4.EnumC1827g;
import t4.RunnableC1822b;
import u0.C1856l;
import u0.C1859o;
import u4.q;
import u5.InterfaceC1875c;
import v0.C1879a;
import v0.C1880b;
import w.C1908S;
import w.g0;
import x.j;
import z0.AbstractComponentCallbacksC2061v;
import z0.N;
import z0.T;
/* loaded from: classes.dex */
public final class e implements F2.b, l, h, Continuation, InterfaceC0934D, T0.e, InterfaceC1875c, g0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f919a;

    /* renamed from: b  reason: collision with root package name */
    public Object f920b;

    /* renamed from: c  reason: collision with root package name */
    public Object f921c;

    /* renamed from: d  reason: collision with root package name */
    public Object f922d;

    /* renamed from: e  reason: collision with root package name */
    public Object f923e;

    public /* synthetic */ e(int i7, boolean z7) {
        this.f919a = i7;
    }

    public static void c0(long j, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            hashMap.remove(arrayList.get(i7));
        }
    }

    public static m v(List list, Map map, Comparator comparator) {
        boolean z7;
        e eVar = new e(list, map);
        Collections.sort(list, comparator);
        e4.l lVar = new e4.l(list.size());
        int i7 = lVar.f10884b - 1;
        int size = list.size();
        while (i7 >= 0) {
            if ((lVar.f10883a & (1 << i7)) == 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            int pow = (int) Math.pow(2.0d, i7);
            i7--;
            size -= pow;
            if (z7) {
                eVar.w(e4.h.BLACK, pow, size);
            } else {
                eVar.w(e4.h.BLACK, pow, size);
                size -= pow;
                eVar.w(e4.h.RED, pow, size);
            }
        }
        i iVar = (k) eVar.f922d;
        if (iVar == null) {
            iVar = g.f10878a;
        }
        return new m(iVar, comparator);
    }

    @Override // e1.InterfaceC0934D
    public void A(int i7, C0960z c0960z, r rVar, b1.g gVar, IOException iOException, boolean z7) {
        if (P(i7, c0960z)) {
            ((T0.d) this.f921c).j(rVar, Q(gVar, c0960z), iOException, z7);
        }
    }

    @Override // e1.InterfaceC0934D
    public void B(int i7, C0960z c0960z, b1.g gVar) {
        if (P(i7, c0960z)) {
            ((T0.d) this.f921c).b(Q(gVar, c0960z));
        }
    }

    @Override // e1.InterfaceC0934D
    public void C(int i7, C0960z c0960z, b1.g gVar) {
        if (P(i7, c0960z)) {
            ((T0.d) this.f921c).m(Q(gVar, c0960z));
        }
    }

    public AbstractComponentCallbacksC2061v D(String str) {
        T t7 = (T) ((HashMap) this.f921c).get(str);
        if (t7 != null) {
            return t7.f16712c;
        }
        return null;
    }

    public AbstractComponentCallbacksC2061v E(String str) {
        for (T t7 : ((HashMap) this.f921c).values()) {
            if (t7 != null) {
                AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = t7.f16712c;
                if (!str.equals(abstractComponentCallbacksC2061v.f16830e)) {
                    abstractComponentCallbacksC2061v = abstractComponentCallbacksC2061v.f16842p0.f16660c.E(str);
                }
                if (abstractComponentCallbacksC2061v != null) {
                    return abstractComponentCallbacksC2061v;
                }
            }
        }
        return null;
    }

    public ArrayList F() {
        ArrayList arrayList = new ArrayList();
        for (T t7 : ((HashMap) this.f921c).values()) {
            if (t7 != null) {
                arrayList.add(t7);
            }
        }
        return arrayList;
    }

    public ArrayList G() {
        ArrayList arrayList = new ArrayList();
        for (T t7 : ((HashMap) this.f921c).values()) {
            if (t7 != null) {
                arrayList.add(t7.f16712c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public e4.c H(Iterable iterable) {
        return L(((C) this.f920b).p(iterable), new HashSet());
    }

    public e4.c I(D d7, C1709b c1709b, L l8) {
        HashMap h8 = ((InterfaceC1672b) this.f922d).h(d7.f, c1709b.f15346c);
        HashMap i7 = ((C) this.f920b).i(d7, c1709b, h8.keySet(), l8);
        for (Map.Entry entry : h8.entrySet()) {
            if (!i7.containsKey(entry.getKey())) {
                i7.put((q4.h) entry.getKey(), n.g((q4.h) entry.getKey()));
            }
        }
        e4.c cVar = q4.g.f15354a;
        for (Map.Entry entry2 : i7.entrySet()) {
            r4.d dVar = (r4.d) h8.get(entry2.getKey());
            if (dVar != null) {
                r4.f fVar = r4.f.f15492b;
                p pVar = new p(new Date());
                dVar.f15491b.a((n) entry2.getValue(), fVar, pVar);
            }
            if (d7.g((n) entry2.getValue())) {
                cVar = cVar.m((q4.h) entry2.getKey(), (n) entry2.getValue());
            }
        }
        return cVar;
    }

    public e4.c J(D d7, C1709b c1709b, L l8) {
        n j;
        boolean e7 = d7.e();
        q4.p pVar = d7.f;
        if (e7) {
            e4.b bVar = q4.g.f15354a;
            q4.h hVar = new q4.h(pVar);
            r4.d L6 = ((InterfaceC1672b) this.f922d).L(hVar);
            if (L6 != null && !(L6.f15491b instanceof r4.l)) {
                j = n.g(hVar);
            } else {
                j = ((C) this.f920b).j(hVar);
            }
            if (L6 != null) {
                L6.f15491b.a(j, r4.f.f15492b, new p(new Date()));
            }
            if (j.d()) {
                return bVar.m(j.f15362a, j);
            }
            return bVar;
        }
        String str = d7.f14276g;
        if (str != null) {
            m5.d.i("Currently we only support collection group queries at the root.", pVar.h(), new Object[0]);
            e4.c cVar = q4.g.f15354a;
            for (q4.p pVar2 : ((InterfaceC1677g) this.f923e).c(str)) {
                for (Map.Entry entry : I(new D((q4.p) pVar2.a(str), null, d7.f14275e, d7.f14271a, d7.f14277h, d7.f14278i, d7.j, d7.f14279k), c1709b, l8)) {
                    cVar = cVar.m((q4.h) entry.getKey(), (n) entry.getValue());
                }
            }
            return cVar;
        }
        return I(d7, c1709b, l8);
    }

    public List K() {
        ArrayList arrayList;
        if (((ArrayList) this.f920b).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f920b)) {
            arrayList = new ArrayList((ArrayList) this.f920b);
        }
        return arrayList;
    }

    public e4.c L(Map map, HashSet hashSet) {
        HashMap hashMap = new HashMap();
        T(hashMap, map.keySet());
        e4.c cVar = q4.g.f15354a;
        for (Map.Entry entry : y(map, hashMap, hashSet).entrySet()) {
            cVar = cVar.m((q4.h) entry.getKey(), ((z) entry.getValue()).f15310a);
        }
        return cVar;
    }

    public boolean M() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) this.f920b).getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public void N(T t7) {
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = t7.f16712c;
        String str = abstractComponentCallbacksC2061v.f16830e;
        HashMap hashMap = (HashMap) this.f921c;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC2061v.f16830e, t7);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC2061v);
        }
    }

    public void O(T t7) {
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = t7.f16712c;
        if (abstractComponentCallbacksC2061v.f16848w0) {
            ((N) this.f923e).f(abstractComponentCallbacksC2061v);
        }
        HashMap hashMap = (HashMap) this.f921c;
        if (hashMap.get(abstractComponentCallbacksC2061v.f16830e) == t7 && ((T) hashMap.put(abstractComponentCallbacksC2061v.f16830e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC2061v);
        }
    }

    public boolean P(int i7, C0960z c0960z) {
        C0960z c0960z2;
        Object obj = this.f920b;
        AbstractC0945j abstractC0945j = (AbstractC0945j) this.f923e;
        if (c0960z != null) {
            c0960z2 = abstractC0945j.u(obj, c0960z);
            if (c0960z2 == null) {
                return false;
            }
        } else {
            c0960z2 = null;
        }
        int w2 = abstractC0945j.w(i7, obj);
        T0.d dVar = (T0.d) this.f921c;
        if (dVar.f5287a != w2 || !x.a(dVar.f5288b, c0960z2)) {
            this.f921c = new T0.d(abstractC0945j.f10773c.f5289c, w2, c0960z2);
        }
        T0.d dVar2 = (T0.d) this.f922d;
        if (dVar2.f5287a != w2 || !x.a(dVar2.f5288b, c0960z2)) {
            this.f922d = new T0.d(abstractC0945j.f10774d.f5289c, w2, c0960z2);
            return true;
        }
        return true;
    }

    public b1.g Q(b1.g gVar, C0960z c0960z) {
        AbstractC0945j abstractC0945j = (AbstractC0945j) this.f923e;
        Object obj = this.f920b;
        long j = gVar.f8138d;
        long v6 = abstractC0945j.v(obj, j);
        long j8 = gVar.f8139e;
        long v7 = abstractC0945j.v(obj, j8);
        if (v6 == j && v7 == j8) {
            return gVar;
        }
        return new b1.g(gVar.f8135a, gVar.f8136b, (H0.r) gVar.f, gVar.f8137c, gVar.f8140g, v6, v7);
    }

    public void R(o0 o0Var) {
        synchronized (this.f920b) {
            try {
                if (((o0) this.f922d) != null) {
                    return;
                }
                this.f922d = o0Var;
                boolean isEmpty = ((HashSet) this.f921c).isEmpty();
                if (isEmpty) {
                    ((Z0) this.f923e).f8680H.a(o0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void S(List list) {
        Iterator it = list.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            n4.T t7 = (n4.T) it.next();
            C1526l c1526l = (C1526l) ((HashMap) this.f921c).get(t7.f14321a);
            if (c1526l != null) {
                Iterator it2 = c1526l.f14346a.iterator();
                while (it2.hasNext()) {
                    if (((E) it2.next()).b(t7)) {
                        z7 = true;
                    }
                }
                c1526l.f14347b = t7;
            }
        }
        if (z7) {
            W();
        }
    }

    public void T(Map map, Set set) {
        TreeSet treeSet = new TreeSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            q4.h hVar = (q4.h) it.next();
            if (!map.containsKey(hVar)) {
                treeSet.add(hVar);
            }
        }
        map.putAll(((InterfaceC1672b) this.f922d).t(treeSet));
    }

    public void U(boolean z7) {
        EnumC1827g enumC1827g;
        synchronized (((ArrayList) this.f923e)) {
            try {
                Iterator it = ((ArrayList) this.f923e).iterator();
                while (it.hasNext()) {
                    u4.g gVar = (u4.g) it.next();
                    if (z7) {
                        enumC1827g = EnumC1827g.REACHABLE;
                    } else {
                        enumC1827g = EnumC1827g.UNREACHABLE;
                    }
                    gVar.accept(enumC1827g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void V() {
        q.a("AndroidConnectivityMonitor", "App has entered the foreground.", new Object[0]);
        if (M()) {
            U(true);
        }
    }

    public void W() {
        Iterator it = ((HashSet) this.f922d).iterator();
        while (it.hasNext()) {
            ((InterfaceC0816s) it.next()).a(null, null);
        }
    }

    public HashMap X(Map map) {
        r4.f fVar;
        ArrayList k2 = ((InterfaceC1693x) this.f921c).k(map.keySet());
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Iterator it = k2.iterator();
        while (it.hasNext()) {
            r4.i iVar = (r4.i) it.next();
            Iterator it2 = iVar.b().iterator();
            while (it2.hasNext()) {
                q4.h hVar = (q4.h) it2.next();
                n nVar = (n) map.get(hVar);
                if (nVar != null) {
                    if (hashMap.containsKey(hVar)) {
                        fVar = (r4.f) hashMap.get(hVar);
                    } else {
                        fVar = r4.f.f15492b;
                    }
                    hashMap.put(hVar, iVar.a(nVar, fVar));
                    int i7 = iVar.f15499a;
                    if (!treeMap.containsKey(Integer.valueOf(i7))) {
                        treeMap.put(Integer.valueOf(i7), new HashSet());
                    }
                    ((Set) treeMap.get(Integer.valueOf(i7))).add(hVar);
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (q4.h hVar2 : (Set) entry.getValue()) {
                if (!hashSet.contains(hVar2)) {
                    r4.h c8 = r4.h.c((n) map.get(hVar2), (r4.f) hashMap.get(hVar2));
                    if (c8 != null) {
                        hashMap2.put(hVar2, c8);
                    }
                    hashSet.add(hVar2);
                }
            }
            ((InterfaceC1672b) this.f922d).i(((Integer) entry.getKey()).intValue(), hashMap2);
        }
        return hashMap;
    }

    public void Y(M3.a aVar) {
        aVar.getClass();
        s sVar = new s(M3.q.class, aVar.f3224a);
        HashMap hashMap = (HashMap) this.f921c;
        if (hashMap.containsKey(sVar)) {
            M3.a aVar2 = (M3.a) hashMap.get(sVar);
            if (!aVar2.equals(aVar) || !aVar.equals(aVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + sVar);
            }
            return;
        }
        hashMap.put(sVar, aVar);
    }

    public void Z(M3.b bVar) {
        t tVar = new t(bVar.f3226a, M3.q.class);
        HashMap hashMap = (HashMap) this.f920b;
        if (hashMap.containsKey(tVar)) {
            M3.b bVar2 = (M3.b) hashMap.get(tVar);
            if (!bVar2.equals(bVar) || !bVar.equals(bVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + tVar);
            }
            return;
        }
        hashMap.put(tVar, bVar);
    }

    @Override // J1.l
    public /* synthetic */ void a() {
    }

    public void a0(M3.k kVar) {
        kVar.getClass();
        s sVar = new s(M3.r.class, kVar.f3242a);
        HashMap hashMap = (HashMap) this.f923e;
        if (hashMap.containsKey(sVar)) {
            M3.k kVar2 = (M3.k) hashMap.get(sVar);
            if (!kVar2.equals(kVar) || !kVar.equals(kVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + sVar);
            }
            return;
        }
        hashMap.put(sVar, kVar);
    }

    @Override // w.g0
    public void b(TotalCaptureResult totalCaptureResult) {
        Rect rect;
        if (((U.i) this.f922d) != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request == null) {
                rect = null;
            } else {
                rect = (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            }
            Rect rect2 = (Rect) this.f923e;
            if (rect2 != null && rect2.equals(rect)) {
                ((U.i) this.f922d).a(null);
                this.f922d = null;
                this.f923e = null;
            }
        }
    }

    public void b0(M3.l lVar) {
        t tVar = new t(lVar.f3243a, M3.r.class);
        HashMap hashMap = (HashMap) this.f922d;
        if (hashMap.containsKey(tVar)) {
            M3.l lVar2 = (M3.l) hashMap.get(tVar);
            if (!lVar2.equals(lVar) || !lVar.equals(lVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + tVar);
            }
            return;
        }
        hashMap.put(tVar, lVar);
    }

    @Override // w.g0
    public void c(float f, U.i iVar) {
        Rect rect = (Rect) ((j) this.f920b).a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        float width = rect.width() / f;
        float height = rect.height() / f;
        float width2 = (rect.width() - width) / 2.0f;
        float height2 = (rect.height() - height) / 2.0f;
        this.f921c = new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
        U.i iVar2 = (U.i) this.f922d;
        if (iVar2 != null) {
            iVar2.b(new Exception("There is a new zoomRatio being set"));
        }
        this.f923e = (Rect) this.f921c;
        this.f922d = iVar;
    }

    @Override // e1.InterfaceC0934D
    public void d(int i7, C0960z c0960z, r rVar, b1.g gVar) {
        if (P(i7, c0960z)) {
            ((T0.d) this.f921c).l(rVar, Q(gVar, c0960z));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[Catch: all -> 0x0097, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0097, blocks: (B:27:0x0066, B:31:0x0078), top: B:45:0x0066 }] */
    /* JADX WARN: Type inference failed for: r2v6, types: [O6.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d0(p6.AbstractC1700c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p0.S
            if (r0 == 0) goto L13
            r0 = r8
            p0.S r0 = (p0.S) r0
            int r1 = r0.f14975e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14975e = r1
            goto L18
        L13:
            p0.S r0 = new p0.S
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f14973c
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.f14975e
            l6.j r3 = l6.j.f13876a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            O6.a r1 = r0.f14972b
            E.e r0 = r0.f14971a
            org.slf4j.helpers.i.M(r8)     // Catch: java.lang.Throwable -> L31
            goto L87
        L31:
            r8 = move-exception
            goto L99
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            O6.a r2 = r0.f14972b
            E.e r5 = r0.f14971a
            org.slf4j.helpers.i.M(r8)
            r8 = r2
            goto L66
        L44:
            org.slf4j.helpers.i.M(r8)
            java.lang.Object r8 = r7.f921c
            F6.t r8 = (F6.C0106t) r8
            java.lang.Object r8 = r8.x()
            boolean r8 = r8 instanceof F6.InterfaceC0085e0
            if (r8 != 0) goto L54
            return r3
        L54:
            r0.f14971a = r7
            java.lang.Object r8 = r7.f920b
            O6.d r8 = (O6.d) r8
            r0.f14972b = r8
            r0.f14975e = r5
            java.lang.Object r2 = r8.c(r0)
            if (r2 != r1) goto L65
            return r1
        L65:
            r5 = r7
        L66:
            java.lang.Object r2 = r5.f921c     // Catch: java.lang.Throwable -> L97
            F6.t r2 = (F6.C0106t) r2     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = r2.x()     // Catch: java.lang.Throwable -> L97
            boolean r2 = r2 instanceof F6.InterfaceC0085e0     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto L78
            O6.d r8 = (O6.d) r8
            r8.e(r6)
            return r3
        L78:
            r0.f14971a = r5     // Catch: java.lang.Throwable -> L97
            r0.f14972b = r8     // Catch: java.lang.Throwable -> L97
            r0.f14975e = r4     // Catch: java.lang.Throwable -> L97
            java.lang.Object r0 = r5.z(r0)     // Catch: java.lang.Throwable -> L97
            if (r0 != r1) goto L85
            return r1
        L85:
            r1 = r8
            r0 = r5
        L87:
            java.lang.Object r8 = r0.f921c     // Catch: java.lang.Throwable -> L31
            F6.t r8 = (F6.C0106t) r8     // Catch: java.lang.Throwable -> L31
            r8.C(r3)     // Catch: java.lang.Throwable -> L31
            O6.d r1 = (O6.d) r1
            r1.e(r6)
            return r3
        L94:
            r1 = r8
            r8 = r0
            goto L99
        L97:
            r0 = move-exception
            goto L94
        L99:
            O6.d r1 = (O6.d) r1
            r1.e(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: E.e.d0(p6.c):java.lang.Object");
    }

    @Override // e1.InterfaceC0934D
    public void e(int i7, C0960z c0960z, r rVar, b1.g gVar) {
        if (P(i7, c0960z)) {
            ((T0.d) this.f921c).g(rVar, Q(gVar, c0960z));
        }
    }

    public S0.b e0(List list) {
        ArrayList r7 = r(list);
        if (r7.size() < 2) {
            return (S0.b) AbstractC0021t.k(r7, null);
        }
        Collections.sort(r7, new K1.d(1));
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        int i8 = ((S0.b) r7.get(0)).f4845c;
        int i9 = 0;
        while (true) {
            if (i9 >= r7.size()) {
                break;
            }
            S0.b bVar = (S0.b) r7.get(i9);
            if (i8 != bVar.f4845c) {
                if (arrayList.size() == 1) {
                    return (S0.b) r7.get(0);
                }
            } else {
                arrayList.add(new Pair(bVar.f4844b, Integer.valueOf(bVar.f4846d)));
                i9++;
            }
        }
        HashMap hashMap = (HashMap) this.f922d;
        S0.b bVar2 = (S0.b) hashMap.get(arrayList);
        if (bVar2 == null) {
            List subList = r7.subList(0, arrayList.size());
            int i10 = 0;
            for (int i11 = 0; i11 < subList.size(); i11++) {
                i10 += ((S0.b) subList.get(i11)).f4846d;
            }
            int nextInt = ((Random) this.f923e).nextInt(i10);
            int i12 = 0;
            while (true) {
                if (i7 < subList.size()) {
                    S0.b bVar3 = (S0.b) subList.get(i7);
                    i12 += bVar3.f4846d;
                    if (nextInt < i12) {
                        bVar2 = bVar3;
                        break;
                    }
                    i7++;
                } else {
                    bVar2 = (S0.b) AbstractC0021t.l(subList);
                    break;
                }
            }
            hashMap.put(arrayList, bVar2);
        }
        return bVar2;
    }

    @Override // u5.InterfaceC1875c
    public void f(Serializable serializable) {
        this.f920b = serializable;
    }

    public void f0(Object obj, L5.c cVar) {
        L5.a aVar;
        ByteBuffer a7 = ((L5.n) this.f922d).a(obj);
        if (cVar == null) {
            aVar = null;
        } else {
            aVar = new L5.a(0, this, cVar);
        }
        ((L5.f) this.f920b).h((String) this.f921c, a7, aVar);
    }

    @Override // J1.l
    public /* synthetic */ J1.d g(byte[] bArr, int i7, int i8) {
        return AbstractC0059i.o(this, bArr, i8);
    }

    public void g0(Drawable drawable) {
        ViewGroup viewGroup = (ViewGroup) this.f921c;
        viewGroup.setBackgroundDrawable(drawable);
        Rect rect = new Rect();
        drawable.getPadding(rect);
        viewGroup.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // k6.InterfaceC1408a
    public Object get() {
        return new I2.h((Executor) ((InterfaceC1408a) this.f920b).get(), (J2.c) ((InterfaceC1408a) this.f921c).get(), (I2.d) ((V2.k) this.f922d).get(), (K2.c) ((InterfaceC1408a) this.f923e).get());
    }

    @Override // w.g0
    public float h() {
        Float f = (Float) ((j) this.f920b).a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f == null || f.floatValue() < 1.0f) {
            return 1.0f;
        }
        return f.floatValue();
    }

    public void h0(L5.b bVar) {
        String str = (String) this.f921c;
        L5.f fVar = (L5.f) this.f920b;
        A.f fVar2 = null;
        Z z7 = (Z) this.f923e;
        if (z7 != null) {
            if (bVar != null) {
                fVar2 = new A.f(this, bVar, 26, false);
            }
            fVar.i(str, fVar2, z7);
            return;
        }
        if (bVar != null) {
            fVar2 = new A.f(this, bVar, 26, false);
        }
        fVar.n(str, fVar2);
    }

    @Override // N2.h
    public Object i(IBinder iBinder) {
        Bundle zze = zze.zzb(iBinder).zze((Account) this.f920b, (String) this.f921c, (Bundle) this.f922d);
        if (zze != null) {
            return N2.d.c((Context) this.f923e, zze);
        }
        throw new IOException("Service call returned null");
    }

    public Bundle i0(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f922d;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }

    @Override // u5.InterfaceC1875c
    public void j(String str, HashMap hashMap) {
        this.f921c = "sqlite_error";
        this.f922d = str;
        this.f923e = hashMap;
    }

    @Override // w.g0
    public void k(J j) {
        Rect rect = (Rect) this.f921c;
        if (rect != null) {
            j.a(CaptureRequest.SCALER_CROP_REGION, rect, F.REQUIRED);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
        r8.F(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
        r9.reset();
        r6.E(r8.f2513a, r8.f2515c);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    @Override // J1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(byte[] r34, int r35, int r36, J1.k r37, K0.c r38) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E.e.l(byte[], int, int, J1.k, K0.c):void");
    }

    @Override // J1.l
    public int m() {
        return 2;
    }

    @Override // w.g0
    public float n() {
        return 1.0f;
    }

    @Override // e1.InterfaceC0934D
    public void o(int i7, C0960z c0960z, r rVar, b1.g gVar) {
        if (P(i7, c0960z)) {
            ((T0.d) this.f921c).d(rVar, Q(gVar, c0960z));
        }
    }

    @Override // w.g0
    public void p() {
        this.f923e = null;
        this.f921c = null;
        U.i iVar = (U.i) this.f922d;
        if (iVar != null) {
            iVar.b(new Exception("Camera is not active."));
            this.f922d = null;
        }
    }

    public void q(AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v) {
        if (!((ArrayList) this.f920b).contains(abstractComponentCallbacksC2061v)) {
            synchronized (((ArrayList) this.f920b)) {
                ((ArrayList) this.f920b).add(abstractComponentCallbacksC2061v);
            }
            abstractComponentCallbacksC2061v.f16832f0 = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC2061v);
    }

    public ArrayList r(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.f920b;
        c0(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.f921c;
        c0(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            S0.b bVar = (S0.b) list.get(i7);
            if (!hashMap.containsKey(bVar.f4844b) && !hashMap2.containsKey(Integer.valueOf(bVar.f4845c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [G3.f, java.lang.Object] */
    public C0118f s() {
        A.c cVar;
        G3.k kVar = (G3.k) this.f920b;
        if (kVar != null) {
            A.c cVar2 = (A.c) this.f921c;
            if (cVar2 != null && (cVar = (A.c) this.f922d) != null) {
                if (kVar.f1557b == ((T3.a) cVar2.f4b).f5335a.length) {
                    if (kVar.f1558c == ((T3.a) cVar.f4b).f5335a.length) {
                        G3.j jVar = G3.j.j;
                        G3.j jVar2 = kVar.f1560e;
                        if (jVar2 != jVar && ((Integer) this.f923e) == null) {
                            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                        }
                        if (jVar2 != jVar || ((Integer) this.f923e) == null) {
                            if (jVar2 == jVar) {
                                T3.a.a(new byte[0]);
                            } else if (jVar2 == G3.j.f1539i) {
                                T3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f923e).intValue()).array());
                            } else if (jVar2 == G3.j.f1538h) {
                                T3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f923e).intValue()).array());
                            } else {
                                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + ((G3.k) this.f920b).f1560e);
                            }
                            return new Object();
                        }
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    throw new GeneralSecurityException("HMAC key size mismatch");
                }
                throw new GeneralSecurityException("AES key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without key material");
        }
        throw new GeneralSecurityException("Cannot build without parameters");
    }

    public N3.m t() {
        Integer num = (Integer) this.f920b;
        if (num != null) {
            if (((Integer) this.f921c) != null) {
                if (((N3.d) this.f922d) != null) {
                    if (((N3.d) this.f923e) != null) {
                        if (num.intValue() >= 16) {
                            Integer num2 = (Integer) this.f921c;
                            int intValue = num2.intValue();
                            N3.d dVar = (N3.d) this.f922d;
                            if (intValue >= 10) {
                                if (dVar == N3.d.f3407g) {
                                    if (intValue > 20) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
                                    }
                                } else if (dVar == N3.d.f3408h) {
                                    if (intValue > 28) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
                                    }
                                } else if (dVar == N3.d.f3409i) {
                                    if (intValue > 32) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
                                    }
                                } else if (dVar == N3.d.j) {
                                    if (intValue > 48) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
                                    }
                                } else if (dVar == N3.d.f3410k) {
                                    if (intValue > 64) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
                                    }
                                } else {
                                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                                }
                                return new N3.m(((Integer) this.f920b).intValue(), ((Integer) this.f921c).intValue(), (N3.d) this.f923e, (N3.d) this.f922d);
                            }
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
                        }
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f920b));
                    }
                    throw new GeneralSecurityException("variant is not set");
                }
                throw new GeneralSecurityException("hash type is not set");
            }
            throw new GeneralSecurityException("tag size is not set");
        }
        throw new GeneralSecurityException("key size is not set");
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f919a) {
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                RecaptchaAction recaptchaAction = (RecaptchaAction) this.f920b;
                FirebaseAuth firebaseAuth = (FirebaseAuth) this.f921c;
                String str = (String) this.f922d;
                C0610s c0610s = (C0610s) this.f923e;
                if (task.isSuccessful()) {
                    return Tasks.forResult(task.getResult());
                }
                Exception exception = task.getException();
                I.i(exception);
                if (zzadr.zzd(exception)) {
                    if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                        Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action ".concat(String.valueOf(recaptchaAction)));
                    }
                    if (firebaseAuth.o() == null) {
                        C1908S c1908s = new C1908S(firebaseAuth.f9703a, firebaseAuth);
                        synchronized (firebaseAuth) {
                            firebaseAuth.f9712l = c1908s;
                        }
                    }
                    C1908S o7 = firebaseAuth.o();
                    Task h8 = o7.h(str, Boolean.FALSE, recaptchaAction);
                    return h8.continueWithTask(c0610s).continueWithTask(new e(str, o7, recaptchaAction, c0610s, 13));
                }
                String valueOf = String.valueOf(recaptchaAction);
                String message = exception.getMessage();
                Log.e("RecaptchaCallWrapper", "Initial task failed for action " + valueOf + "with exception - " + message);
                return Tasks.forException(exception);
            default:
                if (!task.isSuccessful()) {
                    Exception exception2 = task.getException();
                    I.i(exception2);
                    if (zzadr.zzc(exception2)) {
                        boolean isLoggable = Log.isLoggable("RecaptchaCallWrapper", 4);
                        String str2 = (String) this.f920b;
                        if (isLoggable) {
                            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + str2);
                        }
                        return ((C1908S) this.f921c).h(str2, Boolean.TRUE, (RecaptchaAction) this.f922d).continueWithTask((C0610s) this.f923e);
                    }
                    return task;
                }
                return task;
        }
    }

    public i u(int i7, int i8) {
        if (i8 == 0) {
            return g.f10878a;
        }
        Map map = (Map) this.f921c;
        List list = (List) this.f920b;
        if (i8 == 1) {
            Object obj = list.get(i7);
            return new e4.f(obj, map.get(obj), null, null);
        }
        int i9 = i8 / 2;
        int i10 = i7 + i9;
        i u7 = u(i7, i9);
        i u8 = u(i10 + 1, i9);
        Object obj2 = list.get(i10);
        return new e4.f(obj2, map.get(obj2), u7, u8);
    }

    public void w(e4.h hVar, int i7, int i8) {
        k fVar;
        i u7 = u(i8 + 1, i7 - 1);
        Object obj = ((List) this.f920b).get(i8);
        e4.h hVar2 = e4.h.RED;
        Map map = (Map) this.f921c;
        if (hVar == hVar2) {
            fVar = new k(obj, map.get(obj), null, u7);
        } else {
            fVar = new e4.f(obj, map.get(obj), null, u7);
        }
        if (((k) this.f922d) == null) {
            this.f922d = fVar;
            this.f923e = fVar;
            return;
        }
        ((k) this.f923e).q(fVar);
        this.f923e = fVar;
    }

    public void x() {
        AbstractC1079a.e();
        A.f fVar = (A.f) this.f921c;
        fVar.getClass();
        AbstractC1079a.e();
        a aVar = (a) fVar.f11c;
        Objects.requireNonNull(aVar);
        n0 n0Var = (n0) fVar.f10b;
        Objects.requireNonNull(n0Var);
        t0 t0Var = aVar.f909a;
        Objects.requireNonNull(t0Var);
        t0Var.a();
        t0 t0Var2 = aVar.f909a;
        Objects.requireNonNull(t0Var2);
        H.i.d(t0Var2.f7552e).a(new d(n0Var, 0), j3.f.C());
        t0 t0Var3 = aVar.f910b;
        if (t0Var3 != null) {
            t0Var3.a();
            H.i.d(aVar.f910b.f7552e).a(new d(null, 1), j3.f.C());
        }
        ((C0054d) this.f922d).getClass();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [p4.z, java.lang.Object] */
    public HashMap y(Map map, Map map2, Set set) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (n nVar : map.values()) {
            r4.d dVar = (r4.d) map2.get(nVar.f15362a);
            q4.h hVar = nVar.f15362a;
            if (set.contains(hVar) && (dVar == null || (dVar.f15491b instanceof r4.l))) {
                hashMap.put(hVar, nVar);
            } else if (dVar != null) {
                r4.h hVar2 = dVar.f15491b;
                hashMap2.put(hVar, hVar2.d());
                hVar2.a(nVar, hVar2.d(), new p(new Date()));
            } else {
                hashMap2.put(hVar, r4.f.f15492b);
            }
        }
        hashMap2.putAll(X(hashMap));
        HashMap hashMap3 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            ?? obj = new Object();
            obj.f15310a = (n) entry.getValue();
            obj.f15311b = (r4.f) hashMap2.get(entry.getKey());
            hashMap3.put((q4.h) entry.getKey(), obj);
        }
        return hashMap3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z(p6.AbstractC1700c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p0.C1641i
            if (r0 == 0) goto L13
            r0 = r7
            p0.i r0 = (p0.C1641i) r0
            int r1 = r0.f15015d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15015d = r1
            goto L18
        L13:
            p0.i r0 = new p0.i
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f15013b
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.f15015d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            E.e r0 = r0.f15012a
            org.slf4j.helpers.i.M(r7)
            goto L64
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            E.e r0 = r0.f15012a
            org.slf4j.helpers.i.M(r7)
            goto L74
        L3a:
            org.slf4j.helpers.i.M(r7)
            java.lang.Object r7 = r6.f922d
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r2 = r6.f923e
            p0.N r2 = (p0.N) r2
            if (r7 == 0) goto L67
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4e
            goto L67
        L4e:
            p0.X r7 = r2.f()
            p0.l r4 = new p0.l
            r5 = 0
            r4.<init>(r2, r6, r5)
            r0.f15012a = r6
            r0.f15015d = r3
            java.lang.Object r7 = r7.b(r4, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            r0 = r6
        L64:
            p0.c r7 = (p0.C1635c) r7
            goto L76
        L67:
            r0.f15012a = r6
            r0.f15015d = r4
            r7 = 0
            java.lang.Object r7 = p0.N.e(r2, r7, r0)
            if (r7 != r1) goto L73
            return r1
        L73:
            r0 = r6
        L74:
            p0.c r7 = (p0.C1635c) r7
        L76:
            java.lang.Object r0 = r0.f923e
            p0.N r0 = (p0.N) r0
            a1.A r0 = r0.f14955Y
            r0.o(r7)
            l6.j r7 = l6.j.f13876a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: E.e.z(p6.c):java.lang.Object");
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f919a = i7;
        this.f920b = obj;
        this.f921c = obj2;
        this.f922d = obj3;
        this.f923e = obj4;
    }

    public e(F6.D d7, E6.l lVar, C1632K c1632k) {
        this.f919a = 22;
        this.f920b = d7;
        this.f921c = c1632k;
        this.f922d = H6.j.a(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, null, 6);
        this.f923e = new C1006c(8);
        InterfaceC0091h0 interfaceC0091h0 = (InterfaceC0091h0) d7.a().get(F6.C.f1216b);
        if (interfaceC0091h0 != null) {
            interfaceC0091h0.invokeOnCompletion(new G6.d(1, lVar, this));
        }
    }

    public e(j jVar) {
        this.f919a = 28;
        this.f921c = null;
        this.f923e = null;
        this.f920b = jVar;
    }

    public e(t4.i iVar, ArrayList arrayList, List list, TaskCompletionSource taskCompletionSource) {
        this.f919a = 25;
        this.f923e = iVar;
        this.f920b = arrayList;
        this.f921c = list;
        this.f922d = taskCompletionSource;
    }

    public e(u uVar) {
        this.f919a = 6;
        this.f920b = new HashMap(uVar.f3262a);
        this.f921c = new HashMap(uVar.f3263b);
        this.f922d = new HashMap(uVar.f3264c);
        this.f923e = new HashMap(uVar.f3265d);
    }

    public e(Context context, int i7) {
        this.f919a = i7;
        switch (i7) {
            case 24:
                this.f923e = new ArrayList();
                m5.d.i("Context must be non-null", context != null, new Object[0]);
                this.f920b = context;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                this.f921c = connectivityManager;
                Application application = (Application) context.getApplicationContext();
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                application.registerActivityLifecycleCallbacks(new C1824d(this, atomicBoolean));
                application.registerComponentCallbacks(new ComponentCallbacks2C1825e(atomicBoolean));
                if (Build.VERSION.SDK_INT >= 24 && connectivityManager != null) {
                    C0615a c0615a = new C0615a(this, 1);
                    connectivityManager.registerDefaultNetworkCallback(c0615a);
                    this.f922d = new RunnableC1822b(2, this, c0615a);
                    return;
                }
                C0616b c0616b = new C0616b(this, 1);
                context.registerReceiver(c0616b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f922d = new RunnableC1822b(3, this, c0616b);
                return;
            default:
                this.f920b = context;
                Z4.a aVar = new Z4.a(context);
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.amu_text_bubble, (ViewGroup) null);
                this.f921c = viewGroup;
                RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
                this.f922d = rotationLayout;
                this.f923e = (TextView) rotationLayout.findViewById(R.id.amu_text);
                aVar.f6739c = -1;
                g0(aVar);
                TextView textView = (TextView) this.f923e;
                if (textView != null) {
                    textView.setTextAppearance(context, 2131689864);
                    return;
                }
                return;
        }
    }

    public e(int i7) {
        this.f919a = i7;
        switch (i7) {
            case 6:
                this.f920b = new HashMap();
                this.f921c = new HashMap();
                this.f922d = new HashMap();
                this.f923e = new HashMap();
                return;
            case 10:
                Random random = new Random();
                this.f922d = new HashMap();
                this.f923e = random;
                this.f920b = new HashMap();
                this.f921c = new HashMap();
                return;
            case 15:
                q2 q2Var = q2.f8962b;
                this.f921c = k2.n();
                this.f922d = k2.n();
                this.f923e = k2.n();
                this.f920b = q2Var;
                return;
            case 29:
                this.f920b = new ArrayList();
                this.f921c = new HashMap();
                this.f922d = new HashMap();
                return;
            default:
                this.f920b = new K0.q();
                this.f921c = new K0.q();
                this.f922d = new M1.a();
                return;
        }
    }

    public e(Typeface typeface, C1880b c1880b) {
        int i7;
        int i8;
        this.f919a = 26;
        this.f923e = typeface;
        this.f920b = c1880b;
        this.f922d = new C1859o(RecognitionOptions.UPC_E);
        int a7 = c1880b.a(6);
        if (a7 != 0) {
            int i9 = a7 + c1880b.f11206a;
            i7 = ((ByteBuffer) c1880b.f11209d).getInt(((ByteBuffer) c1880b.f11209d).getInt(i9) + i9);
        } else {
            i7 = 0;
        }
        this.f921c = new char[i7 * 2];
        int a8 = c1880b.a(6);
        if (a8 != 0) {
            int i10 = a8 + c1880b.f11206a;
            i8 = ((ByteBuffer) c1880b.f11209d).getInt(((ByteBuffer) c1880b.f11209d).getInt(i10) + i10);
        } else {
            i8 = 0;
        }
        for (int i11 = 0; i11 < i8; i11++) {
            C1856l c1856l = new C1856l(this, i11);
            C1879a c8 = c1856l.c();
            int a9 = c8.a(4);
            Character.toChars(a9 != 0 ? ((ByteBuffer) c8.f11209d).getInt(a9 + c8.f11206a) : 0, (char[]) this.f921c, i11 * 2);
            g0.c.a("invalid metadata codepoint length", c1856l.b() > 0);
            ((C1859o) this.f922d).a(c1856l, 0, c1856l.b() - 1);
        }
    }

    public e(n4.J j) {
        this.f919a = 20;
        this.f922d = new HashSet();
        this.f923e = n4.z.UNKNOWN;
        this.f920b = j;
        this.f921c = new HashMap();
        j.f14301m = this;
    }

    public e(s2 s2Var, Q0 q0) {
        this.f919a = 14;
        this.f923e = s2Var;
        this.f920b = q0;
        String str = (String) s2Var.f8985c;
        S c8 = ((a6.T) s2Var.f8984b).c(str);
        this.f922d = c8;
        if (c8 != null) {
            this.f921c = c8.d(q0);
            return;
        }
        throw new IllegalStateException(AbstractC0059i.M("Could not find policy '", str, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0194  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, D.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(androidx.camera.core.impl.N r18, android.util.Size r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E.e.<init>(androidx.camera.core.impl.N, android.util.Size, boolean):void");
    }

    public e(AbstractC0945j abstractC0945j, Object obj) {
        this.f919a = 17;
        this.f923e = abstractC0945j;
        this.f921c = abstractC0945j.a(null);
        this.f922d = new T0.d(abstractC0945j.f10774d.f5289c, 0, null);
        this.f920b = obj;
    }

    public e(List list, Map map) {
        this.f919a = 19;
        this.f920b = list;
        this.f921c = map;
    }

    public e(p0.N n7, List list) {
        this.f919a = 21;
        this.f923e = n7;
        this.f920b = O6.e.a();
        this.f921c = H.a();
        this.f922d = AbstractC1447h.Y(list);
    }

    public e(String str, String[] strArr, String str2, K5.z zVar) {
        this.f919a = 3;
        this.f920b = str;
        this.f921c = strArr;
        this.f923e = str2;
        this.f922d = zVar;
    }

    public e(b0 b0Var, boolean[] zArr) {
        this.f919a = 18;
        this.f920b = b0Var;
        this.f921c = zArr;
        int i7 = b0Var.f10780a;
        this.f922d = new boolean[i7];
        this.f923e = new boolean[i7];
    }

    public e(Z0 z02) {
        this.f919a = 16;
        this.f923e = z02;
        this.f920b = new Object();
        this.f921c = new HashSet();
    }
}
