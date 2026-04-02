package c1;

import A3.N;
import H4.e1;
import H4.p1;
import K5.r;
import O0.d0;
import Q5.g;
import X5.E;
import Z.f;
import a1.C0415A;
import a6.s0;
import a6.t0;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Typeface;
import android.hardware.camera2.CameraDevice;
import android.os.Trace;
import androidx.camera.core.impl.X;
import c6.C0673i;
import c6.C0716w1;
import c6.RunnableC0703s0;
import c6.c2;
import c6.d2;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.storage.v;
import e.k;
import e.o;
import h0.AbstractC1024D;
import h1.t;
import h3.AbstractC1079a;
import j6.C1372c;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import k1.C1388e;
import k4.C1395a;
import kotlin.jvm.internal.j;
import l4.C1422f;
import n4.M;
import n4.z;
import org.apache.tika.parser.external.ExternalParser;
import org.apache.tika.utils.XMLReaderUtils;
import p4.C1675e;
import p4.C1683m;
import p4.C1687q;
import p4.C1688s;
import p4.G;
import p4.InterfaceC1672b;
import p4.InterfaceC1677g;
import p4.InterfaceC1693x;
import p4.P;
import p4.Q;
import q5.C1712a;
import t4.AbstractC1823c;
import t4.RunnableC1821a;
import t4.i;
import t4.u;
import t5.C1832d;
import u0.C1857m;
import u4.e;
import u4.q;
import u5.C1876d;
import w.C1903M;
import w.C1914Y;
import w.C1935t;
import w.C1936u;
import w.EnumC1934s;
import x5.C2010l;
/* renamed from: c1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0626c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8347a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f8348b;

    public /* synthetic */ RunnableC0626c(Object obj, int i7) {
        this.f8347a = i7;
        this.f8348b = obj;
    }

    private final void a() {
        C1903M c1903m = (C1903M) this.f8348b;
        synchronized (c1903m.f16079a) {
            if (!c1903m.f16080b.isEmpty()) {
                c1903m.j(c1903m.f16080b);
                c1903m.f16080b.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7 = true;
        boolean z8 = false;
        switch (this.f8347a) {
            case 0:
                ((C0627d) this.f8348b).v();
                return;
            case 1:
                ((Map.Entry) this.f8348b).getKey().getClass();
                throw new ClassCastException();
            case 2:
                C0673i c0673i = (C0673i) this.f8348b;
                t0 t0Var = c0673i.f8854d;
                if (t0Var != null) {
                    s0 s0Var = (s0) t0Var.f7209b;
                    if (!s0Var.f7201c && !s0Var.f7200b) {
                        t0Var.o();
                    }
                }
                c0673i.f8853c = null;
                return;
            case 3:
                ((C0716w1) this.f8348b).e();
                return;
            case 4:
                d2 d2Var = ((c2) this.f8348b).f8803e;
                d2Var.f8812b.a(new G.c(d2Var, 20));
                return;
            case 5:
                v vVar = (v) this.f8348b;
                try {
                    vVar.k();
                    return;
                } finally {
                    vVar.a();
                }
            case 6:
                k this$0 = (k) this.f8348b;
                j.e(this$0, "this$0");
                Runnable runnable = this$0.f10535b;
                if (runnable != null) {
                    runnable.run();
                    this$0.f10535b = null;
                    return;
                }
                return;
            case 7:
                o.b((o) this.f8348b);
                return;
            case 8:
                ((io.flutter.plugin.platform.o) this.f8348b).e(false);
                return;
            case 9:
                C1388e c1388e = (C1388e) this.f8348b;
                int i7 = c1388e.f13590k - 1;
                c1388e.f13590k = i7;
                if (i7 <= 0) {
                    if (i7 >= 0) {
                        c1388e.f13584c.a();
                        return;
                    }
                    throw new IllegalStateException(String.valueOf(c1388e.f13590k));
                }
                return;
            case 10:
                t tVar = (t) this.f8348b;
                d0 d0Var = (d0) tVar.f11319c;
                d0Var.getClass();
                M m7 = new M((i) d0Var.f);
                ((Task) ((M.b) tVar.f11320d).apply((Object) m7)).addOnCompleteListener(((e) tVar.f11318b).f15988a, new g(3, tVar, m7));
                return;
            case 11:
                ExternalParser.a((InputStream) this.f8348b);
                return;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                R1.j jVar = (R1.j) this.f8348b;
                C1675e c1675e = (C1675e) jVar.f4684d;
                c1675e.getClass();
                Integer num = (Integer) c1675e.f15250b.F("Backfill Indexes", new E(c1675e, 18));
                num.getClass();
                q.a("IndexBackfiller", "Documents written: %s", num);
                jVar.f4682b = ((e) jVar.f4683c).b(u4.d.INDEX_BACKFILL, C1675e.f15248g, new RunnableC0626c(jVar, 12));
                return;
            case 13:
                D5.b bVar = (D5.b) this.f8348b;
                C1683m c1683m = (C1683m) bVar.f869c;
                C1687q c1687q = (C1687q) c1683m.f15266a.F("Collect garbage", new A4.d(20, c1683m, (C1688s) bVar.f871e));
                bVar.f867a = true;
                bVar.f870d = ((e) bVar.f868b).b(u4.d.GARBAGE_COLLECTION, C1688s.f15288d, new RunnableC0626c(bVar, 13));
                return;
            case 14:
                Boolean[] boolArr = {Boolean.FALSE};
                Q q2 = (Q) ((C0415A) this.f8348b).f6744a;
                q2.R("SELECT migration_name FROM data_migrations").e(new G(boolArr, 1));
                if (boolArr[0].booleanValue()) {
                    HashSet hashSet = new HashSet();
                    Cursor s7 = q2.R("SELECT DISTINCT uid FROM mutation_queues").s();
                    while (s7.moveToNext()) {
                        try {
                            hashSet.add(s7.getString(0));
                        } catch (Throwable th) {
                            if (s7 != null) {
                                try {
                                    s7.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                    s7.close();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        C1422f c1422f = new C1422f((String) it.next());
                        InterfaceC1693x r7 = q2.r(c1422f, q2.q(c1422f));
                        HashSet hashSet2 = new HashSet();
                        Iterator it2 = ((ArrayList) ((t) r7).j()).iterator();
                        while (it2.hasNext()) {
                            hashSet2.addAll(((r4.i) it2.next()).b());
                        }
                        InterfaceC1672b p7 = q2.p(c1422f);
                        InterfaceC1677g q7 = q2.q(c1422f);
                        P p8 = q2.f15216k;
                        new E.e(p8, r7, p7, q7, 23).X(p8.p(hashSet2));
                    }
                    q2.Q("DELETE FROM data_migrations WHERE migration_name = ?", "BUILD_OVERLAYS");
                    return;
                }
                return;
            case 15:
                ((r) this.f8348b).c();
                return;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                C1712a this$02 = (C1712a) this.f8348b;
                j.e(this$02, "this$0");
                this$02.f15388b.c();
                return;
            case 17:
                AbstractC1823c abstractC1823c = (AbstractC1823c) ((N) this.f8348b).f106d;
                q.a(abstractC1823c.getClass().getSimpleName(), "(%x) Stream is open", Integer.valueOf(System.identityHashCode(abstractC1823c)));
                abstractC1823c.f15795i = u.Open;
                abstractC1823c.f15798m.a();
                if (abstractC1823c.f15788a == null) {
                    abstractC1823c.f15788a = abstractC1823c.f.b(abstractC1823c.f15794h, AbstractC1823c.f15786q, new RunnableC1821a(abstractC1823c, 1));
                    return;
                }
                return;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                X x7 = (X) this.f8348b;
                x7.f7592d = null;
                if (((z) x7.f7591c) != z.UNKNOWN) {
                    z7 = false;
                }
                m5.d.i("Timer should be canceled if we transitioned to a different state.", z7, new Object[0]);
                Locale locale = Locale.ENGLISH;
                x7.b("Backend didn't respond within 10 seconds\n");
                x7.c(z.OFFLINE);
                return;
            case 19:
                break;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                C1857m c1857m = (C1857m) this.f8348b;
                synchronized (c1857m.f15939d) {
                    try {
                        if (c1857m.f15942h != null) {
                            try {
                                e0.i d7 = c1857m.d();
                                int i8 = d7.f10613e;
                                if (i8 == 2) {
                                    synchronized (c1857m.f15939d) {
                                    }
                                }
                                if (i8 == 0) {
                                    int i9 = d0.j.f10170a;
                                    Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                    C1372c c1372c = c1857m.f15938c;
                                    Context context = c1857m.f15936a;
                                    c1372c.getClass();
                                    e0.i[] iVarArr = {d7};
                                    android.support.v4.media.session.a aVar = f.f6716a;
                                    Trace.beginSection(F.f.D("TypefaceCompat.createFromFontInfo"));
                                    Typeface d8 = f.f6716a.d(context, iVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer d02 = f7.a.d0(c1857m.f15936a, d7.f10609a);
                                    if (d02 != null && d8 != null) {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        E.e eVar = new E.e(d8, AbstractC1079a.r(d02));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (c1857m.f15939d) {
                                            f7.a aVar2 = c1857m.f15942h;
                                            if (aVar2 != null) {
                                                aVar2.g0(eVar);
                                            }
                                        }
                                        c1857m.b();
                                        return;
                                    }
                                    throw new RuntimeException("Unable to open file.");
                                }
                                throw new RuntimeException("fetchFonts result is not OK. (" + i8 + ")");
                            } catch (Throwable th3) {
                                synchronized (c1857m.f15939d) {
                                    try {
                                        f7.a aVar3 = c1857m.f15942h;
                                        if (aVar3 != null) {
                                            aVar3.f0(th3);
                                        }
                                        c1857m.b();
                                        return;
                                    } finally {
                                    }
                                }
                            }
                        }
                        return;
                    } finally {
                    }
                }
            case 21:
                Throwable th4 = (Throwable) this.f8348b;
                if (th4 instanceof OutOfMemoryError) {
                    OutOfMemoryError outOfMemoryError = new OutOfMemoryError("Firestore (25.1.4) ran out of memory. Check your queries to make sure they are not loading an excessive amount of data.");
                    outOfMemoryError.initCause(th4);
                    throw outOfMemoryError;
                }
                throw new RuntimeException("Internal error in Cloud Firestore (25.1.4).", th4);
            case 22:
                P p9 = (P) this.f8348b;
                ((e) p9.f15212c).d();
                if (((ScheduledFuture) p9.f15211b) != null) {
                    p9.q();
                    ((Runnable) p9.f15210a).run();
                    return;
                }
                return;
            case 23:
                C1936u c1936u = (C1936u) this.f8348b;
                c1936u.q0 = false;
                c1936u.f16289p0 = false;
                c1936u.t("OpenCameraConfigAndClose is done, state: " + c1936u.f16277e, null);
                int ordinal = c1936u.f16277e.ordinal();
                if (ordinal != 1 && ordinal != 4) {
                    if (ordinal != 6) {
                        c1936u.t("OpenCameraConfigAndClose finished while in state: " + c1936u.f16277e, null);
                        return;
                    }
                    int i10 = c1936u.f16280g0;
                    if (i10 != 0) {
                        c1936u.t("OpenCameraConfigAndClose in error: ".concat(C1936u.v(i10)), null);
                        c1936u.f16272Z.b();
                        return;
                    }
                    c1936u.J(false);
                    return;
                }
                g0.c.g(null, c1936u.f16282i0.isEmpty());
                c1936u.u();
                return;
            case 24:
                ((CameraDevice) this.f8348b).close();
                return;
            case 25:
                RunnableC0703s0 runnableC0703s0 = (RunnableC0703s0) this.f8348b;
                if (!runnableC0703s0.f8976b) {
                    g0.c.g(null, (((C1935t) runnableC0703s0.f8978d).f.f16277e == EnumC1934s.REOPENING || ((C1935t) runnableC0703s0.f8978d).f.f16277e == EnumC1934s.REOPENING_QUIRK) ? true : true);
                    if (((C1935t) runnableC0703s0.f8978d).c()) {
                        ((C1935t) runnableC0703s0.f8978d).f.I(true);
                        return;
                    } else {
                        ((C1935t) runnableC0703s0.f8978d).f.J(true);
                        return;
                    }
                }
                return;
            case 26:
                a();
                return;
            case 27:
                for (C1914Y c1914y : (LinkedHashSet) this.f8348b) {
                    c1914y.getClass();
                    c1914y.c(c1914y);
                }
                return;
            case 28:
                AbstractC1024D.j(((x.o) this.f8348b).f16410b);
                return;
            default:
                C2010l this$03 = (C2010l) this.f8348b;
                j.e(this$03, "this$0");
                this$03.f16541m = false;
                return;
        }
        while (true) {
            C1832d c1832d = (C1832d) this.f8348b;
            ArrayList arrayList = c1832d.f;
            if (!arrayList.isEmpty() && c1832d.f15876l == null) {
                ((C1876d) arrayList.get(0)).f16025a.run();
                arrayList.remove(0);
            } else {
                return;
            }
        }
    }

    public /* synthetic */ RunnableC0626c(Map.Entry entry, C1395a c1395a) {
        this.f8347a = 1;
        this.f8348b = entry;
    }
}
