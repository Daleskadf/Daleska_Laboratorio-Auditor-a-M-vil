package M0;

import A3.H;
import A3.K;
import A3.e0;
import B5.AbstractC0046t;
import B5.P;
import D.AbstractC0059i;
import D.C0075z;
import D.RunnableC0053c;
import H0.C0129i;
import H0.J;
import H4.e1;
import O0.Y;
import O0.Z;
import O0.a0;
import O0.c0;
import O0.d0;
import O0.j0;
import S1.F;
import a1.C0415A;
import a1.C0417C;
import a1.C0418D;
import a1.C0420F;
import a1.C0426c;
import a1.C0429f;
import a1.C0430g;
import a1.C0436m;
import a1.C0437n;
import a1.RunnableC0435l;
import a1.RunnableC0438o;
import a4.AbstractC0467p;
import a4.C0454c;
import a4.C0468q;
import a6.C0472a;
import a6.C0473b;
import a6.o0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Trace;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;
import b4.C0599g;
import com.example.appecoactivate.R;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.auth.zze;
import com.google.android.gms.internal.p002firebaseauthapi.zzaed;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.auth.FirebaseAuth;
import e1.C0960z;
import e1.InterfaceC0934D;
import e1.T;
import h3.AbstractC1079a;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import m1.C1434h;
import m1.G;
import m1.InterfaceC1426A;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.utils.StringUtils;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class x implements H.c, N2.h, InterfaceC0934D, T0.e, L5.p, J1.l, m1.i, S1.C, V0.p, X0.i, i1.p, m1.q, Continuation {

    /* renamed from: d  reason: collision with root package name */
    public static P f3208d;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3209a;

    /* renamed from: b  reason: collision with root package name */
    public Object f3210b;

    /* renamed from: c  reason: collision with root package name */
    public Object f3211c;

    public /* synthetic */ x(char c8, int i7) {
        this.f3209a = i7;
    }

    @Override // e1.InterfaceC0934D
    public void A(int i7, C0960z c0960z, e1.r rVar, b1.g gVar, IOException iOException, boolean z7) {
        Pair y2 = y(i7, c0960z);
        if (y2 != null) {
            ((K0.u) ((d0) this.f3211c).j).c(new a0(this, y2, rVar, gVar, iOException, z7, 0));
        }
    }

    @Override // e1.InterfaceC0934D
    public void B(int i7, C0960z c0960z, b1.g gVar) {
        Pair y2 = y(i7, c0960z);
        if (y2 != null) {
            ((K0.u) ((d0) this.f3211c).j).c(new Y(this, y2, gVar, 1));
        }
    }

    @Override // e1.InterfaceC0934D
    public void C(int i7, C0960z c0960z, b1.g gVar) {
        Pair y2 = y(i7, c0960z);
        if (y2 != null) {
            ((K0.u) ((d0) this.f3211c).j).c(new Y(this, y2, gVar, 0));
        }
    }

    public synchronized Map D() {
        try {
            if (((Map) this.f3211c) == null) {
                this.f3211c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f3210b));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f3211c;
    }

    public void E(P6.f fVar, boolean z7, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("completed", Boolean.valueOf(z7));
        hashMap.put("error", str);
        hashMap.put("job", Integer.valueOf(fVar.f4084g));
        ((L5.r) this.f3211c).a("onCompleted", hashMap, null);
    }

    public void F(x xVar) {
        boolean z7;
        boolean z8;
        boolean z9;
        C0417C c0417c = C0417C.f6749c;
        String str = (String) ((C0420F) xVar.f3211c).f6766a.get("range");
        C0436m c0436m = (C0436m) this.f3211c;
        if (str != null) {
            try {
                c0417c = C0417C.a(str);
            } catch (J e7) {
                c0436m.f6852a.s0("SDP format error.", e7);
                return;
            }
        }
        Uri uri = c0436m.f6850Y;
        H h8 = new H();
        int i7 = 0;
        while (true) {
            C0420F c0420f = (C0420F) xVar.f3211c;
            if (i7 < c0420f.f6767b.size()) {
                C0426c c0426c = (C0426c) c0420f.f6767b.get(i7);
                String B7 = AbstractC1740d.B(c0426c.j.f6794b);
                B7.getClass();
                char c8 = 65535;
                switch (B7.hashCode()) {
                    case -1922091719:
                        if (B7.equals("MPEG4-GENERIC")) {
                            c8 = 0;
                            break;
                        }
                        break;
                    case 2412:
                        if (B7.equals("L8")) {
                            c8 = 1;
                            break;
                        }
                        break;
                    case 64593:
                        if (B7.equals("AC3")) {
                            c8 = 2;
                            break;
                        }
                        break;
                    case 64934:
                        if (B7.equals("AMR")) {
                            c8 = 3;
                            break;
                        }
                        break;
                    case 74609:
                        if (B7.equals("L16")) {
                            c8 = 4;
                            break;
                        }
                        break;
                    case 85182:
                        if (B7.equals("VP8")) {
                            c8 = 5;
                            break;
                        }
                        break;
                    case 85183:
                        if (B7.equals("VP9")) {
                            c8 = 6;
                            break;
                        }
                        break;
                    case 2194728:
                        if (B7.equals("H264")) {
                            c8 = 7;
                            break;
                        }
                        break;
                    case 2194729:
                        if (B7.equals("H265")) {
                            c8 = '\b';
                            break;
                        }
                        break;
                    case 2433087:
                        if (B7.equals("OPUS")) {
                            c8 = '\t';
                            break;
                        }
                        break;
                    case 2450119:
                        if (B7.equals("PCMA")) {
                            c8 = '\n';
                            break;
                        }
                        break;
                    case 2450139:
                        if (B7.equals("PCMU")) {
                            c8 = 11;
                            break;
                        }
                        break;
                    case 1061166827:
                        if (B7.equals("MP4A-LATM")) {
                            c8 = '\f';
                            break;
                        }
                        break;
                    case 1934494802:
                        if (B7.equals("AMR-WB")) {
                            c8 = '\r';
                            break;
                        }
                        break;
                    case 1959269366:
                        if (B7.equals("MP4V-ES")) {
                            c8 = 14;
                            break;
                        }
                        break;
                    case 2137188397:
                        if (B7.equals("H263-1998")) {
                            c8 = 15;
                            break;
                        }
                        break;
                    case 2137209252:
                        if (B7.equals("H263-2000")) {
                            c8 = 16;
                            break;
                        }
                        break;
                }
                switch (c8) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case '\b':
                    case '\t':
                    case '\n':
                    case 11:
                    case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    case '\r':
                    case 14:
                    case 15:
                    case RecognitionOptions.DATA_MATRIX /* 16 */:
                        z9 = true;
                        break;
                    default:
                        z9 = false;
                        break;
                }
                if (z9) {
                    h8.c(new a1.v((C0437n) xVar.f3210b, c0426c, uri));
                }
                i7++;
            } else {
                e0 g3 = h8.g();
                boolean isEmpty = g3.isEmpty();
                C5.i iVar = c0436m.f6852a;
                if (isEmpty) {
                    iVar.s0("No playable track.", null);
                    return;
                }
                iVar.getClass();
                int i8 = 0;
                while (true) {
                    int size = g3.size();
                    a1.r rVar = (a1.r) iVar.f593b;
                    if (i8 < size) {
                        a1.q qVar = new a1.q(rVar, (a1.v) g3.get(i8), i8, rVar.f6880Y);
                        rVar.f6886e.add(qVar);
                        qVar.b();
                        i8++;
                    } else {
                        A.m j = a1.r.j(rVar);
                        j.getClass();
                        long j8 = c0417c.f6751a;
                        long j9 = c0417c.f6752b;
                        long M7 = K0.x.M(j9 - j8);
                        a1.u uVar = (a1.u) j.f28b;
                        uVar.f6904g0 = M7;
                        if (j9 == -9223372036854775807L) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        uVar.f6905h0 = !z7;
                        if (j9 == -9223372036854775807L) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        uVar.f6906i0 = z8;
                        uVar.f6907j0 = false;
                        uVar.u();
                        c0436m.f6863k0 = true;
                        return;
                    }
                }
            }
        }
    }

    public void G(C0415A c0415a) {
        C0436m c0436m = (C0436m) this.f3211c;
        if (c0436m.f6860h0 != null) {
            return;
        }
        K k2 = (K) c0415a.f6744a;
        if (!k2.isEmpty() && !k2.contains(2)) {
            c0436m.f6852a.s0("DESCRIBE not supported.", null);
            return;
        }
        c0436m.f6849X.q(c0436m.f6850Y, c0436m.f6858f0);
    }

    public void H(P6.f fVar, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("job", Integer.valueOf(fVar.f4084g));
        if (str != null) {
            hashMap.put("error", str);
        }
        ((L5.r) this.f3211c).a("onPageRasterEnd", hashMap, null);
    }

    public void I() {
        boolean z7;
        C0436m c0436m = (C0436m) this.f3211c;
        if (c0436m.f6862j0 == 2) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        c0436m.f6862j0 = 1;
        c0436m.f6865m0 = false;
        long j = c0436m.f6866n0;
        if (j != -9223372036854775807L) {
            c0436m.n(K0.x.Z(j));
        }
    }

    public void J(x xVar) {
        boolean z7;
        a1.r rVar;
        C0429f c0429f;
        C0436m c0436m = (C0436m) this.f3211c;
        int i7 = c0436m.f6862j0;
        if (i7 != 1 && i7 != 2) {
            z7 = false;
        } else {
            z7 = true;
        }
        K0.a.j(z7);
        c0436m.f6862j0 = 2;
        if (c0436m.f6860h0 == null) {
            long j = c0436m.f6859g0 / 2;
            RunnableC0435l runnableC0435l = new RunnableC0435l(c0436m, j);
            c0436m.f6860h0 = runnableC0435l;
            if (!runnableC0435l.f6847c) {
                runnableC0435l.f6847c = true;
                runnableC0435l.f6845a.postDelayed(runnableC0435l, j);
            }
        }
        c0436m.f6866n0 = -9223372036854775807L;
        C5.i iVar = c0436m.f6853b;
        long M7 = K0.x.M(((C0417C) xVar.f3210b).f6751a);
        K k2 = (K) xVar.f3211c;
        iVar.getClass();
        ArrayList arrayList = new ArrayList(k2.size());
        for (int i8 = 0; i8 < k2.size(); i8++) {
            String path = ((C0418D) k2.get(i8)).f6755c.getPath();
            K0.a.h(path);
            arrayList.add(path);
        }
        int i9 = 0;
        while (true) {
            rVar = (a1.r) iVar.f593b;
            if (i9 >= a1.r.h(rVar).size()) {
                break;
            }
            if (!arrayList.contains(((a1.p) a1.r.h(rVar).get(i9)).a().getPath())) {
                a1.u uVar = (a1.u) a1.r.j(rVar).f28b;
                uVar.f6905h0 = false;
                uVar.u();
                if (a1.r.s(rVar)) {
                    rVar.f6894l0 = true;
                    a1.r.b(rVar);
                    a1.r.v(rVar);
                    a1.r.g(rVar);
                }
            }
            i9++;
        }
        for (int i10 = 0; i10 < k2.size(); i10++) {
            C0418D c0418d = (C0418D) k2.get(i10);
            Uri uri = c0418d.f6755c;
            int i11 = 0;
            while (true) {
                ArrayList arrayList2 = rVar.f6886e;
                if (i11 < arrayList2.size()) {
                    if (!((a1.q) arrayList2.get(i11)).f6877d) {
                        a1.p pVar = ((a1.q) arrayList2.get(i11)).f6874a;
                        if (pVar.a().equals(uri)) {
                            c0429f = pVar.f6871b;
                            break;
                        }
                    }
                    i11++;
                } else {
                    c0429f = null;
                    break;
                }
            }
            if (c0429f != null) {
                long j8 = c0418d.f6753a;
                if (j8 != -9223372036854775807L) {
                    C0430g c0430g = c0429f.f6806Y;
                    c0430g.getClass();
                    if (!c0430g.f6822h) {
                        c0429f.f6806Y.f6823i = j8;
                    }
                } else {
                    c0429f.getClass();
                }
                int i12 = c0418d.f6754b;
                C0430g c0430g2 = c0429f.f6806Y;
                c0430g2.getClass();
                if (!c0430g2.f6822h) {
                    c0429f.f6806Y.j = i12;
                }
                if (a1.r.s(rVar) && a1.r.a(rVar) == a1.r.u(rVar)) {
                    c0429f.f6814f0 = M7;
                    c0429f.f6815g0 = j8;
                }
            }
        }
        if (a1.r.s(rVar)) {
            if (a1.r.a(rVar) == a1.r.u(rVar)) {
                a1.r.b(rVar);
                a1.r.v(rVar);
                return;
            }
            a1.r.b(rVar);
            rVar.q(a1.r.u(rVar));
        } else if (a1.r.e(rVar) != -9223372036854775807L && rVar.q0) {
            rVar.q(a1.r.e(rVar));
            a1.r.g(rVar);
        }
    }

    public void K(C5.i iVar) {
        boolean z7;
        C0436m c0436m = (C0436m) this.f3211c;
        if (c0436m.f6862j0 != -1) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        c0436m.f6862j0 = 1;
        J2.e eVar = (J2.e) iVar.f593b;
        c0436m.f6858f0 = (String) eVar.f2403c;
        c0436m.f6859g0 = eVar.f2402b;
        c0436m.g();
    }

    public void L(C0472a c0472a, Object obj) {
        if (((IdentityHashMap) this.f3211c) == null) {
            this.f3211c = new IdentityHashMap(1);
        }
        ((IdentityHashMap) this.f3211c).put(c0472a, obj);
    }

    @Override // J1.l
    public /* synthetic */ void a() {
    }

    @Override // S1.C
    public void b(K0.q qVar) {
        F f;
        if (qVar.u() != 0 || (qVar.u() & RecognitionOptions.ITF) == 0) {
            return;
        }
        qVar.H(6);
        int a7 = qVar.a() / 4;
        int i7 = 0;
        while (true) {
            f = (F) this.f3211c;
            if (i7 >= a7) {
                break;
            }
            K0.p pVar = (K0.p) this.f3210b;
            qVar.f(pVar.f2509d, 0, 4);
            pVar.q(0);
            int i8 = pVar.i(16);
            pVar.t(3);
            if (i8 == 0) {
                pVar.t(13);
            } else {
                int i9 = pVar.i(13);
                if (f.f4943h.get(i9) == null) {
                    f.f4943h.put(i9, new S1.D(new B.a(f, i9)));
                    f.f4948n++;
                }
            }
            i7++;
        }
        if (f.f4937a != 2) {
            f.f4943h.remove(0);
        }
    }

    @Override // e1.InterfaceC0934D
    public void d(int i7, C0960z c0960z, e1.r rVar, b1.g gVar) {
        Pair y2 = y(i7, c0960z);
        if (y2 != null) {
            ((K0.u) ((d0) this.f3211c).j).c(new Z(this, y2, rVar, gVar, 1));
        }
    }

    @Override // e1.InterfaceC0934D
    public void e(int i7, C0960z c0960z, e1.r rVar, b1.g gVar) {
        Pair y2 = y(i7, c0960z);
        if (y2 != null) {
            ((K0.u) ((d0) this.f3211c).j).c(new Z(this, y2, rVar, gVar, 2));
        }
    }

    @Override // J1.l
    public /* synthetic */ J1.d g(byte[] bArr, int i7, int i8) {
        return AbstractC0059i.o(this, bArr, i8);
    }

    @Override // m1.q
    public void h() {
        a1.r rVar = (a1.r) this.f3211c;
        rVar.f6883b.post(new RunnableC0438o(rVar, 0));
    }

    @Override // N2.h
    public Object i(IBinder iBinder) {
        Bundle zzd = zze.zzb(iBinder).zzd((String) this.f3210b, (Bundle) this.f3211c);
        if (zzd != null) {
            String string = zzd.getString("Error");
            if (zzd.getBoolean("booleanResult")) {
                return null;
            }
            throw new Exception(string);
        }
        N2.d.f3394c.f("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    @Override // i1.p
    public Object j(Uri uri, j jVar) {
        Z0.a aVar = (Z0.a) ((i1.p) this.f3210b).j(uri, jVar);
        List list = (List) this.f3211c;
        if (list != null && !list.isEmpty()) {
            return (Z0.a) aVar.a(list);
        }
        return aVar;
    }

    @Override // V0.p
    public i1.p k(V0.l lVar, V0.i iVar) {
        ((t2.i) this.f3210b).getClass();
        return new x(new V0.o(lVar, iVar), (List) this.f3211c, 20, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03a3, code lost:
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0114, code lost:
        if (")".equals(R1.a.b(r8, r11)) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0123, code lost:
        r1 = r5;
        r3 = 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16, types: [R1.b, java.lang.Object] */
    @Override // J1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(byte[] r20, int r21, int r22, J1.k r23, K0.c r24) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.x.l(byte[], int, int, J1.k, K0.c):void");
    }

    @Override // J1.l
    public int m() {
        return 1;
    }

    @Override // m1.i
    public C1434h n(m1.l lVar, long j) {
        int a7;
        C1434h c1434h;
        long j8 = lVar.f13974d;
        int min = (int) Math.min(20000L, lVar.f13973c - j8);
        K0.q qVar = (K0.q) this.f3211c;
        qVar.D(min);
        lVar.q(qVar.f2513a, 0, min, false);
        int i7 = -1;
        int i8 = -1;
        long j9 = -9223372036854775807L;
        while (qVar.a() >= 4) {
            if (S1.y.a(qVar.f2513a, qVar.f2514b) != 442) {
                qVar.H(1);
            } else {
                qVar.H(4);
                long c8 = S1.z.c(qVar);
                if (c8 != -9223372036854775807L) {
                    long b5 = ((K0.v) this.f3210b).b(c8);
                    if (b5 > j) {
                        if (j9 == -9223372036854775807L) {
                            return new C1434h(-1, b5, j8);
                        }
                        c1434h = new C1434h(0, -9223372036854775807L, j8 + i8);
                    } else if (PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH + b5 > j) {
                        c1434h = new C1434h(0, -9223372036854775807L, j8 + qVar.f2514b);
                    } else {
                        i8 = qVar.f2514b;
                        j9 = b5;
                    }
                    return c1434h;
                }
                int i9 = qVar.f2515c;
                if (qVar.a() < 10) {
                    qVar.G(i9);
                } else {
                    qVar.H(9);
                    int u7 = qVar.u() & 7;
                    if (qVar.a() < u7) {
                        qVar.G(i9);
                    } else {
                        qVar.H(u7);
                        if (qVar.a() < 4) {
                            qVar.G(i9);
                        } else {
                            if (S1.y.a(qVar.f2513a, qVar.f2514b) == 443) {
                                qVar.H(4);
                                int A7 = qVar.A();
                                if (qVar.a() < A7) {
                                    qVar.G(i9);
                                } else {
                                    qVar.H(A7);
                                }
                            }
                            while (true) {
                                if (qVar.a() < 4 || (a7 = S1.y.a(qVar.f2513a, qVar.f2514b)) == 442 || a7 == 441 || (a7 >>> 8) != 1) {
                                    break;
                                }
                                qVar.H(4);
                                if (qVar.a() < 2) {
                                    qVar.G(i9);
                                    break;
                                }
                                qVar.G(Math.min(qVar.f2515c, qVar.f2514b + qVar.A()));
                            }
                        }
                    }
                }
                i7 = qVar.f2514b;
            }
        }
        if (j9 != -9223372036854775807L) {
            return new C1434h(-2, j9, j8 + i7);
        }
        return C1434h.f13955d;
    }

    @Override // e1.InterfaceC0934D
    public void o(int i7, C0960z c0960z, e1.r rVar, b1.g gVar) {
        Pair y2 = y(i7, c0960z);
        if (y2 != null) {
            ((K0.u) ((d0) this.f3211c).j).c(new Z(this, y2, rVar, gVar, 0));
        }
    }

    @Override // L5.p
    public void onMethodCall(L5.o call, L5.q qVar) {
        PrintAttributes.MediaSize asLandscape;
        String[] strArr;
        char c8;
        int i7;
        Toast toast;
        PrintAttributes.MediaSize mediaSize = null;
        View view = null;
        switch (this.f3209a) {
            case 9:
                String str = call.f3038a;
                str.getClass();
                Context context = (Context) this.f3210b;
                char c9 = 65535;
                switch (str.hashCode()) {
                    case -1166349563:
                        if (str.equals("printPdf")) {
                            c9 = 0;
                            break;
                        }
                        break;
                    case -1084323842:
                        if (str.equals("convertHtml")) {
                            c9 = 1;
                            break;
                        }
                        break;
                    case -743774061:
                        if (str.equals("sharePdf")) {
                            c8 = 2;
                            c9 = c8;
                            break;
                        }
                        break;
                    case -236026315:
                        if (str.equals("rasterPdf")) {
                            c9 = 3;
                            break;
                        }
                        break;
                    case 420548707:
                        if (str.equals("printingInfo")) {
                            c8 = 4;
                            c9 = c8;
                            break;
                        }
                        break;
                    case 476556003:
                        if (str.equals("cancelJob")) {
                            c8 = 5;
                            c9 = c8;
                            break;
                        }
                        break;
                }
                switch (c9) {
                    case 0:
                        boolean z7 = false;
                        String str2 = (String) call.a("name");
                        P6.f fVar = new P6.f(context, this, ((Integer) call.a("job")).intValue());
                        fVar.f4083e = str2;
                        PrintAttributes.Builder builder = new PrintAttributes.Builder();
                        int intValue = Double.valueOf((((Double) call.a("width")).doubleValue() * 1000.0d) / 72.0d).intValue();
                        int intValue2 = Double.valueOf((((Double) call.a("height")).doubleValue() * 1000.0d) / 72.0d).intValue();
                        if (intValue2 >= intValue) {
                            z7 = true;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(PrintAttributes.MediaSize.ISO_A0);
                        arrayList.add(PrintAttributes.MediaSize.ISO_A1);
                        arrayList.add(PrintAttributes.MediaSize.ISO_A2);
                        arrayList.add(PrintAttributes.MediaSize.ISO_A3);
                        arrayList.add(PrintAttributes.MediaSize.ISO_A4);
                        arrayList.add(PrintAttributes.MediaSize.ISO_A5);
                        arrayList.add(PrintAttributes.MediaSize.ISO_A6);
                        arrayList.add(PrintAttributes.MediaSize.ISO_A7);
                        arrayList.add(PrintAttributes.MediaSize.ISO_A8);
                        arrayList.add(PrintAttributes.MediaSize.ISO_A9);
                        arrayList.add(PrintAttributes.MediaSize.ISO_A10);
                        arrayList.add(PrintAttributes.MediaSize.ISO_B0);
                        arrayList.add(PrintAttributes.MediaSize.ISO_B1);
                        arrayList.add(PrintAttributes.MediaSize.ISO_B2);
                        arrayList.add(PrintAttributes.MediaSize.ISO_B3);
                        arrayList.add(PrintAttributes.MediaSize.ISO_B4);
                        arrayList.add(PrintAttributes.MediaSize.ISO_B5);
                        arrayList.add(PrintAttributes.MediaSize.ISO_B6);
                        arrayList.add(PrintAttributes.MediaSize.ISO_B7);
                        arrayList.add(PrintAttributes.MediaSize.ISO_B8);
                        arrayList.add(PrintAttributes.MediaSize.ISO_B9);
                        arrayList.add(PrintAttributes.MediaSize.ISO_B10);
                        arrayList.add(PrintAttributes.MediaSize.ISO_C0);
                        arrayList.add(PrintAttributes.MediaSize.ISO_C1);
                        arrayList.add(PrintAttributes.MediaSize.ISO_C2);
                        arrayList.add(PrintAttributes.MediaSize.ISO_C3);
                        arrayList.add(PrintAttributes.MediaSize.ISO_C4);
                        arrayList.add(PrintAttributes.MediaSize.ISO_C5);
                        arrayList.add(PrintAttributes.MediaSize.ISO_C6);
                        arrayList.add(PrintAttributes.MediaSize.ISO_C7);
                        arrayList.add(PrintAttributes.MediaSize.ISO_C8);
                        arrayList.add(PrintAttributes.MediaSize.ISO_C9);
                        arrayList.add(PrintAttributes.MediaSize.ISO_C10);
                        arrayList.add(PrintAttributes.MediaSize.NA_LETTER);
                        arrayList.add(PrintAttributes.MediaSize.NA_GOVT_LETTER);
                        arrayList.add(PrintAttributes.MediaSize.NA_LEGAL);
                        arrayList.add(PrintAttributes.MediaSize.NA_JUNIOR_LEGAL);
                        arrayList.add(PrintAttributes.MediaSize.NA_LEDGER);
                        arrayList.add(PrintAttributes.MediaSize.NA_TABLOID);
                        arrayList.add(PrintAttributes.MediaSize.NA_INDEX_3X5);
                        arrayList.add(PrintAttributes.MediaSize.NA_INDEX_4X6);
                        arrayList.add(PrintAttributes.MediaSize.NA_INDEX_5X8);
                        arrayList.add(PrintAttributes.MediaSize.NA_MONARCH);
                        arrayList.add(PrintAttributes.MediaSize.NA_QUARTO);
                        arrayList.add(PrintAttributes.MediaSize.NA_FOOLSCAP);
                        arrayList.add(PrintAttributes.MediaSize.ROC_8K);
                        arrayList.add(PrintAttributes.MediaSize.ROC_16K);
                        arrayList.add(PrintAttributes.MediaSize.PRC_1);
                        arrayList.add(PrintAttributes.MediaSize.PRC_2);
                        arrayList.add(PrintAttributes.MediaSize.PRC_3);
                        arrayList.add(PrintAttributes.MediaSize.PRC_4);
                        arrayList.add(PrintAttributes.MediaSize.PRC_5);
                        arrayList.add(PrintAttributes.MediaSize.PRC_6);
                        arrayList.add(PrintAttributes.MediaSize.PRC_7);
                        arrayList.add(PrintAttributes.MediaSize.PRC_8);
                        arrayList.add(PrintAttributes.MediaSize.PRC_9);
                        arrayList.add(PrintAttributes.MediaSize.PRC_10);
                        arrayList.add(PrintAttributes.MediaSize.PRC_16K);
                        arrayList.add(PrintAttributes.MediaSize.OM_PA_KAI);
                        arrayList.add(PrintAttributes.MediaSize.OM_DAI_PA_KAI);
                        arrayList.add(PrintAttributes.MediaSize.OM_JUURO_KU_KAI);
                        arrayList.add(PrintAttributes.MediaSize.JIS_B10);
                        arrayList.add(PrintAttributes.MediaSize.JIS_B9);
                        arrayList.add(PrintAttributes.MediaSize.JIS_B8);
                        arrayList.add(PrintAttributes.MediaSize.JIS_B7);
                        arrayList.add(PrintAttributes.MediaSize.JIS_B6);
                        arrayList.add(PrintAttributes.MediaSize.JIS_B5);
                        arrayList.add(PrintAttributes.MediaSize.JIS_B4);
                        arrayList.add(PrintAttributes.MediaSize.JIS_B3);
                        arrayList.add(PrintAttributes.MediaSize.JIS_B2);
                        arrayList.add(PrintAttributes.MediaSize.JIS_B1);
                        arrayList.add(PrintAttributes.MediaSize.JIS_B0);
                        arrayList.add(PrintAttributes.MediaSize.JIS_EXEC);
                        arrayList.add(PrintAttributes.MediaSize.JPN_CHOU4);
                        arrayList.add(PrintAttributes.MediaSize.JPN_CHOU3);
                        arrayList.add(PrintAttributes.MediaSize.JPN_CHOU2);
                        arrayList.add(PrintAttributes.MediaSize.JPN_HAGAKI);
                        arrayList.add(PrintAttributes.MediaSize.JPN_OUFUKU);
                        arrayList.add(PrintAttributes.MediaSize.JPN_KAHU);
                        arrayList.add(PrintAttributes.MediaSize.JPN_KAKU2);
                        arrayList.add(PrintAttributes.MediaSize.JPN_YOU4);
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                PrintAttributes.MediaSize mediaSize2 = (PrintAttributes.MediaSize) it.next();
                                if (z7) {
                                    asLandscape = mediaSize2.asPortrait();
                                } else {
                                    asLandscape = mediaSize2.asLandscape();
                                }
                                if (intValue + 20 >= asLandscape.getWidthMils() && intValue - 20 <= asLandscape.getWidthMils() && intValue2 + 20 >= asLandscape.getHeightMils() && intValue2 - 20 <= asLandscape.getHeightMils()) {
                                    mediaSize = asLandscape;
                                }
                            }
                        }
                        if (mediaSize == null) {
                            if (z7) {
                                mediaSize = PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
                            } else {
                                mediaSize = PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
                            }
                        }
                        builder.setMediaSize(mediaSize);
                        fVar.f4081c = P6.f.f4078h.print(str2, fVar, builder.build());
                        ((K5.r) qVar).a(1);
                        return;
                    case 1:
                        P6.f fVar2 = new P6.f(context, this, ((Integer) call.a("job")).intValue());
                        PrintAttributes.Margins margins = new PrintAttributes.Margins(Double.valueOf(((Double) call.a("marginLeft")).doubleValue() * 1000.0d).intValue(), Double.valueOf((((Double) call.a("marginTop")).doubleValue() * 1000.0d) / 72.0d).intValue(), Double.valueOf((((Double) call.a("marginRight")).doubleValue() * 1000.0d) / 72.0d).intValue(), Double.valueOf((((Double) call.a("marginBottom")).doubleValue() * 1000.0d) / 72.0d).intValue());
                        PrintAttributes.MediaSize mediaSize3 = new PrintAttributes.MediaSize("flutter_printing", "Provided size", Double.valueOf((((Double) call.a("width")).doubleValue() * 1000.0d) / 72.0d).intValue(), Double.valueOf((((Double) call.a("height")).doubleValue() * 1000.0d) / 72.0d).intValue());
                        String str3 = (String) call.a("html");
                        String str4 = (String) call.a("baseUrl");
                        Context context2 = fVar2.f4079a;
                        Configuration configuration = context2.getResources().getConfiguration();
                        configuration.fontScale = 1.0f;
                        WebView webView = new WebView(context2.createConfigurationContext(configuration));
                        webView.loadDataWithBaseURL(str4, str3, "text/HTML", "UTF-8", null);
                        webView.setWebViewClient(new P6.e(fVar2, mediaSize3, margins, webView));
                        ((K5.r) qVar).a(1);
                        return;
                    case 2:
                        byte[] bArr = (byte[]) call.a("doc");
                        String str5 = (String) call.a("name");
                        String str6 = (String) call.a("subject");
                        String str7 = (String) call.a("body");
                        ArrayList arrayList2 = (ArrayList) call.a("emails");
                        PrintManager printManager = P6.f.f4078h;
                        try {
                            File file = new File(context.getCacheDir(), "share");
                            if (!file.exists() && !file.mkdirs()) {
                                throw new IOException("Unable to create cache directory");
                            }
                            File file2 = new File(file, str5);
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            fileOutputStream.write(bArr);
                            fileOutputStream.close();
                            Uri d7 = X.f.d(context, context.getApplicationContext().getPackageName() + ".flutter.printing", file2);
                            Intent intent = new Intent();
                            intent.setAction("android.intent.action.SEND");
                            intent.setType("application/pdf");
                            intent.putExtra("android.intent.extra.STREAM", d7);
                            intent.addFlags(1);
                            intent.putExtra("android.intent.extra.SUBJECT", str6);
                            intent.putExtra("android.intent.extra.TEXT", str7);
                            if (arrayList2 != null) {
                                strArr = (String[]) arrayList2.toArray(new String[0]);
                            } else {
                                strArr = null;
                            }
                            intent.putExtra("android.intent.extra.EMAIL", strArr);
                            Intent createChooser = Intent.createChooser(intent, null);
                            for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(createChooser, 65536)) {
                                context.grantUriPermission(resolveInfo.activityInfo.packageName, d7, 3);
                            }
                            context.startActivity(createChooser);
                            file2.deleteOnExit();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                        ((K5.r) qVar).a(1);
                        return;
                    case 3:
                        byte[] bArr2 = (byte[]) call.a("doc");
                        ArrayList arrayList3 = (ArrayList) call.a("pages");
                        Double d8 = (Double) call.a("scale");
                        P6.f fVar3 = new P6.f(context, this, ((Integer) call.a("job")).intValue());
                        Thread thread = new Thread(new M.d(fVar3, bArr2, arrayList3, d8, 3));
                        thread.setUncaughtExceptionHandler(new P6.b(fVar3, 0));
                        thread.start();
                        ((K5.r) qVar).a(1);
                        return;
                    case 4:
                        PrintManager printManager2 = P6.f.f4078h;
                        HashMap hashMap = new HashMap();
                        hashMap.put("directPrint", Boolean.FALSE);
                        Boolean bool = Boolean.TRUE;
                        hashMap.put("dynamicLayout", bool);
                        hashMap.put("canPrint", bool);
                        hashMap.put("canShare", bool);
                        hashMap.put("canRaster", bool);
                        ((K5.r) qVar).a(hashMap);
                        return;
                    case 5:
                        new P6.f(context, this, ((Integer) call.a("job")).intValue()).a(null);
                        ((K5.r) qVar).a(1);
                        return;
                    default:
                        ((K5.r) qVar).c();
                        return;
                }
            default:
                kotlin.jvm.internal.j.e(call, "call");
                String str8 = call.f3038a;
                if (kotlin.jvm.internal.j.a(str8, "showToast")) {
                    String valueOf = String.valueOf(call.a("msg"));
                    String valueOf2 = String.valueOf(call.a("length"));
                    String valueOf3 = String.valueOf(call.a("gravity"));
                    Number number = (Number) call.a("bgcolor");
                    Number number2 = (Number) call.a("textcolor");
                    Number number3 = (Number) call.a("fontSize");
                    String str9 = (String) call.a("fontAsset");
                    if (valueOf3.equals("top")) {
                        i7 = 48;
                    } else if (valueOf3.equals("center")) {
                        i7 = 17;
                    } else {
                        i7 = 80;
                    }
                    boolean equals = valueOf2.equals("long");
                    Context context3 = (Context) this.f3210b;
                    if (number != null) {
                        Object systemService = context3.getSystemService("layout_inflater");
                        kotlin.jvm.internal.j.c(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                        View inflate = ((LayoutInflater) systemService).inflate(R.layout.toast_custom, (ViewGroup) null);
                        TextView textView = (TextView) inflate.findViewById(R.id.text);
                        textView.setText(valueOf);
                        Drawable drawable = context3.getDrawable(R.drawable.corner);
                        kotlin.jvm.internal.j.b(drawable);
                        drawable.setColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN);
                        textView.setBackground(drawable);
                        if (number3 != null) {
                            textView.setTextSize(number3.floatValue());
                        }
                        if (number2 != null) {
                            textView.setTextColor(number2.intValue());
                        }
                        Toast toast2 = new Toast(context3);
                        this.f3211c = toast2;
                        toast2.setDuration(equals ? 1 : 0);
                        if (str9 != null) {
                            AssetManager assets = context3.getAssets();
                            kotlin.jvm.internal.j.d(assets, "context.assets");
                            String b5 = ((F5.d) V2.k.A().f5965b).b(str9);
                            kotlin.jvm.internal.j.d(b5, "instance().flutterLoader…kupKeyForAsset(fontAsset)");
                            textView.setTypeface(Typeface.createFromAsset(assets, b5));
                        }
                        Toast toast3 = (Toast) this.f3211c;
                        if (toast3 != null) {
                            toast3.setView(inflate);
                        }
                    } else {
                        Log.d("KARTHIK", "showToast: " + number + StringUtils.SPACE + number2 + StringUtils.SPACE + number3 + StringUtils.SPACE + str9);
                        Toast makeText = Toast.makeText(context3, valueOf, equals ? 1 : 0);
                        this.f3211c = makeText;
                        if (Build.VERSION.SDK_INT < 30) {
                            if (makeText != null) {
                                view = makeText.getView();
                            }
                            kotlin.jvm.internal.j.b(view);
                            View findViewById = view.findViewById(16908299);
                            kotlin.jvm.internal.j.d(findViewById, "mToast?.view!!.findViewById(android.R.id.message)");
                            TextView textView2 = (TextView) findViewById;
                            if (number3 != null) {
                                textView2.setTextSize(number3.floatValue());
                            }
                            if (number2 != null) {
                                textView2.setTextColor(number2.intValue());
                            }
                            if (str9 != null) {
                                AssetManager assets2 = context3.getAssets();
                                kotlin.jvm.internal.j.d(assets2, "context.assets");
                                String b7 = ((F5.d) V2.k.A().f5965b).b(str9);
                                kotlin.jvm.internal.j.d(b7, "instance().flutterLoader…kupKeyForAsset(fontAsset)");
                                textView2.setTypeface(Typeface.createFromAsset(assets2, b7));
                            }
                        }
                    }
                    try {
                        if (i7 != 17) {
                            if (i7 != 48) {
                                Toast toast4 = (Toast) this.f3211c;
                                if (toast4 != null) {
                                    toast4.setGravity(i7, 0, 100);
                                }
                            } else {
                                Toast toast5 = (Toast) this.f3211c;
                                if (toast5 != null) {
                                    toast5.setGravity(i7, 0, 100);
                                }
                            }
                        } else {
                            Toast toast6 = (Toast) this.f3211c;
                            if (toast6 != null) {
                                toast6.setGravity(i7, 0, 0);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    if (context3 instanceof Activity) {
                        kotlin.jvm.internal.j.c(context3, "null cannot be cast to non-null type android.app.Activity");
                        ((Activity) context3).runOnUiThread(new C.b(this, 24));
                    } else {
                        Toast toast7 = (Toast) this.f3211c;
                        if (toast7 != null) {
                            toast7.show();
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 30 && (toast = (Toast) this.f3211c) != null) {
                        toast.addCallback(new Z5.b(this));
                    }
                    ((K5.r) qVar).a(Boolean.TRUE);
                    return;
                } else if (kotlin.jvm.internal.j.a(str8, "cancel")) {
                    Toast toast8 = (Toast) this.f3211c;
                    if (toast8 != null) {
                        toast8.cancel();
                        this.f3211c = null;
                    }
                    ((K5.r) qVar).a(Boolean.TRUE);
                    return;
                } else {
                    ((K5.r) qVar).c();
                    return;
                }
        }
    }

    @Override // H.c
    public void onSuccess(Object obj) {
        switch (this.f3209a) {
            case 1:
                M.n nVar = (M.n) obj;
                nVar.getClass();
                N.e eVar = (N.e) ((F3.o) this.f3211c).f1178b;
                if (eVar.f3322X.get()) {
                    nVar.close();
                    return;
                }
                RunnableC0053c runnableC0053c = new RunnableC0053c(9, eVar, nVar);
                Objects.requireNonNull(nVar);
                eVar.b(runnableC0053c, new C.b(nVar, 8));
                return;
            default:
                Void r52 = (Void) obj;
                ((U.i) this.f3210b).a((C0075z) this.f3211c);
                return;
        }
    }

    @Override // m1.i
    public void p() {
        byte[] bArr = K0.x.f;
        K0.q qVar = (K0.q) this.f3211c;
        qVar.getClass();
        qVar.E(bArr, bArr.length);
    }

    public void q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            ((Bundle) this.f3211c).putString((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public C0473b r() {
        if (((IdentityHashMap) this.f3211c) != null) {
            for (Map.Entry entry : ((C0473b) this.f3210b).f7116a.entrySet()) {
                if (!((IdentityHashMap) this.f3211c).containsKey(entry.getKey())) {
                    ((IdentityHashMap) this.f3211c).put((C0472a) entry.getKey(), entry.getValue());
                }
            }
            this.f3210b = new C0473b((IdentityHashMap) this.f3211c);
            this.f3211c = null;
        }
        return (C0473b) this.f3210b;
    }

    @Override // m1.q
    public G s(int i7, int i8) {
        return (T) this.f3210b;
    }

    public void t() {
        this.f3210b = null;
        this.f3211c = null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(U3.h.e(((C0599g) ((AbstractC0467p) this.f3211c)).f8255c));
        String str = ((C0468q) task.getResult()).f7043a;
        I.i(str);
        C0454c c0454c = (C0454c) this.f3210b;
        firebaseAuth.getClass();
        I.e(str);
        String str2 = firebaseAuth.f9710i;
        if (str2 != null) {
            c0454c.f7016Y = str2;
        }
        return firebaseAuth.f9707e.zza(firebaseAuth.f9703a, c0454c, str);
    }

    @Override // V0.p
    public i1.p u() {
        return new x(((t2.i) this.f3210b).u(), (List) this.f3211c, 20, false);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [X0.c, java.lang.Object] */
    @Override // X0.i
    /* renamed from: v */
    public X0.c f(X0.h hVar) {
        MediaCodec mediaCodec;
        Object cVar;
        int i7;
        ?? obj;
        String str = hVar.f6280a.f6286a;
        X0.j jVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                H0.r rVar = hVar.f6282c;
                int i8 = K0.x.f2529a;
                try {
                    if (i8 >= 34) {
                        if (i8 < 35) {
                            if (H0.I.k(rVar.f1886m)) {
                            }
                        }
                        cVar = new A.c(mediaCodec, 18);
                        i7 = 4;
                        obj = new Object();
                        obj.f6249c = mediaCodec;
                        obj.f6250d = new X0.f((HandlerThread) ((X0.b) this.f3210b).get());
                        obj.f6251e = cVar;
                        obj.f6248b = 0;
                        Trace.endSection();
                        X0.c.b(obj, hVar.f6281b, hVar.f6283d, hVar.f6284e, i7);
                        return obj;
                    }
                    Trace.endSection();
                    X0.c.b(obj, hVar.f6281b, hVar.f6283d, hVar.f6284e, i7);
                    return obj;
                } catch (Exception e7) {
                    e = e7;
                    jVar = obj;
                    if (jVar == null) {
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                    } else {
                        jVar.release();
                    }
                    throw e;
                }
                cVar = new X0.e(mediaCodec, (HandlerThread) ((X0.b) this.f3211c).get());
                i7 = 0;
                obj = new Object();
                obj.f6249c = mediaCodec;
                obj.f6250d = new X0.f((HandlerThread) ((X0.b) this.f3210b).get());
                obj.f6251e = cVar;
                obj.f6248b = 0;
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Exception e9) {
            e = e9;
            mediaCodec = null;
        }
    }

    public View w(int i7, int i8, int i9, int i10) {
        int i11;
        Y1.K k2 = (Y1.K) this.f3210b;
        int D4 = k2.D();
        int b5 = k2.b();
        if (i8 > i7) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        View view = null;
        while (i7 != i8) {
            View C7 = k2.C(i7);
            int k8 = k2.k(C7);
            int I7 = k2.I(C7);
            C0129i c0129i = (C0129i) this.f3211c;
            c0129i.f1806b = D4;
            c0129i.f1807c = b5;
            c0129i.f1808d = k8;
            c0129i.f1809e = I7;
            if (i9 != 0) {
                c0129i.f1805a = i9;
                if (c0129i.a()) {
                    return C7;
                }
            }
            if (i10 != 0) {
                c0129i.f1805a = i10;
                if (c0129i.a()) {
                    view = C7;
                }
            }
            i7 += i11;
        }
        return view;
    }

    public Pair y(int i7, C0960z c0960z) {
        C0960z c0960z2;
        c0 c0Var = (c0) this.f3210b;
        C0960z c0960z3 = null;
        if (c0960z != null) {
            int i8 = 0;
            while (true) {
                if (i8 < c0Var.f3676c.size()) {
                    if (((C0960z) c0Var.f3676c.get(i8)).f10855d == c0960z.f10855d) {
                        Object obj = c0Var.f3675b;
                        int i9 = j0.f3778k;
                        c0960z2 = c0960z.a(Pair.create(obj, c0960z.f10852a));
                        break;
                    }
                    i8++;
                } else {
                    c0960z2 = null;
                    break;
                }
            }
            if (c0960z2 == null) {
                return null;
            }
            c0960z3 = c0960z2;
        }
        return Pair.create(Integer.valueOf(i7 + c0Var.f3677d), c0960z3);
    }

    @Override // H.c
    public void z(Throwable th) {
        switch (this.f3209a) {
            case 1:
                int i7 = ((M.m) this.f3210b).f;
                if (i7 == 2 && (th instanceof CancellationException)) {
                    org.slf4j.helpers.i.l("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                    return;
                }
                org.slf4j.helpers.i.P("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + AbstractC1079a.k(i7), th);
                return;
            default:
                ((U.i) this.f3210b).b(th);
                return;
        }
    }

    public /* synthetic */ x(int i7, Object obj, Object obj2) {
        this.f3209a = i7;
        this.f3211c = obj;
        this.f3210b = obj2;
    }

    public /* synthetic */ x(Object obj, int i7) {
        this.f3209a = i7;
        this.f3210b = obj;
    }

    public /* synthetic */ x(Object obj, Object obj2, int i7, boolean z7) {
        this.f3209a = i7;
        this.f3210b = obj;
        this.f3211c = obj2;
    }

    public x(String str, FirebaseAuth firebaseAuth) {
        this.f3209a = 26;
        Bundle bundle = new Bundle();
        this.f3210b = bundle;
        Bundle bundle2 = new Bundle();
        this.f3211c = bundle2;
        U3.h hVar = firebaseAuth.f9703a;
        hVar.a();
        bundle.putString("com.google.firebase.auth.KEY_API_KEY", hVar.f5751c.f5757a);
        bundle.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str);
        bundle.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", bundle2);
        bundle.putString("com.google.firebase.auth.internal.CLIENT_VERSION", zzaed.zza().zzb());
        bundle.putString("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.b());
        U3.h hVar2 = firebaseAuth.f9703a;
        hVar2.a();
        bundle.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", hVar2.f5750b);
        bundle.putString("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", firebaseAuth.f9702B);
    }

    public x(N5.a aVar, A.c cVar) {
        this.f3209a = 4;
        this.f3210b = aVar;
        this.f3211c = cVar;
        cVar.f4b = new C5.i(this, 17);
    }

    public x(C0417C c0417c, e0 e0Var) {
        this.f3209a = 25;
        this.f3210b = c0417c;
        this.f3211c = K.p(e0Var);
    }

    public x(o0 o0Var, Object obj) {
        this.f3209a = 29;
        G.i.j(o0Var, "status");
        this.f3210b = o0Var;
        this.f3211c = obj;
    }

    public x(X3.d dVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f3209a = 17;
        I.i(dVar);
        this.f3210b = executor;
        this.f3211c = scheduledExecutorService;
    }

    public x(K0.v vVar) {
        this.f3209a = 13;
        this.f3210b = vVar;
        this.f3211c = new K0.q();
    }

    @Override // m1.q
    public void x(InterfaceC1426A interfaceC1426A) {
    }

    public x(int i7) {
        this.f3209a = 16;
        X0.b bVar = new X0.b(i7, 0);
        X0.b bVar2 = new X0.b(i7, 1);
        this.f3210b = bVar;
        this.f3211c = bVar2;
    }

    public x(int i7, byte b5) {
        this.f3209a = i7;
        switch (i7) {
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                this.f3210b = new K0.q();
                this.f3211c = new R1.a();
                return;
            default:
                this.f3210b = new HashMap();
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [H0.i, java.lang.Object] */
    public x(Y1.K k2) {
        this.f3209a = 19;
        this.f3210b = k2;
        ?? obj = new Object();
        obj.f1805a = 0;
        this.f3211c = obj;
    }

    public x(MediaCodec.CryptoInfo cryptoInfo) {
        this.f3209a = 2;
        this.f3210b = cryptoInfo;
        this.f3211c = AbstractC0046t.f();
    }

    public x(ArrayList arrayList, ArrayList arrayList2) {
        this.f3209a = 18;
        int size = arrayList.size();
        this.f3210b = new int[size];
        this.f3211c = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            ((int[]) this.f3210b)[i7] = ((Integer) arrayList.get(i7)).intValue();
            ((float[]) this.f3211c)[i7] = ((Float) arrayList2.get(i7)).floatValue();
        }
    }

    public x(int i7, int i8) {
        this.f3209a = 18;
        this.f3210b = new int[]{i7, i8};
        this.f3211c = new float[]{0.0f, 1.0f};
    }

    public x(int i7, int i8, int i9) {
        this.f3209a = 18;
        this.f3210b = new int[]{i7, i8, i9};
        this.f3211c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public x(C0436m c0436m) {
        this.f3209a = 22;
        this.f3211c = c0436m;
        this.f3210b = K0.x.n(null);
    }

    public x(F f) {
        this.f3209a = 14;
        this.f3211c = f;
        this.f3210b = new K0.p(new byte[4], 4);
    }

    @Override // S1.C
    public void c(K0.v vVar, m1.q qVar, S1.H h8) {
    }
}
