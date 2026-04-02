package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.InterfaceC0768q;
import com.google.android.gms.internal.base.zau;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.t> extends com.google.android.gms.common.api.r {
    static final ThreadLocal zaa = new G.b(7);
    public static final /* synthetic */ int zad = 0;
    @KeepName
    private e0 resultGuardian;
    protected final HandlerC0733g zab;
    protected final WeakReference zac;
    private com.google.android.gms.common.api.u zah;
    private com.google.android.gms.common.api.t zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private InterfaceC0768q zao;
    private volatile W zap;
    private final Object zae = new Object();
    private final CountDownLatch zaf = new CountDownLatch(1);
    private final ArrayList zag = new ArrayList();
    private final AtomicReference zai = new AtomicReference();
    private boolean zaq = false;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.base.zau, com.google.android.gms.common.api.internal.g] */
    public BasePendingResult(com.google.android.gms.common.api.o oVar) {
        Looper mainLooper;
        if (oVar != null) {
            mainLooper = ((I) oVar).f9188b.getLooper();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.zab = new zau(mainLooper);
        this.zac = new WeakReference(oVar);
    }

    public static void zal(com.google.android.gms.common.api.t tVar) {
    }

    public final com.google.android.gms.common.api.t a() {
        com.google.android.gms.common.api.t tVar;
        synchronized (this.zae) {
            com.google.android.gms.common.internal.I.k("Result has already been consumed.", !this.zal);
            com.google.android.gms.common.internal.I.k("Result is not ready.", isReady());
            tVar = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        if (this.zai.getAndSet(null) == null) {
            com.google.android.gms.common.internal.I.i(tVar);
            return tVar;
        }
        throw new ClassCastException();
    }

    public final void addStatusListener(com.google.android.gms.common.api.q qVar) {
        boolean z7;
        if (qVar != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        com.google.android.gms.common.internal.I.a("Callback cannot be null.", z7);
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    qVar.a(this.zak);
                } else {
                    this.zag.add(qVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final R await() {
        com.google.android.gms.common.internal.I.h("await must not be called on the UI thread");
        com.google.android.gms.common.internal.I.k("Result has already been consumed", !this.zal);
        com.google.android.gms.common.internal.I.k("Cannot await if then() has been called.", this.zap == null);
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f);
        }
        com.google.android.gms.common.internal.I.k("Result is not ready.", isReady());
        return (R) a();
    }

    public final void b(com.google.android.gms.common.api.t tVar) {
        this.zaj = tVar;
        this.zak = tVar.getStatus();
        this.zao = null;
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            com.google.android.gms.common.api.u uVar = this.zah;
            if (uVar != null) {
                this.zab.removeMessages(2);
                this.zab.a(uVar, a());
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((com.google.android.gms.common.api.q) arrayList.get(i7)).a(this.zak);
        }
        this.zag.clear();
    }

    public void cancel() {
        synchronized (this.zae) {
            try {
                if (!this.zam && !this.zal) {
                    InterfaceC0768q interfaceC0768q = this.zao;
                    if (interfaceC0768q != null) {
                        try {
                            com.google.android.gms.common.internal.W w2 = (com.google.android.gms.common.internal.W) interfaceC0768q;
                            w2.zzD(2, w2.zza());
                        } catch (RemoteException unused) {
                        }
                    }
                    zal(this.zaj);
                    this.zam = true;
                    b(createFailedResult(Status.f9151Z));
                }
            } finally {
            }
        }
    }

    public abstract com.google.android.gms.common.api.t createFailedResult(Status status);

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult((BasePendingResult<R>) createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isCanceled() {
        boolean z7;
        synchronized (this.zae) {
            z7 = this.zam;
        }
        return z7;
    }

    public final boolean isReady() {
        if (this.zaf.getCount() == 0) {
            return true;
        }
        return false;
    }

    public final void setCancelToken(InterfaceC0768q interfaceC0768q) {
        synchronized (this.zae) {
            this.zao = interfaceC0768q;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((BasePendingResult<R>) ((com.google.android.gms.common.api.t) obj));
    }

    public final void setResultCallback(com.google.android.gms.common.api.u uVar) {
        synchronized (this.zae) {
            try {
                if (uVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z7 = true;
                com.google.android.gms.common.internal.I.k("Result has already been consumed.", !this.zal);
                if (this.zap != null) {
                    z7 = false;
                }
                com.google.android.gms.common.internal.I.k("Cannot set callbacks if then() has been called.", z7);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(uVar, a());
                } else {
                    this.zah = uVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <S extends com.google.android.gms.common.api.t> com.google.android.gms.common.api.w then(com.google.android.gms.common.api.v vVar) {
        boolean z7;
        W a7;
        com.google.android.gms.common.internal.I.k("Result has already been consumed.", !this.zal);
        synchronized (this.zae) {
            try {
                boolean z8 = false;
                if (this.zap == null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                com.google.android.gms.common.internal.I.k("Cannot call then() twice.", z7);
                if (this.zah == null) {
                    z8 = true;
                }
                com.google.android.gms.common.internal.I.k("Cannot call then() if callbacks are set.", z8);
                com.google.android.gms.common.internal.I.k("Cannot call then() if result was canceled.", !this.zam);
                this.zaq = true;
                this.zap = new W(this.zac);
                a7 = this.zap.a();
                if (isReady()) {
                    this.zab.a(this.zap, a());
                } else {
                    this.zah = this.zap;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a7;
    }

    public final void zak() {
        boolean z7 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z7 = false;
        }
        this.zaq = z7;
    }

    public final boolean zam() {
        boolean isCanceled;
        synchronized (this.zae) {
            try {
                if (((com.google.android.gms.common.api.o) this.zac.get()) != null) {
                    if (!this.zaq) {
                    }
                    isCanceled = isCanceled();
                }
                cancel();
                isCanceled = isCanceled();
            } catch (Throwable th) {
                throw th;
            }
        }
        return isCanceled;
    }

    public final void zan(X x7) {
        this.zai.set(x7);
    }

    public final void setResult(R r7) {
        synchronized (this.zae) {
            try {
                if (!this.zan && !this.zam) {
                    isReady();
                    com.google.android.gms.common.internal.I.k("Results have already been set", !isReady());
                    com.google.android.gms.common.internal.I.k("Result has already been consumed", !this.zal);
                    b(r7);
                    return;
                }
                zal(r7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.r
    @ResultIgnorabilityUnspecified
    public final R await(long j, TimeUnit timeUnit) {
        if (j > 0) {
            com.google.android.gms.common.internal.I.h("await must not be called on the UI thread when time is greater than zero.");
        }
        com.google.android.gms.common.internal.I.k("Result has already been consumed.", !this.zal);
        com.google.android.gms.common.internal.I.k("Cannot await if then() has been called.", this.zap == null);
        try {
            if (!this.zaf.await(j, timeUnit)) {
                forceFailureUnlessReady(Status.f9150Y);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f);
        }
        com.google.android.gms.common.internal.I.k("Result is not ready.", isReady());
        return (R) a();
    }

    public final void setResultCallback(com.google.android.gms.common.api.u uVar, long j, TimeUnit timeUnit) {
        synchronized (this.zae) {
            try {
                if (uVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z7 = true;
                com.google.android.gms.common.internal.I.k("Result has already been consumed.", !this.zal);
                if (this.zap != null) {
                    z7 = false;
                }
                com.google.android.gms.common.internal.I.k("Cannot set callbacks if then() has been called.", z7);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(uVar, a());
                } else {
                    this.zah = uVar;
                    HandlerC0733g handlerC0733g = this.zab;
                    handlerC0733g.sendMessageDelayed(handlerC0733g.obtainMessage(2, this), timeUnit.toMillis(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
