package G;

import D.AbstractC0059i;
import H.m;
import H4.e1;
import H4.p1;
import Y1.C0401b;
import Y1.C0405f;
import Y1.r;
import a6.AbstractC0471A;
import a6.Z;
import a6.o0;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.lifecycle.C;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import c6.C0644E;
import c6.C0661e;
import c6.C0710u1;
import c6.C0716w1;
import c6.C0721y0;
import c6.InterfaceC0672h1;
import c6.InterfaceC0717x;
import c6.K;
import c6.N0;
import c6.Q;
import c6.Q0;
import c6.RunnableC0646G;
import c6.RunnableC0700r0;
import c6.W1;
import c6.Y0;
import c6.Y1;
import c6.Z0;
import c6.d2;
import com.google.android.gms.common.api.internal.G;
import com.google.android.gms.common.api.internal.T;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.libraries.barhopper.RecognitionOptions;
import d6.C0906c;
import d6.p;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import org.apache.tika.utils.XMLReaderUtils;
import p.C1608t;
import r3.C1742f;
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1328a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1329b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f1328a = i7;
        this.f1329b = obj;
    }

    private final void a() {
        Object obj;
        synchronized (((C) this.f1329b).f7880a) {
            obj = ((C) this.f1329b).f;
            ((C) this.f1329b).f = C.f7879k;
        }
        ((C) this.f1329b).l(obj);
    }

    private final void b() {
        ((p) this.f1329b).getClass();
        p pVar = (p) this.f1329b;
        pVar.f10466o.execute(pVar.f10471t);
        synchronized (((p) this.f1329b).f10462k) {
            p pVar2 = (p) this.f1329b;
            pVar2.f10441C = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            pVar2.v();
        }
        ((p) this.f1329b).getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r1 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
        r3.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
        org.slf4j.helpers.i.u("SequentialExecutor", "Exception while executing runnable " + r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r9.f1329b     // Catch: java.lang.Throwable -> L57
            G.k r2 = (G.k) r2     // Catch: java.lang.Throwable -> L57
            java.util.ArrayDeque r2 = r2.f1343a     // Catch: java.lang.Throwable -> L57
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r9.f1329b     // Catch: java.lang.Throwable -> L20
            G.k r0 = (G.k) r0     // Catch: java.lang.Throwable -> L20
            G.j r3 = r0.f1346d     // Catch: java.lang.Throwable -> L20
            G.j r4 = G.j.RUNNING     // Catch: java.lang.Throwable -> L20
            if (r3 != r4) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L1f
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L1f:
            return
        L20:
            r0 = move-exception
            goto L71
        L22:
            long r5 = r0.f1347e     // Catch: java.lang.Throwable -> L20
            r7 = 1
            long r5 = r5 + r7
            r0.f1347e = r5     // Catch: java.lang.Throwable -> L20
            r0.f1346d = r4     // Catch: java.lang.Throwable -> L20
            r0 = 1
        L2c:
            java.lang.Object r3 = r9.f1329b     // Catch: java.lang.Throwable -> L20
            G.k r3 = (G.k) r3     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r3 = r3.f1343a     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L4d
            java.lang.Object r0 = r9.f1329b     // Catch: java.lang.Throwable -> L20
            G.k r0 = (G.k) r0     // Catch: java.lang.Throwable -> L20
            G.j r3 = G.j.IDLE     // Catch: java.lang.Throwable -> L20
            r0.f1346d = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L4c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L4c:
            return
        L4d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L57
            r1 = r1 | r2
            r3.run()     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L59
            goto L2
        L57:
            r0 = move-exception
            goto L73
        L59:
            r2 = move-exception
            java.lang.String r4 = "SequentialExecutor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r5.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r6 = "Exception while executing runnable "
            r5.append(r6)     // Catch: java.lang.Throwable -> L57
            r5.append(r3)     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L57
            org.slf4j.helpers.i.u(r4, r3, r2)     // Catch: java.lang.Throwable -> L57
            goto L2
        L71:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L57
        L73:
            if (r1 == 0) goto L7c
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L7c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G.c.c():void");
    }

    /* JADX WARN: Type inference failed for: r0v106, types: [i1.l, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        long j;
        long j8 = 0;
        switch (this.f1328a) {
            case 0:
                V2.k kVar = (V2.k) this.f1329b;
                if (((d) kVar.f5967d).f1330a.getAndSet(null) != null) {
                    ((Handler) kVar.f5965b).removeCallbacks((d) kVar.f5967d);
                    return;
                }
                return;
            case 1:
                try {
                    c();
                    return;
                } catch (Error e7) {
                    synchronized (((k) this.f1329b).f1343a) {
                        ((k) this.f1329b).f1346d = j.IDLE;
                        throw e7;
                    }
                }
            case 2:
                ((E3.b) this.f1329b).cancel(true);
                return;
            case 3:
                m mVar = (m) this.f1329b;
                mVar.f1636b = null;
                mVar.f1635a = null;
                return;
            case 4:
                I2.h hVar = (I2.h) this.f1329b;
                ((J2.i) hVar.f2196d).d(new A.m(hVar, 6));
                return;
            case 5:
                U4.b bVar = (U4.b) this.f1329b;
                C1608t c1608t = bVar.f5774b;
                if (c1608t != null) {
                    C1742f c1742f = (C1742f) c1608t.f14880b;
                    try {
                        q3.i iVar = new q3.i((q3.b) bVar);
                        Parcel zza = c1742f.zza();
                        zzc.zze(zza, iVar);
                        c1742f.zzc(32, zza);
                        try {
                            q3.i iVar2 = new q3.i((q3.c) bVar);
                            Parcel zza2 = c1742f.zza();
                            zzc.zze(zza2, iVar2);
                            c1742f.zzc(84, zza2);
                            try {
                                q3.i iVar3 = new q3.i((q3.d) bVar);
                                Parcel zza3 = c1742f.zza();
                                zzc.zze(zza3, iVar3);
                                c1742f.zzc(30, zza3);
                                try {
                                    q3.i iVar4 = new q3.i((q3.e) bVar);
                                    Parcel zza4 = c1742f.zza();
                                    zzc.zze(zza4, iVar4);
                                    c1742f.zzc(31, zza4);
                                    try {
                                        q3.i iVar5 = new q3.i(bVar);
                                        Parcel zza5 = c1742f.zza();
                                        zzc.zze(zza5, iVar5);
                                        c1742f.zzc(33, zza5);
                                        return;
                                    } catch (RemoteException e8) {
                                        throw new RuntimeException(e8);
                                    }
                                } catch (RemoteException e9) {
                                    throw new RuntimeException(e9);
                                }
                            } catch (RemoteException e10) {
                                throw new RuntimeException(e10);
                            }
                        } catch (RemoteException e11) {
                            throw new RuntimeException(e11);
                        }
                    } catch (RemoteException e12) {
                        throw new RuntimeException(e12);
                    }
                }
                return;
            case 6:
                C0405f c0405f = (C0405f) this.f1329b;
                int i7 = c0405f.f6657v;
                ValueAnimator valueAnimator = c0405f.f6656u;
                if (i7 != 1) {
                    if (i7 != 2) {
                        return;
                    }
                } else {
                    valueAnimator.cancel();
                }
                c0405f.f6657v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 7:
                r rVar = ((RecyclerView) this.f1329b).f8010B0;
                if (rVar != null) {
                    C0401b c0401b = (C0401b) rVar;
                    ArrayList arrayList = c0401b.f6624e;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0401b.f6625g;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0401b.f6626h;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0401b.f;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        if (!it.hasNext()) {
                            arrayList.clear();
                            if (!isEmpty2) {
                                ArrayList arrayList5 = new ArrayList();
                                arrayList5.addAll(arrayList2);
                                ArrayList arrayList6 = c0401b.j;
                                arrayList6.add(arrayList5);
                                arrayList2.clear();
                                if (isEmpty) {
                                    Iterator it2 = arrayList5.iterator();
                                    if (!it2.hasNext()) {
                                        arrayList5.clear();
                                        arrayList6.remove(arrayList5);
                                    } else {
                                        AbstractC0059i.I(it2.next());
                                        throw null;
                                    }
                                } else {
                                    AbstractC0059i.I(arrayList5.get(0));
                                    throw null;
                                }
                            }
                            if (!isEmpty3) {
                                ArrayList arrayList7 = new ArrayList();
                                arrayList7.addAll(arrayList3);
                                ArrayList arrayList8 = c0401b.f6628k;
                                arrayList8.add(arrayList7);
                                arrayList3.clear();
                                if (isEmpty) {
                                    Iterator it3 = arrayList7.iterator();
                                    if (!it3.hasNext()) {
                                        arrayList7.clear();
                                        arrayList8.remove(arrayList7);
                                    } else {
                                        AbstractC0059i.I(it3.next());
                                        throw null;
                                    }
                                } else {
                                    AbstractC0059i.I(arrayList7.get(0));
                                    throw null;
                                }
                            }
                            if (!isEmpty4) {
                                ArrayList arrayList9 = new ArrayList();
                                arrayList9.addAll(arrayList4);
                                ArrayList arrayList10 = c0401b.f6627i;
                                arrayList10.add(arrayList9);
                                arrayList4.clear();
                                if (isEmpty && isEmpty2 && isEmpty3) {
                                    Iterator it4 = arrayList9.iterator();
                                    if (!it4.hasNext()) {
                                        arrayList9.clear();
                                        arrayList10.remove(arrayList9);
                                        return;
                                    }
                                    it4.next().getClass();
                                    throw new ClassCastException();
                                }
                                if (!isEmpty2) {
                                    j = c0401b.f6683c;
                                } else {
                                    j = 0;
                                }
                                if (!isEmpty3) {
                                    j8 = c0401b.f6684d;
                                }
                                Math.max(j, j8);
                                arrayList9.get(0).getClass();
                                throw new ClassCastException();
                            }
                            return;
                        }
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    return;
                }
                return;
            case 8:
                ((StaggeredGridLayoutManager) this.f1329b).J();
                return;
            case 9:
                a();
                return;
            case 10:
                ((K) this.f1329b).f8484a.j();
                return;
            case 11:
                ((InterfaceC0717x) ((Q) this.f1329b).f8565b).n();
                return;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                C0721y0 c0721y0 = (C0721y0) ((RunnableC0646G) this.f1329b).f8453b;
                InterfaceC0672h1 interfaceC0672h1 = c0721y0.f9050r;
                c0721y0.f9049q = null;
                c0721y0.f9050r = null;
                interfaceC0672h1.a(o0.f7180n.g("InternalSubchannel closed transport due to address change"));
                return;
            case 13:
                ((Z0) ((C0644E) this.f1329b).f8442b).C();
                return;
            case 14:
                Z0 z02 = ((Q0) this.f1329b).f8568e;
                z02.f8714p.e();
                if (z02.f8724z) {
                    z02.f8723y.k();
                    return;
                }
                return;
            case 15:
                C0721y0 c0721y02 = ((Y0) this.f1329b).f;
                o0 o0Var = Z0.f8669k0;
                c0721y02.getClass();
                c0721y02.f9043k.execute(new RunnableC0700r0(c0721y02, o0Var, 0));
                return;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                C0716w1 c0716w1 = (C0716w1) this.f1329b;
                c0716w1.f9028k = null;
                if (c0716w1.f9026h.b()) {
                    c0716w1.e();
                    return;
                }
                return;
            case 17:
                ((AbstractC0471A) ((C0710u1) this.f1329b).f9013c).l();
                return;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                N0 n02 = (N0) this.f1329b;
                if (!n02.f8545z) {
                    n02.f8540u.n();
                    return;
                }
                return;
            case 19:
                W1 w12 = (W1) this.f1329b;
                Y1 y12 = w12.f8638b;
                Z z7 = N0.f8514E;
                ((N0) w12.f8639c.f8985c).r(y12);
                return;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                ((d2) this.f1329b).k();
                return;
            case 21:
                ((G) this.f1329b).h();
                return;
            case 22:
                com.google.android.gms.common.api.g gVar = ((G) ((A.c) this.f1329b).f4b).f9176b;
                gVar.disconnect(gVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 23:
                ((T) this.f1329b).f9212i.j(new W2.b(4));
                return;
            case 24:
                C0906c c0906c = (C0906c) this.f1329b;
                try {
                    Q6.c cVar = c0906c.f10361Z;
                    if (cVar != null) {
                        Q6.e eVar = c0906c.f10363b;
                        long j9 = eVar.f4462b;
                        if (j9 > 0) {
                            cVar.l(eVar, j9);
                        }
                    }
                } catch (IOException e13) {
                    c0906c.f10365d.q(e13);
                }
                Q6.e eVar2 = c0906c.f10363b;
                p pVar = c0906c.f10365d;
                try {
                    Q6.c cVar2 = c0906c.f10361Z;
                    if (cVar2 != null) {
                        cVar2.close();
                    }
                } catch (IOException e14) {
                    pVar.q(e14);
                }
                try {
                    Socket socket = c0906c.f10367e0;
                    if (socket != null) {
                        socket.close();
                        return;
                    }
                    return;
                } catch (IOException e15) {
                    pVar.q(e15);
                    return;
                }
            case 25:
                J2.e eVar3 = (J2.e) this.f1329b;
                long j10 = eVar3.f2402b;
                long max = Math.max(2 * j10, j10);
                C0661e c0661e = (C0661e) eVar3.f2403c;
                if (c0661e.f8816b.compareAndSet(j10, max)) {
                    C0661e.f8814c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{c0661e.f8815a, Long.valueOf(max)});
                    return;
                }
                return;
            case 26:
                b();
                return;
            case 27:
                Object obj = ((A.c) this.f1329b).f4b;
                return;
            case 28:
                this.f1329b.e();
                return;
            default:
                k.e eVar4 = (k.e) this.f1329b;
                eVar4.a(true);
                eVar4.invalidateSelf();
                return;
        }
    }

    public c(A.c cVar, int i7) {
        this.f1328a = 27;
        this.f1329b = cVar;
    }
}
