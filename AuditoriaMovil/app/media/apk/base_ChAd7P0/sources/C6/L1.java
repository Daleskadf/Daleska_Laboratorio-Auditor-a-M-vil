package c6;

import a5.C0470a;
import android.util.Log;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import k5.C1405h;
import org.json.JSONException;
/* loaded from: classes.dex */
public final class L1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8493a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8494b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8495c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f8496d;

    /* renamed from: e  reason: collision with root package name */
    public Object f8497e;
    public final Object f;

    public /* synthetic */ L1(M3.d dVar, CancellationToken cancellationToken, CancellationTokenSource cancellationTokenSource, Callable callable, TaskCompletionSource taskCompletionSource) {
        this.f8493a = 3;
        this.f8494b = dVar;
        this.f8495c = cancellationToken;
        this.f8496d = cancellationTokenSource;
        this.f8497e = callable;
        this.f = taskCompletionSource;
    }

    private final void a() {
        a6.o0 o0Var;
        for (Y1 y12 : (Collection) this.f8494b) {
            if (y12 != ((Y1) this.f8495c)) {
                y12.f8657a.i(N0.f8516G);
            }
        }
        Future future = (Future) this.f8496d;
        if (future != null) {
            future.cancel(false);
        }
        Future future2 = (Future) this.f8497e;
        if (future2 != null) {
            future2.cancel(false);
        }
        N0 n02 = (N0) this.f;
        E.e eVar = ((Z0) n02.f8521D.f8442b).f8681I;
        synchronized (eVar.f920b) {
            try {
                ((HashSet) eVar.f921c).remove(n02);
                if (((HashSet) eVar.f921c).isEmpty()) {
                    o0Var = (a6.o0) eVar.f922d;
                    eVar.f921c = new HashSet();
                } else {
                    o0Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (o0Var != null) {
            ((Z0) eVar.f923e).f8680H.a(o0Var);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.firebase.storage.h a7;
        switch (this.f8493a) {
            case 0:
                a();
                return;
            case 1:
                com.google.firebase.storage.m mVar = (com.google.firebase.storage.m) this.f8494b;
                V2.k b5 = mVar.b();
                com.google.firebase.storage.f fVar = mVar.f9931b;
                C4.b bVar = new C4.b(b5, fVar.f9900a, (Integer) this.f, (String) this.f8497e);
                ((B4.e) this.f8496d).b(bVar, true);
                boolean l8 = bVar.l();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f8495c;
                if (l8) {
                    try {
                        a7 = com.google.firebase.storage.h.a(fVar, bVar.i());
                    } catch (JSONException e7) {
                        Log.e("ListTask", "Unable to parse response body. " + bVar.f, e7);
                        taskCompletionSource.setException(com.google.firebase.storage.i.b(0, e7));
                        return;
                    }
                } else {
                    a7 = null;
                }
                if (taskCompletionSource != null) {
                    bVar.a(a7, taskCompletionSource);
                    return;
                }
                return;
            case 2:
                com.google.firebase.storage.m mVar2 = (com.google.firebase.storage.m) this.f8494b;
                C4.g gVar = new C4.g(mVar2.b(), mVar2.f9931b.f9900a, ((com.google.firebase.storage.j) this.f8496d).a());
                ((B4.e) this.f).b(gVar, true);
                boolean l9 = gVar.l();
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f8495c;
                if (l9) {
                    try {
                        this.f8497e = new A.l(gVar.i(), mVar2).c();
                    } catch (JSONException e8) {
                        Log.e("UpdateMetadataTask", "Unable to parse a valid JSON object from resulting metadata:" + gVar.f, e8);
                        taskCompletionSource2.setException(com.google.firebase.storage.i.b(0, e8));
                        return;
                    }
                }
                gVar.a((com.google.firebase.storage.j) this.f8497e, taskCompletionSource2);
                return;
            default:
                M3.d dVar = (M3.d) this.f8494b;
                CancellationToken cancellationToken = (CancellationToken) this.f8495c;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.f8496d;
                Callable callable = (Callable) this.f8497e;
                TaskCompletionSource taskCompletionSource3 = (TaskCompletionSource) this.f;
                dVar.getClass();
                try {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                        return;
                    }
                    try {
                        if (!((AtomicBoolean) dVar.f3231c).get()) {
                            C1405h c1405h = (C1405h) dVar;
                            synchronized (c1405h) {
                                c1405h.f13726i = c1405h.f13723e.zzc();
                            }
                            ((AtomicBoolean) dVar.f3231c).set(true);
                        }
                        if (cancellationToken.isCancellationRequested()) {
                            cancellationTokenSource.cancel();
                            return;
                        }
                        Object call = callable.call();
                        if (cancellationToken.isCancellationRequested()) {
                            cancellationTokenSource.cancel();
                            return;
                        } else {
                            taskCompletionSource3.setResult(call);
                            return;
                        }
                    } catch (RuntimeException e9) {
                        throw new C0470a("Internal error has occurred when executing ML Kit tasks", e9);
                    }
                } catch (Exception e10) {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                        return;
                    } else {
                        taskCompletionSource3.setException(e10);
                        return;
                    }
                }
        }
    }

    public L1(com.google.firebase.storage.m mVar, TaskCompletionSource taskCompletionSource, com.google.firebase.storage.j jVar) {
        this.f8493a = 2;
        this.f8497e = null;
        this.f8494b = mVar;
        this.f8495c = taskCompletionSource;
        this.f8496d = jVar;
        com.google.firebase.storage.f fVar = mVar.f9931b;
        U3.h hVar = fVar.f9900a;
        hVar.a();
        this.f = new B4.e(hVar.f5749a, fVar.b(), fVar.a(), fVar.f9905g);
    }

    public L1(com.google.firebase.storage.m mVar, Integer num, String str, TaskCompletionSource taskCompletionSource) {
        this.f8493a = 1;
        com.google.android.gms.common.internal.I.i(mVar);
        this.f8494b = mVar;
        this.f = num;
        this.f8497e = str;
        this.f8495c = taskCompletionSource;
        com.google.firebase.storage.f fVar = mVar.f9931b;
        U3.h hVar = fVar.f9900a;
        hVar.a();
        this.f8496d = new B4.e(hVar.f5749a, fVar.b(), fVar.a(), fVar.f);
    }

    public L1(N0 n02, Collection collection, Y1 y12, Future future, Future future2) {
        this.f8493a = 0;
        this.f = n02;
        this.f8494b = collection;
        this.f8495c = y12;
        this.f8496d = future;
        this.f8497e = future2;
    }
}
