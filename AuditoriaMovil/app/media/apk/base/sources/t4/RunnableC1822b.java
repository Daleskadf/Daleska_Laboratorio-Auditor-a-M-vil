package t4;

import A3.N;
import H4.e1;
import H4.p1;
import O0.d0;
import a.AbstractC0412a;
import a1.C0415A;
import a6.C0483l;
import a6.Z;
import a6.b0;
import a6.e0;
import a6.o0;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.TotalCaptureResult;
import android.net.ConnectivityManager;
import android.view.Surface;
import android.view.ViewGroup;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.l0;
import androidx.camera.core.impl.m0;
import androidx.camera.core.impl.u0;
import androidx.camera.core.impl.w0;
import b6.C0615a;
import b6.C0616b;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.libraries.barhopper.RecognitionOptions;
import j$.util.DesugarCollections;
import java.util.BitSet;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import org.apache.tika.utils.XMLReaderUtils;
import t5.C1832d;
import t5.C1833e;
import t5.C1834f;
import w.C1908S;
import w.C1925j;
import w.C1936u;
import w.InterfaceC1924i;
import x5.C2000b;
import x5.C2002d;
import x5.C2003e;
import x5.C2014p;
import x5.C2017s;
import z0.C2046f;
import z0.C2047g;
/* renamed from: t4.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1822b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15780a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15781b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f15782c;

    public /* synthetic */ RunnableC1822b(int i7, Object obj, Object obj2) {
        this.f15780a = i7;
        this.f15781b = obj;
        this.f15782c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set<String> unmodifiableSet;
        Integer num;
        C0415A c0415a;
        Integer num2 = null;
        switch (this.f15780a) {
            case 0:
                N n7 = (N) this.f15781b;
                if (u4.q.c()) {
                    HashMap hashMap = new HashMap();
                    e0 e0Var = (e0) this.f15782c;
                    if (e0Var.f7143b == 0) {
                        unmodifiableSet = Collections.emptySet();
                    } else {
                        HashSet hashSet = new HashSet(e0Var.f7143b);
                        for (int i7 = 0; i7 < e0Var.f7143b; i7++) {
                            hashSet.add(new String(e0Var.e(i7), 0));
                        }
                        unmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    for (String str : unmodifiableSet) {
                        if (i.f15803d.contains(str.toLowerCase(Locale.ENGLISH))) {
                            C0483l c0483l = e0.f7140d;
                            BitSet bitSet = b0.f7117d;
                            hashMap.put(str, (String) e0Var.c(new Z(str, c0483l)));
                        }
                    }
                    if (!hashMap.isEmpty()) {
                        AbstractC1823c abstractC1823c = (AbstractC1823c) n7.f106d;
                        u4.q.a(abstractC1823c.getClass().getSimpleName(), "(%x) Stream received headers: %s", Integer.valueOf(System.identityHashCode(abstractC1823c)), hashMap);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                o0 o0Var = (o0) this.f15782c;
                boolean e7 = o0Var.e();
                AbstractC1823c abstractC1823c2 = (AbstractC1823c) ((N) this.f15781b).f106d;
                if (e7) {
                    u4.q.a(abstractC1823c2.getClass().getSimpleName(), "(%x) Stream closed.", Integer.valueOf(System.identityHashCode(abstractC1823c2)));
                } else {
                    u4.q.d(abstractC1823c2.getClass().getSimpleName(), "(%x) Stream closed with status: %s.", Integer.valueOf(System.identityHashCode(abstractC1823c2)), o0Var);
                }
                m5.d.i("Can't handle server close on non-started stream!", abstractC1823c2.d(), new Object[0]);
                abstractC1823c2.a(u.Error, o0Var);
                return;
            case 2:
                ((ConnectivityManager) ((E.e) this.f15781b).f921c).unregisterNetworkCallback((C0615a) this.f15782c);
                return;
            case 3:
                ((Context) ((E.e) this.f15781b).f920b).unregisterReceiver((C0616b) this.f15782c);
                return;
            case 4:
                d0 d0Var = (d0) this.f15781b;
                d0Var.getClass();
                EnumC1827g enumC1827g = EnumC1827g.REACHABLE;
                EnumC1827g enumC1827g2 = (EnumC1827g) this.f15782c;
                boolean equals = enumC1827g2.equals(enumC1827g);
                X x7 = (X) d0Var.f3692h;
                if (!equals || !((n4.z) x7.f7591c).equals(n4.z.ONLINE)) {
                    if ((!enumC1827g2.equals(EnumC1827g.UNREACHABLE) || !((n4.z) x7.f7591c).equals(n4.z.OFFLINE)) && d0Var.f3687b) {
                        u4.q.a("RemoteStore", "Restarting streams for network reachability change.", new Object[0]);
                        d0Var.f3687b = false;
                        d0Var.c();
                        x7.d(n4.z.UNKNOWN);
                        ((C1820H) d0Var.j).b();
                        ((C1819G) d0Var.f3693i).b();
                        d0Var.e();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                C1834f c1834f = (C1834f) this.f15781b;
                c1834f.getClass();
                C1833e c1833e = (C1833e) this.f15782c;
                c1833e.f15879b.run();
                c1834f.f = c1833e;
                c1834f.f15884e.run();
                return;
            case 6:
                Y1.y yVar = (Y1.y) this.f15781b;
                C1834f c1834f2 = (C1834f) this.f15782c;
                synchronized (yVar) {
                    HashSet hashSet2 = new HashSet((HashSet) yVar.f6700e);
                    ((HashSet) yVar.f).remove(c1834f2);
                    ((HashSet) yVar.f6700e).add(c1834f2);
                    C1833e c1833e2 = c1834f2.f;
                    if (c1833e2 == null || (c0415a = c1833e2.f15878a) == null || !((C1832d) c0415a.f6744a).j()) {
                        C1833e c1833e3 = c1834f2.f;
                        if (c1833e3 != null) {
                            num = c1833e3.a();
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            HashMap hashMap2 = (HashMap) yVar.f6695X;
                            C1833e c1833e4 = c1834f2.f;
                            if (c1833e4 != null) {
                                num2 = c1833e4.a();
                            }
                            hashMap2.remove(num2);
                        }
                    }
                    yVar.g(c1834f2);
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        yVar.g((C1834f) it.next());
                    }
                }
                return;
            case 7:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f15781b;
                try {
                    taskCompletionSource.setResult(((Callable) this.f15782c).call());
                    return;
                } catch (Exception e8) {
                    taskCompletionSource.setException(e8);
                    throw new RuntimeException(e8);
                }
            case 8:
                u4.f fVar = (u4.f) this.f15781b;
                fVar.getClass();
                ((Runnable) this.f15782c).run();
                fVar.f15991a.release();
                return;
            case 9:
                u4.l lVar = (u4.l) this.f15781b;
                lVar.getClass();
                lVar.f16012g = new Date().getTime();
                ((Runnable) this.f15782c).run();
                return;
            case 10:
                u4.s sVar = (u4.s) this.f15781b;
                sVar.getClass();
                ((Runnable) this.f15782c).run();
                sVar.f16017b.release();
                return;
            case 11:
                final C1925j c1925j = (C1925j) this.f15781b;
                final long o7 = c1925j.o();
                H.i.e(true, AbstractC0412a.s(new U.j() { // from class: w.f
                    @Override // U.j
                    public final Object i(final U.i iVar) {
                        C1925j c1925j2 = C1925j.this;
                        c1925j2.getClass();
                        final long j = o7;
                        c1925j2.a(new InterfaceC1924i() { // from class: w.g
                            @Override // w.InterfaceC1924i
                            public final boolean b(TotalCaptureResult totalCaptureResult) {
                                Long l8;
                                long j8 = j;
                                boolean z7 = false;
                                if (totalCaptureResult.getRequest() != null) {
                                    Object tag = totalCaptureResult.getRequest().getTag();
                                    if ((tag instanceof u0) && (l8 = (Long) ((u0) tag).f7674a.get("CameraControlSessionUpdateId")) != null && l8.longValue() >= j8) {
                                        z7 = true;
                                    }
                                }
                                if (z7) {
                                    iVar.a(null);
                                    return true;
                                }
                                return false;
                            }
                        });
                        return "waitForSessionUpdateId:" + j;
                    }
                }), (U.i) this.f15782c, j3.f.r());
                return;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                A.k kVar = (A.k) this.f15781b;
                kVar.getClass();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = (HashSet) kVar.f21b;
                Iterator it2 = hashSet4.iterator();
                while (it2.hasNext()) {
                    InterfaceC1924i interfaceC1924i = (InterfaceC1924i) it2.next();
                    if (interfaceC1924i.b((TotalCaptureResult) this.f15782c)) {
                        hashSet3.add(interfaceC1924i);
                    }
                }
                if (!hashSet3.isEmpty()) {
                    hashSet4.removeAll(hashSet3);
                    return;
                }
                return;
            case 13:
                ((l0) this.f15781b).a((androidx.camera.core.impl.o0) this.f15782c, m0.SESSION_ERROR_SURFACE_NEEDS_RESET);
                return;
            case 14:
                ((Surface) this.f15781b).release();
                ((SurfaceTexture) this.f15782c).release();
                return;
            case 15:
                C1936u c1936u = (C1936u) this.f15781b;
                C1908S c1908s = c1936u.f16291s0;
                U.i iVar = (U.i) this.f15782c;
                if (c1908s == null) {
                    iVar.a(Boolean.FALSE);
                    return;
                } else {
                    iVar.a(Boolean.valueOf(c1936u.f16273a.L(C1936u.w(c1908s))));
                    return;
                }
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                C1936u c1936u2 = (C1936u) this.f15781b;
                c1936u2.getClass();
                StringBuilder sb = new StringBuilder("Use case ");
                String str2 = (String) this.f15782c;
                sb.append(str2);
                sb.append(" INACTIVE");
                c1936u2.t(sb.toString(), null);
                LinkedHashMap linkedHashMap = (LinkedHashMap) c1936u2.f16273a.f7210c;
                if (linkedHashMap.containsKey(str2)) {
                    w0 w0Var = (w0) linkedHashMap.get(str2);
                    w0Var.f = false;
                    if (!w0Var.f7681e) {
                        linkedHashMap.remove(str2);
                    }
                }
                c1936u2.K();
                return;
            case 17:
                j7.e this$0 = (j7.e) this.f15781b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                Object obj = this.f15782c;
                L5.h hVar = this$0.f13475b;
                if (hVar != null) {
                    hVar.c(obj);
                    return;
                }
                return;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                String errorMessage = (String) this.f15782c;
                kotlin.jvm.internal.j.e(errorMessage, "$errorMessage");
                L5.h hVar2 = ((j7.e) this.f15781b).f13475b;
                if (hVar2 != null) {
                    hVar2.b("MOBILE_SCANNER_BARCODE_ERROR", errorMessage, null);
                    return;
                }
                return;
            case 19:
                C2003e this$02 = (C2003e) this.f15781b;
                kotlin.jvm.internal.j.e(this$02, "this$0");
                K5.h orientation = (K5.h) this.f15782c;
                kotlin.jvm.internal.j.e(orientation, "$orientation");
                L5.h hVar3 = this$02.f16508b;
                if (hVar3 != null) {
                    hVar3.c(android.support.v4.media.session.a.v(orientation));
                    return;
                }
                return;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                C2014p this$03 = (C2014p) this.f15781b;
                kotlin.jvm.internal.j.e(this$03, "this$0");
                String it3 = (String) this.f15782c;
                kotlin.jvm.internal.j.e(it3, "$it");
                K5.r rVar = this$03.f16555X;
                if (rVar != null) {
                    rVar.b(null, "MOBILE_SCANNER_BARCODE_ERROR", it3);
                }
                this$03.f16555X = null;
                return;
            case 21:
                C2014p this$04 = (C2014p) this.f15781b;
                kotlin.jvm.internal.j.e(this$04, "this$0");
                List it4 = (List) this.f15782c;
                kotlin.jvm.internal.j.e(it4, "$it");
                K5.r rVar2 = this$04.f16555X;
                if (rVar2 != null) {
                    rVar2.a(m6.s.Q(new l6.d("name", "barcode"), new l6.d("data", it4)));
                }
                this$04.f16555X = null;
                return;
            case 22:
                y5.d it5 = (y5.d) this.f15782c;
                kotlin.jvm.internal.j.e(it5, "$it");
                ((K5.r) this.f15781b).a(m6.s.Q(new l6.d("textureId", Long.valueOf(it5.f16618g)), new l6.d("size", m6.s.Q(new l6.d("width", Double.valueOf(it5.f16613a)), new l6.d("height", Double.valueOf(it5.f16614b)))), new l6.d("naturalDeviceOrientation", it5.f16615c), new l6.d("handlesCropAndRotation", Boolean.valueOf(it5.f16617e)), new l6.d("sensorOrientation", Integer.valueOf(it5.f16616d)), new l6.d("currentTorchState", Integer.valueOf(it5.f)), new l6.d("numberOfCameras", Integer.valueOf(it5.f16619h)), new l6.d("cameraDirection", it5.f16620i)));
                return;
            case 23:
                Exception it6 = (Exception) this.f15781b;
                kotlin.jvm.internal.j.e(it6, "$it");
                K5.r rVar3 = (K5.r) this.f15782c;
                if (it6 instanceof C2000b) {
                    rVar3.b(null, "MOBILE_SCANNER_ALREADY_STARTED_ERROR", "The scanner was already started.");
                    return;
                } else if (it6 instanceof C2002d) {
                    rVar3.b(null, "MOBILE_SCANNER_CAMERA_ERROR", "An error occurred when opening the camera.");
                    return;
                } else if (it6 instanceof C2017s) {
                    rVar3.b(null, "MOBILE_SCANNER_NO_CAMERA_ERROR", "No cameras available.");
                    return;
                } else {
                    rVar3.b(null, "MOBILE_SCANNER_GENERIC_ERROR", "An unknown error occurred.");
                    return;
                }
            default:
                ViewGroup container = (ViewGroup) this.f15781b;
                kotlin.jvm.internal.j.e(container, "$container");
                C2046f this$05 = (C2046f) this.f15782c;
                kotlin.jvm.internal.j.e(this$05, "this$0");
                container.endViewTransition(null);
                C2047g c2047g = this$05.f16765b;
                throw null;
        }
    }
}
