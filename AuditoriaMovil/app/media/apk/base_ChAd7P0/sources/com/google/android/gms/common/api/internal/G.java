package com.google.android.gms.common.api.internal;

import a6.t0;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0760i;
import com.google.android.gms.common.internal.C0772v;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import v3.C1885a;
/* loaded from: classes.dex */
public final class G implements com.google.android.gms.common.api.m, com.google.android.gms.common.api.n {

    /* renamed from: b  reason: collision with root package name */
    public final com.google.android.gms.common.api.g f9176b;

    /* renamed from: c  reason: collision with root package name */
    public final C0728b f9177c;

    /* renamed from: d  reason: collision with root package name */
    public final D f9178d;

    /* renamed from: i  reason: collision with root package name */
    public final int f9180i;
    public final T j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f9181k;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ C0735i f9185o;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList f9175a = new LinkedList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f9179e = new HashSet();
    public final HashMap f = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f9182l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public W2.b f9183m = null;

    /* renamed from: n  reason: collision with root package name */
    public int f9184n = 0;

    public G(C0735i c0735i, com.google.android.gms.common.api.l lVar) {
        this.f9185o = c0735i;
        com.google.android.gms.common.api.g zab = lVar.zab(c0735i.f9264i0.getLooper(), this);
        this.f9176b = zab;
        this.f9177c = lVar.getApiKey();
        this.f9178d = new D();
        this.f9180i = lVar.zaa();
        if (zab.requiresSignIn()) {
            this.j = lVar.zac(c0735i.f9259e, c0735i.f9264i0);
            return;
        }
        this.j = null;
    }

    public final void a(W2.b bVar) {
        HashSet hashSet = this.f9179e;
        Iterator it = hashSet.iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (com.google.android.gms.common.internal.I.m(bVar, W2.b.f6158e)) {
                    this.f9176b.getEndpointPackageName();
                }
                throw null;
            }
            throw new ClassCastException();
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.common.api.internal.r
    public final void b(W2.b bVar) {
        p(bVar, null);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0734h
    public final void c(int i7) {
        Looper myLooper = Looper.myLooper();
        C0735i c0735i = this.f9185o;
        if (myLooper == c0735i.f9264i0.getLooper()) {
            i(i7);
        } else {
            c0735i.f9264i0.post(new S4.c(this, i7, 3));
        }
    }

    public final void d(Status status) {
        com.google.android.gms.common.internal.I.d(this.f9185o.f9264i0);
        f(status, null, false);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0734h
    public final void e() {
        Looper myLooper = Looper.myLooper();
        C0735i c0735i = this.f9185o;
        if (myLooper == c0735i.f9264i0.getLooper()) {
            h();
        } else {
            c0735i.f9264i0.post(new G.c(this, 21));
        }
    }

    public final void f(Status status, RuntimeException runtimeException, boolean z7) {
        boolean z8;
        com.google.android.gms.common.internal.I.d(this.f9185o.f9264i0);
        boolean z9 = true;
        if (status != null) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (runtimeException != null) {
            z9 = false;
        }
        if (z8 != z9) {
            Iterator it = this.f9175a.iterator();
            while (it.hasNext()) {
                b0 b0Var = (b0) it.next();
                if (!z7 || b0Var.f9229a == 2) {
                    if (status != null) {
                        b0Var.a(status);
                    } else {
                        b0Var.b(runtimeException);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void g() {
        LinkedList linkedList = this.f9175a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            b0 b0Var = (b0) arrayList.get(i7);
            if (this.f9176b.isConnected()) {
                if (k(b0Var)) {
                    linkedList.remove(b0Var);
                }
            } else {
                return;
            }
        }
    }

    public final void h() {
        com.google.android.gms.common.api.g gVar = this.f9176b;
        C0735i c0735i = this.f9185o;
        com.google.android.gms.common.internal.I.d(c0735i.f9264i0);
        this.f9183m = null;
        a(W2.b.f6158e);
        if (this.f9181k) {
            zau zauVar = c0735i.f9264i0;
            C0728b c0728b = this.f9177c;
            zauVar.removeMessages(11, c0728b);
            c0735i.f9264i0.removeMessages(9, c0728b);
            this.f9181k = false;
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            O o7 = (O) it.next();
            o7.f9201a.getClass();
            try {
                AbstractC0745t abstractC0745t = o7.f9201a;
                ((InterfaceC0747v) ((Q) abstractC0745t).f9205d.f6249c).accept(gVar, new TaskCompletionSource());
            } catch (DeadObjectException unused) {
                c(3);
                gVar.disconnect("DeadObjectException thrown while calling register listener method.");
            } catch (RemoteException unused2) {
                it.remove();
            }
        }
        g();
        j();
    }

    public final void i(int i7) {
        C0735i c0735i = this.f9185o;
        com.google.android.gms.common.internal.I.d(c0735i.f9264i0);
        this.f9183m = null;
        this.f9181k = true;
        String lastDisconnectMessage = this.f9176b.getLastDisconnectMessage();
        D d7 = this.f9178d;
        d7.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i7 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i7 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(lastDisconnectMessage);
        }
        d7.a(new Status(20, sb.toString(), null, null), true);
        zau zauVar = c0735i.f9264i0;
        C0728b c0728b = this.f9177c;
        zauVar.sendMessageDelayed(Message.obtain(zauVar, 9, c0728b), 5000L);
        zau zauVar2 = c0735i.f9264i0;
        zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 11, c0728b), 120000L);
        ((SparseIntArray) c0735i.f9252X.f7209b).clear();
        for (O o7 : this.f.values()) {
            o7.f9203c.run();
        }
    }

    public final void j() {
        C0735i c0735i = this.f9185o;
        zau zauVar = c0735i.f9264i0;
        C0728b c0728b = this.f9177c;
        zauVar.removeMessages(12, c0728b);
        zau zauVar2 = c0735i.f9264i0;
        zauVar2.sendMessageDelayed(zauVar2.obtainMessage(12, c0728b), c0735i.f9255a);
    }

    public final boolean k(b0 b0Var) {
        if (!(b0Var instanceof K)) {
            com.google.android.gms.common.api.g gVar = this.f9176b;
            b0Var.d(this.f9178d, gVar.requiresSignIn());
            try {
                b0Var.c(this);
            } catch (DeadObjectException unused) {
                c(1);
                gVar.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        K k2 = (K) b0Var;
        W2.d[] g3 = k2.g(this);
        W2.d dVar = null;
        if (g3 != null && g3.length != 0) {
            W2.d[] availableFeatures = this.f9176b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new W2.d[0];
            }
            S.k kVar = new S.k(availableFeatures.length);
            for (W2.d dVar2 : availableFeatures) {
                kVar.put(dVar2.f6166a, Long.valueOf(dVar2.k()));
            }
            for (W2.d dVar3 : g3) {
                Long l8 = (Long) kVar.get(dVar3.f6166a);
                if (l8 == null || l8.longValue() < dVar3.k()) {
                    dVar = dVar3;
                    break;
                }
            }
        }
        if (dVar == null) {
            com.google.android.gms.common.api.g gVar2 = this.f9176b;
            b0Var.d(this.f9178d, gVar2.requiresSignIn());
            try {
                b0Var.c(this);
            } catch (DeadObjectException unused2) {
                c(1);
                gVar2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        Log.w("GoogleApiManager", this.f9176b.getClass().getName() + " could not execute call because it requires feature (" + dVar.f6166a + ", " + dVar.k() + ").");
        if (this.f9185o.f9265j0 && k2.f(this)) {
            H h8 = new H(this.f9177c, dVar);
            int indexOf = this.f9182l.indexOf(h8);
            if (indexOf >= 0) {
                H h9 = (H) this.f9182l.get(indexOf);
                this.f9185o.f9264i0.removeMessages(15, h9);
                zau zauVar = this.f9185o.f9264i0;
                zauVar.sendMessageDelayed(Message.obtain(zauVar, 15, h9), 5000L);
                return false;
            }
            this.f9182l.add(h8);
            zau zauVar2 = this.f9185o.f9264i0;
            zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 15, h8), 5000L);
            zau zauVar3 = this.f9185o.f9264i0;
            zauVar3.sendMessageDelayed(Message.obtain(zauVar3, 16, h8), 120000L);
            W2.b bVar = new W2.b(2, null);
            if (!l(bVar)) {
                this.f9185o.d(bVar, this.f9180i);
                return false;
            }
            return false;
        }
        k2.b(new com.google.android.gms.common.api.x(dVar));
        return true;
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:686)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:544)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:302)
        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:240)
        	at jadx.core.dex.regions.SynchronizedRegion.generate(SynchronizedRegion.java:44)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    public final boolean l(W2.b r6) {
        /*
            r5 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.C0735i.f9250m0
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.i r1 = r5.f9185o     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.common.api.internal.E r2 = r1.f9261f0     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L47
            S.g r1 = r1.f9262g0     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.common.api.internal.b r2 = r5.f9177c     // Catch: java.lang.Throwable -> L45
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L47
            com.google.android.gms.common.api.internal.i r1 = r5.f9185o     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.common.api.internal.E r1 = r1.f9261f0     // Catch: java.lang.Throwable -> L45
            int r2 = r5.f9180i     // Catch: java.lang.Throwable -> L45
            r1.getClass()     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.common.api.internal.c0 r3 = new com.google.android.gms.common.api.internal.c0     // Catch: java.lang.Throwable -> L45
            r3.<init>(r6, r2)     // Catch: java.lang.Throwable -> L45
        L21:
            java.util.concurrent.atomic.AtomicReference r6 = r1.f9169b     // Catch: java.lang.Throwable -> L45
        L23:
            r2 = 0
            boolean r2 = r6.compareAndSet(r2, r3)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L36
            com.google.android.gms.internal.base.zau r6 = r1.f9170c     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.common.api.internal.d0 r2 = new com.google.android.gms.common.api.internal.d0     // Catch: java.lang.Throwable -> L45
            r4 = 0
            r2.<init>(r4, r1, r3)     // Catch: java.lang.Throwable -> L45
            r6.post(r2)     // Catch: java.lang.Throwable -> L45
            goto L42
        L36:
            java.lang.Object r2 = r6.get()     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L23
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L21
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            r6 = 1
            return r6
        L45:
            r6 = move-exception
            goto L4a
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            r6 = 0
            return r6
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.G.l(W2.b):boolean");
    }

    public final boolean m(boolean z7) {
        com.google.android.gms.common.internal.I.d(this.f9185o.f9264i0);
        com.google.android.gms.common.api.g gVar = this.f9176b;
        if (gVar.isConnected() && this.f.isEmpty()) {
            D d7 = this.f9178d;
            if (((Map) d7.f9166a).isEmpty() && ((Map) d7.f9167b).isEmpty()) {
                gVar.disconnect("Timing out service connection.");
                return true;
            } else if (z7) {
                j();
                return false;
            } else {
                return false;
            }
        }
        return false;
    }

    public final void n() {
        C0735i c0735i = this.f9185o;
        com.google.android.gms.common.internal.I.d(c0735i.f9264i0);
        com.google.android.gms.common.api.g gVar = this.f9176b;
        if (!gVar.isConnected() && !gVar.isConnecting()) {
            try {
                t0 t0Var = c0735i.f9252X;
                Context context = c0735i.f9259e;
                t0Var.getClass();
                com.google.android.gms.common.internal.I.i(context);
                int i7 = 0;
                if (gVar.requiresGooglePlayServices()) {
                    int minApkVersion = gVar.getMinApkVersion();
                    SparseIntArray sparseIntArray = (SparseIntArray) t0Var.f7209b;
                    int i8 = sparseIntArray.get(minApkVersion, -1);
                    if (i8 != -1) {
                        i7 = i8;
                    } else {
                        int i9 = 0;
                        while (true) {
                            if (i9 < sparseIntArray.size()) {
                                int keyAt = sparseIntArray.keyAt(i9);
                                if (keyAt > minApkVersion && sparseIntArray.get(keyAt) == 0) {
                                    break;
                                }
                                i9++;
                            } else {
                                i7 = -1;
                                break;
                            }
                        }
                        if (i7 == -1) {
                            i7 = ((W2.e) t0Var.f7210c).d(context, minApkVersion);
                        }
                        sparseIntArray.put(minApkVersion, i7);
                    }
                }
                if (i7 != 0) {
                    W2.b bVar = new W2.b(i7, null);
                    Log.w("GoogleApiManager", "The service for " + gVar.getClass().getName() + " is not available: " + bVar.toString());
                    p(bVar, null);
                    return;
                }
                Q0.A a7 = new Q0.A(c0735i, gVar, this.f9177c);
                if (gVar.requiresSignIn()) {
                    T t7 = this.j;
                    com.google.android.gms.common.internal.I.i(t7);
                    C1885a c1885a = t7.f;
                    if (c1885a != null) {
                        c1885a.disconnect();
                    }
                    Integer valueOf = Integer.valueOf(System.identityHashCode(t7));
                    C0760i c0760i = t7.f9211e;
                    c0760i.f9359g = valueOf;
                    Handler handler = t7.f9208b;
                    t7.f = (C1885a) t7.f9209c.buildClient(t7.f9207a, handler.getLooper(), c0760i, (Object) c0760i.f, (com.google.android.gms.common.api.m) t7, (com.google.android.gms.common.api.n) t7);
                    t7.f9212i = a7;
                    Set set = t7.f9210d;
                    if (set != null && !set.isEmpty()) {
                        C1885a c1885a2 = t7.f;
                        c1885a2.getClass();
                        c1885a2.connect(new C0772v(c1885a2));
                    } else {
                        handler.post(new G.c(t7, 23));
                    }
                }
                try {
                    gVar.connect(a7);
                } catch (SecurityException e7) {
                    p(new W2.b(10), e7);
                }
            } catch (IllegalStateException e8) {
                p(new W2.b(10), e8);
            }
        }
    }

    public final void o(b0 b0Var) {
        com.google.android.gms.common.internal.I.d(this.f9185o.f9264i0);
        boolean isConnected = this.f9176b.isConnected();
        LinkedList linkedList = this.f9175a;
        if (isConnected) {
            if (k(b0Var)) {
                j();
                return;
            } else {
                linkedList.add(b0Var);
                return;
            }
        }
        linkedList.add(b0Var);
        W2.b bVar = this.f9183m;
        if (bVar != null && bVar.f6160b != 0 && bVar.f6161c != null) {
            p(bVar, null);
        } else {
            n();
        }
    }

    public final void p(W2.b bVar, RuntimeException runtimeException) {
        C1885a c1885a;
        com.google.android.gms.common.internal.I.d(this.f9185o.f9264i0);
        T t7 = this.j;
        if (t7 != null && (c1885a = t7.f) != null) {
            c1885a.disconnect();
        }
        com.google.android.gms.common.internal.I.d(this.f9185o.f9264i0);
        this.f9183m = null;
        ((SparseIntArray) this.f9185o.f9252X.f7209b).clear();
        a(bVar);
        if ((this.f9176b instanceof Y2.c) && bVar.f6160b != 24) {
            C0735i c0735i = this.f9185o;
            c0735i.f9256b = true;
            zau zauVar = c0735i.f9264i0;
            zauVar.sendMessageDelayed(zauVar.obtainMessage(19), 300000L);
        }
        if (bVar.f6160b == 4) {
            d(C0735i.f9249l0);
        } else if (this.f9175a.isEmpty()) {
            this.f9183m = bVar;
        } else if (runtimeException != null) {
            com.google.android.gms.common.internal.I.d(this.f9185o.f9264i0);
            f(null, runtimeException, false);
        } else if (this.f9185o.f9265j0) {
            f(C0735i.e(this.f9177c, bVar), null, true);
            if (!this.f9175a.isEmpty() && !l(bVar) && !this.f9185o.d(bVar, this.f9180i)) {
                if (bVar.f6160b == 18) {
                    this.f9181k = true;
                }
                if (this.f9181k) {
                    C0735i c0735i2 = this.f9185o;
                    C0728b c0728b = this.f9177c;
                    zau zauVar2 = c0735i2.f9264i0;
                    zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 9, c0728b), 5000L);
                    return;
                }
                d(C0735i.e(this.f9177c, bVar));
            }
        } else {
            d(C0735i.e(this.f9177c, bVar));
        }
    }

    public final void q(W2.b bVar) {
        com.google.android.gms.common.internal.I.d(this.f9185o.f9264i0);
        com.google.android.gms.common.api.g gVar = this.f9176b;
        String name = gVar.getClass().getName();
        String valueOf = String.valueOf(bVar);
        gVar.disconnect("onSignInFailed for " + name + " with " + valueOf);
        p(bVar, null);
    }

    public final void r() {
        com.google.android.gms.common.internal.I.d(this.f9185o.f9264i0);
        Status status = C0735i.f9248k0;
        d(status);
        this.f9178d.a(status, false);
        for (C0740n c0740n : (C0740n[]) this.f.keySet().toArray(new C0740n[0])) {
            o(new Z(c0740n, new TaskCompletionSource()));
        }
        a(new W2.b(4));
        com.google.android.gms.common.api.g gVar = this.f9176b;
        if (gVar.isConnected()) {
            gVar.onUserSignOut(new A.c(this, 28));
        }
    }
}
