package H;

import F6.C0081c0;
import F6.C0100m;
import F6.H;
import H4.e1;
import H4.p1;
import a.AbstractC0412a;
import a4.AbstractC0467p;
import a4.y;
import a5.C0470a;
import android.app.job.JobParameters;
import android.graphics.Typeface;
import android.os.Looper;
import android.os.SystemClock;
import androidx.appcompat.widget.ActionMenuView;
import b3.C0585f;
import b4.C0604l;
import b4.C0606n;
import b6.C0615a;
import b6.C0616b;
import b6.C0617c;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.mlkit_common.zzrr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.storage.D;
import io.flutter.plugins.firebase.auth.C1138a;
import io.flutter.plugins.firebase.auth.P;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k5.AbstractC1398a;
import k5.C1405h;
import o.MenuC1545i;
import org.apache.tika.utils.XMLReaderUtils;
import p.C1581f;
import p.C1587i;
/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1625a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1626b;

    /* renamed from: c  reason: collision with root package name */
    public Object f1627c;

    public /* synthetic */ h() {
        this.f1625a = 7;
    }

    private final void a() {
        boolean z7;
        zzra zzraVar;
        C1405h c1405h = (C1405h) this.f1626b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f1627c;
        int decrementAndGet = ((AtomicInteger) c1405h.f3230b).decrementAndGet();
        if (decrementAndGet >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        I.l(z7);
        if (decrementAndGet == 0) {
            synchronized (c1405h) {
                try {
                    c1405h.f13723e.zzb();
                    C1405h.f13721k = true;
                    zzrd zzrdVar = new zzrd();
                    if (c1405h.f13726i) {
                        zzraVar = zzra.TYPE_THICK;
                    } else {
                        zzraVar = zzra.TYPE_THIN;
                    }
                    zzwp zzwpVar = c1405h.f;
                    zzrdVar.zze(zzraVar);
                    zzrp zzrpVar = new zzrp();
                    zzrpVar.zzi(AbstractC1398a.a(c1405h.f13722d));
                    zzrdVar.zzg(zzrpVar.zzj());
                    zzwpVar.zzd(zzws.zzf(zzrdVar), zzrc.ON_DEVICE_BARCODE_CLOSE);
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((AtomicBoolean) c1405h.f3231c).set(false);
        }
        zzrr.zza();
        taskCompletionSource.setResult(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r1 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        ((java.lang.Runnable) r9.f1626b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
        d4.j.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r9.f1626b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r9.f1627c     // Catch: java.lang.Throwable -> L60
            d4.j r2 = (d4.j) r2     // Catch: java.lang.Throwable -> L60
            java.util.ArrayDeque r2 = r2.f10348b     // Catch: java.lang.Throwable -> L60
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L60
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r9.f1627c     // Catch: java.lang.Throwable -> L20
            d4.j r0 = (d4.j) r0     // Catch: java.lang.Throwable -> L20
            d4.i r3 = r0.f10349c     // Catch: java.lang.Throwable -> L20
            d4.i r4 = d4.i.RUNNING     // Catch: java.lang.Throwable -> L20
            if (r3 != r4) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L1f
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L1f:
            return
        L20:
            r0 = move-exception
            goto L85
        L22:
            long r5 = r0.f10350d     // Catch: java.lang.Throwable -> L20
            r7 = 1
            long r5 = r5 + r7
            r0.f10350d = r5     // Catch: java.lang.Throwable -> L20
            r0.f10349c = r4     // Catch: java.lang.Throwable -> L20
            r0 = 1
        L2c:
            java.lang.Object r3 = r9.f1627c     // Catch: java.lang.Throwable -> L20
            d4.j r3 = (d4.j) r3     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r3 = r3.f10348b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
            r9.f1626b = r3     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L4f
            java.lang.Object r0 = r9.f1627c     // Catch: java.lang.Throwable -> L20
            d4.j r0 = (d4.j) r0     // Catch: java.lang.Throwable -> L20
            d4.i r3 = d4.i.IDLE     // Catch: java.lang.Throwable -> L20
            r0.f10349c = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L4e
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L4e:
            return
        L4f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L60
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r9.f1626b     // Catch: java.lang.Throwable -> L62 java.lang.RuntimeException -> L64
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L62 java.lang.RuntimeException -> L64
            r3.run()     // Catch: java.lang.Throwable -> L62 java.lang.RuntimeException -> L64
        L5d:
            r9.f1626b = r2     // Catch: java.lang.Throwable -> L60
            goto L2
        L60:
            r0 = move-exception
            goto L87
        L62:
            r0 = move-exception
            goto L82
        L64:
            r3 = move-exception
            java.util.logging.Logger r4 = d4.j.f     // Catch: java.lang.Throwable -> L62
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r6.<init>()     // Catch: java.lang.Throwable -> L62
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = r9.f1626b     // Catch: java.lang.Throwable -> L62
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L62
            r6.append(r7)     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L62
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L62
            goto L5d
        L82:
            r9.f1626b = r2     // Catch: java.lang.Throwable -> L60
            throw r0     // Catch: java.lang.Throwable -> L60
        L85:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L60
        L87:
            if (r1 == 0) goto L90
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L90:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H.h.b():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        K6.i iVar;
        C0585f c0585f;
        boolean z7 = true;
        int i7 = 0;
        try {
            switch (this.f1625a) {
                case 0:
                    c cVar = (c) this.f1627c;
                    try {
                        cVar.onSuccess(i.a((E3.b) this.f1626b));
                        return;
                    } catch (Error e7) {
                        e = e7;
                        cVar.z(e);
                        return;
                    } catch (RuntimeException e8) {
                        e = e8;
                        cVar.z(e);
                        return;
                    } catch (ExecutionException e9) {
                        Throwable cause = e9.getCause();
                        if (cause == null) {
                            cVar.z(e9);
                            return;
                        } else {
                            cVar.z(cause);
                            return;
                        }
                    }
                case 1:
                    E0.a aVar = (E0.a) this.f1627c;
                    Object obj = this.f1626b;
                    if (aVar.f930c.get()) {
                        V2.d dVar = aVar.f932e;
                        if (dVar.f5954h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar.f5954h = null;
                            dVar.b();
                        }
                    } else {
                        V2.d dVar2 = aVar.f932e;
                        if (dVar2.f5953g != aVar) {
                            if (dVar2.f5954h == aVar) {
                                SystemClock.uptimeMillis();
                                dVar2.f5954h = null;
                                dVar2.b();
                            }
                        } else if (!dVar2.f5950c) {
                            SystemClock.uptimeMillis();
                            dVar2.f5953g = null;
                            D0.a aVar2 = dVar2.f5948a;
                            if (aVar2 != null) {
                                if (Looper.myLooper() == Looper.getMainLooper()) {
                                    aVar2.l(obj);
                                } else {
                                    aVar2.i(obj);
                                }
                            }
                        }
                    }
                    aVar.f929b = E0.e.FINISHED;
                    return;
                case 2:
                    ((C0100m) this.f1627c).B((C0081c0) this.f1626b);
                    return;
                case 3:
                    ((C0100m) this.f1626b).B((G6.e) this.f1627c);
                    return;
                case 4:
                    try {
                        Object b5 = i.b((E3.b) this.f1626b);
                        U.i iVar2 = ((b) this.f1627c).f1616b;
                        if (iVar2 != null) {
                            iVar2.a(b5);
                        }
                    } catch (CancellationException unused) {
                        ((b) this.f1627c).cancel(false);
                    } catch (ExecutionException e10) {
                        Throwable cause2 = e10.getCause();
                        U.i iVar3 = ((b) this.f1627c).f1616b;
                        if (iVar3 != null) {
                            iVar3.b(cause2);
                        }
                    }
                    return;
                case 5:
                    int i8 = JobInfoSchedulerService.f9084a;
                    ((JobInfoSchedulerService) this.f1626b).jobFinished((JobParameters) this.f1627c, false);
                    return;
                case 6:
                    break;
                case 7:
                    ((y) this.f1626b).onVerificationFailed((U3.i) this.f1627c);
                    return;
                case 8:
                    ((P) this.f1626b).a((FirebaseAuth) this.f1627c);
                    return;
                case 9:
                    ((C1138a) this.f1626b).a((FirebaseAuth) this.f1627c);
                    return;
                case 10:
                    FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(U3.h.e((String) this.f1626b));
                    AbstractC0467p abstractC0467p = firebaseAuth.f;
                    if (abstractC0467p != null) {
                        Task j = firebaseAuth.j(abstractC0467p, true);
                        C0604l.f.e("Token refreshing started", new Object[0]);
                        j.addOnFailureListener(new C0606n(this, 0));
                        return;
                    }
                    return;
                case 11:
                    ((C0617c) this.f1627c).f.unregisterNetworkCallback((C0615a) this.f1626b);
                    return;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    ((C0617c) this.f1627c).f8314e.unregisterReceiver((C0616b) this.f1626b);
                    return;
                case 13:
                    D d7 = (D) this.f1627c;
                    String r7 = AbstractC0412a.r(d7.f9875q);
                    String q2 = AbstractC0412a.q(d7.f9876r);
                    U3.h hVar = d7.f9870l.f9931b.f9900a;
                    hVar.a();
                    ((C4.f) this.f1626b).n(hVar.f5749a, r7, q2);
                    return;
                case 14:
                    try {
                        b();
                        return;
                    } catch (Error e11) {
                        synchronized (((d4.j) this.f1627c).f10348b) {
                            ((d4.j) this.f1627c).f10349c = d4.i.IDLE;
                            throw e11;
                        }
                    }
                case 15:
                    G1.g gVar = (G1.g) ((A.c) this.f1626b).f4b;
                    if (gVar != null) {
                        gVar.g((Typeface) this.f1627c);
                        return;
                    }
                    return;
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    ((M.f) this.f1626b).accept(this.f1627c);
                    return;
                case 17:
                    ReferenceQueue referenceQueue = (ReferenceQueue) this.f1626b;
                    while (!((Set) this.f1627c).isEmpty()) {
                        try {
                            e5.m mVar = (e5.m) referenceQueue.remove();
                            if (mVar.f10907a.remove(mVar)) {
                                mVar.clear();
                                mVar.f10908b.getClass();
                            }
                        } catch (InterruptedException unused2) {
                        }
                    }
                    return;
                case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    Callable callable = (Callable) this.f1626b;
                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f1627c;
                    try {
                        taskCompletionSource.setResult(callable.call());
                        return;
                    } catch (C0470a e12) {
                        taskCompletionSource.setException(e12);
                        return;
                    } catch (Exception e13) {
                        taskCompletionSource.setException(new C0470a("Internal error has occurred when executing ML Kit tasks", e13));
                        return;
                    }
                case 19:
                    a();
                    return;
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    K5.d dVar3 = (K5.d) this.f1626b;
                    if (((Thread) ((AtomicReference) dVar3.f2701e).getAndSet(Thread.currentThread())) != null) {
                        z7 = false;
                    }
                    I.l(z7);
                    try {
                        ((Runnable) this.f1627c).run();
                        ((AtomicReference) dVar3.f2701e).set(null);
                        dVar3.i();
                        return;
                    } catch (Throwable th) {
                        try {
                            ((AtomicReference) dVar3.f2701e).set(null);
                            dVar3.i();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                default:
                    C1587i c1587i = (C1587i) this.f1627c;
                    MenuC1545i menuC1545i = c1587i.f14822c;
                    if (menuC1545i != null && (c0585f = menuC1545i.f14445e) != null) {
                        c0585f.J(menuC1545i);
                    }
                    ActionMenuView actionMenuView = c1587i.f14817X;
                    if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                        C1581f c1581f = (C1581f) this.f1626b;
                        if (!c1581f.b()) {
                            if (c1581f.f14491e != null) {
                                c1581f.d(0, 0, false, false);
                            }
                        }
                        c1587i.f14833m0 = c1581f;
                    }
                    c1587i.f14835o0 = null;
                    return;
            }
            do {
                try {
                    ((Runnable) this.f1626b).run();
                } catch (Throwable th3) {
                    H.l(n6.j.f14394a, th3);
                }
                iVar = (K6.i) this.f1627c;
                Runnable g3 = iVar.g();
                if (g3 != null) {
                    this.f1626b = g3;
                    i7++;
                } else {
                    return;
                }
            } while (i7 < 16);
            M6.m mVar2 = iVar.f2783c;
            mVar2.getClass();
            mVar2.c(iVar, this);
        } finally {
            ((b) this.f1627c).f1611X = null;
        }
    }

    public String toString() {
        switch (this.f1625a) {
            case 0:
                return h.class.getSimpleName() + "," + ((c) this.f1627c);
            case 14:
                Runnable runnable = (Runnable) this.f1626b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                return "SequentialExecutorWorker{state=" + ((d4.j) this.f1627c).f10349c + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ h(int i7, Object obj, Object obj2) {
        this.f1625a = i7;
        this.f1626b = obj;
        this.f1627c = obj2;
    }

    public /* synthetic */ h(Object obj, Object obj2, int i7, boolean z7) {
        this.f1625a = i7;
        this.f1627c = obj;
        this.f1626b = obj2;
    }

    public h(C0604l c0604l, String str) {
        this.f1625a = 10;
        this.f1627c = c0604l;
        I.e(str);
        this.f1626b = str;
    }

    public h(d4.j jVar) {
        this.f1625a = 14;
        this.f1627c = jVar;
    }
}
