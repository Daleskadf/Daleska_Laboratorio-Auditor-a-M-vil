package C;

import B5.P;
import D.RunnableC0053c;
import D.U;
import D.b0;
import D.f0;
import D.j0;
import D.t0;
import F3.o;
import H4.e1;
import H4.p1;
import L5.h;
import M.n;
import M0.x;
import O0.C0260w;
import Q0.I;
import Q0.L;
import T4.g;
import U.i;
import U.l;
import V2.k;
import X0.f;
import X5.C0377c;
import X5.C0380f;
import X5.C0382h;
import a1.C0415A;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.widget.Toast;
import androidx.camera.core.impl.J;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.embedding.engine.FlutterJNI;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.u;
import org.apache.tika.utils.XMLReaderUtils;
import w.C1932q;
import w.C1936u;
import w.EnumC1934s;
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f412a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f413b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f412a = i7;
        this.f413b = obj;
    }

    private final void a() {
        f fVar = (f) this.f413b;
        synchronized (fVar.f6264a) {
            try {
                if (!fVar.f6274m) {
                    long j = fVar.f6273l - 1;
                    fVar.f6273l = j;
                    int i7 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    if (i7 <= 0) {
                        if (i7 < 0) {
                            fVar.b(new IllegalStateException());
                        } else {
                            fVar.a();
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f412a) {
            case 0:
                e eVar = (e) this.f413b;
                i iVar = (i) eVar.f425h;
                if (iVar != null) {
                    iVar.a(null);
                    eVar.f425h = null;
                    return;
                }
                return;
            case 1:
                U u7 = (U) this.f413b;
                synchronized (u7.f664p0) {
                    try {
                        u7.f665r0 = null;
                        b0 b0Var = u7.q0;
                        if (b0Var != null) {
                            u7.q0 = null;
                            u7.f(b0Var);
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                ((j0) this.f413b).n();
                return;
            case 3:
                ((A.f) ((f0) this.f413b).f699b).getClass();
                return;
            case 4:
                ((E.f) this.f413b).c();
                return;
            case 5:
                ((FlutterJNI) ((F5.d) ((F5.b) this.f413b).f1203c).f1210e).prefetchDefaultFontManager();
                return;
            case 6:
                ((ScheduledFuture) this.f413b).cancel(true);
                return;
            case 7:
                ((i) this.f413b).a(null);
                return;
            case 8:
                ((n) this.f413b).close();
                return;
            case 9:
                M.e eVar2 = (M.e) this.f413b;
                eVar2.f3072e0 = true;
                eVar2.a();
                return;
            case 10:
                ((t0) this.f413b).a();
                return;
            case 11:
                ((J) this.f413b).b();
                return;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                P p7 = (P) ((k) this.f413b).f5967d;
                if (p7 != null) {
                    for (V v6 : p7.values()) {
                        v6.b();
                    }
                    return;
                }
                return;
            case 13:
                N.e eVar3 = (N.e) this.f413b;
                eVar3.f = true;
                eVar3.a();
                return;
            case 14:
                P p8 = (P) ((o) this.f413b).f1181e;
                if (p8 != null) {
                    for (V v7 : p8.values()) {
                        v7.b();
                    }
                    return;
                }
                return;
            case 15:
                P0.d dVar = (P0.d) this.f413b;
                dVar.J(dVar.E(), 1028, new C0260w(11));
                dVar.f.d();
                return;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                P6.f fVar = (P6.f) this.f413b;
                fVar.getClass();
                try {
                    boolean[] zArr = {true};
                    int i7 = 3000;
                    while (zArr[0]) {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0053c(13, fVar, zArr));
                        i7--;
                        if (i7 > 0) {
                            if (zArr[0]) {
                                Thread.sleep(200L);
                            }
                        } else {
                            throw new Exception("Timeout waiting for the job to finish");
                        }
                    }
                } catch (Exception e7) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0053c(14, fVar, e7));
                }
                fVar.f4081c = null;
                return;
            case 17:
                I i8 = (I) this.f413b;
                if (i8.f4211k0 >= 300000) {
                    ((L) i8.f4220s.f28b).f4239K1 = true;
                    i8.f4211k0 = 0L;
                    return;
                }
                return;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                ((h) this.f413b).c(null);
                return;
            case 19:
                ((g) this.f413b).sendEmptyMessage(1);
                return;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                ((C5.i) this.f413b).r0();
                return;
            case 21:
                a();
                return;
            case 22:
                C0377c this$0 = (C0377c) this.f413b;
                j.e(this$0, "this$0");
                if (this$0.j) {
                    return;
                }
                while (true) {
                    WeakReference weakReference = (WeakReference) this$0.f6461e.poll();
                    if (weakReference != null) {
                        Long l8 = (Long) u.a(this$0.f).remove(weakReference);
                        if (l8 != null) {
                            this$0.f6459c.remove(l8);
                            this$0.f6460d.remove(l8);
                            new E.e(((C0380f) this$0.f6457a.f218b).f6484a, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", (L5.n) C0380f.f6483b.a(), null, 4).f0(G.i.A(l8), new A.j(new C0382h(l8.longValue()), 29));
                        }
                    } else {
                        this$0.f6462g.postDelayed(this$0.f6463h, this$0.f6465k);
                        return;
                    }
                }
            case 23:
                ((G1.g) this.f413b).getClass();
                return;
            case 24:
                x this$02 = (x) this.f413b;
                j.e(this$02, "this$0");
                Toast toast = (Toast) this$02.f3211c;
                if (toast != null) {
                    toast.show();
                    return;
                }
                return;
            case 25:
                ((HandlerThread) this.f413b).quit();
                return;
            case 26:
                C1932q c1932q = (C1932q) this.f413b;
                if (c1932q.f16259c.f16277e == EnumC1934s.PENDING_OPEN) {
                    c1932q.f16259c.J(false);
                    return;
                }
                return;
            case 27:
                C0415A c0415a = (C0415A) this.f413b;
                if (((C1936u) c0415a.f6744a).f16277e == EnumC1934s.OPENED) {
                    ((C1936u) c0415a.f6744a).B();
                    return;
                }
                return;
            default:
                ((l) this.f413b).cancel(true);
                return;
        }
    }
}
