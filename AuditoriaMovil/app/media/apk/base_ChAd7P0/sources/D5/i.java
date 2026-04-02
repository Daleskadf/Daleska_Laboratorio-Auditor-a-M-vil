package D5;

import D.RunnableC0073x;
import L5.m;
import android.os.Build;
import android.os.Trace;
import c2.AbstractC0628a;
import com.google.firebase.firestore.Z;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class i implements L5.f, j {

    /* renamed from: X  reason: collision with root package name */
    public int f885X;

    /* renamed from: Y  reason: collision with root package name */
    public final k f886Y;

    /* renamed from: Z  reason: collision with root package name */
    public final WeakHashMap f887Z;

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f888a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f889b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f890c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f891d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f892e;

    /* renamed from: e0  reason: collision with root package name */
    public final C5.i f893e0;
    public final HashMap f;

    public i(FlutterJNI flutterJNI) {
        C5.i iVar = new C5.i(8);
        iVar.f593b = (ExecutorService) V2.k.A().f5967d;
        this.f889b = new HashMap();
        this.f890c = new HashMap();
        this.f891d = new Object();
        this.f892e = new AtomicBoolean(false);
        this.f = new HashMap();
        this.f885X = 1;
        this.f886Y = new k();
        this.f887Z = new WeakHashMap();
        this.f888a = flutterJNI;
        this.f893e0 = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [D5.d] */
    public final void a(String str, e eVar, ByteBuffer byteBuffer, int i7, long j) {
        k kVar;
        if (eVar != null) {
            kVar = eVar.f876b;
        } else {
            kVar = null;
        }
        String a7 = Y5.a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0628a.a(i7, F.f.D(a7));
        } else {
            String D4 = F.f.D(a7);
            try {
                if (F.f.f1102e == null) {
                    F.f.f1102e = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                F.f.f1102e.invoke(null, Long.valueOf(F.f.f1100c), D4, Integer.valueOf(i7));
            } catch (Exception e7) {
                F.f.u("asyncTraceBegin", e7);
            }
        }
        RunnableC0073x runnableC0073x = new RunnableC0073x(this, str, i7, eVar, byteBuffer, j);
        if (kVar == null) {
            kVar = this.f886Y;
        }
        kVar.a(runnableC0073x);
    }

    public final Z b(m mVar) {
        C5.i iVar = this.f893e0;
        iVar.getClass();
        h hVar = new h((ExecutorService) iVar.f593b);
        Z z7 = new Z(2);
        this.f887Z.put(z7, hVar);
        return z7;
    }

    @Override // L5.f
    public final Z f() {
        C5.i iVar = this.f893e0;
        iVar.getClass();
        h hVar = new h((ExecutorService) iVar.f593b);
        Z z7 = new Z(2);
        this.f887Z.put(z7, hVar);
        return z7;
    }

    @Override // L5.f
    public final void h(String str, ByteBuffer byteBuffer, L5.e eVar) {
        Y5.a.b("DartMessenger#send on " + str);
        try {
            int i7 = this.f885X;
            this.f885X = i7 + 1;
            if (eVar != null) {
                this.f.put(Integer.valueOf(i7), eVar);
            }
            FlutterJNI flutterJNI = this.f888a;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i7);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i7);
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

    @Override // L5.f
    public final void i(String str, L5.d dVar, Z z7) {
        d dVar2;
        if (dVar == null) {
            synchronized (this.f891d) {
                this.f889b.remove(str);
            }
            return;
        }
        if (z7 != null) {
            dVar2 = (d) this.f887Z.get(z7);
            if (dVar2 == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            dVar2 = null;
        }
        synchronized (this.f891d) {
            try {
                this.f889b.put(str, new e(dVar, dVar2));
                List<c> list = (List) this.f890c.remove(str);
                if (list == null) {
                    return;
                }
                for (c cVar : list) {
                    a(str, (e) this.f889b.get(str), cVar.f872a, cVar.f873b, cVar.f874c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // L5.f
    public final void k(String str, ByteBuffer byteBuffer) {
        h(str, byteBuffer, null);
    }

    @Override // L5.f
    public final void n(String str, L5.d dVar) {
        i(str, dVar, null);
    }
}
