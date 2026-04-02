package H;

import android.graphics.Typeface;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1631a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1632b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1633c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f1634d;

    public l(m mVar, int i7, E3.b bVar) {
        this.f1634d = mVar;
        this.f1632b = i7;
        this.f1633c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U.i iVar;
        ArrayList arrayList;
        int decrementAndGet;
        switch (this.f1631a) {
            case 0:
                int i7 = this.f1632b;
                E3.b bVar = (E3.b) this.f1633c;
                m mVar = (m) this.f1634d;
                AtomicInteger atomicInteger = mVar.f1638d;
                ArrayList arrayList2 = mVar.f1636b;
                boolean isDone = mVar.isDone();
                boolean z7 = mVar.f1637c;
                if (!isDone && arrayList2 != null) {
                    boolean z8 = true;
                    try {
                        try {
                            try {
                                try {
                                    g0.c.g("Tried to set value from future which is not done", bVar.isDone());
                                    arrayList2.set(i7, i.b(bVar));
                                    decrementAndGet = atomicInteger.decrementAndGet();
                                    if (decrementAndGet < 0) {
                                        z8 = false;
                                    }
                                    g0.c.g("Less than 0 remaining futures", z8);
                                } catch (ExecutionException e7) {
                                    if (z7) {
                                        mVar.f.b(e7.getCause());
                                    }
                                    int decrementAndGet2 = atomicInteger.decrementAndGet();
                                    if (decrementAndGet2 < 0) {
                                        z8 = false;
                                    }
                                    g0.c.g("Less than 0 remaining futures", z8);
                                    if (decrementAndGet2 == 0) {
                                        ArrayList arrayList3 = mVar.f1636b;
                                        if (arrayList3 != null) {
                                            iVar = mVar.f;
                                            arrayList = new ArrayList(arrayList3);
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            } catch (CancellationException unused) {
                                if (z7) {
                                    mVar.cancel(false);
                                }
                                int decrementAndGet3 = atomicInteger.decrementAndGet();
                                if (decrementAndGet3 < 0) {
                                    z8 = false;
                                }
                                g0.c.g("Less than 0 remaining futures", z8);
                                if (decrementAndGet3 == 0) {
                                    ArrayList arrayList4 = mVar.f1636b;
                                    if (arrayList4 != null) {
                                        iVar = mVar.f;
                                        arrayList = new ArrayList(arrayList4);
                                    }
                                } else {
                                    return;
                                }
                            }
                        } catch (Error e8) {
                            mVar.f.b(e8);
                            int decrementAndGet4 = atomicInteger.decrementAndGet();
                            if (decrementAndGet4 < 0) {
                                z8 = false;
                            }
                            g0.c.g("Less than 0 remaining futures", z8);
                            if (decrementAndGet4 == 0) {
                                ArrayList arrayList5 = mVar.f1636b;
                                if (arrayList5 != null) {
                                    iVar = mVar.f;
                                    arrayList = new ArrayList(arrayList5);
                                }
                            } else {
                                return;
                            }
                        } catch (RuntimeException e9) {
                            if (z7) {
                                mVar.f.b(e9);
                            }
                            int decrementAndGet5 = atomicInteger.decrementAndGet();
                            if (decrementAndGet5 < 0) {
                                z8 = false;
                            }
                            g0.c.g("Less than 0 remaining futures", z8);
                            if (decrementAndGet5 == 0) {
                                ArrayList arrayList6 = mVar.f1636b;
                                if (arrayList6 != null) {
                                    iVar = mVar.f;
                                    arrayList = new ArrayList(arrayList6);
                                }
                            } else {
                                return;
                            }
                        }
                        if (decrementAndGet == 0) {
                            ArrayList arrayList7 = mVar.f1636b;
                            if (arrayList7 != null) {
                                iVar = mVar.f;
                                arrayList = new ArrayList(arrayList7);
                                iVar.a(arrayList);
                                return;
                            }
                            g0.c.g(null, mVar.isDone());
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        int decrementAndGet6 = atomicInteger.decrementAndGet();
                        if (decrementAndGet6 < 0) {
                            z8 = false;
                        }
                        g0.c.g("Less than 0 remaining futures", z8);
                        if (decrementAndGet6 == 0) {
                            ArrayList arrayList8 = mVar.f1636b;
                            if (arrayList8 != null) {
                                mVar.f.a(new ArrayList(arrayList8));
                            } else {
                                g0.c.g(null, mVar.isDone());
                            }
                        }
                        throw th;
                    }
                }
                g0.c.g("Future was done before all dependencies completed", z7);
                return;
            default:
                ((TextView) this.f1633c).setTypeface((Typeface) this.f1634d, this.f1632b);
                return;
        }
    }

    public l(TextView textView, Typeface typeface, int i7) {
        this.f1633c = textView;
        this.f1634d = typeface;
        this.f1632b = i7;
    }
}
